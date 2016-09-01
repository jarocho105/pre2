package com.bydan.framework.erp.util;

import java.util.ArrayList;

public class ParametersMaintenance {
	private ParameterDbType dbType;
	private	ArrayList<ParameterMaintenance> parametersMaintenance;

	public ParameterDbType getDbType() { 
		 return dbType; 
	}

	public void setDbType(ParameterDbType newDbType) { 
	   dbType = newDbType; 
	}

	public ArrayList<ParameterMaintenance> getParametersMaintenance() {
		return parametersMaintenance;
	}

	public void setParametersMaintenance(
			ArrayList<ParameterMaintenance> parametersMaintenance) {
		this.parametersMaintenance = parametersMaintenance;
	}
	
	public void addParameter(
			ParameterMaintenance parameterMaintenance) {
		this.parametersMaintenance.add(parameterMaintenance);
	}	
}
