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
public class MainJFrameFacturacion {
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
    	
    	//FACTURACION
		CuentaContableTipoBeanSwingJInternalFrame cuentacontabletipoBeanSwingJInternalFrame=null;
		DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFrame=null;
		EspecialidadBeanSwingJInternalFrame especialidadBeanSwingJInternalFrame=null;
		EstadoFisicoFacturaBeanSwingJInternalFrame estadofisicofacturaBeanSwingJInternalFrame=null;
		ParametroProductoBeanSwingJInternalFrame parametroproductoBeanSwingJInternalFrame=null;
		ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame=null;
		TasaBeanSwingJInternalFrame tasaBeanSwingJInternalFrame=null;
		TipoDevolucionBeanSwingJInternalFrame tipodevolucionBeanSwingJInternalFrame=null;
		TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame=null;
		VendedorZonaBeanSwingJInternalFrame vendedorzonaBeanSwingJInternalFrame=null;
		DetaFormaPagoFactuBeanSwingJInternalFrame detaformapagofactuBeanSwingJInternalFrame=null;
		TipoDetaFormaPagoBeanSwingJInternalFrame tipodetaformapagoBeanSwingJInternalFrame=null;
		FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame=null;
		AutoriSriBeanSwingJInternalFrame autorisriBeanSwingJInternalFrame=null;
		SecuencialUsuarioBeanSwingJInternalFrame secuencialusuarioBeanSwingJInternalFrame=null;
		TipoDocumentoGeneralBeanSwingJInternalFrame tipodocumentogeneralBeanSwingJInternalFrame=null;
		VisibleFacturaBeanSwingJInternalFrame visiblefacturaBeanSwingJInternalFrame=null;
		EstadoPedidoBeanSwingJInternalFrame estadopedidoBeanSwingJInternalFrame=null;
		NotaCreditoBeanSwingJInternalFrame notacreditoBeanSwingJInternalFrame=null;
		EmpaqueBeanSwingJInternalFrame empaqueBeanSwingJInternalFrame=null;
		EstadoNotaCreditoBeanSwingJInternalFrame estadonotacreditoBeanSwingJInternalFrame=null;
		TipoDetaNotaCreditoBeanSwingJInternalFrame tipodetanotacreditoBeanSwingJInternalFrame=null;
		TipoCuentaContableTipoBeanSwingJInternalFrame tipocuentacontabletipoBeanSwingJInternalFrame=null;
		CentroCostoGrupoProductoBeanSwingJInternalFrame centrocostogrupoproductoBeanSwingJInternalFrame=null;
		ParametroGenericoBeanSwingJInternalFrame parametrogenericoBeanSwingJInternalFrame=null;
		VendedorVisitaBeanSwingJInternalFrame vendedorvisitaBeanSwingJInternalFrame=null;
		PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame=null;
		EstadoDetallePedidoBeanSwingJInternalFrame estadodetallepedidoBeanSwingJInternalFrame=null;
		TipoGrupoFormaPagoBeanSwingJInternalFrame tipogrupoformapagoBeanSwingJInternalFrame=null;
		TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame=null;
		EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame estadofisicofacturaempresaBeanSwingJInternalFrame=null;
		TipoDevolucionEmpresaBeanSwingJInternalFrame tipodevolucionempresaBeanSwingJInternalFrame=null;
		TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrame=null;
		TipoEstadoPedidoBeanSwingJInternalFrame tipoestadopedidoBeanSwingJInternalFrame=null;
		ParametroFactuEmpresaBeanSwingJInternalFrame parametrofactuempresaBeanSwingJInternalFrame=null;
		ParametroFactuSecuencialBeanSwingJInternalFrame parametrofactusecuencialBeanSwingJInternalFrame=null;
		ParametroFactuTransaccionBeanSwingJInternalFrame parametrofactutransaccionBeanSwingJInternalFrame=null;
		TipoParamFactuPlazoBeanSwingJInternalFrame tipoparamfactuplazoBeanSwingJInternalFrame=null;
		ParametroFactuPrincipalBeanSwingJInternalFrame parametrofactuprincipalBeanSwingJInternalFrame=null;
		LibroContableBeanSwingJInternalFrame librocontableBeanSwingJInternalFrame=null;
		TipoParamFactuDescuentoBeanSwingJInternalFrame tipoparamfactudescuentoBeanSwingJInternalFrame=null;
		TipoParamFactuListadoClienteBeanSwingJInternalFrame tipoparamfactulistadoclienteBeanSwingJInternalFrame=null;
		TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame tipoparamfactusecuenciatrabajoBeanSwingJInternalFrame=null;
		GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame=null;
		PresupuestoVentasBeanSwingJInternalFrame presupuestoventasBeanSwingJInternalFrame=null;
		ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame=null;
		AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=null;
		TipoMensajeCorreoInvenBeanSwingJInternalFrame tipomensajecorreoinvenBeanSwingJInternalFrame=null;
		MensajeCorreoInvenBeanSwingJInternalFrame mensajecorreoinvenBeanSwingJInternalFrame=null;
		ParametroFacturacionDefectoBeanSwingJInternalFrame parametrofacturaciondefectoBeanSwingJInternalFrame=null;
		ConsultorBeanSwingJInternalFrame consultorBeanSwingJInternalFrame=null;
		PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame=null;
		ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame=null;
		TipoLlamadaBeanSwingJInternalFrame tipollamadaBeanSwingJInternalFrame=null;
		TipoNotaCreditoSoliBeanSwingJInternalFrame tiponotacreditosoliBeanSwingJInternalFrame=null;
		ContactoClienteBeanSwingJInternalFrame contactoclienteBeanSwingJInternalFrame=null;

		
		//FACTURACION_REPORTES
		FacturasDescuentosLineasBeanSwingJInternalFrame facturasdescuentoslineasBeanSwingJInternalFrame=null;
		//FacturasGeneralesBeanSwingJInternalFrame facturasgeneralesBeanSwingJInternalFrame=null;
		GuiasRemisionesBeanSwingJInternalFrame guiasremisionesBeanSwingJInternalFrame=null;
		InformesDevolucionesBeanSwingJInternalFrame informesdevolucionesBeanSwingJInternalFrame=null;
		NotasCreditosBeanSwingJInternalFrame notascreditosBeanSwingJInternalFrame=null;
		PedidosBeanSwingJInternalFrame pedidosBeanSwingJInternalFrame=null;
		ProductosMarcasBeanSwingJInternalFrame productosmarcasBeanSwingJInternalFrame=null;
		ProductosPendientesBeanSwingJInternalFrame productospendientesBeanSwingJInternalFrame=null;
		ProductosResumidosBeanSwingJInternalFrame productosresumidosBeanSwingJInternalFrame=null;
		UtilidadesVentasBeanSwingJInternalFrame utilidadesventasBeanSwingJInternalFrame=null;
		VentasCajasResumidosBeanSwingJInternalFrame ventascajasresumidosBeanSwingJInternalFrame=null;
		VentasCanalesBeanSwingJInternalFrame ventascanalesBeanSwingJInternalFrame=null;
		VentasGeneralesBeanSwingJInternalFrame ventasgeneralesBeanSwingJInternalFrame=null;
		VentasLineasBeanSwingJInternalFrame ventaslineasBeanSwingJInternalFrame=null;
		VentasResumidasMontosBeanSwingJInternalFrame ventasresumidasmontosBeanSwingJInternalFrame=null;
		VentasResumidosBeanSwingJInternalFrame ventasresumidosBeanSwingJInternalFrame=null;
		VentasResumidosVentasBeanSwingJInternalFrame ventasresumidosventasBeanSwingJInternalFrame=null;
		VentasVentasNoCerradasBeanSwingJInternalFrame ventasventasnocerradasBeanSwingJInternalFrame=null;
		
		//RELACIONES
		FormaPagoBeanSwingJInternalFrame formapagoBeanSwingJInternalFrame;
		FacturaProveedorBeanSwingJInternalFrame facturaproveedorBeanSwingJInternalFrame;
		TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
		VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
		TransaccionContaBeanSwingJInternalFrame transaccioncontaBeanSwingJInternalFrame;

		//FACTURACION_PROCESOS
		PresupuestoVentasLineasBeanSwingJInternalFrame presupuestoventaslineasBeanSwingJInternalFrame=null;
		NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame=null;
		VigenciaFueBeanSwingJInternalFrame vigenciafueBeanSwingJInternalFrame=null;
		BuscarProductoFacturasBeanSwingJInternalFrame buscarproductofacturasBeanSwingJInternalFrame=null;
		IngresosReferendosBeanSwingJInternalFrame ingresosreferendosBeanSwingJInternalFrame=null;
		ProcesoFacturasProductosBeanSwingJInternalFrame procesofacturasproductosBeanSwingJInternalFrame=null;
		ProcesoPedidosBeanSwingJInternalFrame procesopedidosBeanSwingJInternalFrame=null;
		ProcesoRecibosBeanSwingJInternalFrame procesorecibosBeanSwingJInternalFrame=null;

		
		if(strPaquete.equals(Constantes.SMODULO_FACTURACION)) {
			if(strPantalla.equals(CuentaContableTipoConstantesFunciones.CLASSNAME)) {
				cuentacontabletipoBeanSwingJInternalFrame=new CuentaContableTipoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =cuentacontabletipoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(DetaFormaPagoConstantesFunciones.CLASSNAME)) {
				detaformapagoBeanSwingJInternalFrame=new DetaFormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =detaformapagoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(EspecialidadConstantesFunciones.CLASSNAME)) {
				especialidadBeanSwingJInternalFrame=new EspecialidadBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =especialidadBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(EstadoFisicoFacturaConstantesFunciones.CLASSNAME)) {
				estadofisicofacturaBeanSwingJInternalFrame=new EstadoFisicoFacturaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadofisicofacturaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ParametroProductoConstantesFunciones.CLASSNAME)) {
				parametroproductoBeanSwingJInternalFrame=new ParametroProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =parametroproductoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ResponsableConstantesFunciones.CLASSNAME)) {
				responsableBeanSwingJInternalFrame=new ResponsableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =responsableBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TasaConstantesFunciones.CLASSNAME)) {
				tasaBeanSwingJInternalFrame=new TasaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tasaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoDevolucionConstantesFunciones.CLASSNAME)) {
				tipodevolucionBeanSwingJInternalFrame=new TipoDevolucionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipodevolucionBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TransportistaConstantesFunciones.CLASSNAME)) {
				transportistaBeanSwingJInternalFrame=new TransportistaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =transportistaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(VendedorZonaConstantesFunciones.CLASSNAME)) {
				vendedorzonaBeanSwingJInternalFrame=new VendedorZonaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =vendedorzonaBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(DetaFormaPagoFactuConstantesFunciones.CLASSNAME)) {
				detaformapagofactuBeanSwingJInternalFrame=new DetaFormaPagoFactuBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =detaformapagofactuBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoDetaFormaPagoConstantesFunciones.CLASSNAME)) {
				tipodetaformapagoBeanSwingJInternalFrame=new TipoDetaFormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipodetaformapagoBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(FacturaConstantesFunciones.CLASSNAME)) {
				facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =facturaBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(AutoriSriConstantesFunciones.CLASSNAME)) {
				autorisriBeanSwingJInternalFrame=new AutoriSriBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =autorisriBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(SecuencialUsuarioConstantesFunciones.CLASSNAME)) {
				secuencialusuarioBeanSwingJInternalFrame=new SecuencialUsuarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =secuencialusuarioBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoDocumentoGeneralConstantesFunciones.CLASSNAME)) {
				tipodocumentogeneralBeanSwingJInternalFrame=new TipoDocumentoGeneralBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipodocumentogeneralBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(VisibleFacturaConstantesFunciones.CLASSNAME)) {
				visiblefacturaBeanSwingJInternalFrame=new VisibleFacturaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =visiblefacturaBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(NotaCreditoConstantesFunciones.CLASSNAME)) {
				notacreditoBeanSwingJInternalFrame=new NotaCreditoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =notacreditoBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(EmpaqueConstantesFunciones.CLASSNAME)) {
				empaqueBeanSwingJInternalFrame=new EmpaqueBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =empaqueBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(EstadoNotaCreditoConstantesFunciones.CLASSNAME)) {
				estadonotacreditoBeanSwingJInternalFrame=new EstadoNotaCreditoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadonotacreditoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoDetaNotaCreditoConstantesFunciones.CLASSNAME)) {
				tipodetanotacreditoBeanSwingJInternalFrame=new TipoDetaNotaCreditoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipodetanotacreditoBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(FormaPagoConstantesFunciones.CLASSNAME)) {
	    		formapagoBeanSwingJInternalFrame=new FormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =formapagoBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TipoCuentaContableTipoConstantesFunciones.CLASSNAME)) {
	    		tipocuentacontabletipoBeanSwingJInternalFrame=new TipoCuentaContableTipoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipocuentacontabletipoBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(CentroCostoGrupoProductoConstantesFunciones.CLASSNAME)) {
	    		centrocostogrupoproductoBeanSwingJInternalFrame=new CentroCostoGrupoProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =centrocostogrupoproductoBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ParametroGenericoConstantesFunciones.CLASSNAME)) {
	    		parametrogenericoBeanSwingJInternalFrame=new ParametroGenericoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametrogenericoBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(VendedorVisitaConstantesFunciones.CLASSNAME)) {
	    		vendedorvisitaBeanSwingJInternalFrame=new VendedorVisitaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =vendedorvisitaBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(PedidoConstantesFunciones.CLASSNAME)) {
	    		pedidoBeanSwingJInternalFrame=new PedidoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =pedidoBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(EstadoDetallePedidoConstantesFunciones.CLASSNAME)) {
	    		estadodetallepedidoBeanSwingJInternalFrame=new EstadoDetallePedidoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =estadodetallepedidoBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TipoGrupoFormaPagoConstantesFunciones.CLASSNAME)) {
	    		tipogrupoformapagoBeanSwingJInternalFrame=new TipoGrupoFormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipogrupoformapagoBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoFormaPagoConstantesFunciones.CLASSNAME)) {
	    		tipoformapagoBeanSwingJInternalFrame=new TipoFormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoformapagoBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(EstadoFisicoFacturaEmpresaConstantesFunciones.CLASSNAME)) {
	    		estadofisicofacturaempresaBeanSwingJInternalFrame=new EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =estadofisicofacturaempresaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoDevolucionEmpresaConstantesFunciones.CLASSNAME)) {
	    		tipodevolucionempresaBeanSwingJInternalFrame=new TipoDevolucionEmpresaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipodevolucionempresaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoProductoServicioConstantesFunciones.CLASSNAME)) {
	    		tipoproductoservicioBeanSwingJInternalFrame=new TipoProductoServicioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoproductoservicioBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoEstadoPedidoConstantesFunciones.CLASSNAME)) {
	    		tipoestadopedidoBeanSwingJInternalFrame=new TipoEstadoPedidoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoestadopedidoBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(ParametroFactuEmpresaConstantesFunciones.CLASSNAME)) {
	    		parametrofactuempresaBeanSwingJInternalFrame=new ParametroFactuEmpresaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametrofactuempresaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ParametroFactuSecuencialConstantesFunciones.CLASSNAME)) {
	    		parametrofactusecuencialBeanSwingJInternalFrame=new ParametroFactuSecuencialBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametrofactusecuencialBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ParametroFactuTransaccionConstantesFunciones.CLASSNAME)) {
	    		parametrofactutransaccionBeanSwingJInternalFrame=new ParametroFactuTransaccionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametrofactutransaccionBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoParamFactuPlazoConstantesFunciones.CLASSNAME)) {
	    		tipoparamfactuplazoBeanSwingJInternalFrame=new TipoParamFactuPlazoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoparamfactuplazoBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ParametroFactuPrincipalConstantesFunciones.CLASSNAME)) {
	    		parametrofactuprincipalBeanSwingJInternalFrame=new ParametroFactuPrincipalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametrofactuprincipalBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(LibroContableConstantesFunciones.CLASSNAME)) {
	    		librocontableBeanSwingJInternalFrame=new LibroContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =librocontableBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoParamFactuDescuentoConstantesFunciones.CLASSNAME)) {
	    		tipoparamfactudescuentoBeanSwingJInternalFrame=new TipoParamFactuDescuentoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoparamfactudescuentoBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME)) {
	    		tipoparamfactulistadoclienteBeanSwingJInternalFrame=new TipoParamFactuListadoClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoparamfactulistadoclienteBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME)) {
	    		tipoparamfactusecuenciatrabajoBeanSwingJInternalFrame=new TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoparamfactusecuenciatrabajoBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(FacturaProveedorConstantesFunciones.CLASSNAME)) {
	    		facturaproveedorBeanSwingJInternalFrame=new FacturaProveedorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =facturaproveedorBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(GuiaRemisionConstantesFunciones.CLASSNAME)) {
	    		guiaremisionBeanSwingJInternalFrame=new GuiaRemisionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =guiaremisionBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(PresupuestoVentasConstantesFunciones.CLASSNAME)) {
	    		presupuestoventasBeanSwingJInternalFrame=new PresupuestoVentasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =presupuestoventasBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ProformaConstantesFunciones.CLASSNAME)) {
	    		proformaBeanSwingJInternalFrame=new ProformaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,true,false,true,true);
	    		jinternalFrame =proformaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(FacturasDescuentosLineasConstantesFunciones.CLASSNAME)) {
	    		facturasdescuentoslineasBeanSwingJInternalFrame=new FacturasDescuentosLineasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =facturasdescuentoslineasBeanSwingJInternalFrame;
	    	}
			/*
	    	else if(strPantalla.equals(FacturasGeneralesConstantesFunciones.CLASSNAME)) {
	    		facturasgeneralesBeanSwingJInternalFrame=new FacturasGeneralesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =facturasgeneralesBeanSwingJInternalFrame;
	    	}
			*/
	    	else if(strPantalla.equals(GuiasRemisionesConstantesFunciones.CLASSNAME)) {
	    		guiasremisionesBeanSwingJInternalFrame=new GuiasRemisionesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =guiasremisionesBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(InformesDevolucionesConstantesFunciones.CLASSNAME)) {
	    		informesdevolucionesBeanSwingJInternalFrame=new InformesDevolucionesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =informesdevolucionesBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(NotasCreditosConstantesFunciones.CLASSNAME)) {
	    		notascreditosBeanSwingJInternalFrame=new NotasCreditosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =notascreditosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(PedidosConstantesFunciones.CLASSNAME)) {
	    		pedidosBeanSwingJInternalFrame=new PedidosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =pedidosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ProductosMarcasConstantesFunciones.CLASSNAME)) {
	    		productosmarcasBeanSwingJInternalFrame=new ProductosMarcasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =productosmarcasBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ProductosPendientesConstantesFunciones.CLASSNAME)) {
	    		productospendientesBeanSwingJInternalFrame=new ProductosPendientesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =productospendientesBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ProductosResumidosConstantesFunciones.CLASSNAME)) {
	    		productosresumidosBeanSwingJInternalFrame=new ProductosResumidosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =productosresumidosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(UtilidadesVentasConstantesFunciones.CLASSNAME)) {
	    		utilidadesventasBeanSwingJInternalFrame=new UtilidadesVentasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =utilidadesventasBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(VentasCajasResumidosConstantesFunciones.CLASSNAME)) {
	    		ventascajasresumidosBeanSwingJInternalFrame=new VentasCajasResumidosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =ventascajasresumidosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(VentasCanalesConstantesFunciones.CLASSNAME)) {
	    		ventascanalesBeanSwingJInternalFrame=new VentasCanalesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =ventascanalesBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(VentasGeneralesConstantesFunciones.CLASSNAME)) {
	    		ventasgeneralesBeanSwingJInternalFrame=new VentasGeneralesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =ventasgeneralesBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(VentasLineasConstantesFunciones.CLASSNAME)) {
	    		ventaslineasBeanSwingJInternalFrame=new VentasLineasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =ventaslineasBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(VentasResumidasMontosConstantesFunciones.CLASSNAME)) {
	    		ventasresumidasmontosBeanSwingJInternalFrame=new VentasResumidasMontosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =ventasresumidasmontosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(VentasResumidosConstantesFunciones.CLASSNAME)) {
	    		ventasresumidosBeanSwingJInternalFrame=new VentasResumidosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =ventasresumidosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(VentasResumidosVentasConstantesFunciones.CLASSNAME)) {
	    		ventasresumidosventasBeanSwingJInternalFrame=new VentasResumidosVentasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =ventasresumidosventasBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(VentasVentasNoCerradasConstantesFunciones.CLASSNAME)) {
	    		ventasventasnocerradasBeanSwingJInternalFrame=new VentasVentasNoCerradasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =ventasventasnocerradasBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(AsientoContableConstantesFunciones.CLASSNAME)) {
	    		asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =asientocontableBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(PresupuestoVentasLineasConstantesFunciones.CLASSNAME)) {
	    		presupuestoventaslineasBeanSwingJInternalFrame=new PresupuestoVentasLineasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =presupuestoventaslineasBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(NotaCreditoSoliConstantesFunciones.CLASSNAME)) {
	    		notacreditosoliBeanSwingJInternalFrame=new NotaCreditoSoliBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =notacreditosoliBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(VigenciaFueConstantesFunciones.CLASSNAME)) {
	    		vigenciafueBeanSwingJInternalFrame=new VigenciaFueBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =vigenciafueBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(BuscarProductoFacturasConstantesFunciones.CLASSNAME)) {
	    		buscarproductofacturasBeanSwingJInternalFrame=new BuscarProductoFacturasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =buscarproductofacturasBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(IngresosReferendosConstantesFunciones.CLASSNAME)) {
	    		ingresosreferendosBeanSwingJInternalFrame=new IngresosReferendosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =ingresosreferendosBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ProcesoFacturasProductosConstantesFunciones.CLASSNAME)) {
	    		procesofacturasproductosBeanSwingJInternalFrame=new ProcesoFacturasProductosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesofacturasproductosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ProcesoPedidosConstantesFunciones.CLASSNAME)) {
	    		procesopedidosBeanSwingJInternalFrame=new ProcesoPedidosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesopedidosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ProcesoRecibosConstantesFunciones.CLASSNAME)) {
	    		procesorecibosBeanSwingJInternalFrame=new ProcesoRecibosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesorecibosBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME)) {
	    		tipomensajecorreoinvenBeanSwingJInternalFrame=new TipoMensajeCorreoInvenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipomensajecorreoinvenBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(MensajeCorreoInvenConstantesFunciones.CLASSNAME)) {
	    		mensajecorreoinvenBeanSwingJInternalFrame=new MensajeCorreoInvenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =mensajecorreoinvenBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(EstadoPedidoConstantesFunciones.CLASSNAME)) {
	    		estadopedidoBeanSwingJInternalFrame=new EstadoPedidoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =estadopedidoBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ParametroFacturacionDefectoConstantesFunciones.CLASSNAME)) {
	    		parametrofacturaciondefectoBeanSwingJInternalFrame=new ParametroFacturacionDefectoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametrofacturaciondefectoBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ConsultorConstantesFunciones.CLASSNAME)) {
	    		consultorBeanSwingJInternalFrame=new ConsultorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =consultorBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(PedidoExporConstantesFunciones.CLASSNAME)) {
	    		pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,true,false,true,true);
	    		jinternalFrame =pedidoexporBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ConsignacionConstantesFunciones.CLASSNAME)) {
	    		consignacionBeanSwingJInternalFrame=new ConsignacionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,true,false,true,true);
	    		jinternalFrame =consignacionBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoLlamadaConstantesFunciones.CLASSNAME)) {
	    		tipollamadaBeanSwingJInternalFrame=new TipoLlamadaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipollamadaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoNotaCreditoSoliConstantesFunciones.CLASSNAME)) {
	    		tiponotacreditosoliBeanSwingJInternalFrame=new TipoNotaCreditoSoliBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tiponotacreditosoliBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ContactoClienteConstantesFunciones.CLASSNAME)) {
	    		contactoclienteBeanSwingJInternalFrame=new ContactoClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =contactoclienteBeanSwingJInternalFrame;
	    	}
			
		} 
			
    	return jinternalFrame;
	}
}
