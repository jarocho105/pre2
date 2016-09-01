package com.bydan.framework.erp.util;

import com.bydan.framework.erp.util.MensajeGrupo;
import com.bydan.framework.erp.util.MensajeTipo;


public class Mensaje {
	private String sTitulo;
	private String sMensajeUsuario;
	private String sMensajeTecnico;
	private MensajeGrupo mensajeGrupo;
	private MensajeTipo mensajeTipo;
	private Boolean esOpcional;
	private String sNombreMensaje;
	
	public Mensaje(String sNombreMensaje,String sTitulo,String sMensajeUsuario,String sMensajeTecnico,MensajeGrupo mensajeGrupo) 
	{
		this.sNombreMensaje= sNombreMensaje;
		this.sTitulo=sTitulo;
		this.sMensajeUsuario=sMensajeUsuario;
		this.sMensajeTecnico=sMensajeTecnico;
		this.mensajeGrupo=mensajeGrupo;
		this.esOpcional=false;
		
		if(mensajeGrupo==MensajeGrupo.EXCEPTION) {
			this.mensajeTipo=MensajeTipo.ERROR;
			this.sNombreMensaje="excepcion";
		}
		
		this.mensajeTipo=MensajeTipo.NONE;
	}
	
	
	public Mensaje(String strTitulo,String sMensajeUsuario,String sMensajeTecnico,MensajeGrupo mensajeGrupo,MensajeTipo mensajeTipo) {
		this.sTitulo=strTitulo;
		this.sMensajeUsuario=sMensajeUsuario;
		this.sMensajeTecnico=sMensajeTecnico;
		this.mensajeGrupo=mensajeGrupo;
		this.esOpcional=false;
		
		if(mensajeGrupo==MensajeGrupo.EXCEPTION) {
			this.mensajeTipo=MensajeTipo.ERROR;
			this.sNombreMensaje="excepcion";
		}
		
		this.mensajeTipo=mensajeTipo;
	}
	
	public Mensaje(String strTitulo,String sMensajeUsuario,String sMensajeTecnico,MensajeGrupo mensajeGrupo) {
		this.sTitulo=strTitulo;
		this.sMensajeUsuario=sMensajeUsuario;
		this.sMensajeTecnico=sMensajeTecnico;
		this.mensajeGrupo=mensajeGrupo;
		this.esOpcional=false;
		
		if(mensajeGrupo==MensajeGrupo.EXCEPTION) {
			this.mensajeTipo=MensajeTipo.ERROR;
			this.sNombreMensaje="excepcion";
		}
		
		this.mensajeTipo=MensajeTipo.NONE;
	}
	
	public Mensaje(String sNombreMensaje,String sTitulo,String sMensajeUsuario,String sMensajeTecnico,MensajeGrupo mensajeGrupo,MensajeTipo mensajeTipo,Boolean esOpcional) {
		this.sNombreMensaje=sNombreMensaje;
		this.sTitulo=sTitulo;
		this.sMensajeUsuario=sMensajeUsuario;
		this.sMensajeTecnico=sMensajeTecnico;
		this.mensajeGrupo=mensajeGrupo;
		this.mensajeTipo=mensajeTipo;
		this.esOpcional=esOpcional;
	}
	
	public Mensaje() {
		this.sTitulo="NONE";
		this.sMensajeUsuario="NONE";
		this.sMensajeTecnico="NONE";
		this.sNombreMensaje="NONE";
		this.mensajeGrupo=MensajeGrupo.APLICACION;
		this.mensajeTipo=MensajeTipo.INFORMACION;
		this.esOpcional=true;
	}
	
	public Boolean getEsOpcional() {
		return esOpcional;
	}
	
	public void setEsOpcional(Boolean esOpcional) {
		this.esOpcional = esOpcional;
	}
	
	public static String getMensajeGeneralInformacionProcesoExitoso(String strNombre,String sTitulo,String sMensajeUsuario,String sMensajeTecnico) {
		Mensaje mensaje=new Mensaje(strNombre, sTitulo,sMensajeUsuario,sMensajeTecnico,MensajeGrupo.APLICACION,MensajeTipo.INFORMACION,false);	
		return mensaje.toNewXmlMensaje();	
	}
	
	public static String getMensajeGeneraldefault() {
		Mensaje mensaje=new Mensaje("NONE","NONE","NONE","NONE",MensajeGrupo.NONE,MensajeTipo.NONE,true);	
		return mensaje.toAppendXmlMensaje();	
	}
	
	public static String getMensajeGeneralNoExisteBusqueda(String nombreClase) {
		Mensaje mensaje=new Mensaje("noexistencia","Busqueda de "+nombreClase+"s","No existen "+nombreClase+"s en esta busqueda","NONE",MensajeGrupo.APLICACION,MensajeTipo.INFORMACION,true);	
		return mensaje.toNewXmlMensaje(nombreClase);	
	}
	
	
	public static String getMensajeGeneralNuevo(String nombreClase) {
		Mensaje mensaje=new Mensaje("nuevo","Mantenimiento de "+nombreClase+"","Nuevo "+nombreClase+" ingresado correctamente","NONE",MensajeGrupo.APLICACION,MensajeTipo.INFORMACION,true);	
		return mensaje.toAppendXmlMensaje();	
	}
	
	public static String getMensajeGeneralEliminar(String nombreClase) {
		Mensaje mensaje=new Mensaje("eliminar","Mantenimiento de "+nombreClase+"",nombreClase+" eliminado correctamente","NONE",MensajeGrupo.APLICACION,MensajeTipo.INFORMACION,true);	
		return mensaje.toAppendXmlMensaje();	
	}
	
	public static String getMensajeGeneralDeepSave(String titulo) {
		Mensaje mensaje=new Mensaje("deepsave",titulo,"Los datos han sido guardados correctamente","NONE",MensajeGrupo.APLICACION,MensajeTipo.INFORMACION,false);	
		return mensaje.toAppendXmlMensaje();	
	}
	
	public static String getMensajeGeneralDeepLoad(String titulo) {
		Mensaje mensaje=new Mensaje("deepload",titulo,"Los datos han sido cargados correctamente","NONE",MensajeGrupo.APLICACION,MensajeTipo.INFORMACION,true);	
		return mensaje.toAppendXmlMensaje();	
	}
	
	public MensajeGrupo getMensajeGrupo() {
		return mensajeGrupo;
	}
	
	public void setMensajeGrupo(MensajeGrupo mensajeGrupo) {
		this.mensajeGrupo = mensajeGrupo;
	}
	
	public MensajeTipo getMensajeTipo() {
		return mensajeTipo;
	}
	
	public void setMensajeTipo(MensajeTipo mensajeTipo) {
		this.mensajeTipo = mensajeTipo;
	}
	
	public String getSMensajeTecnico() {
		return sMensajeTecnico;
	}
	
	public void setSMensajeTecnico(String sMensajeTecnico) {
		this.sMensajeTecnico = sMensajeTecnico;
	}
	
	public String getSMensajeUsuario() {
		return sMensajeUsuario;
	}
	
	public void setSMensajeUsuario(String sMensajeUsuario) {
		this.sMensajeUsuario = sMensajeUsuario;
	}
	
	public String getSTitulo() {
		return sTitulo;
	}
	public void setSTitulo(String sTitulo) {
		this.sTitulo = sTitulo;
	}
	
	public String getSNombreMensaje() {
		return sNombreMensaje;
	}
	
	public void setSNombreMensaje(String sNombreMensaje) {
		this.sNombreMensaje = sNombreMensaje;
	}
	
	public String toNewXmlMensaje(String strNombreClase) {
		StringBuffer xml = new StringBuffer();
		
		xml.append("<?xml version=\"1.0\"?>\n");
	    xml.append("<"+strNombreClase.toLowerCase()+" generated=\""+System.currentTimeMillis()+"\">\n");	    
	     
	  	xml.append("<itemMensaje code=\""+System.currentTimeMillis()+"\">\n");
		xml.append("<grupo>");
		xml.append(mensajeGrupo);
		xml.append("</grupo>\n");
	
		xml.append("<tipo>");
		xml.append(mensajeTipo);
		xml.append("</tipo>\n");
	
		xml.append("<nombremensaje>");
		xml.append(this.sNombreMensaje);
		xml.append("</nombremensaje>\n");
		
		xml.append("<esopcional>");
		xml.append(esOpcional);
		xml.append("</esopcional>\n");
		
		xml.append("<titulo>");
		xml.append(sTitulo);
		xml.append("</titulo>\n");
		
		xml.append("<mensajeusuario>");
		xml.append(sMensajeUsuario);
		xml.append("</mensajeusuario>\n");
		
		xml.append("<mensajetecnico>");
		xml.append(sMensajeTecnico);
		xml.append("</mensajetecnico>\n");
		
		xml.append("</itemMensaje>\n");	
		
		xml.append("</"+strNombreClase.toLowerCase()+">\n");
   
		return xml.toString();
	}
	
	public String toNewXmlMensaje() {
		StringBuffer xml = new StringBuffer();
		
		xml.append("<?xml version=\"1.0\"?>\n");
	    xml.append("<mensaje generated=\""+System.currentTimeMillis()+"\">\n");	    
	     
	  	xml.append("<itemMensaje code=\""+System.currentTimeMillis()+"\">\n");
		xml.append("<grupo>");
		xml.append(mensajeGrupo);
		xml.append("</grupo>\n");
	
		xml.append("<tipo>");
		xml.append(mensajeTipo);
		xml.append("</tipo>\n");
	
		xml.append("<nombremensaje>");
		xml.append(this.sNombreMensaje);
		xml.append("</nombremensaje>\n");
		
		xml.append("<esopcional>");
		xml.append(esOpcional);
		xml.append("</esopcional>\n");
		
		xml.append("<titulo>");
		xml.append(sTitulo);
		xml.append("</titulo>\n");
		
		xml.append("<mensajeusuario>");
		xml.append(sMensajeUsuario);
		xml.append("</mensajeusuario>\n");
		
		xml.append("<mensajetecnico>");
		xml.append(sMensajeTecnico);
		xml.append("</mensajetecnico>\n");
		
		xml.append("</itemMensaje>\n");	
		
		xml.append("</mensaje>\n");
	      
		return xml.toString();
	}
	
	public String toAppendXmlMensaje(String strNombreClase) {
		StringBuffer xml = new StringBuffer();
		
		xml.append("<?xml version=\"1.0\"?>\n");
		xml.append("<"+strNombreClase.toLowerCase()+" generated=\""+System.currentTimeMillis()+"\">\n");
	     
	  	xml.append("<itemMensaje code=\""+System.currentTimeMillis()+"\">\n");
	  	
		xml.append("<grupo>");
		xml.append(mensajeGrupo);
		xml.append("</grupo>\n");
	
		xml.append("<tipo>");
		xml.append(mensajeTipo);
		xml.append("</tipo>\n");
		
		xml.append("<nombremensaje>");
		xml.append(this.sNombreMensaje);
		xml.append("</nombremensaje>\n");
		
		xml.append("<esopcional>");
		xml.append(esOpcional);
		xml.append("</esopcional>\n");
		
		xml.append("<titulo>");
		xml.append(sTitulo);
		xml.append("</titulo>\n");
		
		xml.append("<mensajeusuario>");
		xml.append(sMensajeUsuario);
		xml.append("</mensajeusuario>\n");
		
		xml.append("<mensajetecnico>");
		xml.append(sMensajeTecnico);
		xml.append("</mensajetecnico>\n");
		
		xml.append("</itemMensaje>\n");	    
	    
		
		xml.append("</"+strNombreClase.toLowerCase()+">\n");
	    
		return xml.toString();
	}
	
	public String toAppendXmlMensaje() {
		StringBuffer xml = new StringBuffer();   
		
		
	  	xml.append("<itemMensaje code=\""+System.currentTimeMillis()+"\">\n");
	  	
		xml.append("<grupo>");
		xml.append(mensajeGrupo);
		xml.append("</grupo>\n");
	
		xml.append("<tipo>");
		xml.append(mensajeTipo);
		xml.append("</tipo>\n");
		
		xml.append("<nombremensaje>");
		xml.append(this.sNombreMensaje);
		xml.append("</nombremensaje>\n");
		
		xml.append("<esopcional>");
		xml.append(esOpcional);
		xml.append("</esopcional>\n");
		
		xml.append("<titulo>");
		xml.append(sTitulo);
		xml.append("</titulo>\n");
		
		xml.append("<mensajeusuario>");
		xml.append(sMensajeUsuario);
		xml.append("</mensajeusuario>\n");
		
		xml.append("<mensajetecnico>");
		xml.append(sMensajeTecnico);
		xml.append("</mensajetecnico>\n");
		
		xml.append("</itemMensaje>\n");	    
	    		   
		return xml.toString();
	}
}
