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
public class CobrarClientesPorRegionSessionBean  extends CobrarClientesPorRegionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegion;
	protected Long lIdCobrarClientesPorRegionActualForeignKey;	
	
	protected Long lIdCobrarClientesPorRegionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegionParaPosibleAtras;
	protected String sUltimaBusquedaCobrarClientesPorRegion;
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
	Boolean isBusquedaDesdeForeignKeySesionSucursal;
	Long lidSucursalActual;
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionRegion;
	Long lidRegionActual;
	Boolean isBusquedaDesdeForeignKeySesionProvincia;
	Long lidProvinciaActual;
	Boolean isBusquedaDesdeForeignKeySesionCiudad;
	Long lidCiudadActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_pais;
	private Long id_region;
	private Long id_provincia;
	private Long id_ciudad;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CobrarClientesPorRegionSessionBeanAdditional cobrarclientesporregionSessionBeanAdditional=null;
	
	public CobrarClientesPorRegionSessionBeanAdditional getCobrarClientesPorRegionSessionBeanAdditional() {
		return this.cobrarclientesporregionSessionBeanAdditional;
	}
	
	public void setCobrarClientesPorRegionSessionBeanAdditional(CobrarClientesPorRegionSessionBeanAdditional cobrarclientesporregionSessionBeanAdditional) {
		try {
			this.cobrarclientesporregionSessionBeanAdditional=cobrarclientesporregionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CobrarClientesPorRegionSessionBean () {
		this.inicializarCobrarClientesPorRegionSessionBean();
	}
	
	public void inicializarCobrarClientesPorRegionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegion=false;
		this.lIdCobrarClientesPorRegionActualForeignKey=0L;
		this.lIdCobrarClientesPorRegionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegionParaPosibleAtras=false;
		this.sUltimaBusquedaCobrarClientesPorRegion ="";
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
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionRegion=false;
		lidRegionActual=0L;
		isBusquedaDesdeForeignKeySesionProvincia=false;
		lidProvinciaActual=0L;
		isBusquedaDesdeForeignKeySesionCiudad=false;
		lidCiudadActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_pais=-1L;
 		this.id_region=-1L;
 		this.id_provincia=-1L;
 		this.id_ciudad=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion= isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion = sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesPorRegion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegion= isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegion;
	}
					
	public Long getlIdCobrarClientesPorRegionActualForeignKey() {
		return lIdCobrarClientesPorRegionActualForeignKey;
	}

	public void setlIdCobrarClientesPorRegionActualForeignKey(
			Long lIdCobrarClientesPorRegionActualForeignKey) {
		this.lIdCobrarClientesPorRegionActualForeignKey = lIdCobrarClientesPorRegionActualForeignKey;
	}
				    
	public Long getlIdCobrarClientesPorRegionActualForeignKeyParaPosibleAtras() {
		return lIdCobrarClientesPorRegionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCobrarClientesPorRegionActualForeignKeyParaPosibleAtras(
			Long lIdCobrarClientesPorRegionActualForeignKeyParaPosibleAtras) {
		this.lIdCobrarClientesPorRegionActualForeignKeyParaPosibleAtras = lIdCobrarClientesPorRegionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesPorRegionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCobrarClientesPorRegion() {
		return sUltimaBusquedaCobrarClientesPorRegion;
	}

	public void setsUltimaBusquedaCobrarClientesPorRegion(String sUltimaBusquedaCobrarClientesPorRegion) {
		this.sUltimaBusquedaCobrarClientesPorRegion = sUltimaBusquedaCobrarClientesPorRegion;
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
    
	public Long getid_sucursal() {
		return this.id_sucursal;
	}
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_region() {
		return this.id_region;
	}
    
	public Long getid_provincia() {
		return this.id_provincia;
	}
    
	public Long getid_ciudad() {
		return this.id_ciudad;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CobrarClientesPorRegion:Valor nulo no permitido en columna id");
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
						System.out.println("CobrarClientesPorRegion:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_sucursal(Long newid_sucursal)throws Exception
	{
		try {
			if(this.id_sucursal!=newid_sucursal) {
				if(newid_sucursal==null) {
					//newid_sucursal=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CobrarClientesPorRegion:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_pais(Long newid_pais)throws Exception
	{
		try {
			if(this.id_pais!=newid_pais) {
				if(newid_pais==null) {
					//newid_pais=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CobrarClientesPorRegion:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_region(Long newid_region)throws Exception
	{
		try {
			if(this.id_region!=newid_region) {
				if(newid_region==null) {
					//newid_region=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CobrarClientesPorRegion:Valor nulo no permitido en columna id_region");
					}
				}

				this.id_region=newid_region;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_provincia(Long newid_provincia)throws Exception
	{
		try {
			if(this.id_provincia!=newid_provincia) {
				if(newid_provincia==null) {
					//newid_provincia=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CobrarClientesPorRegion:Valor nulo no permitido en columna id_provincia");
					}
				}

				this.id_provincia=newid_provincia;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ciudad(Long newid_ciudad)throws Exception
	{
		try {
			if(this.id_ciudad!=newid_ciudad) {
				if(newid_ciudad==null) {
					//newid_ciudad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CobrarClientesPorRegion:Valor nulo no permitido en columna id_ciudad");
					}
				}

				this.id_ciudad=newid_ciudad;
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
	public Boolean getisBusquedaDesdeForeignKeySesionSucursal() {
		return isBusquedaDesdeForeignKeySesionSucursal;
	}

	public void setisBusquedaDesdeForeignKeySesionSucursal(
		Boolean isBusquedaDesdeForeignKeySesionSucursal) {
		this.isBusquedaDesdeForeignKeySesionSucursal = isBusquedaDesdeForeignKeySesionSucursal;
	}

	public Long getlidSucursalActual() {
		return lidSucursalActual;
	}

	public void setlidSucursalActual(Long lidSucursalActual) {
		this.lidSucursalActual = lidSucursalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPais() {
		return isBusquedaDesdeForeignKeySesionPais;
	}

	public void setisBusquedaDesdeForeignKeySesionPais(
		Boolean isBusquedaDesdeForeignKeySesionPais) {
		this.isBusquedaDesdeForeignKeySesionPais = isBusquedaDesdeForeignKeySesionPais;
	}

	public Long getlidPaisActual() {
		return lidPaisActual;
	}

	public void setlidPaisActual(Long lidPaisActual) {
		this.lidPaisActual = lidPaisActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionRegion() {
		return isBusquedaDesdeForeignKeySesionRegion;
	}

	public void setisBusquedaDesdeForeignKeySesionRegion(
		Boolean isBusquedaDesdeForeignKeySesionRegion) {
		this.isBusquedaDesdeForeignKeySesionRegion = isBusquedaDesdeForeignKeySesionRegion;
	}

	public Long getlidRegionActual() {
		return lidRegionActual;
	}

	public void setlidRegionActual(Long lidRegionActual) {
		this.lidRegionActual = lidRegionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionProvincia() {
		return isBusquedaDesdeForeignKeySesionProvincia;
	}

	public void setisBusquedaDesdeForeignKeySesionProvincia(
		Boolean isBusquedaDesdeForeignKeySesionProvincia) {
		this.isBusquedaDesdeForeignKeySesionProvincia = isBusquedaDesdeForeignKeySesionProvincia;
	}

	public Long getlidProvinciaActual() {
		return lidProvinciaActual;
	}

	public void setlidProvinciaActual(Long lidProvinciaActual) {
		this.lidProvinciaActual = lidProvinciaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCiudad() {
		return isBusquedaDesdeForeignKeySesionCiudad;
	}

	public void setisBusquedaDesdeForeignKeySesionCiudad(
		Boolean isBusquedaDesdeForeignKeySesionCiudad) {
		this.isBusquedaDesdeForeignKeySesionCiudad = isBusquedaDesdeForeignKeySesionCiudad;
	}

	public Long getlidCiudadActual() {
		return lidCiudadActual;
	}

	public void setlidCiudadActual(Long lidCiudadActual) {
		this.lidCiudadActual = lidCiudadActual;
	}
	
	
		
	
}
