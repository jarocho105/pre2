/*
*ADVERTENCIA : Este programa esta protegido por la ley de derechos de autor.
*La reproducci?n o distribuci?n il?cita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y ser?n objeto de todas las sanciones legales que correspondan.
*/
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;

import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;

import com.bydan.framework.erp.util.*;
import com.bydan.erp.facturacion.util.PedidoExporConstantesFunciones;
import com.bydan.erp.facturacion.business.entity.PedidoExpor;

import com.bydan.erp.facturacion.business.logic.*;

//import com.bydan.erp.facturacion.service.ejb.interfaces.*;
//import com.bydan.erp.facturacion.service.ejb.interfaces.*;

////import com.bydan.erp.facturacion.service.ejb.interfaces.PedidoExporAdditionable;
////import com.bydan.erp.facturacion.service.ejb.interfaces.PedidoExporAdditionableHome;
//import com.bydan.erp.facturacion.business.entity.*;
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
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.*;

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
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;

//import com.bydan.erp.facturacion.service.ejb.interfaces.PedidoExporAdditionable;
//import com.bydan.erp.facturacion.service.ejb.interfaces.PedidoExporAdditionableHome;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class PedidoExporBeanSwingJInternalFrameAdditional extends JInternalFrameBase//PedidoExporBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	//public static PedidoExporAdditionable pedidoexporAdditionable= PedidoExporConstantesFunciones.getPedidoExporAdditionableEjbReference(PedidoExporConstantesFunciones.SREMOTEEJBNAMEADDITIONAL_JBOSS81);
	//public static PedidoExporAdditionableHome pedidoexporAdditionableHome= PedidoExporConstantesFunciones.getPedidoExporAdditionableHomeEjbReference(PedidoExporConstantesFunciones.SLOCALEJBNAMEADDITIONAL_JBOSS81);		
	
	//CONTROL_INICIO
	PedidoExporLogic pedidoexporLogic;
	PedidoExporLogicAdditional pedidoexporLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  PedidoExporBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			pedidoexporLogic=new PedidoExporLogic();
			pedidoexporLogicAdditional=new PedidoExporLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormPedidoExpor(PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
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
	
	public static void CargaInicial(JInternalFrameBase jInternalFrameBase,String sTipo,Object objectGeneral) throws Exception {
		//CONTROL_4
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
	
	
	public static void ProcesarAccion(String sProceso,String sLabelProceso,JInternalFrameBase jInternalFrameBase) throws Exception {
		//CONTROL_3
		Boolean esProcesado=false;
		PedidoExporLogicAdditional pedidoexporLogicAdditional=new PedidoExporLogicAdditional();
		
		PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame=(PedidoExporBeanSwingJInternalFrame)jInternalFrameBase;
		
		if(JOptionPane.showConfirmDialog(jInternalFrameBase, "ESTA SEGURO DE PROCESAR "+sLabelProceso+" PEDIDO EXPORTACIONS SELECCIONADOS?", "MANTENIMIENTO DE ACCION", JOptionPane.OK_CANCEL_OPTION) == 0) {
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {	//TO_COMMENT
				esProcesado=pedidoexporLogicAdditional.ProcesarAccion(pedidoexporBeanSwingJInternalFrame.getParametroGeneralUsuario(),pedidoexporBeanSwingJInternalFrame.getModuloActual(),pedidoexporBeanSwingJInternalFrame.getOpcionActual(),pedidoexporBeanSwingJInternalFrame.getUsuarioActual(),sProceso,pedidoexporBeanSwingJInternalFrame.getPedidoExporLogic().getPedidoExpors());
			} else if(Constantes.ISUSAEJBREMOTE) {//TO_COMMENT
				//esProcesado=pedidoexporAdditionable.ProcesarAccion(pedidoexporBeanSwingJInternalFrame.getParametroGeneralUsuario(),pedidoexporBeanSwingJInternalFrame.getModuloActual(),pedidoexporBeanSwingJInternalFrame.getOpcionActual(),pedidoexporBeanSwingJInternalFrame.getUsuarioActual(),pedidoexporBeanSwingJInternalFrame.datosCliente,sProceso,pedidoexporBeanSwingJInternalFrame.getpedidoexpors());//TO_COMMENT
			} else if(Constantes.ISUSAEJBHOME) {//TO_COMMENT
				//esProcesado=pedidoexporAdditionableHome.ProcesarAccion(pedidoexporBeanSwingJInternalFrame.getParametroGeneralUsuario(),pedidoexporBeanSwingJInternalFrame.getModuloActual(),pedidoexporBeanSwingJInternalFrame.getOpcionActual(),pedidoexporBeanSwingJInternalFrame.getUsuarioActual(),pedidoexporBeanSwingJInternalFrame.datosCliente,sProceso,pedidoexporBeanSwingJInternalFrame.getpedidoexpors());//TO_COMMENT
			}//TO_COMMENT
			//ARCHITECTURE
			
			if(esProcesado) {
				JOptionPane.showMessageDialog(pedidoexporBeanSwingJInternalFrame,"PROCESO REALIZADO CORRECTAMENTE","PROCESO ",JOptionPane.INFORMATION_MESSAGE);		
			}	
		}
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

