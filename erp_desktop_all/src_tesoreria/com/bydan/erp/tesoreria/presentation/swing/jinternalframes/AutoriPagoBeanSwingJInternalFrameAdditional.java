

/*
*ADVERTENCIA : Este programa esta protegido por la ley de derechos de autor.
*La reproducci?n o distribuci?n il?cita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y ser?n objeto de todas las sanciones legales que correspondan.
*/
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;

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
import com.bydan.erp.tesoreria.util.AutoriPagoConstantesFunciones;
import com.bydan.erp.tesoreria.business.entity.AutoriPago;

import com.bydan.erp.tesoreria.business.logic.*;

//import com.bydan.erp.tesoreria.service.ejb.interfaces.*;
//import com.bydan.erp.tesoreria.service.ejb.interfaces.*;

////import com.bydan.erp.tesoreria.service.ejb.interfaces.AutoriPagoAdditionable;
////import com.bydan.erp.tesoreria.service.ejb.interfaces.AutoriPagoAdditionableHome;
//import com.bydan.erp.tesoreria.business.entity.*;
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

//import com.bydan.erp.tesoreria.service.ejb.interfaces.AutoriPagoAdditionable;
////import com.bydan.erp.tesoreria.service.ejb.interfaces.AutoriPagoAdditionableHome;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class AutoriPagoBeanSwingJInternalFrameAdditional extends JInternalFrameBase//AutoriPagoBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	//public static AutoriPagoAdditionable autoripagoAdditionable= AutoriPagoConstantesFunciones.getAutoriPagoAdditionableEjbReference(AutoriPagoConstantesFunciones.SREMOTEEJBNAMEADDITIONAL_JBOSS81);
	//public static AutoriPagoAdditionableHome autoripagoAdditionableHome= AutoriPagoConstantesFunciones.getAutoriPagoAdditionableHomeEjbReference(AutoriPagoConstantesFunciones.SLOCALEJBNAMEADDITIONAL_JBOSS81);		
	
	//CONTROL_INICIO
	AutoriPagoLogic autoripagoLogic;
	AutoriPagoLogicAdditional autoripagoLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  AutoriPagoBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			autoripagoLogic=new AutoriPagoLogic();
			autoripagoLogicAdditional=new AutoriPagoLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormAutoriPago(AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
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
		AutoriPagoLogicAdditional autoripagoLogicAdditional=new AutoriPagoLogicAdditional();
		
		AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFrame=(AutoriPagoBeanSwingJInternalFrame)jInternalFrameBase;
		
		if(JOptionPane.showConfirmDialog(jInternalFrameBase, "ESTA SEGURO DE PROCESAR "+sLabelProceso+" AUTORI PAGOS SELECCIONADOS?", "MANTENIMIENTO DE ACCION", JOptionPane.OK_CANCEL_OPTION) == 0) {
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {	//TO_COMMENT
				esProcesado=autoripagoLogicAdditional.ProcesarAccion(autoripagoBeanSwingJInternalFrame.getParametroGeneralUsuario(),autoripagoBeanSwingJInternalFrame.getModuloActual(),autoripagoBeanSwingJInternalFrame.getOpcionActual(),autoripagoBeanSwingJInternalFrame.getUsuarioActual(),sProceso,autoripagoBeanSwingJInternalFrame.getAutoriPagoLogic().getAutoriPagos());
			} else if(Constantes.ISUSAEJBREMOTE) {//TO_COMMENT
				//esProcesado=autoripagoAdditionable.ProcesarAccion(autoripagoBeanSwingJInternalFrame.getParametroGeneralUsuario(),autoripagoBeanSwingJInternalFrame.getModuloActual(),autoripagoBeanSwingJInternalFrame.getOpcionActual(),autoripagoBeanSwingJInternalFrame.getUsuarioActual(),autoripagoBeanSwingJInternalFrame.datosCliente,sProceso,autoripagoBeanSwingJInternalFrame.getautoripagos());//TO_COMMENT
			} else if(Constantes.ISUSAEJBHOME) {//TO_COMMENT
				//esProcesado=autoripagoAdditionableHome.ProcesarAccion(autoripagoBeanSwingJInternalFrame.getParametroGeneralUsuario(),autoripagoBeanSwingJInternalFrame.getModuloActual(),autoripagoBeanSwingJInternalFrame.getOpcionActual(),autoripagoBeanSwingJInternalFrame.getUsuarioActual(),autoripagoBeanSwingJInternalFrame.datosCliente,sProceso,autoripagoBeanSwingJInternalFrame.getautoripagos());//TO_COMMENT
			}//TO_COMMENT
			//ARCHITECTURE
			
			if(esProcesado) {
				JOptionPane.showMessageDialog(autoripagoBeanSwingJInternalFrame,"PROCESO REALIZADO CORRECTAMENTE","PROCESO ",JOptionPane.INFORMATION_MESSAGE);		
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