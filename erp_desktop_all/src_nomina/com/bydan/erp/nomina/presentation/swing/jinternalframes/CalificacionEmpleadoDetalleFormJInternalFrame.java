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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.CalificacionEmpleadoConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class CalificacionEmpleadoDetalleFormJInternalFrame extends CalificacionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCalificacionEmpleado;
	
	protected JMenuBar jmenuBarDetalleCalificacionEmpleado;
	
	protected JMenu jmenuDetalleCalificacionEmpleado;
	protected JMenu jmenuDetalleArchivoCalificacionEmpleado;
	protected JMenu jmenuDetalleAccionesCalificacionEmpleado;
	protected JMenu jmenuDetalleDatosCalificacionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCalificacionEmpleado;	
	protected GridBagConstraints gridBagConstraintsCalificacionEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CalificacionEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCalificacionEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EvaluacionEmpleadoBeanSwingJInternalFrame evaluacionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_evaluacionempleado="";

	protected FormatoNomiFactorNomiBeanSwingJInternalFrame formatonomifactornomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomifactornomi="";

	protected FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomipreguntanomi="";

	protected TipoCalificacionEmpleadoBeanSwingJInternalFrame tipocalificacionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocalificacionempleado="";
	
	public CalificacionEmpleadoSessionBean calificacionempleadoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EvaluacionEmpleadoSessionBean evaluacionempleadoSessionBean;
	public FormatoNomiFactorNomiSessionBean formatonomifactornomiSessionBean;
	public FormatoNomiPreguntaNomiSessionBean formatonomipreguntanomiSessionBean;
	public TipoCalificacionEmpleadoSessionBean tipocalificacionempleadoSessionBean;	
	
	public CalificacionEmpleadoLogic calificacionempleadoLogic;
	
	public JScrollPane jScrollPanelDatosCalificacionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionCalificacionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralCalificacionEmpleado;
	
	protected JPanel jPanelCamposCalificacionEmpleado;    
	protected JPanel jPanelCamposOcultosCalificacionEmpleado;    	
	protected JPanel jPanelAccionesCalificacionEmpleado;
	protected JPanel jPanelAccionesFormularioCalificacionEmpleado;
    
	
	
	protected Integer iXPanelCamposCalificacionEmpleado=0;
	protected Integer iYPanelCamposCalificacionEmpleado=0;
	
	protected Integer iXPanelCamposOcultosCalificacionEmpleado=0;
	protected Integer iYPanelCamposOcultosCalificacionEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCalificacionEmpleado;
	public JButton jButtonModificarCalificacionEmpleado;
	public JButton jButtonActualizarCalificacionEmpleado;
    public JButton jButtonEliminarCalificacionEmpleado;
	public JButton jButtonCancelarCalificacionEmpleado;
    public JButton jButtonGuardarCambiosCalificacionEmpleado;
	public JButton jButtonGuardarCambiosTablaCalificacionEmpleado;
	protected JButton jButtonCerrarCalificacionEmpleado;
	
	
	protected JButton jButtonProcesarInformacionCalificacionEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCalificacionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCalificacionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCalificacionEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCalificacionEmpleado;
	protected JButton jButtonModificarToolBarCalificacionEmpleado;
	protected JButton jButtonActualizarToolBarCalificacionEmpleado;
    protected JButton jButtonEliminarToolBarCalificacionEmpleado;
	protected JButton jButtonCancelarToolBarCalificacionEmpleado;
    protected JButton jButtonGuardarCambiosToolBarCalificacionEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarCalificacionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarCalificacionEmpleado;
	protected JButton jButtonCerrarToolBarCalificacionEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarCalificacionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCalificacionEmpleado;
	protected JMenuItem jMenuItemModificarCalificacionEmpleado;
	protected JMenuItem jMenuItemActualizarCalificacionEmpleado;
    protected JMenuItem jMenuItemEliminarCalificacionEmpleado;
	protected JMenuItem jMenuItemCancelarCalificacionEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosCalificacionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaCalificacionEmpleado;
	protected JMenuItem jMenuItemCerrarCalificacionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarCalificacionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarCalificacionEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionCalificacionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCalificacionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarCalificacionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCalificacionEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCalificacionEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCalificacionEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCalificacionEmpleado;
	public JLabel jLabelIdCalificacionEmpleado;
	public JLabel jLabelidCalificacionEmpleado;
	public JButton jButtonidCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_conocimientoCalificacionEmpleado;
	public JLabel jLabelvalor_conocimientoCalificacionEmpleado;
	public JTextField jTextFieldvalor_conocimientoCalificacionEmpleado;
	public JButton jButtonvalor_conocimientoCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_eficienciaCalificacionEmpleado;
	public JLabel jLabelvalor_eficienciaCalificacionEmpleado;
	public JTextField jTextFieldvalor_eficienciaCalificacionEmpleado;
	public JButton jButtonvalor_eficienciaCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_obtenidoCalificacionEmpleado;
	public JLabel jLabelvalor_obtenidoCalificacionEmpleado;
	public JTextField jTextFieldvalor_obtenidoCalificacionEmpleado;
	public JButton jButtonvalor_obtenidoCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_pesoCalificacionEmpleado;
	public JLabel jLabelvalor_pesoCalificacionEmpleado;
	public JTextField jTextFieldvalor_pesoCalificacionEmpleado;
	public JButton jButtonvalor_pesoCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelverificadoCalificacionEmpleado;
	public JLabel jLabelverificadoCalificacionEmpleado;
	public JCheckBox jCheckBoxverificadoCalificacionEmpleado;
	public JButton jButtonverificadoCalificacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCalificacionEmpleado;
	public JLabel jLabelid_empresaCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCalificacionEmpleado;
	public JButton jButtonid_empresaCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_empresaCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empresaCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCalificacionEmpleado;
	public JLabel jLabelid_sucursalCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCalificacionEmpleado;
	public JButton jButtonid_sucursalCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_sucursalCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioCalificacionEmpleado;
	public JLabel jLabelid_ejercicioCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioCalificacionEmpleado;
	public JButton jButtonid_ejercicioCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_ejercicioCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoCalificacionEmpleado;
	public JLabel jLabelid_periodoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoCalificacionEmpleado;
	public JButton jButtonid_periodoCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_periodoCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_periodoCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoCalificacionEmpleado;
	public JLabel jLabelid_empleadoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoCalificacionEmpleado;
	public JButton jButtonid_empleadoCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_evaluacion_empleadoCalificacionEmpleado;
	public JLabel jLabelid_evaluacion_empleadoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_evaluacion_empleadoCalificacionEmpleado;
	public JButton jButtonid_evaluacion_empleadoCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_evaluacion_empleadoCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_nomi_factor_nomiCalificacionEmpleado;
	public JLabel jLabelid_formato_nomi_factor_nomiCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado;
	public JButton jButtonid_formato_nomi_factor_nomiCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_nomi_pregunta_nomiCalificacionEmpleado;
	public JLabel jLabelid_formato_nomi_pregunta_nomiCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado;
	public JButton jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_calificacion_empleadoCalificacionEmpleado;
	public JLabel jLabelid_tipo_calificacion_empleadoCalificacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado;
	public JButton jButtonid_tipo_calificacion_empleadoCalificacionEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCalificacionEmpleado;
	
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
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=352;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CalificacionEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCalificacionEmpleado=new JPanel();
				this.jPanelAccionesFormularioCalificacionEmpleado=new JPanel();
				this.jmenuBarDetalleCalificacionEmpleado=new JMenuBar();
				this.jTtoolBarDetalleCalificacionEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CalificacionEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CalificacionEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CalificacionEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CalificacionEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CalificacionEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CalificacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCalificacionEmpleado() {
		return this.jButtonActualizarToolBarCalificacionEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarCalificacionEmpleado() {
		return this.jButtonEliminarToolBarCalificacionEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarCalificacionEmpleado() {
		return this.jButtonCancelarToolBarCalificacionEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionCalificacionEmpleado() {
		return this.jButtonProcesarInformacionCalificacionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCalificacionEmpleado)	{
		this.jButtonProcesarInformacionCalificacionEmpleado = jButtonProcesarInformacionCalificacionEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCalificacionEmpleado() {
		return this.jComboBoxTiposAccionesCalificacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCalificacionEmpleado(
			JComboBox jComboBoxTiposRelacionesCalificacionEmpleado) {
		this.jComboBoxTiposRelacionesCalificacionEmpleado = jComboBoxTiposRelacionesCalificacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCalificacionEmpleado(
			JComboBox jComboBoxTiposAccionesCalificacionEmpleado) {
		this.jComboBoxTiposAccionesCalificacionEmpleado = jComboBoxTiposAccionesCalificacionEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCalificacionEmpleado() {
		return this.jComboBoxTiposAccionesFormularioCalificacionEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCalificacionEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioCalificacionEmpleado) {
		this.jComboBoxTiposAccionesFormularioCalificacionEmpleado = jComboBoxTiposAccionesFormularioCalificacionEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
		
		this.calificacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.calificacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.calificacionempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CalificacionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Calificacion Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCalificacionEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCalificacionEmpleado=new JButtonMe();
				this.jButtonModificarToolBarCalificacionEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCalificacionEmpleado,this.jTtoolBarDetalleCalificacionEmpleado,
							"actualizar","actualizar","Actualizar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCalificacionEmpleado,this.jTtoolBarDetalleCalificacionEmpleado,
							"eliminar","eliminar","Eliminar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCalificacionEmpleado,this.jTtoolBarDetalleCalificacionEmpleado,
							"cancelar","cancelar","Cancelar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCalificacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCalificacionEmpleado,this.jTtoolBarDetalleCalificacionEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCalificacionEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCalificacionEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCalificacionEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCalificacionEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCalificacionEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCalificacionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCalificacionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCalificacionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCalificacionEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCalificacionEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCalificacionEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCalificacionEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCalificacionEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCalificacionEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCalificacionEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCalificacionEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCalificacionEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCalificacionEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCalificacionEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCalificacionEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCalificacionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCalificacionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCalificacionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCalificacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCalificacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCalificacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCalificacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCalificacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCalificacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCalificacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCalificacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCalificacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCalificacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCalificacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCalificacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCalificacionEmpleado.add(this.jMenuItemDetalleCerrarCalificacionEmpleado);
		
		this.jmenuDetalleAccionesCalificacionEmpleado.add(this.jMenuItemActualizarCalificacionEmpleado);
		this.jmenuDetalleAccionesCalificacionEmpleado.add(this.jMenuItemEliminarCalificacionEmpleado);
		this.jmenuDetalleAccionesCalificacionEmpleado.add(this.jMenuItemCancelarCalificacionEmpleado);		
		
		//this.jmenuDetalleDatosCalificacionEmpleado.add(this.jMenuItemDetalleAbrirOrderByCalificacionEmpleado);				
		this.jmenuDetalleDatosCalificacionEmpleado.add(this.jMenuItemDetalleMostarOcultarCalificacionEmpleado);				
				
		//this.jmenuDetalleAccionesCalificacionEmpleado.add(this.jMenuItemGuardarCambiosCalificacionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCalificacionEmpleado.add(this.jmenuDetalleArchivoCalificacionEmpleado);		
		this.jmenuBarDetalleCalificacionEmpleado.add(this.jmenuDetalleAccionesCalificacionEmpleado);		
		this.jmenuBarDetalleCalificacionEmpleado.add(this.jmenuDetalleDatosCalificacionEmpleado);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCalificacionEmpleado);				
	}
	
	
	public void inicializarElementosCamposCalificacionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCalificacionEmpleado = new JLabelMe();
		jLabelIdCalificacionEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCalificacionEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCalificacionEmpleado= new GridBagLayout();

		this.jPanelidCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);

		jLabelidCalificacionEmpleado = new JLabel();
		jLabelidCalificacionEmpleado.setText("Id");

		jLabelidCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalor_conocimientoCalificacionEmpleado = new JLabelMe();
		this.jLabelvalor_conocimientoCalificacionEmpleado.setText(""+CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO+" : *");
		this.jLabelvalor_conocimientoCalificacionEmpleado.setToolTipText("Valor Conocimiento");
		this.jLabelvalor_conocimientoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_conocimientoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_conocimientoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_conocimientoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_conocimientoCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_conocimientoCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO);
		this.gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		this.jPanelvalor_conocimientoCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);


		jTextFieldvalor_conocimientoCalificacionEmpleado= new JTextFieldMe();
		jTextFieldvalor_conocimientoCalificacionEmpleado.setEnabled(false);
		jTextFieldvalor_conocimientoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_conocimientoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_conocimientoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_conocimientoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_conocimientoCalificacionEmpleado.setText("0.0");

		this.jButtonvalor_conocimientoCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor_conocimientoCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_conocimientoCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_conocimientoCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_conocimientoCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonvalor_conocimientoCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_conocimientoCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_conocimientoCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_conocimientoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_conocimientoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_conocimientoCalificacionEmpleadoBusqueda"));

		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_conocimientoCalificacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_eficienciaCalificacionEmpleado = new JLabelMe();
		this.jLabelvalor_eficienciaCalificacionEmpleado.setText(""+CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA+" : *");
		this.jLabelvalor_eficienciaCalificacionEmpleado.setToolTipText("Valor Eficiencia");
		this.jLabelvalor_eficienciaCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_eficienciaCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_eficienciaCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_eficienciaCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_eficienciaCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_eficienciaCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA);
		this.gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		this.jPanelvalor_eficienciaCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);


		jTextFieldvalor_eficienciaCalificacionEmpleado= new JTextFieldMe();
		jTextFieldvalor_eficienciaCalificacionEmpleado.setEnabled(false);
		jTextFieldvalor_eficienciaCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_eficienciaCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_eficienciaCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_eficienciaCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_eficienciaCalificacionEmpleado.setText("0.0");

		this.jButtonvalor_eficienciaCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor_eficienciaCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_eficienciaCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_eficienciaCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_eficienciaCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonvalor_eficienciaCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_eficienciaCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_eficienciaCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_eficienciaCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_eficienciaCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_eficienciaCalificacionEmpleadoBusqueda"));

		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_eficienciaCalificacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_obtenidoCalificacionEmpleado = new JLabelMe();
		this.jLabelvalor_obtenidoCalificacionEmpleado.setText(""+CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO+" : *");
		this.jLabelvalor_obtenidoCalificacionEmpleado.setToolTipText("Valor Obtenido");
		this.jLabelvalor_obtenidoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_obtenidoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_obtenidoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_obtenidoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_obtenidoCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_obtenidoCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO);
		this.gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		this.jPanelvalor_obtenidoCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);


		jTextFieldvalor_obtenidoCalificacionEmpleado= new JTextFieldMe();
		jTextFieldvalor_obtenidoCalificacionEmpleado.setEnabled(false);
		jTextFieldvalor_obtenidoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_obtenidoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_obtenidoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_obtenidoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_obtenidoCalificacionEmpleado.setText("0.0");

		this.jButtonvalor_obtenidoCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor_obtenidoCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_obtenidoCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_obtenidoCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_obtenidoCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonvalor_obtenidoCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_obtenidoCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_obtenidoCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_obtenidoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_obtenidoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_obtenidoCalificacionEmpleadoBusqueda"));

		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_obtenidoCalificacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_pesoCalificacionEmpleado = new JLabelMe();
		this.jLabelvalor_pesoCalificacionEmpleado.setText(""+CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO+" : *");
		this.jLabelvalor_pesoCalificacionEmpleado.setToolTipText("Valor Peso");
		this.jLabelvalor_pesoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pesoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pesoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_pesoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_pesoCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_pesoCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO);
		this.gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		this.jPanelvalor_pesoCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);


		jTextFieldvalor_pesoCalificacionEmpleado= new JTextFieldMe();
		jTextFieldvalor_pesoCalificacionEmpleado.setEnabled(false);
		jTextFieldvalor_pesoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pesoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pesoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_pesoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_pesoCalificacionEmpleado.setText("0.0");

		this.jButtonvalor_pesoCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor_pesoCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pesoCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pesoCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_pesoCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonvalor_pesoCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_pesoCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_pesoCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_pesoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_pesoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_pesoCalificacionEmpleadoBusqueda"));

		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_pesoCalificacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelverificadoCalificacionEmpleado = new JLabelMe();
		this.jLabelverificadoCalificacionEmpleado.setText(""+CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO+" : *");
		this.jLabelverificadoCalificacionEmpleado.setToolTipText("Verificado");
		this.jLabelverificadoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelverificadoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelverificadoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelverificadoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelverificadoCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelverificadoCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO);
		this.gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		this.jPanelverificadoCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);


		jCheckBoxverificadoCalificacionEmpleado= new JCheckBoxMe();
		jCheckBoxverificadoCalificacionEmpleado.setEnabled(false);

		jCheckBoxverificadoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxverificadoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxverificadoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxverificadoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonverificadoCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonverificadoCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonverificadoCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonverificadoCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonverificadoCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonverificadoCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonverificadoCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonverificadoCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxverificadoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxverificadoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"verificadoCalificacionEmpleadoBusqueda"));

		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonverificadoCalificacionEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCalificacionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCalificacionEmpleado = new JLabelMe();
		this.jLabelid_empresaCalificacionEmpleado.setText(""+CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCalificacionEmpleado.setToolTipText("Empresa");
		this.jLabelid_empresaCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		this.jPanelid_empresaCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);


		jComboBoxid_empresaCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_empresaCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCalificacionEmpleado.setEnabled(false);

		this.jButtonid_empresaCalificacionEmpleado= new JButtonMe();
		this.jButtonid_empresaCalificacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCalificacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCalificacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCalificacionEmpleado.setText("Buscar");
		this.jButtonid_empresaCalificacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCalificacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCalificacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCalificacionEmpleado"));

		this.jButtonid_empresaCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empresaCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonid_empresaCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCalificacionEmpleadoBusqueda"));

		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCalificacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empresaCalificacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empresaCalificacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCalificacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCalificacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCalificacionEmpleadoUpdate.setText("U");
		this.jButtonid_empresaCalificacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCalificacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCalificacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCalificacionEmpleadoUpdate"));



					
		this.jLabelid_sucursalCalificacionEmpleado = new JLabelMe();
		this.jLabelid_sucursalCalificacionEmpleado.setText(""+CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCalificacionEmpleado.setToolTipText("Sucursal");
		this.jLabelid_sucursalCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		this.jPanelid_sucursalCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);


		jComboBoxid_sucursalCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_sucursalCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCalificacionEmpleado.setEnabled(false);

		this.jButtonid_sucursalCalificacionEmpleado= new JButtonMe();
		this.jButtonid_sucursalCalificacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCalificacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCalificacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCalificacionEmpleado.setText("Buscar");
		this.jButtonid_sucursalCalificacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCalificacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCalificacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCalificacionEmpleado"));

		this.jButtonid_sucursalCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_sucursalCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonid_sucursalCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCalificacionEmpleadoBusqueda"));

		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCalificacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCalificacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_sucursalCalificacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCalificacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCalificacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCalificacionEmpleadoUpdate.setText("U");
		this.jButtonid_sucursalCalificacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCalificacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCalificacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCalificacionEmpleadoUpdate"));



					
		this.jLabelid_ejercicioCalificacionEmpleado = new JLabelMe();
		this.jLabelid_ejercicioCalificacionEmpleado.setText(""+CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioCalificacionEmpleado.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		this.jPanelid_ejercicioCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);


		jComboBoxid_ejercicioCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_ejercicioCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioCalificacionEmpleado.setEnabled(false);

		this.jButtonid_ejercicioCalificacionEmpleado= new JButtonMe();
		this.jButtonid_ejercicioCalificacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCalificacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCalificacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCalificacionEmpleado.setText("Buscar");
		this.jButtonid_ejercicioCalificacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioCalificacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCalificacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCalificacionEmpleado"));

		this.jButtonid_ejercicioCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonid_ejercicioCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCalificacionEmpleadoBusqueda"));

		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioCalificacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioCalificacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_ejercicioCalificacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCalificacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCalificacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioCalificacionEmpleadoUpdate.setText("U");
		this.jButtonid_ejercicioCalificacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioCalificacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCalificacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCalificacionEmpleadoUpdate"));



					
		this.jLabelid_periodoCalificacionEmpleado = new JLabelMe();
		this.jLabelid_periodoCalificacionEmpleado.setText(""+CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoCalificacionEmpleado.setToolTipText("Periodo");
		this.jLabelid_periodoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		this.jPanelid_periodoCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);


		jComboBoxid_periodoCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_periodoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoCalificacionEmpleado.setEnabled(false);

		this.jButtonid_periodoCalificacionEmpleado= new JButtonMe();
		this.jButtonid_periodoCalificacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoCalificacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoCalificacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoCalificacionEmpleado.setText("Buscar");
		this.jButtonid_periodoCalificacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoCalificacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoCalificacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoCalificacionEmpleado"));

		this.jButtonid_periodoCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_periodoCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonid_periodoCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoCalificacionEmpleadoBusqueda"));

		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoCalificacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_periodoCalificacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_periodoCalificacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoCalificacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoCalificacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoCalificacionEmpleadoUpdate.setText("U");
		this.jButtonid_periodoCalificacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoCalificacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoCalificacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoCalificacionEmpleadoUpdate"));



					
		this.jLabelid_empleadoCalificacionEmpleado = new JLabelMe();
		this.jLabelid_empleadoCalificacionEmpleado.setText(""+CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoCalificacionEmpleado.setToolTipText("Empleado");
		this.jLabelid_empleadoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		this.jPanelid_empleadoCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);


		jComboBoxid_empleadoCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoCalificacionEmpleado= new JButtonMe();
		this.jButtonid_empleadoCalificacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCalificacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCalificacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCalificacionEmpleado.setText("Buscar");
		this.jButtonid_empleadoCalificacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoCalificacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCalificacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCalificacionEmpleado"));

		this.jButtonid_empleadoCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empleadoCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonid_empleadoCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCalificacionEmpleadoBusqueda"));

		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoCalificacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoCalificacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empleadoCalificacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCalificacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCalificacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoCalificacionEmpleadoUpdate.setText("U");
		this.jButtonid_empleadoCalificacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoCalificacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCalificacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCalificacionEmpleadoUpdate"));



					
		this.jLabelid_evaluacion_empleadoCalificacionEmpleado = new JLabelMe();
		this.jLabelid_evaluacion_empleadoCalificacionEmpleado.setText(""+CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO+" : *");
		this.jLabelid_evaluacion_empleadoCalificacionEmpleado.setToolTipText("Evaluacion Empleado");
		this.jLabelid_evaluacion_empleadoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_evaluacion_empleadoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_evaluacion_empleadoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_evaluacion_empleadoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_evaluacion_empleadoCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_evaluacion_empleadoCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO);
		this.gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		this.jPanelid_evaluacion_empleadoCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);


		jComboBoxid_evaluacion_empleadoCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_evaluacion_empleadoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_evaluacion_empleadoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_evaluacion_empleadoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_evaluacion_empleadoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_evaluacion_empleadoCalificacionEmpleado= new JButtonMe();
		this.jButtonid_evaluacion_empleadoCalificacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_evaluacion_empleadoCalificacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_evaluacion_empleadoCalificacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_evaluacion_empleadoCalificacionEmpleado.setText("Buscar");
		this.jButtonid_evaluacion_empleadoCalificacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_evaluacion_empleadoCalificacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_evaluacion_empleadoCalificacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_evaluacion_empleadoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_evaluacion_empleadoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_evaluacion_empleadoCalificacionEmpleado"));

		this.jButtonid_evaluacion_empleadoCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_evaluacion_empleadoCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_evaluacion_empleadoCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_evaluacion_empleadoCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_evaluacion_empleadoCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonid_evaluacion_empleadoCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_evaluacion_empleadoCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_evaluacion_empleadoCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_evaluacion_empleadoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_evaluacion_empleadoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_evaluacion_empleadoCalificacionEmpleadoBusqueda"));

		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_evaluacion_empleadoCalificacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdate.setText("U");
		this.jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_evaluacion_empleadoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_evaluacion_empleadoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_evaluacion_empleadoCalificacionEmpleadoUpdate"));



					
		this.jLabelid_formato_nomi_factor_nomiCalificacionEmpleado = new JLabelMe();
		this.jLabelid_formato_nomi_factor_nomiCalificacionEmpleado.setText(""+CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI+" : *");
		this.jLabelid_formato_nomi_factor_nomiCalificacionEmpleado.setToolTipText("Formato Nomi Factor Nomi");
		this.jLabelid_formato_nomi_factor_nomiCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_nomi_factor_nomiCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_nomi_factor_nomiCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nomi_factor_nomiCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_nomi_factor_nomiCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_nomi_factor_nomiCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI);
		this.gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		this.jPanelid_formato_nomi_factor_nomiCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);


		jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleado= new JButtonMe();
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleado.setText("Buscar");
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomi_factor_nomiCalificacionEmpleado"));

		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda"));

		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdate.setText("U");
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomi_factor_nomiCalificacionEmpleadoUpdate"));



					
		this.jLabelid_formato_nomi_pregunta_nomiCalificacionEmpleado = new JLabelMe();
		this.jLabelid_formato_nomi_pregunta_nomiCalificacionEmpleado.setText(""+CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI+" : *");
		this.jLabelid_formato_nomi_pregunta_nomiCalificacionEmpleado.setToolTipText("Formato Nomi Pregunta Nomi");
		this.jLabelid_formato_nomi_pregunta_nomiCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_nomi_pregunta_nomiCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_nomi_pregunta_nomiCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nomi_pregunta_nomiCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_nomi_pregunta_nomiCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_nomi_pregunta_nomiCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI);
		this.gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		this.jPanelid_formato_nomi_pregunta_nomiCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);


		jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleado= new JButtonMe();
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleado.setText("Buscar");
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomi_pregunta_nomiCalificacionEmpleado"));

		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda"));

		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate.setText("U");
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate"));



					
		this.jLabelid_tipo_calificacion_empleadoCalificacionEmpleado = new JLabelMe();
		this.jLabelid_tipo_calificacion_empleadoCalificacionEmpleado.setText(""+CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO+" : *");
		this.jLabelid_tipo_calificacion_empleadoCalificacionEmpleado.setToolTipText("Idtipo Calificacion Empleado");
		this.jLabelid_tipo_calificacion_empleadoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_calificacion_empleadoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_calificacion_empleadoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_calificacion_empleadoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_calificacion_empleadoCalificacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_calificacion_empleadoCalificacionEmpleado.setToolTipText(CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
		this.gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		this.jPanelid_tipo_calificacion_empleadoCalificacionEmpleado.setLayout(this.gridaBagLayoutCalificacionEmpleado);


		jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleado= new JButtonMe();
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleado.setText("Buscar");
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calificacion_empleadoCalificacionEmpleado"));

		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda.setText("U");
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda"));

		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdate.setText("U");
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_calificacion_empleadoCalificacionEmpleadoUpdate"));



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
		//this.jInternalFrameDetalleCalificacionEmpleado = new CalificacionEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Calificacion Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCalificacionEmpleado= new GridBagLayout();
		

		
		String sToolTipCalificacionEmpleado="";
		sToolTipCalificacionEmpleado=CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCalificacionEmpleado+="(Nomina.CalificacionEmpleado)";
		}
		
		if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCalificacionEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCalificacionEmpleado = new JButtonMe();
		this.jButtonModificarCalificacionEmpleado = new JButtonMe();
        this.jButtonActualizarCalificacionEmpleado = new JButtonMe();
        this.jButtonEliminarCalificacionEmpleado = new JButtonMe();
        this.jButtonCancelarCalificacionEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosCalificacionEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaCalificacionEmpleado = new JButtonMe();
		this.jButtonCerrarCalificacionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosCalificacionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionCalificacionEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralCalificacionEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Calificacion Empleado";
		
		if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Calificacion Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosCalificacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCalificacionEmpleado.setName("jPanelCamposCalificacionEmpleado"); 

		this.jPanelCamposOcultosCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCalificacionEmpleado.setName("jPanelCamposOcultosCalificacionEmpleado"); 

        this.jPanelAccionesCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCalificacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesCalificacionEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCalificacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCalificacionEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCalificacionEmpleado.setText("Nuevo");
		this.jButtonModificarCalificacionEmpleado.setText("Editar");
        this.jButtonActualizarCalificacionEmpleado.setText("Actualizar");
        this.jButtonEliminarCalificacionEmpleado.setText("Eliminar");
        this.jButtonCancelarCalificacionEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosCalificacionEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaCalificacionEmpleado.setText("Guardar");
		this.jButtonCerrarCalificacionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCalificacionEmpleado,"nuevo_button","Nuevo",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCalificacionEmpleado,"modificar_button","Editar",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCalificacionEmpleado,"actualizar_button","Actualizar",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCalificacionEmpleado,"eliminar_button","Eliminar",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCalificacionEmpleado,"cancelar_button","Cancelar",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCalificacionEmpleado,"guardarcambios_button","Guardar",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCalificacionEmpleado,"guardarcambiostabla_button","Guardar",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCalificacionEmpleado,"cerrar_button","Salir",this.calificacionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCalificacionEmpleado.setToolTipText("Nuevo"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCalificacionEmpleado.setToolTipText("Editar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCalificacionEmpleado.setToolTipText("Actualizar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCalificacionEmpleado.setToolTipText("Eliminar)"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCalificacionEmpleado.setToolTipText("Cancelar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCalificacionEmpleado.setToolTipText("Guardar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCalificacionEmpleado.setToolTipText("Guardar"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCalificacionEmpleado.setToolTipText("Salir"+" "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCalificacionEmpleado";
		inputMap = this.jButtonNuevoCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCalificacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCalificacionEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCalificacionEmpleado";
		inputMap = this.jButtonActualizarCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCalificacionEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarCalificacionEmpleado";
		inputMap = this.jButtonEliminarCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCalificacionEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarCalificacionEmpleado";
		inputMap = this.jButtonCancelarCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCalificacionEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarCalificacionEmpleado";
		inputMap = this.jButtonCerrarCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCalificacionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCalificacionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaCalificacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCalificacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCalificacionEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCalificacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCalificacionEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCalificacionEmpleado.setToolTipText("Nuevo CalificacionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCalificacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCalificacionEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCalificacionEmpleado.setToolTipText("Sin Cerrar Ventana CalificacionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCalificacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCalificacionEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCalificacionEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCalificacionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesCalificacionEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCalificacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCalificacionEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCalificacionEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCalificacionEmpleado = new JLabelMe();
		
		this.jLabelAccionesCalificacionEmpleado.setText("Acciones");		
		this.jLabelAccionesCalificacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCalificacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCalificacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCalificacionEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCalificacionEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCalificacionEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesCalificacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCalificacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCalificacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCalificacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCalificacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCalificacionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCalificacionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCalificacionEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCalificacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCalificacionEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCalificacionEmpleado = new GridBagLayout();
		
		this.jPanelCamposCalificacionEmpleado.setLayout(gridaBagLayoutCamposCalificacionEmpleado);
		this.jPanelCamposOcultosCalificacionEmpleado.setLayout(gridaBagLayoutCamposOcultosCalificacionEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCalificacionEmpleado.add(jLabelIdCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCalificacionEmpleado.add(jLabelidCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCalificacionEmpleado.add(jLabelid_empresaCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCalificacionEmpleado.add(jButtonid_empresaCalificacionEmpleadoBusqueda, this.gridBagConstraintsCalificacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 3;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCalificacionEmpleado.add(jButtonid_empresaCalificacionEmpleadoUpdate, this.gridBagConstraintsCalificacionEmpleado);
	}

	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCalificacionEmpleado.add(jComboBoxid_empresaCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCalificacionEmpleado.add(jLabelid_sucursalCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCalificacionEmpleado.add(jButtonid_sucursalCalificacionEmpleadoBusqueda, this.gridBagConstraintsCalificacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 3;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCalificacionEmpleado.add(jButtonid_sucursalCalificacionEmpleadoUpdate, this.gridBagConstraintsCalificacionEmpleado);
	}

	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCalificacionEmpleado.add(jComboBoxid_sucursalCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioCalificacionEmpleado.add(jLabelid_ejercicioCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioCalificacionEmpleado.add(jButtonid_ejercicioCalificacionEmpleadoBusqueda, this.gridBagConstraintsCalificacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 3;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioCalificacionEmpleado.add(jButtonid_ejercicioCalificacionEmpleadoUpdate, this.gridBagConstraintsCalificacionEmpleado);
	}

	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioCalificacionEmpleado.add(jComboBoxid_ejercicioCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoCalificacionEmpleado.add(jLabelid_periodoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoCalificacionEmpleado.add(jButtonid_periodoCalificacionEmpleadoBusqueda, this.gridBagConstraintsCalificacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 3;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoCalificacionEmpleado.add(jButtonid_periodoCalificacionEmpleadoUpdate, this.gridBagConstraintsCalificacionEmpleado);
	}

	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoCalificacionEmpleado.add(jComboBoxid_periodoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoCalificacionEmpleado.add(jLabelid_empleadoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCalificacionEmpleado.add(jButtonid_empleadoCalificacionEmpleadoBusqueda, this.gridBagConstraintsCalificacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 3;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCalificacionEmpleado.add(jButtonid_empleadoCalificacionEmpleadoUpdate, this.gridBagConstraintsCalificacionEmpleado);
	}

	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoCalificacionEmpleado.add(jComboBoxid_empleadoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_evaluacion_empleadoCalificacionEmpleado.add(jLabelid_evaluacion_empleadoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_evaluacion_empleadoCalificacionEmpleado.add(jButtonid_evaluacion_empleadoCalificacionEmpleadoBusqueda, this.gridBagConstraintsCalificacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 3;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_evaluacion_empleadoCalificacionEmpleado.add(jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdate, this.gridBagConstraintsCalificacionEmpleado);
	}

	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_evaluacion_empleadoCalificacionEmpleado.add(jComboBoxid_evaluacion_empleadoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_nomi_factor_nomiCalificacionEmpleado.add(jLabelid_formato_nomi_factor_nomiCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomi_factor_nomiCalificacionEmpleado.add(jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda, this.gridBagConstraintsCalificacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 3;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomi_factor_nomiCalificacionEmpleado.add(jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdate, this.gridBagConstraintsCalificacionEmpleado);
	}

	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_nomi_factor_nomiCalificacionEmpleado.add(jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_nomi_pregunta_nomiCalificacionEmpleado.add(jLabelid_formato_nomi_pregunta_nomiCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomi_pregunta_nomiCalificacionEmpleado.add(jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda, this.gridBagConstraintsCalificacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 3;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nomi_pregunta_nomiCalificacionEmpleado.add(jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate, this.gridBagConstraintsCalificacionEmpleado);
	}

	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_nomi_pregunta_nomiCalificacionEmpleado.add(jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_calificacion_empleadoCalificacionEmpleado.add(jLabelid_tipo_calificacion_empleadoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_calificacion_empleadoCalificacionEmpleado.add(jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda, this.gridBagConstraintsCalificacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 3;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_calificacion_empleadoCalificacionEmpleado.add(jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdate, this.gridBagConstraintsCalificacionEmpleado);
	}

	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_calificacion_empleadoCalificacionEmpleado.add(jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_conocimientoCalificacionEmpleado.add(jLabelvalor_conocimientoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_conocimientoCalificacionEmpleado.add(jButtonvalor_conocimientoCalificacionEmpleadoBusqueda, this.gridBagConstraintsCalificacionEmpleado);
	}

	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_conocimientoCalificacionEmpleado.add(jTextFieldvalor_conocimientoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_eficienciaCalificacionEmpleado.add(jLabelvalor_eficienciaCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_eficienciaCalificacionEmpleado.add(jButtonvalor_eficienciaCalificacionEmpleadoBusqueda, this.gridBagConstraintsCalificacionEmpleado);
	}

	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_eficienciaCalificacionEmpleado.add(jTextFieldvalor_eficienciaCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_obtenidoCalificacionEmpleado.add(jLabelvalor_obtenidoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_obtenidoCalificacionEmpleado.add(jButtonvalor_obtenidoCalificacionEmpleadoBusqueda, this.gridBagConstraintsCalificacionEmpleado);
	}

	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_obtenidoCalificacionEmpleado.add(jTextFieldvalor_obtenidoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_pesoCalificacionEmpleado.add(jLabelvalor_pesoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_pesoCalificacionEmpleado.add(jButtonvalor_pesoCalificacionEmpleadoBusqueda, this.gridBagConstraintsCalificacionEmpleado);
	}

	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_pesoCalificacionEmpleado.add(jTextFieldvalor_pesoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelverificadoCalificacionEmpleado.add(jLabelverificadoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = 2;
		this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
		this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelverificadoCalificacionEmpleado.add(jButtonverificadoCalificacionEmpleadoBusqueda, this.gridBagConstraintsCalificacionEmpleado);
	}

	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
	this.gridBagConstraintsCalificacionEmpleado.gridx = 1;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelverificadoCalificacionEmpleado.add(jCheckBoxverificadoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCalificacionEmpleado.add(this.jPanelidCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposCalificacionEmpleado % 2==0) {
		iXPanelCamposCalificacionEmpleado=0;
		iYPanelCamposCalificacionEmpleado++;
	}
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCalificacionEmpleado.add(this.jPanelid_empleadoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposCalificacionEmpleado % 2==0) {
		iXPanelCamposCalificacionEmpleado=0;
		iYPanelCamposCalificacionEmpleado++;
	}
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCalificacionEmpleado.add(this.jPanelid_evaluacion_empleadoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposCalificacionEmpleado % 2==0) {
		iXPanelCamposCalificacionEmpleado=0;
		iYPanelCamposCalificacionEmpleado++;
	}
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCalificacionEmpleado.add(this.jPanelid_formato_nomi_factor_nomiCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposCalificacionEmpleado % 2==0) {
		iXPanelCamposCalificacionEmpleado=0;
		iYPanelCamposCalificacionEmpleado++;
	}
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCalificacionEmpleado.add(this.jPanelid_formato_nomi_pregunta_nomiCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposCalificacionEmpleado % 2==0) {
		iXPanelCamposCalificacionEmpleado=0;
		iYPanelCamposCalificacionEmpleado++;
	}
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCalificacionEmpleado.add(this.jPanelid_tipo_calificacion_empleadoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposCalificacionEmpleado % 2==0) {
		iXPanelCamposCalificacionEmpleado=0;
		iYPanelCamposCalificacionEmpleado++;
	}
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCalificacionEmpleado.add(this.jPanelvalor_conocimientoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposCalificacionEmpleado % 2==0) {
		iXPanelCamposCalificacionEmpleado=0;
		iYPanelCamposCalificacionEmpleado++;
	}
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCalificacionEmpleado.add(this.jPanelvalor_eficienciaCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposCalificacionEmpleado % 2==0) {
		iXPanelCamposCalificacionEmpleado=0;
		iYPanelCamposCalificacionEmpleado++;
	}
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCalificacionEmpleado.add(this.jPanelvalor_obtenidoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposCalificacionEmpleado % 2==0) {
		iXPanelCamposCalificacionEmpleado=0;
		iYPanelCamposCalificacionEmpleado++;
	}
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCalificacionEmpleado.add(this.jPanelvalor_pesoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposCalificacionEmpleado % 2==0) {
		iXPanelCamposCalificacionEmpleado=0;
		iYPanelCamposCalificacionEmpleado++;
	}
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCalificacionEmpleado.add(this.jPanelverificadoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposCalificacionEmpleado % 2==0) {
		iXPanelCamposCalificacionEmpleado=0;
		iYPanelCamposCalificacionEmpleado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposOcultosCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposOcultosCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCalificacionEmpleado.add(this.jPanelid_empresaCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposOcultosCalificacionEmpleado % 2==0) {
		iXPanelCamposOcultosCalificacionEmpleado=0;
		iYPanelCamposOcultosCalificacionEmpleado++;
	}
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposOcultosCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposOcultosCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCalificacionEmpleado.add(this.jPanelid_sucursalCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposOcultosCalificacionEmpleado % 2==0) {
		iXPanelCamposOcultosCalificacionEmpleado=0;
		iYPanelCamposOcultosCalificacionEmpleado++;
	}
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposOcultosCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposOcultosCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCalificacionEmpleado.add(this.jPanelid_ejercicioCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposOcultosCalificacionEmpleado % 2==0) {
		iXPanelCamposOcultosCalificacionEmpleado=0;
		iYPanelCamposOcultosCalificacionEmpleado++;
	}
	this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalificacionEmpleado.gridy = iYPanelCamposOcultosCalificacionEmpleado;
	this.gridBagConstraintsCalificacionEmpleado.gridx = iXPanelCamposOcultosCalificacionEmpleado++;
	this.gridBagConstraintsCalificacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalificacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCalificacionEmpleado.add(this.jPanelid_periodoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);



	if(iXPanelCamposOcultosCalificacionEmpleado % 2==0) {
		iXPanelCamposOcultosCalificacionEmpleado=0;
		iYPanelCamposOcultosCalificacionEmpleado++;
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
			
		GridBagLayout gridaBagLayoutAccionesCalificacionEmpleado= new GridBagLayout();
		this.jPanelAccionesCalificacionEmpleado.setLayout(gridaBagLayoutAccionesCalificacionEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCalificacionEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioCalificacionEmpleado.setLayout(gridaBagLayoutAccionesFormularioCalificacionEmpleado);
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCalificacionEmpleado.add(this.jComboBoxTiposAccionesFormularioCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCalificacionEmpleado.add(this.jCheckBoxPostAccionNuevoCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCalificacionEmpleado.add(this.jCheckBoxPostAccionSinCerrarCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCalificacionEmpleado.add(this.jCheckBoxPostAccionSinMensajeCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesCalificacionEmpleado.add(this.jButtonModificarCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);							

		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;
		this.gridBagConstraintsCalificacionEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesCalificacionEmpleado.add(this.jButtonEliminarCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
			
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesCalificacionEmpleado.add(this.jButtonActualizarCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);


		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesCalificacionEmpleado.add(this.jButtonGuardarCambiosCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);	
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy = 0;		
		this.gridBagConstraintsCalificacionEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesCalificacionEmpleado.add(this.jButtonCancelarCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCalificacionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCalificacionEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCalificacionEmpleado.gridx = 0;		
			//this.gridBagConstraintsCalificacionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCalificacionEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCalificacionEmpleado.gridx =0;
		this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCalificacionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCalificacionEmpleado = new CalificacionEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Calificacion Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Calificacion Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Calificacion Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CalificacionEmpleadoModel calificacionempleadoModel=new CalificacionEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//CalificacionEmpleadoModel.CalificacionEmpleadoFocusTraversalPolicy calificacionempleadoFocusTraversalPolicy = calificacionempleadoModel.new CalificacionEmpleadoFocusTraversalPolicy(this);
			
			//calificacionempleadoFocusTraversalPolicy.setcalificacionempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(calificacionempleadoModel);
			
			
			this.jContentPaneDetalleCalificacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCalificacionEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleCalificacionEmpleado.setLayout(gridaBagLayoutDetalleCalificacionEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCalificacionEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleCalificacionEmpleado.add(jTtoolBarDetalleCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionCalificacionEmpleado=   new JScrollPane(jContentPaneDetalleCalificacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCalificacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCalificacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCalificacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCalificacionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCalificacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCalificacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCalificacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleCalificacionEmpleado.add(jPanelCamposCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);
			
			
			
			
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
						&& calificacionempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.calificacionempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCalificacionEmpleado= new GridBagConstraints();
						this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
						this.jContentPaneDetalleCalificacionEmpleado.add(this.jTabbedPaneRelacionesCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCalificacionEmpleado.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCalificacionEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
					this.gridBagConstraintsCalificacionEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleCalificacionEmpleado.add(jPanelCamposOcultosCalificacionEmpleado, gridBagConstraintsCalificacionEmpleado);
				
					this.jPanelCamposOcultosCalificacionEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	        this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCalificacionEmpleado.add(this.jPanelAccionesFormularioCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);							
			
			
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleCalificacionEmpleado.add(this.jPanelAccionesCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCalificacionEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCalificacionEmpleado=   new JScrollPane(this.jPanelCamposCalificacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCalificacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCalificacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCalificacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
			this.gridBagConstraintsCalificacionEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCalificacionEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCalificacionEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);			
			
			this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsCalificacionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
			
			
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCalificacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		
			
		this.gridBagConstraintsCalificacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsCalificacionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCalificacionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCalificacionEmpleado, this.gridBagConstraintsCalificacionEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCalificacionEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionCalificacionEmpleado;
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
