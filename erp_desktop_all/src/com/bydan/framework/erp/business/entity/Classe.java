package com.bydan.framework.erp.business.entity;

import java.io.Serializable;

final public class Classe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Class<?> clas=Classe.class;
	public Boolean blnActivo=true;
	public String clase="";
	public String columna="";//USADO PARA TRAER GENERICO DESDE LOGIC
	public Integer indice=0;
	
	public Classe(Class<?> clas) {
		this.clas=clas;
		this.blnActivo=true;
		this.clase="";
		this.columna="";
		this.indice=0;
	}
	
	public Classe(String clase) {
		this.clase=clase;
		this.clas=Classe.class;
		this.blnActivo=true;
		this.columna="";
		this.indice=0;
	}
	
	public Classe() {
		this.clas=Classe.class;
		this.blnActivo=false;
		this.clase="";
		this.columna="";
		this.indice=0;
	}
	
	public Classe(String columna_clase,Class<?> clas,Integer indice,Boolean paraColumna) {
		if(paraColumna) {
			this.columna=columna_clase;
			this.clase="";
			
		} else {		
			this.clase=columna_clase;
			this.columna="";
		}
		
		this.clas=clas;
		this.blnActivo=true;
		this.indice=indice;
	}

	public Classe(String columna_clase,Class<?> clas,Boolean paraColumna) {
		if(paraColumna) {
			this.columna=columna_clase;
			this.clase="";
			
		} else {		
			this.clase=columna_clase;
			this.columna="";
		}
		
		this.clas=clas;
		this.blnActivo=true;
		this.indice=0;
	}
	
	public Class<?> getClas() {
		return clas;
	}

	public void setClas(Class<?> clas) {
		this.clas = clas;
	}

	public Boolean getBlnActivo() {
		return blnActivo;
	}

	public void setBlnActivo(Boolean blnActivo) {
		this.blnActivo = blnActivo;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getColumna() {
		return columna;
	}

	public void setColumna(String columna) {
		this.columna = columna;
	}

	public Integer getIndice() {
		return indice;
	}

	public void setIndice(Integer indice) {
		this.indice = indice;
	}
	
	
}
