package com.bydan.framework.erp.business.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.bydan.framework.erp.util.EventoGlobalTipo;


@SuppressWarnings("unused")
public class GeneralEntityParameterGeneral implements Serializable {
	protected static final long serialVersionUID=1L;
	
	protected String sMensaje="";
	protected String sTipo="";
	
	//PARA EVENTOS
	protected EventoGlobalTipo eventoGlobalTipo;
	protected String sDominio;
	protected String sDominioTipo;
	
	public GeneralEntityParameterGeneral () throws Exception {			
		this.sMensaje="";
		this.sTipo="";
		
		this.eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
		this.sDominio="";
		this.sDominioTipo="";
		
	} 		

	public String getsMensaje() {
		return sMensaje;
	}

	public void setsMensaje(String sMensaje) {
		this.sMensaje = sMensaje;
	}
	
	public String getsTipo() {
		return sTipo;
	}

	public void setsTipo(String sTipo) {
		this.sTipo = sTipo;
	}

	public EventoGlobalTipo getEventoGlobalTipo() {
		return eventoGlobalTipo;
	}

	public void setEventoGlobalTipo(EventoGlobalTipo eventoGlobalTipo) {
		this.eventoGlobalTipo = eventoGlobalTipo;
	}

	public String getsDominio() {
		return sDominio;
	}

	public void setsDominio(String sDominio) {
		this.sDominio = sDominio;
	}

	public String getsDominioTipo() {
		return sDominioTipo;
	}

	public void setsDominioTipo(String sDominioTipo) {
		this.sDominioTipo = sDominioTipo;
	}	
}
