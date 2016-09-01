package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JDesktopPane;

import com.bydan.erp.seguridad.business.entity.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.report.*;
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
import com.bydan.erp.seguridad.util.report.*;

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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.report.ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame;
																		 

@SuppressWarnings("unused")
public class MainJFrameCuentasPorPagar {
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
    	
    	//CARTERA 
		TipoCargoLaboBeanSwingJInternalFrame tipocargolaboBeanSwingJInternalFrame=null;
		BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame=null;
		//ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
		FormaPagoBeanSwingJInternalFrame formapagoBeanSwingJInternalFrame=null;
		ParametroCarteraBeanSwingJInternalFrame parametrocarteraBeanSwingJInternalFrame=null;
		TituloClienteBeanSwingJInternalFrame tituloclienteBeanSwingJInternalFrame=null;
		    			

		
		//CUENTAS_PORPAGAR
		AreaCrBeanSwingJInternalFrame areacrBeanSwingJInternalFrame=null;
		PreguntaEquivalenciaBeanSwingJInternalFrame preguntaequivalenciaBeanSwingJInternalFrame=null;
		PreguntaEvaluacionBeanSwingJInternalFrame preguntaevaluacionBeanSwingJInternalFrame=null;
		RutaBeanSwingJInternalFrame rutaBeanSwingJInternalFrame=null;
		TipoAutoPagoBeanSwingJInternalFrame tipoautopagoBeanSwingJInternalFrame=null;
		TipoFacturaBeanSwingJInternalFrame tipofacturaBeanSwingJInternalFrame=null;
		FacturaProveedorBeanSwingJInternalFrame facturaproveedorBeanSwingJInternalFrame=null;
		ImportarExportarBeanSwingJInternalFrame importarexportarBeanSwingJInternalFrame=null;
		PeriodoImportExportBeanSwingJInternalFrame periodoimportexportBeanSwingJInternalFrame=null;
		TipoIceBeanSwingJInternalFrame tipoiceBeanSwingJInternalFrame=null;
		TipoImportacionBeanSwingJInternalFrame tipoimportacionBeanSwingJInternalFrame=null;
		TipoPlantillaFacturaBeanSwingJInternalFrame tipoplantillafacturaBeanSwingJInternalFrame=null;
		TipoTituloClienteBeanSwingJInternalFrame tipotituloclienteBeanSwingJInternalFrame=null;
		DetalleClienteBeanSwingJInternalFrame detalleclienteBeanSwingJInternalFrame=null;
		ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;

		ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;	
		EstadoClienteBeanSwingJInternalFrame estadoClienteBeanSwingJInternalFrame;
		TipoNivelEduBeanSwingJInternalFrame tipoNivelEduBeanSwingJInternalFrame;
		TipoSexoBeanSwingJInternalFrame tipoSexoBeanSwingJInternalFrame;
		TipoNacionalidadBeanSwingJInternalFrame tipoNacionalidadBeanSwingJInternalFrame;
		EstadoLegalBeanSwingJInternalFrame estadoLegalBeanSwingJInternalFrame;
		GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
		TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
		TipoRetencionFuenteIvaBeanSwingJInternalFrame tiporetencionfuenteivaBeanSwingJInternalFrame;
		AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
		ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame=null;
		RutaTransporteBeanSwingJInternalFrame rutatransporteBeanSwingJInternalFrame=null;
		EstadoPoliticasClienteBeanSwingJInternalFrame estadopoliticasclienteBeanSwingJInternalFrame=null;
		FacturaProveedorServicioBeanSwingJInternalFrame facturaproveedorservicioBeanSwingJInternalFrame=null;
		TipoBancoBeanSwingJInternalFrame tipobancoBeanSwingJInternalFrame=null;

		
		//CUENTAS_PORPAGAR_REPORTES
		ControlProveedoresBeanSwingJInternalFrame controlproveedoresBeanSwingJInternalFrame=null;
		DetalleFacturasProveedoresBeanSwingJInternalFrame detallefacturasproveedoresBeanSwingJInternalFrame=null;
		DetallePagosBeanSwingJInternalFrame detallepagosBeanSwingJInternalFrame=null;
		FacturasProveedoresBeanSwingJInternalFrame facturasproveedoresBeanSwingJInternalFrame=null;
		ListadoClientesBeanSwingJInternalFrame listadoclientesBeanSwingJInternalFrame=null;
		ListadoMovimientosBeanSwingJInternalFrame listadomovimientosBeanSwingJInternalFrame=null;
		PlaneacionPagosBeanSwingJInternalFrame planeacionpagosBeanSwingJInternalFrame=null;
		SaldosVencidosProveedoresBeanSwingJInternalFrame saldosvencidosproveedoresBeanSwingJInternalFrame=null;
		SaldosCuentasPorPagarBeanSwingJInternalFrame saldoscuentasporpagarBeanSwingJInternalFrame=null;


		
		
		//CUENTAS_PORPAGAR_PROCESOS
		//AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=null;
		DetalleProveBeanSwingJInternalFrame detalleproveBeanSwingJInternalFrame=null;
		ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFrame=null;
		RetencionBeanSwingJInternalFrame retencionBeanSwingJInternalFrame=null;
		EvaluacionProveedorBeanSwingJInternalFrame evaluacionproveedorBeanSwingJInternalFrame=null;

		
		if(strPaquete.equals(Constantes.SMODULO_CUENTAS_PORPAGAR)) {
			//CUENTAS POR PAGAR (VALIDAR)
			if(strPantalla.equals(TipoCargoLaboConstantesFunciones.CLASSNAME)) {
	    		tipocargolaboBeanSwingJInternalFrame=new TipoCargoLaboBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipocargolaboBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TituloClienteConstantesFunciones.CLASSNAME)) {
	    		tituloclienteBeanSwingJInternalFrame=new TituloClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tituloclienteBeanSwingJInternalFrame;
	    	
	    	} else  if(strPantalla.equals(ClienteConstantesFunciones.CLASSNAME)) {  
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
	    		EstadoCivilBeanSwingJInternalFrame estadoCivilBeanSwingJInternalFrame = new EstadoCivilBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
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
	    		CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame = new CuentaBancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cuentabancoBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME)) {
	    		tiporetencionfuenteivaBeanSwingJInternalFrame=new TipoRetencionFuenteIvaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tiporetencionfuenteivaBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TipoBancoRetencionConstantesFunciones.CLASSNAME)) {
	    		TipoBancoRetencionBeanSwingJInternalFrame tipobancoretencionBeanSwingJInternalFrame = new TipoBancoRetencionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipobancoretencionBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(FormaPagoConstantesFunciones.CLASSNAME)) {
	    		formapagoBeanSwingJInternalFrame=new FormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =formapagoBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(ParametroCarteraConstantesFunciones.CLASSNAME)) {
	    		parametrocarteraBeanSwingJInternalFrame=new ParametroCarteraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametrocarteraBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(PresupuestoFlujoCajaConstantesFunciones.CLASSNAME)) {
	    		PresupuestoFlujoCajaBeanSwingJInternalFrame presupuestoflujocajaBeanSwingJInternalFrame = new PresupuestoFlujoCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =presupuestoflujocajaBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(EstadoCuentaBancoConstantesFunciones.CLASSNAME)) {
	    		EstadoCuentaBancoBeanSwingJInternalFrame estadocuentabancoBeanSwingJInternalFrame = new EstadoCuentaBancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =estadocuentabancoBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(AsientoContableConstantesFunciones.CLASSNAME+"Diario")) {
	    		asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =asientocontableBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(AsientoContableConstantesFunciones.CLASSNAME)) {
	    		asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =asientocontableBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(AreaCrConstantesFunciones.CLASSNAME)) {
	    		areacrBeanSwingJInternalFrame=new AreaCrBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =areacrBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(PreguntaEquivalenciaConstantesFunciones.CLASSNAME)) {
	    		preguntaequivalenciaBeanSwingJInternalFrame=new PreguntaEquivalenciaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =preguntaequivalenciaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(PreguntaEvaluacionConstantesFunciones.CLASSNAME)) {
	    		preguntaevaluacionBeanSwingJInternalFrame=new PreguntaEvaluacionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =preguntaevaluacionBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(RutaConstantesFunciones.CLASSNAME)) {
	    		rutaBeanSwingJInternalFrame=new RutaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =rutaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoAutoPagoConstantesFunciones.CLASSNAME)) {
	    		tipoautopagoBeanSwingJInternalFrame=new TipoAutoPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoautopagoBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoFacturaConstantesFunciones.CLASSNAME)) {
	    		tipofacturaBeanSwingJInternalFrame=new TipoFacturaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipofacturaBeanSwingJInternalFrame;
	    	} else if(strPantalla.equals(FacturaProveedorConstantesFunciones.CLASSNAME)) {
	    		facturaproveedorBeanSwingJInternalFrame=new FacturaProveedorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =facturaproveedorBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ImportarExportarConstantesFunciones.CLASSNAME)) {
	    		importarexportarBeanSwingJInternalFrame=new ImportarExportarBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =importarexportarBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(PeriodoImportExportConstantesFunciones.CLASSNAME)) {
	    		periodoimportexportBeanSwingJInternalFrame=new PeriodoImportExportBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =periodoimportexportBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoIceConstantesFunciones.CLASSNAME)) {
	    		tipoiceBeanSwingJInternalFrame=new TipoIceBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoiceBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoImportacionConstantesFunciones.CLASSNAME)) {
	    		tipoimportacionBeanSwingJInternalFrame=new TipoImportacionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoimportacionBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoPlantillaFacturaConstantesFunciones.CLASSNAME)) {
	    		tipoplantillafacturaBeanSwingJInternalFrame=new TipoPlantillaFacturaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoplantillafacturaBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TipoTituloClienteConstantesFunciones.CLASSNAME)) {
	    		tipotituloclienteBeanSwingJInternalFrame=new TipoTituloClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipotituloclienteBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoFormaPagoConstantesFunciones.CLASSNAME)) {
	    		TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame = new TipoFormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoformapagoBeanSwingJInternalFrame;
	    	} else if(strPantalla.equals(ControlProveedoresConstantesFunciones.CLASSNAME)) {
	    		controlproveedoresBeanSwingJInternalFrame=new ControlProveedoresBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =controlproveedoresBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(DetalleFacturasProveedoresConstantesFunciones.CLASSNAME)) {
	    		detallefacturasproveedoresBeanSwingJInternalFrame=new DetalleFacturasProveedoresBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =detallefacturasproveedoresBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(DetallePagosConstantesFunciones.CLASSNAME)) {
	    		detallepagosBeanSwingJInternalFrame=new DetallePagosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =detallepagosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(FacturasProveedoresConstantesFunciones.CLASSNAME)) {
	    		facturasproveedoresBeanSwingJInternalFrame=new FacturasProveedoresBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =facturasproveedoresBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ListadoClientesConstantesFunciones.CLASSNAME)) {
	    		listadoclientesBeanSwingJInternalFrame=new ListadoClientesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =listadoclientesBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ListadoMovimientosConstantesFunciones.CLASSNAME)) {
	    		listadomovimientosBeanSwingJInternalFrame=new ListadoMovimientosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =listadomovimientosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(PlaneacionPagosConstantesFunciones.CLASSNAME)) {
	    		planeacionpagosBeanSwingJInternalFrame=new PlaneacionPagosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =planeacionpagosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(SaldosVencidosProveedoresConstantesFunciones.CLASSNAME)) {
	    		saldosvencidosproveedoresBeanSwingJInternalFrame=new SaldosVencidosProveedoresBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =saldosvencidosproveedoresBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(SaldosCuentasPorPagarConstantesFunciones.CLASSNAME)) {
	    		saldoscuentasporpagarBeanSwingJInternalFrame=new SaldosCuentasPorPagarBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =saldoscuentasporpagarBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(DetalleProveConstantesFunciones.CLASSNAME)) {
	    		detalleproveBeanSwingJInternalFrame=new DetalleProveBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =detalleproveBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ServicioTransporteConstantesFunciones.CLASSNAME)) {
	    		serviciotransporteBeanSwingJInternalFrame=new ServicioTransporteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =serviciotransporteBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(RetencionConstantesFunciones.CLASSNAME)) {
	    		retencionBeanSwingJInternalFrame=new RetencionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =retencionBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ZonaConstantesFunciones.CLASSNAME)) {
	    		zonaBeanSwingJInternalFrame=new ZonaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =zonaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(EvaluacionProveedorConstantesFunciones.CLASSNAME)) {
	    		evaluacionproveedorBeanSwingJInternalFrame=new EvaluacionProveedorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =evaluacionproveedorBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(RutaTransporteConstantesFunciones.CLASSNAME)) {
	    		rutatransporteBeanSwingJInternalFrame=new RutaTransporteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =rutatransporteBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(DetalleClienteConstantesFunciones.CLASSNAME)) {
	    		detalleclienteBeanSwingJInternalFrame=new DetalleClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =detalleclienteBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ParametroCarteraDefectoConstantesFunciones.CLASSNAME)) {
	    		parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametrocarteradefectoBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(EstadoPoliticasClienteConstantesFunciones.CLASSNAME)) {
	    		estadopoliticasclienteBeanSwingJInternalFrame=new EstadoPoliticasClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =estadopoliticasclienteBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(FacturaProveedorServicioConstantesFunciones.CLASSNAME)) {
	    		facturaproveedorservicioBeanSwingJInternalFrame=new FacturaProveedorServicioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =facturaproveedorservicioBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoBancoConstantesFunciones.CLASSNAME)) {
	    		tipobancoBeanSwingJInternalFrame=new TipoBancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipobancoBeanSwingJInternalFrame;
	    	}		
		}
		
    	return jinternalFrame;
	}
}
