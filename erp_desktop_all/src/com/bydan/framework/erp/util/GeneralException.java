package com.bydan.framework.erp.util;

public class GeneralException extends Throwable{
	static final long serialVersionUID=105;
	private Exception innerExcepcion;
	
	public	GeneralException(Exception excepcion) {
		innerExcepcion=excepcion;
	}

	public Exception getInnerExcepcion() {
		return innerExcepcion;
	}

	public void setInnerExcepcion(Exception innerExcepcion) {
		this.innerExcepcion = innerExcepcion;
	}
}
