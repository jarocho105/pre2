







/*
*ADVERTENCIA : Este programa esta protegido por la ley de derechos de autor.
*La reproducci?n o distribuci?n il?cita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y ser?n objeto de todas las sanciones legales que correspondan.
*/
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;

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
import com.bydan.erp.facturacion.business.logic.DetalleFacturaLogicAdditional;
import com.bydan.erp.puntoventa.util.FacturaPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.business.entity.FacturaPuntoVenta;
import com.bydan.erp.puntoventa.business.logic.*;

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





import com.bydan.framework.erp.business.entity.DatoGeneral;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class FacturaPuntoVentaBeanSwingJInternalFrameAdditional extends JInternalFrameBase//FacturaPuntoVentaBeanSwingJInternalFrame
{
private static final long serialVersionUID = 1L;
	//CONTROL_INICIO
	FacturaPuntoVentaLogic facturapuntoventaLogic;
	FacturaPuntoVentaLogicAdditional facturapuntoventaLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  FacturaPuntoVentaBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			facturapuntoventaLogic=new FacturaPuntoVentaLogic();
			facturapuntoventaLogicAdditional=new FacturaPuntoVentaLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormFacturaPuntoVenta(FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
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

			FacturaPuntoVentaBeanSwingJInternalFrame this_a=(FacturaPuntoVentaBeanSwingJInternalFrame)jInternalFrameBase;
			FacturaPuntoVentaDetalleFormJInternalFrame this_af=this_a.jInternalFrameDetalleFormFacturaPuntoVenta;
			
			
			if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.TEXTBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
				
				/*
				if(sTipo.equals("valor_descuentoFacturaPuntoVenta")) {									
					
					FacturaPuntoVentaBeanSwingJInternalFrameAdditional.ActualizarValoresFacturaPuntoVenta(this_af,this_a);
				
				}
				*/
				
			} else if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.COMBOBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
				
				if(sTipo.equals("id_clienteFacturaPuntoVenta")) {													
					
					if(!this_a.getEsControlTabla()) {
						
						FacturaPuntoVentaLogicAdditional.ActualizarValoresEvento(this_a.getfacturapuntoventa(),sTipo);
						
						this_a.setVariablesObjetoActualToFormularioTodoFacturaPuntoVenta(this_a.getfacturapuntoventa());
					
						
					} else {
						
					}
				}
			}
			
			return generalEntityReturnGeneral;

		} catch(Exception e) {
			throw e;
		} finally {

		}
	}
	//CONTROL_FUNCION2
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
			Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
			Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) 
	{		
		try {
			
			FacturaPuntoVentaDetalleFormJInternalFrame facturapuntoventaDetalleFormJInternalFrame=(FacturaPuntoVentaDetalleFormJInternalFrame) this;
			
			FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame=(FacturaPuntoVentaBeanSwingJInternalFrame)facturapuntoventaDetalleFormJInternalFrame.jInternalFrameParent;			
				
			FacturaPuntoVentaBeanSwingJInternalFrameAdditional.ActualizarValoresFacturaPuntoVenta(facturapuntoventaDetalleFormJInternalFrame,facturapuntoventaBeanSwingJInternalFrame);
						
			System.out.println(sDominio+"->"+sDominioTipo);
			
		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public static void ActualizarValoresFacturaPuntoVenta(FacturaPuntoVentaDetalleFormJInternalFrame this_af,FacturaPuntoVentaBeanSwingJInternalFrame this_a) throws Exception { //FacturaPuntoVentaDetalleFormJInternalFrame
		
		DetalleFacturaLogicAdditional.GetTotales(this_a.getfacturapuntoventa(), this_af.detallefacturapuntoventaBeanSwingJInternalFrame.getDetalleFacturaPuntoVentaLogic().getDetalleFacturaPuntoVentas());

		this_a.setVariablesObjetoActualToFormularioFacturaPuntoVenta(this_a.getfacturapuntoventa());
	}
}