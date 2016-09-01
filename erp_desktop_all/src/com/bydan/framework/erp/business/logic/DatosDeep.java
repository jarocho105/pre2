package com.bydan.framework.erp.business.logic;

import java.io.Serializable;
import java.util.ArrayList;

import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.util.DeepLoadType;

public class DatosDeep implements Serializable { 
	private static final long serialVersionUID=1L;
	
	private Boolean isDeep;
	private DeepLoadType deepLoadType;
	private ArrayList<Classe> clases;
	private String sTituloMensaje;
	
	public DatosDeep() {
		this.isDeep=false;
		this.deepLoadType=DeepLoadType.NONE;
		this.clases=new ArrayList<Classe>();
		this.sTituloMensaje="";
	}

	public DatosDeep(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String sTituloMensaje) {
		this.isDeep=isDeep;
		this.deepLoadType=deepLoadType;
		this.clases=clases;
		this.sTituloMensaje=sTituloMensaje;
	}
	
	public Boolean getIsDeep() {
		return this.isDeep;
	}

	public void setIsDeep(Boolean isDeep) {
		this.isDeep = isDeep;
	}

	public DeepLoadType getDeepLoadType() {
		return this.deepLoadType;
	}

	public void setDeepLoadType(DeepLoadType deepLoadType) {
		this.deepLoadType = deepLoadType;
	}

	public ArrayList<Classe> getClases() {
		return this.clases;
	}

	public void setClases(ArrayList<Classe> clases) {
		this.clases = clases;
	}

	public String getSTituloMensaje() {
		return this.sTituloMensaje;
	}

	public void setSTituloMensaje(String sTituloMensaje) {
		this.sTituloMensaje = sTituloMensaje;
	}
}
