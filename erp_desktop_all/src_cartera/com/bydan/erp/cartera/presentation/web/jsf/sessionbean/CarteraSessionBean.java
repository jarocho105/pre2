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
package com.bydan.erp.cartera.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.cartera.business.entity.*;

@SuppressWarnings("unused")
public class CarteraSessionBean  extends CarteraSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCartera;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCartera;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCartera;
	protected Long lIdCarteraActualForeignKey;	
	
	protected Long lIdCarteraActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCarteraParaPosibleAtras;
	protected String sUltimaBusquedaCartera;
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
	
					
	 	
		
	
	protected CarteraSessionBeanAdditional carteraSessionBeanAdditional=null;
	
	public CarteraSessionBeanAdditional getCarteraSessionBeanAdditional() {
		return this.carteraSessionBeanAdditional;
	}
	
	public void setCarteraSessionBeanAdditional(CarteraSessionBeanAdditional carteraSessionBeanAdditional) {
		try {
			this.carteraSessionBeanAdditional=carteraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CarteraSessionBean () {
		this.inicializarCarteraSessionBean();
	}
	
	public void inicializarCarteraSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCartera=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCartera="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCartera=false;
		this.lIdCarteraActualForeignKey=0L;
		this.lIdCarteraActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCarteraParaPosibleAtras=false;
		this.sUltimaBusquedaCartera ="";
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCartera() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCartera;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCartera(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCartera) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCartera= isPermiteNavegacionHaciaForeignKeyDesdeCartera;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCartera() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCartera;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCartera(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCartera) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCartera = sNombrePaginaNavegacionHaciaForeignKeyDesdeCartera;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCartera() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCartera;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCartera(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCartera) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCartera= isBusquedaDesdeForeignKeySesionForeignKeyCartera;
	}
					
	public Long getlIdCarteraActualForeignKey() {
		return lIdCarteraActualForeignKey;
	}

	public void setlIdCarteraActualForeignKey(
			Long lIdCarteraActualForeignKey) {
		this.lIdCarteraActualForeignKey = lIdCarteraActualForeignKey;
	}
				    
	public Long getlIdCarteraActualForeignKeyParaPosibleAtras() {
		return lIdCarteraActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCarteraActualForeignKeyParaPosibleAtras(
			Long lIdCarteraActualForeignKeyParaPosibleAtras) {
		this.lIdCarteraActualForeignKeyParaPosibleAtras = lIdCarteraActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCarteraParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCarteraParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCarteraParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCarteraParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCarteraParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCarteraParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCartera() {
		return sUltimaBusquedaCartera;
	}

	public void setsUltimaBusquedaCartera(String sUltimaBusquedaCartera) {
		this.sUltimaBusquedaCartera = sUltimaBusquedaCartera;
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
						System.out.println("Cartera:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
