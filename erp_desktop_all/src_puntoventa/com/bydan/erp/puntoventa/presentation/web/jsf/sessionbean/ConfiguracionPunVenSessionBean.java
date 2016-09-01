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
package com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.puntoventa.business.entity.*;

@SuppressWarnings("unused")
public class ConfiguracionPunVenSessionBean  extends ConfiguracionPunVenSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeConfiguracionPunVen;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeConfiguracionPunVen;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVen;
	protected Long lIdConfiguracionPunVenActualForeignKey;	
	
	protected Long lIdConfiguracionPunVenActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVenParaPosibleAtras;
	protected String sUltimaBusquedaConfiguracionPunVen;
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
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableEfectivo;
	Long lidCuentaContableEfectivoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableIce;
	Long lidCuentaContableIceActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContableOtros;
	Long lidCuentaContableOtrosActual;
	Boolean isBusquedaDesdeForeignKeySesionClienteConsumidorFinal;
	Long lidClienteConsumidorFinalActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoFactura;
	Long lidTipoDocumentoFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoNotaVenta;
	Long lidTipoDocumentoNotaVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito;
	Long lidTipoDocumentoNotaCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoTarjetaCredito;
	Long lidTipoDocumentoTarjetaCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoFactura;
	Long lidFormatoFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoNotaVenta;
	Long lidFormatoNotaVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionFormatoNotaCredito;
	Long lidFormatoNotaCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionFactura;
	Long lidTransaccionFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionNotaVenta;
	Long lidTransaccionNotaVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionNotaCredito;
	Long lidTransaccionNotaCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaFactura;
	Long lidTransaccionCuentaFacturaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaNotaVenta;
	Long lidTransaccionCuentaNotaVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaNotaCredito;
	Long lidTransaccionCuentaNotaCreditoActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_bodega;
	private Long id_cuenta_contable_efectivo;
	private Long id_cuenta_contable_ice;
	private Long id_cuenta_contable_otros;
	private Long id_cliente_consumidor_final;
	private Long id_tipo_documento_factura;
	private Long id_tipo_documento_nota_venta;
	private Long id_tipo_documento_nota_credito;
	private Long id_tipo_documento_tarjeta_credito;
	private Long id_formato_factura;
	private Long id_formato_nota_venta;
	private Long id_formato_nota_credito;
	private Long id_transaccion_factura;
	private Long id_transaccion_nota_venta;
	private Long id_transaccion_nota_credito;
	private Long id_transaccion_cuenta_factura;
	private Long id_transaccion_cuenta_nota_venta;
	private Long id_transaccion_cuenta_nota_credito;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected ConfiguracionPunVenSessionBeanAdditional configuracionpunvenSessionBeanAdditional=null;
	
	public ConfiguracionPunVenSessionBeanAdditional getConfiguracionPunVenSessionBeanAdditional() {
		return this.configuracionpunvenSessionBeanAdditional;
	}
	
	public void setConfiguracionPunVenSessionBeanAdditional(ConfiguracionPunVenSessionBeanAdditional configuracionpunvenSessionBeanAdditional) {
		try {
			this.configuracionpunvenSessionBeanAdditional=configuracionpunvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public ConfiguracionPunVenSessionBean () {
		this.inicializarConfiguracionPunVenSessionBean();
	}
	
	public void inicializarConfiguracionPunVenSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeConfiguracionPunVen=false;
		
		this.isPermiteRecargarInformacion=true;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConfiguracionPunVen="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVen=false;
		this.lIdConfiguracionPunVenActualForeignKey=0L;
		this.lIdConfiguracionPunVenActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVenParaPosibleAtras=false;
		this.sUltimaBusquedaConfiguracionPunVen ="";
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
		isBusquedaDesdeForeignKeySesionCuentaContableEfectivo=false;
		lidCuentaContableEfectivoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableIce=false;
		lidCuentaContableIceActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContableOtros=false;
		lidCuentaContableOtrosActual=0L;
		isBusquedaDesdeForeignKeySesionClienteConsumidorFinal=false;
		lidClienteConsumidorFinalActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDocumentoFactura=false;
		lidTipoDocumentoFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDocumentoNotaVenta=false;
		lidTipoDocumentoNotaVentaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito=false;
		lidTipoDocumentoNotaCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoDocumentoTarjetaCredito=false;
		lidTipoDocumentoTarjetaCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoFactura=false;
		lidFormatoFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoNotaVenta=false;
		lidFormatoNotaVentaActual=0L;
		isBusquedaDesdeForeignKeySesionFormatoNotaCredito=false;
		lidFormatoNotaCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionFactura=false;
		lidTransaccionFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionNotaVenta=false;
		lidTransaccionNotaVentaActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionNotaCredito=false;
		lidTransaccionNotaCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionCuentaFactura=false;
		lidTransaccionCuentaFacturaActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionCuentaNotaVenta=false;
		lidTransaccionCuentaNotaVentaActual=0L;
		isBusquedaDesdeForeignKeySesionTransaccionCuentaNotaCredito=false;
		lidTransaccionCuentaNotaCreditoActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_bodega=-1L;
 		this.id_cuenta_contable_efectivo=-1L;
 		this.id_cuenta_contable_ice=-1L;
 		this.id_cuenta_contable_otros=-1L;
 		this.id_cliente_consumidor_final=-1L;
 		this.id_tipo_documento_factura=-1L;
 		this.id_tipo_documento_nota_venta=-1L;
 		this.id_tipo_documento_nota_credito=-1L;
 		this.id_tipo_documento_tarjeta_credito=-1L;
 		this.id_formato_factura=-1L;
 		this.id_formato_nota_venta=-1L;
 		this.id_formato_nota_credito=-1L;
 		this.id_transaccion_factura=-1L;
 		this.id_transaccion_nota_venta=-1L;
 		this.id_transaccion_nota_credito=-1L;
 		this.id_transaccion_cuenta_factura=-1L;
 		this.id_transaccion_cuenta_nota_venta=-1L;
 		this.id_transaccion_cuenta_nota_credito=-1L;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeConfiguracionPunVen() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeConfiguracionPunVen;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeConfiguracionPunVen(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeConfiguracionPunVen) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeConfiguracionPunVen= isPermiteNavegacionHaciaForeignKeyDesdeConfiguracionPunVen;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeConfiguracionPunVen() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConfiguracionPunVen;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeConfiguracionPunVen(String sNombrePaginaNavegacionHaciaForeignKeyDesdeConfiguracionPunVen) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeConfiguracionPunVen = sNombrePaginaNavegacionHaciaForeignKeyDesdeConfiguracionPunVen;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVen() {
		return isBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVen;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVen(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVen) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVen= isBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVen;
	}
					
	public Long getlIdConfiguracionPunVenActualForeignKey() {
		return lIdConfiguracionPunVenActualForeignKey;
	}

	public void setlIdConfiguracionPunVenActualForeignKey(
			Long lIdConfiguracionPunVenActualForeignKey) {
		this.lIdConfiguracionPunVenActualForeignKey = lIdConfiguracionPunVenActualForeignKey;
	}
				    
	public Long getlIdConfiguracionPunVenActualForeignKeyParaPosibleAtras() {
		return lIdConfiguracionPunVenActualForeignKeyParaPosibleAtras;
	}

	public void setlIdConfiguracionPunVenActualForeignKeyParaPosibleAtras(
			Long lIdConfiguracionPunVenActualForeignKeyParaPosibleAtras) {
		this.lIdConfiguracionPunVenActualForeignKeyParaPosibleAtras = lIdConfiguracionPunVenActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVenParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVenParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVenParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVenParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVenParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyConfiguracionPunVenParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaConfiguracionPunVen() {
		return sUltimaBusquedaConfiguracionPunVen;
	}

	public void setsUltimaBusquedaConfiguracionPunVen(String sUltimaBusquedaConfiguracionPunVen) {
		this.sUltimaBusquedaConfiguracionPunVen = sUltimaBusquedaConfiguracionPunVen;
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
    
	public Long getid_cuenta_contable_efectivo() {
		return this.id_cuenta_contable_efectivo;
	}
    
	public Long getid_cuenta_contable_ice() {
		return this.id_cuenta_contable_ice;
	}
    
	public Long getid_cuenta_contable_otros() {
		return this.id_cuenta_contable_otros;
	}
    
	public Long getid_cliente_consumidor_final() {
		return this.id_cliente_consumidor_final;
	}
    
	public Long getid_tipo_documento_factura() {
		return this.id_tipo_documento_factura;
	}
    
	public Long getid_tipo_documento_nota_venta() {
		return this.id_tipo_documento_nota_venta;
	}
    
	public Long getid_tipo_documento_nota_credito() {
		return this.id_tipo_documento_nota_credito;
	}
    
	public Long getid_tipo_documento_tarjeta_credito() {
		return this.id_tipo_documento_tarjeta_credito;
	}
    
	public Long getid_formato_factura() {
		return this.id_formato_factura;
	}
    
	public Long getid_formato_nota_venta() {
		return this.id_formato_nota_venta;
	}
    
	public Long getid_formato_nota_credito() {
		return this.id_formato_nota_credito;
	}
    
	public Long getid_transaccion_factura() {
		return this.id_transaccion_factura;
	}
    
	public Long getid_transaccion_nota_venta() {
		return this.id_transaccion_nota_venta;
	}
    
	public Long getid_transaccion_nota_credito() {
		return this.id_transaccion_nota_credito;
	}
    
	public Long getid_transaccion_cuenta_factura() {
		return this.id_transaccion_cuenta_factura;
	}
    
	public Long getid_transaccion_cuenta_nota_venta() {
		return this.id_transaccion_cuenta_nota_venta;
	}
    
	public Long getid_transaccion_cuenta_nota_credito() {
		return this.id_transaccion_cuenta_nota_credito;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id");
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
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_bodega");
					}
				}

				this.id_bodega=newid_bodega;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_efectivo(Long newid_cuenta_contable_efectivo)throws Exception
	{
		try {
			if(this.id_cuenta_contable_efectivo!=newid_cuenta_contable_efectivo) {
				if(newid_cuenta_contable_efectivo==null) {
					//newid_cuenta_contable_efectivo=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_cuenta_contable_efectivo");
					}
				}

				this.id_cuenta_contable_efectivo=newid_cuenta_contable_efectivo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_ice(Long newid_cuenta_contable_ice)throws Exception
	{
		try {
			if(this.id_cuenta_contable_ice!=newid_cuenta_contable_ice) {
				if(newid_cuenta_contable_ice==null) {
					//newid_cuenta_contable_ice=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_cuenta_contable_ice");
					}
				}

				this.id_cuenta_contable_ice=newid_cuenta_contable_ice;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cuenta_contable_otros(Long newid_cuenta_contable_otros)throws Exception
	{
		try {
			if(this.id_cuenta_contable_otros!=newid_cuenta_contable_otros) {
				if(newid_cuenta_contable_otros==null) {
					//newid_cuenta_contable_otros=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_cuenta_contable_otros");
					}
				}

				this.id_cuenta_contable_otros=newid_cuenta_contable_otros;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_cliente_consumidor_final(Long newid_cliente_consumidor_final)throws Exception
	{
		try {
			if(this.id_cliente_consumidor_final!=newid_cliente_consumidor_final) {
				if(newid_cliente_consumidor_final==null) {
					//newid_cliente_consumidor_final=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_cliente_consumidor_final");
					}
				}

				this.id_cliente_consumidor_final=newid_cliente_consumidor_final;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_documento_factura(Long newid_tipo_documento_factura)throws Exception
	{
		try {
			if(this.id_tipo_documento_factura!=newid_tipo_documento_factura) {
				if(newid_tipo_documento_factura==null) {
					//newid_tipo_documento_factura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_tipo_documento_factura");
					}
				}

				this.id_tipo_documento_factura=newid_tipo_documento_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_documento_nota_venta(Long newid_tipo_documento_nota_venta)throws Exception
	{
		try {
			if(this.id_tipo_documento_nota_venta!=newid_tipo_documento_nota_venta) {
				if(newid_tipo_documento_nota_venta==null) {
					//newid_tipo_documento_nota_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_tipo_documento_nota_venta");
					}
				}

				this.id_tipo_documento_nota_venta=newid_tipo_documento_nota_venta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_documento_nota_credito(Long newid_tipo_documento_nota_credito)throws Exception
	{
		try {
			if(this.id_tipo_documento_nota_credito!=newid_tipo_documento_nota_credito) {
				if(newid_tipo_documento_nota_credito==null) {
					//newid_tipo_documento_nota_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_tipo_documento_nota_credito");
					}
				}

				this.id_tipo_documento_nota_credito=newid_tipo_documento_nota_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_documento_tarjeta_credito(Long newid_tipo_documento_tarjeta_credito)throws Exception
	{
		try {
			if(this.id_tipo_documento_tarjeta_credito!=newid_tipo_documento_tarjeta_credito) {
				if(newid_tipo_documento_tarjeta_credito==null) {
					//newid_tipo_documento_tarjeta_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_tipo_documento_tarjeta_credito");
					}
				}

				this.id_tipo_documento_tarjeta_credito=newid_tipo_documento_tarjeta_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_factura(Long newid_formato_factura)throws Exception
	{
		try {
			if(this.id_formato_factura!=newid_formato_factura) {
				if(newid_formato_factura==null) {
					//newid_formato_factura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_formato_factura");
					}
				}

				this.id_formato_factura=newid_formato_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_nota_venta(Long newid_formato_nota_venta)throws Exception
	{
		try {
			if(this.id_formato_nota_venta!=newid_formato_nota_venta) {
				if(newid_formato_nota_venta==null) {
					//newid_formato_nota_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_formato_nota_venta");
					}
				}

				this.id_formato_nota_venta=newid_formato_nota_venta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_formato_nota_credito(Long newid_formato_nota_credito)throws Exception
	{
		try {
			if(this.id_formato_nota_credito!=newid_formato_nota_credito) {
				if(newid_formato_nota_credito==null) {
					//newid_formato_nota_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_formato_nota_credito");
					}
				}

				this.id_formato_nota_credito=newid_formato_nota_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_factura(Long newid_transaccion_factura)throws Exception
	{
		try {
			if(this.id_transaccion_factura!=newid_transaccion_factura) {
				if(newid_transaccion_factura==null) {
					//newid_transaccion_factura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_transaccion_factura");
					}
				}

				this.id_transaccion_factura=newid_transaccion_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_nota_venta(Long newid_transaccion_nota_venta)throws Exception
	{
		try {
			if(this.id_transaccion_nota_venta!=newid_transaccion_nota_venta) {
				if(newid_transaccion_nota_venta==null) {
					//newid_transaccion_nota_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_transaccion_nota_venta");
					}
				}

				this.id_transaccion_nota_venta=newid_transaccion_nota_venta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_nota_credito(Long newid_transaccion_nota_credito)throws Exception
	{
		try {
			if(this.id_transaccion_nota_credito!=newid_transaccion_nota_credito) {
				if(newid_transaccion_nota_credito==null) {
					//newid_transaccion_nota_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_transaccion_nota_credito");
					}
				}

				this.id_transaccion_nota_credito=newid_transaccion_nota_credito;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_cuenta_factura(Long newid_transaccion_cuenta_factura)throws Exception
	{
		try {
			if(this.id_transaccion_cuenta_factura!=newid_transaccion_cuenta_factura) {
				if(newid_transaccion_cuenta_factura==null) {
					//newid_transaccion_cuenta_factura=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_transaccion_cuenta_factura");
					}
				}

				this.id_transaccion_cuenta_factura=newid_transaccion_cuenta_factura;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_cuenta_nota_venta(Long newid_transaccion_cuenta_nota_venta)throws Exception
	{
		try {
			if(this.id_transaccion_cuenta_nota_venta!=newid_transaccion_cuenta_nota_venta) {
				if(newid_transaccion_cuenta_nota_venta==null) {
					//newid_transaccion_cuenta_nota_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_transaccion_cuenta_nota_venta");
					}
				}

				this.id_transaccion_cuenta_nota_venta=newid_transaccion_cuenta_nota_venta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_transaccion_cuenta_nota_credito(Long newid_transaccion_cuenta_nota_credito)throws Exception
	{
		try {
			if(this.id_transaccion_cuenta_nota_credito!=newid_transaccion_cuenta_nota_credito) {
				if(newid_transaccion_cuenta_nota_credito==null) {
					//newid_transaccion_cuenta_nota_credito=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("ConfiguracionPunVen:Valor nulo no permitido en columna id_transaccion_cuenta_nota_credito");
					}
				}

				this.id_transaccion_cuenta_nota_credito=newid_transaccion_cuenta_nota_credito;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableEfectivo() {
		return isBusquedaDesdeForeignKeySesionCuentaContableEfectivo;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableEfectivo(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableEfectivo) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableEfectivo = isBusquedaDesdeForeignKeySesionCuentaContableEfectivo;
	}

	public Long getlidCuentaContableEfectivoActual() {
		return lidCuentaContableEfectivoActual;
	}

	public void setlidCuentaContableEfectivoActual(Long lidCuentaContableEfectivoActual) {
		this.lidCuentaContableEfectivoActual = lidCuentaContableEfectivoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableIce() {
		return isBusquedaDesdeForeignKeySesionCuentaContableIce;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableIce(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableIce) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableIce = isBusquedaDesdeForeignKeySesionCuentaContableIce;
	}

	public Long getlidCuentaContableIceActual() {
		return lidCuentaContableIceActual;
	}

	public void setlidCuentaContableIceActual(Long lidCuentaContableIceActual) {
		this.lidCuentaContableIceActual = lidCuentaContableIceActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContableOtros() {
		return isBusquedaDesdeForeignKeySesionCuentaContableOtros;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContableOtros(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContableOtros) {
		this.isBusquedaDesdeForeignKeySesionCuentaContableOtros = isBusquedaDesdeForeignKeySesionCuentaContableOtros;
	}

	public Long getlidCuentaContableOtrosActual() {
		return lidCuentaContableOtrosActual;
	}

	public void setlidCuentaContableOtrosActual(Long lidCuentaContableOtrosActual) {
		this.lidCuentaContableOtrosActual = lidCuentaContableOtrosActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionClienteConsumidorFinal() {
		return isBusquedaDesdeForeignKeySesionClienteConsumidorFinal;
	}

	public void setisBusquedaDesdeForeignKeySesionClienteConsumidorFinal(
		Boolean isBusquedaDesdeForeignKeySesionClienteConsumidorFinal) {
		this.isBusquedaDesdeForeignKeySesionClienteConsumidorFinal = isBusquedaDesdeForeignKeySesionClienteConsumidorFinal;
	}

	public Long getlidClienteConsumidorFinalActual() {
		return lidClienteConsumidorFinalActual;
	}

	public void setlidClienteConsumidorFinalActual(Long lidClienteConsumidorFinalActual) {
		this.lidClienteConsumidorFinalActual = lidClienteConsumidorFinalActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumentoFactura() {
		return isBusquedaDesdeForeignKeySesionTipoDocumentoFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumentoFactura(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoFactura) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumentoFactura = isBusquedaDesdeForeignKeySesionTipoDocumentoFactura;
	}

	public Long getlidTipoDocumentoFacturaActual() {
		return lidTipoDocumentoFacturaActual;
	}

	public void setlidTipoDocumentoFacturaActual(Long lidTipoDocumentoFacturaActual) {
		this.lidTipoDocumentoFacturaActual = lidTipoDocumentoFacturaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumentoNotaVenta() {
		return isBusquedaDesdeForeignKeySesionTipoDocumentoNotaVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumentoNotaVenta(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoNotaVenta) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumentoNotaVenta = isBusquedaDesdeForeignKeySesionTipoDocumentoNotaVenta;
	}

	public Long getlidTipoDocumentoNotaVentaActual() {
		return lidTipoDocumentoNotaVentaActual;
	}

	public void setlidTipoDocumentoNotaVentaActual(Long lidTipoDocumentoNotaVentaActual) {
		this.lidTipoDocumentoNotaVentaActual = lidTipoDocumentoNotaVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito() {
		return isBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito = isBusquedaDesdeForeignKeySesionTipoDocumentoNotaCredito;
	}

	public Long getlidTipoDocumentoNotaCreditoActual() {
		return lidTipoDocumentoNotaCreditoActual;
	}

	public void setlidTipoDocumentoNotaCreditoActual(Long lidTipoDocumentoNotaCreditoActual) {
		this.lidTipoDocumentoNotaCreditoActual = lidTipoDocumentoNotaCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoDocumentoTarjetaCredito() {
		return isBusquedaDesdeForeignKeySesionTipoDocumentoTarjetaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoDocumentoTarjetaCredito(
		Boolean isBusquedaDesdeForeignKeySesionTipoDocumentoTarjetaCredito) {
		this.isBusquedaDesdeForeignKeySesionTipoDocumentoTarjetaCredito = isBusquedaDesdeForeignKeySesionTipoDocumentoTarjetaCredito;
	}

	public Long getlidTipoDocumentoTarjetaCreditoActual() {
		return lidTipoDocumentoTarjetaCreditoActual;
	}

	public void setlidTipoDocumentoTarjetaCreditoActual(Long lidTipoDocumentoTarjetaCreditoActual) {
		this.lidTipoDocumentoTarjetaCreditoActual = lidTipoDocumentoTarjetaCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoFactura() {
		return isBusquedaDesdeForeignKeySesionFormatoFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoFactura(
		Boolean isBusquedaDesdeForeignKeySesionFormatoFactura) {
		this.isBusquedaDesdeForeignKeySesionFormatoFactura = isBusquedaDesdeForeignKeySesionFormatoFactura;
	}

	public Long getlidFormatoFacturaActual() {
		return lidFormatoFacturaActual;
	}

	public void setlidFormatoFacturaActual(Long lidFormatoFacturaActual) {
		this.lidFormatoFacturaActual = lidFormatoFacturaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoNotaVenta() {
		return isBusquedaDesdeForeignKeySesionFormatoNotaVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoNotaVenta(
		Boolean isBusquedaDesdeForeignKeySesionFormatoNotaVenta) {
		this.isBusquedaDesdeForeignKeySesionFormatoNotaVenta = isBusquedaDesdeForeignKeySesionFormatoNotaVenta;
	}

	public Long getlidFormatoNotaVentaActual() {
		return lidFormatoNotaVentaActual;
	}

	public void setlidFormatoNotaVentaActual(Long lidFormatoNotaVentaActual) {
		this.lidFormatoNotaVentaActual = lidFormatoNotaVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionFormatoNotaCredito() {
		return isBusquedaDesdeForeignKeySesionFormatoNotaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionFormatoNotaCredito(
		Boolean isBusquedaDesdeForeignKeySesionFormatoNotaCredito) {
		this.isBusquedaDesdeForeignKeySesionFormatoNotaCredito = isBusquedaDesdeForeignKeySesionFormatoNotaCredito;
	}

	public Long getlidFormatoNotaCreditoActual() {
		return lidFormatoNotaCreditoActual;
	}

	public void setlidFormatoNotaCreditoActual(Long lidFormatoNotaCreditoActual) {
		this.lidFormatoNotaCreditoActual = lidFormatoNotaCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionFactura() {
		return isBusquedaDesdeForeignKeySesionTransaccionFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionFactura(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionFactura) {
		this.isBusquedaDesdeForeignKeySesionTransaccionFactura = isBusquedaDesdeForeignKeySesionTransaccionFactura;
	}

	public Long getlidTransaccionFacturaActual() {
		return lidTransaccionFacturaActual;
	}

	public void setlidTransaccionFacturaActual(Long lidTransaccionFacturaActual) {
		this.lidTransaccionFacturaActual = lidTransaccionFacturaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionNotaVenta() {
		return isBusquedaDesdeForeignKeySesionTransaccionNotaVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionNotaVenta(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionNotaVenta) {
		this.isBusquedaDesdeForeignKeySesionTransaccionNotaVenta = isBusquedaDesdeForeignKeySesionTransaccionNotaVenta;
	}

	public Long getlidTransaccionNotaVentaActual() {
		return lidTransaccionNotaVentaActual;
	}

	public void setlidTransaccionNotaVentaActual(Long lidTransaccionNotaVentaActual) {
		this.lidTransaccionNotaVentaActual = lidTransaccionNotaVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionNotaCredito() {
		return isBusquedaDesdeForeignKeySesionTransaccionNotaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionNotaCredito(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionNotaCredito) {
		this.isBusquedaDesdeForeignKeySesionTransaccionNotaCredito = isBusquedaDesdeForeignKeySesionTransaccionNotaCredito;
	}

	public Long getlidTransaccionNotaCreditoActual() {
		return lidTransaccionNotaCreditoActual;
	}

	public void setlidTransaccionNotaCreditoActual(Long lidTransaccionNotaCreditoActual) {
		this.lidTransaccionNotaCreditoActual = lidTransaccionNotaCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionCuentaFactura() {
		return isBusquedaDesdeForeignKeySesionTransaccionCuentaFactura;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionCuentaFactura(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaFactura) {
		this.isBusquedaDesdeForeignKeySesionTransaccionCuentaFactura = isBusquedaDesdeForeignKeySesionTransaccionCuentaFactura;
	}

	public Long getlidTransaccionCuentaFacturaActual() {
		return lidTransaccionCuentaFacturaActual;
	}

	public void setlidTransaccionCuentaFacturaActual(Long lidTransaccionCuentaFacturaActual) {
		this.lidTransaccionCuentaFacturaActual = lidTransaccionCuentaFacturaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionCuentaNotaVenta() {
		return isBusquedaDesdeForeignKeySesionTransaccionCuentaNotaVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionCuentaNotaVenta(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaNotaVenta) {
		this.isBusquedaDesdeForeignKeySesionTransaccionCuentaNotaVenta = isBusquedaDesdeForeignKeySesionTransaccionCuentaNotaVenta;
	}

	public Long getlidTransaccionCuentaNotaVentaActual() {
		return lidTransaccionCuentaNotaVentaActual;
	}

	public void setlidTransaccionCuentaNotaVentaActual(Long lidTransaccionCuentaNotaVentaActual) {
		this.lidTransaccionCuentaNotaVentaActual = lidTransaccionCuentaNotaVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTransaccionCuentaNotaCredito() {
		return isBusquedaDesdeForeignKeySesionTransaccionCuentaNotaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionTransaccionCuentaNotaCredito(
		Boolean isBusquedaDesdeForeignKeySesionTransaccionCuentaNotaCredito) {
		this.isBusquedaDesdeForeignKeySesionTransaccionCuentaNotaCredito = isBusquedaDesdeForeignKeySesionTransaccionCuentaNotaCredito;
	}

	public Long getlidTransaccionCuentaNotaCreditoActual() {
		return lidTransaccionCuentaNotaCreditoActual;
	}

	public void setlidTransaccionCuentaNotaCreditoActual(Long lidTransaccionCuentaNotaCreditoActual) {
		this.lidTransaccionCuentaNotaCreditoActual = lidTransaccionCuentaNotaCreditoActual;
	}
	
	
		
	
}
