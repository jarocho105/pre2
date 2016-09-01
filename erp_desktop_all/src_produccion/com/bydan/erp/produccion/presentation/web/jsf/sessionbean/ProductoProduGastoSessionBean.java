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
package com.bydan.erp.produccion.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.produccion.business.entity.*;

@SuppressWarnings("unused")
public class ProductoProduGastoSessionBean  extends ProductoProduGastoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProductoProduGasto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduGasto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoProduGasto;
	protected Long lIdProductoProduGastoActualForeignKey;	
	
	protected Long lIdProductoProduGastoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoProduGastoParaPosibleAtras;
	protected String sUltimaBusquedaProductoProduGasto;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionProductoDefiProdu;
	Long lidProductoDefiProduActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoGastoProduEmpresa;
	Long lidTipoGastoProduEmpresaActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableDebito;
	Long lidCuentaContableDebitoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	Long lidCuentaContableCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionClienteProveedor;
	Long lidClienteProveedorActual;
	Boolean isBusquedaDesdeForeignKeySesionFactura;
	Long lidFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionUnidad;
	Long lidUnidadActual;
	
	private Long id;
	private Long id_producto_defi_produ;
	private Long id_tipo_gasto_produ_empresa;
	private Long id_cuenta_contable_debito;
	private Long id_cuenta_contable_credito;
	private Long id_cliente_proveedor;
	private Long id_factura;
	private Long id_unidad;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ProductoProduGastoSessionBeanAdditional productoprodugastoSessionBeanAdditional=null;
	
	public ProductoProduGastoSessionBeanAdditional getProductoProduGastoSessionBeanAdditional() {
		return this.productoprodugastoSessionBeanAdditional;
	}
	
	public void setProductoProduGastoSessionBeanAdditional(ProductoProduGastoSessionBeanAdditional productoprodugastoSessionBeanAdditional) {
		try {
			this.productoprodugastoSessionBeanAdditional=productoprodugastoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProductoProduGastoSessionBean () {
		this.inicializarProductoProduGastoSessionBean();
	}
	
	public void inicializarProductoProduGastoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProductoProduGasto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduGasto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoProduGasto=false;
		this.lIdProductoProduGastoActualForeignKey=0L;
		this.lIdProductoProduGastoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoProduGastoParaPosibleAtras=false;
		this.sUltimaBusquedaProductoProduGasto ="";
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
		
		
		isBusquedaDesdeForeignKeySesionProductoDefiProdu=false;
		lidProductoDefiProduActual=0L;
		isBusquedaDesdeForeignKeySesionTipoGastoProduEmpresa=false;
		lidTipoGastoProduEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableDebito=false;
		lidCuentaContableDebitoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCredito=false;
		lidCuentaContableCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionClienteProveedor=false;
		lidClienteProveedorActual=0L;
		isBusquedaDesdeForeignKeySesionFactura=false;
		lidFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionUnidad=false;
		lidUnidadActual=0L; 
		
		
		
 		this.id_producto_defi_produ=-1L;
 		this.id_tipo_gasto_produ_empresa=-1L;
 		this.id_cuenta_contable_debito=-1L;
 		this.id_cuenta_contable_credito=-1L;
 		this.id_cliente_proveedor=-1L;
 		this.id_factura=-1L;
 		this.id_unidad=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProductoProduGasto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProductoProduGasto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProductoProduGasto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProductoProduGasto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProductoProduGasto= isPermiteNavegacionHaciaForeignKeyDesdeProductoProduGasto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduGasto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduGasto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduGasto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduGasto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduGasto = sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoProduGasto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProductoProduGasto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProductoProduGasto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProductoProduGasto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoProduGasto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoProduGasto= isBusquedaDesdeForeignKeySesionForeignKeyProductoProduGasto;
	}
					
	public Long getlIdProductoProduGastoActualForeignKey() {
		return lIdProductoProduGastoActualForeignKey;
	}

	public void setlIdProductoProduGastoActualForeignKey(
			Long lIdProductoProduGastoActualForeignKey) {
		this.lIdProductoProduGastoActualForeignKey = lIdProductoProduGastoActualForeignKey;
	}
				    
	public Long getlIdProductoProduGastoActualForeignKeyParaPosibleAtras() {
		return lIdProductoProduGastoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProductoProduGastoActualForeignKeyParaPosibleAtras(
			Long lIdProductoProduGastoActualForeignKeyParaPosibleAtras) {
		this.lIdProductoProduGastoActualForeignKeyParaPosibleAtras = lIdProductoProduGastoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProductoProduGastoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProductoProduGastoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProductoProduGastoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoProduGastoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoProduGastoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProductoProduGastoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProductoProduGasto() {
		return sUltimaBusquedaProductoProduGasto;
	}

	public void setsUltimaBusquedaProductoProduGasto(String sUltimaBusquedaProductoProduGasto) {
		this.sUltimaBusquedaProductoProduGasto = sUltimaBusquedaProductoProduGasto;
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
    
	public Long getid_producto_defi_produ() {
		return this.id_producto_defi_produ;
	}
    
	public Long getid_tipo_gasto_produ_empresa() {
		return this.id_tipo_gasto_produ_empresa;
	}
    
	public Long getid_cuenta_contable_debito() {
		return this.id_cuenta_contable_debito;
	}
    
	public Long getid_cuenta_contable_credito() {
		return this.id_cuenta_contable_credito;
	}
    
	public Long getid_cliente_proveedor() {
		return this.id_cliente_proveedor;
	}
    
	public Long getid_factura() {
		return this.id_factura;
	}
    
	public Long getid_unidad() {
		return this.id_unidad;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoProduGasto:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_producto_defi_produ(Long newid_producto_defi_produ)throws Exception
	{
		try {
			if(this.id_producto_defi_produ!=newid_producto_defi_produ) {
				if(newid_producto_defi_produ==null) {
					//newid_producto_defi_produ=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoProduGasto:Valor nulo no permitido en columna id_producto_defi_produ");
					}
				}

				this.id_producto_defi_produ=newid_producto_defi_produ;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_gasto_produ_empresa(Long newid_tipo_gasto_produ_empresa)throws Exception
	{
		try {
			if(this.id_tipo_gasto_produ_empresa!=newid_tipo_gasto_produ_empresa) {
				if(newid_tipo_gasto_produ_empresa==null) {
					//newid_tipo_gasto_produ_empresa=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoProduGasto:Valor nulo no permitido en columna id_tipo_gasto_produ_empresa");
					}
				}

				this.id_tipo_gasto_produ_empresa=newid_tipo_gasto_produ_empresa;
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
						System.out.println("ProductoProduGasto:Valor nulo no permitido en columna id_cuenta_contable_debito");
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
						System.out.println("ProductoProduGasto:Valor nulo no permitido en columna id_cuenta_contable_credito");
					}
				}

				this.id_cuenta_contable_credito=newid_cuenta_contable_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cliente_proveedor(Long newid_cliente_proveedor)throws Exception
	{
		try {
			if(this.id_cliente_proveedor!=newid_cliente_proveedor) {
				if(newid_cliente_proveedor==null) {
					//newid_cliente_proveedor=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoProduGasto:Valor nulo no permitido en columna id_cliente_proveedor");
					}
				}

				this.id_cliente_proveedor=newid_cliente_proveedor;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_factura(Long newid_factura)throws Exception
	{
		try {
			if(this.id_factura!=newid_factura) {
				if(newid_factura==null) {
					//newid_factura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoProduGasto:Valor nulo no permitido en columna id_factura");
					}
				}

				this.id_factura=newid_factura;
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
						System.out.println("ProductoProduGasto:Valor nulo no permitido en columna id_unidad");
					}
				}

				this.id_unidad=newid_unidad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionProductoDefiProdu() {
		return isBusquedaDesdeForeignKeySesionProductoDefiProdu;
	}

	public void setisBusquedaDesdeForeignKeySesionProductoDefiProdu(
		Boolean isBusquedaDesdeForeignKeySesionProductoDefiProdu) {
		this.isBusquedaDesdeForeignKeySesionProductoDefiProdu = isBusquedaDesdeForeignKeySesionProductoDefiProdu;
	}

	public Long getlidProductoDefiProduActual() {
		return lidProductoDefiProduActual;
	}

	public void setlidProductoDefiProduActual(Long lidProductoDefiProduActual) {
		this.lidProductoDefiProduActual = lidProductoDefiProduActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoGastoProduEmpresa() {
		return isBusquedaDesdeForeignKeySesionTipoGastoProduEmpresa;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoGastoProduEmpresa(
		Boolean isBusquedaDesdeForeignKeySesionTipoGastoProduEmpresa) {
		this.isBusquedaDesdeForeignKeySesionTipoGastoProduEmpresa = isBusquedaDesdeForeignKeySesionTipoGastoProduEmpresa;
	}

	public Long getlidTipoGastoProduEmpresaActual() {
		return lidTipoGastoProduEmpresaActual;
	}

	public void setlidTipoGastoProduEmpresaActual(Long lidTipoGastoProduEmpresaActual) {
		this.lidTipoGastoProduEmpresaActual = lidTipoGastoProduEmpresaActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionClienteProveedor() {
		return isBusquedaDesdeForeignKeySesionClienteProveedor;
	}

	public void setisBusquedaDesdeForeignKeySesionClienteProveedor(
		Boolean isBusquedaDesdeForeignKeySesionClienteProveedor) {
		this.isBusquedaDesdeForeignKeySesionClienteProveedor = isBusquedaDesdeForeignKeySesionClienteProveedor;
	}

	public Long getlidClienteProveedorActual() {
		return lidClienteProveedorActual;
	}

	public void setlidClienteProveedorActual(Long lidClienteProveedorActual) {
		this.lidClienteProveedorActual = lidClienteProveedorActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFactura() {
		return isBusquedaDesdeForeignKeySesionFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionFactura(
		Boolean isBusquedaDesdeForeignKeySesionFactura) {
		this.isBusquedaDesdeForeignKeySesionFactura = isBusquedaDesdeForeignKeySesionFactura;
	}

	public Long getlidFacturaActual() {
		return lidFacturaActual;
	}

	public void setlidFacturaActual(Long lidFacturaActual) {
		this.lidFacturaActual = lidFacturaActual;
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
	
	
		
	
}
