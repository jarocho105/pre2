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
public class MainJFrameComisiones {
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
    	
		
		//COMISIONES
		ComisionCateBeanSwingJInternalFrame comisioncateBeanSwingJInternalFrame=null;
		ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame=null;
		ComisionGrupoBeanSwingJInternalFrame comisiongrupoBeanSwingJInternalFrame=null;
		ComisionLineaBeanSwingJInternalFrame comisionlineaBeanSwingJInternalFrame=null;
		ComisionMarcaBeanSwingJInternalFrame comisionmarcaBeanSwingJInternalFrame=null;
		ComisionPenaBeanSwingJInternalFrame comisionpenaBeanSwingJInternalFrame=null;
		ComisionVentaCobroBeanSwingJInternalFrame comisionventacobroBeanSwingJInternalFrame=null;
		EstadoComisionBeanSwingJInternalFrame estadocomisionBeanSwingJInternalFrame=null;
		TipoComisionConfigBeanSwingJInternalFrame tipocomisionconfigBeanSwingJInternalFrame=null;
		
		//RELACIONES
		FormaPagoBeanSwingJInternalFrame formapagoBeanSwingJInternalFrame;
		FacturaProveedorBeanSwingJInternalFrame facturaproveedorBeanSwingJInternalFrame;
		TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
		VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
		TransaccionContaBeanSwingJInternalFrame transaccioncontaBeanSwingJInternalFrame;
		
		if(strPaquete.equals(Constantes.SMODULO_COMISIONES)) {
			if(strPantalla.equals(ComisionCateConstantesFunciones.CLASSNAME)) {
				comisioncateBeanSwingJInternalFrame=new ComisionCateBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =comisioncateBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ComisionConfigConstantesFunciones.CLASSNAME)) {
				comisionconfigBeanSwingJInternalFrame=new ComisionConfigBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =comisionconfigBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ComisionGrupoConstantesFunciones.CLASSNAME)) {
				comisiongrupoBeanSwingJInternalFrame=new ComisionGrupoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =comisiongrupoBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ComisionLineaConstantesFunciones.CLASSNAME)) {
				comisionlineaBeanSwingJInternalFrame=new ComisionLineaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =comisionlineaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ComisionMarcaConstantesFunciones.CLASSNAME)) {
				comisionmarcaBeanSwingJInternalFrame=new ComisionMarcaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =comisionmarcaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ComisionPenaConstantesFunciones.CLASSNAME)) {
				comisionpenaBeanSwingJInternalFrame=new ComisionPenaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =comisionpenaBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(ComisionVentaCobroConstantesFunciones.CLASSNAME)) {
				comisionventacobroBeanSwingJInternalFrame=new ComisionVentaCobroBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =comisionventacobroBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(EstadoComisionConstantesFunciones.CLASSNAME)) {
				estadocomisionBeanSwingJInternalFrame=new EstadoComisionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =estadocomisionBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(TipoComisionConfigConstantesFunciones.CLASSNAME)) {
				tipocomisionconfigBeanSwingJInternalFrame=new TipoComisionConfigBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =tipocomisionconfigBeanSwingJInternalFrame;
			}

			else if(strPantalla.equals(VendedorConstantesFunciones.CLASSNAME)) {
				vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
				jinternalFrame =vendedorBeanSwingJInternalFrame;
			}
			
		} 
			
    	return jinternalFrame;
	}
}
