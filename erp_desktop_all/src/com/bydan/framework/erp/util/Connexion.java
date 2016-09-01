package com.bydan.framework.erp.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.bydan.framework.erp.ConstantesCommon;
import com.bydan.framework.ConstantesCommon;
import com.mysql.jdbc.Driver;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

@SuppressWarnings("unused")
public class Connexion {

	private	String driver;
	private	String schema;
	private	String user;
	private	String password;
	private	String funcionAuxiliar="";
	private String sDetalle="";
	private	ParameterDbType dbType;
	private	ConnexionType connexionType;
	private EntityManagerFactory entityManagerFactory;
	
	private java.sql.Connection connection;

	//@PersistenceContext//(type=PersistenceContextType.EXTENDED)
    EntityManager entityManager;
    
    private double dStart = 0; 
    private double dEnd = 0; 
    private double dDif = 0; 
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public Connexion() {
		 this.driver="";
		 this.schema="";
		 this.user="";
		 this.password="";
		 this.funcionAuxiliar="";
		 this.sDetalle="";
		 this.dbType=null;
		 this.connection=null;		 
	}
	
	public Connexion(String newDriver,String newSchema,String newUser,String newPassword,ParameterDbType newDbType) throws SQLException,Exception {
		try {	
			 this.driver=newDriver;
			 this.schema=newSchema;
			 this.user=newUser;
			 this.password=newPassword;
			 this.dbType=newDbType;
			 this.funcionAuxiliar="";
			 this.sDetalle="";
			 this.connection=DriverManager.getConnection(driver);			 
			 
		} catch(SQLException ex) {
			throw new SQLException();
	  	} catch(Exception ex) {
			throw new Exception();
	  	}
	}
	
	public Connexion(String newDriver,ConnexionType newConnexionType,ParameterDbType newDbType) throws SQLException,Exception {
		this(newDriver,newConnexionType,newDbType,"");
	}
	
	public Connexion(String newDriver,ConnexionType newConnexionType,ParameterDbType newDbType,String sDetalle) throws SQLException,Exception {
		 String strDriver="";
		 String strDetalleConnexion="";
		 try {	 
			 this.dbType=newDbType;
			 this.connexionType=newConnexionType;
		 
			 if(connexionType==ConnexionType.ODBC) {
				 strDriver="jdbc:odbc:";
			 }
			 
			 
			 if(!Constantes.ISUSACONNECTIONFROMDATASOURCESSERVER) {
				 
				 com.mysql.jdbc.Driver driverMysql=null;
				 org.postgresql.Driver driverPostgres=null;
				 
				 if(this.dbType.equals(ParameterDbType.MYSQL)) {
					 driverMysql= new com.mysql.jdbc.Driver();
					 DriverManager.registerDriver(driverMysql);
					 
				 } else  if(this.dbType.equals(ParameterDbType.POSTGRES)) {
					 driverPostgres= new org.postgresql.Driver();
					 DriverManager.registerDriver(driverPostgres);
				 }
				
				 this.driver= strDriver+newDriver;
				 
				 /*
				 strDetalleConnexion="DRIVER="+this.driver+",USUARIO="+Constantes.SCONNEXION_USER+",PASSWORD="+Constantes.SCONNEXION_PASSWORD;
				 
				 if(!sDetalle.equals("")) {
					 strDetalleConnexion+="-->"+sDetalle;					 
				 }
				 
				 if(Constantes.ISDEVELOPING) {
					 System.out.println(strDetalleConnexion);
				 }
				 */
				 
				 this.connection=DriverManager.getConnection(this.driver,Constantes.SCONNEXION_USER,Constantes.SCONNEXION_PASSWORD);
				 this.connection.setAutoCommit(false);
				 
			 } else {
				 //System.out.println("Si va a utilizar pool");
				 InitialContext initialContext= new InitialContext(); 
				 
				 if(initialContext!=null) {
					 //System.out.println("Si Existe contexto");
					 
					 String sPrefix="";
					 Boolean isErrorDataSourceJBoss=false;
					 Object object=new Object();
					 
					 if(Constantes.ISJBOSS) {
						 //sPrefix="java:jdbc/";
						 sPrefix="java:jboss/datasources/";
							//"SeguridadProduccionDataSourceNoTx";-->NoTX para no tener problemas con serAutoCommit
						 try {
							 object=initialContext.lookup(sPrefix+Constantes.SCONNEXIONDATASOURCE);
							 System.out.println("SE USA DATASORUCE:"+sPrefix+Constantes.SCONNEXIONDATASOURCE);
						 } catch(Exception e) {
							 isErrorDataSourceJBoss=true;
						 }
							
					 } else {
						 sPrefix="java:comp/env/jdbc/";
						 
					 }
					 
					//UTILIZAR ESTO EN VEZ DE CREAR UN NUEVO JAR POR SI SE USA TOMCAT. DEJAR Constantes.isJBoss=true PREFERENCIA
					 if(isErrorDataSourceJBoss) {
						 sPrefix="java:comp/env/jdbc/";
					 }
					 
					 object=initialContext.lookup(sPrefix+Constantes.SCONNEXIONDATASOURCE);
						
					 //System.out.println("Si Existe contexto");
					 //Object object=initialContext.lookup("java:jdbc/"+Constantes.getStrConnexionDataSource());
					 
					 //object=initialContext.lookup(sPrefix1+Constantes.getStrConnexionDataSource());
					 
					 
					 DataSource dataSource=(DataSource)object;
					 
					 if (dataSource != null) {
						 System.out.println("Si existe datasource");
						 
						 this.connection= dataSource.getConnection();
						 
						 Boolean b= this.connection.getAutoCommit();
						 //this.connection.setAutoCommit(false);	
						 
						 System.out.println("Conexion OK="+b);
							
					 } else {
						 //System.out.println("No existe datasource");
						 
						 throw new Exception("No existe un jdbc datasource en el servidor de aplicaciones");
					 }
				 } else {
					//System.out.println("No Existe contexto");
						
					throw new Exception("Contexto no inicializado"); 
				 }
			 }				 
			 
		 } catch(SQLException e) {			 
			 throw e;
			 //System.out.println(strDetalleConnexion);
			 //throw new SQLException("ERROR->"+strDetalleConnexion);
		 } catch(Exception e) {
			 throw e;
			 //System.out.println(strDetalleConnexion);
			 //throw new Exception("ERROR->"+strDetalleConnexion);
		 }
	}
	
	public String getSchema() {
		return schema;
	}
	
	public void setSchema(String newSchema) {
		this.schema = newSchema;
	}
	
	public java.sql.Connection getConnection() {
		return connection;
	}
	
	public void setConnection(java.sql.Connection newConnection) {
		this.connection = newConnection;
	}
	
	public String getDriver() {
		return driver;
	}
	
	public void setDriver(String newDriver) {
		this.driver = newDriver;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String newPassword) {
		this.password = newPassword;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String newUser) {
		this.user = newUser;
	}
	
	public ParameterDbType getDbType() {
		return dbType;
	}
	
	public void setDbType(ParameterDbType tipo) {
		this.dbType = tipo;
	}
			
	public ConnexionType getConnexionType() {
		return connexionType;
	}


	public void setConnexionType(ConnexionType connexionType) {
		this.connexionType = connexionType;
	}
	
	
	public String getFuncionAuxiliar() {
		return funcionAuxiliar;
	}

	public void setFuncionAuxiliar(String funcionAuxiliar) {
		this.funcionAuxiliar = funcionAuxiliar;
	}
	
	public String getsDetalle() {
		return sDetalle;
	}

	public void setsDetalle(String sDetalle) {
		this.sDetalle = sDetalle;
	}

	public double getdStart() {
		return dStart;
	}

	public void setdStart(double dStart) {
		this.dStart = dStart;
	}

	public double getdEnd() {
		return dEnd;
	}

	public void setdEnd(double dEnd) {
		this.dEnd = dEnd;
	}

	public double getdDif() {
		return dDif;
	}

	public void setdDif(double dDif) {
		this.dDif = dDif;
	}

	public static Connexion getNewSeguridadTestConnexion()throws SQLException,Exception {
		Connexion connexion= new Connexion();
		
		try {
			connexion= new Connexion("MySqlOdbcTest",ConnexionType.ODBC,ParameterDbType.MYSQL);
		} catch(SQLException ex) {
			throw new SQLException();
	  	} catch(Exception ex) {
			throw new Exception();
	  	}
	  	
	 	return connexion;	 	
	}
	
	
	public Connexion getNewConnexion(ConnexionType connexionType,ParameterDbType parameterDbType,EntityManagerFactory entityManagerFactory)throws Exception	{
		return getNewConnexion(connexionType,parameterDbType,entityManagerFactory,"");
	}
	
	public Connexion getNewConnexion(ConnexionType connexionType,ParameterDbType parameterDbType,EntityManagerFactory entityManagerFactory,String sDetalle)throws Exception 
	{
		Connexion connexion= new Connexion();
		
		try
		{
			this.dStart = (double)System.currentTimeMillis();
			
			connexion.dbType=parameterDbType;
			connexion.connexionType=connexionType;
			connexion.entityManagerFactory=entityManagerFactory;
			
			if(connexion.connexionType.equals(ConnexionType.JDBC32)) {
				connexion=this.getNewConnexionJdbc(connexion.connexionType,connexion.dbType,sDetalle);
			} else {
				connexion=this.getNewConnexionHibernate(connexion.entityManagerFactory);
			}
			
			connexion.dbType=parameterDbType;
			connexion.connexionType=connexionType;
			connexion.entityManagerFactory=entityManagerFactory;
			connexion.setsDetalle(sDetalle);
			connexion.setdStart(this.dStart);
			
			if(Constantes2.ISDEVELOPING_QUERY_EXPORT) {
				File dir = new  File (Constantes2.SPATH_EXPORT); 
				
			    if (!dir.exists()){ 
			    	dir.mkdir (); 
			    }			    			    
			    
				Constantes2.BufferedWriter = new BufferedWriter(new FileWriter(Constantes2.SPATH_EXPORT + Constantes2.SFILENAME_EXPORT));
				
				if(Constantes.ISDEVELOPING) {
			    	System.out.println("QUERIES EXPORTARSE A: "+Constantes2.SPATH_EXPORT + Constantes2.SFILENAME_EXPORT);
			    }
			}
		}		
		catch(Exception e) 
		{
			throw e;
	  	}
		
	 	return connexion;
	 	
	}
	
	public Connexion getNewConnexion()throws Exception 
	{
		Connexion connexion= new Connexion();
		
		try
		{
			connexion.dbType=Constantes.PARAMETERDBTYPE;
			connexion.connexionType=Constantes.CONNEXIONTYPE;
			connexion.entityManagerFactory=ConstantesCommon.JPAENTITYMANAGERFACTORY;
			
			if(connexion.connexionType.equals(ConnexionType.JDBC32)) {
				connexion=this.getNewConnexionJdbc(connexion.connexionType,connexion.dbType);
			} else {
				connexion=this.getNewConnexionHibernate(connexion.entityManagerFactory);
			}
			
			connexion.dbType=Constantes.PARAMETERDBTYPE;
			connexion.connexionType=Constantes.CONNEXIONTYPE;
			connexion.entityManagerFactory=ConstantesCommon.JPAENTITYMANAGERFACTORY;
			
			
		}		
		catch(Exception e) 
		{
			throw e;
	  	}
		
	 	return connexion;
	 	
	}
	
	public Connexion getNewConnexionJdbc(ConnexionType connexionType,ParameterDbType parameterDbType)throws SQLException,Exception {
		return this.getNewConnexionJdbc(connexionType,parameterDbType,"");
	}
	
	public Connexion getNewConnexionJdbc(ConnexionType connexionType,ParameterDbType parameterDbType,String sDetalle)throws SQLException,Exception {
		Connexion connexion= new Connexion();
		String strDriverJdbc32= this.getDriverJdbcString(parameterDbType);
		
		try {
			//connexion= new Connexion(strDriverJdbc32MySql,ConnexionType.JDBC32,ParameterDbType.MYSQL);
			connexion= new Connexion(strDriverJdbc32,connexionType,parameterDbType,sDetalle);
		} catch(SQLException e) {
			throw e;
			
	  	} catch(Exception e) {
			throw e;
	  	}
		
	 	return connexion;
	 	
	}

	public String getDriverJdbcString(ParameterDbType parameterDbType)throws SQLException,Exception	{
		
		String strDriverJdbc32MySql= "";
		
		if(parameterDbType.equals(ParameterDbType.MYSQL)) {
			strDriverJdbc32MySql="jdbc:mysql://"+Constantes.SCONNEXION.replace("////", "&");
			
		} else if(parameterDbType.equals(ParameterDbType.POSTGRES)) {
			strDriverJdbc32MySql="jdbc:postgresql://"+Constantes.SCONNEXION_POSTGRES;
		}
		
		return strDriverJdbc32MySql;
	}
	
	public  Connexion getNewConnexionHibernate(EntityManagerFactory entityManagerFactory)throws SQLException,Exception {
		Connexion connexion= new Connexion();
		//String strDriverJdbc32MySql= "jdbc:mysql://"+Constantes.SCONNEXION.replace("////", "&");
		
		try {
			//connexion= new Connexion("odbcAsamblea",ConnexionType.ODBC,ParameterDbType.MYSQL);
			connexion= new Connexion();
			
			connexion.setEntityManager(entityManagerFactory.createEntityManager());
			
			//connexion.setEntityManager(ConstantesCommon.JPAENTITYMANAGERFACTORY.createEntityManager());		
			
			/*
			if(Constantes.JPAENTITYMANAGERFACTORINHERITANCE==null) {
				connexion.setEntityManager(Constantes.JPAENTITYMANAGERFACTORY.createEntityManager());
			} else {
				connexion.setEntityManager(Constantes.JPAENTITYMANAGERFACTORINHERITANCE.createEntityManager());
			}
			*/
		} catch(Exception ex) {
			throw new Exception();
	  	}
	  	
	 	return connexion;	 	
	}
	
	public  void begin()throws Exception {
		
		try {
			if(Constantes.CONNEXIONTYPE.equals(ConnexionType.JDBC32)) {
				
			} else {
				this.entityManager.getTransaction().begin();
			}
		} catch(Exception ex) {
	  	}
	  	
	}
	
	public  void commit()throws Exception {
	
		try {
			
			if(Constantes.CONNEXIONTYPE.equals(ConnexionType.JDBC32)) {
				this.getConnection().commit(); 
										
			} else {
				this.entityManager.getTransaction().commit();
			}
		} catch(Exception ex) {
	  	}
	  	
	}
	
	
	public  void rollback()throws Exception {
		
		try {
			
			if(Constantes.CONNEXIONTYPE.equals(ConnexionType.JDBC32)) {
				this.getConnection().rollback();												
			} else {
				this.entityManager.getTransaction().rollback();
			}
		} catch(Exception ex) {
	  	}
	  	
	}
	
	public  void close()throws Exception {
		
		try {
			
			if(Constantes.CONNEXIONTYPE.equals(ConnexionType.JDBC32)) {
				this.getConnection().close();
				
				if(Constantes.ISDEVELOPING) {
					this.dEnd=(double)System.currentTimeMillis();
					
					this.dDif=this.dEnd - this.dStart;
					
					 String strDetalleConnexion="DRIVER="+this.driver+",USUARIO="+Constantes.SCONNEXION_USER+",PASSWORD="+Constantes.SCONNEXION_PASSWORD;
					 
					 if(!sDetalle.equals("")) {
						 strDetalleConnexion+="-->"+this.sDetalle+"--> Tiempo(ms):"+ this.dDif;					 
					 }
					 
					 if(Constantes.ISDEVELOPING) {
						 System.out.println(strDetalleConnexion);
					 }
				}		
				
			} else {
				this.entityManager.close();
			}
			
			if(Constantes2.ISDEVELOPING_QUERY_EXPORT) {
				Constantes2.BufferedWriter.close();
			}
		} catch(Exception ex) {
	  	}
	  	
	}

	public static Connexion getNewConnexionAuditoria()throws SQLException,Exception	{
		Connexion connexion= new Connexion();
		String strDriverJdbc32MySql= "jdbc:mysql://localhost/asambleavirtualauditoria_dbo?" +  "user=root&password=";
		
		try {
			//connexion= new Connexion("odbcAsamblea",ConnexionType.ODBC,ParameterDbType.MYSQL);
			connexion= new Connexion(strDriverJdbc32MySql,ConnexionType.JDBC32,ParameterDbType.MYSQL);
		} catch(SQLException ex) {
			throw new SQLException();
	  	} catch(Exception ex) {
			throw new Exception();
	  	}
	  	
	 	return connexion;	 	
	}
}
