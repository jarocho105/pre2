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

import com.bydan.erp.nomina.business.logic.RetencionInvenLogicAdditional;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.framework.erp.util.*;
import com.bydan.erp.inventario.util.CompraConstantesFunciones;
import com.bydan.erp.inventario.business.entity.Compra;
import com.bydan.erp.inventario.business.entity.DetalleCompra;
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
public class CompraBeanSwingJInternalFrameAdditional extends JInternalFrameBase//CompraBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	
	//CONTROL_INICIO
	CompraLogic compraLogic;
	CompraLogicAdditional compraLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  CompraBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			compraLogic=new CompraLogic();
			compraLogicAdditional=new CompraLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormCompra(CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
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
		CompraLogicAdditional compraLogicAdditional=new CompraLogicAdditional();
		
		CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame=(CompraBeanSwingJInternalFrame)jInternalFrameBase;
		
		if(JOptionPane.showConfirmDialog(jInternalFrameBase, "ESTA SEGURO DE PROCESAR "+sLabelProceso+" CompraS SELECCIONADOS?", "MANTENIMIENTO DE ACCION", JOptionPane.OK_CANCEL_OPTION) == 0) {
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {	//TO_COMMENT
				esProcesado=compraLogicAdditional.ProcesarAccion(compraBeanSwingJInternalFrame.getParametroGeneralUsuario(),compraBeanSwingJInternalFrame.getModuloActual(),compraBeanSwingJInternalFrame.getOpcionActual(),compraBeanSwingJInternalFrame.getUsuarioActual(),sProceso,compraBeanSwingJInternalFrame.getCompraLogic().getCompras());
			} else if(Constantes.ISUSAEJBREMOTE) {//TO_COMMENT
			} else if(Constantes.ISUSAEJBHOME) {//TO_COMMENT
			}//TO_COMMENT
			//ARCHITECTURE
			
			if(esProcesado) {
				JOptionPane.showMessageDialog(compraBeanSwingJInternalFrame,"PROCESO REALIZADO CORRECTAMENTE","PROCESO ",JOptionPane.INFORMATION_MESSAGE);		
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

			
			CompraBeanSwingJInternalFrame this_a=(CompraBeanSwingJInternalFrame)jInternalFrameBase;
			CompraDetalleFormJInternalFrame this_af=this_a.jInternalFrameDetalleFormCompra;
			
			
			if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.TEXTBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
															
				if(sTipo.equals("valor_descuentoCompra")) {									
					
					CompraBeanSwingJInternalFrameAdditional.ActualizarValoresCompra(this_af,this_a);
				
				} else if(sTipo.equals("porcentaje_descuentoCompra")) {									
					
					CompraBeanSwingJInternalFrameAdditional.ActualizarValoresCompra(this_af,this_a);
				
				}
				
			} else if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.COMBOBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
				
				if(sTipo.equals("id_clienteCompra")) {
					
					if(!this_a.getEsControlTabla()) {
						this_a.setVariablesFormularioToObjetoActualCompra(this_a.getcompra(),true);
						
						this_a.setVariablesFormularioToObjetoActualForeignKeysCompra(this_a.getcompra());
												
						CompraLogicAdditional.ActualizarCompra(this_a.getcompra(),sTipo);
						
						this_a.setVariablesObjetoActualToFormularioCompra(this_a.getcompra());
												
						
					} else {
						
					}
					
				} else if(sTipo.equals("id_pedido_compraCompra")) {
					
					if(!this_a.getEsControlTabla()) {
						this_a.setVariablesFormularioToObjetoActualTodoCompra(this_a.getcompra(),true);
																		
						CompraLogicAdditional.RecargarCompraDesdeRelacionado(this_a.getcompra(),"PedidoCompra");
						
						this_a.setVariablesObjetoActualToFormularioTodoCompra(this_a.getcompra());
											
						this_af.detallecompraBeanSwingJInternalFrame.getDetalleCompraLogic().setDetalleCompras(this_a.getcompra().getDetalleCompras());
						
						this_af.detallecompraBeanSwingJInternalFrame.crearFilaTotales();
						
						this_af.detallecompraBeanSwingJInternalFrame.actualizarVisualTableDatosDetalleCompra();
						
						this_a.setVariablesObjetoActualToFormularioTodoCompra(this_a.getcompra(),true,sTipo);
						
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
			
			CompraDetalleFormJInternalFrame compraDetalleFormJInternalFrame=(CompraDetalleFormJInternalFrame) this;
			
			CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame=(CompraBeanSwingJInternalFrame)compraDetalleFormJInternalFrame.jInternalFrameParent;			
				
			CompraBeanSwingJInternalFrameAdditional.ActualizarValoresCompra(compraDetalleFormJInternalFrame,compraBeanSwingJInternalFrame);
			
			
			
			/*
			Double suman=0.0;
			Double sub_total=0.0;
			Integer numero_items=0;
			Double total=0.0;
			
			for(DetalleCompra detalleasientocontable : compraDetalleFormJInternalFrame.detallemovimientoinventarioBeanSwingJInternalFrame.getDetalleCompraLogic().getDetalleCompras()) {
				if(!detalleasientocontable.getsType().equals(Constantes2.S_TOTALES)) {
					suman+=detalleasientocontable.getcosto_total();
					numero_items+=detalleasientocontable.getcantidad();
				}
			}
			
			sub_total=suman;
			total=suman;
			
			compraDetalleFormJInternalFrame.jTextFieldsumanCompra.setText(suman.toString());
			compraDetalleFormJInternalFrame.jTextFieldsub_totalCompra.setText(sub_total.toString());
			compraDetalleFormJInternalFrame.jTextFieldnumero_itemsCompra.setText(numero_items.toString());
			compraDetalleFormJInternalFrame.jTextFieldtotalCompra.setText(total.toString());
			*/
			
			
			System.out.println(sDominio+"->"+sDominioTipo);
			
		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	/*
	public static void ActualizarSecuencialCompra(CompraDetalleFormJInternalFrame this_af,CompraBeanSwingJInternalFrame this_a) throws Exception { //CompraDetalleFormJInternalFrame
		
		this_a.setVariablesFormularioToObjetoActualCompra(this_a.getcompra(),true);
		
		
		MovimientoInventarioLogicAdditional movimientoinventarioLogicAdditional=new MovimientoInventarioLogicAdditional();
		
		String sSecuencialFormato=movimientoinventarioLogicAdditional.GetSecuencialFormatoMovimiento(this_a.getcompra());
		
		this_a.getcompra().setnumero_secuencial(sSecuencialFormato);
		
		this_a.setVariablesObjetoActualToFormularioCompra(this_a.getcompra());
	}
	
	*/

	public static void ActualizarValoresCompra(CompraDetalleFormJInternalFrame this_af,CompraBeanSwingJInternalFrame this_a) throws Exception { //CompraDetalleFormJInternalFrame
		
		this_a.setVariablesFormularioToObjetoActualCompra(this_a.getcompra(),true);
		
		DetalleMovimientoInventarioLogicAdditional.GetTotales(this_a.getcompra(), this_af.detallecompraBeanSwingJInternalFrame.getDetalleCompraLogic().getDetalleCompras());
		
		this_a.setVariablesObjetoActualToFormularioCompra(this_a.getcompra());
	}
}

