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
public class ProductoCuentaContableSessionBean  extends ProductoCuentaContableSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProductoCuentaContable;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoCuentaContable;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContable;
	protected Long lIdProductoCuentaContableActualForeignKey;	
	
	protected Long lIdProductoCuentaContableActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContableParaPosibleAtras;
	protected String sUltimaBusquedaProductoCuentaContable;
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
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableInventario;
	Long lidCuentaContableInventarioActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCosto;
	Long lidCuentaContableCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableVenta;
	Long lidCuentaContableVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDescuento;
	Long lidCuentaContableDescuentoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDevolucion;
	Long lidCuentaContableDevolucionActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDebito;
	Long lidCuentaContableDebitoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	Long lidCuentaContableCreditoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_bodega;
	private Long id_producto;
	private Long id_centro_costo;
	private Long id_cuenta_contable_inventario;
	private Long id_cuenta_contable_costo;
	private Long id_cuenta_contable_venta;
	private Long id_cuenta_contable_descuento;
	private Long id_cuenta_contable_devolucion;
	private Long id_cuenta_contable_debito;
	private Long id_cuenta_contable_credito;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProductoCuentaContableSessionBeanAdditional productocuentacontableSessionBeanAdditional=null;
	
	public ProductoCuentaContableSessionBeanAdditional getProductoCuentaContableSessionBeanAdditional() {
		return this.productocuentacontableSessionBeanAdditional;
	}
	
	public void setProductoCuentaContableSessionBeanAdditional(ProductoCuentaContableSessionBeanAdditional productocuentacontableSessionBeanAdditional) {
		try {
			this.productocuentacontableSessionBeanAdditional=productocuentacontableSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProductoCuentaContableSessionBean () {
		this.inicializarProductoCuentaContableSessionBean();
	}
	
	public void inicializarProductoCuentaContableSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProductoCuentaContable=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoCuentaContable="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContable=false;
		this.lIdProductoCuentaContableActualForeignKey=0L;
		this.lIdProductoCuentaContableActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContableParaPosibleAtras=false;
		this.sUltimaBusquedaProductoCuentaContable ="";
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
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableInventario=false;
		lidCuentaContableInventarioActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCosto=false;
		lidCuentaContableCostoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableVenta=false;
		lidCuentaContableVentaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDescuento=false;
		lidCuentaContableDescuentoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDevolucion=false;
		lidCuentaContableDevolucionActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDebito=false;
		lidCuentaContableDebitoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCredito=false;
		lidCuentaContableCreditoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_bodega=-1L;
 		this.id_producto=-1L;
 		this.id_centro_costo=null;
 		this.id_cuenta_contable_inventario=-1L;
 		this.id_cuenta_contable_costo=-1L;
 		this.id_cuenta_contable_venta=-1L;
 		this.id_cuenta_contable_descuento=-1L;
 		this.id_cuenta_contable_devolucion=-1L;
 		this.id_cuenta_contable_debito=-1L;
 		this.id_cuenta_contable_credito=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProductoCuentaContable() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProductoCuentaContable;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProductoCuentaContable(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProductoCuentaContable) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProductoCuentaContable= isPermiteNavegacionHaciaForeignKeyDesdeProductoCuentaContable;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoCuentaContable() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoCuentaContable;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoCuentaContable(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoCuentaContable) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoCuentaContable = sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoCuentaContable;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContable() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContable;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContable(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContable) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContable= isBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContable;
	}
					
	public Long getlIdProductoCuentaContableActualForeignKey() {
		return lIdProductoCuentaContableActualForeignKey;
	}

	public void setlIdProductoCuentaContableActualForeignKey(
			Long lIdProductoCuentaContableActualForeignKey) {
		this.lIdProductoCuentaContableActualForeignKey = lIdProductoCuentaContableActualForeignKey;
	}
				    
	public Long getlIdProductoCuentaContableActualForeignKeyParaPosibleAtras() {
		return lIdProductoCuentaContableActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProductoCuentaContableActualForeignKeyParaPosibleAtras(
			Long lIdProductoCuentaContableActualForeignKeyParaPosibleAtras) {
		this.lIdProductoCuentaContableActualForeignKeyParaPosibleAtras = lIdProductoCuentaContableActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContableParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContableParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContableParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContableParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContableParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProductoCuentaContableParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProductoCuentaContable() {
		return sUltimaBusquedaProductoCuentaContable;
	}

	public void setsUltimaBusquedaProductoCuentaContable(String sUltimaBusquedaProductoCuentaContable) {
		this.sUltimaBusquedaProductoCuentaContable = sUltimaBusquedaProductoCuentaContable;
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
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
	}
    
	public Long getid_cuenta_contable_inventario() {
		return this.id_cuenta_contable_inventario;
	}
    
	public Long getid_cuenta_contable_costo() {
		return this.id_cuenta_contable_costo;
	}
    
	public Long getid_cuenta_contable_venta() {
		return this.id_cuenta_contable_venta;
	}
    
	public Long getid_cuenta_contable_descuento() {
		return this.id_cuenta_contable_descuento;
	}
    
	public Long getid_cuenta_contable_devolucion() {
		return this.id_cuenta_contable_devolucion;
	}
    
	public Long getid_cuenta_contable_debito() {
		return this.id_cuenta_contable_debito;
	}
    
	public Long getid_cuenta_contable_credito() {
		return this.id_cuenta_contable_credito;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoCuentaContable:Valor nulo no permitido en columna id");
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
						System.out.println("ProductoCuentaContable:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ProductoCuentaContable:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("ProductoCuentaContable:Valor nulo no permitido en columna id_bodega");
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
						System.out.println("ProductoCuentaContable:Valor nulo no permitido en columna id_producto");
					}
				}

				this.id_producto=newid_producto;
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
    
	public void setid_cuenta_contable_inventario(Long newid_cuenta_contable_inventario)throws Exception
	{
		try {
			if(this.id_cuenta_contable_inventario!=newid_cuenta_contable_inventario) {
				if(newid_cuenta_contable_inventario==null) {
					//newid_cuenta_contable_inventario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoCuentaContable:Valor nulo no permitido en columna id_cuenta_contable_inventario");
					}
				}

				this.id_cuenta_contable_inventario=newid_cuenta_contable_inventario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_costo(Long newid_cuenta_contable_costo)throws Exception
	{
		try {
			if(this.id_cuenta_contable_costo!=newid_cuenta_contable_costo) {
				if(newid_cuenta_contable_costo==null) {
					//newid_cuenta_contable_costo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoCuentaContable:Valor nulo no permitido en columna id_cuenta_contable_costo");
					}
				}

				this.id_cuenta_contable_costo=newid_cuenta_contable_costo;
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
						System.out.println("ProductoCuentaContable:Valor nulo no permitido en columna id_cuenta_contable_venta");
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
						System.out.println("ProductoCuentaContable:Valor nulo no permitido en columna id_cuenta_contable_descuento");
					}
				}

				this.id_cuenta_contable_descuento=newid_cuenta_contable_descuento;
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
						System.out.println("ProductoCuentaContable:Valor nulo no permitido en columna id_cuenta_contable_devolucion");
					}
				}

				this.id_cuenta_contable_devolucion=newid_cuenta_contable_devolucion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_debito(Long newid_cuenta_contable_debito)throws Exception
	{
		try {
			if(this.id_cuenta_contable_debito!=newid_cuenta_contable_debito) {
				if(newid_cuenta_contable_debito==null) {
					//newid_cuenta_contable_debito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoCuentaContable:Valor nulo no permitido en columna id_cuenta_contable_debito");
					}
				}

				this.id_cuenta_contable_debito=newid_cuenta_contable_debito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_credito(Long newid_cuenta_contable_credito)throws Exception
	{
		try {
			if(this.id_cuenta_contable_credito!=newid_cuenta_contable_credito) {
				if(newid_cuenta_contable_credito==null) {
					//newid_cuenta_contable_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoCuentaContable:Valor nulo no permitido en columna id_cuenta_contable_credito");
					}
				}

				this.id_cuenta_contable_credito=newid_cuenta_contable_credito;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCosto() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCosto;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCosto(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCosto) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCosto = isBusquedaDesdeForeignKeySesionCuentaContableCosto;
	}

	public Long getlidCuentaContableCostoActual() {
		return lidCuentaContableCostoActual;
	}

	public void setlidCuentaContableCostoActual(Long lidCuentaContableCostoActual) {
		this.lidCuentaContableCostoActual = lidCuentaContableCostoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableDebito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableDebito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableDebito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableDebito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableDebito = isBusquedaDesdeForeignKeySesionCuentaContableDebito;
	}

	public Long getlidCuentaContableDebitoActual() {
		return lidCuentaContableDebitoActual;
	}

	public void setlidCuentaContableDebitoActual(Long lidCuentaContableDebitoActual) {
		this.lidCuentaContableDebitoActual = lidCuentaContableDebitoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCredito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCredito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCredito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCredito = isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	}

	public Long getlidCuentaContableCreditoActual() {
		return lidCuentaContableCreditoActual;
	}

	public void setlidCuentaContableCreditoActual(Long lidCuentaContableCreditoActual) {
		this.lidCuentaContableCreditoActual = lidCuentaContableCreditoActual;
	}
	
	
		
	
}
