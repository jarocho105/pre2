package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;

public class RunnableProceso implements Runnable {
	public Boolean isEnable=false;
	public JTabbedPane jTabbedPaneBusquedas;
	public JPanel jPanelParametrosReportes;
	public JTable jTableDatos;
	/*JScrollPane jScrollPaneTablaDatos,*/
	public JPanel jPanelCampos;
	public JPanel jPanelPaginacion;
	/*JScrollPane jScrollPaneDatosEdicion,*/
	public JPanel jPanelAcciones;
	public JPanel jPanelAccionesFormulario;
	public JMenuBar jMenuBarPrincipal;
	public JMenuBar jMenuBarDetalle;
	public JToolBar jToolBarPrincipal;
	public JToolBar jToolBarDetalle;
	public JMenuBar jmenuBar;
	public JMenuBar jmenuBarDetalle;
	public JToolBar jTtoolBar;
	public JToolBar jTtoolBarDetalle;
	public JInternalFrameBase jInternalFrameBase; 
	
	public RunnableProceso(Boolean isEnable,JInternalFrameBase jInternalFrameBase,JTabbedPane jTabbedPaneBusquedas,JPanel jPanelParametrosReportes, 
			JTable jTableDatos,/*jScrollPanelDatosTipoVisual,*/JPanel jPanelCampos,JPanel jPanelPaginacion, 
			/*jScrollPanelDatosEdicionTipoVisual,*/ JPanel jPanelAcciones,JPanel jPanelAccionesFormulario,
			JMenuBar jmenuBar,JMenuBar jmenuBarDetalle,JToolBar jTtoolBar,JToolBar jTtoolBarDetalle) {

		this.isEnable=isEnable;
		this.jInternalFrameBase=jInternalFrameBase;
		this.jTabbedPaneBusquedas=jTabbedPaneBusquedas;
		this.jPanelParametrosReportes=jPanelParametrosReportes;
		this.jTableDatos=jTableDatos;
		/*jScrollPanelDatosTipoVisual,*/
		this.jPanelCampos=jPanelCampos;
		this.jPanelPaginacion=jPanelPaginacion;
		/*jScrollPanelDatosEdicionTipoVisual,*/
		this.jPanelAcciones=jPanelAcciones;
		this.jPanelAccionesFormulario=jPanelAccionesFormulario;
		this.jmenuBar=jmenuBar;
		this.jmenuBarDetalle=jmenuBarDetalle;
		this.jTtoolBar=jTtoolBar;
		this.jTtoolBarDetalle=jTtoolBarDetalle;		
	}
	
	public RunnableProceso(Boolean isEnable,JTabbedPane jTabbedPaneBusquedas,JPanel jPanelParametrosReportes, 
							JTable jTableDatos,/*jScrollPanelDatosTipoVisual,*/JPanel jPanelCampos,JPanel jPanelPaginacion, 
							/*jScrollPanelDatosEdicionTipoVisual,*/ JPanel jPanelAcciones,JPanel jPanelAccionesFormulario,
							JMenuBar jmenuBar,JMenuBar jmenuBarDetalle,JToolBar jTtoolBar,JToolBar jTtoolBarDetalle) {
		
		this.isEnable=isEnable;
		this.jTabbedPaneBusquedas=jTabbedPaneBusquedas;
		this.jPanelParametrosReportes=jPanelParametrosReportes;
		this.jTableDatos=jTableDatos;
		/*jScrollPanelDatosTipoVisual,*/
		this.jPanelCampos=jPanelCampos;
		this.jPanelPaginacion=jPanelPaginacion;
		/*jScrollPanelDatosEdicionTipoVisual,*/
		this.jPanelAcciones=jPanelAcciones;
		this.jPanelAccionesFormulario=jPanelAccionesFormulario;
		this.jmenuBar=jmenuBar;
		this.jmenuBarDetalle=jmenuBarDetalle;
		this.jTtoolBar=jTtoolBar;
		this.jTtoolBarDetalle=jTtoolBarDetalle;
		
	}
	
	@Override
	public void run() {
		try {
				FuncionesSwing.enableDisablePanels(this.isEnable,this.jTabbedPaneBusquedas,this.jPanelParametrosReportes, this.jTableDatos,/*jScrollPanelDatosTipoVisual,*/this.jPanelCampos,this.jPanelPaginacion, /*jScrollPanelDatosEdicionTipoVisual,*/ this.jPanelAcciones,this.jPanelAccionesFormulario,this.jmenuBar,this.jmenuBarDetalle,this.jTtoolBar,this.jTtoolBarDetalle);		
			
				if(this.jInternalFrameBase!=null) {
					this.jInternalFrameBase.finishProcess();//this.
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
