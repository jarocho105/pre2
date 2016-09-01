package com.bydan.framework.erp.business.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.util.DeepLoadType;

public class DatosCliente implements Serializable {
	private static final long serialVersionUID=1L;
	
	private Long idUsuario;
	private Boolean isClienteWeb=false;
	private String sClaveSistema;	
	
	//CLIENTE
	private String sUsuarioPC;
	private String sNamePC;
	private String sIPPC;
	private String sMacAddressPC;
	
	//SERVIDOR
	private String sUsuarioPCServer;
	private String sNamePCServer;
	private String sIPPCServer;
	private String sMacAddressPCServer;
	private Date dFechaServer;
	
	private Boolean isConDeep=false;
	private DatosDeep datosDeep;
	
	private Boolean isConExportar=false;
	private DatosExportar datosExportar;
	
	public DatosCliente() {
		this.idUsuario=0L;
		this.isClienteWeb=false;
		this.sClaveSistema="";
		
		this.sUsuarioPC="";
		this.sNamePC="";
		this.sIPPC="";
		this.sMacAddressPC="";
		
		//SERVER
		this.sUsuarioPCServer="";
		this.sNamePCServer="";
		this.sIPPCServer="";
		this.sMacAddressPCServer="";
		this.dFechaServer=new Date();
		
		this.datosDeep=new DatosDeep();
		this.isConDeep=false;
		
		this.isConExportar=false;
		this.datosExportar=new DatosExportar();
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	
	public Boolean getIsClienteWeb() {
		return isClienteWeb;
	}
	
	public String getsClaveSistema() {
		return sClaveSistema;
	}

	public void setsClaveSistema(String sClaveSistema) {
		this.sClaveSistema = sClaveSistema;
	}

	public void setIsClienteWeb(Boolean isClienteWeb) {
		this.isClienteWeb = isClienteWeb;
	}

	public String getsUsuarioPC() {
		return sUsuarioPC;
	}

	public void setsUsuarioPC(String sUsuarioPC) {
		this.sUsuarioPC = sUsuarioPC;
	}

	public String getsNamePC() {
		return sNamePC;
	}

	public void setsNamePC(String sNamePC) {
		this.sNamePC = sNamePC;
	}

	public String getsIPPC() {
		return sIPPC;
	}

	public void setsIPPC(String sIPPC) {
		this.sIPPC = sIPPC;
	}
		
	public String getsMacAddressPC() {
		return sMacAddressPC;
	}

	public void setsMacAddressPC(String sMacAddressPC) {
		this.sMacAddressPC = sMacAddressPC;
	}
	
	
	public Date getdFechaServer() {
		return dFechaServer;
	}

	public void setdFechaServer(Date dFechaServer) {
		this.dFechaServer = dFechaServer;
	}

	public String getsUsuarioPCServer() {
		return sUsuarioPCServer;
	}

	public void setsUsuarioPCServer(String sUsuarioPCServer) {
		this.sUsuarioPCServer = sUsuarioPCServer;
	}

	public String getsNamePCServer() {
		return sNamePCServer;
	}

	public void setsNamePCServer(String sNamePCServer) {
		this.sNamePCServer = sNamePCServer;
	}

	public String getsIPPCServer() {
		return sIPPCServer;
	}

	public void setsIPPCServer(String sIPPCServer) {
		this.sIPPCServer = sIPPCServer;
	}

	public String getsMacAddressPCServer() {
		return sMacAddressPCServer;
	}

	public void setsMacAddressPCServer(String sMacAddressPCServer) {
		this.sMacAddressPCServer = sMacAddressPCServer;
	}

	public Boolean getIsConDeep() {
		return isConDeep;
	}

	public void setIsConDeep(Boolean isConDeep) {
		this.isConDeep = isConDeep;
	}

	public DatosDeep getDatosDeep() {
		return datosDeep;
	}

	public void setDatosDeep(DatosDeep datosDeep) {
		this.datosDeep = datosDeep;
	}

	
	public Boolean getIsConExportar() {
		return isConExportar;
	}

	public void setIsConExportar(Boolean isConExportar) {
		this.isConExportar = isConExportar;
	}

	
	public DatosExportar getDatosExportar() {
		return datosExportar;
	}

	public void setDatosExportar(DatosExportar datosExportar) {
		this.datosExportar = datosExportar;
	}

	public void setDatosDeepParametros(Boolean isDeep,DeepLoadType deepLoadType,ArrayList<Classe> clases,String strTituloMensaje) {
		this.datosDeep.setIsDeep(isDeep);
		this.datosDeep.setDeepLoadType(deepLoadType);
		this.datosDeep.setClases(clases);
		this.datosDeep.setSTituloMensaje(strTituloMensaje);
	}
	
	public void setDatosExportarParametros(String sTipo,Boolean conCabecera,String sDelimiter,String sPath) {		
		this.datosExportar.setsTipo(sTipo);		
		this.datosExportar.setConCabecera(conCabecera);
		this.datosExportar.setsDelimiter(sDelimiter);
		this.datosExportar.setsPath(sPath);
		
	}
}
