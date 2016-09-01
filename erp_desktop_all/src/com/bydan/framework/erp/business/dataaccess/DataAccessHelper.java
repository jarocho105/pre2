package com.bydan.framework.erp.business.dataaccess;

import java.sql.CallableStatement;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import com.bydan.erp.seguridad.business.dataaccess.AccionDataAccess;
import com.bydan.erp.seguridad.business.entity.Accion;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.GeneralEntityReadOnly;
import com.bydan.framework.erp.business.logic.ParameterSelectionGeneral;
import com.bydan.framework.erp.business.logic.QueryWhereSelectParameters;
import com.bydan.framework.erp.util.Connexion;
import com.bydan.framework.erp.util.ConnexionType;
import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.Constantes2;
import com.bydan.framework.erp.util.Funciones2;
import com.bydan.framework.erp.util.ParameterDbType;
import com.bydan.framework.erp.util.ParameterMaintenance;
import com.bydan.framework.erp.util.ParameterType;
import com.bydan.framework.erp.util.ParametersMaintenance;
import com.bydan.framework.erp.util.ParametersType;

@SuppressWarnings("unused")
public  class DataAccessHelper<T extends GeneralEntity>{
	
	public static String getColumnNameId() {
		return ConstantesSql.ID;
	}
	
	public static String getColumnNameIsActive() {
		return ConstantesSql.ISACTIVE;
	}
	
	public static String getColumnNameIsExpired() {
		return ConstantesSql.ISEXPIRED;
	}
	
	public static String getColumnNameVersionRow() {
		return ConstantesSql.VERSIONROW;
	}
	
	public  static String buildSqlGeneralGetEntities(GeneralEntity entity,QueryWhereSelectParameters queryWhereSelectParameters,String strSelectQuery)throws SQLException,Exception {
       String query="";
        
       try {
    	   
    	   query=DataAccessHelperBase.buildSqlGeneralGetEntities(queryWhereSelectParameters,strSelectQuery);
       	 
       } catch(Exception ex) {
           throw new Exception();
       }
       
       return query;
    }
	
	public  static String buildSqlGeneralGetEntitiesJDBC(GeneralEntity entity,QueryWhereSelectParameters queryWhereSelectParameters,String strSelectQuery)throws SQLException,Exception {
	       String query="";
	        
	       try {
	    	   
	    	   query=DataAccessHelperBase.buildSqlGeneralGetEntitiesJDBC(queryWhereSelectParameters,strSelectQuery);
	       	 
	       } catch(Exception ex) {
	           throw new Exception();
	       }
	       
	       return query;
	    }
	
	public  static String buildSqlGeneralGetEntitiesJDBC(GeneralEntity entity,String strTableName,QueryWhereSelectParameters queryWhereSelectParameters,String sQuerySelect)throws Exception {
        String query="";
        
        try {
        	query=DataAccessHelperBase.buildSqlGeneralGetEntitiesJDBC(strTableName,queryWhereSelectParameters,sQuerySelect);
        	
    	} catch(Exception ex) {
          throw ex;
        }
    	
        return query;
    }
	
	public  static String buildSqlGeneralGetEntities(GeneralEntityReadOnly entity,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {
        String query="";
        
        try {
        	
        	query=DataAccessHelperBase.buildSqlGeneralGetEntities(entity,queryWhereSelectParameters);
        	
    	} catch(Exception e) {
          throw e;
        }
        
        return query;
    }
	
	public  static String buildSqlGeneralGetEntitiesCompuesto(QueryWhereSelectParameters queryWhereSelectParameters)throws SQLException,Exception {
        String query="";
        
        try  {
        	
        	query=DataAccessHelperBase.buildSqlGeneralGetEntitiesCompuesto(queryWhereSelectParameters);
        	
    	} catch(Exception ex) {
            throw ex;
        }
        
        return query;
    }
	
	public  static String buildSqlGeneralGetEntities(GeneralEntity entity,String strTableName,QueryWhereSelectParameters queryWhereSelectParameters,String sQuerySelect)throws Exception {
        String query="";
        
        try {
        	
        	query=DataAccessHelperBase.buildSqlGeneralGetEntities(strTableName,queryWhereSelectParameters,sQuerySelect);
        	
    	} catch(Exception ex) {
          throw ex;
        }
    	
        return query;
    }
	
	public  static String buildSqlGeneralGetEntities(GeneralEntity entity,QueryWhereSelectParameters queryWhereSelectParameters,String querySelect,String query)throws Exception {
		//String query="";
		
        try {
        	
        	query=DataAccessHelperBase.buildSqlGeneralGetEntities(queryWhereSelectParameters,querySelect,query);
        	
    	}  catch(Exception ex) {
    		throw ex;
    	}
    	
        return query;
    }
	
	public  static String buildSqlGeneralGetEntitiesSimpleQueryBuild(QueryWhereSelectParameters queryWhereSelectParameters,String strSelectQuery)throws SQLException,Exception {
        String query="";
        
        try  {        	
        	query=DataAccessHelperBase.buildSqlGeneralGetEntitiesSimpleQueryBuild(queryWhereSelectParameters,strSelectQuery);
        	
    	} catch(Exception ex) {
            throw new Exception();
        }
        
        return query;
    }
	
	public  static String buildSqlGeneralGetEntitiesSimpleQueryBuildJDBC(QueryWhereSelectParameters queryWhereSelectParameters,String strSelectQuery)throws SQLException,Exception {
        String query="";
        
        try  {        	
        	query=DataAccessHelperBase.buildSqlGeneralGetEntitiesSimpleQueryBuildJDBC(queryWhereSelectParameters,strSelectQuery);
        	
    	} catch(Exception ex) {
            throw new Exception();
        }
        
        return query;
    }
	
	public  static void buildSqlGeneralSetQueryParameters(Query query,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {
        try {
        	queryWhereSelectParameters.buildSqlGeneralSetQueryParameters(query,queryWhereSelectParameters.getParametersSelectionGeneral());
        	
    	} catch(Exception ex) {
          throw new Exception();
        }   	
     }
	
	public  static void buildSqlGeneralSetQueryPagination(Query query,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {
        try {
        	DataAccessHelperBase.buildSqlGeneralSetQueryPagination(query,queryWhereSelectParameters);
        	
    	} catch(Exception ex) {
          throw new Exception();
        }   	
    }
	
	public  static Boolean ejecutarSql(String sql,Connexion con)throws Exception {
        Boolean  ejecutado= true;
        
        try {
        	ejecutado=DataAccessHelperBase.ejecutarSql(sql,con);
        	
    	} catch(Exception ex) {
          throw new Exception();
    	}
    	
        return !ejecutado;
    }
	
	public  static Boolean ejecutarStoreProcedure(String sql,Connexion con)throws Exception {
        Boolean  ejecutado= false;
        
        try {
        	ejecutado=DataAccessHelperBase.ejecutarStoreProcedure(sql,con);
        	
    	} catch(Exception ex) {
            throw new Exception();
        }
        
        return !ejecutado;
    }
	
	public  static Integer ejecutarStoreProcedureConOupPutResultado(String sql,Connexion con)throws Exception {
        Integer  intResultado= -1;
        
        try {
        	intResultado=DataAccessHelperBase.ejecutarStoreProcedureConOupPutResultado(sql,con);
        	
    	}  catch(Exception ex) {
            throw new Exception();
        }
        
        return intResultado;
    }
	
	//ParametersMaintenance parametersMaintenance,
	public static void save(GeneralEntity entity,Connexion con,String sQuerySave,String sTableName,Boolean isWithStoreProcedures)throws Exception {		
		 try {
			 DataAccessHelper.save(entity,con,null,sQuerySave,sTableName,isWithStoreProcedures);
			 
		 } catch(Exception ex) {
	        throw ex;
	    } finally {
		 }
	}

	public static void save(GeneralEntity entity,Connexion con,ParametersMaintenance parametersMaintenance,String sQuerySave,String sTableName,Boolean isWithStoreProcedures)throws SQLException,Exception {		
		 try {
		
				 if(entity!=null) {
					 
					 entity.setIsDeletedAuxiliar(false);	
					 entity.setIsNewAuxiliar(false);	
					 entity.setIsChangedAuxiliar(false);
					 
					 entity.setConCambioAuxiliar(false);
					 
				 } else {
					 return;
				 }
				 
				 
				 if (entity.getIsDeleted()) {
					 //if (entity.getIsExpired()) {
						 //entity.buildParametersMaintenance(con.getDbType(),ParametersType.DELETE);
				 			
						 delete(entity,con,sQuerySave);
						 
						 entity.setIsDeletedAuxiliar(true);	
						 entity.setConCambioAuxiliar(true);
						 
			         /*} else {
						 //entity.setIsActive(false);					
						 //entity.buildParametersMaintenance(con.getDbType(),ParametersType.UPDATE);
			      		 //parametersMaintenance,	
						 update(entity,con,sQuerySave);
						 entity.setIsChanged( false);
			         }*/
		         }
		         else if (entity.getIsChanged()) {
		        	
		             if (entity.getIsNew()) {
		            	 //entity.buildParametersMaintenance(con.getDbType(),ParametersType.INSERT);
		      			 //parametersMaintenance,
		            	 insert(entity,con,parametersMaintenance,sQuerySave);
		                 
		            	 entity.setIsNew(false);
		                 
		            	 entity.setIsNewAuxiliar(true);	
		            	 entity.setConCambioAuxiliar(true);
		            	  
		             } else {
		            	 //entity.buildParametersMaintenance(con.getDbType(),ParametersType.UPDATE);
		      			 //parametersMaintenance,
		                 update(entity,con,parametersMaintenance,sQuerySave);
		                 		               
		             }
		
		             entity.setIsChanged( false);
		             
		             //MANTENER ESTADO ISCHANGED HASTA OBTENER EL VERSIONROW
		             entity.setIsChangedAuxiliar(true);	
		             entity.setConCambioAuxiliar(true);
		         }
				 
			 } catch(SQLException ex) {				 
				 throw ex;		
			 } catch(Exception ex) {
		         throw ex;
		     } finally {
			 }
		 }
     	
	private static void addMYSQLParameter(Connexion con,PreparedStatement pstmt,ParameterMaintenance parameterMaintenance)throws Exception {	
		DataAccessHelperBase.addMYSQLParameter(con,pstmt,parameterMaintenance);
    }
	
	private static void addPOSTGRESParameter(Connexion con,PreparedStatement pstmt,ParameterMaintenance parameterMaintenance)throws Exception {	
		DataAccessHelperBase.addPOSTGRESParameter(con,pstmt,parameterMaintenance);
    }
		
	private static void insert(GeneralEntity entity,Connexion con,String sQueryInsert)  throws Exception {	
		try {
			if(!con.getConnexionType().equals(ConnexionType.JDBC32)) {
				DataAccessHelper.insert(entity,con,null,sQueryInsert);
			}
			
		} catch(Exception ex) {
	        throw ex;
	    } 
	}
	
	private static void insert(GeneralEntity entity,Connexion con,ParametersMaintenance parametersMaintenance,String sQueryInsert)  throws Exception {
		
		try {
			if(con.getConnexionType().equals(ConnexionType.JDBC32)) {
				DataAccessHelper.insertJdbc(entity,con,parametersMaintenance,sQueryInsert);	
			} else {
				DataAccessHelper.insertHibernate(entity,con,sQueryInsert);
			}
		} catch(Exception ex) {
	        throw ex;
	    } 
	}
	
	private static void insertJdbc(GeneralEntity entity,Connexion con,ParametersMaintenance parametersMaintenance,String sQueryInsert)  throws SQLException,Exception {
    		PreparedStatement pstmt = null;
    		Integer numeroRegistroModificado=0;
    		Long id=0L;
    		
    		try {
    		
	    		pstmt = con.getConnection().prepareStatement(sQueryInsert);
	    		
	    		for(ParameterMaintenance parameter:parametersMaintenance.getParametersMaintenance()) {
	    			if(parametersMaintenance.getDbType().equals(ParameterDbType.MYSQL)) {
	    				addMYSQLParameter(con,pstmt,parameter);
	    				
	    			} else if(parametersMaintenance.getDbType().equals(ParameterDbType.POSTGRES)) {
	    				addPOSTGRESParameter(con,pstmt,parameter);
	    			}	    		
	    		}
	    		
	    		if(Constantes2.ISDEVELOPING2)  {
	    			System.out.println(pstmt);
		        }	
	    		
	    		if(!Constantes2.ISDEVELOPING_QUERY_EXPORT) {
		    		numeroRegistroModificado=pstmt.executeUpdate();
		    		
		    		if(numeroRegistroModificado.equals(0)) {
		    			throw new SQLException("No se actualizo los datos,intentelo nuevamente");		
		    		}
		    		
		    		//entity.setParametersMaintenance(new ParametersMaintenance());
		    		//entity.setOrder(1);
		    		String sFuncionIdGenerado=DataAccessHelper.getFuncionIdGenerado(con);
		    		
		    		sFuncionIdGenerado=sFuncionIdGenerado.replace("ninguno.", "");
		    		sFuncionIdGenerado=sFuncionIdGenerado.replace("NINGUNO.", "");
		    		
		    		pstmt = con.getConnection().prepareStatement(sFuncionIdGenerado);//"select LAST_INSERT_ID() as id;"
		    		ResultSet rs =pstmt.executeQuery();
		    			   		   
		       	    while (rs.next()) {	       		
		       	    	id=rs.getLong("id");//"id"//"LAST_INSERT_ID()"     	    	
		       	    }
		       	    
		       	    entity.setId(id);
		       	    
	    		} else {
	    			Funciones2.writeQueryFile(pstmt);
	    		}	
	    		
    		} catch(SQLException e) {
    			//String s=ex.getMessage();
                //throw new SQLException();
    			throw e;
            } catch(Exception e) {
            	throw e;
            	
                //throw new Exception();
            } finally {
            	if (pstmt != null) {
            		pstmt.close();
            	}
    		}  		
    }
    
	private static String getFuncionIdGenerado(Connexion con) {
		String sFuncionIdGenerado="";
		
		if(con.getDbType().equals(ParameterDbType.MYSQL)) {
			sFuncionIdGenerado="select LAST_INSERT_ID() as id;";
			
		} else if(con.getDbType().equals(ParameterDbType.POSTGRES)){
			
			sFuncionIdGenerado="select currval('"+con.getFuncionAuxiliar()+"') as id;";
		}
		
		return sFuncionIdGenerado;
	}
	
	private static void insertHibernate(GeneralEntity entity,Connexion con,String sQueryInsert)  throws SQLException,Exception {
		Integer numeroRegistroModificado=0;
		Long id=0L;
		
		try {
			
			//ANTES BIEN
			//con.getEntityManager().persist(entity);
			
			//SOLO VER
			
			if(con.getEntityManager().contains(entity)) {
				con.getEntityManager().persist(entity);
			} else {
				GeneralEntity generalEntityPersist=con.getEntityManager().merge(entity);
				//PARA MYSQL
				Timestamp ts =null;
				
				/*
				if(Constantes.ISDEVELOPING) {
					ts = new java.sql.Timestamp(generalEntityPersist.versionRow.getYear(),generalEntityPersist.versionRow.getMonth(),generalEntityPersist.versionRow.getDate(),generalEntityPersist.versionRow.getHours(),generalEntityPersist.versionRow.getMinutes(),generalEntityPersist.versionRow.getSeconds(),0);
				}
				*/
				ts = new java.sql.Timestamp(generalEntityPersist.versionRow.getTime());
				
				entity.setId(generalEntityPersist.getId());
				
				entity.setVersionRow(ts);
				/*
				//PARA MYSQL
				if(!Constantes.ISDEVELOPING) {
					entity.setVersionRow(generalEntityPersist.versionRow);
				} else {
					entity.setVersionRow(ts);
				}
				*/
				
				con.getEntityManager().persist(generalEntityPersist);
	
				//entity=generalEntityPersist;
			}
			
    		/*
    		if(Constantes2.ISDEVELOPING2)  {
	    		System.out.println(pstmt);
		    }	
		        
    		numeroRegistroModificado=pstmt.executeUpdate();
    		
    		if(numeroRegistroModificado.equals(0)) {
    			throw new SQLException("No se actualizo los datos,intentelo nuevamente");		
    		}
    		 		
    		pstmt = con.getConnection().prepareStatement("select LAST_INSERT_ID();");
    		ResultSet rs =pstmt.executeQuery();
    		
    		   
       	    while (rs.next()) {	       		
       	    	id=rs.getLong("LAST_INSERT_ID()");      	    	
       	    }
       	    
       	    entity.setId(id);
       	    */
       	    
		}  catch(Exception ex) {
            throw ex;
			//throw new Exception();
        } finally {
        	
		}  		
	}
	
	private static void update(GeneralEntity entity,Connexion con,String sQueryUpdate)  throws Exception {
		Integer numeroRegistroModificado=0;
		
		try {
			if(!con.getConnexionType().equals(ConnexionType.JDBC32)) {
				DataAccessHelper.update(entity,con,null,sQueryUpdate);
			}			
		} catch(Exception ex) {
	        throw ex;
	    } 
	}
	
	private static void update(GeneralEntity entity,Connexion con,ParametersMaintenance parametersMaintenance,String sQueryUpdate)  throws Exception {		
		try {
			if(con.getConnexionType().equals(ConnexionType.JDBC32)) {
				DataAccessHelper.updateJdbc(entity,con,parametersMaintenance,sQueryUpdate);	
			} else {
				DataAccessHelper.updateHibernate(entity,con,sQueryUpdate);
			}
		} catch(Exception ex) {
	        throw ex;
	    } 
	}
	
	private static void updateJdbc(GeneralEntity entity,Connexion con,ParametersMaintenance parametersMaintenance,String sQueryUpdate)  throws SQLException,Exception {
		PreparedStatement pstmt = null;
		Integer numeroRegistroModificado=0;
		
		try {
		
			pstmt = con.getConnection().prepareStatement(sQueryUpdate);
			
			for(ParameterMaintenance parameter:parametersMaintenance.getParametersMaintenance()) {
				if(parametersMaintenance.getDbType().equals(ParameterDbType.MYSQL)) {
					addMYSQLParameter(con,pstmt,parameter);	
					
				} else if(parametersMaintenance.getDbType().equals(ParameterDbType.POSTGRES)) {
					addPOSTGRESParameter(con,pstmt,parameter);	
				}
			}
		
			if(Constantes2.ISDEVELOPING2)  {
    			System.out.println(pstmt);
	        }	
			
			if(!Constantes2.ISDEVELOPING_QUERY_EXPORT) {
				numeroRegistroModificado=pstmt.executeUpdate();
				
				if(numeroRegistroModificado.equals(0)) {
					throw new SQLException("No se actualizo los datos,intentelo nuevamente");		
				}
				
			} else {
    			Funciones2.writeQueryFile(pstmt);
    		}	
			
			//entity.setParametersMaintenance(new ParametersMaintenance());
			//entity.setOrder(1);	
		} catch(SQLException e) {
			//String s=ex.getMessage();
	        throw e;
	    } catch(Exception e) {
	        throw e;
	        
	    } finally {
	    	if (pstmt != null) {
	    		pstmt.close();
	    	}
		}
	}
	
	private static void updateHibernate(GeneralEntity entity,Connexion con,String sQueryUpdate)  throws Exception {
		Integer numeroRegistroModificado=0;
		
		try {
			
			//entity.setVersionRow(new Date());
			
			/*
			GeneralEntity generalEntityPersist=con.getEntityManager().merge(entity);
			
			entity=generalEntityPersist;
			*/
			
			//CREO TA BIEN
			
			if(con.getEntityManager().contains(entity)) {
				con.getEntityManager().persist(entity);
				
			} else {
				//CAMINO 1
				GeneralEntity generalEntityPersist=con.getEntityManager().merge(entity);
				entity=generalEntityPersist;
								
				//CAMINO 2
				/*
				GeneralEntity generalEntityPersist=con.getEntityManager().merge(entity);
				con.getEntityManager().persist(generalEntityPersist);
				
				entity.setId(generalEntityPersist.getId());
				entity.setVersionRow(generalEntityPersist.versionRow);
				*/
				
				//ANTERIOR
				//entity=generalEntityPersist;
				
				
				//entity.setId(generalEntityPersist.getId());
				//entity.setVersionRow(generalEntityPersist.versionRow);
				//entity=generalEntityPersist;
			}			
			
			//SOLO VER
			/*
			entity.setVersionRow(new Date());
			
			if(con.getEntityManager().contains(entity)) {
				con.getEntityManager().persist(entity);
			} else {
				
				entity.setVersionRow(new Date());
				
				GeneralEntity generalEntityPersist=con.getEntityManager().merge(entity);
				
			}
			
			*/			
			
		 /*
		    if(Constantes2.ISDEVELOPING2)  {
	    		System.out.println(pstmt);
		    }	
		        
			numeroRegistroModificado=pstmt.executeUpdate();
			
			if(numeroRegistroModificado.equals(0)) {
				throw new Exception("No se actualizo los datos,intentelo nuevamente");		
			}
		*/	
			
		} catch(Exception ex) {
	        throw ex;
	    } 
	}
	 
	private static void delete(GeneralEntity entity,Connexion con,String sQueryDelete)throws SQLException,Exception {      		 
		   try {
			   
			   if(con.getConnexionType().equals(ConnexionType.JDBC32)) {
				   DataAccessHelper.deleteJdbc(entity,con,sQueryDelete);
					
				} else {
					DataAccessHelper.deleteHibernate(entity,con,sQueryDelete);
				}
			   			                    
			     } catch(Exception ex) {
			    	 throw ex;
			         //throw new Exception();
			     } finally {
			         
			     }      
	}
	
	private static void deleteJdbc(GeneralEntity entity,Connexion con,String sQueryDelete)throws Exception {      
		   PreparedStatement pstmt = null;
		   Integer numeroRegistroModificado=0;
     
		   try {
      
	            pstmt = con.getConnection().prepareStatement(sQueryDelete);        
	            pstmt.setLong(1, entity.getId());
    	
	            if(Constantes2.ISDEVELOPING2)  {
	    			System.out.println(pstmt);
		        }	
	            
	            if(!Constantes2.ISDEVELOPING_QUERY_EXPORT) {
	            	numeroRegistroModificado=pstmt.executeUpdate();
	         
		            if(numeroRegistroModificado.equals(0)) {
		        		throw new SQLException("No se actualizo los datos,intentelo nuevamente");		
		        	}  
	            } else {
	            	Funciones2.writeQueryFile(pstmt);
	            }
     } catch(Exception e) {
    	 throw e;
    	 
         //throw new Exception();
     } finally {
         if (pstmt != null) {
         	pstmt.close();
         }
      }      
 }
	
	private static void deleteHibernate(GeneralEntity entity,Connexion con,String sQueryDelete)throws SQLException,Exception {      
		   Integer numeroRegistroModificado=0;

		   try {
			   
			   if(con.getEntityManager().contains(entity)) {
				   con.getEntityManager().remove(entity);
					
				} else {
					GeneralEntity generalEntityPersist=con.getEntityManager().merge(entity);
					
					entity=generalEntityPersist;
					
					 con.getEntityManager().remove(entity);
				}
			   			  			   
			   // SOLO VER
			   /*
			   if(con.getEntityManager().contains(entity)) {
				   con.getEntityManager().remove(entity);
			   } else {
					GeneralEntity generalEntityPersist=con.getEntityManager().merge(entity);
					con.getEntityManager().persist(generalEntityPersist);
				}
				*/
	          /*
	           	if(Constantes2.ISDEVELOPING2)  {
	    			System.out.println(pstmt);
		        }	
		        
	            numeroRegistroModificado=pstmt.executeUpdate();
   
	            if(numeroRegistroModificado.equals(0)) {
	        		throw new SQLException("No se actualizo los datos,intentelo nuevamente");		
	        	}  
	        	*/                     
			     } catch(Exception ex) {
			    	 throw ex;
			         //throw new Exception();
			     } finally {
			         
			     }      
	}
		
	public  T getEntity(Connexion con, int id,String sQuerySelect,Boolean isWithSchema)throws Exception {		  
          T entityT = null;

          try {
      	    	Statement stmt = con.getConnection().createStatement();
      	    	ResultSet rs = stmt.executeQuery(sQuerySelect+ " "+ConstantesSql.WHERE+" "+DataAccessHelper.getColumnNameId()+ "="+id);
      	   
      	    	while (rs.next()) {      		
      	    	entityT=getEntity("",extracted(entityT),rs,isWithSchema);
      	    	
      	    	}

      	    	stmt.close();
      	    	con.getConnection().close();
      		} catch(Exception ex) {
	            throw new Exception();
	        }
	      	
          return extracted(entityT);
      }

	private T extracted(T entityT) {
		return entityT;
	}
	  
	public  ArrayList<T> getEntities(GeneralEntity entity,QueryWhereSelectParameters queryWhereSelectParameters,Connexion con, int id,String sQuerySelect,Boolean isWithSchema) throws Exception
    {
		  ArrayList<T> entitiesT =new ArrayList<T>();;
		  T entityT = null;
		  
          try {
	      	    Statement stmt = con.getConnection().createStatement();
	      	    ResultSet rs = stmt.executeQuery(sQuerySelect+ "	"+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParameters() +queryWhereSelectParameters.getFinalQuery());
	      	   
	      	    while (rs.next()) {	      	    	
	      	    	entityT=getEntity("",extracted(entityT),rs,isWithSchema);
	      	    	entitiesT.add(extracted(entityT));
	      	    }
	
	      	    stmt.close();
	      	    con.getConnection().close();
      	} catch(Exception ex) {
            throw new Exception();
        }
        return entitiesT;
    }
	  
	public  T getEntity(String strPrefijo,T entityT,ResultSet rs,Boolean isWithSchema) throws Exception {	 
		  extracted(entityT).setIsNew(false);
          
		  try {
      	  
        	  if(isWithSchema) {
      	    	extracted(entityT).setId(rs.getLong(strPrefijo+DataAccessHelper.getColumnNameId()));	
      	    	//extracted(entityT).setIsActive(rs.getBoolean(strPrefijo+DataAccessHelper.getColumnNameIsActive()));
      	    	//extracted(entityT).setIsExpired(rs.getBoolean(strPrefijo+DataAccessHelper.getColumnNameIsExpired()));
      	    	extracted(entityT).setVersionRow(rs.getTimestamp(strPrefijo+DataAccessHelper.getColumnNameVersionRow()));     	    	       	 
        	  }
	      	} catch(Exception ex) {
	            throw new Exception();
	        }
	      	
          return extracted(entityT);
    }
	
	public  T getEntity(T entityT) throws SQLException,Exception {	 		 
		  try {
    	  
			  extracted(entityT).setIsNew(false);
		        
	      	}catch(Exception ex) {
	            throw new Exception();
	        }
	      	
        return extracted(entityT);
  }
	
	public  void SetGeneralEntityIsNewFalse(T generalEntity)throws Exception  {		
		generalEntity.setIsNew(false);		
	}

	public  void SetGeneralEntityIsNewFalseIsChangedFalse(T generalEntity)throws Exception  {		
		generalEntity.setIsNew(false);
		generalEntity.setIsChanged(false);
	}

	public  void SetGeneralEntitiesIsNewFalse(List<T> generalEntities)throws Exception  {		
		for(T generalEntity:generalEntities){
			generalEntity.setIsNew(false);
		}
	}
	
	public  void SetGeneralEntitiesIsNewFalseIsChangedFalse(List<T> generalEntities)throws Exception  {		
		for(T generalEntity:generalEntities){
			generalEntity.setIsNew(false);
			generalEntity.setIsChanged(false);
		}
	}

	public void SetGeneralEntityOriginal(T generalEntity)throws Exception  {
		generalEntity.setGeneralEntityOriginal(generalEntity);		
	}
	
	public void SetGeneralEntitiesOriginal(List<T> generalEntities)throws Exception  {	
		for(T generalEntity:generalEntities){
			generalEntity.setGeneralEntityOriginal(generalEntity);
		}
	}

	public  static void getGeneralEntity(String strPrefijo,GeneralEntity entityT,ResultSet rs) throws Exception {		 
		  entityT.setIsNew(false);
		  
          try {
        	  entityT.setId(rs.getLong(strPrefijo+DataAccessHelper.getColumnNameId()));	
    	      //entityT.setIsActive(rs.getBoolean(strPrefijo+DataAccessHelper.getColumnNameIsActive()));
    	     // entityT.setIsExpired(rs.getBoolean(strPrefijo+DataAccessHelper.getColumnNameIsExpired()));
    	      entityT.setVersionRow(rs.getTimestamp(strPrefijo+DataAccessHelper.getColumnNameVersionRow()));     	    	       	 
          } catch(Exception ex) {
      		  throw new Exception();
          }          
      }		
	
public static class getEntitiesReadOnlyDataAccessHelper<T extends GeneralEntityReadOnly> {        		  
		public  ArrayList<T> getEntities(GeneralEntityReadOnly entity,QueryWhereSelectParameters queryWhereSelectParameters,Connexion con) throws Exception {
			  	ArrayList<T> entitiesT = new ArrayList<T>();
			  	T entityT = null;
			  
	          try {
		      	    Statement stmt = con.getConnection().createStatement();
		      	    ResultSet rs = stmt.executeQuery(entity.getQuerySelect()+ "	"+ConstantesSql.WHERE+" "+queryWhereSelectParameters.getQueryWhereSelectParameters() +queryWhereSelectParameters.getFinalQuery());
		      	   
		      	    while (rs.next()) {		      	    	
		      	    	entityT=getEntity(entityT,rs);
		      	    	entitiesT.add(entityT);
		      	    }
	
		      	    stmt.close();
		      	    con.getConnection().close();
		      	} catch(Exception ex) {
		            throw new Exception();
		        }
		      	
	          return entitiesT;
	      }
		  
		  public  T getEntity(T entityT,ResultSet rs) throws Exception {			 			  
	          try {	      	
	      	    	entityT.setId(rs.getInt(DataAccessHelper.getColumnNameId()));	
		      	
	          } catch(Exception ex) {
		    	  throw new Exception();
		      }
		      	
	          return entityT;
	      }		  
	}
}
	  
