package com.bydan.framework.erp.business.entity;

import com.bydan.framework.erp.util.ParameterDbType;
import com.bydan.framework.erp.util.ParametersMaintenance;
import com.bydan.framework.erp.util.ParametersType;

abstract public class GeneralEntityReadOnly {
	private Integer id;
	protected ParametersMaintenance parametersMaintenance;
	protected int orderParameter;
	protected String querySelect;
	
	public int getOrderParameter() {
		return orderParameter;
	}

	public void setOrder(int newOrderParameter) {
		this.orderParameter = newOrderParameter;
	}
	
	public void buildParametersMaintenance(ParameterDbType parameterDbType,ParametersType parametersType) {
		
	}

	public String getQuerySelect() {
		return querySelect;
	}

	public void setQuerySelect(String newQuerySelect) {
		this.querySelect = newQuerySelect;
	}
	
	public GeneralEntityReadOnly() {
		id=0;
	}
					
	public Integer getId() {
		return id;
	}
	
	public void setId(int newId) {
		this.id = newId;
	}
	public void setParametersMaintenance(ParametersMaintenance parametersMaintenance) {
		this.parametersMaintenance = parametersMaintenance;
	}
	public ParametersMaintenance getParametersMaintenance() {
		return parametersMaintenance;
	}
	
	public static String getColumnNameId() {
		return "id";
	}
}
