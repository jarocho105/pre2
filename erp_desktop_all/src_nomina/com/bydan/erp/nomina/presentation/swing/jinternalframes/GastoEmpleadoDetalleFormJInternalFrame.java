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
import com.bydan.erp.nomina.util.GastoEmpleadoConstantesFunciones;

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
public class GastoEmpleadoDetalleFormJInternalFrame extends GastoEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleGastoEmpleado;
	
	protected JMenuBar jmenuBarDetalleGastoEmpleado;
	
	protected JMenu jmenuDetalleGastoEmpleado;
	protected JMenu jmenuDetalleArchivoGastoEmpleado;
	protected JMenu jmenuDetalleAccionesGastoEmpleado;
	protected JMenu jmenuDetalleDatosGastoEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGastoEmpleado;	
	protected GridBagConstraints gridBagConstraintsGastoEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected GastoEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleGastoEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected EstadoGastoEmpleadoBeanSwingJInternalFrame estadogastoempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadogastoempleado="";
	
	public GastoEmpleadoSessionBean gastoempleadoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public EstadoGastoEmpleadoSessionBean estadogastoempleadoSessionBean;	
	
	public GastoEmpleadoLogic gastoempleadoLogic;
	
	public JScrollPane jScrollPanelDatosGastoEmpleado;
	public JScrollPane jScrollPanelDatosEdicionGastoEmpleado;
	public JScrollPane jScrollPanelDatosGeneralGastoEmpleado;
	
	protected JPanel jPanelCamposGastoEmpleado;    
	protected JPanel jPanelCamposOcultosGastoEmpleado;    	
	protected JPanel jPanelAccionesGastoEmpleado;
	protected JPanel jPanelAccionesFormularioGastoEmpleado;
    
	
	
	protected Integer iXPanelCamposGastoEmpleado=0;
	protected Integer iYPanelCamposGastoEmpleado=0;
	
	protected Integer iXPanelCamposOcultosGastoEmpleado=0;
	protected Integer iYPanelCamposOcultosGastoEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoGastoEmpleado;
	public JButton jButtonModificarGastoEmpleado;
	public JButton jButtonActualizarGastoEmpleado;
    public JButton jButtonEliminarGastoEmpleado;
	public JButton jButtonCancelarGastoEmpleado;
    public JButton jButtonGuardarCambiosGastoEmpleado;
	public JButton jButtonGuardarCambiosTablaGastoEmpleado;
	protected JButton jButtonCerrarGastoEmpleado;
	
	
	protected JButton jButtonProcesarInformacionGastoEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoGastoEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarGastoEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeGastoEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGastoEmpleado;
	protected JButton jButtonModificarToolBarGastoEmpleado;
	protected JButton jButtonActualizarToolBarGastoEmpleado;
    protected JButton jButtonEliminarToolBarGastoEmpleado;
	protected JButton jButtonCancelarToolBarGastoEmpleado;
    protected JButton jButtonGuardarCambiosToolBarGastoEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarGastoEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarGastoEmpleado;
	protected JButton jButtonCerrarToolBarGastoEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarGastoEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGastoEmpleado;
	protected JMenuItem jMenuItemModificarGastoEmpleado;
	protected JMenuItem jMenuItemActualizarGastoEmpleado;
    protected JMenuItem jMenuItemEliminarGastoEmpleado;
	protected JMenuItem jMenuItemCancelarGastoEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosGastoEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaGastoEmpleado;
	protected JMenuItem jMenuItemCerrarGastoEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarGastoEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarGastoEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionGastoEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGastoEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarGastoEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGastoEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGastoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGastoEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioGastoEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidGastoEmpleado;
	public JLabel jLabelIdGastoEmpleado;
	public JLabel jLabelidGastoEmpleado;
	public JButton jButtonidGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPaneldiaGastoEmpleado;
	public JLabel jLabeldiaGastoEmpleado;
	public JTextField jTextFielddiaGastoEmpleado;
	public JButton jButtondiaGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ingreso_actualGastoEmpleado;
	public JLabel jLabeltotal_ingreso_actualGastoEmpleado;
	public JTextField jTextFieldtotal_ingreso_actualGastoEmpleado;
	public JButton jButtontotal_ingreso_actualGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ingreso_otroGastoEmpleado;
	public JLabel jLabeltotal_ingreso_otroGastoEmpleado;
	public JTextField jTextFieldtotal_ingreso_otroGastoEmpleado;
	public JButton jButtontotal_ingreso_otroGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ingresoGastoEmpleado;
	public JLabel jLabeltotal_ingresoGastoEmpleado;
	public JTextField jTextFieldtotal_ingresoGastoEmpleado;
	public JButton jButtontotal_ingresoGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelgasto_viviendaGastoEmpleado;
	public JLabel jLabelgasto_viviendaGastoEmpleado;
	public JTextField jTextFieldgasto_viviendaGastoEmpleado;
	public JButton jButtongasto_viviendaGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelgasto_educacionGastoEmpleado;
	public JLabel jLabelgasto_educacionGastoEmpleado;
	public JTextField jTextFieldgasto_educacionGastoEmpleado;
	public JButton jButtongasto_educacionGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelgasto_saludGastoEmpleado;
	public JLabel jLabelgasto_saludGastoEmpleado;
	public JTextField jTextFieldgasto_saludGastoEmpleado;
	public JButton jButtongasto_saludGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelgasto_vestimentaGastoEmpleado;
	public JLabel jLabelgasto_vestimentaGastoEmpleado;
	public JTextField jTextFieldgasto_vestimentaGastoEmpleado;
	public JButton jButtongasto_vestimentaGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelgasto_alimentacionGastoEmpleado;
	public JLabel jLabelgasto_alimentacionGastoEmpleado;
	public JTextField jTextFieldgasto_alimentacionGastoEmpleado;
	public JButton jButtongasto_alimentacionGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPaneltotal_gasto_actualGastoEmpleado;
	public JLabel jLabeltotal_gasto_actualGastoEmpleado;
	public JTextField jTextFieldtotal_gasto_actualGastoEmpleado;
	public JButton jButtontotal_gasto_actualGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPaneltotal_gastoGastoEmpleado;
	public JLabel jLabeltotal_gastoGastoEmpleado;
	public JTextField jTextFieldtotal_gastoGastoEmpleado;
	public JButton jButtontotal_gastoGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelfechaGastoEmpleado;
	public JLabel jLabelfechaGastoEmpleado;
	//public JFormattedTextField jDateChooserfechaGastoEmpleado;

	public JDateChooser jDateChooserfechaGastoEmpleado;
	public JButton jButtonfechaGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeGastoEmpleado;
	public JLabel jLabelporcentajeGastoEmpleado;
	public JTextField jTextFieldporcentajeGastoEmpleado;
	public JButton jButtonporcentajeGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_maximoGastoEmpleado;
	public JLabel jLabelvalor_maximoGastoEmpleado;
	public JTextField jTextFieldvalor_maximoGastoEmpleado;
	public JButton jButtonvalor_maximoGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_maximo_porcentajeGastoEmpleado;
	public JLabel jLabelvalor_maximo_porcentajeGastoEmpleado;
	public JTextField jTextFieldvalor_maximo_porcentajeGastoEmpleado;
	public JButton jButtonvalor_maximo_porcentajeGastoEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaGastoEmpleado;
	public JLabel jLabelid_empresaGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaGastoEmpleado;
	public JButton jButtonid_empresaGastoEmpleado= new JButtonMe();
	public JButton jButtonid_empresaGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empresaGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalGastoEmpleado;
	public JLabel jLabelid_sucursalGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalGastoEmpleado;
	public JButton jButtonid_sucursalGastoEmpleado= new JButtonMe();
	public JButton jButtonid_sucursalGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoGastoEmpleado;
	public JLabel jLabelid_empleadoGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoGastoEmpleado;
	public JButton jButtonid_empleadoGastoEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioGastoEmpleado;
	public JLabel jLabelid_ejercicioGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioGastoEmpleado;
	public JButton jButtonid_ejercicioGastoEmpleado= new JButtonMe();
	public JButton jButtonid_ejercicioGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_paisGastoEmpleado;
	public JLabel jLabelid_paisGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisGastoEmpleado;
	public JButton jButtonid_paisGastoEmpleado= new JButtonMe();
	public JButton jButtonid_paisGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_paisGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadGastoEmpleado;
	public JLabel jLabelid_ciudadGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadGastoEmpleado;
	public JButton jButtonid_ciudadGastoEmpleado= new JButtonMe();
	public JButton jButtonid_ciudadGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_ciudadGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioGastoEmpleado;
	public JLabel jLabelid_anioGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioGastoEmpleado;
	public JButton jButtonid_anioGastoEmpleado= new JButtonMe();
	public JButton jButtonid_anioGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_anioGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesGastoEmpleado;
	public JLabel jLabelid_mesGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesGastoEmpleado;
	public JButton jButtonid_mesGastoEmpleado= new JButtonMe();
	public JButton jButtonid_mesGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_mesGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioGastoEmpleado;
	public JLabel jLabelid_usuarioGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioGastoEmpleado;
	public JButton jButtonid_usuarioGastoEmpleado= new JButtonMe();
	public JButton jButtonid_usuarioGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_usuarioGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_gasto_empleadoGastoEmpleado;
	public JLabel jLabelid_estado_gasto_empleadoGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_gasto_empleadoGastoEmpleado;
	public JButton jButtonid_estado_gasto_empleadoGastoEmpleado= new JButtonMe();
	public JButton jButtonid_estado_gasto_empleadoGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estado_gasto_empleadoGastoEmpleadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesGastoEmpleado;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public GastoEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposGastoEmpleado=new JPanel();
				this.jPanelAccionesFormularioGastoEmpleado=new JPanel();
				this.jmenuBarDetalleGastoEmpleado=new JMenuBar();
				this.jTtoolBarDetalleGastoEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("GastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public GastoEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("GastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarGastoEmpleado() {
		return this.jButtonActualizarToolBarGastoEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarGastoEmpleado() {
		return this.jButtonEliminarToolBarGastoEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarGastoEmpleado() {
		return this.jButtonCancelarToolBarGastoEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionGastoEmpleado() {
		return this.jButtonProcesarInformacionGastoEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGastoEmpleado)	{
		this.jButtonProcesarInformacionGastoEmpleado = jButtonProcesarInformacionGastoEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGastoEmpleado() {
		return this.jComboBoxTiposAccionesGastoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGastoEmpleado(
			JComboBox jComboBoxTiposRelacionesGastoEmpleado) {
		this.jComboBoxTiposRelacionesGastoEmpleado = jComboBoxTiposRelacionesGastoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGastoEmpleado(
			JComboBox jComboBoxTiposAccionesGastoEmpleado) {
		this.jComboBoxTiposAccionesGastoEmpleado = jComboBoxTiposAccionesGastoEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioGastoEmpleado() {
		return this.jComboBoxTiposAccionesFormularioGastoEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioGastoEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioGastoEmpleado) {
		this.jComboBoxTiposAccionesFormularioGastoEmpleado = jComboBoxTiposAccionesFormularioGastoEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.gastoempleadoSessionBean=new GastoEmpleadoSessionBean();
		
		this.gastoempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.gastoempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.gastoempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GastoEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Gasto Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 2350) {
			iWidth=2350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		GastoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGastoEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarGastoEmpleado=new JButtonMe();
				this.jButtonModificarToolBarGastoEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarGastoEmpleado,this.jTtoolBarDetalleGastoEmpleado,
							"actualizar","actualizar","Actualizar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarGastoEmpleado,this.jTtoolBarDetalleGastoEmpleado,
							"eliminar","eliminar","Eliminar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarGastoEmpleado,this.jTtoolBarDetalleGastoEmpleado,
							"cancelar","cancelar","Cancelar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarGastoEmpleado,this.jTtoolBarDetalleGastoEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleGastoEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleGastoEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoGastoEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesGastoEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosGastoEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGastoEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGastoEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGastoEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarGastoEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarGastoEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarGastoEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarGastoEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarGastoEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarGastoEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarGastoEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarGastoEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarGastoEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarGastoEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarGastoEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarGastoEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosGastoEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGastoEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGastoEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGastoEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGastoEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGastoEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarGastoEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarGastoEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarGastoEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGastoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGastoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGastoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGastoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGastoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGastoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoGastoEmpleado.add(this.jMenuItemDetalleCerrarGastoEmpleado);
		
		this.jmenuDetalleAccionesGastoEmpleado.add(this.jMenuItemActualizarGastoEmpleado);
		this.jmenuDetalleAccionesGastoEmpleado.add(this.jMenuItemEliminarGastoEmpleado);
		this.jmenuDetalleAccionesGastoEmpleado.add(this.jMenuItemCancelarGastoEmpleado);		
		
		//this.jmenuDetalleDatosGastoEmpleado.add(this.jMenuItemDetalleAbrirOrderByGastoEmpleado);				
		this.jmenuDetalleDatosGastoEmpleado.add(this.jMenuItemDetalleMostarOcultarGastoEmpleado);				
				
		//this.jmenuDetalleAccionesGastoEmpleado.add(this.jMenuItemGuardarCambiosGastoEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleGastoEmpleado.add(this.jmenuDetalleArchivoGastoEmpleado);		
		this.jmenuBarDetalleGastoEmpleado.add(this.jmenuDetalleAccionesGastoEmpleado);		
		this.jmenuBarDetalleGastoEmpleado.add(this.jmenuDetalleDatosGastoEmpleado);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleGastoEmpleado);				
	}
	
	
	public void inicializarElementosCamposGastoEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdGastoEmpleado = new JLabelMe();
		jLabelIdGastoEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidGastoEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutGastoEmpleado= new GridBagLayout();

		this.jPanelidGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);

		jLabelidGastoEmpleado = new JLabel();
		jLabelidGastoEmpleado.setText("Id");

		jLabelidGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldiaGastoEmpleado = new JLabelMe();
		this.jLabeldiaGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_DIA+" : *");
		this.jLabeldiaGastoEmpleado.setToolTipText("Dia");
		this.jLabeldiaGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiaGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiaGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldiaGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldiaGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldiaGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_DIA);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPaneldiaGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jTextFielddiaGastoEmpleado= new JTextFieldMe();
		jTextFielddiaGastoEmpleado.setEnabled(false);
		jTextFielddiaGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiaGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiaGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddiaGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddiaGastoEmpleado.setText("0");

		this.jButtondiaGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtondiaGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiaGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiaGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondiaGastoEmpleadoBusqueda.setText("U");
		this.jButtondiaGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondiaGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondiaGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddiaGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddiaGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"diaGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondiaGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ingreso_actualGastoEmpleado = new JLabelMe();
		this.jLabeltotal_ingreso_actualGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_TOTALINGRESOACTUAL+" : *");
		this.jLabeltotal_ingreso_actualGastoEmpleado.setToolTipText("Total Ingreso Actual");
		this.jLabeltotal_ingreso_actualGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_ingreso_actualGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_ingreso_actualGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ingreso_actualGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ingreso_actualGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ingreso_actualGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_TOTALINGRESOACTUAL);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPaneltotal_ingreso_actualGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jTextFieldtotal_ingreso_actualGastoEmpleado= new JTextFieldMe();
		jTextFieldtotal_ingreso_actualGastoEmpleado.setEnabled(false);
		jTextFieldtotal_ingreso_actualGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ingreso_actualGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ingreso_actualGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ingreso_actualGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ingreso_actualGastoEmpleado.setText("0.0");

		this.jButtontotal_ingreso_actualGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtontotal_ingreso_actualGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ingreso_actualGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ingreso_actualGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ingreso_actualGastoEmpleadoBusqueda.setText("U");
		this.jButtontotal_ingreso_actualGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ingreso_actualGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ingreso_actualGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ingreso_actualGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ingreso_actualGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ingreso_actualGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ingreso_actualGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ingreso_otroGastoEmpleado = new JLabelMe();
		this.jLabeltotal_ingreso_otroGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_TOTALINGRESOOTRO+" : *");
		this.jLabeltotal_ingreso_otroGastoEmpleado.setToolTipText("Total Ingreso Otro");
		this.jLabeltotal_ingreso_otroGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_ingreso_otroGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_ingreso_otroGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ingreso_otroGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ingreso_otroGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ingreso_otroGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_TOTALINGRESOOTRO);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPaneltotal_ingreso_otroGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jTextFieldtotal_ingreso_otroGastoEmpleado= new JTextFieldMe();
		jTextFieldtotal_ingreso_otroGastoEmpleado.setEnabled(false);
		jTextFieldtotal_ingreso_otroGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ingreso_otroGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ingreso_otroGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ingreso_otroGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ingreso_otroGastoEmpleado.setText("0.0");

		this.jButtontotal_ingreso_otroGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtontotal_ingreso_otroGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ingreso_otroGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ingreso_otroGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ingreso_otroGastoEmpleadoBusqueda.setText("U");
		this.jButtontotal_ingreso_otroGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ingreso_otroGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ingreso_otroGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ingreso_otroGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ingreso_otroGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ingreso_otroGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ingreso_otroGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ingresoGastoEmpleado = new JLabelMe();
		this.jLabeltotal_ingresoGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_TOTALINGRESO+" : *");
		this.jLabeltotal_ingresoGastoEmpleado.setToolTipText("Total Ingreso");
		this.jLabeltotal_ingresoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ingresoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ingresoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ingresoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ingresoGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ingresoGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_TOTALINGRESO);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPaneltotal_ingresoGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jTextFieldtotal_ingresoGastoEmpleado= new JTextFieldMe();
		jTextFieldtotal_ingresoGastoEmpleado.setEnabled(false);
		jTextFieldtotal_ingresoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ingresoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ingresoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ingresoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ingresoGastoEmpleado.setText("0.0");

		this.jButtontotal_ingresoGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtontotal_ingresoGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ingresoGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ingresoGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ingresoGastoEmpleadoBusqueda.setText("U");
		this.jButtontotal_ingresoGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ingresoGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ingresoGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ingresoGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ingresoGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ingresoGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ingresoGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelgasto_viviendaGastoEmpleado = new JLabelMe();
		this.jLabelgasto_viviendaGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_GASTOVIVIENDA+" : *");
		this.jLabelgasto_viviendaGastoEmpleado.setToolTipText("Gasto Vivienda");
		this.jLabelgasto_viviendaGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgasto_viviendaGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgasto_viviendaGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgasto_viviendaGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgasto_viviendaGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgasto_viviendaGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_GASTOVIVIENDA);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelgasto_viviendaGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jTextFieldgasto_viviendaGastoEmpleado= new JTextFieldMe();
		jTextFieldgasto_viviendaGastoEmpleado.setEnabled(false);
		jTextFieldgasto_viviendaGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_viviendaGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_viviendaGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgasto_viviendaGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgasto_viviendaGastoEmpleado.setText("0.0");

		this.jButtongasto_viviendaGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtongasto_viviendaGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_viviendaGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_viviendaGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongasto_viviendaGastoEmpleadoBusqueda.setText("U");
		this.jButtongasto_viviendaGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongasto_viviendaGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongasto_viviendaGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgasto_viviendaGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgasto_viviendaGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gasto_viviendaGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongasto_viviendaGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelgasto_educacionGastoEmpleado = new JLabelMe();
		this.jLabelgasto_educacionGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_GASTOEDUCACION+" : *");
		this.jLabelgasto_educacionGastoEmpleado.setToolTipText("Gasto Educacion");
		this.jLabelgasto_educacionGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgasto_educacionGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgasto_educacionGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelgasto_educacionGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgasto_educacionGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgasto_educacionGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_GASTOEDUCACION);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelgasto_educacionGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jTextFieldgasto_educacionGastoEmpleado= new JTextFieldMe();
		jTextFieldgasto_educacionGastoEmpleado.setEnabled(false);
		jTextFieldgasto_educacionGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_educacionGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_educacionGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgasto_educacionGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgasto_educacionGastoEmpleado.setText("0.0");

		this.jButtongasto_educacionGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtongasto_educacionGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_educacionGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_educacionGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongasto_educacionGastoEmpleadoBusqueda.setText("U");
		this.jButtongasto_educacionGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongasto_educacionGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongasto_educacionGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgasto_educacionGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgasto_educacionGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gasto_educacionGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongasto_educacionGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelgasto_saludGastoEmpleado = new JLabelMe();
		this.jLabelgasto_saludGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_GASTOSALUD+" : *");
		this.jLabelgasto_saludGastoEmpleado.setToolTipText("Gasto Salud");
		this.jLabelgasto_saludGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgasto_saludGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgasto_saludGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgasto_saludGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgasto_saludGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgasto_saludGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_GASTOSALUD);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelgasto_saludGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jTextFieldgasto_saludGastoEmpleado= new JTextFieldMe();
		jTextFieldgasto_saludGastoEmpleado.setEnabled(false);
		jTextFieldgasto_saludGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_saludGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_saludGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgasto_saludGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgasto_saludGastoEmpleado.setText("0.0");

		this.jButtongasto_saludGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtongasto_saludGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_saludGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_saludGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongasto_saludGastoEmpleadoBusqueda.setText("U");
		this.jButtongasto_saludGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongasto_saludGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongasto_saludGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgasto_saludGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgasto_saludGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gasto_saludGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongasto_saludGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelgasto_vestimentaGastoEmpleado = new JLabelMe();
		this.jLabelgasto_vestimentaGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_GASTOVESTIMENTA+" : *");
		this.jLabelgasto_vestimentaGastoEmpleado.setToolTipText("Gasto Vestimenta");
		this.jLabelgasto_vestimentaGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgasto_vestimentaGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgasto_vestimentaGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelgasto_vestimentaGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgasto_vestimentaGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgasto_vestimentaGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_GASTOVESTIMENTA);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelgasto_vestimentaGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jTextFieldgasto_vestimentaGastoEmpleado= new JTextFieldMe();
		jTextFieldgasto_vestimentaGastoEmpleado.setEnabled(false);
		jTextFieldgasto_vestimentaGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_vestimentaGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_vestimentaGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgasto_vestimentaGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgasto_vestimentaGastoEmpleado.setText("0.0");

		this.jButtongasto_vestimentaGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtongasto_vestimentaGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_vestimentaGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_vestimentaGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongasto_vestimentaGastoEmpleadoBusqueda.setText("U");
		this.jButtongasto_vestimentaGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongasto_vestimentaGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongasto_vestimentaGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgasto_vestimentaGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgasto_vestimentaGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gasto_vestimentaGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongasto_vestimentaGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelgasto_alimentacionGastoEmpleado = new JLabelMe();
		this.jLabelgasto_alimentacionGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_GASTOALIMENTACION+" : *");
		this.jLabelgasto_alimentacionGastoEmpleado.setToolTipText("Gasto Alimentacion");
		this.jLabelgasto_alimentacionGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgasto_alimentacionGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelgasto_alimentacionGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelgasto_alimentacionGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgasto_alimentacionGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgasto_alimentacionGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_GASTOALIMENTACION);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelgasto_alimentacionGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jTextFieldgasto_alimentacionGastoEmpleado= new JTextFieldMe();
		jTextFieldgasto_alimentacionGastoEmpleado.setEnabled(false);
		jTextFieldgasto_alimentacionGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_alimentacionGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_alimentacionGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgasto_alimentacionGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgasto_alimentacionGastoEmpleado.setText("0.0");

		this.jButtongasto_alimentacionGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtongasto_alimentacionGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_alimentacionGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_alimentacionGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongasto_alimentacionGastoEmpleadoBusqueda.setText("U");
		this.jButtongasto_alimentacionGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongasto_alimentacionGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongasto_alimentacionGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgasto_alimentacionGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgasto_alimentacionGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gasto_alimentacionGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongasto_alimentacionGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabeltotal_gasto_actualGastoEmpleado = new JLabelMe();
		this.jLabeltotal_gasto_actualGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_TOTALGASTOACTUAL+" : *");
		this.jLabeltotal_gasto_actualGastoEmpleado.setToolTipText("Total Gasto Actual");
		this.jLabeltotal_gasto_actualGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_gasto_actualGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_gasto_actualGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_gasto_actualGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_gasto_actualGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_gasto_actualGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_TOTALGASTOACTUAL);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPaneltotal_gasto_actualGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jTextFieldtotal_gasto_actualGastoEmpleado= new JTextFieldMe();
		jTextFieldtotal_gasto_actualGastoEmpleado.setEnabled(false);
		jTextFieldtotal_gasto_actualGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_gasto_actualGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_gasto_actualGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_gasto_actualGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_gasto_actualGastoEmpleado.setText("0.0");

		this.jButtontotal_gasto_actualGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtontotal_gasto_actualGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_gasto_actualGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_gasto_actualGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_gasto_actualGastoEmpleadoBusqueda.setText("U");
		this.jButtontotal_gasto_actualGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_gasto_actualGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_gasto_actualGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_gasto_actualGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_gasto_actualGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_gasto_actualGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_gasto_actualGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabeltotal_gastoGastoEmpleado = new JLabelMe();
		this.jLabeltotal_gastoGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_TOTALGASTO+" : *");
		this.jLabeltotal_gastoGastoEmpleado.setToolTipText("Total Gasto");
		this.jLabeltotal_gastoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_gastoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_gastoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_gastoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_gastoGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_gastoGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_TOTALGASTO);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPaneltotal_gastoGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jTextFieldtotal_gastoGastoEmpleado= new JTextFieldMe();
		jTextFieldtotal_gastoGastoEmpleado.setEnabled(false);
		jTextFieldtotal_gastoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_gastoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_gastoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_gastoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_gastoGastoEmpleado.setText("0.0");

		this.jButtontotal_gastoGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtontotal_gastoGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_gastoGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_gastoGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_gastoGastoEmpleadoBusqueda.setText("U");
		this.jButtontotal_gastoGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_gastoGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_gastoGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_gastoGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_gastoGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_gastoGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_gastoGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelfechaGastoEmpleado = new JLabelMe();
		this.jLabelfechaGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaGastoEmpleado.setToolTipText("Fecha");
		this.jLabelfechaGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelfechaGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		//jFormattedTextFieldfechaGastoEmpleado= new JFormattedTextFieldMe();

		jDateChooserfechaGastoEmpleado= new JDateChooser();
		jDateChooserfechaGastoEmpleado.setEnabled(false);
		jDateChooserfechaGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaGastoEmpleado.setDate(new Date());
		jDateChooserfechaGastoEmpleado.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaGastoEmpleado.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonfechaGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaGastoEmpleadoBusqueda.setText("U");
		this.jButtonfechaGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeGastoEmpleado = new JLabelMe();
		this.jLabelporcentajeGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeGastoEmpleado.setToolTipText("Porcentaje");
		this.jLabelporcentajeGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelporcentajeGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jTextFieldporcentajeGastoEmpleado= new JTextFieldMe();
		jTextFieldporcentajeGastoEmpleado.setEnabled(false);
		jTextFieldporcentajeGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeGastoEmpleado.setText("0.0");

		this.jButtonporcentajeGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonporcentajeGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeGastoEmpleadoBusqueda.setText("U");
		this.jButtonporcentajeGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_maximoGastoEmpleado = new JLabelMe();
		this.jLabelvalor_maximoGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_VALORMAXIMO+" : *");
		this.jLabelvalor_maximoGastoEmpleado.setToolTipText("Valor Maximo");
		this.jLabelvalor_maximoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_maximoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_maximoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_maximoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_maximoGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_maximoGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_VALORMAXIMO);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelvalor_maximoGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jTextFieldvalor_maximoGastoEmpleado= new JTextFieldMe();
		jTextFieldvalor_maximoGastoEmpleado.setEnabled(false);
		jTextFieldvalor_maximoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_maximoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_maximoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_maximoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_maximoGastoEmpleado.setText("0.0");

		this.jButtonvalor_maximoGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor_maximoGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_maximoGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_maximoGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_maximoGastoEmpleadoBusqueda.setText("U");
		this.jButtonvalor_maximoGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_maximoGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_maximoGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_maximoGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_maximoGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_maximoGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_maximoGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_maximo_porcentajeGastoEmpleado = new JLabelMe();
		this.jLabelvalor_maximo_porcentajeGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_VALORMAXIMOPORCENTAJE+" : *");
		this.jLabelvalor_maximo_porcentajeGastoEmpleado.setToolTipText("Valor Maximo Porcentaje");
		this.jLabelvalor_maximo_porcentajeGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelvalor_maximo_porcentajeGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelvalor_maximo_porcentajeGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_maximo_porcentajeGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_maximo_porcentajeGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_maximo_porcentajeGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_VALORMAXIMOPORCENTAJE);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelvalor_maximo_porcentajeGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jTextFieldvalor_maximo_porcentajeGastoEmpleado= new JTextFieldMe();
		jTextFieldvalor_maximo_porcentajeGastoEmpleado.setEnabled(false);
		jTextFieldvalor_maximo_porcentajeGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_maximo_porcentajeGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_maximo_porcentajeGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_maximo_porcentajeGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_maximo_porcentajeGastoEmpleado.setText("0.0");

		this.jButtonvalor_maximo_porcentajeGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor_maximo_porcentajeGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_maximo_porcentajeGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_maximo_porcentajeGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_maximo_porcentajeGastoEmpleadoBusqueda.setText("U");
		this.jButtonvalor_maximo_porcentajeGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_maximo_porcentajeGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_maximo_porcentajeGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_maximo_porcentajeGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_maximo_porcentajeGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_maximo_porcentajeGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_maximo_porcentajeGastoEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysGastoEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaGastoEmpleado = new JLabelMe();
		this.jLabelid_empresaGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaGastoEmpleado.setToolTipText("Empresa");
		this.jLabelid_empresaGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelid_empresaGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jComboBoxid_empresaGastoEmpleado= new JComboBoxMe();
		jComboBoxid_empresaGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaGastoEmpleado.setEnabled(false);

		this.jButtonid_empresaGastoEmpleado= new JButtonMe();
		this.jButtonid_empresaGastoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGastoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGastoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGastoEmpleado.setText("Buscar");
		this.jButtonid_empresaGastoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaGastoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGastoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGastoEmpleado"));

		this.jButtonid_empresaGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empresaGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGastoEmpleadoBusqueda.setText("U");
		this.jButtonid_empresaGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaGastoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empresaGastoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empresaGastoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGastoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGastoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGastoEmpleadoUpdate.setText("U");
		this.jButtonid_empresaGastoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaGastoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGastoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGastoEmpleadoUpdate"));



					
		this.jLabelid_sucursalGastoEmpleado = new JLabelMe();
		this.jLabelid_sucursalGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalGastoEmpleado.setToolTipText("Sucursal");
		this.jLabelid_sucursalGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelid_sucursalGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jComboBoxid_sucursalGastoEmpleado= new JComboBoxMe();
		jComboBoxid_sucursalGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalGastoEmpleado.setEnabled(false);

		this.jButtonid_sucursalGastoEmpleado= new JButtonMe();
		this.jButtonid_sucursalGastoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGastoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGastoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGastoEmpleado.setText("Buscar");
		this.jButtonid_sucursalGastoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalGastoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGastoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGastoEmpleado"));

		this.jButtonid_sucursalGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_sucursalGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalGastoEmpleadoBusqueda.setText("U");
		this.jButtonid_sucursalGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalGastoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalGastoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_sucursalGastoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGastoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGastoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalGastoEmpleadoUpdate.setText("U");
		this.jButtonid_sucursalGastoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalGastoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGastoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGastoEmpleadoUpdate"));



					
		this.jLabelid_empleadoGastoEmpleado = new JLabelMe();
		this.jLabelid_empleadoGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoGastoEmpleado.setToolTipText("Empleado");
		this.jLabelid_empleadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelid_empleadoGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jComboBoxid_empleadoGastoEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoGastoEmpleado= new JButtonMe();
		this.jButtonid_empleadoGastoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoGastoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoGastoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoGastoEmpleado.setText("Buscar");
		this.jButtonid_empleadoGastoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoGastoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoGastoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoGastoEmpleado"));

		this.jButtonid_empleadoGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empleadoGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoGastoEmpleadoBusqueda.setText("U");
		this.jButtonid_empleadoGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoGastoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoGastoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empleadoGastoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoGastoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoGastoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoGastoEmpleadoUpdate.setText("U");
		this.jButtonid_empleadoGastoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoGastoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoGastoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoGastoEmpleadoUpdate"));



					
		this.jLabelid_ejercicioGastoEmpleado = new JLabelMe();
		this.jLabelid_ejercicioGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioGastoEmpleado.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelid_ejercicioGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jComboBoxid_ejercicioGastoEmpleado= new JComboBoxMe();
		jComboBoxid_ejercicioGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioGastoEmpleado.setEnabled(false);

		this.jButtonid_ejercicioGastoEmpleado= new JButtonMe();
		this.jButtonid_ejercicioGastoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioGastoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioGastoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioGastoEmpleado.setText("Buscar");
		this.jButtonid_ejercicioGastoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioGastoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioGastoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioGastoEmpleado"));

		this.jButtonid_ejercicioGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioGastoEmpleadoBusqueda.setText("U");
		this.jButtonid_ejercicioGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioGastoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioGastoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_ejercicioGastoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioGastoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioGastoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioGastoEmpleadoUpdate.setText("U");
		this.jButtonid_ejercicioGastoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioGastoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioGastoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioGastoEmpleadoUpdate"));



					
		this.jLabelid_paisGastoEmpleado = new JLabelMe();
		this.jLabelid_paisGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisGastoEmpleado.setToolTipText("Pais");
		this.jLabelid_paisGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelid_paisGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jComboBoxid_paisGastoEmpleado= new JComboBoxMe();
		jComboBoxid_paisGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisGastoEmpleado= new JButtonMe();
		this.jButtonid_paisGastoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisGastoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisGastoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisGastoEmpleado.setText("Buscar");
		this.jButtonid_paisGastoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisGastoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisGastoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisGastoEmpleado"));

		this.jButtonid_paisGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_paisGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisGastoEmpleadoBusqueda.setText("U");
		this.jButtonid_paisGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisGastoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_paisGastoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_paisGastoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisGastoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisGastoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisGastoEmpleadoUpdate.setText("U");
		this.jButtonid_paisGastoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisGastoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisGastoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisGastoEmpleadoUpdate"));



					
		this.jLabelid_ciudadGastoEmpleado = new JLabelMe();
		this.jLabelid_ciudadGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadGastoEmpleado.setToolTipText("Ciudad");
		this.jLabelid_ciudadGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelid_ciudadGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jComboBoxid_ciudadGastoEmpleado= new JComboBoxMe();
		jComboBoxid_ciudadGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadGastoEmpleado= new JButtonMe();
		this.jButtonid_ciudadGastoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadGastoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadGastoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadGastoEmpleado.setText("Buscar");
		this.jButtonid_ciudadGastoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadGastoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadGastoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadGastoEmpleado"));

		this.jButtonid_ciudadGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_ciudadGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadGastoEmpleadoBusqueda.setText("U");
		this.jButtonid_ciudadGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadGastoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_ciudadGastoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_ciudadGastoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadGastoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadGastoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadGastoEmpleadoUpdate.setText("U");
		this.jButtonid_ciudadGastoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadGastoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadGastoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadGastoEmpleadoUpdate"));



					
		this.jLabelid_anioGastoEmpleado = new JLabelMe();
		this.jLabelid_anioGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioGastoEmpleado.setToolTipText("Anio");
		this.jLabelid_anioGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelid_anioGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jComboBoxid_anioGastoEmpleado= new JComboBoxMe();
		jComboBoxid_anioGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioGastoEmpleado= new JButtonMe();
		this.jButtonid_anioGastoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioGastoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioGastoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioGastoEmpleado.setText("Buscar");
		this.jButtonid_anioGastoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioGastoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioGastoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioGastoEmpleado"));

		this.jButtonid_anioGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_anioGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioGastoEmpleadoBusqueda.setText("U");
		this.jButtonid_anioGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioGastoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_anioGastoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_anioGastoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioGastoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioGastoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioGastoEmpleadoUpdate.setText("U");
		this.jButtonid_anioGastoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioGastoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioGastoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioGastoEmpleadoUpdate"));



					
		this.jLabelid_mesGastoEmpleado = new JLabelMe();
		this.jLabelid_mesGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesGastoEmpleado.setToolTipText("Mes");
		this.jLabelid_mesGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelid_mesGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jComboBoxid_mesGastoEmpleado= new JComboBoxMe();
		jComboBoxid_mesGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesGastoEmpleado= new JButtonMe();
		this.jButtonid_mesGastoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesGastoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesGastoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesGastoEmpleado.setText("Buscar");
		this.jButtonid_mesGastoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesGastoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesGastoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesGastoEmpleado"));

		this.jButtonid_mesGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_mesGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesGastoEmpleadoBusqueda.setText("U");
		this.jButtonid_mesGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesGastoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_mesGastoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_mesGastoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesGastoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesGastoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesGastoEmpleadoUpdate.setText("U");
		this.jButtonid_mesGastoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesGastoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesGastoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesGastoEmpleadoUpdate"));



					
		this.jLabelid_usuarioGastoEmpleado = new JLabelMe();
		this.jLabelid_usuarioGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioGastoEmpleado.setToolTipText("Usuario");
		this.jLabelid_usuarioGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelid_usuarioGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jComboBoxid_usuarioGastoEmpleado= new JComboBoxMe();
		jComboBoxid_usuarioGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioGastoEmpleado.setEnabled(false);

		this.jButtonid_usuarioGastoEmpleado= new JButtonMe();
		this.jButtonid_usuarioGastoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioGastoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioGastoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioGastoEmpleado.setText("Buscar");
		this.jButtonid_usuarioGastoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioGastoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioGastoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioGastoEmpleado"));

		this.jButtonid_usuarioGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_usuarioGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioGastoEmpleadoBusqueda.setText("U");
		this.jButtonid_usuarioGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioGastoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_usuarioGastoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_usuarioGastoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioGastoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioGastoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioGastoEmpleadoUpdate.setText("U");
		this.jButtonid_usuarioGastoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioGastoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioGastoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioGastoEmpleadoUpdate"));



					
		this.jLabelid_estado_gasto_empleadoGastoEmpleado = new JLabelMe();
		this.jLabelid_estado_gasto_empleadoGastoEmpleado.setText(""+GastoEmpleadoConstantesFunciones.LABEL_IDESTADOGASTOEMPLEADO+" : *");
		this.jLabelid_estado_gasto_empleadoGastoEmpleado.setToolTipText("Estado Gasto Empleado");
		this.jLabelid_estado_gasto_empleadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_gasto_empleadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_gasto_empleadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_gasto_empleadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_gasto_empleadoGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_gasto_empleadoGastoEmpleado.setToolTipText(GastoEmpleadoConstantesFunciones.LABEL_IDESTADOGASTOEMPLEADO);
		this.gridaBagLayoutGastoEmpleado = new GridBagLayout();
		this.jPanelid_estado_gasto_empleadoGastoEmpleado.setLayout(this.gridaBagLayoutGastoEmpleado);


		jComboBoxid_estado_gasto_empleadoGastoEmpleado= new JComboBoxMe();
		jComboBoxid_estado_gasto_empleadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_gasto_empleadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_gasto_empleadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_gasto_empleadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_gasto_empleadoGastoEmpleado= new JButtonMe();
		this.jButtonid_estado_gasto_empleadoGastoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_gasto_empleadoGastoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_gasto_empleadoGastoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_gasto_empleadoGastoEmpleado.setText("Buscar");
		this.jButtonid_estado_gasto_empleadoGastoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_gasto_empleadoGastoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_gasto_empleadoGastoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_gasto_empleadoGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_gasto_empleadoGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_gasto_empleadoGastoEmpleado"));

		this.jButtonid_estado_gasto_empleadoGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_estado_gasto_empleadoGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_gasto_empleadoGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_gasto_empleadoGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_gasto_empleadoGastoEmpleadoBusqueda.setText("U");
		this.jButtonid_estado_gasto_empleadoGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_gasto_empleadoGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_gasto_empleadoGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_gasto_empleadoGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_gasto_empleadoGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_gasto_empleadoGastoEmpleadoBusqueda"));

		if(this.gastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_gasto_empleadoGastoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_estado_gasto_empleadoGastoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_estado_gasto_empleadoGastoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_gasto_empleadoGastoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_gasto_empleadoGastoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_gasto_empleadoGastoEmpleadoUpdate.setText("U");
		this.jButtonid_estado_gasto_empleadoGastoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_gasto_empleadoGastoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_gasto_empleadoGastoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_gasto_empleadoGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_gasto_empleadoGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_gasto_empleadoGastoEmpleadoUpdate"));



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
		//this.jInternalFrameDetalleGastoEmpleado = new GastoEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Gasto Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGastoEmpleado= new GridBagLayout();
		

		
		String sToolTipGastoEmpleado="";
		sToolTipGastoEmpleado=GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGastoEmpleado+="(Nomina.GastoEmpleado)";
		}
		
		if(!this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipGastoEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoGastoEmpleado = new JButtonMe();
		this.jButtonModificarGastoEmpleado = new JButtonMe();
        this.jButtonActualizarGastoEmpleado = new JButtonMe();
        this.jButtonEliminarGastoEmpleado = new JButtonMe();
        this.jButtonCancelarGastoEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosGastoEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaGastoEmpleado = new JButtonMe();
		this.jButtonCerrarGastoEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosGastoEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionGastoEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralGastoEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Gasto Empleado";
		
		if(!this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosGastoEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposGastoEmpleado.setName("jPanelCamposGastoEmpleado"); 

		this.jPanelCamposOcultosGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosGastoEmpleado.setName("jPanelCamposOcultosGastoEmpleado"); 

        this.jPanelAccionesGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGastoEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesGastoEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioGastoEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioGastoEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoGastoEmpleado.setText("Nuevo");
		this.jButtonModificarGastoEmpleado.setText("Editar");
        this.jButtonActualizarGastoEmpleado.setText("Actualizar");
        this.jButtonEliminarGastoEmpleado.setText("Eliminar");
        this.jButtonCancelarGastoEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosGastoEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaGastoEmpleado.setText("Guardar");
		this.jButtonCerrarGastoEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGastoEmpleado,"nuevo_button","Nuevo",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarGastoEmpleado,"modificar_button","Editar",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarGastoEmpleado,"actualizar_button","Actualizar",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarGastoEmpleado,"eliminar_button","Eliminar",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarGastoEmpleado,"cancelar_button","Cancelar",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosGastoEmpleado,"guardarcambios_button","Guardar",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGastoEmpleado,"guardarcambiostabla_button","Guardar",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGastoEmpleado,"cerrar_button","Salir",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoGastoEmpleado.setToolTipText("Nuevo"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarGastoEmpleado.setToolTipText("Editar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarGastoEmpleado.setToolTipText("Actualizar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarGastoEmpleado.setToolTipText("Eliminar)"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarGastoEmpleado.setToolTipText("Cancelar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosGastoEmpleado.setToolTipText("Guardar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaGastoEmpleado.setToolTipText("Guardar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGastoEmpleado.setToolTipText("Salir"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGastoEmpleado";
		inputMap = this.jButtonNuevoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGastoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGastoEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarGastoEmpleado";
		inputMap = this.jButtonActualizarGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarGastoEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarGastoEmpleado";
		inputMap = this.jButtonEliminarGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarGastoEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarGastoEmpleado";
		inputMap = this.jButtonCancelarGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarGastoEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarGastoEmpleado";
		inputMap = this.jButtonCerrarGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGastoEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGastoEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGastoEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoGastoEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoGastoEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoGastoEmpleado.setToolTipText("Nuevo GastoEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarGastoEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarGastoEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarGastoEmpleado.setToolTipText("Sin Cerrar Ventana GastoEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeGastoEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeGastoEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeGastoEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGastoEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesGastoEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioGastoEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioGastoEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesGastoEmpleado = new JLabelMe();
		
		this.jLabelAccionesGastoEmpleado.setText("Acciones");		
		this.jLabelAccionesGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposGastoEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysGastoEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesGastoEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesGastoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGastoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGastoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioGastoEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGastoEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGastoEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposGastoEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosGastoEmpleado = new GridBagLayout();
		
		this.jPanelCamposGastoEmpleado.setLayout(gridaBagLayoutCamposGastoEmpleado);
		this.jPanelCamposOcultosGastoEmpleado.setLayout(gridaBagLayoutCamposOcultosGastoEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidGastoEmpleado.add(jLabelIdGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidGastoEmpleado.add(jLabelidGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaGastoEmpleado.add(jLabelid_empresaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGastoEmpleado.add(jButtonid_empresaGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 3;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGastoEmpleado.add(jButtonid_empresaGastoEmpleadoUpdate, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaGastoEmpleado.add(jComboBoxid_empresaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalGastoEmpleado.add(jLabelid_sucursalGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalGastoEmpleado.add(jButtonid_sucursalGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 3;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalGastoEmpleado.add(jButtonid_sucursalGastoEmpleadoUpdate, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalGastoEmpleado.add(jComboBoxid_sucursalGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoGastoEmpleado.add(jLabelid_empleadoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoGastoEmpleado.add(jButtonid_empleadoGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 3;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoGastoEmpleado.add(jButtonid_empleadoGastoEmpleadoUpdate, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoGastoEmpleado.add(jComboBoxid_empleadoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioGastoEmpleado.add(jLabelid_ejercicioGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioGastoEmpleado.add(jButtonid_ejercicioGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 3;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioGastoEmpleado.add(jButtonid_ejercicioGastoEmpleadoUpdate, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioGastoEmpleado.add(jComboBoxid_ejercicioGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisGastoEmpleado.add(jLabelid_paisGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisGastoEmpleado.add(jButtonid_paisGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 3;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisGastoEmpleado.add(jButtonid_paisGastoEmpleadoUpdate, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisGastoEmpleado.add(jComboBoxid_paisGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadGastoEmpleado.add(jLabelid_ciudadGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadGastoEmpleado.add(jButtonid_ciudadGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 3;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadGastoEmpleado.add(jButtonid_ciudadGastoEmpleadoUpdate, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadGastoEmpleado.add(jComboBoxid_ciudadGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioGastoEmpleado.add(jLabelid_anioGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioGastoEmpleado.add(jButtonid_anioGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 3;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioGastoEmpleado.add(jButtonid_anioGastoEmpleadoUpdate, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioGastoEmpleado.add(jComboBoxid_anioGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesGastoEmpleado.add(jLabelid_mesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesGastoEmpleado.add(jButtonid_mesGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 3;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesGastoEmpleado.add(jButtonid_mesGastoEmpleadoUpdate, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesGastoEmpleado.add(jComboBoxid_mesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldiaGastoEmpleado.add(jLabeldiaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPaneldiaGastoEmpleado.add(jButtondiaGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldiaGastoEmpleado.add(jTextFielddiaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioGastoEmpleado.add(jLabelid_usuarioGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioGastoEmpleado.add(jButtonid_usuarioGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 3;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioGastoEmpleado.add(jButtonid_usuarioGastoEmpleadoUpdate, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioGastoEmpleado.add(jComboBoxid_usuarioGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_gasto_empleadoGastoEmpleado.add(jLabelid_estado_gasto_empleadoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_gasto_empleadoGastoEmpleado.add(jButtonid_estado_gasto_empleadoGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 3;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_gasto_empleadoGastoEmpleado.add(jButtonid_estado_gasto_empleadoGastoEmpleadoUpdate, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_gasto_empleadoGastoEmpleado.add(jComboBoxid_estado_gasto_empleadoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ingreso_actualGastoEmpleado.add(jLabeltotal_ingreso_actualGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ingreso_actualGastoEmpleado.add(jButtontotal_ingreso_actualGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ingreso_actualGastoEmpleado.add(jTextFieldtotal_ingreso_actualGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ingreso_otroGastoEmpleado.add(jLabeltotal_ingreso_otroGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ingreso_otroGastoEmpleado.add(jButtontotal_ingreso_otroGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ingreso_otroGastoEmpleado.add(jTextFieldtotal_ingreso_otroGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ingresoGastoEmpleado.add(jLabeltotal_ingresoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ingresoGastoEmpleado.add(jButtontotal_ingresoGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ingresoGastoEmpleado.add(jTextFieldtotal_ingresoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgasto_viviendaGastoEmpleado.add(jLabelgasto_viviendaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelgasto_viviendaGastoEmpleado.add(jButtongasto_viviendaGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgasto_viviendaGastoEmpleado.add(jTextFieldgasto_viviendaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgasto_educacionGastoEmpleado.add(jLabelgasto_educacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelgasto_educacionGastoEmpleado.add(jButtongasto_educacionGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgasto_educacionGastoEmpleado.add(jTextFieldgasto_educacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgasto_saludGastoEmpleado.add(jLabelgasto_saludGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelgasto_saludGastoEmpleado.add(jButtongasto_saludGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgasto_saludGastoEmpleado.add(jTextFieldgasto_saludGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgasto_vestimentaGastoEmpleado.add(jLabelgasto_vestimentaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelgasto_vestimentaGastoEmpleado.add(jButtongasto_vestimentaGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgasto_vestimentaGastoEmpleado.add(jTextFieldgasto_vestimentaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgasto_alimentacionGastoEmpleado.add(jLabelgasto_alimentacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelgasto_alimentacionGastoEmpleado.add(jButtongasto_alimentacionGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgasto_alimentacionGastoEmpleado.add(jTextFieldgasto_alimentacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_gasto_actualGastoEmpleado.add(jLabeltotal_gasto_actualGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_gasto_actualGastoEmpleado.add(jButtontotal_gasto_actualGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_gasto_actualGastoEmpleado.add(jTextFieldtotal_gasto_actualGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_gastoGastoEmpleado.add(jLabeltotal_gastoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_gastoGastoEmpleado.add(jButtontotal_gastoGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_gastoGastoEmpleado.add(jTextFieldtotal_gastoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaGastoEmpleado.add(jLabelfechaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaGastoEmpleado.add(jButtonfechaGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaGastoEmpleado.add(jDateChooserfechaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeGastoEmpleado.add(jLabelporcentajeGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeGastoEmpleado.add(jButtonporcentajeGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeGastoEmpleado.add(jTextFieldporcentajeGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_maximoGastoEmpleado.add(jLabelvalor_maximoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_maximoGastoEmpleado.add(jButtonvalor_maximoGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_maximoGastoEmpleado.add(jTextFieldvalor_maximoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 0;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_maximo_porcentajeGastoEmpleado.add(jLabelvalor_maximo_porcentajeGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 2;
		this.gridBagConstraintsGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_maximo_porcentajeGastoEmpleado.add(jButtonvalor_maximo_porcentajeGastoEmpleadoBusqueda, this.gridBagConstraintsGastoEmpleado);
	}

	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGastoEmpleado.gridy = 0;
	this.gridBagConstraintsGastoEmpleado.gridx = 1;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_maximo_porcentajeGastoEmpleado.add(jTextFieldvalor_maximo_porcentajeGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelidGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelid_empleadoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelid_paisGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelid_ciudadGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelid_anioGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelid_mesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPaneldiaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelid_estado_gasto_empleadoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPaneltotal_ingreso_actualGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPaneltotal_ingreso_otroGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPaneltotal_ingresoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelgasto_viviendaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelgasto_educacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelgasto_saludGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelgasto_vestimentaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelgasto_alimentacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPaneltotal_gasto_actualGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPaneltotal_gastoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelfechaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelporcentajeGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelvalor_maximoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGastoEmpleado.add(this.jPanelvalor_maximo_porcentajeGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposGastoEmpleado % 2==0) {
		iXPanelCamposGastoEmpleado=0;
		iYPanelCamposGastoEmpleado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposOcultosGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposOcultosGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGastoEmpleado.add(this.jPanelid_empresaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposOcultosGastoEmpleado % 2==0) {
		iXPanelCamposOcultosGastoEmpleado=0;
		iYPanelCamposOcultosGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposOcultosGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposOcultosGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGastoEmpleado.add(this.jPanelid_sucursalGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposOcultosGastoEmpleado % 2==0) {
		iXPanelCamposOcultosGastoEmpleado=0;
		iYPanelCamposOcultosGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposOcultosGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposOcultosGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGastoEmpleado.add(this.jPanelid_ejercicioGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposOcultosGastoEmpleado % 2==0) {
		iXPanelCamposOcultosGastoEmpleado=0;
		iYPanelCamposOcultosGastoEmpleado++;
	}
	this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGastoEmpleado.gridy = iYPanelCamposOcultosGastoEmpleado;
	this.gridBagConstraintsGastoEmpleado.gridx = iXPanelCamposOcultosGastoEmpleado++;
	this.gridBagConstraintsGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGastoEmpleado.add(this.jPanelid_usuarioGastoEmpleado, this.gridBagConstraintsGastoEmpleado);



	if(iXPanelCamposOcultosGastoEmpleado % 2==0) {
		iXPanelCamposOcultosGastoEmpleado=0;
		iYPanelCamposOcultosGastoEmpleado++;
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
			
		GridBagLayout gridaBagLayoutAccionesGastoEmpleado= new GridBagLayout();
		this.jPanelAccionesGastoEmpleado.setLayout(gridaBagLayoutAccionesGastoEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioGastoEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioGastoEmpleado.setLayout(gridaBagLayoutAccionesFormularioGastoEmpleado);
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGastoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGastoEmpleado.add(this.jComboBoxTiposAccionesFormularioGastoEmpleado, this.gridBagConstraintsGastoEmpleado);

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGastoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGastoEmpleado.add(this.jCheckBoxPostAccionNuevoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.gastoempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGastoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGastoEmpleado.add(this.jCheckBoxPostAccionSinCerrarGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.gastoempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.gastoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGastoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGastoEmpleado.add(this.jCheckBoxPostAccionSinMensajeGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesGastoEmpleado.add(this.jButtonModificarGastoEmpleado, this.gridBagConstraintsGastoEmpleado);							

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesGastoEmpleado.add(this.jButtonEliminarGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
			
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy = 0;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesGastoEmpleado.add(this.jButtonActualizarGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy = 0;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesGastoEmpleado.add(this.jButtonGuardarCambiosGastoEmpleado, this.gridBagConstraintsGastoEmpleado);	
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy = 0;		
		this.gridBagConstraintsGastoEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesGastoEmpleado.add(this.jButtonCancelarGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGastoEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGastoEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGastoEmpleado.gridx = 0;		
			//this.gridBagConstraintsGastoEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGastoEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGastoEmpleado.gridx =0;
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGastoEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(GastoEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleGastoEmpleado = new GastoEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Gasto Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Gasto Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Gasto Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			GastoEmpleadoModel gastoempleadoModel=new GastoEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//GastoEmpleadoModel.GastoEmpleadoFocusTraversalPolicy gastoempleadoFocusTraversalPolicy = gastoempleadoModel.new GastoEmpleadoFocusTraversalPolicy(this);
			
			//gastoempleadoFocusTraversalPolicy.setgastoempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(gastoempleadoModel);
			
			
			this.jContentPaneDetalleGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleGastoEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleGastoEmpleado.setLayout(gridaBagLayoutDetalleGastoEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGastoEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsGastoEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsGastoEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleGastoEmpleado.add(jTtoolBarDetalleGastoEmpleado, gridBagConstraintsGastoEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionGastoEmpleado=   new JScrollPane(jContentPaneDetalleGastoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGastoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGastoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGastoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralGastoEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGastoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGastoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGastoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsGastoEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsGastoEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleGastoEmpleado.add(jPanelCamposGastoEmpleado, gridBagConstraintsGastoEmpleado);
			
			
			
			
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
						&& gastoempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.gastoempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsGastoEmpleado= new GridBagConstraints();
						this.gridBagConstraintsGastoEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsGastoEmpleado.gridx = 0;
						this.jContentPaneDetalleGastoEmpleado.add(this.jTabbedPaneRelacionesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesGastoEmpleado.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosGastoEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
					this.gridBagConstraintsGastoEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsGastoEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsGastoEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleGastoEmpleado.add(jPanelCamposOcultosGastoEmpleado, gridBagConstraintsGastoEmpleado);
				
					this.jPanelCamposOcultosGastoEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsGastoEmpleado.gridx = 0;
	        this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleGastoEmpleado.add(this.jPanelAccionesFormularioGastoEmpleado, this.gridBagConstraintsGastoEmpleado);							
			
			
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsGastoEmpleado.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsGastoEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleGastoEmpleado.add(this.jPanelAccionesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionGastoEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionGastoEmpleado=   new JScrollPane(this.jPanelCamposGastoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGastoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGastoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGastoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsGastoEmpleado.gridx = 0;
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsGastoEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGastoEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioGastoEmpleado, this.gridBagConstraintsGastoEmpleado);			
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGastoEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
			
			
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
			
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGastoEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralGastoEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionGastoEmpleado;
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
