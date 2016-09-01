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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.EvaluacionesBonificacionesConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class EvaluacionesBonificacionesDetalleFormJInternalFrame extends EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEvaluacionesBonificaciones;
	
	protected JMenuBar jmenuBarDetalleEvaluacionesBonificaciones;
	
	protected JMenu jmenuDetalleEvaluacionesBonificaciones;
	protected JMenu jmenuDetalleArchivoEvaluacionesBonificaciones;
	protected JMenu jmenuDetalleAccionesEvaluacionesBonificaciones;
	protected JMenu jmenuDetalleDatosEvaluacionesBonificaciones;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEvaluacionesBonificaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEvaluacionesBonificaciones;	
	protected GridBagConstraints gridBagConstraintsEvaluacionesBonificaciones;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional jInternalFrameDetalleEvaluacionesBonificaciones;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoCalificacionEmpleadoBeanSwingJInternalFrame tipocalificacionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocalificacionempleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public EvaluacionesBonificacionesSessionBean evaluacionesbonificacionesSessionBean;
	
	
	
	
	public TipoCalificacionEmpleadoSessionBean tipocalificacionempleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public EvaluacionesBonificacionesLogic evaluacionesbonificacionesLogic;
	
	public JScrollPane jScrollPanelDatosEvaluacionesBonificaciones;
	public JScrollPane jScrollPanelDatosEdicionEvaluacionesBonificaciones;
	public JScrollPane jScrollPanelDatosGeneralEvaluacionesBonificaciones;
	
	protected JPanel jPanelCamposEvaluacionesBonificaciones;    
	protected JPanel jPanelCamposOcultosEvaluacionesBonificaciones;    	
	protected JPanel jPanelAccionesEvaluacionesBonificaciones;
	protected JPanel jPanelAccionesFormularioEvaluacionesBonificaciones;
    
	
	
	protected Integer iXPanelCamposEvaluacionesBonificaciones=0;
	protected Integer iYPanelCamposEvaluacionesBonificaciones=0;
	
	protected Integer iXPanelCamposOcultosEvaluacionesBonificaciones=0;
	protected Integer iYPanelCamposOcultosEvaluacionesBonificaciones=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEvaluacionesBonificaciones;
	public JButton jButtonModificarEvaluacionesBonificaciones;
	public JButton jButtonActualizarEvaluacionesBonificaciones;
    public JButton jButtonEliminarEvaluacionesBonificaciones;
	public JButton jButtonCancelarEvaluacionesBonificaciones;
    public JButton jButtonGuardarCambiosEvaluacionesBonificaciones;
	public JButton jButtonGuardarCambiosTablaEvaluacionesBonificaciones;
	protected JButton jButtonCerrarEvaluacionesBonificaciones;
	
	
	protected JButton jButtonProcesarInformacionEvaluacionesBonificaciones;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEvaluacionesBonificaciones;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEvaluacionesBonificaciones;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEvaluacionesBonificaciones;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEvaluacionesBonificaciones;
	protected JButton jButtonModificarToolBarEvaluacionesBonificaciones;
	protected JButton jButtonActualizarToolBarEvaluacionesBonificaciones;
    protected JButton jButtonEliminarToolBarEvaluacionesBonificaciones;
	protected JButton jButtonCancelarToolBarEvaluacionesBonificaciones;
    protected JButton jButtonGuardarCambiosToolBarEvaluacionesBonificaciones;
	protected JButton jButtonGuardarCambiosTablaToolBarEvaluacionesBonificaciones;
	protected JButton jButtonMostrarOcultarTablaToolBarEvaluacionesBonificaciones;
	protected JButton jButtonCerrarToolBarEvaluacionesBonificaciones;
	
	protected JButton jButtonProcesarInformacionToolBarEvaluacionesBonificaciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemModificarEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemActualizarEvaluacionesBonificaciones;
    protected JMenuItem jMenuItemEliminarEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemCancelarEvaluacionesBonificaciones;
    protected JMenuItem jMenuItemGuardarCambiosEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemCerrarEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemDetalleCerrarEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarEvaluacionesBonificaciones;
	
	protected JMenuItem jMenuItemProcesarInformacionEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemMostrarOcultarEvaluacionesBonificaciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEvaluacionesBonificaciones;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEvaluacionesBonificaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEvaluacionesBonificaciones;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEvaluacionesBonificaciones;
	public JLabel jLabelIdEvaluacionesBonificaciones;
	public JLabel jLabelidEvaluacionesBonificaciones;
	public JButton jButtonidEvaluacionesBonificacionesBusqueda= new JButtonMe();

	public JPanel jPanelverificadoEvaluacionesBonificaciones;
	public JLabel jLabelverificadoEvaluacionesBonificaciones;
	public JCheckBox jCheckBoxverificadoEvaluacionesBonificaciones;
	public JButton jButtonverificadoEvaluacionesBonificacionesBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEvaluacionesBonificaciones;
	public JLabel jLabelcodigoEvaluacionesBonificaciones;
	public JTextField jTextFieldcodigoEvaluacionesBonificaciones;
	public JButton jButtoncodigoEvaluacionesBonificacionesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_datoEvaluacionesBonificaciones;
	public JLabel jLabelcodigo_datoEvaluacionesBonificaciones;
	public JTextField jTextFieldcodigo_datoEvaluacionesBonificaciones;
	public JButton jButtoncodigo_datoEvaluacionesBonificacionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoEvaluacionesBonificaciones;
	public JLabel jLabelnombre_completoEvaluacionesBonificaciones;
	public JTextArea jTextAreanombre_completoEvaluacionesBonificaciones;
	public JScrollPane jscrollPanenombre_completoEvaluacionesBonificaciones;
	public JButton jButtonnombre_completoEvaluacionesBonificacionesBusqueda= new JButtonMe();

	public JPanel jPanelsueldoEvaluacionesBonificaciones;
	public JLabel jLabelsueldoEvaluacionesBonificaciones;
	public JTextField jTextFieldsueldoEvaluacionesBonificaciones;
	public JButton jButtonsueldoEvaluacionesBonificacionesBusqueda= new JButtonMe();

	public JPanel jPanelvalor_conocimientoEvaluacionesBonificaciones;
	public JLabel jLabelvalor_conocimientoEvaluacionesBonificaciones;
	public JTextField jTextFieldvalor_conocimientoEvaluacionesBonificaciones;
	public JButton jButtonvalor_conocimientoEvaluacionesBonificacionesBusqueda= new JButtonMe();

	public JPanel jPanelvalor_eficienciaEvaluacionesBonificaciones;
	public JLabel jLabelvalor_eficienciaEvaluacionesBonificaciones;
	public JTextField jTextFieldvalor_eficienciaEvaluacionesBonificaciones;
	public JButton jButtonvalor_eficienciaEvaluacionesBonificacionesBusqueda= new JButtonMe();

	public JPanel jPanelvalor_obtenidoEvaluacionesBonificaciones;
	public JLabel jLabelvalor_obtenidoEvaluacionesBonificaciones;
	public JTextField jTextFieldvalor_obtenidoEvaluacionesBonificaciones;
	public JButton jButtonvalor_obtenidoEvaluacionesBonificacionesBusqueda= new JButtonMe();

	public JPanel jPanelvalor_pesoEvaluacionesBonificaciones;
	public JLabel jLabelvalor_pesoEvaluacionesBonificaciones;
	public JTextField jTextFieldvalor_pesoEvaluacionesBonificaciones;
	public JButton jButtonvalor_pesoEvaluacionesBonificacionesBusqueda= new JButtonMe();

	public JPanel jPanelbonificacionEvaluacionesBonificaciones;
	public JLabel jLabelbonificacionEvaluacionesBonificaciones;
	public JTextField jTextFieldbonificacionEvaluacionesBonificaciones;
	public JButton jButtonbonificacionEvaluacionesBonificacionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_calificacion_empleadoEvaluacionesBonificaciones;
	public JLabel jLabelid_tipo_calificacion_empleadoEvaluacionesBonificaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones;
	public JButton jButtonid_tipo_calificacion_empleadoEvaluacionesBonificaciones= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraEvaluacionesBonificaciones;
	public JLabel jLabelid_estructuraEvaluacionesBonificaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraEvaluacionesBonificaciones;
	public JButton jButtonid_estructuraEvaluacionesBonificaciones= new JButtonMe();
	public JButton jButtonid_estructuraEvaluacionesBonificacionesUpdate= new JButtonMe();
	public JButton jButtonid_estructuraEvaluacionesBonificacionesBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaEvaluacionesBonificaciones;
	public JLabel jLabelid_empresaEvaluacionesBonificaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEvaluacionesBonificaciones;
	public JButton jButtonid_empresaEvaluacionesBonificaciones= new JButtonMe();
	public JButton jButtonid_empresaEvaluacionesBonificacionesUpdate= new JButtonMe();
	public JButton jButtonid_empresaEvaluacionesBonificacionesBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalEvaluacionesBonificaciones;
	public JLabel jLabelid_sucursalEvaluacionesBonificaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalEvaluacionesBonificaciones;
	public JButton jButtonid_sucursalEvaluacionesBonificaciones= new JButtonMe();
	public JButton jButtonid_sucursalEvaluacionesBonificacionesUpdate= new JButtonMe();
	public JButton jButtonid_sucursalEvaluacionesBonificacionesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEvaluacionesBonificaciones;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=528;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EvaluacionesBonificacionesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEvaluacionesBonificaciones=new JPanel();
				this.jPanelAccionesFormularioEvaluacionesBonificaciones=new JPanel();
				this.jmenuBarDetalleEvaluacionesBonificaciones=new JMenuBar();
				this.jTtoolBarDetalleEvaluacionesBonificaciones=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesBonificacionesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EvaluacionesBonificaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EvaluacionesBonificacionesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EvaluacionesBonificaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesBonificacionesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionesBonificaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesBonificacionesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionesBonificaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesBonificacionesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EvaluacionesBonificaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEvaluacionesBonificaciones() {
		return this.jButtonActualizarToolBarEvaluacionesBonificaciones;
	}
	
	public JButton getjButtonEliminarToolBarEvaluacionesBonificaciones() {
		return this.jButtonEliminarToolBarEvaluacionesBonificaciones;
	}
	
	public JButton getjButtonCancelarToolBarEvaluacionesBonificaciones() {
		return this.jButtonCancelarToolBarEvaluacionesBonificaciones;
	}		
	
	public JButton getjButtonProcesarInformacionEvaluacionesBonificaciones() {
		return this.jButtonProcesarInformacionEvaluacionesBonificaciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEvaluacionesBonificaciones)	{
		this.jButtonProcesarInformacionEvaluacionesBonificaciones = jButtonProcesarInformacionEvaluacionesBonificaciones;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEvaluacionesBonificaciones() {
		return this.jComboBoxTiposAccionesEvaluacionesBonificaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEvaluacionesBonificaciones(
			JComboBox jComboBoxTiposRelacionesEvaluacionesBonificaciones) {
		this.jComboBoxTiposRelacionesEvaluacionesBonificaciones = jComboBoxTiposRelacionesEvaluacionesBonificaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEvaluacionesBonificaciones(
			JComboBox jComboBoxTiposAccionesEvaluacionesBonificaciones) {
		this.jComboBoxTiposAccionesEvaluacionesBonificaciones = jComboBoxTiposAccionesEvaluacionesBonificaciones;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEvaluacionesBonificaciones() {
		return this.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEvaluacionesBonificaciones(
			JComboBox jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones) {
		this.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones = jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.evaluacionesbonificacionesSessionBean=new EvaluacionesBonificacionesSessionBean();
		
		this.evaluacionesbonificacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionesbonificacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EvaluacionesBonificacionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EvaluacionesBonificacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EvaluacionesBonificacionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Evaluaciones Bonificaciones MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
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
	
		EvaluacionesBonificacionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEvaluacionesBonificaciones= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEvaluacionesBonificaciones=new JButtonMe();
				this.jButtonModificarToolBarEvaluacionesBonificaciones=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEvaluacionesBonificaciones,this.jTtoolBarDetalleEvaluacionesBonificaciones,
							"actualizar","actualizar","Actualizar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEvaluacionesBonificaciones,this.jTtoolBarDetalleEvaluacionesBonificaciones,
							"eliminar","eliminar","Eliminar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEvaluacionesBonificaciones,this.jTtoolBarDetalleEvaluacionesBonificaciones,
							"cancelar","cancelar","Cancelar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEvaluacionesBonificaciones,this.jTtoolBarDetalleEvaluacionesBonificaciones,
							"guardarcambios","guardarcambios","Guardar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEvaluacionesBonificaciones=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEvaluacionesBonificaciones=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEvaluacionesBonificaciones=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEvaluacionesBonificaciones=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEvaluacionesBonificaciones=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEvaluacionesBonificaciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEvaluacionesBonificaciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEvaluacionesBonificaciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEvaluacionesBonificaciones= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEvaluacionesBonificaciones.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEvaluacionesBonificaciones,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEvaluacionesBonificaciones= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEvaluacionesBonificaciones.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEvaluacionesBonificaciones,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEvaluacionesBonificaciones= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEvaluacionesBonificaciones.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEvaluacionesBonificaciones,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEvaluacionesBonificaciones= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEvaluacionesBonificaciones.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEvaluacionesBonificaciones,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEvaluacionesBonificaciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEvaluacionesBonificaciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEvaluacionesBonificaciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEvaluacionesBonificaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEvaluacionesBonificaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEvaluacionesBonificaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEvaluacionesBonificaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEvaluacionesBonificaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEvaluacionesBonificaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEvaluacionesBonificaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEvaluacionesBonificaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEvaluacionesBonificaciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEvaluacionesBonificaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEvaluacionesBonificaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEvaluacionesBonificaciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEvaluacionesBonificaciones.add(this.jMenuItemDetalleCerrarEvaluacionesBonificaciones);
		
		this.jmenuDetalleAccionesEvaluacionesBonificaciones.add(this.jMenuItemActualizarEvaluacionesBonificaciones);
		this.jmenuDetalleAccionesEvaluacionesBonificaciones.add(this.jMenuItemEliminarEvaluacionesBonificaciones);
		this.jmenuDetalleAccionesEvaluacionesBonificaciones.add(this.jMenuItemCancelarEvaluacionesBonificaciones);		
		
		//this.jmenuDetalleDatosEvaluacionesBonificaciones.add(this.jMenuItemDetalleAbrirOrderByEvaluacionesBonificaciones);				
		this.jmenuDetalleDatosEvaluacionesBonificaciones.add(this.jMenuItemDetalleMostarOcultarEvaluacionesBonificaciones);				
				
		//this.jmenuDetalleAccionesEvaluacionesBonificaciones.add(this.jMenuItemGuardarCambiosEvaluacionesBonificaciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEvaluacionesBonificaciones.add(this.jmenuDetalleArchivoEvaluacionesBonificaciones);		
		this.jmenuBarDetalleEvaluacionesBonificaciones.add(this.jmenuDetalleAccionesEvaluacionesBonificaciones);		
		this.jmenuBarDetalleEvaluacionesBonificaciones.add(this.jmenuDetalleDatosEvaluacionesBonificaciones);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEvaluacionesBonificaciones);				
	}
	
	
	public void inicializarElementosCamposEvaluacionesBonificaciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEvaluacionesBonificaciones = new JLabelMe();
		jLabelIdEvaluacionesBonificaciones.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEvaluacionesBonificaciones = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEvaluacionesBonificaciones= new GridBagLayout();

		this.jPanelidEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);

		jLabelidEvaluacionesBonificaciones = new JLabel();
		jLabelidEvaluacionesBonificaciones.setText("Id");

		jLabelidEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelverificadoEvaluacionesBonificaciones = new JLabelMe();
		this.jLabelverificadoEvaluacionesBonificaciones.setText(""+EvaluacionesBonificacionesConstantesFunciones.LABEL_VERIFICADO+" : *");
		this.jLabelverificadoEvaluacionesBonificaciones.setToolTipText("Verificado");
		this.jLabelverificadoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelverificadoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelverificadoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelverificadoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelverificadoEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelverificadoEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_VERIFICADO);
		this.gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		this.jPanelverificadoEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);


		jCheckBoxverificadoEvaluacionesBonificaciones= new JCheckBoxMe();
		jCheckBoxverificadoEvaluacionesBonificaciones.setEnabled(false);

		jCheckBoxverificadoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxverificadoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxverificadoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxverificadoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonverificadoEvaluacionesBonificacionesBusqueda= new JButtonMe();
		this.jButtonverificadoEvaluacionesBonificacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonverificadoEvaluacionesBonificacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonverificadoEvaluacionesBonificacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonverificadoEvaluacionesBonificacionesBusqueda.setText("U");
		this.jButtonverificadoEvaluacionesBonificacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonverificadoEvaluacionesBonificacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonverificadoEvaluacionesBonificacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxverificadoEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxverificadoEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"verificadoEvaluacionesBonificacionesBusqueda"));

		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonverificadoEvaluacionesBonificacionesBusqueda.setVisible(false);		}


					
		this.jLabelcodigoEvaluacionesBonificaciones = new JLabelMe();
		this.jLabelcodigoEvaluacionesBonificaciones.setText(""+EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEvaluacionesBonificaciones.setToolTipText("Codigo");
		this.jLabelcodigoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		this.jPanelcodigoEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);


		jTextFieldcodigoEvaluacionesBonificaciones= new JTextFieldMe();

		jTextFieldcodigoEvaluacionesBonificaciones.setEnabled(false);
		jTextFieldcodigoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEvaluacionesBonificacionesBusqueda= new JButtonMe();
		this.jButtoncodigoEvaluacionesBonificacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEvaluacionesBonificacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEvaluacionesBonificacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEvaluacionesBonificacionesBusqueda.setText("U");
		this.jButtoncodigoEvaluacionesBonificacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEvaluacionesBonificacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEvaluacionesBonificacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEvaluacionesBonificacionesBusqueda"));

		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEvaluacionesBonificacionesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_datoEvaluacionesBonificaciones = new JLabelMe();
		this.jLabelcodigo_datoEvaluacionesBonificaciones.setText(""+EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO+" : *");
		this.jLabelcodigo_datoEvaluacionesBonificaciones.setToolTipText("Codigo Dato");
		this.jLabelcodigo_datoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_datoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_datoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_datoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_datoEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_datoEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO);
		this.gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		this.jPanelcodigo_datoEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);


		jTextFieldcodigo_datoEvaluacionesBonificaciones= new JTextFieldMe();

		jTextFieldcodigo_datoEvaluacionesBonificaciones.setEnabled(false);
		jTextFieldcodigo_datoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_datoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_datoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_datoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_datoEvaluacionesBonificacionesBusqueda= new JButtonMe();
		this.jButtoncodigo_datoEvaluacionesBonificacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_datoEvaluacionesBonificacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_datoEvaluacionesBonificacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_datoEvaluacionesBonificacionesBusqueda.setText("U");
		this.jButtoncodigo_datoEvaluacionesBonificacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_datoEvaluacionesBonificacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_datoEvaluacionesBonificacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_datoEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_datoEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_datoEvaluacionesBonificacionesBusqueda"));

		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_datoEvaluacionesBonificacionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoEvaluacionesBonificaciones = new JLabelMe();
		this.jLabelnombre_completoEvaluacionesBonificaciones.setText(""+EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoEvaluacionesBonificaciones.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		this.jPanelnombre_completoEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);


		jTextAreanombre_completoEvaluacionesBonificaciones= new JTextAreaMe();
		jTextAreanombre_completoEvaluacionesBonificaciones.setEnabled(false);
		jTextAreanombre_completoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoEvaluacionesBonificaciones.setLineWrap(true);
		jTextAreanombre_completoEvaluacionesBonificaciones.setWrapStyleWord(true);
		jTextAreanombre_completoEvaluacionesBonificaciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoEvaluacionesBonificaciones.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoEvaluacionesBonificaciones = new JScrollPane(jTextAreanombre_completoEvaluacionesBonificaciones);
		jscrollPanenombre_completoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_completoEvaluacionesBonificacionesBusqueda= new JButtonMe();
		this.jButtonnombre_completoEvaluacionesBonificacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoEvaluacionesBonificacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoEvaluacionesBonificacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoEvaluacionesBonificacionesBusqueda.setText("U");
		this.jButtonnombre_completoEvaluacionesBonificacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoEvaluacionesBonificacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoEvaluacionesBonificacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoEvaluacionesBonificacionesBusqueda"));

		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoEvaluacionesBonificacionesBusqueda.setVisible(false);		}


					
		this.jLabelsueldoEvaluacionesBonificaciones = new JLabelMe();
		this.jLabelsueldoEvaluacionesBonificaciones.setText(""+EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO+" : *");
		this.jLabelsueldoEvaluacionesBonificaciones.setToolTipText("Sueldo");
		this.jLabelsueldoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsueldoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsueldoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsueldoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsueldoEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsueldoEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO);
		this.gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		this.jPanelsueldoEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);


		jTextFieldsueldoEvaluacionesBonificaciones= new JTextFieldMe();
		jTextFieldsueldoEvaluacionesBonificaciones.setEnabled(false);
		jTextFieldsueldoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsueldoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsueldoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsueldoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsueldoEvaluacionesBonificaciones.setText("0.0");

		this.jButtonsueldoEvaluacionesBonificacionesBusqueda= new JButtonMe();
		this.jButtonsueldoEvaluacionesBonificacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsueldoEvaluacionesBonificacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsueldoEvaluacionesBonificacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsueldoEvaluacionesBonificacionesBusqueda.setText("U");
		this.jButtonsueldoEvaluacionesBonificacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsueldoEvaluacionesBonificacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsueldoEvaluacionesBonificacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsueldoEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsueldoEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sueldoEvaluacionesBonificacionesBusqueda"));

		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsueldoEvaluacionesBonificacionesBusqueda.setVisible(false);		}


					
		this.jLabelvalor_conocimientoEvaluacionesBonificaciones = new JLabelMe();
		this.jLabelvalor_conocimientoEvaluacionesBonificaciones.setText(""+EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO+" : *");
		this.jLabelvalor_conocimientoEvaluacionesBonificaciones.setToolTipText("Valor Conocimiento");
		this.jLabelvalor_conocimientoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_conocimientoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_conocimientoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_conocimientoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_conocimientoEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_conocimientoEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO);
		this.gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		this.jPanelvalor_conocimientoEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);


		jTextFieldvalor_conocimientoEvaluacionesBonificaciones= new JTextFieldMe();
		jTextFieldvalor_conocimientoEvaluacionesBonificaciones.setEnabled(false);
		jTextFieldvalor_conocimientoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_conocimientoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_conocimientoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_conocimientoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_conocimientoEvaluacionesBonificaciones.setText("0.0");

		this.jButtonvalor_conocimientoEvaluacionesBonificacionesBusqueda= new JButtonMe();
		this.jButtonvalor_conocimientoEvaluacionesBonificacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_conocimientoEvaluacionesBonificacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_conocimientoEvaluacionesBonificacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_conocimientoEvaluacionesBonificacionesBusqueda.setText("U");
		this.jButtonvalor_conocimientoEvaluacionesBonificacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_conocimientoEvaluacionesBonificacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_conocimientoEvaluacionesBonificacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_conocimientoEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_conocimientoEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_conocimientoEvaluacionesBonificacionesBusqueda"));

		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_conocimientoEvaluacionesBonificacionesBusqueda.setVisible(false);		}


					
		this.jLabelvalor_eficienciaEvaluacionesBonificaciones = new JLabelMe();
		this.jLabelvalor_eficienciaEvaluacionesBonificaciones.setText(""+EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA+" : *");
		this.jLabelvalor_eficienciaEvaluacionesBonificaciones.setToolTipText("Valor Eficiencia");
		this.jLabelvalor_eficienciaEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_eficienciaEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_eficienciaEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_eficienciaEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_eficienciaEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_eficienciaEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA);
		this.gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		this.jPanelvalor_eficienciaEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);


		jTextFieldvalor_eficienciaEvaluacionesBonificaciones= new JTextFieldMe();
		jTextFieldvalor_eficienciaEvaluacionesBonificaciones.setEnabled(false);
		jTextFieldvalor_eficienciaEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_eficienciaEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_eficienciaEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_eficienciaEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_eficienciaEvaluacionesBonificaciones.setText("0.0");

		this.jButtonvalor_eficienciaEvaluacionesBonificacionesBusqueda= new JButtonMe();
		this.jButtonvalor_eficienciaEvaluacionesBonificacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_eficienciaEvaluacionesBonificacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_eficienciaEvaluacionesBonificacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_eficienciaEvaluacionesBonificacionesBusqueda.setText("U");
		this.jButtonvalor_eficienciaEvaluacionesBonificacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_eficienciaEvaluacionesBonificacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_eficienciaEvaluacionesBonificacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_eficienciaEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_eficienciaEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_eficienciaEvaluacionesBonificacionesBusqueda"));

		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_eficienciaEvaluacionesBonificacionesBusqueda.setVisible(false);		}


					
		this.jLabelvalor_obtenidoEvaluacionesBonificaciones = new JLabelMe();
		this.jLabelvalor_obtenidoEvaluacionesBonificaciones.setText(""+EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO+" : *");
		this.jLabelvalor_obtenidoEvaluacionesBonificaciones.setToolTipText("Valor Obtenido");
		this.jLabelvalor_obtenidoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_obtenidoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_obtenidoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_obtenidoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_obtenidoEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_obtenidoEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO);
		this.gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		this.jPanelvalor_obtenidoEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);


		jTextFieldvalor_obtenidoEvaluacionesBonificaciones= new JTextFieldMe();
		jTextFieldvalor_obtenidoEvaluacionesBonificaciones.setEnabled(false);
		jTextFieldvalor_obtenidoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_obtenidoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_obtenidoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_obtenidoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_obtenidoEvaluacionesBonificaciones.setText("0.0");

		this.jButtonvalor_obtenidoEvaluacionesBonificacionesBusqueda= new JButtonMe();
		this.jButtonvalor_obtenidoEvaluacionesBonificacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_obtenidoEvaluacionesBonificacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_obtenidoEvaluacionesBonificacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_obtenidoEvaluacionesBonificacionesBusqueda.setText("U");
		this.jButtonvalor_obtenidoEvaluacionesBonificacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_obtenidoEvaluacionesBonificacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_obtenidoEvaluacionesBonificacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_obtenidoEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_obtenidoEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_obtenidoEvaluacionesBonificacionesBusqueda"));

		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_obtenidoEvaluacionesBonificacionesBusqueda.setVisible(false);		}


					
		this.jLabelvalor_pesoEvaluacionesBonificaciones = new JLabelMe();
		this.jLabelvalor_pesoEvaluacionesBonificaciones.setText(""+EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO+" : *");
		this.jLabelvalor_pesoEvaluacionesBonificaciones.setToolTipText("Valor Peso");
		this.jLabelvalor_pesoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pesoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pesoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_pesoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_pesoEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_pesoEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO);
		this.gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		this.jPanelvalor_pesoEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);


		jTextFieldvalor_pesoEvaluacionesBonificaciones= new JTextFieldMe();
		jTextFieldvalor_pesoEvaluacionesBonificaciones.setEnabled(false);
		jTextFieldvalor_pesoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pesoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pesoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_pesoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_pesoEvaluacionesBonificaciones.setText("0.0");

		this.jButtonvalor_pesoEvaluacionesBonificacionesBusqueda= new JButtonMe();
		this.jButtonvalor_pesoEvaluacionesBonificacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pesoEvaluacionesBonificacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pesoEvaluacionesBonificacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_pesoEvaluacionesBonificacionesBusqueda.setText("U");
		this.jButtonvalor_pesoEvaluacionesBonificacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_pesoEvaluacionesBonificacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_pesoEvaluacionesBonificacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_pesoEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_pesoEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_pesoEvaluacionesBonificacionesBusqueda"));

		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_pesoEvaluacionesBonificacionesBusqueda.setVisible(false);		}


					
		this.jLabelbonificacionEvaluacionesBonificaciones = new JLabelMe();
		this.jLabelbonificacionEvaluacionesBonificaciones.setText(""+EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION+" : *");
		this.jLabelbonificacionEvaluacionesBonificaciones.setToolTipText("Bonificacion");
		this.jLabelbonificacionEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbonificacionEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbonificacionEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbonificacionEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbonificacionEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbonificacionEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION);
		this.gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		this.jPanelbonificacionEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);


		jTextFieldbonificacionEvaluacionesBonificaciones= new JTextFieldMe();
		jTextFieldbonificacionEvaluacionesBonificaciones.setEnabled(false);
		jTextFieldbonificacionEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbonificacionEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbonificacionEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbonificacionEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbonificacionEvaluacionesBonificaciones.setText("0.0");

		this.jButtonbonificacionEvaluacionesBonificacionesBusqueda= new JButtonMe();
		this.jButtonbonificacionEvaluacionesBonificacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbonificacionEvaluacionesBonificacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbonificacionEvaluacionesBonificacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbonificacionEvaluacionesBonificacionesBusqueda.setText("U");
		this.jButtonbonificacionEvaluacionesBonificacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbonificacionEvaluacionesBonificacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbonificacionEvaluacionesBonificacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbonificacionEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbonificacionEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"bonificacionEvaluacionesBonificacionesBusqueda"));

		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbonificacionEvaluacionesBonificacionesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEvaluacionesBonificaciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesBonificaciones = new JLabelMe();
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setText(""+EvaluacionesBonificacionesConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO+" : *");
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setToolTipText("Tipo Calificacion Empleado");
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_calificacion_empleadoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_calificacion_empleadoEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
		this.gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		this.jPanelid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);


		jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones= new JComboBoxMe();
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificaciones= new JButtonMe();
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setText("Buscar");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificaciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calificacion_empleadoEvaluacionesBonificaciones"));

		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda= new JButtonMe();
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda.setText("U");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda"));

		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda.setVisible(false);		}

		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate= new JButtonMe();
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate.setText("U");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate"));



					
		this.jLabelid_estructuraEvaluacionesBonificaciones = new JLabelMe();
		this.jLabelid_estructuraEvaluacionesBonificaciones.setText(""+EvaluacionesBonificacionesConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraEvaluacionesBonificaciones.setToolTipText("Estructura");
		this.jLabelid_estructuraEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		this.jPanelid_estructuraEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);


		jComboBoxid_estructuraEvaluacionesBonificaciones= new JComboBoxMe();
		jComboBoxid_estructuraEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraEvaluacionesBonificaciones= new JButtonMe();
		this.jButtonid_estructuraEvaluacionesBonificaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionesBonificaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionesBonificaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionesBonificaciones.setText("Buscar");
		this.jButtonid_estructuraEvaluacionesBonificaciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraEvaluacionesBonificaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionesBonificaciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionesBonificaciones"));

		this.jButtonid_estructuraEvaluacionesBonificacionesBusqueda= new JButtonMe();
		this.jButtonid_estructuraEvaluacionesBonificacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionesBonificacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionesBonificacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEvaluacionesBonificacionesBusqueda.setText("U");
		this.jButtonid_estructuraEvaluacionesBonificacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraEvaluacionesBonificacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionesBonificacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionesBonificacionesBusqueda"));

		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraEvaluacionesBonificacionesBusqueda.setVisible(false);		}

		this.jButtonid_estructuraEvaluacionesBonificacionesUpdate= new JButtonMe();
		this.jButtonid_estructuraEvaluacionesBonificacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionesBonificacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionesBonificacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEvaluacionesBonificacionesUpdate.setText("U");
		this.jButtonid_estructuraEvaluacionesBonificacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraEvaluacionesBonificacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionesBonificacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionesBonificacionesUpdate"));



					
		this.jLabelid_empresaEvaluacionesBonificaciones = new JLabelMe();
		this.jLabelid_empresaEvaluacionesBonificaciones.setText(""+EvaluacionesBonificacionesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEvaluacionesBonificaciones.setToolTipText("Empresa");
		this.jLabelid_empresaEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		this.jPanelid_empresaEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);


		jComboBoxid_empresaEvaluacionesBonificaciones= new JComboBoxMe();
		jComboBoxid_empresaEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEvaluacionesBonificaciones.setEnabled(false);

		this.jButtonid_empresaEvaluacionesBonificaciones= new JButtonMe();
		this.jButtonid_empresaEvaluacionesBonificaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionesBonificaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionesBonificaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionesBonificaciones.setText("Buscar");
		this.jButtonid_empresaEvaluacionesBonificaciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEvaluacionesBonificaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionesBonificaciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionesBonificaciones"));

		this.jButtonid_empresaEvaluacionesBonificacionesBusqueda= new JButtonMe();
		this.jButtonid_empresaEvaluacionesBonificacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionesBonificacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionesBonificacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEvaluacionesBonificacionesBusqueda.setText("U");
		this.jButtonid_empresaEvaluacionesBonificacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEvaluacionesBonificacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionesBonificacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionesBonificacionesBusqueda"));

		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEvaluacionesBonificacionesBusqueda.setVisible(false);		}

		this.jButtonid_empresaEvaluacionesBonificacionesUpdate= new JButtonMe();
		this.jButtonid_empresaEvaluacionesBonificacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionesBonificacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionesBonificacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEvaluacionesBonificacionesUpdate.setText("U");
		this.jButtonid_empresaEvaluacionesBonificacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEvaluacionesBonificacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionesBonificacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionesBonificacionesUpdate"));



					
		this.jLabelid_sucursalEvaluacionesBonificaciones = new JLabelMe();
		this.jLabelid_sucursalEvaluacionesBonificaciones.setText(""+EvaluacionesBonificacionesConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalEvaluacionesBonificaciones.setToolTipText("Sucursal");
		this.jLabelid_sucursalEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalEvaluacionesBonificaciones.setToolTipText(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		this.jPanelid_sucursalEvaluacionesBonificaciones.setLayout(this.gridaBagLayoutEvaluacionesBonificaciones);


		jComboBoxid_sucursalEvaluacionesBonificaciones= new JComboBoxMe();
		jComboBoxid_sucursalEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalEvaluacionesBonificaciones.setEnabled(false);

		this.jButtonid_sucursalEvaluacionesBonificaciones= new JButtonMe();
		this.jButtonid_sucursalEvaluacionesBonificaciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionesBonificaciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionesBonificaciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionesBonificaciones.setText("Buscar");
		this.jButtonid_sucursalEvaluacionesBonificaciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalEvaluacionesBonificaciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionesBonificaciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionesBonificaciones"));

		this.jButtonid_sucursalEvaluacionesBonificacionesBusqueda= new JButtonMe();
		this.jButtonid_sucursalEvaluacionesBonificacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionesBonificacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionesBonificacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEvaluacionesBonificacionesBusqueda.setText("U");
		this.jButtonid_sucursalEvaluacionesBonificacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalEvaluacionesBonificacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionesBonificacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionesBonificacionesBusqueda"));

		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalEvaluacionesBonificacionesBusqueda.setVisible(false);		}

		this.jButtonid_sucursalEvaluacionesBonificacionesUpdate= new JButtonMe();
		this.jButtonid_sucursalEvaluacionesBonificacionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionesBonificacionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionesBonificacionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEvaluacionesBonificacionesUpdate.setText("U");
		this.jButtonid_sucursalEvaluacionesBonificacionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalEvaluacionesBonificacionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionesBonificacionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionesBonificacionesUpdate"));



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
		//this.jInternalFrameDetalleEvaluacionesBonificaciones = new EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Evaluaciones Bonificaciones DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEvaluacionesBonificaciones= new GridBagLayout();
		

		
		String sToolTipEvaluacionesBonificaciones="";
		sToolTipEvaluacionesBonificaciones=EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEvaluacionesBonificaciones+="(Nomina.EvaluacionesBonificaciones)";
		}
		
		if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipEvaluacionesBonificaciones+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonModificarEvaluacionesBonificaciones = new JButtonMe();
        this.jButtonActualizarEvaluacionesBonificaciones = new JButtonMe();
        this.jButtonEliminarEvaluacionesBonificaciones = new JButtonMe();
        this.jButtonCancelarEvaluacionesBonificaciones = new JButtonMe();
        this.jButtonGuardarCambiosEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonCerrarEvaluacionesBonificaciones = new JButtonMe();
		
		this.jScrollPanelDatosEvaluacionesBonificaciones = new JScrollPane();   
        this.jScrollPanelDatosEdicionEvaluacionesBonificaciones = new JScrollPane();
		this.jScrollPanelDatosGeneralEvaluacionesBonificaciones = new JScrollPane();
				
		
		
		this.jPanelCamposEvaluacionesBonificaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEvaluacionesBonificaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEvaluacionesBonificaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEvaluacionesBonificaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Evaluaciones Bonificaciones";
		
		if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Bonificacioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosEvaluacionesBonificaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEvaluacionesBonificaciones.setName("jPanelCamposEvaluacionesBonificaciones"); 

		this.jPanelCamposOcultosEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEvaluacionesBonificaciones.setName("jPanelCamposOcultosEvaluacionesBonificaciones"); 

        this.jPanelAccionesEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEvaluacionesBonificaciones.setToolTipText("Acciones");
        this.jPanelAccionesEvaluacionesBonificaciones.setName("Acciones"); 

		this.jPanelAccionesFormularioEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEvaluacionesBonificaciones.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEvaluacionesBonificaciones.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEvaluacionesBonificaciones.setText("Nuevo");
		this.jButtonModificarEvaluacionesBonificaciones.setText("Editar");
        this.jButtonActualizarEvaluacionesBonificaciones.setText("Actualizar");
        this.jButtonEliminarEvaluacionesBonificaciones.setText("Eliminar");
        this.jButtonCancelarEvaluacionesBonificaciones.setText("Cancelar");
        this.jButtonGuardarCambiosEvaluacionesBonificaciones.setText("Guardar");
		this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones.setText("Guardar");
		this.jButtonCerrarEvaluacionesBonificaciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEvaluacionesBonificaciones,"nuevo_button","Nuevo",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEvaluacionesBonificaciones,"modificar_button","Editar",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEvaluacionesBonificaciones,"actualizar_button","Actualizar",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEvaluacionesBonificaciones,"eliminar_button","Eliminar",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEvaluacionesBonificaciones,"cancelar_button","Cancelar",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEvaluacionesBonificaciones,"guardarcambios_button","Guardar",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones,"guardarcambiostabla_button","Guardar",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEvaluacionesBonificaciones,"cerrar_button","Salir",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEvaluacionesBonificaciones.setToolTipText("Nuevo"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEvaluacionesBonificaciones.setToolTipText("Editar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEvaluacionesBonificaciones.setToolTipText("Actualizar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEvaluacionesBonificaciones.setToolTipText("Eliminar)"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEvaluacionesBonificaciones.setToolTipText("Cancelar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEvaluacionesBonificaciones.setToolTipText("Guardar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones.setToolTipText("Guardar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEvaluacionesBonificaciones.setToolTipText("Salir"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEvaluacionesBonificaciones";
		inputMap = this.jButtonNuevoEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEvaluacionesBonificaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEvaluacionesBonificaciones"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEvaluacionesBonificaciones";
		inputMap = this.jButtonActualizarEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEvaluacionesBonificaciones"));
		
		//ELIMINAR
		sMapKey = "EliminarEvaluacionesBonificaciones";
		inputMap = this.jButtonEliminarEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEvaluacionesBonificaciones"));
		
		//CANCELAR	
		sMapKey = "CancelarEvaluacionesBonificaciones";
		inputMap = this.jButtonCancelarEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEvaluacionesBonificaciones"));
		
		//CERRAR		
		sMapKey = "CerrarEvaluacionesBonificaciones";
		inputMap = this.jButtonCerrarEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEvaluacionesBonificaciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEvaluacionesBonificaciones";
		inputMap = this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEvaluacionesBonificaciones"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEvaluacionesBonificaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEvaluacionesBonificaciones.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEvaluacionesBonificaciones.setToolTipText("Nuevo EvaluacionesBonificaciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEvaluacionesBonificaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEvaluacionesBonificaciones.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEvaluacionesBonificaciones.setToolTipText("Sin Cerrar Ventana EvaluacionesBonificaciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEvaluacionesBonificaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEvaluacionesBonificaciones.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEvaluacionesBonificaciones.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEvaluacionesBonificaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setText("Accion");
		this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEvaluacionesBonificaciones = new JLabelMe();
		
		this.jLabelAccionesEvaluacionesBonificaciones.setText("Acciones");		
		this.jLabelAccionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEvaluacionesBonificaciones();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEvaluacionesBonificaciones();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEvaluacionesBonificaciones=new JTabbedPane();
		this.jTabbedPaneRelacionesEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEvaluacionesBonificaciones = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEvaluacionesBonificaciones = new GridBagLayout();
		
		this.jPanelCamposEvaluacionesBonificaciones.setLayout(gridaBagLayoutCamposEvaluacionesBonificaciones);
		this.jPanelCamposOcultosEvaluacionesBonificaciones.setLayout(gridaBagLayoutCamposOcultosEvaluacionesBonificaciones);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEvaluacionesBonificaciones.add(jLabelIdEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEvaluacionesBonificaciones.add(jLabelidEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_calificacion_empleadoEvaluacionesBonificaciones.add(jLabelid_tipo_calificacion_empleadoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 2;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_calificacion_empleadoEvaluacionesBonificaciones.add(jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 3;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_calificacion_empleadoEvaluacionesBonificaciones.add(jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_calificacion_empleadoEvaluacionesBonificaciones.add(jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelverificadoEvaluacionesBonificaciones.add(jLabelverificadoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 2;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelverificadoEvaluacionesBonificaciones.add(jButtonverificadoEvaluacionesBonificacionesBusqueda, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelverificadoEvaluacionesBonificaciones.add(jCheckBoxverificadoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraEvaluacionesBonificaciones.add(jLabelid_estructuraEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 2;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEvaluacionesBonificaciones.add(jButtonid_estructuraEvaluacionesBonificacionesBusqueda, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 3;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEvaluacionesBonificaciones.add(jButtonid_estructuraEvaluacionesBonificacionesUpdate, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraEvaluacionesBonificaciones.add(jComboBoxid_estructuraEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEvaluacionesBonificaciones.add(jLabelcodigoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 2;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEvaluacionesBonificaciones.add(jButtoncodigoEvaluacionesBonificacionesBusqueda, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEvaluacionesBonificaciones.add(jTextFieldcodigoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEvaluacionesBonificaciones.add(jLabelid_empresaEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 2;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEvaluacionesBonificaciones.add(jButtonid_empresaEvaluacionesBonificacionesBusqueda, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 3;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEvaluacionesBonificaciones.add(jButtonid_empresaEvaluacionesBonificacionesUpdate, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEvaluacionesBonificaciones.add(jComboBoxid_empresaEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalEvaluacionesBonificaciones.add(jLabelid_sucursalEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 2;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEvaluacionesBonificaciones.add(jButtonid_sucursalEvaluacionesBonificacionesBusqueda, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 3;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEvaluacionesBonificaciones.add(jButtonid_sucursalEvaluacionesBonificacionesUpdate, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalEvaluacionesBonificaciones.add(jComboBoxid_sucursalEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_datoEvaluacionesBonificaciones.add(jLabelcodigo_datoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 2;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_datoEvaluacionesBonificaciones.add(jButtoncodigo_datoEvaluacionesBonificacionesBusqueda, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_datoEvaluacionesBonificaciones.add(jTextFieldcodigo_datoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoEvaluacionesBonificaciones.add(jLabelnombre_completoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 2;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoEvaluacionesBonificaciones.add(jButtonnombre_completoEvaluacionesBonificacionesBusqueda, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoEvaluacionesBonificaciones.add(jscrollPanenombre_completoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsueldoEvaluacionesBonificaciones.add(jLabelsueldoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 2;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelsueldoEvaluacionesBonificaciones.add(jButtonsueldoEvaluacionesBonificacionesBusqueda, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsueldoEvaluacionesBonificaciones.add(jTextFieldsueldoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_conocimientoEvaluacionesBonificaciones.add(jLabelvalor_conocimientoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 2;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_conocimientoEvaluacionesBonificaciones.add(jButtonvalor_conocimientoEvaluacionesBonificacionesBusqueda, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_conocimientoEvaluacionesBonificaciones.add(jTextFieldvalor_conocimientoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_eficienciaEvaluacionesBonificaciones.add(jLabelvalor_eficienciaEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 2;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_eficienciaEvaluacionesBonificaciones.add(jButtonvalor_eficienciaEvaluacionesBonificacionesBusqueda, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_eficienciaEvaluacionesBonificaciones.add(jTextFieldvalor_eficienciaEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_obtenidoEvaluacionesBonificaciones.add(jLabelvalor_obtenidoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 2;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_obtenidoEvaluacionesBonificaciones.add(jButtonvalor_obtenidoEvaluacionesBonificacionesBusqueda, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_obtenidoEvaluacionesBonificaciones.add(jTextFieldvalor_obtenidoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_pesoEvaluacionesBonificaciones.add(jLabelvalor_pesoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 2;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_pesoEvaluacionesBonificaciones.add(jButtonvalor_pesoEvaluacionesBonificacionesBusqueda, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_pesoEvaluacionesBonificaciones.add(jTextFieldvalor_pesoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbonificacionEvaluacionesBonificaciones.add(jLabelbonificacionEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 2;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelbonificacionEvaluacionesBonificaciones.add(jButtonbonificacionEvaluacionesBonificacionesBusqueda, this.gridBagConstraintsEvaluacionesBonificaciones);
	}

	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbonificacionEvaluacionesBonificaciones.add(jTextFieldbonificacionEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesBonificaciones.add(this.jPanelidEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposEvaluacionesBonificaciones=0;
		iYPanelCamposEvaluacionesBonificaciones++;
	}
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesBonificaciones.add(this.jPanelid_tipo_calificacion_empleadoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposEvaluacionesBonificaciones=0;
		iYPanelCamposEvaluacionesBonificaciones++;
	}
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesBonificaciones.add(this.jPanelverificadoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposEvaluacionesBonificaciones=0;
		iYPanelCamposEvaluacionesBonificaciones++;
	}
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesBonificaciones.add(this.jPanelid_estructuraEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposEvaluacionesBonificaciones=0;
		iYPanelCamposEvaluacionesBonificaciones++;
	}
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesBonificaciones.add(this.jPanelcodigoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposEvaluacionesBonificaciones=0;
		iYPanelCamposEvaluacionesBonificaciones++;
	}
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesBonificaciones.add(this.jPanelcodigo_datoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposEvaluacionesBonificaciones=0;
		iYPanelCamposEvaluacionesBonificaciones++;
	}
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesBonificaciones.add(this.jPanelnombre_completoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposEvaluacionesBonificaciones=0;
		iYPanelCamposEvaluacionesBonificaciones++;
	}
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesBonificaciones.add(this.jPanelsueldoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposEvaluacionesBonificaciones=0;
		iYPanelCamposEvaluacionesBonificaciones++;
	}
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesBonificaciones.add(this.jPanelvalor_conocimientoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposEvaluacionesBonificaciones=0;
		iYPanelCamposEvaluacionesBonificaciones++;
	}
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesBonificaciones.add(this.jPanelvalor_eficienciaEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposEvaluacionesBonificaciones=0;
		iYPanelCamposEvaluacionesBonificaciones++;
	}
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesBonificaciones.add(this.jPanelvalor_obtenidoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposEvaluacionesBonificaciones=0;
		iYPanelCamposEvaluacionesBonificaciones++;
	}
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesBonificaciones.add(this.jPanelvalor_pesoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposEvaluacionesBonificaciones=0;
		iYPanelCamposEvaluacionesBonificaciones++;
	}
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesBonificaciones.add(this.jPanelbonificacionEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposEvaluacionesBonificaciones=0;
		iYPanelCamposEvaluacionesBonificaciones++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposOcultosEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposOcultosEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionesBonificaciones.add(this.jPanelid_empresaEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposOcultosEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposOcultosEvaluacionesBonificaciones=0;
		iYPanelCamposOcultosEvaluacionesBonificaciones++;
	}
	this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iYPanelCamposOcultosEvaluacionesBonificaciones;
	this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iXPanelCamposOcultosEvaluacionesBonificaciones++;
	this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesBonificaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionesBonificaciones.add(this.jPanelid_sucursalEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);



	if(iXPanelCamposOcultosEvaluacionesBonificaciones % 2==0) {
		iXPanelCamposOcultosEvaluacionesBonificaciones=0;
		iYPanelCamposOcultosEvaluacionesBonificaciones++;
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
			
		GridBagLayout gridaBagLayoutAccionesEvaluacionesBonificaciones= new GridBagLayout();
		this.jPanelAccionesEvaluacionesBonificaciones.setLayout(gridaBagLayoutAccionesEvaluacionesBonificaciones);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEvaluacionesBonificaciones= new GridBagLayout();
		this.jPanelAccionesFormularioEvaluacionesBonificaciones.setLayout(gridaBagLayoutAccionesFormularioEvaluacionesBonificaciones);
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEvaluacionesBonificaciones.add(this.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXAccion++;
			
		this.jPanelAccionesEvaluacionesBonificaciones.add(this.jButtonModificarEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);							

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx =iPosXAccion++;
			
		this.jPanelAccionesEvaluacionesBonificaciones.add(this.jButtonEliminarEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
			
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesEvaluacionesBonificaciones.add(this.jButtonActualizarEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesEvaluacionesBonificaciones.add(this.jButtonGuardarCambiosEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);	
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx =iPosXAccion++;
		
		this.jPanelAccionesEvaluacionesBonificaciones.add(this.jButtonCancelarEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEvaluacionesBonificaciones);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();						
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;		
			//this.gridBagConstraintsEvaluacionesBonificaciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx =0;
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEvaluacionesBonificaciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EvaluacionesBonificacionesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEvaluacionesBonificaciones = new EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Evaluaciones Bonificaciones DATOS");
			
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
			
	        //this.setTitle("[FOR] - Evaluaciones Bonificaciones DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Evaluaciones Bonificaciones Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EvaluacionesBonificacionesModel evaluacionesbonificacionesModel=new EvaluacionesBonificacionesModel(this);
			
			//SI USARA CLASE INTERNA
			//EvaluacionesBonificacionesModel.EvaluacionesBonificacionesFocusTraversalPolicy evaluacionesbonificacionesFocusTraversalPolicy = evaluacionesbonificacionesModel.new EvaluacionesBonificacionesFocusTraversalPolicy(this);
			
			//evaluacionesbonificacionesFocusTraversalPolicy.setevaluacionesbonificacionesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(evaluacionesbonificacionesModel);
			
			
			this.jContentPaneDetalleEvaluacionesBonificaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEvaluacionesBonificaciones = new GridBagLayout();	
			this.jContentPaneDetalleEvaluacionesBonificaciones.setLayout(gridaBagLayoutDetalleEvaluacionesBonificaciones);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEvaluacionesBonificaciones = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
					
				
				this.jContentPaneDetalleEvaluacionesBonificaciones.add(jTtoolBarDetalleEvaluacionesBonificaciones, gridBagConstraintsEvaluacionesBonificaciones);								
				
}
			
			this.jScrollPanelDatosEdicionEvaluacionesBonificaciones=   new JScrollPane(jContentPaneDetalleEvaluacionesBonificaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEvaluacionesBonificaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionesBonificaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionesBonificaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEvaluacionesBonificaciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEvaluacionesBonificaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionesBonificaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionesBonificaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	        
			this.jContentPaneDetalleEvaluacionesBonificaciones.add(jPanelCamposEvaluacionesBonificaciones, gridBagConstraintsEvaluacionesBonificaciones);
			
			
			
			
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
						//&& evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEvaluacionesBonificaciones= new GridBagConstraints();
						this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
						this.jContentPaneDetalleEvaluacionesBonificaciones.add(this.jTabbedPaneRelacionesEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEvaluacionesBonificaciones.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEvaluacionesBonificaciones.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
					this.gridBagConstraintsEvaluacionesBonificaciones.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
					
				
					this.jContentPaneDetalleEvaluacionesBonificaciones.add(jPanelCamposOcultosEvaluacionesBonificaciones, gridBagConstraintsEvaluacionesBonificaciones);
				
					this.jPanelCamposOcultosEvaluacionesBonificaciones.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	        this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEvaluacionesBonificaciones.add(this.jPanelAccionesFormularioEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);							
			
			
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
	        this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
	        
			
			this.jContentPaneDetalleEvaluacionesBonificaciones.add(this.jPanelAccionesEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEvaluacionesBonificaciones);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEvaluacionesBonificaciones=   new JScrollPane(this.jPanelCamposEvaluacionesBonificaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEvaluacionesBonificaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionesBonificaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionesBonificaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEvaluacionesBonificaciones.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);			
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
			
			
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
			
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEvaluacionesBonificaciones;//jContentPane;
		
		return jScrollPanelDatosEdicionEvaluacionesBonificaciones;
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
