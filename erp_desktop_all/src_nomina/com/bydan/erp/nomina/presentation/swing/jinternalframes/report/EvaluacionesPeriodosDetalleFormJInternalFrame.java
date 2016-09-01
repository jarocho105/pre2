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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.report.EvaluacionesPeriodosConstantesFunciones;

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
public class EvaluacionesPeriodosDetalleFormJInternalFrame extends EvaluacionesPeriodosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEvaluacionesPeriodos;
	
	protected JMenuBar jmenuBarDetalleEvaluacionesPeriodos;
	
	protected JMenu jmenuDetalleEvaluacionesPeriodos;
	protected JMenu jmenuDetalleArchivoEvaluacionesPeriodos;
	protected JMenu jmenuDetalleAccionesEvaluacionesPeriodos;
	protected JMenu jmenuDetalleDatosEvaluacionesPeriodos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEvaluacionesPeriodos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEvaluacionesPeriodos;	
	protected GridBagConstraints gridBagConstraintsEvaluacionesPeriodos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EvaluacionesPeriodosBeanSwingJInternalFrameAdditional jInternalFrameDetalleEvaluacionesPeriodos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoCalificacionEmpleadoBeanSwingJInternalFrame tipocalificacionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocalificacionempleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected TipoEvaluacionEmpleadoBeanSwingJInternalFrame tipoevaluacionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoevaluacionempleado="";

	protected FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomipreguntanomi="";
	
	public EvaluacionesPeriodosSessionBean evaluacionesperiodosSessionBean;
	
	
	
	
	public TipoCalificacionEmpleadoSessionBean tipocalificacionempleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public TipoEvaluacionEmpleadoSessionBean tipoevaluacionempleadoSessionBean;
	public FormatoNomiPreguntaNomiSessionBean formatonomipreguntanomiSessionBean;	
	
	public EvaluacionesPeriodosLogic evaluacionesperiodosLogic;
	
	public JScrollPane jScrollPanelDatosEvaluacionesPeriodos;
	public JScrollPane jScrollPanelDatosEdicionEvaluacionesPeriodos;
	public JScrollPane jScrollPanelDatosGeneralEvaluacionesPeriodos;
	
	protected JPanel jPanelCamposEvaluacionesPeriodos;    
	protected JPanel jPanelCamposOcultosEvaluacionesPeriodos;    	
	protected JPanel jPanelAccionesEvaluacionesPeriodos;
	protected JPanel jPanelAccionesFormularioEvaluacionesPeriodos;
    
	
	
	protected Integer iXPanelCamposEvaluacionesPeriodos=0;
	protected Integer iYPanelCamposEvaluacionesPeriodos=0;
	
	protected Integer iXPanelCamposOcultosEvaluacionesPeriodos=0;
	protected Integer iYPanelCamposOcultosEvaluacionesPeriodos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEvaluacionesPeriodos;
	public JButton jButtonModificarEvaluacionesPeriodos;
	public JButton jButtonActualizarEvaluacionesPeriodos;
    public JButton jButtonEliminarEvaluacionesPeriodos;
	public JButton jButtonCancelarEvaluacionesPeriodos;
    public JButton jButtonGuardarCambiosEvaluacionesPeriodos;
	public JButton jButtonGuardarCambiosTablaEvaluacionesPeriodos;
	protected JButton jButtonCerrarEvaluacionesPeriodos;
	
	
	protected JButton jButtonProcesarInformacionEvaluacionesPeriodos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEvaluacionesPeriodos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEvaluacionesPeriodos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEvaluacionesPeriodos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEvaluacionesPeriodos;
	protected JButton jButtonModificarToolBarEvaluacionesPeriodos;
	protected JButton jButtonActualizarToolBarEvaluacionesPeriodos;
    protected JButton jButtonEliminarToolBarEvaluacionesPeriodos;
	protected JButton jButtonCancelarToolBarEvaluacionesPeriodos;
    protected JButton jButtonGuardarCambiosToolBarEvaluacionesPeriodos;
	protected JButton jButtonGuardarCambiosTablaToolBarEvaluacionesPeriodos;
	protected JButton jButtonMostrarOcultarTablaToolBarEvaluacionesPeriodos;
	protected JButton jButtonCerrarToolBarEvaluacionesPeriodos;
	
	protected JButton jButtonProcesarInformacionToolBarEvaluacionesPeriodos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEvaluacionesPeriodos;
	protected JMenuItem jMenuItemModificarEvaluacionesPeriodos;
	protected JMenuItem jMenuItemActualizarEvaluacionesPeriodos;
    protected JMenuItem jMenuItemEliminarEvaluacionesPeriodos;
	protected JMenuItem jMenuItemCancelarEvaluacionesPeriodos;
    protected JMenuItem jMenuItemGuardarCambiosEvaluacionesPeriodos;
	protected JMenuItem jMenuItemGuardarCambiosTablaEvaluacionesPeriodos;
	protected JMenuItem jMenuItemCerrarEvaluacionesPeriodos;
	protected JMenuItem jMenuItemDetalleCerrarEvaluacionesPeriodos;
	protected JMenuItem jMenuItemDetalleMostarOcultarEvaluacionesPeriodos;
	
	protected JMenuItem jMenuItemProcesarInformacionEvaluacionesPeriodos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEvaluacionesPeriodos;
	protected JMenuItem jMenuItemMostrarOcultarEvaluacionesPeriodos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEvaluacionesPeriodos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEvaluacionesPeriodos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEvaluacionesPeriodos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEvaluacionesPeriodos;
	public JLabel jLabelIdEvaluacionesPeriodos;
	public JLabel jLabelidEvaluacionesPeriodos;
	public JButton jButtonidEvaluacionesPeriodosBusqueda= new JButtonMe();

	public JPanel jPanelverificadoEvaluacionesPeriodos;
	public JLabel jLabelverificadoEvaluacionesPeriodos;
	public JCheckBox jCheckBoxverificadoEvaluacionesPeriodos;
	public JButton jButtonverificadoEvaluacionesPeriodosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEvaluacionesPeriodos;
	public JLabel jLabelcodigoEvaluacionesPeriodos;
	public JTextField jTextFieldcodigoEvaluacionesPeriodos;
	public JButton jButtoncodigoEvaluacionesPeriodosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_datoEvaluacionesPeriodos;
	public JLabel jLabelcodigo_datoEvaluacionesPeriodos;
	public JTextField jTextFieldcodigo_datoEvaluacionesPeriodos;
	public JButton jButtoncodigo_datoEvaluacionesPeriodosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoEvaluacionesPeriodos;
	public JLabel jLabelnombre_completoEvaluacionesPeriodos;
	public JTextArea jTextAreanombre_completoEvaluacionesPeriodos;
	public JScrollPane jscrollPanenombre_completoEvaluacionesPeriodos;
	public JButton jButtonnombre_completoEvaluacionesPeriodosBusqueda= new JButtonMe();

	public JPanel jPanelvalor_conocimientoEvaluacionesPeriodos;
	public JLabel jLabelvalor_conocimientoEvaluacionesPeriodos;
	public JTextField jTextFieldvalor_conocimientoEvaluacionesPeriodos;
	public JButton jButtonvalor_conocimientoEvaluacionesPeriodosBusqueda= new JButtonMe();

	public JPanel jPanelvalor_eficienciaEvaluacionesPeriodos;
	public JLabel jLabelvalor_eficienciaEvaluacionesPeriodos;
	public JTextField jTextFieldvalor_eficienciaEvaluacionesPeriodos;
	public JButton jButtonvalor_eficienciaEvaluacionesPeriodosBusqueda= new JButtonMe();

	public JPanel jPanelvalor_obtenidoEvaluacionesPeriodos;
	public JLabel jLabelvalor_obtenidoEvaluacionesPeriodos;
	public JTextField jTextFieldvalor_obtenidoEvaluacionesPeriodos;
	public JButton jButtonvalor_obtenidoEvaluacionesPeriodosBusqueda= new JButtonMe();

	public JPanel jPanelpromedioEvaluacionesPeriodos;
	public JLabel jLabelpromedioEvaluacionesPeriodos;
	public JTextField jTextFieldpromedioEvaluacionesPeriodos;
	public JButton jButtonpromedioEvaluacionesPeriodosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_calificacion_empleadoEvaluacionesPeriodos;
	public JLabel jLabelid_tipo_calificacion_empleadoEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos;
	public JButton jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodos= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraEvaluacionesPeriodos;
	public JLabel jLabelid_estructuraEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraEvaluacionesPeriodos;
	public JButton jButtonid_estructuraEvaluacionesPeriodos= new JButtonMe();
	public JButton jButtonid_estructuraEvaluacionesPeriodosUpdate= new JButtonMe();
	public JButton jButtonid_estructuraEvaluacionesPeriodosBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaEvaluacionesPeriodos;
	public JLabel jLabelid_empresaEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEvaluacionesPeriodos;
	public JButton jButtonid_empresaEvaluacionesPeriodos= new JButtonMe();
	public JButton jButtonid_empresaEvaluacionesPeriodosUpdate= new JButtonMe();
	public JButton jButtonid_empresaEvaluacionesPeriodosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalEvaluacionesPeriodos;
	public JLabel jLabelid_sucursalEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalEvaluacionesPeriodos;
	public JButton jButtonid_sucursalEvaluacionesPeriodos= new JButtonMe();
	public JButton jButtonid_sucursalEvaluacionesPeriodosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalEvaluacionesPeriodosBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioEvaluacionesPeriodos;
	public JLabel jLabelid_ejercicioEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioEvaluacionesPeriodos;
	public JButton jButtonid_ejercicioEvaluacionesPeriodos= new JButtonMe();
	public JButton jButtonid_ejercicioEvaluacionesPeriodosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioEvaluacionesPeriodosBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_evaluacion_empleadoEvaluacionesPeriodos;
	public JLabel jLabelid_tipo_evaluacion_empleadoEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos;
	public JButton jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodos= new JButtonMe();
	public JButton jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos;
	public JLabel jLabelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos;
	public JButton jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodos= new JButtonMe();
	public JButton jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate= new JButtonMe();
	public JButton jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEvaluacionesPeriodos;
	
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
	
	public EvaluacionesPeriodosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEvaluacionesPeriodos=new JPanel();
				this.jPanelAccionesFormularioEvaluacionesPeriodos=new JPanel();
				this.jmenuBarDetalleEvaluacionesPeriodos=new JMenuBar();
				this.jTtoolBarDetalleEvaluacionesPeriodos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesPeriodosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EvaluacionesPeriodos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EvaluacionesPeriodosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EvaluacionesPeriodos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesPeriodosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionesPeriodos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesPeriodosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionesPeriodos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesPeriodosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EvaluacionesPeriodos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEvaluacionesPeriodos() {
		return this.jButtonActualizarToolBarEvaluacionesPeriodos;
	}
	
	public JButton getjButtonEliminarToolBarEvaluacionesPeriodos() {
		return this.jButtonEliminarToolBarEvaluacionesPeriodos;
	}
	
	public JButton getjButtonCancelarToolBarEvaluacionesPeriodos() {
		return this.jButtonCancelarToolBarEvaluacionesPeriodos;
	}		
	
	public JButton getjButtonProcesarInformacionEvaluacionesPeriodos() {
		return this.jButtonProcesarInformacionEvaluacionesPeriodos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEvaluacionesPeriodos)	{
		this.jButtonProcesarInformacionEvaluacionesPeriodos = jButtonProcesarInformacionEvaluacionesPeriodos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEvaluacionesPeriodos() {
		return this.jComboBoxTiposAccionesEvaluacionesPeriodos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEvaluacionesPeriodos(
			JComboBox jComboBoxTiposRelacionesEvaluacionesPeriodos) {
		this.jComboBoxTiposRelacionesEvaluacionesPeriodos = jComboBoxTiposRelacionesEvaluacionesPeriodos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEvaluacionesPeriodos(
			JComboBox jComboBoxTiposAccionesEvaluacionesPeriodos) {
		this.jComboBoxTiposAccionesEvaluacionesPeriodos = jComboBoxTiposAccionesEvaluacionesPeriodos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEvaluacionesPeriodos() {
		return this.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEvaluacionesPeriodos(
			JComboBox jComboBoxTiposAccionesFormularioEvaluacionesPeriodos) {
		this.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos = jComboBoxTiposAccionesFormularioEvaluacionesPeriodos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.evaluacionesperiodosSessionBean=new EvaluacionesPeriodosSessionBean();
		
		this.evaluacionesperiodosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionesperiodosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EvaluacionesPeriodosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EvaluacionesPeriodosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EvaluacionesPeriodosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Evaluaciones Periodos MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
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
	
		EvaluacionesPeriodosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEvaluacionesPeriodos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEvaluacionesPeriodos=new JButtonMe();
				this.jButtonModificarToolBarEvaluacionesPeriodos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEvaluacionesPeriodos,this.jTtoolBarDetalleEvaluacionesPeriodos,
							"actualizar","actualizar","Actualizar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEvaluacionesPeriodos,this.jTtoolBarDetalleEvaluacionesPeriodos,
							"eliminar","eliminar","Eliminar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEvaluacionesPeriodos,this.jTtoolBarDetalleEvaluacionesPeriodos,
							"cancelar","cancelar","Cancelar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEvaluacionesPeriodos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEvaluacionesPeriodos,this.jTtoolBarDetalleEvaluacionesPeriodos,
							"guardarcambios","guardarcambios","Guardar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEvaluacionesPeriodos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEvaluacionesPeriodos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEvaluacionesPeriodos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEvaluacionesPeriodos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEvaluacionesPeriodos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEvaluacionesPeriodos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEvaluacionesPeriodos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEvaluacionesPeriodos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEvaluacionesPeriodos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEvaluacionesPeriodos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEvaluacionesPeriodos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEvaluacionesPeriodos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEvaluacionesPeriodos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEvaluacionesPeriodos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEvaluacionesPeriodos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEvaluacionesPeriodos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEvaluacionesPeriodos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEvaluacionesPeriodos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEvaluacionesPeriodos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEvaluacionesPeriodos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEvaluacionesPeriodos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEvaluacionesPeriodos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEvaluacionesPeriodos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEvaluacionesPeriodos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEvaluacionesPeriodos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEvaluacionesPeriodos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEvaluacionesPeriodos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEvaluacionesPeriodos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEvaluacionesPeriodos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEvaluacionesPeriodos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEvaluacionesPeriodos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEvaluacionesPeriodos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEvaluacionesPeriodos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEvaluacionesPeriodos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEvaluacionesPeriodos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEvaluacionesPeriodos.add(this.jMenuItemDetalleCerrarEvaluacionesPeriodos);
		
		this.jmenuDetalleAccionesEvaluacionesPeriodos.add(this.jMenuItemActualizarEvaluacionesPeriodos);
		this.jmenuDetalleAccionesEvaluacionesPeriodos.add(this.jMenuItemEliminarEvaluacionesPeriodos);
		this.jmenuDetalleAccionesEvaluacionesPeriodos.add(this.jMenuItemCancelarEvaluacionesPeriodos);		
		
		//this.jmenuDetalleDatosEvaluacionesPeriodos.add(this.jMenuItemDetalleAbrirOrderByEvaluacionesPeriodos);				
		this.jmenuDetalleDatosEvaluacionesPeriodos.add(this.jMenuItemDetalleMostarOcultarEvaluacionesPeriodos);				
				
		//this.jmenuDetalleAccionesEvaluacionesPeriodos.add(this.jMenuItemGuardarCambiosEvaluacionesPeriodos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEvaluacionesPeriodos.add(this.jmenuDetalleArchivoEvaluacionesPeriodos);		
		this.jmenuBarDetalleEvaluacionesPeriodos.add(this.jmenuDetalleAccionesEvaluacionesPeriodos);		
		this.jmenuBarDetalleEvaluacionesPeriodos.add(this.jmenuDetalleDatosEvaluacionesPeriodos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEvaluacionesPeriodos);				
	}
	
	
	public void inicializarElementosCamposEvaluacionesPeriodos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEvaluacionesPeriodos = new JLabelMe();
		jLabelIdEvaluacionesPeriodos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEvaluacionesPeriodos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEvaluacionesPeriodos= new GridBagLayout();

		this.jPanelidEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);

		jLabelidEvaluacionesPeriodos = new JLabel();
		jLabelidEvaluacionesPeriodos.setText("Id");

		jLabelidEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelverificadoEvaluacionesPeriodos = new JLabelMe();
		this.jLabelverificadoEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_VERIFICADO+" : *");
		this.jLabelverificadoEvaluacionesPeriodos.setToolTipText("Verificado");
		this.jLabelverificadoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelverificadoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelverificadoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelverificadoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelverificadoEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelverificadoEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_VERIFICADO);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelverificadoEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jCheckBoxverificadoEvaluacionesPeriodos= new JCheckBoxMe();
		jCheckBoxverificadoEvaluacionesPeriodos.setEnabled(false);

		jCheckBoxverificadoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxverificadoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxverificadoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxverificadoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonverificadoEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtonverificadoEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonverificadoEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonverificadoEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonverificadoEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtonverificadoEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonverificadoEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonverificadoEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxverificadoEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxverificadoEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"verificadoEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonverificadoEvaluacionesPeriodosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoEvaluacionesPeriodos = new JLabelMe();
		this.jLabelcodigoEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEvaluacionesPeriodos.setToolTipText("Codigo");
		this.jLabelcodigoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelcodigoEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jTextFieldcodigoEvaluacionesPeriodos= new JTextFieldMe();

		jTextFieldcodigoEvaluacionesPeriodos.setEnabled(false);
		jTextFieldcodigoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtoncodigoEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtoncodigoEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEvaluacionesPeriodosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_datoEvaluacionesPeriodos = new JLabelMe();
		this.jLabelcodigo_datoEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO+" : *");
		this.jLabelcodigo_datoEvaluacionesPeriodos.setToolTipText("Codigo Dato");
		this.jLabelcodigo_datoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_datoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_datoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_datoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_datoEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_datoEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelcodigo_datoEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jTextFieldcodigo_datoEvaluacionesPeriodos= new JTextFieldMe();

		jTextFieldcodigo_datoEvaluacionesPeriodos.setEnabled(false);
		jTextFieldcodigo_datoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_datoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_datoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_datoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_datoEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtoncodigo_datoEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_datoEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_datoEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_datoEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtoncodigo_datoEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_datoEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_datoEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_datoEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_datoEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_datoEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_datoEvaluacionesPeriodosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoEvaluacionesPeriodos = new JLabelMe();
		this.jLabelnombre_completoEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoEvaluacionesPeriodos.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelnombre_completoEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jTextAreanombre_completoEvaluacionesPeriodos= new JTextAreaMe();
		jTextAreanombre_completoEvaluacionesPeriodos.setEnabled(false);
		jTextAreanombre_completoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoEvaluacionesPeriodos.setLineWrap(true);
		jTextAreanombre_completoEvaluacionesPeriodos.setWrapStyleWord(true);
		jTextAreanombre_completoEvaluacionesPeriodos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoEvaluacionesPeriodos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoEvaluacionesPeriodos = new JScrollPane(jTextAreanombre_completoEvaluacionesPeriodos);
		jscrollPanenombre_completoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_completoEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtonnombre_completoEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtonnombre_completoEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoEvaluacionesPeriodosBusqueda.setVisible(false);		}


					
		this.jLabelvalor_conocimientoEvaluacionesPeriodos = new JLabelMe();
		this.jLabelvalor_conocimientoEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO+" : *");
		this.jLabelvalor_conocimientoEvaluacionesPeriodos.setToolTipText("Valor Conocimiento");
		this.jLabelvalor_conocimientoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_conocimientoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_conocimientoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_conocimientoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_conocimientoEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_conocimientoEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelvalor_conocimientoEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jTextFieldvalor_conocimientoEvaluacionesPeriodos= new JTextFieldMe();
		jTextFieldvalor_conocimientoEvaluacionesPeriodos.setEnabled(false);
		jTextFieldvalor_conocimientoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_conocimientoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_conocimientoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_conocimientoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_conocimientoEvaluacionesPeriodos.setText("0.0");

		this.jButtonvalor_conocimientoEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtonvalor_conocimientoEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_conocimientoEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_conocimientoEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_conocimientoEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtonvalor_conocimientoEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_conocimientoEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_conocimientoEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_conocimientoEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_conocimientoEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_conocimientoEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_conocimientoEvaluacionesPeriodosBusqueda.setVisible(false);		}


					
		this.jLabelvalor_eficienciaEvaluacionesPeriodos = new JLabelMe();
		this.jLabelvalor_eficienciaEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA+" : *");
		this.jLabelvalor_eficienciaEvaluacionesPeriodos.setToolTipText("Valor Eficiencia");
		this.jLabelvalor_eficienciaEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_eficienciaEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_eficienciaEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_eficienciaEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_eficienciaEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_eficienciaEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelvalor_eficienciaEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jTextFieldvalor_eficienciaEvaluacionesPeriodos= new JTextFieldMe();
		jTextFieldvalor_eficienciaEvaluacionesPeriodos.setEnabled(false);
		jTextFieldvalor_eficienciaEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_eficienciaEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_eficienciaEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_eficienciaEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_eficienciaEvaluacionesPeriodos.setText("0.0");

		this.jButtonvalor_eficienciaEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtonvalor_eficienciaEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_eficienciaEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_eficienciaEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_eficienciaEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtonvalor_eficienciaEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_eficienciaEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_eficienciaEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_eficienciaEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_eficienciaEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_eficienciaEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_eficienciaEvaluacionesPeriodosBusqueda.setVisible(false);		}


					
		this.jLabelvalor_obtenidoEvaluacionesPeriodos = new JLabelMe();
		this.jLabelvalor_obtenidoEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO+" : *");
		this.jLabelvalor_obtenidoEvaluacionesPeriodos.setToolTipText("Valor Obtenido");
		this.jLabelvalor_obtenidoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_obtenidoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_obtenidoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_obtenidoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_obtenidoEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_obtenidoEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelvalor_obtenidoEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jTextFieldvalor_obtenidoEvaluacionesPeriodos= new JTextFieldMe();
		jTextFieldvalor_obtenidoEvaluacionesPeriodos.setEnabled(false);
		jTextFieldvalor_obtenidoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_obtenidoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_obtenidoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_obtenidoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_obtenidoEvaluacionesPeriodos.setText("0.0");

		this.jButtonvalor_obtenidoEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtonvalor_obtenidoEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_obtenidoEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_obtenidoEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_obtenidoEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtonvalor_obtenidoEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_obtenidoEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_obtenidoEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_obtenidoEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_obtenidoEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_obtenidoEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_obtenidoEvaluacionesPeriodosBusqueda.setVisible(false);		}


					
		this.jLabelpromedioEvaluacionesPeriodos = new JLabelMe();
		this.jLabelpromedioEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO+" : *");
		this.jLabelpromedioEvaluacionesPeriodos.setToolTipText("Promedio");
		this.jLabelpromedioEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpromedioEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpromedioEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpromedioEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpromedioEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpromedioEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelpromedioEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jTextFieldpromedioEvaluacionesPeriodos= new JTextFieldMe();
		jTextFieldpromedioEvaluacionesPeriodos.setEnabled(false);
		jTextFieldpromedioEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpromedioEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpromedioEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpromedioEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpromedioEvaluacionesPeriodos.setText("0.0");

		this.jButtonpromedioEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtonpromedioEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpromedioEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpromedioEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpromedioEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtonpromedioEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpromedioEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpromedioEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpromedioEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpromedioEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"promedioEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpromedioEvaluacionesPeriodosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEvaluacionesPeriodos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesPeriodos = new JLabelMe();
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO+" : *");
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesPeriodos.setToolTipText("Tipo Calificacion Empleado");
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_calificacion_empleadoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_calificacion_empleadoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_calificacion_empleadoEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_calificacion_empleadoEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelid_tipo_calificacion_empleadoEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos= new JComboBoxMe();
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodos= new JButtonMe();
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodos.setText("Buscar");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calificacion_empleadoEvaluacionesPeriodos"));

		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda.setVisible(false);		}

		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate= new JButtonMe();
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate.setText("U");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate"));



					
		this.jLabelid_estructuraEvaluacionesPeriodos = new JLabelMe();
		this.jLabelid_estructuraEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraEvaluacionesPeriodos.setToolTipText("Estructura");
		this.jLabelid_estructuraEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelid_estructuraEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jComboBoxid_estructuraEvaluacionesPeriodos= new JComboBoxMe();
		jComboBoxid_estructuraEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraEvaluacionesPeriodos= new JButtonMe();
		this.jButtonid_estructuraEvaluacionesPeriodos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionesPeriodos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionesPeriodos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionesPeriodos.setText("Buscar");
		this.jButtonid_estructuraEvaluacionesPeriodos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraEvaluacionesPeriodos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionesPeriodos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionesPeriodos"));

		this.jButtonid_estructuraEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtonid_estructuraEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtonid_estructuraEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraEvaluacionesPeriodosBusqueda.setVisible(false);		}

		this.jButtonid_estructuraEvaluacionesPeriodosUpdate= new JButtonMe();
		this.jButtonid_estructuraEvaluacionesPeriodosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionesPeriodosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionesPeriodosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEvaluacionesPeriodosUpdate.setText("U");
		this.jButtonid_estructuraEvaluacionesPeriodosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraEvaluacionesPeriodosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionesPeriodosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionesPeriodosUpdate"));



					
		this.jLabelid_empresaEvaluacionesPeriodos = new JLabelMe();
		this.jLabelid_empresaEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEvaluacionesPeriodos.setToolTipText("Empresa");
		this.jLabelid_empresaEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelid_empresaEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jComboBoxid_empresaEvaluacionesPeriodos= new JComboBoxMe();
		jComboBoxid_empresaEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEvaluacionesPeriodos.setEnabled(false);

		this.jButtonid_empresaEvaluacionesPeriodos= new JButtonMe();
		this.jButtonid_empresaEvaluacionesPeriodos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionesPeriodos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionesPeriodos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionesPeriodos.setText("Buscar");
		this.jButtonid_empresaEvaluacionesPeriodos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEvaluacionesPeriodos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionesPeriodos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionesPeriodos"));

		this.jButtonid_empresaEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtonid_empresaEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtonid_empresaEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEvaluacionesPeriodosBusqueda.setVisible(false);		}

		this.jButtonid_empresaEvaluacionesPeriodosUpdate= new JButtonMe();
		this.jButtonid_empresaEvaluacionesPeriodosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionesPeriodosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionesPeriodosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEvaluacionesPeriodosUpdate.setText("U");
		this.jButtonid_empresaEvaluacionesPeriodosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEvaluacionesPeriodosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionesPeriodosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionesPeriodosUpdate"));



					
		this.jLabelid_sucursalEvaluacionesPeriodos = new JLabelMe();
		this.jLabelid_sucursalEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalEvaluacionesPeriodos.setToolTipText("Sucursal");
		this.jLabelid_sucursalEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelid_sucursalEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jComboBoxid_sucursalEvaluacionesPeriodos= new JComboBoxMe();
		jComboBoxid_sucursalEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalEvaluacionesPeriodos.setEnabled(false);

		this.jButtonid_sucursalEvaluacionesPeriodos= new JButtonMe();
		this.jButtonid_sucursalEvaluacionesPeriodos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionesPeriodos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionesPeriodos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionesPeriodos.setText("Buscar");
		this.jButtonid_sucursalEvaluacionesPeriodos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalEvaluacionesPeriodos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionesPeriodos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionesPeriodos"));

		this.jButtonid_sucursalEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtonid_sucursalEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtonid_sucursalEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalEvaluacionesPeriodosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalEvaluacionesPeriodosUpdate= new JButtonMe();
		this.jButtonid_sucursalEvaluacionesPeriodosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionesPeriodosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionesPeriodosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEvaluacionesPeriodosUpdate.setText("U");
		this.jButtonid_sucursalEvaluacionesPeriodosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalEvaluacionesPeriodosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionesPeriodosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionesPeriodosUpdate"));



					
		this.jLabelid_ejercicioEvaluacionesPeriodos = new JLabelMe();
		this.jLabelid_ejercicioEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioEvaluacionesPeriodos.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelid_ejercicioEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jComboBoxid_ejercicioEvaluacionesPeriodos= new JComboBoxMe();
		jComboBoxid_ejercicioEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioEvaluacionesPeriodos.setEnabled(false);

		this.jButtonid_ejercicioEvaluacionesPeriodos= new JButtonMe();
		this.jButtonid_ejercicioEvaluacionesPeriodos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEvaluacionesPeriodos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEvaluacionesPeriodos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEvaluacionesPeriodos.setText("Buscar");
		this.jButtonid_ejercicioEvaluacionesPeriodos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioEvaluacionesPeriodos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEvaluacionesPeriodos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEvaluacionesPeriodos"));

		this.jButtonid_ejercicioEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtonid_ejercicioEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtonid_ejercicioEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioEvaluacionesPeriodosBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioEvaluacionesPeriodosUpdate= new JButtonMe();
		this.jButtonid_ejercicioEvaluacionesPeriodosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionesPeriodosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionesPeriodosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioEvaluacionesPeriodosUpdate.setText("U");
		this.jButtonid_ejercicioEvaluacionesPeriodosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioEvaluacionesPeriodosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEvaluacionesPeriodosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEvaluacionesPeriodosUpdate"));



					
		this.jLabelid_tipo_evaluacion_empleadoEvaluacionesPeriodos = new JLabelMe();
		this.jLabelid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOEVALUACIONEMPLEADO+" : *");
		this.jLabelid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setToolTipText("Tipo Evaluacion Empleado");
		this.jLabelid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_evaluacion_empleadoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_evaluacion_empleadoEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOEVALUACIONEMPLEADO);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos= new JComboBoxMe();
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodos= new JButtonMe();
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setText("Buscar");
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_evaluacion_empleadoEvaluacionesPeriodos"));

		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda.setVisible(false);		}

		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate= new JButtonMe();
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate.setText("U");
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate"));



					
		this.jLabelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos = new JLabelMe();
		this.jLabelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setText(""+EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI+" : *");
		this.jLabelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setToolTipText("Formato Nomi Pregunta Nomi");
		this.jLabelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setToolTipText(EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI);
		this.gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setLayout(this.gridaBagLayoutEvaluacionesPeriodos);


		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos= new JComboBoxMe();
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodos= new JButtonMe();
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setText("Buscar");
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomi_pregunta_nomiEvaluacionesPeriodos"));

		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda= new JButtonMe();
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda.setText("U");
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda"));

		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda.setVisible(false);		}

		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate= new JButtonMe();
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate.setText("U");
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate"));



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
		//this.jInternalFrameDetalleEvaluacionesPeriodos = new EvaluacionesPeriodosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Evaluaciones Periodos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEvaluacionesPeriodos= new GridBagLayout();
		

		
		String sToolTipEvaluacionesPeriodos="";
		sToolTipEvaluacionesPeriodos=EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEvaluacionesPeriodos+="(Nomina.EvaluacionesPeriodos)";
		}
		
		if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
			sToolTipEvaluacionesPeriodos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEvaluacionesPeriodos = new JButtonMe();
		this.jButtonModificarEvaluacionesPeriodos = new JButtonMe();
        this.jButtonActualizarEvaluacionesPeriodos = new JButtonMe();
        this.jButtonEliminarEvaluacionesPeriodos = new JButtonMe();
        this.jButtonCancelarEvaluacionesPeriodos = new JButtonMe();
        this.jButtonGuardarCambiosEvaluacionesPeriodos = new JButtonMe();
		this.jButtonGuardarCambiosTablaEvaluacionesPeriodos = new JButtonMe();
		this.jButtonCerrarEvaluacionesPeriodos = new JButtonMe();
		
		this.jScrollPanelDatosEvaluacionesPeriodos = new JScrollPane();   
        this.jScrollPanelDatosEdicionEvaluacionesPeriodos = new JScrollPane();
		this.jScrollPanelDatosGeneralEvaluacionesPeriodos = new JScrollPane();
				
		
		
		this.jPanelCamposEvaluacionesPeriodos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEvaluacionesPeriodos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEvaluacionesPeriodos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEvaluacionesPeriodos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Evaluaciones Periodos";
		
		if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Periodoses" + this.sPath));
		} else {
			this.jScrollPanelDatosEvaluacionesPeriodos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEvaluacionesPeriodos.setName("jPanelCamposEvaluacionesPeriodos"); 

		this.jPanelCamposOcultosEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEvaluacionesPeriodos.setName("jPanelCamposOcultosEvaluacionesPeriodos"); 

        this.jPanelAccionesEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEvaluacionesPeriodos.setToolTipText("Acciones");
        this.jPanelAccionesEvaluacionesPeriodos.setName("Acciones"); 

		this.jPanelAccionesFormularioEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEvaluacionesPeriodos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEvaluacionesPeriodos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEvaluacionesPeriodos.setText("Nuevo");
		this.jButtonModificarEvaluacionesPeriodos.setText("Editar");
        this.jButtonActualizarEvaluacionesPeriodos.setText("Actualizar");
        this.jButtonEliminarEvaluacionesPeriodos.setText("Eliminar");
        this.jButtonCancelarEvaluacionesPeriodos.setText("Cancelar");
        this.jButtonGuardarCambiosEvaluacionesPeriodos.setText("Guardar");
		this.jButtonGuardarCambiosTablaEvaluacionesPeriodos.setText("Guardar");
		this.jButtonCerrarEvaluacionesPeriodos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEvaluacionesPeriodos,"nuevo_button","Nuevo",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEvaluacionesPeriodos,"modificar_button","Editar",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEvaluacionesPeriodos,"actualizar_button","Actualizar",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEvaluacionesPeriodos,"eliminar_button","Eliminar",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEvaluacionesPeriodos,"cancelar_button","Cancelar",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEvaluacionesPeriodos,"guardarcambios_button","Guardar",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEvaluacionesPeriodos,"guardarcambiostabla_button","Guardar",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEvaluacionesPeriodos,"cerrar_button","Salir",this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEvaluacionesPeriodos.setToolTipText("Nuevo"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEvaluacionesPeriodos.setToolTipText("Editar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEvaluacionesPeriodos.setToolTipText("Actualizar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEvaluacionesPeriodos.setToolTipText("Eliminar)"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEvaluacionesPeriodos.setToolTipText("Cancelar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEvaluacionesPeriodos.setToolTipText("Guardar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEvaluacionesPeriodos.setToolTipText("Guardar"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEvaluacionesPeriodos.setToolTipText("Salir"+" "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEvaluacionesPeriodos";
		inputMap = this.jButtonNuevoEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEvaluacionesPeriodos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEvaluacionesPeriodos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEvaluacionesPeriodos";
		inputMap = this.jButtonActualizarEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEvaluacionesPeriodos"));
		
		//ELIMINAR
		sMapKey = "EliminarEvaluacionesPeriodos";
		inputMap = this.jButtonEliminarEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEvaluacionesPeriodos"));
		
		//CANCELAR	
		sMapKey = "CancelarEvaluacionesPeriodos";
		inputMap = this.jButtonCancelarEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEvaluacionesPeriodos"));
		
		//CERRAR		
		sMapKey = "CerrarEvaluacionesPeriodos";
		inputMap = this.jButtonCerrarEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEvaluacionesPeriodos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEvaluacionesPeriodos";
		inputMap = this.jButtonGuardarCambiosTablaEvaluacionesPeriodos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEvaluacionesPeriodos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEvaluacionesPeriodos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEvaluacionesPeriodos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEvaluacionesPeriodos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEvaluacionesPeriodos.setToolTipText("Nuevo EvaluacionesPeriodos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEvaluacionesPeriodos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEvaluacionesPeriodos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEvaluacionesPeriodos.setToolTipText("Sin Cerrar Ventana EvaluacionesPeriodos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEvaluacionesPeriodos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEvaluacionesPeriodos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEvaluacionesPeriodos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEvaluacionesPeriodos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEvaluacionesPeriodos.setText("Accion");
		this.jComboBoxTiposAccionesEvaluacionesPeriodos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEvaluacionesPeriodos = new JLabelMe();
		
		this.jLabelAccionesEvaluacionesPeriodos.setText("Acciones");		
		this.jLabelAccionesEvaluacionesPeriodos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionesPeriodos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionesPeriodos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEvaluacionesPeriodos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEvaluacionesPeriodos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEvaluacionesPeriodos=new JTabbedPane();
		this.jTabbedPaneRelacionesEvaluacionesPeriodos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEvaluacionesPeriodos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEvaluacionesPeriodos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionesPeriodos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionesPeriodos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEvaluacionesPeriodos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEvaluacionesPeriodos = new GridBagLayout();
		
		this.jPanelCamposEvaluacionesPeriodos.setLayout(gridaBagLayoutCamposEvaluacionesPeriodos);
		this.jPanelCamposOcultosEvaluacionesPeriodos.setLayout(gridaBagLayoutCamposOcultosEvaluacionesPeriodos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEvaluacionesPeriodos.add(jLabelIdEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEvaluacionesPeriodos.add(jLabelidEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_calificacion_empleadoEvaluacionesPeriodos.add(jLabelid_tipo_calificacion_empleadoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_calificacion_empleadoEvaluacionesPeriodos.add(jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 3;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_calificacion_empleadoEvaluacionesPeriodos.add(jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_calificacion_empleadoEvaluacionesPeriodos.add(jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelverificadoEvaluacionesPeriodos.add(jLabelverificadoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelverificadoEvaluacionesPeriodos.add(jButtonverificadoEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelverificadoEvaluacionesPeriodos.add(jCheckBoxverificadoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraEvaluacionesPeriodos.add(jLabelid_estructuraEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEvaluacionesPeriodos.add(jButtonid_estructuraEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 3;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEvaluacionesPeriodos.add(jButtonid_estructuraEvaluacionesPeriodosUpdate, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraEvaluacionesPeriodos.add(jComboBoxid_estructuraEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEvaluacionesPeriodos.add(jLabelcodigoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEvaluacionesPeriodos.add(jButtoncodigoEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEvaluacionesPeriodos.add(jTextFieldcodigoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEvaluacionesPeriodos.add(jLabelid_empresaEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEvaluacionesPeriodos.add(jButtonid_empresaEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 3;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEvaluacionesPeriodos.add(jButtonid_empresaEvaluacionesPeriodosUpdate, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEvaluacionesPeriodos.add(jComboBoxid_empresaEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalEvaluacionesPeriodos.add(jLabelid_sucursalEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEvaluacionesPeriodos.add(jButtonid_sucursalEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 3;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEvaluacionesPeriodos.add(jButtonid_sucursalEvaluacionesPeriodosUpdate, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalEvaluacionesPeriodos.add(jComboBoxid_sucursalEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioEvaluacionesPeriodos.add(jLabelid_ejercicioEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioEvaluacionesPeriodos.add(jButtonid_ejercicioEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 3;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioEvaluacionesPeriodos.add(jButtonid_ejercicioEvaluacionesPeriodosUpdate, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioEvaluacionesPeriodos.add(jComboBoxid_ejercicioEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_evaluacion_empleadoEvaluacionesPeriodos.add(jLabelid_tipo_evaluacion_empleadoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_evaluacion_empleadoEvaluacionesPeriodos.add(jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 3;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_evaluacion_empleadoEvaluacionesPeriodos.add(jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_evaluacion_empleadoEvaluacionesPeriodos.add(jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_datoEvaluacionesPeriodos.add(jLabelcodigo_datoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_datoEvaluacionesPeriodos.add(jButtoncodigo_datoEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_datoEvaluacionesPeriodos.add(jTextFieldcodigo_datoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoEvaluacionesPeriodos.add(jLabelnombre_completoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoEvaluacionesPeriodos.add(jButtonnombre_completoEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoEvaluacionesPeriodos.add(jscrollPanenombre_completoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.add(jLabelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.add(jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 3;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.add(jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.add(jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_conocimientoEvaluacionesPeriodos.add(jLabelvalor_conocimientoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_conocimientoEvaluacionesPeriodos.add(jButtonvalor_conocimientoEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_conocimientoEvaluacionesPeriodos.add(jTextFieldvalor_conocimientoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_eficienciaEvaluacionesPeriodos.add(jLabelvalor_eficienciaEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_eficienciaEvaluacionesPeriodos.add(jButtonvalor_eficienciaEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_eficienciaEvaluacionesPeriodos.add(jTextFieldvalor_eficienciaEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_obtenidoEvaluacionesPeriodos.add(jLabelvalor_obtenidoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_obtenidoEvaluacionesPeriodos.add(jButtonvalor_obtenidoEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_obtenidoEvaluacionesPeriodos.add(jTextFieldvalor_obtenidoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpromedioEvaluacionesPeriodos.add(jLabelpromedioEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 2;
		this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(0, 0, 0, 0);
		this.jPanelpromedioEvaluacionesPeriodos.add(jButtonpromedioEvaluacionesPeriodosBusqueda, this.gridBagConstraintsEvaluacionesPeriodos);
	}

	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = 1;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpromedioEvaluacionesPeriodos.add(jTextFieldpromedioEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesPeriodos.add(this.jPanelidEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposEvaluacionesPeriodos % 2==0) {
		iXPanelCamposEvaluacionesPeriodos=0;
		iYPanelCamposEvaluacionesPeriodos++;
	}
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesPeriodos.add(this.jPanelid_tipo_calificacion_empleadoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposEvaluacionesPeriodos % 2==0) {
		iXPanelCamposEvaluacionesPeriodos=0;
		iYPanelCamposEvaluacionesPeriodos++;
	}
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesPeriodos.add(this.jPanelverificadoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposEvaluacionesPeriodos % 2==0) {
		iXPanelCamposEvaluacionesPeriodos=0;
		iYPanelCamposEvaluacionesPeriodos++;
	}
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesPeriodos.add(this.jPanelid_estructuraEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposEvaluacionesPeriodos % 2==0) {
		iXPanelCamposEvaluacionesPeriodos=0;
		iYPanelCamposEvaluacionesPeriodos++;
	}
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesPeriodos.add(this.jPanelcodigoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposEvaluacionesPeriodos % 2==0) {
		iXPanelCamposEvaluacionesPeriodos=0;
		iYPanelCamposEvaluacionesPeriodos++;
	}
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesPeriodos.add(this.jPanelid_tipo_evaluacion_empleadoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposEvaluacionesPeriodos % 2==0) {
		iXPanelCamposEvaluacionesPeriodos=0;
		iYPanelCamposEvaluacionesPeriodos++;
	}
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesPeriodos.add(this.jPanelcodigo_datoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposEvaluacionesPeriodos % 2==0) {
		iXPanelCamposEvaluacionesPeriodos=0;
		iYPanelCamposEvaluacionesPeriodos++;
	}
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesPeriodos.add(this.jPanelnombre_completoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposEvaluacionesPeriodos % 2==0) {
		iXPanelCamposEvaluacionesPeriodos=0;
		iYPanelCamposEvaluacionesPeriodos++;
	}
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesPeriodos.add(this.jPanelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposEvaluacionesPeriodos % 2==0) {
		iXPanelCamposEvaluacionesPeriodos=0;
		iYPanelCamposEvaluacionesPeriodos++;
	}
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesPeriodos.add(this.jPanelvalor_conocimientoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposEvaluacionesPeriodos % 2==0) {
		iXPanelCamposEvaluacionesPeriodos=0;
		iYPanelCamposEvaluacionesPeriodos++;
	}
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesPeriodos.add(this.jPanelvalor_eficienciaEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposEvaluacionesPeriodos % 2==0) {
		iXPanelCamposEvaluacionesPeriodos=0;
		iYPanelCamposEvaluacionesPeriodos++;
	}
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesPeriodos.add(this.jPanelvalor_obtenidoEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposEvaluacionesPeriodos % 2==0) {
		iXPanelCamposEvaluacionesPeriodos=0;
		iYPanelCamposEvaluacionesPeriodos++;
	}
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionesPeriodos.add(this.jPanelpromedioEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposEvaluacionesPeriodos % 2==0) {
		iXPanelCamposEvaluacionesPeriodos=0;
		iYPanelCamposEvaluacionesPeriodos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposOcultosEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposOcultosEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionesPeriodos.add(this.jPanelid_empresaEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposOcultosEvaluacionesPeriodos % 2==0) {
		iXPanelCamposOcultosEvaluacionesPeriodos=0;
		iYPanelCamposOcultosEvaluacionesPeriodos++;
	}
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposOcultosEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposOcultosEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionesPeriodos.add(this.jPanelid_sucursalEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposOcultosEvaluacionesPeriodos % 2==0) {
		iXPanelCamposOcultosEvaluacionesPeriodos=0;
		iYPanelCamposOcultosEvaluacionesPeriodos++;
	}
	this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionesPeriodos.gridy = iYPanelCamposOcultosEvaluacionesPeriodos;
	this.gridBagConstraintsEvaluacionesPeriodos.gridx = iXPanelCamposOcultosEvaluacionesPeriodos++;
	this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionesPeriodos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionesPeriodos.add(this.jPanelid_ejercicioEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);



	if(iXPanelCamposOcultosEvaluacionesPeriodos % 2==0) {
		iXPanelCamposOcultosEvaluacionesPeriodos=0;
		iYPanelCamposOcultosEvaluacionesPeriodos++;
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
			
		GridBagLayout gridaBagLayoutAccionesEvaluacionesPeriodos= new GridBagLayout();
		this.jPanelAccionesEvaluacionesPeriodos.setLayout(gridaBagLayoutAccionesEvaluacionesPeriodos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEvaluacionesPeriodos= new GridBagLayout();
		this.jPanelAccionesFormularioEvaluacionesPeriodos.setLayout(gridaBagLayoutAccionesFormularioEvaluacionesPeriodos);
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEvaluacionesPeriodos.add(this.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXAccion++;
			
		this.jPanelAccionesEvaluacionesPeriodos.add(this.jButtonModificarEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);							

		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx =iPosXAccion++;
			
		this.jPanelAccionesEvaluacionesPeriodos.add(this.jButtonEliminarEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
			
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXAccion++;
		
		this.jPanelAccionesEvaluacionesPeriodos.add(this.jButtonActualizarEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);


		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = iPosXAccion++;
		
		this.jPanelAccionesEvaluacionesPeriodos.add(this.jButtonGuardarCambiosEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);	
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = 0;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx =iPosXAccion++;
		
		this.jPanelAccionesEvaluacionesPeriodos.add(this.jButtonCancelarEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEvaluacionesPeriodos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEvaluacionesPeriodos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();						
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;		
			//this.gridBagConstraintsEvaluacionesPeriodos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEvaluacionesPeriodos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionesPeriodos.gridx =0;
		this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEvaluacionesPeriodos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EvaluacionesPeriodosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEvaluacionesPeriodos = new EvaluacionesPeriodosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Evaluaciones Periodos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Evaluaciones Periodos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Evaluaciones Periodos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EvaluacionesPeriodosModel evaluacionesperiodosModel=new EvaluacionesPeriodosModel(this);
			
			//SI USARA CLASE INTERNA
			//EvaluacionesPeriodosModel.EvaluacionesPeriodosFocusTraversalPolicy evaluacionesperiodosFocusTraversalPolicy = evaluacionesperiodosModel.new EvaluacionesPeriodosFocusTraversalPolicy(this);
			
			//evaluacionesperiodosFocusTraversalPolicy.setevaluacionesperiodosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(evaluacionesperiodosModel);
			
			
			this.jContentPaneDetalleEvaluacionesPeriodos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEvaluacionesPeriodos = new GridBagLayout();	
			this.jContentPaneDetalleEvaluacionesPeriodos.setLayout(gridaBagLayoutDetalleEvaluacionesPeriodos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEvaluacionesPeriodos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
					
				
				this.jContentPaneDetalleEvaluacionesPeriodos.add(jTtoolBarDetalleEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);								
				
}
			
			this.jScrollPanelDatosEdicionEvaluacionesPeriodos=   new JScrollPane(jContentPaneDetalleEvaluacionesPeriodos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEvaluacionesPeriodos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionesPeriodos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionesPeriodos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEvaluacionesPeriodos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEvaluacionesPeriodos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionesPeriodos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionesPeriodos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	        
			this.jContentPaneDetalleEvaluacionesPeriodos.add(jPanelCamposEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);
			
			
			
			
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
						//&& evaluacionesperiodosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.evaluacionesperiodosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEvaluacionesPeriodos= new GridBagConstraints();
						this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
						this.jContentPaneDetalleEvaluacionesPeriodos.add(this.jTabbedPaneRelacionesEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEvaluacionesPeriodos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEvaluacionesPeriodos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
					this.gridBagConstraintsEvaluacionesPeriodos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
					
				
					this.jContentPaneDetalleEvaluacionesPeriodos.add(jPanelCamposOcultosEvaluacionesPeriodos, gridBagConstraintsEvaluacionesPeriodos);
				
					this.jPanelCamposOcultosEvaluacionesPeriodos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	        this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEvaluacionesPeriodos.add(this.jPanelAccionesFormularioEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);							
			
			
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
	        this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
	        
			
			this.jContentPaneDetalleEvaluacionesPeriodos.add(this.jPanelAccionesEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEvaluacionesPeriodos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEvaluacionesPeriodos=   new JScrollPane(this.jPanelCamposEvaluacionesPeriodos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEvaluacionesPeriodos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionesPeriodos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionesPeriodos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
			this.gridBagConstraintsEvaluacionesPeriodos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEvaluacionesPeriodos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEvaluacionesPeriodos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);			
			
			this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesPeriodos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
			
			
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		
			
		this.gridBagConstraintsEvaluacionesPeriodos = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesPeriodos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesPeriodos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEvaluacionesPeriodos, this.gridBagConstraintsEvaluacionesPeriodos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEvaluacionesPeriodos;//jContentPane;
		
		return jScrollPanelDatosEdicionEvaluacionesPeriodos;
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
