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
public class MainJFrameCuentasPorCobrar {
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
		    			
		//CUENTAS POR COBRAR
		VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame=null;
		RadioVenciClienteProveBeanSwingJInternalFrame radiovenciclienteproveBeanSwingJInternalFrame=null;
		RadioVenciProveBeanSwingJInternalFrame radiovenciproveBeanSwingJInternalFrame=null;
		TipoRadioVenciBeanSwingJInternalFrame tiporadiovenciBeanSwingJInternalFrame=null;
		AnalisisTransaClienteBeanSwingJInternalFrame analisistransaclienteBeanSwingJInternalFrame=null;
		ClaseClienteBeanSwingJInternalFrame claseclienteBeanSwingJInternalFrame=null;
		LineaNegocioBeanSwingJInternalFrame lineanegocioBeanSwingJInternalFrame=null;
		MontoBeanSwingJInternalFrame montoBeanSwingJInternalFrame=null;
		SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=null;
		TipoVentaBeanSwingJInternalFrame tipoventaBeanSwingJInternalFrame=null;
		TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame=null;
		TipoDocumentoPersonalBeanSwingJInternalFrame tipodocumentopersonalBeanSwingJInternalFrame=null;
		TipoGarantiaBeanSwingJInternalFrame tipogarantiaBeanSwingJInternalFrame=null;
		//TipoTransporteBeanSwingJInternalFrame tipotransporteBeanSwingJInternalFrame=null;
		TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame=null;
		
		CateTipoAfiliacionBeanSwingJInternalFrame catetipoafiliacionBeanSwingJInternalFrame=null;
		TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrame=null;
		TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame=null;
		TipoNivelEduBeanSwingJInternalFrame tiponiveleduBeanSwingJInternalFrame=null;
		EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrame=null;
		EstadoClienteBeanSwingJInternalFrame estadoclienteBeanSwingJInternalFrame=null;
		EstadoLegalBeanSwingJInternalFrame estadolegalBeanSwingJInternalFrame=null;
		ProfesionBeanSwingJInternalFrame profesionBeanSwingJInternalFrame=null;
		RutaBeanSwingJInternalFrame rutaBeanSwingJInternalFrame=null;
		TipoDireccionBeanSwingJInternalFrame tipodireccionBeanSwingJInternalFrame=null;
		TipoViviendaBeanSwingJInternalFrame tipoviviendaBeanSwingJInternalFrame=null;
		TipoTelefoBeanSwingJInternalFrame tipotelefoBeanSwingJInternalFrame=null;
		TipoCargaFamiBeanSwingJInternalFrame tipocargafamiBeanSwingJInternalFrame=null;
		TipoRefePersoBeanSwingJInternalFrame tiporefepersoBeanSwingJInternalFrame=null;
		HobbyBeanSwingJInternalFrame hobbyBeanSwingJInternalFrame=null;
		TipoBienBeanSwingJInternalFrame tipobienBeanSwingJInternalFrame=null;
		TipoMoviFinanBeanSwingJInternalFrame tipomovifinanBeanSwingJInternalFrame=null;
		TipoUbicacionNegocioBeanSwingJInternalFrame tipoubicacionnegocioBeanSwingJInternalFrame=null;
		ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame=null;
		TipoGarantiaEmpresaBeanSwingJInternalFrame tipogarantiaempresaBeanSwingJInternalFrame=null;
		EstadoGarantiaClienteBeanSwingJInternalFrame estadogarantiaclienteBeanSwingJInternalFrame=null;
		TransaccionClienteBeanSwingJInternalFrame transaccionclienteBeanSwingJInternalFrame=null;
		ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;
		EstadoRetencionBeanSwingJInternalFrame estadoretencionBeanSwingJInternalFrame=null;
		ClienteRetencionBeanSwingJInternalFrame clienteretencionBeanSwingJInternalFrame=null;
		TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame=null;

		
		
		//CUENTAS_POR_COBRAR_REPORTES
		CobrarAnalisisCarterasBeanSwingJInternalFrame cobraranalisiscarterasBeanSwingJInternalFrame=null;
		CobrarClientesDetalladosBeanSwingJInternalFrame cobrarclientesdetalladosBeanSwingJInternalFrame=null;
		CobrarClientesHonomasticosBeanSwingJInternalFrame cobrarclienteshonomasticosBeanSwingJInternalFrame=null;
		CobrarClientesNovedadesBeanSwingJInternalFrame cobrarclientesnovedadesBeanSwingJInternalFrame=null;
		CobrarClientesPorRegionBeanSwingJInternalFrame cobrarclientesporregionBeanSwingJInternalFrame=null;
		CobrarClientesSaldosBeanSwingJInternalFrame cobrarclientessaldosBeanSwingJInternalFrame=null;
		CobrarClientesSuspendidosBeanSwingJInternalFrame cobrarclientessuspendidosBeanSwingJInternalFrame=null;
		CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame cobrarconciliacionescarterascontabilidadBeanSwingJInternalFrame=null;
		CobrarControlCarterasGeneralesBeanSwingJInternalFrame cobrarcontrolcarterasgeneralesBeanSwingJInternalFrame=null;
		CobrarDetalleCobrosBeanSwingJInternalFrame cobrardetallecobrosBeanSwingJInternalFrame=null;
		CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame cobrarestadoscuentasporfacturaBeanSwingJInternalFrame=null;
		CobrarListadosMovimientosBeanSwingJInternalFrame cobrarlistadosmovimientosBeanSwingJInternalFrame=null;
		CobrarListadoVendedoresBeanSwingJInternalFrame cobrarlistadovendedoresBeanSwingJInternalFrame=null;
		CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame cobrarmorosidadclientesdetalladosBeanSwingJInternalFrame=null;
		CobrarSaldosVencidosBeanSwingJInternalFrame cobrarsaldosvencidosBeanSwingJInternalFrame=null;

		


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
		

		//CUENTAS_POR_COBRAR_PROCEOS
		//AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=null;
		NovedadBeanSwingJInternalFrame novedadBeanSwingJInternalFrame=null;
		RecapBeanSwingJInternalFrame recapBeanSwingJInternalFrame=null;
		
		//BUG:ME REGENERAR PERO CORREGIR ERRORES
		//ProcesoRecapBeanSwingJInternalFrame procesorecapBeanSwingJInternalFrame=null;

				
		if(strPaquete.equals(Constantes.SMODULO_CUENTAS_PORCOBRAR)) {
			if(strPantalla.equals(GrupoClienteConstantesFunciones.CLASSNAME)) {
				grupoclienteBeanSwingJInternalFrame=new GrupoClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =grupoclienteBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(TipoCargoLaboConstantesFunciones.CLASSNAME)) {
	    		tipocargolaboBeanSwingJInternalFrame=new TipoCargoLaboBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipocargolaboBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(VendedorConstantesFunciones.CLASSNAME)) {
	    		vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =vendedorBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME)) {
	    		tiporetencionfuenteivaBeanSwingJInternalFrame=new TipoRetencionFuenteIvaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tiporetencionfuenteivaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(RadioVenciProveConstantesFunciones.CLASSNAME)) {
	    		radiovenciproveBeanSwingJInternalFrame=new RadioVenciProveBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =radiovenciproveBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(RadioVenciClienteProveConstantesFunciones.CLASSNAME)) {
	    		radiovenciclienteproveBeanSwingJInternalFrame=new RadioVenciClienteProveBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =radiovenciclienteproveBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(RadioVenciProveConstantesFunciones.CLASSNAME)) {
	    		radiovenciproveBeanSwingJInternalFrame=new RadioVenciProveBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =radiovenciproveBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TipoRadioVenciConstantesFunciones.CLASSNAME)) {
	    		tiporadiovenciBeanSwingJInternalFrame=new TipoRadioVenciBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tiporadiovenciBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ParametroCarteraConstantesFunciones.CLASSNAME)) {
	    		parametrocarteraBeanSwingJInternalFrame=new ParametroCarteraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametrocarteraBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(AnalisisTransaClienteConstantesFunciones.CLASSNAME)) {
	    		analisistransaclienteBeanSwingJInternalFrame=new AnalisisTransaClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =analisistransaclienteBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ClaseClienteConstantesFunciones.CLASSNAME)) {
	    		claseclienteBeanSwingJInternalFrame=new ClaseClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =claseclienteBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(LineaNegocioConstantesFunciones.CLASSNAME)) {
	    		lineanegocioBeanSwingJInternalFrame=new LineaNegocioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =lineanegocioBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(MontoConstantesFunciones.CLASSNAME)) {
	    		montoBeanSwingJInternalFrame=new MontoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =montoBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(SubClienteConstantesFunciones.CLASSNAME)) {
	    		subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =subclienteBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoVentaConstantesFunciones.CLASSNAME)) {
	    		tipoventaBeanSwingJInternalFrame=new TipoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoventaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TransporteConstantesFunciones.CLASSNAME)) {
	    		transporteBeanSwingJInternalFrame=new TransporteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =transporteBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(AsientoContableConstantesFunciones.CLASSNAME+"Diario")) {
	    		asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =asientocontableBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(AsientoContableConstantesFunciones.CLASSNAME+"Ingreso")) {
	    		asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =asientocontableBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(ClienteConstantesFunciones.CLASSNAME)) {  
	    		clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =clienteBeanSwingJInternalFrame;
    			
	    	} else if(strPantalla.equals(TransaccionConstantesFunciones.CLASSNAME)) {  
	    		transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =transaccionBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(TipoDocumentoPersonalConstantesFunciones.CLASSNAME)) {
	    		tipodocumentopersonalBeanSwingJInternalFrame=new TipoDocumentoPersonalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipodocumentopersonalBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoGarantiaConstantesFunciones.CLASSNAME)) {
	    		tipogarantiaBeanSwingJInternalFrame=new TipoGarantiaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipogarantiaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoViaTransporteConstantesFunciones.CLASSNAME)) {
	    		tipoviatransporteBeanSwingJInternalFrame=new TipoViaTransporteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoviatransporteBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(CobrarClientesDetalladosConstantesFunciones.CLASSNAME)) {
	    		cobrarclientesdetalladosBeanSwingJInternalFrame=new CobrarClientesDetalladosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrarclientesdetalladosBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(CobrarAnalisisCarterasConstantesFunciones.CLASSNAME)) {
	    		cobraranalisiscarterasBeanSwingJInternalFrame=new CobrarAnalisisCarterasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobraranalisiscarterasBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(CobrarClientesDetalladosConstantesFunciones.CLASSNAME)) {
	    		cobrarclientesdetalladosBeanSwingJInternalFrame=new CobrarClientesDetalladosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrarclientesdetalladosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(CobrarClientesHonomasticosConstantesFunciones.CLASSNAME)) {
	    		cobrarclienteshonomasticosBeanSwingJInternalFrame=new CobrarClientesHonomasticosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrarclienteshonomasticosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(CobrarClientesNovedadesConstantesFunciones.CLASSNAME)) {
	    		cobrarclientesnovedadesBeanSwingJInternalFrame=new CobrarClientesNovedadesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrarclientesnovedadesBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(CobrarClientesPorRegionConstantesFunciones.CLASSNAME)) {
	    		cobrarclientesporregionBeanSwingJInternalFrame=new CobrarClientesPorRegionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrarclientesporregionBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(CobrarClientesSaldosConstantesFunciones.CLASSNAME)) {
	    		cobrarclientessaldosBeanSwingJInternalFrame=new CobrarClientesSaldosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrarclientessaldosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(CobrarClientesSuspendidosConstantesFunciones.CLASSNAME)) {
	    		cobrarclientessuspendidosBeanSwingJInternalFrame=new CobrarClientesSuspendidosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrarclientessuspendidosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME)) {
	    		cobrarconciliacionescarterascontabilidadBeanSwingJInternalFrame=new CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrarconciliacionescarterascontabilidadBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(CobrarControlCarterasGeneralesConstantesFunciones.CLASSNAME)) {
	    		cobrarcontrolcarterasgeneralesBeanSwingJInternalFrame=new CobrarControlCarterasGeneralesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrarcontrolcarterasgeneralesBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(CobrarDetalleCobrosConstantesFunciones.CLASSNAME)) {
	    		cobrardetallecobrosBeanSwingJInternalFrame=new CobrarDetalleCobrosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrardetallecobrosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(CobrarEstadosCuentasPorFacturaConstantesFunciones.CLASSNAME)) {
	    		cobrarestadoscuentasporfacturaBeanSwingJInternalFrame=new CobrarEstadosCuentasPorFacturaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrarestadoscuentasporfacturaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(CobrarListadosMovimientosConstantesFunciones.CLASSNAME)) {
	    		cobrarlistadosmovimientosBeanSwingJInternalFrame=new CobrarListadosMovimientosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrarlistadosmovimientosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(CobrarListadoVendedoresConstantesFunciones.CLASSNAME)) {
	    		cobrarlistadovendedoresBeanSwingJInternalFrame=new CobrarListadoVendedoresBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrarlistadovendedoresBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME)) {
	    		cobrarmorosidadclientesdetalladosBeanSwingJInternalFrame=new CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrarmorosidadclientesdetalladosBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(CobrarSaldosVencidosConstantesFunciones.CLASSNAME)) {
	    		cobrarsaldosvencidosBeanSwingJInternalFrame=new CobrarSaldosVencidosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =cobrarsaldosvencidosBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(AsientoContableConstantesFunciones.CLASSNAME)) {
	    		asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =asientocontableBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(NovedadConstantesFunciones.CLASSNAME)) {
	    		novedadBeanSwingJInternalFrame=new NovedadBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =novedadBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(RecapConstantesFunciones.CLASSNAME)) {
	    		recapBeanSwingJInternalFrame=new RecapBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =recapBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(CateTipoAfiliacionConstantesFunciones.CLASSNAME)) {
	    		catetipoafiliacionBeanSwingJInternalFrame=new CateTipoAfiliacionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =catetipoafiliacionBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoGeneroConstantesFunciones.CLASSNAME)) {
	    		tipogeneroBeanSwingJInternalFrame=new TipoGeneroBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipogeneroBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoIdentificacionConstantesFunciones.CLASSNAME)) {
	    		tipoidentificacionBeanSwingJInternalFrame=new TipoIdentificacionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoidentificacionBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoNivelEduConstantesFunciones.CLASSNAME)) {
	    		tiponiveleduBeanSwingJInternalFrame=new TipoNivelEduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tiponiveleduBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(EstadoCivilConstantesFunciones.CLASSNAME)) {
	    		estadocivilBeanSwingJInternalFrame=new EstadoCivilBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =estadocivilBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(EstadoClienteConstantesFunciones.CLASSNAME)) {
	    		estadoclienteBeanSwingJInternalFrame=new EstadoClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =estadoclienteBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(EstadoLegalConstantesFunciones.CLASSNAME)) {
	    		estadolegalBeanSwingJInternalFrame=new EstadoLegalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =estadolegalBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ProfesionConstantesFunciones.CLASSNAME)) {
	    		profesionBeanSwingJInternalFrame=new ProfesionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =profesionBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(RutaConstantesFunciones.CLASSNAME)) {
	    		rutaBeanSwingJInternalFrame=new RutaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =rutaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TituloClienteConstantesFunciones.CLASSNAME)) {
	    		tituloclienteBeanSwingJInternalFrame=new TituloClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tituloclienteBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoDireccionConstantesFunciones.CLASSNAME)) {
	    		tipodireccionBeanSwingJInternalFrame=new TipoDireccionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipodireccionBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoViviendaConstantesFunciones.CLASSNAME)) {
	    		tipoviviendaBeanSwingJInternalFrame=new TipoViviendaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoviviendaBeanSwingJInternalFrame;
	    	
	    	}else if(strPantalla.equals(TipoTelefoConstantesFunciones.CLASSNAME)) {
	    		tipotelefoBeanSwingJInternalFrame=new TipoTelefoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipotelefoBeanSwingJInternalFrame;
	    	} else if(strPantalla.equals(TipoCargaFamiConstantesFunciones.CLASSNAME)) {
	    		tipocargafamiBeanSwingJInternalFrame=new TipoCargaFamiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipocargafamiBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoRefePersoConstantesFunciones.CLASSNAME)) {
	    		tiporefepersoBeanSwingJInternalFrame=new TipoRefePersoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tiporefepersoBeanSwingJInternalFrame;
	    	} else if(strPantalla.equals(HobbyConstantesFunciones.CLASSNAME)) {
	    		hobbyBeanSwingJInternalFrame=new HobbyBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =hobbyBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoBienConstantesFunciones.CLASSNAME)) {
	    		tipobienBeanSwingJInternalFrame=new TipoBienBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipobienBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoMoviFinanConstantesFunciones.CLASSNAME)) {
	    		tipomovifinanBeanSwingJInternalFrame=new TipoMoviFinanBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipomovifinanBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(LineaNegocioConstantesFunciones.CLASSNAME)) {
	    		lineanegocioBeanSwingJInternalFrame=new LineaNegocioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =lineanegocioBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoUbicacionNegocioConstantesFunciones.CLASSNAME)) {
	    			tipoubicacionnegocioBeanSwingJInternalFrame=new TipoUbicacionNegocioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    			jinternalFrame =tipoubicacionnegocioBeanSwingJInternalFrame;
	    	
	    	}  else if(strPantalla.equals(ProcesoRecapConstantesFunciones.CLASSNAME)) {
	    		//BUG: ME REGENERAR PERO CORREGIR ERRORES
	    		//procesorecapBeanSwingJInternalFrame=new ProcesoRecapBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		//jinternalFrame =procesorecapBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ZonaConstantesFunciones.CLASSNAME)) {
	    		zonaBeanSwingJInternalFrame=new ZonaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =zonaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoGarantiaEmpresaConstantesFunciones.CLASSNAME)) {
	    		tipogarantiaempresaBeanSwingJInternalFrame=new TipoGarantiaEmpresaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipogarantiaempresaBeanSwingJInternalFrame;

	    	} else if(strPantalla.equals(EstadoGarantiaClienteConstantesFunciones.CLASSNAME)) {
	    		estadogarantiaclienteBeanSwingJInternalFrame=new EstadoGarantiaClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =estadogarantiaclienteBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TransaccionClienteConstantesFunciones.CLASSNAME)) {
	    		transaccionclienteBeanSwingJInternalFrame=new TransaccionClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =transaccionclienteBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ParametroCarteraDefectoConstantesFunciones.CLASSNAME)) {
	    		parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametrocarteradefectoBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(EstadoRetencionConstantesFunciones.CLASSNAME)) {
	    		estadoretencionBeanSwingJInternalFrame=new EstadoRetencionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =estadoretencionBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ClienteRetencionConstantesFunciones.CLASSNAME)) {
	    		clienteretencionBeanSwingJInternalFrame=new ClienteRetencionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =clienteretencionBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoRetencionConstantesFunciones.CLASSNAME)) {
	    		tiporetencionBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tiporetencionBeanSwingJInternalFrame;
	    	}			
		}
		
    	return jinternalFrame;
	}
}
