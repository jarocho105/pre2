package com.bydan.framework.erp.business.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Query;

import com.bydan.framework.erp.util.ConnexionType;
import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.Funciones2;
import com.bydan.framework.erp.util.ParameterDbType;
import com.bydan.framework.erp.util.ParameterType;

public class QueryWhereSelectParameters implements Serializable {
	private static final long serialVersionUID = 1L;
	private String initialQuery;
	private String finalQuery;
	private String selectQuery;
	private boolean isAll;
	private boolean isGetGeneralObjects=false;
	private ParameterDbType dbType;
	protected ConnexionType connexionType;
	
	private	ArrayList<ParameterSelectionGeneral> parametersSelectionGeneral;
    private Pagination pagination;
    
	public QueryWhereSelectParameters(ParameterDbType newDbType,String newFinalQuery) { 
		this.initialQuery="";
		this.finalQuery=newFinalQuery;
		this.dbType=newDbType;
		this.parametersSelectionGeneral=new ArrayList<ParameterSelectionGeneral>();
		this.pagination=new Pagination();
		this.connexionType=Constantes.CONNEXIONTYPE;
		this.selectQuery="";
	}

	public QueryWhereSelectParameters(ParameterDbType newDbType,String newInitialQuery,String newFinalQuery) { 
		this.initialQuery=newInitialQuery;
		this.finalQuery=newFinalQuery;
		this.dbType=newDbType;
		this.parametersSelectionGeneral=new ArrayList<ParameterSelectionGeneral>();
		this.pagination=new Pagination();
		this.connexionType=Constantes.CONNEXIONTYPE;
		this.selectQuery="";
	}
	
	public QueryWhereSelectParameters(String newFinalQuery)	{ 
		this.initialQuery = "";
		this.finalQuery=newFinalQuery;
		this.isAll=true;		
		this.isGetGeneralObjects=false;
		this.pagination=new Pagination();
		this.dbType=Constantes.PARAMETERDBTYPE;
		this.connexionType=Constantes.CONNEXIONTYPE;
		this.selectQuery="";
	}
	
	public QueryWhereSelectParameters()	{ 
		this.initialQuery = "";
		this.finalQuery="";
		this.isAll=true;		
		this.isGetGeneralObjects=false;
		this.pagination=new Pagination();
		this.dbType=Constantes.PARAMETERDBTYPE;
		this.connexionType=Constantes.CONNEXIONTYPE;
		this.selectQuery="";
	}
	
	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public String getInitialQuery() {
		return initialQuery;
	}
	
	public void setInitialQuery(String initialQuery) {
		this.initialQuery = initialQuery;
	}
	
	public void setAll(boolean isAll) {
		this.isAll = isAll;
	}
	
	public ParameterDbType getDbType() { 
		 return dbType; 
	}
	
	public void setDbType(ParameterDbType newDbType) { 
	   dbType = newDbType; 
	}
	
	public ConnexionType getConnexionType() {
		return connexionType;
	}


	public void setConnexionType(ConnexionType connexionType) {
		this.connexionType = connexionType;
	}
	
	public boolean getIsAll() {
		return isAll;
	}
	
	public void setIsAll(boolean isAll) {
		this.isAll = isAll;
	}
	
	public boolean getIsGetGeneralObjects() {
		return isGetGeneralObjects;
	}
	
	public void setIsGetGeneralObjects(boolean isGetGeneralObjects) {
		this.isGetGeneralObjects = isGetGeneralObjects;
	}
	
	public String getFinalQuery() {
		//FINAL QUERY MAS PAGINACION
		
		return finalQuery;//+this.getPaginationFinalQuery();
	}
	
	public void setFinalQuery(String finalQuery) {
		this.finalQuery = finalQuery;
	}
	
	public String getFinalQueryJDBC() {
		//FINAL QUERY MAS PAGINACION
		
		return finalQuery+this.getPaginationFinalQuery();
	}
	
	public void setSelectQuery(String selectQuery) {
		this.selectQuery = selectQuery;
	}
	
	public String getSelectQuery() {		
		return selectQuery;
	}				
	
	public ArrayList<ParameterSelectionGeneral> getParametersSelectionGeneral() {
		return parametersSelectionGeneral;
	}
	
	public void setParametersSelectionGeneral(
			ArrayList<ParameterSelectionGeneral> parametersSelectionGeneral) {
		this.parametersSelectionGeneral = parametersSelectionGeneral;
	}
	
	public void addParameter(
			ParameterSelectionGeneral parameterSelectionGeneral) {
		this.parametersSelectionGeneral.add(parameterSelectionGeneral);
	}
	
	public String getQueryWhereSelectParameters() {
		String query="";
		
		if(!isAll){
			for(ParameterSelectionGeneral parameterSelectionGeneral:parametersSelectionGeneral) {
				parameterSelectionGeneral.setDbType(this.dbType);
				parameterSelectionGeneral.setConnexionType(this.connexionType);
				
				if(dbType.equals(ParameterDbType.MYSQL)) {				
					query+=addMYSQLParameterQuery(parameterSelectionGeneral);
					
				} else if(dbType.equals(ParameterDbType.POSTGRES)) {				
					query+=addPOSTGRESParameterQuery(parameterSelectionGeneral);
				} 
			}
		}
		
		return query;
	}
	
	public String getQueryWhereSelectParametersJDBC() {
		String query="";
		
		if(!isAll){
			for(ParameterSelectionGeneral parameterSelectionGeneral:parametersSelectionGeneral) {
				parameterSelectionGeneral.setDbType(this.dbType);
				parameterSelectionGeneral.setConnexionType(this.connexionType);
				
				if(dbType.equals(ParameterDbType.MYSQL)) {				
					query+=addMYSQLParameterQueryJDBC(parameterSelectionGeneral);
					
				} else if(dbType.equals(ParameterDbType.POSTGRES)) {				
					query+=addPOSTGRESParameterQueryJDBC(parameterSelectionGeneral);
				} 
			}
		}
		
		return query;
	}
	
	public String getPaginationFinalQuery()	{
		String strQueryPagination="";
		
		/*
		if(this.pagination!=null && this.pagination.getiFirstResult()>0 && this.pagination.getiMaxResults()>-1) {
			
			if(dbType.equals(ParameterDbType.MYSQL)) {	
				strQueryPagination=" limit "+this.pagination.getiFirstResult()+" offset "+this.pagination.getiMaxResults();
			} else if(dbType.equals(ParameterDbType.POSTGRES)) {
				strQueryPagination=" limit "+this.pagination.getiFirstResult()+" offset "+this.pagination.getiMaxResults();
			}
			*/
	
		if(this.pagination!=null && this.pagination.getiFirstResult()>-1 && this.pagination.getiMaxResults()>0) {
			if(dbType.equals(ParameterDbType.MYSQL)) {	
				strQueryPagination=" limit "+this.pagination.getiMaxResults()+" offset "+this.pagination.getiFirstResult();
			} else if(dbType.equals(ParameterDbType.POSTGRES)) {
				strQueryPagination=" limit "+this.pagination.getiMaxResults()+" offset "+this.pagination.getiFirstResult();
			}
		}
		
		return strQueryPagination;
	}
	
	public static String getPaginationFinalQuery(Pagination pagination,ParameterDbType dbType)	{
		String strQueryPagination="";
		
		/*
		if(this.pagination!=null && this.pagination.getiFirstResult()>0 && this.pagination.getiMaxResults()>-1) {
			
			if(dbType.equals(ParameterDbType.MYSQL)) {	
				strQueryPagination=" limit "+this.pagination.getiFirstResult()+" offset "+this.pagination.getiMaxResults();
			} else if(dbType.equals(ParameterDbType.POSTGRES)) {
				strQueryPagination=" limit "+this.pagination.getiFirstResult()+" offset "+this.pagination.getiMaxResults();
			}
			*/
	
		if(pagination!=null && pagination.getiFirstResult()>-1 && pagination.getiMaxResults()>0) {
			if(dbType.equals(ParameterDbType.MYSQL)) {	
				strQueryPagination=" limit "+pagination.getiMaxResults()+" offset "+pagination.getiFirstResult();
			} else if(dbType.equals(ParameterDbType.POSTGRES)) {
				strQueryPagination=" limit "+pagination.getiMaxResults()+" offset "+pagination.getiFirstResult();
			}
		}
		
		return strQueryPagination;
	}
	
	public String addMYSQLParameterQuery(ParameterSelectionGeneral parameterSelectionGeneral) {
		
		String queryParameter="";
		queryParameter+= " ("+parameterSelectionGeneral.getColumnName();
		
		if(parameterSelectionGeneral.getIsEqual()) {				
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				//queryParameter+=" = ";
				queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.MYSQL);
				queryParameter+= ":"+parameterSelectionGeneral.getParameterName();
				queryParameter+=" ) "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);
				
			}
			
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
				//queryParameter+=" like ";//'
				queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.MYSQL);
				queryParameter+= ":"+parameterSelectionGeneral.getParameterName();
				//queryParameter+="'";
				queryParameter+=" ) "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);				
			}				
		} else {
			//ESTE BLOQUE DE CODIGO NO ES UTILIZADO, SE SUPONE QUE ERA PARA REALIZAR BUSQUEDAS POR RANGOS
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.MYSQL);
				queryParameter+=":"+parameterSelectionGeneral.getParameterName()+"Initial";		
				queryParameter+=" and "+ parameterSelectionGeneral.getColumnName();
				queryParameter+=" "+parameterSelectionGeneral.getParameterFinalTypeSign(ParameterDbType.MYSQL);
				queryParameter+=":"+parameterSelectionGeneral.getParameterName()+"Final)";						
				queryParameter+=" "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);						
			}
					
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
					queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.MYSQL);
					queryParameter+=":"+parameterSelectionGeneral.getParameterName()+"Initial";//+"'";  " '"+		
					queryParameter+=" and "+ parameterSelectionGeneral.getColumnName();
					queryParameter+=" "+parameterSelectionGeneral.getParameterFinalTypeSign(ParameterDbType.MYSQL);
					queryParameter+=":"+parameterSelectionGeneral.getParameterName()+"Final)";	//"' )";	" '"+						
					queryParameter+=" "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);
					
			}
		}
		
		return parameterSelectionGeneral.getParameterInitialQuery()+" "+queryParameter+" "+parameterSelectionGeneral.getParameterFinalQuery()+" ";
	}


	public String addPOSTGRESParameterQuery(ParameterSelectionGeneral parameterSelectionGeneral) {
	
		String queryParameter="";
		queryParameter+= " ("+parameterSelectionGeneral.getColumnName();
		
		if(parameterSelectionGeneral.getIsEqual()) {				
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				//queryParameter+=" = ";
				queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.POSTGRES);
				queryParameter+= ":"+parameterSelectionGeneral.getParameterName();
				queryParameter+=" ) "+parameterSelectionGeneral.getNextOperator(ParameterDbType.POSTGRES);
				
			}
			
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
				//queryParameter+=" like ";//'
				queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.POSTGRES);
				queryParameter+= ":"+parameterSelectionGeneral.getParameterName();
				//queryParameter+="'";
				queryParameter+=" ) "+parameterSelectionGeneral.getNextOperator(ParameterDbType.POSTGRES);				
			}				
		} else {
			//ESTE BLOQUE DE CODIGO NO ES UTILIZADO, SE SUPONE QUE ERA PARA REALIZAR BUSQUEDAS POR RANGOS
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.POSTGRES);
				queryParameter+=":"+parameterSelectionGeneral.getParameterName()+"Initial";		
				queryParameter+=" and "+ parameterSelectionGeneral.getColumnName();
				queryParameter+=" "+parameterSelectionGeneral.getParameterFinalTypeSign(ParameterDbType.POSTGRES);
				queryParameter+=":"+parameterSelectionGeneral.getParameterName()+"Final)";						
				queryParameter+=" "+parameterSelectionGeneral.getNextOperator(ParameterDbType.POSTGRES);						
			}
					
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
					queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.POSTGRES);
					queryParameter+=":"+parameterSelectionGeneral.getParameterName()+"Initial";//+"'";  " '"+		
					queryParameter+=" and "+ parameterSelectionGeneral.getColumnName();
					queryParameter+=" "+parameterSelectionGeneral.getParameterFinalTypeSign(ParameterDbType.POSTGRES);
					queryParameter+=":"+parameterSelectionGeneral.getParameterName()+"Final)";	//"' )";	" '"+						
					queryParameter+=" "+parameterSelectionGeneral.getNextOperator(ParameterDbType.POSTGRES);
					
			}
		}
	
	return parameterSelectionGeneral.getParameterInitialQuery()+" "+queryParameter+" "+parameterSelectionGeneral.getParameterFinalQuery()+" ";
}

//REFERENCIA
/*
public String addMYSQLParameterQuery(ParameterSelectionGeneral parameterSelectionGeneral) {
		
		String queryParameter="";
		queryParameter+= " ("+parameterSelectionGeneral.getColumnName();
		
		if(parameterSelectionGeneral.getIsEqual()) {				
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				queryParameter+=" = ";
				queryParameter+= parameterSelectionGeneral.getParameterInitialValue();
				queryParameter+=" ) "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);
				
			}
			
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
				queryParameter+=" like '";
				queryParameter+= parameterSelectionGeneral.getParameterInitialValue();
				queryParameter+="'";
				queryParameter+=" ) "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);				
			}				
		} else {
			
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.MYSQL);
				queryParameter+=" "+parameterSelectionGeneral.getParameterInitialValue();		
				queryParameter+=" and "+ parameterSelectionGeneral.getColumnName();
				queryParameter+=" "+parameterSelectionGeneral.getParameterFinalTypeSign(ParameterDbType.MYSQL);
				queryParameter+=" "+parameterSelectionGeneral.getParameterFinalValue()+" )";						
				queryParameter+=" "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);						
			}
					
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
					queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.MYSQL);
					queryParameter+=" '"+parameterSelectionGeneral.getParameterInitialValue()+"'";		
					queryParameter+=" and "+ parameterSelectionGeneral.getColumnName();
					queryParameter+=" "+parameterSelectionGeneral.getParameterFinalTypeSign(ParameterDbType.MYSQL);
					queryParameter+=" '"+parameterSelectionGeneral.getParameterFinalValue()+"' )";							
					queryParameter+=" "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);
					
			}
		}
		
		return parameterSelectionGeneral.getParameterInitialQuery()+" "+queryParameter+" "+parameterSelectionGeneral.getParameterFinalQuery()+" ";
	} 
*/
	
public String addMYSQLParameterQueryJDBC(ParameterSelectionGeneral parameterSelectionGeneral) {
		
		String queryParameter="";
		queryParameter+= " ("+parameterSelectionGeneral.getColumnName();
		
		if(parameterSelectionGeneral.getIsEqual()) {				
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				//queryParameter+=" = ";
				queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.MYSQL);
				queryParameter+= parameterSelectionGeneral.getParameterInitialValue();
				queryParameter+=" ) "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);
				
			}
			
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
				//queryParameter+=" like ";//'
				queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.MYSQL);
				queryParameter+="'";
				queryParameter+= parameterSelectionGeneral.getParameterInitialValue();
				queryParameter+="'";
				queryParameter+=" ) "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);				
			}				
		} else {
			//ESTE BLOQUE DE CODIGO NO ES UTILIZADO, SE SUPONE QUE ERA PARA REALIZAR BUSQUEDAS POR RANGOS
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.MYSQL);
				queryParameter+=parameterSelectionGeneral.getParameterInitialValue();		
				queryParameter+=" and "+ parameterSelectionGeneral.getColumnName();
				queryParameter+=" "+parameterSelectionGeneral.getParameterFinalTypeSign(ParameterDbType.MYSQL);
				queryParameter+=parameterSelectionGeneral.getParameterFinalValue()+")";						
				queryParameter+=" "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);						
			}
					
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
					queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.MYSQL);
					queryParameter+="'";
					queryParameter+=parameterSelectionGeneral.getParameterInitialValue()+"";//+"'";  " '"+
					queryParameter+="'";
					queryParameter+=" and "+ parameterSelectionGeneral.getColumnName();
					queryParameter+=" "+parameterSelectionGeneral.getParameterFinalTypeSign(ParameterDbType.MYSQL);
					queryParameter+="'";
					queryParameter+=parameterSelectionGeneral.getParameterFinalValue();
					queryParameter+="')";	//"' )";	" '"+						
					queryParameter+=" "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);
					
			}
		}
		
		return parameterSelectionGeneral.getParameterInitialQuery()+" "+queryParameter+" "+parameterSelectionGeneral.getParameterFinalQuery()+" ";
	}


	public String addPOSTGRESParameterQueryJDBC(ParameterSelectionGeneral parameterSelectionGeneral) {
	
		String queryParameter="";
		queryParameter+= " ("+parameterSelectionGeneral.getColumnName();
		
		if(parameterSelectionGeneral.getIsEqual()) {				
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				this.getUpdatePOSTGRESValueParameterJDBC(parameterSelectionGeneral);
				
				//queryParameter+=" = ";
				queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.POSTGRES);
				queryParameter+= parameterSelectionGeneral.getParameterInitialValue();
				queryParameter+=" ) "+parameterSelectionGeneral.getNextOperator(ParameterDbType.POSTGRES);
				
			}
			
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
				//queryParameter+=" like ";//'
				this.getUpdatePOSTGRESValueParameterJDBC(parameterSelectionGeneral);
				
				queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.POSTGRES);
				queryParameter+="'";
				queryParameter+= parameterSelectionGeneral.getParameterInitialValue();
				queryParameter+="'";
				queryParameter+=" ) "+parameterSelectionGeneral.getNextOperator(ParameterDbType.POSTGRES);				
			}				
		} else {
			//ESTE BLOQUE DE CODIGO NO ES UTILIZADO, SE SUPONE QUE ERA PARA REALIZAR BUSQUEDAS POR RANGOS
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				this.getUpdatePOSTGRESValueParameterJDBC(parameterSelectionGeneral);
				
				queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.POSTGRES);
				queryParameter+=parameterSelectionGeneral.getParameterInitialValue();		
				queryParameter+=" and "+ parameterSelectionGeneral.getColumnName();
				queryParameter+=" "+parameterSelectionGeneral.getParameterFinalTypeSign(ParameterDbType.POSTGRES);
				queryParameter+=parameterSelectionGeneral.getParameterFinalValue()+")";						
				queryParameter+=" "+parameterSelectionGeneral.getNextOperator(ParameterDbType.POSTGRES);						
			}
					
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
					this.getUpdatePOSTGRESValueParameterJDBC(parameterSelectionGeneral);
				
					queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.POSTGRES);
					queryParameter+="'";
					queryParameter+=parameterSelectionGeneral.getParameterInitialValue()+"";//+"'";  " '"+
					queryParameter+="'";
					queryParameter+=" and "+ parameterSelectionGeneral.getColumnName();
					queryParameter+=" "+parameterSelectionGeneral.getParameterFinalTypeSign(ParameterDbType.POSTGRES);
					queryParameter+="'";
					queryParameter+=parameterSelectionGeneral.getParameterFinalValue();
					queryParameter+="')";	//"' )";	" '"+						
					queryParameter+=" "+parameterSelectionGeneral.getNextOperator(ParameterDbType.POSTGRES);
					
			}
		}
		
		return parameterSelectionGeneral.getParameterInitialQuery()+" "+queryParameter+" "+parameterSelectionGeneral.getParameterFinalQuery()+" ";
}

	public void getUpdatePOSTGRESValueParameterJDBC(ParameterSelectionGeneral parameterSelectionGeneral) {
		if(parameterSelectionGeneral.getIsEqual()) {
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)) {
				Date dateValue=(Date)parameterSelectionGeneral.getParameterInitialValue();
				String sDateValue="'"+Funciones2.getStringPostgresDate(dateValue)+"'";
				
				parameterSelectionGeneral.setParameterInitialValue(sDateValue);
			}
		} else {
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)) {
				Date dateValue=new Date();
				String sDateValue="";
				
				//INITIAL
				dateValue=(Date)parameterSelectionGeneral.getParameterInitialValue();
				sDateValue="'"+Funciones2.getStringPostgresDate(dateValue)+"'";
				
				parameterSelectionGeneral.setParameterInitialValue(sDateValue);
				
				//FINAL
				dateValue=(Date)parameterSelectionGeneral.getParameterFinalValue();
				sDateValue="'"+Funciones2.getStringPostgresDate(dateValue)+"'";
				
				parameterSelectionGeneral.setParameterFinalValue(sDateValue);
			}
		}
	}
	
	public void buildSqlGeneralSetQueryParameters(Query query,ArrayList<ParameterSelectionGeneral> parametersSelectionGeneral) {	
		if(!isAll){
			for(ParameterSelectionGeneral parameterSelectionGeneral:parametersSelectionGeneral) {
				if(dbType.equals(ParameterDbType.MYSQL)) {				
					addQueryParameterMYSQL(query,parameterSelectionGeneral);
					
				} else if(dbType.equals(ParameterDbType.POSTGRES)) {				
					addQueryParameterPOSTGRES(query,parameterSelectionGeneral);
				}
			}
		}
	}
	
	public void addQueryParameterMYSQL(Query query,ParameterSelectionGeneral parameterSelectionGeneral) {		
		if(parameterSelectionGeneral.getIsEqual()) {				
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				query.setParameter(parameterSelectionGeneral.getParameterName(), parameterSelectionGeneral.getParameterInitialValue());
						
			}
			
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
				query.setParameter(parameterSelectionGeneral.getParameterName(), parameterSelectionGeneral.getParameterInitialValue());
							}				
		} else {
			
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				query.setParameter(parameterSelectionGeneral.getParameterName()+"Initial", parameterSelectionGeneral.getParameterInitialValue());
				query.setParameter(parameterSelectionGeneral.getParameterName()+"Final", parameterSelectionGeneral.getParameterInitialValue());
			}
					
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
				query.setParameter(parameterSelectionGeneral.getParameterName()+"Initial", parameterSelectionGeneral.getParameterInitialValue());
				query.setParameter(parameterSelectionGeneral.getParameterName()+"Final", parameterSelectionGeneral.getParameterInitialValue());
					
			}
		}
		
	}

	public void addQueryParameterPOSTGRES(Query query,ParameterSelectionGeneral parameterSelectionGeneral) {		
		if(parameterSelectionGeneral.getIsEqual()) {				
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				query.setParameter(parameterSelectionGeneral.getParameterName(), parameterSelectionGeneral.getParameterInitialValue());
						
			}
			
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
				query.setParameter(parameterSelectionGeneral.getParameterName(), parameterSelectionGeneral.getParameterInitialValue());
							}				
		} else {
			
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				query.setParameter(parameterSelectionGeneral.getParameterName()+"Initial", parameterSelectionGeneral.getParameterInitialValue());
				query.setParameter(parameterSelectionGeneral.getParameterName()+"Final", parameterSelectionGeneral.getParameterInitialValue());
			}
					
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
				query.setParameter(parameterSelectionGeneral.getParameterName()+"Initial", parameterSelectionGeneral.getParameterInitialValue());
				query.setParameter(parameterSelectionGeneral.getParameterName()+"Final", parameterSelectionGeneral.getParameterInitialValue());
					
			}
		}	
	}
	
	/*
	public String addMYSQLParameterQuery(ParameterSelectionGeneral parameterSelectionGeneral) {
		
		String queryParameter="";
		queryParameter+= " ("+parameterSelectionGeneral.getColumnName();
		
		if(parameterSelectionGeneral.getIsEqual()) {				
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
			   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				queryParameter+=" = ";
				queryParameter+= parameterSelectionGeneral.getParameterInitialValue();
				queryParameter+=" ) "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);
				
			}
			
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
				queryParameter+=" like '";
				queryParameter+= parameterSelectionGeneral.getParameterInitialValue();
				queryParameter+="'";
				queryParameter+=" ) "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);				
			}				
		} else {
			
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.BIGDECIMAL)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.FLOAT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DOUBLE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.BOOLEAN)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.DATE)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.INT)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.LONG)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIME)||
					   parameterSelectionGeneral.getParameterType().equals(ParameterType.TIMESTAMP))
			{
				queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.MYSQL);
				queryParameter+=" "+parameterSelectionGeneral.getParameterInitialValue();		
				queryParameter+=" and "+ parameterSelectionGeneral.getColumnName();
				queryParameter+=" "+parameterSelectionGeneral.getParameterFinalTypeSign(ParameterDbType.MYSQL);
				queryParameter+=" "+parameterSelectionGeneral.getParameterFinalValue()+" )";						
				queryParameter+=" "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);						
			}
					
			if(parameterSelectionGeneral.getParameterType().equals(ParameterType.STRING)) {
					queryParameter+=parameterSelectionGeneral.getParameterInitialTypeSign(ParameterDbType.MYSQL);
					queryParameter+=" '"+parameterSelectionGeneral.getParameterInitialValue()+"'";		
					queryParameter+=" and "+ parameterSelectionGeneral.getColumnName();
					queryParameter+=" "+parameterSelectionGeneral.getParameterFinalTypeSign(ParameterDbType.MYSQL);
					queryParameter+=" '"+parameterSelectionGeneral.getParameterFinalValue()+"' )";							
					queryParameter+=" "+parameterSelectionGeneral.getNextOperator(ParameterDbType.MYSQL);
					
			}
		}
		
		return parameterSelectionGeneral.getParameterInitialQuery()+" "+queryParameter+" "+parameterSelectionGeneral.getParameterFinalQuery()+" ";
	}
	*/
}
