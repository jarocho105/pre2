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
package com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.contabilidad.business.entity.*;

@SuppressWarnings("unused")
public class FacturaProveedorSessionBean  extends FacturaProveedorSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFacturaProveedor;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaProveedor;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedor;
	protected Long lIdFacturaProveedorActualForeignKey;	
	
	protected Long lIdFacturaProveedorActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedorParaPosibleAtras;
	protected String sUltimaBusquedaFacturaProveedor;
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
	Boolean isBusquedaDesdeForeignKeySesionEjercicio;
	Long lidEjercicioActual;
	Boolean isBusquedaDesdeForeignKeySesionPeriodo;
	Long lidPeriodoActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionModulo;
	Long lidModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionPlantillaFactura;
	Long lidPlantillaFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumento;
	Long lidTipoDocumentoActual;
	Boolean isBusquedaDesdeForeignKeySesionFactura;
	Long lidFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccion;
	Long lidTransaccionActual;
	Boolean isBusquedaDesdeForeignKeySesionCliente;
	Long lidClienteActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleadoSolicita;
	Long lidEmpleadoSolicitaActual;
	Boolean isBusquedaDesdeForeignKeySesionMoneda;
	Long lidMonedaActual;
	Boolean isBusquedaDesdeForeignKeySesionEmpleado;
	Long lidEmpleadoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionFuente1;
	Long lidTipoRetencionFuente1Actual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionFuente2;
	Long lidTipoRetencionFuente2Actual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIva1;
	Long lidTipoRetencionIva1Actual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIva2;
	Long lidTipoRetencionIva2Actual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTributario;
	Long lidTipoTributarioActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalBienes;
	Long lidCuentaContableCreditoFiscalBienesActual;
	Boolean isBusquedaDesdeForeignKeySesionResponsableFondo;
	Long lidResponsableFondoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalServicios;
	Long lidCuentaContableCreditoFiscalServiciosActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableGasto;
	Long lidCuentaContableGastoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableGasto2;
	Long lidCuentaContableGasto2Actual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCreditoFin;
	Long lidCuentaContableCreditoFinActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCreditoFin2;
	Long lidCuentaContableCreditoFin2Actual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableCredito;
	Long lidCuentaContableCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoMovimiento;
	Long lidTipoMovimientoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoMovimientoModulo;
	Long lidTipoMovimientoModuloActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	Long lidTipoTransaccionModuloActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_anio;
	private Long id_mes;
	private Long id_modulo;
	private Long id_plantilla_factura;
	private Long id_tipo_documento;
	private Long id_factura;
	private Long id_transaccion;
	private Long id_cliente;
	private Long id_empleado_solicita;
	private Long id_moneda;
	private Long id_empleado;
	private Long id_tipo_retencion_fuente1;
	private Long id_tipo_retencion_fuente2;
	private Long id_tipo_retencion_iva1;
	private Long id_tipo_retencion_iva2;
	private Long id_tipo_tributario;
	private Long id_cuenta_contable_credito_fiscal_bienes;
	private Long id_responsable_fondo;
	private Long id_cuenta_contable_credito_fiscal_servicios;
	private Long id_cuenta_contable_gasto;
	private Long id_cuenta_contable_gasto2;
	private Long id_cuenta_contable_credito_fin;
	private Long id_cuenta_contable_credito_fin2;
	private Long id_cuenta_contable_credito;
	private Long id_tipo_movimiento;
	private Long id_tipo_movimiento_modulo;
	private Long id_tipo_transaccion_modulo;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FacturaProveedorSessionBeanAdditional facturaproveedorSessionBeanAdditional=null;
	
	public FacturaProveedorSessionBeanAdditional getFacturaProveedorSessionBeanAdditional() {
		return this.facturaproveedorSessionBeanAdditional;
	}
	
	public void setFacturaProveedorSessionBeanAdditional(FacturaProveedorSessionBeanAdditional facturaproveedorSessionBeanAdditional) {
		try {
			this.facturaproveedorSessionBeanAdditional=facturaproveedorSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FacturaProveedorSessionBean () {
		this.inicializarFacturaProveedorSessionBean();
	}
	
	public void inicializarFacturaProveedorSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFacturaProveedor=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaProveedor="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedor=false;
		this.lIdFacturaProveedorActualForeignKey=0L;
		this.lIdFacturaProveedorActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedorParaPosibleAtras=false;
		this.sUltimaBusquedaFacturaProveedor ="";
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
		
		this.conGuardarRelaciones=true;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionEmpresa=false;
		lidEmpresaActual=0L;
		isBusquedaDesdeForeignKeySesionSucursal=false;
		lidSucursalActual=0L;
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionModulo=false;
		lidModuloActual=0L;
		isBusquedaDesdeForeignKeySesionPlantillaFactura=false;
		lidPlantillaFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDocumento=false;
		lidTipoDocumentoActual=0L;
		isBusquedaDesdeForeignKeySesionFactura=false;
		lidFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccion=false;
		lidTransaccionActual=0L;
		isBusquedaDesdeForeignKeySesionCliente=false;
		lidClienteActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleadoSolicita=false;
		lidEmpleadoSolicitaActual=0L;
		isBusquedaDesdeForeignKeySesionMoneda=false;
		lidMonedaActual=0L;
		isBusquedaDesdeForeignKeySesionEmpleado=false;
		lidEmpleadoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionFuente1=false;
		lidTipoRetencionFuente1Actual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionFuente2=false;
		lidTipoRetencionFuente2Actual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionIva1=false;
		lidTipoRetencionIva1Actual=0L;
		isBusquedaDesdeForeignKeySesionTipoRetencionIva2=false;
		lidTipoRetencionIva2Actual=0L;
		isBusquedaDesdeForeignKeySesionTipoTributario=false;
		lidTipoTributarioActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalBienes=false;
		lidCuentaContableCreditoFiscalBienesActual=0L;
		isBusquedaDesdeForeignKeySesionResponsableFondo=false;
		lidResponsableFondoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalServicios=false;
		lidCuentaContableCreditoFiscalServiciosActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableGasto=false;
		lidCuentaContableGastoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableGasto2=false;
		lidCuentaContableGasto2Actual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCreditoFin=false;
		lidCuentaContableCreditoFinActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCreditoFin2=false;
		lidCuentaContableCreditoFin2Actual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableCredito=false;
		lidCuentaContableCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoMovimiento=false;
		lidTipoMovimientoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoMovimientoModulo=false;
		lidTipoMovimientoModuloActual=0L;
		isBusquedaDesdeForeignKeySesionTipoTransaccionModulo=false;
		lidTipoTransaccionModuloActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_anio=null;
 		this.id_mes=null;
 		this.id_modulo=-1L;
 		this.id_plantilla_factura=null;
 		this.id_tipo_documento=-1L;
 		this.id_factura=-1L;
 		this.id_transaccion=-1L;
 		this.id_cliente=-1L;
 		this.id_empleado_solicita=-1L;
 		this.id_moneda=-1L;
 		this.id_empleado=-1L;
 		this.id_tipo_retencion_fuente1=-1L;
 		this.id_tipo_retencion_fuente2=-1L;
 		this.id_tipo_retencion_iva1=-1L;
 		this.id_tipo_retencion_iva2=-1L;
 		this.id_tipo_tributario=-1L;
 		this.id_cuenta_contable_credito_fiscal_bienes=-1L;
 		this.id_responsable_fondo=-1L;
 		this.id_cuenta_contable_credito_fiscal_servicios=-1L;
 		this.id_cuenta_contable_gasto=-1L;
 		this.id_cuenta_contable_gasto2=-1L;
 		this.id_cuenta_contable_credito_fin=null;
 		this.id_cuenta_contable_credito_fin2=null;
 		this.id_cuenta_contable_credito=null;
 		this.id_tipo_movimiento=null;
 		this.id_tipo_movimiento_modulo=null;
 		this.id_tipo_transaccion_modulo=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFacturaProveedor() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFacturaProveedor;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFacturaProveedor(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFacturaProveedor) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFacturaProveedor= isPermiteNavegacionHaciaForeignKeyDesdeFacturaProveedor;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaProveedor() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaProveedor;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaProveedor(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaProveedor) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaProveedor = sNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaProveedor;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedor() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedor;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedor(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedor) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedor= isBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedor;
	}
					
	public Long getlIdFacturaProveedorActualForeignKey() {
		return lIdFacturaProveedorActualForeignKey;
	}

	public void setlIdFacturaProveedorActualForeignKey(
			Long lIdFacturaProveedorActualForeignKey) {
		this.lIdFacturaProveedorActualForeignKey = lIdFacturaProveedorActualForeignKey;
	}
				    
	public Long getlIdFacturaProveedorActualForeignKeyParaPosibleAtras() {
		return lIdFacturaProveedorActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFacturaProveedorActualForeignKeyParaPosibleAtras(
			Long lIdFacturaProveedorActualForeignKeyParaPosibleAtras) {
		this.lIdFacturaProveedorActualForeignKeyParaPosibleAtras = lIdFacturaProveedorActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedorParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedorParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedorParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedorParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedorParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFacturaProveedorParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFacturaProveedor() {
		return sUltimaBusquedaFacturaProveedor;
	}

	public void setsUltimaBusquedaFacturaProveedor(String sUltimaBusquedaFacturaProveedor) {
		this.sUltimaBusquedaFacturaProveedor = sUltimaBusquedaFacturaProveedor;
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
    
	public Long getid_ejercicio() {
		return this.id_ejercicio;
	}
    
	public Long getid_periodo() {
		return this.id_periodo;
	}
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
    
	public Long getid_modulo() {
		return this.id_modulo;
	}
    
	public Long getid_plantilla_factura() {
		return this.id_plantilla_factura;
	}
    
	public Long getid_tipo_documento() {
		return this.id_tipo_documento;
	}
    
	public Long getid_factura() {
		return this.id_factura;
	}
    
	public Long getid_transaccion() {
		return this.id_transaccion;
	}
    
	public Long getid_cliente() {
		return this.id_cliente;
	}
    
	public Long getid_empleado_solicita() {
		return this.id_empleado_solicita;
	}
    
	public Long getid_moneda() {
		return this.id_moneda;
	}
    
	public Long getid_empleado() {
		return this.id_empleado;
	}
    
	public Long getid_tipo_retencion_fuente1() {
		return this.id_tipo_retencion_fuente1;
	}
    
	public Long getid_tipo_retencion_fuente2() {
		return this.id_tipo_retencion_fuente2;
	}
    
	public Long getid_tipo_retencion_iva1() {
		return this.id_tipo_retencion_iva1;
	}
    
	public Long getid_tipo_retencion_iva2() {
		return this.id_tipo_retencion_iva2;
	}
    
	public Long getid_tipo_tributario() {
		return this.id_tipo_tributario;
	}
    
	public Long getid_cuenta_contable_credito_fiscal_bienes() {
		return this.id_cuenta_contable_credito_fiscal_bienes;
	}
    
	public Long getid_responsable_fondo() {
		return this.id_responsable_fondo;
	}
    
	public Long getid_cuenta_contable_credito_fiscal_servicios() {
		return this.id_cuenta_contable_credito_fiscal_servicios;
	}
    
	public Long getid_cuenta_contable_gasto() {
		return this.id_cuenta_contable_gasto;
	}
    
	public Long getid_cuenta_contable_gasto2() {
		return this.id_cuenta_contable_gasto2;
	}
    
	public Long getid_cuenta_contable_credito_fin() {
		return this.id_cuenta_contable_credito_fin;
	}
    
	public Long getid_cuenta_contable_credito_fin2() {
		return this.id_cuenta_contable_credito_fin2;
	}
    
	public Long getid_cuenta_contable_credito() {
		return this.id_cuenta_contable_credito;
	}
    
	public Long getid_tipo_movimiento() {
		return this.id_tipo_movimiento;
	}
    
	public Long getid_tipo_movimiento_modulo() {
		return this.id_tipo_movimiento_modulo;
	}
    
	public Long getid_tipo_transaccion_modulo() {
		return this.id_tipo_transaccion_modulo;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id");
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
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_sucursal");
					}
				}

				this.id_sucursal=newid_sucursal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_ejercicio(Long newid_ejercicio)throws Exception
	{
		try {
			if(this.id_ejercicio!=newid_ejercicio) {
				if(newid_ejercicio==null) {
					//newid_ejercicio=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_ejercicio");
					}
				}

				this.id_ejercicio=newid_ejercicio;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_periodo(Long newid_periodo)throws Exception
	{
		try {
			if(this.id_periodo!=newid_periodo) {
				if(newid_periodo==null) {
					//newid_periodo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_anio(Long newid_anio) {
		if(this.id_anio!=newid_anio) {

			this.id_anio=newid_anio;
		}
	}
    
	public void setid_mes(Long newid_mes) {
		if(this.id_mes!=newid_mes) {

			this.id_mes=newid_mes;
		}
	}
    
	public void setid_modulo(Long newid_modulo)throws Exception
	{
		try {
			if(this.id_modulo!=newid_modulo) {
				if(newid_modulo==null) {
					//newid_modulo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_modulo");
					}
				}

				this.id_modulo=newid_modulo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_plantilla_factura(Long newid_plantilla_factura) {
		if(this.id_plantilla_factura!=newid_plantilla_factura) {

			this.id_plantilla_factura=newid_plantilla_factura;
		}
	}
    
	public void setid_tipo_documento(Long newid_tipo_documento)throws Exception
	{
		try {
			if(this.id_tipo_documento!=newid_tipo_documento) {
				if(newid_tipo_documento==null) {
					//newid_tipo_documento=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_tipo_documento");
					}
				}

				this.id_tipo_documento=newid_tipo_documento;
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
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_factura");
					}
				}

				this.id_factura=newid_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion(Long newid_transaccion)throws Exception
	{
		try {
			if(this.id_transaccion!=newid_transaccion) {
				if(newid_transaccion==null) {
					//newid_transaccion=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_transaccion");
					}
				}

				this.id_transaccion=newid_transaccion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cliente(Long newid_cliente)throws Exception
	{
		try {
			if(this.id_cliente!=newid_cliente) {
				if(newid_cliente==null) {
					//newid_cliente=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_cliente");
					}
				}

				this.id_cliente=newid_cliente;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empleado_solicita(Long newid_empleado_solicita)throws Exception
	{
		try {
			if(this.id_empleado_solicita!=newid_empleado_solicita) {
				if(newid_empleado_solicita==null) {
					//newid_empleado_solicita=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_empleado_solicita");
					}
				}

				this.id_empleado_solicita=newid_empleado_solicita;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_moneda(Long newid_moneda)throws Exception
	{
		try {
			if(this.id_moneda!=newid_moneda) {
				if(newid_moneda==null) {
					//newid_moneda=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_moneda");
					}
				}

				this.id_moneda=newid_moneda;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_empleado(Long newid_empleado)throws Exception
	{
		try {
			if(this.id_empleado!=newid_empleado) {
				if(newid_empleado==null) {
					//newid_empleado=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_empleado");
					}
				}

				this.id_empleado=newid_empleado;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion_fuente1(Long newid_tipo_retencion_fuente1)throws Exception
	{
		try {
			if(this.id_tipo_retencion_fuente1!=newid_tipo_retencion_fuente1) {
				if(newid_tipo_retencion_fuente1==null) {
					//newid_tipo_retencion_fuente1=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_tipo_retencion_fuente1");
					}
				}

				this.id_tipo_retencion_fuente1=newid_tipo_retencion_fuente1;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion_fuente2(Long newid_tipo_retencion_fuente2)throws Exception
	{
		try {
			if(this.id_tipo_retencion_fuente2!=newid_tipo_retencion_fuente2) {
				if(newid_tipo_retencion_fuente2==null) {
					//newid_tipo_retencion_fuente2=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_tipo_retencion_fuente2");
					}
				}

				this.id_tipo_retencion_fuente2=newid_tipo_retencion_fuente2;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion_iva1(Long newid_tipo_retencion_iva1)throws Exception
	{
		try {
			if(this.id_tipo_retencion_iva1!=newid_tipo_retencion_iva1) {
				if(newid_tipo_retencion_iva1==null) {
					//newid_tipo_retencion_iva1=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_tipo_retencion_iva1");
					}
				}

				this.id_tipo_retencion_iva1=newid_tipo_retencion_iva1;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_retencion_iva2(Long newid_tipo_retencion_iva2)throws Exception
	{
		try {
			if(this.id_tipo_retencion_iva2!=newid_tipo_retencion_iva2) {
				if(newid_tipo_retencion_iva2==null) {
					//newid_tipo_retencion_iva2=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_tipo_retencion_iva2");
					}
				}

				this.id_tipo_retencion_iva2=newid_tipo_retencion_iva2;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_tributario(Long newid_tipo_tributario)throws Exception
	{
		try {
			if(this.id_tipo_tributario!=newid_tipo_tributario) {
				if(newid_tipo_tributario==null) {
					//newid_tipo_tributario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_tipo_tributario");
					}
				}

				this.id_tipo_tributario=newid_tipo_tributario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_credito_fiscal_bienes(Long newid_cuenta_contable_credito_fiscal_bienes)throws Exception
	{
		try {
			if(this.id_cuenta_contable_credito_fiscal_bienes!=newid_cuenta_contable_credito_fiscal_bienes) {
				if(newid_cuenta_contable_credito_fiscal_bienes==null) {
					//newid_cuenta_contable_credito_fiscal_bienes=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_cuenta_contable_credito_fiscal_bienes");
					}
				}

				this.id_cuenta_contable_credito_fiscal_bienes=newid_cuenta_contable_credito_fiscal_bienes;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_responsable_fondo(Long newid_responsable_fondo)throws Exception
	{
		try {
			if(this.id_responsable_fondo!=newid_responsable_fondo) {
				if(newid_responsable_fondo==null) {
					//newid_responsable_fondo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_responsable_fondo");
					}
				}

				this.id_responsable_fondo=newid_responsable_fondo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_credito_fiscal_servicios(Long newid_cuenta_contable_credito_fiscal_servicios)throws Exception
	{
		try {
			if(this.id_cuenta_contable_credito_fiscal_servicios!=newid_cuenta_contable_credito_fiscal_servicios) {
				if(newid_cuenta_contable_credito_fiscal_servicios==null) {
					//newid_cuenta_contable_credito_fiscal_servicios=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_cuenta_contable_credito_fiscal_servicios");
					}
				}

				this.id_cuenta_contable_credito_fiscal_servicios=newid_cuenta_contable_credito_fiscal_servicios;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_gasto(Long newid_cuenta_contable_gasto)throws Exception
	{
		try {
			if(this.id_cuenta_contable_gasto!=newid_cuenta_contable_gasto) {
				if(newid_cuenta_contable_gasto==null) {
					//newid_cuenta_contable_gasto=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_cuenta_contable_gasto");
					}
				}

				this.id_cuenta_contable_gasto=newid_cuenta_contable_gasto;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_gasto2(Long newid_cuenta_contable_gasto2)throws Exception
	{
		try {
			if(this.id_cuenta_contable_gasto2!=newid_cuenta_contable_gasto2) {
				if(newid_cuenta_contable_gasto2==null) {
					//newid_cuenta_contable_gasto2=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FacturaProveedor:Valor nulo no permitido en columna id_cuenta_contable_gasto2");
					}
				}

				this.id_cuenta_contable_gasto2=newid_cuenta_contable_gasto2;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_credito_fin(Long newid_cuenta_contable_credito_fin) {
		if(this.id_cuenta_contable_credito_fin!=newid_cuenta_contable_credito_fin) {

			this.id_cuenta_contable_credito_fin=newid_cuenta_contable_credito_fin;
		}
	}
    
	public void setid_cuenta_contable_credito_fin2(Long newid_cuenta_contable_credito_fin2) {
		if(this.id_cuenta_contable_credito_fin2!=newid_cuenta_contable_credito_fin2) {

			this.id_cuenta_contable_credito_fin2=newid_cuenta_contable_credito_fin2;
		}
	}
    
	public void setid_cuenta_contable_credito(Long newid_cuenta_contable_credito) {
		if(this.id_cuenta_contable_credito!=newid_cuenta_contable_credito) {

			this.id_cuenta_contable_credito=newid_cuenta_contable_credito;
		}
	}
    
	public void setid_tipo_movimiento(Long newid_tipo_movimiento) {
		if(this.id_tipo_movimiento!=newid_tipo_movimiento) {

			this.id_tipo_movimiento=newid_tipo_movimiento;
		}
	}
    
	public void setid_tipo_movimiento_modulo(Long newid_tipo_movimiento_modulo) {
		if(this.id_tipo_movimiento_modulo!=newid_tipo_movimiento_modulo) {

			this.id_tipo_movimiento_modulo=newid_tipo_movimiento_modulo;
		}
	}
    
	public void setid_tipo_transaccion_modulo(Long newid_tipo_transaccion_modulo) {
		if(this.id_tipo_transaccion_modulo!=newid_tipo_transaccion_modulo) {

			this.id_tipo_transaccion_modulo=newid_tipo_transaccion_modulo;
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
	public Boolean getisBusquedaDesdeForeignKeySesionEjercicio() {
		return isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public void setisBusquedaDesdeForeignKeySesionEjercicio(
		Boolean isBusquedaDesdeForeignKeySesionEjercicio) {
		this.isBusquedaDesdeForeignKeySesionEjercicio = isBusquedaDesdeForeignKeySesionEjercicio;
	}

	public Long getlidEjercicioActual() {
		return lidEjercicioActual;
	}

	public void setlidEjercicioActual(Long lidEjercicioActual) {
		this.lidEjercicioActual = lidEjercicioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPeriodo() {
		return isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public void setisBusquedaDesdeForeignKeySesionPeriodo(
		Boolean isBusquedaDesdeForeignKeySesionPeriodo) {
		this.isBusquedaDesdeForeignKeySesionPeriodo = isBusquedaDesdeForeignKeySesionPeriodo;
	}

	public Long getlidPeriodoActual() {
		return lidPeriodoActual;
	}

	public void setlidPeriodoActual(Long lidPeriodoActual) {
		this.lidPeriodoActual = lidPeriodoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionAnio() {
		return isBusquedaDesdeForeignKeySesionAnio;
	}

	public void setisBusquedaDesdeForeignKeySesionAnio(
		Boolean isBusquedaDesdeForeignKeySesionAnio) {
		this.isBusquedaDesdeForeignKeySesionAnio = isBusquedaDesdeForeignKeySesionAnio;
	}

	public Long getlidAnioActual() {
		return lidAnioActual;
	}

	public void setlidAnioActual(Long lidAnioActual) {
		this.lidAnioActual = lidAnioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMes() {
		return isBusquedaDesdeForeignKeySesionMes;
	}

	public void setisBusquedaDesdeForeignKeySesionMes(
		Boolean isBusquedaDesdeForeignKeySesionMes) {
		this.isBusquedaDesdeForeignKeySesionMes = isBusquedaDesdeForeignKeySesionMes;
	}

	public Long getlidMesActual() {
		return lidMesActual;
	}

	public void setlidMesActual(Long lidMesActual) {
		this.lidMesActual = lidMesActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionModulo() {
		return isBusquedaDesdeForeignKeySesionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionModulo(
		Boolean isBusquedaDesdeForeignKeySesionModulo) {
		this.isBusquedaDesdeForeignKeySesionModulo = isBusquedaDesdeForeignKeySesionModulo;
	}

	public Long getlidModuloActual() {
		return lidModuloActual;
	}

	public void setlidModuloActual(Long lidModuloActual) {
		this.lidModuloActual = lidModuloActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionPlantillaFactura() {
		return isBusquedaDesdeForeignKeySesionPlantillaFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionPlantillaFactura(
		Boolean isBusquedaDesdeForeignKeySesionPlantillaFactura) {
		this.isBusquedaDesdeForeignKeySesionPlantillaFactura = isBusquedaDesdeForeignKeySesionPlantillaFactura;
	}

	public Long getlidPlantillaFacturaActual() {
		return lidPlantillaFacturaActual;
	}

	public void setlidPlantillaFacturaActual(Long lidPlantillaFacturaActual) {
		this.lidPlantillaFacturaActual = lidPlantillaFacturaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumento() {
		return isBusquedaDesdeForeignKeySesionTipoDocumento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumento(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumento) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumento = isBusquedaDesdeForeignKeySesionTipoDocumento;
	}

	public Long getlidTipoDocumentoActual() {
		return lidTipoDocumentoActual;
	}

	public void setlidTipoDocumentoActual(Long lidTipoDocumentoActual) {
		this.lidTipoDocumentoActual = lidTipoDocumentoActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccion() {
		return isBusquedaDesdeForeignKeySesionTransaccion;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccion(
		Boolean isBusquedaDesdeForeignKeySesionTransaccion) {
		this.isBusquedaDesdeForeignKeySesionTransaccion = isBusquedaDesdeForeignKeySesionTransaccion;
	}

	public Long getlidTransaccionActual() {
		return lidTransaccionActual;
	}

	public void setlidTransaccionActual(Long lidTransaccionActual) {
		this.lidTransaccionActual = lidTransaccionActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCliente() {
		return isBusquedaDesdeForeignKeySesionCliente;
	}

	public void setisBusquedaDesdeForeignKeySesionCliente(
		Boolean isBusquedaDesdeForeignKeySesionCliente) {
		this.isBusquedaDesdeForeignKeySesionCliente = isBusquedaDesdeForeignKeySesionCliente;
	}

	public Long getlidClienteActual() {
		return lidClienteActual;
	}

	public void setlidClienteActual(Long lidClienteActual) {
		this.lidClienteActual = lidClienteActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEmpleadoSolicita() {
		return isBusquedaDesdeForeignKeySesionEmpleadoSolicita;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpleadoSolicita(
		Boolean isBusquedaDesdeForeignKeySesionEmpleadoSolicita) {
		this.isBusquedaDesdeForeignKeySesionEmpleadoSolicita = isBusquedaDesdeForeignKeySesionEmpleadoSolicita;
	}

	public Long getlidEmpleadoSolicitaActual() {
		return lidEmpleadoSolicitaActual;
	}

	public void setlidEmpleadoSolicitaActual(Long lidEmpleadoSolicitaActual) {
		this.lidEmpleadoSolicitaActual = lidEmpleadoSolicitaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionMoneda() {
		return isBusquedaDesdeForeignKeySesionMoneda;
	}

	public void setisBusquedaDesdeForeignKeySesionMoneda(
		Boolean isBusquedaDesdeForeignKeySesionMoneda) {
		this.isBusquedaDesdeForeignKeySesionMoneda = isBusquedaDesdeForeignKeySesionMoneda;
	}

	public Long getlidMonedaActual() {
		return lidMonedaActual;
	}

	public void setlidMonedaActual(Long lidMonedaActual) {
		this.lidMonedaActual = lidMonedaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionEmpleado() {
		return isBusquedaDesdeForeignKeySesionEmpleado;
	}

	public void setisBusquedaDesdeForeignKeySesionEmpleado(
		Boolean isBusquedaDesdeForeignKeySesionEmpleado) {
		this.isBusquedaDesdeForeignKeySesionEmpleado = isBusquedaDesdeForeignKeySesionEmpleado;
	}

	public Long getlidEmpleadoActual() {
		return lidEmpleadoActual;
	}

	public void setlidEmpleadoActual(Long lidEmpleadoActual) {
		this.lidEmpleadoActual = lidEmpleadoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionFuente1() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionFuente1;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionFuente1(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionFuente1) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionFuente1 = isBusquedaDesdeForeignKeySesionTipoRetencionFuente1;
	}

	public Long getlidTipoRetencionFuente1Actual() {
		return lidTipoRetencionFuente1Actual;
	}

	public void setlidTipoRetencionFuente1Actual(Long lidTipoRetencionFuente1Actual) {
		this.lidTipoRetencionFuente1Actual = lidTipoRetencionFuente1Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionFuente2() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionFuente2;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionFuente2(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionFuente2) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionFuente2 = isBusquedaDesdeForeignKeySesionTipoRetencionFuente2;
	}

	public Long getlidTipoRetencionFuente2Actual() {
		return lidTipoRetencionFuente2Actual;
	}

	public void setlidTipoRetencionFuente2Actual(Long lidTipoRetencionFuente2Actual) {
		this.lidTipoRetencionFuente2Actual = lidTipoRetencionFuente2Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionIva1() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionIva1;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionIva1(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIva1) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionIva1 = isBusquedaDesdeForeignKeySesionTipoRetencionIva1;
	}

	public Long getlidTipoRetencionIva1Actual() {
		return lidTipoRetencionIva1Actual;
	}

	public void setlidTipoRetencionIva1Actual(Long lidTipoRetencionIva1Actual) {
		this.lidTipoRetencionIva1Actual = lidTipoRetencionIva1Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRetencionIva2() {
		return isBusquedaDesdeForeignKeySesionTipoRetencionIva2;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRetencionIva2(
		Boolean isBusquedaDesdeForeignKeySesionTipoRetencionIva2) {
		this.isBusquedaDesdeForeignKeySesionTipoRetencionIva2 = isBusquedaDesdeForeignKeySesionTipoRetencionIva2;
	}

	public Long getlidTipoRetencionIva2Actual() {
		return lidTipoRetencionIva2Actual;
	}

	public void setlidTipoRetencionIva2Actual(Long lidTipoRetencionIva2Actual) {
		this.lidTipoRetencionIva2Actual = lidTipoRetencionIva2Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTributario() {
		return isBusquedaDesdeForeignKeySesionTipoTributario;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTributario(
		Boolean isBusquedaDesdeForeignKeySesionTipoTributario) {
		this.isBusquedaDesdeForeignKeySesionTipoTributario = isBusquedaDesdeForeignKeySesionTipoTributario;
	}

	public Long getlidTipoTributarioActual() {
		return lidTipoTributarioActual;
	}

	public void setlidTipoTributarioActual(Long lidTipoTributarioActual) {
		this.lidTipoTributarioActual = lidTipoTributarioActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalBienes() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalBienes;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalBienes(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalBienes) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalBienes = isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalBienes;
	}

	public Long getlidCuentaContableCreditoFiscalBienesActual() {
		return lidCuentaContableCreditoFiscalBienesActual;
	}

	public void setlidCuentaContableCreditoFiscalBienesActual(Long lidCuentaContableCreditoFiscalBienesActual) {
		this.lidCuentaContableCreditoFiscalBienesActual = lidCuentaContableCreditoFiscalBienesActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionResponsableFondo() {
		return isBusquedaDesdeForeignKeySesionResponsableFondo;
	}

	public void setisBusquedaDesdeForeignKeySesionResponsableFondo(
		Boolean isBusquedaDesdeForeignKeySesionResponsableFondo) {
		this.isBusquedaDesdeForeignKeySesionResponsableFondo = isBusquedaDesdeForeignKeySesionResponsableFondo;
	}

	public Long getlidResponsableFondoActual() {
		return lidResponsableFondoActual;
	}

	public void setlidResponsableFondoActual(Long lidResponsableFondoActual) {
		this.lidResponsableFondoActual = lidResponsableFondoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalServicios() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalServicios;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalServicios(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalServicios) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalServicios = isBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscalServicios;
	}

	public Long getlidCuentaContableCreditoFiscalServiciosActual() {
		return lidCuentaContableCreditoFiscalServiciosActual;
	}

	public void setlidCuentaContableCreditoFiscalServiciosActual(Long lidCuentaContableCreditoFiscalServiciosActual) {
		this.lidCuentaContableCreditoFiscalServiciosActual = lidCuentaContableCreditoFiscalServiciosActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableGasto() {
		return isBusquedaDesdeForeignKeySesionCuentaContableGasto;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableGasto(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableGasto) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableGasto = isBusquedaDesdeForeignKeySesionCuentaContableGasto;
	}

	public Long getlidCuentaContableGastoActual() {
		return lidCuentaContableGastoActual;
	}

	public void setlidCuentaContableGastoActual(Long lidCuentaContableGastoActual) {
		this.lidCuentaContableGastoActual = lidCuentaContableGastoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableGasto2() {
		return isBusquedaDesdeForeignKeySesionCuentaContableGasto2;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableGasto2(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableGasto2) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableGasto2 = isBusquedaDesdeForeignKeySesionCuentaContableGasto2;
	}

	public Long getlidCuentaContableGasto2Actual() {
		return lidCuentaContableGasto2Actual;
	}

	public void setlidCuentaContableGasto2Actual(Long lidCuentaContableGasto2Actual) {
		this.lidCuentaContableGasto2Actual = lidCuentaContableGasto2Actual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCreditoFin() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCreditoFin;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCreditoFin(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCreditoFin) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCreditoFin = isBusquedaDesdeForeignKeySesionCuentaContableCreditoFin;
	}

	public Long getlidCuentaContableCreditoFinActual() {
		return lidCuentaContableCreditoFinActual;
	}

	public void setlidCuentaContableCreditoFinActual(Long lidCuentaContableCreditoFinActual) {
		this.lidCuentaContableCreditoFinActual = lidCuentaContableCreditoFinActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableCreditoFin2() {
		return isBusquedaDesdeForeignKeySesionCuentaContableCreditoFin2;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableCreditoFin2(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableCreditoFin2) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableCreditoFin2 = isBusquedaDesdeForeignKeySesionCuentaContableCreditoFin2;
	}

	public Long getlidCuentaContableCreditoFin2Actual() {
		return lidCuentaContableCreditoFin2Actual;
	}

	public void setlidCuentaContableCreditoFin2Actual(Long lidCuentaContableCreditoFin2Actual) {
		this.lidCuentaContableCreditoFin2Actual = lidCuentaContableCreditoFin2Actual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionTipoMovimiento() {
		return isBusquedaDesdeForeignKeySesionTipoMovimiento;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoMovimiento(
		Boolean isBusquedaDesdeForeignKeySesionTipoMovimiento) {
		this.isBusquedaDesdeForeignKeySesionTipoMovimiento = isBusquedaDesdeForeignKeySesionTipoMovimiento;
	}

	public Long getlidTipoMovimientoActual() {
		return lidTipoMovimientoActual;
	}

	public void setlidTipoMovimientoActual(Long lidTipoMovimientoActual) {
		this.lidTipoMovimientoActual = lidTipoMovimientoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoMovimientoModulo() {
		return isBusquedaDesdeForeignKeySesionTipoMovimientoModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoMovimientoModulo(
		Boolean isBusquedaDesdeForeignKeySesionTipoMovimientoModulo) {
		this.isBusquedaDesdeForeignKeySesionTipoMovimientoModulo = isBusquedaDesdeForeignKeySesionTipoMovimientoModulo;
	}

	public Long getlidTipoMovimientoModuloActual() {
		return lidTipoMovimientoModuloActual;
	}

	public void setlidTipoMovimientoModuloActual(Long lidTipoMovimientoModuloActual) {
		this.lidTipoMovimientoModuloActual = lidTipoMovimientoModuloActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo() {
		return isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoTransaccionModulo(
		Boolean isBusquedaDesdeForeignKeySesionTipoTransaccionModulo) {
		this.isBusquedaDesdeForeignKeySesionTipoTransaccionModulo = isBusquedaDesdeForeignKeySesionTipoTransaccionModulo;
	}

	public Long getlidTipoTransaccionModuloActual() {
		return lidTipoTransaccionModuloActual;
	}

	public void setlidTipoTransaccionModuloActual(Long lidTipoTransaccionModuloActual) {
		this.lidTipoTransaccionModuloActual = lidTipoTransaccionModuloActual;
	}
	
	
		
	
}
