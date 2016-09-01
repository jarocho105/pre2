







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
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.DetallePedidoPuntoVentaBeanSwingJInternalFrame;
import com.bydan.erp.puntoventa.util.DetallePedidoPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.business.entity.DetallePedidoPuntoVenta;
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
public class DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional extends JInternalFrameBase//DetallePedidoPuntoVentaBeanSwingJInternalFrame
{
private static final long serialVersionUID = 1L;
	//CONTROL_INICIO
	DetallePedidoPuntoVentaLogic detallepedidopuntoventaLogic;
	DetallePedidoPuntoVentaLogicAdditional detallepedidopuntoventaLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			detallepedidopuntoventaLogic=new DetallePedidoPuntoVentaLogic();
			detallepedidopuntoventaLogicAdditional=new DetallePedidoPuntoVentaLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormDetallePedidoPuntoVenta(DetallePedidoPuntoVentaBeanSwingJInternalFrame detallepedidopuntoventaBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
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

			
			DetallePedidoPuntoVentaBeanSwingJInternalFrame this_a=(DetallePedidoPuntoVentaBeanSwingJInternalFrame)jInternalFrameBase;
			DatoGeneral datoGeneral=new DatoGeneral();
			
			if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.TEXTBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
																
				if(sTipo.equals("cantidadDetallePedidoPuntoVenta")) {
					
					if(!this_a.getEsControlTabla()) {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallepedidopuntoventa());
						
						this_a.setVariablesObjetoActualToFormularioDetallePedidoPuntoVenta(this_a.getdetallepedidopuntoventa());
					
					} else {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallepedidopuntoventaAnterior());
																		
						this_a.actualizarVisualTableDatosEventosVistaDetallePedidoPuntoVenta();
						
					}
					
				} else if(sTipo.equals("precioDetallePedidoPuntoVenta")) {
					
					if(!this_a.getEsControlTabla()) {
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallepedidopuntoventa());
						
						this_a.setVariablesObjetoActualToFormularioDetallePedidoPuntoVenta(this_a.getdetallepedidopuntoventa());
					
						
					} else {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallepedidopuntoventaAnterior());
						
						this_a.actualizarVisualTableDatosEventosVistaDetallePedidoPuntoVenta();
					}
					
				}  else if(sTipo.equals("ivaDetallePedidoPuntoVenta")) {
					
					if(!this_a.getEsControlTabla()) {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallepedidopuntoventa());
						
						this_a.setVariablesObjetoActualToFormularioDetallePedidoPuntoVenta(this_a.getdetallepedidopuntoventa());
					
						
					} else {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallepedidopuntoventaAnterior());
						
						this_a.actualizarVisualTableDatosEventosVistaDetallePedidoPuntoVenta();
					}
					
				} else if(sTipo.equals("iceDetallePedidoPuntoVenta")) {
					
					if(!this_a.getEsControlTabla()) {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallepedidopuntoventa());
						
						this_a.setVariablesObjetoActualToFormularioDetallePedidoPuntoVenta(this_a.getdetallepedidopuntoventa());
					
						
					} else {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallepedidopuntoventaAnterior());
						
						this_a.actualizarVisualTableDatosEventosVistaDetallePedidoPuntoVenta();
					}
					
				} else if(sTipo.equals("descuentoDetallePedidoPuntoVenta")) {
					
					if(!this_a.getEsControlTabla()) {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallepedidopuntoventa());
						
						this_a.setVariablesObjetoActualToFormularioDetallePedidoPuntoVenta(this_a.getdetallepedidopuntoventa());
					
						
					} else {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallepedidopuntoventaAnterior());
						
						this_a.actualizarVisualTableDatosEventosVistaDetallePedidoPuntoVenta();
					}
				}
				
			} else if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.COMBOBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
				
				
				if(sTipo.equals("id_productoDetallePedidoPuntoVenta")) {
					
					if(!this_a.getEsControlTabla()) {
						
						datoGeneral=DetalleFacturaLogicAdditional.GetPrecio(this_a.getdetallepedidopuntoventa());
						
						Integer disponible=datoGeneral.getiValorInteger();
						Double precio=datoGeneral.getdValorDouble();
						Double iva=datoGeneral.getdValorDouble2();
						Double ice=datoGeneral.getdValorDouble3();
						Double descuento=datoGeneral.getdValorDouble4();
						
						if(disponible>-1) {
							//this_a.getdetallepedidopuntoventa().setdisponible(disponible);														
						}
						
						this_a.getdetallepedidopuntoventa().setprecio(precio);												
						this_a.getdetallepedidopuntoventa().setiva(iva);
						this_a.getdetallepedidopuntoventa().setiva(ice);
						this_a.getdetallepedidopuntoventa().setiva(descuento);
						
						this_a.setVariablesObjetoActualToFormularioDetallePedidoPuntoVenta(this_a.getdetallepedidopuntoventa());
						
					} else {
											
						datoGeneral=DetalleFacturaLogicAdditional.GetPrecio(this_a.getdetallepedidopuntoventaAnterior());
						
						Integer disponible=datoGeneral.getiValorInteger();
						Double precio=datoGeneral.getdValorDouble();
						Double iva=datoGeneral.getdValorDouble2();
						Double ice=datoGeneral.getdValorDouble3();
						Double descuento=datoGeneral.getdValorDouble4();
						
						if(disponible>-1) {
							//this_a.getdetallepedidopuntoventaAnterior().setdisponible(disponible);		
														
						}	
						
						this_a.getdetallepedidopuntoventaAnterior().setprecio(precio);						
						this_a.getdetallepedidopuntoventaAnterior().setiva(iva);
						this_a.getdetallepedidopuntoventaAnterior().setiva(ice);
						this_a.getdetallepedidopuntoventaAnterior().setiva(descuento);
						
						this_a.actualizarVisualTableDatosEventosVistaDetallePedidoPuntoVenta();
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