




/*
*ADVERTENCIA : Este programa esta protegido por la ley de derechos de autor.
*La reproducci?n o distribuci?n il?cita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y ser?n objeto de todas las sanciones legales que correspondan.
*/
package com.bydan.erp.seguridad.presentation.swing.jinternalframes.report;

import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;


import com.bydan.framework.erp.business.entity.*;
import com.bydan.framework.erp.util.*;
//import com.bydan.erp.seguridad.util.SeguridadConstantesFunciones;
import com.bydan.erp.seguridad.business.entity.report.ProcesoCambiarParametroGeneral;

import com.bydan.erp.seguridad.business.logic.report.*;


//////import com.bydan.erp.seguridad.service.ejb.interfaces.SeguridadAdditionable;
//////import com.bydan.erp.seguridad.service.ejb.interfaces.SeguridadAdditionableHome;
//import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.logic.QueryWhereSelectParameters;
//import com.bydan.framework.erp.business.logic.*;

//import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;

//import org.hibernate.collection.PersistentBag;

import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.MutableTreeNode;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;


import com.bydan.framework.erp.business.entity.DatoGeneral;

//import com.bydan.erp.seguridad.service.ejb.interfaces.SeguridadAdditionable;
////import com.bydan.erp.seguridad.service.ejb.interfaces.SeguridadAdditionableHome;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional extends JInternalFrameBase//ProcesoCambiarParametroGeneralBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	//public static SeguridadAdditionable seguridadAdditionable= ProcesoCambiarParametroGeneralConstantesFunciones.getProcesoCambiarParametroGeneralAdditionableEjbReference(ProcesoCambiarParametroGeneralConstantesFunciones.SREMOTEEJBNAMEADDITIONALADDITIONAL_JBOSS81);
	//public static SeguridadAdditionableHome seguridadAdditionableHome= ProcesoCambiarParametroGeneralConstantesFunciones.getProcesoCambiarParametroGeneralAdditionableHomeEjbReference(ProcesoCambiarParametroGeneralConstantesFunciones.SLOCALEJBNAMEADDITIONALADDITIONAL_JBOSS81);		
	
	//CONTROL_INICIO
	//ProcesoCambiarParametroGeneralLogic procesocambiarparametrogeneralLogic;
	//ProcesoCambiarParametroGeneralLogicAdditional procesocambiarparametrogeneralLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  ProcesoCambiarParametroGeneralBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			//procesocambiarparametrogeneralLogic=new ProcesoCambiarParametroGeneralLogic();
			//procesocambiarparametrogeneralLogicAdditional=new ProcesoCambiarParametroGeneralLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame procesocambiarparametrogeneralBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
		//CONTROL_1
	}
	
	public static void	RecargarVentanaSegunOpcion(JInternalFrameBase jInternalFrameBase,Opcion opcionActual) throws Exception {	
		//CONTROL_2
	}
	
	/*
	public static void	ProcesarAccion(String sProceso,JInternalFrameBase jInternalFrameBase) throws Exception {	
		//CONTROL_3
	}
	*/
	
	public static void ProcesarInformacionProcesoCambiarParametroGeneral(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame jBeanInternalFrame) throws Exception {
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	//TO_COMMENT
			jBeanInternalFrame.procesocambiarparametrogeneralLogic.ProcesarInformacionProcesoCambiarParametroGeneral(jBeanInternalFrame.getParametroGeneralUsuario(),jBeanInternalFrame.getModuloActual(),jBeanInternalFrame.getOpcionActual(),jBeanInternalFrame.getUsuarioActual(),jBeanInternalFrame.procesocambiarparametrogeneralLogic.getProcesoCambiarParametroGenerals(),jBeanInternalFrame.sTipoBusqueda,jBeanInternalFrame.id_tipo_visualBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.con_botones_tool_barBusquedaProcesoCambiarParametroGeneral
																	,jBeanInternalFrame.id_tipo_fondoBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_exportarBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.path_exportarBusquedaProcesoCambiarParametroGeneral);
		} else if(Constantes.ISUSAEJBREMOTE) {//TO_COMMENT
			//ProcesoCambiarParametroGeneralBeanSwingJInternalFrame.procesocambiarparametrogeneralImplementable.ProcesarInformacionProcesoCambiarParametroGeneral(jBeanInternalFrame.datosCliente,jBeanInternalFrame.getParametroGeneralUsuario(),jBeanInternalFrame.getModuloActual(),jBeanInternalFrame.getOpcionActual(),jBeanInternalFrame.getUsuarioActual(),jBeanInternalFrame.procesocambiarparametrogenerals,jBeanInternalFrame.sTipoBusqueda,jBeanInternalFrame.id_tipo_visualBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.con_botones_tool_barBusquedaProcesoCambiarParametroGeneral
			//,jBeanInternalFrame.id_tipo_fondoBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_exportarBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.path_exportarBusquedaProcesoCambiarParametroGeneral);//TO_COMMENT
		} else if(Constantes.ISUSAEJBHOME) {//TO_COMMENT
			//ProcesoCambiarParametroGeneralBeanSwingJInternalFrame.procesocambiarparametrogeneralImplementableHome.ProcesarInformacionProcesoCambiarParametroGeneral(jBeanInternalFrame.datosCliente,jBeanInternalFrame.getParametroGeneralUsuario(),jBeanInternalFrame.getModuloActual(),jBeanInternalFrame.getOpcionActual(),jBeanInternalFrame.getUsuarioActual(),jBeanInternalFrame.procesocambiarparametrogenerals,jBeanInternalFrame.sTipoBusqueda,jBeanInternalFrame.id_tipo_visualBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.con_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.con_botones_tool_barBusquedaProcesoCambiarParametroGeneral
			//		,jBeanInternalFrame.id_tipo_fondoBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_fondo_bordeBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_fondo_controlBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_tamanio_controlBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_exportarBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.id_tipo_delimiterBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.con_exportar_cabeceraBusquedaProcesoCambiarParametroGeneral,jBeanInternalFrame.path_exportarBusquedaProcesoCambiarParametroGeneral);//TO_COMMENT
		}//TO_COMMENT
		//ARCHITECTURE
	}
	
	public static void ProcesarAccion(String sProceso,String sLabelProceso,JInternalFrameBase jInternalFrameBase) throws Exception {
		//CONTROL_3
		Boolean esProcesado=false;
		ProcesoCambiarParametroGeneralLogicAdditional procesocambiarparametrogeneralLogicAdditional=new ProcesoCambiarParametroGeneralLogicAdditional();
		
		ProcesoCambiarParametroGeneralBeanSwingJInternalFrame procesocambiarparametrogeneralBeanSwingJInternalFrame=(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame)jInternalFrameBase;
		
		if(JOptionPane.showConfirmDialog(jInternalFrameBase, "ESTA SEGURO DE PROCESAR "+sLabelProceso+" PROCESO CAMBIAR PARAMETRO GENERALES SELECCIONADOS?", "MANTENIMIENTO DE ACCION", JOptionPane.OK_CANCEL_OPTION) == 0) {
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {	//TO_COMMENT
				esProcesado=procesocambiarparametrogeneralLogicAdditional.ProcesarAccion(procesocambiarparametrogeneralBeanSwingJInternalFrame.getParametroGeneralUsuario(),procesocambiarparametrogeneralBeanSwingJInternalFrame.getModuloActual(),procesocambiarparametrogeneralBeanSwingJInternalFrame.getOpcionActual(),procesocambiarparametrogeneralBeanSwingJInternalFrame.getUsuarioActual(),sProceso,procesocambiarparametrogeneralBeanSwingJInternalFrame.getProcesoCambiarParametroGeneralLogic().getProcesoCambiarParametroGenerals());
			} else if(Constantes.ISUSAEJBREMOTE) {//TO_COMMENT
			} else if(Constantes.ISUSAEJBHOME) {//TO_COMMENT
			}//TO_COMMENT
			//ARCHITECTURE
			
			if(esProcesado) {
				JOptionPane.showMessageDialog(procesocambiarparametrogeneralBeanSwingJInternalFrame,"PROCESO REALIZADO CORRECTAMENTE","PROCESO ",JOptionPane.INFORMATION_MESSAGE);		
			}	
		}
	}
	
	public static void CargaInicial(JInternalFrameBase jInternalFrameBase,String sTipo,Object objectGeneral) throws Exception {
		//CONTROL_4
		ProcesoCambiarParametroGeneralBeanSwingJInternalFrame procesoCambiarParametroGeneralBeanSwingJInternalFrame=(ProcesoCambiarParametroGeneralBeanSwingJInternalFrame)jInternalFrameBase;
				
		procesoCambiarParametroGeneralBeanSwingJInternalFrame.jCheckBoxcon_mensaje_confirmacionBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelected(procesoCambiarParametroGeneralBeanSwingJInternalFrame.getParametroGeneralUsuario().getcon_mensaje_confirmacion());
		procesoCambiarParametroGeneralBeanSwingJInternalFrame.jCheckBoxcon_botones_tool_barBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelected(procesoCambiarParametroGeneralBeanSwingJInternalFrame.getParametroGeneralUsuario().getcon_botones_tool_bar());
		procesoCambiarParametroGeneralBeanSwingJInternalFrame.jTextAreapath_exportarBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setText(procesoCambiarParametroGeneralBeanSwingJInternalFrame.getParametroGeneralUsuario().getpath_exportar());
		procesoCambiarParametroGeneralBeanSwingJInternalFrame.jCheckBoxcon_exportar_cabeceraBusquedaProcesoCambiarParametroGeneralProcesoCambiarParametroGeneral.setSelected(procesoCambiarParametroGeneralBeanSwingJInternalFrame.getParametroGeneralUsuario().getcon_exportar_cabecera());
		
		procesoCambiarParametroGeneralBeanSwingJInternalFrame.setActualTipoVisualForeignKey(procesoCambiarParametroGeneralBeanSwingJInternalFrame.getParametroGeneralUsuario().getid_tipo_visual(),true,"BusquedaProcesoCambiarParametroGeneral");
		procesoCambiarParametroGeneralBeanSwingJInternalFrame.setActualTipoFondoForeignKey(procesoCambiarParametroGeneralBeanSwingJInternalFrame.getParametroGeneralUsuario().getid_tipo_fondo(),true,"BusquedaProcesoCambiarParametroGeneral");		
		procesoCambiarParametroGeneralBeanSwingJInternalFrame.setActualTipoFondoBordeForeignKey(procesoCambiarParametroGeneralBeanSwingJInternalFrame.getParametroGeneralUsuario().getid_tipo_fondo_borde(),true,"BusquedaProcesoCambiarParametroGeneral");
		procesoCambiarParametroGeneralBeanSwingJInternalFrame.setActualTipoFondoControlForeignKey(procesoCambiarParametroGeneralBeanSwingJInternalFrame.getParametroGeneralUsuario().getid_tipo_fondo_control(),true,"BusquedaProcesoCambiarParametroGeneral");
		procesoCambiarParametroGeneralBeanSwingJInternalFrame.setActualTipoTamanioControlForeignKey(procesoCambiarParametroGeneralBeanSwingJInternalFrame.getParametroGeneralUsuario().getid_tipo_tamanio_control_normal(),true,"BusquedaProcesoCambiarParametroGeneral");		
		procesoCambiarParametroGeneralBeanSwingJInternalFrame.setActualTipoExportarForeignKey(procesoCambiarParametroGeneralBeanSwingJInternalFrame.getParametroGeneralUsuario().getid_tipo_exportar(),true,"BusquedaProcesoCambiarParametroGeneral");
		procesoCambiarParametroGeneralBeanSwingJInternalFrame.setActualTipoDelimiterForeignKey(procesoCambiarParametroGeneralBeanSwingJInternalFrame.getParametroGeneralUsuario().getid_tipo_delimiter(),true,"BusquedaProcesoCambiarParametroGeneral");
	}
	public static void CargaInicialInicio(JInternalFrameBase jInternalFrameBase,String sTipo,Object objectGeneral) throws Exception {
		//CONTROL_5
	}
	public static Boolean EsProcesoAccionNormal(String sTipoProceso) throws Exception {
		//CONTROL_6
		Boolean esProcesoAccionNormal=true;

		if(sTipoProceso.equals("XYZ")) {
			//esProcesoAccionNormal=false;
		}

		return esProcesoAccionNormal;
	}

	public static GeneralEntityParameterReturnGeneral procesarEventosVista(ParametroGeneralUsuario parametroGeneralUsuario,Modulo modulo,Opcion opcion,Usuario usuario,JInternalFrameBase jInternalFrameBase,FuncionTipo funcionTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipo,Object object,Object objects,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,GeneralEntityParameterReturnGeneral generalEntityReturnGeneral)throws Exception {
		try {
			//CONTROL_7
			if(controlTipo.equals(ControlTipo.WINDOW)) {

			} else if(controlTipo.equals(ControlTipo.PANEL)) {

			} else if(controlTipo.equals(ControlTipo.FORM)) {

			} else if(controlTipo.equals(ControlTipo.BUTTON)) {

			} else if(controlTipo.equals(ControlTipo.COMBOBOX)) {

			} else if(controlTipo.equals(ControlTipo.TEXTBOX)) {

			} else if(controlTipo.equals(ControlTipo.CHECKBOX)) {

			} else if(controlTipo.equals(ControlTipo.TEXTAREA)) {

			} else if(controlTipo.equals(ControlTipo.TREE)) {
			}

			return generalEntityReturnGeneral;

		} catch(Exception e) {
			throw e;
		} finally {

		}
	}
	//CONTROL_FUNCION2
}