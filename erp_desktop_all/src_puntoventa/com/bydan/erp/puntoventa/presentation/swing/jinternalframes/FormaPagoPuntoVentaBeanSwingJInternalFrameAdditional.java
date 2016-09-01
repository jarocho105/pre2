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
import com.bydan.erp.facturacion.business.entity.TipoFormaPago;
import com.bydan.erp.puntoventa.util.FormaPagoPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.business.entity.FormaPagoPuntoVenta;
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


//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class FormaPagoPuntoVentaBeanSwingJInternalFrameAdditional extends JInternalFrameBase//FormaPagoPuntoVentaBeanSwingJInternalFrame
{
	private static final long serialVersionUID = 1L;
	
	
	//CONTROL_INICIO
	FormaPagoPuntoVentaLogic formapagopuntoventaLogic;
	FormaPagoPuntoVentaLogicAdditional formapagopuntoventaLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  FormaPagoPuntoVentaBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			formapagopuntoventaLogic=new FormaPagoPuntoVentaLogic();
			formapagopuntoventaLogicAdditional=new FormaPagoPuntoVentaLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormFormaPagoPuntoVenta(FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
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
		FormaPagoPuntoVentaLogicAdditional formapagopuntoventaLogicAdditional=new FormaPagoPuntoVentaLogicAdditional();
		
		FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=(FormaPagoPuntoVentaBeanSwingJInternalFrame)jInternalFrameBase;
		
		if(JOptionPane.showConfirmDialog(jInternalFrameBase, "ESTA SEGURO DE PROCESAR "+sLabelProceso+" Forma PagoES SELECCIONADOS?", "MANTENIMIENTO DE ACCION", JOptionPane.OK_CANCEL_OPTION) == 0) {
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {	//TO_COMMENT
				esProcesado=formapagopuntoventaLogicAdditional.ProcesarAccion(formapagopuntoventaBeanSwingJInternalFrame.getParametroGeneralUsuario(),formapagopuntoventaBeanSwingJInternalFrame.getModuloActual(),formapagopuntoventaBeanSwingJInternalFrame.getOpcionActual(),formapagopuntoventaBeanSwingJInternalFrame.getUsuarioActual(),sProceso,formapagopuntoventaBeanSwingJInternalFrame.getFormaPagoPuntoVentaLogic().getFormaPagoPuntoVentas());
			} else if(Constantes.ISUSAEJBREMOTE) {//TO_COMMENT
			} else if(Constantes.ISUSAEJBHOME) {//TO_COMMENT
			}//TO_COMMENT
			//ARCHITECTURE
			
			if(esProcesado) {
				JOptionPane.showMessageDialog(formapagopuntoventaBeanSwingJInternalFrame,"PROCESO REALIZADO CORRECTAMENTE","PROCESO ",JOptionPane.INFORMATION_MESSAGE);		
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

			FormaPagoPuntoVentaBeanSwingJInternalFrame this_a=(FormaPagoPuntoVentaBeanSwingJInternalFrame)jInternalFrameBase;
			FormaPagoPuntoVentaDetalleFormJInternalFrame this_af=this_a.jInternalFrameDetalleFormFormaPagoPuntoVenta;
			
			if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.FORM) && eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.NEW)) {
				FormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.ActualizarVisibilidadPaneles(1L,this_af);
				
			} else if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.FORM) && eventoTipo.equals(EventoTipo.LOAD) && eventoSubTipo.equals(EventoSubTipo.SELECTED)) {
				FormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.ActualizarVisibilidadPaneles(this_a.getformapagopuntoventa().getTipoFormaPago().getid_tipo_grupo_forma_pago(),this_af);
				
			} else if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.TEXTBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
				
				/*
				if(sTipo.equals("valor_descuentoFormaPagoPuntoVenta")) {									
					
					FormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.ActualizarValoresFormaPagoPuntoVenta(this_af,this_a);
				
				}
				*/
				
			} else if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.COMBOBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
				
				if(sTipo.equals("id_tipo_forma_pagoFormaPagoPuntoVenta")) {													
					
					if(!this_a.getEsControlTabla()) {
						
						FormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.ActualizarVisibilidadPaneles(this_a.getformapagopuntoventa(),sTipo,this_af);
						
						this_a.setVariablesObjetoActualToFormularioTodoFormaPagoPuntoVenta(this_a.getformapagopuntoventa());
					
						
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
	
	public static void ActualizarVisibilidadPaneles(FormaPagoPuntoVenta formapagopuntoventa,String sTipo,FormaPagoPuntoVentaDetalleFormJInternalFrame this_af) {
		TipoFormaPago tipoformapago=formapagopuntoventa.getTipoFormaPago();
		
		FormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.ActualizarVisibilidadPaneles(tipoformapago.getid_tipo_grupo_forma_pago(),this_af);
		
		
		//System.out.println(tipoformapago.getid_tipo_grupo_forma_pago());
	}
	
	public static void ActualizarVisibilidadPaneles(Long id_tipo_grupo_forma_pago,FormaPagoPuntoVentaDetalleFormJInternalFrame this_af) {
		
		if(id_tipo_grupo_forma_pago.equals(1L)) {
			this_af.jPanelCamposIniciochequeFormaPagoPuntoVenta.setVisible(false);
			this_af.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.setVisible(false);
			this_af.jPanelCamposIniciocreditoFormaPagoPuntoVenta.setVisible(false);
			
		} else if(id_tipo_grupo_forma_pago.equals(2L)) {
			this_af.jPanelCamposIniciochequeFormaPagoPuntoVenta.setVisible(true);
			this_af.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.setVisible(false);
			this_af.jPanelCamposIniciocreditoFormaPagoPuntoVenta.setVisible(false);
			
		} else if(id_tipo_grupo_forma_pago.equals(3L)) {
			this_af.jPanelCamposIniciochequeFormaPagoPuntoVenta.setVisible(false);
			this_af.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.setVisible(true);
			this_af.jPanelCamposIniciocreditoFormaPagoPuntoVenta.setVisible(false);
			
		} else if(id_tipo_grupo_forma_pago.equals(4L)) {
			this_af.jPanelCamposIniciochequeFormaPagoPuntoVenta.setVisible(false);
			this_af.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.setVisible(false);
			this_af.jPanelCamposIniciocreditoFormaPagoPuntoVenta.setVisible(true);
		}
		
	}
}

