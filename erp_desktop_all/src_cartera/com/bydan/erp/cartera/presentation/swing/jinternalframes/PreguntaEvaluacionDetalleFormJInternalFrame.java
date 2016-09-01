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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.PreguntaEvaluacionConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class PreguntaEvaluacionDetalleFormJInternalFrame extends PreguntaEvaluacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePreguntaEvaluacion;
	
	protected JMenuBar jmenuBarDetallePreguntaEvaluacion;
	
	protected JMenu jmenuDetallePreguntaEvaluacion;
	protected JMenu jmenuDetalleArchivoPreguntaEvaluacion;
	protected JMenu jmenuDetalleAccionesPreguntaEvaluacion;
	protected JMenu jmenuDetalleDatosPreguntaEvaluacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPreguntaEvaluacion;	
	protected GridBagConstraints gridBagConstraintsPreguntaEvaluacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PreguntaEvaluacionBeanSwingJInternalFrameAdditional jInternalFrameDetallePreguntaEvaluacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public PreguntaEvaluacionSessionBean preguntaevaluacionSessionBean;
	
	

	public DetalleEvaluacionProveedorBeanSwingJInternalFrame detalleevaluacionproveedorBeanSwingJInternalFrame=null;
	public DetalleEvaluacionProveedorBeanSwingJInternalFrame detalleevaluacionproveedorBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleEvaluacionProveedor=false;
	public DetalleEvaluacionProveedorSessionBean detalleevaluacionproveedorSessionBean;

	public SubPreguntaEvaluacionBeanSwingJInternalFrame subpreguntaevaluacionBeanSwingJInternalFrame=null;
	public SubPreguntaEvaluacionBeanSwingJInternalFrame subpreguntaevaluacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSubPreguntaEvaluacion=false;
	public SubPreguntaEvaluacionSessionBean subpreguntaevaluacionSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public PreguntaEvaluacionLogic preguntaevaluacionLogic;
	
	public JScrollPane jScrollPanelDatosPreguntaEvaluacion;
	public JScrollPane jScrollPanelDatosEdicionPreguntaEvaluacion;
	public JScrollPane jScrollPanelDatosGeneralPreguntaEvaluacion;
	
	protected JPanel jPanelCamposPreguntaEvaluacion;    
	protected JPanel jPanelCamposOcultosPreguntaEvaluacion;    	
	protected JPanel jPanelAccionesPreguntaEvaluacion;
	protected JPanel jPanelAccionesFormularioPreguntaEvaluacion;
    
	
	
	protected Integer iXPanelCamposPreguntaEvaluacion=0;
	protected Integer iYPanelCamposPreguntaEvaluacion=0;
	
	protected Integer iXPanelCamposOcultosPreguntaEvaluacion=0;
	protected Integer iYPanelCamposOcultosPreguntaEvaluacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPreguntaEvaluacion;
	public JButton jButtonModificarPreguntaEvaluacion;
	public JButton jButtonActualizarPreguntaEvaluacion;
    public JButton jButtonEliminarPreguntaEvaluacion;
	public JButton jButtonCancelarPreguntaEvaluacion;
    public JButton jButtonGuardarCambiosPreguntaEvaluacion;
	public JButton jButtonGuardarCambiosTablaPreguntaEvaluacion;
	protected JButton jButtonCerrarPreguntaEvaluacion;
	
	
	protected JButton jButtonProcesarInformacionPreguntaEvaluacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPreguntaEvaluacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPreguntaEvaluacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajePreguntaEvaluacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPreguntaEvaluacion;
	protected JButton jButtonModificarToolBarPreguntaEvaluacion;
	protected JButton jButtonActualizarToolBarPreguntaEvaluacion;
    protected JButton jButtonEliminarToolBarPreguntaEvaluacion;
	protected JButton jButtonCancelarToolBarPreguntaEvaluacion;
    protected JButton jButtonGuardarCambiosToolBarPreguntaEvaluacion;
	protected JButton jButtonGuardarCambiosTablaToolBarPreguntaEvaluacion;
	protected JButton jButtonMostrarOcultarTablaToolBarPreguntaEvaluacion;
	protected JButton jButtonCerrarToolBarPreguntaEvaluacion;
	
	protected JButton jButtonProcesarInformacionToolBarPreguntaEvaluacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPreguntaEvaluacion;
	protected JMenuItem jMenuItemModificarPreguntaEvaluacion;
	protected JMenuItem jMenuItemActualizarPreguntaEvaluacion;
    protected JMenuItem jMenuItemEliminarPreguntaEvaluacion;
	protected JMenuItem jMenuItemCancelarPreguntaEvaluacion;
    protected JMenuItem jMenuItemGuardarCambiosPreguntaEvaluacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaPreguntaEvaluacion;
	protected JMenuItem jMenuItemCerrarPreguntaEvaluacion;
	protected JMenuItem jMenuItemDetalleCerrarPreguntaEvaluacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarPreguntaEvaluacion;
	
	protected JMenuItem jMenuItemProcesarInformacionPreguntaEvaluacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPreguntaEvaluacion;
	protected JMenuItem jMenuItemMostrarOcultarPreguntaEvaluacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPreguntaEvaluacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPreguntaEvaluacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPreguntaEvaluacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPreguntaEvaluacion;
	public JLabel jLabelIdPreguntaEvaluacion;
	public JLabel jLabelidPreguntaEvaluacion;
	public JButton jButtonidPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelpreguntaPreguntaEvaluacion;
	public JLabel jLabelpreguntaPreguntaEvaluacion;
	public JTextArea jTextAreapreguntaPreguntaEvaluacion;
	public JScrollPane jscrollPanepreguntaPreguntaEvaluacion;
	public JButton jButtonpreguntaPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelcalificacionPreguntaEvaluacion;
	public JLabel jLabelcalificacionPreguntaEvaluacion;
	public JTextField jTextFieldcalificacionPreguntaEvaluacion;
	public JButton jButtoncalificacionPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelordenPreguntaEvaluacion;
	public JLabel jLabelordenPreguntaEvaluacion;
	public JTextField jTextFieldordenPreguntaEvaluacion;
	public JButton jButtonordenPreguntaEvaluacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPreguntaEvaluacion;
	public JLabel jLabelid_empresaPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPreguntaEvaluacion;
	public JButton jButtonid_empresaPreguntaEvaluacion= new JButtonMe();
	public JButton jButtonid_empresaPreguntaEvaluacionUpdate= new JButtonMe();
	public JButton jButtonid_empresaPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPreguntaEvaluacion;
	public JLabel jLabelid_sucursalPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPreguntaEvaluacion;
	public JButton jButtonid_sucursalPreguntaEvaluacion= new JButtonMe();
	public JButton jButtonid_sucursalPreguntaEvaluacionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPreguntaEvaluacion;
	public JLabel jLabelid_ejercicioPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPreguntaEvaluacion;
	public JButton jButtonid_ejercicioPreguntaEvaluacion= new JButtonMe();
	public JButton jButtonid_ejercicioPreguntaEvaluacionUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPreguntaEvaluacion;
	public JLabel jLabelid_periodoPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPreguntaEvaluacion;
	public JButton jButtonid_periodoPreguntaEvaluacion= new JButtonMe();
	public JButton jButtonid_periodoPreguntaEvaluacionUpdate= new JButtonMe();
	public JButton jButtonid_periodoPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelid_anioPreguntaEvaluacion;
	public JLabel jLabelid_anioPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioPreguntaEvaluacion;
	public JButton jButtonid_anioPreguntaEvaluacion= new JButtonMe();
	public JButton jButtonid_anioPreguntaEvaluacionUpdate= new JButtonMe();
	public JButton jButtonid_anioPreguntaEvaluacionBusqueda= new JButtonMe();

	public JPanel jPanelid_mesPreguntaEvaluacion;
	public JLabel jLabelid_mesPreguntaEvaluacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesPreguntaEvaluacion;
	public JButton jButtonid_mesPreguntaEvaluacion= new JButtonMe();
	public JButton jButtonid_mesPreguntaEvaluacionUpdate= new JButtonMe();
	public JButton jButtonid_mesPreguntaEvaluacionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPreguntaEvaluacion;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PreguntaEvaluacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPreguntaEvaluacion=new JPanel();
				this.jPanelAccionesFormularioPreguntaEvaluacion=new JPanel();
				this.jmenuBarDetallePreguntaEvaluacion=new JMenuBar();
				this.jTtoolBarDetallePreguntaEvaluacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaEvaluacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PreguntaEvaluacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaEvaluacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaEvaluacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PreguntaEvaluacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PreguntaEvaluacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPreguntaEvaluacion() {
		return this.jButtonActualizarToolBarPreguntaEvaluacion;
	}
	
	public JButton getjButtonEliminarToolBarPreguntaEvaluacion() {
		return this.jButtonEliminarToolBarPreguntaEvaluacion;
	}
	
	public JButton getjButtonCancelarToolBarPreguntaEvaluacion() {
		return this.jButtonCancelarToolBarPreguntaEvaluacion;
	}		
	
	public JButton getjButtonProcesarInformacionPreguntaEvaluacion() {
		return this.jButtonProcesarInformacionPreguntaEvaluacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPreguntaEvaluacion)	{
		this.jButtonProcesarInformacionPreguntaEvaluacion = jButtonProcesarInformacionPreguntaEvaluacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPreguntaEvaluacion() {
		return this.jComboBoxTiposAccionesPreguntaEvaluacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPreguntaEvaluacion(
			JComboBox jComboBoxTiposRelacionesPreguntaEvaluacion) {
		this.jComboBoxTiposRelacionesPreguntaEvaluacion = jComboBoxTiposRelacionesPreguntaEvaluacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPreguntaEvaluacion(
			JComboBox jComboBoxTiposAccionesPreguntaEvaluacion) {
		this.jComboBoxTiposAccionesPreguntaEvaluacion = jComboBoxTiposAccionesPreguntaEvaluacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPreguntaEvaluacion() {
		return this.jComboBoxTiposAccionesFormularioPreguntaEvaluacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPreguntaEvaluacion(
			JComboBox jComboBoxTiposAccionesFormularioPreguntaEvaluacion) {
		this.jComboBoxTiposAccionesFormularioPreguntaEvaluacion = jComboBoxTiposAccionesFormularioPreguntaEvaluacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.preguntaevaluacionSessionBean=new PreguntaEvaluacionSessionBean();
		
		this.preguntaevaluacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.preguntaevaluacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.preguntaevaluacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
		//this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PreguntaEvaluacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pregunta Evaluacion MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
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
	
		PreguntaEvaluacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePreguntaEvaluacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPreguntaEvaluacion=new JButtonMe();
				this.jButtonModificarToolBarPreguntaEvaluacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPreguntaEvaluacion,this.jTtoolBarDetallePreguntaEvaluacion,
							"actualizar","actualizar","Actualizar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPreguntaEvaluacion,this.jTtoolBarDetallePreguntaEvaluacion,
							"eliminar","eliminar","Eliminar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPreguntaEvaluacion,this.jTtoolBarDetallePreguntaEvaluacion,
							"cancelar","cancelar","Cancelar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPreguntaEvaluacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPreguntaEvaluacion,this.jTtoolBarDetallePreguntaEvaluacion,
							"guardarcambios","guardarcambios","Guardar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePreguntaEvaluacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePreguntaEvaluacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPreguntaEvaluacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPreguntaEvaluacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPreguntaEvaluacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPreguntaEvaluacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPreguntaEvaluacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPreguntaEvaluacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPreguntaEvaluacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPreguntaEvaluacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPreguntaEvaluacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPreguntaEvaluacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPreguntaEvaluacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPreguntaEvaluacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPreguntaEvaluacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPreguntaEvaluacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPreguntaEvaluacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPreguntaEvaluacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPreguntaEvaluacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPreguntaEvaluacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPreguntaEvaluacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPreguntaEvaluacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPreguntaEvaluacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPreguntaEvaluacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPreguntaEvaluacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPreguntaEvaluacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPreguntaEvaluacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPreguntaEvaluacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPreguntaEvaluacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPreguntaEvaluacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPreguntaEvaluacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPreguntaEvaluacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPreguntaEvaluacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPreguntaEvaluacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPreguntaEvaluacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPreguntaEvaluacion.add(this.jMenuItemDetalleCerrarPreguntaEvaluacion);
		
		this.jmenuDetalleAccionesPreguntaEvaluacion.add(this.jMenuItemActualizarPreguntaEvaluacion);
		this.jmenuDetalleAccionesPreguntaEvaluacion.add(this.jMenuItemEliminarPreguntaEvaluacion);
		this.jmenuDetalleAccionesPreguntaEvaluacion.add(this.jMenuItemCancelarPreguntaEvaluacion);		
		
		//this.jmenuDetalleDatosPreguntaEvaluacion.add(this.jMenuItemDetalleAbrirOrderByPreguntaEvaluacion);				
		this.jmenuDetalleDatosPreguntaEvaluacion.add(this.jMenuItemDetalleMostarOcultarPreguntaEvaluacion);				
				
		//this.jmenuDetalleAccionesPreguntaEvaluacion.add(this.jMenuItemGuardarCambiosPreguntaEvaluacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePreguntaEvaluacion.add(this.jmenuDetalleArchivoPreguntaEvaluacion);		
		this.jmenuBarDetallePreguntaEvaluacion.add(this.jmenuDetalleAccionesPreguntaEvaluacion);		
		this.jmenuBarDetallePreguntaEvaluacion.add(this.jmenuDetalleDatosPreguntaEvaluacion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePreguntaEvaluacion.add(this.jmenuDetallePreguntaEvaluacion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePreguntaEvaluacion);				
	}
	
	
	public void inicializarElementosCamposPreguntaEvaluacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPreguntaEvaluacion = new JLabelMe();
		jLabelIdPreguntaEvaluacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPreguntaEvaluacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPreguntaEvaluacion.setToolTipText(PreguntaEvaluacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPreguntaEvaluacion= new GridBagLayout();

		this.jPanelidPreguntaEvaluacion.setLayout(this.gridaBagLayoutPreguntaEvaluacion);

		jLabelidPreguntaEvaluacion = new JLabel();
		jLabelidPreguntaEvaluacion.setText("Id");

		jLabelidPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelpreguntaPreguntaEvaluacion = new JLabelMe();
		this.jLabelpreguntaPreguntaEvaluacion.setText(""+PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA+" : *");
		this.jLabelpreguntaPreguntaEvaluacion.setToolTipText("Pregunta");
		this.jLabelpreguntaPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpreguntaPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpreguntaPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpreguntaPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpreguntaPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpreguntaPreguntaEvaluacion.setToolTipText(PreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA);
		this.gridaBagLayoutPreguntaEvaluacion = new GridBagLayout();
		this.jPanelpreguntaPreguntaEvaluacion.setLayout(this.gridaBagLayoutPreguntaEvaluacion);


		jTextAreapreguntaPreguntaEvaluacion= new JTextAreaMe();
		jTextAreapreguntaPreguntaEvaluacion.setEnabled(false);
		jTextAreapreguntaPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreguntaPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreguntaPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreguntaPreguntaEvaluacion.setLineWrap(true);
		jTextAreapreguntaPreguntaEvaluacion.setWrapStyleWord(true);
		jTextAreapreguntaPreguntaEvaluacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapreguntaPreguntaEvaluacion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreapreguntaPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepreguntaPreguntaEvaluacion = new JScrollPane(jTextAreapreguntaPreguntaEvaluacion);
		jscrollPanepreguntaPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepreguntaPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepreguntaPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonpreguntaPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonpreguntaPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpreguntaPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpreguntaPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpreguntaPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonpreguntaPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpreguntaPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpreguntaPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapreguntaPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapreguntaPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"preguntaPreguntaEvaluacionBusqueda"));

		if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpreguntaPreguntaEvaluacionBusqueda.setVisible(false);		}


					
		this.jLabelcalificacionPreguntaEvaluacion = new JLabelMe();
		this.jLabelcalificacionPreguntaEvaluacion.setText(""+PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION+" : *");
		this.jLabelcalificacionPreguntaEvaluacion.setToolTipText("Calificacion");
		this.jLabelcalificacionPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalificacionPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcalificacionPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcalificacionPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcalificacionPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcalificacionPreguntaEvaluacion.setToolTipText(PreguntaEvaluacionConstantesFunciones.LABEL_CALIFICACION);
		this.gridaBagLayoutPreguntaEvaluacion = new GridBagLayout();
		this.jPanelcalificacionPreguntaEvaluacion.setLayout(this.gridaBagLayoutPreguntaEvaluacion);


		jTextFieldcalificacionPreguntaEvaluacion= new JTextFieldMe();
		jTextFieldcalificacionPreguntaEvaluacion.setEnabled(false);
		jTextFieldcalificacionPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcalificacionPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcalificacionPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcalificacionPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcalificacionPreguntaEvaluacion.setText("0.0");

		this.jButtoncalificacionPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtoncalificacionPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalificacionPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncalificacionPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncalificacionPreguntaEvaluacionBusqueda.setText("U");
		this.jButtoncalificacionPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncalificacionPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncalificacionPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcalificacionPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcalificacionPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"calificacionPreguntaEvaluacionBusqueda"));

		if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncalificacionPreguntaEvaluacionBusqueda.setVisible(false);		}


					
		this.jLabelordenPreguntaEvaluacion = new JLabelMe();
		this.jLabelordenPreguntaEvaluacion.setText(""+PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenPreguntaEvaluacion.setToolTipText("Orden");
		this.jLabelordenPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenPreguntaEvaluacion.setToolTipText(PreguntaEvaluacionConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutPreguntaEvaluacion = new GridBagLayout();
		this.jPanelordenPreguntaEvaluacion.setLayout(this.gridaBagLayoutPreguntaEvaluacion);


		jTextFieldordenPreguntaEvaluacion= new JTextFieldMe();
		jTextFieldordenPreguntaEvaluacion.setEnabled(false);
		jTextFieldordenPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldordenPreguntaEvaluacion.setText("0");

		this.jButtonordenPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonordenPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonordenPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenPreguntaEvaluacionBusqueda"));

		if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenPreguntaEvaluacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPreguntaEvaluacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPreguntaEvaluacion = new JLabelMe();
		this.jLabelid_empresaPreguntaEvaluacion.setText(""+PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPreguntaEvaluacion.setToolTipText("Empresa");
		this.jLabelid_empresaPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPreguntaEvaluacion.setToolTipText(PreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPreguntaEvaluacion = new GridBagLayout();
		this.jPanelid_empresaPreguntaEvaluacion.setLayout(this.gridaBagLayoutPreguntaEvaluacion);


		jComboBoxid_empresaPreguntaEvaluacion= new JComboBoxMe();
		jComboBoxid_empresaPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPreguntaEvaluacion.setEnabled(false);

		this.jButtonid_empresaPreguntaEvaluacion= new JButtonMe();
		this.jButtonid_empresaPreguntaEvaluacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPreguntaEvaluacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPreguntaEvaluacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPreguntaEvaluacion.setText("Buscar");
		this.jButtonid_empresaPreguntaEvaluacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPreguntaEvaluacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPreguntaEvaluacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPreguntaEvaluacion"));

		this.jButtonid_empresaPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonid_empresaPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonid_empresaPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPreguntaEvaluacionBusqueda"));

		if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPreguntaEvaluacionBusqueda.setVisible(false);		}

		this.jButtonid_empresaPreguntaEvaluacionUpdate= new JButtonMe();
		this.jButtonid_empresaPreguntaEvaluacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreguntaEvaluacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPreguntaEvaluacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPreguntaEvaluacionUpdate.setText("U");
		this.jButtonid_empresaPreguntaEvaluacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPreguntaEvaluacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPreguntaEvaluacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPreguntaEvaluacionUpdate"));



					
		this.jLabelid_sucursalPreguntaEvaluacion = new JLabelMe();
		this.jLabelid_sucursalPreguntaEvaluacion.setText(""+PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPreguntaEvaluacion.setToolTipText("Sucursal");
		this.jLabelid_sucursalPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPreguntaEvaluacion.setToolTipText(PreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPreguntaEvaluacion = new GridBagLayout();
		this.jPanelid_sucursalPreguntaEvaluacion.setLayout(this.gridaBagLayoutPreguntaEvaluacion);


		jComboBoxid_sucursalPreguntaEvaluacion= new JComboBoxMe();
		jComboBoxid_sucursalPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPreguntaEvaluacion.setEnabled(false);

		this.jButtonid_sucursalPreguntaEvaluacion= new JButtonMe();
		this.jButtonid_sucursalPreguntaEvaluacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPreguntaEvaluacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPreguntaEvaluacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPreguntaEvaluacion.setText("Buscar");
		this.jButtonid_sucursalPreguntaEvaluacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPreguntaEvaluacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPreguntaEvaluacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPreguntaEvaluacion"));

		this.jButtonid_sucursalPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonid_sucursalPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonid_sucursalPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPreguntaEvaluacionBusqueda"));

		if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPreguntaEvaluacionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPreguntaEvaluacionUpdate= new JButtonMe();
		this.jButtonid_sucursalPreguntaEvaluacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPreguntaEvaluacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPreguntaEvaluacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPreguntaEvaluacionUpdate.setText("U");
		this.jButtonid_sucursalPreguntaEvaluacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPreguntaEvaluacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPreguntaEvaluacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPreguntaEvaluacionUpdate"));



					
		this.jLabelid_ejercicioPreguntaEvaluacion = new JLabelMe();
		this.jLabelid_ejercicioPreguntaEvaluacion.setText(""+PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPreguntaEvaluacion.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPreguntaEvaluacion.setToolTipText(PreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPreguntaEvaluacion = new GridBagLayout();
		this.jPanelid_ejercicioPreguntaEvaluacion.setLayout(this.gridaBagLayoutPreguntaEvaluacion);


		jComboBoxid_ejercicioPreguntaEvaluacion= new JComboBoxMe();
		jComboBoxid_ejercicioPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ejercicioPreguntaEvaluacion= new JButtonMe();
		this.jButtonid_ejercicioPreguntaEvaluacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPreguntaEvaluacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPreguntaEvaluacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPreguntaEvaluacion.setText("Buscar");
		this.jButtonid_ejercicioPreguntaEvaluacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPreguntaEvaluacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPreguntaEvaluacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPreguntaEvaluacion"));

		this.jButtonid_ejercicioPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonid_ejercicioPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPreguntaEvaluacionBusqueda"));

		if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPreguntaEvaluacionBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPreguntaEvaluacionUpdate= new JButtonMe();
		this.jButtonid_ejercicioPreguntaEvaluacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPreguntaEvaluacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPreguntaEvaluacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPreguntaEvaluacionUpdate.setText("U");
		this.jButtonid_ejercicioPreguntaEvaluacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPreguntaEvaluacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPreguntaEvaluacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPreguntaEvaluacionUpdate"));



					
		this.jLabelid_periodoPreguntaEvaluacion = new JLabelMe();
		this.jLabelid_periodoPreguntaEvaluacion.setText(""+PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPreguntaEvaluacion.setToolTipText("Periodo");
		this.jLabelid_periodoPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPreguntaEvaluacion.setToolTipText(PreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPreguntaEvaluacion = new GridBagLayout();
		this.jPanelid_periodoPreguntaEvaluacion.setLayout(this.gridaBagLayoutPreguntaEvaluacion);


		jComboBoxid_periodoPreguntaEvaluacion= new JComboBoxMe();
		jComboBoxid_periodoPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodoPreguntaEvaluacion= new JButtonMe();
		this.jButtonid_periodoPreguntaEvaluacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPreguntaEvaluacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPreguntaEvaluacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPreguntaEvaluacion.setText("Buscar");
		this.jButtonid_periodoPreguntaEvaluacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPreguntaEvaluacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPreguntaEvaluacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPreguntaEvaluacion"));

		this.jButtonid_periodoPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonid_periodoPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonid_periodoPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPreguntaEvaluacionBusqueda"));

		if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPreguntaEvaluacionBusqueda.setVisible(false);		}

		this.jButtonid_periodoPreguntaEvaluacionUpdate= new JButtonMe();
		this.jButtonid_periodoPreguntaEvaluacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPreguntaEvaluacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPreguntaEvaluacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPreguntaEvaluacionUpdate.setText("U");
		this.jButtonid_periodoPreguntaEvaluacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPreguntaEvaluacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPreguntaEvaluacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPreguntaEvaluacionUpdate"));



					
		this.jLabelid_anioPreguntaEvaluacion = new JLabelMe();
		this.jLabelid_anioPreguntaEvaluacion.setText(""+PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioPreguntaEvaluacion.setToolTipText("Anio");
		this.jLabelid_anioPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioPreguntaEvaluacion.setToolTipText(PreguntaEvaluacionConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutPreguntaEvaluacion = new GridBagLayout();
		this.jPanelid_anioPreguntaEvaluacion.setLayout(this.gridaBagLayoutPreguntaEvaluacion);


		jComboBoxid_anioPreguntaEvaluacion= new JComboBoxMe();
		jComboBoxid_anioPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioPreguntaEvaluacion.setEnabled(false);

		this.jButtonid_anioPreguntaEvaluacion= new JButtonMe();
		this.jButtonid_anioPreguntaEvaluacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPreguntaEvaluacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPreguntaEvaluacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPreguntaEvaluacion.setText("Buscar");
		this.jButtonid_anioPreguntaEvaluacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioPreguntaEvaluacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPreguntaEvaluacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPreguntaEvaluacion"));

		this.jButtonid_anioPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonid_anioPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonid_anioPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPreguntaEvaluacionBusqueda"));

		if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioPreguntaEvaluacionBusqueda.setVisible(false);		}

		this.jButtonid_anioPreguntaEvaluacionUpdate= new JButtonMe();
		this.jButtonid_anioPreguntaEvaluacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPreguntaEvaluacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPreguntaEvaluacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPreguntaEvaluacionUpdate.setText("U");
		this.jButtonid_anioPreguntaEvaluacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioPreguntaEvaluacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPreguntaEvaluacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPreguntaEvaluacionUpdate"));



					
		this.jLabelid_mesPreguntaEvaluacion = new JLabelMe();
		this.jLabelid_mesPreguntaEvaluacion.setText(""+PreguntaEvaluacionConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesPreguntaEvaluacion.setToolTipText("Mes");
		this.jLabelid_mesPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesPreguntaEvaluacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesPreguntaEvaluacion.setToolTipText(PreguntaEvaluacionConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutPreguntaEvaluacion = new GridBagLayout();
		this.jPanelid_mesPreguntaEvaluacion.setLayout(this.gridaBagLayoutPreguntaEvaluacion);


		jComboBoxid_mesPreguntaEvaluacion= new JComboBoxMe();
		jComboBoxid_mesPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesPreguntaEvaluacion.setEnabled(false);

		this.jButtonid_mesPreguntaEvaluacion= new JButtonMe();
		this.jButtonid_mesPreguntaEvaluacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPreguntaEvaluacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPreguntaEvaluacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPreguntaEvaluacion.setText("Buscar");
		this.jButtonid_mesPreguntaEvaluacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesPreguntaEvaluacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPreguntaEvaluacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPreguntaEvaluacion"));

		this.jButtonid_mesPreguntaEvaluacionBusqueda= new JButtonMe();
		this.jButtonid_mesPreguntaEvaluacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPreguntaEvaluacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPreguntaEvaluacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPreguntaEvaluacionBusqueda.setText("U");
		this.jButtonid_mesPreguntaEvaluacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesPreguntaEvaluacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPreguntaEvaluacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPreguntaEvaluacionBusqueda"));

		if(this.preguntaevaluacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesPreguntaEvaluacionBusqueda.setVisible(false);		}

		this.jButtonid_mesPreguntaEvaluacionUpdate= new JButtonMe();
		this.jButtonid_mesPreguntaEvaluacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPreguntaEvaluacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPreguntaEvaluacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPreguntaEvaluacionUpdate.setText("U");
		this.jButtonid_mesPreguntaEvaluacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesPreguntaEvaluacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPreguntaEvaluacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPreguntaEvaluacionUpdate"));



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
		//this.jInternalFrameDetallePreguntaEvaluacion = new PreguntaEvaluacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pregunta Evaluacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPreguntaEvaluacion= new GridBagLayout();
		

		
		String sToolTipPreguntaEvaluacion="";
		sToolTipPreguntaEvaluacion=PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPreguntaEvaluacion+="(Cartera.PreguntaEvaluacion)";
		}
		
		if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipPreguntaEvaluacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPreguntaEvaluacion = new JButtonMe();
		this.jButtonModificarPreguntaEvaluacion = new JButtonMe();
        this.jButtonActualizarPreguntaEvaluacion = new JButtonMe();
        this.jButtonEliminarPreguntaEvaluacion = new JButtonMe();
        this.jButtonCancelarPreguntaEvaluacion = new JButtonMe();
        this.jButtonGuardarCambiosPreguntaEvaluacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaPreguntaEvaluacion = new JButtonMe();
		this.jButtonCerrarPreguntaEvaluacion = new JButtonMe();
		
		this.jScrollPanelDatosPreguntaEvaluacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionPreguntaEvaluacion = new JScrollPane();
		this.jScrollPanelDatosGeneralPreguntaEvaluacion = new JScrollPane();
				
		
		
		this.jPanelCamposPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pregunta Evaluacion";
		
		if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pregunta Evaluacions" + this.sPath));
		} else {
			this.jScrollPanelDatosPreguntaEvaluacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPreguntaEvaluacion.setName("jPanelCamposPreguntaEvaluacion"); 

		this.jPanelCamposOcultosPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPreguntaEvaluacion.setName("jPanelCamposOcultosPreguntaEvaluacion"); 

        this.jPanelAccionesPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPreguntaEvaluacion.setToolTipText("Acciones");
        this.jPanelAccionesPreguntaEvaluacion.setName("Acciones"); 

		this.jPanelAccionesFormularioPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPreguntaEvaluacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPreguntaEvaluacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPreguntaEvaluacion.setText("Nuevo");
		this.jButtonModificarPreguntaEvaluacion.setText("Editar");
        this.jButtonActualizarPreguntaEvaluacion.setText("Actualizar");
        this.jButtonEliminarPreguntaEvaluacion.setText("Eliminar");
        this.jButtonCancelarPreguntaEvaluacion.setText("Cancelar");
        this.jButtonGuardarCambiosPreguntaEvaluacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaPreguntaEvaluacion.setText("Guardar");
		this.jButtonCerrarPreguntaEvaluacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPreguntaEvaluacion,"nuevo_button","Nuevo",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPreguntaEvaluacion,"modificar_button","Editar",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPreguntaEvaluacion,"actualizar_button","Actualizar",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPreguntaEvaluacion,"eliminar_button","Eliminar",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPreguntaEvaluacion,"cancelar_button","Cancelar",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPreguntaEvaluacion,"guardarcambios_button","Guardar",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPreguntaEvaluacion,"guardarcambiostabla_button","Guardar",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPreguntaEvaluacion,"cerrar_button","Salir",this.preguntaevaluacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPreguntaEvaluacion.setToolTipText("Nuevo"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPreguntaEvaluacion.setToolTipText("Editar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPreguntaEvaluacion.setToolTipText("Actualizar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPreguntaEvaluacion.setToolTipText("Eliminar)"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPreguntaEvaluacion.setToolTipText("Cancelar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPreguntaEvaluacion.setToolTipText("Guardar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPreguntaEvaluacion.setToolTipText("Guardar"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPreguntaEvaluacion.setToolTipText("Salir"+" "+PreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPreguntaEvaluacion";
		inputMap = this.jButtonNuevoPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPreguntaEvaluacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPreguntaEvaluacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPreguntaEvaluacion";
		inputMap = this.jButtonActualizarPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPreguntaEvaluacion"));
		
		//ELIMINAR
		sMapKey = "EliminarPreguntaEvaluacion";
		inputMap = this.jButtonEliminarPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPreguntaEvaluacion"));
		
		//CANCELAR	
		sMapKey = "CancelarPreguntaEvaluacion";
		inputMap = this.jButtonCancelarPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPreguntaEvaluacion"));
		
		//CERRAR		
		sMapKey = "CerrarPreguntaEvaluacion";
		inputMap = this.jButtonCerrarPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPreguntaEvaluacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPreguntaEvaluacion";
		inputMap = this.jButtonGuardarCambiosTablaPreguntaEvaluacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPreguntaEvaluacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPreguntaEvaluacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPreguntaEvaluacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPreguntaEvaluacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPreguntaEvaluacion.setToolTipText("Nuevo PreguntaEvaluacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPreguntaEvaluacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPreguntaEvaluacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPreguntaEvaluacion.setToolTipText("Sin Cerrar Ventana PreguntaEvaluacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePreguntaEvaluacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePreguntaEvaluacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePreguntaEvaluacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPreguntaEvaluacion.setText("Accion");
		this.jComboBoxTiposAccionesPreguntaEvaluacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPreguntaEvaluacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPreguntaEvaluacion = new JLabelMe();
		
		this.jLabelAccionesPreguntaEvaluacion.setText("Acciones");		
		this.jLabelAccionesPreguntaEvaluacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreguntaEvaluacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPreguntaEvaluacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPreguntaEvaluacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPreguntaEvaluacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPreguntaEvaluacion=new JTabbedPane();
		this.jTabbedPaneRelacionesPreguntaEvaluacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPreguntaEvaluacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPreguntaEvaluacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPreguntaEvaluacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPreguntaEvaluacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPreguntaEvaluacion = new GridBagLayout();
		
		this.jPanelCamposPreguntaEvaluacion.setLayout(gridaBagLayoutCamposPreguntaEvaluacion);
		this.jPanelCamposOcultosPreguntaEvaluacion.setLayout(gridaBagLayoutCamposOcultosPreguntaEvaluacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPreguntaEvaluacion.add(jLabelIdPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPreguntaEvaluacion.add(jLabelidPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);


	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPreguntaEvaluacion.add(jLabelid_empresaPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPreguntaEvaluacion.add(jButtonid_empresaPreguntaEvaluacionBusqueda, this.gridBagConstraintsPreguntaEvaluacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 3;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPreguntaEvaluacion.add(jButtonid_empresaPreguntaEvaluacionUpdate, this.gridBagConstraintsPreguntaEvaluacion);
	}

	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPreguntaEvaluacion.add(jComboBoxid_empresaPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);


	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPreguntaEvaluacion.add(jLabelid_sucursalPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPreguntaEvaluacion.add(jButtonid_sucursalPreguntaEvaluacionBusqueda, this.gridBagConstraintsPreguntaEvaluacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 3;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPreguntaEvaluacion.add(jButtonid_sucursalPreguntaEvaluacionUpdate, this.gridBagConstraintsPreguntaEvaluacion);
	}

	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPreguntaEvaluacion.add(jComboBoxid_sucursalPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);


	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPreguntaEvaluacion.add(jLabelid_ejercicioPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPreguntaEvaluacion.add(jButtonid_ejercicioPreguntaEvaluacionBusqueda, this.gridBagConstraintsPreguntaEvaluacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 3;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPreguntaEvaluacion.add(jButtonid_ejercicioPreguntaEvaluacionUpdate, this.gridBagConstraintsPreguntaEvaluacion);
	}

	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPreguntaEvaluacion.add(jComboBoxid_ejercicioPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);


	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPreguntaEvaluacion.add(jLabelid_periodoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPreguntaEvaluacion.add(jButtonid_periodoPreguntaEvaluacionBusqueda, this.gridBagConstraintsPreguntaEvaluacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 3;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPreguntaEvaluacion.add(jButtonid_periodoPreguntaEvaluacionUpdate, this.gridBagConstraintsPreguntaEvaluacion);
	}

	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPreguntaEvaluacion.add(jComboBoxid_periodoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);


	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpreguntaPreguntaEvaluacion.add(jLabelpreguntaPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelpreguntaPreguntaEvaluacion.add(jButtonpreguntaPreguntaEvaluacionBusqueda, this.gridBagConstraintsPreguntaEvaluacion);
	}

	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpreguntaPreguntaEvaluacion.add(jscrollPanepreguntaPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);


	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcalificacionPreguntaEvaluacion.add(jLabelcalificacionPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcalificacionPreguntaEvaluacion.add(jButtoncalificacionPreguntaEvaluacionBusqueda, this.gridBagConstraintsPreguntaEvaluacion);
	}

	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcalificacionPreguntaEvaluacion.add(jTextFieldcalificacionPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);


	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenPreguntaEvaluacion.add(jLabelordenPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenPreguntaEvaluacion.add(jButtonordenPreguntaEvaluacionBusqueda, this.gridBagConstraintsPreguntaEvaluacion);
	}

	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenPreguntaEvaluacion.add(jTextFieldordenPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);


	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioPreguntaEvaluacion.add(jLabelid_anioPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPreguntaEvaluacion.add(jButtonid_anioPreguntaEvaluacionBusqueda, this.gridBagConstraintsPreguntaEvaluacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 3;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPreguntaEvaluacion.add(jButtonid_anioPreguntaEvaluacionUpdate, this.gridBagConstraintsPreguntaEvaluacion);
	}

	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioPreguntaEvaluacion.add(jComboBoxid_anioPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);


	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesPreguntaEvaluacion.add(jLabelid_mesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 2;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPreguntaEvaluacion.add(jButtonid_mesPreguntaEvaluacionBusqueda, this.gridBagConstraintsPreguntaEvaluacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		//this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 3;
		this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
		this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPreguntaEvaluacion.add(jButtonid_mesPreguntaEvaluacionUpdate, this.gridBagConstraintsPreguntaEvaluacion);
	}

	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = 1;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesPreguntaEvaluacion.add(jComboBoxid_mesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = iYPanelCamposPreguntaEvaluacion;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = iXPanelCamposPreguntaEvaluacion++;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaEvaluacion.add(this.jPanelidPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(iXPanelCamposPreguntaEvaluacion % 1==0) {
		iXPanelCamposPreguntaEvaluacion=0;
		iYPanelCamposPreguntaEvaluacion++;
	}
	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = iYPanelCamposPreguntaEvaluacion;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = iXPanelCamposPreguntaEvaluacion++;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaEvaluacion.add(this.jPanelid_ejercicioPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(iXPanelCamposPreguntaEvaluacion % 1==0) {
		iXPanelCamposPreguntaEvaluacion=0;
		iYPanelCamposPreguntaEvaluacion++;
	}
	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = iYPanelCamposPreguntaEvaluacion;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = iXPanelCamposPreguntaEvaluacion++;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaEvaluacion.add(this.jPanelid_periodoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(iXPanelCamposPreguntaEvaluacion % 1==0) {
		iXPanelCamposPreguntaEvaluacion=0;
		iYPanelCamposPreguntaEvaluacion++;
	}
	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = iYPanelCamposPreguntaEvaluacion;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = iXPanelCamposPreguntaEvaluacion++;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaEvaluacion.add(this.jPanelpreguntaPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(iXPanelCamposPreguntaEvaluacion % 1==0) {
		iXPanelCamposPreguntaEvaluacion=0;
		iYPanelCamposPreguntaEvaluacion++;
	}
	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = iYPanelCamposPreguntaEvaluacion;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = iXPanelCamposPreguntaEvaluacion++;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaEvaluacion.add(this.jPanelcalificacionPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(iXPanelCamposPreguntaEvaluacion % 1==0) {
		iXPanelCamposPreguntaEvaluacion=0;
		iYPanelCamposPreguntaEvaluacion++;
	}
	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = iYPanelCamposPreguntaEvaluacion;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = iXPanelCamposPreguntaEvaluacion++;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPreguntaEvaluacion.add(this.jPanelordenPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(iXPanelCamposPreguntaEvaluacion % 1==0) {
		iXPanelCamposPreguntaEvaluacion=0;
		iYPanelCamposPreguntaEvaluacion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = iYPanelCamposOcultosPreguntaEvaluacion;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = iXPanelCamposOcultosPreguntaEvaluacion++;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPreguntaEvaluacion.add(this.jPanelid_empresaPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(iXPanelCamposOcultosPreguntaEvaluacion % 1==0) {
		iXPanelCamposOcultosPreguntaEvaluacion=0;
		iYPanelCamposOcultosPreguntaEvaluacion++;
	}
	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = iYPanelCamposOcultosPreguntaEvaluacion;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = iXPanelCamposOcultosPreguntaEvaluacion++;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPreguntaEvaluacion.add(this.jPanelid_sucursalPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(iXPanelCamposOcultosPreguntaEvaluacion % 1==0) {
		iXPanelCamposOcultosPreguntaEvaluacion=0;
		iYPanelCamposOcultosPreguntaEvaluacion++;
	}
	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = iYPanelCamposOcultosPreguntaEvaluacion;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = iXPanelCamposOcultosPreguntaEvaluacion++;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPreguntaEvaluacion.add(this.jPanelid_anioPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(iXPanelCamposOcultosPreguntaEvaluacion % 1==0) {
		iXPanelCamposOcultosPreguntaEvaluacion=0;
		iYPanelCamposOcultosPreguntaEvaluacion++;
	}
	this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPreguntaEvaluacion.gridy = iYPanelCamposOcultosPreguntaEvaluacion;
	this.gridBagConstraintsPreguntaEvaluacion.gridx = iXPanelCamposOcultosPreguntaEvaluacion++;
	this.gridBagConstraintsPreguntaEvaluacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPreguntaEvaluacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPreguntaEvaluacion.add(this.jPanelid_mesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);



	if(iXPanelCamposOcultosPreguntaEvaluacion % 1==0) {
		iXPanelCamposOcultosPreguntaEvaluacion=0;
		iYPanelCamposOcultosPreguntaEvaluacion++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesPreguntaEvaluacion= new GridBagLayout();
		this.jPanelAccionesPreguntaEvaluacion.setLayout(gridaBagLayoutAccionesPreguntaEvaluacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPreguntaEvaluacion= new GridBagLayout();
		this.jPanelAccionesFormularioPreguntaEvaluacion.setLayout(gridaBagLayoutAccionesFormularioPreguntaEvaluacion);
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPreguntaEvaluacion.add(this.jComboBoxTiposAccionesFormularioPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPreguntaEvaluacion.add(this.jCheckBoxPostAccionNuevoPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPreguntaEvaluacion.add(this.jCheckBoxPostAccionSinCerrarPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.preguntaevaluacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPreguntaEvaluacion.add(this.jCheckBoxPostAccionSinMensajePreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesPreguntaEvaluacion.add(this.jButtonModificarPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);							

		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;
		this.gridBagConstraintsPreguntaEvaluacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesPreguntaEvaluacion.add(this.jButtonEliminarPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
			
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesPreguntaEvaluacion.add(this.jButtonActualizarPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);


		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesPreguntaEvaluacion.add(this.jButtonGuardarCambiosPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);	
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy = 0;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesPreguntaEvaluacion.add(this.jButtonCancelarPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPreguntaEvaluacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPreguntaEvaluacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.preguntaevaluacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();						
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;		
			//this.gridBagConstraintsPreguntaEvaluacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPreguntaEvaluacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPreguntaEvaluacion.gridx =0;
		this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPreguntaEvaluacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePreguntaEvaluacion = new PreguntaEvaluacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pregunta Evaluacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pregunta Evaluacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pregunta Evaluacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PreguntaEvaluacionModel preguntaevaluacionModel=new PreguntaEvaluacionModel(this);
			
			//SI USARA CLASE INTERNA
			//PreguntaEvaluacionModel.PreguntaEvaluacionFocusTraversalPolicy preguntaevaluacionFocusTraversalPolicy = preguntaevaluacionModel.new PreguntaEvaluacionFocusTraversalPolicy(this);
			
			//preguntaevaluacionFocusTraversalPolicy.setpreguntaevaluacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(preguntaevaluacionModel);
			
			
			this.jContentPaneDetallePreguntaEvaluacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePreguntaEvaluacion = new GridBagLayout();	
			this.jContentPaneDetallePreguntaEvaluacion.setLayout(gridaBagLayoutDetallePreguntaEvaluacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPreguntaEvaluacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
				this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
					
				
				this.jContentPaneDetallePreguntaEvaluacion.add(jTtoolBarDetallePreguntaEvaluacion, gridBagConstraintsPreguntaEvaluacion);								
				
}
			
			this.jScrollPanelDatosEdicionPreguntaEvaluacion=   new JScrollPane(jContentPaneDetallePreguntaEvaluacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPreguntaEvaluacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
	        
			this.jContentPaneDetallePreguntaEvaluacion.add(jPanelCamposPreguntaEvaluacion, gridBagConstraintsPreguntaEvaluacion);
			
			
			
			
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
						&& preguntaevaluacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionProveedor(this.puedeCargarPorParteDetalleEvaluacionProveedor,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubPreguntaEvaluacion(this.puedeCargarPorParteSubPreguntaEvaluacion,false,-1);
					
					if(this.preguntaevaluacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPreguntaEvaluacion= new GridBagConstraints();
						this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
						this.jContentPaneDetallePreguntaEvaluacion.add(this.jTabbedPaneRelacionesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPreguntaEvaluacion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionProveedor(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubPreguntaEvaluacion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPreguntaEvaluacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
					this.gridBagConstraintsPreguntaEvaluacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
					
				
					this.jContentPaneDetallePreguntaEvaluacion.add(jPanelCamposOcultosPreguntaEvaluacion, gridBagConstraintsPreguntaEvaluacion);
				
					this.jPanelCamposOcultosPreguntaEvaluacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
	        this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePreguntaEvaluacion.add(this.jPanelAccionesFormularioPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);							
			
			
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
	        this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
	        
			
			this.jContentPaneDetallePreguntaEvaluacion.add(this.jPanelAccionesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPreguntaEvaluacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPreguntaEvaluacion=   new JScrollPane(this.jPanelCamposPreguntaEvaluacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPreguntaEvaluacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreguntaEvaluacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPreguntaEvaluacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
			this.gridBagConstraintsPreguntaEvaluacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPreguntaEvaluacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPreguntaEvaluacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);			
			
			this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
			this.gridBagConstraintsPreguntaEvaluacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
			
			
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		
			
		this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
		this.gridBagConstraintsPreguntaEvaluacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPreguntaEvaluacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPreguntaEvaluacion, this.gridBagConstraintsPreguntaEvaluacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPreguntaEvaluacion;//jContentPane;
		
		return jScrollPanelDatosEdicionPreguntaEvaluacion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionProveedor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
		this.detalleevaluacionproveedorSessionBean.setConGuardarRelaciones(false);
		this.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(true);

		this.detalleevaluacionproveedorBeanSwingJInternalFrame=null;//new DetalleEvaluacionProveedorBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleevaluacionproveedorBeanSwingJInternalFramePopup=new DetalleEvaluacionProveedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleevaluacionproveedorBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {

				DetalleEvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=PreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleEvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(true);

				this.detalleevaluacionproveedorBeanSwingJInternalFrame=new DetalleEvaluacionProveedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleevaluacionproveedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleevaluacionproveedorBeanSwingJInternalFrame.setdetalleevaluacionproveedorSessionBean(this.detalleevaluacionproveedorSessionBean);

				//this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
				//this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
				//this.jContentPaneDetallePreguntaEvaluacion.add(this.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPreguntaEvaluacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPreguntaEvaluacion.add("Detalle Evaluacion Proveedores",this.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPreguntaEvaluacion.setComponentAt(iIndexTab,this.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(false);
				this.detalleevaluacionproveedorBeanSwingJInternalFrame=null;//new DetalleEvaluacionProveedorBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleEvaluacionProveedor) {
					this.jTabbedPaneRelacionesPreguntaEvaluacion.add("Detalle Evaluacion Proveedores",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSubPreguntaEvaluacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
		this.subpreguntaevaluacionSessionBean.setConGuardarRelaciones(false);
		this.subpreguntaevaluacionSessionBean.setEsGuardarRelacionado(true);

		this.subpreguntaevaluacionBeanSwingJInternalFrame=null;//new SubPreguntaEvaluacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.subpreguntaevaluacionBeanSwingJInternalFramePopup=new SubPreguntaEvaluacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.subpreguntaevaluacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {

				SubPreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL=PreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				SubPreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PreguntaEvaluacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.subpreguntaevaluacionSessionBean.setEsGuardarRelacionado(true);

				this.subpreguntaevaluacionBeanSwingJInternalFrame=new SubPreguntaEvaluacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.subpreguntaevaluacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.subpreguntaevaluacionBeanSwingJInternalFrame.setsubpreguntaevaluacionSessionBean(this.subpreguntaevaluacionSessionBean);

				//this.gridBagConstraintsPreguntaEvaluacion = new GridBagConstraints();
				//this.gridBagConstraintsPreguntaEvaluacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPreguntaEvaluacion.gridx = 0;
				//this.jContentPaneDetallePreguntaEvaluacion.add(this.subpreguntaevaluacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPreguntaEvaluacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPreguntaEvaluacion.add("Sub Pregunta Evaluaciones",this.subpreguntaevaluacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPreguntaEvaluacion.setComponentAt(iIndexTab,this.subpreguntaevaluacionBeanSwingJInternalFrame.getContentPane());
				}

				//SubPreguntaEvaluacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.subpreguntaevaluacionSessionBean.setEsGuardarRelacionado(false);
				this.subpreguntaevaluacionBeanSwingJInternalFrame=null;//new SubPreguntaEvaluacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSubPreguntaEvaluacion) {
					this.jTabbedPaneRelacionesPreguntaEvaluacion.add("Sub Pregunta Evaluaciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleEvaluacionProveedorBeanSwingJInternalFrame(List<PreguntaEvaluacion> preguntaevaluacions,PreguntaEvaluacion preguntaevaluacion,DetalleEvaluacionProveedorBeanSwingJInternalFrame detalleevaluacionproveedorBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleevaluacionproveedorBeanSwingJInternalFrame=new DetalleEvaluacionProveedorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleevaluacionproveedorBeanSwingJInternalFrame.getDetalleEvaluacionProveedorLogic().setConnexion(this.preguntaevaluacionLogic.getConnexion());

					detalleevaluacionproveedorBeanSwingJInternalFrame.setpreguntaevaluacionsForeignKey(preguntaevaluacions);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setpreguntaevaluacionForeignKey(preguntaevaluacion);
					detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setisBusquedaDesdeForeignKeySesionPreguntaEvaluacion(true);
					detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setlidPreguntaEvaluacionActual(preguntaevaluacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleevaluacionproveedorBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleEvaluacionProveedor(detalleevaluacionproveedorBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setVisibilidadBusquedasParaPreguntaEvaluacion(true);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setid_pregunta_evaluacionFK_IdPreguntaEvaluacion(preguntaevaluacion.getId());

					if(!this.conCargarFormDetalle) {
						detalleevaluacionproveedorBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleevaluacionproveedorBeanSwingJInternalFrame.setSelectedItemCombosFramePreguntaEvaluacionForeignKey(preguntaevaluacion,1,false,true,true);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleevaluacionproveedorBeanSwingJInternalFrame.procesarBusqueda("FK_IdPreguntaEvaluacion");
					detalleevaluacionproveedorBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPreguntaEvaluacion");
					detalleevaluacionproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(true);
					detalleevaluacionproveedorBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleEvaluacionProveedor("n",detalleevaluacionproveedorBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleevaluacionproveedorBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleevaluacionproveedorBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleevaluacionproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleEvaluacionProveedor("relacionado");
					} else {
						detalleevaluacionproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleEvaluacionProveedor("no_relacionado");
					}

					detalleevaluacionproveedorBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleEvaluacionProveedor().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSubPreguntaEvaluacionBeanSwingJInternalFrame(List<PreguntaEvaluacion> preguntaevaluacions,PreguntaEvaluacion preguntaevaluacion,SubPreguntaEvaluacionBeanSwingJInternalFrame subpreguntaevaluacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//subpreguntaevaluacionBeanSwingJInternalFrame=new SubPreguntaEvaluacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					subpreguntaevaluacionBeanSwingJInternalFrame.getSubPreguntaEvaluacionLogic().setConnexion(this.preguntaevaluacionLogic.getConnexion());

					subpreguntaevaluacionBeanSwingJInternalFrame.setpreguntaevaluacionsForeignKey(preguntaevaluacions);
					subpreguntaevaluacionBeanSwingJInternalFrame.setpreguntaevaluacionForeignKey(preguntaevaluacion);
					subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionSessionBean.setisBusquedaDesdeForeignKeySesionPreguntaEvaluacion(true);
					subpreguntaevaluacionBeanSwingJInternalFrame.subpreguntaevaluacionSessionBean.setlidPreguntaEvaluacionActual(preguntaevaluacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					subpreguntaevaluacionBeanSwingJInternalFrame.cargarCombosForeignKeySubPreguntaEvaluacion(subpreguntaevaluacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					subpreguntaevaluacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaPreguntaEvaluacion(true);
					subpreguntaevaluacionBeanSwingJInternalFrame.setid_pregunta_evaluacionFK_IdPreguntaEvaluacion(preguntaevaluacion.getId());

					if(!this.conCargarFormDetalle) {
						subpreguntaevaluacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					subpreguntaevaluacionBeanSwingJInternalFrame.setSelectedItemCombosFramePreguntaEvaluacionForeignKey(preguntaevaluacion,1,false,true,true);
					subpreguntaevaluacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					subpreguntaevaluacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdPreguntaEvaluacion");
					subpreguntaevaluacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPreguntaEvaluacion");
					subpreguntaevaluacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubPreguntaEvaluacion(true);
					subpreguntaevaluacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSubPreguntaEvaluacion("n",subpreguntaevaluacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, subpreguntaevaluacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					subpreguntaevaluacionBeanSwingJInternalFrame.setAutoscrolls(true);
					subpreguntaevaluacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						subpreguntaevaluacionBeanSwingJInternalFrame.actualizarEstadoPanelsSubPreguntaEvaluacion("relacionado");
					} else {
						subpreguntaevaluacionBeanSwingJInternalFrame.actualizarEstadoPanelsSubPreguntaEvaluacion("no_relacionado");
					}

					subpreguntaevaluacionBeanSwingJInternalFrame.getjButtonRecargarInformacionSubPreguntaEvaluacion().setVisible(false);

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
