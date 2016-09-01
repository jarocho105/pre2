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
package com.bydan.erp.inventario.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.inventario.business.entity.*;

@SuppressWarnings("unused")
public class TipoListaPrecioSessionBean  extends TipoListaPrecioSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoListaPrecio;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoListaPrecio;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecio;
	protected Long lIdTipoListaPrecioActualForeignKey;	
	
	protected Long lIdTipoListaPrecioActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecioParaPosibleAtras;
	protected String sUltimaBusquedaTipoListaPrecio;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionEmpresa;
	Long lidEmpresaActual;
	
	private Long id;
	private Long id_empresa;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected TipoListaPrecioSessionBeanAdditional tipolistaprecioSessionBeanAdditional=null;
	
	public TipoListaPrecioSessionBeanAdditional getTipoListaPrecioSessionBeanAdditional() {
		return this.tipolistaprecioSessionBeanAdditional;
	}
	
	public void setTipoListaPrecioSessionBeanAdditional(TipoListaPrecioSessionBeanAdditional tipolistaprecioSessionBeanAdditional) {
		try {
			this.tipolistaprecioSessionBeanAdditional=tipolistaprecioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public TipoListaPrecioSessionBean () {
		this.inicializarTipoListaPrecioSessionBean();
	}
	
	public void inicializarTipoListaPrecioSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoListaPrecio=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoListaPrecio="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecio=false;
		this.lIdTipoListaPrecioActualForeignKey=0L;
		this.lIdTipoListaPrecioActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecioParaPosibleAtras=false;
		this.sUltimaBusquedaTipoListaPrecio ="";
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
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeTipoListaPrecio() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeTipoListaPrecio;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeTipoListaPrecio(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeTipoListaPrecio) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeTipoListaPrecio= isPermiteNavegacionHaciaForeignKeyDesdeTipoListaPrecio;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoListaPrecio() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoListaPrecio;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoListaPrecio(String sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoListaPrecio) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoListaPrecio = sNombrePaginaNavegacionHaciaForeignKeyDesdeTipoListaPrecio;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecio() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecio;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecio(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecio) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecio= isBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecio;
	}
					
	public Long getlIdTipoListaPrecioActualForeignKey() {
		return lIdTipoListaPrecioActualForeignKey;
	}

	public void setlIdTipoListaPrecioActualForeignKey(
			Long lIdTipoListaPrecioActualForeignKey) {
		this.lIdTipoListaPrecioActualForeignKey = lIdTipoListaPrecioActualForeignKey;
	}
				    
	public Long getlIdTipoListaPrecioActualForeignKeyParaPosibleAtras() {
		return lIdTipoListaPrecioActualForeignKeyParaPosibleAtras;
	}

	public void setlIdTipoListaPrecioActualForeignKeyParaPosibleAtras(
			Long lIdTipoListaPrecioActualForeignKeyParaPosibleAtras) {
		this.lIdTipoListaPrecioActualForeignKeyParaPosibleAtras = lIdTipoListaPrecioActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecioParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecioParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecioParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecioParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecioParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecioParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaTipoListaPrecio() {
		return sUltimaBusquedaTipoListaPrecio;
	}

	public void setsUltimaBusquedaTipoListaPrecio(String sUltimaBusquedaTipoListaPrecio) {
		this.sUltimaBusquedaTipoListaPrecio = sUltimaBusquedaTipoListaPrecio;
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
    
	public Long getid_empresa() {
		return this.id_empresa;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoListaPrecio:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empresa(Long newid_empresa)throws Exception
	{
		try {
			if(this.id_empresa!=newid_empresa) {
				if(newid_empresa==null) {
					//newid_empresa=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("TipoListaPrecio:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionEmpresa() {
		return isBusquedaDesdeForeignKeySesionEmpresa;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpresa(
		Boolean isBusquedaDesdeForeignKeySesionEmpresa) {
		this.isBusquedaDesdeForeignKeySesionEmpresa = isBusquedaDesdeForeignKeySesionEmpresa;
	}

	public Long getlidEmpresaActual() {
		return lidEmpresaActual;
	}

	public void setlidEmpresaActual(Long lidEmpresaActual) {
		this.lidEmpresaActual = lidEmpresaActual;
	}
	
	
		
	
}
