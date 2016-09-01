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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.ProcesoCierreEjercicioAnualConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class ProcesoCierreEjercicioAnualDetalleFormJInternalFrame extends ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoCierreEjercicioAnual;
	
	protected JMenuBar jmenuBarDetalleProcesoCierreEjercicioAnual;
	
	protected JMenu jmenuDetalleProcesoCierreEjercicioAnual;
	protected JMenu jmenuDetalleArchivoProcesoCierreEjercicioAnual;
	protected JMenu jmenuDetalleAccionesProcesoCierreEjercicioAnual;
	protected JMenu jmenuDetalleDatosProcesoCierreEjercicioAnual;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoCierreEjercicioAnual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCierreEjercicioAnual;	
	protected GridBagConstraints gridBagConstraintsProcesoCierreEjercicioAnual;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoCierreEjercicioAnual;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";
	
	public ProcesoCierreEjercicioAnualSessionBean procesocierreejercicioanualSessionBean;
	
	
	
	
	public TipoDocumentoSessionBean tipodocumentoSessionBean;	
	
	public ProcesoCierreEjercicioAnualLogic procesocierreejercicioanualLogic;
	
	public JScrollPane jScrollPanelDatosProcesoCierreEjercicioAnual;
	public JScrollPane jScrollPanelDatosEdicionProcesoCierreEjercicioAnual;
	public JScrollPane jScrollPanelDatosGeneralProcesoCierreEjercicioAnual;
	
	protected JPanel jPanelCamposProcesoCierreEjercicioAnual;    
	protected JPanel jPanelCamposOcultosProcesoCierreEjercicioAnual;    	
	protected JPanel jPanelAccionesProcesoCierreEjercicioAnual;
	protected JPanel jPanelAccionesFormularioProcesoCierreEjercicioAnual;
    
	
	
	protected Integer iXPanelCamposProcesoCierreEjercicioAnual=0;
	protected Integer iYPanelCamposProcesoCierreEjercicioAnual=0;
	
	protected Integer iXPanelCamposOcultosProcesoCierreEjercicioAnual=0;
	protected Integer iYPanelCamposOcultosProcesoCierreEjercicioAnual=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoCierreEjercicioAnual;
	public JButton jButtonModificarProcesoCierreEjercicioAnual;
	public JButton jButtonActualizarProcesoCierreEjercicioAnual;
    public JButton jButtonEliminarProcesoCierreEjercicioAnual;
	public JButton jButtonCancelarProcesoCierreEjercicioAnual;
    public JButton jButtonGuardarCambiosProcesoCierreEjercicioAnual;
	public JButton jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual;
	protected JButton jButtonCerrarProcesoCierreEjercicioAnual;
	
	
	protected JButton jButtonProcesarInformacionProcesoCierreEjercicioAnual;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoCierreEjercicioAnual;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoCierreEjercicioAnual;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoCierreEjercicioAnual;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonModificarToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonActualizarToolBarProcesoCierreEjercicioAnual;
    protected JButton jButtonEliminarToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonCancelarToolBarProcesoCierreEjercicioAnual;
    protected JButton jButtonGuardarCambiosToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCierreEjercicioAnual;
	protected JButton jButtonCerrarToolBarProcesoCierreEjercicioAnual;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoCierreEjercicioAnual;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemModificarProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemActualizarProcesoCierreEjercicioAnual;
    protected JMenuItem jMenuItemEliminarProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemCancelarProcesoCierreEjercicioAnual;
    protected JMenuItem jMenuItemGuardarCambiosProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemCerrarProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCierreEjercicioAnual;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCierreEjercicioAnual;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCierreEjercicioAnual;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCierreEjercicioAnual;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCierreEjercicioAnual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCierreEjercicioAnual;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoCierreEjercicioAnual;
	public JLabel jLabelIdProcesoCierreEjercicioAnual;
	public JTextFieldMe jTextFieldidProcesoCierreEjercicioAnual;
	public JButton jButtonidProcesoCierreEjercicioAnualBusqueda= new JButtonMe();

	public JPanel jPanelfechaProcesoCierreEjercicioAnual;
	public JLabel jLabelfechaProcesoCierreEjercicioAnual;
	//public JFormattedTextField jDateChooserfechaProcesoCierreEjercicioAnual;

	public JDateChooser jDateChooserfechaProcesoCierreEjercicioAnual;
	public JButton jButtonfechaProcesoCierreEjercicioAnualBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documentoProcesoCierreEjercicioAnual;
	public JLabel jLabelid_tipo_documentoProcesoCierreEjercicioAnual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual;
	public JButton jButtonid_tipo_documentoProcesoCierreEjercicioAnual= new JButtonMe();
	public JButton jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoCierreEjercicioAnual;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoCierreEjercicioAnualDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoCierreEjercicioAnual=new JPanel();
				this.jPanelAccionesFormularioProcesoCierreEjercicioAnual=new JPanel();
				this.jmenuBarDetalleProcesoCierreEjercicioAnual=new JMenuBar();
				this.jTtoolBarDetalleProcesoCierreEjercicioAnual=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreEjercicioAnualDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoCierreEjercicioAnual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoCierreEjercicioAnualDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoCierreEjercicioAnual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreEjercicioAnualDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreEjercicioAnual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreEjercicioAnualDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreEjercicioAnual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreEjercicioAnualDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCierreEjercicioAnual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoCierreEjercicioAnual() {
		return this.jButtonActualizarToolBarProcesoCierreEjercicioAnual;
	}
	
	public JButton getjButtonEliminarToolBarProcesoCierreEjercicioAnual() {
		return this.jButtonEliminarToolBarProcesoCierreEjercicioAnual;
	}
	
	public JButton getjButtonCancelarToolBarProcesoCierreEjercicioAnual() {
		return this.jButtonCancelarToolBarProcesoCierreEjercicioAnual;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoCierreEjercicioAnual() {
		return this.jButtonProcesarInformacionProcesoCierreEjercicioAnual;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCierreEjercicioAnual)	{
		this.jButtonProcesarInformacionProcesoCierreEjercicioAnual = jButtonProcesarInformacionProcesoCierreEjercicioAnual;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCierreEjercicioAnual() {
		return this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCierreEjercicioAnual(
			JComboBox jComboBoxTiposRelacionesProcesoCierreEjercicioAnual) {
		this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual = jComboBoxTiposRelacionesProcesoCierreEjercicioAnual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCierreEjercicioAnual(
			JComboBox jComboBoxTiposAccionesProcesoCierreEjercicioAnual) {
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual = jComboBoxTiposAccionesProcesoCierreEjercicioAnual;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual() {
		return this.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual(
			JComboBox jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual) {
		this.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual = jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesocierreejercicioanualSessionBean=new ProcesoCierreEjercicioAnualSessionBean();
		
		this.procesocierreejercicioanualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierreejercicioanualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCierreEjercicioAnualJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCierreEjercicioAnualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCierreEjercicioAnualJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Cierre Ejercicio Anual MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoCierreEjercicioAnualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoCierreEjercicioAnual= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoCierreEjercicioAnual=new JButtonMe();
				this.jButtonModificarToolBarProcesoCierreEjercicioAnual=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoCierreEjercicioAnual,this.jTtoolBarDetalleProcesoCierreEjercicioAnual,
							"actualizar","actualizar","Actualizar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoCierreEjercicioAnual,this.jTtoolBarDetalleProcesoCierreEjercicioAnual,
							"eliminar","eliminar","Eliminar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoCierreEjercicioAnual,this.jTtoolBarDetalleProcesoCierreEjercicioAnual,
							"cancelar","cancelar","Cancelar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoCierreEjercicioAnual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoCierreEjercicioAnual,this.jTtoolBarDetalleProcesoCierreEjercicioAnual,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoCierreEjercicioAnual=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoCierreEjercicioAnual=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoCierreEjercicioAnual=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoCierreEjercicioAnual=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoCierreEjercicioAnual=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCierreEjercicioAnual= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCierreEjercicioAnual.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCierreEjercicioAnual,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoCierreEjercicioAnual= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoCierreEjercicioAnual.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoCierreEjercicioAnual,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoCierreEjercicioAnual= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoCierreEjercicioAnual.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoCierreEjercicioAnual,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoCierreEjercicioAnual= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoCierreEjercicioAnual.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoCierreEjercicioAnual,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoCierreEjercicioAnual= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoCierreEjercicioAnual.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoCierreEjercicioAnual,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoCierreEjercicioAnual= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCierreEjercicioAnual.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCierreEjercicioAnual,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCierreEjercicioAnual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCierreEjercicioAnual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCierreEjercicioAnual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoCierreEjercicioAnual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoCierreEjercicioAnual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoCierreEjercicioAnual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCierreEjercicioAnual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCierreEjercicioAnual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCierreEjercicioAnual,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCierreEjercicioAnual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCierreEjercicioAnual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCierreEjercicioAnual,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoCierreEjercicioAnual.add(this.jMenuItemDetalleCerrarProcesoCierreEjercicioAnual);
		
		this.jmenuDetalleAccionesProcesoCierreEjercicioAnual.add(this.jMenuItemActualizarProcesoCierreEjercicioAnual);
		this.jmenuDetalleAccionesProcesoCierreEjercicioAnual.add(this.jMenuItemEliminarProcesoCierreEjercicioAnual);
		this.jmenuDetalleAccionesProcesoCierreEjercicioAnual.add(this.jMenuItemCancelarProcesoCierreEjercicioAnual);		
		
		//this.jmenuDetalleDatosProcesoCierreEjercicioAnual.add(this.jMenuItemDetalleAbrirOrderByProcesoCierreEjercicioAnual);				
		this.jmenuDetalleDatosProcesoCierreEjercicioAnual.add(this.jMenuItemDetalleMostarOcultarProcesoCierreEjercicioAnual);				
				
		//this.jmenuDetalleAccionesProcesoCierreEjercicioAnual.add(this.jMenuItemGuardarCambiosProcesoCierreEjercicioAnual);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoCierreEjercicioAnual.add(this.jmenuDetalleArchivoProcesoCierreEjercicioAnual);		
		this.jmenuBarDetalleProcesoCierreEjercicioAnual.add(this.jmenuDetalleAccionesProcesoCierreEjercicioAnual);		
		this.jmenuBarDetalleProcesoCierreEjercicioAnual.add(this.jmenuDetalleDatosProcesoCierreEjercicioAnual);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoCierreEjercicioAnual);				
	}
	
	
	public void inicializarElementosCamposProcesoCierreEjercicioAnual() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoCierreEjercicioAnual = new JLabelMe();
		jLabelIdProcesoCierreEjercicioAnual.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoCierreEjercicioAnual = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoCierreEjercicioAnual.setToolTipText(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoCierreEjercicioAnual= new GridBagLayout();

		this.jPanelidProcesoCierreEjercicioAnual.setLayout(this.gridaBagLayoutProcesoCierreEjercicioAnual);

		jTextFieldidProcesoCierreEjercicioAnual = new JTextFieldMe();
		jTextFieldidProcesoCierreEjercicioAnual.setText("Id");

		jTextFieldidProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaProcesoCierreEjercicioAnual = new JLabelMe();
		this.jLabelfechaProcesoCierreEjercicioAnual.setText(""+ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaProcesoCierreEjercicioAnual.setToolTipText("Fecha");
		this.jLabelfechaProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaProcesoCierreEjercicioAnual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaProcesoCierreEjercicioAnual.setToolTipText(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutProcesoCierreEjercicioAnual = new GridBagLayout();
		this.jPanelfechaProcesoCierreEjercicioAnual.setLayout(this.gridaBagLayoutProcesoCierreEjercicioAnual);


		//jFormattedTextFieldfechaProcesoCierreEjercicioAnual= new JFormattedTextFieldMe();

		jDateChooserfechaProcesoCierreEjercicioAnual= new JDateChooser();
		jDateChooserfechaProcesoCierreEjercicioAnual.setEnabled(false);
		jDateChooserfechaProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaProcesoCierreEjercicioAnual.setDate(new Date());
		jDateChooserfechaProcesoCierreEjercicioAnual.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaProcesoCierreEjercicioAnual.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaProcesoCierreEjercicioAnualBusqueda= new JButtonMe();
		this.jButtonfechaProcesoCierreEjercicioAnualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProcesoCierreEjercicioAnualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProcesoCierreEjercicioAnualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaProcesoCierreEjercicioAnualBusqueda.setText("U");
		this.jButtonfechaProcesoCierreEjercicioAnualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaProcesoCierreEjercicioAnualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaProcesoCierreEjercicioAnualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaProcesoCierreEjercicioAnual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaProcesoCierreEjercicioAnual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaProcesoCierreEjercicioAnualBusqueda"));

		if(this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaProcesoCierreEjercicioAnualBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoCierreEjercicioAnual() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_documentoProcesoCierreEjercicioAnual = new JLabelMe();
		this.jLabelid_tipo_documentoProcesoCierreEjercicioAnual.setText(""+ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO+" : *");
		this.jLabelid_tipo_documentoProcesoCierreEjercicioAnual.setToolTipText("Tipo Documento");
		this.jLabelid_tipo_documentoProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documentoProcesoCierreEjercicioAnual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documentoProcesoCierreEjercicioAnual.setToolTipText(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		this.gridaBagLayoutProcesoCierreEjercicioAnual = new GridBagLayout();
		this.jPanelid_tipo_documentoProcesoCierreEjercicioAnual.setLayout(this.gridaBagLayoutProcesoCierreEjercicioAnual);


		jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual= new JComboBoxMe();
		jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnual= new JButtonMe();
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnual.setText("Procesar");
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnual.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoProcesoCierreEjercicioAnual,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoProcesoCierreEjercicioAnual"));

		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusqueda= new JButtonMe();
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusqueda.setText("U");
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoProcesoCierreEjercicioAnualBusqueda"));

		if(this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdate= new JButtonMe();
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdate.setText("U");
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoProcesoCierreEjercicioAnualUpdate"));



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
		//this.jInternalFrameDetalleProcesoCierreEjercicioAnual = new ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Cierre Ejercicio Anual DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCierreEjercicioAnual= new GridBagLayout();
		

		
		String sToolTipProcesoCierreEjercicioAnual="";
		sToolTipProcesoCierreEjercicioAnual=ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCierreEjercicioAnual+="(Contabilidad.ProcesoCierreEjercicioAnual)";
		}
		
		if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCierreEjercicioAnual+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonModificarProcesoCierreEjercicioAnual = new JButtonMe();
        this.jButtonActualizarProcesoCierreEjercicioAnual = new JButtonMe();
        this.jButtonEliminarProcesoCierreEjercicioAnual = new JButtonMe();
        this.jButtonCancelarProcesoCierreEjercicioAnual = new JButtonMe();
        this.jButtonGuardarCambiosProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual = new JButtonMe();
		this.jButtonCerrarProcesoCierreEjercicioAnual = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCierreEjercicioAnual = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoCierreEjercicioAnual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoCierreEjercicioAnual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoCierreEjercicioAnual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoCierreEjercicioAnual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Cierre Ejercicio Anual";
		
		if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Ejercicio Anuales" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCierreEjercicioAnual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoCierreEjercicioAnual.setName("jPanelCamposProcesoCierreEjercicioAnual"); 

		this.jPanelCamposOcultosProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoCierreEjercicioAnual.setName("jPanelCamposOcultosProcesoCierreEjercicioAnual"); 

        this.jPanelAccionesProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCierreEjercicioAnual.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCierreEjercicioAnual.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoCierreEjercicioAnual.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoCierreEjercicioAnual.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoCierreEjercicioAnual.setText("Nuevo");
		this.jButtonModificarProcesoCierreEjercicioAnual.setText("Editar");
        this.jButtonActualizarProcesoCierreEjercicioAnual.setText("Actualizar");
        this.jButtonEliminarProcesoCierreEjercicioAnual.setText("Eliminar");
        this.jButtonCancelarProcesoCierreEjercicioAnual.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoCierreEjercicioAnual.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual.setText("Guardar");
		this.jButtonCerrarProcesoCierreEjercicioAnual.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCierreEjercicioAnual,"nuevo_button","Nuevo",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoCierreEjercicioAnual,"modificar_button","Editar",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoCierreEjercicioAnual,"actualizar_button","Actualizar",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoCierreEjercicioAnual,"eliminar_button","Eliminar",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoCierreEjercicioAnual,"cancelar_button","Cancelar",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoCierreEjercicioAnual,"guardarcambios_button","Guardar",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual,"guardarcambiostabla_button","Guardar",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCierreEjercicioAnual,"cerrar_button","Salir",this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoCierreEjercicioAnual.setToolTipText("Nuevo"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoCierreEjercicioAnual.setToolTipText("Editar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoCierreEjercicioAnual.setToolTipText("Actualizar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoCierreEjercicioAnual.setToolTipText("Eliminar)"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoCierreEjercicioAnual.setToolTipText("Cancelar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoCierreEjercicioAnual.setToolTipText("Guardar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual.setToolTipText("Guardar"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCierreEjercicioAnual.setToolTipText("Salir"+" "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCierreEjercicioAnual";
		inputMap = this.jButtonNuevoProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCierreEjercicioAnual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCierreEjercicioAnual"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoCierreEjercicioAnual";
		inputMap = this.jButtonActualizarProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoCierreEjercicioAnual"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoCierreEjercicioAnual";
		inputMap = this.jButtonEliminarProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoCierreEjercicioAnual"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoCierreEjercicioAnual";
		inputMap = this.jButtonCancelarProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoCierreEjercicioAnual"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoCierreEjercicioAnual";
		inputMap = this.jButtonCerrarProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCierreEjercicioAnual"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCierreEjercicioAnual";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCierreEjercicioAnual"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoCierreEjercicioAnual = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoCierreEjercicioAnual.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoCierreEjercicioAnual.setToolTipText("Nuevo ProcesoCierreEjercicioAnual");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoCierreEjercicioAnual = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoCierreEjercicioAnual.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoCierreEjercicioAnual.setToolTipText("Sin Cerrar Ventana ProcesoCierreEjercicioAnual");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoCierreEjercicioAnual = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoCierreEjercicioAnual.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoCierreEjercicioAnual.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoCierreEjercicioAnual = new JLabelMe();
		
		this.jLabelAccionesProcesoCierreEjercicioAnual.setText("Acciones");		
		this.jLabelAccionesProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoCierreEjercicioAnual();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoCierreEjercicioAnual();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoCierreEjercicioAnual=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoCierreEjercicioAnual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoCierreEjercicioAnual,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoCierreEjercicioAnual = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoCierreEjercicioAnual = new GridBagLayout();
		
		this.jPanelCamposProcesoCierreEjercicioAnual.setLayout(gridaBagLayoutCamposProcesoCierreEjercicioAnual);
		this.jPanelCamposOcultosProcesoCierreEjercicioAnual.setLayout(gridaBagLayoutCamposOcultosProcesoCierreEjercicioAnual);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoCierreEjercicioAnual.add(jLabelIdProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);



	this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 1;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoCierreEjercicioAnual.add(jTextFieldidProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);


	this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documentoProcesoCierreEjercicioAnual.add(jLabelid_tipo_documentoProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 2;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 0;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoProcesoCierreEjercicioAnual.add(jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusqueda, this.gridBagConstraintsProcesoCierreEjercicioAnual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 3;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 0;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoProcesoCierreEjercicioAnual.add(jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdate, this.gridBagConstraintsProcesoCierreEjercicioAnual);
	}

	this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 1;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documentoProcesoCierreEjercicioAnual.add(jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);


	this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaProcesoCierreEjercicioAnual.add(jLabelfechaProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 2;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 0;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaProcesoCierreEjercicioAnual.add(jButtonfechaProcesoCierreEjercicioAnualBusqueda, this.gridBagConstraintsProcesoCierreEjercicioAnual);
	}

	this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 1;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 0;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaProcesoCierreEjercicioAnual.add(jDateChooserfechaProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iYPanelCamposProcesoCierreEjercicioAnual;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iXPanelCamposProcesoCierreEjercicioAnual++;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreEjercicioAnual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreEjercicioAnual.add(this.jPanelidProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);



	if(iXPanelCamposProcesoCierreEjercicioAnual % 1==0) {
		iXPanelCamposProcesoCierreEjercicioAnual=0;
		iYPanelCamposProcesoCierreEjercicioAnual++;
	}
	this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iYPanelCamposProcesoCierreEjercicioAnual;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iXPanelCamposProcesoCierreEjercicioAnual++;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreEjercicioAnual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreEjercicioAnual.add(this.jPanelid_tipo_documentoProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);



	if(iXPanelCamposProcesoCierreEjercicioAnual % 1==0) {
		iXPanelCamposProcesoCierreEjercicioAnual=0;
		iYPanelCamposProcesoCierreEjercicioAnual++;
	}
	this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iYPanelCamposProcesoCierreEjercicioAnual;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iXPanelCamposProcesoCierreEjercicioAnual++;
	this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreEjercicioAnual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreEjercicioAnual.add(this.jPanelfechaProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);



	if(iXPanelCamposProcesoCierreEjercicioAnual % 1==0) {
		iXPanelCamposProcesoCierreEjercicioAnual=0;
		iYPanelCamposProcesoCierreEjercicioAnual++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoCierreEjercicioAnual= new GridBagLayout();
		this.jPanelAccionesProcesoCierreEjercicioAnual.setLayout(gridaBagLayoutAccionesProcesoCierreEjercicioAnual);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoCierreEjercicioAnual= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoCierreEjercicioAnual.setLayout(gridaBagLayoutAccionesFormularioProcesoCierreEjercicioAnual);
		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoCierreEjercicioAnual.add(this.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoCierreEjercicioAnual.add(this.jButtonModificarProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);							

		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoCierreEjercicioAnual.add(this.jButtonEliminarProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		
			
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCierreEjercicioAnual.add(this.jButtonActualizarProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);


		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCierreEjercicioAnual.add(this.jButtonGuardarCambiosProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);	
		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = 0;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoCierreEjercicioAnual.add(this.jButtonCancelarProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCierreEjercicioAnual = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCierreEjercicioAnual);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;		
			//this.gridBagConstraintsProcesoCierreEjercicioAnual.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCierreEjercicioAnual.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =0;
		this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCierreEjercicioAnual.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoCierreEjercicioAnualJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoCierreEjercicioAnual = new ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Cierre Ejercicio Anual DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Cierre Ejercicio Anual DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Cierre Ejercicio Anual Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoCierreEjercicioAnualModel procesocierreejercicioanualModel=new ProcesoCierreEjercicioAnualModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoCierreEjercicioAnualModel.ProcesoCierreEjercicioAnualFocusTraversalPolicy procesocierreejercicioanualFocusTraversalPolicy = procesocierreejercicioanualModel.new ProcesoCierreEjercicioAnualFocusTraversalPolicy(this);
			
			//procesocierreejercicioanualFocusTraversalPolicy.setprocesocierreejercicioanualJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesocierreejercicioanualModel);
			
			
			this.jContentPaneDetalleProcesoCierreEjercicioAnual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoCierreEjercicioAnual = new GridBagLayout();	
			this.jContentPaneDetalleProcesoCierreEjercicioAnual.setLayout(gridaBagLayoutDetalleProcesoCierreEjercicioAnual);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCierreEjercicioAnual = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
				this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoCierreEjercicioAnual.add(jTtoolBarDetalleProcesoCierreEjercicioAnual, gridBagConstraintsProcesoCierreEjercicioAnual);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual=   new JScrollPane(jContentPaneDetalleProcesoCierreEjercicioAnual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
	        
			this.jContentPaneDetalleProcesoCierreEjercicioAnual.add(jPanelCamposProcesoCierreEjercicioAnual, gridBagConstraintsProcesoCierreEjercicioAnual);
			
			
			
			
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
						//&& procesocierreejercicioanualSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoCierreEjercicioAnual= new GridBagConstraints();
						this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
						this.jContentPaneDetalleProcesoCierreEjercicioAnual.add(this.jTabbedPaneRelacionesProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoCierreEjercicioAnual.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
					this.gridBagConstraintsProcesoCierreEjercicioAnual.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoCierreEjercicioAnual.add(jPanelCamposOcultosProcesoCierreEjercicioAnual, gridBagConstraintsProcesoCierreEjercicioAnual);
				
					this.jPanelCamposOcultosProcesoCierreEjercicioAnual.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
	        this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoCierreEjercicioAnual.add(this.jPanelAccionesFormularioProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);							
			
			
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
	        this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoCierreEjercicioAnual.add(this.jPanelAccionesProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoCierreEjercicioAnual);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual=   new JScrollPane(this.jPanelCamposProcesoCierreEjercicioAnual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoCierreEjercicioAnual.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);			
			
			this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
			
			
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		
			
		this.gridBagConstraintsProcesoCierreEjercicioAnual = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreEjercicioAnual.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCierreEjercicioAnual, this.gridBagConstraintsProcesoCierreEjercicioAnual);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoCierreEjercicioAnual.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoCierreEjercicioAnual.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoCierreEjercicioAnual.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoCierreEjercicioAnual;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoCierreEjercicioAnual;
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
