package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JDesktopPane;

import com.bydan.erp.seguridad.business.entity.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.ComprobantesAnuladosBeanSwingJInternalFrame;
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
import com.bydan.erp.tesoreria.util.report.ComprobantesAnuladosConstantesFunciones;
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
public class MainJFrameImportaciones {
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
   	

	//IMPORTACIONES
	ContenedorBeanSwingJInternalFrame contenedorBeanSwingJInternalFrame=null;
	CostoGastoImporBeanSwingJInternalFrame costogastoimporBeanSwingJInternalFrame=null;
	DetalleLiquidacionImporBeanSwingJInternalFrame detalleliquidacionimporBeanSwingJInternalFrame=null;
	DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame detalleliquidacionimpuestoimporBeanSwingJInternalFrame=null;
	DetallePedidoCompraImporBeanSwingJInternalFrame detallepedidocompraimporBeanSwingJInternalFrame=null;
	EstadoPedidoCompraBeanSwingJInternalFrame estadopedidocompraBeanSwingJInternalFrame=null;
	LiquidacionImporBeanSwingJInternalFrame liquidacionimporBeanSwingJInternalFrame=null;
	LiquidacionImpuestoImporBeanSwingJInternalFrame liquidacionimpuestoimporBeanSwingJInternalFrame=null;
	ParametroImporBeanSwingJInternalFrame parametroimporBeanSwingJInternalFrame=null;
	PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrame=null;
	TipoCostoGastoImporBeanSwingJInternalFrame tipocostogastoimporBeanSwingJInternalFrame=null;
	TipoProrrateoImporBeanSwingJInternalFrame tipoprorrateoimporBeanSwingJInternalFrame=null;
	TipoPuertoBeanSwingJInternalFrame tipopuertoBeanSwingJInternalFrame=null;
	TipoTerminosImporBeanSwingJInternalFrame tipoterminosimporBeanSwingJInternalFrame=null;
	ValorPorUnidadBeanSwingJInternalFrame valorporunidadBeanSwingJInternalFrame=null;
	BonoEficienciaBeanSwingJInternalFrame bonoeficienciaBeanSwingJInternalFrame=null;
	CentroCostoEstructuraBeanSwingJInternalFrame centrocostoestructuraBeanSwingJInternalFrame=null;
	HistorialPagoMesNomiBeanSwingJInternalFrame historialpagomesnomiBeanSwingJInternalFrame=null;
	HistorialPagoNomiBeanSwingJInternalFrame historialpagonomiBeanSwingJInternalFrame=null;
	RubroEmpleaCuentaContableBeanSwingJInternalFrame rubroempleacuentacontableBeanSwingJInternalFrame=null;
	RubroEstructuraBeanSwingJInternalFrame rubroestructuraBeanSwingJInternalFrame=null;
	TipoPruebaBeanSwingJInternalFrame tipopruebaBeanSwingJInternalFrame=null;
	OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame=null;
	MovimientoInventarioBeanSwingJInternalFrame movimientoinventarioBeanSwingJInternalFrame=null;
	BodegaProductoBeanSwingJInternalFrame bodegaproductoBeanSwingJInternalFrame=null;
	ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;

	DiaFeriadoBeanSwingJInternalFrame diaferiadoBeanSwingJInternalFrame;
	ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame=null;
	EmpleadoEMailBeanSwingJInternalFrame empleadoemailBeanSwingJInternalFrame=null;

	
	
	//RELACIONADOS
	BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	FormaPagoBeanSwingJInternalFrame formapagoBeanSwingJInternalFrame;
	ParametroCarteraBeanSwingJInternalFrame parametrocarteraBeanSwingJInternalFrame;
	AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame;
	ArancelBeanSwingJInternalFrame arancelBeanSwingJInternalFrame;
	PuertoBeanSwingJInternalFrame puertoBeanSwingJInternalFrame;
	EmbarcadorBeanSwingJInternalFrame embarcadorBeanSwingJInternalFrame;
			
		
   	if(strPaquete.equals(Constantes.SMODULO_IMPORTACIONES)) {   		  			    		
	//IMPORTACIONES
		
		if(strPantalla.equals(DiaFeriadoConstantesFunciones.CLASSNAME)) {
			diaferiadoBeanSwingJInternalFrame=new DiaFeriadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =diaferiadoBeanSwingJInternalFrame;
			
		} else if(strPantalla.equals(TipoViaTransporteConstantesFunciones.CLASSNAME)) {
			tipoviatransporteBeanSwingJInternalFrame=new TipoViaTransporteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipoviatransporteBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(ArancelConstantesFunciones.CLASSNAME)) {
			arancelBeanSwingJInternalFrame=new ArancelBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =arancelBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(ClienteConstantesFunciones.CLASSNAME)) {
			clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =clienteBeanSwingJInternalFrame;
			
		} else if(strPantalla.equals(ContenedorConstantesFunciones.CLASSNAME)) {
			contenedorBeanSwingJInternalFrame=new ContenedorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =contenedorBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(CostoGastoImporConstantesFunciones.CLASSNAME)) {
			costogastoimporBeanSwingJInternalFrame=new CostoGastoImporBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =costogastoimporBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(DetalleLiquidacionImporConstantesFunciones.CLASSNAME)) {
			detalleliquidacionimporBeanSwingJInternalFrame=new DetalleLiquidacionImporBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =detalleliquidacionimporBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME)) {
			detalleliquidacionimpuestoimporBeanSwingJInternalFrame=new DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =detalleliquidacionimpuestoimporBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(DetallePedidoCompraImporConstantesFunciones.CLASSNAME)) {
			detallepedidocompraimporBeanSwingJInternalFrame=new DetallePedidoCompraImporBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =detallepedidocompraimporBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(EstadoPedidoCompraConstantesFunciones.CLASSNAME)) {
			estadopedidocompraBeanSwingJInternalFrame=new EstadoPedidoCompraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =estadopedidocompraBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(LiquidacionImporConstantesFunciones.CLASSNAME)) {
			liquidacionimporBeanSwingJInternalFrame=new LiquidacionImporBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =liquidacionimporBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(LiquidacionImpuestoImporConstantesFunciones.CLASSNAME)) {
			liquidacionimpuestoimporBeanSwingJInternalFrame=new LiquidacionImpuestoImporBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =liquidacionimpuestoimporBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(ParametroImporConstantesFunciones.CLASSNAME)) {
			parametroimporBeanSwingJInternalFrame=new ParametroImporBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =parametroimporBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(PedidoCompraImporConstantesFunciones.CLASSNAME)) {
			pedidocompraimporBeanSwingJInternalFrame=new PedidoCompraImporBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =pedidocompraimporBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(PuertoConstantesFunciones.CLASSNAME)) {
			puertoBeanSwingJInternalFrame=new PuertoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =puertoBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TipoCostoGastoImporConstantesFunciones.CLASSNAME)) {
			tipocostogastoimporBeanSwingJInternalFrame=new TipoCostoGastoImporBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipocostogastoimporBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TipoProrrateoImporConstantesFunciones.CLASSNAME)) {
			tipoprorrateoimporBeanSwingJInternalFrame=new TipoProrrateoImporBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipoprorrateoimporBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TipoPuertoConstantesFunciones.CLASSNAME)) {
			tipopuertoBeanSwingJInternalFrame=new TipoPuertoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipopuertoBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TipoTerminosImporConstantesFunciones.CLASSNAME)) {
			tipoterminosimporBeanSwingJInternalFrame=new TipoTerminosImporBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipoterminosimporBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(ValorPorUnidadConstantesFunciones.CLASSNAME)) {
			valorporunidadBeanSwingJInternalFrame=new ValorPorUnidadBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =valorporunidadBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(EmbarcadorConstantesFunciones.CLASSNAME)) {
			embarcadorBeanSwingJInternalFrame=new EmbarcadorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =embarcadorBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(OrdenCompraConstantesFunciones.CLASSNAME)) {
			ordencompraBeanSwingJInternalFrame=new OrdenCompraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =ordencompraBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(MovimientoInventarioConstantesFunciones.CLASSNAME)) {
			movimientoinventarioBeanSwingJInternalFrame=new MovimientoInventarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =movimientoinventarioBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(BodegaProductoConstantesFunciones.CLASSNAME)) {
			bodegaproductoBeanSwingJInternalFrame=new BodegaProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =bodegaproductoBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(ProductoConstantesFunciones.CLASSNAME)) {
			productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =productoBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(EmpresaConstantesFunciones.CLASSNAME)) {
			empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =empresaBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(EmpleadoEMailConstantesFunciones.CLASSNAME)) {
			empleadoemailBeanSwingJInternalFrame=new EmpleadoEMailBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =empleadoemailBeanSwingJInternalFrame;
		}
	} 
		
   		return jinternalFrame;
    }
	
}
