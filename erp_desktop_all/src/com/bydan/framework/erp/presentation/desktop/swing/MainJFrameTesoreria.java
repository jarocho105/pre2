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
public class MainJFrameTesoreria {
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
   
		

	
	
	//TESORERIA
	ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	EstadoClienteBeanSwingJInternalFrame estadoClienteBeanSwingJInternalFrame=null;
	TipoNivelEduBeanSwingJInternalFrame tipoNivelEduBeanSwingJInternalFrame=null;
	TipoSexoBeanSwingJInternalFrame tipoSexoBeanSwingJInternalFrame=null;
	TipoNacionalidadBeanSwingJInternalFrame tipoNacionalidadBeanSwingJInternalFrame=null;
	EstadoCivilBeanSwingJInternalFrame estadoCivilBeanSwingJInternalFrame=null;
	EstadoLegalBeanSwingJInternalFrame estadoLegalBeanSwingJInternalFrame=null;
	GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame=null;
	CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame=null;
	TipoRetencionFuenteIvaBeanSwingJInternalFrame tiporetencionfuenteivaBeanSwingJInternalFrame=null;
	TipoBancoRetencionBeanSwingJInternalFrame tipobancoretencionBeanSwingJInternalFrame=null;
	PresupuestoFlujoCajaBeanSwingJInternalFrame presupuestoflujocajaBeanSwingJInternalFrame=null;
	EstadoCuentaBancoBeanSwingJInternalFrame estadocuentabancoBeanSwingJInternalFrame=null;
	PresupuestoFlujoCajaTsrBeanSwingJInternalFrame presupuestoflujocajatsrBeanSwingJInternalFrame=null;
	TablaRetencionBeanSwingJInternalFrame tablaretencionBeanSwingJInternalFrame=null;
	TipoCodigoRetencionSriBeanSwingJInternalFrame tipocodigoretencionsriBeanSwingJInternalFrame=null;
	TipoConceptoFlujoCajaBeanSwingJInternalFrame tipoconceptoflujocajaBeanSwingJInternalFrame=null;
	TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrame=null;
	TipoBancoBeanSwingJInternalFrame tipobancoBeanSwingJInternalFrame=null;
	EstadoPagoAutoBeanSwingJInternalFrame estadopagoautoBeanSwingJInternalFrame=null;
	PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFrame=null;
	EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame estadoregistroformapagobancoBeanSwingJInternalFrame=null;
	TipoCuentaBancoBeanSwingJInternalFrame tipocuentabancoBeanSwingJInternalFrame=null;
	TipoProduBancoBeanSwingJInternalFrame tipoprodubancoBeanSwingJInternalFrame=null;
	TipoSectorEconoBeanSwingJInternalFrame tiposectoreconoBeanSwingJInternalFrame=null;
	AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFrame=null;
	RegistroFormaPagoBancoBeanSwingJInternalFrame registroformapagobancoBeanSwingJInternalFrame=null;
	OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame=null;
	AutoriPagoOrdenCompraBeanSwingJInternalFrame autoripagoordencompraBeanSwingJInternalFrame=null;
	ParametroTesoreriaBeanSwingJInternalFrame parametrotesoreriaBeanSwingJInternalFrame=null;
	ParametroTesoreriaDefectoBeanSwingJInternalFrame parametrotesoreriadefectoBeanSwingJInternalFrame=null;
	TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame=null;

	//TESORERIA_REPORTES
	BeneficiariosPagosCobrosBeanSwingJInternalFrame beneficiariospagoscobrosBeanSwingJInternalFrame=null;
	ChequesPagosAutorizadosBeanSwingJInternalFrame chequespagosautorizadosBeanSwingJInternalFrame=null;
	ComparativosFlujosCajaBeanSwingJInternalFrame comparativosflujoscajaBeanSwingJInternalFrame=null;
	ComprobantesAnuladosBeanSwingJInternalFrame comprobantesanuladosBeanSwingJInternalFrame=null;
	ConciliacionesBancariasBeanSwingJInternalFrame conciliacionesbancariasBeanSwingJInternalFrame=null;
	DetallesIngresosFacturasBeanSwingJInternalFrame detallesingresosfacturasBeanSwingJInternalFrame=null;
	HistorialConciliacionesBancariasBeanSwingJInternalFrame historialconciliacionesbancariasBeanSwingJInternalFrame=null;
	ListadosDocumentosBeanSwingJInternalFrame listadosdocumentosBeanSwingJInternalFrame=null;
	PagosAutomaticosBeanSwingJInternalFrame pagosautomaticosBeanSwingJInternalFrame=null;
	PagosAutorizadosBeanSwingJInternalFrame pagosautorizadosBeanSwingJInternalFrame=null;
	PosicionesBancariasBeanSwingJInternalFrame posicionesbancariasBeanSwingJInternalFrame=null;
	PresupuestosFlujosCajaBeanSwingJInternalFrame presupuestosflujoscajaBeanSwingJInternalFrame=null;
	RemesasTransitoBeanSwingJInternalFrame remesastransitoBeanSwingJInternalFrame=null;
	SaldosDiariosBancosBeanSwingJInternalFrame saldosdiariosbancosBeanSwingJInternalFrame=null;
	PagosAutorizadosProcesoBeanSwingJInternalFrame pagosautorizadosprocesoBeanSwingJInternalFrame=null;
	TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame=null;
	TipoCodigoSriBancoBeanSwingJInternalFrame tipocodigosribancoBeanSwingJInternalFrame=null;

	//TESORERIA_PROCESOS
	ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame procesosolicitudesautorizacionesBeanSwingJInternalFrame=null;

	
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
			
	if(strPaquete.equals(Constantes.SMODULO_TESORERIA)) {
		
		//TESORERIA
    	
		if(strPantalla.equals(ClienteConstantesFunciones.CLASSNAME)) {  
    		clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =clienteBeanSwingJInternalFrame;
			
    	} else if(strPantalla.equals(EstadoClienteConstantesFunciones.CLASSNAME)) {  
    		estadoClienteBeanSwingJInternalFrame=new EstadoClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =estadoClienteBeanSwingJInternalFrame;
			
    	} else if(strPantalla.equals(TipoNivelEduConstantesFunciones.CLASSNAME)) {  
    		tipoNivelEduBeanSwingJInternalFrame=new TipoNivelEduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipoNivelEduBeanSwingJInternalFrame;
			
    	} else if(strPantalla.equals(TipoSexoConstantesFunciones.CLASSNAME)) {  
    		tipoSexoBeanSwingJInternalFrame=new TipoSexoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipoSexoBeanSwingJInternalFrame;
			
    	} else if(strPantalla.equals(TipoNacionalidadConstantesFunciones.CLASSNAME)) {  
    		tipoNacionalidadBeanSwingJInternalFrame=new TipoNacionalidadBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipoNacionalidadBeanSwingJInternalFrame;
			
    	} else if(strPantalla.equals(EstadoCivilConstantesFunciones.CLASSNAME)) {  
    		estadoCivilBeanSwingJInternalFrame=new EstadoCivilBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =estadoCivilBeanSwingJInternalFrame;
			
    	} else if(strPantalla.equals(EstadoLegalConstantesFunciones.CLASSNAME)) {  
    		estadoLegalBeanSwingJInternalFrame=new EstadoLegalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =estadoLegalBeanSwingJInternalFrame;
			
    	} else if(strPantalla.equals(GrupoClienteConstantesFunciones.CLASSNAME)) {  
    		grupoclienteBeanSwingJInternalFrame=new GrupoClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =grupoclienteBeanSwingJInternalFrame;
			
    	} else if(strPantalla.equals(TransaccionConstantesFunciones.CLASSNAME)) {  
    		transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =transaccionBeanSwingJInternalFrame;    		
			
    	} else if(strPantalla.equals(BancoConstantesFunciones.CLASSNAME)) {
    		bancoBeanSwingJInternalFrame=new BancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =bancoBeanSwingJInternalFrame;
    		
    	} else if(strPantalla.equals(FormaPagoConstantesFunciones.CLASSNAME)) {
    		formapagoBeanSwingJInternalFrame=new FormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =formapagoBeanSwingJInternalFrame;
    		
    	} else if(strPantalla.equals(CuentaBancoConstantesFunciones.CLASSNAME)) {
    		cuentabancoBeanSwingJInternalFrame=new CuentaBancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =cuentabancoBeanSwingJInternalFrame;
    		
    	} else if(strPantalla.equals(TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME)) {
    		tiporetencionfuenteivaBeanSwingJInternalFrame=new TipoRetencionFuenteIvaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tiporetencionfuenteivaBeanSwingJInternalFrame;
    		
    	} else if(strPantalla.equals(TipoBancoRetencionConstantesFunciones.CLASSNAME)) {
    		tipobancoretencionBeanSwingJInternalFrame=new TipoBancoRetencionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipobancoretencionBeanSwingJInternalFrame;
    		
    	} else if(strPantalla.equals(FormaPagoConstantesFunciones.CLASSNAME)) {
    		formapagoBeanSwingJInternalFrame=new FormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =formapagoBeanSwingJInternalFrame;
    		
    	} else if(strPantalla.equals(ParametroCarteraConstantesFunciones.CLASSNAME)) {
    		parametrocarteraBeanSwingJInternalFrame=new ParametroCarteraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =parametrocarteraBeanSwingJInternalFrame;
    		
    	} else if(strPantalla.equals(PresupuestoFlujoCajaConstantesFunciones.CLASSNAME)) {
    		presupuestoflujocajaBeanSwingJInternalFrame=new PresupuestoFlujoCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =presupuestoflujocajaBeanSwingJInternalFrame;
    		
    	} else if(strPantalla.equals(EstadoCuentaBancoConstantesFunciones.CLASSNAME)) {
    		estadocuentabancoBeanSwingJInternalFrame=new EstadoCuentaBancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =estadocuentabancoBeanSwingJInternalFrame;
    		
    	}  else if(strPantalla.equals(AsientoContableConstantesFunciones.CLASSNAME+"Diario")) {
    		asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =asientocontableBeanSwingJInternalFrame;
    		
    	} else if(strPantalla.equals(PresupuestoFlujoCajaTsrConstantesFunciones.CLASSNAME)) {
    		presupuestoflujocajatsrBeanSwingJInternalFrame=new PresupuestoFlujoCajaTsrBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =presupuestoflujocajatsrBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TablaRetencionConstantesFunciones.CLASSNAME)) {
    		tablaretencionBeanSwingJInternalFrame=new TablaRetencionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tablaretencionBeanSwingJInternalFrame;
    	}

    	

    	else if(strPantalla.equals(TipoCodigoRetencionSriConstantesFunciones.CLASSNAME)) {
    		tipocodigoretencionsriBeanSwingJInternalFrame=new TipoCodigoRetencionSriBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipocodigoretencionsriBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoConceptoFlujoCajaConstantesFunciones.CLASSNAME)) {
    		tipoconceptoflujocajaBeanSwingJInternalFrame=new TipoConceptoFlujoCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipoconceptoflujocajaBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME)) {
    		tipocuentabancoglobalBeanSwingJInternalFrame=new TipoCuentaBancoGlobalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipocuentabancoglobalBeanSwingJInternalFrame;
    		
    	} else if(strPantalla.equals(TipoBancoConstantesFunciones.CLASSNAME)) {
    		tipobancoBeanSwingJInternalFrame=new TipoBancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipobancoBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(EstadoPagoAutoConstantesFunciones.CLASSNAME)) {
    		estadopagoautoBeanSwingJInternalFrame=new EstadoPagoAutoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =estadopagoautoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(PagoAutoConstantesFunciones.CLASSNAME)) {
    		pagoautoBeanSwingJInternalFrame=new PagoAutoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =pagoautoBeanSwingJInternalFrame;
    	} else if(strPantalla.equals(EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME)) {
    		estadoregistroformapagobancoBeanSwingJInternalFrame=new EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =estadoregistroformapagobancoBeanSwingJInternalFrame;
    	} else if(strPantalla.equals(BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME)) {
		beneficiariospagoscobrosBeanSwingJInternalFrame=new BeneficiariosPagosCobrosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
		jinternalFrame =beneficiariospagoscobrosBeanSwingJInternalFrame;
		}
		
		else if(strPantalla.equals(ChequesPagosAutorizadosConstantesFunciones.CLASSNAME)) {
		chequespagosautorizadosBeanSwingJInternalFrame=new ChequesPagosAutorizadosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
		jinternalFrame =chequespagosautorizadosBeanSwingJInternalFrame;
		}
		
		else if(strPantalla.equals(ComparativosFlujosCajaConstantesFunciones.CLASSNAME)) {
		comparativosflujoscajaBeanSwingJInternalFrame=new ComparativosFlujosCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
		jinternalFrame =comparativosflujoscajaBeanSwingJInternalFrame;
		}
		
		else if(strPantalla.equals(ComprobantesAnuladosConstantesFunciones.CLASSNAME)) {
		comprobantesanuladosBeanSwingJInternalFrame=new ComprobantesAnuladosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
		jinternalFrame =comprobantesanuladosBeanSwingJInternalFrame;
		}
		
		else if(strPantalla.equals(ConciliacionesBancariasConstantesFunciones.CLASSNAME)) {
		conciliacionesbancariasBeanSwingJInternalFrame=new ConciliacionesBancariasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
		jinternalFrame =conciliacionesbancariasBeanSwingJInternalFrame;
		}
		
		else if(strPantalla.equals(DetallesIngresosFacturasConstantesFunciones.CLASSNAME)) {
		detallesingresosfacturasBeanSwingJInternalFrame=new DetallesIngresosFacturasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
		jinternalFrame =detallesingresosfacturasBeanSwingJInternalFrame;
		}
		
		else if(strPantalla.equals(HistorialConciliacionesBancariasConstantesFunciones.CLASSNAME)) {
		historialconciliacionesbancariasBeanSwingJInternalFrame=new HistorialConciliacionesBancariasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
		jinternalFrame =historialconciliacionesbancariasBeanSwingJInternalFrame;
		}
		
		else if(strPantalla.equals(ListadosDocumentosConstantesFunciones.CLASSNAME)) {
		listadosdocumentosBeanSwingJInternalFrame=new ListadosDocumentosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
		jinternalFrame =listadosdocumentosBeanSwingJInternalFrame;
		}
		
		else if(strPantalla.equals(PagosAutomaticosConstantesFunciones.CLASSNAME)) {
		pagosautomaticosBeanSwingJInternalFrame=new PagosAutomaticosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
		jinternalFrame =pagosautomaticosBeanSwingJInternalFrame;
		}
		
		else if(strPantalla.equals(PagosAutorizadosConstantesFunciones.CLASSNAME)) {
		pagosautorizadosBeanSwingJInternalFrame=new PagosAutorizadosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
		jinternalFrame =pagosautorizadosBeanSwingJInternalFrame;
		}
		
		else if(strPantalla.equals(PosicionesBancariasConstantesFunciones.CLASSNAME)) {
		posicionesbancariasBeanSwingJInternalFrame=new PosicionesBancariasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
		jinternalFrame =posicionesbancariasBeanSwingJInternalFrame;
		}
		
		else if(strPantalla.equals(PresupuestosFlujosCajaConstantesFunciones.CLASSNAME)) {
		presupuestosflujoscajaBeanSwingJInternalFrame=new PresupuestosFlujosCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
		jinternalFrame =presupuestosflujoscajaBeanSwingJInternalFrame;
		}
		
		else if(strPantalla.equals(RemesasTransitoConstantesFunciones.CLASSNAME)) {
		remesastransitoBeanSwingJInternalFrame=new RemesasTransitoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
		jinternalFrame =remesastransitoBeanSwingJInternalFrame;
		}
		
		else if(strPantalla.equals(SaldosDiariosBancosConstantesFunciones.CLASSNAME)) {
		saldosdiariosbancosBeanSwingJInternalFrame=new SaldosDiariosBancosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
		jinternalFrame =saldosdiariosbancosBeanSwingJInternalFrame;
		} else if(strPantalla.equals(TipoCuentaBancoConstantesFunciones.CLASSNAME)) {
			tipocuentabancoBeanSwingJInternalFrame=new TipoCuentaBancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipocuentabancoBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TipoProduBancoConstantesFunciones.CLASSNAME)) {
			tipoprodubancoBeanSwingJInternalFrame=new TipoProduBancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipoprodubancoBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TipoSectorEconoConstantesFunciones.CLASSNAME)) {
			tiposectoreconoBeanSwingJInternalFrame=new TipoSectorEconoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tiposectoreconoBeanSwingJInternalFrame;
		
		} 	else if(strPantalla.equals(AsientoContableConstantesFunciones.CLASSNAME)) {
			asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =asientocontableBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(AutoriPagoConstantesFunciones.CLASSNAME)) {
			autoripagoBeanSwingJInternalFrame=new AutoriPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =autoripagoBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(RegistroFormaPagoBancoConstantesFunciones.CLASSNAME)) {
			registroformapagobancoBeanSwingJInternalFrame=new RegistroFormaPagoBancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =registroformapagobancoBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(OrdenCompraConstantesFunciones.CLASSNAME)) {
			ordencompraBeanSwingJInternalFrame=new OrdenCompraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =ordencompraBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(AutoriPagoOrdenCompraConstantesFunciones.CLASSNAME)) {
			autoripagoordencompraBeanSwingJInternalFrame=new AutoriPagoOrdenCompraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =autoripagoordencompraBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(PagosAutorizadosProcesoConstantesFunciones.CLASSNAME)) {
			pagosautorizadosprocesoBeanSwingJInternalFrame=new PagosAutorizadosProcesoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =pagosautorizadosprocesoBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(ProcesoSolicitudesAutorizacionesConstantesFunciones.CLASSNAME)) {
			procesosolicitudesautorizacionesBeanSwingJInternalFrame=new ProcesoSolicitudesAutorizacionesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =procesosolicitudesautorizacionesBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(ParametroTesoreriaConstantesFunciones.CLASSNAME)) {
			parametrotesoreriaBeanSwingJInternalFrame=new ParametroTesoreriaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =parametrotesoreriaBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(TipoFormaPagoConstantesFunciones.CLASSNAME)) {
			tipoformapagoBeanSwingJInternalFrame=new TipoFormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipoformapagoBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(TipoCodigoSriBancoConstantesFunciones.CLASSNAME)) {
			tipocodigosribancoBeanSwingJInternalFrame=new TipoCodigoSriBancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipocodigosribancoBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME)) {
			parametrotesoreriadefectoBeanSwingJInternalFrame=new ParametroTesoreriaDefectoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =parametrotesoreriadefectoBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(TipoRetencionConstantesFunciones.CLASSNAME)) {
			tiporetencionBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tiporetencionBeanSwingJInternalFrame;
		}
	}
		
	return jinternalFrame;
    }
	
}
