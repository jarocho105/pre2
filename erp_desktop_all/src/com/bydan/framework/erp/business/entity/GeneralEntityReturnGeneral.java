package com.bydan.framework.erp.business.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.bydan.erp.seguridad.business.entity.Accion;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
//import com.bydan.erp.seguridad.util.SistemaReturnGeneral;


@SuppressWarnings("unused")
public class GeneralEntityReturnGeneral extends GeneralEntityParameterGeneral implements Serializable {
	protected static final long serialVersionUID=1L;
	
	protected Boolean conMostrarMensaje=false;
	protected Boolean conRecargarInformacion=false;
	protected Boolean conRecargarPropiedades=false;
	protected Boolean conRecargarRelaciones=false;
	protected Boolean conActualizarPantalla=false;
	protected Boolean conSeleccionarNinguno=true;
	
	protected String sLabelProceso="";
	protected String sMensajeProceso="";	
	protected String sTipoMensaje="";
	
	protected Boolean conRetornoEstaProcesado=false;
	protected Boolean conRetornoLista=false;
	protected Boolean conRetornoObjeto=false;
		
	protected Boolean conAbrirVentana=false;
	protected Boolean esValidado=false;
	protected Boolean esError=false;
	
	
	
	public GeneralEntityReturnGeneral () throws Exception {			
		this.conMostrarMensaje=false;
		this.conRecargarInformacion=false;
		this.conRecargarPropiedades=false;
		this.conRecargarRelaciones=false;
		this.conActualizarPantalla=false;
		this.conSeleccionarNinguno=true;
		
		this.conRetornoEstaProcesado=false;
		this.conRetornoLista=false;
		this.conRetornoObjeto=false;
		
		this.sLabelProceso="";
		this.sMensajeProceso="";
		this.sTipoMensaje="";
		
		this.conAbrirVentana=false;
		this.esValidado=false;		
		this.esError=false;					
	} 		

	public static void ConfigurarConMensajeConRecargar(GeneralEntityReturnGeneral generalEntityReturnGeneral,String sProceso) {
		generalEntityReturnGeneral.setConMostrarMensaje(true);
		generalEntityReturnGeneral.setsLabelProceso("PROCESO "+sProceso);
		generalEntityReturnGeneral.setsMensajeProceso("PROCESO "+sProceso+" REALIZADO CORRECTAMENTE");
		generalEntityReturnGeneral.setsTipoMensaje("INFO");
		
		generalEntityReturnGeneral.setConRecargarInformacion(true);
	}
	
	
	
	public void setConMostrarMensaje(Boolean conMostrarMensaje) {
		this.conMostrarMensaje = conMostrarMensaje;
	}
	
	public Boolean getConMostrarMensaje() {
		return conMostrarMensaje;
	}

	public Boolean getConRecargarInformacion() {
		return conRecargarInformacion;
	}

	public void setConRecargarInformacion(Boolean conRecargarInformacion) {
		this.conRecargarInformacion = conRecargarInformacion;
	}

	public Boolean getConRecargarPropiedades() {
		return conRecargarPropiedades;
	}

	public void setConRecargarPropiedades(Boolean conRecargarPropiedades) {
		this.conRecargarPropiedades= conRecargarPropiedades;
	}
	
	public Boolean getConRecargarRelaciones() {
		return conRecargarRelaciones;
	}

	public void setConRecargarRelaciones(Boolean conRecargarRelaciones) {
		this.conRecargarRelaciones= conRecargarRelaciones;
	}
	
	public Boolean getConActualizarPantalla() {
		return conActualizarPantalla;
	}

	public void setConActualizarPantalla(Boolean conActualizarPantalla) {
		this.conActualizarPantalla = conActualizarPantalla;
	}

	public Boolean getconSeleccionarNinguno() {
		return conSeleccionarNinguno;
	}

	public void setconSeleccionarNinguno(Boolean conSeleccionarNinguno) {
		this.conSeleccionarNinguno = conSeleccionarNinguno;
	}

	public Boolean getConRetornoEstaProcesado() {
		return conRetornoEstaProcesado;
	}

	public void setConRetornoEstaProcesado(Boolean conRetornoEstaProcesado) {
		this.conRetornoEstaProcesado = conRetornoEstaProcesado;
	}	
	
	public Boolean getConRetornoLista() {
		return conRetornoLista;
	}

	public void setConRetornoLista(Boolean conRetornoLista) {
		this.conRetornoLista = conRetornoLista;
	}

	public Boolean getConRetornoObjeto() {
		return conRetornoObjeto;
	}

	public void setConRetornoObjeto(Boolean conRetornoObjeto) {
		this.conRetornoObjeto = conRetornoObjeto;
	}

	public String getsMensajeProceso() {
		return sMensajeProceso;
	}

	public void setsMensajeProceso(String sMensajeProceso) {
		this.sMensajeProceso = sMensajeProceso;
	}
	
	public String getsLabelProceso() {
		return sLabelProceso;
	}

	public void setsLabelProceso(String sLabelProceso) {
		this.sLabelProceso = sLabelProceso;
	}
	
	public String getsTipoMensaje() {
		return sTipoMensaje;
	}

	public void setsTipoMensaje(String sTipoMensaje) {
		this.sTipoMensaje = sTipoMensaje;
	}	

	public Boolean getConSeleccionarNinguno() {
		return conSeleccionarNinguno;
	}

	public void setConSeleccionarNinguno(Boolean conSeleccionarNinguno) {
		this.conSeleccionarNinguno = conSeleccionarNinguno;
	}

	public Boolean getConAbrirVentana() {
		return conAbrirVentana;
	}

	public void setConAbrirVentana(Boolean conAbrirVentana) {
		this.conAbrirVentana = conAbrirVentana;
	}

	public Boolean getEsValidado() {
		return esValidado;
	}

	public void setEsValidado(Boolean esValidado) {
		this.esValidado = esValidado;
	}

	public Boolean getEsError() {
		return esError;
	}

	public void setEsError(Boolean esError) {
		this.esError = esError;
	}		
}
