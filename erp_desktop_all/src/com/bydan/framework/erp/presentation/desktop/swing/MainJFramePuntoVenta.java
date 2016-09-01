package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JDesktopPane;

import com.bydan.erp.seguridad.business.entity.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report.*;

import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.util.report.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.util.report.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.util.report.*;

import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.PaginaTipo;
@SuppressWarnings("unused")
public class MainJFramePuntoVenta {
	/*
	public static Usuario usuarioActual=null;
	public static ParametroGeneralSg parametroGeneralSg=null;
	public static ParametroGeneralUsuario parametroGeneralUsuario=null;	
	public static Modulo moduloActual=null;
	public static JDesktopPane desktop;
	*/
	public static String AUX_TEMP="";
	
	public static JInternalFrameBase getJInternalFrameBaseMenu(String strPaquete,String strPantalla,Opcion opcionActual
									 ,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,JDesktopPane desktop,Boolean esParaPrecargarModulo) throws Exception{
    	JInternalFrameBase jinternalFrame=new JInternalFrameBase();
    	
    	//PUNTO_VENTA
		CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame=null;
		CajaCierreBeanSwingJInternalFrame cajacierreBeanSwingJInternalFrame=null;
		CajaEgresoBeanSwingJInternalFrame cajaegresoBeanSwingJInternalFrame=null;
		CajaEgresoDetalleBeanSwingJInternalFrame cajaegresodetalleBeanSwingJInternalFrame=null;
		CajaIngresoBeanSwingJInternalFrame cajaingresoBeanSwingJInternalFrame=null;
		CajaIngresoDetalleBeanSwingJInternalFrame cajaingresodetalleBeanSwingJInternalFrame=null;
		CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFrame=null;
		CierreCajaBeanSwingJInternalFrame cierrecajaBeanSwingJInternalFrame=null;
		ConexionBeanSwingJInternalFrame conexionBeanSwingJInternalFrame=null;
		ConfiguracionPunVenBeanSwingJInternalFrame configuracionpunvenBeanSwingJInternalFrame=null;
		CuentaBancoPunVenBeanSwingJInternalFrame cuentabancopunvenBeanSwingJInternalFrame=null;
		DepositoBancoBeanSwingJInternalFrame depositobancoBeanSwingJInternalFrame=null;
		DetalleFacturaPuntoVentaBeanSwingJInternalFrame detallefacturapuntoventaBeanSwingJInternalFrame=null;
		DetallePedidoPuntoVentaBeanSwingJInternalFrame detallepedidopuntoventaBeanSwingJInternalFrame=null;
		EstadoFacturaPuntoVentaBeanSwingJInternalFrame estadofacturapuntoventaBeanSwingJInternalFrame=null;
		EstadoPedidoPuntoVentaBeanSwingJInternalFrame estadopedidopuntoventaBeanSwingJInternalFrame=null;
		FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame=null;
		FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;
		FormulaBeanSwingJInternalFrame formulaBeanSwingJInternalFrame=null;
		GrupoClienteFormaPagoBeanSwingJInternalFrame grupoclienteformapagoBeanSwingJInternalFrame=null;
		HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame historialformapagopuntoventaBeanSwingJInternalFrame=null;
		LineaPuntoVentaBeanSwingJInternalFrame lineapuntoventaBeanSwingJInternalFrame=null;
		MesaBeanSwingJInternalFrame mesaBeanSwingJInternalFrame=null;
		PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame=null;
		ProductoPuntoVentaBeanSwingJInternalFrame productopuntoventaBeanSwingJInternalFrame=null;
		ProntoPagoBeanSwingJInternalFrame prontopagoBeanSwingJInternalFrame=null;
		TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame=null;
		TarjetaCreditoConexionBeanSwingJInternalFrame tarjetacreditoconexionBeanSwingJInternalFrame=null;
		TarjetaCreditoDescuentoBeanSwingJInternalFrame tarjetacreditodescuentoBeanSwingJInternalFrame=null;
		TipoConexionBeanSwingJInternalFrame tipoconexionBeanSwingJInternalFrame=null;
		TipoFormulaBeanSwingJInternalFrame tipoformulaBeanSwingJInternalFrame=null;
		TipoInteresTarjetaBeanSwingJInternalFrame tipointerestarjetaBeanSwingJInternalFrame=null;
		TipoPagoTarjetaBeanSwingJInternalFrame tipopagotarjetaBeanSwingJInternalFrame=null;
		TipoRiesgoChequeBeanSwingJInternalFrame tiporiesgochequeBeanSwingJInternalFrame=null;
		TipoRiesgoClienteBeanSwingJInternalFrame tiporiesgoclienteBeanSwingJInternalFrame=null;
		TurnoPunVenBeanSwingJInternalFrame turnopunvenBeanSwingJInternalFrame=null;
		TipoFacturaPuntoVentaBeanSwingJInternalFrame tipofacturapuntoventaBeanSwingJInternalFrame=null;
		BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame=null;
		TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame=null;
		EstadoPrecioBeanSwingJInternalFrame estadoprecioBeanSwingJInternalFrame=null;
		DescuentoMontoBeanSwingJInternalFrame descuentomontoBeanSwingJInternalFrame=null;
		DescuentoTipoPrecioBeanSwingJInternalFrame descuentotipoprecioBeanSwingJInternalFrame=null;
		MovimientoInventarioBeanSwingJInternalFrame movimientoinventarioBeanSwingJInternalFrame=null;
		NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame=null;

		
		//PUNTO_VENTA REP�RTES
		CajaDiariaUsuarioBeanSwingJInternalFrame cajadiariausuarioBeanSwingJInternalFrame=null;
		CajaDiariaCajaBeanSwingJInternalFrame cajadiariacajaBeanSwingJInternalFrame=null;
		ResumenCierreCajaBeanSwingJInternalFrame resumencierrecajaBeanSwingJInternalFrame=null;
		CajerosBeanSwingJInternalFrame cajerosBeanSwingJInternalFrame=null;
		ComprobanteFacturaBeanSwingJInternalFrame comprobantefacturaBeanSwingJInternalFrame=null;
		ComprobanteFacturaDetalleBeanSwingJInternalFrame comprobantefacturadetalleBeanSwingJInternalFrame=null;
		ComprobanteFormaPagoBeanSwingJInternalFrame comprobanteformapagoBeanSwingJInternalFrame=null;
		ComprobanteTarjetaBeanSwingJInternalFrame comprobantetarjetaBeanSwingJInternalFrame=null;
		EstadisticaProductosBeanSwingJInternalFrame estadisticaproductosBeanSwingJInternalFrame=null;
		FacturaDescuadradaBeanSwingJInternalFrame facturadescuadradaBeanSwingJInternalFrame=null;
		ProductosBeanSwingJInternalFrame productosBeanSwingJInternalFrame=null;
		TarjetasCreditosBeanSwingJInternalFrame tarjetascreditosBeanSwingJInternalFrame=null;
		VentaGeneralBeanSwingJInternalFrame ventageneralBeanSwingJInternalFrame=null;
		VentaPorLineaBeanSwingJInternalFrame ventaporlineaBeanSwingJInternalFrame=null;
									
		//PUNTO_VENTA_PROCESOS
		AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=null;
		ReciboPuntoVentaBeanSwingJInternalFrame recibopuntoventaBeanSwingJInternalFrame=null;
		PresupuestoVentasPunVenBeanSwingJInternalFrame presupuestoventaspunvenBeanSwingJInternalFrame=null;
		NumeroRecapBeanSwingJInternalFrame numerorecapBeanSwingJInternalFrame=null;
		ProcesoCierreCajaBeanSwingJInternalFrame procesocierrecajaBeanSwingJInternalFrame=null;
		PagosTarjetasBeanSwingJInternalFrame pagostarjetasBeanSwingJInternalFrame=null;

		//RELACIONES
		ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
		FormaPagoBeanSwingJInternalFrame formapagoBeanSwingJInternalFrame;
		VariableNomiBeanSwingJInternalFrame variablenomiBeanSwingJInternalFrame;
		VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
		
		
		if(strPaquete.equals(Constantes.SMODULO_PUNTO_VENTA)) {  
			if(strPantalla.equals(CajaConstantesFunciones.CLASSNAME)) {
				cajaBeanSwingJInternalFrame=new CajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cajaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(CajaCierreConstantesFunciones.CLASSNAME)) {
				cajacierreBeanSwingJInternalFrame=new CajaCierreBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cajacierreBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(CajaEgresoConstantesFunciones.CLASSNAME)) {
				cajaegresoBeanSwingJInternalFrame=new CajaEgresoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cajaegresoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(CajaEgresoDetalleConstantesFunciones.CLASSNAME)) {
				cajaegresodetalleBeanSwingJInternalFrame=new CajaEgresoDetalleBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cajaegresodetalleBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(CajaIngresoConstantesFunciones.CLASSNAME)) {
				cajaingresoBeanSwingJInternalFrame=new CajaIngresoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cajaingresoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(CajaIngresoDetalleConstantesFunciones.CLASSNAME)) {
				cajaingresodetalleBeanSwingJInternalFrame=new CajaIngresoDetalleBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cajaingresodetalleBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(CajeroTurnoConstantesFunciones.CLASSNAME)) {
				cajeroturnoBeanSwingJInternalFrame=new CajeroTurnoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cajeroturnoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(CierreCajaConstantesFunciones.CLASSNAME)) {
				cierrecajaBeanSwingJInternalFrame=new CierreCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cierrecajaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ConexionConstantesFunciones.CLASSNAME)) {
				conexionBeanSwingJInternalFrame=new ConexionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =conexionBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ConfiguracionPunVenConstantesFunciones.CLASSNAME)) {
				configuracionpunvenBeanSwingJInternalFrame=new ConfiguracionPunVenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =configuracionpunvenBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(CuentaBancoPunVenConstantesFunciones.CLASSNAME)) {
				cuentabancopunvenBeanSwingJInternalFrame=new CuentaBancoPunVenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cuentabancopunvenBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(DepositoBancoConstantesFunciones.CLASSNAME)) {
				depositobancoBeanSwingJInternalFrame=new DepositoBancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =depositobancoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME)) {
				detallefacturapuntoventaBeanSwingJInternalFrame=new DetalleFacturaPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =detallefacturapuntoventaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME)) {
				detallepedidopuntoventaBeanSwingJInternalFrame=new DetallePedidoPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =detallepedidopuntoventaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(EstadoFacturaPuntoVentaConstantesFunciones.CLASSNAME)) {
				estadofacturapuntoventaBeanSwingJInternalFrame=new EstadoFacturaPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadofacturapuntoventaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(EstadoPedidoPuntoVentaConstantesFunciones.CLASSNAME)) {
				estadopedidopuntoventaBeanSwingJInternalFrame=new EstadoPedidoPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadopedidopuntoventaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(FacturaPuntoVentaConstantesFunciones.CLASSNAME)) {
				facturapuntoventaBeanSwingJInternalFrame=new FacturaPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =facturapuntoventaBeanSwingJInternalFrame;
			}
			else if(strPantalla.equals(FormaPagoPuntoVentaConstantesFunciones.CLASSNAME)) {
				formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =formapagopuntoventaBeanSwingJInternalFrame;
			}
			
			
			else if(strPantalla.equals(FormulaConstantesFunciones.CLASSNAME)) {
				formulaBeanSwingJInternalFrame=new FormulaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =formulaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(GrupoClienteFormaPagoConstantesFunciones.CLASSNAME)) {
				grupoclienteformapagoBeanSwingJInternalFrame=new GrupoClienteFormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =grupoclienteformapagoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME)) {
				historialformapagopuntoventaBeanSwingJInternalFrame=new HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =historialformapagopuntoventaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(LineaPuntoVentaConstantesFunciones.CLASSNAME)) {
				lineapuntoventaBeanSwingJInternalFrame=new LineaPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =lineapuntoventaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(MesaConstantesFunciones.CLASSNAME)) {
				mesaBeanSwingJInternalFrame=new MesaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =mesaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(PedidoPuntoVentaConstantesFunciones.CLASSNAME)) {
				pedidopuntoventaBeanSwingJInternalFrame=new PedidoPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =pedidopuntoventaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ProductoPuntoVentaConstantesFunciones.CLASSNAME)) {
				productopuntoventaBeanSwingJInternalFrame=new ProductoPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =productopuntoventaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ProntoPagoConstantesFunciones.CLASSNAME)) {
				prontopagoBeanSwingJInternalFrame=new ProntoPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =prontopagoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TarjetaCreditoConstantesFunciones.CLASSNAME)) {
				tarjetacreditoBeanSwingJInternalFrame=new TarjetaCreditoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tarjetacreditoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TarjetaCreditoConexionConstantesFunciones.CLASSNAME)) {
				tarjetacreditoconexionBeanSwingJInternalFrame=new TarjetaCreditoConexionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tarjetacreditoconexionBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME)) {
				tarjetacreditodescuentoBeanSwingJInternalFrame=new TarjetaCreditoDescuentoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tarjetacreditodescuentoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoConexionConstantesFunciones.CLASSNAME)) {
				tipoconexionBeanSwingJInternalFrame=new TipoConexionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoconexionBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoFormulaConstantesFunciones.CLASSNAME)) {
				tipoformulaBeanSwingJInternalFrame=new TipoFormulaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoformulaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoInteresTarjetaConstantesFunciones.CLASSNAME)) {
				tipointerestarjetaBeanSwingJInternalFrame=new TipoInteresTarjetaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipointerestarjetaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoPagoTarjetaConstantesFunciones.CLASSNAME)) {
				tipopagotarjetaBeanSwingJInternalFrame=new TipoPagoTarjetaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipopagotarjetaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoRiesgoChequeConstantesFunciones.CLASSNAME)) {
				tiporiesgochequeBeanSwingJInternalFrame=new TipoRiesgoChequeBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tiporiesgochequeBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoRiesgoClienteConstantesFunciones.CLASSNAME)) {
				tiporiesgoclienteBeanSwingJInternalFrame=new TipoRiesgoClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tiporiesgoclienteBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TurnoPunVenConstantesFunciones.CLASSNAME)) {
				turnopunvenBeanSwingJInternalFrame=new TurnoPunVenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =turnopunvenBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(TipoFacturaPuntoVentaConstantesFunciones.CLASSNAME)) {
				tipofacturapuntoventaBeanSwingJInternalFrame=new TipoFacturaPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipofacturapuntoventaBeanSwingJInternalFrame;
			}
			else if(strPantalla.equals(ClienteConstantesFunciones.CLASSNAME)) {
				clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =clienteBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(FormaPagoConstantesFunciones.CLASSNAME)) {
				formapagoBeanSwingJInternalFrame=new FormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =formapagoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(VariableNomiConstantesFunciones.CLASSNAME)) {
				variablenomiBeanSwingJInternalFrame=new VariableNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =variablenomiBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(VendedorConstantesFunciones.CLASSNAME)) {
				vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =vendedorBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(CajaDiariaUsuarioConstantesFunciones.CLASSNAME)) {
				cajadiariausuarioBeanSwingJInternalFrame=new CajaDiariaUsuarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cajadiariausuarioBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(CajaDiariaCajaConstantesFunciones.CLASSNAME)) {
				cajadiariacajaBeanSwingJInternalFrame=new CajaDiariaCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cajadiariacajaBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(ResumenCierreCajaConstantesFunciones.CLASSNAME)) {
				resumencierrecajaBeanSwingJInternalFrame=new ResumenCierreCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =resumencierrecajaBeanSwingJInternalFrame;
			} else if(strPantalla.equals(CajerosConstantesFunciones.CLASSNAME)) {
				cajerosBeanSwingJInternalFrame=new CajerosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cajerosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ComprobanteFacturaConstantesFunciones.CLASSNAME)) {
				comprobantefacturaBeanSwingJInternalFrame=new ComprobanteFacturaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =comprobantefacturaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ComprobanteFacturaDetalleConstantesFunciones.CLASSNAME)) {
				comprobantefacturadetalleBeanSwingJInternalFrame=new ComprobanteFacturaDetalleBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =comprobantefacturadetalleBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ComprobanteFormaPagoConstantesFunciones.CLASSNAME)) {
				comprobanteformapagoBeanSwingJInternalFrame=new ComprobanteFormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =comprobanteformapagoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ComprobanteTarjetaConstantesFunciones.CLASSNAME)) {
				comprobantetarjetaBeanSwingJInternalFrame=new ComprobanteTarjetaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =comprobantetarjetaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(EstadisticaProductosConstantesFunciones.CLASSNAME)) {
				estadisticaproductosBeanSwingJInternalFrame=new EstadisticaProductosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadisticaproductosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(FacturaDescuadradaConstantesFunciones.CLASSNAME)) {
				facturadescuadradaBeanSwingJInternalFrame=new FacturaDescuadradaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =facturadescuadradaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ProductosConstantesFunciones.CLASSNAME)) {
				productosBeanSwingJInternalFrame=new ProductosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =productosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ResumenCierreCajaConstantesFunciones.CLASSNAME)) {
				resumencierrecajaBeanSwingJInternalFrame=new ResumenCierreCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =resumencierrecajaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TarjetasCreditosConstantesFunciones.CLASSNAME)) {
				tarjetascreditosBeanSwingJInternalFrame=new TarjetasCreditosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tarjetascreditosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(VentaGeneralConstantesFunciones.CLASSNAME)) {
				ventageneralBeanSwingJInternalFrame=new VentaGeneralBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =ventageneralBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(VentaPorLineaConstantesFunciones.CLASSNAME)) {
				ventaporlineaBeanSwingJInternalFrame=new VentaPorLineaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =ventaporlineaBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(AsientoContableConstantesFunciones.CLASSNAME)) {
				asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =asientocontableBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(ReciboPuntoVentaConstantesFunciones.CLASSNAME)) {
				recibopuntoventaBeanSwingJInternalFrame=new ReciboPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =recibopuntoventaBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(PresupuestoVentasPunVenConstantesFunciones.CLASSNAME)) {
				presupuestoventaspunvenBeanSwingJInternalFrame=new PresupuestoVentasPunVenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =presupuestoventaspunvenBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(NumeroRecapConstantesFunciones.CLASSNAME)) {
				numerorecapBeanSwingJInternalFrame=new NumeroRecapBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =numerorecapBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(ProcesoCierreCajaConstantesFunciones.CLASSNAME)) {
				procesocierrecajaBeanSwingJInternalFrame=new ProcesoCierreCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =procesocierrecajaBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(PagosTarjetasConstantesFunciones.CLASSNAME)) {
				pagostarjetasBeanSwingJInternalFrame=new PagosTarjetasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =pagostarjetasBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(BancoConstantesFunciones.CLASSNAME)) {
				bancoBeanSwingJInternalFrame=new BancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =bancoBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(TipoFormaPagoConstantesFunciones.CLASSNAME)) {
				tipoformapagoBeanSwingJInternalFrame=new TipoFormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoformapagoBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(EstadoPrecioConstantesFunciones.CLASSNAME)) {
				estadoprecioBeanSwingJInternalFrame=new EstadoPrecioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadoprecioBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(DescuentoMontoConstantesFunciones.CLASSNAME)) {
				descuentomontoBeanSwingJInternalFrame=new DescuentoMontoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =descuentomontoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(DescuentoTipoPrecioConstantesFunciones.CLASSNAME)) {
				descuentotipoprecioBeanSwingJInternalFrame=new DescuentoTipoPrecioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =descuentotipoprecioBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(MovimientoInventarioConstantesFunciones.CLASSNAME)) {
				movimientoinventarioBeanSwingJInternalFrame=new MovimientoInventarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,true,false,true,true);
				jinternalFrame =movimientoinventarioBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(NotaCreditoPuntoVentaConstantesFunciones.CLASSNAME)) {
				notacreditopuntoventaBeanSwingJInternalFrame=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =notacreditopuntoventaBeanSwingJInternalFrame;
			}
		}
    	return jinternalFrame;
    	
	}
}
