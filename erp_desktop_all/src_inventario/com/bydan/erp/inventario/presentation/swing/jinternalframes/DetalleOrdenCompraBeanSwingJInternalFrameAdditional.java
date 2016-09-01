






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
import com.bydan.erp.inventario.util.DetalleOrdenCompraConstantesFunciones;
import com.bydan.erp.inventario.business.entity.DetalleOrdenCompra;
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

////import com.bydan.erp.inventario.service.ejb.interfaces.DetalleOrdenCompraAdditionable;
////import com.bydan.erp.inventario.service.ejb.interfaces.DetalleOrdenCompraAdditionableHome;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class DetalleOrdenCompraBeanSwingJInternalFrameAdditional extends JInternalFrameBase//DetalleOrdenCompraBeanSwingJInternalFrame
{
	//public static DetalleOrdenCompraAdditionable detalleordencompraAdditionable= DetalleOrdenCompraConstantesFunciones.getDetalleOrdenCompraAdditionableEjbReference(DetalleOrdenCompraConstantesFunciones.SREMOTEEJBNAMEADDITIONAL_JBOSS81);
	//public static DetalleOrdenCompraAdditionableHome detalleordencompraAdditionableHome= DetalleOrdenCompraConstantesFunciones.getDetalleOrdenCompraAdditionableHomeEjbReference(DetalleOrdenCompraConstantesFunciones.SLOCALEJBNAMEADDITIONAL_JBOSS81);		
	
private static final long serialVersionUID = 1L;
	//CONTROL_INICIO
	DetalleOrdenCompraLogic detalleordencompraLogic;
	DetalleOrdenCompraLogicAdditional detalleordencompraLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  DetalleOrdenCompraBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			detalleordencompraLogic=new DetalleOrdenCompraLogic();
			detalleordencompraLogicAdditional=new DetalleOrdenCompraLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormDetalleOrdenCompra(DetalleOrdenCompraBeanSwingJInternalFrame detalleordencompraBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
		//CONTROL_1
	}
	
	public static void	RecargarVentanaSegunOpcion(JInternalFrameBase jInternalFrameBase,Opcion opcionActual) throws Exception {	
		//CONTROL_2
	}
	
	/*
	public static void	ProcesarAccion(String sProceso,String sLabelProceso,JInternalFrameBase jInternalFrameBase) throws Exception {	
		//CONTROL_3
	}
	*/
	
	
	
	public static void ProcesarAccion(String sProceso,String sLabelProceso,JInternalFrameBase jInternalFrameBase) throws Exception {
		//CONTROL_3
		Boolean esProcesado=false;
		DetalleOrdenCompraLogicAdditional detalleordencompraLogicAdditional=new DetalleOrdenCompraLogicAdditional();
		
		DetalleOrdenCompraBeanSwingJInternalFrame detalleordencompraBeanSwingJInternalFrame=(DetalleOrdenCompraBeanSwingJInternalFrame)jInternalFrameBase;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	//TO_COMMENT
			esProcesado=detalleordencompraLogicAdditional.ProcesarAccion(detalleordencompraBeanSwingJInternalFrame.getParametroGeneralUsuario(),detalleordencompraBeanSwingJInternalFrame.getModuloActual(),detalleordencompraBeanSwingJInternalFrame.getOpcionActual(),detalleordencompraBeanSwingJInternalFrame.getUsuarioActual(),sProceso,detalleordencompraBeanSwingJInternalFrame.getDetalleOrdenCompraLogic().getDetalleOrdenCompras());
		} else if(Constantes.ISUSAEJBREMOTE) {//TO_COMMENT
			//esProcesado=detalleordencompraAdditionable.ProcesarAccion(detalleordencompraBeanSwingJInternalFrame.getParametroGeneralUsuario(),detalleordencompraBeanSwingJInternalFrame.getModuloActual(),detalleordencompraBeanSwingJInternalFrame.getOpcionActual(),detalleordencompraBeanSwingJInternalFrame.getUsuarioActual(),detalleordencompraBeanSwingJInternalFrame.datosCliente,sProceso,detalleordencompraBeanSwingJInternalFrame.getdetalleordencompras());//TO_COMMENT
		} else if(Constantes.ISUSAEJBHOME) {//TO_COMMENT
			//esProcesado=detalleordencompraAdditionableHome.ProcesarAccion(detalleordencompraBeanSwingJInternalFrame.getParametroGeneralUsuario(),detalleordencompraBeanSwingJInternalFrame.getModuloActual(),detalleordencompraBeanSwingJInternalFrame.getOpcionActual(),detalleordencompraBeanSwingJInternalFrame.getUsuarioActual(),detalleordencompraBeanSwingJInternalFrame.datosCliente,sProceso,detalleordencompraBeanSwingJInternalFrame.getdetalleordencompras());//TO_COMMENT
		}//TO_COMMENT
		//ARCHITECTURE
		
		if(esProcesado) {
			JOptionPane.showMessageDialog(detalleordencompraBeanSwingJInternalFrame,"PROCESO REALIZADO CORRECTAMENTE","PROCESO ",JOptionPane.INFORMATION_MESSAGE);		
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

			
			DetalleOrdenCompraBeanSwingJInternalFrame this_a=(DetalleOrdenCompraBeanSwingJInternalFrame)jInternalFrameBase;
			DatoGeneral datoGeneral=new DatoGeneral();
			
			if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.TEXTBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
																
				if(sTipo.equals("cantidadDetalleOrdenCompra")) {
					
					if(!this_a.getEsControlTabla()) {
						
						this_a.setVariablesFormularioToObjetoActualDetalleOrdenCompra(this_a.getdetalleordencompra(),true);
											
						DetalleMovimientoInventarioLogicAdditional.GetCostoTotal(this_a.getdetalleordencompra());
						
						this_a.setVariablesObjetoActualToFormularioDetalleOrdenCompra(this_a.getdetalleordencompra());
					
					} else {
						
						DetalleMovimientoInventarioLogicAdditional.GetCostoTotal(this_a.getdetalleordencompraAnterior());
																		
						this_a.actualizarVisualTableDatosEventosVistaDetalleOrdenCompra();
						
					}
					
				} else if(sTipo.equals("costo_unitarioDetalleOrdenCompra")) {
					
					if(!this_a.getEsControlTabla()) {
						this_a.setVariablesFormularioToObjetoActualDetalleOrdenCompra(this_a.getdetalleordencompra(),true);
											
						DetalleMovimientoInventarioLogicAdditional.GetCostoTotal(this_a.getdetalleordencompra());
						
						this_a.setVariablesObjetoActualToFormularioDetalleOrdenCompra(this_a.getdetalleordencompra());
					
						
					} else {
						
						DetalleMovimientoInventarioLogicAdditional.GetCostoTotal(this_a.getdetalleordencompraAnterior());
						
						this_a.actualizarVisualTableDatosEventosVistaDetalleOrdenCompra();
					}
					
				}  else if(sTipo.equals("ivaDetalleOrdenCompra")) {
					
					if(!this_a.getEsControlTabla()) {
						this_a.setVariablesFormularioToObjetoActualDetalleOrdenCompra(this_a.getdetalleordencompra(),true);
											
						DetalleMovimientoInventarioLogicAdditional.GetCostoTotal(this_a.getdetalleordencompra());
						
						this_a.setVariablesObjetoActualToFormularioDetalleOrdenCompra(this_a.getdetalleordencompra());
					
						
					} else {
						
						DetalleMovimientoInventarioLogicAdditional.GetCostoTotal(this_a.getdetalleordencompraAnterior());
						
						this_a.actualizarVisualTableDatosEventosVistaDetalleOrdenCompra();
					}
				}
				
			} else if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.COMBOBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
				
				
				if(sTipo.equals("id_productoDetalleOrdenCompra")) {
					
					if(!this_a.getEsControlTabla()) {
						
						this_a.setVariablesFormularioToObjetoActualDetalleOrdenCompra(this_a.getdetalleordencompra(),true);
										
						datoGeneral=DetalleMovimientoInventarioLogicAdditional.GetDisponibleYCosto(this_a.getdetalleordencompra());
						
						Integer disponible=datoGeneral.getiValorInteger();
						Double costo_unitario=datoGeneral.getdValorDouble();
						Double iva=datoGeneral.getdValorDouble2();
						
						if(disponible>-1) {
							this_a.getdetalleordencompra().setdisponible(disponible);														
						}
						
						if(costo_unitario>0) {
							this_a.getdetalleordencompra().setcosto_unitario(costo_unitario);
						}
						
						if(iva>0) {
							this_a.getdetalleordencompra().setiva(iva);
						}
						
						this_a.setVariablesObjetoActualToFormularioDetalleOrdenCompra(this_a.getdetalleordencompra());
						
					} else {
											
						datoGeneral=DetalleMovimientoInventarioLogicAdditional.GetDisponibleYCosto(this_a.getdetalleordencompraAnterior());
						
						Integer disponible=datoGeneral.getiValorInteger();
						Double costo_unitario=datoGeneral.getdValorDouble();
						Double iva=datoGeneral.getdValorDouble2();
						
						if(disponible>-1) {
							this_a.getdetalleordencompraAnterior().setdisponible(disponible);		
														
						}	
						
						if(costo_unitario>0) {
							this_a.getdetalleordencompraAnterior().setcosto_unitario(costo_unitario);
						}
						
						if(iva>0) {
							this_a.getdetalleordencompraAnterior().setiva(iva);
						}
						
						this_a.actualizarVisualTableDatosEventosVistaDetalleOrdenCompra();
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