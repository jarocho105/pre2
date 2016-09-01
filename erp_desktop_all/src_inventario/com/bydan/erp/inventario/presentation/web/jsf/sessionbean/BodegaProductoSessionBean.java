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
public class BodegaProductoSessionBean  extends BodegaProductoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeBodegaProducto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeBodegaProducto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyBodegaProducto;
	protected Long lIdBodegaProductoActualForeignKey;	
	
	protected Long lIdBodegaProductoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyBodegaProductoParaPosibleAtras;
	protected String sUltimaBusquedaBodegaProducto;
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
	Boolean isBusquedaDesdeForeignKeySesionUnidad;
	Long lidUnidadActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionEstadoBodegaProducto;
	Long lidEstadoBodegaProductoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableInventario;
	Long lidCuentaContableInventarioActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCostoVenta;
	Long lidCuentaContableCostoVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableVenta;
	Long lidCuentaContableVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDescuento;
	Long lidCuentaContableDescuentoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableProduccion;
	Long lidCuentaContableProduccionActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDevolucion;
	Long lidCuentaContableDevolucionActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableIngresoDebito;
	Long lidCuentaContableIngresoDebitoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableIngresoCredito;
	Long lidCuentaContableIngresoCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableResultadoDebito;
	Long lidCuentaContableResultadoDebitoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableResultadoCredito;
	Long lidCuentaContableResultadoCreditoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_bodega;
	private Long id_producto;
	private Long id_unidad;
	private Long id_centro_costo;
	private Long id_estado_bodega_producto;
	private Long id_cuenta_contable_inventario;
	private Long id_cuenta_contable_costo_venta;
	private Long id_cuenta_contable_venta;
	private Long id_cuenta_contable_descuento;
	private Long id_cuenta_contable_produccion;
	private Long id_cuenta_contable_devolucion;
	private Long id_cuenta_contable_ingreso_debito;
	private Long id_cuenta_contable_ingreso_credito;
	private Long id_cuenta_contable_resultado_debito;
	private Long id_cuenta_contable_resultado_credito;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected BodegaProductoSessionBeanAdditional bodegaproductoSessionBeanAdditional=null;
	
	public BodegaProductoSessionBeanAdditional getBodegaProductoSessionBeanAdditional() {
		return this.bodegaproductoSessionBeanAdditional;
	}
	
	public void setBodegaProductoSessionBeanAdditional(BodegaProductoSessionBeanAdditional bodegaproductoSessionBeanAdditional) {
		try {
			this.bodegaproductoSessionBeanAdditional=bodegaproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public BodegaProductoSessionBean () {
		this.inicializarBodegaProductoSessionBean();
	}
	
	public void inicializarBodegaProductoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeBodegaProducto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBodegaProducto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyBodegaProducto=false;
		this.lIdBodegaProductoActualForeignKey=0L;
		this.lIdBodegaProductoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyBodegaProductoParaPosibleAtras=false;
		this.sUltimaBusquedaBodegaProducto ="";
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
		isBusquedaDesdeForeignKeySesionUnidad=false;
		lidUnidadActual=0L;
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionEstadoBodegaProducto=false;
		lidEstadoBodegaProductoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableInventario=false;
		lidCuentaContableInventarioActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCostoVenta=false;
		lidCuentaContableCostoVentaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableVenta=false;
		lidCuentaContableVentaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDescuento=false;
		lidCuentaContableDescuentoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableProduccion=false;
		lidCuentaContableProduccionActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDevolucion=false;
		lidCuentaContableDevolucionActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableIngresoDebito=false;
		lidCuentaContableIngresoDebitoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableIngresoCredito=false;
		lidCuentaContableIngresoCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableResultadoDebito=false;
		lidCuentaContableResultadoDebitoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableResultadoCredito=false;
		lidCuentaContableResultadoCreditoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_bodega=-1L;
 		this.id_producto=-1L;
 		this.id_unidad=-1L;
 		this.id_centro_costo=null;
 		this.id_estado_bodega_producto=-1L;
 		this.id_cuenta_contable_inventario=-1L;
 		this.id_cuenta_contable_costo_venta=-1L;
 		this.id_cuenta_contable_venta=-1L;
 		this.id_cuenta_contable_descuento=-1L;
 		this.id_cuenta_contable_produccion=-1L;
 		this.id_cuenta_contable_devolucion=-1L;
 		this.id_cuenta_contable_ingreso_debito=-1L;
 		this.id_cuenta_contable_ingreso_credito=-1L;
 		this.id_cuenta_contable_resultado_debito=-1L;
 		this.id_cuenta_contable_resultado_credito=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeBodegaProducto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeBodegaProducto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeBodegaProducto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeBodegaProducto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeBodegaProducto= isPermiteNavegacionHaciaForeignKeyDesdeBodegaProducto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeBodegaProducto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBodegaProducto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeBodegaProducto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeBodegaProducto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeBodegaProducto = sNombrePaginaNavegacionHaciaForeignKeyDesdeBodegaProducto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyBodegaProducto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyBodegaProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyBodegaProducto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyBodegaProducto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyBodegaProducto= isBusquedaDesdeForeignKeySesionForeignKeyBodegaProducto;
	}
					
	public Long getlIdBodegaProductoActualForeignKey() {
		return lIdBodegaProductoActualForeignKey;
	}

	public void setlIdBodegaProductoActualForeignKey(
			Long lIdBodegaProductoActualForeignKey) {
		this.lIdBodegaProductoActualForeignKey = lIdBodegaProductoActualForeignKey;
	}
				    
	public Long getlIdBodegaProductoActualForeignKeyParaPosibleAtras() {
		return lIdBodegaProductoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdBodegaProductoActualForeignKeyParaPosibleAtras(
			Long lIdBodegaProductoActualForeignKeyParaPosibleAtras) {
		this.lIdBodegaProductoActualForeignKeyParaPosibleAtras = lIdBodegaProductoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyBodegaProductoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyBodegaProductoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyBodegaProductoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyBodegaProductoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyBodegaProductoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyBodegaProductoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaBodegaProducto() {
		return sUltimaBusquedaBodegaProducto;
	}

	public void setsUltimaBusquedaBodegaProducto(String sUltimaBusquedaBodegaProducto) {
		this.sUltimaBusquedaBodegaProducto = sUltimaBusquedaBodegaProducto;
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
    
	public Long getid_unidad() {
		return this.id_unidad;
	}
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
	}
    
	public Long getid_estado_bodega_producto() {
		return this.id_estado_bodega_producto;
	}
    
	public Long getid_cuenta_contable_inventario() {
		return this.id_cuenta_contable_inventario;
	}
    
	public Long getid_cuenta_contable_costo_venta() {
		return this.id_cuenta_contable_costo_venta;
	}
    
	public Long getid_cuenta_contable_venta() {
		return this.id_cuenta_contable_venta;
	}
    
	public Long getid_cuenta_contable_descuento() {
		return this.id_cuenta_contable_descuento;
	}
    
	public Long getid_cuenta_contable_produccion() {
		return this.id_cuenta_contable_produccion;
	}
    
	public Long getid_cuenta_contable_devolucion() {
		return this.id_cuenta_contable_devolucion;
	}
    
	public Long getid_cuenta_contable_ingreso_debito() {
		return this.id_cuenta_contable_ingreso_debito;
	}
    
	public Long getid_cuenta_contable_ingreso_credito() {
		return this.id_cuenta_contable_ingreso_credito;
	}
    
	public Long getid_cuenta_contable_resultado_debito() {
		return this.id_cuenta_contable_resultado_debito;
	}
    
	public Long getid_cuenta_contable_resultado_credito() {
		return this.id_cuenta_contable_resultado_credito;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id");
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
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_bodega");
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
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_producto");
					}
				}

				this.id_producto=newid_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_unidad(Long newid_unidad)throws Exception
	{
		try {
			if(this.id_unidad!=newid_unidad) {
				if(newid_unidad==null) {
					//newid_unidad=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_unidad");
					}
				}

				this.id_unidad=newid_unidad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_centro_costo(Long newid_centro_costo) {
		if(this.id_centro_costo!=newid_centro_costo) {

			this.id_centro_costo=newid_centro_costo;
		}
	}
    
	public void setid_estado_bodega_producto(Long newid_estado_bodega_producto)throws Exception
	{
		try {
			if(this.id_estado_bodega_producto!=newid_estado_bodega_producto) {
				if(newid_estado_bodega_producto==null) {
					//newid_estado_bodega_producto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_estado_bodega_producto");
					}
				}

				this.id_estado_bodega_producto=newid_estado_bodega_producto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_inventario(Long newid_cuenta_contable_inventario)throws Exception
	{
		try {
			if(this.id_cuenta_contable_inventario!=newid_cuenta_contable_inventario) {
				if(newid_cuenta_contable_inventario==null) {
					//newid_cuenta_contable_inventario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_cuenta_contable_inventario");
					}
				}

				this.id_cuenta_contable_inventario=newid_cuenta_contable_inventario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_costo_venta(Long newid_cuenta_contable_costo_venta)throws Exception
	{
		try {
			if(this.id_cuenta_contable_costo_venta!=newid_cuenta_contable_costo_venta) {
				if(newid_cuenta_contable_costo_venta==null) {
					//newid_cuenta_contable_costo_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_cuenta_contable_costo_venta");
					}
				}

				this.id_cuenta_contable_costo_venta=newid_cuenta_contable_costo_venta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_venta(Long newid_cuenta_contable_venta)throws Exception
	{
		try {
			if(this.id_cuenta_contable_venta!=newid_cuenta_contable_venta) {
				if(newid_cuenta_contable_venta==null) {
					//newid_cuenta_contable_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_cuenta_contable_venta");
					}
				}

				this.id_cuenta_contable_venta=newid_cuenta_contable_venta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_descuento(Long newid_cuenta_contable_descuento)throws Exception
	{
		try {
			if(this.id_cuenta_contable_descuento!=newid_cuenta_contable_descuento) {
				if(newid_cuenta_contable_descuento==null) {
					//newid_cuenta_contable_descuento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_cuenta_contable_descuento");
					}
				}

				this.id_cuenta_contable_descuento=newid_cuenta_contable_descuento;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_produccion(Long newid_cuenta_contable_produccion)throws Exception
	{
		try {
			if(this.id_cuenta_contable_produccion!=newid_cuenta_contable_produccion) {
				if(newid_cuenta_contable_produccion==null) {
					//newid_cuenta_contable_produccion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_cuenta_contable_produccion");
					}
				}

				this.id_cuenta_contable_produccion=newid_cuenta_contable_produccion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_devolucion(Long newid_cuenta_contable_devolucion)throws Exception
	{
		try {
			if(this.id_cuenta_contable_devolucion!=newid_cuenta_contable_devolucion) {
				if(newid_cuenta_contable_devolucion==null) {
					//newid_cuenta_contable_devolucion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_cuenta_contable_devolucion");
					}
				}

				this.id_cuenta_contable_devolucion=newid_cuenta_contable_devolucion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_ingreso_debito(Long newid_cuenta_contable_ingreso_debito)throws Exception
	{
		try {
			if(this.id_cuenta_contable_ingreso_debito!=newid_cuenta_contable_ingreso_debito) {
				if(newid_cuenta_contable_ingreso_debito==null) {
					//newid_cuenta_contable_ingreso_debito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_cuenta_contable_ingreso_debito");
					}
				}

				this.id_cuenta_contable_ingreso_debito=newid_cuenta_contable_ingreso_debito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_ingreso_credito(Long newid_cuenta_contable_ingreso_credito)throws Exception
	{
		try {
			if(this.id_cuenta_contable_ingreso_credito!=newid_cuenta_contable_ingreso_credito) {
				if(newid_cuenta_contable_ingreso_credito==null) {
					//newid_cuenta_contable_ingreso_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_cuenta_contable_ingreso_credito");
					}
				}

				this.id_cuenta_contable_ingreso_credito=newid_cuenta_contable_ingreso_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_resultado_debito(Long newid_cuenta_contable_resultado_debito)throws Exception
	{
		try {
			if(this.id_cuenta_contable_resultado_debito!=newid_cuenta_contable_resultado_debito) {
				if(newid_cuenta_contable_resultado_debito==null) {
					//newid_cuenta_contable_resultado_debito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_cuenta_contable_resultado_debito");
					}
				}

				this.id_cuenta_contable_resultado_debito=newid_cuenta_contable_resultado_debito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_resultado_credito(Long newid_cuenta_contable_resultado_credito)throws Exception
	{
		try {
			if(this.id_cuenta_contable_resultado_credito!=newid_cuenta_contable_resultado_credito) {
				if(newid_cuenta_contable_resultado_credito==null) {
					//newid_cuenta_contable_resultado_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("BodegaProducto:Valor nulo no permitido en columna id_cuenta_contable_resultado_credito");
					}
				}

				this.id_cuenta_contable_resultado_credito=newid_cuenta_contable_resultado_credito;
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
	public Boolean getisBusquedaDesdeForeignKeySesionUnidad() {
		return isBusquedaDesdeForeignKeySesionUnidad;
	}

	public void setisBusquedaDesdeForeignKeySesionUnidad(
		Boolean isBusquedaDesdeForeignKeySesionUnidad) {
		this.isBusquedaDesdeForeignKeySesionUnidad = isBusquedaDesdeForeignKeySesionUnidad;
	}

	public Long getlidUnidadActual() {
		return lidUnidadActual;
	}

	public void setlidUnidadActual(Long lidUnidadActual) {
		this.lidUnidadActual = lidUnidadActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCentroCosto() {
		return isBusquedaDesdeForeignKeySesionCentroCosto;
	}

	public void setisBusquedaDesdeForeignKeySesionCentroCosto(
		Boolean isBusquedaDesdeForeignKeySesionCentroCosto) {
		this.isBusquedaDesdeForeignKeySesionCentroCosto = isBusquedaDesdeForeignKeySesionCentroCosto;
	}

	public Long getlidCentroCostoActual() {
		return lidCentroCostoActual;
	}

	public void setlidCentroCostoActual(Long lidCentroCostoActual) {
		this.lidCentroCostoActual = lidCentroCostoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEstadoBodegaProducto() {
		return isBusquedaDesdeForeignKeySesionEstadoBodegaProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionEstadoBodegaProducto(
		Boolean isBusquedaDesdeForeignKeySesionEstadoBodegaProducto) {
		this.isBusquedaDesdeForeignKeySesionEstadoBodegaProducto = isBusquedaDesdeForeignKeySesionEstadoBodegaProducto;
	}

	public Long getlidEstadoBodegaProductoActual() {
		return lidEstadoBodegaProductoActual;
	}

	public void setlidEstadoBodegaProductoActual(Long lidEstadoBodegaProductoActual) {
		this.lidEstadoBodegaProductoActual = lidEstadoBodegaProductoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableInventario() {
		return isBusquedaDesdeForeignKeySesionCuentaContableInventario;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableInventario(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableInventario) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableInventario = isBusquedaDesdeForeignKeySesionCuentaContableInventario;
	}

	public Long getlidCuentaContableInventarioActual() {
		return lidCuentaContableInventarioActual;
	}

	public void setlidCuentaContableInventarioActual(Long lidCuentaContableInventarioActual) {
		this.lidCuentaContableInventarioActual = lidCuentaContableInventarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCostoVenta() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCostoVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCostoVenta(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCostoVenta) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCostoVenta = isBusquedaDesdeForeignKeySesionCuentaContableCostoVenta;
	}

	public Long getlidCuentaContableCostoVentaActual() {
		return lidCuentaContableCostoVentaActual;
	}

	public void setlidCuentaContableCostoVentaActual(Long lidCuentaContableCostoVentaActual) {
		this.lidCuentaContableCostoVentaActual = lidCuentaContableCostoVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableVenta() {
		return isBusquedaDesdeForeignKeySesionCuentaContableVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableVenta(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableVenta) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableVenta = isBusquedaDesdeForeignKeySesionCuentaContableVenta;
	}

	public Long getlidCuentaContableVentaActual() {
		return lidCuentaContableVentaActual;
	}

	public void setlidCuentaContableVentaActual(Long lidCuentaContableVentaActual) {
		this.lidCuentaContableVentaActual = lidCuentaContableVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDescuento() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDescuento;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDescuento(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDescuento) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDescuento = isBusquedaDesdeForeignKeySesionCuentaContableDescuento;
	}

	public Long getlidCuentaContableDescuentoActual() {
		return lidCuentaContableDescuentoActual;
	}

	public void setlidCuentaContableDescuentoActual(Long lidCuentaContableDescuentoActual) {
		this.lidCuentaContableDescuentoActual = lidCuentaContableDescuentoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableProduccion() {
		return isBusquedaDesdeForeignKeySesionCuentaContableProduccion;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableProduccion(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableProduccion) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableProduccion = isBusquedaDesdeForeignKeySesionCuentaContableProduccion;
	}

	public Long getlidCuentaContableProduccionActual() {
		return lidCuentaContableProduccionActual;
	}

	public void setlidCuentaContableProduccionActual(Long lidCuentaContableProduccionActual) {
		this.lidCuentaContableProduccionActual = lidCuentaContableProduccionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDevolucion() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDevolucion;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDevolucion(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDevolucion) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDevolucion = isBusquedaDesdeForeignKeySesionCuentaContableDevolucion;
	}

	public Long getlidCuentaContableDevolucionActual() {
		return lidCuentaContableDevolucionActual;
	}

	public void setlidCuentaContableDevolucionActual(Long lidCuentaContableDevolucionActual) {
		this.lidCuentaContableDevolucionActual = lidCuentaContableDevolucionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableIngresoDebito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableIngresoDebito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableIngresoDebito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableIngresoDebito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableIngresoDebito = isBusquedaDesdeForeignKeySesionCuentaContableIngresoDebito;
	}

	public Long getlidCuentaContableIngresoDebitoActual() {
		return lidCuentaContableIngresoDebitoActual;
	}

	public void setlidCuentaContableIngresoDebitoActual(Long lidCuentaContableIngresoDebitoActual) {
		this.lidCuentaContableIngresoDebitoActual = lidCuentaContableIngresoDebitoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableIngresoCredito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableIngresoCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableIngresoCredito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableIngresoCredito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableIngresoCredito = isBusquedaDesdeForeignKeySesionCuentaContableIngresoCredito;
	}

	public Long getlidCuentaContableIngresoCreditoActual() {
		return lidCuentaContableIngresoCreditoActual;
	}

	public void setlidCuentaContableIngresoCreditoActual(Long lidCuentaContableIngresoCreditoActual) {
		this.lidCuentaContableIngresoCreditoActual = lidCuentaContableIngresoCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableResultadoDebito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableResultadoDebito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableResultadoDebito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableResultadoDebito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableResultadoDebito = isBusquedaDesdeForeignKeySesionCuentaContableResultadoDebito;
	}

	public Long getlidCuentaContableResultadoDebitoActual() {
		return lidCuentaContableResultadoDebitoActual;
	}

	public void setlidCuentaContableResultadoDebitoActual(Long lidCuentaContableResultadoDebitoActual) {
		this.lidCuentaContableResultadoDebitoActual = lidCuentaContableResultadoDebitoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableResultadoCredito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableResultadoCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableResultadoCredito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableResultadoCredito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableResultadoCredito = isBusquedaDesdeForeignKeySesionCuentaContableResultadoCredito;
	}

	public Long getlidCuentaContableResultadoCreditoActual() {
		return lidCuentaContableResultadoCreditoActual;
	}

	public void setlidCuentaContableResultadoCreditoActual(Long lidCuentaContableResultadoCreditoActual) {
		this.lidCuentaContableResultadoCreditoActual = lidCuentaContableResultadoCreditoActual;
	}
	
	
		
	
}
