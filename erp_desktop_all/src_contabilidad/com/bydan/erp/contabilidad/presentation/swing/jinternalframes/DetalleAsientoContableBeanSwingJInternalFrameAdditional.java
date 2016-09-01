







/*
*ADVERTENCIA : Este programa esta protegido por la ley de derechos de autor.
*La reproducci?n o distribuci?n il?cita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y ser?n objeto de todas las sanciones legales que correspondan.
*/
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;

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
import com.bydan.erp.contabilidad.util.DetalleAsientoContableConstantesFunciones;
import com.bydan.erp.contabilidad.business.entity.DetalleAsientoContable;

import com.bydan.erp.contabilidad.business.logic.*;
////import com.bydan.erp.contabilidad.service.ejb.interfaces.DetalleAsientoContableAdditionable;
////import com.bydan.erp.contabilidad.service.ejb.interfaces.DetalleAsientoContableAdditionableHome;
//import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.framework.erp.business.entity.DatoGeneral;

//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletConfig;

//CONTROL_INCLUDE

@SuppressWarnings("unused")
public class DetalleAsientoContableBeanSwingJInternalFrameAdditional extends JInternalFrameBase//DetalleAsientoContableBeanSwingJInternalFrame
{
private static final long serialVersionUID = 1L;
	//CONTROL_INICIO
	DetalleAsientoContableLogic detalleasientocontableLogic;
	DetalleAsientoContableLogicAdditional detalleasientocontableLogicAdditional;
	Mensaje mensaje;
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	
	public  DetalleAsientoContableBeanSwingJInternalFrameAdditional(PaginaTipo paginaTipo) throws Exception
	{
		super(paginaTipo);
		try 
		{			
			
			detalleasientocontableLogic=new DetalleAsientoContableLogic();
			detalleasientocontableLogicAdditional=new DetalleAsientoContableLogicAdditional();
			
		} 		
		catch(Exception e)
		{
			throw e;
		}
    } 	
	
	//CONTROL_FUNCION1
	
	public static void	RecargarFormDetalleAsientoContable(DetalleAsientoContableBeanSwingJInternalFrame detalleasientocontableBeanSwingJInternalFrame,String sTipo,Object oValor,ArrayList<DatoGeneral> arrDatoGeneral) throws Exception {	
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

			if(funcionTipo.equals(FuncionTipo.AFTER) && controlTipo.equals(ControlTipo.TEXTBOX) && eventoTipo.equals(EventoTipo.CHANGE) && eventoSubTipo.equals(EventoSubTipo.CHANGED)) {
				
				DetalleAsientoContableBeanSwingJInternalFrame this_a=(DetalleAsientoContableBeanSwingJInternalFrame)jInternalFrameBase;
				
				
				if(sTipo.equals("debito_localDetalleAsientoContable")) {
					if(!this_a.getEsControlTabla()) {
						
						this_a.setVariablesFormularioToObjetoActualDetalleAsientoContable(this_a.getdetalleasientocontable(),true);
						
						if(this_a.getdetalleasientocontable().getdebito_local()>0.0) {
							this_a.getdetalleasientocontable().setcredito_local(0.0);
							this_a.getdetalleasientocontable().setcredito_extran(0.0);
						}
						
						this_a.setVariablesObjetoActualToFormularioDetalleAsientoContable(this_a.getdetalleasientocontable());
						
					} else {
						
						if(this_a.getdetalleasientocontableAnterior().getdebito_local()>0.0) {
							this_a.getdetalleasientocontableAnterior().setcredito_local(0.0);
							this_a.getdetalleasientocontableAnterior().setcredito_extran(0.0);
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							//NO ENTENDIBLE PORQUE PONER
							//if(this.detalleasientocontableSessionBean.getEstaModoGuardarRelaciones() 
							//	|| this.detalleasientocontableSessionBean.getEsGuardarRelacionado())	{
							this_a.actualizarLista(this_a.getdetalleasientocontableAnterior(),this_a.detalleasientocontableLogic.getDetalleAsientoContables());
							//}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							this_a.actualizarLista(this_a.getdetalleasientocontableAnterior(),this_a.detalleasientocontables);
						}
						//ARCHITECTURE
						
						this_a.actualizarFilaTotales();
						this_a.actualizarVisualTableDatosDetalleAsientoContable();
						
					}
					
				} else if(sTipo.equals("credito_localDetalleAsientoContable")) {
					
					if(!this_a.getEsControlTabla()) {
						
						this_a.setVariablesFormularioToObjetoActualDetalleAsientoContable(this_a.getdetalleasientocontable(),true);
						
						if(this_a.getdetalleasientocontable().getcredito_local()>0.0) {
							this_a.getdetalleasientocontable().setdebito_local(0.0);
							this_a.getdetalleasientocontable().setdebito_extran(0.0);
						}
						
						this_a.setVariablesObjetoActualToFormularioDetalleAsientoContable(this_a.getdetalleasientocontable());
						
					} else {
						
						if(this_a.getdetalleasientocontableAnterior().getcredito_local()>0.0) {
							this_a.getdetalleasientocontableAnterior().setdebito_local(0.0);
							this_a.getdetalleasientocontableAnterior().setdebito_extran(0.0);
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							//NO ENTENDIBLE PORQUE PONER
							//if(this.detalleasientocontableSessionBean.getEstaModoGuardarRelaciones() 
							//	|| this.detalleasientocontableSessionBean.getEsGuardarRelacionado())	{
							this_a.actualizarLista(this_a.getdetalleasientocontableAnterior(),this_a.detalleasientocontableLogic.getDetalleAsientoContables());
							//}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							this_a.actualizarLista(this_a.getdetalleasientocontableAnterior(),this_a.detalleasientocontables);
						}
						//ARCHITECTURE
						
						this_a.actualizarFilaTotales();
						this_a.actualizarVisualTableDatosDetalleAsientoContable();
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