








/*
*ADVERTENCIA : Este programa esta protegido por la ley de derechos de autor.
*La reproducci?n o distribuci?n il?cita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y ser?n objeto de todas las sanciones legales que correspondan.
*/
package com.bydan.erp.inventario.presentation.swing.jinternalframes;

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
import com.bydan.erp.inventario.business.entity.DetalleMovimientoInventario;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.MovimientoInventarioDetalleFormJInternalFrame;
import com.bydan.erp.inventario.util.MovimientoInventarioConstantesFunciones;
import com.bydan.erp.inventario.business.entity.MovimientoInventario;
import com.bydan.erp.inventario.business.logic.*;

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
import com.bydan.framework.erp.business.logic.Pagination;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class MovimientoInventarioBeanSwingJInternalFrameAdditional extends JInternalFrameBase//MovimientoInventarioBeanSwingJInternalFrame
{
	//public static MovimientoInventarioAdditionable movimientoinventarioAdditionable= MovimientoInventarioConstantesFunciones.getMovimientoInventarioAdditionableEjbReference(MovimientoInventarioConstantesFunciones.SREMOTEEJBNAMEADDITIONAL_JBOSS81);
	//public static MovimientoInventarioAdditionableHome movimientoinventarioAdditionableHome= MovimientoInventarioConstantesFunciones.getMovimientoInventarioAdditionableHomeEjbReference(MovimientoInventarioConstantesFunciones.SLOCALEJBNAMEADDITIONAL_JBOSS81);		
	
private static final long serialVersionUID = 1L;
	//CONTROL_INICIO
	MovimientoInventarioLogic movimientoinventarioLogic;
	MovimientoInventarioLogicAdditional movimientoinventarioLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  MovimientoInventarioBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			movimientoinventarioLogic=new MovimientoInventarioLogic();
			movimientoinventarioLogicAdditional=new MovimientoInventarioLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormMovimientoInventario(MovimientoInventarioBeanSwingJInternalFrame movimientoinventarioBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
		//CONTROL_1
	}
	
	public static void RecargarVentanaSegunOpcion(JInternalFrameBase jInternalFrameBase,Opcion opcionActual) throws Exception {
		//CONTROL_2
	}

	public static void	ProcesarAccion(String sProceso,String sLabelProceso,JInternalFrameBase jInternalFrameBase) throws Exception {
		//CONTROL_3
		Boolean esProcesado=false;
		MovimientoInventarioLogicAdditional movimientoinventarioLogicAdditional=new MovimientoInventarioLogicAdditional();
		
		MovimientoInventarioBeanSwingJInternalFrame movimientoinventarioBeanSwingJInternalFrame=(MovimientoInventarioBeanSwingJInternalFrame)jInternalFrameBase;
		
		if(JOptionPane.showConfirmDialog(movimientoinventarioBeanSwingJInternalFrame, "ESTA SEGURO DE REALIZAR EL PROCESO SELECCIONADO ?", "PROCESAR MOVIMIENTO INVENTARIO", JOptionPane.OK_CANCEL_OPTION) == 0) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				esProcesado=movimientoinventarioLogicAdditional.ProcesarAccion(movimientoinventarioBeanSwingJInternalFrame.getParametroGeneralUsuario(),movimientoinventarioBeanSwingJInternalFrame.getModuloActual(),movimientoinventarioBeanSwingJInternalFrame.getOpcionActual(),movimientoinventarioBeanSwingJInternalFrame.getUsuarioActual(),sProceso,movimientoinventarioBeanSwingJInternalFrame.getMovimientoInventarioLogic().getMovimientoInventarios());
			} else if(Constantes.ISUSAEJBREMOTE) {
				//esProcesado=movimientoinventarioAdditionable.ProcesarAccion(movimientoinventarioBeanSwingJInternalFrame.getParametroGeneralUsuario(),movimientoinventarioBeanSwingJInternalFrame.getModuloActual(),movimientoinventarioBeanSwingJInternalFrame.getOpcionActual(),movimientoinventarioBeanSwingJInternalFrame.getUsuarioActual(),movimientoinventarioBeanSwingJInternalFrame.datosCliente,sProceso,movimientoinventarioBeanSwingJInternalFrame.getmovimientoinventarios());
			} else if(Constantes.ISUSAEJBHOME) {
				//esProcesado=movimientoinventarioAdditionableHome.ProcesarAccion(movimientoinventarioBeanSwingJInternalFrame.getParametroGeneralUsuario(),movimientoinventarioBeanSwingJInternalFrame.getModuloActual(),movimientoinventarioBeanSwingJInternalFrame.getOpcionActual(),movimientoinventarioBeanSwingJInternalFrame.getUsuarioActual(),movimientoinventarioBeanSwingJInternalFrame.datosCliente,sProceso,movimientoinventarioBeanSwingJInternalFrame.getmovimientoinventarios());
			}
			
			if(esProcesado) {
				
			}
		}
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

			
			MovimientoInventarioBeanSwingJInternalFrame this_a=(MovimientoInventarioBeanSwingJInternalFrame)jInternalFrameBase;
			MovimientoInventarioDetalleFormJInternalFrame this_af=this_a.jInternalFrameDetalleFormMovimientoInventario;
			
			
			if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.TEXTBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
															
				if(sTipo.equals("valor_descuentoMovimientoInventario")) {									
					
					MovimientoInventarioBeanSwingJInternalFrameAdditional.ActualizarValoresMovimientoInventario(this_af,this_a);
				
				} else if(sTipo.equals("porcentaje_descuentoMovimientoInventario")) {									
					
					MovimientoInventarioBeanSwingJInternalFrameAdditional.ActualizarValoresMovimientoInventario(this_af,this_a);
				
				}
				
			} else if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.COMBOBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
				
				if(sTipo.equals("id_transaccionMovimientoInventario")) {													
					MovimientoInventarioBeanSwingJInternalFrameAdditional.ActualizarSecuencialMovimientoInventario(this_af,this_a);
				
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
			
			MovimientoInventarioDetalleFormJInternalFrame movimientoInventarioDetalleFormJInternalFrame=(MovimientoInventarioDetalleFormJInternalFrame) this;
			
			MovimientoInventarioBeanSwingJInternalFrame movimientoInventarioBeanSwingJInternalFrame=(MovimientoInventarioBeanSwingJInternalFrame)movimientoInventarioDetalleFormJInternalFrame.jInternalFrameParent;			
				
			MovimientoInventarioBeanSwingJInternalFrameAdditional.ActualizarValoresMovimientoInventario(movimientoInventarioDetalleFormJInternalFrame,movimientoInventarioBeanSwingJInternalFrame);
			
			
			
			/*
			Double suman=0.0;
			Double sub_total=0.0;
			Integer numero_items=0;
			Double total=0.0;
			
			for(DetalleMovimientoInventario detalleasientocontable : movimientoInventarioDetalleFormJInternalFrame.detallemovimientoinventarioBeanSwingJInternalFrame.getDetalleMovimientoInventarioLogic().getDetalleMovimientoInventarios()) {
				if(!detalleasientocontable.getsType().equals(Constantes2.S_TOTALES)) {
					suman+=detalleasientocontable.getcosto_total();
					numero_items+=detalleasientocontable.getcantidad();
				}
			}
			
			sub_total=suman;
			total=suman;
			
			movimientoInventarioDetalleFormJInternalFrame.jTextFieldsumanMovimientoInventario.setText(suman.toString());
			movimientoInventarioDetalleFormJInternalFrame.jTextFieldsub_totalMovimientoInventario.setText(sub_total.toString());
			movimientoInventarioDetalleFormJInternalFrame.jTextFieldnumero_itemsMovimientoInventario.setText(numero_items.toString());
			movimientoInventarioDetalleFormJInternalFrame.jTextFieldtotalMovimientoInventario.setText(total.toString());
			*/
			
			
			System.out.println(sDominio+"->"+sDominioTipo);
			
		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public static void ActualizarSecuencialMovimientoInventario(MovimientoInventarioDetalleFormJInternalFrame this_af,MovimientoInventarioBeanSwingJInternalFrame this_a) throws Exception { //MovimientoInventarioDetalleFormJInternalFrame
		
		this_a.setVariablesFormularioToObjetoActualMovimientoInventario(this_a.getmovimientoinventario(),true);
		
		
		MovimientoInventarioLogicAdditional movimientoInventarioLogicAdditional=new MovimientoInventarioLogicAdditional();
		
		DatoGeneral datoGeneral=movimientoInventarioLogicAdditional.GetSecuencialFormatoMovimiento(this_a.getmovimientoinventario());
		
		this_a.getmovimientoinventario().setnumero_secuencial(datoGeneral.getsValorString());
		
		this_a.setVariablesObjetoActualToFormularioMovimientoInventario(this_a.getmovimientoinventario());
	}

	public static void ActualizarValoresMovimientoInventario(MovimientoInventarioDetalleFormJInternalFrame this_af,MovimientoInventarioBeanSwingJInternalFrame this_a) throws Exception { //MovimientoInventarioDetalleFormJInternalFrame
		
		this_a.setVariablesFormularioToObjetoActualMovimientoInventario(this_a.getmovimientoinventario(),true);
		
		DetalleMovimientoInventarioLogicAdditional.GetTotales(this_a.getmovimientoinventario(), this_af.detallemovimientoinventarioBeanSwingJInternalFrame.getDetalleMovimientoInventarioLogic().getDetalleMovimientoInventarios());

		this_a.setVariablesObjetoActualToFormularioMovimientoInventario(this_a.getmovimientoinventario());
	}
}