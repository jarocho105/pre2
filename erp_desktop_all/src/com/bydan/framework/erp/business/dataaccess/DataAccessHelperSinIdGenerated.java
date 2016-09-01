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

import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.GeneralEntitySinIdGenerated;
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
public  class DataAccessHelperSinIdGenerated<T extends GeneralEntitySinIdGenerated>{
	
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
	
	public  static String buildSqlGeneralGetEntities(GeneralEntitySinIdGenerated entity,QueryWhereSelectParameters queryWhereSelectParameters,String strSelectQuery)throws SQLException,Exception {
        String query="";
        
        try {
        	 query=DataAccessHelperBase.buildSqlGeneralGetEntities(queryWhereSelectParameters,strSelectQuery);
        	 
    	} catch(Exception ex) {
            throw ex;//new Exception();
        }
        
        return query;
    }
	
	public  static String buildSqlGeneralGetEntitiesJDBC(GeneralEntitySinIdGenerated entity,QueryWhereSelectParameters queryWhereSelectParameters,String strSelectQuery)throws SQLException,Exception {
        String query="";
        
        try {
        	 query=DataAccessHelperBase.buildSqlGeneralGetEntitiesJDBC(queryWhereSelectParameters,strSelectQuery);
        	 
    	} catch(Exception ex) {
            throw ex;//new Exception();
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
        	
    	}catch(Exception ex) {
            throw ex;
        }
        
        return query;
    }
	
	public  static String buildSqlGeneralGetEntities(GeneralEntitySinIdGenerated entity,String strTableName,QueryWhereSelectParameters queryWhereSelectParameters,String sQuerySelect)throws Exception {
        String query="";
        
        try {
        	query=DataAccessHelperBase.buildSqlGeneralGetEntities(strTableName,queryWhereSelectParameters,sQuerySelect);
        	
    	} catch(Exception ex) {
          throw ex;
        }
    	
        return query;
    }
	
	public  static String buildSqlGeneralGetEntitiesJDBC(GeneralEntitySinIdGenerated entity,String strTableName,QueryWhereSelectParameters queryWhereSelectParameters,String sQuerySelect)throws Exception {
        String query="";
        
        try {
        	query=DataAccessHelperBase.buildSqlGeneralGetEntitiesJDBC(strTableName,queryWhereSelectParameters,sQuerySelect);
        	
    	} catch(Exception ex) {
          throw ex;
        }
    	
        return query;
    }
	
	public  static String buildSqlGeneralGetEntities(GeneralEntitySinIdGenerated entity,QueryWhereSelectParameters queryWhereSelectParameters,String querySelect,String query)throws Exception {
		//String query="";		 
        try {      	
        	query=DataAccessHelperBase.buildSqlGeneralGetEntities(queryWhereSelectParameters,querySelect,query);
        	
    	}  catch(Exception ex) {
          throw ex;//new Exception();
    	}
    	
        return query;
    }
	
	public  static String buildSqlGeneralGetEntitiesSimpleQueryBuild(QueryWhereSelectParameters queryWhereSelectParameters,String strSelectQuery)throws SQLException,Exception {
        String query="";
        
        try  {      	
        	query=DataAccessHelperBase.buildSqlGeneralGetEntitiesSimpleQueryBuild(queryWhereSelectParameters,strSelectQuery);
        	
    	} catch(Exception ex) {
            throw ex;//new Exception();
        }
        
        return query;
    }
	
	public  static String buildSqlGeneralGetEntitiesSimpleQueryBuildJDBC(QueryWhereSelectParameters queryWhereSelectParameters,String strSelectQuery)throws SQLException,Exception {
        String query="";
        
        try  {        	
        	query=DataAccessHelperBase.buildSqlGeneralGetEntitiesSimpleQueryBuildJDBC(queryWhereSelectParameters,strSelectQuery);
        	
    	} catch(Exception ex) {
            throw ex;//new Exception();
        }
        
        return query;
    }
	
	public  static void buildSqlGeneralSetQueryParameters(Query query,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {
        try {
        	queryWhereSelectParameters.buildSqlGeneralSetQueryParameters(query,queryWhereSelectParameters.getParametersSelectionGeneral());
        	
    	} catch(Exception ex) {
          throw ex;//new Exception();
        }   	
     }
	
	public  static void buildSqlGeneralSetQueryPagination(Query query,QueryWhereSelectParameters queryWhereSelectParameters)throws Exception {
        try {       	
        	DataAccessHelperBase.buildSqlGeneralSetQueryPagination(query,queryWhereSelectParameters);
        	
    	} catch(Exception ex) {
          throw ex;//new Exception();
        }   	
    }
	
	public  static Boolean ejecutarSql(String sql,Connexion con)throws Exception {
        Boolean  ejecutado= true;
        
        try {
        	ejecutado=DataAccessHelperBase.ejecutarSql(sql,con);
    	} catch(Exception ex) {
          throw ex;//new Exception();
    	}
    	
        return !ejecutado;
    }
	
	public  static Boolean ejecutarStoreProcedure(String sql,Connexion con)throws Exception {
        Boolean  ejecutado= false;
        
        try {
        	ejecutado=DataAccessHelperBase.ejecutarStoreProcedure(sql,con);
    	} catch(Exception ex) {
            throw ex;//new Exception();
        }
        
        return !ejecutado;
    }
	
	public  static Integer ejecutarStoreProcedureConOupPutResultado(String sql,Connexion con)throws Exception {
        Integer  intResultado= -1;
        
        try {
        	intResultado=DataAccessHelperBase.ejecutarStoreProcedureConOupPutResultado(sql,con);
        	
    	}  catch(Exception ex) {
            throw ex;//new Exception();
        }
        
        return intResultado;
    }
	
	//ParametersMaintenance parametersMaintenance,
	public static void save(GeneralEntitySinIdGenerated entity,Connexion con,String sQuerySave,String sTableName,Boolean isWithStoreProcedures)throws Exception {		
		 try {
			 DataAccessHelperSinIdGenerated.save(entity,con,null,sQuerySave,sTableName,isWithStoreProcedures);
			 
		 } catch(Exception ex) {
	        throw ex;
	    } finally {
		 }
	}
	
	public static void save(GeneralEntitySinIdGenerated entity,Connexion con,ParametersMaintenance parametersMaintenance,String sQuerySave,String sTableName,Boolean isWithStoreProcedures)throws SQLException,Exception {		
		 try {		
				 if(entity==null) {
					 return;
				 }
				 
				 if (entity.getIsDeleted()) {
					 //if (entity.getIsExpired()) {
						 //entity.buildParametersMaintenance(con.getDbType(),ParametersType.DELETE);
				 			
						 delete(entity,con,sQuerySave);
						 
						//MANTIENE ESTADO ISDELETE HASTA REALIZAR ALGUN PROCESO LUEGO DE HABER ELIMINADO (CAMBIAR DE ESTADO MANUALMENTE)(AUNQUE SI SE MANTIENE ESTADO TALVEZ ESTA POR DEMAS)
			             entity.setIsDeletedAuxiliar(true);	
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
		            	 insert( entity,con,parametersMaintenance,sQuerySave);
		                 entity.setIsNew(false);
		                 
		                 //MANTENER ESTADO ISNEW HASTA REALIZAR ALGUN PROCESO LUEGO DE HABER INGRESADO UNO NUEVO (CAMBIAR DE ESTADO MANUALMENTE)
			             entity.setIsNewAuxiliar(true);		
			             
		             } else {
		            	 //entity.buildParametersMaintenance(con.getDbType(),ParametersType.UPDATE);
		      			 //parametersMaintenance,
		                 update(entity,con,parametersMaintenance,sQuerySave);
		                 
		                		           
		             }
		             
		             //MANTENER ESTADO ISCHANGED HASTA OBTENER EL VERSIONROW
		             entity.setIsChangedAuxiliar(true);	
		             
		             entity.setIsChanged(false);
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
	
	private static void deleteJdbc(GeneralEntitySinIdGenerated entity,Connexion con,String sQueryDelete)throws Exception {      
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
        } catch(Exception ex) {
            throw ex;//new Exception();
        } finally {
            if (pstmt != null) {
            	pstmt.close();
            }
         }      
    }
	
	private static void insertJdbc(GeneralEntitySinIdGenerated entity,Connexion con,ParametersMaintenance parametersMaintenance,String sQueryInsert)  throws Exception {

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
	    		} else {
	    			Funciones2.writeQueryFile(pstmt);
	    		}
	    		
	    		
	    		//entity.setParametersMaintenance(new ParametersMaintenance());
	    		//entity.setOrder(1);
	    		
	    		//ID ES ASIGNADO
	    		/*
	    		pstmt = con.getConnection().prepareStatement("select LAST_INSERT_ID();");
	    		ResultSet rs =pstmt.executeQuery();
	    		
	    		   
	       	    while (rs.next()) {	       		
	       	    	id=rs.getLong("LAST_INSERT_ID()");      	    	
	       	    }
	       	    
	    		
	       	    entity.setId(id);
	       	    */
	    		
    		} catch(Exception ex) {
                throw ex;//new Exception();
            } finally {
            	if (pstmt != null) {
            		pstmt.close();
            	}
    		}  		
    }
    
	private static void updateJdbc(GeneralEntitySinIdGenerated entity,Connexion con,ParametersMaintenance parametersMaintenance,String sQueryUpdate)  throws Exception {
		PreparedStatement pstmt = null;
		Integer numeroRegistroModificado=0;
		
		try {
		
			pstmt = con.getConnection().prepareStatement(sQueryUpdate);
			
			String sValues="";
			
			for(ParameterMaintenance parameter:parametersMaintenance.getParametersMaintenance()) {
				sValues+=","+parameter.getParameterMaintenanceValue().getValueObject();
				
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
				
				System.out.println("Query2="+pstmt);
				
				if(numeroRegistroModificado.equals(0)) {
					throw new SQLException("No se actualizo los datos,intentelo nuevamente");		
				}
				
			} else {
				Funciones2.writeQueryFile(pstmt);
			}
			//entity.setParametersMaintenance(new ParametersMaintenance());
			//entity.setOrder(1);	
		} catch(Exception ex) {
	        throw ex;
	    } finally {
	    	if (pstmt != null) {
	    		pstmt.close();
	    	}
		}
	}
	
	private static void insert(GeneralEntitySinIdGenerated entity,Connexion con,String sQueryInsert)  throws Exception {	
		try {
			if(!con.getConnexionType().equals(ConnexionType.JDBC32)) {
				DataAccessHelperSinIdGenerated.insert(entity,con,null,sQueryInsert);
			}			
		} catch(Exception ex) {
	        throw ex;
	    } 
	}
	
	private static void insert(GeneralEntitySinIdGenerated entity,Connexion con,ParametersMaintenance parametersMaintenance,String sQueryInsert)  throws Exception {	
		try {
			if(con.getConnexionType().equals(ConnexionType.JDBC32)) {
				DataAccessHelperSinIdGenerated.insertJdbc(entity,con,parametersMaintenance,sQueryInsert);	
			} else {
				DataAccessHelperSinIdGenerated.insertHibernate(entity,con,sQueryInsert);
			}
		} catch(Exception ex) {
	        throw ex;
	    } 
	}
	
	private static void insertHibernate(GeneralEntitySinIdGenerated entity,Connexion con,String sQueryInsert)  throws SQLException,Exception {
		Integer numeroRegistroModificado=0;
		Long id=0L;
		
		try {
			
			//ANTES BIEN
			//con.getEntityManager().persist(entity);
			
			//SOLO VER
			
			if(con.getEntityManager().contains(entity)) {
				con.getEntityManager().persist(entity);
			} else {
				GeneralEntitySinIdGenerated generalEntityPersist=con.getEntityManager().merge(entity);
				//PARA MYSQL
				Timestamp ts =null;
				
				//if(Constantes.ISDEVELOPING) {
					//ts = new java.sql.Timestamp(generalEntityPersist.versionRow.getYear(),generalEntityPersist.versionRow.getMonth(),generalEntityPersist.versionRow.getDay(),generalEntityPersist.versionRow.getHours(),generalEntityPersist.versionRow.getMinutes(),generalEntityPersist.versionRow.getSeconds(),0);
					ts = new java.sql.Timestamp(generalEntityPersist.versionRow.getTime());
				//}
				
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
	
	private static void update(GeneralEntitySinIdGenerated entity,Connexion con,String sQueryUpdate)  throws Exception {
		Integer numeroRegistroModificado=0;
		
		try {
			if(!con.getConnexionType().equals(ConnexionType.JDBC32)) {
				DataAccessHelperSinIdGenerated.update(entity,con,null,sQueryUpdate);
			}		
		} catch(Exception ex) {
	        throw ex;
	    } 
	}
	
	private static void update(GeneralEntitySinIdGenerated entity,Connexion con,ParametersMaintenance parametersMaintenance,String sQueryUpdate)  throws Exception {		
		try {
			if(con.getConnexionType().equals(ConnexionType.JDBC32)) {
				DataAccessHelperSinIdGenerated.updateJdbc(entity,con,parametersMaintenance,sQueryUpdate);	
			} else {
				DataAccessHelperSinIdGenerated.updateHibernate(entity,con,sQueryUpdate);
			}
		} catch(Exception ex) {
	        throw ex;
	    } 
	}
	
	private static void updateHibernate(GeneralEntitySinIdGenerated entity,Connexion con,String sQueryUpdate)  throws Exception {
		Integer numeroRegistroModificado=0;
		
		try {
			
			//entity.setVersionRow(new Date());
			
			/*
			GeneralEntitySinIdGenerated generalEntityPersist=con.getEntityManager().merge(entity);
			
			entity=generalEntityPersist;
			*/
			
			//CREO TA BIEN
			
			if(con.getEntityManager().contains(entity)) {
				con.getEntityManager().persist(entity);
				
			} else {
				//CAMINO 1
				GeneralEntitySinIdGenerated generalEntityPersist=con.getEntityManager().merge(entity);
				
				con.getEntityManager().persist(generalEntityPersist);
								
				entity=generalEntityPersist;
								
				//CAMINO 2
				/*
				GeneralEntitySinIdGenerated generalEntityPersist=con.getEntityManager().merge(entity);
con.			getEntityManager().persist(generalEntityPersist);
				
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
				
				GeneralEntitySinIdGenerated generalEntityPersist=con.getEntityManager().merge(entity);
				
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
	        
	private static void delete(GeneralEntitySinIdGenerated entity,Connexion con,String sQueryDelete)throws SQLException,Exception {      		 
		   try {
			   
			   if(con.getConnexionType().equals(ConnexionType.JDBC32)) {
				   DataAccessHelperSinIdGenerated.deleteJdbc(entity,con,sQueryDelete);
					
				} else {
					DataAccessHelperSinIdGenerated.deleteHibernate(entity,con,sQueryDelete);
				}   			                    
			     } catch(Exception ex) {
			    	 throw ex;
			         //throw new Exception();
			     } finally {
			         
			     }      
	}
	
	private static void deleteHibernate(GeneralEntitySinIdGenerated entity,Connexion con,String sQueryDelete)throws SQLException,Exception {      
		   Integer numeroRegistroModificado=0;
  
		   try {
			   
			   if(con.getEntityManager().contains(entity)) {
				   con.getEntityManager().remove(entity);
					
				} else {
					GeneralEntitySinIdGenerated generalEntityPersist=con.getEntityManager().merge(entity);
					
					entity=generalEntityPersist;
					
					 con.getEntityManager().remove(entity);
				}
			   
			  
			   
			   // SOLO VER
			   /*
			   if(con.getEntityManager().contains(entity)) {
				   con.getEntityManager().remove(entity);
			   } else {
					GeneralEntitySinIdGenerated generalEntityPersist=con.getEntityManager().merge(entity);
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
      	    	ResultSet rs = stmt.executeQuery(sQuerySelect+ " "+ConstantesSql.WHERE+" "+DataAccessHelperSinIdGenerated.getColumnNameId()+ "="+id);
      	   
      	    	while (rs.next()) {      		
      	    	entityT=getEntity("",extracted(entityT),rs,isWithSchema);
      	    	
      	    	}

      	    	stmt.close();
      	    	con.getConnection().close();
      		} catch(Exception ex) {
	            throw ex;//new Exception();
	        }
	      	
          return extracted(entityT);
      }

	private T extracted(T entityT) {
		return entityT;
	}
	  
	public  ArrayList<T> getEntities(GeneralEntitySinIdGenerated entity,QueryWhereSelectParameters queryWhereSelectParameters,Connexion con, int id,String sQuerySelect,Boolean isWithSchema) throws Exception
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
            throw ex;//new Exception();
        }
        return entitiesT;
    }
	  
	public  T getEntity(String strPrefijo,T entityT,ResultSet rs,Boolean isWithSchema) throws Exception {	 
		  extracted(entityT).setIsNew(false);
          
		  try {
      	  
        	  if(isWithSchema) {
      	    	extracted(entityT).setId(rs.getLong(strPrefijo+DataAccessHelperSinIdGenerated.getColumnNameId()));	
      	    	extracted(entityT).setIdOriginal(rs.getLong(strPrefijo+DataAccessHelperSinIdGenerated.getColumnNameId()));
      	    	//extracted(entityT).setIsActive(rs.getBoolean(strPrefijo+DataAccessHelper.getColumnNameIsActive()));
      	    	//extracted(entityT).setIsExpired(rs.getBoolean(strPrefijo+DataAccessHelper.getColumnNameIsExpired()));
      	    	extracted(entityT).setVersionRow(rs.getTimestamp(strPrefijo+DataAccessHelperSinIdGenerated.getColumnNameVersionRow()));     	    	       	 
        	  }
	      	} catch(Exception ex) {
	            throw ex;//new Exception();
	        }
	      	
          return extracted(entityT);
    }
	
	public  T getEntity(T entityT) throws SQLException,Exception {	 		 
		  try {
    	  
			  extracted(entityT).setIsNew(false);
		        
	      	}catch(Exception ex) {
	            throw ex;//new Exception();
	        }
	      	
        return extracted(entityT);
  }
	
	public  void SetGeneralEntityIsNewFalse(T GeneralEntitySinIdGenerated)throws Exception  {		
		GeneralEntitySinIdGenerated.setIsNew(false);		
	}

	public  void SetGeneralEntityIsNewFalseIsChangedFalse(T GeneralEntitySinIdGenerated)throws Exception  {		
		GeneralEntitySinIdGenerated.setIsNew(false);
		GeneralEntitySinIdGenerated.setIsChanged(false);
	}

	public  void SetGeneralEntitiesIsNewFalse(List<T> generalEntities)throws Exception  {		
		for(T GeneralEntitySinIdGenerated:generalEntities){
			GeneralEntitySinIdGenerated.setIsNew(false);
		}
	}
	
	public  void SetGeneralEntitiesIsNewFalseIsChangedFalse(List<T> generalEntities)throws Exception  {		
		for(T GeneralEntitySinIdGenerated:generalEntities){
			GeneralEntitySinIdGenerated.setIsNew(false);
			GeneralEntitySinIdGenerated.setIsChanged(false);
		}
	}

	public void SetGeneralEntityOriginal(T GeneralEntitySinIdGenerated)throws Exception  {
		GeneralEntitySinIdGenerated.setGeneralEntityOriginal(GeneralEntitySinIdGenerated);		
	}
	
	public void SetGeneralEntitiesOriginal(List<T> generalEntities)throws Exception  {		
		for(T GeneralEntitySinIdGenerated:generalEntities){
			GeneralEntitySinIdGenerated.setGeneralEntityOriginal(GeneralEntitySinIdGenerated);
		}
	}

	public  static void getGeneralEntity(String strPrefijo,GeneralEntitySinIdGenerated entityT,ResultSet rs) throws Exception {		 
		  entityT.setIsNew(false);
		  
          try {
        	  entityT.setId(rs.getLong(strPrefijo+DataAccessHelperSinIdGenerated.getColumnNameId()));	
    	      //entityT.setIsActive(rs.getBoolean(strPrefijo+DataAccessHelper.getColumnNameIsActive()));
    	     // entityT.setIsExpired(rs.getBoolean(strPrefijo+DataAccessHelper.getColumnNameIsExpired()));
    	      entityT.setVersionRow(rs.getTimestamp(strPrefijo+DataAccessHelperSinIdGenerated.getColumnNameVersionRow()));     	    	       	 
          } catch(Exception ex) {
      		  throw ex;//new Exception();
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
		            throw ex;//new Exception();
		        }
		      	
	          return entitiesT;
	      }
		  
		  public  T getEntity(T entityT,ResultSet rs) throws Exception {			 			  
	          try {	      	
	      	    	entityT.setId(rs.getInt(DataAccessHelperSinIdGenerated.getColumnNameId()));	
		      	
	          } catch(Exception ex) {
		    	  throw ex;//new Exception();
		      }
		      	
	          return entityT;
	      }		  
	}
}
	  
