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
import com.bydan.framework.erp.util.*;
import com.bydan.erp.puntoventa.util.NotaCreditoPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.business.entity.NotaCreditoPuntoVenta;
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

//import org.hibernate.collection.PersistentBag;



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

//import com.bydan.erp.puntoventa.service.ejb.interfaces.NotaCreditoPuntoVentaAdditionable;
////import com.bydan.erp.puntoventa.service.ejb.interfaces.NotaCreditoPuntoVentaAdditionableHome;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class NotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional extends JInternalFrameBase//NotaCreditoPuntoVentaBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	//public static NotaCreditoPuntoVentaAdditionable notacreditopuntoventaAdditionable= NotaCreditoPuntoVentaConstantesFunciones.getNotaCreditoPuntoVentaAdditionableEjbReference(NotaCreditoPuntoVentaConstantesFunciones.SREMOTEEJBNAMEADDITIONAL_JBOSS81);
	//public static NotaCreditoPuntoVentaAdditionableHome notacreditopuntoventaAdditionableHome= NotaCreditoPuntoVentaConstantesFunciones.getNotaCreditoPuntoVentaAdditionableHomeEjbReference(NotaCreditoPuntoVentaConstantesFunciones.SLOCALEJBNAMEADDITIONAL_JBOSS81);		
	
	//CONTROL_INICIO
	NotaCreditoPuntoVentaLogic notacreditopuntoventaLogic;
	NotaCreditoPuntoVentaLogicAdditional notacreditopuntoventaLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  NotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			notacreditopuntoventaLogic=new NotaCreditoPuntoVentaLogic();
			notacreditopuntoventaLogicAdditional=new NotaCreditoPuntoVentaLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormNotaCreditoPuntoVenta(NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
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
		NotaCreditoPuntoVentaLogicAdditional notacreditopuntoventaLogicAdditional=new NotaCreditoPuntoVentaLogicAdditional();
		
		NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame=(NotaCreditoPuntoVentaBeanSwingJInternalFrame)jInternalFrameBase;
		
		if(JOptionPane.showConfirmDialog(jInternalFrameBase, "ESTA SEGURO DE PROCESAR "+sLabelProceso+" NOTA CREDITOPUNTO VENTAS SELECCIONADOS?", "MANTENIMIENTO DE ACCION", JOptionPane.OK_CANCEL_OPTION) == 0) {
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {	//TO_COMMENT
				esProcesado=notacreditopuntoventaLogicAdditional.ProcesarAccion(notacreditopuntoventaBeanSwingJInternalFrame.getParametroGeneralUsuario(),notacreditopuntoventaBeanSwingJInternalFrame.getModuloActual(),notacreditopuntoventaBeanSwingJInternalFrame.getOpcionActual(),notacreditopuntoventaBeanSwingJInternalFrame.getUsuarioActual(),sProceso,notacreditopuntoventaBeanSwingJInternalFrame.getNotaCreditoPuntoVentaLogic().getNotaCreditoPuntoVentas());
			} else if(Constantes.ISUSAEJBREMOTE) {//TO_COMMENT
				//esProcesado=notacreditopuntoventaAdditionable.ProcesarAccion(notacreditopuntoventaBeanSwingJInternalFrame.getParametroGeneralUsuario(),notacreditopuntoventaBeanSwingJInternalFrame.getModuloActual(),notacreditopuntoventaBeanSwingJInternalFrame.getOpcionActual(),notacreditopuntoventaBeanSwingJInternalFrame.getUsuarioActual(),notacreditopuntoventaBeanSwingJInternalFrame.datosCliente,sProceso,notacreditopuntoventaBeanSwingJInternalFrame.getnotacreditopuntoventas());//TO_COMMENT
			} else if(Constantes.ISUSAEJBHOME) {//TO_COMMENT
				//esProcesado=notacreditopuntoventaAdditionableHome.ProcesarAccion(notacreditopuntoventaBeanSwingJInternalFrame.getParametroGeneralUsuario(),notacreditopuntoventaBeanSwingJInternalFrame.getModuloActual(),notacreditopuntoventaBeanSwingJInternalFrame.getOpcionActual(),notacreditopuntoventaBeanSwingJInternalFrame.getUsuarioActual(),notacreditopuntoventaBeanSwingJInternalFrame.datosCliente,sProceso,notacreditopuntoventaBeanSwingJInternalFrame.getnotacreditopuntoventas());//TO_COMMENT
			}//TO_COMMENT
			//ARCHITECTURE
			
			if(esProcesado) {
				JOptionPane.showMessageDialog(notacreditopuntoventaBeanSwingJInternalFrame,"PROCESO REALIZADO CORRECTAMENTE","PROCESO ",JOptionPane.INFORMATION_MESSAGE);		
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

			NotaCreditoPuntoVentaBeanSwingJInternalFrame this_a=(NotaCreditoPuntoVentaBeanSwingJInternalFrame)jInternalFrameBase;
			NotaCreditoPuntoVentaDetalleFormJInternalFrame this_af=this_a.jInternalFrameDetalleFormNotaCreditoPuntoVenta;
			
			
			if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.TEXTBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
				
				/*
				if(sTipo.equals("valor_descuentoNotaCreditoPuntoVenta")) {									
					
					NotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional.ActualizarValoresNotaCreditoPuntoVenta(this_af,this_a);
				
				}
				*/
				
			} else if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.COMBOBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
				
				if(sTipo.equals("id_clienteNotaCreditoPuntoVenta")) {													
					
					if(!this_a.getEsControlTabla()) {
						
						NotaCreditoPuntoVentaLogicAdditional.ActualizarValoresEvento(this_a.getnotacreditopuntoventa(),sTipo);
						
						this_a.setVariablesObjetoActualToFormularioTodoNotaCreditoPuntoVenta(this_a.getnotacreditopuntoventa());
					
						
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
			
			NotaCreditoPuntoVentaDetalleFormJInternalFrame notacreditopuntoventaDetalleFormJInternalFrame=(NotaCreditoPuntoVentaDetalleFormJInternalFrame) this;
			
			NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame=(NotaCreditoPuntoVentaBeanSwingJInternalFrame)notacreditopuntoventaDetalleFormJInternalFrame.jInternalFrameParent;			
				
			NotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional.ActualizarValoresNotaCreditoPuntoVenta(notacreditopuntoventaDetalleFormJInternalFrame,notacreditopuntoventaBeanSwingJInternalFrame);
						
			System.out.println(sDominio+"->"+sDominioTipo);
			
		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public static void ActualizarValoresNotaCreditoPuntoVenta(NotaCreditoPuntoVentaDetalleFormJInternalFrame this_af,NotaCreditoPuntoVentaBeanSwingJInternalFrame this_a) throws Exception { //NotaCreditoPuntoVentaDetalleFormJInternalFrame
		
		DetalleNotaCreditoPuntoVentaLogicAdditional.GetTotales(this_a.getnotacreditopuntoventa(), this_af.detallenotacreditopuntoventaBeanSwingJInternalFrame.getDetalleNotaCreditoPuntoVentaLogic().getDetalleNotaCreditoPuntoVentas());

		this_a.setVariablesObjetoActualToFormularioNotaCreditoPuntoVenta(this_a.getnotacreditopuntoventa());
	}
}

