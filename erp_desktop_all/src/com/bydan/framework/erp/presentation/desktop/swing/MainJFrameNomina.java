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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.report.*;
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
import com.bydan.erp.nomina.util.report.*;
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
public class MainJFrameNomina {
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
   
	//NOMINA
	EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;
	EstadoEmpleadoBeanSwingJInternalFrame estadoEmpleadoBeanSwingJInternalFrame=null;
	ReligionBeanSwingJInternalFrame religionBeanSwingJInternalFrame=null;
	DiaFeriadoBeanSwingJInternalFrame diaferiadoBeanSwingJInternalFrame=null;
	AsistenciaDiariaBeanSwingJInternalFrame asistenciadiariaBeanSwingJInternalFrame=null;
	AsistenciaMensualBeanSwingJInternalFrame asistenciamensualBeanSwingJInternalFrame=null;
	BarrioBeanSwingJInternalFrame barrioBeanSwingJInternalFrame=null;
	ConstanteNomiBeanSwingJInternalFrame constantenomiBeanSwingJInternalFrame=null;
	CuotaBeanSwingJInternalFrame cuotaBeanSwingJInternalFrame=null;
	DefiProvisionEmpleadoBeanSwingJInternalFrame defiprovisionempleadoBeanSwingJInternalFrame=null;
	EstadoGastoEmpleadoBeanSwingJInternalFrame estadogastoempleadoBeanSwingJInternalFrame=null;
	EstadoNovedadNomiBeanSwingJInternalFrame estadonovedadnomiBeanSwingJInternalFrame=null;
	EstadoSolicitudNomiBeanSwingJInternalFrame estadosolicitudnomiBeanSwingJInternalFrame=null;
	EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=null;
	GastoEmpleadoBeanSwingJInternalFrame gastoempleadoBeanSwingJInternalFrame=null;
	ImpuestoRentaBeanSwingJInternalFrame impuestorentaBeanSwingJInternalFrame=null;
	NovedadNomiBeanSwingJInternalFrame novedadnomiBeanSwingJInternalFrame=null;
	NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrame=null;
	PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame=null;
	ProvisionEmpleadoBeanSwingJInternalFrame provisionempleadoBeanSwingJInternalFrame=null;
	RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame=null;
	SolicitudHoraExtraBeanSwingJInternalFrame solicitudhoraextraBeanSwingJInternalFrame=null;
	SolicitudReemplazoBeanSwingJInternalFrame solicitudreemplazoBeanSwingJInternalFrame=null;
	SolicitudVacacionBeanSwingJInternalFrame solicitudvacacionBeanSwingJInternalFrame=null;
	TipoCalculoBeanSwingJInternalFrame tipocalculoBeanSwingJInternalFrame=null;
	TipoConstanteNomiBeanSwingJInternalFrame tipoconstantenomiBeanSwingJInternalFrame=null;
	TipoEstructuraBeanSwingJInternalFrame tipoestructuraBeanSwingJInternalFrame=null;
	TipoNovedadNomiBeanSwingJInternalFrame tiponovedadnomiBeanSwingJInternalFrame=null;
	TipoPrestamoBeanSwingJInternalFrame tipoprestamoBeanSwingJInternalFrame=null;
	TipoProvisionEmpleadoBeanSwingJInternalFrame tipoprovisionempleadoBeanSwingJInternalFrame=null;
	TipoRubroEmpleaBeanSwingJInternalFrame tiporubroempleaBeanSwingJInternalFrame=null;
	TipoVariableNomiBeanSwingJInternalFrame tipovariablenomiBeanSwingJInternalFrame=null;
	VariableNomiBeanSwingJInternalFrame variablenomiBeanSwingJInternalFrame=null;
	CargoGrupoBeanSwingJInternalFrame cargogrupoBeanSwingJInternalFrame=null;
	TipoPago_NMBeanSwingJInternalFrame tipopago_nmBeanSwingJInternalFrame=null;
	TipoValorVariableNomiBeanSwingJInternalFrame tipovalorvariablenomiBeanSwingJInternalFrame=null;
	TipoCuotaBeanSwingJInternalFrame tipocuotaBeanSwingJInternalFrame=null;
	EstadoCuotaBeanSwingJInternalFrame estadocuotaBeanSwingJInternalFrame=null;
	EstadoRubroBeanSwingJInternalFrame estadorubroBeanSwingJInternalFrame=null;
	RubroEmpleadoBeanSwingJInternalFrame rubroempleadoBeanSwingJInternalFrame=null;
	CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame=null;
	UtilidadEmpleadoBeanSwingJInternalFrame utilidadempleadoBeanSwingJInternalFrame=null;
	FormularioRenta107BeanSwingJInternalFrame formulariorenta107BeanSwingJInternalFrame=null;
	AsistenciaPorCentroCostoBeanSwingJInternalFrame asistenciaporcentrocostoBeanSwingJInternalFrame=null;

	EstadoCivilBeanSwingJInternalFrame estadoCivilBeanSwingJInternalFrame;
	BonoEficienciaBeanSwingJInternalFrame bonoeficienciaBeanSwingJInternalFrame;
	CentroCostoEstructuraBeanSwingJInternalFrame centrocostoestructuraBeanSwingJInternalFrame;
	HistorialPagoMesNomiBeanSwingJInternalFrame historialpagomesnomiBeanSwingJInternalFrame;
	HistorialPagoNomiBeanSwingJInternalFrame historialpagonomiBeanSwingJInternalFrame;
	RubroEmpleaCuentaContableBeanSwingJInternalFrame rubroempleacuentacontableBeanSwingJInternalFrame;
	RubroEstructuraBeanSwingJInternalFrame rubroestructuraBeanSwingJInternalFrame;
	TipoPruebaBeanSwingJInternalFrame tipopruebaBeanSwingJInternalFrame;
	TipoEmpleadoBeanSwingJInternalFrame tipoempleadoBeanSwingJInternalFrame=null;
	TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrame=null;
	TipoInstruccionBeanSwingJInternalFrame tipoinstruccionBeanSwingJInternalFrame=null;
	TipoCalificacionEmpleadoBeanSwingJInternalFrame tipocalificacionempleadoBeanSwingJInternalFrame=null;
	TipoEvaluacionEmpleadoBeanSwingJInternalFrame tipoevaluacionempleadoBeanSwingJInternalFrame=null;

	FactorNomiBeanSwingJInternalFrame factornomiBeanSwingJInternalFrame=null;
	FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrame=null;
	FormatoNomiFactorNomiBeanSwingJInternalFrame formatonomifactornomiBeanSwingJInternalFrame=null;
	FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame=null;
	PreguntaNomiBeanSwingJInternalFrame preguntanomiBeanSwingJInternalFrame=null;
	PuntajeNomiBeanSwingJInternalFrame puntajenomiBeanSwingJInternalFrame=null;
	EmpleadoImpuestoRentaBeanSwingJInternalFrame empleadoimpuestorentaBeanSwingJInternalFrame=null;
	EmpleadoPagoRubroBeanSwingJInternalFrame empleadopagorubroBeanSwingJInternalFrame=null;
	DetalleEvaluacionNomiBeanSwingJInternalFrame detalleevaluacionnomiBeanSwingJInternalFrame=null;
	EvaluacionNomiBeanSwingJInternalFrame evaluacionnomiBeanSwingJInternalFrame=null;
	EmpleadoProcesoRubroBeanSwingJInternalFrame empleadoprocesorubroBeanSwingJInternalFrame=null;
	BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame bancotipocuentabancoglobalBeanSwingJInternalFrame=null;
	PeriodoAsistenciaBeanSwingJInternalFrame periodoasistenciaBeanSwingJInternalFrame=null;
	ParametroNomiBeanSwingJInternalFrame parametronomiBeanSwingJInternalFrame=null;
	TipoProcesoNominaBeanSwingJInternalFrame tipoprocesonominaBeanSwingJInternalFrame=null;
	TipoBancoDiscoBeanSwingJInternalFrame tipobancodiscoBeanSwingJInternalFrame=null;

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
	TipoCargaFamiBeanSwingJInternalFrame tipocargafamiBeanSwingJInternalFrame=null;
	TipoCursoBeanSwingJInternalFrame tipocursoBeanSwingJInternalFrame=null;
	TipoInstitucionBeanSwingJInternalFrame tipoinstitucionBeanSwingJInternalFrame=null;
	IdiomaBeanSwingJInternalFrame idiomaBeanSwingJInternalFrame=null;
	HobbyBeanSwingJInternalFrame hobbyBeanSwingJInternalFrame=null;
	TipoRasgoPersonalBeanSwingJInternalFrame tiporasgopersonalBeanSwingJInternalFrame=null;
	VestimentaBeanSwingJInternalFrame vestimentaBeanSwingJInternalFrame=null;
	EnfermedadBeanSwingJInternalFrame enfermedadBeanSwingJInternalFrame=null;
	TipoEnfermedadBeanSwingJInternalFrame tipoenfermedadBeanSwingJInternalFrame=null;
	HerramientaBeanSwingJInternalFrame herramientaBeanSwingJInternalFrame=null;
	//EstadoCargoBeanSwingJInternalFrame estadocargoBeanSwingJInternalFrame=null;
	TipoAfiliacionBeanSwingJInternalFrame tipoafiliacionBeanSwingJInternalFrame=null;
	TipoContratoBeanSwingJInternalFrame tipocontratoBeanSwingJInternalFrame=null;
	TipoLibretaMiliBeanSwingJInternalFrame tipolibretamiliBeanSwingJInternalFrame=null;
	TipoSangreBeanSwingJInternalFrame tiposangreBeanSwingJInternalFrame=null;
	TipoDiscapacidadBeanSwingJInternalFrame tipodiscapacidadBeanSwingJInternalFrame=null;

	//NOMINA_REPORTES
	AnticiposBeanSwingJInternalFrame anticiposBeanSwingJInternalFrame=null;
	CreditosDetalladosBeanSwingJInternalFrame creditosdetalladosBeanSwingJInternalFrame=null;
	CreditosPendientesBeanSwingJInternalFrame creditospendientesBeanSwingJInternalFrame=null;
	EvaluacionesBonificacionesBeanSwingJInternalFrame evaluacionesbonificacionesBeanSwingJInternalFrame=null;
	EvaluacionesFactoresBeanSwingJInternalFrame evaluacionesfactoresBeanSwingJInternalFrame=null;
	EvaluacionesPeriodosBeanSwingJInternalFrame evaluacionesperiodosBeanSwingJInternalFrame=null;
	IngresosPromediosBeanSwingJInternalFrame ingresospromediosBeanSwingJInternalFrame=null;
	ListadosFormasPagosBeanSwingJInternalFrame listadosformaspagosBeanSwingJInternalFrame=null;
	RubrosVariablesBeanSwingJInternalFrame rubrosvariablesBeanSwingJInternalFrame=null;

	
	//NOMINA_PROCESOS
	ProcesoCierreMesBeanSwingJInternalFrame procesocierremesBeanSwingJInternalFrame=null;
	ProcesoCierreProvisionBeanSwingJInternalFrame procesocierreprovisionBeanSwingJInternalFrame=null;
	ProcesoGeneraRolesBeanSwingJInternalFrame procesogenerarolesBeanSwingJInternalFrame=null;
	ProcesoImpuestoRentaBeanSwingJInternalFrame procesoimpuestorentaBeanSwingJInternalFrame=null;
	ProcesoLiquidacionBeanSwingJInternalFrame procesoliquidacionBeanSwingJInternalFrame=null;
	ProcesoUtilidadesBeanSwingJInternalFrame procesoutilidadesBeanSwingJInternalFrame=null;
	EvaluacionEmpleadoBeanSwingJInternalFrame evaluacionempleadoBeanSwingJInternalFrame=null;
	VacacionEmpleadoBeanSwingJInternalFrame vacacionempleadoBeanSwingJInternalFrame=null;
	ProcesoIessAportesBeanSwingJInternalFrame procesoiessaportesBeanSwingJInternalFrame=null;
	ProcesoIessFondoReservaBeanSwingJInternalFrame procesoiessfondoreservaBeanSwingJInternalFrame=null;
	ProcesoIessFondoReservaMensualBeanSwingJInternalFrame procesoiessfondoreservamensualBeanSwingJInternalFrame=null;
	PlaniVacacionBeanSwingJInternalFrame planivacacionBeanSwingJInternalFrame=null;
	ProcesoBancoNominaBeanSwingJInternalFrame procesobanconominaBeanSwingJInternalFrame=null;
	GeneraCreditosBeanSwingJInternalFrame generacreditosBeanSwingJInternalFrame=null;

	
	if(strPaquete.equals(Constantes.SMODULO_NOMINA)) {		
    	//NOMINA		
    	if(strPantalla.equals(EmpleadoConstantesFunciones.CLASSNAME)) {  
    		empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =empleadoBeanSwingJInternalFrame;
			
    	} else if(strPantalla.equals(ReligionConstantesFunciones.CLASSNAME)) {  
    		religionBeanSwingJInternalFrame=new ReligionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =religionBeanSwingJInternalFrame;
			
    	} else if(strPantalla.equals(EstadoEmpleadoConstantesFunciones.CLASSNAME)) {  
    		estadoEmpleadoBeanSwingJInternalFrame=new EstadoEmpleadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =estadoEmpleadoBeanSwingJInternalFrame;
			
    	} else if(strPantalla.equals(EstadoCivilConstantesFunciones.CLASSNAME)) {  
    		estadoCivilBeanSwingJInternalFrame=new EstadoCivilBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =estadoCivilBeanSwingJInternalFrame;
			
    	} else if(strPantalla.equals(AsistenciaDiariaConstantesFunciones.CLASSNAME)) {
    		asistenciadiariaBeanSwingJInternalFrame=new AsistenciaDiariaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =asistenciadiariaBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(AsistenciaMensualConstantesFunciones.CLASSNAME)) {
    		asistenciamensualBeanSwingJInternalFrame=new AsistenciaMensualBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =asistenciamensualBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(BancoConstantesFunciones.CLASSNAME)) {
    		bancoBeanSwingJInternalFrame=new BancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =bancoBeanSwingJInternalFrame;
    		
    	} else if(strPantalla.equals(BarrioConstantesFunciones.CLASSNAME)) {
    		barrioBeanSwingJInternalFrame=new BarrioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =barrioBeanSwingJInternalFrame;
    		
    	} else if(strPantalla.equals(ConstanteNomiConstantesFunciones.CLASSNAME)) {
    		constantenomiBeanSwingJInternalFrame=new ConstanteNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =constantenomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(CuotaConstantesFunciones.CLASSNAME)) {
    		cuotaBeanSwingJInternalFrame=new CuotaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =cuotaBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(DefiProvisionEmpleadoConstantesFunciones.CLASSNAME)) {
    		defiprovisionempleadoBeanSwingJInternalFrame=new DefiProvisionEmpleadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =defiprovisionempleadoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(DiaFeriadoConstantesFunciones.CLASSNAME)) {
    		diaferiadoBeanSwingJInternalFrame=new DiaFeriadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =diaferiadoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(EstadoGastoEmpleadoConstantesFunciones.CLASSNAME)) {
    		estadogastoempleadoBeanSwingJInternalFrame=new EstadoGastoEmpleadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =estadogastoempleadoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(EstadoNovedadNomiConstantesFunciones.CLASSNAME)) {
    		estadonovedadnomiBeanSwingJInternalFrame=new EstadoNovedadNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =estadonovedadnomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(EstadoSolicitudNomiConstantesFunciones.CLASSNAME)) {
    		estadosolicitudnomiBeanSwingJInternalFrame=new EstadoSolicitudNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =estadosolicitudnomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(EstructuraConstantesFunciones.CLASSNAME)) {
    		estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =estructuraBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(GastoEmpleadoConstantesFunciones.CLASSNAME)) {
    		gastoempleadoBeanSwingJInternalFrame=new GastoEmpleadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =gastoempleadoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(ImpuestoRentaConstantesFunciones.CLASSNAME)) {
    		impuestorentaBeanSwingJInternalFrame=new ImpuestoRentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =impuestorentaBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(NovedadNomiConstantesFunciones.CLASSNAME)) {
    		novedadnomiBeanSwingJInternalFrame=new NovedadNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =novedadnomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(NumeroPatronalConstantesFunciones.CLASSNAME)) {
    		numeropatronalBeanSwingJInternalFrame=new NumeroPatronalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =numeropatronalBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(PrestamoConstantesFunciones.CLASSNAME)) {
    		prestamoBeanSwingJInternalFrame=new PrestamoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =prestamoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(ProvisionEmpleadoConstantesFunciones.CLASSNAME)) {
    		provisionempleadoBeanSwingJInternalFrame=new ProvisionEmpleadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =provisionempleadoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(RubroEmpleaConstantesFunciones.CLASSNAME)) {
    		rubroempleaBeanSwingJInternalFrame=new RubroEmpleaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =rubroempleaBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(SolicitudHoraExtraConstantesFunciones.CLASSNAME)) {
    		solicitudhoraextraBeanSwingJInternalFrame=new SolicitudHoraExtraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =solicitudhoraextraBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(SolicitudReemplazoConstantesFunciones.CLASSNAME)) {
    		solicitudreemplazoBeanSwingJInternalFrame=new SolicitudReemplazoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =solicitudreemplazoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(SolicitudVacacionConstantesFunciones.CLASSNAME)) {
    		solicitudvacacionBeanSwingJInternalFrame=new SolicitudVacacionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =solicitudvacacionBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoCalculoConstantesFunciones.CLASSNAME)) {
    		tipocalculoBeanSwingJInternalFrame=new TipoCalculoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipocalculoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoConstanteNomiConstantesFunciones.CLASSNAME)) {
    		tipoconstantenomiBeanSwingJInternalFrame=new TipoConstanteNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipoconstantenomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoEstructuraConstantesFunciones.CLASSNAME)) {
    		tipoestructuraBeanSwingJInternalFrame=new TipoEstructuraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipoestructuraBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoNovedadNomiConstantesFunciones.CLASSNAME)) {
    		tiponovedadnomiBeanSwingJInternalFrame=new TipoNovedadNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tiponovedadnomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoPrestamoConstantesFunciones.CLASSNAME)) {
    		tipoprestamoBeanSwingJInternalFrame=new TipoPrestamoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipoprestamoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoProvisionEmpleadoConstantesFunciones.CLASSNAME)) {
    		tipoprovisionempleadoBeanSwingJInternalFrame=new TipoProvisionEmpleadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipoprovisionempleadoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoRubroEmpleaConstantesFunciones.CLASSNAME)) {
    		tiporubroempleaBeanSwingJInternalFrame=new TipoRubroEmpleaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tiporubroempleaBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoVariableNomiConstantesFunciones.CLASSNAME)) {
    		tipovariablenomiBeanSwingJInternalFrame=new TipoVariableNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipovariablenomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(VariableNomiConstantesFunciones.CLASSNAME)) {
    		variablenomiBeanSwingJInternalFrame=new VariableNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =variablenomiBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(CargoGrupoConstantesFunciones.CLASSNAME)) {
    		cargogrupoBeanSwingJInternalFrame=new CargoGrupoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =cargogrupoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoPago_NMConstantesFunciones.CLASSNAME)) {
    		tipopago_nmBeanSwingJInternalFrame=new TipoPago_NMBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipopago_nmBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(TipoValorVariableNomiConstantesFunciones.CLASSNAME)) {
    		tipovalorvariablenomiBeanSwingJInternalFrame=new TipoValorVariableNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipovalorvariablenomiBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(TipoCuotaConstantesFunciones.CLASSNAME)) {
    		tipocuotaBeanSwingJInternalFrame=new TipoCuotaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipocuotaBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(EstadoCuotaConstantesFunciones.CLASSNAME)) {
    		estadocuotaBeanSwingJInternalFrame=new EstadoCuotaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =estadocuotaBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(EstadoRubroConstantesFunciones.CLASSNAME)) {
    		estadorubroBeanSwingJInternalFrame=new EstadoRubroBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =estadorubroBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(RubroEmpleadoConstantesFunciones.CLASSNAME)) {
    		rubroempleadoBeanSwingJInternalFrame=new RubroEmpleadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =rubroempleadoBeanSwingJInternalFrame;
    	} else if(strPantalla.equals(BonoEficienciaConstantesFunciones.CLASSNAME)) {
    		bonoeficienciaBeanSwingJInternalFrame=new BonoEficienciaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =bonoeficienciaBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(CentroCostoEstructuraConstantesFunciones.CLASSNAME)) {
    		centrocostoestructuraBeanSwingJInternalFrame=new CentroCostoEstructuraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =centrocostoestructuraBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(HistorialPagoMesNomiConstantesFunciones.CLASSNAME)) {
    		historialpagomesnomiBeanSwingJInternalFrame=new HistorialPagoMesNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =historialpagomesnomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(HistorialPagoNomiConstantesFunciones.CLASSNAME)) {
    		historialpagonomiBeanSwingJInternalFrame=new HistorialPagoNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =historialpagonomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME)) {
    		rubroempleacuentacontableBeanSwingJInternalFrame=new RubroEmpleaCuentaContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =rubroempleacuentacontableBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(RubroEstructuraConstantesFunciones.CLASSNAME)) {
    		rubroestructuraBeanSwingJInternalFrame=new RubroEstructuraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =rubroestructuraBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoPruebaConstantesFunciones.CLASSNAME)) {
    		tipopruebaBeanSwingJInternalFrame=new TipoPruebaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipopruebaBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(TipoEmpleadoConstantesFunciones.CLASSNAME)) {
    		tipoempleadoBeanSwingJInternalFrame=new TipoEmpleadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipoempleadoBeanSwingJInternalFrame;
    	
    	}  	else if(strPantalla.equals(TipoGeneroConstantesFunciones.CLASSNAME)) {
    		tipogeneroBeanSwingJInternalFrame=new TipoGeneroBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipogeneroBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoInstruccionConstantesFunciones.CLASSNAME)) {
    		tipoinstruccionBeanSwingJInternalFrame=new TipoInstruccionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipoinstruccionBeanSwingJInternalFrame;
    	} else if(strPantalla.equals(FactorNomiConstantesFunciones.CLASSNAME)) {
    		factornomiBeanSwingJInternalFrame=new FactorNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =factornomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(FormatoNomiConstantesFunciones.CLASSNAME)) {
    		formatonomiBeanSwingJInternalFrame=new FormatoNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =formatonomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(FormatoNomiFactorNomiConstantesFunciones.CLASSNAME)) {
    		formatonomifactornomiBeanSwingJInternalFrame=new FormatoNomiFactorNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =formatonomifactornomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME)) {
    		formatonomipreguntanomiBeanSwingJInternalFrame=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =formatonomipreguntanomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(PreguntaNomiConstantesFunciones.CLASSNAME)) {
    		preguntanomiBeanSwingJInternalFrame=new PreguntaNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =preguntanomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(PuntajeNomiConstantesFunciones.CLASSNAME)) {
    		puntajenomiBeanSwingJInternalFrame=new PuntajeNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =puntajenomiBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME)) {
    		empleadoimpuestorentaBeanSwingJInternalFrame=new EmpleadoImpuestoRentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =empleadoimpuestorentaBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(EmpleadoPagoRubroConstantesFunciones.CLASSNAME)) {
    		empleadopagorubroBeanSwingJInternalFrame=new EmpleadoPagoRubroBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =empleadopagorubroBeanSwingJInternalFrame;
    	} else if(strPantalla.equals(DetalleEvaluacionNomiConstantesFunciones.CLASSNAME)) {
    		detalleevaluacionnomiBeanSwingJInternalFrame=new DetalleEvaluacionNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =detalleevaluacionnomiBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(EvaluacionNomiConstantesFunciones.CLASSNAME)) {
    		evaluacionnomiBeanSwingJInternalFrame=new EvaluacionNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =evaluacionnomiBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(EmpleadoProcesoRubroConstantesFunciones.CLASSNAME)) {
    		empleadoprocesorubroBeanSwingJInternalFrame=new EmpleadoProcesoRubroBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =empleadoprocesorubroBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME)) {
    		bancotipocuentabancoglobalBeanSwingJInternalFrame=new BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =bancotipocuentabancoglobalBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(PeriodoAsistenciaConstantesFunciones.CLASSNAME)) {
    		periodoasistenciaBeanSwingJInternalFrame=new PeriodoAsistenciaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =periodoasistenciaBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(ParametroNomiConstantesFunciones.CLASSNAME)) {
    		parametronomiBeanSwingJInternalFrame=new ParametroNomiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =parametronomiBeanSwingJInternalFrame;
    	
    	}  else if(strPantalla.equals(TipoCargaFamiConstantesFunciones.CLASSNAME)) {
    		tipocargafamiBeanSwingJInternalFrame=new TipoCargaFamiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipocargafamiBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(TipoCursoConstantesFunciones.CLASSNAME)) {
    		tipocursoBeanSwingJInternalFrame=new TipoCursoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipocursoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoInstitucionConstantesFunciones.CLASSNAME)) {
    		tipoinstitucionBeanSwingJInternalFrame=new TipoInstitucionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipoinstitucionBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(IdiomaConstantesFunciones.CLASSNAME)) {
    		idiomaBeanSwingJInternalFrame=new IdiomaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =idiomaBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(HobbyConstantesFunciones.CLASSNAME)) {
    		hobbyBeanSwingJInternalFrame=new HobbyBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =hobbyBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(TipoRasgoPersonalConstantesFunciones.CLASSNAME)) {
    		tiporasgopersonalBeanSwingJInternalFrame=new TipoRasgoPersonalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tiporasgopersonalBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(VestimentaConstantesFunciones.CLASSNAME)) {
    		vestimentaBeanSwingJInternalFrame=new VestimentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =vestimentaBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(EnfermedadConstantesFunciones.CLASSNAME)) {
    		enfermedadBeanSwingJInternalFrame=new EnfermedadBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =enfermedadBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoEnfermedadConstantesFunciones.CLASSNAME)) {
    		tipoenfermedadBeanSwingJInternalFrame=new TipoEnfermedadBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipoenfermedadBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(HerramientaConstantesFunciones.CLASSNAME)) {
    		herramientaBeanSwingJInternalFrame=new HerramientaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =herramientaBeanSwingJInternalFrame;
    	
    	}  else if(strPantalla.equals(TipoAfiliacionConstantesFunciones.CLASSNAME)) {
    		tipoafiliacionBeanSwingJInternalFrame=new TipoAfiliacionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipoafiliacionBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoContratoConstantesFunciones.CLASSNAME)) {
    		tipocontratoBeanSwingJInternalFrame=new TipoContratoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipocontratoBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoLibretaMiliConstantesFunciones.CLASSNAME)) {
    		tipolibretamiliBeanSwingJInternalFrame=new TipoLibretaMiliBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipolibretamiliBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(TipoSangreConstantesFunciones.CLASSNAME)) {
    		tiposangreBeanSwingJInternalFrame=new TipoSangreBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tiposangreBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(TipoDiscapacidadConstantesFunciones.CLASSNAME)) {
    		tipodiscapacidadBeanSwingJInternalFrame=new TipoDiscapacidadBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipodiscapacidadBeanSwingJInternalFrame;
    	} else if(strPantalla.equals(ProcesoCierreMesConstantesFunciones.CLASSNAME)) {
    		procesocierremesBeanSwingJInternalFrame=new ProcesoCierreMesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =procesocierremesBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(ProcesoCierreProvisionConstantesFunciones.CLASSNAME)) {
    		procesocierreprovisionBeanSwingJInternalFrame=new ProcesoCierreProvisionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =procesocierreprovisionBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(ProcesoGeneraRolesConstantesFunciones.CLASSNAME)) {
    		procesogenerarolesBeanSwingJInternalFrame=new ProcesoGeneraRolesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =procesogenerarolesBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(ProcesoImpuestoRentaConstantesFunciones.CLASSNAME)) {
    		procesoimpuestorentaBeanSwingJInternalFrame=new ProcesoImpuestoRentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =procesoimpuestorentaBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(ProcesoLiquidacionConstantesFunciones.CLASSNAME)) {
    		procesoliquidacionBeanSwingJInternalFrame=new ProcesoLiquidacionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =procesoliquidacionBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(ProcesoUtilidadesConstantesFunciones.CLASSNAME)) {
    		procesoutilidadesBeanSwingJInternalFrame=new ProcesoUtilidadesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =procesoutilidadesBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(EvaluacionEmpleadoConstantesFunciones.CLASSNAME)) {
    		evaluacionempleadoBeanSwingJInternalFrame=new EvaluacionEmpleadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =evaluacionempleadoBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(VacacionEmpleadoConstantesFunciones.CLASSNAME)) {
    		vacacionempleadoBeanSwingJInternalFrame=new VacacionEmpleadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =vacacionempleadoBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(TipoProcesoNominaConstantesFunciones.CLASSNAME)) {
    		tipoprocesonominaBeanSwingJInternalFrame=new TipoProcesoNominaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipoprocesonominaBeanSwingJInternalFrame;
    	} else if(strPantalla.equals(ProcesoIessAportesConstantesFunciones.CLASSNAME)) {
    		procesoiessaportesBeanSwingJInternalFrame=new ProcesoIessAportesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =procesoiessaportesBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(ProcesoIessFondoReservaConstantesFunciones.CLASSNAME)) {
    		procesoiessfondoreservaBeanSwingJInternalFrame=new ProcesoIessFondoReservaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =procesoiessfondoreservaBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(ProcesoIessFondoReservaMensualConstantesFunciones.CLASSNAME)) {
    		procesoiessfondoreservamensualBeanSwingJInternalFrame=new ProcesoIessFondoReservaMensualBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =procesoiessfondoreservamensualBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(TipoBancoDiscoConstantesFunciones.CLASSNAME)) {
    		tipobancodiscoBeanSwingJInternalFrame=new TipoBancoDiscoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipobancodiscoBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(PlaniVacacionConstantesFunciones.CLASSNAME)) {
    		planivacacionBeanSwingJInternalFrame=new PlaniVacacionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =planivacacionBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(ProcesoBancoNominaConstantesFunciones.CLASSNAME)) {
    		procesobanconominaBeanSwingJInternalFrame=new ProcesoBancoNominaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =procesobanconominaBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(GeneraCreditosConstantesFunciones.CLASSNAME)) {
    		generacreditosBeanSwingJInternalFrame=new GeneraCreditosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =generacreditosBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(CargoConstantesFunciones.CLASSNAME)) {
    		cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =cargoBeanSwingJInternalFrame;
    	} else if(strPantalla.equals(TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME)) {
    		tipocalificacionempleadoBeanSwingJInternalFrame=new TipoCalificacionEmpleadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipocalificacionempleadoBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME)) {
    		tipoevaluacionempleadoBeanSwingJInternalFrame=new TipoEvaluacionEmpleadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =tipoevaluacionempleadoBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(UtilidadEmpleadoConstantesFunciones.CLASSNAME)) {
    		utilidadempleadoBeanSwingJInternalFrame=new UtilidadEmpleadoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =utilidadempleadoBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(FormularioRenta107ConstantesFunciones.CLASSNAME)) {
    		formulariorenta107BeanSwingJInternalFrame=new FormularioRenta107BeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =formulariorenta107BeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME)) {
    		asistenciaporcentrocostoBeanSwingJInternalFrame=new AsistenciaPorCentroCostoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =asistenciaporcentrocostoBeanSwingJInternalFrame;
    	
    	} else if(strPantalla.equals(AnticiposConstantesFunciones.CLASSNAME)) {
    		anticiposBeanSwingJInternalFrame=new AnticiposBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =anticiposBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(CreditosDetalladosConstantesFunciones.CLASSNAME)) {
    		creditosdetalladosBeanSwingJInternalFrame=new CreditosDetalladosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =creditosdetalladosBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(CreditosPendientesConstantesFunciones.CLASSNAME)) {
    		creditospendientesBeanSwingJInternalFrame=new CreditosPendientesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =creditospendientesBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(EvaluacionesBonificacionesConstantesFunciones.CLASSNAME)) {
    		evaluacionesbonificacionesBeanSwingJInternalFrame=new EvaluacionesBonificacionesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =evaluacionesbonificacionesBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(EvaluacionesFactoresConstantesFunciones.CLASSNAME)) {
    		evaluacionesfactoresBeanSwingJInternalFrame=new EvaluacionesFactoresBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =evaluacionesfactoresBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(EvaluacionesPeriodosConstantesFunciones.CLASSNAME)) {
    		evaluacionesperiodosBeanSwingJInternalFrame=new EvaluacionesPeriodosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =evaluacionesperiodosBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(IngresosPromediosConstantesFunciones.CLASSNAME)) {
    		ingresospromediosBeanSwingJInternalFrame=new IngresosPromediosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =ingresospromediosBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(ListadosFormasPagosConstantesFunciones.CLASSNAME)) {
    		listadosformaspagosBeanSwingJInternalFrame=new ListadosFormasPagosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =listadosformaspagosBeanSwingJInternalFrame;
    	}

    	else if(strPantalla.equals(RubrosVariablesConstantesFunciones.CLASSNAME)) {
    		rubrosvariablesBeanSwingJInternalFrame=new RubrosVariablesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    		jinternalFrame =rubrosvariablesBeanSwingJInternalFrame;
    	}	 	
	} 
		
		return jinternalFrame;
    }
	
}
