


/*
*ADVERTENCIA : Este programa esta protegido por la ley de derechos de autor.
*La reproducci?n o distribuci?n il?cita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y ser?n objeto de todas las sanciones legales que correspondan.
*/
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;

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
//import com.bydan.erp.puntoventa.util.PuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.business.entity.report.ProcesoCierreCaja;

import com.bydan.erp.puntoventa.business.logic.report.*;


//////import com.bydan.erp.puntoventa.service.ejb.interfaces.PuntoVentaAdditionable;
//////import com.bydan.erp.puntoventa.service.ejb.interfaces.PuntoVentaAdditionableHome;
//import com.bydan.erp.puntoventa.business.entity.*;
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

//import com.bydan.erp.puntoventa.service.ejb.interfaces.PuntoVentaAdditionable;
////import com.bydan.erp.puntoventa.service.ejb.interfaces.PuntoVentaAdditionableHome;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class ProcesoCierreCajaBeanSwingJInternalFrameAdditional extends JInternalFrameBase//ProcesoCierreCajaBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	
	//CONTROL_INICIO
	//ProcesoCierreCajaLogic procesocierrecajaLogic;
	//ProcesoCierreCajaLogicAdditional procesocierrecajaLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  ProcesoCierreCajaBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			//procesocierrecajaLogic=new ProcesoCierreCajaLogic();
			//procesocierrecajaLogicAdditional=new ProcesoCierreCajaLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormProcesoCierreCaja(ProcesoCierreCajaBeanSwingJInternalFrame procesocierrecajaBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
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
	
	public static void ProcesarInformacionProcesoCierreCaja(ProcesoCierreCajaBeanSwingJInternalFrame jBeanInternalFrame) throws Exception {
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	//TO_COMMENT
			jBeanInternalFrame.procesocierrecajaLogic.ProcesarInformacionProcesoCierreCaja(jBeanInternalFrame.getParametroGeneralUsuario(),jBeanInternalFrame.getModuloActual(),jBeanInternalFrame.getOpcionActual(),jBeanInternalFrame.getUsuarioActual(),jBeanInternalFrame.procesocierrecajaLogic.getProcesoCierreCajas(),jBeanInternalFrame.sTipoBusqueda,jBeanInternalFrame.id_usuarioBusquedaProcesoCierreCaja,jBeanInternalFrame.id_cajaBusquedaProcesoCierreCaja,jBeanInternalFrame.fechaBusquedaProcesoCierreCaja);
		} else if(Constantes.ISUSAEJBREMOTE) {//TO_COMMENT
			//ProcesoCierreCajaBeanSwingJInternalFrame.procesocierrecajaImplementable.ProcesarInformacionProcesoCierreCaja(jBeanInternalFrame.datosCliente,jBeanInternalFrame.getParametroGeneralUsuario(),jBeanInternalFrame.getModuloActual(),jBeanInternalFrame.getOpcionActual(),jBeanInternalFrame.getUsuarioActual(),jBeanInternalFrame.procesocierrecajas,jBeanInternalFrame.sTipoBusqueda,jBeanInternalFrame.id_usuarioBusquedaProcesoCierreCaja,jBeanInternalFrame.id_cajaBusquedaProcesoCierreCaja,jBeanInternalFrame.fechaBusquedaProcesoCierreCaja);//TO_COMMENT
			//((ProcesoCierreCajaBeanSwingJInternalFrame)jBeanInternalFrame).procesocierrecajaImplementable.ProcesarInformacionProcesoCierreCaja(jBeanInternalFrame.datosCliente,jBeanInternalFrame.getParametroGeneralUsuario(),jBeanInternalFrame.getModuloActual(),jBeanInternalFrame.getOpcionActual(),jBeanInternalFrame.getUsuarioActual(),jBeanInternalFrame.procesocierrecajas,jBeanInternalFrame.sTipoBusqueda,jBeanInternalFrame.id_usuarioBusquedaProcesoCierreCaja,jBeanInternalFrame.id_cajaBusquedaProcesoCierreCaja,jBeanInternalFrame.fechaBusquedaProcesoCierreCaja);//TO_COMMENT
		} else if(Constantes.ISUSAEJBHOME) {//TO_COMMENT
			//ProcesoCierreCajaBeanSwingJInternalFrame.procesocierrecajaImplementableHome.ProcesarInformacionProcesoCierreCaja(jBeanInternalFrame.datosCliente,jBeanInternalFrame.getParametroGeneralUsuario(),jBeanInternalFrame.getModuloActual(),jBeanInternalFrame.getOpcionActual(),jBeanInternalFrame.getUsuarioActual(),jBeanInternalFrame.procesocierrecajas,jBeanInternalFrame.sTipoBusqueda,jBeanInternalFrame.id_usuarioBusquedaProcesoCierreCaja,jBeanInternalFrame.id_cajaBusquedaProcesoCierreCaja,jBeanInternalFrame.fechaBusquedaProcesoCierreCaja);//TO_COMMENT
			//((ProcesoCierreCajaBeanSwingJInternalFrame)jBeanInternalFrame).procesocierrecajaImplementableHome.ProcesarInformacionProcesoCierreCaja(jBeanInternalFrame.datosCliente,jBeanInternalFrame.getParametroGeneralUsuario(),jBeanInternalFrame.getModuloActual(),jBeanInternalFrame.getOpcionActual(),jBeanInternalFrame.getUsuarioActual(),jBeanInternalFrame.procesocierrecajas,jBeanInternalFrame.sTipoBusqueda,jBeanInternalFrame.id_usuarioBusquedaProcesoCierreCaja,jBeanInternalFrame.id_cajaBusquedaProcesoCierreCaja,jBeanInternalFrame.fechaBusquedaProcesoCierreCaja);//TO_COMMENT
		}//TO_COMMENT
		//ARCHITECTURE
	}
	
	public static void ProcesarAccion(String sProceso,String sLabelProceso,JInternalFrameBase jInternalFrameBase) throws Exception {
		//CONTROL_3
		Boolean esProcesado=false;
		ProcesoCierreCajaLogicAdditional procesocierrecajaLogicAdditional=new ProcesoCierreCajaLogicAdditional();
		
		ProcesoCierreCajaBeanSwingJInternalFrame procesocierrecajaBeanSwingJInternalFrame=(ProcesoCierreCajaBeanSwingJInternalFrame)jInternalFrameBase;
		
		if(JOptionPane.showConfirmDialog(jInternalFrameBase, "ESTA SEGURO DE PROCESAR "+sLabelProceso+" PROCESO CIERRE CAJAS SELECCIONADOS?", "MANTENIMIENTO DE ACCION", JOptionPane.OK_CANCEL_OPTION) == 0) {
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {	//TO_COMMENT
				esProcesado=procesocierrecajaLogicAdditional.ProcesarAccion(procesocierrecajaBeanSwingJInternalFrame.getParametroGeneralUsuario(),procesocierrecajaBeanSwingJInternalFrame.getModuloActual(),procesocierrecajaBeanSwingJInternalFrame.getOpcionActual(),procesocierrecajaBeanSwingJInternalFrame.getUsuarioActual(),sProceso,procesocierrecajaBeanSwingJInternalFrame.getProcesoCierreCajaLogic().getProcesoCierreCajas());
			} else if(Constantes.ISUSAEJBREMOTE) {//TO_COMMENT
			} else if(Constantes.ISUSAEJBHOME) {//TO_COMMENT
			}//TO_COMMENT
			//ARCHITECTURE
			
			if(esProcesado) {
				JOptionPane.showMessageDialog(procesocierrecajaBeanSwingJInternalFrame,"PROCESO REALIZADO CORRECTAMENTE","PROCESO ",JOptionPane.INFORMATION_MESSAGE);		
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