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
public class UtilidadTipoPrecioSessionBean  extends UtilidadTipoPrecioSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecio;
	protected Long lIdUtilidadTipoPrecioActualForeignKey;	
	
	protected Long lIdUtilidadTipoPrecioActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecioParaPosibleAtras;
	protected String sUltimaBusquedaUtilidadTipoPrecio;
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
	Boolean isBusquedaDesdeForeignKeySesionTipoPrecio;
	Long lidTipoPrecioActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_tipo_precio;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected UtilidadTipoPrecioSessionBeanAdditional utilidadtipoprecioSessionBeanAdditional=null;
	
	public UtilidadTipoPrecioSessionBeanAdditional getUtilidadTipoPrecioSessionBeanAdditional() {
		return this.utilidadtipoprecioSessionBeanAdditional;
	}
	
	public void setUtilidadTipoPrecioSessionBeanAdditional(UtilidadTipoPrecioSessionBeanAdditional utilidadtipoprecioSessionBeanAdditional) {
		try {
			this.utilidadtipoprecioSessionBeanAdditional=utilidadtipoprecioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public UtilidadTipoPrecioSessionBean () {
		this.inicializarUtilidadTipoPrecioSessionBean();
	}
	
	public void inicializarUtilidadTipoPrecioSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecio=false;
		this.lIdUtilidadTipoPrecioActualForeignKey=0L;
		this.lIdUtilidadTipoPrecioActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecioParaPosibleAtras=false;
		this.sUltimaBusquedaUtilidadTipoPrecio ="";
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
		isBusquedaDesdeForeignKeySesionTipoPrecio=false;
		lidTipoPrecioActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_tipo_precio=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio= isPermiteNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio(String sNombrePaginaNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio = sNombrePaginaNavegacionHaciaForeignKeyDesdeUtilidadTipoPrecio;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecio() {
		return isBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecio;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecio(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecio) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecio= isBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecio;
	}
					
	public Long getlIdUtilidadTipoPrecioActualForeignKey() {
		return lIdUtilidadTipoPrecioActualForeignKey;
	}

	public void setlIdUtilidadTipoPrecioActualForeignKey(
			Long lIdUtilidadTipoPrecioActualForeignKey) {
		this.lIdUtilidadTipoPrecioActualForeignKey = lIdUtilidadTipoPrecioActualForeignKey;
	}
				    
	public Long getlIdUtilidadTipoPrecioActualForeignKeyParaPosibleAtras() {
		return lIdUtilidadTipoPrecioActualForeignKeyParaPosibleAtras;
	}

	public void setlIdUtilidadTipoPrecioActualForeignKeyParaPosibleAtras(
			Long lIdUtilidadTipoPrecioActualForeignKeyParaPosibleAtras) {
		this.lIdUtilidadTipoPrecioActualForeignKeyParaPosibleAtras = lIdUtilidadTipoPrecioActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecioParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecioParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecioParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecioParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecioParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyUtilidadTipoPrecioParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaUtilidadTipoPrecio() {
		return sUltimaBusquedaUtilidadTipoPrecio;
	}

	public void setsUltimaBusquedaUtilidadTipoPrecio(String sUltimaBusquedaUtilidadTipoPrecio) {
		this.sUltimaBusquedaUtilidadTipoPrecio = sUltimaBusquedaUtilidadTipoPrecio;
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
    
	public Long getid_tipo_precio() {
		return this.id_tipo_precio;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("UtilidadTipoPrecio:Valor nulo no permitido en columna id");
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
						System.out.println("UtilidadTipoPrecio:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("UtilidadTipoPrecio:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_precio(Long newid_tipo_precio)throws Exception
	{
		try {
			if(this.id_tipo_precio!=newid_tipo_precio) {
				if(newid_tipo_precio==null) {
					//newid_tipo_precio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("UtilidadTipoPrecio:Valor nulo no permitido en columna id_tipo_precio");
					}
				}

				this.id_tipo_precio=newid_tipo_precio;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoPrecio() {
		return isBusquedaDesdeForeignKeySesionTipoPrecio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoPrecio(
		Boolean isBusquedaDesdeForeignKeySesionTipoPrecio) {
		this.isBusquedaDesdeForeignKeySesionTipoPrecio = isBusquedaDesdeForeignKeySesionTipoPrecio;
	}

	public Long getlidTipoPrecioActual() {
		return lidTipoPrecioActual;
	}

	public void setlidTipoPrecioActual(Long lidTipoPrecioActual) {
		this.lidTipoPrecioActual = lidTipoPrecioActual;
	}
	
	
		
	
}
