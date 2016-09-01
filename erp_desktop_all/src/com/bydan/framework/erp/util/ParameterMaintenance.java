package com.bydan.framework.erp.util;

public class ParameterMaintenance {
	private String name;
	private ParameterDbType dbType;
	private int order;
	private Object value;
	private ParameterType parameterMaintenanceType;
	private ParameterValue<?> parameterMaintenanceValue;
	 
	public ParameterMaintenance(Object newValue,String newName,ParameterDbType newDbType,int newOrder,ParameterType newParameterMaintenanceType,ParameterValue<?> newparameterMaintenanceValue) {
		this.name=newName;
		this.dbType=newDbType;
		this.order=newOrder;
		this.parameterMaintenanceType=newParameterMaintenanceType;
		this.parameterMaintenanceValue=newparameterMaintenanceValue;
		this.value=newValue;
	}
	
	public ParameterMaintenance(Object newValue,String newName,ParameterDbType newDbType, ParameterType newParameterMaintenanceType,ParameterValue<?> newparameterMaintenanceValue) {
		this.name = newName;
		this.dbType = newDbType;
		this.parameterMaintenanceType=newParameterMaintenanceType;
		this.parameterMaintenanceValue=newparameterMaintenanceValue;
		this.value= newValue;
    }
	
	public ParameterMaintenance() {
		
	}
	
	 public Object getValue() {
		return value;
	 }

	 public Object getValueInt() {
		return value;
	 }
	 
	 public void setValue(Object newValue) {
		this.value= newValue;
	 }
	
	 public ParameterType getParameterMaintenanceType() {
		return parameterMaintenanceType;
	 }

	 public void setParameterMaintenanceType(ParameterType newParameterMaintenanceType) {
		this.parameterMaintenanceType = newParameterMaintenanceType;
	 }
	
	 public ParameterValue<?> getParameterMaintenanceValue() {
	 	return parameterMaintenanceValue;
	 }

	 public void setParameterMaintenanceValue(ParameterValue<?> newParameterMaintenanceValue) {
		this.parameterMaintenanceValue = newParameterMaintenanceValue;
	 }
	 
	 public int getOrder() {
		return order;
	 }

	 public void setOrder(int newOrder) {
		this.order = newOrder;
	 }
		
     public String getName() {
          return name; 
     }
    
     public void setName(String newName) {
    	name = newName; 
     }  

     public ParameterDbType getDbType() { 
    	 return dbType; 
     }
    
     public void setDbType(ParameterDbType newDbType) { 
    	 dbType = newDbType; 
     }
}
