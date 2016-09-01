








/*
*ADVERTENCIA : Este programa esta protegido por la ley de derechos de autor.
*La reproducci?n o distribuci?n il?cita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y ser?n objeto de todas las sanciones legales que correspondan.
*/
package com.bydan.erp.cartera.presentation.swing.jinternalframes;

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
import com.bydan.erp.cartera.util.DetalleClienteConstantesFunciones;
import com.bydan.erp.cartera.business.entity.DetalleCliente;

import com.bydan.erp.cartera.business.logic.*;
//import com.bydan.erp.cartera.service.ejb.interfaces.DetalleClienteAdditionable;
//import com.bydan.erp.cartera.service.ejb.interfaces.DetalleClienteAdditionableHome;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.AsientoContableBeanSwingJInternalFrame;
//import com.bydan.erp.cartera.business.entity.*;
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

import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;

import org.hibernate.collection.PersistentBag;

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


import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class DetalleClienteBeanSwingJInternalFrameAdditional extends JInternalFrameBase//DetalleClienteBeanSwingJInternalFrame
{
private static final long serialVersionUID = 1L;
	//CONTROL_INICIO
	DetalleClienteLogic detalleclienteLogic;
	DetalleClienteLogicAdditional detalleclienteLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  DetalleClienteBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			detalleclienteLogic=new DetalleClienteLogic();
			detalleclienteLogicAdditional=new DetalleClienteLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormDetalleCliente(DetalleClienteBeanSwingJInternalFrame detalleclienteBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
		//CONTROL_1
	}
	
	public static void RecargarVentanaSegunOpcion(JInternalFrameBase jInternalFrameBase,Opcion opcionActual) throws Exception {
		//CONTROL_2
	}

	public static void	ProcesarAccion(String sProceso,String sLabelProceso,JInternalFrameBase jInternalFrameBase) throws Exception {
		//CONTROL_3
	}

	public static void CargaInicial(JInternalFrameBase jInternalFrameBase,String sTipo,Object objectGeneral) throws Exception {
		//CONTROL_4
	}
	public static void CargaInicialInicio(JInternalFrameBase jInternalFrameBase,String sTipo,Object objectGeneral) throws Exception {
		//CONTROL_5
		ArrayList<Classe> campos=new ArrayList<Classe>();
		Classe classe=new Classe();
		
		DetalleClienteBeanSwingJInternalFrame detalleClienteBeanSwingJInternalFrame=(DetalleClienteBeanSwingJInternalFrame)jInternalFrameBase;				
		
		Border borderResaltar=Funciones2.getBorderResaltar(detalleClienteBeanSwingJInternalFrame.getParametroGeneralUsuario(),"PARAMETRO");
		
		if(Constantes.ISDEVELOPING) {
			System.out.println(detalleClienteBeanSwingJInternalFrame.getOpcionActual().getnombre());
		}
		
		if(detalleClienteBeanSwingJInternalFrame.getOpcionActual().getnombre().equals("MODIFICAR FECHAS VENCIMIENTO FACTURAS")) {
			classe=new Classe(DetalleClienteConstantesFunciones.FECHAVENCE);
			campos.add(classe);
			
			detalleClienteBeanSwingJInternalFrame.detalleclienteConstantesFunciones.setActivarCampos(DeepLoadType.INCLUDE,campos);
			detalleClienteBeanSwingJInternalFrame.detalleclienteConstantesFunciones.setResaltarfecha_venceDetalleCliente(detalleClienteBeanSwingJInternalFrame.getParametroGeneralUsuario());
			
			
			//RESALTAR BUSQUEDAS
			detalleClienteBeanSwingJInternalFrame.detalleclienteConstantesFunciones.setResaltarFK_IdAsientoContableDetalleCliente(detalleClienteBeanSwingJInternalFrame.getParametroGeneralUsuario());
			detalleClienteBeanSwingJInternalFrame.detalleclienteConstantesFunciones.setResaltarFK_IdClienteDetalleCliente(detalleClienteBeanSwingJInternalFrame.getParametroGeneralUsuario());
			detalleClienteBeanSwingJInternalFrame.detalleclienteConstantesFunciones.setResaltarFK_IdFacturaDetalleCliente(detalleClienteBeanSwingJInternalFrame.getParametroGeneralUsuario());
			
			//asientoContableBeanSwingJInternalFrame.setBorderResaltarTiposAccionesAsientoContable();
			//asientoContableBeanSwingJInternalFrame.setBorderResaltarSeleccionarAsientoContable();
		}
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