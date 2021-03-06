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
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class TipoRetencionIvaSessionBean  extends TipoRetencionIvaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoRetencionIva;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRetencionIva;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIva;
	protected Long lIdTipoRetencionIvaActualForeignKey;	
	
	protected Long lIdTipoRetencionIvaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIvaParaPosibleAtras;
	protected String sUltimaBusquedaTipoRetencionIva;
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
	
					
	 	
		
	
	protected TipoRetencionIvaSessionBeanAdditional tiporetencionivaSessionBeanAdditional=null;
	
	public TipoRetencionIvaSessionBeanAdditional getTipoRetencionIvaSessionBeanAdditional() {
		return this.tiporetencionivaSessionBeanAdditional;
	}
	
	public void setTipoRetencionIvaSessionBeanAdditional(TipoRetencionIvaSessionBeanAdditional tiporetencionivaSessionBeanAdditional) {
		try {
			this.tiporetencionivaSessionBeanAdditional=tiporetencionivaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoRetencionIvaSessionBean () {
		this.inicializarTipoRetencionIvaSessionBean();
	}
	
	public void inicializarTipoRetencionIvaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoRetencionIva=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRetencionIva="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIva=false;
		this.lIdTipoRetencionIvaActualForeignKey=0L;
		this.lIdTipoRetencionIvaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIvaParaPosibleAtras=false;
		this.sUltimaBusquedaTipoRetencionIva ="";
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoRetencionIva() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoRetencionIva;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoRetencionIva(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoRetencionIva) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoRetencionIva= isPermiteNavegacionHaciaForeignKeyDesdeTipoRetencionIva;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRetencionIva() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRetencionIva;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRetencionIva(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRetencionIva) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRetencionIva = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoRetencionIva;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIva() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIva;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIva(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIva) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIva= isBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIva;
	}
					
	public Long getlIdTipoRetencionIvaActualForeignKey() {
		return lIdTipoRetencionIvaActualForeignKey;
	}

	public void setlIdTipoRetencionIvaActualForeignKey(
			Long lIdTipoRetencionIvaActualForeignKey) {
		this.lIdTipoRetencionIvaActualForeignKey = lIdTipoRetencionIvaActualForeignKey;
	}
				    
	public Long getlIdTipoRetencionIvaActualForeignKeyParaPosibleAtras() {
		return lIdTipoRetencionIvaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoRetencionIvaActualForeignKeyParaPosibleAtras(
			Long lIdTipoRetencionIvaActualForeignKeyParaPosibleAtras) {
		this.lIdTipoRetencionIvaActualForeignKeyParaPosibleAtras = lIdTipoRetencionIvaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIvaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIvaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIvaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIvaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIvaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionIvaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoRetencionIva() {
		return sUltimaBusquedaTipoRetencionIva;
	}

	public void setsUltimaBusquedaTipoRetencionIva(String sUltimaBusquedaTipoRetencionIva) {
		this.sUltimaBusquedaTipoRetencionIva = sUltimaBusquedaTipoRetencionIva;
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
						System.out.println("TipoRetencionIva:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
