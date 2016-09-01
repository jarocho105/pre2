package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.PaginaTipo;

@SuppressWarnings("unused")
public class ProcessRunnable implements Runnable {
	public String sTipo="NONE";
	
	public Modulo moduloUsuarioSeleccionado;
	public Opcion opcionActual;
	public Usuario usuarioActual;
	public ResumenUsuario resumenUsuarioActual;
	public ParametroGeneralSg parametroGeneralSg;
	public ParametroGeneralUsuario parametroGeneralUsuario;
	public Modulo moduloActual;
	public JDesktopPane desktop;
	
	public JInternalFrameBase jInternalFrameBase;
	
	public JTabbedPane jTabbedPaneBusquedas; 
	
	public JPanel jPanelParametrosReportes;
	//public JScrollPane jScrollPanelDatos;
	public JTable jTableDatos;
	public JPanel jPanelCampos;
	public JPanel jPanelPaginacion;
	//public JScrollPane jScrollPanelDatosEdicion;
	public JPanel jPanelAcciones;
	public JPanel jPanelAccionesFormulario;
	
	public JMenuBar jmenuBar;
	public JMenuBar jmenuBarDetalle;
	public JToolBar jTtoolBar;
	public JToolBar jTtoolBarDetalle;
	
	
	public void run() {
		
		
		try {
			
			//System.out.println(""+this.sTipo+"");
			
			if(this.sTipo.equals("START")) {
				FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedas ,jPanelParametrosReportes,jTableDatos, /*jScrollPanelDatos,*/jPanelCampos,jPanelPaginacion, /*jScrollPanelDatosEdicion,*/ jPanelAcciones,jPanelAccionesFormulario,jmenuBar,jmenuBarDetalle,jTtoolBar,jTtoolBarDetalle);
				
				jInternalFrameBase.startProcess();
				
			} else if(this.sTipo.equals("END")){
				FuncionesSwing.enableDisablePanels(true,jTabbedPaneBusquedas ,jPanelParametrosReportes, jTableDatos,/*jScrollPanelDatos,*/jPanelCampos,jPanelPaginacion, /*jScrollPanelDatosEdicion,*/ jPanelAcciones,jPanelAccionesFormulario,jmenuBar,jmenuBarDetalle,jTtoolBar,jTtoolBarDetalle);
				
				jInternalFrameBase.finishProcess();
			}
			
			//System.out.println(""+this.sTipo+" ");
			
			
		} catch (Exception e) {
			FuncionesSwing.enableDisablePanels(true,jTabbedPaneBusquedas ,jPanelParametrosReportes,jTableDatos, /*jScrollPanelDatos,*/jPanelCampos,jPanelPaginacion, /*jScrollPanelDatosEdicion,*/ jPanelAcciones,jPanelAccionesFormulario,jmenuBar,jmenuBarDetalle,jTtoolBar,jTtoolBarDetalle);
			
			System.out.println("ERROR!!!!! MODULO "+this.sTipo+" CARGADO!!!!! ");
						
			e.printStackTrace();
		}				
    }
		
		public String getsTipo() {
			return sTipo;
		}

		public void setsTipo(String sTipo) {
			this.sTipo = sTipo;
		}

		public Modulo getModuloUsuarioSeleccionado() {
			return moduloUsuarioSeleccionado;
		}

		public void setModuloUsuarioSeleccionado(Modulo moduloUsuarioSeleccionado) {
			this.moduloUsuarioSeleccionado = moduloUsuarioSeleccionado;
		}

		public Opcion getOpcionActual() {
			return opcionActual;
		}

		public void setOpcionActual(Opcion opcionActual) {
			this.opcionActual = opcionActual;
		}

		public Usuario getUsuarioActual() {
			return usuarioActual;
		}

		public void setUsuarioActual(Usuario usuarioActual) {
			this.usuarioActual = usuarioActual;
		}

		public ResumenUsuario getResumenUsuarioActual() {
			return resumenUsuarioActual;
		}

		public void setResumenUsuarioActual(ResumenUsuario resumenUsuarioActual) {
			this.resumenUsuarioActual = resumenUsuarioActual;
		}

		public ParametroGeneralSg getParametroGeneralSg() {
			return parametroGeneralSg;
		}

		public void setParametroGeneralSg(ParametroGeneralSg parametroGeneralSg) {
			this.parametroGeneralSg = parametroGeneralSg;
		}

		public ParametroGeneralUsuario getParametroGeneralUsuario() {
			return parametroGeneralUsuario;
		}

		public void setParametroGeneralUsuario(
				ParametroGeneralUsuario parametroGeneralUsuario) {
			this.parametroGeneralUsuario = parametroGeneralUsuario;
		}

		public Modulo getModuloActual() {
			return moduloActual;
		}

		public void setModuloActual(Modulo moduloActual) {
			this.moduloActual = moduloActual;
		}

		public JDesktopPane getDesktop() {
			return desktop;
		}

		public void setDesktop(JDesktopPane desktop) {
			this.desktop = desktop;
		}

		
		
		
		
		
		
		
		
		
		
		
		public JInternalFrameBase getjInternalFrameBase() {
			return jInternalFrameBase;
		}

		public void setjInternalFrameBase(JInternalFrameBase jInternalFrameBase) {
			this.jInternalFrameBase = jInternalFrameBase;
		}

		public JTabbedPane getjTabbedPaneBusquedas() {
			return jTabbedPaneBusquedas;
		}

		public void setjTabbedPaneBusquedas(
				JTabbedPane jTabbedPaneBusquedas) {
			this.jTabbedPaneBusquedas = jTabbedPaneBusquedas;
		}

		public JPanel getjPanelParametrosReportes() {
			return jPanelParametrosReportes;
		}

		public void setjPanelParametrosReportes(
				JPanel jPanelParametrosReportes) {
			this.jPanelParametrosReportes = jPanelParametrosReportes;
		}

		public JTable getjTableDatos() {
			return jTableDatos;
		}

		public void setjTableDatos(JTable jTableDatos) {
			this.jTableDatos = jTableDatos;
		}

		public JPanel getjPanelCampos() {
			return jPanelCampos;
		}

		public void setjPanelCampos(JPanel jPanelCampos) {
			this.jPanelCampos = jPanelCampos;
		}

		public JPanel getjPanelPaginacion() {
			return jPanelPaginacion;
		}

		public void setjPanelPaginacion(JPanel jPanelPaginacion) {
			this.jPanelPaginacion = jPanelPaginacion;
		}

		public JPanel getjPanelAcciones() {
			return jPanelAcciones;
		}

		public void setjPanelAcciones(JPanel jPanelAcciones) {
			this.jPanelAcciones = jPanelAcciones;
		}

		public JPanel getjPanelAccionesFormulario() {
			return jPanelAccionesFormulario;
		}

		public void setjPanelAccionesFormulario(
				JPanel jPanelAccionesFormulario) {
			this.jPanelAccionesFormulario = jPanelAccionesFormulario;
		}

		public JMenuBar getJmenuBar() {
			return jmenuBar;
		}

		public void setJmenuBar(JMenuBar jmenuBar) {
			this.jmenuBar = jmenuBar;
		}

		public JMenuBar getJmenuBarDetalle() {
			return jmenuBarDetalle;
		}

		public void setJmenuBarDetalle(JMenuBar jmenuBarDetalle) {
			this.jmenuBarDetalle = jmenuBarDetalle;
		}

		public JToolBar getjTtoolBar() {
			return jTtoolBar;
		}

		public void setjTtoolBar(JToolBar jTtoolBar) {
			this.jTtoolBar = jTtoolBar;
		}

		public JToolBar getjTtoolBarDetalle() {
			return jTtoolBarDetalle;
		}

		public void setjTtoolBarDetalle(JToolBar jTtoolBarDetalle) {
			this.jTtoolBarDetalle = jTtoolBarDetalle;
		}		
}
