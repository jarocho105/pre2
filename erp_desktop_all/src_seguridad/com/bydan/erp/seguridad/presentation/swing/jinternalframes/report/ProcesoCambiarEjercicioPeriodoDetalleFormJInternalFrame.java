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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes.report;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.report.*;



//import com.bydan.erp.seguridad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.report.*;
import com.bydan.erp.seguridad.util.report.ProcesoCambiarEjercicioPeriodoConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.report.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class ProcesoCambiarEjercicioPeriodoDetalleFormJInternalFrame extends ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoCambiarEjercicioPeriodo;
	
	protected JMenuBar jmenuBarDetalleProcesoCambiarEjercicioPeriodo;
	
	protected JMenu jmenuDetalleProcesoCambiarEjercicioPeriodo;
	protected JMenu jmenuDetalleArchivoProcesoCambiarEjercicioPeriodo;
	protected JMenu jmenuDetalleAccionesProcesoCambiarEjercicioPeriodo;
	protected JMenu jmenuDetalleDatosProcesoCambiarEjercicioPeriodo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoCambiarEjercicioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCambiarEjercicioPeriodo;	
	protected GridBagConstraints gridBagConstraintsProcesoCambiarEjercicioPeriodo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoCambiarEjercicioPeriodo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ProcesoCambiarEjercicioPeriodoSessionBean procesocambiarejercicioperiodoSessionBean;
	
	
	
		
	
	public ProcesoCambiarEjercicioPeriodoLogic procesocambiarejercicioperiodoLogic;
	
	public JScrollPane jScrollPanelDatosProcesoCambiarEjercicioPeriodo;
	public JScrollPane jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo;
	public JScrollPane jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo;
	
	protected JPanel jPanelCamposProcesoCambiarEjercicioPeriodo;    
	protected JPanel jPanelCamposOcultosProcesoCambiarEjercicioPeriodo;    	
	protected JPanel jPanelAccionesProcesoCambiarEjercicioPeriodo;
	protected JPanel jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo;
    
	
	
	protected Integer iXPanelCamposProcesoCambiarEjercicioPeriodo=0;
	protected Integer iYPanelCamposProcesoCambiarEjercicioPeriodo=0;
	
	protected Integer iXPanelCamposOcultosProcesoCambiarEjercicioPeriodo=0;
	protected Integer iYPanelCamposOcultosProcesoCambiarEjercicioPeriodo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoCambiarEjercicioPeriodo;
	public JButton jButtonModificarProcesoCambiarEjercicioPeriodo;
	public JButton jButtonActualizarProcesoCambiarEjercicioPeriodo;
    public JButton jButtonEliminarProcesoCambiarEjercicioPeriodo;
	public JButton jButtonCancelarProcesoCambiarEjercicioPeriodo;
    public JButton jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo;
	public JButton jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonCerrarProcesoCambiarEjercicioPeriodo;
	
	
	protected JButton jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoCambiarEjercicioPeriodo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoCambiarEjercicioPeriodo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoCambiarEjercicioPeriodo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonModificarToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonActualizarToolBarProcesoCambiarEjercicioPeriodo;
    protected JButton jButtonEliminarToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonCancelarToolBarProcesoCambiarEjercicioPeriodo;
    protected JButton jButtonGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCambiarEjercicioPeriodo;
	protected JButton jButtonCerrarToolBarProcesoCambiarEjercicioPeriodo;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoCambiarEjercicioPeriodo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemModificarProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemActualizarProcesoCambiarEjercicioPeriodo;
    protected JMenuItem jMenuItemEliminarProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemCancelarProcesoCambiarEjercicioPeriodo;
    protected JMenuItem jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemCerrarProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCambiarEjercicioPeriodo;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCambiarEjercicioPeriodo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoCambiarEjercicioPeriodo;
	public JLabel jLabelIdProcesoCambiarEjercicioPeriodo;
	public JLabel jLabelidProcesoCambiarEjercicioPeriodo;
	public JButton jButtonidProcesoCambiarEjercicioPeriodoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_sistemaProcesoCambiarEjercicioPeriodo;
	public JLabel jLabelfecha_sistemaProcesoCambiarEjercicioPeriodo;
	//public JFormattedTextField jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo;

	public JDateChooser jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo;
	public JButton jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoCambiarEjercicioPeriodoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoCambiarEjercicioPeriodo=new JPanel();
				this.jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo=new JPanel();
				this.jmenuBarDetalleProcesoCambiarEjercicioPeriodo=new JMenuBar();
				this.jTtoolBarDetalleProcesoCambiarEjercicioPeriodo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarEjercicioPeriodoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoCambiarEjercicioPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoCambiarEjercicioPeriodoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoCambiarEjercicioPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarEjercicioPeriodoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCambiarEjercicioPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarEjercicioPeriodoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCambiarEjercicioPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCambiarEjercicioPeriodoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCambiarEjercicioPeriodo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarProcesoCambiarEjercicioPeriodo() {
		return this.jButtonActualizarToolBarProcesoCambiarEjercicioPeriodo;
	}
	
	public JButton getjButtonEliminarToolBarProcesoCambiarEjercicioPeriodo() {
		return this.jButtonEliminarToolBarProcesoCambiarEjercicioPeriodo;
	}
	
	public JButton getjButtonCancelarToolBarProcesoCambiarEjercicioPeriodo() {
		return this.jButtonCancelarToolBarProcesoCambiarEjercicioPeriodo;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoCambiarEjercicioPeriodo() {
		return this.jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo)	{
		this.jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo = jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo() {
		return this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo(
			JComboBox jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo) {
		this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo = jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo(
			JComboBox jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo) {
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo = jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo() {
		return this.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo(
			JComboBox jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo) {
		this.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo = jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesocambiarejercicioperiodoSessionBean=new ProcesoCambiarEjercicioPeriodoSessionBean();
		
		this.procesocambiarejercicioperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocambiarejercicioperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCambiarEjercicioPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCambiarEjercicioPeriodoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCambiarEjercicioPeriodoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Cambiar Ejercicio Periodo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		ProcesoCambiarEjercicioPeriodoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoCambiarEjercicioPeriodo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoCambiarEjercicioPeriodo=new JButtonMe();
				this.jButtonModificarToolBarProcesoCambiarEjercicioPeriodo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarDetalleProcesoCambiarEjercicioPeriodo,
							"actualizar","actualizar","Actualizar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarDetalleProcesoCambiarEjercicioPeriodo,
							"eliminar","eliminar","Eliminar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarDetalleProcesoCambiarEjercicioPeriodo,
							"cancelar","cancelar","Cancelar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarDetalleProcesoCambiarEjercicioPeriodo,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoCambiarEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoCambiarEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoCambiarEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoCambiarEjercicioPeriodo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoCambiarEjercicioPeriodo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoCambiarEjercicioPeriodo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoCambiarEjercicioPeriodo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoCambiarEjercicioPeriodo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCambiarEjercicioPeriodo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCambiarEjercicioPeriodo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCambiarEjercicioPeriodo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoCambiarEjercicioPeriodo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoCambiarEjercicioPeriodo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoCambiarEjercicioPeriodo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoCambiarEjercicioPeriodo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoCambiarEjercicioPeriodo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoCambiarEjercicioPeriodo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoCambiarEjercicioPeriodo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoCambiarEjercicioPeriodo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoCambiarEjercicioPeriodo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoCambiarEjercicioPeriodo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoCambiarEjercicioPeriodo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoCambiarEjercicioPeriodo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCambiarEjercicioPeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCambiarEjercicioPeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCambiarEjercicioPeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoCambiarEjercicioPeriodo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoCambiarEjercicioPeriodo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoCambiarEjercicioPeriodo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCambiarEjercicioPeriodo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCambiarEjercicioPeriodo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCambiarEjercicioPeriodo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoCambiarEjercicioPeriodo.add(this.jMenuItemDetalleCerrarProcesoCambiarEjercicioPeriodo);
		
		this.jmenuDetalleAccionesProcesoCambiarEjercicioPeriodo.add(this.jMenuItemActualizarProcesoCambiarEjercicioPeriodo);
		this.jmenuDetalleAccionesProcesoCambiarEjercicioPeriodo.add(this.jMenuItemEliminarProcesoCambiarEjercicioPeriodo);
		this.jmenuDetalleAccionesProcesoCambiarEjercicioPeriodo.add(this.jMenuItemCancelarProcesoCambiarEjercicioPeriodo);		
		
		//this.jmenuDetalleDatosProcesoCambiarEjercicioPeriodo.add(this.jMenuItemDetalleAbrirOrderByProcesoCambiarEjercicioPeriodo);				
		this.jmenuDetalleDatosProcesoCambiarEjercicioPeriodo.add(this.jMenuItemDetalleMostarOcultarProcesoCambiarEjercicioPeriodo);				
				
		//this.jmenuDetalleAccionesProcesoCambiarEjercicioPeriodo.add(this.jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoCambiarEjercicioPeriodo.add(this.jmenuDetalleArchivoProcesoCambiarEjercicioPeriodo);		
		this.jmenuBarDetalleProcesoCambiarEjercicioPeriodo.add(this.jmenuDetalleAccionesProcesoCambiarEjercicioPeriodo);		
		this.jmenuBarDetalleProcesoCambiarEjercicioPeriodo.add(this.jmenuDetalleDatosProcesoCambiarEjercicioPeriodo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoCambiarEjercicioPeriodo);				
	}
	
	
	public void inicializarElementosCamposProcesoCambiarEjercicioPeriodo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoCambiarEjercicioPeriodo = new JLabelMe();
		jLabelIdProcesoCambiarEjercicioPeriodo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoCambiarEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoCambiarEjercicioPeriodo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoCambiarEjercicioPeriodo.setToolTipText(ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoCambiarEjercicioPeriodo= new GridBagLayout();

		this.jPanelidProcesoCambiarEjercicioPeriodo.setLayout(this.gridaBagLayoutProcesoCambiarEjercicioPeriodo);

		jLabelidProcesoCambiarEjercicioPeriodo = new JLabel();
		jLabelidProcesoCambiarEjercicioPeriodo.setText("Id");

		jLabelidProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_sistemaProcesoCambiarEjercicioPeriodo = new JLabelMe();
		this.jLabelfecha_sistemaProcesoCambiarEjercicioPeriodo.setText(""+ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_FECHASISTEMA+" : *");
		this.jLabelfecha_sistemaProcesoCambiarEjercicioPeriodo.setToolTipText("Fecha Sistema");
		this.jLabelfecha_sistemaProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_sistemaProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_sistemaProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_sistemaProcesoCambiarEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_sistemaProcesoCambiarEjercicioPeriodo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_sistemaProcesoCambiarEjercicioPeriodo.setToolTipText(ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_FECHASISTEMA);
		this.gridaBagLayoutProcesoCambiarEjercicioPeriodo = new GridBagLayout();
		this.jPanelfecha_sistemaProcesoCambiarEjercicioPeriodo.setLayout(this.gridaBagLayoutProcesoCambiarEjercicioPeriodo);


		//jFormattedTextFieldfecha_sistemaProcesoCambiarEjercicioPeriodo= new JFormattedTextFieldMe();

		jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo= new JDateChooser();
		jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo.setEnabled(false);
		jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo.setDate(new Date());
		jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_sistemaProcesoCambiarEjercicioPeriodo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda= new JButtonMe();
		this.jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda.setText("U");
		this.jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda"));

		if(this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoCambiarEjercicioPeriodo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleProcesoCambiarEjercicioPeriodo = new ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Cambiar Ejercicio Periodo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCambiarEjercicioPeriodo= new GridBagLayout();
		

		
		String sToolTipProcesoCambiarEjercicioPeriodo="";
		sToolTipProcesoCambiarEjercicioPeriodo=ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCambiarEjercicioPeriodo+="(Seguridad.ProcesoCambiarEjercicioPeriodo)";
		}
		
		if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCambiarEjercicioPeriodo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonModificarProcesoCambiarEjercicioPeriodo = new JButtonMe();
        this.jButtonActualizarProcesoCambiarEjercicioPeriodo = new JButtonMe();
        this.jButtonEliminarProcesoCambiarEjercicioPeriodo = new JButtonMe();
        this.jButtonCancelarProcesoCambiarEjercicioPeriodo = new JButtonMe();
        this.jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo = new JButtonMe();
		this.jButtonCerrarProcesoCambiarEjercicioPeriodo = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoCambiarEjercicioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoCambiarEjercicioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoCambiarEjercicioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Cambiar Ejercicio Periodo";
		
		if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cambiar Ejercicio Periodos" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoCambiarEjercicioPeriodo.setName("jPanelCamposProcesoCambiarEjercicioPeriodo"); 

		this.jPanelCamposOcultosProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoCambiarEjercicioPeriodo.setName("jPanelCamposOcultosProcesoCambiarEjercicioPeriodo"); 

        this.jPanelAccionesProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCambiarEjercicioPeriodo.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCambiarEjercicioPeriodo.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoCambiarEjercicioPeriodo.setText("Nuevo");
		this.jButtonModificarProcesoCambiarEjercicioPeriodo.setText("Editar");
        this.jButtonActualizarProcesoCambiarEjercicioPeriodo.setText("Actualizar");
        this.jButtonEliminarProcesoCambiarEjercicioPeriodo.setText("Eliminar");
        this.jButtonCancelarProcesoCambiarEjercicioPeriodo.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.setText("Guardar");
		this.jButtonCerrarProcesoCambiarEjercicioPeriodo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCambiarEjercicioPeriodo,"nuevo_button","Nuevo",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoCambiarEjercicioPeriodo,"modificar_button","Editar",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoCambiarEjercicioPeriodo,"actualizar_button","Actualizar",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoCambiarEjercicioPeriodo,"eliminar_button","Eliminar",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoCambiarEjercicioPeriodo,"cancelar_button","Cancelar",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo,"guardarcambios_button","Guardar",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo,"guardarcambiostabla_button","Guardar",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCambiarEjercicioPeriodo,"cerrar_button","Salir",this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoCambiarEjercicioPeriodo.setToolTipText("Nuevo"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoCambiarEjercicioPeriodo.setToolTipText("Editar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoCambiarEjercicioPeriodo.setToolTipText("Actualizar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoCambiarEjercicioPeriodo.setToolTipText("Eliminar)"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoCambiarEjercicioPeriodo.setToolTipText("Cancelar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo.setToolTipText("Guardar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.setToolTipText("Guardar"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCambiarEjercicioPeriodo.setToolTipText("Salir"+" "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonNuevoProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCambiarEjercicioPeriodo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonActualizarProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoCambiarEjercicioPeriodo"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonEliminarProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoCambiarEjercicioPeriodo"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonCancelarProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoCambiarEjercicioPeriodo"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonCerrarProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCambiarEjercicioPeriodo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCambiarEjercicioPeriodo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoCambiarEjercicioPeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoCambiarEjercicioPeriodo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoCambiarEjercicioPeriodo.setToolTipText("Nuevo ProcesoCambiarEjercicioPeriodo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoCambiarEjercicioPeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoCambiarEjercicioPeriodo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoCambiarEjercicioPeriodo.setToolTipText("Sin Cerrar Ventana ProcesoCambiarEjercicioPeriodo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoCambiarEjercicioPeriodo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoCambiarEjercicioPeriodo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoCambiarEjercicioPeriodo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoCambiarEjercicioPeriodo = new JLabelMe();
		
		this.jLabelAccionesProcesoCambiarEjercicioPeriodo.setText("Acciones");		
		this.jLabelAccionesProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoCambiarEjercicioPeriodo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoCambiarEjercicioPeriodo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoCambiarEjercicioPeriodo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoCambiarEjercicioPeriodo = new GridBagLayout();
		
		this.jPanelCamposProcesoCambiarEjercicioPeriodo.setLayout(gridaBagLayoutCamposProcesoCambiarEjercicioPeriodo);
		this.jPanelCamposOcultosProcesoCambiarEjercicioPeriodo.setLayout(gridaBagLayoutCamposOcultosProcesoCambiarEjercicioPeriodo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoCambiarEjercicioPeriodo.add(jLabelIdProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);



	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 1;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoCambiarEjercicioPeriodo.add(jLabelidProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);


	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_sistemaProcesoCambiarEjercicioPeriodo.add(jLabelfecha_sistemaProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 2;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipadx = 0;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_sistemaProcesoCambiarEjercicioPeriodo.add(jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
	}

	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 1;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipadx = 0;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_sistemaProcesoCambiarEjercicioPeriodo.add(jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iYPanelCamposProcesoCambiarEjercicioPeriodo;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iXPanelCamposProcesoCambiarEjercicioPeriodo++;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarEjercicioPeriodo.add(this.jPanelidProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);



	if(iXPanelCamposProcesoCambiarEjercicioPeriodo % 1==0) {
		iXPanelCamposProcesoCambiarEjercicioPeriodo=0;
		iYPanelCamposProcesoCambiarEjercicioPeriodo++;
	}
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iYPanelCamposProcesoCambiarEjercicioPeriodo;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iXPanelCamposProcesoCambiarEjercicioPeriodo++;
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCambiarEjercicioPeriodo.add(this.jPanelfecha_sistemaProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);



	if(iXPanelCamposProcesoCambiarEjercicioPeriodo % 1==0) {
		iXPanelCamposProcesoCambiarEjercicioPeriodo=0;
		iYPanelCamposProcesoCambiarEjercicioPeriodo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoCambiarEjercicioPeriodo= new GridBagLayout();
		this.jPanelAccionesProcesoCambiarEjercicioPeriodo.setLayout(gridaBagLayoutAccionesProcesoCambiarEjercicioPeriodo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoCambiarEjercicioPeriodo= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo.setLayout(gridaBagLayoutAccionesFormularioProcesoCambiarEjercicioPeriodo);
		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo.add(this.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoCambiarEjercicioPeriodo.add(this.jButtonModificarProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);							

		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoCambiarEjercicioPeriodo.add(this.jButtonEliminarProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		
			
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCambiarEjercicioPeriodo.add(this.jButtonActualizarProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);


		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCambiarEjercicioPeriodo.add(this.jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);	
		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = 0;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoCambiarEjercicioPeriodo.add(this.jButtonCancelarProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCambiarEjercicioPeriodo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCambiarEjercicioPeriodo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;		
			//this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =0;
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoCambiarEjercicioPeriodoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoCambiarEjercicioPeriodo = new ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Cambiar Ejercicio Periodo DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Proceso Cambiar Ejercicio Periodo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Cambiar Ejercicio Periodo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoCambiarEjercicioPeriodoModel procesocambiarejercicioperiodoModel=new ProcesoCambiarEjercicioPeriodoModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoCambiarEjercicioPeriodoModel.ProcesoCambiarEjercicioPeriodoFocusTraversalPolicy procesocambiarejercicioperiodoFocusTraversalPolicy = procesocambiarejercicioperiodoModel.new ProcesoCambiarEjercicioPeriodoFocusTraversalPolicy(this);
			
			//procesocambiarejercicioperiodoFocusTraversalPolicy.setprocesocambiarejercicioperiodoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesocambiarejercicioperiodoModel);
			
			
			this.jContentPaneDetalleProcesoCambiarEjercicioPeriodo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoCambiarEjercicioPeriodo = new GridBagLayout();	
			this.jContentPaneDetalleProcesoCambiarEjercicioPeriodo.setLayout(gridaBagLayoutDetalleProcesoCambiarEjercicioPeriodo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCambiarEjercicioPeriodo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
				this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoCambiarEjercicioPeriodo.add(jTtoolBarDetalleProcesoCambiarEjercicioPeriodo, gridBagConstraintsProcesoCambiarEjercicioPeriodo);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo=   new JScrollPane(jContentPaneDetalleProcesoCambiarEjercicioPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
	        
			this.jContentPaneDetalleProcesoCambiarEjercicioPeriodo.add(jPanelCamposProcesoCambiarEjercicioPeriodo, gridBagConstraintsProcesoCambiarEjercicioPeriodo);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						//&& procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoCambiarEjercicioPeriodo= new GridBagConstraints();
						this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
						this.jContentPaneDetalleProcesoCambiarEjercicioPeriodo.add(this.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoCambiarEjercicioPeriodo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
					this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoCambiarEjercicioPeriodo.add(jPanelCamposOcultosProcesoCambiarEjercicioPeriodo, gridBagConstraintsProcesoCambiarEjercicioPeriodo);
				
					this.jPanelCamposOcultosProcesoCambiarEjercicioPeriodo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
	        this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoCambiarEjercicioPeriodo.add(this.jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);							
			
			
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
	        this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoCambiarEjercicioPeriodo.add(this.jPanelAccionesProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo=   new JScrollPane(this.jPanelCamposProcesoCambiarEjercicioPeriodo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);			
			
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
			
			
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		
			
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo = new GridBagConstraints();
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCambiarEjercicioPeriodo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCambiarEjercicioPeriodo, this.gridBagConstraintsProcesoCambiarEjercicioPeriodo);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoCambiarEjercicioPeriodo.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoCambiarEjercicioPeriodo;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo;
    } 
	
		
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
