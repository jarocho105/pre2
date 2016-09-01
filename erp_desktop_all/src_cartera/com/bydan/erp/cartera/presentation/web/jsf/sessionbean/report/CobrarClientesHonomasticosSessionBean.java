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
public class CobrarClientesHonomasticosSessionBean  extends CobrarClientesHonomasticosSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticos;
	protected Long lIdCobrarClientesHonomasticosActualForeignKey;	
	
	protected Long lIdCobrarClientesHonomasticosActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticosParaPosibleAtras;
	protected String sUltimaBusquedaCobrarClientesHonomasticos;
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
	private Date fecha_nacimiento;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CobrarClientesHonomasticosSessionBeanAdditional cobrarclienteshonomasticosSessionBeanAdditional=null;
	
	public CobrarClientesHonomasticosSessionBeanAdditional getCobrarClientesHonomasticosSessionBeanAdditional() {
		return this.cobrarclienteshonomasticosSessionBeanAdditional;
	}
	
	public void setCobrarClientesHonomasticosSessionBeanAdditional(CobrarClientesHonomasticosSessionBeanAdditional cobrarclienteshonomasticosSessionBeanAdditional) {
		try {
			this.cobrarclienteshonomasticosSessionBeanAdditional=cobrarclienteshonomasticosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CobrarClientesHonomasticosSessionBean () {
		this.inicializarCobrarClientesHonomasticosSessionBean();
	}
	
	public void inicializarCobrarClientesHonomasticosSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticos=false;
		this.lIdCobrarClientesHonomasticosActualForeignKey=0L;
		this.lIdCobrarClientesHonomasticosActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticosParaPosibleAtras=false;
		this.sUltimaBusquedaCobrarClientesHonomasticos ="";
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
 		this.fecha_nacimiento=new Date();
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos= isPermiteNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos = sNombrePaginaNavegacionHaciaForeignKeyDesdeCobrarClientesHonomasticos;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticos() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticos;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticos(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticos) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticos= isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticos;
	}
					
	public Long getlIdCobrarClientesHonomasticosActualForeignKey() {
		return lIdCobrarClientesHonomasticosActualForeignKey;
	}

	public void setlIdCobrarClientesHonomasticosActualForeignKey(
			Long lIdCobrarClientesHonomasticosActualForeignKey) {
		this.lIdCobrarClientesHonomasticosActualForeignKey = lIdCobrarClientesHonomasticosActualForeignKey;
	}
				    
	public Long getlIdCobrarClientesHonomasticosActualForeignKeyParaPosibleAtras() {
		return lIdCobrarClientesHonomasticosActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCobrarClientesHonomasticosActualForeignKeyParaPosibleAtras(
			Long lIdCobrarClientesHonomasticosActualForeignKeyParaPosibleAtras) {
		this.lIdCobrarClientesHonomasticosActualForeignKeyParaPosibleAtras = lIdCobrarClientesHonomasticosActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticosParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticosParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticosParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticosParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticosParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCobrarClientesHonomasticosParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCobrarClientesHonomasticos() {
		return sUltimaBusquedaCobrarClientesHonomasticos;
	}

	public void setsUltimaBusquedaCobrarClientesHonomasticos(String sUltimaBusquedaCobrarClientesHonomasticos) {
		this.sUltimaBusquedaCobrarClientesHonomasticos = sUltimaBusquedaCobrarClientesHonomasticos;
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
    
	public Date getfecha_nacimiento() {
		return this.fecha_nacimiento;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CobrarClientesHonomasticos:Valor nulo no permitido en columna id");
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
						System.out.println("CobrarClientesHonomasticos:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("CobrarClientesHonomasticos:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("CobrarClientesHonomasticos:Valor nulo no permitido en columna id_pais");
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
						System.out.println("CobrarClientesHonomasticos:Valor nulo no permitido en columna id_region");
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
						System.out.println("CobrarClientesHonomasticos:Valor nulo no permitido en columna id_provincia");
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
						System.out.println("CobrarClientesHonomasticos:Valor nulo no permitido en columna id_ciudad");
					}
				}

				this.id_ciudad=newid_ciudad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_nacimiento(Date newfecha_nacimiento)throws Exception
	{
		try {
			if(this.fecha_nacimiento!=newfecha_nacimiento) {
				if(newfecha_nacimiento==null) {
					//newfecha_nacimiento=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("CobrarClientesHonomasticos:Valor nulo no permitido en columna fecha_nacimiento");
					}
				}

				this.fecha_nacimiento=newfecha_nacimiento;
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
