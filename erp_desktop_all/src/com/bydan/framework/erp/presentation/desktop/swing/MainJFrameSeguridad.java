package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JDesktopPane;

import com.bydan.erp.seguridad.business.entity.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.report.*;
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
import com.bydan.erp.seguridad.util.report.*;
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
public class MainJFrameSeguridad {
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
    	
    	//SEGURIDAD
    	
		AccionBeanSwingJInternalFrame accionBeanSwingJInternalFrame=null;
		AuditoriaBeanSwingJInternalFrame auditoriaBeanSwingJInternalFrame=null;
		AuditoriaDetalleBeanSwingJInternalFrame auditoriadetalleBeanSwingJInternalFrame=null;
		CampoBeanSwingJInternalFrame campoBeanSwingJInternalFrame=null;
		HistorialCambioClaveBeanSwingJInternalFrame historialcambioclaveBeanSwingJInternalFrame=null;
		ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame=null;    		
		OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame=null;
		PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrame=null;
		PerfilAccionBeanSwingJInternalFrame perfilaccionBeanSwingJInternalFrame=null;
		PerfilCampoBeanSwingJInternalFrame perfilcampoBeanSwingJInternalFrame=null;
		PerfilOpcionBeanSwingJInternalFrame perfilopcionBeanSwingJInternalFrame=null;
		PerfilUsuarioBeanSwingJInternalFrame perfilusuarioBeanSwingJInternalFrame=null;
		SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrame=null;
		UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame=null;
		EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame=null;
		SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame=null;
		TipoEmpresaBeanSwingJInternalFrame tipoEmpresaBeanSwingJInternalFrame=null;
		ContinenteBeanSwingJInternalFrame continenteBeanSwingJInternalFrame=null;
		ParametroGeneralSgBeanSwingJInternalFrame parametrogeneralsgBeanSwingJInternalFrame=null;
		ParametroGeneralUsuarioBeanSwingJInternalFrame parametrogeneralusuarioBeanSwingJInternalFrame=null;
		TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame=null;
		TipoTransaBeanSwingJInternalFrame tipoTransaBeanSwingJInternalFrame=null;
		TipoComproBeanSwingJInternalFrame tipoComproBeanSwingJInternalFrame=null;
		TipoReteBeanSwingJInternalFrame tipoReteBeanSwingJInternalFrame=null;
		TipoVisualBeanSwingJInternalFrame tipovisualBeanSwingJInternalFrame=null;
		AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame=null;
		MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame=null;
		CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame=null;
		PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame=null;
		ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame=null;
		RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrame=null;
		ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame=null;
		PaqueteBeanSwingJInternalFrame paqueteBeanSwingJInternalFrame=null;
		TipoDelimiterBeanSwingJInternalFrame tipodelimiterBeanSwingJInternalFrame=null;
		TipoExportarBeanSwingJInternalFrame tipoexportarBeanSwingJInternalFrame=null;
		SemestreBeanSwingJInternalFrame semestreBeanSwingJInternalFrame=null;
		BimestreBeanSwingJInternalFrame bimestreBeanSwingJInternalFrame=null;
		TrimestreBeanSwingJInternalFrame trimestreBeanSwingJInternalFrame=null;
		TipoOperacionBeanSwingJInternalFrame tipooperacionBeanSwingJInternalFrame=null;
		SiNoBeanSwingJInternalFrame sinoBeanSwingJInternalFrame=null;
		ColorGeneralBeanSwingJInternalFrame colorgeneralBeanSwingJInternalFrame=null;
				
		TipoFondoBeanSwingJInternalFrame tipofondoBeanSwingJInternalFrame=null;
		TipoFondoControlBeanSwingJInternalFrame tipofondocontrolBeanSwingJInternalFrame=null;
		TipoTamanioControlBeanSwingJInternalFrame tipotamaniocontrolBeanSwingJInternalFrame=null;
		AreaBeanSwingJInternalFrame areaBeanSwingJInternalFrame=null;
		ParametroSeguridadBeanSwingJInternalFrame parametroseguridadBeanSwingJInternalFrame=null;
		DiaBeanSwingJInternalFrame diaBeanSwingJInternalFrame=null;
		TipoValoracionBeanSwingJInternalFrame tipovaloracionBeanSwingJInternalFrame=null;
		TipoArchivoBeanSwingJInternalFrame tipoarchivoBeanSwingJInternalFrame=null;
		TipoImagenBeanSwingJInternalFrame tipoimagenBeanSwingJInternalFrame=null;
		TipoImagenPersonaBeanSwingJInternalFrame tipoimagenpersonaBeanSwingJInternalFrame=null;
		TipoTeclaMascaraBeanSwingJInternalFrame tipoteclamascaraBeanSwingJInternalFrame=null;
		SectorBeanSwingJInternalFrame sectorBeanSwingJInternalFrame=null;
		SubSectorBeanSwingJInternalFrame subsectorBeanSwingJInternalFrame=null;
		TipoPeriodoBeanSwingJInternalFrame tipoperiodoBeanSwingJInternalFrame=null;
		TipoFuenteBeanSwingJInternalFrame tipofuenteBeanSwingJInternalFrame=null;

		
		ProcesoCambiarParametroGeneralBeanSwingJInternalFrame procesocambiarparametrogeneralBeanSwingJInternalFrame=null;
		PlanetaSistemaSolarBeanSwingJInternalFrame planetasistemasolarBeanSwingJInternalFrame=null;

		//SEGURIDAD
		
		if(strPaquete.equals(Constantes.SMODULO_SEGURIDAD)) {
    		if(strPantalla.equals(AccionConstantesFunciones.CLASSNAME)) {  
    			accionBeanSwingJInternalFrame=new AccionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =accionBeanSwingJInternalFrame;
    		}
    		else if(strPantalla.equals(AuditoriaConstantesFunciones.CLASSNAME)) {  
    			auditoriaBeanSwingJInternalFrame=new AuditoriaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =auditoriaBeanSwingJInternalFrame;
    		}
    		else if(strPantalla.equals(AuditoriaConstantesFunciones.CLASSNAME)) {//AuditoriaFinal  
    			auditoriaBeanSwingJInternalFrame=new AuditoriaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =auditoriaBeanSwingJInternalFrame;
    		}
    		else if(strPantalla.equals(AuditoriaDetalleConstantesFunciones.CLASSNAME)) {  
    			auditoriadetalleBeanSwingJInternalFrame=new AuditoriaDetalleBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =auditoriadetalleBeanSwingJInternalFrame;
    		}
    		else if(strPantalla.equals(CampoConstantesFunciones.CLASSNAME)) {  
    			campoBeanSwingJInternalFrame=new CampoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =campoBeanSwingJInternalFrame;
    		}
    		else if(strPantalla.equals(HistorialCambioClaveConstantesFunciones.CLASSNAME)) {  
    			historialcambioclaveBeanSwingJInternalFrame=new HistorialCambioClaveBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =historialcambioclaveBeanSwingJInternalFrame;
    		}
    		else if(strPantalla.equals(ModuloConstantesFunciones.CLASSNAME)) {  
    			moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =moduloBeanSwingJInternalFrame;
    		}
    		else if(strPantalla.equals(OpcionConstantesFunciones.CLASSNAME)) {  
    			opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =opcionBeanSwingJInternalFrame;
    		}
    		else if(strPantalla.equals(PerfilConstantesFunciones.CLASSNAME)) {  
    			perfilBeanSwingJInternalFrame=new PerfilBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =perfilBeanSwingJInternalFrame;
    		}
    		else if(strPantalla.equals(PerfilAccionConstantesFunciones.CLASSNAME)) {  
    			perfilaccionBeanSwingJInternalFrame=new PerfilAccionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =perfilaccionBeanSwingJInternalFrame;
    		}
    		else if(strPantalla.equals(PerfilCampoConstantesFunciones.CLASSNAME)) {  
    			perfilcampoBeanSwingJInternalFrame=new PerfilCampoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =perfilcampoBeanSwingJInternalFrame;
    		}
    		else if(strPantalla.equals(PerfilOpcionConstantesFunciones.CLASSNAME)) {  
    			perfilopcionBeanSwingJInternalFrame=new PerfilOpcionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =perfilopcionBeanSwingJInternalFrame;
    		}
    		else if(strPantalla.equals(PerfilUsuarioConstantesFunciones.CLASSNAME)) {  
    			perfilusuarioBeanSwingJInternalFrame=new PerfilUsuarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =perfilusuarioBeanSwingJInternalFrame;
    		}
    		else if(strPantalla.equals(SistemaConstantesFunciones.CLASSNAME)) {  
    			sistemaBeanSwingJInternalFrame=new SistemaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =sistemaBeanSwingJInternalFrame;    			
    		}
    		else if(strPantalla.equals(UsuarioConstantesFunciones.CLASSNAME) 
    				||strPantalla.equals(UsuarioConstantesFunciones.CLASSNAME+"Final")) {
    			
    			usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =usuarioBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(UsuarioConstantesFunciones.CLASSNAME)) {//UsuarioFinal  
	    		usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =usuarioBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(EmpresaConstantesFunciones.CLASSNAME)) {  
	    		empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =empresaBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(SucursalConstantesFunciones.CLASSNAME)) {  
	    		sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =sucursalBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(TipoEmpresaConstantesFunciones.CLASSNAME)) {  
	    		tipoEmpresaBeanSwingJInternalFrame=new TipoEmpresaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipoEmpresaBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(ContinenteConstantesFunciones.CLASSNAME)) {
	    		continenteBeanSwingJInternalFrame=new ContinenteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =continenteBeanSwingJInternalFrame;    			        	    	            			
    	        
	    	} else if(strPantalla.equals(ParametroGeneralSgConstantesFunciones.CLASSNAME)) {
	    		parametrogeneralsgBeanSwingJInternalFrame=new ParametroGeneralSgBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametrogeneralsgBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoVisualConstantesFunciones.CLASSNAME)) {
	    		tipovisualBeanSwingJInternalFrame=new TipoVisualBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipovisualBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ParametroGeneralUsuarioConstantesFunciones.CLASSNAME)) {
	    		parametrogeneralusuarioBeanSwingJInternalFrame=new ParametroGeneralUsuarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametrogeneralusuarioBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(AnioConstantesFunciones.CLASSNAME)) {
	    		anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =anioBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(MesConstantesFunciones.CLASSNAME)) {
	    		mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =mesBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(CiudadConstantesFunciones.CLASSNAME)) {
	    		ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =ciudadBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(PaisConstantesFunciones.CLASSNAME)) {
	    		paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =paisBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ProvinciaConstantesFunciones.CLASSNAME)) {
	    		provinciaBeanSwingJInternalFrame=new ProvinciaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =provinciaBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(RegionConstantesFunciones.CLASSNAME)) {
	    		regionBeanSwingJInternalFrame=new RegionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =regionBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ZonaConstantesFunciones.CLASSNAME)) {
	    		zonaBeanSwingJInternalFrame=new ZonaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =zonaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(PaqueteConstantesFunciones.CLASSNAME)) {
	    		paqueteBeanSwingJInternalFrame=new PaqueteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =paqueteBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ProcesoCambiarParametroGeneralConstantesFunciones.CLASSNAME)) {
	    		procesocambiarparametrogeneralBeanSwingJInternalFrame=new ProcesoCambiarParametroGeneralBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =procesocambiarparametrogeneralBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoFondoConstantesFunciones.CLASSNAME)) {
	    		tipofondoBeanSwingJInternalFrame=new TipoFondoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipofondoBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoFondoControlConstantesFunciones.CLASSNAME)) {
	    		tipofondocontrolBeanSwingJInternalFrame=new TipoFondoControlBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipofondocontrolBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoTamanioControlConstantesFunciones.CLASSNAME)) {
	    		tipotamaniocontrolBeanSwingJInternalFrame=new TipoTamanioControlBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipotamaniocontrolBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(AreaConstantesFunciones.CLASSNAME)) {
	    		areaBeanSwingJInternalFrame=new AreaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =areaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ParametroSeguridadConstantesFunciones.CLASSNAME)) {
	    		parametroseguridadBeanSwingJInternalFrame=new ParametroSeguridadBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametroseguridadBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(DiaConstantesFunciones.CLASSNAME)) {
	    		diaBeanSwingJInternalFrame=new DiaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =diaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoValoracionConstantesFunciones.CLASSNAME)) {
	    		tipovaloracionBeanSwingJInternalFrame=new TipoValoracionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipovaloracionBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoDelimiterConstantesFunciones.CLASSNAME)) {
	    		tipodelimiterBeanSwingJInternalFrame=new TipoDelimiterBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipodelimiterBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoExportarConstantesFunciones.CLASSNAME)) {
	    		tipoexportarBeanSwingJInternalFrame=new TipoExportarBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoexportarBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(SemestreConstantesFunciones.CLASSNAME)) {
	    		semestreBeanSwingJInternalFrame=new SemestreBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =semestreBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(BimestreConstantesFunciones.CLASSNAME)) {
	    		bimestreBeanSwingJInternalFrame=new BimestreBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =bimestreBeanSwingJInternalFrame;
	    		
	    	} else if(strPantalla.equals(TrimestreConstantesFunciones.CLASSNAME)) {
	    		trimestreBeanSwingJInternalFrame=new TrimestreBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =trimestreBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoOperacionConstantesFunciones.CLASSNAME)) {
	    		tipooperacionBeanSwingJInternalFrame=new TipoOperacionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipooperacionBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(SiNoConstantesFunciones.CLASSNAME)) {
	    		sinoBeanSwingJInternalFrame=new SiNoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =sinoBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(ColorGeneralConstantesFunciones.CLASSNAME)) {
	    		colorgeneralBeanSwingJInternalFrame=new ColorGeneralBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =colorgeneralBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoArchivoConstantesFunciones.CLASSNAME)) {
	    		tipoarchivoBeanSwingJInternalFrame=new TipoArchivoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoarchivoBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TipoImagenConstantesFunciones.CLASSNAME)) {
	    		tipoimagenBeanSwingJInternalFrame=new TipoImagenBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoimagenBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoImagenPersonaConstantesFunciones.CLASSNAME)) {
	    		tipoimagenpersonaBeanSwingJInternalFrame=new TipoImagenPersonaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoimagenpersonaBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(PlanetaSistemaSolarConstantesFunciones.CLASSNAME)) {
	    		planetasistemasolarBeanSwingJInternalFrame=new PlanetaSistemaSolarBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =planetasistemasolarBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoTeclaMascaraConstantesFunciones.CLASSNAME)) {
	    		tipoteclamascaraBeanSwingJInternalFrame=new TipoTeclaMascaraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoteclamascaraBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(SectorConstantesFunciones.CLASSNAME)) {
	    		sectorBeanSwingJInternalFrame=new SectorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =sectorBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(SubSectorConstantesFunciones.CLASSNAME)) {
	    		subsectorBeanSwingJInternalFrame=new SubSectorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =subsectorBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoPeriodoConstantesFunciones.CLASSNAME)) {
	    		tipoperiodoBeanSwingJInternalFrame=new TipoPeriodoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipoperiodoBeanSwingJInternalFrame;
	    	
	    	} else if(strPantalla.equals(TipoFuenteConstantesFunciones.CLASSNAME)) {
	    		tipofuenteBeanSwingJInternalFrame=new TipoFuenteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipofuenteBeanSwingJInternalFrame;
	    	}
		}
		
		return jinternalFrame;
	}
}
