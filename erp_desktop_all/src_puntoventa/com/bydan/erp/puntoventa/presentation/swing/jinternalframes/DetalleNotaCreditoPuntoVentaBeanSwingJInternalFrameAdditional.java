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
import com.bydan.erp.facturacion.business.logic.DetalleFacturaLogicAdditional;
import com.bydan.erp.puntoventa.util.DetalleNotaCreditoPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.business.entity.DetalleNotaCreditoPuntoVenta;
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

//import com.bydan.erp.puntoventa.service.ejb.interfaces.DetalleNotaCreditoPuntoVentaAdditionable;
////import com.bydan.erp.puntoventa.service.ejb.interfaces.DetalleNotaCreditoPuntoVentaAdditionableHome;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional extends JInternalFrameBase//DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	//public static DetalleNotaCreditoPuntoVentaAdditionable detallenotacreditopuntoventaAdditionable= DetalleNotaCreditoPuntoVentaConstantesFunciones.getDetalleNotaCreditoPuntoVentaAdditionableEjbReference(DetalleNotaCreditoPuntoVentaConstantesFunciones.SREMOTEEJBNAMEADDITIONAL_JBOSS81);
	//public static DetalleNotaCreditoPuntoVentaAdditionableHome detallenotacreditopuntoventaAdditionableHome= DetalleNotaCreditoPuntoVentaConstantesFunciones.getDetalleNotaCreditoPuntoVentaAdditionableHomeEjbReference(DetalleNotaCreditoPuntoVentaConstantesFunciones.SLOCALEJBNAMEADDITIONAL_JBOSS81);		
	
	//CONTROL_INICIO
	DetalleNotaCreditoPuntoVentaLogic detallenotacreditopuntoventaLogic;
	DetalleNotaCreditoPuntoVentaLogicAdditional detallenotacreditopuntoventaLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			detallenotacreditopuntoventaLogic=new DetalleNotaCreditoPuntoVentaLogic();
			detallenotacreditopuntoventaLogicAdditional=new DetalleNotaCreditoPuntoVentaLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormDetalleNotaCreditoPuntoVenta(DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame detallenotacreditopuntoventaBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
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
		DetalleNotaCreditoPuntoVentaLogicAdditional detallenotacreditopuntoventaLogicAdditional=new DetalleNotaCreditoPuntoVentaLogicAdditional();
		
		DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame detallenotacreditopuntoventaBeanSwingJInternalFrame=(DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame)jInternalFrameBase;
		
		if(JOptionPane.showConfirmDialog(jInternalFrameBase, "ESTA SEGURO DE PROCESAR "+sLabelProceso+" DETALLE FACTURA PUNTO VENTAS SELECCIONADOS?", "MANTENIMIENTO DE ACCION", JOptionPane.OK_CANCEL_OPTION) == 0) {
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {	//TO_COMMENT
				esProcesado=detallenotacreditopuntoventaLogicAdditional.ProcesarAccion(detallenotacreditopuntoventaBeanSwingJInternalFrame.getParametroGeneralUsuario(),detallenotacreditopuntoventaBeanSwingJInternalFrame.getModuloActual(),detallenotacreditopuntoventaBeanSwingJInternalFrame.getOpcionActual(),detallenotacreditopuntoventaBeanSwingJInternalFrame.getUsuarioActual(),sProceso,detallenotacreditopuntoventaBeanSwingJInternalFrame.getDetalleNotaCreditoPuntoVentaLogic().getDetalleNotaCreditoPuntoVentas());
			} else if(Constantes.ISUSAEJBREMOTE) {//TO_COMMENT
				//esProcesado=detallenotacreditopuntoventaAdditionable.ProcesarAccion(detallenotacreditopuntoventaBeanSwingJInternalFrame.getParametroGeneralUsuario(),detallenotacreditopuntoventaBeanSwingJInternalFrame.getModuloActual(),detallenotacreditopuntoventaBeanSwingJInternalFrame.getOpcionActual(),detallenotacreditopuntoventaBeanSwingJInternalFrame.getUsuarioActual(),detallenotacreditopuntoventaBeanSwingJInternalFrame.datosCliente,sProceso,detallenotacreditopuntoventaBeanSwingJInternalFrame.getdetallenotacreditopuntoventas());//TO_COMMENT
			} else if(Constantes.ISUSAEJBHOME) {//TO_COMMENT
				//esProcesado=detallenotacreditopuntoventaAdditionableHome.ProcesarAccion(detallenotacreditopuntoventaBeanSwingJInternalFrame.getParametroGeneralUsuario(),detallenotacreditopuntoventaBeanSwingJInternalFrame.getModuloActual(),detallenotacreditopuntoventaBeanSwingJInternalFrame.getOpcionActual(),detallenotacreditopuntoventaBeanSwingJInternalFrame.getUsuarioActual(),detallenotacreditopuntoventaBeanSwingJInternalFrame.datosCliente,sProceso,detallenotacreditopuntoventaBeanSwingJInternalFrame.getdetallenotacreditopuntoventas());//TO_COMMENT
			}//TO_COMMENT
			//ARCHITECTURE
			
			if(esProcesado) {
				JOptionPane.showMessageDialog(detallenotacreditopuntoventaBeanSwingJInternalFrame,"PROCESO REALIZADO CORRECTAMENTE","PROCESO ",JOptionPane.INFORMATION_MESSAGE);		
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

			
			DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame this_a=(DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame)jInternalFrameBase;
			DatoGeneral datoGeneral=new DatoGeneral();
			
			if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.TEXTBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
																
				if(sTipo.equals("cantidadDetalleNotaCreditoPuntoVenta")) {
					
					if(!this_a.getEsControlTabla()) {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallenotacreditopuntoventa());
						
						this_a.setVariablesObjetoActualToFormularioDetalleNotaCreditoPuntoVenta(this_a.getdetallenotacreditopuntoventa());
					
					} else {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallenotacreditopuntoventaAnterior());
																		
						this_a.actualizarVisualTableDatosEventosVistaDetalleNotaCreditoPuntoVenta();
						
					}
					
				} else if(sTipo.equals("precioDetalleNotaCreditoPuntoVenta")) {
					
					if(!this_a.getEsControlTabla()) {
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallenotacreditopuntoventa());
						
						this_a.setVariablesObjetoActualToFormularioDetalleNotaCreditoPuntoVenta(this_a.getdetallenotacreditopuntoventa());
					
						
					} else {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallenotacreditopuntoventaAnterior());
						
						this_a.actualizarVisualTableDatosEventosVistaDetalleNotaCreditoPuntoVenta();
					}
					
				}  else if(sTipo.equals("ivaDetalleNotaCreditoPuntoVenta")) {
					
					if(!this_a.getEsControlTabla()) {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallenotacreditopuntoventa());
						
						this_a.setVariablesObjetoActualToFormularioDetalleNotaCreditoPuntoVenta(this_a.getdetallenotacreditopuntoventa());
					
						
					} else {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallenotacreditopuntoventaAnterior());
						
						this_a.actualizarVisualTableDatosEventosVistaDetalleNotaCreditoPuntoVenta();
					}
					
				} else if(sTipo.equals("iceDetalleNotaCreditoPuntoVenta")) {
					
					if(!this_a.getEsControlTabla()) {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallenotacreditopuntoventa());
						
						this_a.setVariablesObjetoActualToFormularioDetalleNotaCreditoPuntoVenta(this_a.getdetallenotacreditopuntoventa());
					
						
					} else {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallenotacreditopuntoventaAnterior());
						
						this_a.actualizarVisualTableDatosEventosVistaDetalleNotaCreditoPuntoVenta();
					}
					
				} else if(sTipo.equals("descuentoDetalleNotaCreditoPuntoVenta")) {
					
					if(!this_a.getEsControlTabla()) {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallenotacreditopuntoventa());
						
						this_a.setVariablesObjetoActualToFormularioDetalleNotaCreditoPuntoVenta(this_a.getdetallenotacreditopuntoventa());
					
						
					} else {
						
						DetalleFacturaLogicAdditional.GetPrecioTotal(this_a.getdetallenotacreditopuntoventaAnterior());
						
						this_a.actualizarVisualTableDatosEventosVistaDetalleNotaCreditoPuntoVenta();
					}
				}
				
			} else if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.COMBOBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
				
				
				if(sTipo.equals("id_productoDetalleNotaCreditoPuntoVenta")) {
					
					if(!this_a.getEsControlTabla()) {
						
						datoGeneral=DetalleFacturaLogicAdditional.GetPrecio(this_a.getdetallenotacreditopuntoventa());
						
						Integer disponible=datoGeneral.getiValorInteger();
						Double precio=datoGeneral.getdValorDouble();
						Double iva=datoGeneral.getdValorDouble2();
						Double ice=datoGeneral.getdValorDouble3();
						Double descuento=datoGeneral.getdValorDouble4();
						
						if(disponible>-1) {
							//this_a.getdetallenotacreditopuntoventa().setdisponible(disponible);														
						}
						
						this_a.getdetallenotacreditopuntoventa().setprecio(precio);												
						this_a.getdetallenotacreditopuntoventa().setiva(iva);
						this_a.getdetallenotacreditopuntoventa().setiva(ice);
						this_a.getdetallenotacreditopuntoventa().setiva(descuento);
						
						this_a.setVariablesObjetoActualToFormularioDetalleNotaCreditoPuntoVenta(this_a.getdetallenotacreditopuntoventa());
						
					} else {
											
						datoGeneral=DetalleFacturaLogicAdditional.GetPrecio(this_a.getdetallenotacreditopuntoventaAnterior());
						
						Integer disponible=datoGeneral.getiValorInteger();
						Double precio=datoGeneral.getdValorDouble();
						Double iva=datoGeneral.getdValorDouble2();
						Double ice=datoGeneral.getdValorDouble3();
						Double descuento=datoGeneral.getdValorDouble4();
						
						if(disponible>-1) {
							//this_a.getdetallenotacreditopuntoventaAnterior().setdisponible(disponible);		
														
						}	
						
						this_a.getdetallenotacreditopuntoventaAnterior().setprecio(precio);						
						this_a.getdetallenotacreditopuntoventaAnterior().setiva(iva);
						this_a.getdetallenotacreditopuntoventaAnterior().setiva(ice);
						this_a.getdetallenotacreditopuntoventaAnterior().setiva(descuento);
						
						this_a.actualizarVisualTableDatosEventosVistaDetalleNotaCreditoPuntoVenta();
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

