/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.seguridad.presentation.web.jsf.sessionbean;

import java.sql.Timestamp;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.seguridad.business.entity.*;

@SuppressWarnings("unused")
public class HistorialCambioClaveSessionBean  extends HistorialCambioClaveSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeHistorialCambioClave;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialCambioClave;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClave;
	protected Long lIdHistorialCambioClaveActualForeignKey;	
	
	protected Long lIdHistorialCambioClaveActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClaveParaPosibleAtras;
	protected String sUltimaBusquedaHistorialCambioClave;
	protected String sServletGenerarHtmlReporte;
	
	protected Integer iNumeroPaginacion;
	protected Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=true;	
	protected String sStyleDivArbol="";	
	protected String sStyleDivContent="";
	protected String sStyleDivOpcionesBanner="";	
	protected String sStyleDivExpandirColapsar="";	
	
	protected String sFuncionBusquedaRapida="";
	
	
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	
	private Long id;
	private Long id_usuario;
	private Timestamp fecha_hora;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected HistorialCambioClaveSessionBeanAdditional historialcambioclaveSessionBeanAdditional=null;
	
	public HistorialCambioClaveSessionBeanAdditional getHistorialCambioClaveSessionBeanAdditional() {
		return this.historialcambioclaveSessionBeanAdditional;
	}
	
	public void setHistorialCambioClaveSessionBeanAdditional(HistorialCambioClaveSessionBeanAdditional historialcambioclaveSessionBeanAdditional) {
		try {
			this.historialcambioclaveSessionBeanAdditional=historialcambioclaveSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public HistorialCambioClaveSessionBean () {
		this.inicializarHistorialCambioClaveSessionBean();
	}
	
	public void inicializarHistorialCambioClaveSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeHistorialCambioClave=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialCambioClave="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClave=false;
		this.lIdHistorialCambioClaveActualForeignKey=0L;
		this.lIdHistorialCambioClaveActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClaveParaPosibleAtras=false;
		this.sUltimaBusquedaHistorialCambioClave ="";
		this.sServletGenerarHtmlReporte="";
		
		this.iNumeroPaginacion=10;
		this.iNumeroPaginacionPagina=0;
		this.sPathNavegacionActual="";
		this.sFuncionBusquedaRapida="";
		
		this.sStyleDivArbol="display:none;width:0px;height:0px;visibility:hidden";
		this.sStyleDivContent="height:800px;width:100%";;
		this.sStyleDivOpcionesBanner="display:none";
		this.sStyleDivExpandirColapsar="display:none";
		this.isPaginaPopup=true;
		
		this.estaModoGuardarRelaciones=true;
		
		this.conGuardarRelaciones=false;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L; 
		
		
		
 		this.id_usuario=-1L;
 		this.fecha_hora=new Timestamp((new Date()).getTime());
		
		
		
		
		
    } 
	
	public void setPaginaPopupVariables(Boolean isPopupVariables) { 		
		if(isPopupVariables) {
			if(!this.isPaginaPopup) {
				this.sStyleDivArbol="display:none;width:0px;height:0px;visibility:hidden";
				this.sStyleDivContent="height:800px;width:100%";;
				this.sStyleDivOpcionesBanner="display:none";
				this.sStyleDivExpandirColapsar="display:none";
				this.isPaginaPopup=true;
			}
		} else {
			if(this.isPaginaPopup) {
				this.sStyleDivArbol="display:table-row;width:15%;height:600px;visibility:visible;overflow:auto;";	
				this.sStyleDivContent="height:600px;width:80%";
				this.sStyleDivOpcionesBanner="display:table-row";
				this.sStyleDivExpandirColapsar="display:table-row";
				this.isPaginaPopup=false;
			}
		}
	}
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeHistorialCambioClave() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeHistorialCambioClave;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeHistorialCambioClave(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeHistorialCambioClave) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeHistorialCambioClave= isPermiteNavegacionHaciaForeignKeyDesdeHistorialCambioClave;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialCambioClave() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialCambioClave;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialCambioClave(String sNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialCambioClave) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialCambioClave = sNombrePaginaNavegacionHaciaForeignKeyDesdeHistorialCambioClave;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClave() {
		return isBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClave;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClave(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClave) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClave= isBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClave;
	}
					
	public Long getlIdHistorialCambioClaveActualForeignKey() {
		return lIdHistorialCambioClaveActualForeignKey;
	}

	public void setlIdHistorialCambioClaveActualForeignKey(
			Long lIdHistorialCambioClaveActualForeignKey) {
		this.lIdHistorialCambioClaveActualForeignKey = lIdHistorialCambioClaveActualForeignKey;
	}
				    
	public Long getlIdHistorialCambioClaveActualForeignKeyParaPosibleAtras() {
		return lIdHistorialCambioClaveActualForeignKeyParaPosibleAtras;
	}

	public void setlIdHistorialCambioClaveActualForeignKeyParaPosibleAtras(
			Long lIdHistorialCambioClaveActualForeignKeyParaPosibleAtras) {
		this.lIdHistorialCambioClaveActualForeignKeyParaPosibleAtras = lIdHistorialCambioClaveActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClaveParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClaveParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClaveParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClaveParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClaveParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyHistorialCambioClaveParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaHistorialCambioClave() {
		return sUltimaBusquedaHistorialCambioClave;
	}

	public void setsUltimaBusquedaHistorialCambioClave(String sUltimaBusquedaHistorialCambioClave) {
		this.sUltimaBusquedaHistorialCambioClave = sUltimaBusquedaHistorialCambioClave;
	}
	
	public String getsServletGenerarHtmlReporte() {
		return sServletGenerarHtmlReporte;
	}

	public void setsServletGenerarHtmlReporte(String sServletGenerarHtmlReporte) {
		this.sServletGenerarHtmlReporte = sServletGenerarHtmlReporte;
	}
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	public String getsPathNavegacionActual() {
		return this.sPathNavegacionActual;
	}

	public void setsPathNavegacionActual(String sPathNavegacionActual) {
		this.sPathNavegacionActual = sPathNavegacionActual;
	}
	
	public Boolean getisPaginaPopup() {
		return this.isPaginaPopup;
	}

	public void setisPaginaPopup(Boolean isPaginaPopup) {
		this.isPaginaPopup = isPaginaPopup;
	}	
	
	public String getsStyleDivArbol() {
		return this.sStyleDivArbol;
	}

	public void setsStyleDivArbol(String sStyleDivArbol) {
		this.sStyleDivArbol = sStyleDivArbol;
	}
	
	public String getsStyleDivContent() {
		return this.sStyleDivContent;
	}

	public void setsStyleDivContent(String sStyleDivContent) {
		this.sStyleDivContent = sStyleDivContent;
	}
	
	public String getsStyleDivOpcionesBanner() {
		return this.sStyleDivOpcionesBanner;
	}

	public void setsStyleDivOpcionesBanner(String sStyleDivOpcionesBanner) {
		this.sStyleDivOpcionesBanner = sStyleDivOpcionesBanner;
	}	
	
	public String getsStyleDivExpandirColapsar() {
		return this.sStyleDivExpandirColapsar;
	}

	public void setsStyleDivExpandirColapsar(String sStyleDivExpandirColapsar) {
		this.sStyleDivExpandirColapsar = sStyleDivExpandirColapsar;
	}		
	
	public String getsFuncionBusquedaRapida() {
		return this.sFuncionBusquedaRapida;
	}

	public void setsFuncionBusquedaRapida(String sFuncionBusquedaRapida) {
		this.sFuncionBusquedaRapida = sFuncionBusquedaRapida;
	}
	
	public Boolean getConGuardarRelaciones() {
		return this.conGuardarRelaciones;
	}

	public void setConGuardarRelaciones(Boolean conGuardarRelaciones) {
		this.conGuardarRelaciones = conGuardarRelaciones;
	}	
	
	public Boolean getEstaModoGuardarRelaciones() {
		return this.estaModoGuardarRelaciones;
	}

	public void setEstaModoGuardarRelaciones(Boolean estaModoGuardarRelaciones) {
		this.estaModoGuardarRelaciones = estaModoGuardarRelaciones;
	}	
	
	public Boolean getEsGuardarRelacionado() {
		return this.esGuardarRelacionado;
	}

	public void setEsGuardarRelacionado(Boolean esGuardarRelacionado) {
		this.esGuardarRelacionado = esGuardarRelacionado;
	}	
	
	public Boolean getEstaModoBusqueda() {
		return this.estaModoBusqueda;
	}

	public void setEstaModoBusqueda(Boolean estaModoBusqueda) {
		this.estaModoBusqueda = estaModoBusqueda;
	}
	
	public Boolean getNoMantenimiento() {
		return this.noMantenimiento;
	}

	public void setNoMantenimiento(Boolean noMantenimiento) {
		this.noMantenimiento = noMantenimiento;
	}
	
    
	public Long getid() {
		return this.id;
	}
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public Timestamp getfecha_hora() {
		return this.fecha_hora;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("HistorialCambioClave:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("HistorialCambioClave:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_hora(Timestamp newfecha_hora)throws Exception
	{
		try {
			if(this.fecha_hora!=newfecha_hora) {
				if(newfecha_hora==null) {
					//newfecha_hora=new Timestamp((new Date()).getTime());
					if(Constantes.ISDEVELOPING) {
						System.out.println("HistorialCambioClave:Valor nulo no permitido en columna fecha_hora");
					}
				}

				this.fecha_hora=newfecha_hora;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionUsuario() {
		return isBusquedaDesdeForeignKeySesionUsuario;
	}

	public void setisBusquedaDesdeForeignKeySesionUsuario(
		Boolean isBusquedaDesdeForeignKeySesionUsuario) {
		this.isBusquedaDesdeForeignKeySesionUsuario = isBusquedaDesdeForeignKeySesionUsuario;
	}

	public Long getlidUsuarioActual() {
		return lidUsuarioActual;
	}

	public void setlidUsuarioActual(Long lidUsuarioActual) {
		this.lidUsuarioActual = lidUsuarioActual;
	}
	
	
		
	
}
