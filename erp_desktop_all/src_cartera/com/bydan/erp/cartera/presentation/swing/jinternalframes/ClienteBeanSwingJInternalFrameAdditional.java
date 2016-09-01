







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
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.PerfilBeanSwingJInternalFrame;

import com.bydan.framework.erp.business.entity.*;
import com.bydan.framework.erp.util.*;
import com.bydan.erp.cartera.util.ClienteConstantesFunciones;
import com.bydan.erp.cartera.business.entity.Cliente;
import com.bydan.erp.cartera.business.entity.Novedad;

import com.bydan.erp.cartera.business.logic.*;
////import com.bydan.erp.cartera.service.ejb.interfaces.ClienteAdditionable;
////import com.bydan.erp.cartera.service.ejb.interfaces.ClienteAdditionableHome;
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
public class ClienteBeanSwingJInternalFrameAdditional extends JInternalFrameBase//ClienteBeanSwingJInternalFrame
{
private static final long serialVersionUID = 1L;
	//CONTROL_INICIO
	ClienteLogic clienteLogic;
	ClienteLogicAdditional clienteLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  ClienteBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			clienteLogic=new ClienteLogic();
			clienteLogicAdditional=new ClienteLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormCliente(ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
		//CONTROL_1
	}
	
	public static void	RecargarVentanaSegunOpcion(JInternalFrameBase jInternalFrameBase,Opcion opcionActual) throws Exception {	
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
		ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=(ClienteBeanSwingJInternalFrame)jInternalFrameBase;
		
		ArrayList<Classe> clases=new ArrayList<Classe>();
		Classe clase=new Classe();
		
		ArrayList<Classe> campos=new ArrayList<Classe>();
		Classe campo=new Classe();
		
		Opcion opcionActual=clienteBeanSwingJInternalFrame.getOpcionActual();
		String sCodigoOpcion=opcionActual.getcodigo();
		
		//System.out.println(sCodigoOpcion);
		
		switch(sCodigoOpcion) {
			case "NOVEDADCLIENTE":
				//clienteBeanSwingJInternalFrame.setBorderResaltarNovedad();
				clases=new ArrayList<Classe>();
				clase=new Classe(Novedad.class);clases.add(clase);
				
				clienteBeanSwingJInternalFrame.clienteConstantesFunciones.setMostrarRelaciones(DeepLoadType.INCLUDE,clases);
				clienteBeanSwingJInternalFrame.clienteConstantesFunciones.setResaltarRelaciones(DeepLoadType.INCLUDE,clases,clienteBeanSwingJInternalFrame.getParametroGeneralUsuario());
				
				break;
			
			case "RUTACLIENTE":
				campos=new ArrayList<Classe>();
				campo=new Classe(ClienteConstantesFunciones.IDRUTA);campos.add(campo);
				
				//clienteBeanSwingJInternalFrame.setBorderResaltarid_ruta();
				clienteBeanSwingJInternalFrame.clienteConstantesFunciones.setResaltarCampos(DeepLoadType.INCLUDE, campos,clienteBeanSwingJInternalFrame.getParametroGeneralUsuario());
				
				campos=new ArrayList<Classe>();
				campo=new Classe(ClienteConstantesFunciones.IDRUTA);campos.add(campo);
				campo=new Classe(ClienteConstantesFunciones.NOMBRE);campos.add(campo);
					
				clienteBeanSwingJInternalFrame.clienteConstantesFunciones.setMostrarCampos(DeepLoadType.INCLUDE, campos);
				
				
				clases=new ArrayList<Classe>();
				clienteBeanSwingJInternalFrame.clienteConstantesFunciones.setMostrarRelaciones(DeepLoadType.INCLUDE,clases);
				
				break;
				
			default:
				break;
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