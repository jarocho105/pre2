package com.bydan.framework.erp.business.dataaccess;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.DatoGeneralMaximo;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.GeneralEntityReadOnly;
import com.bydan.framework.erp.business.entity.GeneralEntitySinIdGenerated;
import com.bydan.framework.erp.business.logic.ParameterSelectionGeneral;
import com.bydan.framework.erp.business.logic.QueryWhereSelectParameters;
import com.bydan.framework.erp.util.Connexion;
import com.bydan.framework.erp.util.ConnexionType;
import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.ParameterDbType;
import com.bydan.framework.erp.util.ParameterMaintenance;
import com.bydan.framework.erp.util.ParameterType;
import com.bydan.framework.erp.util.ParametersMaintenance;
import com.bydan.framework.erp.util.ParametersType;

@SuppressWarnings("unused")
public  class DataAccessHelperBase{
	public  static String buildSqlGeneralGetEntities(QueryWhereSelectParameters queryWhereSelectParameters,String strSelectQuery) throws SQLException,Exception {
        String query="";
        
        try {
        	if(queryWhereSelectParameters.getConnexionType().equals(ConnexionType.JDBC32)) {
        		if(queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
	        		query=strSelectQuery+queryWhereSelectParameters.getFinalQuery();  			  			
				} else {
					query=strSelectQuery;
				}
							
				if(queryWhereSelectParameters.getQueryWhereSelectParameters()!="") {
	        		query+=" "+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParameters();				
				}
							
				if(!queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
					query= queryWhereSelectParameters.getInitialQuery()+query+queryWhereSelectParameters.getFinalQuery();
				}
				
        	} else if(queryWhereSelectParameters.getConnexionType().equals(ConnexionType.HIBERNATE)) {
	        	if(queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
	        		query=strSelectQuery+queryWhereSelectParameters.getFinalQuery();  			  			
				} else {
					query=strSelectQuery;
				}
							
				if(queryWhereSelectParameters.getQueryWhereSelectParameters()!="") {
	        		query+=" "+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParameters();				
				}
							
				if(!queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
					query= queryWhereSelectParameters.getInitialQuery()+query+queryWhereSelectParameters.getFinalQuery();
				}
        	}
        	
    	} catch(Exception ex) {
            throw ex;
        }
        
        return query;
    }
	
	public  static String buildSqlGeneralGetEntitiesJDBC(QueryWhereSelectParameters queryWhereSelectParameters,String strSelectQuery) throws SQLException,Exception {
        String query="";
        
        try {
        	if(queryWhereSelectParameters.getConnexionType().equals(ConnexionType.JDBC32)) {
        		if(queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
	        		query=strSelectQuery+queryWhereSelectParameters.getFinalQuery();  			  			
				} else {
					query=strSelectQuery;
				}
							
				if(queryWhereSelectParameters.getQueryWhereSelectParametersJDBC()!="") {
	        		query+=" "+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParametersJDBC();				
				}
							
				if(!queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
					query= queryWhereSelectParameters.getInitialQuery()+query+queryWhereSelectParameters.getFinalQuery();
				}
				
        	} else if(queryWhereSelectParameters.getConnexionType().equals(ConnexionType.HIBERNATE)) {
	        	if(queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
	        		query=strSelectQuery+queryWhereSelectParameters.getFinalQuery();  			  			
				} else {
					query=strSelectQuery;
				}
							
				if(queryWhereSelectParameters.getQueryWhereSelectParametersJDBC()!="") {
	        		query+=" "+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParametersJDBC();				
				}
							
				if(!queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
					query= queryWhereSelectParameters.getInitialQuery()+query+queryWhereSelectParameters.getFinalQuery();
				}
        	}
        	
    	} catch(Exception ex) {
            throw ex;
        }
        
        return query;
    }
	
	public  static String buildSqlGeneralGetEntities(GeneralEntityReadOnly entity,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {
        String query="";
        
        try {
        	
        	if(queryWhereSelectParameters.getConnexionType().equals(ConnexionType.JDBC32)) {
        		if(queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
	        		query=entity.getQuerySelect()+queryWhereSelectParameters.getFinalQuery();  			
				} else {
					query=entity.getQuerySelect();
				}
							
				if(queryWhereSelectParameters.getQueryWhereSelectParameters()!="") {
	        		query+=" "+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParameters();
	        	}
				
				if(!queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
					query= queryWhereSelectParameters.getInitialQuery()+query+queryWhereSelectParameters.getFinalQuery();
				}
        	} else if(queryWhereSelectParameters.getConnexionType().equals(ConnexionType.HIBERNATE)) {
	        	if(queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
	        		query=entity.getQuerySelect()+queryWhereSelectParameters.getFinalQuery();  			
				} else {
					query=entity.getQuerySelect();
				}
							
				if(queryWhereSelectParameters.getQueryWhereSelectParameters()!="") {
	        		query+=" "+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParameters();
	        	}
				
				if(!queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
					query= queryWhereSelectParameters.getInitialQuery()+query+queryWhereSelectParameters.getFinalQuery();
				}
        	}
    	} catch(Exception ex) {
          throw ex;
        }
        
        return query;
    }
	
	public  static String buildSqlGeneralGetEntitiesCompuesto(QueryWhereSelectParameters queryWhereSelectParameters)throws SQLException,Exception {
        String query="";
        
        try  {
        	
        	if(queryWhereSelectParameters.getQueryWhereSelectParameters()!="") {
        		query+=" "+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParameters();								
        	} else {
				if(queryWhereSelectParameters.getFinalQuery().contains(""+ConstantesSql.ID+"<")|| queryWhereSelectParameters.getFinalQuery().contains(""+ConstantesSql.ID+">")) {
					query+=" "+ConstantesSql.WHERE+" ";
				}
			}  	
    	}catch(Exception ex) {
            throw ex;
        }
        
        return query;
    }
	
	public  static String buildSqlGeneralGetEntities(String strTableName,QueryWhereSelectParameters queryWhereSelectParameters,String sQuerySelect)throws Exception {
        String query="";
        
        try {
        	
        	if(queryWhereSelectParameters.getConnexionType().equals(ConnexionType.JDBC32)) {
        		if(queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
	        		query=sQuerySelect+queryWhereSelectParameters.getFinalQuery();  			
				} else {
					query=sQuerySelect;
				}
							
				if(queryWhereSelectParameters.getQueryWhereSelectParameters()!="") {
	        		query+=" "+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParameters();
	        	}
				
				if(!queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
					query= queryWhereSelectParameters.getInitialQuery()+query+queryWhereSelectParameters.getFinalQuery();
				}
        	} else if(queryWhereSelectParameters.getConnexionType().equals(ConnexionType.HIBERNATE)) {
        		if(queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
	        		query=sQuerySelect+queryWhereSelectParameters.getFinalQuery();  			
				} else {
					query=sQuerySelect;
				}
							
				if(queryWhereSelectParameters.getQueryWhereSelectParameters()!="") {
	        		query+=" "+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParameters();
	        	}
				
				if(!queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
					query= queryWhereSelectParameters.getInitialQuery()+query+queryWhereSelectParameters.getFinalQuery();
				}
        	}
        	
    	} catch(Exception ex) {
          throw new Exception();
        }
    	
        return query;
    }
	
	public  static String buildSqlGeneralGetEntities(QueryWhereSelectParameters queryWhereSelectParameters,String querySelect,String query)throws Exception {
        
        try {
        	
        	if(queryWhereSelectParameters.getConnexionType().equals(ConnexionType.JDBC32)) {
        		query=querySelect;
	        	
	        	if(queryWhereSelectParameters.getQueryWhereSelectParameters()!="") {
	        		query+=" "+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParameters();
	        	}
				
				if(!queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
					query= queryWhereSelectParameters.getInitialQuery()+query+queryWhereSelectParameters.getFinalQuery();
				}
        	} else if(queryWhereSelectParameters.getConnexionType().equals(ConnexionType.HIBERNATE)) {
        		query=querySelect;
	        	
	        	if(queryWhereSelectParameters.getQueryWhereSelectParameters()!="") {
	        		query+=" "+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParameters();
	        	}
				
				if(!queryWhereSelectParameters.getFinalQuery().contains(ConstantesSql.INNERJOIN)) {
					query= queryWhereSelectParameters.getInitialQuery()+query+queryWhereSelectParameters.getFinalQuery();
				}
        	}
    	}  catch(Exception ex) {
          throw new Exception();
    	}
    	
        return query;
    }
	
	public  static String buildSqlGeneralGetEntitiesSimpleQueryBuild(QueryWhereSelectParameters queryWhereSelectParameters,String strSelectQuery)throws SQLException,Exception {
        String query="";
        
        try  {
        	
        	query=strSelectQuery+queryWhereSelectParameters.getFinalQuery();  			
								
			if(queryWhereSelectParameters.getQueryWhereSelectParameters()!="") {
        		query+=" "+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParameters();
				
				if(queryWhereSelectParameters.getFinalQuery().contains(""+ConstantesSql.ID+"<")|| queryWhereSelectParameters.getFinalQuery().contains(""+ConstantesSql.ID+">")) {
					query+=queryWhereSelectParameters.getFinalQuery();
				}
        	}
						
			if(queryWhereSelectParameters.getFinalQuery().contains(""+ConstantesSql.ID+"<")) {
				queryWhereSelectParameters.setInitialQuery(" "+ConstantesSql.SELECT+" * "+ConstantesSql.FROM+" ( ");
				queryWhereSelectParameters.setFinalQuery(queryWhereSelectParameters.getFinalQuery()+" ) T "+ConstantesSql.ORDER+" "+ConstantesSql.BY+" "+ConstantesSql.ID+" "+ConstantesSql.ASC+"");
				query= queryWhereSelectParameters.getInitialQuery()+query+queryWhereSelectParameters.getFinalQuery();
			}
    	} catch(Exception ex) {
            throw new Exception();
        }
        
        return query;
    }
	
	public  static String buildSqlGeneralGetEntitiesSimpleQueryBuildJDBC(QueryWhereSelectParameters queryWhereSelectParameters,String strSelectQuery)throws SQLException,Exception {
        String query="";
        
        try  {
        	
        	query=strSelectQuery+queryWhereSelectParameters.getFinalQuery();  			
								
			if(queryWhereSelectParameters.getQueryWhereSelectParametersJDBC()!="") {
        		query+=" "+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParametersJDBC();
				
				if(queryWhereSelectParameters.getFinalQuery().contains(""+ConstantesSql.ID+"<")|| queryWhereSelectParameters.getFinalQuery().contains(""+ConstantesSql.ID+">")) {
					query+=queryWhereSelectParameters.getFinalQuery();
				}
        	}
						
			if(queryWhereSelectParameters.getFinalQuery().contains(""+ConstantesSql.ID+"<")) {
				queryWhereSelectParameters.setInitialQuery(" "+ConstantesSql.SELECT+" * "+ConstantesSql.FROM+" ( ");
				queryWhereSelectParameters.setFinalQuery(queryWhereSelectParameters.getFinalQuery()+" ) T "+ConstantesSql.ORDER+" "+ConstantesSql.BY+" "+ConstantesSql.ID+" "+ConstantesSql.ASC+"");
				query= queryWhereSelectParameters.getInitialQuery()+query+queryWhereSelectParameters.getFinalQuery();
			}
    	} catch(Exception ex) {
            throw new Exception();
        }
        
        return query;
    }
	
	public  static void buildSqlGeneralSetQueryPagination(Query query,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {
        try {
        	if(queryWhereSelectParameters.getPagination().getiFirstResult()>-1&&
				queryWhereSelectParameters.getPagination().getiMaxResults()>-1) {
					   
				query.setFirstResult(queryWhereSelectParameters.getPagination().getiFirstResult());
				query.setMaxResults(queryWhereSelectParameters.getPagination().getiMaxResults());
			}
        	
    	} catch(Exception ex) {
          throw new Exception();
        }   	
    }
	
	public  static Boolean ejecutarSql(String sql,Connexion con)throws SQLException,Exception {
        Boolean  ejecutado= true;
        
        try {
    	    Statement stmt = con.getConnection().createStatement();
    	    ejecutado= stmt.execute(sql);
    	       
    	    stmt.close();
    	} catch(SQLException ex) {
    	    throw new SQLException();
    	} catch(Exception ex) {
          throw new Exception();
    	}
    	
        return !ejecutado;
    }
	
	public  static Boolean ejecutarStoreProcedure(String sql,Connexion con)throws SQLException,Exception {
        Boolean  ejecutado= false;
        
        try {
    	    CallableStatement cs = con.getConnection().prepareCall(sql);
    	    
    	    cs.execute();   	     	        	    
    	    ejecutado= true;
    	} catch(SQLException ex) {
    	    throw new SQLException();
    	} catch(Exception ex) {
            throw new Exception();
        }
        
        return !ejecutado;
    }
	
	public  static Integer ejecutarStoreProcedureConOupPutResultado(String sql,Connexion con)throws SQLException,Exception {
        Integer  intResultado= -1;
        
        try {
    	    CallableStatement cs = con.getConnection().prepareCall(sql);
    	    cs.registerOutParameter(1, Types.INTEGER);
    	    cs.execute();   	     	    
    	    
    	    intResultado=cs.getInt(1);
    	}  catch(SQLException ex) {
        	//String strMensaje=ex.getMessage(); 
    	    throw new SQLException();
    	} catch(Exception ex) {
            throw new Exception();
        }
        
        return intResultado;
    }
	
	public static void addMYSQLParameter(Connexion con,PreparedStatement pstmt,ParameterMaintenance parameterMaintenance)throws SQLException {	
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.BOOLEAN)){			
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
			pstmt.setBoolean(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueBoolean());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}		
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.BYTE)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setByte(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueByte());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.BYTES)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setBytes(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValuebytes());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.DOUBLE)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setDouble(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueDouble());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
			
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.FLOAT)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setFloat(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueFloat());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.SHORT)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setShort(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueShort());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.INT)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setInt(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueInteger());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.LONG)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setLong(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueLong());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.STRING)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setString(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueString());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.OBJECT)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setObject(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueObject());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.DATE)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				java.sql.Date dSqlDate=null;			
				
				try {
					dSqlDate=new java.sql.Date(parameterMaintenance.getParameterMaintenanceValue().getValueDate().getTime());
				} catch(Exception e) {
					dSqlDate=new java.sql.Date((new Date()).getTime());
				}
				
				pstmt.setDate(parameterMaintenance.getOrder(),  dSqlDate);
			} else {
					pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.TIME)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setTime(parameterMaintenance.getOrder(),  parameterMaintenance.getParameterMaintenanceValue().getValueTime());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.TIMESTAMP)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setTimestamp(parameterMaintenance.getOrder(),  parameterMaintenance.getParameterMaintenanceValue().getValueTimestamp());
			}  else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
    }
	
	public static void addPOSTGRESParameter(Connexion con,PreparedStatement pstmt,ParameterMaintenance parameterMaintenance)throws Exception {	
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.BOOLEAN)){			
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setBoolean(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueBoolean());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}		
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.BYTE)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setByte(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueByte());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}		
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.BYTES)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				//pstmt.setBytes(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValuebytes());
				InputStream inputStream = new ByteArrayInputStream(parameterMaintenance.getParameterMaintenanceValue().getValuebytes());								
				pstmt.setBinaryStream(parameterMaintenance.getOrder(), inputStream,inputStream.available());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.BINARYSTREAM)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				FileInputStream fileInputStream = new FileInputStream(parameterMaintenance.getParameterMaintenanceValue().getValueFile());
				
				pstmt.setBinaryStream(parameterMaintenance.getOrder(), fileInputStream,parameterMaintenance.getParameterMaintenanceValue().getValueFile().length());
				
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.DOUBLE)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setDouble(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueDouble());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
			
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.FLOAT)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setFloat(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueFloat());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.SHORT)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setShort(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueShort());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.INT)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setInt(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueInteger());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.LONG)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setLong(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueLong());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.STRING)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setString(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueString());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.OBJECT)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setObject(parameterMaintenance.getOrder(), parameterMaintenance.getParameterMaintenanceValue().getValueObject());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.DATE)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				java.sql.Date dSqlDate=null;			
				
				try {
					dSqlDate=new java.sql.Date(parameterMaintenance.getParameterMaintenanceValue().getValueDate().getTime());
				} catch(Exception e) {
					dSqlDate=new java.sql.Date((new Date()).getTime());
				}
				
				pstmt.setDate(parameterMaintenance.getOrder(),  dSqlDate);
			} else {
					pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.TIME)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setTime(parameterMaintenance.getOrder(),  parameterMaintenance.getParameterMaintenanceValue().getValueTime());
			} else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
		
		if(parameterMaintenance.getParameterMaintenanceType().equals(ParameterType.TIMESTAMP)) {
			if(parameterMaintenance.getParameterMaintenanceValue().getValueObject()!=null) {
				pstmt.setTimestamp(parameterMaintenance.getOrder(),  parameterMaintenance.getParameterMaintenanceValue().getValueTimestamp());
			}  else {
				pstmt.setNull(parameterMaintenance.getOrder(), 0);
			}
			return;
		}
    }
	
	public  static String buildSqlGeneralGetEntitiesJDBC(String strTableName,QueryWhereSelectParameters queryWhereSelectParameters,String sQuerySelect)throws Exception {
        String query="";
        
        try {
        	
        	if(queryWhereSelectParameters.getFinalQuery().contains("INNER JOIN")) {
        		query=sQuerySelect+queryWhereSelectParameters.getFinalQueryJDBC();//+ " AND "+strTableName+"isActive=1";  			
			} else {
				query=sQuerySelect;//+" WHERE "+strTableName+"isActive=1";
			}
						
			if(queryWhereSelectParameters.getQueryWhereSelectParameters()!="") {
        		query+=" WHERE "+queryWhereSelectParameters.getQueryWhereSelectParametersJDBC();
        	}
			
			if(!queryWhereSelectParameters.getFinalQuery().contains("INNER JOIN")) {
				query= queryWhereSelectParameters.getInitialQuery()+query+queryWhereSelectParameters.getFinalQueryJDBC();
			}
    	} catch(Exception ex) {
          throw new Exception();
        }
    	
        return query;
    }
	
	public static Object getObjetctValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		Object lValue=0L;	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getObject(sAlias);
      	statement.close(); 	return lValue;	
    }
	
	public static Integer getIntegerValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		Integer lValue=0;	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getInt(sAlias);
      	statement.close(); 	return lValue;	
    }
	
	public static Double getDoubleValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		Double lValue=0.0;	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getDouble(sAlias);
      	statement.close(); 	return lValue;	
    }
	
	public static String getStringValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		String lValue="";	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getString(sAlias);
      	statement.close(); 	return lValue;	
    }
	
	public static Date getDateValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		Date lValue=new Date();	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getDate(sAlias);
      	statement.close(); 	return lValue;	
    }
	
	public static Timestamp getTimestampValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		Timestamp lValue=new Timestamp((new Date()).getTime());	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getTimestamp(sAlias);
      	statement.close(); 	return lValue;	
    }
	
	public static Time getTimeValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		Time lValue=new Time((new Date()).getTime());	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getTime(sAlias);
      	statement.close(); 	return lValue;	
    }
	
	public static Byte getByteValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		Byte lValue=null;/*new Byte();*/	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getByte(sAlias);
      	statement.close(); 	return lValue;	
    }
	
	public static byte[] getBytesValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		byte[] lValue=null;/*new Byte();*/	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getBytes(sAlias);
      	statement.close(); 	return lValue;	
    }
	
	public static Float getFloatValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		Float lValue=(float) 0.0;/*new Byte();*/	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getFloat(sAlias);
      	statement.close(); 	return lValue;	
    }
	
	public static Short getShortValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		Short lValue=0;/*new Byte();*/	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getShort(sAlias);
      	statement.close(); 	return lValue;	
    }
	
	public static Long getLongValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		Long lValue=0L;/*new Byte();*/	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getLong(sAlias);
      	statement.close(); 	return lValue;	
    }
	
	public static Boolean getBooleanValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		Boolean lValue=true;/*new Byte();*/	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getBoolean(sAlias);
      	statement.close(); 	return lValue;	
    }
	
	public static Reader getCharacterValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		Reader lValue=null;/*new Byte();*/	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getCharacterStream(sAlias);
      	statement.close(); 	return lValue;	
    }	
	
	public static BigDecimal getBidDecimalValue(Connexion connexion,String sQuery,String sAlias) throws Exception {
		BigDecimal lValue=null;/*new Byte();*/	Statement statement = connexion.getConnection().createStatement();	ResultSet resultSet= statement.executeQuery(sQuery);			        	 
      	while (resultSet.next()) lValue=resultSet.getBigDecimal(sAlias);
      	statement.close(); 	return lValue;	
    }	
	
	public static void setFieldDynamic(GeneralEntity entity,String sCampo,Field field,ResultSet resultSet) throws IllegalArgumentException, IllegalAccessException, SQLException {
		if(field.getType().equals(Integer.class)) {
			field.set(entity,resultSet.getInt(sCampo));
			
		} else if(field.getType().equals(Double.class)) {
			field.set(entity,resultSet.getDouble(sCampo));
			
		} else if(field.getType().equals(String.class)) {
			field.set(entity,resultSet.getString(sCampo));
			
		} else if(field.getType().equals(Date.class)) {
			field.set(entity,resultSet.getDate(sCampo));
			
		} else if(field.getType().equals(Timestamp.class)) {
			field.set(entity,resultSet.getTimestamp(sCampo));
			
		} else if(field.getType().equals(Time.class)) {
			field.set(entity,resultSet.getTime(sCampo));
			
		} else if(field.getType().equals(Byte.class)) {
			field.set(entity,resultSet.getByte(sCampo));
			
		} else if(field.getType().equals(Float.class)) {
			field.set(entity,resultSet.getFloat(sCampo));
			
		} else if(field.getType().equals(Short.class)) {
			field.set(entity,resultSet.getShort(sCampo));
			
		} else if(field.getType().equals(Long.class)) {
			field.set(entity,resultSet.getLong(sCampo));
			
		} else if(field.getType().equals(Boolean.class)) {
			field.set(entity,resultSet.getBoolean(sCampo));
			
		} else if(field.getType().equals(BigDecimal.class)) {
			field.set(entity,resultSet.getBigDecimal(sCampo));
			
		} else if(field.getType().equals(Reader.class)) {
			field.set(entity,resultSet.getCharacterStream(sCampo));
			
		} else {
			field.set(entity,resultSet.getObject(sCampo));
		}
	}
	
	public static void setFieldDynamic(GeneralEntitySinIdGenerated entity,String sCampo,Field field,ResultSet resultSet) throws IllegalArgumentException, IllegalAccessException, SQLException {
		if(field.getType().equals(Integer.class)) {
			field.set(entity,resultSet.getInt(sCampo));
			
		} else if(field.getType().equals(Double.class)) {
			field.set(entity,resultSet.getDouble(sCampo));
			
		} else if(field.getType().equals(String.class)) {
			field.set(entity,resultSet.getString(sCampo));
			
		} else if(field.getType().equals(Date.class)) {
			field.set(entity,resultSet.getDate(sCampo));
			
		} else if(field.getType().equals(Timestamp.class)) {
			field.set(entity,resultSet.getTimestamp(sCampo));
			
		} else if(field.getType().equals(Time.class)) {
			field.set(entity,resultSet.getTime(sCampo));
			
		} else if(field.getType().equals(Byte.class)) {
			field.set(entity,resultSet.getByte(sCampo));
			
		} else if(field.getType().equals(Float.class)) {
			field.set(entity,resultSet.getFloat(sCampo));
			
		} else if(field.getType().equals(Short.class)) {
			field.set(entity,resultSet.getShort(sCampo));
			
		} else if(field.getType().equals(Long.class)) {
			field.set(entity,resultSet.getLong(sCampo));
			
		} else if(field.getType().equals(Boolean.class)) {
			field.set(entity,resultSet.getBoolean(sCampo));
			
		} else if(field.getType().equals(BigDecimal.class)) {
			field.set(entity,resultSet.getBigDecimal(sCampo));
			
		} else if(field.getType().equals(Reader.class)) {
			field.set(entity,resultSet.getCharacterStream(sCampo));
			
		} else {
			field.set(entity,resultSet.getObject(sCampo));
		}
	}
	
	public static void setFieldDynamic(DatoGeneralMinimo datoGeneralMinimo,Classe classe,ResultSet resultSet) throws IllegalArgumentException, IllegalAccessException, SQLException {
		String sCampo=classe.getColumna();
		
		if(classe.clas.equals(Integer.class)) {
			datoGeneralMinimo.setiValorInteger(resultSet.getInt(sCampo));
			datoGeneralMinimo.NOMBRE_INTEGER=classe.getColumna();
			
		} else if(classe.clas.equals(Double.class)) {
			datoGeneralMinimo.setdValorDouble(resultSet.getDouble(sCampo));
			datoGeneralMinimo.NOMBRE_DOUBLE=classe.getColumna();
			
		} else if(classe.clas.equals(String.class)) {
			datoGeneralMinimo.setsValorString(resultSet.getString(sCampo));
			datoGeneralMinimo.NOMBRE_STRING=classe.getColumna();
			
		} else if(classe.clas.equals(Date.class)) {
			datoGeneralMinimo.setDtValorDate(resultSet.getDate(sCampo));
			datoGeneralMinimo.NOMBRE_DATE=classe.getColumna();
			
		} else if(classe.clas.equals(Long.class)) {
			datoGeneralMinimo.setlValorLong(resultSet.getLong(sCampo));
			datoGeneralMinimo.NOMBRE_LONG=classe.getColumna();
			
		} else if(classe.clas.equals(Boolean.class)) {
			datoGeneralMinimo.setIsValorBoolean(resultSet.getBoolean(sCampo));
			datoGeneralMinimo.NOMBRE_BOOLEAN=classe.getColumna();
			
		} else if(classe.clas.equals(Float.class)) {
			datoGeneralMinimo.setfValorFloat(resultSet.getFloat(sCampo));
			datoGeneralMinimo.NOMBRE_FLOAT=classe.getColumna();
			
		} else if(classe.clas.equals(Short.class)) {
			datoGeneralMinimo.setShValorShort(resultSet.getShort(sCampo));
			datoGeneralMinimo.NOMBRE_SHORT=classe.getColumna();
			
		} else if(classe.clas.equals(BigDecimal.class)) {
			datoGeneralMinimo.setDbValorBigDecimal(resultSet.getBigDecimal(sCampo));
			datoGeneralMinimo.NOMBRE_BIGDECIMAL=classe.getColumna();
			
		} else if(classe.clas.equals(Timestamp.class)) {
			datoGeneralMinimo.setTsValorTimestamp(resultSet.getTimestamp(sCampo));
			datoGeneralMinimo.NOMBRE_TIMESTAMP=classe.getColumna();
			
		} else if(classe.clas.equals(Time.class)) {
			datoGeneralMinimo.settValorTime(resultSet.getTime(sCampo));
			datoGeneralMinimo.NOMBRE_TIME=classe.getColumna();
			
		} else if(classe.clas.equals(Byte.class)) {
			datoGeneralMinimo.setbValorByte(resultSet.getByte(sCampo));
			datoGeneralMinimo.NOMBRE_BYTE=classe.getColumna();
			
		} else if(classe.clas.equals(Reader.class)) {
			//datoGeneralMinimo.setrValorReader(resultSet.getCharacterStream(sCampo));
			//datoGeneralMinimo.NOMBRE_READER=classe.getColumna();
			
		} else {
			//datoGeneralMinimo.setoValorObject(resultSet.getObject(sCampo));
		}
	}
	
	public static void setFieldDynamic(DatoGeneral datoGeneral,Classe classe,ResultSet resultSet) throws IllegalArgumentException, IllegalAccessException, SQLException {
		String sCampo=classe.getColumna();
		
		if(classe.clas.equals(Integer.class)) {
			if(classe.getIndice().equals(0)) {datoGeneral.setiValorInteger(resultSet.getInt(sCampo));datoGeneral.NOMBRE_INTEGER=classe.getColumna();}
			else if(classe.getIndice().equals(1)) {datoGeneral.setiValorInteger1(resultSet.getInt(sCampo));datoGeneral.NOMBRE_INTEGER1=classe.getColumna();}
			else if(classe.getIndice().equals(2)) {datoGeneral.setiValorInteger2(resultSet.getInt(sCampo));datoGeneral.NOMBRE_INTEGER2=classe.getColumna();}
			else if(classe.getIndice().equals(3)) {datoGeneral.setiValorInteger3(resultSet.getInt(sCampo));datoGeneral.NOMBRE_INTEGER3=classe.getColumna();}
			else if(classe.getIndice().equals(4)) {datoGeneral.setiValorInteger4(resultSet.getInt(sCampo));datoGeneral.NOMBRE_INTEGER4=classe.getColumna();}
			else if(classe.getIndice().equals(5)) {datoGeneral.setiValorInteger5(resultSet.getInt(sCampo));datoGeneral.NOMBRE_INTEGER5=classe.getColumna();}
						
		} else if(classe.clas.equals(Double.class)) {
			if(classe.getIndice().equals(0)) {datoGeneral.setdValorDouble(resultSet.getDouble(sCampo));datoGeneral.NOMBRE_DOUBLE=classe.getColumna();}
			else if(classe.getIndice().equals(1)) {datoGeneral.setdValorDouble1(resultSet.getDouble(sCampo));datoGeneral.NOMBRE_DOUBLE1=classe.getColumna();}
			else if(classe.getIndice().equals(2)) {datoGeneral.setdValorDouble2(resultSet.getDouble(sCampo));datoGeneral.NOMBRE_DOUBLE2=classe.getColumna();}
			else if(classe.getIndice().equals(3)) {datoGeneral.setdValorDouble3(resultSet.getDouble(sCampo));datoGeneral.NOMBRE_DOUBLE3=classe.getColumna();}
			else if(classe.getIndice().equals(4)) {datoGeneral.setdValorDouble4(resultSet.getDouble(sCampo));datoGeneral.NOMBRE_DOUBLE4=classe.getColumna();}
			else if(classe.getIndice().equals(5)) {datoGeneral.setdValorDouble5(resultSet.getDouble(sCampo));datoGeneral.NOMBRE_DOUBLE5=classe.getColumna();}
					
		} else if(classe.clas.equals(String.class)) {
			if(classe.getIndice().equals(0)) {datoGeneral.setsValorString(resultSet.getString(sCampo));datoGeneral.NOMBRE_STRING=classe.getColumna();}
			else if(classe.getIndice().equals(1)) {datoGeneral.setsValorString1(resultSet.getString(sCampo));datoGeneral.NOMBRE_STRING1=classe.getColumna();}
			else if(classe.getIndice().equals(2)) {datoGeneral.setsValorString2(resultSet.getString(sCampo));datoGeneral.NOMBRE_STRING2=classe.getColumna();}
			else if(classe.getIndice().equals(3)) {datoGeneral.setsValorString3(resultSet.getString(sCampo));datoGeneral.NOMBRE_STRING3=classe.getColumna();}
			else if(classe.getIndice().equals(4)) {datoGeneral.setsValorString4(resultSet.getString(sCampo));datoGeneral.NOMBRE_STRING4=classe.getColumna();}
			else if(classe.getIndice().equals(5)) {datoGeneral.setsValorString5(resultSet.getString(sCampo));datoGeneral.NOMBRE_STRING5=classe.getColumna();}
					
		} else if(classe.clas.equals(Date.class)) {
			if(classe.getIndice().equals(0)) {datoGeneral.setDtValorDate(resultSet.getDate(sCampo));datoGeneral.NOMBRE_DATE=classe.getColumna();}
			else if(classe.getIndice().equals(1)) {datoGeneral.setDtValorDate1(resultSet.getDate(sCampo));datoGeneral.NOMBRE_DATE1=classe.getColumna();}
			else if(classe.getIndice().equals(2)) {datoGeneral.setDtValorDate2(resultSet.getDate(sCampo));datoGeneral.NOMBRE_DATE2=classe.getColumna();}
			else if(classe.getIndice().equals(3)) {datoGeneral.setDtValorDate3(resultSet.getDate(sCampo));datoGeneral.NOMBRE_DATE3=classe.getColumna();}
			else if(classe.getIndice().equals(4)) {datoGeneral.setDtValorDate4(resultSet.getDate(sCampo));datoGeneral.NOMBRE_DATE4=classe.getColumna();}
			else if(classe.getIndice().equals(5)) {datoGeneral.setDtValorDate5(resultSet.getDate(sCampo));datoGeneral.NOMBRE_DATE5=classe.getColumna();}
						
		} else if(classe.clas.equals(Long.class)) {
			if(classe.getIndice().equals(0)) {datoGeneral.setlValorLong(resultSet.getLong(sCampo));datoGeneral.NOMBRE_LONG=classe.getColumna();}
			else if(classe.getIndice().equals(1)) {datoGeneral.setlValorLong1(resultSet.getLong(sCampo));datoGeneral.NOMBRE_LONG1=classe.getColumna();}
			else if(classe.getIndice().equals(2)) {datoGeneral.setlValorLong2(resultSet.getLong(sCampo));datoGeneral.NOMBRE_LONG2=classe.getColumna();}
			else if(classe.getIndice().equals(3)) {datoGeneral.setlValorLong3(resultSet.getLong(sCampo));datoGeneral.NOMBRE_LONG3=classe.getColumna();}
			else if(classe.getIndice().equals(4)) {datoGeneral.setlValorLong4(resultSet.getLong(sCampo));datoGeneral.NOMBRE_LONG4=classe.getColumna();}
			else if(classe.getIndice().equals(5)) {datoGeneral.setlValorLong5(resultSet.getLong(sCampo));datoGeneral.NOMBRE_LONG5=classe.getColumna();}
						
		} else if(classe.clas.equals(Boolean.class)) {
			if(classe.getIndice().equals(0)) {datoGeneral.setIsValorBoolean(resultSet.getBoolean(sCampo));datoGeneral.NOMBRE_BOOLEAN=classe.getColumna();}
			else if(classe.getIndice().equals(1)) {datoGeneral.setIsValorBoolean1(resultSet.getBoolean(sCampo));datoGeneral.NOMBRE_BOOLEAN1=classe.getColumna();}
			else if(classe.getIndice().equals(2)) {datoGeneral.setIsValorBoolean2(resultSet.getBoolean(sCampo));datoGeneral.NOMBRE_BOOLEAN2=classe.getColumna();}
			else if(classe.getIndice().equals(3)) {datoGeneral.setIsValorBoolean3(resultSet.getBoolean(sCampo));datoGeneral.NOMBRE_BOOLEAN3=classe.getColumna();}
			else if(classe.getIndice().equals(4)) {datoGeneral.setIsValorBoolean4(resultSet.getBoolean(sCampo));datoGeneral.NOMBRE_BOOLEAN4=classe.getColumna();}
			else if(classe.getIndice().equals(5)) {datoGeneral.setIsValorBoolean5(resultSet.getBoolean(sCampo));datoGeneral.NOMBRE_BOOLEAN5=classe.getColumna();}
						
		} else if(classe.clas.equals(Short.class)) {
			//datoGeneralMaximo.setShValorShort(resultSet.getShort(sCampo));
			
		} else if(classe.clas.equals(Float.class)) {
			//datoGeneralMaximo.setfValorFloat(resultSet.getFloat(sCampo));
			
		} else if(classe.clas.equals(BigDecimal.class)) {
			//datoGeneralMaximo.setDbValorBigDecimal(resultSet.getBigDecimal(sCampo));
			
		} else if(classe.clas.equals(Timestamp.class)) {
			//datoGeneralMaximo.setTsValorTimestamp(resultSet.getTimestamp(sCampo));
			
		} else if(classe.clas.equals(Time.class)) {
			//datoGeneralMaximo.settValorTime(resultSet.getTime(sCampo));
			
		} else if(classe.clas.equals(Byte.class)) {
			//datoGeneralMaximo.setbValorByte(resultSet.getByte(sCampo));
			
		} else if(classe.clas.equals(Reader.class)) {
			//datoGeneralMaximo.setrValorReader(resultSet.getCharacterStream(sCampo));
			
		} else {
			//datoGeneralMaximo.setoValorObject(resultSet.getObject(sCampo));
		}
	}
	
	public static void setFieldDynamic(DatoGeneralMaximo datoGeneralMaximo,Classe classe,ResultSet resultSet) throws IllegalArgumentException, IllegalAccessException, SQLException {
		String sCampo=classe.getColumna();
		
		if(classe.clas.equals(Integer.class)) {
			if(classe.getIndice().equals(0)) {datoGeneralMaximo.setiValorInteger(resultSet.getInt(sCampo));datoGeneralMaximo.NOMBRE_INTEGER=classe.getColumna();}
			else if(classe.getIndice().equals(1)) {datoGeneralMaximo.setiValorInteger1(resultSet.getInt(sCampo));datoGeneralMaximo.NOMBRE_INTEGER1=classe.getColumna();}
			else if(classe.getIndice().equals(2)) {datoGeneralMaximo.setiValorInteger2(resultSet.getInt(sCampo));datoGeneralMaximo.NOMBRE_INTEGER2=classe.getColumna();}
			else if(classe.getIndice().equals(3)) {datoGeneralMaximo.setiValorInteger3(resultSet.getInt(sCampo));datoGeneralMaximo.NOMBRE_INTEGER3=classe.getColumna();}
			else if(classe.getIndice().equals(4)) {datoGeneralMaximo.setiValorInteger4(resultSet.getInt(sCampo));datoGeneralMaximo.NOMBRE_INTEGER4=classe.getColumna();}
			else if(classe.getIndice().equals(5)) {datoGeneralMaximo.setiValorInteger5(resultSet.getInt(sCampo));datoGeneralMaximo.NOMBRE_INTEGER5=classe.getColumna();}
			else if(classe.getIndice().equals(6)) {datoGeneralMaximo.setiValorInteger6(resultSet.getInt(sCampo));datoGeneralMaximo.NOMBRE_INTEGER6=classe.getColumna();}
			else if(classe.getIndice().equals(7)) {datoGeneralMaximo.setiValorInteger7(resultSet.getInt(sCampo));datoGeneralMaximo.NOMBRE_INTEGER7=classe.getColumna();}
			else if(classe.getIndice().equals(8)) {datoGeneralMaximo.setiValorInteger8(resultSet.getInt(sCampo));datoGeneralMaximo.NOMBRE_INTEGER8=classe.getColumna();}
			else if(classe.getIndice().equals(9)) {datoGeneralMaximo.setiValorInteger9(resultSet.getInt(sCampo));datoGeneralMaximo.NOMBRE_INTEGER9=classe.getColumna();}
			else if(classe.getIndice().equals(10)) {datoGeneralMaximo.setiValorInteger10(resultSet.getInt(sCampo));datoGeneralMaximo.NOMBRE_INTEGER10=classe.getColumna();}
			
		} else if(classe.clas.equals(Double.class)) {
			if(classe.getIndice().equals(0)) {datoGeneralMaximo.setdValorDouble(resultSet.getDouble(sCampo));datoGeneralMaximo.NOMBRE_DOUBLE=classe.getColumna();}
			else if(classe.getIndice().equals(1)) {datoGeneralMaximo.setdValorDouble1(resultSet.getDouble(sCampo));datoGeneralMaximo.NOMBRE_DOUBLE1=classe.getColumna();}
			else if(classe.getIndice().equals(2)) {datoGeneralMaximo.setdValorDouble2(resultSet.getDouble(sCampo));datoGeneralMaximo.NOMBRE_DOUBLE2=classe.getColumna();}
			else if(classe.getIndice().equals(3)) {datoGeneralMaximo.setdValorDouble3(resultSet.getDouble(sCampo));datoGeneralMaximo.NOMBRE_DOUBLE3=classe.getColumna();}
			else if(classe.getIndice().equals(4)) {datoGeneralMaximo.setdValorDouble4(resultSet.getDouble(sCampo));datoGeneralMaximo.NOMBRE_DOUBLE4=classe.getColumna();}
			else if(classe.getIndice().equals(5)) {datoGeneralMaximo.setdValorDouble5(resultSet.getDouble(sCampo));datoGeneralMaximo.NOMBRE_DOUBLE5=classe.getColumna();}
			else if(classe.getIndice().equals(6)) {datoGeneralMaximo.setdValorDouble6(resultSet.getDouble(sCampo));datoGeneralMaximo.NOMBRE_DOUBLE6=classe.getColumna();}
			else if(classe.getIndice().equals(7)) {datoGeneralMaximo.setdValorDouble7(resultSet.getDouble(sCampo));datoGeneralMaximo.NOMBRE_DOUBLE7=classe.getColumna();}
			else if(classe.getIndice().equals(8)) {datoGeneralMaximo.setdValorDouble8(resultSet.getDouble(sCampo));datoGeneralMaximo.NOMBRE_DOUBLE8=classe.getColumna();}
			else if(classe.getIndice().equals(9)) {datoGeneralMaximo.setdValorDouble9(resultSet.getDouble(sCampo));datoGeneralMaximo.NOMBRE_DOUBLE9=classe.getColumna();}
			else if(classe.getIndice().equals(10)) {datoGeneralMaximo.setdValorDouble10(resultSet.getDouble(sCampo));datoGeneralMaximo.NOMBRE_DOUBLE10=classe.getColumna();}
			
		} else if(classe.clas.equals(String.class)) {
			if(classe.getIndice().equals(0)) {datoGeneralMaximo.setsValorString(resultSet.getString(sCampo));datoGeneralMaximo.NOMBRE_STRING=classe.getColumna();}
			else if(classe.getIndice().equals(1)) {datoGeneralMaximo.setsValorString1(resultSet.getString(sCampo));datoGeneralMaximo.NOMBRE_STRING1=classe.getColumna();}
			else if(classe.getIndice().equals(2)) {datoGeneralMaximo.setsValorString2(resultSet.getString(sCampo));datoGeneralMaximo.NOMBRE_STRING2=classe.getColumna();}
			else if(classe.getIndice().equals(3)) {datoGeneralMaximo.setsValorString3(resultSet.getString(sCampo));datoGeneralMaximo.NOMBRE_STRING3=classe.getColumna();}
			else if(classe.getIndice().equals(4)) {datoGeneralMaximo.setsValorString4(resultSet.getString(sCampo));datoGeneralMaximo.NOMBRE_STRING4=classe.getColumna();}
			else if(classe.getIndice().equals(5)) {datoGeneralMaximo.setsValorString5(resultSet.getString(sCampo));datoGeneralMaximo.NOMBRE_STRING5=classe.getColumna();}
			else if(classe.getIndice().equals(6)) {datoGeneralMaximo.setsValorString6(resultSet.getString(sCampo));datoGeneralMaximo.NOMBRE_STRING6=classe.getColumna();}
			else if(classe.getIndice().equals(7)) {datoGeneralMaximo.setsValorString7(resultSet.getString(sCampo));datoGeneralMaximo.NOMBRE_STRING7=classe.getColumna();}
			else if(classe.getIndice().equals(8)) {datoGeneralMaximo.setsValorString8(resultSet.getString(sCampo));datoGeneralMaximo.NOMBRE_STRING8=classe.getColumna();}
			else if(classe.getIndice().equals(9)) {datoGeneralMaximo.setsValorString9(resultSet.getString(sCampo));datoGeneralMaximo.NOMBRE_STRING9=classe.getColumna();}
			else if(classe.getIndice().equals(10)) {datoGeneralMaximo.setsValorString10(resultSet.getString(sCampo));datoGeneralMaximo.NOMBRE_STRING10=classe.getColumna();}
			
		} else if(classe.clas.equals(Date.class)) {
			if(classe.getIndice().equals(0)) {datoGeneralMaximo.setDtValorDate(resultSet.getDate(sCampo));datoGeneralMaximo.NOMBRE_DATE=classe.getColumna();}
			else if(classe.getIndice().equals(1)) {datoGeneralMaximo.setDtValorDate1(resultSet.getDate(sCampo));datoGeneralMaximo.NOMBRE_DATE1=classe.getColumna();}
			else if(classe.getIndice().equals(2)) {datoGeneralMaximo.setDtValorDate2(resultSet.getDate(sCampo));datoGeneralMaximo.NOMBRE_DATE2=classe.getColumna();}
			else if(classe.getIndice().equals(3)) {datoGeneralMaximo.setDtValorDate3(resultSet.getDate(sCampo));datoGeneralMaximo.NOMBRE_DATE3=classe.getColumna();}
			else if(classe.getIndice().equals(4)) {datoGeneralMaximo.setDtValorDate4(resultSet.getDate(sCampo));datoGeneralMaximo.NOMBRE_DATE4=classe.getColumna();}
			else if(classe.getIndice().equals(5)) {datoGeneralMaximo.setDtValorDate5(resultSet.getDate(sCampo));datoGeneralMaximo.NOMBRE_DATE5=classe.getColumna();}
			else if(classe.getIndice().equals(6)) {datoGeneralMaximo.setDtValorDate6(resultSet.getDate(sCampo));datoGeneralMaximo.NOMBRE_DATE6=classe.getColumna();}
			else if(classe.getIndice().equals(7)) {datoGeneralMaximo.setDtValorDate7(resultSet.getDate(sCampo));datoGeneralMaximo.NOMBRE_DATE7=classe.getColumna();}
			else if(classe.getIndice().equals(8)) {datoGeneralMaximo.setDtValorDate8(resultSet.getDate(sCampo));datoGeneralMaximo.NOMBRE_DATE8=classe.getColumna();}
			else if(classe.getIndice().equals(9)) {datoGeneralMaximo.setDtValorDate9(resultSet.getDate(sCampo));datoGeneralMaximo.NOMBRE_DATE9=classe.getColumna();}
			else if(classe.getIndice().equals(10)) {datoGeneralMaximo.setDtValorDate10(resultSet.getDate(sCampo));datoGeneralMaximo.NOMBRE_DATE10=classe.getColumna();}
			
		} else if(classe.clas.equals(Long.class)) {
			if(classe.getIndice().equals(0)) {datoGeneralMaximo.setlValorLong(resultSet.getLong(sCampo));datoGeneralMaximo.NOMBRE_LONG=classe.getColumna();}
			else if(classe.getIndice().equals(1)) {datoGeneralMaximo.setlValorLong1(resultSet.getLong(sCampo));datoGeneralMaximo.NOMBRE_LONG1=classe.getColumna();}
			else if(classe.getIndice().equals(2)) {datoGeneralMaximo.setlValorLong2(resultSet.getLong(sCampo));datoGeneralMaximo.NOMBRE_LONG2=classe.getColumna();}
			else if(classe.getIndice().equals(3)) {datoGeneralMaximo.setlValorLong3(resultSet.getLong(sCampo));datoGeneralMaximo.NOMBRE_LONG3=classe.getColumna();}
			else if(classe.getIndice().equals(4)) {datoGeneralMaximo.setlValorLong4(resultSet.getLong(sCampo));datoGeneralMaximo.NOMBRE_LONG4=classe.getColumna();}
			else if(classe.getIndice().equals(5)) {datoGeneralMaximo.setlValorLong5(resultSet.getLong(sCampo));datoGeneralMaximo.NOMBRE_LONG5=classe.getColumna();}
			else if(classe.getIndice().equals(6)) {datoGeneralMaximo.setlValorLong6(resultSet.getLong(sCampo));datoGeneralMaximo.NOMBRE_LONG6=classe.getColumna();}
			else if(classe.getIndice().equals(7)) {datoGeneralMaximo.setlValorLong7(resultSet.getLong(sCampo));datoGeneralMaximo.NOMBRE_LONG7=classe.getColumna();}
			else if(classe.getIndice().equals(8)) {datoGeneralMaximo.setlValorLong8(resultSet.getLong(sCampo));datoGeneralMaximo.NOMBRE_LONG8=classe.getColumna();}
			else if(classe.getIndice().equals(9)) {datoGeneralMaximo.setlValorLong9(resultSet.getLong(sCampo));datoGeneralMaximo.NOMBRE_LONG9=classe.getColumna();}
			else if(classe.getIndice().equals(10)) {datoGeneralMaximo.setlValorLong10(resultSet.getLong(sCampo));datoGeneralMaximo.NOMBRE_LONG10=classe.getColumna();}
			
		} else if(classe.clas.equals(Boolean.class)) {
			if(classe.getIndice().equals(0)) {datoGeneralMaximo.setIsValorBoolean(resultSet.getBoolean(sCampo));datoGeneralMaximo.NOMBRE_BOOLEAN=classe.getColumna();}
			else if(classe.getIndice().equals(1)) {datoGeneralMaximo.setIsValorBoolean1(resultSet.getBoolean(sCampo));datoGeneralMaximo.NOMBRE_BOOLEAN1=classe.getColumna();}
			else if(classe.getIndice().equals(2)) {datoGeneralMaximo.setIsValorBoolean2(resultSet.getBoolean(sCampo));datoGeneralMaximo.NOMBRE_BOOLEAN2=classe.getColumna();}
			else if(classe.getIndice().equals(3)) {datoGeneralMaximo.setIsValorBoolean3(resultSet.getBoolean(sCampo));datoGeneralMaximo.NOMBRE_BOOLEAN3=classe.getColumna();}
			else if(classe.getIndice().equals(4)) {datoGeneralMaximo.setIsValorBoolean4(resultSet.getBoolean(sCampo));datoGeneralMaximo.NOMBRE_BOOLEAN4=classe.getColumna();}
			else if(classe.getIndice().equals(5)) {datoGeneralMaximo.setIsValorBoolean5(resultSet.getBoolean(sCampo));datoGeneralMaximo.NOMBRE_BOOLEAN5=classe.getColumna();}
			else if(classe.getIndice().equals(6)) {datoGeneralMaximo.setIsValorBoolean6(resultSet.getBoolean(sCampo));datoGeneralMaximo.NOMBRE_BOOLEAN6=classe.getColumna();}
			else if(classe.getIndice().equals(7)) {datoGeneralMaximo.setIsValorBoolean7(resultSet.getBoolean(sCampo));datoGeneralMaximo.NOMBRE_BOOLEAN7=classe.getColumna();}
			else if(classe.getIndice().equals(8)) {datoGeneralMaximo.setIsValorBoolean8(resultSet.getBoolean(sCampo));datoGeneralMaximo.NOMBRE_BOOLEAN8=classe.getColumna();}
			else if(classe.getIndice().equals(9)) {datoGeneralMaximo.setIsValorBoolean9(resultSet.getBoolean(sCampo));datoGeneralMaximo.NOMBRE_BOOLEAN9=classe.getColumna();}
			else if(classe.getIndice().equals(10)) {datoGeneralMaximo.setIsValorBoolean10(resultSet.getBoolean(sCampo));datoGeneralMaximo.NOMBRE_BOOLEAN10=classe.getColumna();}
			
		} else if(classe.clas.equals(Short.class)) {
			//datoGeneralMaximo.setShValorShort(resultSet.getShort(sCampo));
			
		} else if(classe.clas.equals(Float.class)) {
			//datoGeneralMaximo.setfValorFloat(resultSet.getFloat(sCampo));
			
		} else if(classe.clas.equals(BigDecimal.class)) {
			//datoGeneralMaximo.setDbValorBigDecimal(resultSet.getBigDecimal(sCampo));
			
		} else if(classe.clas.equals(Timestamp.class)) {
			//datoGeneralMaximo.setTsValorTimestamp(resultSet.getTimestamp(sCampo));
			
		} else if(classe.clas.equals(Time.class)) {
			//datoGeneralMaximo.settValorTime(resultSet.getTime(sCampo));
			
		} else if(classe.clas.equals(Byte.class)) {
			//datoGeneralMaximo.setbValorByte(resultSet.getByte(sCampo));
			
		} else if(classe.clas.equals(Reader.class)) {
			//datoGeneralMaximo.setrValorReader(resultSet.getCharacterStream(sCampo));
			
		} else {
			//datoGeneralMaximo.setoValorObject(resultSet.getObject(sCampo));
		}
	}
}
	  
