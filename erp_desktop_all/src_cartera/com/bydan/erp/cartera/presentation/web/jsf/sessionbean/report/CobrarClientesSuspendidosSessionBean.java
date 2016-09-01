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
package com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.cartera.business.entity.*;

@SuppressWarnings("unused")
public class CobrarClientesSuspendidosSessionBean  extends CobrarClientesSuspendidosSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidos;
	protected Long lIdCobrarClientesSuspendidosActualForeignKey;	
	
	protected Long lIdCobrarClientesSuspendidosActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidosParaPosibleAtras;
	protected String sUltimaBusquedaCobrarClientesSuspendidos;
	protected String sServletGenerarHtmlReporte;
	
	protected Integer iNumeroPaginacion;
	protected Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=false;	
	protected String sStyleDivArbol="";	
	protected String sStyleDivContent="";
	protected String sStyleDivOpcionesBanner="";	
	protected String sStyleDivExpandirColapsar="";	
	
	protected String sFuncionBusquedaRapida="";
	
	
	
	private Long id;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CobrarClientesSuspendidosSessionBeanAdditional cobrarclientessuspendidosSessionBeanAdditional=null;
	
	public CobrarClientesSuspendidosSessionBeanAdditional getCobrarClientesSuspendidosSessionBeanAdditional() {
		return this.cobrarclientessuspendidosSessionBeanAdditional;
	}
	
	public void setCobrarClientesSuspendidosSessionBeanAdditional(CobrarClientesSuspendidosSessionBeanAdditional cobrarclientessuspendidosSessionBeanAdditional) {
		try {
			this.cobrarclientessuspendidosSessionBeanAdditional=cobrarclientessuspendidosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CobrarClientesSuspendidosSessionBean () {
		this.inicializarCobrarClientesSuspendidosSessionBean();
	}
	
	public void inicializarCobrarClientesSuspendidosSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidos=false;
		this.lIdCobrarClientesSuspendidosActualForeignKey=0L;
		this.lIdCobrarClientesSuspendidosActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidosParaPosibleAtras=false;
		this.sUltimaBusquedaCobrarClientesSuspendidos ="";
		this.sServletGenerarHtmlReporte="";
		
		this.iNumeroPaginacion=10;
		this.iNumeroPaginacionPagina=0;
		this.sPathNavegacionActual="";
		this.sFuncionBusquedaRapida="";
		
		this.sStyleDivArbol="display:table-row;width:20%;height:800px;visibility:visible";	
		this.sStyleDivContent="height:600px;width:80%";
		this.sStyleDivOpcionesBanner="display:table-row";
		this.sStyleDivExpandirColapsar="display:table-row";		
		this.isPaginaPopup=false;
		
		this.estaModoGuardarRelaciones=true;
		
		this.conGuardarRelaciones=false;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		 
		
		
		
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos= isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos = sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesSuspendidos;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidos() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidos;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidos(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidos) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidos= isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidos;
	}
					
	public Long getlIdCobrarClientesSuspendidosActualForeignKey() {
		return lIdCobrarClientesSuspendidosActualForeignKey;
	}

	public void setlIdCobrarClientesSuspendidosActualForeignKey(
			Long lIdCobrarClientesSuspendidosActualForeignKey) {
		this.lIdCobrarClientesSuspendidosActualForeignKey = lIdCobrarClientesSuspendidosActualForeignKey;
	}
				    
	public Long getlIdCobrarClientesSuspendidosActualForeignKeyParaPosibleAtras() {
		return lIdCobrarClientesSuspendidosActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCobrarClientesSuspendidosActualForeignKeyParaPosibleAtras(
			Long lIdCobrarClientesSuspendidosActualForeignKeyParaPosibleAtras) {
		this.lIdCobrarClientesSuspendidosActualForeignKeyParaPosibleAtras = lIdCobrarClientesSuspendidosActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidosParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidosParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidosParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidosParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidosParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesSuspendidosParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCobrarClientesSuspendidos() {
		return sUltimaBusquedaCobrarClientesSuspendidos;
	}

	public void setsUltimaBusquedaCobrarClientesSuspendidos(String sUltimaBusquedaCobrarClientesSuspendidos) {
		this.sUltimaBusquedaCobrarClientesSuspendidos = sUltimaBusquedaCobrarClientesSuspendidos;
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
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CobrarClientesSuspendidos:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
