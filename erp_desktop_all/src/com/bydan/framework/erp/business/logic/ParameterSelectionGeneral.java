package com.bydan.framework.erp.business.logic;

import com.bydan.framework.erp.util.ConnexionType;
import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.ParameterDbType;
import com.bydan.framework.erp.util.ParameterType;
import com.bydan.framework.erp.util.ParameterTypeOperator;
import com.bydan.framework.erp.util.ParameterTypeSign;

public class ParameterSelectionGeneral {	
	 private ParameterType parameterType;
	 private Object parameterInitialValue;
	 private Object parameterFinalValue;
	 private String parameterInitialQuery;
	 private String parameterFinalQuery;

	 private ParameterTypeSign parameterInitialTypeSign;
	 private ParameterTypeSign parameterFinalTypeSign;
	 
	 private String columnName;
	 private String parameterName;
	 private ParameterTypeOperator nextOperator;
	 private boolean isEqual;
	 
	 protected ConnexionType connexionType;
	 private ParameterDbType dbType;
	 
	 public ParameterSelectionGeneral()	{
		 this.dbType=Constantes.PARAMETERDBTYPE;
		 this.connexionType=Constantes.CONNEXIONTYPE;
	 }
	 
	 public ParameterSelectionGeneral(ParameterType newParameterType,String newColumnName,
			 ParameterTypeSign newParameterInitialTypeSign,Object newParameterInitialValue,
			 ParameterTypeSign newParameterFinalTypeSign,Object newParameterFinalValue,ParameterTypeOperator newNextOperator)
	 {
		 this.parameterType=newParameterType;
		 this.parameterInitialValue=newParameterInitialValue;
		 this.parameterFinalValue=newParameterFinalValue;
		 this.parameterInitialTypeSign=newParameterInitialTypeSign;
		 this.parameterFinalTypeSign=newParameterFinalTypeSign;
		 
		 this.columnName=newColumnName;
		 this.parameterName=newColumnName;
		 this.parameterName=this.parameterName.replace(".","_");
		 this.nextOperator=newNextOperator;
		 this.isEqual=false;
		 
		 this.dbType=Constantes.PARAMETERDBTYPE;
		 this.connexionType=Constantes.CONNEXIONTYPE;
	  }
	 
	  public void setParameterSelectionGeneral(ParameterType newParameterType,String newColumnName,
			 ParameterTypeSign newParameterInitialTypeSign,Object newParameterInitialValue,
			 ParameterTypeSign newParameterFinalTypeSign,Object newParameterFinalValue,ParameterTypeOperator newNextOperator)
	  {
		  this.parameterType=newParameterType;
		  this.parameterInitialValue=newParameterInitialValue;
		  this.parameterFinalValue=newParameterFinalValue;
		  this.parameterInitialTypeSign=newParameterInitialTypeSign;
		  parameterFinalTypeSign=newParameterFinalTypeSign;
		 
		  this.columnName=newColumnName;
		  this.parameterName=newColumnName;
		  this.parameterName=this.parameterName.replace(".","_");
		  this.nextOperator=newNextOperator;
		  this.isEqual=false;
		  
		  this.dbType=Constantes.PARAMETERDBTYPE;
		  this.connexionType=Constantes.CONNEXIONTYPE;
		}
	  
	  	public ParameterSelectionGeneral(ParameterType newParameterType,
	  			Object newParameterInitialValue,String newColumnName,ParameterTypeOperator newNextOperator)
		{
	  		this.parameterType=newParameterType;
	  		this.parameterInitialValue=newParameterInitialValue;
	  		this.parameterInitialTypeSign=ParameterTypeSign.IGUAL;				 
	  		this.columnName=newColumnName;
	  		 this.parameterName=newColumnName;
	  		this.parameterName=this.parameterName.replace(".","_");
	  		this.nextOperator=newNextOperator;
	  		this.isEqual=true;	
	  		
	  		this.dbType=Constantes.PARAMETERDBTYPE;
			this.connexionType=Constantes.CONNEXIONTYPE;
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
		
	  	public void setParameterSelectionGeneralEqual(ParameterType newParameterType,
	  			Object newParameterInitialValue,String newColumnName,ParameterTypeOperator newNextOperator,String newParameterInitialQuery,String newParameterFinalQuery) 
	  	{
			
	  		this.parameterType=newParameterType;
	  		this.parameterInitialValue=newParameterInitialValue;
	  		this.parameterInitialTypeSign=ParameterTypeSign.IGUAL;				 
	  		this.columnName=newColumnName;
	  		 this.parameterName=newColumnName;
	  		this.parameterName=this.parameterName.replace(".","_");
	  		this.nextOperator=newNextOperator;
	  		this.isEqual=true;	
	  		this.parameterInitialQuery=newParameterInitialQuery;
	  		this.parameterFinalQuery=newParameterFinalQuery;
		}
	 
	  	public void setParameterSelectionGeneralLike(ParameterType newParameterType,
	  			Object newParameterInitialValue,String newColumnName,ParameterTypeOperator newNextOperator,String newParameterInitialQuery,String newParameterFinalQuery) 
	  	{
			
	  		this.parameterType=newParameterType;
	  		this.parameterInitialValue=newParameterInitialValue;
	  		this.parameterInitialTypeSign=ParameterTypeSign.LIKE;				 
	  		this.columnName=newColumnName;
	  		this.parameterName=newColumnName;
	  		this.parameterName=this.parameterName.replace(".","_");
	  		this.nextOperator=newNextOperator;
	  		this.isEqual=true;	
	  		this.parameterInitialQuery=newParameterInitialQuery;
	  		this.parameterFinalQuery=newParameterFinalQuery;
		}
	  	
	  	public void setParameterSelectionGeneralEqual(ParameterType newParameterType,
	  			Object newParameterInitialValue,String newColumnName,ParameterTypeOperator newNextOperator) 
	  	{	
	  		this.parameterType=newParameterType;
	  		this.parameterInitialValue=newParameterInitialValue;
	  		this.parameterInitialTypeSign=ParameterTypeSign.IGUAL;				 
	  		this.columnName=newColumnName;
	  		this.parameterName=newColumnName;
	  		this.parameterName=this.parameterName.replace(".","_");
	  		this.nextOperator=newNextOperator;
	  		this.isEqual=true;
	  		this.parameterInitialQuery="";
	  		this.parameterFinalQuery="";
			
		}
	 
	  	public void setParameterSelectionGeneralLike(ParameterType newParameterType,
	  			Object newParameterInitialValue,String newColumnName,ParameterTypeOperator newNextOperator) 
	  	{	
	  		this.parameterType=newParameterType;
	  		this.parameterInitialValue=newParameterInitialValue;
	  		this.parameterInitialTypeSign=ParameterTypeSign.LIKE;				 
	  		this.columnName=newColumnName;
	  		this.parameterName=newColumnName;
	  		this.parameterName=this.parameterName.replace(".","_");
	  		this.nextOperator=newNextOperator;
	  		this.isEqual=true;
	  		this.parameterInitialQuery="";
	  		this.parameterFinalQuery="";
			
		}
	  	
	  	public void setParameterSelectionGeneralMayor(ParameterType newParameterType,
	  			Object newParameterInitialValue,String newColumnName,ParameterTypeOperator newNextOperator) 
	  	{
			
	  		this.parameterType=newParameterType;
	  		this.parameterInitialValue=newParameterInitialValue;
	  		this.parameterInitialTypeSign=ParameterTypeSign.MAYOR;				 
	  		this.columnName=newColumnName;
	  		this.parameterName=newColumnName;
	  		this.parameterName=this.parameterName.replace(".","_");
	  		this.nextOperator=newNextOperator;
	  		this.isEqual=true;		
		}
	 
	  	public void setParameterSelectionGeneralMayorIgual(ParameterType newParameterType,
	  			Object newParameterInitialValue,String newColumnName,ParameterTypeOperator newNextOperator) 
	  	{		
			 this.parameterType=newParameterType;
			 this.parameterInitialValue=newParameterInitialValue;
			 this.parameterInitialTypeSign=ParameterTypeSign.MAYORIGUAL;				 
			 this.columnName=newColumnName;
			 this.parameterName=newColumnName;
			 this.parameterName=this.parameterName.replace(".","_");
			 this.nextOperator=newNextOperator;
			 this.isEqual=true;				 
			 this.parameterInitialQuery="";
		  	 this.parameterFinalQuery="";
	  	}
	 
	  	public void setParameterSelectionGeneralMenor(ParameterType newParameterType,
	  			Object newParameterInitialValue,String newColumnName,ParameterTypeOperator newNextOperator) 
	  	{
			
	  		this.parameterType=newParameterType;
	  		this.parameterInitialValue=newParameterInitialValue;
	  		this.parameterInitialTypeSign=ParameterTypeSign.MENOR;				 
	  		this.columnName=newColumnName;
	  		this.parameterName=newColumnName;
	  		this.parameterName=this.parameterName.replace(".","_");
	  		this.nextOperator=newNextOperator;
	  		this.isEqual=true;		
		}
	  	
	  	public void setParameterSelectionGeneralMenorIgual(ParameterType newParameterType,
	  			Object newParameterInitialValue,String newColumnName,ParameterTypeOperator newNextOperator) 
	  	{	
	  		this.parameterType=newParameterType;
	  		this.parameterInitialValue=newParameterInitialValue;
	  		this.parameterInitialTypeSign=ParameterTypeSign.MENORIGUAL;				 
	  		this.columnName=newColumnName;
	  		this.parameterName=newColumnName;
	  		this.parameterName=this.parameterName.replace(".","_");
	  		this.nextOperator=newNextOperator;
	  		this.isEqual=true;	
	  		this.parameterInitialQuery="";
		  	this.parameterFinalQuery="";
		}
	  	
	  	public void setParameterSelectionGeneralMenorIgual(ParameterType newParameterType,
	  			Object newParameterInitialValue,String newColumnName,String sPalabraClaveNombre,ParameterTypeOperator newNextOperator) 
	  	{	
	  		this.parameterType=newParameterType;
	  		this.parameterInitialValue=newParameterInitialValue;
	  		this.parameterInitialTypeSign=ParameterTypeSign.MENORIGUAL;				 
	  		this.columnName=newColumnName;
	  		this.parameterName=newColumnName+sPalabraClaveNombre;
	  		this.parameterName=this.parameterName.replace(".","_");
	  		this.nextOperator=newNextOperator;
	  		this.isEqual=true;	
	  		this.parameterInitialQuery="";
		  	this.parameterFinalQuery="";
		}
	  	
	  	public ParameterSelectionGeneral
		(ParameterType newParameterType,Object newParameterInitialValue,
				Object newParameterFinalValue,ParameterTypeSign newParameterInitialTypeSign,ParameterTypeSign newParameterFinalTypeSign,
		String newColumnName,ParameterTypeOperator newNextOperator,boolean newIsEqual,String newQueryFinal)
		{	
			this.parameterType=newParameterType;
			this.parameterInitialValue=newParameterInitialValue;
			this.parameterFinalValue=newParameterFinalValue;
			this.parameterInitialTypeSign=newParameterInitialTypeSign;
			this.parameterFinalTypeSign=newParameterFinalTypeSign;
				 
			this.columnName=newColumnName;
			this.parameterName=newColumnName;
			this.parameterName=this.parameterName.replace(".","_");
			this.nextOperator=newNextOperator;
			this.isEqual=newIsEqual;			 
		}	  		  	
	  	
		public String getParameterName() {
			return parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		public String getColumnName() {
			return columnName;
		}
		
		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public boolean getIsEqual() {
			return isEqual;
		}

		public void setEqual(boolean isEqual) {
			this.isEqual = isEqual;
		}

		public ParameterTypeOperator getNextOperator() {
			return nextOperator;
		}

		public String getNextOperator(ParameterDbType dbType) {
			String strNextOperator="";
			
			
			if(this.getConnexionType().equals(ConnexionType.JDBC32)) {
				if(dbType.equals(ParameterDbType.MYSQL)) {
					strNextOperator=this.getNextOperatorMYSQL();	
				} else if(dbType.equals(ParameterDbType.POSTGRES)) {
					strNextOperator=this.getNextOperatorPOSTGRES();		
				}
				
        	} else if(this.getConnexionType().equals(ConnexionType.HIBERNATE)) {
				if(dbType.equals(ParameterDbType.MYSQL)) {
					strNextOperator=this.getNextOperatorMYSQL();	
				} else if(dbType.equals(ParameterDbType.POSTGRES)) {
					strNextOperator=this.getNextOperatorPOSTGRES();		
				}
        	}
			
			return strNextOperator;
		}
	
		public String getNextOperatorMYSQL() {
			String strNextOperator="";
			
			if(nextOperator.equals(ParameterTypeOperator.AND)) {
				strNextOperator=" AND ";
			}
				
			if(nextOperator.equals(ParameterTypeOperator.OR)) {
				strNextOperator=" OR ";
			}
				
			if(nextOperator.equals(ParameterTypeOperator.NONE)) {
				strNextOperator="";
			}			
			
			return strNextOperator;
		}
		
		public String getNextOperatorPOSTGRES() {
			String strNextOperator="";
			
			if(nextOperator.equals(ParameterTypeOperator.AND)) {
				strNextOperator=" AND ";
			}
				
			if(nextOperator.equals(ParameterTypeOperator.OR)) {
				strNextOperator=" OR ";
			}
				
			if(nextOperator.equals(ParameterTypeOperator.NONE)) {
				strNextOperator="";
			}			
			
			return strNextOperator;
		}
		
	public void setNextOperator(ParameterTypeOperator nextOperator) {
		this.nextOperator = nextOperator;
	}

	public ParameterTypeSign getParameterFinalTypeSign() {
		return parameterFinalTypeSign;
	}

	public String getParameterInitialTypeSign(ParameterDbType dbType) {
		String strTypeSign="";
		strTypeSign=this.getParameterTypeSign(dbType,parameterInitialTypeSign);
		
		return strTypeSign;
	}
	
	public String getParameterFinalTypeSign(ParameterDbType dbType) {
		String strTypeSign="";
		strTypeSign=getParameterTypeSign(dbType,parameterFinalTypeSign);
		return strTypeSign;	
	}
	
	public String getParameterTypeSign(ParameterDbType dbType,ParameterTypeSign parameterTypeSign) {
		String strTypeSign="";
		
		if(this.getConnexionType().equals(ConnexionType.JDBC32)) {
			if(dbType.equals(ParameterDbType.MYSQL)) {
				strTypeSign=this.getParameterTypeSignMYSQL(parameterTypeSign);
				
			} else if(dbType.equals(ParameterDbType.POSTGRES)) {
				strTypeSign=this.getParameterTypeSignPOSTGRES(parameterTypeSign) ;
			}
			
    	} else if(this.getConnexionType().equals(ConnexionType.HIBERNATE)) {
			if(dbType.equals(ParameterDbType.MYSQL)) {
				strTypeSign=this.getParameterTypeSignMYSQL(parameterTypeSign);
				
			} else if(dbType.equals(ParameterDbType.POSTGRES)) {
				strTypeSign=this.getParameterTypeSignPOSTGRES(parameterTypeSign) ;
			}
    	}
		
		return strTypeSign;	
	}
	
	public String getParameterTypeSignMYSQL(ParameterTypeSign parameterTypeSign) {
		String strTypeSign="";
		
		if(parameterTypeSign.equals(ParameterTypeSign.DONTLIKE)) {
			strTypeSign=" not like ";
		}
		
		if(parameterTypeSign.equals(ParameterTypeSign.IGUAL)) {
			strTypeSign=" = ";
		}
		
		if(parameterTypeSign.equals(ParameterTypeSign.LIKE)) {
			strTypeSign=" like ";
		}
		
		if(parameterTypeSign.equals(ParameterTypeSign.MAYOR)) {
			strTypeSign=" > ";
		}
		
		if(parameterTypeSign.equals(ParameterTypeSign.MAYORIGUAL)) {
			strTypeSign=" >= ";
		}
		
		if(parameterTypeSign.equals(ParameterTypeSign.MENOR)) {
			strTypeSign=" < ";
		}
		
		if(parameterTypeSign.equals(ParameterTypeSign.MENORIGUAL)) {
			strTypeSign=" <= ";
		}
		
		return strTypeSign;	
	}
	
	public String getParameterTypeSignPOSTGRES(ParameterTypeSign parameterTypeSign) {
		String strTypeSign="";
		
		if(parameterTypeSign.equals(ParameterTypeSign.DONTLIKE)) {
			strTypeSign=" not like ";
		}
		
		if(parameterTypeSign.equals(ParameterTypeSign.IGUAL)) {
			strTypeSign=" = ";
		}
		
		if(parameterTypeSign.equals(ParameterTypeSign.LIKE)) {
			strTypeSign=" like ";
		}
		
		if(parameterTypeSign.equals(ParameterTypeSign.MAYOR)) {
			strTypeSign=" > ";
		}
		
		if(parameterTypeSign.equals(ParameterTypeSign.MAYORIGUAL)) {
			strTypeSign=" >= ";
		}
		
		if(parameterTypeSign.equals(ParameterTypeSign.MENOR)) {
			strTypeSign=" < ";
		}
		
		if(parameterTypeSign.equals(ParameterTypeSign.MENORIGUAL)) {
			strTypeSign=" <= ";
		}
		
		return strTypeSign;	
	}
	
	public void setParameterFinalTypeSign(ParameterTypeSign parameterFinalTypeSign) {
		this.parameterFinalTypeSign = parameterFinalTypeSign;
	}

	public Object getParameterFinalValue() {
		return parameterFinalValue;
	}

	public void setParameterFinalValue(Object parameterFinalValue) {
		this.parameterFinalValue = parameterFinalValue;
	}

	public ParameterTypeSign getParameterInitialTypeSign() {
		return parameterInitialTypeSign;
	}

	public void setParameterInitialTypeSign(
			ParameterTypeSign parameterInitialTypeSign) {
		this.parameterInitialTypeSign = parameterInitialTypeSign;
	}

	public Object getParameterInitialValue() {
		return parameterInitialValue;
	}

	public void setParameterInitialValue(Object parameterInitialValue) {
		this.parameterInitialValue = parameterInitialValue;
	}
	
	public ParameterType getParameterType() {
		return parameterType;
	}

	public void setParameterType(ParameterType newParameterType) {
		this.parameterType = newParameterType;
	}

	public String getParameterInitialQuery() {
		return parameterInitialQuery;
	}

	public void setParameterInitialQuery(String parameterInitialQuery) {
		this.parameterInitialQuery = parameterInitialQuery;
	}

	public String getParameterFinalQuery() {
		return parameterFinalQuery;
	}

	public void setParameterFinalQuery(String parameterFinalQuery) {
		this.parameterFinalQuery = parameterFinalQuery;
	}
}
