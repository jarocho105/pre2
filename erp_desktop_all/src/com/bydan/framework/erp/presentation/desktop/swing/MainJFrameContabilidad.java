package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JDesktopPane;

import com.bydan.erp.seguridad.business.entity.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
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

//SE DUPLICA
/*ComprobantesAnulados
*/

//import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.*;
//import com.bydan.erp.tesoreria.util.report.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.util.report.*;
import com.bydan.erp.tesoreria.util.*;
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
import com.bydan.framework.erp.util.Constantes2;
import com.bydan.framework.erp.util.Funciones2;
import com.bydan.framework.erp.util.PaginaTipo;

@SuppressWarnings("unused")
public class MainJFrameContabilidad {
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
		
		//CONTABILIDAD
    	
		CentroActividadBeanSwingJInternalFrame centroActividadBeanSwingJInternalFrame=null;
		EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame=null;
		EstadoAsientoContableBeanSwingJInternalFrame estadoAsientoContableBeanSwingJInternalFrame=null;
		EstadoAsientoContableCajaChicaBeanSwingJInternalFrame estadoAsientoContableCajaChicaBeanSwingJInternalFrame=null;
		EstadoPeriodoBeanSwingJInternalFrame estadoPeriodoBeanSwingJInternalFrame=null;
		PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame=null;
		PlantillaFacturaBeanSwingJInternalFrame plantillaFacturaBeanSwingJInternalFrame=null;
		TipoDocumentoBeanSwingJInternalFrame tipoDocumentoBeanSwingJInternalFrame=null;
		TipoCambioBeanSwingJInternalFrame tipoCambioBeanSwingJInternalFrame=null;
		MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame=null;
		ParametroContaBeanSwingJInternalFrame parametroContaBeanSwingJInternalFrame=null;
		ParametroGraficoBeanSwingJInternalFrame parametroGraficoBeanSwingJInternalFrame=null;
		ParametroFormularioIvaBeanSwingJInternalFrame parametroFormularioIvaBeanSwingJInternalFrame=null;
		NivelCuentaContableBeanSwingJInternalFrame nivelCuentaContableBeanSwingJInternalFrame=null;
		NivelCentroCostoBeanSwingJInternalFrame nivelCentroCostoBeanSwingJInternalFrame=null;    		
		SecuencialBeanSwingJInternalFrame secuencialBeanSwingJInternalFrame=null;
		DetalleDocumentoBeanSwingJInternalFrame detalleDocumentoBeanSwingJInternalFrame=null;
		TipoDetalleDocumentoBeanSwingJInternalFrame tipoDetalleDocumentoBeanSwingJInternalFrame=null;
		CuentaContableBeanSwingJInternalFrame cuentaContableBeanSwingJInternalFrame=null;
		TipoMovimientoBeanSwingJInternalFrame tipoMovimientoBeanSwingJInternalFrame=null;
		CentroCostoBeanSwingJInternalFrame centroCostoBeanSwingJInternalFrame=null;
		ResponsableFondoBeanSwingJInternalFrame responsableFondoBeanSwingJInternalFrame=null;
		TipoGastoBeanSwingJInternalFrame tipoGastoBeanSwingJInternalFrame=null;  		
		AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=null;
		AsientoContableCajaChicaBeanSwingJInternalFrame asientocontablecajachicaBeanSwingJInternalFrame=null;   		
		SriBeanSwingJInternalFrame sriBeanSwingJInternalFrame=null;
		TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrame=null;
		TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame=null;
		TipoRetencionIvaBeanSwingJInternalFrame tiporetencionivaBeanSwingJInternalFrame=null;
		TipoTributarioBeanSwingJInternalFrame tipotributarioBeanSwingJInternalFrame=null;
		TransaccionContaBeanSwingJInternalFrame transaccioncontaBeanSwingJInternalFrame=null;
		MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
		
		CuentaFlujoCajaBeanSwingJInternalFrame cuentaflujocajaBeanSwingJInternalFrame=null;
		LineaFlujoCajaBeanSwingJInternalFrame lineaflujocajaBeanSwingJInternalFrame=null;
		ParametroPlanillaBeanSwingJInternalFrame parametroplanillaBeanSwingJInternalFrame=null;
		TipoGrupoFlujoCajaBeanSwingJInternalFrame tipogrupoflujocajaBeanSwingJInternalFrame=null;
		TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame=null;
		TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame=null;
		TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame=null;
		TipoMonedaBeanSwingJInternalFrame tipomonedaBeanSwingJInternalFrame=null;
		TipoLineaFlujoCajaBeanSwingJInternalFrame tipolineaflujocajaBeanSwingJInternalFrame=null;
		TipoFormatoBeanSwingJInternalFrame tipoformatoBeanSwingJInternalFrame=null;
		FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame=null;
		TipoGastoEmpresaBeanSwingJInternalFrame tipogastoempresaBeanSwingJInternalFrame=null;
		TipoFlujoEfectivoBeanSwingJInternalFrame tipoflujoefectivoBeanSwingJInternalFrame=null;
		TipoIntervaloBeanSwingJInternalFrame tipointervaloBeanSwingJInternalFrame=null;
		NivelCuentaBeanSwingJInternalFrame nivelcuentaBeanSwingJInternalFrame=null;
		PresuEstadoBeanSwingJInternalFrame presuestadoBeanSwingJInternalFrame=null;
		PresuProyectoBeanSwingJInternalFrame presuproyectoBeanSwingJInternalFrame=null;
		PresuTipoCuentaProyectoBeanSwingJInternalFrame presutipocuentaproyectoBeanSwingJInternalFrame=null;
		PresuTipoProyectoBeanSwingJInternalFrame presutipoproyectoBeanSwingJInternalFrame=null;
		ParametroContabilidadDefectoBeanSwingJInternalFrame parametrocontabilidaddefectoBeanSwingJInternalFrame=null;
		TipoDescripcionAsientoBeanSwingJInternalFrame tipodescripcionasientoBeanSwingJInternalFrame=null;

    	
		//CONTABILIDAD_REPORTES
    	
		ComprobantesAnuladosBeanSwingJInternalFrame comprobantesanuladosBeanSwingJInternalFrame=null;
		DiarioGeneralBeanSwingJInternalFrame diariogeneralBeanSwingJInternalFrame=null;
		DiariosGeneralesBeanSwingJInternalFrame diariosgeneralesBeanSwingJInternalFrame=null;
		EstadosFlujosCajasBeanSwingJInternalFrame estadosflujoscajasBeanSwingJInternalFrame=null;
		EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame estadosresultadosperdidasgananciasBeanSwingJInternalFrame=null;
		ListadosCentrosActividadesBeanSwingJInternalFrame listadoscentrosactividadesBeanSwingJInternalFrame=null;
		ListadosCentrosCostosBeanSwingJInternalFrame listadoscentroscostosBeanSwingJInternalFrame=null;
		ListadosPlanCuentasBeanSwingJInternalFrame listadosplancuentasBeanSwingJInternalFrame=null;
		MayooresGeneralesBeanSwingJInternalFrame mayooresgeneralesBeanSwingJInternalFrame=null;
		ProcesoCierrePeriodoBeanSwingJInternalFrame procesocierreperiodoBeanSwingJInternalFrame=null;
		ProcesoMayorizarDiarioBeanSwingJInternalFrame procesomayorizardiarioBeanSwingJInternalFrame=null;
		ProcesoTestBeanSwingJInternalFrame procesotestBeanSwingJInternalFrame=null;
		ProcesoTotalizarSaldosBeanSwingJInternalFrame procesototalizarsaldosBeanSwingJInternalFrame=null;
		ReporteTestBeanSwingJInternalFrame reportetestBeanSwingJInternalFrame=null;
		RetencionesPorPagarPorCuentasBeanSwingJInternalFrame retencionesporpagarporcuentasBeanSwingJInternalFrame=null;
		RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame retencionesporpagarporretencionesBeanSwingJInternalFrame=null;
		
		//CONTABILIDAD_PROCESOS
		PresupuestoFlujoCajaBeanSwingJInternalFrame presupuestoflujocajaBeanSwingJInternalFrame=null;
		GrupoParametroFormularioIvaBeanSwingJInternalFrame grupoparametroformularioivaBeanSwingJInternalFrame=null;
		SubGrupoParametroFormularioIvaBeanSwingJInternalFrame subgrupoparametroformularioivaBeanSwingJInternalFrame=null;
		DatoFormularioIvaBeanSwingJInternalFrame datoformularioivaBeanSwingJInternalFrame=null;
		FormularioIvaBeanSwingJInternalFrame formularioivaBeanSwingJInternalFrame=null;
		DatoFormularioRentaBeanSwingJInternalFrame datoformulariorentaBeanSwingJInternalFrame=null;
		FormularioRentaBeanSwingJInternalFrame formulariorentaBeanSwingJInternalFrame=null;
		FormularioRentaExtraBeanSwingJInternalFrame formulariorentaextraBeanSwingJInternalFrame=null;
		ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame procesoasientoinicialejercicioBeanSwingJInternalFrame=null;
		ProcesoCierreEjercicioAnualBeanSwingJInternalFrame procesocierreejercicioanualBeanSwingJInternalFrame=null;
		ProcesoSincronizarSaldosBeanSwingJInternalFrame procesosincronizarsaldosBeanSwingJInternalFrame=null;

		
		if(strPaquete.equals(Constantes.SMODULO_CONTABILIDAD)) {   		  		
    		
			//CONTABILIDAD
			
	    	if(strPantalla.equals(EjercicioConstantesFunciones.CLASSNAME)) {  
	    		ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =ejercicioBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(EstadoAsientoContableConstantesFunciones.CLASSNAME)) {  
	    		estadoAsientoContableBeanSwingJInternalFrame=new EstadoAsientoContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =estadoAsientoContableBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(EstadoAsientoContableCajaChicaConstantesFunciones.CLASSNAME)) {  
	    		estadoAsientoContableCajaChicaBeanSwingJInternalFrame=new EstadoAsientoContableCajaChicaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =estadoAsientoContableCajaChicaBeanSwingJInternalFrame;    		
    			
	    	}  else if(strPantalla.equals(EstadoPeriodoConstantesFunciones.CLASSNAME)) {  
	    		estadoPeriodoBeanSwingJInternalFrame=new EstadoPeriodoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =estadoPeriodoBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(PeriodoConstantesFunciones.CLASSNAME)) {  
	    		periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =periodoBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(PlantillaFacturaConstantesFunciones.CLASSNAME)) {  
	    		plantillaFacturaBeanSwingJInternalFrame=new PlantillaFacturaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =plantillaFacturaBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(TipoCambioConstantesFunciones.CLASSNAME)) {  
	    		tipoCambioBeanSwingJInternalFrame=new TipoCambioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipoCambioBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(TipoDocumentoConstantesFunciones.CLASSNAME)) {  
	    		tipoDocumentoBeanSwingJInternalFrame=new TipoDocumentoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipoDocumentoBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(MonedaConstantesFunciones.CLASSNAME)) {  
	    		monedaBeanSwingJInternalFrame=new MonedaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =monedaBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(ParametroContaConstantesFunciones.CLASSNAME)) {  
	    		parametroContaBeanSwingJInternalFrame=new ParametroContaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =parametroContaBeanSwingJInternalFrame;    		
    			
	    	}  else if(strPantalla.equals(NivelCuentaContableConstantesFunciones.CLASSNAME)) {  
	    		nivelCuentaContableBeanSwingJInternalFrame=new NivelCuentaContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =nivelCuentaContableBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(NivelCentroCostoConstantesFunciones.CLASSNAME)) {  
	    		nivelCentroCostoBeanSwingJInternalFrame=new NivelCentroCostoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =nivelCentroCostoBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(SecuencialConstantesFunciones.CLASSNAME)) {  
	    		secuencialBeanSwingJInternalFrame=new SecuencialBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =secuencialBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(DetalleDocumentoConstantesFunciones.CLASSNAME)) {  
	    		detalleDocumentoBeanSwingJInternalFrame=new DetalleDocumentoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =detalleDocumentoBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(TipoDetalleDocumentoConstantesFunciones.CLASSNAME)) {  
	    		tipoDetalleDocumentoBeanSwingJInternalFrame=new TipoDetalleDocumentoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipoDetalleDocumentoBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(CuentaContableConstantesFunciones.CLASSNAME)) {  
	    		cuentaContableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =cuentaContableBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(TipoMovimientoConstantesFunciones.CLASSNAME)) {  
	    		tipoMovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipoMovimientoBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(CentroCostoConstantesFunciones.CLASSNAME)) {  
	    		centroCostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =centroCostoBeanSwingJInternalFrame;    		
    			
	    	}  else if(strPantalla.equals(CentroActividadConstantesFunciones.CLASSNAME)) {  
	    		centroActividadBeanSwingJInternalFrame=new CentroActividadBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =centroActividadBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(ParametroGraficoConstantesFunciones.CLASSNAME)) {  
	    		parametroGraficoBeanSwingJInternalFrame=new ParametroGraficoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =parametroGraficoBeanSwingJInternalFrame;   		
    			
	    	} else if(strPantalla.equals(ParametroFormularioIvaConstantesFunciones.CLASSNAME)) {  
	    		parametroFormularioIvaBeanSwingJInternalFrame=new ParametroFormularioIvaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =parametroFormularioIvaBeanSwingJInternalFrame;
    			
	    	}  else if(strPantalla.equals(ResponsableFondoConstantesFunciones.CLASSNAME)) {  
	    		responsableFondoBeanSwingJInternalFrame=new ResponsableFondoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =responsableFondoBeanSwingJInternalFrame;
    			
	    	}  else if(strPantalla.equals(TipoGastoConstantesFunciones.CLASSNAME)) {  
	    		tipoGastoBeanSwingJInternalFrame=new TipoGastoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipoGastoBeanSwingJInternalFrame;
    			
	    	} else if(strPantalla.equals(AsientoContableConstantesFunciones.CLASSNAME)) {  
	    		asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =asientocontableBeanSwingJInternalFrame;
    			
	    	} else if(strPantalla.equals(AsientoContableCajaChicaConstantesFunciones.CLASSNAME)) {  
	    		asientocontablecajachicaBeanSwingJInternalFrame=new AsientoContableCajaChicaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);	    			
	    		jinternalFrame =asientocontablecajachicaBeanSwingJInternalFrame;	    			
	    	
	    	} else if(strPantalla.equals(SriConstantesFunciones.CLASSNAME)) {
	    		sriBeanSwingJInternalFrame=new SriBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =sriBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoComprobanteConstantesFunciones.CLASSNAME)) {
	    		tipocomprobanteBeanSwingJInternalFrame=new TipoComprobanteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipocomprobanteBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoIvaConstantesFunciones.CLASSNAME)) {
	    		tipoivaBeanSwingJInternalFrame=new TipoIvaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoivaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoRetencionIvaConstantesFunciones.CLASSNAME)) {
	    		tiporetencionivaBeanSwingJInternalFrame=new TipoRetencionIvaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tiporetencionivaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoTributarioConstantesFunciones.CLASSNAME)) {
	    		tipotributarioBeanSwingJInternalFrame=new TipoTributarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipotributarioBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TransaccionContaConstantesFunciones.CLASSNAME)) {
	    		transaccioncontaBeanSwingJInternalFrame=new TransaccionContaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =transaccioncontaBeanSwingJInternalFrame;
	    	
	    	}  else if(strPantalla.equals(CuentaFlujoCajaConstantesFunciones.CLASSNAME)) {
	    		cuentaflujocajaBeanSwingJInternalFrame=new CuentaFlujoCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cuentaflujocajaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(LineaFlujoCajaConstantesFunciones.CLASSNAME)) {
	    		lineaflujocajaBeanSwingJInternalFrame=new LineaFlujoCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =lineaflujocajaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ParametroPlanillaConstantesFunciones.CLASSNAME)) {
	    		parametroplanillaBeanSwingJInternalFrame=new ParametroPlanillaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametroplanillaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME)) {
	    		tipogrupoflujocajaBeanSwingJInternalFrame=new TipoGrupoFlujoCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipogrupoflujocajaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoMovimientoModuloConstantesFunciones.CLASSNAME)) {
	    		tipomovimientomoduloBeanSwingJInternalFrame=new TipoMovimientoModuloBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipomovimientomoduloBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TipoTransaccionModuloConstantesFunciones.CLASSNAME)) {
	    		tipotransaccionmoduloBeanSwingJInternalFrame=new TipoTransaccionModuloBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipotransaccionmoduloBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TipoRetencionConstantesFunciones.CLASSNAME)) {
	    		tiporetencionBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tiporetencionBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TipoMonedaConstantesFunciones.CLASSNAME)) {
	    		tipomonedaBeanSwingJInternalFrame=new TipoMonedaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipomonedaBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TipoLineaFlujoCajaConstantesFunciones.CLASSNAME)) {
	    		tipolineaflujocajaBeanSwingJInternalFrame=new TipoLineaFlujoCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipolineaflujocajaBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TipoFormatoConstantesFunciones.CLASSNAME)) {
	    		tipoformatoBeanSwingJInternalFrame=new TipoFormatoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoformatoBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(FormatoConstantesFunciones.CLASSNAME)) {
	    		formatoBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =formatoBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoGastoEmpresaConstantesFunciones.CLASSNAME)) {
	    		tipogastoempresaBeanSwingJInternalFrame=new TipoGastoEmpresaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipogastoempresaBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TipoFlujoEfectivoConstantesFunciones.CLASSNAME)) {
	    		tipoflujoefectivoBeanSwingJInternalFrame=new TipoFlujoEfectivoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoflujoefectivoBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TipoIntervaloConstantesFunciones.CLASSNAME)) {
	    		tipointervaloBeanSwingJInternalFrame=new TipoIntervaloBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipointervaloBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(NivelCuentaConstantesFunciones.CLASSNAME)) {
	    		nivelcuentaBeanSwingJInternalFrame=new NivelCuentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =nivelcuentaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(MesConstantesFunciones.CLASSNAME)) {
	    		mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =mesBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(PresuEstadoConstantesFunciones.CLASSNAME)) {
	    		presuestadoBeanSwingJInternalFrame=new PresuEstadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =presuestadoBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(PresuProyectoConstantesFunciones.CLASSNAME)) {
	    		presuproyectoBeanSwingJInternalFrame=new PresuProyectoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =presuproyectoBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME)) {
	    		presutipocuentaproyectoBeanSwingJInternalFrame=new PresuTipoCuentaProyectoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =presutipocuentaproyectoBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(PresuTipoProyectoConstantesFunciones.CLASSNAME)) {
	    		presutipoproyectoBeanSwingJInternalFrame=new PresuTipoProyectoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =presutipoproyectoBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ReporteTestConstantesFunciones.CLASSNAME)) {
	    		reportetestBeanSwingJInternalFrame=new ReporteTestBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =reportetestBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ProcesoTestConstantesFunciones.CLASSNAME)) {
	    		procesotestBeanSwingJInternalFrame=new ProcesoTestBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesotestBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME)) {
	    		procesomayorizardiarioBeanSwingJInternalFrame=new ProcesoMayorizarDiarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesomayorizardiarioBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ProcesoCierrePeriodoConstantesFunciones.CLASSNAME)) {
	    		procesocierreperiodoBeanSwingJInternalFrame=new ProcesoCierrePeriodoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesocierreperiodoBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME)) {
	    		procesototalizarsaldosBeanSwingJInternalFrame=new ProcesoTotalizarSaldosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesototalizarsaldosBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(DiarioGeneralConstantesFunciones.CLASSNAME)) {
	    		diariogeneralBeanSwingJInternalFrame=new DiarioGeneralBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =diariogeneralBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ComprobantesAnuladosConstantesFunciones.CLASSNAME)) {
	    		comprobantesanuladosBeanSwingJInternalFrame=new ComprobantesAnuladosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =comprobantesanuladosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(DiarioGeneralConstantesFunciones.CLASSNAME)) {
	    		diariogeneralBeanSwingJInternalFrame=new DiarioGeneralBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =diariogeneralBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(DiariosGeneralesConstantesFunciones.CLASSNAME)) {
	    		diariosgeneralesBeanSwingJInternalFrame=new DiariosGeneralesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =diariosgeneralesBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(EstadosFlujosCajasConstantesFunciones.CLASSNAME)) {
	    		estadosflujoscajasBeanSwingJInternalFrame=new EstadosFlujosCajasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =estadosflujoscajasBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(EstadosResultadosPerdidasGananciasConstantesFunciones.CLASSNAME)) {
	    		estadosresultadosperdidasgananciasBeanSwingJInternalFrame=new EstadosResultadosPerdidasGananciasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =estadosresultadosperdidasgananciasBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ListadosCentrosActividadesConstantesFunciones.CLASSNAME)) {
	    		listadoscentrosactividadesBeanSwingJInternalFrame=new ListadosCentrosActividadesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =listadoscentrosactividadesBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ListadosCentrosCostosConstantesFunciones.CLASSNAME)) {
	    		listadoscentroscostosBeanSwingJInternalFrame=new ListadosCentrosCostosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =listadoscentroscostosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ListadosPlanCuentasConstantesFunciones.CLASSNAME)) {
	    		listadosplancuentasBeanSwingJInternalFrame=new ListadosPlanCuentasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =listadosplancuentasBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(MayooresGeneralesConstantesFunciones.CLASSNAME)) {
	    		mayooresgeneralesBeanSwingJInternalFrame=new MayooresGeneralesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =mayooresgeneralesBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ProcesoCierrePeriodoConstantesFunciones.CLASSNAME)) {
	    		procesocierreperiodoBeanSwingJInternalFrame=new ProcesoCierrePeriodoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesocierreperiodoBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME)) {
	    		procesomayorizardiarioBeanSwingJInternalFrame=new ProcesoMayorizarDiarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesomayorizardiarioBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ProcesoTestConstantesFunciones.CLASSNAME)) {
	    		procesotestBeanSwingJInternalFrame=new ProcesoTestBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesotestBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME)) {
	    		procesototalizarsaldosBeanSwingJInternalFrame=new ProcesoTotalizarSaldosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesototalizarsaldosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ReporteTestConstantesFunciones.CLASSNAME)) {
	    		reportetestBeanSwingJInternalFrame=new ReporteTestBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =reportetestBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME)) {
	    		retencionesporpagarporcuentasBeanSwingJInternalFrame=new RetencionesPorPagarPorCuentasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =retencionesporpagarporcuentasBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME)) {
	    		retencionesporpagarporretencionesBeanSwingJInternalFrame=new RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =retencionesporpagarporretencionesBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(PresupuestoFlujoCajaConstantesFunciones.CLASSNAME)) {
	    		presupuestoflujocajaBeanSwingJInternalFrame=new PresupuestoFlujoCajaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =presupuestoflujocajaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME)) {
	    		grupoparametroformularioivaBeanSwingJInternalFrame=new GrupoParametroFormularioIvaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =grupoparametroformularioivaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(SubGrupoParametroFormularioIvaConstantesFunciones.CLASSNAME)) {
	    		subgrupoparametroformularioivaBeanSwingJInternalFrame=new SubGrupoParametroFormularioIvaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =subgrupoparametroformularioivaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(DatoFormularioIvaConstantesFunciones.CLASSNAME)) {
	    		datoformularioivaBeanSwingJInternalFrame=new DatoFormularioIvaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =datoformularioivaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(FormularioIvaConstantesFunciones.CLASSNAME)) {
	    		formularioivaBeanSwingJInternalFrame=new FormularioIvaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =formularioivaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(DatoFormularioRentaConstantesFunciones.CLASSNAME)) {
	    		datoformulariorentaBeanSwingJInternalFrame=new DatoFormularioRentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =datoformulariorentaBeanSwingJInternalFrame;
	    	
	    	}  else if(strPantalla.equals(ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME)) {
	    		procesoasientoinicialejercicioBeanSwingJInternalFrame=new ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesoasientoinicialejercicioBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME)) {
	    		procesocierreejercicioanualBeanSwingJInternalFrame=new ProcesoCierreEjercicioAnualBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesocierreejercicioanualBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME)) {
	    		procesosincronizarsaldosBeanSwingJInternalFrame=new ProcesoSincronizarSaldosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesosincronizarsaldosBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ParametroContabilidadDefectoConstantesFunciones.CLASSNAME)) {
	    		parametrocontabilidaddefectoBeanSwingJInternalFrame=new ParametroContabilidadDefectoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametrocontabilidaddefectoBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoDescripcionAsientoConstantesFunciones.CLASSNAME)) {
	    		tipodescripcionasientoBeanSwingJInternalFrame=new TipoDescripcionAsientoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipodescripcionasientoBeanSwingJInternalFrame;
	    	}	  
		}
    	
    	return jinternalFrame;
    }
}
