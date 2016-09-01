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
public class MainJFrameActivosFijos {
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
    	
		//ACTIVOS_FIJOS
		AseguradoraBeanSwingJInternalFrame aseguradoraBeanSwingJInternalFrame=null;
		DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=null;
		EstadoActivoFijoBeanSwingJInternalFrame estadoactivofijoBeanSwingJInternalFrame=null;
		SubGrupoActivoFijoBeanSwingJInternalFrame subgrupoactivofijoBeanSwingJInternalFrame=null;
		TipoActivoFijoBeanSwingJInternalFrame tipoactivofijoBeanSwingJInternalFrame=null;
		DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrame=null;
		FormatoActivoFijoBeanSwingJInternalFrame formatoactivofijoBeanSwingJInternalFrame=null;
		PartidaPresuBeanSwingJInternalFrame partidapresuBeanSwingJInternalFrame=null;
		TipoCalculoDepreciacionBeanSwingJInternalFrame tipocalculodepreciacionBeanSwingJInternalFrame=null;
		TipoEstadoActivoFijoBeanSwingJInternalFrame tipoestadoactivofijoBeanSwingJInternalFrame=null;
		TipoActivoFijoEmpresaBeanSwingJInternalFrame tipoactivofijoempresaBeanSwingJInternalFrame=null;
		TipoGrupoActivoFijoBeanSwingJInternalFrame tipogrupoactivofijoBeanSwingJInternalFrame=null;
		TipoDepreciacionEmpresaBeanSwingJInternalFrame tipodepreciacionempresaBeanSwingJInternalFrame=null;
		EstadoDepreActiBeanSwingJInternalFrame estadodepreactiBeanSwingJInternalFrame=null;
		MovimientoActivoFijoBeanSwingJInternalFrame movimientoactivofijoBeanSwingJInternalFrame=null;
		TipoRamoActivoFijoBeanSwingJInternalFrame tiporamoactivofijoBeanSwingJInternalFrame=null;
		
		//ACTIVOS_FIJOS_REPORTES
		ActivosFijosPorGruposBeanSwingJInternalFrame activosfijosporgruposBeanSwingJInternalFrame=null;
		ActivosFijosPorRamosBeanSwingJInternalFrame activosfijosporramosBeanSwingJInternalFrame=null;
		AdicionalesActivosFijosBeanSwingJInternalFrame adicionalesactivosfijosBeanSwingJInternalFrame=null;
		BajasActivosFijosBeanSwingJInternalFrame bajasactivosfijosBeanSwingJInternalFrame=null;
		ConsolidadosDetalleBeanSwingJInternalFrame consolidadosdetalleBeanSwingJInternalFrame=null;
		ConsolidadosResumenBeanSwingJInternalFrame consolidadosresumenBeanSwingJInternalFrame=null;
		DepreciacionesBeanSwingJInternalFrame depreciacionesBeanSwingJInternalFrame=null;
		ListadoActivosFijosBeanSwingJInternalFrame listadoactivosfijosBeanSwingJInternalFrame=null;
		MantenimientoeActivoFijosBeanSwingJInternalFrame mantenimientoeactivofijosBeanSwingJInternalFrame=null;
		ResponsablesBeanSwingJInternalFrame responsablesBeanSwingJInternalFrame=null;
		TransferenciasBeanSwingJInternalFrame transferenciasBeanSwingJInternalFrame=null;

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
		
		//ACTIVOS_FIJOS_PROCESOS
		ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame procesocambiarempresasucursalBeanSwingJInternalFrame=null;
		ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame procesocambiarejercicioperiodoBeanSwingJInternalFrame=null;
		FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame=null;
		ProcesarCrearIndicesBeanSwingJInternalFrame procesarcrearindicesBeanSwingJInternalFrame=null;
		ProcesarMayorizarBeanSwingJInternalFrame procesarmayorizarBeanSwingJInternalFrame=null;
		ProcesarCalcularDepreciacionesBeanSwingJInternalFrame procesarcalculardepreciacionesBeanSwingJInternalFrame=null;
		
		
		if(strPaquete.equals(Constantes.SMODULO_ACTIVOS_FIJOS)) {
			if(strPantalla.equals(AseguradoraConstantesFunciones.CLASSNAME)) {
				aseguradoraBeanSwingJInternalFrame=new AseguradoraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =aseguradoraBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(DetalleActivoFijoConstantesFunciones.CLASSNAME)) {
				detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =detalleactivofijoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(EstadoActivoFijoConstantesFunciones.CLASSNAME)) {
				estadoactivofijoBeanSwingJInternalFrame=new EstadoActivoFijoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadoactivofijoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(SubGrupoActivoFijoConstantesFunciones.CLASSNAME)) {
				subgrupoactivofijoBeanSwingJInternalFrame=new SubGrupoActivoFijoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =subgrupoactivofijoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoActivoFijoConstantesFunciones.CLASSNAME)) {
				tipoactivofijoBeanSwingJInternalFrame=new TipoActivoFijoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoactivofijoBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME)) {
				tipodepreciacionempresaBeanSwingJInternalFrame=new TipoDepreciacionEmpresaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipodepreciacionempresaBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME)) {
				detallegrupoactivofijoBeanSwingJInternalFrame=new DetalleGrupoActivoFijoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =detallegrupoactivofijoBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(FormatoActivoFijoConstantesFunciones.CLASSNAME)) {
				formatoactivofijoBeanSwingJInternalFrame=new FormatoActivoFijoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =formatoactivofijoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(PartidaPresuConstantesFunciones.CLASSNAME)) {
				partidapresuBeanSwingJInternalFrame=new PartidaPresuBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =partidapresuBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(TipoCalculoDepreciacionConstantesFunciones.CLASSNAME)) {
				tipocalculodepreciacionBeanSwingJInternalFrame=new TipoCalculoDepreciacionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipocalculodepreciacionBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(TipoEstadoActivoFijoConstantesFunciones.CLASSNAME)) {
				tipoestadoactivofijoBeanSwingJInternalFrame=new TipoEstadoActivoFijoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoestadoactivofijoBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(TipoActivoFijoEmpresaConstantesFunciones.CLASSNAME)) {
				tipoactivofijoempresaBeanSwingJInternalFrame=new TipoActivoFijoEmpresaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipoactivofijoempresaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoGrupoActivoFijoConstantesFunciones.CLASSNAME)) {
				tipogrupoactivofijoBeanSwingJInternalFrame=new TipoGrupoActivoFijoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipogrupoactivofijoBeanSwingJInternalFrame;
			}

			 else if(strPantalla.equals(EstadoDepreActiConstantesFunciones.CLASSNAME)) {
				estadodepreactiBeanSwingJInternalFrame=new EstadoDepreActiBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadodepreactiBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(MovimientoActivoFijoConstantesFunciones.CLASSNAME)) {
				movimientoactivofijoBeanSwingJInternalFrame=new MovimientoActivoFijoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =movimientoactivofijoBeanSwingJInternalFrame;
			}
			else if(strPantalla.equals(TipoRamoActivoFijoConstantesFunciones.CLASSNAME)) {
				tiporamoactivofijoBeanSwingJInternalFrame=new TipoRamoActivoFijoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tiporamoactivofijoBeanSwingJInternalFrame;
				
			} else if(strPantalla.equals(ActivosFijosPorGruposConstantesFunciones.CLASSNAME)) {
				activosfijosporgruposBeanSwingJInternalFrame=new ActivosFijosPorGruposBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =activosfijosporgruposBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ActivosFijosPorRamosConstantesFunciones.CLASSNAME)) {
				activosfijosporramosBeanSwingJInternalFrame=new ActivosFijosPorRamosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =activosfijosporramosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(AdicionalesActivosFijosConstantesFunciones.CLASSNAME)) {
				adicionalesactivosfijosBeanSwingJInternalFrame=new AdicionalesActivosFijosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =adicionalesactivosfijosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(BajasActivosFijosConstantesFunciones.CLASSNAME)) {
				bajasactivosfijosBeanSwingJInternalFrame=new BajasActivosFijosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =bajasactivosfijosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ConsolidadosDetalleConstantesFunciones.CLASSNAME)) {
				consolidadosdetalleBeanSwingJInternalFrame=new ConsolidadosDetalleBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =consolidadosdetalleBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ConsolidadosResumenConstantesFunciones.CLASSNAME)) {
				consolidadosresumenBeanSwingJInternalFrame=new ConsolidadosResumenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =consolidadosresumenBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(DepreciacionesConstantesFunciones.CLASSNAME)) {
				depreciacionesBeanSwingJInternalFrame=new DepreciacionesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =depreciacionesBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ListadoActivosFijosConstantesFunciones.CLASSNAME)) {
				listadoactivosfijosBeanSwingJInternalFrame=new ListadoActivosFijosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =listadoactivosfijosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(MantenimientoeActivoFijosConstantesFunciones.CLASSNAME)) {
				mantenimientoeactivofijosBeanSwingJInternalFrame=new MantenimientoeActivoFijosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =mantenimientoeactivofijosBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ResponsablesConstantesFunciones.CLASSNAME)) {
				responsablesBeanSwingJInternalFrame=new ResponsablesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =responsablesBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TransferenciasConstantesFunciones.CLASSNAME)) {
				transferenciasBeanSwingJInternalFrame=new TransferenciasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =transferenciasBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(ProcesoCambiarEmpresaSucursalConstantesFunciones.CLASSNAME)) {
				procesocambiarempresasucursalBeanSwingJInternalFrame=new ProcesoCambiarEmpresaSucursalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =procesocambiarempresasucursalBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME)) {
				procesocambiarejercicioperiodoBeanSwingJInternalFrame=new ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =procesocambiarejercicioperiodoBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(FormatoConstantesFunciones.CLASSNAME)) {
				formatoBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =formatoBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(ProcesarCrearIndicesConstantesFunciones.CLASSNAME)) {
				procesarcrearindicesBeanSwingJInternalFrame=new ProcesarCrearIndicesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =procesarcrearindicesBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(ProcesarMayorizarConstantesFunciones.CLASSNAME)) {
				procesarmayorizarBeanSwingJInternalFrame=new ProcesarMayorizarBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =procesarmayorizarBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(ProcesarCalcularDepreciacionesConstantesFunciones.CLASSNAME)) {
				procesarcalculardepreciacionesBeanSwingJInternalFrame=new ProcesarCalcularDepreciacionesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =procesarcalculardepreciacionesBeanSwingJInternalFrame;
			
			} else if(strPantalla.equals(AsientoContableConstantesFunciones.CLASSNAME)) {
				asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =asientocontableBeanSwingJInternalFrame;
			}
		}
		
    	return jinternalFrame;
	}
}
