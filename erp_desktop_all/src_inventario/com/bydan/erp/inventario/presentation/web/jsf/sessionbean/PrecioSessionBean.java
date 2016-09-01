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
public class PrecioSessionBean  extends PrecioSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdePrecio;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdePrecio;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPrecio;
	protected Long lIdPrecioActualForeignKey;	
	
	protected Long lIdPrecioActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyPrecioParaPosibleAtras;
	protected String sUltimaBusquedaPrecio;
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
	Boolean isBusquedaDesdeForeignKeySesionLinea;
	Long lidLineaActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaGrupo;
	Long lidLineaGrupoActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaCategoria;
	Long lidLineaCategoriaActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaMarca;
	Long lidLineaMarcaActual;
	Boolean isBusquedaDesdeForeignKeySesionRangoUnidadVenta;
	Long lidRangoUnidadVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoPrecio;
	Long lidTipoPrecioActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoPrecio;
	Long lidEstadoPrecioActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_bodega;
	private Long id_producto;
	private Long id_linea;
	private Long id_linea_grupo;
	private Long id_linea_categoria;
	private Long id_linea_marca;
	private Long id_rango_unidad_venta;
	private Long id_tipo_precio;
	private Long id_estado_precio;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected PrecioSessionBeanAdditional precioSessionBeanAdditional=null;
	
	public PrecioSessionBeanAdditional getPrecioSessionBeanAdditional() {
		return this.precioSessionBeanAdditional;
	}
	
	public void setPrecioSessionBeanAdditional(PrecioSessionBeanAdditional precioSessionBeanAdditional) {
		try {
			this.precioSessionBeanAdditional=precioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public PrecioSessionBean () {
		this.inicializarPrecioSessionBean();
	}
	
	public void inicializarPrecioSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdePrecio=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePrecio="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyPrecio=false;
		this.lIdPrecioActualForeignKey=0L;
		this.lIdPrecioActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyPrecioParaPosibleAtras=false;
		this.sUltimaBusquedaPrecio ="";
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
		isBusquedaDesdeForeignKeySesionLinea=false;
		lidLineaActual=0L;
		isBusquedaDesdeForeignKeySesionLineaGrupo=false;
		lidLineaGrupoActual=0L;
		isBusquedaDesdeForeignKeySesionLineaCategoria=false;
		lidLineaCategoriaActual=0L;
		isBusquedaDesdeForeignKeySesionLineaMarca=false;
		lidLineaMarcaActual=0L;
		isBusquedaDesdeForeignKeySesionRangoUnidadVenta=false;
		lidRangoUnidadVentaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoPrecio=false;
		lidTipoPrecioActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoPrecio=false;
		lidEstadoPrecioActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_bodega=-1L;
 		this.id_producto=-1L;
 		this.id_linea=null;
 		this.id_linea_grupo=null;
 		this.id_linea_categoria=null;
 		this.id_linea_marca=null;
 		this.id_rango_unidad_venta=-1L;
 		this.id_tipo_precio=-1L;
 		this.id_estado_precio=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdePrecio() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdePrecio;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdePrecio(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdePrecio) {
		this.isPermiteNavegacionHaciaForeignKeyDesdePrecio= isPermiteNavegacionHaciaForeignKeyDesdePrecio;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdePrecio() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdePrecio;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdePrecio(String sNombrePaginaNavegacionHaciaForeignKeyDesdePrecio) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdePrecio = sNombrePaginaNavegacionHaciaForeignKeyDesdePrecio;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPrecio() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPrecio;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPrecio(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPrecio) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPrecio= isBusquedaDesdeForeignKeySesionForeignKeyPrecio;
	}
					
	public Long getlIdPrecioActualForeignKey() {
		return lIdPrecioActualForeignKey;
	}

	public void setlIdPrecioActualForeignKey(
			Long lIdPrecioActualForeignKey) {
		this.lIdPrecioActualForeignKey = lIdPrecioActualForeignKey;
	}
				    
	public Long getlIdPrecioActualForeignKeyParaPosibleAtras() {
		return lIdPrecioActualForeignKeyParaPosibleAtras;
	}

	public void setlIdPrecioActualForeignKeyParaPosibleAtras(
			Long lIdPrecioActualForeignKeyParaPosibleAtras) {
		this.lIdPrecioActualForeignKeyParaPosibleAtras = lIdPrecioActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyPrecioParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyPrecioParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyPrecioParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyPrecioParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyPrecioParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyPrecioParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaPrecio() {
		return sUltimaBusquedaPrecio;
	}

	public void setsUltimaBusquedaPrecio(String sUltimaBusquedaPrecio) {
		this.sUltimaBusquedaPrecio = sUltimaBusquedaPrecio;
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
    
	public Long getid_linea() {
		return this.id_linea;
	}
    
	public Long getid_linea_grupo() {
		return this.id_linea_grupo;
	}
    
	public Long getid_linea_categoria() {
		return this.id_linea_categoria;
	}
    
	public Long getid_linea_marca() {
		return this.id_linea_marca;
	}
    
	public Long getid_rango_unidad_venta() {
		return this.id_rango_unidad_venta;
	}
    
	public Long getid_tipo_precio() {
		return this.id_tipo_precio;
	}
    
	public Long getid_estado_precio() {
		return this.id_estado_precio;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Precio:Valor nulo no permitido en columna id");
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
						System.out.println("Precio:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("Precio:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("Precio:Valor nulo no permitido en columna id_bodega");
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
						System.out.println("Precio:Valor nulo no permitido en columna id_producto");
					}
				}

				this.id_producto=newid_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea(Long newid_linea) {
		if(this.id_linea!=newid_linea) {

			this.id_linea=newid_linea;
		}
	}
    
	public void setid_linea_grupo(Long newid_linea_grupo) {
		if(this.id_linea_grupo!=newid_linea_grupo) {

			this.id_linea_grupo=newid_linea_grupo;
		}
	}
    
	public void setid_linea_categoria(Long newid_linea_categoria) {
		if(this.id_linea_categoria!=newid_linea_categoria) {

			this.id_linea_categoria=newid_linea_categoria;
		}
	}
    
	public void setid_linea_marca(Long newid_linea_marca) {
		if(this.id_linea_marca!=newid_linea_marca) {

			this.id_linea_marca=newid_linea_marca;
		}
	}
    
	public void setid_rango_unidad_venta(Long newid_rango_unidad_venta)throws Exception
	{
		try {
			if(this.id_rango_unidad_venta!=newid_rango_unidad_venta) {
				if(newid_rango_unidad_venta==null) {
					//newid_rango_unidad_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Precio:Valor nulo no permitido en columna id_rango_unidad_venta");
					}
				}

				this.id_rango_unidad_venta=newid_rango_unidad_venta;
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
						System.out.println("Precio:Valor nulo no permitido en columna id_tipo_precio");
					}
				}

				this.id_tipo_precio=newid_tipo_precio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_estado_precio(Long newid_estado_precio)throws Exception
	{
		try {
			if(this.id_estado_precio!=newid_estado_precio) {
				if(newid_estado_precio==null) {
					//newid_estado_precio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Precio:Valor nulo no permitido en columna id_estado_precio");
					}
				}

				this.id_estado_precio=newid_estado_precio;
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
	public Boolean getisBusquedaDesdeForeignKeySesionLinea() {
		return isBusquedaDesdeForeignKeySesionLinea;
	}

	public void setisBusquedaDesdeForeignKeySesionLinea(
		Boolean isBusquedaDesdeForeignKeySesionLinea) {
		this.isBusquedaDesdeForeignKeySesionLinea = isBusquedaDesdeForeignKeySesionLinea;
	}

	public Long getlidLineaActual() {
		return lidLineaActual;
	}

	public void setlidLineaActual(Long lidLineaActual) {
		this.lidLineaActual = lidLineaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLineaGrupo() {
		return isBusquedaDesdeForeignKeySesionLineaGrupo;
	}

	public void setisBusquedaDesdeForeignKeySesionLineaGrupo(
		Boolean isBusquedaDesdeForeignKeySesionLineaGrupo) {
		this.isBusquedaDesdeForeignKeySesionLineaGrupo = isBusquedaDesdeForeignKeySesionLineaGrupo;
	}

	public Long getlidLineaGrupoActual() {
		return lidLineaGrupoActual;
	}

	public void setlidLineaGrupoActual(Long lidLineaGrupoActual) {
		this.lidLineaGrupoActual = lidLineaGrupoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLineaCategoria() {
		return isBusquedaDesdeForeignKeySesionLineaCategoria;
	}

	public void setisBusquedaDesdeForeignKeySesionLineaCategoria(
		Boolean isBusquedaDesdeForeignKeySesionLineaCategoria) {
		this.isBusquedaDesdeForeignKeySesionLineaCategoria = isBusquedaDesdeForeignKeySesionLineaCategoria;
	}

	public Long getlidLineaCategoriaActual() {
		return lidLineaCategoriaActual;
	}

	public void setlidLineaCategoriaActual(Long lidLineaCategoriaActual) {
		this.lidLineaCategoriaActual = lidLineaCategoriaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionLineaMarca() {
		return isBusquedaDesdeForeignKeySesionLineaMarca;
	}

	public void setisBusquedaDesdeForeignKeySesionLineaMarca(
		Boolean isBusquedaDesdeForeignKeySesionLineaMarca) {
		this.isBusquedaDesdeForeignKeySesionLineaMarca = isBusquedaDesdeForeignKeySesionLineaMarca;
	}

	public Long getlidLineaMarcaActual() {
		return lidLineaMarcaActual;
	}

	public void setlidLineaMarcaActual(Long lidLineaMarcaActual) {
		this.lidLineaMarcaActual = lidLineaMarcaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionRangoUnidadVenta() {
		return isBusquedaDesdeForeignKeySesionRangoUnidadVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionRangoUnidadVenta(
		Boolean isBusquedaDesdeForeignKeySesionRangoUnidadVenta) {
		this.isBusquedaDesdeForeignKeySesionRangoUnidadVenta = isBusquedaDesdeForeignKeySesionRangoUnidadVenta;
	}

	public Long getlidRangoUnidadVentaActual() {
		return lidRangoUnidadVentaActual;
	}

	public void setlidRangoUnidadVentaActual(Long lidRangoUnidadVentaActual) {
		this.lidRangoUnidadVentaActual = lidRangoUnidadVentaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoPrecio() {
		return isBusquedaDesdeForeignKeySesionEstadoPrecio;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoPrecio(
		Boolean isBusquedaDesdeForeignKeySesionEstadoPrecio) {
		this.isBusquedaDesdeForeignKeySesionEstadoPrecio = isBusquedaDesdeForeignKeySesionEstadoPrecio;
	}

	public Long getlidEstadoPrecioActual() {
		return lidEstadoPrecioActual;
	}

	public void setlidEstadoPrecioActual(Long lidEstadoPrecioActual) {
		this.lidEstadoPrecioActual = lidEstadoPrecioActual;
	}
	
	
		
	
}
