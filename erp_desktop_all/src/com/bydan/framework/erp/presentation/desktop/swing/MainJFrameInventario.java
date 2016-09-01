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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.report.*;
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
import com.bydan.erp.facturacion.util.report.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.util.report.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.util.report.*;

import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.PaginaTipo;

@SuppressWarnings("unused")
public class MainJFrameInventario {
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
    	
    	

		
		
		//INVENTARIO
		BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame=null;
		BodegaProductoBeanSwingJInternalFrame bodegaproductoBeanSwingJInternalFrame=null;
		BodegaSucursalBeanSwingJInternalFrame bodegasucursalBeanSwingJInternalFrame=null;
		CargoInvenBeanSwingJInternalFrame cargoinvenBeanSwingJInternalFrame=null;
		ConversionInvenBeanSwingJInternalFrame conversioninvenBeanSwingJInternalFrame=null;
		DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;
		LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=null;
		ParametroInvenBeanSwingJInternalFrame parametroinvenBeanSwingJInternalFrame=null;
		PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFrame=null;
		ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;
		SerieProductoBeanSwingJInternalFrame serieproductoBeanSwingJInternalFrame=null;
		UbicacionProduBeanSwingJInternalFrame ubicacionproduBeanSwingJInternalFrame=null;
		EstadoBodegaProductoBeanSwingJInternalFrame estadobodegaproductoBeanSwingJInternalFrame=null;
		TipoConversionInvenBeanSwingJInternalFrame tipoconversioninvenBeanSwingJInternalFrame=null;
		UbicacionBodeBeanSwingJInternalFrame ubicacionbodeBeanSwingJInternalFrame=null;
		UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame=null;
		ArancelBeanSwingJInternalFrame arancelBeanSwingJInternalFrame=null;
		CalidadProductoBeanSwingJInternalFrame calidadproductoBeanSwingJInternalFrame=null;
		ControlVehiculoBeanSwingJInternalFrame controlvehiculoBeanSwingJInternalFrame=null;
		NovedadProductoBeanSwingJInternalFrame novedadproductoBeanSwingJInternalFrame=null;
		PrioridadPedidoBeanSwingJInternalFrame prioridadpedidoBeanSwingJInternalFrame=null;
		RequisicionBeanSwingJInternalFrame requisicionBeanSwingJInternalFrame=null;    		
		TipoRequisicionBeanSwingJInternalFrame tiporequisicionBeanSwingJInternalFrame=null;
		EstadoServicioBeanSwingJInternalFrame estadoservicioBeanSwingJInternalFrame=null;
		ServicioBeanSwingJInternalFrame servicioBeanSwingJInternalFrame=null;
		TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame=null;
		UtilidadProductoBeanSwingJInternalFrame utilidadproductoBeanSwingJInternalFrame=null;
		MovimientoInventarioBeanSwingJInternalFrame movimientoinventarioBeanSwingJInternalFrame=null;
		CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame=null;
		//DetalleMovimientoInventarioTodoWebBeanSwingJInternalFrame detallemovimientoinventariotodowebBeanSwingJInternalFrame=null;
		AutoriConsepBeanSwingJInternalFrame autoriconsepBeanSwingJInternalFrame=null;
		CabeceraSerieBeanSwingJInternalFrame cabeceraserieBeanSwingJInternalFrame=null;
		CentroCostoValorBeanSwingJInternalFrame centrocostovalorBeanSwingJInternalFrame=null;
		ConversionUnidadBeanSwingJInternalFrame conversionunidadBeanSwingJInternalFrame=null;
		CuentasContablesLineaProductoBeanSwingJInternalFrame cuentascontableslineaproductoBeanSwingJInternalFrame=null;
		DetalleAutoriConsepBeanSwingJInternalFrame detalleautoriconsepBeanSwingJInternalFrame=null;
		EmbarcadorBeanSwingJInternalFrame embarcadorBeanSwingJInternalFrame=null;
		EstadoDetalleAutoriConsepBeanSwingJInternalFrame estadodetalleautoriconsepBeanSwingJInternalFrame=null;
		EstadoNovedadSeguimientoBeanSwingJInternalFrame estadonovedadseguimientoBeanSwingJInternalFrame=null;
		NovedadSeguimientoBeanSwingJInternalFrame novedadseguimientoBeanSwingJInternalFrame=null;
		PresupuestoLineaBeanSwingJInternalFrame presupuestolineaBeanSwingJInternalFrame=null;
		RecargoCompraBeanSwingJInternalFrame recargocompraBeanSwingJInternalFrame=null;
		TipoAutoriConsepBeanSwingJInternalFrame tipoautoriconsepBeanSwingJInternalFrame=null;
		TipoDefinicionBeanSwingJInternalFrame tipodefinicionBeanSwingJInternalFrame=null;
		TipoServicioBeanSwingJInternalFrame tiposervicioBeanSwingJInternalFrame=null;
		UtilidadTipoPrecioBeanSwingJInternalFrame utilidadtipoprecioBeanSwingJInternalFrame=null;
		GrupoColorBeanSwingJInternalFrame grupocolorBeanSwingJInternalFrame=null;
		NivelLineaBeanSwingJInternalFrame nivellineaBeanSwingJInternalFrame=null;
		GrupoBodegaBeanSwingJInternalFrame grupobodegaBeanSwingJInternalFrame=null;
		TipoPrioridadPedidoBeanSwingJInternalFrame tipoprioridadpedidoBeanSwingJInternalFrame=null;
		PuertoBeanSwingJInternalFrame puertoBeanSwingJInternalFrame=null;
		ParametroCompraBeanSwingJInternalFrame parametrocompraBeanSwingJInternalFrame=null;
		TipoCosteoBeanSwingJInternalFrame tipocosteoBeanSwingJInternalFrame=null;
		TipoCostoBeanSwingJInternalFrame tipocostoBeanSwingJInternalFrame=null;
		TipoProductoServicioInvenBeanSwingJInternalFrame tipoproductoservicioinvenBeanSwingJInternalFrame=null;
		DetallePedidoCompraBeanSwingJInternalFrame detallepedidocompraBeanSwingJInternalFrame=null;		
		PedidoCompraBeanSwingJInternalFrame pedidocompraBeanSwingJInternalFrame=null;
		RequisicionCompraBeanSwingJInternalFrame requisicioncompraBeanSwingJInternalFrame=null;
		DetalleRetencionBeanSwingJInternalFrame detalleretencionBeanSwingJInternalFrame=null;
		EstadoRequisicionBeanSwingJInternalFrame estadorequisicionBeanSwingJInternalFrame=null;
		OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame=null;
		TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame=null;
		TransferenciaBeanSwingJInternalFrame transferenciaBeanSwingJInternalFrame=null;
		
		EstadoPedidoBeanSwingJInternalFrame estadopedidoBeanSwingJInternalFrame;
		TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrame;
		TipoEstadoPedidoBeanSwingJInternalFrame tipoestadopedidoBeanSwingJInternalFrame;
		
		ClaseProductoBeanSwingJInternalFrame claseproductoBeanSwingJInternalFrame=null;
		ColorProductoBeanSwingJInternalFrame colorproductoBeanSwingJInternalFrame=null;
		EfectoProductoBeanSwingJInternalFrame efectoproductoBeanSwingJInternalFrame=null;
		MarcaProductoBeanSwingJInternalFrame marcaproductoBeanSwingJInternalFrame=null;
		MaterialProductoBeanSwingJInternalFrame materialproductoBeanSwingJInternalFrame=null;
		ModeloProductoBeanSwingJInternalFrame modeloproductoBeanSwingJInternalFrame=null;
		SegmentoProductoBeanSwingJInternalFrame segmentoproductoBeanSwingJInternalFrame=null;
		TallaProductoBeanSwingJInternalFrame tallaproductoBeanSwingJInternalFrame=null;
		TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame=null;
		ImpuestoInvenBeanSwingJInternalFrame impuestoinvenBeanSwingJInternalFrame=null;
		VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame=null;
		MensajeCorreoInvenBeanSwingJInternalFrame mensajecorreoinvenBeanSwingJInternalFrame=null;
		TipoMensajeCorreoInvenBeanSwingJInternalFrame tipomensajecorreoinvenBeanSwingJInternalFrame=null;
		ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;
		TipoUnidadBeanSwingJInternalFrame tipounidadBeanSwingJInternalFrame=null;
		TipoCosteoDefinicionBeanSwingJInternalFrame tipocosteodefinicionBeanSwingJInternalFrame=null;
		TipoCostoDefinicionBeanSwingJInternalFrame tipocostodefinicionBeanSwingJInternalFrame=null;
		TipoIvaItemBeanSwingJInternalFrame tipoivaitemBeanSwingJInternalFrame=null;
		TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame=null;
		TipoGlobalClienteBeanSwingJInternalFrame tipoglobalclienteBeanSwingJInternalFrame=null;
		TipoDetalleMovimientoInventarioBeanSwingJInternalFrame tipodetallemovimientoinventarioBeanSwingJInternalFrame=null;
		
		
		//INVENTARIO_REPORTES
		AntiguedadesInventariosBeanSwingJInternalFrame antiguedadesinventariosBeanSwingJInternalFrame=null;
		ConsumosBodegasBeanSwingJInternalFrame consumosbodegasBeanSwingJInternalFrame=null;
		ConsumosServiciosBeanSwingJInternalFrame consumosserviciosBeanSwingJInternalFrame=null;
		DisponiblesCostosBeanSwingJInternalFrame disponiblescostosBeanSwingJInternalFrame=null;
		ExistenciasCostosBeanSwingJInternalFrame existenciascostosBeanSwingJInternalFrame=null;
		MovimientosDetalladosBeanSwingJInternalFrame movimientosdetalladosBeanSwingJInternalFrame=null;
		MovimientosResumidosBeanSwingJInternalFrame movimientosresumidosBeanSwingJInternalFrame=null;
		PedidosComprasBeanSwingJInternalFrame pedidoscomprasBeanSwingJInternalFrame=null;
		PreciosComprasBeanSwingJInternalFrame precioscomprasBeanSwingJInternalFrame=null;
		ProductosBodegasBeanSwingJInternalFrame productosbodegasBeanSwingJInternalFrame=null;
		ProductosServiciosDisponiblesBeanSwingJInternalFrame productosserviciosdisponiblesBeanSwingJInternalFrame=null;
		ProductosServiciosExistenciasBeanSwingJInternalFrame productosserviciosexistenciasBeanSwingJInternalFrame=null;
		ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame productosserviciospreciossinrangosBeanSwingJInternalFrame=null;
		ProductosServiciosProductosBeanSwingJInternalFrame productosserviciosproductosBeanSwingJInternalFrame=null;
		TransferenciasResumidosBeanSwingJInternalFrame transferenciasresumidosBeanSwingJInternalFrame=null;

		
		//RELACIONES
		FormaPagoBeanSwingJInternalFrame formapagoBeanSwingJInternalFrame;
		FacturaProveedorBeanSwingJInternalFrame facturaproveedorBeanSwingJInternalFrame;
		TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
		TransaccionContaBeanSwingJInternalFrame transaccioncontaBeanSwingJInternalFrame;
		
		
		//INVENTARIO_PROCESOS
		AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=null;
		ModificacionLineasProductosBeanSwingJInternalFrame modificacionlineasproductosBeanSwingJInternalFrame=null;
		PlaneacionCompraBeanSwingJInternalFrame planeacioncompraBeanSwingJInternalFrame=null;
		AutorizarRequisicionesBeanSwingJInternalFrame autorizarrequisicionesBeanSwingJInternalFrame=null;
		ConteosFisicosBeanSwingJInternalFrame conteosfisicosBeanSwingJInternalFrame=null;
		DemandaProductosBeanSwingJInternalFrame demandaproductosBeanSwingJInternalFrame=null;
		DiferenciasFisicasProductosBeanSwingJInternalFrame diferenciasfisicasproductosBeanSwingJInternalFrame=null;
		ExistenciasDisponiblesBeanSwingJInternalFrame existenciasdisponiblesBeanSwingJInternalFrame=null;
		ProcesoCodigosAlternosBeanSwingJInternalFrame procesocodigosalternosBeanSwingJInternalFrame=null;
		ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame procesocrearetiquetascodigobarrasBeanSwingJInternalFrame=null;
		ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame procesocrearetiquetasproductosBeanSwingJInternalFrame=null;
		ProcesoGenerarSaldosBeanSwingJInternalFrame procesogenerarsaldosBeanSwingJInternalFrame=null;
		ProcesoPreciosFactorBeanSwingJInternalFrame procesopreciosfactorBeanSwingJInternalFrame=null;
		ProcesoPreciosPorcentajeBeanSwingJInternalFrame procesopreciosporcentajeBeanSwingJInternalFrame=null;

		
		if(strPaquete.equals(Constantes.SMODULO_INVENTARIO)) {
			if(strPantalla.equals(BodegaConstantesFunciones.CLASSNAME)) {
				bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =bodegaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(BodegaProductoConstantesFunciones.CLASSNAME)) {
				bodegaproductoBeanSwingJInternalFrame=new BodegaProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =bodegaproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(BodegaSucursalConstantesFunciones.CLASSNAME)) {
				bodegasucursalBeanSwingJInternalFrame=new BodegaSucursalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =bodegasucursalBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(CargoInvenConstantesFunciones.CLASSNAME)) {
				cargoinvenBeanSwingJInternalFrame=new CargoInvenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cargoinvenBeanSwingJInternalFrame;
			}

			

			else if(strPantalla.equals(ConversionInvenConstantesFunciones.CLASSNAME)) {
				conversioninvenBeanSwingJInternalFrame=new ConversionInvenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =conversioninvenBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(DefinicionConstantesFunciones.CLASSNAME)) {
				definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =definicionBeanSwingJInternalFrame;
			}

			

			else if(strPantalla.equals(LineaConstantesFunciones.CLASSNAME)) {
				lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =lineaBeanSwingJInternalFrame;
			}

			

			else if(strPantalla.equals(ParametroInvenConstantesFunciones.CLASSNAME)) {
				parametroinvenBeanSwingJInternalFrame=new ParametroInvenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =parametroinvenBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(PrecioConstantesFunciones.CLASSNAME)) {
				precioBeanSwingJInternalFrame=new PrecioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =precioBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ProductoConstantesFunciones.CLASSNAME)) {
				productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =productoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(SerieProductoConstantesFunciones.CLASSNAME)) {
				serieproductoBeanSwingJInternalFrame=new SerieProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =serieproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(UbicacionProduConstantesFunciones.CLASSNAME)) {
				ubicacionproduBeanSwingJInternalFrame=new UbicacionProduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =ubicacionproduBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(EstadoBodegaProductoConstantesFunciones.CLASSNAME)) {
				estadobodegaproductoBeanSwingJInternalFrame=new EstadoBodegaProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadobodegaproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoConversionInvenConstantesFunciones.CLASSNAME)) {
				tipoconversioninvenBeanSwingJInternalFrame=new TipoConversionInvenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoconversioninvenBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(UbicacionBodeConstantesFunciones.CLASSNAME)) {
				ubicacionbodeBeanSwingJInternalFrame=new UbicacionBodeBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =ubicacionbodeBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(UnidadConstantesFunciones.CLASSNAME)) {
				unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =unidadBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(DefinicionConstantesFunciones.CLASSNAME)) {
				definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =definicionBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(ArancelConstantesFunciones.CLASSNAME)) {
				arancelBeanSwingJInternalFrame=new ArancelBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =arancelBeanSwingJInternalFrame;
			}
			else if(strPantalla.equals(CalidadProductoConstantesFunciones.CLASSNAME)) {
				calidadproductoBeanSwingJInternalFrame=new CalidadProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =calidadproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ControlVehiculoConstantesFunciones.CLASSNAME)) {
				controlvehiculoBeanSwingJInternalFrame=new ControlVehiculoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =controlvehiculoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(EstadoPedidoConstantesFunciones.CLASSNAME)) {
				estadopedidoBeanSwingJInternalFrame=new EstadoPedidoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadopedidoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(NovedadProductoConstantesFunciones.CLASSNAME)) {
				novedadproductoBeanSwingJInternalFrame=new NovedadProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =novedadproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(PrioridadPedidoConstantesFunciones.CLASSNAME)) {
				prioridadpedidoBeanSwingJInternalFrame=new PrioridadPedidoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =prioridadpedidoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(RequisicionConstantesFunciones.CLASSNAME)) {
				requisicionBeanSwingJInternalFrame=new RequisicionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =requisicionBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoProductoServicioConstantesFunciones.CLASSNAME)) {
				tipoproductoservicioBeanSwingJInternalFrame=new TipoProductoServicioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoproductoservicioBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoRequisicionConstantesFunciones.CLASSNAME)) {
				tiporequisicionBeanSwingJInternalFrame=new TipoRequisicionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tiporequisicionBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(EstadoPedidoConstantesFunciones.CLASSNAME)) {
				estadopedidoBeanSwingJInternalFrame=new EstadoPedidoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadopedidoBeanSwingJInternalFrame;
			}
			else if(strPantalla.equals(EstadoServicioConstantesFunciones.CLASSNAME)) {
				estadoservicioBeanSwingJInternalFrame=new EstadoServicioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadoservicioBeanSwingJInternalFrame;
			
			} 

			else if(strPantalla.equals(ServicioConstantesFunciones.CLASSNAME)) {
				servicioBeanSwingJInternalFrame=new ServicioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =servicioBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoPrecioConstantesFunciones.CLASSNAME)) {
				tipoprecioBeanSwingJInternalFrame=new TipoPrecioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoprecioBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(UtilidadProductoConstantesFunciones.CLASSNAME)) {
				utilidadproductoBeanSwingJInternalFrame=new UtilidadProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =utilidadproductoBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(TransaccionConstantesFunciones.CLASSNAME)) {
				transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =transaccionBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(MovimientoInventarioConstantesFunciones.CLASSNAME)) {
				movimientoinventarioBeanSwingJInternalFrame=new MovimientoInventarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =movimientoinventarioBeanSwingJInternalFrame;
				
				//TEST TODOWEB
				/*
				detallemovimientoinventariotodowebBeanSwingJInternalFrame=new DetalleMovimientoInventarioTodoWebBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,false,true);
				jinternalFrame =detallemovimientoinventariotodowebBeanSwingJInternalFrame;
				*/
				
			}  else if(strPantalla.equals(CompraConstantesFunciones.CLASSNAME)) {
				compraBeanSwingJInternalFrame=new CompraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =compraBeanSwingJInternalFrame;
								
			} else if(strPantalla.equals(AutoriConsepConstantesFunciones.CLASSNAME)) {
				autoriconsepBeanSwingJInternalFrame=new AutoriConsepBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =autoriconsepBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(CabeceraSerieConstantesFunciones.CLASSNAME)) {
				cabeceraserieBeanSwingJInternalFrame=new CabeceraSerieBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cabeceraserieBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(CentroCostoValorConstantesFunciones.CLASSNAME)) {
				centrocostovalorBeanSwingJInternalFrame=new CentroCostoValorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =centrocostovalorBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ConversionUnidadConstantesFunciones.CLASSNAME)) {
				conversionunidadBeanSwingJInternalFrame=new ConversionUnidadBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =conversionunidadBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(CuentasContablesLineaProductoConstantesFunciones.CLASSNAME)) {
				cuentascontableslineaproductoBeanSwingJInternalFrame=new CuentasContablesLineaProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cuentascontableslineaproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(DetalleAutoriConsepConstantesFunciones.CLASSNAME)) {
				detalleautoriconsepBeanSwingJInternalFrame=new DetalleAutoriConsepBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =detalleautoriconsepBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(EmbarcadorConstantesFunciones.CLASSNAME)) {
				embarcadorBeanSwingJInternalFrame=new EmbarcadorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =embarcadorBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME)) {
				estadodetalleautoriconsepBeanSwingJInternalFrame=new EstadoDetalleAutoriConsepBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadodetalleautoriconsepBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME)) {
				estadonovedadseguimientoBeanSwingJInternalFrame=new EstadoNovedadSeguimientoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadonovedadseguimientoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(NovedadSeguimientoConstantesFunciones.CLASSNAME)) {
				novedadseguimientoBeanSwingJInternalFrame=new NovedadSeguimientoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =novedadseguimientoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(PresupuestoLineaConstantesFunciones.CLASSNAME)) {
				presupuestolineaBeanSwingJInternalFrame=new PresupuestoLineaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =presupuestolineaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(RecargoCompraConstantesFunciones.CLASSNAME)) {
				recargocompraBeanSwingJInternalFrame=new RecargoCompraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =recargocompraBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoAutoriConsepConstantesFunciones.CLASSNAME)) {
				tipoautoriconsepBeanSwingJInternalFrame=new TipoAutoriConsepBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoautoriconsepBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoDefinicionConstantesFunciones.CLASSNAME)) {
				tipodefinicionBeanSwingJInternalFrame=new TipoDefinicionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipodefinicionBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoServicioConstantesFunciones.CLASSNAME)) {
				tiposervicioBeanSwingJInternalFrame=new TipoServicioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tiposervicioBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(UtilidadTipoPrecioConstantesFunciones.CLASSNAME)) {
				utilidadtipoprecioBeanSwingJInternalFrame=new UtilidadTipoPrecioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =utilidadtipoprecioBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(GrupoColorConstantesFunciones.CLASSNAME)) {
				grupocolorBeanSwingJInternalFrame=new GrupoColorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =grupocolorBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(TransaccionContaConstantesFunciones.CLASSNAME)) {
	    		transaccioncontaBeanSwingJInternalFrame=new TransaccionContaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =transaccioncontaBeanSwingJInternalFrame;
	    	
			} else if(strPantalla.equals(NivelLineaConstantesFunciones.CLASSNAME)) {
				nivellineaBeanSwingJInternalFrame=new NivelLineaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =nivellineaBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(GrupoBodegaConstantesFunciones.CLASSNAME)) {
				grupobodegaBeanSwingJInternalFrame=new GrupoBodegaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =grupobodegaBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(TipoEstadoPedidoConstantesFunciones.CLASSNAME)) {
				tipoestadopedidoBeanSwingJInternalFrame=new TipoEstadoPedidoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoestadopedidoBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(TipoPrioridadPedidoConstantesFunciones.CLASSNAME)) {
				tipoprioridadpedidoBeanSwingJInternalFrame=new TipoPrioridadPedidoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoprioridadpedidoBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(PuertoConstantesFunciones.CLASSNAME)) {
				puertoBeanSwingJInternalFrame=new PuertoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =puertoBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(ParametroCompraConstantesFunciones.CLASSNAME)) {
				parametrocompraBeanSwingJInternalFrame=new ParametroCompraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =parametrocompraBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(TipoCosteoConstantesFunciones.CLASSNAME)) {
				tipocosteoBeanSwingJInternalFrame=new TipoCosteoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipocosteoBeanSwingJInternalFrame;
			}
			 else if(strPantalla.equals(TipoCostoConstantesFunciones.CLASSNAME)) {
					tipocostoBeanSwingJInternalFrame=new TipoCostoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
					jinternalFrame =tipocostoBeanSwingJInternalFrame;
			}
			else if(strPantalla.equals(TipoProductoServicioInvenConstantesFunciones.CLASSNAME)) {
				tipoproductoservicioinvenBeanSwingJInternalFrame=new TipoProductoServicioInvenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoproductoservicioinvenBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(DetallePedidoCompraConstantesFunciones.CLASSNAME)) {
				detallepedidocompraBeanSwingJInternalFrame=new DetallePedidoCompraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =detallepedidocompraBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(PedidoCompraConstantesFunciones.CLASSNAME)) {
				pedidocompraBeanSwingJInternalFrame=new PedidoCompraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =pedidocompraBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(RequisicionCompraConstantesFunciones.CLASSNAME)) {
				requisicioncompraBeanSwingJInternalFrame=new RequisicionCompraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =requisicioncompraBeanSwingJInternalFrame;
			}
			
			else if(strPantalla.equals(DetalleRetencionConstantesFunciones.CLASSNAME)) {
				detalleretencionBeanSwingJInternalFrame=new DetalleRetencionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =detalleretencionBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(EstadoRequisicionConstantesFunciones.CLASSNAME)) {
				estadorequisicionBeanSwingJInternalFrame=new EstadoRequisicionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadorequisicionBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(RequisicionConstantesFunciones.CLASSNAME)) {
				requisicionBeanSwingJInternalFrame=new RequisicionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =requisicionBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoRequisicionConstantesFunciones.CLASSNAME)) {
				tiporequisicionBeanSwingJInternalFrame=new TipoRequisicionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tiporequisicionBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(AntiguedadesInventariosConstantesFunciones.CLASSNAME)) {
				antiguedadesinventariosBeanSwingJInternalFrame=new AntiguedadesInventariosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =antiguedadesinventariosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ConsumosBodegasConstantesFunciones.CLASSNAME)) {
				consumosbodegasBeanSwingJInternalFrame=new ConsumosBodegasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =consumosbodegasBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ConsumosServiciosConstantesFunciones.CLASSNAME)) {
				consumosserviciosBeanSwingJInternalFrame=new ConsumosServiciosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =consumosserviciosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(DisponiblesCostosConstantesFunciones.CLASSNAME)) {
				disponiblescostosBeanSwingJInternalFrame=new DisponiblesCostosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =disponiblescostosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ExistenciasCostosConstantesFunciones.CLASSNAME)) {
				existenciascostosBeanSwingJInternalFrame=new ExistenciasCostosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =existenciascostosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(MovimientosDetalladosConstantesFunciones.CLASSNAME)) {
				movimientosdetalladosBeanSwingJInternalFrame=new MovimientosDetalladosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =movimientosdetalladosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(MovimientosResumidosConstantesFunciones.CLASSNAME)) {
				movimientosresumidosBeanSwingJInternalFrame=new MovimientosResumidosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =movimientosresumidosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(PedidosComprasConstantesFunciones.CLASSNAME)) {
				pedidoscomprasBeanSwingJInternalFrame=new PedidosComprasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =pedidoscomprasBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(PreciosComprasConstantesFunciones.CLASSNAME)) {
				precioscomprasBeanSwingJInternalFrame=new PreciosComprasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =precioscomprasBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ProductosBodegasConstantesFunciones.CLASSNAME)) {
				productosbodegasBeanSwingJInternalFrame=new ProductosBodegasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =productosbodegasBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME)) {
				productosserviciosdisponiblesBeanSwingJInternalFrame=new ProductosServiciosDisponiblesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =productosserviciosdisponiblesBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ProductosServiciosExistenciasConstantesFunciones.CLASSNAME)) {
				productosserviciosexistenciasBeanSwingJInternalFrame=new ProductosServiciosExistenciasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =productosserviciosexistenciasBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ProductosServiciosPreciosSinRangosConstantesFunciones.CLASSNAME)) {
				productosserviciospreciossinrangosBeanSwingJInternalFrame=new ProductosServiciosPreciosSinRangosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =productosserviciospreciossinrangosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ProductosServiciosProductosConstantesFunciones.CLASSNAME)) {
				productosserviciosproductosBeanSwingJInternalFrame=new ProductosServiciosProductosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =productosserviciosproductosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TransferenciasResumidosConstantesFunciones.CLASSNAME)) {
				transferenciasresumidosBeanSwingJInternalFrame=new TransferenciasResumidosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =transferenciasresumidosBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(OrdenCompraConstantesFunciones.CLASSNAME)) {
				ordencompraBeanSwingJInternalFrame=new OrdenCompraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =ordencompraBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(TransferenciaConstantesFunciones.CLASSNAME)) {
				transferenciaBeanSwingJInternalFrame=new TransferenciaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =transferenciaBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(ClaseProductoConstantesFunciones.CLASSNAME)) {
				claseproductoBeanSwingJInternalFrame=new ClaseProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =claseproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ColorProductoConstantesFunciones.CLASSNAME)) {
				colorproductoBeanSwingJInternalFrame=new ColorProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =colorproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(EfectoProductoConstantesFunciones.CLASSNAME)) {
				efectoproductoBeanSwingJInternalFrame=new EfectoProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =efectoproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(MarcaProductoConstantesFunciones.CLASSNAME)) {
				marcaproductoBeanSwingJInternalFrame=new MarcaProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =marcaproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(MaterialProductoConstantesFunciones.CLASSNAME)) {
				materialproductoBeanSwingJInternalFrame=new MaterialProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =materialproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ModeloProductoConstantesFunciones.CLASSNAME)) {
				modeloproductoBeanSwingJInternalFrame=new ModeloProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =modeloproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(SegmentoProductoConstantesFunciones.CLASSNAME)) {
				segmentoproductoBeanSwingJInternalFrame=new SegmentoProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =segmentoproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TallaProductoConstantesFunciones.CLASSNAME)) {
				tallaproductoBeanSwingJInternalFrame=new TallaProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tallaproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoProductoConstantesFunciones.CLASSNAME)) {
				tipoproductoBeanSwingJInternalFrame=new TipoProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoproductoBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(ImpuestoInvenConstantesFunciones.CLASSNAME)) {
				impuestoinvenBeanSwingJInternalFrame=new ImpuestoInvenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =impuestoinvenBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(VendedorConstantesFunciones.CLASSNAME)) {
				vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =vendedorBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(AsientoContableConstantesFunciones.CLASSNAME)) {
				asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =asientocontableBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(ModificacionLineasProductosConstantesFunciones.CLASSNAME)) {
				modificacionlineasproductosBeanSwingJInternalFrame=new ModificacionLineasProductosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =modificacionlineasproductosBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(PlaneacionCompraConstantesFunciones.CLASSNAME)) {
				planeacioncompraBeanSwingJInternalFrame=new PlaneacionCompraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =planeacioncompraBeanSwingJInternalFrame;
			
			} 	else if(strPantalla.equals(AutorizarRequisicionesConstantesFunciones.CLASSNAME)) {
				autorizarrequisicionesBeanSwingJInternalFrame=new AutorizarRequisicionesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =autorizarrequisicionesBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ConteosFisicosConstantesFunciones.CLASSNAME)) {
				conteosfisicosBeanSwingJInternalFrame=new ConteosFisicosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =conteosfisicosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(DemandaProductosConstantesFunciones.CLASSNAME)) {
				demandaproductosBeanSwingJInternalFrame=new DemandaProductosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =demandaproductosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(DiferenciasFisicasProductosConstantesFunciones.CLASSNAME)) {
				diferenciasfisicasproductosBeanSwingJInternalFrame=new DiferenciasFisicasProductosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =diferenciasfisicasproductosBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(ExistenciasDisponiblesConstantesFunciones.CLASSNAME)) {
				existenciasdisponiblesBeanSwingJInternalFrame=new ExistenciasDisponiblesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =existenciasdisponiblesBeanSwingJInternalFrame;
			} else if(strPantalla.equals(ProcesoCodigosAlternosConstantesFunciones.CLASSNAME)) {
				procesocodigosalternosBeanSwingJInternalFrame=new ProcesoCodigosAlternosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =procesocodigosalternosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME)) {
				procesocrearetiquetascodigobarrasBeanSwingJInternalFrame=new ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =procesocrearetiquetascodigobarrasBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME)) {
				procesocrearetiquetasproductosBeanSwingJInternalFrame=new ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =procesocrearetiquetasproductosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ProcesoGenerarSaldosConstantesFunciones.CLASSNAME)) {
				procesogenerarsaldosBeanSwingJInternalFrame=new ProcesoGenerarSaldosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =procesogenerarsaldosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ProcesoPreciosFactorConstantesFunciones.CLASSNAME)) {
				procesopreciosfactorBeanSwingJInternalFrame=new ProcesoPreciosFactorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =procesopreciosfactorBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ProcesoPreciosPorcentajeConstantesFunciones.CLASSNAME)) {
				procesopreciosporcentajeBeanSwingJInternalFrame=new ProcesoPreciosPorcentajeBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =procesopreciosporcentajeBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(TipoFormaPagoConstantesFunciones.CLASSNAME)) {
				tipoformapagoBeanSwingJInternalFrame=new TipoFormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoformapagoBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(MensajeCorreoInvenConstantesFunciones.CLASSNAME)) {
				mensajecorreoinvenBeanSwingJInternalFrame=new MensajeCorreoInvenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =mensajecorreoinvenBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME)) {
				tipomensajecorreoinvenBeanSwingJInternalFrame=new TipoMensajeCorreoInvenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipomensajecorreoinvenBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(ParametroInventarioDefectoConstantesFunciones.CLASSNAME)) {
				parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =parametroinventariodefectoBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(TipoUnidadConstantesFunciones.CLASSNAME)) {
				tipounidadBeanSwingJInternalFrame=new TipoUnidadBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipounidadBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(TipoCosteoDefinicionConstantesFunciones.CLASSNAME)) {
				tipocosteodefinicionBeanSwingJInternalFrame=new TipoCosteoDefinicionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipocosteodefinicionBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoCostoDefinicionConstantesFunciones.CLASSNAME)) {
				tipocostodefinicionBeanSwingJInternalFrame=new TipoCostoDefinicionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipocostodefinicionBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoIvaItemConstantesFunciones.CLASSNAME)) {
				tipoivaitemBeanSwingJInternalFrame=new TipoIvaItemBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoivaitemBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoViaTransporteConstantesFunciones.CLASSNAME)) {
				tipoviatransporteBeanSwingJInternalFrame=new TipoViaTransporteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoviatransporteBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(TipoGlobalClienteConstantesFunciones.CLASSNAME)) {
				tipoglobalclienteBeanSwingJInternalFrame=new TipoGlobalClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoglobalclienteBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(TipoDetalleMovimientoInventarioConstantesFunciones.CLASSNAME)) {
				tipodetallemovimientoinventarioBeanSwingJInternalFrame=new TipoDetalleMovimientoInventarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipodetallemovimientoinventarioBeanSwingJInternalFrame;
			}		 					
		}
			
    	return jinternalFrame;
	}
}
