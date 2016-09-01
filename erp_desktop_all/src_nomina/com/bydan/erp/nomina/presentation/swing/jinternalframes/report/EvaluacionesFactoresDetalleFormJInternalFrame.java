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
import com.bydan.erp.nomina.util.report.EvaluacionesFactoresConstantesFunciones;

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
public class EvaluacionesFactoresDetalleFormJInternalFrame extends EvaluacionesFactoresBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEvaluacionesFactores;
	
	protected JMenuBar jmenuBarDetalleEvaluacionesFactores;
	
	protected JMenu jmenuDetalleEvaluacionesFactores;
	protected JMenu jmenuDetalleArchivoEvaluacionesFactores;
	protected JMenu jmenuDetalleAccionesEvaluacionesFactores;
	protected JMenu jmenuDetalleDatosEvaluacionesFactores;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEvaluacionesFactores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEvaluacionesFactores;	
	protected GridBagConstraints gridBagConstraintsEvaluacionesFactores;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EvaluacionesFactoresBeanSwingJInternalFrameAdditional jInternalFrameDetalleEvaluacionesFactores;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoCalificacionEmpleadoBeanSwingJInternalFrame tipocalificacionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocalificacionempleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomipreguntanomi="";
	
	public EvaluacionesFactoresSessionBean evaluacionesfactoresSessionBean;
	
	
	
	
	public TipoCalificacionEmpleadoSessionBean tipocalificacionempleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public FormatoNomiPreguntaNomiSessionBean formatonomipreguntanomiSessionBean;	
	
	public EvaluacionesFactoresLogic evaluacionesfactoresLogic;
	
	public JScrollPane jScrollPanelDatosEvaluacionesFactores;
	public JScrollPane jScrollPanelDatosEdicionEvaluacionesFactores;
	public JScrollPane jScrollPanelDatosGeneralEvaluacionesFactores;
	
	protected JPanel jPanelCamposEvaluacionesFactores;    
	protected JPanel jPanelCamposOcultosEvaluacionesFactores;    	
	protected JPanel jPanelAccionesEvaluacionesFactores;
	protected JPanel jPanelAccionesFormularioEvaluacionesFactores;
    
	
	
	protected Integer iXPanelCamposEvaluacionesFactores=0;
	protected Integer iYPanelCamposEvaluacionesFactores=0;
	
	protected Integer iXPanelCamposOcultosEvaluacionesFactores=0;
	protected Integer iYPanelCamposOcultosEvaluacionesFactores=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEvaluacionesFactores;
	public JButton jButtonModificarEvaluacionesFactores;
	public JButton jButtonActualizarEvaluacionesFactores;
    public JButton jButtonEliminarEvaluacionesFactores;
	public JButton jButtonCancelarEvaluacionesFactores;
    public JButton jButtonGuardarCambiosEvaluacionesFactores;
	public JButton jButtonGuardarCambiosTablaEvaluacionesFactores;
	protected JButton jButtonCerrarEvaluacionesFactores;
	
	
	protected JButton jButtonProcesarInformacionEvaluacionesFactores;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEvaluacionesFactores;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEvaluacionesFactores;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEvaluacionesFactores;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEvaluacionesFactores;
	protected JButton jButtonModificarToolBarEvaluacionesFactores;
	protected JButton jButtonActualizarToolBarEvaluacionesFactores;
    protected JButton jButtonEliminarToolBarEvaluacionesFactores;
	protected JButton jButtonCancelarToolBarEvaluacionesFactores;
    protected JButton jButtonGuardarCambiosToolBarEvaluacionesFactores;
	protected JButton jButtonGuardarCambiosTablaToolBarEvaluacionesFactores;
	protected JButton jButtonMostrarOcultarTablaToolBarEvaluacionesFactores;
	protected JButton jButtonCerrarToolBarEvaluacionesFactores;
	
	protected JButton jButtonProcesarInformacionToolBarEvaluacionesFactores;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEvaluacionesFactores;
	protected JMenuItem jMenuItemModificarEvaluacionesFactores;
	protected JMenuItem jMenuItemActualizarEvaluacionesFactores;
    protected JMenuItem jMenuItemEliminarEvaluacionesFactores;
	protected JMenuItem jMenuItemCancelarEvaluacionesFactores;
    protected JMenuItem jMenuItemGuardarCambiosEvaluacionesFactores;
	protected JMenuItem jMenuItemGuardarCambiosTablaEvaluacionesFactores;
	protected JMenuItem jMenuItemCerrarEvaluacionesFactores;
	protected JMenuItem jMenuItemDetalleCerrarEvaluacionesFactores;
	protected JMenuItem jMenuItemDetalleMostarOcultarEvaluacionesFactores;
	
	protected JMenuItem jMenuItemProcesarInformacionEvaluacionesFactores;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEvaluacionesFactores;
	protected JMenuItem jMenuItemMostrarOcultarEvaluacionesFactores;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEvaluacionesFactores;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEvaluacionesFactores;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEvaluacionesFactores;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEvaluacionesFactores;
	public JLabel jLabelIdEvaluacionesFactores;
	public JLabel jLabelidEvaluacionesFactores;
	public JButton jButtonidEvaluacionesFactoresBusqueda= new JButtonMe();

	public JPanel jPanelverificadoEvaluacionesFactores;
	public JLabel jLabelverificadoEvaluacionesFactores;
	public JCheckBox jCheckBoxverificadoEvaluacionesFactores;
	public JButton jButtonverificadoEvaluacionesFactoresBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEvaluacionesFactores;
	public JLabel jLabelcodigoEvaluacionesFactores;
	public JTextField jTextFieldcodigoEvaluacionesFactores;
	public JButton jButtoncodigoEvaluacionesFactoresBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_datoEvaluacionesFactores;
	public JLabel jLabelcodigo_datoEvaluacionesFactores;
	public JTextField jTextFieldcodigo_datoEvaluacionesFactores;
	public JButton jButtoncodigo_datoEvaluacionesFactoresBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoEvaluacionesFactores;
	public JLabel jLabelnombre_completoEvaluacionesFactores;
	public JTextArea jTextAreanombre_completoEvaluacionesFactores;
	public JScrollPane jscrollPanenombre_completoEvaluacionesFactores;
	public JButton jButtonnombre_completoEvaluacionesFactoresBusqueda= new JButtonMe();

	public JPanel jPanelvalor_conocimientoEvaluacionesFactores;
	public JLabel jLabelvalor_conocimientoEvaluacionesFactores;
	public JTextField jTextFieldvalor_conocimientoEvaluacionesFactores;
	public JButton jButtonvalor_conocimientoEvaluacionesFactoresBusqueda= new JButtonMe();

	public JPanel jPanelvalor_eficienciaEvaluacionesFactores;
	public JLabel jLabelvalor_eficienciaEvaluacionesFactores;
	public JTextField jTextFieldvalor_eficienciaEvaluacionesFactores;
	public JButton jButtonvalor_eficienciaEvaluacionesFactoresBusqueda= new JButtonMe();

	public JPanel jPanelvalor_obtenidoEvaluacionesFactores;
	public JLabel jLabelvalor_obtenidoEvaluacionesFactores;
	public JTextField jTextFieldvalor_obtenidoEvaluacionesFactores;
	public JButton jButtonvalor_obtenidoEvaluacionesFactoresBusqueda= new JButtonMe();

	public JPanel jPanelpromedioEvaluacionesFactores;
	public JLabel jLabelpromedioEvaluacionesFactores;
	public JTextField jTextFieldpromedioEvaluacionesFactores;
	public JButton jButtonpromedioEvaluacionesFactoresBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_calificacion_empleadoEvaluacionesFactores;
	public JLabel jLabelid_tipo_calificacion_empleadoEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores;
	public JButton jButtonid_tipo_calificacion_empleadoEvaluacionesFactores= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdate= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraEvaluacionesFactores;
	public JLabel jLabelid_estructuraEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraEvaluacionesFactores;
	public JButton jButtonid_estructuraEvaluacionesFactores= new JButtonMe();
	public JButton jButtonid_estructuraEvaluacionesFactoresUpdate= new JButtonMe();
	public JButton jButtonid_estructuraEvaluacionesFactoresBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaEvaluacionesFactores;
	public JLabel jLabelid_empresaEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEvaluacionesFactores;
	public JButton jButtonid_empresaEvaluacionesFactores= new JButtonMe();
	public JButton jButtonid_empresaEvaluacionesFactoresUpdate= new JButtonMe();
	public JButton jButtonid_empresaEvaluacionesFactoresBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalEvaluacionesFactores;
	public JLabel jLabelid_sucursalEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalEvaluacionesFactores;
	public JButton jButtonid_sucursalEvaluacionesFactores= new JButtonMe();
	public JButton jButtonid_sucursalEvaluacionesFactoresUpdate= new JButtonMe();
	public JButton jButtonid_sucursalEvaluacionesFactoresBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_nomi_pregunta_nomiEvaluacionesFactores;
	public JLabel jLabelid_formato_nomi_pregunta_nomiEvaluacionesFactores;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores;
	public JButton jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactores= new JButtonMe();
	public JButton jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate= new JButtonMe();
	public JButton jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEvaluacionesFactores;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EvaluacionesFactoresDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEvaluacionesFactores=new JPanel();
				this.jPanelAccionesFormularioEvaluacionesFactores=new JPanel();
				this.jmenuBarDetalleEvaluacionesFactores=new JMenuBar();
				this.jTtoolBarDetalleEvaluacionesFactores=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesFactoresDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EvaluacionesFactores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EvaluacionesFactoresDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EvaluacionesFactores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesFactoresDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionesFactores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesFactoresDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionesFactores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesFactoresDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EvaluacionesFactores No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEvaluacionesFactores() {
		return this.jButtonActualizarToolBarEvaluacionesFactores;
	}
	
	public JButton getjButtonEliminarToolBarEvaluacionesFactores() {
		return this.jButtonEliminarToolBarEvaluacionesFactores;
	}
	
	public JButton getjButtonCancelarToolBarEvaluacionesFactores() {
		return this.jButtonCancelarToolBarEvaluacionesFactores;
	}		
	
	public JButton getjButtonProcesarInformacionEvaluacionesFactores() {
		return this.jButtonProcesarInformacionEvaluacionesFactores;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEvaluacionesFactores)	{
		this.jButtonProcesarInformacionEvaluacionesFactores = jButtonProcesarInformacionEvaluacionesFactores;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEvaluacionesFactores() {
		return this.jComboBoxTiposAccionesEvaluacionesFactores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEvaluacionesFactores(
			JComboBox jComboBoxTiposRelacionesEvaluacionesFactores) {
		this.jComboBoxTiposRelacionesEvaluacionesFactores = jComboBoxTiposRelacionesEvaluacionesFactores;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEvaluacionesFactores(
			JComboBox jComboBoxTiposAccionesEvaluacionesFactores) {
		this.jComboBoxTiposAccionesEvaluacionesFactores = jComboBoxTiposAccionesEvaluacionesFactores;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEvaluacionesFactores() {
		return this.jComboBoxTiposAccionesFormularioEvaluacionesFactores;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEvaluacionesFactores(
			JComboBox jComboBoxTiposAccionesFormularioEvaluacionesFactores) {
		this.jComboBoxTiposAccionesFormularioEvaluacionesFactores = jComboBoxTiposAccionesFormularioEvaluacionesFactores;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.evaluacionesfactoresSessionBean=new EvaluacionesFactoresSessionBean();
		
		this.evaluacionesfactoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionesfactoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EvaluacionesFactoresJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EvaluacionesFactoresJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EvaluacionesFactoresJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Evaluaciones Factores MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
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
	
		EvaluacionesFactoresJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEvaluacionesFactores= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEvaluacionesFactores=new JButtonMe();
				this.jButtonModificarToolBarEvaluacionesFactores=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEvaluacionesFactores,this.jTtoolBarDetalleEvaluacionesFactores,
							"actualizar","actualizar","Actualizar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEvaluacionesFactores,this.jTtoolBarDetalleEvaluacionesFactores,
							"eliminar","eliminar","Eliminar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEvaluacionesFactores,this.jTtoolBarDetalleEvaluacionesFactores,
							"cancelar","cancelar","Cancelar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEvaluacionesFactores=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEvaluacionesFactores,this.jTtoolBarDetalleEvaluacionesFactores,
							"guardarcambios","guardarcambios","Guardar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEvaluacionesFactores=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEvaluacionesFactores=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEvaluacionesFactores=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEvaluacionesFactores=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEvaluacionesFactores=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEvaluacionesFactores= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEvaluacionesFactores.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEvaluacionesFactores,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEvaluacionesFactores= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEvaluacionesFactores.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEvaluacionesFactores,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEvaluacionesFactores= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEvaluacionesFactores.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEvaluacionesFactores,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEvaluacionesFactores= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEvaluacionesFactores.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEvaluacionesFactores,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEvaluacionesFactores= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEvaluacionesFactores.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEvaluacionesFactores,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEvaluacionesFactores= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEvaluacionesFactores.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEvaluacionesFactores,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEvaluacionesFactores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEvaluacionesFactores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEvaluacionesFactores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEvaluacionesFactores= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEvaluacionesFactores.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEvaluacionesFactores,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEvaluacionesFactores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEvaluacionesFactores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEvaluacionesFactores,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEvaluacionesFactores= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEvaluacionesFactores.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEvaluacionesFactores,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEvaluacionesFactores.add(this.jMenuItemDetalleCerrarEvaluacionesFactores);
		
		this.jmenuDetalleAccionesEvaluacionesFactores.add(this.jMenuItemActualizarEvaluacionesFactores);
		this.jmenuDetalleAccionesEvaluacionesFactores.add(this.jMenuItemEliminarEvaluacionesFactores);
		this.jmenuDetalleAccionesEvaluacionesFactores.add(this.jMenuItemCancelarEvaluacionesFactores);		
		
		//this.jmenuDetalleDatosEvaluacionesFactores.add(this.jMenuItemDetalleAbrirOrderByEvaluacionesFactores);				
		this.jmenuDetalleDatosEvaluacionesFactores.add(this.jMenuItemDetalleMostarOcultarEvaluacionesFactores);				
				
		//this.jmenuDetalleAccionesEvaluacionesFactores.add(this.jMenuItemGuardarCambiosEvaluacionesFactores);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEvaluacionesFactores.add(this.jmenuDetalleArchivoEvaluacionesFactores);		
		this.jmenuBarDetalleEvaluacionesFactores.add(this.jmenuDetalleAccionesEvaluacionesFactores);		
		this.jmenuBarDetalleEvaluacionesFactores.add(this.jmenuDetalleDatosEvaluacionesFactores);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEvaluacionesFactores);				
	}
	
	
	public void inicializarElementosCamposEvaluacionesFactores() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEvaluacionesFactores = new JLabelMe();
		jLabelIdEvaluacionesFactores.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEvaluacionesFactores = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEvaluacionesFactores.setToolTipText(EvaluacionesFactoresConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEvaluacionesFactores= new GridBagLayout();

		this.jPanelidEvaluacionesFactores.setLayout(this.gridaBagLayoutEvaluacionesFactores);

		jLabelidEvaluacionesFactores = new JLabel();
		jLabelidEvaluacionesFactores.setText("Id");

		jLabelidEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelverificadoEvaluacionesFactores = new JLabelMe();
		this.jLabelverificadoEvaluacionesFactores.setText(""+EvaluacionesFactoresConstantesFunciones.LABEL_VERIFICADO+" : *");
		this.jLabelverificadoEvaluacionesFactores.setToolTipText("Verificado");
		this.jLabelverificadoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelverificadoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelverificadoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelverificadoEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelverificadoEvaluacionesFactores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelverificadoEvaluacionesFactores.setToolTipText(EvaluacionesFactoresConstantesFunciones.LABEL_VERIFICADO);
		this.gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		this.jPanelverificadoEvaluacionesFactores.setLayout(this.gridaBagLayoutEvaluacionesFactores);


		jCheckBoxverificadoEvaluacionesFactores= new JCheckBoxMe();
		jCheckBoxverificadoEvaluacionesFactores.setEnabled(false);

		jCheckBoxverificadoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxverificadoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxverificadoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxverificadoEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonverificadoEvaluacionesFactoresBusqueda= new JButtonMe();
		this.jButtonverificadoEvaluacionesFactoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonverificadoEvaluacionesFactoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonverificadoEvaluacionesFactoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonverificadoEvaluacionesFactoresBusqueda.setText("U");
		this.jButtonverificadoEvaluacionesFactoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonverificadoEvaluacionesFactoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonverificadoEvaluacionesFactoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxverificadoEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxverificadoEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"verificadoEvaluacionesFactoresBusqueda"));

		if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonverificadoEvaluacionesFactoresBusqueda.setVisible(false);		}


					
		this.jLabelcodigoEvaluacionesFactores = new JLabelMe();
		this.jLabelcodigoEvaluacionesFactores.setText(""+EvaluacionesFactoresConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEvaluacionesFactores.setToolTipText("Codigo");
		this.jLabelcodigoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEvaluacionesFactores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEvaluacionesFactores.setToolTipText(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		this.jPanelcodigoEvaluacionesFactores.setLayout(this.gridaBagLayoutEvaluacionesFactores);


		jTextFieldcodigoEvaluacionesFactores= new JTextFieldMe();

		jTextFieldcodigoEvaluacionesFactores.setEnabled(false);
		jTextFieldcodigoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEvaluacionesFactoresBusqueda= new JButtonMe();
		this.jButtoncodigoEvaluacionesFactoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEvaluacionesFactoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEvaluacionesFactoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEvaluacionesFactoresBusqueda.setText("U");
		this.jButtoncodigoEvaluacionesFactoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEvaluacionesFactoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEvaluacionesFactoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEvaluacionesFactoresBusqueda"));

		if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEvaluacionesFactoresBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_datoEvaluacionesFactores = new JLabelMe();
		this.jLabelcodigo_datoEvaluacionesFactores.setText(""+EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO+" : *");
		this.jLabelcodigo_datoEvaluacionesFactores.setToolTipText("Codigo Dato");
		this.jLabelcodigo_datoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_datoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_datoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_datoEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_datoEvaluacionesFactores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_datoEvaluacionesFactores.setToolTipText(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO);
		this.gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		this.jPanelcodigo_datoEvaluacionesFactores.setLayout(this.gridaBagLayoutEvaluacionesFactores);


		jTextFieldcodigo_datoEvaluacionesFactores= new JTextFieldMe();

		jTextFieldcodigo_datoEvaluacionesFactores.setEnabled(false);
		jTextFieldcodigo_datoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_datoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_datoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_datoEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_datoEvaluacionesFactoresBusqueda= new JButtonMe();
		this.jButtoncodigo_datoEvaluacionesFactoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_datoEvaluacionesFactoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_datoEvaluacionesFactoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_datoEvaluacionesFactoresBusqueda.setText("U");
		this.jButtoncodigo_datoEvaluacionesFactoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_datoEvaluacionesFactoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_datoEvaluacionesFactoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_datoEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_datoEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_datoEvaluacionesFactoresBusqueda"));

		if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_datoEvaluacionesFactoresBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoEvaluacionesFactores = new JLabelMe();
		this.jLabelnombre_completoEvaluacionesFactores.setText(""+EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoEvaluacionesFactores.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoEvaluacionesFactores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoEvaluacionesFactores.setToolTipText(EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		this.jPanelnombre_completoEvaluacionesFactores.setLayout(this.gridaBagLayoutEvaluacionesFactores);


		jTextAreanombre_completoEvaluacionesFactores= new JTextAreaMe();
		jTextAreanombre_completoEvaluacionesFactores.setEnabled(false);
		jTextAreanombre_completoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoEvaluacionesFactores.setLineWrap(true);
		jTextAreanombre_completoEvaluacionesFactores.setWrapStyleWord(true);
		jTextAreanombre_completoEvaluacionesFactores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoEvaluacionesFactores.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoEvaluacionesFactores = new JScrollPane(jTextAreanombre_completoEvaluacionesFactores);
		jscrollPanenombre_completoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_completoEvaluacionesFactoresBusqueda= new JButtonMe();
		this.jButtonnombre_completoEvaluacionesFactoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoEvaluacionesFactoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoEvaluacionesFactoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoEvaluacionesFactoresBusqueda.setText("U");
		this.jButtonnombre_completoEvaluacionesFactoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoEvaluacionesFactoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoEvaluacionesFactoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoEvaluacionesFactoresBusqueda"));

		if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoEvaluacionesFactoresBusqueda.setVisible(false);		}


					
		this.jLabelvalor_conocimientoEvaluacionesFactores = new JLabelMe();
		this.jLabelvalor_conocimientoEvaluacionesFactores.setText(""+EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO+" : *");
		this.jLabelvalor_conocimientoEvaluacionesFactores.setToolTipText("Valor Conocimiento");
		this.jLabelvalor_conocimientoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_conocimientoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_conocimientoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_conocimientoEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_conocimientoEvaluacionesFactores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_conocimientoEvaluacionesFactores.setToolTipText(EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO);
		this.gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		this.jPanelvalor_conocimientoEvaluacionesFactores.setLayout(this.gridaBagLayoutEvaluacionesFactores);


		jTextFieldvalor_conocimientoEvaluacionesFactores= new JTextFieldMe();
		jTextFieldvalor_conocimientoEvaluacionesFactores.setEnabled(false);
		jTextFieldvalor_conocimientoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_conocimientoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_conocimientoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_conocimientoEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_conocimientoEvaluacionesFactores.setText("0.0");

		this.jButtonvalor_conocimientoEvaluacionesFactoresBusqueda= new JButtonMe();
		this.jButtonvalor_conocimientoEvaluacionesFactoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_conocimientoEvaluacionesFactoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_conocimientoEvaluacionesFactoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_conocimientoEvaluacionesFactoresBusqueda.setText("U");
		this.jButtonvalor_conocimientoEvaluacionesFactoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_conocimientoEvaluacionesFactoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_conocimientoEvaluacionesFactoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_conocimientoEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_conocimientoEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_conocimientoEvaluacionesFactoresBusqueda"));

		if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_conocimientoEvaluacionesFactoresBusqueda.setVisible(false);		}


					
		this.jLabelvalor_eficienciaEvaluacionesFactores = new JLabelMe();
		this.jLabelvalor_eficienciaEvaluacionesFactores.setText(""+EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA+" : *");
		this.jLabelvalor_eficienciaEvaluacionesFactores.setToolTipText("Valor Eficiencia");
		this.jLabelvalor_eficienciaEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_eficienciaEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_eficienciaEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_eficienciaEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_eficienciaEvaluacionesFactores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_eficienciaEvaluacionesFactores.setToolTipText(EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA);
		this.gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		this.jPanelvalor_eficienciaEvaluacionesFactores.setLayout(this.gridaBagLayoutEvaluacionesFactores);


		jTextFieldvalor_eficienciaEvaluacionesFactores= new JTextFieldMe();
		jTextFieldvalor_eficienciaEvaluacionesFactores.setEnabled(false);
		jTextFieldvalor_eficienciaEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_eficienciaEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_eficienciaEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_eficienciaEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_eficienciaEvaluacionesFactores.setText("0.0");

		this.jButtonvalor_eficienciaEvaluacionesFactoresBusqueda= new JButtonMe();
		this.jButtonvalor_eficienciaEvaluacionesFactoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_eficienciaEvaluacionesFactoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_eficienciaEvaluacionesFactoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_eficienciaEvaluacionesFactoresBusqueda.setText("U");
		this.jButtonvalor_eficienciaEvaluacionesFactoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_eficienciaEvaluacionesFactoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_eficienciaEvaluacionesFactoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_eficienciaEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_eficienciaEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_eficienciaEvaluacionesFactoresBusqueda"));

		if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_eficienciaEvaluacionesFactoresBusqueda.setVisible(false);		}


					
		this.jLabelvalor_obtenidoEvaluacionesFactores = new JLabelMe();
		this.jLabelvalor_obtenidoEvaluacionesFactores.setText(""+EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO+" : *");
		this.jLabelvalor_obtenidoEvaluacionesFactores.setToolTipText("Valor Obtenido");
		this.jLabelvalor_obtenidoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_obtenidoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_obtenidoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_obtenidoEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_obtenidoEvaluacionesFactores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_obtenidoEvaluacionesFactores.setToolTipText(EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO);
		this.gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		this.jPanelvalor_obtenidoEvaluacionesFactores.setLayout(this.gridaBagLayoutEvaluacionesFactores);


		jTextFieldvalor_obtenidoEvaluacionesFactores= new JTextFieldMe();
		jTextFieldvalor_obtenidoEvaluacionesFactores.setEnabled(false);
		jTextFieldvalor_obtenidoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_obtenidoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_obtenidoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_obtenidoEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_obtenidoEvaluacionesFactores.setText("0.0");

		this.jButtonvalor_obtenidoEvaluacionesFactoresBusqueda= new JButtonMe();
		this.jButtonvalor_obtenidoEvaluacionesFactoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_obtenidoEvaluacionesFactoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_obtenidoEvaluacionesFactoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_obtenidoEvaluacionesFactoresBusqueda.setText("U");
		this.jButtonvalor_obtenidoEvaluacionesFactoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_obtenidoEvaluacionesFactoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_obtenidoEvaluacionesFactoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_obtenidoEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_obtenidoEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_obtenidoEvaluacionesFactoresBusqueda"));

		if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_obtenidoEvaluacionesFactoresBusqueda.setVisible(false);		}


					
		this.jLabelpromedioEvaluacionesFactores = new JLabelMe();
		this.jLabelpromedioEvaluacionesFactores.setText(""+EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO+" : *");
		this.jLabelpromedioEvaluacionesFactores.setToolTipText("Promedio");
		this.jLabelpromedioEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpromedioEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpromedioEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpromedioEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpromedioEvaluacionesFactores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpromedioEvaluacionesFactores.setToolTipText(EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO);
		this.gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		this.jPanelpromedioEvaluacionesFactores.setLayout(this.gridaBagLayoutEvaluacionesFactores);


		jTextFieldpromedioEvaluacionesFactores= new JTextFieldMe();
		jTextFieldpromedioEvaluacionesFactores.setEnabled(false);
		jTextFieldpromedioEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpromedioEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpromedioEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpromedioEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpromedioEvaluacionesFactores.setText("0.0");

		this.jButtonpromedioEvaluacionesFactoresBusqueda= new JButtonMe();
		this.jButtonpromedioEvaluacionesFactoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpromedioEvaluacionesFactoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpromedioEvaluacionesFactoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpromedioEvaluacionesFactoresBusqueda.setText("U");
		this.jButtonpromedioEvaluacionesFactoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpromedioEvaluacionesFactoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpromedioEvaluacionesFactoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpromedioEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpromedioEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"promedioEvaluacionesFactoresBusqueda"));

		if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpromedioEvaluacionesFactoresBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEvaluacionesFactores() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesFactores = new JLabelMe();
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesFactores.setText(""+EvaluacionesFactoresConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO+" : *");
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesFactores.setToolTipText("Tipo Calificacion Empleado");
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_calificacion_empleadoEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_calificacion_empleadoEvaluacionesFactores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_calificacion_empleadoEvaluacionesFactores.setToolTipText(EvaluacionesFactoresConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
		this.gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		this.jPanelid_tipo_calificacion_empleadoEvaluacionesFactores.setLayout(this.gridaBagLayoutEvaluacionesFactores);


		jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores= new JComboBoxMe();
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactores= new JButtonMe();
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactores.setText("Buscar");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calificacion_empleadoEvaluacionesFactores"));

		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda= new JButtonMe();
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda.setText("U");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda"));

		if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda.setVisible(false);		}

		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdate= new JButtonMe();
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdate.setText("U");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calificacion_empleadoEvaluacionesFactoresUpdate"));



					
		this.jLabelid_estructuraEvaluacionesFactores = new JLabelMe();
		this.jLabelid_estructuraEvaluacionesFactores.setText(""+EvaluacionesFactoresConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraEvaluacionesFactores.setToolTipText("Estructura");
		this.jLabelid_estructuraEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraEvaluacionesFactores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraEvaluacionesFactores.setToolTipText(EvaluacionesFactoresConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		this.jPanelid_estructuraEvaluacionesFactores.setLayout(this.gridaBagLayoutEvaluacionesFactores);


		jComboBoxid_estructuraEvaluacionesFactores= new JComboBoxMe();
		jComboBoxid_estructuraEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraEvaluacionesFactores= new JButtonMe();
		this.jButtonid_estructuraEvaluacionesFactores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionesFactores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionesFactores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionesFactores.setText("Buscar");
		this.jButtonid_estructuraEvaluacionesFactores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraEvaluacionesFactores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionesFactores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionesFactores"));

		this.jButtonid_estructuraEvaluacionesFactoresBusqueda= new JButtonMe();
		this.jButtonid_estructuraEvaluacionesFactoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionesFactoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionesFactoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEvaluacionesFactoresBusqueda.setText("U");
		this.jButtonid_estructuraEvaluacionesFactoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraEvaluacionesFactoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionesFactoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionesFactoresBusqueda"));

		if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraEvaluacionesFactoresBusqueda.setVisible(false);		}

		this.jButtonid_estructuraEvaluacionesFactoresUpdate= new JButtonMe();
		this.jButtonid_estructuraEvaluacionesFactoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionesFactoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionesFactoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEvaluacionesFactoresUpdate.setText("U");
		this.jButtonid_estructuraEvaluacionesFactoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraEvaluacionesFactoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionesFactoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionesFactoresUpdate"));



					
		this.jLabelid_empresaEvaluacionesFactores = new JLabelMe();
		this.jLabelid_empresaEvaluacionesFactores.setText(""+EvaluacionesFactoresConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEvaluacionesFactores.setToolTipText("Empresa");
		this.jLabelid_empresaEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEvaluacionesFactores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEvaluacionesFactores.setToolTipText(EvaluacionesFactoresConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		this.jPanelid_empresaEvaluacionesFactores.setLayout(this.gridaBagLayoutEvaluacionesFactores);


		jComboBoxid_empresaEvaluacionesFactores= new JComboBoxMe();
		jComboBoxid_empresaEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEvaluacionesFactores.setEnabled(false);

		this.jButtonid_empresaEvaluacionesFactores= new JButtonMe();
		this.jButtonid_empresaEvaluacionesFactores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionesFactores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionesFactores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionesFactores.setText("Buscar");
		this.jButtonid_empresaEvaluacionesFactores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEvaluacionesFactores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionesFactores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionesFactores"));

		this.jButtonid_empresaEvaluacionesFactoresBusqueda= new JButtonMe();
		this.jButtonid_empresaEvaluacionesFactoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionesFactoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionesFactoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEvaluacionesFactoresBusqueda.setText("U");
		this.jButtonid_empresaEvaluacionesFactoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEvaluacionesFactoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionesFactoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionesFactoresBusqueda"));

		if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEvaluacionesFactoresBusqueda.setVisible(false);		}

		this.jButtonid_empresaEvaluacionesFactoresUpdate= new JButtonMe();
		this.jButtonid_empresaEvaluacionesFactoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionesFactoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionesFactoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEvaluacionesFactoresUpdate.setText("U");
		this.jButtonid_empresaEvaluacionesFactoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEvaluacionesFactoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionesFactoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionesFactoresUpdate"));



					
		this.jLabelid_sucursalEvaluacionesFactores = new JLabelMe();
		this.jLabelid_sucursalEvaluacionesFactores.setText(""+EvaluacionesFactoresConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalEvaluacionesFactores.setToolTipText("Sucursal");
		this.jLabelid_sucursalEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalEvaluacionesFactores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalEvaluacionesFactores.setToolTipText(EvaluacionesFactoresConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		this.jPanelid_sucursalEvaluacionesFactores.setLayout(this.gridaBagLayoutEvaluacionesFactores);


		jComboBoxid_sucursalEvaluacionesFactores= new JComboBoxMe();
		jComboBoxid_sucursalEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalEvaluacionesFactores.setEnabled(false);

		this.jButtonid_sucursalEvaluacionesFactores= new JButtonMe();
		this.jButtonid_sucursalEvaluacionesFactores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionesFactores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionesFactores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionesFactores.setText("Buscar");
		this.jButtonid_sucursalEvaluacionesFactores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalEvaluacionesFactores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionesFactores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionesFactores"));

		this.jButtonid_sucursalEvaluacionesFactoresBusqueda= new JButtonMe();
		this.jButtonid_sucursalEvaluacionesFactoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionesFactoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionesFactoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEvaluacionesFactoresBusqueda.setText("U");
		this.jButtonid_sucursalEvaluacionesFactoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalEvaluacionesFactoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionesFactoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionesFactoresBusqueda"));

		if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalEvaluacionesFactoresBusqueda.setVisible(false);		}

		this.jButtonid_sucursalEvaluacionesFactoresUpdate= new JButtonMe();
		this.jButtonid_sucursalEvaluacionesFactoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionesFactoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionesFactoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEvaluacionesFactoresUpdate.setText("U");
		this.jButtonid_sucursalEvaluacionesFactoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalEvaluacionesFactoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionesFactoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionesFactoresUpdate"));



					
		this.jLabelid_formato_nomi_pregunta_nomiEvaluacionesFactores = new JLabelMe();
		this.jLabelid_formato_nomi_pregunta_nomiEvaluacionesFactores.setText(""+EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI+" : *");
		this.jLabelid_formato_nomi_pregunta_nomiEvaluacionesFactores.setToolTipText("Formato Nomi Pregunta Nomi");
		this.jLabelid_formato_nomi_pregunta_nomiEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_nomi_pregunta_nomiEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_nomi_pregunta_nomiEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nomi_pregunta_nomiEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesFactores=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesFactores.setToolTipText(EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI);
		this.gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesFactores.setLayout(this.gridaBagLayoutEvaluacionesFactores);


		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores= new JComboBoxMe();
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactores= new JButtonMe();
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactores.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactores.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactores.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactores.setText("Buscar");
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactores.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactores.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactores,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomi_pregunta_nomiEvaluacionesFactores"));

		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda= new JButtonMe();
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda.setText("U");
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda"));

		if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda.setVisible(false);		}

		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate= new JButtonMe();
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate.setText("U");
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate"));



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
		//this.jInternalFrameDetalleEvaluacionesFactores = new EvaluacionesFactoresBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Evaluaciones Factores DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEvaluacionesFactores= new GridBagLayout();
		

		
		String sToolTipEvaluacionesFactores="";
		sToolTipEvaluacionesFactores=EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEvaluacionesFactores+="(Nomina.EvaluacionesFactores)";
		}
		
		if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
			sToolTipEvaluacionesFactores+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEvaluacionesFactores = new JButtonMe();
		this.jButtonModificarEvaluacionesFactores = new JButtonMe();
        this.jButtonActualizarEvaluacionesFactores = new JButtonMe();
        this.jButtonEliminarEvaluacionesFactores = new JButtonMe();
        this.jButtonCancelarEvaluacionesFactores = new JButtonMe();
        this.jButtonGuardarCambiosEvaluacionesFactores = new JButtonMe();
		this.jButtonGuardarCambiosTablaEvaluacionesFactores = new JButtonMe();
		this.jButtonCerrarEvaluacionesFactores = new JButtonMe();
		
		this.jScrollPanelDatosEvaluacionesFactores = new JScrollPane();   
        this.jScrollPanelDatosEdicionEvaluacionesFactores = new JScrollPane();
		this.jScrollPanelDatosGeneralEvaluacionesFactores = new JScrollPane();
				
		
		
		this.jPanelCamposEvaluacionesFactores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEvaluacionesFactores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEvaluacionesFactores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEvaluacionesFactores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Evaluaciones Factores";
		
		if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Factoreses" + this.sPath));
		} else {
			this.jScrollPanelDatosEvaluacionesFactores.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEvaluacionesFactores.setName("jPanelCamposEvaluacionesFactores"); 

		this.jPanelCamposOcultosEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEvaluacionesFactores.setName("jPanelCamposOcultosEvaluacionesFactores"); 

        this.jPanelAccionesEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEvaluacionesFactores.setToolTipText("Acciones");
        this.jPanelAccionesEvaluacionesFactores.setName("Acciones"); 

		this.jPanelAccionesFormularioEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEvaluacionesFactores.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEvaluacionesFactores.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEvaluacionesFactores.setText("Nuevo");
		this.jButtonModificarEvaluacionesFactores.setText("Editar");
        this.jButtonActualizarEvaluacionesFactores.setText("Actualizar");
        this.jButtonEliminarEvaluacionesFactores.setText("Eliminar");
        this.jButtonCancelarEvaluacionesFactores.setText("Cancelar");
        this.jButtonGuardarCambiosEvaluacionesFactores.setText("Guardar");
		this.jButtonGuardarCambiosTablaEvaluacionesFactores.setText("Guardar");
		this.jButtonCerrarEvaluacionesFactores.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEvaluacionesFactores,"nuevo_button","Nuevo",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEvaluacionesFactores,"modificar_button","Editar",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEvaluacionesFactores,"actualizar_button","Actualizar",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEvaluacionesFactores,"eliminar_button","Eliminar",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEvaluacionesFactores,"cancelar_button","Cancelar",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEvaluacionesFactores,"guardarcambios_button","Guardar",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEvaluacionesFactores,"guardarcambiostabla_button","Guardar",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEvaluacionesFactores,"cerrar_button","Salir",this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEvaluacionesFactores.setToolTipText("Nuevo"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEvaluacionesFactores.setToolTipText("Editar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEvaluacionesFactores.setToolTipText("Actualizar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEvaluacionesFactores.setToolTipText("Eliminar)"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEvaluacionesFactores.setToolTipText("Cancelar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEvaluacionesFactores.setToolTipText("Guardar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEvaluacionesFactores.setToolTipText("Guardar"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEvaluacionesFactores.setToolTipText("Salir"+" "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEvaluacionesFactores";
		inputMap = this.jButtonNuevoEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEvaluacionesFactores.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEvaluacionesFactores"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEvaluacionesFactores";
		inputMap = this.jButtonActualizarEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEvaluacionesFactores"));
		
		//ELIMINAR
		sMapKey = "EliminarEvaluacionesFactores";
		inputMap = this.jButtonEliminarEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEvaluacionesFactores"));
		
		//CANCELAR	
		sMapKey = "CancelarEvaluacionesFactores";
		inputMap = this.jButtonCancelarEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEvaluacionesFactores"));
		
		//CERRAR		
		sMapKey = "CerrarEvaluacionesFactores";
		inputMap = this.jButtonCerrarEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEvaluacionesFactores"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEvaluacionesFactores";
		inputMap = this.jButtonGuardarCambiosTablaEvaluacionesFactores.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEvaluacionesFactores.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEvaluacionesFactores"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEvaluacionesFactores = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEvaluacionesFactores.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEvaluacionesFactores.setToolTipText("Nuevo EvaluacionesFactores");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEvaluacionesFactores = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEvaluacionesFactores.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEvaluacionesFactores.setToolTipText("Sin Cerrar Ventana EvaluacionesFactores");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEvaluacionesFactores = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEvaluacionesFactores.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEvaluacionesFactores.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEvaluacionesFactores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEvaluacionesFactores.setText("Accion");
		this.jComboBoxTiposAccionesEvaluacionesFactores.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEvaluacionesFactores = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEvaluacionesFactores.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEvaluacionesFactores.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEvaluacionesFactores = new JLabelMe();
		
		this.jLabelAccionesEvaluacionesFactores.setText("Acciones");		
		this.jLabelAccionesEvaluacionesFactores.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionesFactores.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionesFactores.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEvaluacionesFactores();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEvaluacionesFactores();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEvaluacionesFactores=new JTabbedPane();
		this.jTabbedPaneRelacionesEvaluacionesFactores.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEvaluacionesFactores,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEvaluacionesFactores.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionesFactores.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionesFactores.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEvaluacionesFactores.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEvaluacionesFactores.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEvaluacionesFactores.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEvaluacionesFactores, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEvaluacionesFactores = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEvaluacionesFactores = new GridBagLayout();
		
		this.jPanelCamposEvaluacionesFactores.setLayout(gridaBagLayoutCamposEvaluacionesFactores);
		this.jPanelCamposOcultosEvaluacionesFactores.setLayout(gridaBagLayoutCamposOcultosEvaluacionesFactores);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEvaluacionesFactores.add(jLabelIdEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 1;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEvaluacionesFactores.add(jLabelidEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_calificacion_empleadoEvaluacionesFactores.add(jLabelid_tipo_calificacion_empleadoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 2;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_calificacion_empleadoEvaluacionesFactores.add(jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda, this.gridBagConstraintsEvaluacionesFactores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 3;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_calificacion_empleadoEvaluacionesFactores.add(jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdate, this.gridBagConstraintsEvaluacionesFactores);
	}

	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 1;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_calificacion_empleadoEvaluacionesFactores.add(jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelverificadoEvaluacionesFactores.add(jLabelverificadoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 2;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelverificadoEvaluacionesFactores.add(jButtonverificadoEvaluacionesFactoresBusqueda, this.gridBagConstraintsEvaluacionesFactores);
	}

	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 1;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelverificadoEvaluacionesFactores.add(jCheckBoxverificadoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraEvaluacionesFactores.add(jLabelid_estructuraEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 2;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEvaluacionesFactores.add(jButtonid_estructuraEvaluacionesFactoresBusqueda, this.gridBagConstraintsEvaluacionesFactores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 3;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEvaluacionesFactores.add(jButtonid_estructuraEvaluacionesFactoresUpdate, this.gridBagConstraintsEvaluacionesFactores);
	}

	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 1;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraEvaluacionesFactores.add(jComboBoxid_estructuraEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEvaluacionesFactores.add(jLabelcodigoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 2;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEvaluacionesFactores.add(jButtoncodigoEvaluacionesFactoresBusqueda, this.gridBagConstraintsEvaluacionesFactores);
	}

	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 1;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEvaluacionesFactores.add(jTextFieldcodigoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEvaluacionesFactores.add(jLabelid_empresaEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 2;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEvaluacionesFactores.add(jButtonid_empresaEvaluacionesFactoresBusqueda, this.gridBagConstraintsEvaluacionesFactores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 3;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEvaluacionesFactores.add(jButtonid_empresaEvaluacionesFactoresUpdate, this.gridBagConstraintsEvaluacionesFactores);
	}

	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 1;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEvaluacionesFactores.add(jComboBoxid_empresaEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalEvaluacionesFactores.add(jLabelid_sucursalEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 2;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEvaluacionesFactores.add(jButtonid_sucursalEvaluacionesFactoresBusqueda, this.gridBagConstraintsEvaluacionesFactores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 3;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEvaluacionesFactores.add(jButtonid_sucursalEvaluacionesFactoresUpdate, this.gridBagConstraintsEvaluacionesFactores);
	}

	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 1;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalEvaluacionesFactores.add(jComboBoxid_sucursalEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_datoEvaluacionesFactores.add(jLabelcodigo_datoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 2;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_datoEvaluacionesFactores.add(jButtoncodigo_datoEvaluacionesFactoresBusqueda, this.gridBagConstraintsEvaluacionesFactores);
	}

	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 1;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_datoEvaluacionesFactores.add(jTextFieldcodigo_datoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoEvaluacionesFactores.add(jLabelnombre_completoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 2;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoEvaluacionesFactores.add(jButtonnombre_completoEvaluacionesFactoresBusqueda, this.gridBagConstraintsEvaluacionesFactores);
	}

	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 1;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoEvaluacionesFactores.add(jscrollPanenombre_completoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesFactores.add(jLabelid_formato_nomi_pregunta_nomiEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 2;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesFactores.add(jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda, this.gridBagConstraintsEvaluacionesFactores);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 3;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesFactores.add(jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate, this.gridBagConstraintsEvaluacionesFactores);
	}

	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 1;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesFactores.add(jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_conocimientoEvaluacionesFactores.add(jLabelvalor_conocimientoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 2;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_conocimientoEvaluacionesFactores.add(jButtonvalor_conocimientoEvaluacionesFactoresBusqueda, this.gridBagConstraintsEvaluacionesFactores);
	}

	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 1;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_conocimientoEvaluacionesFactores.add(jTextFieldvalor_conocimientoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_eficienciaEvaluacionesFactores.add(jLabelvalor_eficienciaEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 2;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_eficienciaEvaluacionesFactores.add(jButtonvalor_eficienciaEvaluacionesFactoresBusqueda, this.gridBagConstraintsEvaluacionesFactores);
	}

	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 1;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_eficienciaEvaluacionesFactores.add(jTextFieldvalor_eficienciaEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_obtenidoEvaluacionesFactores.add(jLabelvalor_obtenidoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 2;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_obtenidoEvaluacionesFactores.add(jButtonvalor_obtenidoEvaluacionesFactoresBusqueda, this.gridBagConstraintsEvaluacionesFactores);
	}

	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 1;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_obtenidoEvaluacionesFactores.add(jTextFieldvalor_obtenidoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpromedioEvaluacionesFactores.add(jLabelpromedioEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = 2;
		this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
		this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(0, 0, 0, 0);
		this.jPanelpromedioEvaluacionesFactores.add(jButtonpromedioEvaluacionesFactoresBusqueda, this.gridBagConstraintsEvaluacionesFactores);
	}

	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
	this.gridBagConstraintsEvaluacionesFactores.gridx = 1;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpromedioEvaluacionesFactores.add(jTextFieldpromedioEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesFactores.gridy = iYPanelCamposEvaluacionesFactores;
	this.gridBagConstraintsEvaluacionesFactores.gridx = iXPanelCamposEvaluacionesFactores++;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesFactores.add(this.jPanelidEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(iXPanelCamposEvaluacionesFactores % 2==0) {
		iXPanelCamposEvaluacionesFactores=0;
		iYPanelCamposEvaluacionesFactores++;
	}
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesFactores.gridy = iYPanelCamposEvaluacionesFactores;
	this.gridBagConstraintsEvaluacionesFactores.gridx = iXPanelCamposEvaluacionesFactores++;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesFactores.add(this.jPanelid_tipo_calificacion_empleadoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(iXPanelCamposEvaluacionesFactores % 2==0) {
		iXPanelCamposEvaluacionesFactores=0;
		iYPanelCamposEvaluacionesFactores++;
	}
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesFactores.gridy = iYPanelCamposEvaluacionesFactores;
	this.gridBagConstraintsEvaluacionesFactores.gridx = iXPanelCamposEvaluacionesFactores++;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesFactores.add(this.jPanelverificadoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(iXPanelCamposEvaluacionesFactores % 2==0) {
		iXPanelCamposEvaluacionesFactores=0;
		iYPanelCamposEvaluacionesFactores++;
	}
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesFactores.gridy = iYPanelCamposEvaluacionesFactores;
	this.gridBagConstraintsEvaluacionesFactores.gridx = iXPanelCamposEvaluacionesFactores++;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesFactores.add(this.jPanelid_estructuraEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(iXPanelCamposEvaluacionesFactores % 2==0) {
		iXPanelCamposEvaluacionesFactores=0;
		iYPanelCamposEvaluacionesFactores++;
	}
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesFactores.gridy = iYPanelCamposEvaluacionesFactores;
	this.gridBagConstraintsEvaluacionesFactores.gridx = iXPanelCamposEvaluacionesFactores++;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesFactores.add(this.jPanelcodigoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(iXPanelCamposEvaluacionesFactores % 2==0) {
		iXPanelCamposEvaluacionesFactores=0;
		iYPanelCamposEvaluacionesFactores++;
	}
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesFactores.gridy = iYPanelCamposEvaluacionesFactores;
	this.gridBagConstraintsEvaluacionesFactores.gridx = iXPanelCamposEvaluacionesFactores++;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesFactores.add(this.jPanelcodigo_datoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(iXPanelCamposEvaluacionesFactores % 2==0) {
		iXPanelCamposEvaluacionesFactores=0;
		iYPanelCamposEvaluacionesFactores++;
	}
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesFactores.gridy = iYPanelCamposEvaluacionesFactores;
	this.gridBagConstraintsEvaluacionesFactores.gridx = iXPanelCamposEvaluacionesFactores++;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesFactores.add(this.jPanelnombre_completoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(iXPanelCamposEvaluacionesFactores % 2==0) {
		iXPanelCamposEvaluacionesFactores=0;
		iYPanelCamposEvaluacionesFactores++;
	}
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesFactores.gridy = iYPanelCamposEvaluacionesFactores;
	this.gridBagConstraintsEvaluacionesFactores.gridx = iXPanelCamposEvaluacionesFactores++;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesFactores.add(this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(iXPanelCamposEvaluacionesFactores % 2==0) {
		iXPanelCamposEvaluacionesFactores=0;
		iYPanelCamposEvaluacionesFactores++;
	}
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesFactores.gridy = iYPanelCamposEvaluacionesFactores;
	this.gridBagConstraintsEvaluacionesFactores.gridx = iXPanelCamposEvaluacionesFactores++;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesFactores.add(this.jPanelvalor_conocimientoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(iXPanelCamposEvaluacionesFactores % 2==0) {
		iXPanelCamposEvaluacionesFactores=0;
		iYPanelCamposEvaluacionesFactores++;
	}
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesFactores.gridy = iYPanelCamposEvaluacionesFactores;
	this.gridBagConstraintsEvaluacionesFactores.gridx = iXPanelCamposEvaluacionesFactores++;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesFactores.add(this.jPanelvalor_eficienciaEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(iXPanelCamposEvaluacionesFactores % 2==0) {
		iXPanelCamposEvaluacionesFactores=0;
		iYPanelCamposEvaluacionesFactores++;
	}
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesFactores.gridy = iYPanelCamposEvaluacionesFactores;
	this.gridBagConstraintsEvaluacionesFactores.gridx = iXPanelCamposEvaluacionesFactores++;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesFactores.add(this.jPanelvalor_obtenidoEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(iXPanelCamposEvaluacionesFactores % 2==0) {
		iXPanelCamposEvaluacionesFactores=0;
		iYPanelCamposEvaluacionesFactores++;
	}
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesFactores.gridy = iYPanelCamposEvaluacionesFactores;
	this.gridBagConstraintsEvaluacionesFactores.gridx = iXPanelCamposEvaluacionesFactores++;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesFactores.add(this.jPanelpromedioEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(iXPanelCamposEvaluacionesFactores % 2==0) {
		iXPanelCamposEvaluacionesFactores=0;
		iYPanelCamposEvaluacionesFactores++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesFactores.gridy = iYPanelCamposOcultosEvaluacionesFactores;
	this.gridBagConstraintsEvaluacionesFactores.gridx = iXPanelCamposOcultosEvaluacionesFactores++;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionesFactores.add(this.jPanelid_empresaEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(iXPanelCamposOcultosEvaluacionesFactores % 2==0) {
		iXPanelCamposOcultosEvaluacionesFactores=0;
		iYPanelCamposOcultosEvaluacionesFactores++;
	}
	this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesFactores.gridy = iYPanelCamposOcultosEvaluacionesFactores;
	this.gridBagConstraintsEvaluacionesFactores.gridx = iXPanelCamposOcultosEvaluacionesFactores++;
	this.gridBagConstraintsEvaluacionesFactores.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesFactores.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionesFactores.add(this.jPanelid_sucursalEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);



	if(iXPanelCamposOcultosEvaluacionesFactores % 2==0) {
		iXPanelCamposOcultosEvaluacionesFactores=0;
		iYPanelCamposOcultosEvaluacionesFactores++;
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
			
		GridBagLayout gridaBagLayoutAccionesEvaluacionesFactores= new GridBagLayout();
		this.jPanelAccionesEvaluacionesFactores.setLayout(gridaBagLayoutAccionesEvaluacionesFactores);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEvaluacionesFactores= new GridBagLayout();
		this.jPanelAccionesFormularioEvaluacionesFactores.setLayout(gridaBagLayoutAccionesFormularioEvaluacionesFactores);
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEvaluacionesFactores.add(this.jComboBoxTiposAccionesFormularioEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXAccion++;
			
		this.jPanelAccionesEvaluacionesFactores.add(this.jButtonModificarEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);							

		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;
		this.gridBagConstraintsEvaluacionesFactores.gridx =iPosXAccion++;
			
		this.jPanelAccionesEvaluacionesFactores.add(this.jButtonEliminarEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
			
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXAccion++;
		
		this.jPanelAccionesEvaluacionesFactores.add(this.jButtonActualizarEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);


		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = iPosXAccion++;
		
		this.jPanelAccionesEvaluacionesFactores.add(this.jButtonGuardarCambiosEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);	
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy = 0;		
		this.gridBagConstraintsEvaluacionesFactores.gridx =iPosXAccion++;
		
		this.jPanelAccionesEvaluacionesFactores.add(this.jButtonCancelarEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEvaluacionesFactores = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEvaluacionesFactores);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();						
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionesFactores.gridx = 0;		
			//this.gridBagConstraintsEvaluacionesFactores.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEvaluacionesFactores.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionesFactores.gridx =0;
		this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEvaluacionesFactores.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EvaluacionesFactoresJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEvaluacionesFactores = new EvaluacionesFactoresBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Evaluaciones Factores DATOS");
			
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
			
	        //this.setTitle("[FOR] - Evaluaciones Factores DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Evaluaciones Factores Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EvaluacionesFactoresModel evaluacionesfactoresModel=new EvaluacionesFactoresModel(this);
			
			//SI USARA CLASE INTERNA
			//EvaluacionesFactoresModel.EvaluacionesFactoresFocusTraversalPolicy evaluacionesfactoresFocusTraversalPolicy = evaluacionesfactoresModel.new EvaluacionesFactoresFocusTraversalPolicy(this);
			
			//evaluacionesfactoresFocusTraversalPolicy.setevaluacionesfactoresJInternalFrame(this);
			
			this.setFocusTraversalPolicy(evaluacionesfactoresModel);
			
			
			this.jContentPaneDetalleEvaluacionesFactores = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEvaluacionesFactores = new GridBagLayout();	
			this.jContentPaneDetalleEvaluacionesFactores.setLayout(gridaBagLayoutDetalleEvaluacionesFactores);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEvaluacionesFactores = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
					
				
				this.jContentPaneDetalleEvaluacionesFactores.add(jTtoolBarDetalleEvaluacionesFactores, gridBagConstraintsEvaluacionesFactores);								
				
}
			
			this.jScrollPanelDatosEdicionEvaluacionesFactores=   new JScrollPane(jContentPaneDetalleEvaluacionesFactores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEvaluacionesFactores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionesFactores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionesFactores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEvaluacionesFactores=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEvaluacionesFactores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionesFactores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionesFactores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	        
			this.jContentPaneDetalleEvaluacionesFactores.add(jPanelCamposEvaluacionesFactores, gridBagConstraintsEvaluacionesFactores);
			
			
			
			
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
						//&& evaluacionesfactoresSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.evaluacionesfactoresSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEvaluacionesFactores= new GridBagConstraints();
						this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
						this.jContentPaneDetalleEvaluacionesFactores.add(this.jTabbedPaneRelacionesEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEvaluacionesFactores.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEvaluacionesFactores.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
					this.gridBagConstraintsEvaluacionesFactores.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
					
				
					this.jContentPaneDetalleEvaluacionesFactores.add(jPanelCamposOcultosEvaluacionesFactores, gridBagConstraintsEvaluacionesFactores);
				
					this.jPanelCamposOcultosEvaluacionesFactores.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	        this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEvaluacionesFactores.add(this.jPanelAccionesFormularioEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);							
			
			
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
	        this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
	        
			
			this.jContentPaneDetalleEvaluacionesFactores.add(this.jPanelAccionesEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEvaluacionesFactores);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEvaluacionesFactores=   new JScrollPane(this.jPanelCamposEvaluacionesFactores,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEvaluacionesFactores.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionesFactores.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionesFactores.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
			this.gridBagConstraintsEvaluacionesFactores.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEvaluacionesFactores.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEvaluacionesFactores.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);			
			
			this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesFactores.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
			
			
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesFactores.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		
			
		this.gridBagConstraintsEvaluacionesFactores = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesFactores.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesFactores.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEvaluacionesFactores, this.gridBagConstraintsEvaluacionesFactores);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEvaluacionesFactores;//jContentPane;
		
		return jScrollPanelDatosEdicionEvaluacionesFactores;
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
