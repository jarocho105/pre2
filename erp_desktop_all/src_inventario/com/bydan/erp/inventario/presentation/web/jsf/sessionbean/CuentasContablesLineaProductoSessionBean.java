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
public class CuentasContablesLineaProductoSessionBean  extends CuentasContablesLineaProductoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProducto;
	protected Long lIdCuentasContablesLineaProductoActualForeignKey;	
	
	protected Long lIdCuentasContablesLineaProductoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProductoParaPosibleAtras;
	protected String sUltimaBusquedaCuentasContablesLineaProducto;
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
	Boolean isBusquedaDesdeForeignKeySesionBodega;
	Long lidBodegaActual;
	Boolean isBusquedaDesdeForeignKeySesionCentroCosto;
	Long lidCentroCostoActual;
	Boolean isBusquedaDesdeForeignKeySesionLinea;
	Long lidLineaActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaGrupo;
	Long lidLineaGrupoActual;
	Boolean isBusquedaDesdeForeignKeySesionLineaCategoria;
	Long lidLineaCategoriaActual;
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
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableIvaDebito;
	Long lidCuentaContableIvaDebitoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableIvaCredito;
	Long lidCuentaContableIvaCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableBonifica;
	Long lidCuentaContableBonificaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica;
	Long lidCuentaContableCostoBonificaActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_bodega;
	private Long id_centro_costo;
	private Long id_linea;
	private Long id_linea_grupo;
	private Long id_linea_categoria;
	private Long id_cuenta_contable_inventario;
	private Long id_cuenta_contable_costo_venta;
	private Long id_cuenta_contable_venta;
	private Long id_cuenta_contable_descuento;
	private Long id_cuenta_contable_produccion;
	private Long id_cuenta_contable_devolucion;
	private Long id_cuenta_contable_iva_debito;
	private Long id_cuenta_contable_iva_credito;
	private Long id_cuenta_contable_bonifica;
	private Long id_cuenta_contable_costo_bonifica;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected CuentasContablesLineaProductoSessionBeanAdditional cuentascontableslineaproductoSessionBeanAdditional=null;
	
	public CuentasContablesLineaProductoSessionBeanAdditional getCuentasContablesLineaProductoSessionBeanAdditional() {
		return this.cuentascontableslineaproductoSessionBeanAdditional;
	}
	
	public void setCuentasContablesLineaProductoSessionBeanAdditional(CuentasContablesLineaProductoSessionBeanAdditional cuentascontableslineaproductoSessionBeanAdditional) {
		try {
			this.cuentascontableslineaproductoSessionBeanAdditional=cuentascontableslineaproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public CuentasContablesLineaProductoSessionBean () {
		this.inicializarCuentasContablesLineaProductoSessionBean();
	}
	
	public void inicializarCuentasContablesLineaProductoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProducto=false;
		this.lIdCuentasContablesLineaProductoActualForeignKey=0L;
		this.lIdCuentasContablesLineaProductoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProductoParaPosibleAtras=false;
		this.sUltimaBusquedaCuentasContablesLineaProducto ="";
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
		isBusquedaDesdeForeignKeySesionBodega=false;
		lidBodegaActual=0L;
		isBusquedaDesdeForeignKeySesionCentroCosto=false;
		lidCentroCostoActual=0L;
		isBusquedaDesdeForeignKeySesionLinea=false;
		lidLineaActual=0L;
		isBusquedaDesdeForeignKeySesionLineaGrupo=false;
		lidLineaGrupoActual=0L;
		isBusquedaDesdeForeignKeySesionLineaCategoria=false;
		lidLineaCategoriaActual=0L;
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
		isBusquedaDesdeForeignKeySesionCuentaContableIvaDebito=false;
		lidCuentaContableIvaDebitoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableIvaCredito=false;
		lidCuentaContableIvaCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableBonifica=false;
		lidCuentaContableBonificaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica=false;
		lidCuentaContableCostoBonificaActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_bodega=-1L;
 		this.id_centro_costo=null;
 		this.id_linea=-1L;
 		this.id_linea_grupo=-1L;
 		this.id_linea_categoria=-1L;
 		this.id_cuenta_contable_inventario=-1L;
 		this.id_cuenta_contable_costo_venta=-1L;
 		this.id_cuenta_contable_venta=-1L;
 		this.id_cuenta_contable_descuento=-1L;
 		this.id_cuenta_contable_produccion=-1L;
 		this.id_cuenta_contable_devolucion=-1L;
 		this.id_cuenta_contable_iva_debito=-1L;
 		this.id_cuenta_contable_iva_credito=-1L;
 		this.id_cuenta_contable_bonifica=-1L;
 		this.id_cuenta_contable_costo_bonifica=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto= isPermiteNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto = sNombrePaginaNavegacionHaciaForeignKeyDesdeCuentasContablesLineaProducto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProducto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProducto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProducto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProducto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProducto= isBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProducto;
	}
					
	public Long getlIdCuentasContablesLineaProductoActualForeignKey() {
		return lIdCuentasContablesLineaProductoActualForeignKey;
	}

	public void setlIdCuentasContablesLineaProductoActualForeignKey(
			Long lIdCuentasContablesLineaProductoActualForeignKey) {
		this.lIdCuentasContablesLineaProductoActualForeignKey = lIdCuentasContablesLineaProductoActualForeignKey;
	}
				    
	public Long getlIdCuentasContablesLineaProductoActualForeignKeyParaPosibleAtras() {
		return lIdCuentasContablesLineaProductoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdCuentasContablesLineaProductoActualForeignKeyParaPosibleAtras(
			Long lIdCuentasContablesLineaProductoActualForeignKeyParaPosibleAtras) {
		this.lIdCuentasContablesLineaProductoActualForeignKeyParaPosibleAtras = lIdCuentasContablesLineaProductoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProductoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProductoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProductoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProductoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProductoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyCuentasContablesLineaProductoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaCuentasContablesLineaProducto() {
		return sUltimaBusquedaCuentasContablesLineaProducto;
	}

	public void setsUltimaBusquedaCuentasContablesLineaProducto(String sUltimaBusquedaCuentasContablesLineaProducto) {
		this.sUltimaBusquedaCuentasContablesLineaProducto = sUltimaBusquedaCuentasContablesLineaProducto;
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
    
	public Long getid_bodega() {
		return this.id_bodega;
	}
    
	public Long getid_centro_costo() {
		return this.id_centro_costo;
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
    
	public Long getid_cuenta_contable_iva_debito() {
		return this.id_cuenta_contable_iva_debito;
	}
    
	public Long getid_cuenta_contable_iva_credito() {
		return this.id_cuenta_contable_iva_credito;
	}
    
	public Long getid_cuenta_contable_bonifica() {
		return this.id_cuenta_contable_bonifica;
	}
    
	public Long getid_cuenta_contable_costo_bonifica() {
		return this.id_cuenta_contable_costo_bonifica;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id");
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
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_empresa");
					}
				}

				this.id_empresa=newid_empresa;
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
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_bodega");
					}
				}

				this.id_bodega=newid_bodega;
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
    
	public void setid_linea(Long newid_linea)throws Exception
	{
		try {
			if(this.id_linea!=newid_linea) {
				if(newid_linea==null) {
					//newid_linea=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_linea");
					}
				}

				this.id_linea=newid_linea;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea_grupo(Long newid_linea_grupo)throws Exception
	{
		try {
			if(this.id_linea_grupo!=newid_linea_grupo) {
				if(newid_linea_grupo==null) {
					//newid_linea_grupo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_linea_grupo");
					}
				}

				this.id_linea_grupo=newid_linea_grupo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_linea_categoria(Long newid_linea_categoria)throws Exception
	{
		try {
			if(this.id_linea_categoria!=newid_linea_categoria) {
				if(newid_linea_categoria==null) {
					//newid_linea_categoria=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_linea_categoria");
					}
				}

				this.id_linea_categoria=newid_linea_categoria;
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
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_cuenta_contable_inventario");
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
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_cuenta_contable_costo_venta");
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
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_cuenta_contable_venta");
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
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_cuenta_contable_descuento");
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
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_cuenta_contable_produccion");
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
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_cuenta_contable_devolucion");
					}
				}

				this.id_cuenta_contable_devolucion=newid_cuenta_contable_devolucion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_iva_debito(Long newid_cuenta_contable_iva_debito)throws Exception
	{
		try {
			if(this.id_cuenta_contable_iva_debito!=newid_cuenta_contable_iva_debito) {
				if(newid_cuenta_contable_iva_debito==null) {
					//newid_cuenta_contable_iva_debito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_cuenta_contable_iva_debito");
					}
				}

				this.id_cuenta_contable_iva_debito=newid_cuenta_contable_iva_debito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_iva_credito(Long newid_cuenta_contable_iva_credito)throws Exception
	{
		try {
			if(this.id_cuenta_contable_iva_credito!=newid_cuenta_contable_iva_credito) {
				if(newid_cuenta_contable_iva_credito==null) {
					//newid_cuenta_contable_iva_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_cuenta_contable_iva_credito");
					}
				}

				this.id_cuenta_contable_iva_credito=newid_cuenta_contable_iva_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_bonifica(Long newid_cuenta_contable_bonifica)throws Exception
	{
		try {
			if(this.id_cuenta_contable_bonifica!=newid_cuenta_contable_bonifica) {
				if(newid_cuenta_contable_bonifica==null) {
					//newid_cuenta_contable_bonifica=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_cuenta_contable_bonifica");
					}
				}

				this.id_cuenta_contable_bonifica=newid_cuenta_contable_bonifica;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_costo_bonifica(Long newid_cuenta_contable_costo_bonifica)throws Exception
	{
		try {
			if(this.id_cuenta_contable_costo_bonifica!=newid_cuenta_contable_costo_bonifica) {
				if(newid_cuenta_contable_costo_bonifica==null) {
					//newid_cuenta_contable_costo_bonifica=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("CuentasContablesLineaProducto:Valor nulo no permitido en columna id_cuenta_contable_costo_bonifica");
					}
				}

				this.id_cuenta_contable_costo_bonifica=newid_cuenta_contable_costo_bonifica;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableIvaDebito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableIvaDebito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableIvaDebito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableIvaDebito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableIvaDebito = isBusquedaDesdeForeignKeySesionCuentaContableIvaDebito;
	}

	public Long getlidCuentaContableIvaDebitoActual() {
		return lidCuentaContableIvaDebitoActual;
	}

	public void setlidCuentaContableIvaDebitoActual(Long lidCuentaContableIvaDebitoActual) {
		this.lidCuentaContableIvaDebitoActual = lidCuentaContableIvaDebitoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableIvaCredito() {
		return isBusquedaDesdeForeignKeySesionCuentaContableIvaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableIvaCredito(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableIvaCredito) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableIvaCredito = isBusquedaDesdeForeignKeySesionCuentaContableIvaCredito;
	}

	public Long getlidCuentaContableIvaCreditoActual() {
		return lidCuentaContableIvaCreditoActual;
	}

	public void setlidCuentaContableIvaCreditoActual(Long lidCuentaContableIvaCreditoActual) {
		this.lidCuentaContableIvaCreditoActual = lidCuentaContableIvaCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableBonifica() {
		return isBusquedaDesdeForeignKeySesionCuentaContableBonifica;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableBonifica(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableBonifica) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableBonifica = isBusquedaDesdeForeignKeySesionCuentaContableBonifica;
	}

	public Long getlidCuentaContableBonificaActual() {
		return lidCuentaContableBonificaActual;
	}

	public void setlidCuentaContableBonificaActual(Long lidCuentaContableBonificaActual) {
		this.lidCuentaContableBonificaActual = lidCuentaContableBonificaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica = isBusquedaDesdeForeignKeySesionCuentaContableCostoBonifica;
	}

	public Long getlidCuentaContableCostoBonificaActual() {
		return lidCuentaContableCostoBonificaActual;
	}

	public void setlidCuentaContableCostoBonificaActual(Long lidCuentaContableCostoBonificaActual) {
		this.lidCuentaContableCostoBonificaActual = lidCuentaContableCostoBonificaActual;
	}
	
	
		
	
}
