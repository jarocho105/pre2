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
import com.bydan.erp.nomina.util.EvaluacionEmpleadoConstantesFunciones;

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
public class EvaluacionEmpleadoDetalleFormJInternalFrame extends EvaluacionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEvaluacionEmpleado;
	
	protected JMenuBar jmenuBarDetalleEvaluacionEmpleado;
	
	protected JMenu jmenuDetalleEvaluacionEmpleado;
	protected JMenu jmenuDetalleArchivoEvaluacionEmpleado;
	protected JMenu jmenuDetalleAccionesEvaluacionEmpleado;
	protected JMenu jmenuDetalleDatosEvaluacionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEvaluacionEmpleado;	
	protected GridBagConstraints gridBagConstraintsEvaluacionEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EvaluacionEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEvaluacionEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EmpleadoBeanSwingJInternalFrame empleadoevaluaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadoevalua="";

	protected TipoEvaluacionEmpleadoBeanSwingJInternalFrame tipoevaluacionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoevaluacionempleado="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected SemestreBeanSwingJInternalFrame semestreBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_semestre="";

	protected TrimestreBeanSwingJInternalFrame trimestreBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_trimestre="";

	protected BimestreBeanSwingJInternalFrame bimestreBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bimestre="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public EvaluacionEmpleadoSessionBean evaluacionempleadoSessionBean;
	
	

	public CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFrame=null;
	public CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCalificacionEmpleado=false;
	public CalificacionEmpleadoSessionBean calificacionempleadoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EmpleadoSessionBean empleadoevaluaSessionBean;
	public TipoEvaluacionEmpleadoSessionBean tipoevaluacionempleadoSessionBean;
	public AnioSessionBean anioSessionBean;
	public SemestreSessionBean semestreSessionBean;
	public TrimestreSessionBean trimestreSessionBean;
	public BimestreSessionBean bimestreSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public EvaluacionEmpleadoLogic evaluacionempleadoLogic;
	
	public JScrollPane jScrollPanelDatosEvaluacionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionEvaluacionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralEvaluacionEmpleado;
	
	protected JPanel jPanelCamposEvaluacionEmpleado;    
	protected JPanel jPanelCamposOcultosEvaluacionEmpleado;    	
	protected JPanel jPanelAccionesEvaluacionEmpleado;
	protected JPanel jPanelAccionesFormularioEvaluacionEmpleado;
    
	
	
	protected Integer iXPanelCamposEvaluacionEmpleado=0;
	protected Integer iYPanelCamposEvaluacionEmpleado=0;
	
	protected Integer iXPanelCamposOcultosEvaluacionEmpleado=0;
	protected Integer iYPanelCamposOcultosEvaluacionEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEvaluacionEmpleado;
	public JButton jButtonModificarEvaluacionEmpleado;
	public JButton jButtonActualizarEvaluacionEmpleado;
    public JButton jButtonEliminarEvaluacionEmpleado;
	public JButton jButtonCancelarEvaluacionEmpleado;
    public JButton jButtonGuardarCambiosEvaluacionEmpleado;
	public JButton jButtonGuardarCambiosTablaEvaluacionEmpleado;
	protected JButton jButtonCerrarEvaluacionEmpleado;
	
	
	protected JButton jButtonProcesarInformacionEvaluacionEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEvaluacionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEvaluacionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEvaluacionEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEvaluacionEmpleado;
	protected JButton jButtonModificarToolBarEvaluacionEmpleado;
	protected JButton jButtonActualizarToolBarEvaluacionEmpleado;
    protected JButton jButtonEliminarToolBarEvaluacionEmpleado;
	protected JButton jButtonCancelarToolBarEvaluacionEmpleado;
    protected JButton jButtonGuardarCambiosToolBarEvaluacionEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarEvaluacionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarEvaluacionEmpleado;
	protected JButton jButtonCerrarToolBarEvaluacionEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarEvaluacionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEvaluacionEmpleado;
	protected JMenuItem jMenuItemModificarEvaluacionEmpleado;
	protected JMenuItem jMenuItemActualizarEvaluacionEmpleado;
    protected JMenuItem jMenuItemEliminarEvaluacionEmpleado;
	protected JMenuItem jMenuItemCancelarEvaluacionEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosEvaluacionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaEvaluacionEmpleado;
	protected JMenuItem jMenuItemCerrarEvaluacionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarEvaluacionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarEvaluacionEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionEvaluacionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEvaluacionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarEvaluacionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEvaluacionEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEvaluacionEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEvaluacionEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEvaluacionEmpleado;
	public JLabel jLabelIdEvaluacionEmpleado;
	public JLabel jLabelidEvaluacionEmpleado;
	public JButton jButtonidEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelfechaEvaluacionEmpleado;
	public JLabel jLabelfechaEvaluacionEmpleado;
	//public JFormattedTextField jDateChooserfechaEvaluacionEmpleado;

	public JDateChooser jDateChooserfechaEvaluacionEmpleado;
	public JButton jButtonfechaEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelesta_evaluadoEvaluacionEmpleado;
	public JLabel jLabelesta_evaluadoEvaluacionEmpleado;
	public JCheckBox jCheckBoxesta_evaluadoEvaluacionEmpleado;
	public JButton jButtonesta_evaluadoEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelobservacion1EvaluacionEmpleado;
	public JLabel jLabelobservacion1EvaluacionEmpleado;
	public JTextArea jTextAreaobservacion1EvaluacionEmpleado;
	public JScrollPane jscrollPaneobservacion1EvaluacionEmpleado;
	public JButton jButtonobservacion1EvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelobservacion2EvaluacionEmpleado;
	public JLabel jLabelobservacion2EvaluacionEmpleado;
	public JTextArea jTextAreaobservacion2EvaluacionEmpleado;
	public JScrollPane jscrollPaneobservacion2EvaluacionEmpleado;
	public JButton jButtonobservacion2EvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelobservacion3EvaluacionEmpleado;
	public JLabel jLabelobservacion3EvaluacionEmpleado;
	public JTextArea jTextAreaobservacion3EvaluacionEmpleado;
	public JScrollPane jscrollPaneobservacion3EvaluacionEmpleado;
	public JButton jButtonobservacion3EvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelobservacion4EvaluacionEmpleado;
	public JLabel jLabelobservacion4EvaluacionEmpleado;
	public JTextArea jTextAreaobservacion4EvaluacionEmpleado;
	public JScrollPane jscrollPaneobservacion4EvaluacionEmpleado;
	public JButton jButtonobservacion4EvaluacionEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEvaluacionEmpleado;
	public JLabel jLabelid_empresaEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEvaluacionEmpleado;
	public JButton jButtonid_empresaEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_empresaEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empresaEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalEvaluacionEmpleado;
	public JLabel jLabelid_sucursalEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalEvaluacionEmpleado;
	public JButton jButtonid_sucursalEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_sucursalEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioEvaluacionEmpleado;
	public JLabel jLabelid_ejercicioEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioEvaluacionEmpleado;
	public JButton jButtonid_ejercicioEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_ejercicioEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoEvaluacionEmpleado;
	public JLabel jLabelid_periodoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoEvaluacionEmpleado;
	public JButton jButtonid_periodoEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_periodoEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_periodoEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraEvaluacionEmpleado;
	public JLabel jLabelid_estructuraEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraEvaluacionEmpleado;
	public JButton jButtonid_estructuraEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_estructuraEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estructuraEvaluacionEmpleadoBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraEvaluacionEmpleadoArbol= new JButtonMe();

	public JPanel jPanelid_empleadoEvaluacionEmpleado;
	public JLabel jLabelid_empleadoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoEvaluacionEmpleado;
	public JButton jButtonid_empleadoEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleado_evaluaEvaluacionEmpleado;
	public JLabel jLabelid_empleado_evaluaEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_evaluaEvaluacionEmpleado;
	public JButton jButtonid_empleado_evaluaEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_empleado_evaluaEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleado_evaluaEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_evaluacion_empleadoEvaluacionEmpleado;
	public JLabel jLabelid_tipo_evaluacion_empleadoEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado;
	public JButton jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioEvaluacionEmpleado;
	public JLabel jLabelid_anioEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioEvaluacionEmpleado;
	public JButton jButtonid_anioEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_anioEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_anioEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_semestreEvaluacionEmpleado;
	public JLabel jLabelid_semestreEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_semestreEvaluacionEmpleado;
	public JButton jButtonid_semestreEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_semestreEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_semestreEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_trimestreEvaluacionEmpleado;
	public JLabel jLabelid_trimestreEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_trimestreEvaluacionEmpleado;
	public JButton jButtonid_trimestreEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_trimestreEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_trimestreEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_bimestreEvaluacionEmpleado;
	public JLabel jLabelid_bimestreEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bimestreEvaluacionEmpleado;
	public JButton jButtonid_bimestreEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_bimestreEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_bimestreEvaluacionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesEvaluacionEmpleado;
	public JLabel jLabelid_mesEvaluacionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesEvaluacionEmpleado;
	public JButton jButtonid_mesEvaluacionEmpleado= new JButtonMe();
	public JButton jButtonid_mesEvaluacionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_mesEvaluacionEmpleadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEvaluacionEmpleado;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EvaluacionEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEvaluacionEmpleado=new JPanel();
				this.jPanelAccionesFormularioEvaluacionEmpleado=new JPanel();
				this.jmenuBarDetalleEvaluacionEmpleado=new JMenuBar();
				this.jTtoolBarDetalleEvaluacionEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EvaluacionEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EvaluacionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEvaluacionEmpleado() {
		return this.jButtonActualizarToolBarEvaluacionEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarEvaluacionEmpleado() {
		return this.jButtonEliminarToolBarEvaluacionEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarEvaluacionEmpleado() {
		return this.jButtonCancelarToolBarEvaluacionEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionEvaluacionEmpleado() {
		return this.jButtonProcesarInformacionEvaluacionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEvaluacionEmpleado)	{
		this.jButtonProcesarInformacionEvaluacionEmpleado = jButtonProcesarInformacionEvaluacionEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEvaluacionEmpleado() {
		return this.jComboBoxTiposAccionesEvaluacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEvaluacionEmpleado(
			JComboBox jComboBoxTiposRelacionesEvaluacionEmpleado) {
		this.jComboBoxTiposRelacionesEvaluacionEmpleado = jComboBoxTiposRelacionesEvaluacionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEvaluacionEmpleado(
			JComboBox jComboBoxTiposAccionesEvaluacionEmpleado) {
		this.jComboBoxTiposAccionesEvaluacionEmpleado = jComboBoxTiposAccionesEvaluacionEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEvaluacionEmpleado() {
		return this.jComboBoxTiposAccionesFormularioEvaluacionEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEvaluacionEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioEvaluacionEmpleado) {
		this.jComboBoxTiposAccionesFormularioEvaluacionEmpleado = jComboBoxTiposAccionesFormularioEvaluacionEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.evaluacionempleadoSessionBean=new EvaluacionEmpleadoSessionBean();
		
		this.evaluacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.evaluacionempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EvaluacionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Evaluacion Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		EvaluacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEvaluacionEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEvaluacionEmpleado=new JButtonMe();
				this.jButtonModificarToolBarEvaluacionEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEvaluacionEmpleado,this.jTtoolBarDetalleEvaluacionEmpleado,
							"actualizar","actualizar","Actualizar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEvaluacionEmpleado,this.jTtoolBarDetalleEvaluacionEmpleado,
							"eliminar","eliminar","Eliminar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEvaluacionEmpleado,this.jTtoolBarDetalleEvaluacionEmpleado,
							"cancelar","cancelar","Cancelar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEvaluacionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEvaluacionEmpleado,this.jTtoolBarDetalleEvaluacionEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEvaluacionEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEvaluacionEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEvaluacionEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEvaluacionEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEvaluacionEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEvaluacionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEvaluacionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEvaluacionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEvaluacionEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEvaluacionEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEvaluacionEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEvaluacionEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEvaluacionEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEvaluacionEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEvaluacionEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEvaluacionEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEvaluacionEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEvaluacionEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEvaluacionEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEvaluacionEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEvaluacionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEvaluacionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEvaluacionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEvaluacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEvaluacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEvaluacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEvaluacionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEvaluacionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEvaluacionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEvaluacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEvaluacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEvaluacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEvaluacionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEvaluacionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEvaluacionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEvaluacionEmpleado.add(this.jMenuItemDetalleCerrarEvaluacionEmpleado);
		
		this.jmenuDetalleAccionesEvaluacionEmpleado.add(this.jMenuItemActualizarEvaluacionEmpleado);
		this.jmenuDetalleAccionesEvaluacionEmpleado.add(this.jMenuItemEliminarEvaluacionEmpleado);
		this.jmenuDetalleAccionesEvaluacionEmpleado.add(this.jMenuItemCancelarEvaluacionEmpleado);		
		
		//this.jmenuDetalleDatosEvaluacionEmpleado.add(this.jMenuItemDetalleAbrirOrderByEvaluacionEmpleado);				
		this.jmenuDetalleDatosEvaluacionEmpleado.add(this.jMenuItemDetalleMostarOcultarEvaluacionEmpleado);				
				
		//this.jmenuDetalleAccionesEvaluacionEmpleado.add(this.jMenuItemGuardarCambiosEvaluacionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEvaluacionEmpleado.add(this.jmenuDetalleArchivoEvaluacionEmpleado);		
		this.jmenuBarDetalleEvaluacionEmpleado.add(this.jmenuDetalleAccionesEvaluacionEmpleado);		
		this.jmenuBarDetalleEvaluacionEmpleado.add(this.jmenuDetalleDatosEvaluacionEmpleado);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEvaluacionEmpleado.add(this.jmenuDetalleEvaluacionEmpleado);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEvaluacionEmpleado);				
	}
	
	
	public void inicializarElementosCamposEvaluacionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEvaluacionEmpleado = new JLabelMe();
		jLabelIdEvaluacionEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEvaluacionEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEvaluacionEmpleado= new GridBagLayout();

		this.jPanelidEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);

		jLabelidEvaluacionEmpleado = new JLabel();
		jLabelidEvaluacionEmpleado.setText("Id");

		jLabelidEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaEvaluacionEmpleado = new JLabelMe();
		this.jLabelfechaEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaEvaluacionEmpleado.setToolTipText("Fecha");
		this.jLabelfechaEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelfechaEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		//jFormattedTextFieldfechaEvaluacionEmpleado= new JFormattedTextFieldMe();

		jDateChooserfechaEvaluacionEmpleado= new JDateChooser();
		jDateChooserfechaEvaluacionEmpleado.setEnabled(false);
		jDateChooserfechaEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaEvaluacionEmpleado.setDate(new Date());
		jDateChooserfechaEvaluacionEmpleado.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaEvaluacionEmpleado.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonfechaEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonfechaEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaEvaluacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelesta_evaluadoEvaluacionEmpleado = new JLabelMe();
		this.jLabelesta_evaluadoEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_ESTAEVALUADO+" : *");
		this.jLabelesta_evaluadoEvaluacionEmpleado.setToolTipText("Esta Evaluado");
		this.jLabelesta_evaluadoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_evaluadoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_evaluadoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_evaluadoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_evaluadoEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_evaluadoEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_ESTAEVALUADO);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelesta_evaluadoEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jCheckBoxesta_evaluadoEvaluacionEmpleado= new JCheckBoxMe();
		jCheckBoxesta_evaluadoEvaluacionEmpleado.setEnabled(false);

		jCheckBoxesta_evaluadoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_evaluadoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_evaluadoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_evaluadoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_evaluadoEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonesta_evaluadoEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_evaluadoEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_evaluadoEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_evaluadoEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonesta_evaluadoEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_evaluadoEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_evaluadoEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_evaluadoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_evaluadoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_evaluadoEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_evaluadoEvaluacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelobservacion1EvaluacionEmpleado = new JLabelMe();
		this.jLabelobservacion1EvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_OBSERVACION1+" : *");
		this.jLabelobservacion1EvaluacionEmpleado.setToolTipText("Observacion1");
		this.jLabelobservacion1EvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacion1EvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacion1EvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacion1EvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacion1EvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacion1EvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_OBSERVACION1);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelobservacion1EvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jTextAreaobservacion1EvaluacionEmpleado= new JTextAreaMe();
		jTextAreaobservacion1EvaluacionEmpleado.setEnabled(false);
		jTextAreaobservacion1EvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacion1EvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacion1EvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacion1EvaluacionEmpleado.setLineWrap(true);
		jTextAreaobservacion1EvaluacionEmpleado.setWrapStyleWord(true);
		jTextAreaobservacion1EvaluacionEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacion1EvaluacionEmpleado.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacion1EvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacion1EvaluacionEmpleado = new JScrollPane(jTextAreaobservacion1EvaluacionEmpleado);
		jscrollPaneobservacion1EvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacion1EvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacion1EvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacion1EvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonobservacion1EvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacion1EvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacion1EvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacion1EvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonobservacion1EvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacion1EvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacion1EvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacion1EvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacion1EvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacion1EvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacion1EvaluacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelobservacion2EvaluacionEmpleado = new JLabelMe();
		this.jLabelobservacion2EvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_OBSERVACION2+" : *");
		this.jLabelobservacion2EvaluacionEmpleado.setToolTipText("Observacion2");
		this.jLabelobservacion2EvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacion2EvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacion2EvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacion2EvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacion2EvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacion2EvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_OBSERVACION2);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelobservacion2EvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jTextAreaobservacion2EvaluacionEmpleado= new JTextAreaMe();
		jTextAreaobservacion2EvaluacionEmpleado.setEnabled(false);
		jTextAreaobservacion2EvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacion2EvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacion2EvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacion2EvaluacionEmpleado.setLineWrap(true);
		jTextAreaobservacion2EvaluacionEmpleado.setWrapStyleWord(true);
		jTextAreaobservacion2EvaluacionEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacion2EvaluacionEmpleado.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacion2EvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacion2EvaluacionEmpleado = new JScrollPane(jTextAreaobservacion2EvaluacionEmpleado);
		jscrollPaneobservacion2EvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacion2EvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacion2EvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacion2EvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonobservacion2EvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacion2EvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacion2EvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacion2EvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonobservacion2EvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacion2EvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacion2EvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacion2EvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacion2EvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacion2EvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacion2EvaluacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelobservacion3EvaluacionEmpleado = new JLabelMe();
		this.jLabelobservacion3EvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_OBSERVACION3+" : *");
		this.jLabelobservacion3EvaluacionEmpleado.setToolTipText("Observacion3");
		this.jLabelobservacion3EvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacion3EvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacion3EvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacion3EvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacion3EvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacion3EvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_OBSERVACION3);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelobservacion3EvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jTextAreaobservacion3EvaluacionEmpleado= new JTextAreaMe();
		jTextAreaobservacion3EvaluacionEmpleado.setEnabled(false);
		jTextAreaobservacion3EvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacion3EvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacion3EvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacion3EvaluacionEmpleado.setLineWrap(true);
		jTextAreaobservacion3EvaluacionEmpleado.setWrapStyleWord(true);
		jTextAreaobservacion3EvaluacionEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacion3EvaluacionEmpleado.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacion3EvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacion3EvaluacionEmpleado = new JScrollPane(jTextAreaobservacion3EvaluacionEmpleado);
		jscrollPaneobservacion3EvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacion3EvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacion3EvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacion3EvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonobservacion3EvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacion3EvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacion3EvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacion3EvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonobservacion3EvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacion3EvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacion3EvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacion3EvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacion3EvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacion3EvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacion3EvaluacionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelobservacion4EvaluacionEmpleado = new JLabelMe();
		this.jLabelobservacion4EvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_OBSERVACION4+" : *");
		this.jLabelobservacion4EvaluacionEmpleado.setToolTipText("Observacion4");
		this.jLabelobservacion4EvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacion4EvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacion4EvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacion4EvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacion4EvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacion4EvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_OBSERVACION4);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelobservacion4EvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jTextAreaobservacion4EvaluacionEmpleado= new JTextAreaMe();
		jTextAreaobservacion4EvaluacionEmpleado.setEnabled(false);
		jTextAreaobservacion4EvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacion4EvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacion4EvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacion4EvaluacionEmpleado.setLineWrap(true);
		jTextAreaobservacion4EvaluacionEmpleado.setWrapStyleWord(true);
		jTextAreaobservacion4EvaluacionEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacion4EvaluacionEmpleado.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacion4EvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacion4EvaluacionEmpleado = new JScrollPane(jTextAreaobservacion4EvaluacionEmpleado);
		jscrollPaneobservacion4EvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacion4EvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacion4EvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacion4EvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonobservacion4EvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacion4EvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacion4EvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacion4EvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonobservacion4EvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacion4EvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacion4EvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacion4EvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacion4EvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacion4EvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacion4EvaluacionEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEvaluacionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEvaluacionEmpleado = new JLabelMe();
		this.jLabelid_empresaEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEvaluacionEmpleado.setToolTipText("Empresa");
		this.jLabelid_empresaEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelid_empresaEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jComboBoxid_empresaEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_empresaEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEvaluacionEmpleado.setEnabled(false);

		this.jButtonid_empresaEvaluacionEmpleado= new JButtonMe();
		this.jButtonid_empresaEvaluacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEvaluacionEmpleado.setText("Buscar");
		this.jButtonid_empresaEvaluacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEvaluacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionEmpleado"));

		this.jButtonid_empresaEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empresaEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonid_empresaEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEvaluacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empresaEvaluacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empresaEvaluacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEvaluacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEvaluacionEmpleadoUpdate.setText("U");
		this.jButtonid_empresaEvaluacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEvaluacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEvaluacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEvaluacionEmpleadoUpdate"));



					
		this.jLabelid_sucursalEvaluacionEmpleado = new JLabelMe();
		this.jLabelid_sucursalEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalEvaluacionEmpleado.setToolTipText("Sucursal");
		this.jLabelid_sucursalEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelid_sucursalEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jComboBoxid_sucursalEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_sucursalEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalEvaluacionEmpleado.setEnabled(false);

		this.jButtonid_sucursalEvaluacionEmpleado= new JButtonMe();
		this.jButtonid_sucursalEvaluacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEvaluacionEmpleado.setText("Buscar");
		this.jButtonid_sucursalEvaluacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalEvaluacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionEmpleado"));

		this.jButtonid_sucursalEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_sucursalEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonid_sucursalEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalEvaluacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalEvaluacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_sucursalEvaluacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEvaluacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEvaluacionEmpleadoUpdate.setText("U");
		this.jButtonid_sucursalEvaluacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalEvaluacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEvaluacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEvaluacionEmpleadoUpdate"));



					
		this.jLabelid_ejercicioEvaluacionEmpleado = new JLabelMe();
		this.jLabelid_ejercicioEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioEvaluacionEmpleado.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelid_ejercicioEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jComboBoxid_ejercicioEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_ejercicioEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioEvaluacionEmpleado.setEnabled(false);

		this.jButtonid_ejercicioEvaluacionEmpleado= new JButtonMe();
		this.jButtonid_ejercicioEvaluacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEvaluacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEvaluacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioEvaluacionEmpleado.setText("Buscar");
		this.jButtonid_ejercicioEvaluacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioEvaluacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEvaluacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEvaluacionEmpleado"));

		this.jButtonid_ejercicioEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonid_ejercicioEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioEvaluacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioEvaluacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_ejercicioEvaluacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioEvaluacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioEvaluacionEmpleadoUpdate.setText("U");
		this.jButtonid_ejercicioEvaluacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioEvaluacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioEvaluacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioEvaluacionEmpleadoUpdate"));



					
		this.jLabelid_periodoEvaluacionEmpleado = new JLabelMe();
		this.jLabelid_periodoEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoEvaluacionEmpleado.setToolTipText("Periodo");
		this.jLabelid_periodoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelid_periodoEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jComboBoxid_periodoEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_periodoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoEvaluacionEmpleado.setEnabled(false);

		this.jButtonid_periodoEvaluacionEmpleado= new JButtonMe();
		this.jButtonid_periodoEvaluacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEvaluacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEvaluacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoEvaluacionEmpleado.setText("Buscar");
		this.jButtonid_periodoEvaluacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoEvaluacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEvaluacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEvaluacionEmpleado"));

		this.jButtonid_periodoEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_periodoEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonid_periodoEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoEvaluacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_periodoEvaluacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_periodoEvaluacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEvaluacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoEvaluacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoEvaluacionEmpleadoUpdate.setText("U");
		this.jButtonid_periodoEvaluacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoEvaluacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoEvaluacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoEvaluacionEmpleadoUpdate"));



					
		this.jLabelid_estructuraEvaluacionEmpleado = new JLabelMe();
		this.jLabelid_estructuraEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraEvaluacionEmpleado.setToolTipText("Estructura");
		this.jLabelid_estructuraEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelid_estructuraEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jComboBoxid_estructuraEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_estructuraEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraEvaluacionEmpleado= new JButtonMe();
		this.jButtonid_estructuraEvaluacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEvaluacionEmpleado.setText("Buscar");
		this.jButtonid_estructuraEvaluacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraEvaluacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionEmpleado"));

		this.jButtonid_estructuraEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_estructuraEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonid_estructuraEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraEvaluacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_estructuraEvaluacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_estructuraEvaluacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEvaluacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEvaluacionEmpleadoUpdate.setText("U");
		this.jButtonid_estructuraEvaluacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraEvaluacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionEmpleadoUpdate"));


		jButtonid_estructuraEvaluacionEmpleadoArbol= new JButtonMe();
		jButtonid_estructuraEvaluacionEmpleadoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEvaluacionEmpleadoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEvaluacionEmpleadoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEvaluacionEmpleadoArbol.setText("Arbol");
		jButtonid_estructuraEvaluacionEmpleadoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraEvaluacionEmpleadoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEvaluacionEmpleadoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEvaluacionEmpleadoArbol"));



					
		this.jLabelid_empleadoEvaluacionEmpleado = new JLabelMe();
		this.jLabelid_empleadoEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoEvaluacionEmpleado.setToolTipText("Empleado");
		this.jLabelid_empleadoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelid_empleadoEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jComboBoxid_empleadoEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoEvaluacionEmpleado= new JButtonMe();
		this.jButtonid_empleadoEvaluacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEvaluacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEvaluacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEvaluacionEmpleado.setText("Buscar");
		this.jButtonid_empleadoEvaluacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoEvaluacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEvaluacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEvaluacionEmpleado"));

		this.jButtonid_empleadoEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empleadoEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonid_empleadoEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoEvaluacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoEvaluacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empleadoEvaluacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEvaluacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEvaluacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEvaluacionEmpleadoUpdate.setText("U");
		this.jButtonid_empleadoEvaluacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoEvaluacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEvaluacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEvaluacionEmpleadoUpdate"));



					
		this.jLabelid_empleado_evaluaEvaluacionEmpleado = new JLabelMe();
		this.jLabelid_empleado_evaluaEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADOEVALUA+" : *");
		this.jLabelid_empleado_evaluaEvaluacionEmpleado.setToolTipText("Empleado Evalua");
		this.jLabelid_empleado_evaluaEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empleado_evaluaEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empleado_evaluaEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_evaluaEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleado_evaluaEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleado_evaluaEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADOEVALUA);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelid_empleado_evaluaEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jComboBoxid_empleado_evaluaEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_empleado_evaluaEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_evaluaEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_evaluaEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_evaluaEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleado_evaluaEvaluacionEmpleado= new JButtonMe();
		this.jButtonid_empleado_evaluaEvaluacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_evaluaEvaluacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_evaluaEvaluacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_evaluaEvaluacionEmpleado.setText("Buscar");
		this.jButtonid_empleado_evaluaEvaluacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleado_evaluaEvaluacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_evaluaEvaluacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleado_evaluaEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_evaluaEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_evaluaEvaluacionEmpleado"));

		this.jButtonid_empleado_evaluaEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empleado_evaluaEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_evaluaEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_evaluaEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_evaluaEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonid_empleado_evaluaEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleado_evaluaEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_evaluaEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleado_evaluaEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_evaluaEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_evaluaEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleado_evaluaEvaluacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empleado_evaluaEvaluacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empleado_evaluaEvaluacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_evaluaEvaluacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_evaluaEvaluacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_evaluaEvaluacionEmpleadoUpdate.setText("U");
		this.jButtonid_empleado_evaluaEvaluacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleado_evaluaEvaluacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_evaluaEvaluacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleado_evaluaEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_evaluaEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_evaluaEvaluacionEmpleadoUpdate"));



					
		this.jLabelid_tipo_evaluacion_empleadoEvaluacionEmpleado = new JLabelMe();
		this.jLabelid_tipo_evaluacion_empleadoEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_IDTIPOEVALUACIONEMPLEADO+" : *");
		this.jLabelid_tipo_evaluacion_empleadoEvaluacionEmpleado.setToolTipText("Tipo Evaluacion Empleado");
		this.jLabelid_tipo_evaluacion_empleadoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_evaluacion_empleadoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_evaluacion_empleadoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_evaluacion_empleadoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_evaluacion_empleadoEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_evaluacion_empleadoEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_IDTIPOEVALUACIONEMPLEADO);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelid_tipo_evaluacion_empleadoEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleado= new JButtonMe();
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleado.setText("Buscar");
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_evaluacion_empleadoEvaluacionEmpleado"));

		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_evaluacion_empleadoEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoUpdate.setText("U");
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_evaluacion_empleadoEvaluacionEmpleadoUpdate"));



					
		this.jLabelid_anioEvaluacionEmpleado = new JLabelMe();
		this.jLabelid_anioEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioEvaluacionEmpleado.setToolTipText("Anio");
		this.jLabelid_anioEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelid_anioEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jComboBoxid_anioEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_anioEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioEvaluacionEmpleado= new JButtonMe();
		this.jButtonid_anioEvaluacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioEvaluacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioEvaluacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioEvaluacionEmpleado.setText("Buscar");
		this.jButtonid_anioEvaluacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioEvaluacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioEvaluacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioEvaluacionEmpleado"));

		this.jButtonid_anioEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_anioEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonid_anioEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioEvaluacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_anioEvaluacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_anioEvaluacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEvaluacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioEvaluacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioEvaluacionEmpleadoUpdate.setText("U");
		this.jButtonid_anioEvaluacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioEvaluacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioEvaluacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioEvaluacionEmpleadoUpdate"));



					
		this.jLabelid_semestreEvaluacionEmpleado = new JLabelMe();
		this.jLabelid_semestreEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_IDSEMESTRE+" : *");
		this.jLabelid_semestreEvaluacionEmpleado.setToolTipText("Semestre");
		this.jLabelid_semestreEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_semestreEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_semestreEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_semestreEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_semestreEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_semestreEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_IDSEMESTRE);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelid_semestreEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jComboBoxid_semestreEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_semestreEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_semestreEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_semestreEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_semestreEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_semestreEvaluacionEmpleado= new JButtonMe();
		this.jButtonid_semestreEvaluacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_semestreEvaluacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_semestreEvaluacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_semestreEvaluacionEmpleado.setText("Buscar");
		this.jButtonid_semestreEvaluacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_semestreEvaluacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_semestreEvaluacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_semestreEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_semestreEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_semestreEvaluacionEmpleado"));

		this.jButtonid_semestreEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_semestreEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_semestreEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_semestreEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_semestreEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonid_semestreEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_semestreEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_semestreEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_semestreEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_semestreEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_semestreEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_semestreEvaluacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_semestreEvaluacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_semestreEvaluacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_semestreEvaluacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_semestreEvaluacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_semestreEvaluacionEmpleadoUpdate.setText("U");
		this.jButtonid_semestreEvaluacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_semestreEvaluacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_semestreEvaluacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_semestreEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_semestreEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_semestreEvaluacionEmpleadoUpdate"));



					
		this.jLabelid_trimestreEvaluacionEmpleado = new JLabelMe();
		this.jLabelid_trimestreEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_IDTRIMESTRE+" : *");
		this.jLabelid_trimestreEvaluacionEmpleado.setToolTipText("Trimestre");
		this.jLabelid_trimestreEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_trimestreEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_trimestreEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_trimestreEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_trimestreEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_trimestreEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_IDTRIMESTRE);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelid_trimestreEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jComboBoxid_trimestreEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_trimestreEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_trimestreEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_trimestreEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_trimestreEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_trimestreEvaluacionEmpleado= new JButtonMe();
		this.jButtonid_trimestreEvaluacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_trimestreEvaluacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_trimestreEvaluacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_trimestreEvaluacionEmpleado.setText("Buscar");
		this.jButtonid_trimestreEvaluacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_trimestreEvaluacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_trimestreEvaluacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_trimestreEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_trimestreEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_trimestreEvaluacionEmpleado"));

		this.jButtonid_trimestreEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_trimestreEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_trimestreEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_trimestreEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_trimestreEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonid_trimestreEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_trimestreEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_trimestreEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_trimestreEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_trimestreEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_trimestreEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_trimestreEvaluacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_trimestreEvaluacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_trimestreEvaluacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_trimestreEvaluacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_trimestreEvaluacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_trimestreEvaluacionEmpleadoUpdate.setText("U");
		this.jButtonid_trimestreEvaluacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_trimestreEvaluacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_trimestreEvaluacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_trimestreEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_trimestreEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_trimestreEvaluacionEmpleadoUpdate"));



					
		this.jLabelid_bimestreEvaluacionEmpleado = new JLabelMe();
		this.jLabelid_bimestreEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_IDBIMESTRE+" : *");
		this.jLabelid_bimestreEvaluacionEmpleado.setToolTipText("Bimestre");
		this.jLabelid_bimestreEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bimestreEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bimestreEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bimestreEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bimestreEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bimestreEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_IDBIMESTRE);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelid_bimestreEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jComboBoxid_bimestreEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_bimestreEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bimestreEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bimestreEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bimestreEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bimestreEvaluacionEmpleado= new JButtonMe();
		this.jButtonid_bimestreEvaluacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bimestreEvaluacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bimestreEvaluacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bimestreEvaluacionEmpleado.setText("Buscar");
		this.jButtonid_bimestreEvaluacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bimestreEvaluacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bimestreEvaluacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bimestreEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bimestreEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bimestreEvaluacionEmpleado"));

		this.jButtonid_bimestreEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_bimestreEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bimestreEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bimestreEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bimestreEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonid_bimestreEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bimestreEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bimestreEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bimestreEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bimestreEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bimestreEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bimestreEvaluacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_bimestreEvaluacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_bimestreEvaluacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bimestreEvaluacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bimestreEvaluacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bimestreEvaluacionEmpleadoUpdate.setText("U");
		this.jButtonid_bimestreEvaluacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bimestreEvaluacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bimestreEvaluacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bimestreEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bimestreEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bimestreEvaluacionEmpleadoUpdate"));



					
		this.jLabelid_mesEvaluacionEmpleado = new JLabelMe();
		this.jLabelid_mesEvaluacionEmpleado.setText(""+EvaluacionEmpleadoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesEvaluacionEmpleado.setToolTipText("Mes");
		this.jLabelid_mesEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesEvaluacionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesEvaluacionEmpleado.setToolTipText(EvaluacionEmpleadoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		this.jPanelid_mesEvaluacionEmpleado.setLayout(this.gridaBagLayoutEvaluacionEmpleado);


		jComboBoxid_mesEvaluacionEmpleado= new JComboBoxMe();
		jComboBoxid_mesEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesEvaluacionEmpleado= new JButtonMe();
		this.jButtonid_mesEvaluacionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesEvaluacionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesEvaluacionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesEvaluacionEmpleado.setText("Buscar");
		this.jButtonid_mesEvaluacionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesEvaluacionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesEvaluacionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesEvaluacionEmpleado"));

		this.jButtonid_mesEvaluacionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_mesEvaluacionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesEvaluacionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesEvaluacionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesEvaluacionEmpleadoBusqueda.setText("U");
		this.jButtonid_mesEvaluacionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesEvaluacionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesEvaluacionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesEvaluacionEmpleadoBusqueda"));

		if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesEvaluacionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_mesEvaluacionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_mesEvaluacionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesEvaluacionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesEvaluacionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesEvaluacionEmpleadoUpdate.setText("U");
		this.jButtonid_mesEvaluacionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesEvaluacionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesEvaluacionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesEvaluacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesEvaluacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesEvaluacionEmpleadoUpdate"));



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
		//this.jInternalFrameDetalleEvaluacionEmpleado = new EvaluacionEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Evaluacion Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEvaluacionEmpleado= new GridBagLayout();
		

		
		String sToolTipEvaluacionEmpleado="";
		sToolTipEvaluacionEmpleado=EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEvaluacionEmpleado+="(Nomina.EvaluacionEmpleado)";
		}
		
		if(!this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEvaluacionEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEvaluacionEmpleado = new JButtonMe();
		this.jButtonModificarEvaluacionEmpleado = new JButtonMe();
        this.jButtonActualizarEvaluacionEmpleado = new JButtonMe();
        this.jButtonEliminarEvaluacionEmpleado = new JButtonMe();
        this.jButtonCancelarEvaluacionEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosEvaluacionEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaEvaluacionEmpleado = new JButtonMe();
		this.jButtonCerrarEvaluacionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosEvaluacionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionEvaluacionEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralEvaluacionEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Evaluacion Empleado";
		
		if(!this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosEvaluacionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEvaluacionEmpleado.setName("jPanelCamposEvaluacionEmpleado"); 

		this.jPanelCamposOcultosEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEvaluacionEmpleado.setName("jPanelCamposOcultosEvaluacionEmpleado"); 

        this.jPanelAccionesEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEvaluacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesEvaluacionEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEvaluacionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEvaluacionEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEvaluacionEmpleado.setText("Nuevo");
		this.jButtonModificarEvaluacionEmpleado.setText("Editar");
        this.jButtonActualizarEvaluacionEmpleado.setText("Actualizar");
        this.jButtonEliminarEvaluacionEmpleado.setText("Eliminar");
        this.jButtonCancelarEvaluacionEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosEvaluacionEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaEvaluacionEmpleado.setText("Guardar");
		this.jButtonCerrarEvaluacionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEvaluacionEmpleado,"nuevo_button","Nuevo",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEvaluacionEmpleado,"modificar_button","Editar",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEvaluacionEmpleado,"actualizar_button","Actualizar",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEvaluacionEmpleado,"eliminar_button","Eliminar",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEvaluacionEmpleado,"cancelar_button","Cancelar",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEvaluacionEmpleado,"guardarcambios_button","Guardar",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEvaluacionEmpleado,"guardarcambiostabla_button","Guardar",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEvaluacionEmpleado,"cerrar_button","Salir",this.evaluacionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEvaluacionEmpleado.setToolTipText("Nuevo"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEvaluacionEmpleado.setToolTipText("Editar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEvaluacionEmpleado.setToolTipText("Actualizar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEvaluacionEmpleado.setToolTipText("Eliminar)"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEvaluacionEmpleado.setToolTipText("Cancelar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEvaluacionEmpleado.setToolTipText("Guardar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEvaluacionEmpleado.setToolTipText("Guardar"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEvaluacionEmpleado.setToolTipText("Salir"+" "+EvaluacionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEvaluacionEmpleado";
		inputMap = this.jButtonNuevoEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEvaluacionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEvaluacionEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEvaluacionEmpleado";
		inputMap = this.jButtonActualizarEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEvaluacionEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarEvaluacionEmpleado";
		inputMap = this.jButtonEliminarEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEvaluacionEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarEvaluacionEmpleado";
		inputMap = this.jButtonCancelarEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEvaluacionEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarEvaluacionEmpleado";
		inputMap = this.jButtonCerrarEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEvaluacionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEvaluacionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaEvaluacionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEvaluacionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEvaluacionEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEvaluacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEvaluacionEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEvaluacionEmpleado.setToolTipText("Nuevo EvaluacionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEvaluacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEvaluacionEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEvaluacionEmpleado.setToolTipText("Sin Cerrar Ventana EvaluacionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEvaluacionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEvaluacionEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEvaluacionEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEvaluacionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesEvaluacionEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEvaluacionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEvaluacionEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEvaluacionEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEvaluacionEmpleado = new JLabelMe();
		
		this.jLabelAccionesEvaluacionEmpleado.setText("Acciones");		
		this.jLabelAccionesEvaluacionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEvaluacionEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEvaluacionEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEvaluacionEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesEvaluacionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEvaluacionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEvaluacionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEvaluacionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEvaluacionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEvaluacionEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEvaluacionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEvaluacionEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEvaluacionEmpleado = new GridBagLayout();
		
		this.jPanelCamposEvaluacionEmpleado.setLayout(gridaBagLayoutCamposEvaluacionEmpleado);
		this.jPanelCamposOcultosEvaluacionEmpleado.setLayout(gridaBagLayoutCamposOcultosEvaluacionEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEvaluacionEmpleado.add(jLabelIdEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEvaluacionEmpleado.add(jLabelidEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEvaluacionEmpleado.add(jLabelid_empresaEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEvaluacionEmpleado.add(jButtonid_empresaEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 3;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEvaluacionEmpleado.add(jButtonid_empresaEvaluacionEmpleadoUpdate, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEvaluacionEmpleado.add(jComboBoxid_empresaEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalEvaluacionEmpleado.add(jLabelid_sucursalEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEvaluacionEmpleado.add(jButtonid_sucursalEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 3;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEvaluacionEmpleado.add(jButtonid_sucursalEvaluacionEmpleadoUpdate, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalEvaluacionEmpleado.add(jComboBoxid_sucursalEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioEvaluacionEmpleado.add(jLabelid_ejercicioEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioEvaluacionEmpleado.add(jButtonid_ejercicioEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 3;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioEvaluacionEmpleado.add(jButtonid_ejercicioEvaluacionEmpleadoUpdate, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioEvaluacionEmpleado.add(jComboBoxid_ejercicioEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoEvaluacionEmpleado.add(jLabelid_periodoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoEvaluacionEmpleado.add(jButtonid_periodoEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 3;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoEvaluacionEmpleado.add(jButtonid_periodoEvaluacionEmpleadoUpdate, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoEvaluacionEmpleado.add(jComboBoxid_periodoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraEvaluacionEmpleado.add(jLabelid_estructuraEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEvaluacionEmpleado.add(jButtonid_estructuraEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 3;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEvaluacionEmpleado.add(jButtonid_estructuraEvaluacionEmpleadoUpdate, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraEvaluacionEmpleado.add(jComboBoxid_estructuraEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoEvaluacionEmpleado.add(jLabelid_empleadoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEvaluacionEmpleado.add(jButtonid_empleadoEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 3;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEvaluacionEmpleado.add(jButtonid_empleadoEvaluacionEmpleadoUpdate, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoEvaluacionEmpleado.add(jComboBoxid_empleadoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleado_evaluaEvaluacionEmpleado.add(jLabelid_empleado_evaluaEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_evaluaEvaluacionEmpleado.add(jButtonid_empleado_evaluaEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 3;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_evaluaEvaluacionEmpleado.add(jButtonid_empleado_evaluaEvaluacionEmpleadoUpdate, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleado_evaluaEvaluacionEmpleado.add(jComboBoxid_empleado_evaluaEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_evaluacion_empleadoEvaluacionEmpleado.add(jLabelid_tipo_evaluacion_empleadoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_evaluacion_empleadoEvaluacionEmpleado.add(jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 3;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_evaluacion_empleadoEvaluacionEmpleado.add(jButtonid_tipo_evaluacion_empleadoEvaluacionEmpleadoUpdate, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_evaluacion_empleadoEvaluacionEmpleado.add(jComboBoxid_tipo_evaluacion_empleadoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaEvaluacionEmpleado.add(jLabelfechaEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaEvaluacionEmpleado.add(jButtonfechaEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaEvaluacionEmpleado.add(jDateChooserfechaEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_evaluadoEvaluacionEmpleado.add(jLabelesta_evaluadoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_evaluadoEvaluacionEmpleado.add(jButtonesta_evaluadoEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_evaluadoEvaluacionEmpleado.add(jCheckBoxesta_evaluadoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioEvaluacionEmpleado.add(jLabelid_anioEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioEvaluacionEmpleado.add(jButtonid_anioEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 3;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioEvaluacionEmpleado.add(jButtonid_anioEvaluacionEmpleadoUpdate, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioEvaluacionEmpleado.add(jComboBoxid_anioEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_semestreEvaluacionEmpleado.add(jLabelid_semestreEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_semestreEvaluacionEmpleado.add(jButtonid_semestreEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 3;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_semestreEvaluacionEmpleado.add(jButtonid_semestreEvaluacionEmpleadoUpdate, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_semestreEvaluacionEmpleado.add(jComboBoxid_semestreEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_trimestreEvaluacionEmpleado.add(jLabelid_trimestreEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_trimestreEvaluacionEmpleado.add(jButtonid_trimestreEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 3;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_trimestreEvaluacionEmpleado.add(jButtonid_trimestreEvaluacionEmpleadoUpdate, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_trimestreEvaluacionEmpleado.add(jComboBoxid_trimestreEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bimestreEvaluacionEmpleado.add(jLabelid_bimestreEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bimestreEvaluacionEmpleado.add(jButtonid_bimestreEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 3;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bimestreEvaluacionEmpleado.add(jButtonid_bimestreEvaluacionEmpleadoUpdate, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bimestreEvaluacionEmpleado.add(jComboBoxid_bimestreEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesEvaluacionEmpleado.add(jLabelid_mesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesEvaluacionEmpleado.add(jButtonid_mesEvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 3;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesEvaluacionEmpleado.add(jButtonid_mesEvaluacionEmpleadoUpdate, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesEvaluacionEmpleado.add(jComboBoxid_mesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacion1EvaluacionEmpleado.add(jLabelobservacion1EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacion1EvaluacionEmpleado.add(jButtonobservacion1EvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacion1EvaluacionEmpleado.add(jscrollPaneobservacion1EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacion2EvaluacionEmpleado.add(jLabelobservacion2EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacion2EvaluacionEmpleado.add(jButtonobservacion2EvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacion2EvaluacionEmpleado.add(jscrollPaneobservacion2EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacion3EvaluacionEmpleado.add(jLabelobservacion3EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacion3EvaluacionEmpleado.add(jButtonobservacion3EvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacion3EvaluacionEmpleado.add(jscrollPaneobservacion3EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacion4EvaluacionEmpleado.add(jLabelobservacion4EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 2;
		this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
		this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacion4EvaluacionEmpleado.add(jButtonobservacion4EvaluacionEmpleadoBusqueda, this.gridBagConstraintsEvaluacionEmpleado);
	}

	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = 1;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacion4EvaluacionEmpleado.add(jscrollPaneobservacion4EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelidEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelid_estructuraEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelid_empleadoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelid_empleado_evaluaEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelid_tipo_evaluacion_empleadoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelfechaEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelesta_evaluadoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelid_anioEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelid_semestreEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelid_trimestreEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelid_bimestreEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelid_mesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelobservacion1EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelobservacion2EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelobservacion3EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEvaluacionEmpleado.add(this.jPanelobservacion4EvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposEvaluacionEmpleado % 2==0) {
		iXPanelCamposEvaluacionEmpleado=0;
		iYPanelCamposEvaluacionEmpleado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposOcultosEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposOcultosEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionEmpleado.add(this.jPanelid_empresaEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposOcultosEvaluacionEmpleado % 2==0) {
		iXPanelCamposOcultosEvaluacionEmpleado=0;
		iYPanelCamposOcultosEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposOcultosEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposOcultosEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionEmpleado.add(this.jPanelid_sucursalEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposOcultosEvaluacionEmpleado % 2==0) {
		iXPanelCamposOcultosEvaluacionEmpleado=0;
		iYPanelCamposOcultosEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposOcultosEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposOcultosEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionEmpleado.add(this.jPanelid_ejercicioEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposOcultosEvaluacionEmpleado % 2==0) {
		iXPanelCamposOcultosEvaluacionEmpleado=0;
		iYPanelCamposOcultosEvaluacionEmpleado++;
	}
	this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEvaluacionEmpleado.gridy = iYPanelCamposOcultosEvaluacionEmpleado;
	this.gridBagConstraintsEvaluacionEmpleado.gridx = iXPanelCamposOcultosEvaluacionEmpleado++;
	this.gridBagConstraintsEvaluacionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEvaluacionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEvaluacionEmpleado.add(this.jPanelid_periodoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);



	if(iXPanelCamposOcultosEvaluacionEmpleado % 2==0) {
		iXPanelCamposOcultosEvaluacionEmpleado=0;
		iYPanelCamposOcultosEvaluacionEmpleado++;
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
			
		GridBagLayout gridaBagLayoutAccionesEvaluacionEmpleado= new GridBagLayout();
		this.jPanelAccionesEvaluacionEmpleado.setLayout(gridaBagLayoutAccionesEvaluacionEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEvaluacionEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioEvaluacionEmpleado.setLayout(gridaBagLayoutAccionesFormularioEvaluacionEmpleado);
		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEvaluacionEmpleado.add(this.jComboBoxTiposAccionesFormularioEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEvaluacionEmpleado.add(this.jCheckBoxPostAccionNuevoEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.evaluacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEvaluacionEmpleado.add(this.jCheckBoxPostAccionSinCerrarEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.evaluacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEvaluacionEmpleado.add(this.jCheckBoxPostAccionSinMensajeEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesEvaluacionEmpleado.add(this.jButtonModificarEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);							

		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;
		this.gridBagConstraintsEvaluacionEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesEvaluacionEmpleado.add(this.jButtonEliminarEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		
			
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesEvaluacionEmpleado.add(this.jButtonActualizarEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);


		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesEvaluacionEmpleado.add(this.jButtonGuardarCambiosEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);	
		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy = 0;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesEvaluacionEmpleado.add(this.jButtonCancelarEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEvaluacionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEvaluacionEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;		
			//this.gridBagConstraintsEvaluacionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEvaluacionEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionEmpleado.gridx =0;
		this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEvaluacionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EvaluacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEvaluacionEmpleado = new EvaluacionEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Evaluacion Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Evaluacion Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Evaluacion Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EvaluacionEmpleadoModel evaluacionempleadoModel=new EvaluacionEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//EvaluacionEmpleadoModel.EvaluacionEmpleadoFocusTraversalPolicy evaluacionempleadoFocusTraversalPolicy = evaluacionempleadoModel.new EvaluacionEmpleadoFocusTraversalPolicy(this);
			
			//evaluacionempleadoFocusTraversalPolicy.setevaluacionempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(evaluacionempleadoModel);
			
			
			this.jContentPaneDetalleEvaluacionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEvaluacionEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleEvaluacionEmpleado.setLayout(gridaBagLayoutDetalleEvaluacionEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEvaluacionEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleEvaluacionEmpleado.add(jTtoolBarDetalleEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionEvaluacionEmpleado=   new JScrollPane(jContentPaneDetalleEvaluacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEvaluacionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleEvaluacionEmpleado.add(jPanelCamposEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);
			
			
			
			
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
						&& evaluacionempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCalificacionEmpleado(this.puedeCargarPorParteCalificacionEmpleado,false,-1);
					
					if(this.evaluacionempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEvaluacionEmpleado= new GridBagConstraints();
						this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
						this.jContentPaneDetalleEvaluacionEmpleado.add(this.jTabbedPaneRelacionesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEvaluacionEmpleado.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCalificacionEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEvaluacionEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
					this.gridBagConstraintsEvaluacionEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleEvaluacionEmpleado.add(jPanelCamposOcultosEvaluacionEmpleado, gridBagConstraintsEvaluacionEmpleado);
				
					this.jPanelCamposOcultosEvaluacionEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	        this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEvaluacionEmpleado.add(this.jPanelAccionesFormularioEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);							
			
			
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleEvaluacionEmpleado.add(this.jPanelAccionesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEvaluacionEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEvaluacionEmpleado=   new JScrollPane(this.jPanelCamposEvaluacionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEvaluacionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEvaluacionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
			this.gridBagConstraintsEvaluacionEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEvaluacionEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEvaluacionEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);			
			
			this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
			
			
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		
			
		this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEvaluacionEmpleado, this.gridBagConstraintsEvaluacionEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEvaluacionEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionEvaluacionEmpleado;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCalificacionEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
		this.calificacionempleadoSessionBean.setConGuardarRelaciones(false);
		this.calificacionempleadoSessionBean.setEsGuardarRelacionado(true);

		this.calificacionempleadoBeanSwingJInternalFrame=null;//new CalificacionEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.calificacionempleadoBeanSwingJInternalFramePopup=new CalificacionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.calificacionempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {

				CalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=EvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CalificacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.calificacionempleadoSessionBean.setEsGuardarRelacionado(true);

				this.calificacionempleadoBeanSwingJInternalFrame=new CalificacionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.calificacionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.calificacionempleadoBeanSwingJInternalFrame.setcalificacionempleadoSessionBean(this.calificacionempleadoSessionBean);

				//this.gridBagConstraintsEvaluacionEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEvaluacionEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEvaluacionEmpleado.gridx = 0;
				//this.jContentPaneDetalleEvaluacionEmpleado.add(this.calificacionempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEvaluacionEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEvaluacionEmpleado.add("Calificacion Empleados",this.calificacionempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEvaluacionEmpleado.setComponentAt(iIndexTab,this.calificacionempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.calificacionempleadoSessionBean.setEsGuardarRelacionado(false);
				this.calificacionempleadoBeanSwingJInternalFrame=null;//new CalificacionEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCalificacionEmpleado) {
					this.jTabbedPaneRelacionesEvaluacionEmpleado.add("Calificacion Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCalificacionEmpleadoBeanSwingJInternalFrame(List<EvaluacionEmpleado> evaluacionempleados,EvaluacionEmpleado evaluacionempleado,CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//calificacionempleadoBeanSwingJInternalFrame=new CalificacionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					calificacionempleadoBeanSwingJInternalFrame.getCalificacionEmpleadoLogic().setConnexion(this.evaluacionempleadoLogic.getConnexion());

					calificacionempleadoBeanSwingJInternalFrame.setevaluacionempleadosForeignKey(evaluacionempleados);
					calificacionempleadoBeanSwingJInternalFrame.setevaluacionempleadoForeignKey(evaluacionempleado);
					calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionEvaluacionEmpleado(true);
					calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setlidEvaluacionEmpleadoActual(evaluacionempleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					calificacionempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyCalificacionEmpleado(calificacionempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					calificacionempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEvaluacionEmpleado(true);
					calificacionempleadoBeanSwingJInternalFrame.setid_evaluacion_empleadoFK_IdEvaluacionEmpleado(evaluacionempleado.getId());

					if(!this.conCargarFormDetalle) {
						calificacionempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					calificacionempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameEvaluacionEmpleadoForeignKey(evaluacionempleado,1,false,true,true);
					calificacionempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					calificacionempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEvaluacionEmpleado");
					calificacionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEvaluacionEmpleado");
					calificacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCalificacionEmpleado(true);
					calificacionempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCalificacionEmpleado("n",calificacionempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, calificacionempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					calificacionempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					calificacionempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						calificacionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsCalificacionEmpleado("relacionado");
					} else {
						calificacionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsCalificacionEmpleado("no_relacionado");
					}

					calificacionempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionCalificacionEmpleado().setVisible(false);

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
