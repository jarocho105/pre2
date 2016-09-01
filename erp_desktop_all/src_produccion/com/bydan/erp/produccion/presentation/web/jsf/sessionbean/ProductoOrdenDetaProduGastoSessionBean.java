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
public class ProductoOrdenDetaProduGastoSessionBean  extends ProductoOrdenDetaProduGastoSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGasto;
	protected Long lIdProductoOrdenDetaProduGastoActualForeignKey;	
	
	protected Long lIdProductoOrdenDetaProduGastoActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGastoParaPosibleAtras;
	protected String sUltimaBusquedaProductoOrdenDetaProduGasto;
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
	
	
	Boolean isBusquedaDesdeForeignKeySesionOrdenDetaProdu;
	Long lidOrdenDetaProduActual;
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
	private Long id_orden_deta_produ;
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
	
					
	 	
		
	
	protected ProductoOrdenDetaProduGastoSessionBeanAdditional productoordendetaprodugastoSessionBeanAdditional=null;
	
	public ProductoOrdenDetaProduGastoSessionBeanAdditional getProductoOrdenDetaProduGastoSessionBeanAdditional() {
		return this.productoordendetaprodugastoSessionBeanAdditional;
	}
	
	public void setProductoOrdenDetaProduGastoSessionBeanAdditional(ProductoOrdenDetaProduGastoSessionBeanAdditional productoordendetaprodugastoSessionBeanAdditional) {
		try {
			this.productoordendetaprodugastoSessionBeanAdditional=productoordendetaprodugastoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ProductoOrdenDetaProduGastoSessionBean () {
		this.inicializarProductoOrdenDetaProduGastoSessionBean();
	}
	
	public void inicializarProductoOrdenDetaProduGastoSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGasto=false;
		this.lIdProductoOrdenDetaProduGastoActualForeignKey=0L;
		this.lIdProductoOrdenDetaProduGastoActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGastoParaPosibleAtras=false;
		this.sUltimaBusquedaProductoOrdenDetaProduGasto ="";
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
		
		
		isBusquedaDesdeForeignKeySesionOrdenDetaProdu=false;
		lidOrdenDetaProduActual=0L;
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
		
		
		
 		this.id_orden_deta_produ=-1L;
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto= isPermiteNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto(String sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto = sNombrePaginaNavegacionHaciaForeignKeyDesdeProductoOrdenDetaProduGasto;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGasto() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGasto;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGasto(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGasto) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGasto= isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGasto;
	}
					
	public Long getlIdProductoOrdenDetaProduGastoActualForeignKey() {
		return lIdProductoOrdenDetaProduGastoActualForeignKey;
	}

	public void setlIdProductoOrdenDetaProduGastoActualForeignKey(
			Long lIdProductoOrdenDetaProduGastoActualForeignKey) {
		this.lIdProductoOrdenDetaProduGastoActualForeignKey = lIdProductoOrdenDetaProduGastoActualForeignKey;
	}
				    
	public Long getlIdProductoOrdenDetaProduGastoActualForeignKeyParaPosibleAtras() {
		return lIdProductoOrdenDetaProduGastoActualForeignKeyParaPosibleAtras;
	}

	public void setlIdProductoOrdenDetaProduGastoActualForeignKeyParaPosibleAtras(
			Long lIdProductoOrdenDetaProduGastoActualForeignKeyParaPosibleAtras) {
		this.lIdProductoOrdenDetaProduGastoActualForeignKeyParaPosibleAtras = lIdProductoOrdenDetaProduGastoActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGastoParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGastoParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGastoParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGastoParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGastoParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProduGastoParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaProductoOrdenDetaProduGasto() {
		return sUltimaBusquedaProductoOrdenDetaProduGasto;
	}

	public void setsUltimaBusquedaProductoOrdenDetaProduGasto(String sUltimaBusquedaProductoOrdenDetaProduGasto) {
		this.sUltimaBusquedaProductoOrdenDetaProduGasto = sUltimaBusquedaProductoOrdenDetaProduGasto;
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
    
	public Long getid_orden_deta_produ() {
		return this.id_orden_deta_produ;
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
						System.out.println("ProductoOrdenDetaProduGasto:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_orden_deta_produ(Long newid_orden_deta_produ)throws Exception
	{
		try {
			if(this.id_orden_deta_produ!=newid_orden_deta_produ) {
				if(newid_orden_deta_produ==null) {
					//newid_orden_deta_produ=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProductoOrdenDetaProduGasto:Valor nulo no permitido en columna id_orden_deta_produ");
					}
				}

				this.id_orden_deta_produ=newid_orden_deta_produ;
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
						System.out.println("ProductoOrdenDetaProduGasto:Valor nulo no permitido en columna id_tipo_gasto_produ_empresa");
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
						System.out.println("ProductoOrdenDetaProduGasto:Valor nulo no permitido en columna id_cuenta_contable_debito");
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
						System.out.println("ProductoOrdenDetaProduGasto:Valor nulo no permitido en columna id_cuenta_contable_credito");
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
						System.out.println("ProductoOrdenDetaProduGasto:Valor nulo no permitido en columna id_cliente_proveedor");
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
						System.out.println("ProductoOrdenDetaProduGasto:Valor nulo no permitido en columna id_factura");
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
						System.out.println("ProductoOrdenDetaProduGasto:Valor nulo no permitido en columna id_unidad");
					}
				}

				this.id_unidad=newid_unidad;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionOrdenDetaProdu() {
		return isBusquedaDesdeForeignKeySesionOrdenDetaProdu;
	}

	public void setisBusquedaDesdeForeignKeySesionOrdenDetaProdu(
		Boolean isBusquedaDesdeForeignKeySesionOrdenDetaProdu) {
		this.isBusquedaDesdeForeignKeySesionOrdenDetaProdu = isBusquedaDesdeForeignKeySesionOrdenDetaProdu;
	}

	public Long getlidOrdenDetaProduActual() {
		return lidOrdenDetaProduActual;
	}

	public void setlidOrdenDetaProduActual(Long lidOrdenDetaProduActual) {
		this.lidOrdenDetaProduActual = lidOrdenDetaProduActual;
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
