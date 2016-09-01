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
public class FormaPagoPuntoVentaSessionBean  extends FormaPagoPuntoVentaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVenta;
	protected Long lIdFormaPagoPuntoVentaActualForeignKey;	
	
	protected Long lIdFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVentaParaPosibleAtras;
	protected String sUltimaBusquedaFormaPagoPuntoVenta;
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
	Boolean isBusquedaDesdeForeignKeySesionFacturaPuntoVenta;
	Long lidFacturaPuntoVentaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoFormaPago;
	Long lidTipoFormaPagoActual;
	Boolean isBusquedaDesdeForeignKeySesionBanco;
	Long lidBancoActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaBancoPunVen;
	Long lidCuentaBancoPunVenActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoRiesgoCheque;
	Long lidTipoRiesgoChequeActual;
	Boolean isBusquedaDesdeForeignKeySesionBancoTarjeta;
	Long lidBancoTarjetaActual;
	Boolean isBusquedaDesdeForeignKeySesionTarjetaCredito;
	Long lidTarjetaCreditoActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoInteresTarjeta;
	Long lidTipoInteresTarjetaActual;
	Boolean isBusquedaDesdeForeignKeySesionTipoPagoTarjeta;
	Long lidTipoPagoTarjetaActual;
	Boolean isBusquedaDesdeForeignKeySesionConexion;
	Long lidConexionActual;
	Boolean isBusquedaDesdeForeignKeySesionMes;
	Long lidMesActual;
	Boolean isBusquedaDesdeForeignKeySesionAnio;
	Long lidAnioActual;
	Boolean isBusquedaDesdeForeignKeySesionCuentaContable;
	Long lidCuentaContableActual;
	Boolean isBusquedaDesdeForeignKeySesionAsientoContable;
	Long lidAsientoContableActual;
	
	private Long id;
	private Long id_empresa;
	private Long id_sucursal;
	private Long id_ejercicio;
	private Long id_periodo;
	private Long id_factura_punto_venta;
	private Long id_tipo_forma_pago;
	private Long id_banco;
	private Long id_cuenta_banco_pun_ven;
	private Long id_tipo_riesgo_cheque;
	private Long id_banco_tarjeta;
	private Long id_tarjeta_credito;
	private Long id_tipo_interes_tarjeta;
	private Long id_tipo_pago_tarjeta;
	private Long id_conexion;
	private Long id_mes;
	private Long id_anio;
	private Long id_cuenta_contable;
	private Long id_asiento_contable;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected FormaPagoPuntoVentaSessionBeanAdditional formapagopuntoventaSessionBeanAdditional=null;
	
	public FormaPagoPuntoVentaSessionBeanAdditional getFormaPagoPuntoVentaSessionBeanAdditional() {
		return this.formapagopuntoventaSessionBeanAdditional;
	}
	
	public void setFormaPagoPuntoVentaSessionBeanAdditional(FormaPagoPuntoVentaSessionBeanAdditional formapagopuntoventaSessionBeanAdditional) {
		try {
			this.formapagopuntoventaSessionBeanAdditional=formapagopuntoventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public FormaPagoPuntoVentaSessionBean () {
		this.inicializarFormaPagoPuntoVentaSessionBean();
	}
	
	public void inicializarFormaPagoPuntoVentaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVenta=false;
		this.lIdFormaPagoPuntoVentaActualForeignKey=0L;
		this.lIdFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVentaParaPosibleAtras=false;
		this.sUltimaBusquedaFormaPagoPuntoVenta ="";
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
		isBusquedaDesdeForeignKeySesionEjercicio=false;
		lidEjercicioActual=0L;
		isBusquedaDesdeForeignKeySesionPeriodo=false;
		lidPeriodoActual=0L;
		isBusquedaDesdeForeignKeySesionFacturaPuntoVenta=false;
		lidFacturaPuntoVentaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoFormaPago=false;
		lidTipoFormaPagoActual=0L;
		isBusquedaDesdeForeignKeySesionBanco=false;
		lidBancoActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaBancoPunVen=false;
		lidCuentaBancoPunVenActual=0L;
		isBusquedaDesdeForeignKeySesionTipoRiesgoCheque=false;
		lidTipoRiesgoChequeActual=0L;
		isBusquedaDesdeForeignKeySesionBancoTarjeta=false;
		lidBancoTarjetaActual=0L;
		isBusquedaDesdeForeignKeySesionTarjetaCredito=false;
		lidTarjetaCreditoActual=0L;
		isBusquedaDesdeForeignKeySesionTipoInteresTarjeta=false;
		lidTipoInteresTarjetaActual=0L;
		isBusquedaDesdeForeignKeySesionTipoPagoTarjeta=false;
		lidTipoPagoTarjetaActual=0L;
		isBusquedaDesdeForeignKeySesionConexion=false;
		lidConexionActual=0L;
		isBusquedaDesdeForeignKeySesionMes=false;
		lidMesActual=0L;
		isBusquedaDesdeForeignKeySesionAnio=false;
		lidAnioActual=0L;
		isBusquedaDesdeForeignKeySesionCuentaContable=false;
		lidCuentaContableActual=0L;
		isBusquedaDesdeForeignKeySesionAsientoContable=false;
		lidAsientoContableActual=0L; 
		
		
		
 		this.id_empresa=-1L;
 		this.id_sucursal=-1L;
 		this.id_ejercicio=-1L;
 		this.id_periodo=-1L;
 		this.id_factura_punto_venta=-1L;
 		this.id_tipo_forma_pago=-1L;
 		this.id_banco=null;
 		this.id_cuenta_banco_pun_ven=null;
 		this.id_tipo_riesgo_cheque=null;
 		this.id_banco_tarjeta=null;
 		this.id_tarjeta_credito=null;
 		this.id_tipo_interes_tarjeta=null;
 		this.id_tipo_pago_tarjeta=null;
 		this.id_conexion=null;
 		this.id_mes=null;
 		this.id_anio=null;
 		this.id_cuenta_contable=null;
 		this.id_asiento_contable=null;
		
		
		
		
		
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
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta= isPermiteNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta(String sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta = sNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVenta() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVenta(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVenta) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVenta= isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVenta;
	}
					
	public Long getlIdFormaPagoPuntoVentaActualForeignKey() {
		return lIdFormaPagoPuntoVentaActualForeignKey;
	}

	public void setlIdFormaPagoPuntoVentaActualForeignKey(
			Long lIdFormaPagoPuntoVentaActualForeignKey) {
		this.lIdFormaPagoPuntoVentaActualForeignKey = lIdFormaPagoPuntoVentaActualForeignKey;
	}
				    
	public Long getlIdFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras() {
		return lIdFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras(
			Long lIdFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras) {
		this.lIdFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras = lIdFormaPagoPuntoVentaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVentaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVentaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVentaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVentaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVentaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyFormaPagoPuntoVentaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaFormaPagoPuntoVenta() {
		return sUltimaBusquedaFormaPagoPuntoVenta;
	}

	public void setsUltimaBusquedaFormaPagoPuntoVenta(String sUltimaBusquedaFormaPagoPuntoVenta) {
		this.sUltimaBusquedaFormaPagoPuntoVenta = sUltimaBusquedaFormaPagoPuntoVenta;
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
    
	public Long getid_factura_punto_venta() {
		return this.id_factura_punto_venta;
	}
    
	public Long getid_tipo_forma_pago() {
		return this.id_tipo_forma_pago;
	}
    
	public Long getid_banco() {
		return this.id_banco;
	}
    
	public Long getid_cuenta_banco_pun_ven() {
		return this.id_cuenta_banco_pun_ven;
	}
    
	public Long getid_tipo_riesgo_cheque() {
		return this.id_tipo_riesgo_cheque;
	}
    
	public Long getid_banco_tarjeta() {
		return this.id_banco_tarjeta;
	}
    
	public Long getid_tarjeta_credito() {
		return this.id_tarjeta_credito;
	}
    
	public Long getid_tipo_interes_tarjeta() {
		return this.id_tipo_interes_tarjeta;
	}
    
	public Long getid_tipo_pago_tarjeta() {
		return this.id_tipo_pago_tarjeta;
	}
    
	public Long getid_conexion() {
		return this.id_conexion;
	}
    
	public Long getid_mes() {
		return this.id_mes;
	}
    
	public Long getid_anio() {
		return this.id_anio;
	}
    
	public Long getid_cuenta_contable() {
		return this.id_cuenta_contable;
	}
    
	public Long getid_asiento_contable() {
		return this.id_asiento_contable;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormaPagoPuntoVenta:Valor nulo no permitido en columna id");
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
						System.out.println("FormaPagoPuntoVenta:Valor nulo no permitido en columna id_empresa");
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
						System.out.println("FormaPagoPuntoVenta:Valor nulo no permitido en columna id_sucursal");
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
						System.out.println("FormaPagoPuntoVenta:Valor nulo no permitido en columna id_ejercicio");
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
						System.out.println("FormaPagoPuntoVenta:Valor nulo no permitido en columna id_periodo");
					}
				}

				this.id_periodo=newid_periodo;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_factura_punto_venta(Long newid_factura_punto_venta)throws Exception
	{
		try {
			if(this.id_factura_punto_venta!=newid_factura_punto_venta) {
				if(newid_factura_punto_venta==null) {
					//newid_factura_punto_venta=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormaPagoPuntoVenta:Valor nulo no permitido en columna id_factura_punto_venta");
					}
				}

				this.id_factura_punto_venta=newid_factura_punto_venta;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_tipo_forma_pago(Long newid_tipo_forma_pago)throws Exception
	{
		try {
			if(this.id_tipo_forma_pago!=newid_tipo_forma_pago) {
				if(newid_tipo_forma_pago==null) {
					//newid_tipo_forma_pago=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("FormaPagoPuntoVenta:Valor nulo no permitido en columna id_tipo_forma_pago");
					}
				}

				this.id_tipo_forma_pago=newid_tipo_forma_pago;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_banco(Long newid_banco) {
		if(this.id_banco!=newid_banco) {

			this.id_banco=newid_banco;
		}
	}
    
	public void setid_cuenta_banco_pun_ven(Long newid_cuenta_banco_pun_ven) {
		if(this.id_cuenta_banco_pun_ven!=newid_cuenta_banco_pun_ven) {

			this.id_cuenta_banco_pun_ven=newid_cuenta_banco_pun_ven;
		}
	}
    
	public void setid_tipo_riesgo_cheque(Long newid_tipo_riesgo_cheque) {
		if(this.id_tipo_riesgo_cheque!=newid_tipo_riesgo_cheque) {

			this.id_tipo_riesgo_cheque=newid_tipo_riesgo_cheque;
		}
	}
    
	public void setid_banco_tarjeta(Long newid_banco_tarjeta) {
		if(this.id_banco_tarjeta!=newid_banco_tarjeta) {

			this.id_banco_tarjeta=newid_banco_tarjeta;
		}
	}
    
	public void setid_tarjeta_credito(Long newid_tarjeta_credito) {
		if(this.id_tarjeta_credito!=newid_tarjeta_credito) {

			this.id_tarjeta_credito=newid_tarjeta_credito;
		}
	}
    
	public void setid_tipo_interes_tarjeta(Long newid_tipo_interes_tarjeta) {
		if(this.id_tipo_interes_tarjeta!=newid_tipo_interes_tarjeta) {

			this.id_tipo_interes_tarjeta=newid_tipo_interes_tarjeta;
		}
	}
    
	public void setid_tipo_pago_tarjeta(Long newid_tipo_pago_tarjeta) {
		if(this.id_tipo_pago_tarjeta!=newid_tipo_pago_tarjeta) {

			this.id_tipo_pago_tarjeta=newid_tipo_pago_tarjeta;
		}
	}
    
	public void setid_conexion(Long newid_conexion) {
		if(this.id_conexion!=newid_conexion) {

			this.id_conexion=newid_conexion;
		}
	}
    
	public void setid_mes(Long newid_mes) {
		if(this.id_mes!=newid_mes) {

			this.id_mes=newid_mes;
		}
	}
    
	public void setid_anio(Long newid_anio) {
		if(this.id_anio!=newid_anio) {

			this.id_anio=newid_anio;
		}
	}
    
	public void setid_cuenta_contable(Long newid_cuenta_contable) {
		if(this.id_cuenta_contable!=newid_cuenta_contable) {

			this.id_cuenta_contable=newid_cuenta_contable;
		}
	}
    
	public void setid_asiento_contable(Long newid_asiento_contable) {
		if(this.id_asiento_contable!=newid_asiento_contable) {

			this.id_asiento_contable=newid_asiento_contable;
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
	public Boolean getisBusquedaDesdeForeignKeySesionFacturaPuntoVenta() {
		return isBusquedaDesdeForeignKeySesionFacturaPuntoVenta;
	}

	public void setisBusquedaDesdeForeignKeySesionFacturaPuntoVenta(
		Boolean isBusquedaDesdeForeignKeySesionFacturaPuntoVenta) {
		this.isBusquedaDesdeForeignKeySesionFacturaPuntoVenta = isBusquedaDesdeForeignKeySesionFacturaPuntoVenta;
	}

	public Long getlidFacturaPuntoVentaActual() {
		return lidFacturaPuntoVentaActual;
	}

	public void setlidFacturaPuntoVentaActual(Long lidFacturaPuntoVentaActual) {
		this.lidFacturaPuntoVentaActual = lidFacturaPuntoVentaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoFormaPago() {
		return isBusquedaDesdeForeignKeySesionTipoFormaPago;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoFormaPago(
		Boolean isBusquedaDesdeForeignKeySesionTipoFormaPago) {
		this.isBusquedaDesdeForeignKeySesionTipoFormaPago = isBusquedaDesdeForeignKeySesionTipoFormaPago;
	}

	public Long getlidTipoFormaPagoActual() {
		return lidTipoFormaPagoActual;
	}

	public void setlidTipoFormaPagoActual(Long lidTipoFormaPagoActual) {
		this.lidTipoFormaPagoActual = lidTipoFormaPagoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBanco() {
		return isBusquedaDesdeForeignKeySesionBanco;
	}

	public void setisBusquedaDesdeForeignKeySesionBanco(
		Boolean isBusquedaDesdeForeignKeySesionBanco) {
		this.isBusquedaDesdeForeignKeySesionBanco = isBusquedaDesdeForeignKeySesionBanco;
	}

	public Long getlidBancoActual() {
		return lidBancoActual;
	}

	public void setlidBancoActual(Long lidBancoActual) {
		this.lidBancoActual = lidBancoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaBancoPunVen() {
		return isBusquedaDesdeForeignKeySesionCuentaBancoPunVen;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaBancoPunVen(
		Boolean isBusquedaDesdeForeignKeySesionCuentaBancoPunVen) {
		this.isBusquedaDesdeForeignKeySesionCuentaBancoPunVen = isBusquedaDesdeForeignKeySesionCuentaBancoPunVen;
	}

	public Long getlidCuentaBancoPunVenActual() {
		return lidCuentaBancoPunVenActual;
	}

	public void setlidCuentaBancoPunVenActual(Long lidCuentaBancoPunVenActual) {
		this.lidCuentaBancoPunVenActual = lidCuentaBancoPunVenActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoRiesgoCheque() {
		return isBusquedaDesdeForeignKeySesionTipoRiesgoCheque;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoRiesgoCheque(
		Boolean isBusquedaDesdeForeignKeySesionTipoRiesgoCheque) {
		this.isBusquedaDesdeForeignKeySesionTipoRiesgoCheque = isBusquedaDesdeForeignKeySesionTipoRiesgoCheque;
	}

	public Long getlidTipoRiesgoChequeActual() {
		return lidTipoRiesgoChequeActual;
	}

	public void setlidTipoRiesgoChequeActual(Long lidTipoRiesgoChequeActual) {
		this.lidTipoRiesgoChequeActual = lidTipoRiesgoChequeActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionBancoTarjeta() {
		return isBusquedaDesdeForeignKeySesionBancoTarjeta;
	}

	public void setisBusquedaDesdeForeignKeySesionBancoTarjeta(
		Boolean isBusquedaDesdeForeignKeySesionBancoTarjeta) {
		this.isBusquedaDesdeForeignKeySesionBancoTarjeta = isBusquedaDesdeForeignKeySesionBancoTarjeta;
	}

	public Long getlidBancoTarjetaActual() {
		return lidBancoTarjetaActual;
	}

	public void setlidBancoTarjetaActual(Long lidBancoTarjetaActual) {
		this.lidBancoTarjetaActual = lidBancoTarjetaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTarjetaCredito() {
		return isBusquedaDesdeForeignKeySesionTarjetaCredito;
	}

	public void setisBusquedaDesdeForeignKeySesionTarjetaCredito(
		Boolean isBusquedaDesdeForeignKeySesionTarjetaCredito) {
		this.isBusquedaDesdeForeignKeySesionTarjetaCredito = isBusquedaDesdeForeignKeySesionTarjetaCredito;
	}

	public Long getlidTarjetaCreditoActual() {
		return lidTarjetaCreditoActual;
	}

	public void setlidTarjetaCreditoActual(Long lidTarjetaCreditoActual) {
		this.lidTarjetaCreditoActual = lidTarjetaCreditoActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoInteresTarjeta() {
		return isBusquedaDesdeForeignKeySesionTipoInteresTarjeta;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoInteresTarjeta(
		Boolean isBusquedaDesdeForeignKeySesionTipoInteresTarjeta) {
		this.isBusquedaDesdeForeignKeySesionTipoInteresTarjeta = isBusquedaDesdeForeignKeySesionTipoInteresTarjeta;
	}

	public Long getlidTipoInteresTarjetaActual() {
		return lidTipoInteresTarjetaActual;
	}

	public void setlidTipoInteresTarjetaActual(Long lidTipoInteresTarjetaActual) {
		this.lidTipoInteresTarjetaActual = lidTipoInteresTarjetaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionTipoPagoTarjeta() {
		return isBusquedaDesdeForeignKeySesionTipoPagoTarjeta;
	}

	public void setisBusquedaDesdeForeignKeySesionTipoPagoTarjeta(
		Boolean isBusquedaDesdeForeignKeySesionTipoPagoTarjeta) {
		this.isBusquedaDesdeForeignKeySesionTipoPagoTarjeta = isBusquedaDesdeForeignKeySesionTipoPagoTarjeta;
	}

	public Long getlidTipoPagoTarjetaActual() {
		return lidTipoPagoTarjetaActual;
	}

	public void setlidTipoPagoTarjetaActual(Long lidTipoPagoTarjetaActual) {
		this.lidTipoPagoTarjetaActual = lidTipoPagoTarjetaActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionConexion() {
		return isBusquedaDesdeForeignKeySesionConexion;
	}

	public void setisBusquedaDesdeForeignKeySesionConexion(
		Boolean isBusquedaDesdeForeignKeySesionConexion) {
		this.isBusquedaDesdeForeignKeySesionConexion = isBusquedaDesdeForeignKeySesionConexion;
	}

	public Long getlidConexionActual() {
		return lidConexionActual;
	}

	public void setlidConexionActual(Long lidConexionActual) {
		this.lidConexionActual = lidConexionActual;
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
	public Boolean getisBusquedaDesdeForeignKeySesionCuentaContable() {
		return isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public void setisBusquedaDesdeForeignKeySesionCuentaContable(
		Boolean isBusquedaDesdeForeignKeySesionCuentaContable) {
		this.isBusquedaDesdeForeignKeySesionCuentaContable = isBusquedaDesdeForeignKeySesionCuentaContable;
	}

	public Long getlidCuentaContableActual() {
		return lidCuentaContableActual;
	}

	public void setlidCuentaContableActual(Long lidCuentaContableActual) {
		this.lidCuentaContableActual = lidCuentaContableActual;
	}
	public Boolean getisBusquedaDesdeForeignKeySesionAsientoContable() {
		return isBusquedaDesdeForeignKeySesionAsientoContable;
	}

	public void setisBusquedaDesdeForeignKeySesionAsientoContable(
		Boolean isBusquedaDesdeForeignKeySesionAsientoContable) {
		this.isBusquedaDesdeForeignKeySesionAsientoContable = isBusquedaDesdeForeignKeySesionAsientoContable;
	}

	public Long getlidAsientoContableActual() {
		return lidAsientoContableActual;
	}

	public void setlidAsientoContableActual(Long lidAsientoContableActual) {
		this.lidAsientoContableActual = lidAsientoContableActual;
	}
	
	
		
	
}
