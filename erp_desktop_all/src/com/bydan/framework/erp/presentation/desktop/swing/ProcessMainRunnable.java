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
public class ProcessMainRunnable implements Runnable {
	public String sTipo="NONE";
	
	public Modulo moduloUsuarioSeleccionado;
	public Opcion opcionActual;
	public Usuario usuarioActual;
	public ResumenUsuario resumenUsuarioActual;
	public ParametroGeneralSg parametroGeneralSg;
	public ParametroGeneralUsuario parametroGeneralUsuario;
	public Modulo moduloActual;
	public JDesktopPane desktop;
	
	
	public Boolean esLogin=false;
	public MainJFrame mainJFrame;
	public LoginJFrame loginJFrame;
	
	
	public void run() {
		
		
		try {
			
			//System.out.println(""+this.sTipo+"");
			
			if(!esLogin) {
				if(this.sTipo.equals("START")) {
					mainJFrame.habilitarDeshabilitarControlesMainMenu(false);
			    	
					mainJFrame.startProcess();
					
					//FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoVisual ,jPanelParametrosReportesTipoVisual,jTableDatosTipoVisual, /*jScrollPanelDatosTipoVisual,*/jPanelCamposTipoVisual,jPanelPaginacionTipoVisual, /*jScrollPanelDatosEdicionTipoVisual,*/ jPanelAccionesTipoVisual,jPanelAccionesFormularioTipoVisual,jmenuBarTipoVisual,jmenuBarDetalleTipoVisual,jTtoolBarTipoVisual,jTtoolBarDetalleTipoVisual);
					
					//jInternalFrameBase.startProcess();
					
				} else if(this.sTipo.equals("END")){
					mainJFrame.habilitarDeshabilitarControlesMainMenu(true);
		    		  
					mainJFrame.finishProcess();
		    		 
					//FuncionesSwing.enableDisablePanels(true,jTabbedPaneBusquedasTipoVisual ,jPanelParametrosReportesTipoVisual, jTableDatosTipoVisual,/*jScrollPanelDatosTipoVisual,*/jPanelCamposTipoVisual,jPanelPaginacionTipoVisual, /*jScrollPanelDatosEdicionTipoVisual,*/ jPanelAccionesTipoVisual,jPanelAccionesFormularioTipoVisual,jmenuBarTipoVisual,jmenuBarDetalleTipoVisual,jTtoolBarTipoVisual,jTtoolBarDetalleTipoVisual);
					
					//jInternalFrameBase.finishProcess();
				}
				
			} else {
				if(this.sTipo.equals("START")) {
					loginJFrame.habilitarDeshabilitarControlesLogin(false);
					
					loginJFrame.startProcess();
					
				} else if(this.sTipo.equals("END")){
					loginJFrame.habilitarDeshabilitarControlesLogin(true);
		    		  
					loginJFrame.finishProcess();
				}
			}
		
			//System.out.println(""+this.sTipo+" ");
			
			
		} catch (Exception e) {
			//FuncionesSwing.enableDisablePanels(true,jTabbedPaneBusquedasTipoVisual ,jPanelParametrosReportesTipoVisual,jTableDatosTipoVisual, /*jScrollPanelDatosTipoVisual,*/jPanelCamposTipoVisual,jPanelPaginacionTipoVisual, /*jScrollPanelDatosEdicionTipoVisual,*/ jPanelAccionesTipoVisual,jPanelAccionesFormularioTipoVisual,jmenuBarTipoVisual,jmenuBarDetalleTipoVisual,jTtoolBarTipoVisual,jTtoolBarDetalleTipoVisual);
			
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

		
		
		
		
		
		
		
		public MainJFrame getMainJFrame() {
			return mainJFrame;
		}

		public void setMainJFrame(MainJFrame mainJFrame) {
			this.mainJFrame = mainJFrame;
		}

		public Boolean getEsLogin() {
			return esLogin;
		}

		public void setEsLogin(Boolean esLogin) {
			this.esLogin = esLogin;
		}

		public LoginJFrame getLoginJFrame() {
			return loginJFrame;
		}

		public void setLoginJFrame(LoginJFrame loginJFrame) {
			this.loginJFrame = loginJFrame;
		}

		
		
}
