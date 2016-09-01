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
public class ParametroInventarioDefectoSessionBean  extends ParametroInventarioDefectoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefecto;
	protected Long lIdParametroInventarioDefectoActualForeignKey;	
	
	protected Long lIdParametroInventarioDefectoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefectoParaPosibleAtras;
	protected String sUltimaBusquedaParametroInventarioDefecto;
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
	Boolean isBusquedaDesdeForeignKeySesionGrupoBodega;
	Long lidGrupoBodegaActual;
	Boolean isBusquedaDesdeForeignKeySesionCalidadProducto;
	Long lidCalidadProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoServicio;
	Long lidTipoServicioActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoProductoServicioInven;
	Long lidTipoProductoServicioInvenActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoProductoServicio;
	Long lidTipoProductoServicioActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoCosteo;
	Long lidTipoCosteoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoProducto;
	Long lidTipoProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoViaTransporte;
	Long lidTipoViaTransporteActual;
	Boolean isBusquedaDesdeForeignKeySesionRangoUnidadVenta;
	Long lidRangoUnidadVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionPais;
	Long lidPaisActual;
	Boolean isBusquedaDesdeForeignKeySesionCiudad;
	Long lidCiudadActual;
	Boolean isBusquedaDesdeForeignKeySesionColorProducto;
	Long lidColorProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionClaseProducto;
	Long lidClaseProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionEfectoProducto;
	Long lidEfectoProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionMarcaProducto;
	Long lidMarcaProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionModeloProducto;
	Long lidModeloProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionMaterialProducto;
	Long lidMaterialProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionSegmentoProducto;
	Long lidSegmentoProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionTallaProducto;
	Long lidTallaProductoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_grupo_bodega;
	private Long id_calidad_producto;
	private Long id_tipo_servicio;
	private Long id_tipo_producto_servicio_inven;
	private Long id_tipo_producto_servicio;
	private Long id_tipo_costeo;
	private Long id_tipo_producto;
	private Long id_tipo_via_transporte;
	private Long id_rango_unidad_venta;
	private Long id_pais;
	private Long id_ciudad;
	private Long id_color_producto;
	private Long id_clase_producto;
	private Long id_efecto_producto;
	private Long id_marca_producto;
	private Long id_modelo_producto;
	private Long id_material_producto;
	private Long id_segmento_producto;
	private Long id_talla_producto;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ParametroInventarioDefectoSessionBeanAdditional parametroinventariodefectoSessionBeanAdditional=null;
	
	public ParametroInventarioDefectoSessionBeanAdditional getParametroInventarioDefectoSessionBeanAdditional() {
		return this.parametroinventariodefectoSessionBeanAdditional;
	}
	
	public void setParametroInventarioDefectoSessionBeanAdditional(ParametroInventarioDefectoSessionBeanAdditional parametroinventariodefectoSessionBeanAdditional) {
		try {
			this.parametroinventariodefectoSessionBeanAdditional=parametroinventariodefectoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ParametroInventarioDefectoSessionBean () {
		this.inicializarParametroInventarioDefectoSessionBean();
	}
	
	public void inicializarParametroInventarioDefectoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefecto=false;
		this.lIdParametroInventarioDefectoActualForeignKey=0L;
		this.lIdParametroInventarioDefectoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefectoParaPosibleAtras=false;
		this.sUltimaBusquedaParametroInventarioDefecto ="";
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
		isBusquedaDesdeForeignKeySesionGrupoBodega=false;
		lidGrupoBodegaActual=0L;
		isBusquedaDesdeForeignKeySesionCalidadProducto=false;
		lidCalidadProductoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoServicio=false;
		lidTipoServicioActual=0L;
		isBusquedaDesdeForeignKeySesionTipoProductoServicioInven=false;
		lidTipoProductoServicioInvenActual=0L;
		isBusquedaDesdeForeignKeySesionTipoProductoServicio=false;
		lidTipoProductoServicioActual=0L;
		isBusquedaDesdeForeignKeySesionTipoCosteo=false;
		lidTipoCosteoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoProducto=false;
		lidTipoProductoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoViaTransporte=false;
		lidTipoViaTransporteActual=0L;
		isBusquedaDesdeForeignKeySesionRangoUnidadVenta=false;
		lidRangoUnidadVentaActual=0L;
		isBusquedaDesdeForeignKeySesionPais=false;
		lidPaisActual=0L;
		isBusquedaDesdeForeignKeySesionCiudad=false;
		lidCiudadActual=0L;
		isBusquedaDesdeForeignKeySesionColorProducto=false;
		lidColorProductoActual=0L;
		isBusquedaDesdeForeignKeySesionClaseProducto=false;
		lidClaseProductoActual=0L;
		isBusquedaDesdeForeignKeySesionEfectoProducto=false;
		lidEfectoProductoActual=0L;
		isBusquedaDesdeForeignKeySesionMarcaProducto=false;
		lidMarcaProductoActual=0L;
		isBusquedaDesdeForeignKeySesionModeloProducto=false;
		lidModeloProductoActual=0L;
		isBusquedaDesdeForeignKeySesionMaterialProducto=false;
		lidMaterialProductoActual=0L;
		isBusquedaDesdeForeignKeySesionSegmentoProducto=false;
		lidSegmentoProductoActual=0L;
		isBusquedaDesdeForeignKeySesionTallaProducto=false;
		lidTallaProductoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_grupo_bodega=-1L;
 		this.id_calidad_producto=-1L;
 		this.id_tipo_servicio=-1L;
 		this.id_tipo_producto_servicio_inven=-1L;
 		this.id_tipo_producto_servicio=-1L;
 		this.id_tipo_costeo=-1L;
 		this.id_tipo_producto=-1L;
 		this.id_tipo_via_transporte=-1L;
 		this.id_rango_unidad_venta=-1L;
 		this.id_pais=-1L;
 		this.id_ciudad=-1L;
 		this.id_color_producto=-1L;
 		this.id_clase_producto=-1L;
 		this.id_efecto_producto=-1L;
 		this.id_marca_producto=-1L;
 		this.id_modelo_producto=-1L;
 		this.id_material_producto=-1L;
 		this.id_segmento_producto=-1L;
 		this.id_talla_producto=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto= isPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto = sNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefecto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefecto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefecto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefecto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefecto= isBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefecto;
	}
					
	public Long getlIdParametroInventarioDefectoActualForeignKey() {
		return lIdParametroInventarioDefectoActualForeignKey;
	}

	public void setlIdParametroInventarioDefectoActualForeignKey(
			Long lIdParametroInventarioDefectoActualForeignKey) {
		this.lIdParametroInventarioDefectoActualForeignKey = lIdParametroInventarioDefectoActualForeignKey;
	}
				    
	public Long getlIdParametroInventarioDefectoActualForeignKeyParaPosibleAtras() {
		return lIdParametroInventarioDefectoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdParametroInventarioDefectoActualForeignKeyParaPosibleAtras(
			Long lIdParametroInventarioDefectoActualForeignKeyParaPosibleAtras) {
		this.lIdParametroInventarioDefectoActualForeignKeyParaPosibleAtras = lIdParametroInventarioDefectoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefectoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefectoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefectoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefectoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefectoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyParametroInventarioDefectoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaParametroInventarioDefecto() {
		return sUltimaBusquedaParametroInventarioDefecto;
	}

	public void setsUltimaBusquedaParametroInventarioDefecto(String sUltimaBusquedaParametroInventarioDefecto) {
		this.sUltimaBusquedaParametroInventarioDefecto = sUltimaBusquedaParametroInventarioDefecto;
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
    
	public Long getid_grupo_bodega() {
		return this.id_grupo_bodega;
	}
    
	public Long getid_calidad_producto() {
		return this.id_calidad_producto;
	}
    
	public Long getid_tipo_servicio() {
		return this.id_tipo_servicio;
	}
    
	public Long getid_tipo_producto_servicio_inven() {
		return this.id_tipo_producto_servicio_inven;
	}
    
	public Long getid_tipo_producto_servicio() {
		return this.id_tipo_producto_servicio;
	}
    
	public Long getid_tipo_costeo() {
		return this.id_tipo_costeo;
	}
    
	public Long getid_tipo_producto() {
		return this.id_tipo_producto;
	}
    
	public Long getid_tipo_via_transporte() {
		return this.id_tipo_via_transporte;
	}
    
	public Long getid_rango_unidad_venta() {
		return this.id_rango_unidad_venta;
	}
    
	public Long getid_pais() {
		return this.id_pais;
	}
    
	public Long getid_ciudad() {
		return this.id_ciudad;
	}
    
	public Long getid_color_producto() {
		return this.id_color_producto;
	}
    
	public Long getid_clase_producto() {
		return this.id_clase_producto;
	}
    
	public Long getid_efecto_producto() {
		return this.id_efecto_producto;
	}
    
	public Long getid_marca_producto() {
		return this.id_marca_producto;
	}
    
	public Long getid_modelo_producto() {
		return this.id_modelo_producto;
	}
    
	public Long getid_material_producto() {
		return this.id_material_producto;
	}
    
	public Long getid_segmento_producto() {
		return this.id_segmento_producto;
	}
    
	public Long getid_talla_producto() {
		return this.id_talla_producto;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id");
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
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_grupo_bodega(Long newid_grupo_bodega)throws Exception
	{
		try {
			if(this.id_grupo_bodega!=newid_grupo_bodega) {
				if(newid_grupo_bodega==null) {
					//newid_grupo_bodega=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_grupo_bodega");
					}
				}

				this.id_grupo_bodega=newid_grupo_bodega;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_calidad_producto(Long newid_calidad_producto)throws Exception
	{
		try {
			if(this.id_calidad_producto!=newid_calidad_producto) {
				if(newid_calidad_producto==null) {
					//newid_calidad_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_calidad_producto");
					}
				}

				this.id_calidad_producto=newid_calidad_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_servicio(Long newid_tipo_servicio)throws Exception
	{
		try {
			if(this.id_tipo_servicio!=newid_tipo_servicio) {
				if(newid_tipo_servicio==null) {
					//newid_tipo_servicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_tipo_servicio");
					}
				}

				this.id_tipo_servicio=newid_tipo_servicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_producto_servicio_inven(Long newid_tipo_producto_servicio_inven)throws Exception
	{
		try {
			if(this.id_tipo_producto_servicio_inven!=newid_tipo_producto_servicio_inven) {
				if(newid_tipo_producto_servicio_inven==null) {
					//newid_tipo_producto_servicio_inven=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_tipo_producto_servicio_inven");
					}
				}

				this.id_tipo_producto_servicio_inven=newid_tipo_producto_servicio_inven;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_producto_servicio(Long newid_tipo_producto_servicio)throws Exception
	{
		try {
			if(this.id_tipo_producto_servicio!=newid_tipo_producto_servicio) {
				if(newid_tipo_producto_servicio==null) {
					//newid_tipo_producto_servicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_tipo_producto_servicio");
					}
				}

				this.id_tipo_producto_servicio=newid_tipo_producto_servicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_costeo(Long newid_tipo_costeo)throws Exception
	{
		try {
			if(this.id_tipo_costeo!=newid_tipo_costeo) {
				if(newid_tipo_costeo==null) {
					//newid_tipo_costeo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_tipo_costeo");
					}
				}

				this.id_tipo_costeo=newid_tipo_costeo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_producto(Long newid_tipo_producto)throws Exception
	{
		try {
			if(this.id_tipo_producto!=newid_tipo_producto) {
				if(newid_tipo_producto==null) {
					//newid_tipo_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_tipo_producto");
					}
				}

				this.id_tipo_producto=newid_tipo_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_via_transporte(Long newid_tipo_via_transporte)throws Exception
	{
		try {
			if(this.id_tipo_via_transporte!=newid_tipo_via_transporte) {
				if(newid_tipo_via_transporte==null) {
					//newid_tipo_via_transporte=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_tipo_via_transporte");
					}
				}

				this.id_tipo_via_transporte=newid_tipo_via_transporte;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_rango_unidad_venta(Long newid_rango_unidad_venta)throws Exception
	{
		try {
			if(this.id_rango_unidad_venta!=newid_rango_unidad_venta) {
				if(newid_rango_unidad_venta==null) {
					//newid_rango_unidad_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_rango_unidad_venta");
					}
				}

				this.id_rango_unidad_venta=newid_rango_unidad_venta;
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
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_pais");
					}
				}

				this.id_pais=newid_pais;
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
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_ciudad");
					}
				}

				this.id_ciudad=newid_ciudad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_color_producto(Long newid_color_producto)throws Exception
	{
		try {
			if(this.id_color_producto!=newid_color_producto) {
				if(newid_color_producto==null) {
					//newid_color_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_color_producto");
					}
				}

				this.id_color_producto=newid_color_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_clase_producto(Long newid_clase_producto)throws Exception
	{
		try {
			if(this.id_clase_producto!=newid_clase_producto) {
				if(newid_clase_producto==null) {
					//newid_clase_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_clase_producto");
					}
				}

				this.id_clase_producto=newid_clase_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_efecto_producto(Long newid_efecto_producto)throws Exception
	{
		try {
			if(this.id_efecto_producto!=newid_efecto_producto) {
				if(newid_efecto_producto==null) {
					//newid_efecto_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_efecto_producto");
					}
				}

				this.id_efecto_producto=newid_efecto_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_marca_producto(Long newid_marca_producto)throws Exception
	{
		try {
			if(this.id_marca_producto!=newid_marca_producto) {
				if(newid_marca_producto==null) {
					//newid_marca_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_marca_producto");
					}
				}

				this.id_marca_producto=newid_marca_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_modelo_producto(Long newid_modelo_producto)throws Exception
	{
		try {
			if(this.id_modelo_producto!=newid_modelo_producto) {
				if(newid_modelo_producto==null) {
					//newid_modelo_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_modelo_producto");
					}
				}

				this.id_modelo_producto=newid_modelo_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_material_producto(Long newid_material_producto)throws Exception
	{
		try {
			if(this.id_material_producto!=newid_material_producto) {
				if(newid_material_producto==null) {
					//newid_material_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_material_producto");
					}
				}

				this.id_material_producto=newid_material_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_segmento_producto(Long newid_segmento_producto)throws Exception
	{
		try {
			if(this.id_segmento_producto!=newid_segmento_producto) {
				if(newid_segmento_producto==null) {
					//newid_segmento_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_segmento_producto");
					}
				}

				this.id_segmento_producto=newid_segmento_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_talla_producto(Long newid_talla_producto)throws Exception
	{
		try {
			if(this.id_talla_producto!=newid_talla_producto) {
				if(newid_talla_producto==null) {
					//newid_talla_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ParametroInventarioDefecto:Valor nulo no permitido en columna id_talla_producto");
					}
				}

				this.id_talla_producto=newid_talla_producto;
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
	public Boolean getisBusquedaDesdeForeignKeySesionGrupoBodega() {
		return isBusquedaDesdeForeignKeySesionGrupoBodega;
	}

	public void setisBusquedaDesdeForeignKeySesionGrupoBodega(
		Boolean isBusquedaDesdeForeignKeySesionGrupoBodega) {
		this.isBusquedaDesdeForeignKeySesionGrupoBodega = isBusquedaDesdeForeignKeySesionGrupoBodega;
	}

	public Long getlidGrupoBodegaActual() {
		return lidGrupoBodegaActual;
	}

	public void setlidGrupoBodegaActual(Long lidGrupoBodegaActual) {
		this.lidGrupoBodegaActual = lidGrupoBodegaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCalidadProducto() {
		return isBusquedaDesdeForeignKeySesionCalidadProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionCalidadProducto(
		Boolean isBusquedaDesdeForeignKeySesionCalidadProducto) {
		this.isBusquedaDesdeForeignKeySesionCalidadProducto = isBusquedaDesdeForeignKeySesionCalidadProducto;
	}

	public Long getlidCalidadProductoActual() {
		return lidCalidadProductoActual;
	}

	public void setlidCalidadProductoActual(Long lidCalidadProductoActual) {
		this.lidCalidadProductoActual = lidCalidadProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoServicio() {
		return isBusquedaDesdeForeignKeySesionTipoServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoServicio(
		Boolean isBusquedaDesdeForeignKeySesionTipoServicio) {
		this.isBusquedaDesdeForeignKeySesionTipoServicio = isBusquedaDesdeForeignKeySesionTipoServicio;
	}

	public Long getlidTipoServicioActual() {
		return lidTipoServicioActual;
	}

	public void setlidTipoServicioActual(Long lidTipoServicioActual) {
		this.lidTipoServicioActual = lidTipoServicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoProductoServicioInven() {
		return isBusquedaDesdeForeignKeySesionTipoProductoServicioInven;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoProductoServicioInven(
		Boolean isBusquedaDesdeForeignKeySesionTipoProductoServicioInven) {
		this.isBusquedaDesdeForeignKeySesionTipoProductoServicioInven = isBusquedaDesdeForeignKeySesionTipoProductoServicioInven;
	}

	public Long getlidTipoProductoServicioInvenActual() {
		return lidTipoProductoServicioInvenActual;
	}

	public void setlidTipoProductoServicioInvenActual(Long lidTipoProductoServicioInvenActual) {
		this.lidTipoProductoServicioInvenActual = lidTipoProductoServicioInvenActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoProductoServicio() {
		return isBusquedaDesdeForeignKeySesionTipoProductoServicio;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoProductoServicio(
		Boolean isBusquedaDesdeForeignKeySesionTipoProductoServicio) {
		this.isBusquedaDesdeForeignKeySesionTipoProductoServicio = isBusquedaDesdeForeignKeySesionTipoProductoServicio;
	}

	public Long getlidTipoProductoServicioActual() {
		return lidTipoProductoServicioActual;
	}

	public void setlidTipoProductoServicioActual(Long lidTipoProductoServicioActual) {
		this.lidTipoProductoServicioActual = lidTipoProductoServicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoCosteo() {
		return isBusquedaDesdeForeignKeySesionTipoCosteo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoCosteo(
		Boolean isBusquedaDesdeForeignKeySesionTipoCosteo) {
		this.isBusquedaDesdeForeignKeySesionTipoCosteo = isBusquedaDesdeForeignKeySesionTipoCosteo;
	}

	public Long getlidTipoCosteoActual() {
		return lidTipoCosteoActual;
	}

	public void setlidTipoCosteoActual(Long lidTipoCosteoActual) {
		this.lidTipoCosteoActual = lidTipoCosteoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoProducto() {
		return isBusquedaDesdeForeignKeySesionTipoProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoProducto(
		Boolean isBusquedaDesdeForeignKeySesionTipoProducto) {
		this.isBusquedaDesdeForeignKeySesionTipoProducto = isBusquedaDesdeForeignKeySesionTipoProducto;
	}

	public Long getlidTipoProductoActual() {
		return lidTipoProductoActual;
	}

	public void setlidTipoProductoActual(Long lidTipoProductoActual) {
		this.lidTipoProductoActual = lidTipoProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoViaTransporte() {
		return isBusquedaDesdeForeignKeySesionTipoViaTransporte;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoViaTransporte(
		Boolean isBusquedaDesdeForeignKeySesionTipoViaTransporte) {
		this.isBusquedaDesdeForeignKeySesionTipoViaTransporte = isBusquedaDesdeForeignKeySesionTipoViaTransporte;
	}

	public Long getlidTipoViaTransporteActual() {
		return lidTipoViaTransporteActual;
	}

	public void setlidTipoViaTransporteActual(Long lidTipoViaTransporteActual) {
		this.lidTipoViaTransporteActual = lidTipoViaTransporteActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionColorProducto() {
		return isBusquedaDesdeForeignKeySesionColorProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionColorProducto(
		Boolean isBusquedaDesdeForeignKeySesionColorProducto) {
		this.isBusquedaDesdeForeignKeySesionColorProducto = isBusquedaDesdeForeignKeySesionColorProducto;
	}

	public Long getlidColorProductoActual() {
		return lidColorProductoActual;
	}

	public void setlidColorProductoActual(Long lidColorProductoActual) {
		this.lidColorProductoActual = lidColorProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionClaseProducto() {
		return isBusquedaDesdeForeignKeySesionClaseProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionClaseProducto(
		Boolean isBusquedaDesdeForeignKeySesionClaseProducto) {
		this.isBusquedaDesdeForeignKeySesionClaseProducto = isBusquedaDesdeForeignKeySesionClaseProducto;
	}

	public Long getlidClaseProductoActual() {
		return lidClaseProductoActual;
	}

	public void setlidClaseProductoActual(Long lidClaseProductoActual) {
		this.lidClaseProductoActual = lidClaseProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEfectoProducto() {
		return isBusquedaDesdeForeignKeySesionEfectoProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionEfectoProducto(
		Boolean isBusquedaDesdeForeignKeySesionEfectoProducto) {
		this.isBusquedaDesdeForeignKeySesionEfectoProducto = isBusquedaDesdeForeignKeySesionEfectoProducto;
	}

	public Long getlidEfectoProductoActual() {
		return lidEfectoProductoActual;
	}

	public void setlidEfectoProductoActual(Long lidEfectoProductoActual) {
		this.lidEfectoProductoActual = lidEfectoProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMarcaProducto() {
		return isBusquedaDesdeForeignKeySesionMarcaProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionMarcaProducto(
		Boolean isBusquedaDesdeForeignKeySesionMarcaProducto) {
		this.isBusquedaDesdeForeignKeySesionMarcaProducto = isBusquedaDesdeForeignKeySesionMarcaProducto;
	}

	public Long getlidMarcaProductoActual() {
		return lidMarcaProductoActual;
	}

	public void setlidMarcaProductoActual(Long lidMarcaProductoActual) {
		this.lidMarcaProductoActual = lidMarcaProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionModeloProducto() {
		return isBusquedaDesdeForeignKeySesionModeloProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionModeloProducto(
		Boolean isBusquedaDesdeForeignKeySesionModeloProducto) {
		this.isBusquedaDesdeForeignKeySesionModeloProducto = isBusquedaDesdeForeignKeySesionModeloProducto;
	}

	public Long getlidModeloProductoActual() {
		return lidModeloProductoActual;
	}

	public void setlidModeloProductoActual(Long lidModeloProductoActual) {
		this.lidModeloProductoActual = lidModeloProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMaterialProducto() {
		return isBusquedaDesdeForeignKeySesionMaterialProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionMaterialProducto(
		Boolean isBusquedaDesdeForeignKeySesionMaterialProducto) {
		this.isBusquedaDesdeForeignKeySesionMaterialProducto = isBusquedaDesdeForeignKeySesionMaterialProducto;
	}

	public Long getlidMaterialProductoActual() {
		return lidMaterialProductoActual;
	}

	public void setlidMaterialProductoActual(Long lidMaterialProductoActual) {
		this.lidMaterialProductoActual = lidMaterialProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionSegmentoProducto() {
		return isBusquedaDesdeForeignKeySesionSegmentoProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionSegmentoProducto(
		Boolean isBusquedaDesdeForeignKeySesionSegmentoProducto) {
		this.isBusquedaDesdeForeignKeySesionSegmentoProducto = isBusquedaDesdeForeignKeySesionSegmentoProducto;
	}

	public Long getlidSegmentoProductoActual() {
		return lidSegmentoProductoActual;
	}

	public void setlidSegmentoProductoActual(Long lidSegmentoProductoActual) {
		this.lidSegmentoProductoActual = lidSegmentoProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTallaProducto() {
		return isBusquedaDesdeForeignKeySesionTallaProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionTallaProducto(
		Boolean isBusquedaDesdeForeignKeySesionTallaProducto) {
		this.isBusquedaDesdeForeignKeySesionTallaProducto = isBusquedaDesdeForeignKeySesionTallaProducto;
	}

	public Long getlidTallaProductoActual() {
		return lidTallaProductoActual;
	}

	public void setlidTallaProductoActual(Long lidTallaProductoActual) {
		this.lidTallaProductoActual = lidTallaProductoActual;
	}
	
	
		
	
}
