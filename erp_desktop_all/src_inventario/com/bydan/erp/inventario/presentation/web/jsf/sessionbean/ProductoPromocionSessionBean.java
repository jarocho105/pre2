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
public class ProductoPromocionSessionBean  extends ProductoPromocionSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProductoPromocion;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoPromocion;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoPromocion;
	protected Long lIdProductoPromocionActualForeignKey;	
	
	protected Long lIdProductoPromocionActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoPromocionParaPosibleAtras;
	protected String sUltimaBusquedaProductoPromocion;
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
	Boolean isBusquedaDesdeForeignKeySesionBodega;
	Long lidBodegaActual;
	Boolean isBusquedaDesdeForeignKeySesionProducto;
	Long lidProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionBodegaRelacion;
	Long lidBodegaRelacionActual;
	Boolean isBusquedaDesdeForeignKeySesionProductoRelacion;
	Long lidProductoRelacionActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_bodega;
	private Long id_producto;
	private Long id_bodega_relacion;
	private Long id_producto_relacion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProductoPromocionSessionBeanAdditional productopromocionSessionBeanAdditional=null;
	
	public ProductoPromocionSessionBeanAdditional getProductoPromocionSessionBeanAdditional() {
		return this.productopromocionSessionBeanAdditional;
	}
	
	public void setProductoPromocionSessionBeanAdditional(ProductoPromocionSessionBeanAdditional productopromocionSessionBeanAdditional) {
		try {
			this.productopromocionSessionBeanAdditional=productopromocionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProductoPromocionSessionBean () {
		this.inicializarProductoPromocionSessionBean();
	}
	
	public void inicializarProductoPromocionSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProductoPromocion=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoPromocion="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoPromocion=false;
		this.lIdProductoPromocionActualForeignKey=0L;
		this.lIdProductoPromocionActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoPromocionParaPosibleAtras=false;
		this.sUltimaBusquedaProductoPromocion ="";
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
		isBusquedaDesdeForeignKeySesionBodega=false;
		lidBodegaActual=0L;
		isBusquedaDesdeForeignKeySesionProducto=false;
		lidProductoActual=0L;
		isBusquedaDesdeForeignKeySesionBodegaRelacion=false;
		lidBodegaRelacionActual=0L;
		isBusquedaDesdeForeignKeySesionProductoRelacion=false;
		lidProductoRelacionActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_bodega=-1L;
 		this.id_producto=-1L;
 		this.id_bodega_relacion=-1L;
 		this.id_producto_relacion=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProductoPromocion() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProductoPromocion;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProductoPromocion(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProductoPromocion) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProductoPromocion= isPermiteNavegacionHaciaForeignKeyDesdeProductoPromocion;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoPromocion() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoPromocion;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoPromocion(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoPromocion) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoPromocion = sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoPromocion;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProductoPromocion() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProductoPromocion;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProductoPromocion(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoPromocion) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoPromocion= isBusquedaDesdeForeignKeySesionForeignKeyProductoPromocion;
	}
					
	public Long getlIdProductoPromocionActualForeignKey() {
		return lIdProductoPromocionActualForeignKey;
	}

	public void setlIdProductoPromocionActualForeignKey(
			Long lIdProductoPromocionActualForeignKey) {
		this.lIdProductoPromocionActualForeignKey = lIdProductoPromocionActualForeignKey;
	}
				    
	public Long getlIdProductoPromocionActualForeignKeyParaPosibleAtras() {
		return lIdProductoPromocionActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProductoPromocionActualForeignKeyParaPosibleAtras(
			Long lIdProductoPromocionActualForeignKeyParaPosibleAtras) {
		this.lIdProductoPromocionActualForeignKeyParaPosibleAtras = lIdProductoPromocionActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProductoPromocionParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProductoPromocionParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProductoPromocionParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoPromocionParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoPromocionParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProductoPromocionParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProductoPromocion() {
		return sUltimaBusquedaProductoPromocion;
	}

	public void setsUltimaBusquedaProductoPromocion(String sUltimaBusquedaProductoPromocion) {
		this.sUltimaBusquedaProductoPromocion = sUltimaBusquedaProductoPromocion;
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
    
	public Long getid_bodega() {
		return this.id_bodega;
	}
    
	public Long getid_producto() {
		return this.id_producto;
	}
    
	public Long getid_bodega_relacion() {
		return this.id_bodega_relacion;
	}
    
	public Long getid_producto_relacion() {
		return this.id_producto_relacion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoPromocion:Valor nulo no permitido en columna id");
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
						System.out.println("ProductoPromocion:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ProductoPromocion:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega(Long newid_bodega)throws Exception
	{
		try {
			if(this.id_bodega!=newid_bodega) {
				if(newid_bodega==null) {
					//newid_bodega=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoPromocion:Valor nulo no permitido en columna id_bodega");
					}
				}

				this.id_bodega=newid_bodega;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_producto(Long newid_producto)throws Exception
	{
		try {
			if(this.id_producto!=newid_producto) {
				if(newid_producto==null) {
					//newid_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoPromocion:Valor nulo no permitido en columna id_producto");
					}
				}

				this.id_producto=newid_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_bodega_relacion(Long newid_bodega_relacion)throws Exception
	{
		try {
			if(this.id_bodega_relacion!=newid_bodega_relacion) {
				if(newid_bodega_relacion==null) {
					//newid_bodega_relacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoPromocion:Valor nulo no permitido en columna id_bodega_relacion");
					}
				}

				this.id_bodega_relacion=newid_bodega_relacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_producto_relacion(Long newid_producto_relacion)throws Exception
	{
		try {
			if(this.id_producto_relacion!=newid_producto_relacion) {
				if(newid_producto_relacion==null) {
					//newid_producto_relacion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoPromocion:Valor nulo no permitido en columna id_producto_relacion");
					}
				}

				this.id_producto_relacion=newid_producto_relacion;
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
	public Boolean getisBusquedaDesdeForeignKeySesionBodega() {
		return isBusquedaDesdeForeignKeySesionBodega;
	}

	public void setisBusquedaDesdeForeignKeySesionBodega(
		Boolean isBusquedaDesdeForeignKeySesionBodega) {
		this.isBusquedaDesdeForeignKeySesionBodega = isBusquedaDesdeForeignKeySesionBodega;
	}

	public Long getlidBodegaActual() {
		return lidBodegaActual;
	}

	public void setlidBodegaActual(Long lidBodegaActual) {
		this.lidBodegaActual = lidBodegaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionProducto() {
		return isBusquedaDesdeForeignKeySesionProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionProducto(
		Boolean isBusquedaDesdeForeignKeySesionProducto) {
		this.isBusquedaDesdeForeignKeySesionProducto = isBusquedaDesdeForeignKeySesionProducto;
	}

	public Long getlidProductoActual() {
		return lidProductoActual;
	}

	public void setlidProductoActual(Long lidProductoActual) {
		this.lidProductoActual = lidProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBodegaRelacion() {
		return isBusquedaDesdeForeignKeySesionBodegaRelacion;
	}

	public void setisBusquedaDesdeForeignKeySesionBodegaRelacion(
		Boolean isBusquedaDesdeForeignKeySesionBodegaRelacion) {
		this.isBusquedaDesdeForeignKeySesionBodegaRelacion = isBusquedaDesdeForeignKeySesionBodegaRelacion;
	}

	public Long getlidBodegaRelacionActual() {
		return lidBodegaRelacionActual;
	}

	public void setlidBodegaRelacionActual(Long lidBodegaRelacionActual) {
		this.lidBodegaRelacionActual = lidBodegaRelacionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionProductoRelacion() {
		return isBusquedaDesdeForeignKeySesionProductoRelacion;
	}

	public void setisBusquedaDesdeForeignKeySesionProductoRelacion(
		Boolean isBusquedaDesdeForeignKeySesionProductoRelacion) {
		this.isBusquedaDesdeForeignKeySesionProductoRelacion = isBusquedaDesdeForeignKeySesionProductoRelacion;
	}

	public Long getlidProductoRelacionActual() {
		return lidProductoRelacionActual;
	}

	public void setlidProductoRelacionActual(Long lidProductoRelacionActual) {
		this.lidProductoRelacionActual = lidProductoRelacionActual;
	}
	
	
		
	
}
