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
public class TipoIdentificacionSessionBean  extends TipoIdentificacionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoIdentificacion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIdentificacion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion;
	protected Long lIdTipoIdentificacionActualForeignKey;	
	
	protected Long lIdTipoIdentificacionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacionParaPosibleAtras;
	protected String sUltimaBusquedaTipoIdentificacion;
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
	
					
	 	
		
	
	protected TipoIdentificacionSessionBeanAdditional tipoidentificacionSessionBeanAdditional=null;
	
	public TipoIdentificacionSessionBeanAdditional getTipoIdentificacionSessionBeanAdditional() {
		return this.tipoidentificacionSessionBeanAdditional;
	}
	
	public void setTipoIdentificacionSessionBeanAdditional(TipoIdentificacionSessionBeanAdditional tipoidentificacionSessionBeanAdditional) {
		try {
			this.tipoidentificacionSessionBeanAdditional=tipoidentificacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoIdentificacionSessionBean () {
		this.inicializarTipoIdentificacionSessionBean();
	}
	
	public void inicializarTipoIdentificacionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoIdentificacion=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIdentificacion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion=false;
		this.lIdTipoIdentificacionActualForeignKey=0L;
		this.lIdTipoIdentificacionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacionParaPosibleAtras=false;
		this.sUltimaBusquedaTipoIdentificacion ="";
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoIdentificacion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoIdentificacion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoIdentificacion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoIdentificacion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoIdentificacion= isPermiteNavegacionHaciaForeignKeyDesdeTipoIdentificacion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIdentificacion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIdentificacion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIdentificacion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIdentificacion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIdentificacion = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoIdentificacion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion= isBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacion;
	}
					
	public Long getlIdTipoIdentificacionActualForeignKey() {
		return lIdTipoIdentificacionActualForeignKey;
	}

	public void setlIdTipoIdentificacionActualForeignKey(
			Long lIdTipoIdentificacionActualForeignKey) {
		this.lIdTipoIdentificacionActualForeignKey = lIdTipoIdentificacionActualForeignKey;
	}
				    
	public Long getlIdTipoIdentificacionActualForeignKeyParaPosibleAtras() {
		return lIdTipoIdentificacionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoIdentificacionActualForeignKeyParaPosibleAtras(
			Long lIdTipoIdentificacionActualForeignKeyParaPosibleAtras) {
		this.lIdTipoIdentificacionActualForeignKeyParaPosibleAtras = lIdTipoIdentificacionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoIdentificacionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoIdentificacion() {
		return sUltimaBusquedaTipoIdentificacion;
	}

	public void setsUltimaBusquedaTipoIdentificacion(String sUltimaBusquedaTipoIdentificacion) {
		this.sUltimaBusquedaTipoIdentificacion = sUltimaBusquedaTipoIdentificacion;
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
						System.out.println("TipoIdentificacion:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	
		
	
}
