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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.OpcionConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class OpcionDetalleFormJInternalFrame extends OpcionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleOpcion;
	
	protected JMenuBar jmenuBarDetalleOpcion;
	
	protected JMenu jmenuDetalleOpcion;
	protected JMenu jmenuDetalleArchivoOpcion;
	protected JMenu jmenuDetalleAccionesOpcion;
	protected JMenu jmenuDetalleDatosOpcion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutOpcion;	
	protected GridBagConstraints gridBagConstraintsOpcion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected OpcionBeanSwingJInternalFrameAdditional jInternalFrameDetalleOpcion;		
	
	public OpcionBeanSwingJInternalFrameTree jInternalFrameTreeOpcion;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sistema="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected GrupoOpcionBeanSwingJInternalFrame grupoopcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupoopcion="";

	protected OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_opcion="";

	protected TipoTeclaMascaraBeanSwingJInternalFrame tipoteclamascaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoteclamascara="";
	
	public OpcionSessionBean opcionSessionBean;
	
	

	public UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFrame=null;
	public UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteUsuarioOpcion=false;
	public UsuarioOpcionSessionBean usuarioopcionSessionBean;

	//public OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame=null;
	public OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteOpcion=false;

	public AccionBeanSwingJInternalFrame accionBeanSwingJInternalFrame=null;
	public AccionBeanSwingJInternalFrame accionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAccion=false;
	public AccionSessionBean accionSessionBean;

	public PerfilOpcionBeanSwingJInternalFrame perfilopcionBeanSwingJInternalFrame=null;
	public PerfilOpcionBeanSwingJInternalFrame perfilopcionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePerfilOpcion=false;
	public PerfilOpcionSessionBean perfilopcionSessionBean;

	public CampoBeanSwingJInternalFrame campoBeanSwingJInternalFrame=null;
	public CampoBeanSwingJInternalFrame campoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCampo=false;
	public CampoSessionBean campoSessionBean;
	
	
	public SistemaSessionBean sistemaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public GrupoOpcionSessionBean grupoopcionSessionBean;
	public TipoTeclaMascaraSessionBean tipoteclamascaraSessionBean;	
	
	public OpcionLogic opcionLogic;
	
	public JScrollPane jScrollPanelDatosOpcion;
	public JScrollPane jScrollPanelDatosEdicionOpcion;
	public JScrollPane jScrollPanelDatosGeneralOpcion;
	
	protected JPanel jPanelCamposOpcion;    
	protected JPanel jPanelCamposOcultosOpcion;    	
	protected JPanel jPanelAccionesOpcion;
	protected JPanel jPanelAccionesFormularioOpcion;
    
	
	
	protected Integer iXPanelCamposOpcion=0;
	protected Integer iYPanelCamposOpcion=0;
	
	protected Integer iXPanelCamposOcultosOpcion=0;
	protected Integer iYPanelCamposOcultosOpcion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoOpcion;
	public JButton jButtonModificarOpcion;
	public JButton jButtonActualizarOpcion;
    public JButton jButtonEliminarOpcion;
	public JButton jButtonCancelarOpcion;
    public JButton jButtonGuardarCambiosOpcion;
	public JButton jButtonGuardarCambiosTablaOpcion;
	protected JButton jButtonCerrarOpcion;
	
	
	protected JButton jButtonProcesarInformacionOpcion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoOpcion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarOpcion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeOpcion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarOpcion;
	protected JButton jButtonModificarToolBarOpcion;
	protected JButton jButtonActualizarToolBarOpcion;
    protected JButton jButtonEliminarToolBarOpcion;
	protected JButton jButtonCancelarToolBarOpcion;
    protected JButton jButtonGuardarCambiosToolBarOpcion;
	protected JButton jButtonGuardarCambiosTablaToolBarOpcion;
	protected JButton jButtonMostrarOcultarTablaToolBarOpcion;
	protected JButton jButtonCerrarToolBarOpcion;
	
	protected JButton jButtonProcesarInformacionToolBarOpcion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoOpcion;
	protected JMenuItem jMenuItemModificarOpcion;
	protected JMenuItem jMenuItemActualizarOpcion;
    protected JMenuItem jMenuItemEliminarOpcion;
	protected JMenuItem jMenuItemCancelarOpcion;
    protected JMenuItem jMenuItemGuardarCambiosOpcion;
	protected JMenuItem jMenuItemGuardarCambiosTablaOpcion;
	protected JMenuItem jMenuItemCerrarOpcion;
	protected JMenuItem jMenuItemDetalleCerrarOpcion;
	protected JMenuItem jMenuItemDetalleMostarOcultarOpcion;
	
	protected JMenuItem jMenuItemProcesarInformacionOpcion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosOpcion;
	protected JMenuItem jMenuItemMostrarOcultarOpcion;
	
	
	//MENU
	
	protected JButton jButtonArbolOpcion;	
	
	protected JLabel jLabelAccionesOpcion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesOpcion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioOpcion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidOpcion;
	public JLabel jLabelIdOpcion;
	public JLabel jLabelidOpcion;
	public JButton jButtonidOpcionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoOpcion;
	public JLabel jLabelcodigoOpcion;
	public JTextField jTextFieldcodigoOpcion;
	public JButton jButtoncodigoOpcionBusqueda= new JButtonMe();

	public JPanel jPanelnombreOpcion;
	public JLabel jLabelnombreOpcion;
	public JTextField jTextFieldnombreOpcion;
	public JButton jButtonnombreOpcionBusqueda= new JButtonMe();

	public JPanel jPanelteclaOpcion;
	public JLabel jLabelteclaOpcion;
	public JTextField jTextFieldteclaOpcion;
	public JButton jButtonteclaOpcionBusqueda= new JButtonMe();

	public JPanel jPanelposicionOpcion;
	public JLabel jLabelposicionOpcion;
	public JTextField jTextFieldposicionOpcion;
	public JButton jButtonposicionOpcionBusqueda= new JButtonMe();

	public JPanel jPanelicon_nameOpcion;
	public JLabel jLabelicon_nameOpcion;
	public JTextArea jTextAreaicon_nameOpcion;
	public JScrollPane jscrollPaneicon_nameOpcion;
	public JButton jButtonicon_nameOpcionBusqueda= new JButtonMe();

	public JPanel jPanelnombre_claseOpcion;
	public JLabel jLabelnombre_claseOpcion;
	public JTextField jTextFieldnombre_claseOpcion;
	public JButton jButtonnombre_claseOpcionBusqueda= new JButtonMe();

	public JPanel jPanelsub_moduloOpcion;
	public JLabel jLabelsub_moduloOpcion;
	public JTextField jTextFieldsub_moduloOpcion;
	public JButton jButtonsub_moduloOpcionBusqueda= new JButtonMe();

	public JPanel jPanelpaqueteOpcion;
	public JLabel jLabelpaqueteOpcion;
	public JTextArea jTextAreapaqueteOpcion;
	public JScrollPane jscrollPanepaqueteOpcion;
	public JButton jButtonpaqueteOpcionBusqueda= new JButtonMe();

	public JPanel jPanelpaquete_originalOpcion;
	public JLabel jLabelpaquete_originalOpcion;
	public JTextArea jTextAreapaquete_originalOpcion;
	public JScrollPane jscrollPanepaquete_originalOpcion;
	public JButton jButtonpaquete_originalOpcionBusqueda= new JButtonMe();

	public JPanel jPanelpath_auxiliarOpcion;
	public JLabel jLabelpath_auxiliarOpcion;
	public JTextField jTextFieldpath_auxiliarOpcion;
	public JButton jButtonpath_auxiliarOpcionBusqueda= new JButtonMe();

	public JPanel jPaneles_para_menuOpcion;
	public JLabel jLabeles_para_menuOpcion;
	public JCheckBox jCheckBoxes_para_menuOpcion;
	public JButton jButtones_para_menuOpcionBusqueda= new JButtonMe();

	public JPanel jPanelcon_mostrar_acciones_campoOpcion;
	public JLabel jLabelcon_mostrar_acciones_campoOpcion;
	public JCheckBox jCheckBoxcon_mostrar_acciones_campoOpcion;
	public JButton jButtoncon_mostrar_acciones_campoOpcionBusqueda= new JButtonMe();

	public JPanel jPaneles_guardar_relacionesOpcion;
	public JLabel jLabeles_guardar_relacionesOpcion;
	public JCheckBox jCheckBoxes_guardar_relacionesOpcion;
	public JButton jButtones_guardar_relacionesOpcionBusqueda= new JButtonMe();

	public JPanel jPanelestadoOpcion;
	public JLabel jLabelestadoOpcion;
	public JCheckBox jCheckBoxestadoOpcion;
	public JButton jButtonestadoOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sistemaOpcion;
	public JLabel jLabelid_sistemaOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaOpcion;
	public JButton jButtonid_sistemaOpcion= new JButtonMe();
	public JButton jButtonid_sistemaOpcionUpdate= new JButtonMe();
	public JButton jButtonid_sistemaOpcionBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloOpcion;
	public JLabel jLabelid_moduloOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloOpcion;
	public JButton jButtonid_moduloOpcion= new JButtonMe();
	public JButton jButtonid_moduloOpcionUpdate= new JButtonMe();
	public JButton jButtonid_moduloOpcionBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_opcionOpcion;
	public JLabel jLabelid_grupo_opcionOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_opcionOpcion;
	public JButton jButtonid_grupo_opcionOpcion= new JButtonMe();
	public JButton jButtonid_grupo_opcionOpcionUpdate= new JButtonMe();
	public JButton jButtonid_grupo_opcionOpcionBusqueda= new JButtonMe();

	public JPanel jPanelid_opcionOpcion;
	public JLabel jLabelid_opcionOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_opcionOpcion;
	public JButton jButtonid_opcionOpcion= new JButtonMe();
	public JButton jButtonid_opcionOpcionUpdate= new JButtonMe();
	public JButton jButtonid_opcionOpcionBusqueda= new JButtonMe();
	public JButton jButtonid_opcionOpcionArbol= new JButtonMe();

	public JPanel jPanelid_tipo_tecla_mascaraOpcion;
	public JLabel jLabelid_tipo_tecla_mascaraOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tecla_mascaraOpcion;
	public JButton jButtonid_tipo_tecla_mascaraOpcion= new JButtonMe();
	public JButton jButtonid_tipo_tecla_mascaraOpcionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tecla_mascaraOpcionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesOpcion;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public OpcionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposOpcion=new JPanel();
				this.jPanelAccionesFormularioOpcion=new JPanel();
				this.jmenuBarDetalleOpcion=new JMenuBar();
				this.jTtoolBarDetalleOpcion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OpcionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public OpcionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OpcionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OpcionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OpcionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Opcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarOpcion() {
		return this.jButtonActualizarToolBarOpcion;
	}
	
	public JButton getjButtonEliminarToolBarOpcion() {
		return this.jButtonEliminarToolBarOpcion;
	}
	
	public JButton getjButtonCancelarToolBarOpcion() {
		return this.jButtonCancelarToolBarOpcion;
	}		
	
	public JButton getjButtonProcesarInformacionOpcion() {
		return this.jButtonProcesarInformacionOpcion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionOpcion)	{
		this.jButtonProcesarInformacionOpcion = jButtonProcesarInformacionOpcion;
	}
	
	
	public JButton getjButtonArbolOpcion() {
		return this.jButtonArbolOpcion;
	}
	
	public void setjButtonArbol(JButton jButtonArbolOpcion)	{
		this.jButtonArbolOpcion = jButtonArbolOpcion;
	}
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesOpcion() {
		return this.jComboBoxTiposAccionesOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesOpcion(
			JComboBox jComboBoxTiposRelacionesOpcion) {
		this.jComboBoxTiposRelacionesOpcion = jComboBoxTiposRelacionesOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesOpcion(
			JComboBox jComboBoxTiposAccionesOpcion) {
		this.jComboBoxTiposAccionesOpcion = jComboBoxTiposAccionesOpcion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioOpcion() {
		return this.jComboBoxTiposAccionesFormularioOpcion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioOpcion(
			JComboBox jComboBoxTiposAccionesFormularioOpcion) {
		this.jComboBoxTiposAccionesFormularioOpcion = jComboBoxTiposAccionesFormularioOpcion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.opcionSessionBean=new OpcionSessionBean();
		
		this.opcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.opcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.opcionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
		//this.opcionSessionBean=new OpcionSessionBean();
		//this.accionSessionBean=new AccionSessionBean();
		//this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
		//this.campoSessionBean=new CampoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		OpcionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		OpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		OpcionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Opcion MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
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
	
		OpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleOpcion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarOpcion=new JButtonMe();
				this.jButtonModificarToolBarOpcion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarOpcion,this.jTtoolBarDetalleOpcion,
							"actualizar","actualizar","Actualizar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarOpcion,this.jTtoolBarDetalleOpcion,
							"eliminar","eliminar","Eliminar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarOpcion,this.jTtoolBarDetalleOpcion,
							"cancelar","cancelar","Cancelar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarOpcion,this.jTtoolBarDetalleOpcion,
							"guardarcambios","guardarcambios","Guardar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleOpcion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleOpcion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoOpcion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesOpcion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosOpcion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoOpcion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoOpcion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoOpcion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarOpcion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarOpcion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarOpcion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarOpcion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarOpcion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarOpcion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarOpcion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarOpcion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarOpcion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarOpcion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarOpcion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarOpcion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosOpcion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosOpcion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosOpcion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarOpcion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarOpcion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarOpcion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarOpcion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarOpcion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarOpcion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarOpcion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarOpcion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoOpcion.add(this.jMenuItemDetalleCerrarOpcion);
		
		this.jmenuDetalleAccionesOpcion.add(this.jMenuItemActualizarOpcion);
		this.jmenuDetalleAccionesOpcion.add(this.jMenuItemEliminarOpcion);
		this.jmenuDetalleAccionesOpcion.add(this.jMenuItemCancelarOpcion);		
		
		//this.jmenuDetalleDatosOpcion.add(this.jMenuItemDetalleAbrirOrderByOpcion);				
		this.jmenuDetalleDatosOpcion.add(this.jMenuItemDetalleMostarOcultarOpcion);				
				
		//this.jmenuDetalleAccionesOpcion.add(this.jMenuItemGuardarCambiosOpcion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleOpcion.add(this.jmenuDetalleArchivoOpcion);		
		this.jmenuBarDetalleOpcion.add(this.jmenuDetalleAccionesOpcion);		
		this.jmenuBarDetalleOpcion.add(this.jmenuDetalleDatosOpcion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleOpcion.add(this.jmenuDetalleOpcion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleOpcion);				
	}
	
	
	public void inicializarElementosCamposOpcion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdOpcion = new JLabelMe();
		jLabelIdOpcion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidOpcion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutOpcion= new GridBagLayout();

		this.jPanelidOpcion.setLayout(this.gridaBagLayoutOpcion);

		jLabelidOpcion = new JLabel();
		jLabelidOpcion.setText("Id");

		jLabelidOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoOpcion = new JLabelMe();
		this.jLabelcodigoOpcion.setText(""+OpcionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoOpcion.setToolTipText("Codigo");
		this.jLabelcodigoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelcodigoOpcion.setLayout(this.gridaBagLayoutOpcion);


		jTextFieldcodigoOpcion= new JTextFieldMe();

		jTextFieldcodigoOpcion.setEnabled(false);
		jTextFieldcodigoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoOpcionBusqueda= new JButtonMe();
		this.jButtoncodigoOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoOpcionBusqueda.setText("U");
		this.jButtoncodigoOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoOpcionBusqueda.setVisible(false);		}


					
		this.jLabelnombreOpcion = new JLabelMe();
		this.jLabelnombreOpcion.setText(""+OpcionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreOpcion.setToolTipText("Nombre");
		this.jLabelnombreOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelnombreOpcion.setLayout(this.gridaBagLayoutOpcion);


		jTextFieldnombreOpcion= new JTextFieldMe();

		jTextFieldnombreOpcion.setEnabled(false);
		jTextFieldnombreOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreOpcionBusqueda= new JButtonMe();
		this.jButtonnombreOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreOpcionBusqueda.setText("U");
		this.jButtonnombreOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreOpcionBusqueda.setVisible(false);		}


					
		this.jLabelteclaOpcion = new JLabelMe();
		this.jLabelteclaOpcion.setText(""+OpcionConstantesFunciones.LABEL_TECLA+" :");
		this.jLabelteclaOpcion.setToolTipText("Tecla");
		this.jLabelteclaOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelteclaOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelteclaOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelteclaOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelteclaOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelteclaOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_TECLA);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelteclaOpcion.setLayout(this.gridaBagLayoutOpcion);


		jTextFieldteclaOpcion= new JTextFieldMe();

		jTextFieldteclaOpcion.setEnabled(false);
		jTextFieldteclaOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldteclaOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldteclaOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldteclaOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonteclaOpcionBusqueda= new JButtonMe();
		this.jButtonteclaOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonteclaOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonteclaOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonteclaOpcionBusqueda.setText("U");
		this.jButtonteclaOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonteclaOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonteclaOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldteclaOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldteclaOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"teclaOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonteclaOpcionBusqueda.setVisible(false);		}


					
		this.jLabelposicionOpcion = new JLabelMe();
		this.jLabelposicionOpcion.setText(""+OpcionConstantesFunciones.LABEL_POSICION+" : *");
		this.jLabelposicionOpcion.setToolTipText("Posicion");
		this.jLabelposicionOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelposicionOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelposicionOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelposicionOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelposicionOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelposicionOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_POSICION);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelposicionOpcion.setLayout(this.gridaBagLayoutOpcion);


		jTextFieldposicionOpcion= new JTextFieldMe();
		jTextFieldposicionOpcion.setEnabled(false);
		jTextFieldposicionOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldposicionOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldposicionOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldposicionOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldposicionOpcion.setText("0");

		this.jButtonposicionOpcionBusqueda= new JButtonMe();
		this.jButtonposicionOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonposicionOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonposicionOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonposicionOpcionBusqueda.setText("U");
		this.jButtonposicionOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonposicionOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonposicionOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldposicionOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldposicionOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"posicionOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonposicionOpcionBusqueda.setVisible(false);		}


					
		this.jLabelicon_nameOpcion = new JLabelMe();
		this.jLabelicon_nameOpcion.setText(""+OpcionConstantesFunciones.LABEL_ICONNAME+" :");
		this.jLabelicon_nameOpcion.setToolTipText("Path Del Icono");
		this.jLabelicon_nameOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelicon_nameOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelicon_nameOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelicon_nameOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelicon_nameOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelicon_nameOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_ICONNAME);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelicon_nameOpcion.setLayout(this.gridaBagLayoutOpcion);


		jTextAreaicon_nameOpcion= new JTextAreaMe();
		jTextAreaicon_nameOpcion.setEnabled(false);
		jTextAreaicon_nameOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaicon_nameOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaicon_nameOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaicon_nameOpcion.setLineWrap(true);
		jTextAreaicon_nameOpcion.setWrapStyleWord(true);
		jTextAreaicon_nameOpcion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaicon_nameOpcion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaicon_nameOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneicon_nameOpcion = new JScrollPane(jTextAreaicon_nameOpcion);
		jscrollPaneicon_nameOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneicon_nameOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneicon_nameOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonicon_nameOpcionBusqueda= new JButtonMe();
		this.jButtonicon_nameOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonicon_nameOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonicon_nameOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonicon_nameOpcionBusqueda.setText("U");
		this.jButtonicon_nameOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonicon_nameOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonicon_nameOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaicon_nameOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaicon_nameOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"icon_nameOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonicon_nameOpcionBusqueda.setVisible(false);		}


					
		this.jLabelnombre_claseOpcion = new JLabelMe();
		this.jLabelnombre_claseOpcion.setText(""+OpcionConstantesFunciones.LABEL_NOMBRECLASE+" : *");
		this.jLabelnombre_claseOpcion.setToolTipText("Nombre De Clase");
		this.jLabelnombre_claseOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_claseOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_claseOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_claseOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_claseOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_claseOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_NOMBRECLASE);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelnombre_claseOpcion.setLayout(this.gridaBagLayoutOpcion);


		jTextFieldnombre_claseOpcion= new JTextFieldMe();

		jTextFieldnombre_claseOpcion.setEnabled(false);
		jTextFieldnombre_claseOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_claseOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_claseOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_claseOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_claseOpcionBusqueda= new JButtonMe();
		this.jButtonnombre_claseOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_claseOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_claseOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_claseOpcionBusqueda.setText("U");
		this.jButtonnombre_claseOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_claseOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_claseOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_claseOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_claseOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_claseOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_claseOpcionBusqueda.setVisible(false);		}


					
		this.jLabelsub_moduloOpcion = new JLabelMe();
		this.jLabelsub_moduloOpcion.setText(""+OpcionConstantesFunciones.LABEL_SUBMODULO+" :");
		this.jLabelsub_moduloOpcion.setToolTipText("SubModulo");
		this.jLabelsub_moduloOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_moduloOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_moduloOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_moduloOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_moduloOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_moduloOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_SUBMODULO);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelsub_moduloOpcion.setLayout(this.gridaBagLayoutOpcion);


		jTextFieldsub_moduloOpcion= new JTextFieldMe();

		jTextFieldsub_moduloOpcion.setEnabled(false);
		jTextFieldsub_moduloOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_moduloOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_moduloOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_moduloOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsub_moduloOpcionBusqueda= new JButtonMe();
		this.jButtonsub_moduloOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_moduloOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_moduloOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_moduloOpcionBusqueda.setText("U");
		this.jButtonsub_moduloOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_moduloOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_moduloOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_moduloOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_moduloOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_moduloOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_moduloOpcionBusqueda.setVisible(false);		}


					
		this.jLabelpaqueteOpcion = new JLabelMe();
		this.jLabelpaqueteOpcion.setText(""+OpcionConstantesFunciones.LABEL_PAQUETE+" : *");
		this.jLabelpaqueteOpcion.setToolTipText("Paquete");
		this.jLabelpaqueteOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpaqueteOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpaqueteOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpaqueteOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpaqueteOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpaqueteOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_PAQUETE);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelpaqueteOpcion.setLayout(this.gridaBagLayoutOpcion);


		jTextAreapaqueteOpcion= new JTextAreaMe();
		jTextAreapaqueteOpcion.setEnabled(false);
		jTextAreapaqueteOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapaqueteOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapaqueteOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapaqueteOpcion.setLineWrap(true);
		jTextAreapaqueteOpcion.setWrapStyleWord(true);
		jTextAreapaqueteOpcion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapaqueteOpcion.setRows(7);

		FuncionesSwing.setBoldTextArea(jTextAreapaqueteOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepaqueteOpcion = new JScrollPane(jTextAreapaqueteOpcion);
		jscrollPanepaqueteOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanepaqueteOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanepaqueteOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonpaqueteOpcionBusqueda= new JButtonMe();
		this.jButtonpaqueteOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpaqueteOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpaqueteOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpaqueteOpcionBusqueda.setText("U");
		this.jButtonpaqueteOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpaqueteOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpaqueteOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapaqueteOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapaqueteOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"paqueteOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpaqueteOpcionBusqueda.setVisible(false);		}


					
		this.jLabelpaquete_originalOpcion = new JLabelMe();
		this.jLabelpaquete_originalOpcion.setText(""+OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL+" :");
		this.jLabelpaquete_originalOpcion.setToolTipText("Paquete Original");
		this.jLabelpaquete_originalOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpaquete_originalOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpaquete_originalOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpaquete_originalOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpaquete_originalOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpaquete_originalOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelpaquete_originalOpcion.setLayout(this.gridaBagLayoutOpcion);


		jTextAreapaquete_originalOpcion= new JTextAreaMe();
		jTextAreapaquete_originalOpcion.setEnabled(false);
		jTextAreapaquete_originalOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapaquete_originalOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapaquete_originalOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapaquete_originalOpcion.setLineWrap(true);
		jTextAreapaquete_originalOpcion.setWrapStyleWord(true);
		jTextAreapaquete_originalOpcion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapaquete_originalOpcion.setRows(7);

		FuncionesSwing.setBoldTextArea(jTextAreapaquete_originalOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepaquete_originalOpcion = new JScrollPane(jTextAreapaquete_originalOpcion);
		jscrollPanepaquete_originalOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanepaquete_originalOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanepaquete_originalOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonpaquete_originalOpcionBusqueda= new JButtonMe();
		this.jButtonpaquete_originalOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpaquete_originalOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpaquete_originalOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpaquete_originalOpcionBusqueda.setText("U");
		this.jButtonpaquete_originalOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpaquete_originalOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpaquete_originalOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapaquete_originalOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapaquete_originalOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"paquete_originalOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpaquete_originalOpcionBusqueda.setVisible(false);		}


					
		this.jLabelpath_auxiliarOpcion = new JLabelMe();
		this.jLabelpath_auxiliarOpcion.setText(""+OpcionConstantesFunciones.LABEL_PATHAUXILIAR+" :");
		this.jLabelpath_auxiliarOpcion.setToolTipText("Path Auxiliar");
		this.jLabelpath_auxiliarOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpath_auxiliarOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpath_auxiliarOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpath_auxiliarOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpath_auxiliarOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpath_auxiliarOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_PATHAUXILIAR);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelpath_auxiliarOpcion.setLayout(this.gridaBagLayoutOpcion);


		jTextFieldpath_auxiliarOpcion= new JTextFieldMe();

		jTextFieldpath_auxiliarOpcion.setEnabled(false);
		jTextFieldpath_auxiliarOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpath_auxiliarOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpath_auxiliarOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpath_auxiliarOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpath_auxiliarOpcionBusqueda= new JButtonMe();
		this.jButtonpath_auxiliarOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_auxiliarOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_auxiliarOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpath_auxiliarOpcionBusqueda.setText("U");
		this.jButtonpath_auxiliarOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpath_auxiliarOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpath_auxiliarOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpath_auxiliarOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpath_auxiliarOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"path_auxiliarOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpath_auxiliarOpcionBusqueda.setVisible(false);		}


					
		this.jLabeles_para_menuOpcion = new JLabelMe();
		this.jLabeles_para_menuOpcion.setText(""+OpcionConstantesFunciones.LABEL_ESPARAMENU+" : *");
		this.jLabeles_para_menuOpcion.setToolTipText("Es Para Menu");
		this.jLabeles_para_menuOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_para_menuOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_para_menuOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_para_menuOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_para_menuOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_para_menuOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_ESPARAMENU);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPaneles_para_menuOpcion.setLayout(this.gridaBagLayoutOpcion);


		jCheckBoxes_para_menuOpcion= new JCheckBoxMe();
		jCheckBoxes_para_menuOpcion.setEnabled(false);

		jCheckBoxes_para_menuOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_para_menuOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_para_menuOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_para_menuOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_para_menuOpcionBusqueda= new JButtonMe();
		this.jButtones_para_menuOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_para_menuOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_para_menuOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_para_menuOpcionBusqueda.setText("U");
		this.jButtones_para_menuOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_para_menuOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_para_menuOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_para_menuOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_para_menuOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_para_menuOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_para_menuOpcionBusqueda.setVisible(false);		}


					
		this.jLabelcon_mostrar_acciones_campoOpcion = new JLabelMe();
		this.jLabelcon_mostrar_acciones_campoOpcion.setText(""+OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO+" : *");
		this.jLabelcon_mostrar_acciones_campoOpcion.setToolTipText("Mostrar Acciones Campo");
		this.jLabelcon_mostrar_acciones_campoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_mostrar_acciones_campoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_mostrar_acciones_campoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_mostrar_acciones_campoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_mostrar_acciones_campoOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_mostrar_acciones_campoOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelcon_mostrar_acciones_campoOpcion.setLayout(this.gridaBagLayoutOpcion);


		jCheckBoxcon_mostrar_acciones_campoOpcion= new JCheckBoxMe();
		jCheckBoxcon_mostrar_acciones_campoOpcion.setEnabled(false);

		jCheckBoxcon_mostrar_acciones_campoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mostrar_acciones_campoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mostrar_acciones_campoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_mostrar_acciones_campoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_mostrar_acciones_campoOpcionBusqueda= new JButtonMe();
		this.jButtoncon_mostrar_acciones_campoOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mostrar_acciones_campoOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mostrar_acciones_campoOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_mostrar_acciones_campoOpcionBusqueda.setText("U");
		this.jButtoncon_mostrar_acciones_campoOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_mostrar_acciones_campoOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_mostrar_acciones_campoOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_mostrar_acciones_campoOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_mostrar_acciones_campoOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_mostrar_acciones_campoOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_mostrar_acciones_campoOpcionBusqueda.setVisible(false);		}


					
		this.jLabeles_guardar_relacionesOpcion = new JLabelMe();
		this.jLabeles_guardar_relacionesOpcion.setText(""+OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES+" : *");
		this.jLabeles_guardar_relacionesOpcion.setToolTipText("Guardar Relaciones");
		this.jLabeles_guardar_relacionesOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_guardar_relacionesOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_guardar_relacionesOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_guardar_relacionesOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_guardar_relacionesOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_guardar_relacionesOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPaneles_guardar_relacionesOpcion.setLayout(this.gridaBagLayoutOpcion);


		jCheckBoxes_guardar_relacionesOpcion= new JCheckBoxMe();
		jCheckBoxes_guardar_relacionesOpcion.setEnabled(false);

		jCheckBoxes_guardar_relacionesOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_guardar_relacionesOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_guardar_relacionesOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_guardar_relacionesOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_guardar_relacionesOpcionBusqueda= new JButtonMe();
		this.jButtones_guardar_relacionesOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_guardar_relacionesOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_guardar_relacionesOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_guardar_relacionesOpcionBusqueda.setText("U");
		this.jButtones_guardar_relacionesOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_guardar_relacionesOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_guardar_relacionesOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_guardar_relacionesOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_guardar_relacionesOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_guardar_relacionesOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_guardar_relacionesOpcionBusqueda.setVisible(false);		}


					
		this.jLabelestadoOpcion = new JLabelMe();
		this.jLabelestadoOpcion.setText(""+OpcionConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoOpcion.setToolTipText("Estado");
		this.jLabelestadoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelestadoOpcion.setLayout(this.gridaBagLayoutOpcion);


		jCheckBoxestadoOpcion= new JCheckBoxMe();
		jCheckBoxestadoOpcion.setEnabled(false);

		jCheckBoxestadoOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxestadoOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestadoOpcionBusqueda= new JButtonMe();
		this.jButtonestadoOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoOpcionBusqueda.setText("U");
		this.jButtonestadoOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxestadoOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxestadoOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoOpcionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysOpcion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_sistemaOpcion = new JLabelMe();
		this.jLabelid_sistemaOpcion.setText(""+OpcionConstantesFunciones.LABEL_IDSISTEMA+" : *");
		this.jLabelid_sistemaOpcion.setToolTipText("Sistema");
		this.jLabelid_sistemaOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sistemaOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sistemaOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sistemaOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sistemaOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_IDSISTEMA);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelid_sistemaOpcion.setLayout(this.gridaBagLayoutOpcion);


		jComboBoxid_sistemaOpcion= new JComboBoxMe();
		jComboBoxid_sistemaOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sistemaOpcion= new JButtonMe();
		this.jButtonid_sistemaOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaOpcion.setText("Buscar");
		this.jButtonid_sistemaOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sistemaOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sistemaOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaOpcion"));

		this.jButtonid_sistemaOpcionBusqueda= new JButtonMe();
		this.jButtonid_sistemaOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sistemaOpcionBusqueda.setText("U");
		this.jButtonid_sistemaOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sistemaOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sistemaOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sistemaOpcionBusqueda.setVisible(false);		}

		this.jButtonid_sistemaOpcionUpdate= new JButtonMe();
		this.jButtonid_sistemaOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sistemaOpcionUpdate.setText("U");
		this.jButtonid_sistemaOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sistemaOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sistemaOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaOpcionUpdate"));



					
		this.jLabelid_moduloOpcion = new JLabelMe();
		this.jLabelid_moduloOpcion.setText(""+OpcionConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloOpcion.setToolTipText("Modulo");
		this.jLabelid_moduloOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelid_moduloOpcion.setLayout(this.gridaBagLayoutOpcion);


		jComboBoxid_moduloOpcion= new JComboBoxMe();
		jComboBoxid_moduloOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moduloOpcion= new JButtonMe();
		this.jButtonid_moduloOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloOpcion.setText("Buscar");
		this.jButtonid_moduloOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloOpcion"));

		this.jButtonid_moduloOpcionBusqueda= new JButtonMe();
		this.jButtonid_moduloOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloOpcionBusqueda.setText("U");
		this.jButtonid_moduloOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloOpcionBusqueda.setVisible(false);		}

		this.jButtonid_moduloOpcionUpdate= new JButtonMe();
		this.jButtonid_moduloOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloOpcionUpdate.setText("U");
		this.jButtonid_moduloOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloOpcionUpdate"));



					
		this.jLabelid_grupo_opcionOpcion = new JLabelMe();
		this.jLabelid_grupo_opcionOpcion.setText(""+OpcionConstantesFunciones.LABEL_IDGRUPOOPCION+" : *");
		this.jLabelid_grupo_opcionOpcion.setToolTipText("Grupo Opcion");
		this.jLabelid_grupo_opcionOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_opcionOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_opcionOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_opcionOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_opcionOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_opcionOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_IDGRUPOOPCION);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelid_grupo_opcionOpcion.setLayout(this.gridaBagLayoutOpcion);


		jComboBoxid_grupo_opcionOpcion= new JComboBoxMe();
		jComboBoxid_grupo_opcionOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_opcionOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_opcionOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_opcionOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_opcionOpcion= new JButtonMe();
		this.jButtonid_grupo_opcionOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_opcionOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_opcionOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_opcionOpcion.setText("Buscar");
		this.jButtonid_grupo_opcionOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_opcionOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_opcionOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_opcionOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_opcionOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_opcionOpcion"));

		this.jButtonid_grupo_opcionOpcionBusqueda= new JButtonMe();
		this.jButtonid_grupo_opcionOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_opcionOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_opcionOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_opcionOpcionBusqueda.setText("U");
		this.jButtonid_grupo_opcionOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_opcionOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_opcionOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_opcionOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_opcionOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_opcionOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_opcionOpcionBusqueda.setVisible(false);		}

		this.jButtonid_grupo_opcionOpcionUpdate= new JButtonMe();
		this.jButtonid_grupo_opcionOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_opcionOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_opcionOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_opcionOpcionUpdate.setText("U");
		this.jButtonid_grupo_opcionOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_opcionOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_opcionOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_opcionOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_opcionOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_opcionOpcionUpdate"));



					
		this.jLabelid_opcionOpcion = new JLabelMe();
		this.jLabelid_opcionOpcion.setText(""+OpcionConstantesFunciones.LABEL_IDOPCION+" :");
		this.jLabelid_opcionOpcion.setToolTipText("Opcion");
		this.jLabelid_opcionOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_opcionOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_opcionOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_opcionOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_opcionOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_opcionOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_IDOPCION);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelid_opcionOpcion.setLayout(this.gridaBagLayoutOpcion);


		jComboBoxid_opcionOpcion= new JComboBoxMe();
		jComboBoxid_opcionOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_opcionOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_opcionOpcion= new JButtonMe();
		this.jButtonid_opcionOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionOpcion.setText("Buscar");
		this.jButtonid_opcionOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_opcionOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_opcionOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionOpcion"));

		this.jButtonid_opcionOpcionBusqueda= new JButtonMe();
		this.jButtonid_opcionOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_opcionOpcionBusqueda.setText("U");
		this.jButtonid_opcionOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_opcionOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_opcionOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_opcionOpcionBusqueda.setVisible(false);		}

		this.jButtonid_opcionOpcionUpdate= new JButtonMe();
		this.jButtonid_opcionOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_opcionOpcionUpdate.setText("U");
		this.jButtonid_opcionOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_opcionOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_opcionOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionOpcionUpdate"));


		jButtonid_opcionOpcionArbol= new JButtonMe();
		jButtonid_opcionOpcionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionOpcionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionOpcionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionOpcionArbol.setText("Arbol");
		jButtonid_opcionOpcionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_opcionOpcionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionOpcionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_opcionOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionOpcionArbol"));



					
		this.jLabelid_tipo_tecla_mascaraOpcion = new JLabelMe();
		this.jLabelid_tipo_tecla_mascaraOpcion.setText(""+OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA+" : *");
		this.jLabelid_tipo_tecla_mascaraOpcion.setToolTipText("Tecla Mascara");
		this.jLabelid_tipo_tecla_mascaraOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_tecla_mascaraOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_tecla_mascaraOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tecla_mascaraOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_tecla_mascaraOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_tecla_mascaraOpcion.setToolTipText(OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA);
		this.gridaBagLayoutOpcion = new GridBagLayout();
		this.jPanelid_tipo_tecla_mascaraOpcion.setLayout(this.gridaBagLayoutOpcion);


		jComboBoxid_tipo_tecla_mascaraOpcion= new JComboBoxMe();
		jComboBoxid_tipo_tecla_mascaraOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tecla_mascaraOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tecla_mascaraOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tecla_mascaraOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_tecla_mascaraOpcion= new JButtonMe();
		this.jButtonid_tipo_tecla_mascaraOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tecla_mascaraOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tecla_mascaraOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tecla_mascaraOpcion.setText("Buscar");
		this.jButtonid_tipo_tecla_mascaraOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_tecla_mascaraOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tecla_mascaraOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_tecla_mascaraOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tecla_mascaraOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tecla_mascaraOpcion"));

		this.jButtonid_tipo_tecla_mascaraOpcionBusqueda= new JButtonMe();
		this.jButtonid_tipo_tecla_mascaraOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tecla_mascaraOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tecla_mascaraOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tecla_mascaraOpcionBusqueda.setText("U");
		this.jButtonid_tipo_tecla_mascaraOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_tecla_mascaraOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tecla_mascaraOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_tecla_mascaraOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tecla_mascaraOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tecla_mascaraOpcionBusqueda"));

		if(this.opcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_tecla_mascaraOpcionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_tecla_mascaraOpcionUpdate= new JButtonMe();
		this.jButtonid_tipo_tecla_mascaraOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tecla_mascaraOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tecla_mascaraOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tecla_mascaraOpcionUpdate.setText("U");
		this.jButtonid_tipo_tecla_mascaraOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_tecla_mascaraOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tecla_mascaraOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_tecla_mascaraOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tecla_mascaraOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tecla_mascaraOpcionUpdate"));



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
		//this.jInternalFrameDetalleOpcion = new OpcionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Opcion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutOpcion= new GridBagLayout();
		

		
		String sToolTipOpcion="";
		sToolTipOpcion=OpcionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipOpcion+="(Seguridad.Opcion)";
		}
		
		if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
			sToolTipOpcion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoOpcion = new JButtonMe();
		this.jButtonModificarOpcion = new JButtonMe();
        this.jButtonActualizarOpcion = new JButtonMe();
        this.jButtonEliminarOpcion = new JButtonMe();
        this.jButtonCancelarOpcion = new JButtonMe();
        this.jButtonGuardarCambiosOpcion = new JButtonMe();
		this.jButtonGuardarCambiosTablaOpcion = new JButtonMe();
		this.jButtonCerrarOpcion = new JButtonMe();
		
		this.jScrollPanelDatosOpcion = new JScrollPane();   
        this.jScrollPanelDatosEdicionOpcion = new JScrollPane();
		this.jScrollPanelDatosGeneralOpcion = new JScrollPane();
				
		
		
		this.jPanelCamposOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Opcion";
		
		if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Opciones" + this.sPath));
		} else {
			this.jScrollPanelDatosOpcion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposOpcion.setName("jPanelCamposOpcion"); 

		this.jPanelCamposOcultosOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosOpcion.setName("jPanelCamposOcultosOpcion"); 

        this.jPanelAccionesOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesOpcion.setToolTipText("Acciones");
        this.jPanelAccionesOpcion.setName("Acciones"); 

		this.jPanelAccionesFormularioOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioOpcion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioOpcion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosOpcion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoOpcion.setText("Nuevo");
		this.jButtonModificarOpcion.setText("Editar");
        this.jButtonActualizarOpcion.setText("Actualizar");
        this.jButtonEliminarOpcion.setText("Eliminar");
        this.jButtonCancelarOpcion.setText("Cancelar");
        this.jButtonGuardarCambiosOpcion.setText("Guardar");
		this.jButtonGuardarCambiosTablaOpcion.setText("Guardar");
		this.jButtonCerrarOpcion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoOpcion,"nuevo_button","Nuevo",this.opcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarOpcion,"modificar_button","Editar",this.opcionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarOpcion,"actualizar_button","Actualizar",this.opcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarOpcion,"eliminar_button","Eliminar",this.opcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarOpcion,"cancelar_button","Cancelar",this.opcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosOpcion,"guardarcambios_button","Guardar",this.opcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaOpcion,"guardarcambiostabla_button","Guardar",this.opcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOpcion,"cerrar_button","Salir",this.opcionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoOpcion.setToolTipText("Nuevo"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarOpcion.setToolTipText("Editar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarOpcion.setToolTipText("Actualizar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarOpcion.setToolTipText("Eliminar)"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarOpcion.setToolTipText("Cancelar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosOpcion.setToolTipText("Guardar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaOpcion.setToolTipText("Guardar"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarOpcion.setToolTipText("Salir"+" "+OpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoOpcion";
		inputMap = this.jButtonNuevoOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoOpcion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarOpcion";
		inputMap = this.jButtonActualizarOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarOpcion"));
		
		//ELIMINAR
		sMapKey = "EliminarOpcion";
		inputMap = this.jButtonEliminarOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarOpcion"));
		
		//CANCELAR	
		sMapKey = "CancelarOpcion";
		inputMap = this.jButtonCancelarOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarOpcion"));
		
		//CERRAR		
		sMapKey = "CerrarOpcion";
		inputMap = this.jButtonCerrarOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarOpcion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaOpcion";
		inputMap = this.jButtonGuardarCambiosTablaOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaOpcion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoOpcion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoOpcion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoOpcion.setToolTipText("Nuevo Opcion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarOpcion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarOpcion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarOpcion.setToolTipText("Sin Cerrar Ventana Opcion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeOpcion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeOpcion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeOpcion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeOpcion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
		this.jButtonArbolOpcion = new JButtonMe();
		this.jButtonArbolOpcion.setText("Arbol");		
		this.jButtonArbolOpcion.setToolTipText("Buscar Por Arbol");
				
		
			
			
		this.jComboBoxTiposAccionesOpcion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesOpcion.setText("Accion");
		this.jComboBoxTiposAccionesOpcion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioOpcion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioOpcion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioOpcion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesOpcion = new JLabelMe();
		
		this.jLabelAccionesOpcion.setText("Acciones");		
		this.jLabelAccionesOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposOpcion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysOpcion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesOpcion=new JTabbedPane();
		this.jTabbedPaneRelacionesOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		this.jButtonArbolOpcion.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolOpcion.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolOpcion.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposAccionesOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioOpcion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioOpcion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioOpcion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioOpcion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposOpcion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosOpcion = new GridBagLayout();
		
		this.jPanelCamposOpcion.setLayout(gridaBagLayoutCamposOpcion);
		this.jPanelCamposOcultosOpcion.setLayout(gridaBagLayoutCamposOcultosOpcion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidOpcion.add(jLabelIdOpcion, this.gridBagConstraintsOpcion);



	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidOpcion.add(jLabelidOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sistemaOpcion.add(jLabelid_sistemaOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sistemaOpcion.add(jButtonid_sistemaOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 3;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sistemaOpcion.add(jButtonid_sistemaOpcionUpdate, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sistemaOpcion.add(jComboBoxid_sistemaOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloOpcion.add(jLabelid_moduloOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloOpcion.add(jButtonid_moduloOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 3;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloOpcion.add(jButtonid_moduloOpcionUpdate, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloOpcion.add(jComboBoxid_moduloOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_opcionOpcion.add(jLabelid_grupo_opcionOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_opcionOpcion.add(jButtonid_grupo_opcionOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 3;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_opcionOpcion.add(jButtonid_grupo_opcionOpcionUpdate, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_opcionOpcion.add(jComboBoxid_grupo_opcionOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_opcionOpcion.add(jLabelid_opcionOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_opcionOpcion.add(jButtonid_opcionOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 3;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_opcionOpcion.add(jButtonid_opcionOpcionUpdate, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_opcionOpcion.add(jComboBoxid_opcionOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoOpcion.add(jLabelcodigoOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoOpcion.add(jButtoncodigoOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoOpcion.add(jTextFieldcodigoOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreOpcion.add(jLabelnombreOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreOpcion.add(jButtonnombreOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreOpcion.add(jTextFieldnombreOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_tecla_mascaraOpcion.add(jLabelid_tipo_tecla_mascaraOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tecla_mascaraOpcion.add(jButtonid_tipo_tecla_mascaraOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 3;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tecla_mascaraOpcion.add(jButtonid_tipo_tecla_mascaraOpcionUpdate, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_tecla_mascaraOpcion.add(jComboBoxid_tipo_tecla_mascaraOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelteclaOpcion.add(jLabelteclaOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelteclaOpcion.add(jButtonteclaOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelteclaOpcion.add(jTextFieldteclaOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelposicionOpcion.add(jLabelposicionOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelposicionOpcion.add(jButtonposicionOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelposicionOpcion.add(jTextFieldposicionOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelicon_nameOpcion.add(jLabelicon_nameOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelicon_nameOpcion.add(jButtonicon_nameOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelicon_nameOpcion.add(jscrollPaneicon_nameOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_claseOpcion.add(jLabelnombre_claseOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_claseOpcion.add(jButtonnombre_claseOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_claseOpcion.add(jTextFieldnombre_claseOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_moduloOpcion.add(jLabelsub_moduloOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_moduloOpcion.add(jButtonsub_moduloOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_moduloOpcion.add(jTextFieldsub_moduloOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpaqueteOpcion.add(jLabelpaqueteOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelpaqueteOpcion.add(jButtonpaqueteOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpaqueteOpcion.add(jscrollPanepaqueteOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpaquete_originalOpcion.add(jLabelpaquete_originalOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelpaquete_originalOpcion.add(jButtonpaquete_originalOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpaquete_originalOpcion.add(jscrollPanepaquete_originalOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpath_auxiliarOpcion.add(jLabelpath_auxiliarOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelpath_auxiliarOpcion.add(jButtonpath_auxiliarOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpath_auxiliarOpcion.add(jTextFieldpath_auxiliarOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_para_menuOpcion.add(jLabeles_para_menuOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_para_menuOpcion.add(jButtones_para_menuOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_para_menuOpcion.add(jCheckBoxes_para_menuOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_mostrar_acciones_campoOpcion.add(jLabelcon_mostrar_acciones_campoOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_mostrar_acciones_campoOpcion.add(jButtoncon_mostrar_acciones_campoOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_mostrar_acciones_campoOpcion.add(jCheckBoxcon_mostrar_acciones_campoOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_guardar_relacionesOpcion.add(jLabeles_guardar_relacionesOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_guardar_relacionesOpcion.add(jButtones_guardar_relacionesOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_guardar_relacionesOpcion.add(jCheckBoxes_guardar_relacionesOpcion, this.gridBagConstraintsOpcion);


	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 0;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoOpcion.add(jLabelestadoOpcion, this.gridBagConstraintsOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		//this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = 2;
		this.gridBagConstraintsOpcion.ipadx = 0;
		this.gridBagConstraintsOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoOpcion.add(jButtonestadoOpcionBusqueda, this.gridBagConstraintsOpcion);
	}

	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOpcion.gridy = 0;
	this.gridBagConstraintsOpcion.gridx = 1;
	this.gridBagConstraintsOpcion.ipadx = 0;
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoOpcion.add(jCheckBoxestadoOpcion, this.gridBagConstraintsOpcion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelidOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelid_sistemaOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelid_moduloOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelid_grupo_opcionOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelid_opcionOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelcodigoOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelnombreOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelid_tipo_tecla_mascaraOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelteclaOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelposicionOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelicon_nameOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelnombre_claseOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelsub_moduloOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelpaqueteOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelpaquete_originalOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelpath_auxiliarOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPaneles_para_menuOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelcon_mostrar_acciones_campoOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPaneles_guardar_relacionesOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
	}
	this.gridBagConstraintsOpcion = new GridBagConstraints();
	this.gridBagConstraintsOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOpcion.gridy = iYPanelCamposOpcion;
	this.gridBagConstraintsOpcion.gridx = iXPanelCamposOpcion++;
	this.gridBagConstraintsOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOpcion.add(this.jPanelestadoOpcion, this.gridBagConstraintsOpcion);



	if(iXPanelCamposOpcion % 2==0) {
		iXPanelCamposOpcion=0;
		iYPanelCamposOpcion++;
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
			
		GridBagLayout gridaBagLayoutAccionesOpcion= new GridBagLayout();
		this.jPanelAccionesOpcion.setLayout(gridaBagLayoutAccionesOpcion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioOpcion= new GridBagLayout();
		this.jPanelAccionesFormularioOpcion.setLayout(gridaBagLayoutAccionesFormularioOpcion);
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsOpcion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioOpcion.add(this.jComboBoxTiposAccionesFormularioOpcion, this.gridBagConstraintsOpcion);

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsOpcion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioOpcion.add(this.jCheckBoxPostAccionNuevoOpcion, this.gridBagConstraintsOpcion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.opcionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsOpcion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioOpcion.add(this.jCheckBoxPostAccionSinCerrarOpcion, this.gridBagConstraintsOpcion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.opcionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.opcionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsOpcion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioOpcion.add(this.jCheckBoxPostAccionSinMensajeOpcion, this.gridBagConstraintsOpcion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx = iPosXAccion++;
			
		this.jPanelAccionesOpcion.add(this.jButtonModificarOpcion, this.gridBagConstraintsOpcion);							

		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOpcion.gridy = 0;
		this.gridBagConstraintsOpcion.gridx =iPosXAccion++;
			
		this.jPanelAccionesOpcion.add(this.jButtonEliminarOpcion, this.gridBagConstraintsOpcion);
		
			
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = 0;		
		this.gridBagConstraintsOpcion.gridx = iPosXAccion++;
		
		this.jPanelAccionesOpcion.add(this.jButtonActualizarOpcion, this.gridBagConstraintsOpcion);


		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = 0;		
		this.gridBagConstraintsOpcion.gridx = iPosXAccion++;
		
		this.jPanelAccionesOpcion.add(this.jButtonGuardarCambiosOpcion, this.gridBagConstraintsOpcion);	
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = 0;		
		this.gridBagConstraintsOpcion.gridx =iPosXAccion++;
		
		this.jPanelAccionesOpcion.add(this.jButtonCancelarOpcion, this.gridBagConstraintsOpcion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutOpcion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutOpcion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.opcionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsOpcion = new GridBagConstraints();						
			this.gridBagConstraintsOpcion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsOpcion.gridx = 0;		
			//this.gridBagConstraintsOpcion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsOpcion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsOpcion.gridx =0;
		this.gridBagConstraintsOpcion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsOpcion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosOpcion, this.gridBagConstraintsOpcion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeOpcion = new OpcionBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeOpcion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeOpcion.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeOpcion.setTitle("Opcion ARBOL");
		this.jInternalFrameTreeOpcion.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Opcion Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeOpcion.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeOpcion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeOpcion.setResizable(true);
	    this.jInternalFrameTreeOpcion.setClosable(true);
	    this.jInternalFrameTreeOpcion.setMaximizable(true);
			
			
		//if(OpcionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleOpcion = new OpcionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Opcion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Opcion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Opcion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			OpcionModel opcionModel=new OpcionModel(this);
			
			//SI USARA CLASE INTERNA
			//OpcionModel.OpcionFocusTraversalPolicy opcionFocusTraversalPolicy = opcionModel.new OpcionFocusTraversalPolicy(this);
			
			//opcionFocusTraversalPolicy.setopcionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(opcionModel);
			
			
			this.jContentPaneDetalleOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleOpcion = new GridBagLayout();	
			this.jContentPaneDetalleOpcion.setLayout(gridaBagLayoutDetalleOpcion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosOpcion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsOpcion = new GridBagConstraints();
				this.gridBagConstraintsOpcion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsOpcion.gridx = 0;
					
				
				this.jContentPaneDetalleOpcion.add(jTtoolBarDetalleOpcion, gridBagConstraintsOpcion);								
				
}
			
			this.jScrollPanelDatosEdicionOpcion=   new JScrollPane(jContentPaneDetalleOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralOpcion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsOpcion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsOpcion.gridx = 0;
	        
			this.jContentPaneDetalleOpcion.add(jPanelCamposOpcion, gridBagConstraintsOpcion);
			
			
			
			
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
						&& opcionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAccion(this.puedeCargarPorParteAccion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCampo(this.puedeCargarPorParteCampo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameOpcion(this.puedeCargarPorParteOpcion,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePerfilOpcion(this.puedeCargarPorPartePerfilOpcion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(this.puedeCargarPorParteUsuarioOpcion,false,-1);
					
					if(this.opcionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsOpcion= new GridBagConstraints();
						this.gridBagConstraintsOpcion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsOpcion.gridx = 0;
						this.jContentPaneDetalleOpcion.add(this.jTabbedPaneRelacionesOpcion, this.gridBagConstraintsOpcion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesOpcion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAccion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCampo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameOpcion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePerfilOpcion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosOpcion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsOpcion = new GridBagConstraints();
					this.gridBagConstraintsOpcion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsOpcion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsOpcion.gridx = 0;
					
				
					this.jContentPaneDetalleOpcion.add(jPanelCamposOcultosOpcion, gridBagConstraintsOpcion);
				
					this.jPanelCamposOcultosOpcion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.gridy = iGridyRelaciones++;//16;		
	        this.gridBagConstraintsOpcion.gridx = 0;
	        this.gridBagConstraintsOpcion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleOpcion.add(this.jPanelAccionesFormularioOpcion, this.gridBagConstraintsOpcion);							
			
			
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
	        this.gridBagConstraintsOpcion.gridy = iGridyRelaciones;//16;		
	        this.gridBagConstraintsOpcion.gridx = 0;
	        
			
			this.jContentPaneDetalleOpcion.add(this.jPanelAccionesOpcion, this.gridBagConstraintsOpcion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionOpcion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionOpcion=   new JScrollPane(this.jPanelCamposOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsOpcion.gridx = 0;
			this.gridBagConstraintsOpcion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsOpcion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsOpcion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionOpcion, this.gridBagConstraintsOpcion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsOpcion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioOpcion, this.gridBagConstraintsOpcion);			
			
			this.gridBagConstraintsOpcion = new GridBagConstraints();
			this.gridBagConstraintsOpcion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsOpcion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesOpcion, this.gridBagConstraintsOpcion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOpcion, this.gridBagConstraintsOpcion);
			
			
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosOpcion, this.gridBagConstraintsOpcion);
		
			
		this.gridBagConstraintsOpcion = new GridBagConstraints();
		this.gridBagConstraintsOpcion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsOpcion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesOpcion, this.gridBagConstraintsOpcion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralOpcion;//jContentPane;
		
		return jScrollPanelDatosEdicionOpcion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAccion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.accionSessionBean=new AccionSessionBean();
		this.accionSessionBean.setConGuardarRelaciones(false);
		this.accionSessionBean.setEsGuardarRelacionado(true);

		this.accionBeanSwingJInternalFrame=null;//new AccionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.accionBeanSwingJInternalFramePopup=new AccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.accionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.accionSessionBean.getEsGuardarRelacionado()) {

				AccionJInternalFrame.STIPO_TAMANIO_GENERAL=OpcionJInternalFrame.STIPO_TAMANIO_GENERAL;
				AccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=OpcionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.accionSessionBean.setEsGuardarRelacionado(true);

				this.accionBeanSwingJInternalFrame=new AccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.accionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.accionBeanSwingJInternalFrame.setaccionSessionBean(this.accionSessionBean);

				//this.gridBagConstraintsOpcion = new GridBagConstraints();
				//this.gridBagConstraintsOpcion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsOpcion.gridx = 0;
				//this.jContentPaneDetalleOpcion.add(this.accionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsOpcion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesOpcion.add("Acciones",this.accionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesOpcion.setComponentAt(iIndexTab,this.accionBeanSwingJInternalFrame.getContentPane());
				}

				//AccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.accionSessionBean.setEsGuardarRelacionado(false);
				this.accionBeanSwingJInternalFrame=null;//new AccionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.accionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAccion) {
					this.jTabbedPaneRelacionesOpcion.add("Acciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCampo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.campoSessionBean=new CampoSessionBean();
		this.campoSessionBean.setConGuardarRelaciones(false);
		this.campoSessionBean.setEsGuardarRelacionado(true);

		this.campoBeanSwingJInternalFrame=null;//new CampoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.campoBeanSwingJInternalFramePopup=new CampoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.campoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.campoSessionBean.getEsGuardarRelacionado()) {

				CampoJInternalFrame.STIPO_TAMANIO_GENERAL=OpcionJInternalFrame.STIPO_TAMANIO_GENERAL;
				CampoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=OpcionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.campoSessionBean.setEsGuardarRelacionado(true);

				this.campoBeanSwingJInternalFrame=new CampoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.campoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.campoBeanSwingJInternalFrame.setcampoSessionBean(this.campoSessionBean);

				//this.gridBagConstraintsOpcion = new GridBagConstraints();
				//this.gridBagConstraintsOpcion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsOpcion.gridx = 0;
				//this.jContentPaneDetalleOpcion.add(this.campoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsOpcion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesOpcion.add("Campos",this.campoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesOpcion.setComponentAt(iIndexTab,this.campoBeanSwingJInternalFrame.getContentPane());
				}

				//CampoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.campoSessionBean.setEsGuardarRelacionado(false);
				this.campoBeanSwingJInternalFrame=null;//new CampoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.campoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCampo) {
					this.jTabbedPaneRelacionesOpcion.add("Campos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameOpcion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.opcionSessionBean=new OpcionSessionBean();
		this.opcionSessionBean.setConGuardarRelaciones(false);
		//this.opcionSessionBean.setEsGuardarRelacionado(true);

		this.opcionBeanSwingJInternalFrame=null;//new OpcionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.opcionBeanSwingJInternalFramePopup=new OpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.opcionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.opcionSessionBean.getEsGuardarRelacionado()) {
				OpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=OpcionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.opcionSessionBean.setEsGuardarRelacionado(true);

				this.opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.opcionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.opcionBeanSwingJInternalFrame.setopcionSessionBean(this.opcionSessionBean);

				//this.gridBagConstraintsOpcion = new GridBagConstraints();
				//this.gridBagConstraintsOpcion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsOpcion.gridx = 0;
				//this.jContentPaneDetalleOpcion.add(this.opcionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsOpcion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesOpcion.add("Opciones",this.opcionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesOpcion.setComponentAt(iIndexTab,this.opcionBeanSwingJInternalFrame.getContentPane());
				}

				//OpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.opcionSessionBean.setEsGuardarRelacionado(false);
				this.opcionBeanSwingJInternalFrame=null;//new OpcionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.opcionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteOpcion) {
					this.jTabbedPaneRelacionesOpcion.add("Opciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePerfilOpcion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
		this.perfilopcionSessionBean.setConGuardarRelaciones(false);
		this.perfilopcionSessionBean.setEsGuardarRelacionado(true);

		this.perfilopcionBeanSwingJInternalFrame=null;//new PerfilOpcionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.perfilopcionBeanSwingJInternalFramePopup=new PerfilOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.perfilopcionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.perfilopcionSessionBean.getEsGuardarRelacionado()) {

				PerfilOpcionJInternalFrame.STIPO_TAMANIO_GENERAL=OpcionJInternalFrame.STIPO_TAMANIO_GENERAL;
				PerfilOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=OpcionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.perfilopcionSessionBean.setEsGuardarRelacionado(true);

				this.perfilopcionBeanSwingJInternalFrame=new PerfilOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.perfilopcionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.perfilopcionBeanSwingJInternalFrame.setperfilopcionSessionBean(this.perfilopcionSessionBean);

				//this.gridBagConstraintsOpcion = new GridBagConstraints();
				//this.gridBagConstraintsOpcion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsOpcion.gridx = 0;
				//this.jContentPaneDetalleOpcion.add(this.perfilopcionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsOpcion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesOpcion.add("Perfil Opciones",this.perfilopcionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesOpcion.setComponentAt(iIndexTab,this.perfilopcionBeanSwingJInternalFrame.getContentPane());
				}

				//PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.perfilopcionSessionBean.setEsGuardarRelacionado(false);
				this.perfilopcionBeanSwingJInternalFrame=null;//new PerfilOpcionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePerfilOpcion) {
					this.jTabbedPaneRelacionesOpcion.add("Perfil Opciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
		this.usuarioopcionSessionBean.setConGuardarRelaciones(false);
		this.usuarioopcionSessionBean.setEsGuardarRelacionado(true);

		this.usuarioopcionBeanSwingJInternalFrame=null;//new UsuarioOpcionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.usuarioopcionBeanSwingJInternalFramePopup=new UsuarioOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.usuarioopcionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {

				UsuarioOpcionJInternalFrame.STIPO_TAMANIO_GENERAL=OpcionJInternalFrame.STIPO_TAMANIO_GENERAL;
				UsuarioOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=OpcionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.usuarioopcionSessionBean.setEsGuardarRelacionado(true);

				this.usuarioopcionBeanSwingJInternalFrame=new UsuarioOpcionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.usuarioopcionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.usuarioopcionBeanSwingJInternalFrame.setusuarioopcionSessionBean(this.usuarioopcionSessionBean);

				//this.gridBagConstraintsOpcion = new GridBagConstraints();
				//this.gridBagConstraintsOpcion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsOpcion.gridx = 0;
				//this.jContentPaneDetalleOpcion.add(this.usuarioopcionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsOpcion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesOpcion.add("Usuario Opciones",this.usuarioopcionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesOpcion.setComponentAt(iIndexTab,this.usuarioopcionBeanSwingJInternalFrame.getContentPane());
				}

				//UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.usuarioopcionSessionBean.setEsGuardarRelacionado(false);
				this.usuarioopcionBeanSwingJInternalFrame=null;//new UsuarioOpcionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteUsuarioOpcion) {
					this.jTabbedPaneRelacionesOpcion.add("Usuario Opciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarUsuarioOpcionBeanSwingJInternalFrame(List<Opcion> opcions,Opcion opcion,UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//usuarioopcionBeanSwingJInternalFrame=new UsuarioOpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					usuarioopcionBeanSwingJInternalFrame.getUsuarioOpcionLogic().setConnexion(this.opcionLogic.getConnexion());

					usuarioopcionBeanSwingJInternalFrame.setopcionsForeignKey(opcions);
					usuarioopcionBeanSwingJInternalFrame.setopcionForeignKey(opcion);
					usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setisBusquedaDesdeForeignKeySesionOpcion(true);
					usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setlidOpcionActual(opcion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					usuarioopcionBeanSwingJInternalFrame.cargarCombosForeignKeyUsuarioOpcion(usuarioopcionBeanSwingJInternalFrame.isCargarCombosDependencia);
					usuarioopcionBeanSwingJInternalFrame.setVisibilidadBusquedasParaOpcion(true);
					usuarioopcionBeanSwingJInternalFrame.setid_opcionFK_IdOpcion(opcion.getId());

					if(!this.conCargarFormDetalle) {
						usuarioopcionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					usuarioopcionBeanSwingJInternalFrame.setSelectedItemCombosFrameOpcionForeignKey(opcion,1,false,true,true);
					usuarioopcionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					usuarioopcionBeanSwingJInternalFrame.procesarBusqueda("FK_IdOpcion");
					usuarioopcionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdOpcion");
					usuarioopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuarioOpcion(true);
					usuarioopcionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesUsuarioOpcion("n",usuarioopcionBeanSwingJInternalFrame.isGuardarCambiosEnLote, usuarioopcionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					usuarioopcionBeanSwingJInternalFrame.setAutoscrolls(true);
					usuarioopcionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						usuarioopcionBeanSwingJInternalFrame.actualizarEstadoPanelsUsuarioOpcion("relacionado");
					} else {
						usuarioopcionBeanSwingJInternalFrame.actualizarEstadoPanelsUsuarioOpcion("no_relacionado");
					}

					usuarioopcionBeanSwingJInternalFrame.getjButtonRecargarInformacionUsuarioOpcion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarOpcionBeanSwingJInternalFrame(List<Opcion> opcions,Opcion opcion,OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					opcionBeanSwingJInternalFrame.getOpcionLogic().setConnexion(this.opcionLogic.getConnexion());

					opcionBeanSwingJInternalFrame.setopcionsForeignKey(opcions);
					opcionBeanSwingJInternalFrame.setopcionForeignKey(opcion);
					opcionBeanSwingJInternalFrame.opcionSessionBean.setisBusquedaDesdeForeignKeySesionOpcion(true);
					opcionBeanSwingJInternalFrame.opcionSessionBean.setlidOpcionActual(opcion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					opcionBeanSwingJInternalFrame.cargarCombosForeignKeyOpcion(opcionBeanSwingJInternalFrame.isCargarCombosDependencia);
					opcionBeanSwingJInternalFrame.setVisibilidadBusquedasParaOpcion(true);
					opcionBeanSwingJInternalFrame.setid_opcionFK_IdOpcion(opcion.getId());

					if(!this.conCargarFormDetalle) {
						opcionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					opcionBeanSwingJInternalFrame.setSelectedItemCombosFrameOpcionForeignKey(opcion,1,false,true,true);
					opcionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					opcionBeanSwingJInternalFrame.procesarBusqueda("FK_IdOpcion");
					opcionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdOpcion");
					opcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaOpcion(true);
					opcionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesOpcion("n",opcionBeanSwingJInternalFrame.isGuardarCambiosEnLote, opcionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					opcionBeanSwingJInternalFrame.setAutoscrolls(true);
					opcionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						opcionBeanSwingJInternalFrame.actualizarEstadoPanelsOpcion("relacionado");
					} else {
						opcionBeanSwingJInternalFrame.actualizarEstadoPanelsOpcion("no_relacionado");
					}

					opcionBeanSwingJInternalFrame.getjButtonRecargarInformacionOpcion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAccionBeanSwingJInternalFrame(List<Opcion> opcions,Opcion opcion,AccionBeanSwingJInternalFrame accionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//accionBeanSwingJInternalFrame=new AccionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					accionBeanSwingJInternalFrame.getAccionLogic().setConnexion(this.opcionLogic.getConnexion());

					accionBeanSwingJInternalFrame.setopcionsForeignKey(opcions);
					accionBeanSwingJInternalFrame.setopcionForeignKey(opcion);
					accionBeanSwingJInternalFrame.accionSessionBean.setisBusquedaDesdeForeignKeySesionOpcion(true);
					accionBeanSwingJInternalFrame.accionSessionBean.setlidOpcionActual(opcion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					accionBeanSwingJInternalFrame.cargarCombosForeignKeyAccion(accionBeanSwingJInternalFrame.isCargarCombosDependencia);
					accionBeanSwingJInternalFrame.setVisibilidadBusquedasParaOpcion(true);
					accionBeanSwingJInternalFrame.setid_opcionFK_IdOpcion(opcion.getId());

					if(!this.conCargarFormDetalle) {
						accionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					accionBeanSwingJInternalFrame.setSelectedItemCombosFrameOpcionForeignKey(opcion,1,false,true,true);
					accionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					accionBeanSwingJInternalFrame.procesarBusqueda("FK_IdOpcion");
					accionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdOpcion");
					accionBeanSwingJInternalFrame.inicializarActualizarBindingTablaAccion(true);
					accionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAccion("n",accionBeanSwingJInternalFrame.isGuardarCambiosEnLote, accionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					accionBeanSwingJInternalFrame.setAutoscrolls(true);
					accionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						accionBeanSwingJInternalFrame.actualizarEstadoPanelsAccion("relacionado");
					} else {
						accionBeanSwingJInternalFrame.actualizarEstadoPanelsAccion("no_relacionado");
					}

					accionBeanSwingJInternalFrame.getjButtonRecargarInformacionAccion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPerfilOpcionBeanSwingJInternalFrame(List<Opcion> opcions,Opcion opcion,PerfilOpcionBeanSwingJInternalFrame perfilopcionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//perfilopcionBeanSwingJInternalFrame=new PerfilOpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					perfilopcionBeanSwingJInternalFrame.getPerfilOpcionLogic().setConnexion(this.opcionLogic.getConnexion());

					perfilopcionBeanSwingJInternalFrame.setopcionsForeignKey(opcions);
					perfilopcionBeanSwingJInternalFrame.setopcionForeignKey(opcion);
					perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setisBusquedaDesdeForeignKeySesionOpcion(true);
					perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setlidOpcionActual(opcion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					perfilopcionBeanSwingJInternalFrame.cargarCombosForeignKeyPerfilOpcion(perfilopcionBeanSwingJInternalFrame.isCargarCombosDependencia);
					perfilopcionBeanSwingJInternalFrame.setVisibilidadBusquedasParaOpcion(true);
					perfilopcionBeanSwingJInternalFrame.setid_opcionFK_IdOpcion(opcion.getId());

					if(!this.conCargarFormDetalle) {
						perfilopcionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					perfilopcionBeanSwingJInternalFrame.setSelectedItemCombosFrameOpcionForeignKey(opcion,1,false,true,true);
					perfilopcionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					perfilopcionBeanSwingJInternalFrame.procesarBusqueda("FK_IdOpcion");
					perfilopcionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdOpcion");
					perfilopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilOpcion(true);
					perfilopcionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPerfilOpcion("n",perfilopcionBeanSwingJInternalFrame.isGuardarCambiosEnLote, perfilopcionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					perfilopcionBeanSwingJInternalFrame.setAutoscrolls(true);
					perfilopcionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						perfilopcionBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilOpcion("relacionado");
					} else {
						perfilopcionBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilOpcion("no_relacionado");
					}

					perfilopcionBeanSwingJInternalFrame.getjButtonRecargarInformacionPerfilOpcion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCampoBeanSwingJInternalFrame(List<Opcion> opcions,Opcion opcion,CampoBeanSwingJInternalFrame campoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//campoBeanSwingJInternalFrame=new CampoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					campoBeanSwingJInternalFrame.getCampoLogic().setConnexion(this.opcionLogic.getConnexion());

					campoBeanSwingJInternalFrame.setopcionsForeignKey(opcions);
					campoBeanSwingJInternalFrame.setopcionForeignKey(opcion);
					campoBeanSwingJInternalFrame.campoSessionBean.setisBusquedaDesdeForeignKeySesionOpcion(true);
					campoBeanSwingJInternalFrame.campoSessionBean.setlidOpcionActual(opcion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					campoBeanSwingJInternalFrame.cargarCombosForeignKeyCampo(campoBeanSwingJInternalFrame.isCargarCombosDependencia);
					campoBeanSwingJInternalFrame.setVisibilidadBusquedasParaOpcion(true);
					campoBeanSwingJInternalFrame.setid_opcionFK_IdOpcion(opcion.getId());

					if(!this.conCargarFormDetalle) {
						campoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					campoBeanSwingJInternalFrame.setSelectedItemCombosFrameOpcionForeignKey(opcion,1,false,true,true);
					campoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					campoBeanSwingJInternalFrame.procesarBusqueda("FK_IdOpcion");
					campoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdOpcion");
					campoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCampo(true);
					campoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCampo("n",campoBeanSwingJInternalFrame.isGuardarCambiosEnLote, campoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					campoBeanSwingJInternalFrame.setAutoscrolls(true);
					campoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						campoBeanSwingJInternalFrame.actualizarEstadoPanelsCampo("relacionado");
					} else {
						campoBeanSwingJInternalFrame.actualizarEstadoPanelsCampo("no_relacionado");
					}

					campoBeanSwingJInternalFrame.getjButtonRecargarInformacionCampo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
