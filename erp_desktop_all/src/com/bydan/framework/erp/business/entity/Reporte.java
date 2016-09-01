package com.bydan.framework.erp.business.entity;

public class Reporte {
	private String sCodigo;	
	private String sDescripcion;

	public Reporte() {
		
	}
	
	public Reporte(String sCodigo,String sDescripcion) {
		this.sCodigo=sCodigo;
		this.sDescripcion=sDescripcion;
	}

	public String getsCodigo() {
		return sCodigo;
	}

	public void setsCodigo(String sCodigo) {
		this.sCodigo = sCodigo;
	}

	public String getsDescripcion() {
		return sDescripcion;
	}

	public void setsDescripcion(String sDescripcion) {
		this.sDescripcion = sDescripcion;
	}
	
	public String toString() {
		String sLabel="";
		
		sLabel=this.sDescripcion;
		
		return sLabel;
	}	
}
