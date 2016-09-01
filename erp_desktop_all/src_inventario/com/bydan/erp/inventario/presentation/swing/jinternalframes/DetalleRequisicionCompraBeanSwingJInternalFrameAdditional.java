/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
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
import com.bydan.framework.erp.util.*;
import com.bydan.erp.inventario.util.DetalleRequisicionCompraConstantesFunciones;
import com.bydan.erp.inventario.business.entity.DetalleRequisicionCompra;
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


//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class DetalleRequisicionCompraBeanSwingJInternalFrameAdditional extends JInternalFrameBase//DetalleRequisicionCompraBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	
	//CONTROL_INICIO
	DetalleRequisicionCompraLogic detallerequisicioncompraLogic;
	DetalleRequisicionCompraLogicAdditional detallerequisicioncompraLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  DetalleRequisicionCompraBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			detallerequisicioncompraLogic=new DetalleRequisicionCompraLogic();
			detallerequisicioncompraLogicAdditional=new DetalleRequisicionCompraLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormDetalleRequisicionCompra(DetalleRequisicionCompraBeanSwingJInternalFrame detallerequisicioncompraBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
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
		DetalleRequisicionCompraLogicAdditional detallerequisicioncompraLogicAdditional=new DetalleRequisicionCompraLogicAdditional();
		
		DetalleRequisicionCompraBeanSwingJInternalFrame detallerequisicioncompraBeanSwingJInternalFrame=(DetalleRequisicionCompraBeanSwingJInternalFrame)jInternalFrameBase;
		
		if(JOptionPane.showConfirmDialog(jInternalFrameBase, "ESTA SEGURO DE PROCESAR "+sLabelProceso+" Detalle Requisicion CompraS SELECCIONADOS?", "MANTENIMIENTO DE ACCION", JOptionPane.OK_CANCEL_OPTION) == 0) {
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {	//TO_COMMENT
				esProcesado=detallerequisicioncompraLogicAdditional.ProcesarAccion(detallerequisicioncompraBeanSwingJInternalFrame.getParametroGeneralUsuario(),detallerequisicioncompraBeanSwingJInternalFrame.getModuloActual(),detallerequisicioncompraBeanSwingJInternalFrame.getOpcionActual(),detallerequisicioncompraBeanSwingJInternalFrame.getUsuarioActual(),sProceso,detallerequisicioncompraBeanSwingJInternalFrame.getDetalleRequisicionCompraLogic().getDetalleRequisicionCompras());
			} else if(Constantes.ISUSAEJBREMOTE) {//TO_COMMENT
			} else if(Constantes.ISUSAEJBHOME) {//TO_COMMENT
			}//TO_COMMENT
			//ARCHITECTURE
			
			if(esProcesado) {
				JOptionPane.showMessageDialog(detallerequisicioncompraBeanSwingJInternalFrame,"PROCESO REALIZADO CORRECTAMENTE","PROCESO ",JOptionPane.INFORMATION_MESSAGE);		
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

			DetalleRequisicionCompraBeanSwingJInternalFrame this_a=(DetalleRequisicionCompraBeanSwingJInternalFrame)jInternalFrameBase;
			DatoGeneral datoGeneral=new DatoGeneral();
			
			if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.TEXTBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
																
				if(sTipo.equals("cantidad_requisicionDetalleRequisicionCompra")) {
					
					if(!this_a.getEsControlTabla()) {
						
						this_a.setVariablesFormularioToObjetoActualDetalleRequisicionCompra(this_a.getdetallerequisicioncompra(),true);
											
						DetalleMovimientoInventarioLogicAdditional.GetCostoTotal(this_a.getdetallerequisicioncompra());
						
						this_a.setVariablesObjetoActualToFormularioDetalleRequisicionCompra(this_a.getdetallerequisicioncompra());
					
					} else {
						
						DetalleMovimientoInventarioLogicAdditional.GetCostoTotal(this_a.getdetallerequisicioncompraAnterior());
						
						this_a.actualizarVisualTableDatosEventosVistaDetalleRequisicionCompra();
						
					}
					
				} else if(sTipo.equals("costo_unitarioDetalleRequisicionCompra")) {
					
					if(!this_a.getEsControlTabla()) {
						this_a.setVariablesFormularioToObjetoActualDetalleRequisicionCompra(this_a.getdetallerequisicioncompra(),true);
											
						DetalleMovimientoInventarioLogicAdditional.GetCostoTotal(this_a.getdetallerequisicioncompra());
						
						this_a.setVariablesObjetoActualToFormularioDetalleRequisicionCompra(this_a.getdetallerequisicioncompra());
					
						
					} else {
						
						DetalleMovimientoInventarioLogicAdditional.GetCostoTotal(this_a.getdetallerequisicioncompraAnterior());
						
						this_a.actualizarVisualTableDatosEventosVistaDetalleRequisicionCompra();
					}
				}
				
			} else if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.COMBOBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
				
				
				if(sTipo.equals("id_productoDetalleRequisicionCompra")) {
					
					if(!this_a.getEsControlTabla()) {
						
						this_a.setVariablesFormularioToObjetoActualDetalleRequisicionCompra(this_a.getdetallerequisicioncompra(),true);
										
						datoGeneral=DetalleMovimientoInventarioLogicAdditional.GetDisponibleYCosto(this_a.getdetallerequisicioncompra());
						
						Integer disponible=datoGeneral.getiValorInteger();
						Double costo_unitario=datoGeneral.getdValorDouble();
						
						if(disponible>-1) {
							//this_a.getdetallerequisicioncompra().setdisponible(disponible);														
						}
						
						if(costo_unitario>0) {
							this_a.getdetallerequisicioncompra().setcosto_unitario(costo_unitario);
						}
						
						DetalleMovimientoInventarioLogicAdditional.GetCostoTotal(this_a.getdetallerequisicioncompra());
						
						this_a.setVariablesObjetoActualToFormularioDetalleRequisicionCompra(this_a.getdetallerequisicioncompra());
						
					} else {
											
						datoGeneral=DetalleMovimientoInventarioLogicAdditional.GetDisponibleYCosto(this_a.getdetallerequisicioncompraAnterior());
						
						Integer disponible=datoGeneral.getiValorInteger();
						Double costo_unitario=datoGeneral.getdValorDouble();
						
						if(disponible>-1) {
							//this_a.getdetallerequisicioncompraAnterior().setdisponible(disponible);		
														
						}	
						
						if(costo_unitario>0) {
							this_a.getdetallerequisicioncompra().setcosto_unitario(costo_unitario);
						}
						
						DetalleMovimientoInventarioLogicAdditional.GetCostoTotal(this_a.getdetallerequisicioncompraAnterior());
						
						this_a.actualizarVisualTableDatosEventosVistaDetalleRequisicionCompra();
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
}

