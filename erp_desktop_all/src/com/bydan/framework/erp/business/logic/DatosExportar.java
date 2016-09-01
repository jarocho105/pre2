package com.bydan.framework.erp.business.logic;

import java.io.Serializable;

public class DatosExportar implements Serializable { 
	private static final long serialVersionUID=1L;
	
	private String sPath;
	private String sDelimiter;
	private Boolean conCabecera;
	private String sTipo;
	
	public DatosExportar() {
		this.sPath="";
		this.sTipo="";
		this.sDelimiter="";
		this.conCabecera=false;
	}

	public DatosExportar(String sTipo,Boolean conCabecera,String sDelimiter,String sPath) {
		this.sTipo=sTipo;
		this.conCabecera=conCabecera;
		this.sDelimiter=sDelimiter;
		this.sPath=sPath;
	}
		
	public String getsPath() {
		return this.sPath;
	}

	public void setsPath(String sPath) {
		this.sPath = sPath;
	}

	public Boolean getConCabecera() {
		return conCabecera;
	}

	public void setConCabecera(Boolean conCabecera) {
		this.conCabecera = conCabecera;
	}

	public String getsDelimiter() {
		return sDelimiter;
	}

	public void setsDelimiter(String sDelimiter) {
		this.sDelimiter = sDelimiter;
	}

	public String getsTipo() {
		return sTipo;
	}

	public void setsTipo(String sTipo) {
		this.sTipo = sTipo;
	}		
}
