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
public class MainJFrameCartera {
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
		
		
		if(strPaquete.equals(Constantes.SMODULO_CARTERA)) {
    		
			//CARTERA
			
	    	if(strPantalla.equals(TipoCargoLaboConstantesFunciones.CLASSNAME)) {
	    		tipocargolaboBeanSwingJInternalFrame=new TipoCargoLaboBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tipocargolaboBeanSwingJInternalFrame;
	    	}	    				    		    		
	    	else if(strPantalla.equals(BancoConstantesFunciones.CLASSNAME)) {
	    		bancoBeanSwingJInternalFrame=new BancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =bancoBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ClienteConstantesFunciones.CLASSNAME)) {
	    		clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =clienteBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(FormaPagoConstantesFunciones.CLASSNAME)) {
	    		formapagoBeanSwingJInternalFrame=new FormaPagoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =formapagoBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(ParametroCarteraConstantesFunciones.CLASSNAME)) {
	    		parametrocarteraBeanSwingJInternalFrame=new ParametroCarteraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =parametrocarteraBeanSwingJInternalFrame;
	    	}

	    	else if(strPantalla.equals(TituloClienteConstantesFunciones.CLASSNAME)) {
	    		tituloclienteBeanSwingJInternalFrame=new TituloClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		jinternalFrame =tituloclienteBeanSwingJInternalFrame;
	    	
	    	}else if(strPantalla.equals(TipoTransaConstantesFunciones.CLASSNAME)) {  
	    		TipoTransaBeanSwingJInternalFrame tipoTransaBeanSwingJInternalFrame = new TipoTransaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipoTransaBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(TipoComproConstantesFunciones.CLASSNAME)) {  
	    		TipoComproBeanSwingJInternalFrame tipoComproBeanSwingJInternalFrame = new TipoComproBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipoComproBeanSwingJInternalFrame;    		
    			
	    	} else if(strPantalla.equals(TipoReteConstantesFunciones.CLASSNAME)) {  
	    		TipoReteBeanSwingJInternalFrame tipoReteBeanSwingJInternalFrame = new TipoReteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipoReteBeanSwingJInternalFrame;    		
    			
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
    			
	    	} else if(strPantalla.equals(EstadoLegalConstantesFunciones.CLASSNAME)) {  
	    		estadoLegalBeanSwingJInternalFrame=new EstadoLegalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =estadoLegalBeanSwingJInternalFrame;
    			
	    	}else if(strPantalla.equals(GrupoClienteConstantesFunciones.CLASSNAME)) {  
	    		grupoclienteBeanSwingJInternalFrame=new GrupoClienteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =grupoclienteBeanSwingJInternalFrame;
    			
	    	}
		}
		
    	return jinternalFrame;
	}
}
