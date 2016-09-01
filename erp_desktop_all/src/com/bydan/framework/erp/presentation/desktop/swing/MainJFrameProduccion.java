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
public class MainJFrameProduccion {
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
    	
    	//PRODUCCION

		EstadoOrdenProduBeanSwingJInternalFrame estadoordenproduBeanSwingJInternalFrame=null;
		OrdenProduBeanSwingJInternalFrame ordenproduBeanSwingJInternalFrame=null;
		ParametroProduBeanSwingJInternalFrame parametroproduBeanSwingJInternalFrame=null;
		ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrame=null;
		ProductoProduBeanSwingJInternalFrame productoproduBeanSwingJInternalFrame=null;
		TipoGastoProduBeanSwingJInternalFrame tipogastoproduBeanSwingJInternalFrame=null;
		TipoGastoProduEmpresaBeanSwingJInternalFrame tipogastoproduempresaBeanSwingJInternalFrame=null;
		TipoManoProduEmpresaBeanSwingJInternalFrame tipomanoproduempresaBeanSwingJInternalFrame=null;
		TipoMermaBeanSwingJInternalFrame tipomermaBeanSwingJInternalFrame=null;
		TipoMermaEmpresaBeanSwingJInternalFrame tipomermaempresaBeanSwingJInternalFrame=null;
		TipoProcesoProduBeanSwingJInternalFrame tipoprocesoproduBeanSwingJInternalFrame=null;
		PedidoDetaProduBeanSwingJInternalFrame pedidodetaproduBeanSwingJInternalFrame=null;
		PedidoProduBeanSwingJInternalFrame pedidoproduBeanSwingJInternalFrame=null;
		ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFrame=null;
		ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFrame=null;
		TipoAreaEmpresaProduBeanSwingJInternalFrame tipoareaempresaproduBeanSwingJInternalFrame=null;
		TipoMaquinaEmpresaBeanSwingJInternalFrame tipomaquinaempresaBeanSwingJInternalFrame=null;
		TipoPrioridadEmpresaProduBeanSwingJInternalFrame tipoprioridadempresaproduBeanSwingJInternalFrame=null;
		TipoProcesoEmpresaProduBeanSwingJInternalFrame tipoprocesoempresaproduBeanSwingJInternalFrame=null;
		
				
		//RELACIONES
		ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
		FormaPagoBeanSwingJInternalFrame formapagoBeanSwingJInternalFrame;
		VariableNomiBeanSwingJInternalFrame variablenomiBeanSwingJInternalFrame;
		VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
				
		
		
		if(strPaquete.equals(Constantes.SMODULO_PRODUCCION)) {
    		
    		if(strPantalla.equals(EstadoOrdenProduConstantesFunciones.CLASSNAME)) {
    			estadoordenproduBeanSwingJInternalFrame=new EstadoOrdenProduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =estadoordenproduBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(OrdenProduConstantesFunciones.CLASSNAME)) {
    			ordenproduBeanSwingJInternalFrame=new OrdenProduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =ordenproduBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(ParametroProduConstantesFunciones.CLASSNAME)) {
    			parametroproduBeanSwingJInternalFrame=new ParametroProduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =parametroproduBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(ProductoDefiProduConstantesFunciones.CLASSNAME)) {
    			productodefiproduBeanSwingJInternalFrame=new ProductoDefiProduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =productodefiproduBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(ProductoProduConstantesFunciones.CLASSNAME)) {
    			productoproduBeanSwingJInternalFrame=new ProductoProduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =productoproduBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(TipoGastoProduConstantesFunciones.CLASSNAME)) {
    			tipogastoproduBeanSwingJInternalFrame=new TipoGastoProduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipogastoproduBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(TipoGastoProduEmpresaConstantesFunciones.CLASSNAME)) {
    			tipogastoproduempresaBeanSwingJInternalFrame=new TipoGastoProduEmpresaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipogastoproduempresaBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(TipoManoProduEmpresaConstantesFunciones.CLASSNAME)) {
    			tipomanoproduempresaBeanSwingJInternalFrame=new TipoManoProduEmpresaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipomanoproduempresaBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(TipoMermaConstantesFunciones.CLASSNAME)) {
    			tipomermaBeanSwingJInternalFrame=new TipoMermaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipomermaBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(TipoMermaEmpresaConstantesFunciones.CLASSNAME)) {
    			tipomermaempresaBeanSwingJInternalFrame=new TipoMermaEmpresaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipomermaempresaBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(TipoProcesoProduConstantesFunciones.CLASSNAME)) {
    			tipoprocesoproduBeanSwingJInternalFrame=new TipoProcesoProduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipoprocesoproduBeanSwingJInternalFrame;
    		} else if(strPantalla.equals(PedidoDetaProduConstantesFunciones.CLASSNAME)) {
    			pedidodetaproduBeanSwingJInternalFrame=new PedidoDetaProduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =pedidodetaproduBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(PedidoProduConstantesFunciones.CLASSNAME)) {
    			pedidoproduBeanSwingJInternalFrame=new PedidoProduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =pedidoproduBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(ProductoOrdenDetaProduMaquinaConstantesFunciones.CLASSNAME)) {
    			productoordendetaprodumaquinaBeanSwingJInternalFrame=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =productoordendetaprodumaquinaBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(ProductoProduMaquinaConstantesFunciones.CLASSNAME)) {
    			productoprodumaquinaBeanSwingJInternalFrame=new ProductoProduMaquinaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =productoprodumaquinaBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(TipoAreaEmpresaProduConstantesFunciones.CLASSNAME)) {
    			tipoareaempresaproduBeanSwingJInternalFrame=new TipoAreaEmpresaProduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipoareaempresaproduBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(TipoMaquinaEmpresaConstantesFunciones.CLASSNAME)) {
    			tipomaquinaempresaBeanSwingJInternalFrame=new TipoMaquinaEmpresaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipomaquinaempresaBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME)) {
    			tipoprioridadempresaproduBeanSwingJInternalFrame=new TipoPrioridadEmpresaProduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipoprioridadempresaproduBeanSwingJInternalFrame;
    		}

    		else if(strPantalla.equals(TipoProcesoEmpresaProduConstantesFunciones.CLASSNAME)) {
    			tipoprocesoempresaproduBeanSwingJInternalFrame=new TipoProcesoEmpresaProduBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
    			jinternalFrame =tipoprocesoempresaproduBeanSwingJInternalFrame;
    		
    		}
    		
		}
		
    	return jinternalFrame;
    	
	}
}
