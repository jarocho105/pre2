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
import com.bydan.erp.seguridad.util.PerfilOpcionConstantesFunciones;

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
public class PerfilOpcionDetalleFormJInternalFrame extends PerfilOpcionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePerfilOpcion;
	
	protected JMenuBar jmenuBarDetallePerfilOpcion;
	
	protected JMenu jmenuDetallePerfilOpcion;
	protected JMenu jmenuDetalleArchivoPerfilOpcion;
	protected JMenu jmenuDetalleAccionesPerfilOpcion;
	protected JMenu jmenuDetalleDatosPerfilOpcion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPerfilOpcion;	
	protected GridBagConstraints gridBagConstraintsPerfilOpcion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PerfilOpcionBeanSwingJInternalFrameAdditional jInternalFrameDetallePerfilOpcion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sistema="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected GrupoOpcionBeanSwingJInternalFrame grupoopcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupoopcion="";

	protected PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_perfil="";

	protected OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_opcion="";
	
	public PerfilOpcionSessionBean perfilopcionSessionBean;
	
	
	
	
	public SistemaSessionBean sistemaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public GrupoOpcionSessionBean grupoopcionSessionBean;
	public PerfilSessionBean perfilSessionBean;
	public OpcionSessionBean opcionSessionBean;	
	
	public PerfilOpcionLogic perfilopcionLogic;
	
	public JScrollPane jScrollPanelDatosPerfilOpcion;
	public JScrollPane jScrollPanelDatosEdicionPerfilOpcion;
	public JScrollPane jScrollPanelDatosGeneralPerfilOpcion;
	
	protected JPanel jPanelCamposPerfilOpcion;    
	protected JPanel jPanelCamposOcultosPerfilOpcion;    	
	protected JPanel jPanelAccionesPerfilOpcion;
	protected JPanel jPanelAccionesFormularioPerfilOpcion;
    
	
	
	protected Integer iXPanelCamposPerfilOpcion=0;
	protected Integer iYPanelCamposPerfilOpcion=0;
	
	protected Integer iXPanelCamposOcultosPerfilOpcion=0;
	protected Integer iYPanelCamposOcultosPerfilOpcion=0;
	
	

	protected JPanel jPanelCamposIniciogeneralPerfilOpcion;
	protected Integer iXPanelCamposIniciogeneralPerfilOpcion=0;
	protected Integer iYPanelCamposIniciogeneralPerfilOpcion=0;

	protected JPanel jPanelCamposIniciopermisoPerfilOpcion;
	protected Integer iXPanelCamposIniciopermisoPerfilOpcion=0;
	protected Integer iYPanelCamposIniciopermisoPerfilOpcion=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPerfilOpcion;
	public JButton jButtonModificarPerfilOpcion;
	public JButton jButtonActualizarPerfilOpcion;
    public JButton jButtonEliminarPerfilOpcion;
	public JButton jButtonCancelarPerfilOpcion;
    public JButton jButtonGuardarCambiosPerfilOpcion;
	public JButton jButtonGuardarCambiosTablaPerfilOpcion;
	protected JButton jButtonCerrarPerfilOpcion;
	
	
	protected JButton jButtonProcesarInformacionPerfilOpcion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPerfilOpcion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPerfilOpcion;
	protected JCheckBox jCheckBoxPostAccionSinMensajePerfilOpcion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPerfilOpcion;
	protected JButton jButtonModificarToolBarPerfilOpcion;
	protected JButton jButtonActualizarToolBarPerfilOpcion;
    protected JButton jButtonEliminarToolBarPerfilOpcion;
	protected JButton jButtonCancelarToolBarPerfilOpcion;
    protected JButton jButtonGuardarCambiosToolBarPerfilOpcion;
	protected JButton jButtonGuardarCambiosTablaToolBarPerfilOpcion;
	protected JButton jButtonMostrarOcultarTablaToolBarPerfilOpcion;
	protected JButton jButtonCerrarToolBarPerfilOpcion;
	
	protected JButton jButtonProcesarInformacionToolBarPerfilOpcion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPerfilOpcion;
	protected JMenuItem jMenuItemModificarPerfilOpcion;
	protected JMenuItem jMenuItemActualizarPerfilOpcion;
    protected JMenuItem jMenuItemEliminarPerfilOpcion;
	protected JMenuItem jMenuItemCancelarPerfilOpcion;
    protected JMenuItem jMenuItemGuardarCambiosPerfilOpcion;
	protected JMenuItem jMenuItemGuardarCambiosTablaPerfilOpcion;
	protected JMenuItem jMenuItemCerrarPerfilOpcion;
	protected JMenuItem jMenuItemDetalleCerrarPerfilOpcion;
	protected JMenuItem jMenuItemDetalleMostarOcultarPerfilOpcion;
	
	protected JMenuItem jMenuItemProcesarInformacionPerfilOpcion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPerfilOpcion;
	protected JMenuItem jMenuItemMostrarOcultarPerfilOpcion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPerfilOpcion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPerfilOpcion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPerfilOpcion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPerfilOpcion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPerfilOpcion;
	public JLabel jLabelIdPerfilOpcion;
	public JLabel jLabelidPerfilOpcion;
	public JButton jButtonidPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPaneltodoPerfilOpcion;
	public JLabel jLabeltodoPerfilOpcion;
	public JCheckBox jCheckBoxtodoPerfilOpcion;
	public JButton jButtontodoPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelingresoPerfilOpcion;
	public JLabel jLabelingresoPerfilOpcion;
	public JCheckBox jCheckBoxingresoPerfilOpcion;
	public JButton jButtoningresoPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelmodificacionPerfilOpcion;
	public JLabel jLabelmodificacionPerfilOpcion;
	public JCheckBox jCheckBoxmodificacionPerfilOpcion;
	public JButton jButtonmodificacionPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPaneleliminacionPerfilOpcion;
	public JLabel jLabeleliminacionPerfilOpcion;
	public JCheckBox jCheckBoxeliminacionPerfilOpcion;
	public JButton jButtoneliminacionPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelguardar_cambiosPerfilOpcion;
	public JLabel jLabelguardar_cambiosPerfilOpcion;
	public JCheckBox jCheckBoxguardar_cambiosPerfilOpcion;
	public JButton jButtonguardar_cambiosPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelconsultaPerfilOpcion;
	public JLabel jLabelconsultaPerfilOpcion;
	public JCheckBox jCheckBoxconsultaPerfilOpcion;
	public JButton jButtonconsultaPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelbusquedaPerfilOpcion;
	public JLabel jLabelbusquedaPerfilOpcion;
	public JCheckBox jCheckBoxbusquedaPerfilOpcion;
	public JButton jButtonbusquedaPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelreportePerfilOpcion;
	public JLabel jLabelreportePerfilOpcion;
	public JCheckBox jCheckBoxreportePerfilOpcion;
	public JButton jButtonreportePerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelordenPerfilOpcion;
	public JLabel jLabelordenPerfilOpcion;
	public JCheckBox jCheckBoxordenPerfilOpcion;
	public JButton jButtonordenPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelpaginacion_medioPerfilOpcion;
	public JLabel jLabelpaginacion_medioPerfilOpcion;
	public JCheckBox jCheckBoxpaginacion_medioPerfilOpcion;
	public JButton jButtonpaginacion_medioPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelpaginacion_altoPerfilOpcion;
	public JLabel jLabelpaginacion_altoPerfilOpcion;
	public JCheckBox jCheckBoxpaginacion_altoPerfilOpcion;
	public JButton jButtonpaginacion_altoPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelpaginacion_todoPerfilOpcion;
	public JLabel jLabelpaginacion_todoPerfilOpcion;
	public JCheckBox jCheckBoxpaginacion_todoPerfilOpcion;
	public JButton jButtonpaginacion_todoPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelduplicarPerfilOpcion;
	public JLabel jLabelduplicarPerfilOpcion;
	public JCheckBox jCheckBoxduplicarPerfilOpcion;
	public JButton jButtonduplicarPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelcopiarPerfilOpcion;
	public JLabel jLabelcopiarPerfilOpcion;
	public JCheckBox jCheckBoxcopiarPerfilOpcion;
	public JButton jButtoncopiarPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelcon_precargarPerfilOpcion;
	public JLabel jLabelcon_precargarPerfilOpcion;
	public JCheckBox jCheckBoxcon_precargarPerfilOpcion;
	public JButton jButtoncon_precargarPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelestadoPerfilOpcion;
	public JLabel jLabelestadoPerfilOpcion;
	public JCheckBox jCheckBoxestadoPerfilOpcion;
	public JButton jButtonestadoPerfilOpcionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sistemaPerfilOpcion;
	public JLabel jLabelid_sistemaPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaPerfilOpcion;
	public JButton jButtonid_sistemaPerfilOpcion= new JButtonMe();
	public JButton jButtonid_sistemaPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_sistemaPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloPerfilOpcion;
	public JLabel jLabelid_moduloPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloPerfilOpcion;
	public JButton jButtonid_moduloPerfilOpcion= new JButtonMe();
	public JButton jButtonid_moduloPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_moduloPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_opcionPerfilOpcion;
	public JLabel jLabelid_grupo_opcionPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_opcionPerfilOpcion;
	public JButton jButtonid_grupo_opcionPerfilOpcion= new JButtonMe();
	public JButton jButtonid_grupo_opcionPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_grupo_opcionPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelid_perfilPerfilOpcion;
	public JLabel jLabelid_perfilPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_perfilPerfilOpcion;
	public JButton jButtonid_perfilPerfilOpcion= new JButtonMe();
	public JButton jButtonid_perfilPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_perfilPerfilOpcionBusqueda= new JButtonMe();

	public JPanel jPanelid_opcionPerfilOpcion;
	public JLabel jLabelid_opcionPerfilOpcion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_opcionPerfilOpcion;
	public JButton jButtonid_opcionPerfilOpcion= new JButtonMe();
	public JButton jButtonid_opcionPerfilOpcionUpdate= new JButtonMe();
	public JButton jButtonid_opcionPerfilOpcionBusqueda= new JButtonMe();
	public JButton jButtonid_opcionPerfilOpcionArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPerfilOpcion;
	
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
		
	public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PerfilOpcionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPerfilOpcion=new JPanel();
				this.jPanelAccionesFormularioPerfilOpcion=new JPanel();
				this.jmenuBarDetallePerfilOpcion=new JMenuBar();
				this.jTtoolBarDetallePerfilOpcion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilOpcionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PerfilOpcionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilOpcionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilOpcionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilOpcionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PerfilOpcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPerfilOpcion() {
		return this.jButtonActualizarToolBarPerfilOpcion;
	}
	
	public JButton getjButtonEliminarToolBarPerfilOpcion() {
		return this.jButtonEliminarToolBarPerfilOpcion;
	}
	
	public JButton getjButtonCancelarToolBarPerfilOpcion() {
		return this.jButtonCancelarToolBarPerfilOpcion;
	}		
	
	public JButton getjButtonProcesarInformacionPerfilOpcion() {
		return this.jButtonProcesarInformacionPerfilOpcion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPerfilOpcion)	{
		this.jButtonProcesarInformacionPerfilOpcion = jButtonProcesarInformacionPerfilOpcion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPerfilOpcion() {
		return this.jComboBoxTiposAccionesPerfilOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPerfilOpcion(
			JComboBox jComboBoxTiposRelacionesPerfilOpcion) {
		this.jComboBoxTiposRelacionesPerfilOpcion = jComboBoxTiposRelacionesPerfilOpcion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPerfilOpcion(
			JComboBox jComboBoxTiposAccionesPerfilOpcion) {
		this.jComboBoxTiposAccionesPerfilOpcion = jComboBoxTiposAccionesPerfilOpcion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPerfilOpcion() {
		return this.jComboBoxTiposAccionesFormularioPerfilOpcion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPerfilOpcion(
			JComboBox jComboBoxTiposAccionesFormularioPerfilOpcion) {
		this.jComboBoxTiposAccionesFormularioPerfilOpcion = jComboBoxTiposAccionesFormularioPerfilOpcion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
		
		this.perfilopcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilopcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.perfilopcionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PerfilOpcionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PerfilOpcionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PerfilOpcionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Perfil Opcion MANTENIMIENTO"));
		
		
		if(iWidth > 2350) {
			iWidth=2350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
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
	
		PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePerfilOpcion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPerfilOpcion=new JButtonMe();
				this.jButtonModificarToolBarPerfilOpcion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPerfilOpcion,this.jTtoolBarDetallePerfilOpcion,
							"actualizar","actualizar","Actualizar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPerfilOpcion,this.jTtoolBarDetallePerfilOpcion,
							"eliminar","eliminar","Eliminar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPerfilOpcion,this.jTtoolBarDetallePerfilOpcion,
							"cancelar","cancelar","Cancelar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPerfilOpcion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPerfilOpcion,this.jTtoolBarDetallePerfilOpcion,
							"guardarcambios","guardarcambios","Guardar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePerfilOpcion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePerfilOpcion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPerfilOpcion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPerfilOpcion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPerfilOpcion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPerfilOpcion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPerfilOpcion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPerfilOpcion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPerfilOpcion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPerfilOpcion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPerfilOpcion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPerfilOpcion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPerfilOpcion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPerfilOpcion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPerfilOpcion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPerfilOpcion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPerfilOpcion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPerfilOpcion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPerfilOpcion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPerfilOpcion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPerfilOpcion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPerfilOpcion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPerfilOpcion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPerfilOpcion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPerfilOpcion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPerfilOpcion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPerfilOpcion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPerfilOpcion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPerfilOpcion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPerfilOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPerfilOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPerfilOpcion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPerfilOpcion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPerfilOpcion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPerfilOpcion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPerfilOpcion.add(this.jMenuItemDetalleCerrarPerfilOpcion);
		
		this.jmenuDetalleAccionesPerfilOpcion.add(this.jMenuItemActualizarPerfilOpcion);
		this.jmenuDetalleAccionesPerfilOpcion.add(this.jMenuItemEliminarPerfilOpcion);
		this.jmenuDetalleAccionesPerfilOpcion.add(this.jMenuItemCancelarPerfilOpcion);		
		
		//this.jmenuDetalleDatosPerfilOpcion.add(this.jMenuItemDetalleAbrirOrderByPerfilOpcion);				
		this.jmenuDetalleDatosPerfilOpcion.add(this.jMenuItemDetalleMostarOcultarPerfilOpcion);				
				
		//this.jmenuDetalleAccionesPerfilOpcion.add(this.jMenuItemGuardarCambiosPerfilOpcion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePerfilOpcion.add(this.jmenuDetalleArchivoPerfilOpcion);		
		this.jmenuBarDetallePerfilOpcion.add(this.jmenuDetalleAccionesPerfilOpcion);		
		this.jmenuBarDetallePerfilOpcion.add(this.jmenuDetalleDatosPerfilOpcion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePerfilOpcion);				
	}
	
	
	public void inicializarElementosCamposPerfilOpcion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPerfilOpcion = new JLabelMe();
		jLabelIdPerfilOpcion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPerfilOpcion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPerfilOpcion= new GridBagLayout();

		this.jPanelidPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);

		jLabelidPerfilOpcion = new JLabel();
		jLabelidPerfilOpcion.setText("Id");

		jLabelidPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeltodoPerfilOpcion = new JLabelMe();
		this.jLabeltodoPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_TODO+" : *");
		this.jLabeltodoPerfilOpcion.setToolTipText("Todo");
		this.jLabeltodoPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltodoPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltodoPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltodoPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltodoPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltodoPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_TODO);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPaneltodoPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxtodoPerfilOpcion= new JCheckBoxMe();
		jCheckBoxtodoPerfilOpcion.setEnabled(false);

		jCheckBoxtodoPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxtodoPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxtodoPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxtodoPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontodoPerfilOpcionBusqueda= new JButtonMe();
		this.jButtontodoPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontodoPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontodoPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontodoPerfilOpcionBusqueda.setText("U");
		this.jButtontodoPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontodoPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontodoPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxtodoPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxtodoPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"todoPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontodoPerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabelingresoPerfilOpcion = new JLabelMe();
		this.jLabelingresoPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_INGRESO+" : *");
		this.jLabelingresoPerfilOpcion.setToolTipText("Ingreso");
		this.jLabelingresoPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingresoPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelingresoPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelingresoPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelingresoPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelingresoPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_INGRESO);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelingresoPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxingresoPerfilOpcion= new JCheckBoxMe();
		jCheckBoxingresoPerfilOpcion.setEnabled(false);

		jCheckBoxingresoPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxingresoPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxingresoPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxingresoPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoningresoPerfilOpcionBusqueda= new JButtonMe();
		this.jButtoningresoPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningresoPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoningresoPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoningresoPerfilOpcionBusqueda.setText("U");
		this.jButtoningresoPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoningresoPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoningresoPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxingresoPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxingresoPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ingresoPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoningresoPerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabelmodificacionPerfilOpcion = new JLabelMe();
		this.jLabelmodificacionPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_MODIFICACION+" : *");
		this.jLabelmodificacionPerfilOpcion.setToolTipText("Modificacion");
		this.jLabelmodificacionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmodificacionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmodificacionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmodificacionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmodificacionPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmodificacionPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_MODIFICACION);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelmodificacionPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxmodificacionPerfilOpcion= new JCheckBoxMe();
		jCheckBoxmodificacionPerfilOpcion.setEnabled(false);

		jCheckBoxmodificacionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxmodificacionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxmodificacionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxmodificacionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonmodificacionPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonmodificacionPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmodificacionPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmodificacionPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmodificacionPerfilOpcionBusqueda.setText("U");
		this.jButtonmodificacionPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmodificacionPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmodificacionPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxmodificacionPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxmodificacionPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"modificacionPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmodificacionPerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabeleliminacionPerfilOpcion = new JLabelMe();
		this.jLabeleliminacionPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_ELIMINACION+" : *");
		this.jLabeleliminacionPerfilOpcion.setToolTipText("Eliminacion");
		this.jLabeleliminacionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeleliminacionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeleliminacionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeleliminacionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneleliminacionPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneleliminacionPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_ELIMINACION);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPaneleliminacionPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxeliminacionPerfilOpcion= new JCheckBoxMe();
		jCheckBoxeliminacionPerfilOpcion.setEnabled(false);

		jCheckBoxeliminacionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxeliminacionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxeliminacionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxeliminacionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoneliminacionPerfilOpcionBusqueda= new JButtonMe();
		this.jButtoneliminacionPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoneliminacionPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoneliminacionPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoneliminacionPerfilOpcionBusqueda.setText("U");
		this.jButtoneliminacionPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoneliminacionPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoneliminacionPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxeliminacionPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxeliminacionPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"eliminacionPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoneliminacionPerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabelguardar_cambiosPerfilOpcion = new JLabelMe();
		this.jLabelguardar_cambiosPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS+" : *");
		this.jLabelguardar_cambiosPerfilOpcion.setToolTipText("Guardar Cambios");
		this.jLabelguardar_cambiosPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelguardar_cambiosPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelguardar_cambiosPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelguardar_cambiosPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelguardar_cambiosPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelguardar_cambiosPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelguardar_cambiosPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxguardar_cambiosPerfilOpcion= new JCheckBoxMe();
		jCheckBoxguardar_cambiosPerfilOpcion.setEnabled(false);

		jCheckBoxguardar_cambiosPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxguardar_cambiosPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxguardar_cambiosPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxguardar_cambiosPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonguardar_cambiosPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonguardar_cambiosPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonguardar_cambiosPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonguardar_cambiosPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonguardar_cambiosPerfilOpcionBusqueda.setText("U");
		this.jButtonguardar_cambiosPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonguardar_cambiosPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonguardar_cambiosPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxguardar_cambiosPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxguardar_cambiosPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"guardar_cambiosPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonguardar_cambiosPerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabelconsultaPerfilOpcion = new JLabelMe();
		this.jLabelconsultaPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_CONSULTA+" : *");
		this.jLabelconsultaPerfilOpcion.setToolTipText("Consulta");
		this.jLabelconsultaPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelconsultaPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelconsultaPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelconsultaPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelconsultaPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelconsultaPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_CONSULTA);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelconsultaPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxconsultaPerfilOpcion= new JCheckBoxMe();
		jCheckBoxconsultaPerfilOpcion.setEnabled(false);

		jCheckBoxconsultaPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxconsultaPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxconsultaPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxconsultaPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonconsultaPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonconsultaPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonconsultaPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonconsultaPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonconsultaPerfilOpcionBusqueda.setText("U");
		this.jButtonconsultaPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonconsultaPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonconsultaPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxconsultaPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxconsultaPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"consultaPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonconsultaPerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabelbusquedaPerfilOpcion = new JLabelMe();
		this.jLabelbusquedaPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA+" : *");
		this.jLabelbusquedaPerfilOpcion.setToolTipText("Busqueda");
		this.jLabelbusquedaPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbusquedaPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbusquedaPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbusquedaPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbusquedaPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbusquedaPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelbusquedaPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxbusquedaPerfilOpcion= new JCheckBoxMe();
		jCheckBoxbusquedaPerfilOpcion.setEnabled(false);

		jCheckBoxbusquedaPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxbusquedaPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxbusquedaPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxbusquedaPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonbusquedaPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonbusquedaPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbusquedaPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbusquedaPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbusquedaPerfilOpcionBusqueda.setText("U");
		this.jButtonbusquedaPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbusquedaPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbusquedaPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxbusquedaPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxbusquedaPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"busquedaPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbusquedaPerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabelreportePerfilOpcion = new JLabelMe();
		this.jLabelreportePerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_REPORTE+" : *");
		this.jLabelreportePerfilOpcion.setToolTipText("Reporte");
		this.jLabelreportePerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreportePerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreportePerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelreportePerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelreportePerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelreportePerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_REPORTE);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelreportePerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxreportePerfilOpcion= new JCheckBoxMe();
		jCheckBoxreportePerfilOpcion.setEnabled(false);

		jCheckBoxreportePerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxreportePerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxreportePerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxreportePerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonreportePerfilOpcionBusqueda= new JButtonMe();
		this.jButtonreportePerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreportePerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreportePerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonreportePerfilOpcionBusqueda.setText("U");
		this.jButtonreportePerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonreportePerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonreportePerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxreportePerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxreportePerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"reportePerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonreportePerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabelordenPerfilOpcion = new JLabelMe();
		this.jLabelordenPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenPerfilOpcion.setToolTipText("Orden");
		this.jLabelordenPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelordenPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxordenPerfilOpcion= new JCheckBoxMe();
		jCheckBoxordenPerfilOpcion.setEnabled(false);

		jCheckBoxordenPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxordenPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxordenPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxordenPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonordenPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonordenPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenPerfilOpcionBusqueda.setText("U");
		this.jButtonordenPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxordenPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxordenPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenPerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabelpaginacion_medioPerfilOpcion = new JLabelMe();
		this.jLabelpaginacion_medioPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO+" : *");
		this.jLabelpaginacion_medioPerfilOpcion.setToolTipText("Paginacion Medio");
		this.jLabelpaginacion_medioPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpaginacion_medioPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpaginacion_medioPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpaginacion_medioPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpaginacion_medioPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpaginacion_medioPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelpaginacion_medioPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxpaginacion_medioPerfilOpcion= new JCheckBoxMe();
		jCheckBoxpaginacion_medioPerfilOpcion.setEnabled(false);

		jCheckBoxpaginacion_medioPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpaginacion_medioPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpaginacion_medioPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpaginacion_medioPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpaginacion_medioPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonpaginacion_medioPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpaginacion_medioPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpaginacion_medioPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpaginacion_medioPerfilOpcionBusqueda.setText("U");
		this.jButtonpaginacion_medioPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpaginacion_medioPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpaginacion_medioPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpaginacion_medioPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpaginacion_medioPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"paginacion_medioPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpaginacion_medioPerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabelpaginacion_altoPerfilOpcion = new JLabelMe();
		this.jLabelpaginacion_altoPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO+" : *");
		this.jLabelpaginacion_altoPerfilOpcion.setToolTipText("Paginacion Alto");
		this.jLabelpaginacion_altoPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpaginacion_altoPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpaginacion_altoPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpaginacion_altoPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpaginacion_altoPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpaginacion_altoPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelpaginacion_altoPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxpaginacion_altoPerfilOpcion= new JCheckBoxMe();
		jCheckBoxpaginacion_altoPerfilOpcion.setEnabled(false);

		jCheckBoxpaginacion_altoPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpaginacion_altoPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpaginacion_altoPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpaginacion_altoPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpaginacion_altoPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonpaginacion_altoPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpaginacion_altoPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpaginacion_altoPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpaginacion_altoPerfilOpcionBusqueda.setText("U");
		this.jButtonpaginacion_altoPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpaginacion_altoPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpaginacion_altoPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpaginacion_altoPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpaginacion_altoPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"paginacion_altoPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpaginacion_altoPerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabelpaginacion_todoPerfilOpcion = new JLabelMe();
		this.jLabelpaginacion_todoPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO+" : *");
		this.jLabelpaginacion_todoPerfilOpcion.setToolTipText("Paginacion Todo");
		this.jLabelpaginacion_todoPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpaginacion_todoPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpaginacion_todoPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpaginacion_todoPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpaginacion_todoPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpaginacion_todoPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelpaginacion_todoPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxpaginacion_todoPerfilOpcion= new JCheckBoxMe();
		jCheckBoxpaginacion_todoPerfilOpcion.setEnabled(false);

		jCheckBoxpaginacion_todoPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpaginacion_todoPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpaginacion_todoPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpaginacion_todoPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpaginacion_todoPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonpaginacion_todoPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpaginacion_todoPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpaginacion_todoPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpaginacion_todoPerfilOpcionBusqueda.setText("U");
		this.jButtonpaginacion_todoPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpaginacion_todoPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpaginacion_todoPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpaginacion_todoPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpaginacion_todoPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"paginacion_todoPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpaginacion_todoPerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabelduplicarPerfilOpcion = new JLabelMe();
		this.jLabelduplicarPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_DUPLICAR+" : *");
		this.jLabelduplicarPerfilOpcion.setToolTipText("Duplicar");
		this.jLabelduplicarPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelduplicarPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelduplicarPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelduplicarPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelduplicarPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelduplicarPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_DUPLICAR);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelduplicarPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxduplicarPerfilOpcion= new JCheckBoxMe();
		jCheckBoxduplicarPerfilOpcion.setEnabled(false);

		jCheckBoxduplicarPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxduplicarPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxduplicarPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxduplicarPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonduplicarPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonduplicarPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonduplicarPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonduplicarPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonduplicarPerfilOpcionBusqueda.setText("U");
		this.jButtonduplicarPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonduplicarPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonduplicarPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxduplicarPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxduplicarPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"duplicarPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonduplicarPerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabelcopiarPerfilOpcion = new JLabelMe();
		this.jLabelcopiarPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_COPIAR+" : *");
		this.jLabelcopiarPerfilOpcion.setToolTipText("Copiar");
		this.jLabelcopiarPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcopiarPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcopiarPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcopiarPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcopiarPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcopiarPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_COPIAR);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelcopiarPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxcopiarPerfilOpcion= new JCheckBoxMe();
		jCheckBoxcopiarPerfilOpcion.setEnabled(false);

		jCheckBoxcopiarPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcopiarPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcopiarPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcopiarPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncopiarPerfilOpcionBusqueda= new JButtonMe();
		this.jButtoncopiarPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncopiarPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncopiarPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncopiarPerfilOpcionBusqueda.setText("U");
		this.jButtoncopiarPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncopiarPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncopiarPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcopiarPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcopiarPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"copiarPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncopiarPerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabelcon_precargarPerfilOpcion = new JLabelMe();
		this.jLabelcon_precargarPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR+" : *");
		this.jLabelcon_precargarPerfilOpcion.setToolTipText("Precargar");
		this.jLabelcon_precargarPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_precargarPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_precargarPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_precargarPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_precargarPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_precargarPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelcon_precargarPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxcon_precargarPerfilOpcion= new JCheckBoxMe();
		jCheckBoxcon_precargarPerfilOpcion.setEnabled(false);

		jCheckBoxcon_precargarPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precargarPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precargarPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_precargarPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_precargarPerfilOpcionBusqueda= new JButtonMe();
		this.jButtoncon_precargarPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precargarPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precargarPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_precargarPerfilOpcionBusqueda.setText("U");
		this.jButtoncon_precargarPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_precargarPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_precargarPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_precargarPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_precargarPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_precargarPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_precargarPerfilOpcionBusqueda.setVisible(false);		}


					
		this.jLabelestadoPerfilOpcion = new JLabelMe();
		this.jLabelestadoPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoPerfilOpcion.setToolTipText("Estado");
		this.jLabelestadoPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelestadoPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jCheckBoxestadoPerfilOpcion= new JCheckBoxMe();
		jCheckBoxestadoPerfilOpcion.setEnabled(false);

		jCheckBoxestadoPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxestadoPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestadoPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonestadoPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoPerfilOpcionBusqueda.setText("U");
		this.jButtonestadoPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxestadoPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxestadoPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoPerfilOpcionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPerfilOpcion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_sistemaPerfilOpcion = new JLabelMe();
		this.jLabelid_sistemaPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA+" : *");
		this.jLabelid_sistemaPerfilOpcion.setToolTipText("Sistema");
		this.jLabelid_sistemaPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sistemaPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sistemaPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sistemaPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sistemaPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelid_sistemaPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jComboBoxid_sistemaPerfilOpcion= new JComboBoxMe();
		jComboBoxid_sistemaPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sistemaPerfilOpcion= new JButtonMe();
		this.jButtonid_sistemaPerfilOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaPerfilOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaPerfilOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaPerfilOpcion.setText("Buscar");
		this.jButtonid_sistemaPerfilOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sistemaPerfilOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaPerfilOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sistemaPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaPerfilOpcion"));

		this.jButtonid_sistemaPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonid_sistemaPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sistemaPerfilOpcionBusqueda.setText("U");
		this.jButtonid_sistemaPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sistemaPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sistemaPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sistemaPerfilOpcionBusqueda.setVisible(false);		}

		this.jButtonid_sistemaPerfilOpcionUpdate= new JButtonMe();
		this.jButtonid_sistemaPerfilOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaPerfilOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaPerfilOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sistemaPerfilOpcionUpdate.setText("U");
		this.jButtonid_sistemaPerfilOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sistemaPerfilOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaPerfilOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sistemaPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaPerfilOpcionUpdate"));



					
		this.jLabelid_moduloPerfilOpcion = new JLabelMe();
		this.jLabelid_moduloPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloPerfilOpcion.setToolTipText("Modulo");
		this.jLabelid_moduloPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelid_moduloPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jComboBoxid_moduloPerfilOpcion= new JComboBoxMe();
		jComboBoxid_moduloPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moduloPerfilOpcion= new JButtonMe();
		this.jButtonid_moduloPerfilOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloPerfilOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloPerfilOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloPerfilOpcion.setText("Buscar");
		this.jButtonid_moduloPerfilOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloPerfilOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloPerfilOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloPerfilOpcion"));

		this.jButtonid_moduloPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonid_moduloPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloPerfilOpcionBusqueda.setText("U");
		this.jButtonid_moduloPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloPerfilOpcionBusqueda.setVisible(false);		}

		this.jButtonid_moduloPerfilOpcionUpdate= new JButtonMe();
		this.jButtonid_moduloPerfilOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloPerfilOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloPerfilOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloPerfilOpcionUpdate.setText("U");
		this.jButtonid_moduloPerfilOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloPerfilOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloPerfilOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloPerfilOpcionUpdate"));



					
		this.jLabelid_grupo_opcionPerfilOpcion = new JLabelMe();
		this.jLabelid_grupo_opcionPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION+" : *");
		this.jLabelid_grupo_opcionPerfilOpcion.setToolTipText("Grupo Opcion");
		this.jLabelid_grupo_opcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_opcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_opcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_opcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_opcionPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_opcionPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelid_grupo_opcionPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jComboBoxid_grupo_opcionPerfilOpcion= new JComboBoxMe();
		jComboBoxid_grupo_opcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_opcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_opcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_opcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_opcionPerfilOpcion= new JButtonMe();
		this.jButtonid_grupo_opcionPerfilOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_opcionPerfilOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_opcionPerfilOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_opcionPerfilOpcion.setText("Buscar");
		this.jButtonid_grupo_opcionPerfilOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_opcionPerfilOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_opcionPerfilOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_opcionPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_opcionPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_opcionPerfilOpcion"));

		this.jButtonid_grupo_opcionPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonid_grupo_opcionPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_opcionPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_opcionPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_opcionPerfilOpcionBusqueda.setText("U");
		this.jButtonid_grupo_opcionPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_opcionPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_opcionPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_opcionPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_opcionPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_opcionPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_opcionPerfilOpcionBusqueda.setVisible(false);		}

		this.jButtonid_grupo_opcionPerfilOpcionUpdate= new JButtonMe();
		this.jButtonid_grupo_opcionPerfilOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_opcionPerfilOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_opcionPerfilOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_opcionPerfilOpcionUpdate.setText("U");
		this.jButtonid_grupo_opcionPerfilOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_opcionPerfilOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_opcionPerfilOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_opcionPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_opcionPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_opcionPerfilOpcionUpdate"));



					
		this.jLabelid_perfilPerfilOpcion = new JLabelMe();
		this.jLabelid_perfilPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_IDPERFIL+" : *");
		this.jLabelid_perfilPerfilOpcion.setToolTipText("Perfil");
		this.jLabelid_perfilPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_perfilPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_perfilPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_perfilPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_perfilPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_perfilPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_IDPERFIL);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelid_perfilPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jComboBoxid_perfilPerfilOpcion= new JComboBoxMe();
		jComboBoxid_perfilPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_perfilPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_perfilPerfilOpcion= new JButtonMe();
		this.jButtonid_perfilPerfilOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilPerfilOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilPerfilOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_perfilPerfilOpcion.setText("Buscar");
		this.jButtonid_perfilPerfilOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_perfilPerfilOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilPerfilOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_perfilPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilPerfilOpcion"));

		this.jButtonid_perfilPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonid_perfilPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_perfilPerfilOpcionBusqueda.setText("U");
		this.jButtonid_perfilPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_perfilPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_perfilPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_perfilPerfilOpcionBusqueda.setVisible(false);		}

		this.jButtonid_perfilPerfilOpcionUpdate= new JButtonMe();
		this.jButtonid_perfilPerfilOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_perfilPerfilOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_perfilPerfilOpcionUpdate.setText("U");
		this.jButtonid_perfilPerfilOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_perfilPerfilOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_perfilPerfilOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_perfilPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_perfilPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_perfilPerfilOpcionUpdate"));



					
		this.jLabelid_opcionPerfilOpcion = new JLabelMe();
		this.jLabelid_opcionPerfilOpcion.setText(""+PerfilOpcionConstantesFunciones.LABEL_IDOPCION+" : *");
		this.jLabelid_opcionPerfilOpcion.setToolTipText("Opcion");
		this.jLabelid_opcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_opcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_opcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_opcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_opcionPerfilOpcion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_opcionPerfilOpcion.setToolTipText(PerfilOpcionConstantesFunciones.LABEL_IDOPCION);
		this.gridaBagLayoutPerfilOpcion = new GridBagLayout();
		this.jPanelid_opcionPerfilOpcion.setLayout(this.gridaBagLayoutPerfilOpcion);


		jComboBoxid_opcionPerfilOpcion= new JComboBoxMe();
		jComboBoxid_opcionPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_opcionPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_opcionPerfilOpcion= new JButtonMe();
		this.jButtonid_opcionPerfilOpcion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionPerfilOpcion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionPerfilOpcion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionPerfilOpcion.setText("Buscar");
		this.jButtonid_opcionPerfilOpcion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_opcionPerfilOpcion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionPerfilOpcion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_opcionPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionPerfilOpcion"));

		this.jButtonid_opcionPerfilOpcionBusqueda= new JButtonMe();
		this.jButtonid_opcionPerfilOpcionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionPerfilOpcionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionPerfilOpcionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_opcionPerfilOpcionBusqueda.setText("U");
		this.jButtonid_opcionPerfilOpcionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_opcionPerfilOpcionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionPerfilOpcionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_opcionPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionPerfilOpcionBusqueda"));

		if(this.perfilopcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_opcionPerfilOpcionBusqueda.setVisible(false);		}

		this.jButtonid_opcionPerfilOpcionUpdate= new JButtonMe();
		this.jButtonid_opcionPerfilOpcionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionPerfilOpcionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionPerfilOpcionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_opcionPerfilOpcionUpdate.setText("U");
		this.jButtonid_opcionPerfilOpcionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_opcionPerfilOpcionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionPerfilOpcionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_opcionPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionPerfilOpcionUpdate"));


		jButtonid_opcionPerfilOpcionArbol= new JButtonMe();
		jButtonid_opcionPerfilOpcionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionPerfilOpcionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionPerfilOpcionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionPerfilOpcionArbol.setText("Arbol");
		jButtonid_opcionPerfilOpcionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_opcionPerfilOpcionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionPerfilOpcionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_opcionPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionPerfilOpcionArbol"));



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
		//this.jInternalFrameDetallePerfilOpcion = new PerfilOpcionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Perfil Opcion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPerfilOpcion= new GridBagLayout();
		

		
		String sToolTipPerfilOpcion="";
		sToolTipPerfilOpcion=PerfilOpcionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPerfilOpcion+="(Seguridad.PerfilOpcion)";
		}
		
		if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
			sToolTipPerfilOpcion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPerfilOpcion = new JButtonMe();
		this.jButtonModificarPerfilOpcion = new JButtonMe();
        this.jButtonActualizarPerfilOpcion = new JButtonMe();
        this.jButtonEliminarPerfilOpcion = new JButtonMe();
        this.jButtonCancelarPerfilOpcion = new JButtonMe();
        this.jButtonGuardarCambiosPerfilOpcion = new JButtonMe();
		this.jButtonGuardarCambiosTablaPerfilOpcion = new JButtonMe();
		this.jButtonCerrarPerfilOpcion = new JButtonMe();
		
		this.jScrollPanelDatosPerfilOpcion = new JScrollPane();   
        this.jScrollPanelDatosEdicionPerfilOpcion = new JScrollPane();
		this.jScrollPanelDatosGeneralPerfilOpcion = new JScrollPane();
				
		
		
		this.jPanelCamposPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciopermisoPerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Perfil Opcion";
		
		if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Opciones" + this.sPath));
		} else {
			this.jScrollPanelDatosPerfilOpcion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPerfilOpcion.setName("jPanelCamposPerfilOpcion"); 

		this.jPanelCamposOcultosPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPerfilOpcion.setName("jPanelCamposOcultosPerfilOpcion"); 

        this.jPanelAccionesPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPerfilOpcion.setToolTipText("Acciones");
        this.jPanelAccionesPerfilOpcion.setName("Acciones"); 

		this.jPanelAccionesFormularioPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPerfilOpcion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPerfilOpcion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralPerfilOpcion.setName("jPanelCamposFingeneralPerfilOpcion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciopermisoPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Permiso"));
		this.jPanelCamposIniciopermisoPerfilOpcion.setName("jPanelCamposFinpermisoPerfilOpcion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciopermisoPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPerfilOpcion.setText("Nuevo");
		this.jButtonModificarPerfilOpcion.setText("Editar");
        this.jButtonActualizarPerfilOpcion.setText("Actualizar");
        this.jButtonEliminarPerfilOpcion.setText("Eliminar");
        this.jButtonCancelarPerfilOpcion.setText("Cancelar");
        this.jButtonGuardarCambiosPerfilOpcion.setText("Guardar");
		this.jButtonGuardarCambiosTablaPerfilOpcion.setText("Guardar");
		this.jButtonCerrarPerfilOpcion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPerfilOpcion,"nuevo_button","Nuevo",this.perfilopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPerfilOpcion,"modificar_button","Editar",this.perfilopcionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPerfilOpcion,"actualizar_button","Actualizar",this.perfilopcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPerfilOpcion,"eliminar_button","Eliminar",this.perfilopcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPerfilOpcion,"cancelar_button","Cancelar",this.perfilopcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPerfilOpcion,"guardarcambios_button","Guardar",this.perfilopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPerfilOpcion,"guardarcambiostabla_button","Guardar",this.perfilopcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPerfilOpcion,"cerrar_button","Salir",this.perfilopcionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPerfilOpcion.setToolTipText("Nuevo"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPerfilOpcion.setToolTipText("Editar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPerfilOpcion.setToolTipText("Actualizar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPerfilOpcion.setToolTipText("Eliminar)"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPerfilOpcion.setToolTipText("Cancelar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPerfilOpcion.setToolTipText("Guardar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPerfilOpcion.setToolTipText("Guardar"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPerfilOpcion.setToolTipText("Salir"+" "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPerfilOpcion";
		inputMap = this.jButtonNuevoPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPerfilOpcion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPerfilOpcion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPerfilOpcion";
		inputMap = this.jButtonActualizarPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPerfilOpcion"));
		
		//ELIMINAR
		sMapKey = "EliminarPerfilOpcion";
		inputMap = this.jButtonEliminarPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPerfilOpcion"));
		
		//CANCELAR	
		sMapKey = "CancelarPerfilOpcion";
		inputMap = this.jButtonCancelarPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPerfilOpcion"));
		
		//CERRAR		
		sMapKey = "CerrarPerfilOpcion";
		inputMap = this.jButtonCerrarPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPerfilOpcion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPerfilOpcion";
		inputMap = this.jButtonGuardarCambiosTablaPerfilOpcion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPerfilOpcion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPerfilOpcion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPerfilOpcion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPerfilOpcion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPerfilOpcion.setToolTipText("Nuevo PerfilOpcion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPerfilOpcion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPerfilOpcion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPerfilOpcion.setToolTipText("Sin Cerrar Ventana PerfilOpcion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePerfilOpcion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePerfilOpcion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePerfilOpcion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPerfilOpcion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPerfilOpcion.setText("Accion");
		this.jComboBoxTiposAccionesPerfilOpcion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPerfilOpcion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPerfilOpcion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPerfilOpcion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPerfilOpcion = new JLabelMe();
		
		this.jLabelAccionesPerfilOpcion.setText("Acciones");		
		this.jLabelAccionesPerfilOpcion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilOpcion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilOpcion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPerfilOpcion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPerfilOpcion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPerfilOpcion=new JTabbedPane();
		this.jTabbedPaneRelacionesPerfilOpcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPerfilOpcion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPerfilOpcion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilOpcion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilOpcion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPerfilOpcion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPerfilOpcion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPerfilOpcion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPerfilOpcion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPerfilOpcion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPerfilOpcion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPerfilOpcion = new GridBagLayout();
		
		this.jPanelCamposPerfilOpcion.setLayout(gridaBagLayoutCamposPerfilOpcion);
		this.jPanelCamposOcultosPerfilOpcion.setLayout(gridaBagLayoutCamposOcultosPerfilOpcion);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralPerfilOpcion= new GridBagLayout();
		this.jPanelCamposIniciogeneralPerfilOpcion.setLayout(gridaBagLayoutCamposIniciogeneralPerfilOpcion);

		GridBagLayout gridaBagLayoutCamposIniciopermisoPerfilOpcion= new GridBagLayout();
		this.jPanelCamposIniciopermisoPerfilOpcion.setLayout(gridaBagLayoutCamposIniciopermisoPerfilOpcion);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPerfilOpcion.add(jLabelIdPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPerfilOpcion.add(jLabelidPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sistemaPerfilOpcion.add(jLabelid_sistemaPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sistemaPerfilOpcion.add(jButtonid_sistemaPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 3;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sistemaPerfilOpcion.add(jButtonid_sistemaPerfilOpcionUpdate, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sistemaPerfilOpcion.add(jComboBoxid_sistemaPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloPerfilOpcion.add(jLabelid_moduloPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloPerfilOpcion.add(jButtonid_moduloPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 3;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloPerfilOpcion.add(jButtonid_moduloPerfilOpcionUpdate, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloPerfilOpcion.add(jComboBoxid_moduloPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_opcionPerfilOpcion.add(jLabelid_grupo_opcionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_opcionPerfilOpcion.add(jButtonid_grupo_opcionPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 3;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_opcionPerfilOpcion.add(jButtonid_grupo_opcionPerfilOpcionUpdate, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_opcionPerfilOpcion.add(jComboBoxid_grupo_opcionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_perfilPerfilOpcion.add(jLabelid_perfilPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_perfilPerfilOpcion.add(jButtonid_perfilPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 3;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_perfilPerfilOpcion.add(jButtonid_perfilPerfilOpcionUpdate, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_perfilPerfilOpcion.add(jComboBoxid_perfilPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_opcionPerfilOpcion.add(jLabelid_opcionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 2;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_opcionPerfilOpcion.add(jButtonid_opcionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 3;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_opcionPerfilOpcion.add(jButtonid_opcionPerfilOpcionArbol, this.gridBagConstraintsPerfilOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 4;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_opcionPerfilOpcion.add(jButtonid_opcionPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 5;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_opcionPerfilOpcion.add(jButtonid_opcionPerfilOpcionUpdate, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_opcionPerfilOpcion.add(jComboBoxid_opcionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltodoPerfilOpcion.add(jLabeltodoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPaneltodoPerfilOpcion.add(jButtontodoPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltodoPerfilOpcion.add(jCheckBoxtodoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelingresoPerfilOpcion.add(jLabelingresoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelingresoPerfilOpcion.add(jButtoningresoPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelingresoPerfilOpcion.add(jCheckBoxingresoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmodificacionPerfilOpcion.add(jLabelmodificacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelmodificacionPerfilOpcion.add(jButtonmodificacionPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmodificacionPerfilOpcion.add(jCheckBoxmodificacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneleliminacionPerfilOpcion.add(jLabeleliminacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPaneleliminacionPerfilOpcion.add(jButtoneliminacionPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneleliminacionPerfilOpcion.add(jCheckBoxeliminacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelguardar_cambiosPerfilOpcion.add(jLabelguardar_cambiosPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelguardar_cambiosPerfilOpcion.add(jButtonguardar_cambiosPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelguardar_cambiosPerfilOpcion.add(jCheckBoxguardar_cambiosPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelconsultaPerfilOpcion.add(jLabelconsultaPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelconsultaPerfilOpcion.add(jButtonconsultaPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelconsultaPerfilOpcion.add(jCheckBoxconsultaPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbusquedaPerfilOpcion.add(jLabelbusquedaPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelbusquedaPerfilOpcion.add(jButtonbusquedaPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbusquedaPerfilOpcion.add(jCheckBoxbusquedaPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelreportePerfilOpcion.add(jLabelreportePerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelreportePerfilOpcion.add(jButtonreportePerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelreportePerfilOpcion.add(jCheckBoxreportePerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenPerfilOpcion.add(jLabelordenPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenPerfilOpcion.add(jButtonordenPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenPerfilOpcion.add(jCheckBoxordenPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpaginacion_medioPerfilOpcion.add(jLabelpaginacion_medioPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelpaginacion_medioPerfilOpcion.add(jButtonpaginacion_medioPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpaginacion_medioPerfilOpcion.add(jCheckBoxpaginacion_medioPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpaginacion_altoPerfilOpcion.add(jLabelpaginacion_altoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelpaginacion_altoPerfilOpcion.add(jButtonpaginacion_altoPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpaginacion_altoPerfilOpcion.add(jCheckBoxpaginacion_altoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpaginacion_todoPerfilOpcion.add(jLabelpaginacion_todoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelpaginacion_todoPerfilOpcion.add(jButtonpaginacion_todoPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpaginacion_todoPerfilOpcion.add(jCheckBoxpaginacion_todoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelduplicarPerfilOpcion.add(jLabelduplicarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelduplicarPerfilOpcion.add(jButtonduplicarPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelduplicarPerfilOpcion.add(jCheckBoxduplicarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcopiarPerfilOpcion.add(jLabelcopiarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcopiarPerfilOpcion.add(jButtoncopiarPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcopiarPerfilOpcion.add(jCheckBoxcopiarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_precargarPerfilOpcion.add(jLabelcon_precargarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_precargarPerfilOpcion.add(jButtoncon_precargarPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_precargarPerfilOpcion.add(jCheckBoxcon_precargarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 0;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoPerfilOpcion.add(jLabelestadoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		//this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = 2;
		this.gridBagConstraintsPerfilOpcion.ipadx = 0;
		this.gridBagConstraintsPerfilOpcion.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoPerfilOpcion.add(jButtonestadoPerfilOpcionBusqueda, this.gridBagConstraintsPerfilOpcion);
	}

	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPerfilOpcion.gridy = 0;
	this.gridBagConstraintsPerfilOpcion.gridx = 1;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoPerfilOpcion.add(jCheckBoxestadoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciogeneralPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciogeneralPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPerfilOpcion.add(this.jPanelidPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciogeneralPerfilOpcion % 2==0) {
		iXPanelCamposIniciogeneralPerfilOpcion=0;
		iYPanelCamposIniciogeneralPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciogeneralPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciogeneralPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPerfilOpcion.add(this.jPanelid_sistemaPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciogeneralPerfilOpcion % 2==0) {
		iXPanelCamposIniciogeneralPerfilOpcion=0;
		iYPanelCamposIniciogeneralPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciogeneralPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciogeneralPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPerfilOpcion.add(this.jPanelid_moduloPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciogeneralPerfilOpcion % 2==0) {
		iXPanelCamposIniciogeneralPerfilOpcion=0;
		iYPanelCamposIniciogeneralPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciogeneralPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciogeneralPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPerfilOpcion.add(this.jPanelid_grupo_opcionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciogeneralPerfilOpcion % 2==0) {
		iXPanelCamposIniciogeneralPerfilOpcion=0;
		iYPanelCamposIniciogeneralPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciogeneralPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciogeneralPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPerfilOpcion.add(this.jPanelid_perfilPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciogeneralPerfilOpcion % 2==0) {
		iXPanelCamposIniciogeneralPerfilOpcion=0;
		iYPanelCamposIniciogeneralPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciogeneralPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciogeneralPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralPerfilOpcion.add(this.jPanelid_opcionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciogeneralPerfilOpcion % 2==0) {
		iXPanelCamposIniciogeneralPerfilOpcion=0;
		iYPanelCamposIniciogeneralPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPaneltodoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPanelingresoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPanelmodificacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPaneleliminacionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPanelguardar_cambiosPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPanelconsultaPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPanelbusquedaPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPanelreportePerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPanelordenPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPanelpaginacion_medioPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPanelpaginacion_altoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPanelpaginacion_todoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPanelduplicarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPanelcopiarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPanelcon_precargarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
	this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPerfilOpcion.gridy = iYPanelCamposIniciopermisoPerfilOpcion;
	this.gridBagConstraintsPerfilOpcion.gridx = iXPanelCamposIniciopermisoPerfilOpcion++;
	this.gridBagConstraintsPerfilOpcion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPerfilOpcion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopermisoPerfilOpcion.add(this.jPanelestadoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);



	if(iXPanelCamposIniciopermisoPerfilOpcion % 2==0) {
		iXPanelCamposIniciopermisoPerfilOpcion=0;
		iYPanelCamposIniciopermisoPerfilOpcion++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesPerfilOpcion= new GridBagLayout();
		this.jPanelAccionesPerfilOpcion.setLayout(gridaBagLayoutAccionesPerfilOpcion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPerfilOpcion= new GridBagLayout();
		this.jPanelAccionesFormularioPerfilOpcion.setLayout(gridaBagLayoutAccionesFormularioPerfilOpcion);
		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPerfilOpcion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPerfilOpcion.add(this.jComboBoxTiposAccionesFormularioPerfilOpcion, this.gridBagConstraintsPerfilOpcion);

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPerfilOpcion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPerfilOpcion.add(this.jCheckBoxPostAccionNuevoPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.perfilopcionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPerfilOpcion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPerfilOpcion.add(this.jCheckBoxPostAccionSinCerrarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.perfilopcionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPerfilOpcion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPerfilOpcion.add(this.jCheckBoxPostAccionSinMensajePerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXAccion++;
			
		this.jPanelAccionesPerfilOpcion.add(this.jButtonModificarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);							

		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilOpcion.gridy = 0;
		this.gridBagConstraintsPerfilOpcion.gridx =iPosXAccion++;
			
		this.jPanelAccionesPerfilOpcion.add(this.jButtonEliminarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		
			
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy = 0;		
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXAccion++;
		
		this.jPanelAccionesPerfilOpcion.add(this.jButtonActualizarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);


		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy = 0;		
		this.gridBagConstraintsPerfilOpcion.gridx = iPosXAccion++;
		
		this.jPanelAccionesPerfilOpcion.add(this.jButtonGuardarCambiosPerfilOpcion, this.gridBagConstraintsPerfilOpcion);	
		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy = 0;		
		this.gridBagConstraintsPerfilOpcion.gridx =iPosXAccion++;
		
		this.jPanelAccionesPerfilOpcion.add(this.jButtonCancelarPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPerfilOpcion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPerfilOpcion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.perfilopcionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();						
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfilOpcion.gridx = 0;		
			//this.gridBagConstraintsPerfilOpcion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPerfilOpcion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPerfilOpcion.gridx =0;
		this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPerfilOpcion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PerfilOpcionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePerfilOpcion = new PerfilOpcionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Perfil Opcion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Perfil Opcion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Perfil Opcion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PerfilOpcionModel perfilopcionModel=new PerfilOpcionModel(this);
			
			//SI USARA CLASE INTERNA
			//PerfilOpcionModel.PerfilOpcionFocusTraversalPolicy perfilopcionFocusTraversalPolicy = perfilopcionModel.new PerfilOpcionFocusTraversalPolicy(this);
			
			//perfilopcionFocusTraversalPolicy.setperfilopcionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(perfilopcionModel);
			
			
			this.jContentPaneDetallePerfilOpcion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePerfilOpcion = new GridBagLayout();	
			this.jContentPaneDetallePerfilOpcion.setLayout(gridaBagLayoutDetallePerfilOpcion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPerfilOpcion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
				this.gridBagConstraintsPerfilOpcion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPerfilOpcion.gridx = 0;
					
				
				this.jContentPaneDetallePerfilOpcion.add(jTtoolBarDetallePerfilOpcion, gridBagConstraintsPerfilOpcion);								
				
}
			
			this.jScrollPanelDatosEdicionPerfilOpcion=   new JScrollPane(jContentPaneDetallePerfilOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPerfilOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPerfilOpcion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPerfilOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsPerfilOpcion.gridy = iGridyRelaciones++;
		this.gridBagConstraintsPerfilOpcion.gridx = 0;

		this.jContentPaneDetallePerfilOpcion.add(jPanelCamposIniciogeneralPerfilOpcion, gridBagConstraintsPerfilOpcion);


		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsPerfilOpcion.gridy = iGridyRelaciones++;
		this.gridBagConstraintsPerfilOpcion.gridx = 0;

		this.jContentPaneDetallePerfilOpcion.add(jPanelCamposIniciopermisoPerfilOpcion, gridBagConstraintsPerfilOpcion);
			
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
						&& perfilopcionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPerfilOpcion= new GridBagConstraints();
						this.gridBagConstraintsPerfilOpcion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPerfilOpcion.gridx = 0;
						this.jContentPaneDetallePerfilOpcion.add(this.jTabbedPaneRelacionesPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPerfilOpcion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPerfilOpcion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
					this.gridBagConstraintsPerfilOpcion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPerfilOpcion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPerfilOpcion.gridx = 0;
					
				
					this.jContentPaneDetallePerfilOpcion.add(jPanelCamposOcultosPerfilOpcion, gridBagConstraintsPerfilOpcion);
				
					this.jPanelCamposOcultosPerfilOpcion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPerfilOpcion.gridx = 0;
	        this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePerfilOpcion.add(this.jPanelAccionesFormularioPerfilOpcion, this.gridBagConstraintsPerfilOpcion);							
			
			
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
	        this.gridBagConstraintsPerfilOpcion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPerfilOpcion.gridx = 0;
	        
			
			this.jContentPaneDetallePerfilOpcion.add(this.jPanelAccionesPerfilOpcion, this.gridBagConstraintsPerfilOpcion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPerfilOpcion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPerfilOpcion=   new JScrollPane(this.jPanelCamposPerfilOpcion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPerfilOpcion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilOpcion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPerfilOpcion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPerfilOpcion.gridx = 0;
			this.gridBagConstraintsPerfilOpcion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPerfilOpcion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPerfilOpcion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPerfilOpcion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPerfilOpcion, this.gridBagConstraintsPerfilOpcion);			
			
			this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
			this.gridBagConstraintsPerfilOpcion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPerfilOpcion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPerfilOpcion, this.gridBagConstraintsPerfilOpcion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
			
			
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilOpcion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		
			
		this.gridBagConstraintsPerfilOpcion = new GridBagConstraints();
		this.gridBagConstraintsPerfilOpcion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPerfilOpcion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPerfilOpcion, this.gridBagConstraintsPerfilOpcion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPerfilOpcion;//jContentPane;
		
		return jScrollPanelDatosEdicionPerfilOpcion;
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
