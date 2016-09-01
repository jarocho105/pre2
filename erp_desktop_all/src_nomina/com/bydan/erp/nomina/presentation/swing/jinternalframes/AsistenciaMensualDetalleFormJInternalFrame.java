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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.AsistenciaMensualConstantesFunciones;

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
public class AsistenciaMensualDetalleFormJInternalFrame extends AsistenciaMensualBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAsistenciaMensual;
	
	protected JMenuBar jmenuBarDetalleAsistenciaMensual;
	
	protected JMenu jmenuDetalleAsistenciaMensual;
	protected JMenu jmenuDetalleArchivoAsistenciaMensual;
	protected JMenu jmenuDetalleAccionesAsistenciaMensual;
	protected JMenu jmenuDetalleDatosAsistenciaMensual;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAsistenciaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAsistenciaMensual;	
	protected GridBagConstraints gridBagConstraintsAsistenciaMensual;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AsistenciaMensualBeanSwingJInternalFrameAdditional jInternalFrameDetalleAsistenciaMensual;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cargo="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public AsistenciaMensualSessionBean asistenciamensualSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public CargoSessionBean cargoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public AsistenciaMensualLogic asistenciamensualLogic;
	
	public JScrollPane jScrollPanelDatosAsistenciaMensual;
	public JScrollPane jScrollPanelDatosEdicionAsistenciaMensual;
	public JScrollPane jScrollPanelDatosGeneralAsistenciaMensual;
	
	protected JPanel jPanelCamposAsistenciaMensual;    
	protected JPanel jPanelCamposOcultosAsistenciaMensual;    	
	protected JPanel jPanelAccionesAsistenciaMensual;
	protected JPanel jPanelAccionesFormularioAsistenciaMensual;
    
	
	
	protected Integer iXPanelCamposAsistenciaMensual=0;
	protected Integer iYPanelCamposAsistenciaMensual=0;
	
	protected Integer iXPanelCamposOcultosAsistenciaMensual=0;
	protected Integer iYPanelCamposOcultosAsistenciaMensual=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAsistenciaMensual;
	public JButton jButtonModificarAsistenciaMensual;
	public JButton jButtonActualizarAsistenciaMensual;
    public JButton jButtonEliminarAsistenciaMensual;
	public JButton jButtonCancelarAsistenciaMensual;
    public JButton jButtonGuardarCambiosAsistenciaMensual;
	public JButton jButtonGuardarCambiosTablaAsistenciaMensual;
	protected JButton jButtonCerrarAsistenciaMensual;
	
	
	protected JButton jButtonProcesarInformacionAsistenciaMensual;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAsistenciaMensual;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAsistenciaMensual;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAsistenciaMensual;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAsistenciaMensual;
	protected JButton jButtonModificarToolBarAsistenciaMensual;
	protected JButton jButtonActualizarToolBarAsistenciaMensual;
    protected JButton jButtonEliminarToolBarAsistenciaMensual;
	protected JButton jButtonCancelarToolBarAsistenciaMensual;
    protected JButton jButtonGuardarCambiosToolBarAsistenciaMensual;
	protected JButton jButtonGuardarCambiosTablaToolBarAsistenciaMensual;
	protected JButton jButtonMostrarOcultarTablaToolBarAsistenciaMensual;
	protected JButton jButtonCerrarToolBarAsistenciaMensual;
	
	protected JButton jButtonProcesarInformacionToolBarAsistenciaMensual;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAsistenciaMensual;
	protected JMenuItem jMenuItemModificarAsistenciaMensual;
	protected JMenuItem jMenuItemActualizarAsistenciaMensual;
    protected JMenuItem jMenuItemEliminarAsistenciaMensual;
	protected JMenuItem jMenuItemCancelarAsistenciaMensual;
    protected JMenuItem jMenuItemGuardarCambiosAsistenciaMensual;
	protected JMenuItem jMenuItemGuardarCambiosTablaAsistenciaMensual;
	protected JMenuItem jMenuItemCerrarAsistenciaMensual;
	protected JMenuItem jMenuItemDetalleCerrarAsistenciaMensual;
	protected JMenuItem jMenuItemDetalleMostarOcultarAsistenciaMensual;
	
	protected JMenuItem jMenuItemProcesarInformacionAsistenciaMensual;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAsistenciaMensual;
	protected JMenuItem jMenuItemMostrarOcultarAsistenciaMensual;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAsistenciaMensual;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAsistenciaMensual;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAsistenciaMensual;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAsistenciaMensual;
	public JLabel jLabelIdAsistenciaMensual;
	public JLabel jLabelidAsistenciaMensual;
	public JButton jButtonidAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelfechaAsistenciaMensual;
	public JLabel jLabelfechaAsistenciaMensual;
	//public JFormattedTextField jDateChooserfechaAsistenciaMensual;

	public JDateChooser jDateChooserfechaAsistenciaMensual;
	public JButton jButtonfechaAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelhoras_trabajoAsistenciaMensual;
	public JLabel jLabelhoras_trabajoAsistenciaMensual;
	public JTextField jTextFieldhoras_trabajoAsistenciaMensual;
	public JButton jButtonhoras_trabajoAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelhoras_atrasoAsistenciaMensual;
	public JLabel jLabelhoras_atrasoAsistenciaMensual;
	public JTextField jTextFieldhoras_atrasoAsistenciaMensual;
	public JButton jButtonhoras_atrasoAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelhoras_faltasAsistenciaMensual;
	public JLabel jLabelhoras_faltasAsistenciaMensual;
	public JTextField jTextFieldhoras_faltasAsistenciaMensual;
	public JButton jButtonhoras_faltasAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelhoras_permisoAsistenciaMensual;
	public JLabel jLabelhoras_permisoAsistenciaMensual;
	public JTextField jTextFieldhoras_permisoAsistenciaMensual;
	public JButton jButtonhoras_permisoAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelhoras_extra25AsistenciaMensual;
	public JLabel jLabelhoras_extra25AsistenciaMensual;
	public JTextField jTextFieldhoras_extra25AsistenciaMensual;
	public JButton jButtonhoras_extra25AsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelhoras_extra50AsistenciaMensual;
	public JLabel jLabelhoras_extra50AsistenciaMensual;
	public JTextField jTextFieldhoras_extra50AsistenciaMensual;
	public JButton jButtonhoras_extra50AsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelhoras_extra100AsistenciaMensual;
	public JLabel jLabelhoras_extra100AsistenciaMensual;
	public JTextField jTextFieldhoras_extra100AsistenciaMensual;
	public JButton jButtonhoras_extra100AsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelhoras_extra150AsistenciaMensual;
	public JLabel jLabelhoras_extra150AsistenciaMensual;
	public JTextField jTextFieldhoras_extra150AsistenciaMensual;
	public JButton jButtonhoras_extra150AsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelhoras_extra0AsistenciaMensual;
	public JLabel jLabelhoras_extra0AsistenciaMensual;
	public JTextField jTextFieldhoras_extra0AsistenciaMensual;
	public JButton jButtonhoras_extra0AsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelhoras_enfermoAsistenciaMensual;
	public JLabel jLabelhoras_enfermoAsistenciaMensual;
	public JTextField jTextFieldhoras_enfermoAsistenciaMensual;
	public JButton jButtonhoras_enfermoAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelhoras_maternidadAsistenciaMensual;
	public JLabel jLabelhoras_maternidadAsistenciaMensual;
	public JTextField jTextFieldhoras_maternidadAsistenciaMensual;
	public JButton jButtonhoras_maternidadAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelhoras_vacacionAsistenciaMensual;
	public JLabel jLabelhoras_vacacionAsistenciaMensual;
	public JTextField jTextFieldhoras_vacacionAsistenciaMensual;
	public JButton jButtonhoras_vacacionAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diasAsistenciaMensual;
	public JLabel jLabelnumero_diasAsistenciaMensual;
	public JTextField jTextFieldnumero_diasAsistenciaMensual;
	public JButton jButtonnumero_diasAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelnumero_nochesAsistenciaMensual;
	public JLabel jLabelnumero_nochesAsistenciaMensual;
	public JTextField jTextFieldnumero_nochesAsistenciaMensual;
	public JButton jButtonnumero_nochesAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelnumero_feriadosAsistenciaMensual;
	public JLabel jLabelnumero_feriadosAsistenciaMensual;
	public JTextField jTextFieldnumero_feriadosAsistenciaMensual;
	public JButton jButtonnumero_feriadosAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelnumero_trabajoAsistenciaMensual;
	public JLabel jLabelnumero_trabajoAsistenciaMensual;
	public JTextField jTextFieldnumero_trabajoAsistenciaMensual;
	public JButton jButtonnumero_trabajoAsistenciaMensualBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAsistenciaMensual;
	public JLabel jLabelid_empresaAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAsistenciaMensual;
	public JButton jButtonid_empresaAsistenciaMensual= new JButtonMe();
	public JButton jButtonid_empresaAsistenciaMensualUpdate= new JButtonMe();
	public JButton jButtonid_empresaAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoAsistenciaMensual;
	public JLabel jLabelid_empleadoAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoAsistenciaMensual;
	public JButton jButtonid_empleadoAsistenciaMensual= new JButtonMe();
	public JButton jButtonid_empleadoAsistenciaMensualUpdate= new JButtonMe();
	public JButton jButtonid_empleadoAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelid_cargoAsistenciaMensual;
	public JLabel jLabelid_cargoAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cargoAsistenciaMensual;
	public JButton jButtonid_cargoAsistenciaMensual= new JButtonMe();
	public JButton jButtonid_cargoAsistenciaMensualUpdate= new JButtonMe();
	public JButton jButtonid_cargoAsistenciaMensualBusqueda= new JButtonMe();
	public JButton jButtonid_cargoAsistenciaMensualArbol= new JButtonMe();

	public JPanel jPanelid_estructuraAsistenciaMensual;
	public JLabel jLabelid_estructuraAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraAsistenciaMensual;
	public JButton jButtonid_estructuraAsistenciaMensual= new JButtonMe();
	public JButton jButtonid_estructuraAsistenciaMensualUpdate= new JButtonMe();
	public JButton jButtonid_estructuraAsistenciaMensualBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraAsistenciaMensualArbol= new JButtonMe();

	public JPanel jPanelid_anioAsistenciaMensual;
	public JLabel jLabelid_anioAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioAsistenciaMensual;
	public JButton jButtonid_anioAsistenciaMensual= new JButtonMe();
	public JButton jButtonid_anioAsistenciaMensualUpdate= new JButtonMe();
	public JButton jButtonid_anioAsistenciaMensualBusqueda= new JButtonMe();

	public JPanel jPanelid_mesAsistenciaMensual;
	public JLabel jLabelid_mesAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesAsistenciaMensual;
	public JButton jButtonid_mesAsistenciaMensual= new JButtonMe();
	public JButton jButtonid_mesAsistenciaMensualUpdate= new JButtonMe();
	public JButton jButtonid_mesAsistenciaMensualBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAsistenciaMensual;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1180;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=447;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AsistenciaMensualDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAsistenciaMensual=new JPanel();
				this.jPanelAccionesFormularioAsistenciaMensual=new JPanel();
				this.jmenuBarDetalleAsistenciaMensual=new JMenuBar();
				this.jTtoolBarDetalleAsistenciaMensual=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaMensualDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AsistenciaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AsistenciaMensualDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AsistenciaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaMensualDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsistenciaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaMensualDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsistenciaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaMensualDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AsistenciaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAsistenciaMensual() {
		return this.jButtonActualizarToolBarAsistenciaMensual;
	}
	
	public JButton getjButtonEliminarToolBarAsistenciaMensual() {
		return this.jButtonEliminarToolBarAsistenciaMensual;
	}
	
	public JButton getjButtonCancelarToolBarAsistenciaMensual() {
		return this.jButtonCancelarToolBarAsistenciaMensual;
	}		
	
	public JButton getjButtonProcesarInformacionAsistenciaMensual() {
		return this.jButtonProcesarInformacionAsistenciaMensual;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAsistenciaMensual)	{
		this.jButtonProcesarInformacionAsistenciaMensual = jButtonProcesarInformacionAsistenciaMensual;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAsistenciaMensual() {
		return this.jComboBoxTiposAccionesAsistenciaMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAsistenciaMensual(
			JComboBox jComboBoxTiposRelacionesAsistenciaMensual) {
		this.jComboBoxTiposRelacionesAsistenciaMensual = jComboBoxTiposRelacionesAsistenciaMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAsistenciaMensual(
			JComboBox jComboBoxTiposAccionesAsistenciaMensual) {
		this.jComboBoxTiposAccionesAsistenciaMensual = jComboBoxTiposAccionesAsistenciaMensual;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAsistenciaMensual() {
		return this.jComboBoxTiposAccionesFormularioAsistenciaMensual;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAsistenciaMensual(
			JComboBox jComboBoxTiposAccionesFormularioAsistenciaMensual) {
		this.jComboBoxTiposAccionesFormularioAsistenciaMensual = jComboBoxTiposAccionesFormularioAsistenciaMensual;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
		
		this.asistenciamensualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.asistenciamensualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.asistenciamensualSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AsistenciaMensualJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AsistenciaMensualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AsistenciaMensualJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Asistencia Mensual MANTENIMIENTO"));
		
		
		if(iWidth > 2450) {
			iWidth=2450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
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
	
		AsistenciaMensualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAsistenciaMensual= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAsistenciaMensual=new JButtonMe();
				this.jButtonModificarToolBarAsistenciaMensual=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAsistenciaMensual,this.jTtoolBarDetalleAsistenciaMensual,
							"actualizar","actualizar","Actualizar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAsistenciaMensual,this.jTtoolBarDetalleAsistenciaMensual,
							"eliminar","eliminar","Eliminar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAsistenciaMensual,this.jTtoolBarDetalleAsistenciaMensual,
							"cancelar","cancelar","Cancelar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAsistenciaMensual,this.jTtoolBarDetalleAsistenciaMensual,
							"guardarcambios","guardarcambios","Guardar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAsistenciaMensual=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAsistenciaMensual=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAsistenciaMensual=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAsistenciaMensual=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAsistenciaMensual=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAsistenciaMensual= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAsistenciaMensual.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAsistenciaMensual,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAsistenciaMensual= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAsistenciaMensual.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAsistenciaMensual,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAsistenciaMensual= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAsistenciaMensual.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAsistenciaMensual,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAsistenciaMensual= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAsistenciaMensual.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAsistenciaMensual,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAsistenciaMensual= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAsistenciaMensual.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAsistenciaMensual,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAsistenciaMensual= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAsistenciaMensual.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAsistenciaMensual,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAsistenciaMensual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAsistenciaMensual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAsistenciaMensual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAsistenciaMensual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAsistenciaMensual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAsistenciaMensual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAsistenciaMensual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAsistenciaMensual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAsistenciaMensual,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAsistenciaMensual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAsistenciaMensual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAsistenciaMensual,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAsistenciaMensual.add(this.jMenuItemDetalleCerrarAsistenciaMensual);
		
		this.jmenuDetalleAccionesAsistenciaMensual.add(this.jMenuItemActualizarAsistenciaMensual);
		this.jmenuDetalleAccionesAsistenciaMensual.add(this.jMenuItemEliminarAsistenciaMensual);
		this.jmenuDetalleAccionesAsistenciaMensual.add(this.jMenuItemCancelarAsistenciaMensual);		
		
		//this.jmenuDetalleDatosAsistenciaMensual.add(this.jMenuItemDetalleAbrirOrderByAsistenciaMensual);				
		this.jmenuDetalleDatosAsistenciaMensual.add(this.jMenuItemDetalleMostarOcultarAsistenciaMensual);				
				
		//this.jmenuDetalleAccionesAsistenciaMensual.add(this.jMenuItemGuardarCambiosAsistenciaMensual);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAsistenciaMensual.add(this.jmenuDetalleArchivoAsistenciaMensual);		
		this.jmenuBarDetalleAsistenciaMensual.add(this.jmenuDetalleAccionesAsistenciaMensual);		
		this.jmenuBarDetalleAsistenciaMensual.add(this.jmenuDetalleDatosAsistenciaMensual);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAsistenciaMensual);				
	}
	
	
	public void inicializarElementosCamposAsistenciaMensual() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAsistenciaMensual = new JLabelMe();
		jLabelIdAsistenciaMensual.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAsistenciaMensual = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAsistenciaMensual= new GridBagLayout();

		this.jPanelidAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);

		jLabelidAsistenciaMensual = new JLabel();
		jLabelidAsistenciaMensual.setText("Id");

		jLabelidAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaAsistenciaMensual = new JLabelMe();
		this.jLabelfechaAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaAsistenciaMensual.setToolTipText("Fecha");
		this.jLabelfechaAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelfechaAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		//jFormattedTextFieldfechaAsistenciaMensual= new JFormattedTextFieldMe();

		jDateChooserfechaAsistenciaMensual= new JDateChooser();
		jDateChooserfechaAsistenciaMensual.setEnabled(false);
		jDateChooserfechaAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaAsistenciaMensual.setDate(new Date());
		jDateChooserfechaAsistenciaMensual.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaAsistenciaMensual.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonfechaAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaAsistenciaMensualBusqueda.setText("U");
		this.jButtonfechaAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaAsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelhoras_trabajoAsistenciaMensual = new JLabelMe();
		this.jLabelhoras_trabajoAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO+" : *");
		this.jLabelhoras_trabajoAsistenciaMensual.setToolTipText("Horas Trabajo");
		this.jLabelhoras_trabajoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_trabajoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_trabajoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_trabajoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_trabajoAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_trabajoAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_HORASTRABAJO);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelhoras_trabajoAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldhoras_trabajoAsistenciaMensual= new JTextFieldMe();
		jTextFieldhoras_trabajoAsistenciaMensual.setEnabled(false);
		jTextFieldhoras_trabajoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_trabajoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_trabajoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_trabajoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_trabajoAsistenciaMensual.setText("0.0");

		this.jButtonhoras_trabajoAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonhoras_trabajoAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_trabajoAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_trabajoAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_trabajoAsistenciaMensualBusqueda.setText("U");
		this.jButtonhoras_trabajoAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_trabajoAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_trabajoAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_trabajoAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_trabajoAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_trabajoAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_trabajoAsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelhoras_atrasoAsistenciaMensual = new JLabelMe();
		this.jLabelhoras_atrasoAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO+" : *");
		this.jLabelhoras_atrasoAsistenciaMensual.setToolTipText("Horas Atraso");
		this.jLabelhoras_atrasoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_atrasoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_atrasoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_atrasoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_atrasoAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_atrasoAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_HORASATRASO);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelhoras_atrasoAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldhoras_atrasoAsistenciaMensual= new JTextFieldMe();
		jTextFieldhoras_atrasoAsistenciaMensual.setEnabled(false);
		jTextFieldhoras_atrasoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_atrasoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_atrasoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_atrasoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_atrasoAsistenciaMensual.setText("0.0");

		this.jButtonhoras_atrasoAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonhoras_atrasoAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_atrasoAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_atrasoAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_atrasoAsistenciaMensualBusqueda.setText("U");
		this.jButtonhoras_atrasoAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_atrasoAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_atrasoAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_atrasoAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_atrasoAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_atrasoAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_atrasoAsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelhoras_faltasAsistenciaMensual = new JLabelMe();
		this.jLabelhoras_faltasAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS+" : *");
		this.jLabelhoras_faltasAsistenciaMensual.setToolTipText("Horas Faltas");
		this.jLabelhoras_faltasAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_faltasAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_faltasAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_faltasAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_faltasAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_faltasAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_HORASFALTAS);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelhoras_faltasAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldhoras_faltasAsistenciaMensual= new JTextFieldMe();
		jTextFieldhoras_faltasAsistenciaMensual.setEnabled(false);
		jTextFieldhoras_faltasAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_faltasAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_faltasAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_faltasAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_faltasAsistenciaMensual.setText("0.0");

		this.jButtonhoras_faltasAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonhoras_faltasAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_faltasAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_faltasAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_faltasAsistenciaMensualBusqueda.setText("U");
		this.jButtonhoras_faltasAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_faltasAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_faltasAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_faltasAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_faltasAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_faltasAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_faltasAsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelhoras_permisoAsistenciaMensual = new JLabelMe();
		this.jLabelhoras_permisoAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO+" : *");
		this.jLabelhoras_permisoAsistenciaMensual.setToolTipText("Horas Permiso");
		this.jLabelhoras_permisoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_permisoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_permisoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_permisoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_permisoAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_permisoAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_HORASPERMISO);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelhoras_permisoAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldhoras_permisoAsistenciaMensual= new JTextFieldMe();
		jTextFieldhoras_permisoAsistenciaMensual.setEnabled(false);
		jTextFieldhoras_permisoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_permisoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_permisoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_permisoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_permisoAsistenciaMensual.setText("0.0");

		this.jButtonhoras_permisoAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonhoras_permisoAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_permisoAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_permisoAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_permisoAsistenciaMensualBusqueda.setText("U");
		this.jButtonhoras_permisoAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_permisoAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_permisoAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_permisoAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_permisoAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_permisoAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_permisoAsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelhoras_extra25AsistenciaMensual = new JLabelMe();
		this.jLabelhoras_extra25AsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25+" : *");
		this.jLabelhoras_extra25AsistenciaMensual.setToolTipText("Horas Extra25");
		this.jLabelhoras_extra25AsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra25AsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra25AsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_extra25AsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_extra25AsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_extra25AsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA25);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelhoras_extra25AsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldhoras_extra25AsistenciaMensual= new JTextFieldMe();
		jTextFieldhoras_extra25AsistenciaMensual.setEnabled(false);
		jTextFieldhoras_extra25AsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra25AsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra25AsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_extra25AsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_extra25AsistenciaMensual.setText("0.0");

		this.jButtonhoras_extra25AsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonhoras_extra25AsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra25AsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra25AsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_extra25AsistenciaMensualBusqueda.setText("U");
		this.jButtonhoras_extra25AsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_extra25AsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_extra25AsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_extra25AsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_extra25AsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_extra25AsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_extra25AsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelhoras_extra50AsistenciaMensual = new JLabelMe();
		this.jLabelhoras_extra50AsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50+" : *");
		this.jLabelhoras_extra50AsistenciaMensual.setToolTipText("Horas Extra50");
		this.jLabelhoras_extra50AsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra50AsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra50AsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_extra50AsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_extra50AsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_extra50AsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA50);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelhoras_extra50AsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldhoras_extra50AsistenciaMensual= new JTextFieldMe();
		jTextFieldhoras_extra50AsistenciaMensual.setEnabled(false);
		jTextFieldhoras_extra50AsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra50AsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra50AsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_extra50AsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_extra50AsistenciaMensual.setText("0.0");

		this.jButtonhoras_extra50AsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonhoras_extra50AsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra50AsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra50AsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_extra50AsistenciaMensualBusqueda.setText("U");
		this.jButtonhoras_extra50AsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_extra50AsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_extra50AsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_extra50AsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_extra50AsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_extra50AsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_extra50AsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelhoras_extra100AsistenciaMensual = new JLabelMe();
		this.jLabelhoras_extra100AsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100+" : *");
		this.jLabelhoras_extra100AsistenciaMensual.setToolTipText("Horas Extra100");
		this.jLabelhoras_extra100AsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra100AsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra100AsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_extra100AsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_extra100AsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_extra100AsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA100);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelhoras_extra100AsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldhoras_extra100AsistenciaMensual= new JTextFieldMe();
		jTextFieldhoras_extra100AsistenciaMensual.setEnabled(false);
		jTextFieldhoras_extra100AsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra100AsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra100AsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_extra100AsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_extra100AsistenciaMensual.setText("0.0");

		this.jButtonhoras_extra100AsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonhoras_extra100AsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra100AsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra100AsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_extra100AsistenciaMensualBusqueda.setText("U");
		this.jButtonhoras_extra100AsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_extra100AsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_extra100AsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_extra100AsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_extra100AsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_extra100AsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_extra100AsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelhoras_extra150AsistenciaMensual = new JLabelMe();
		this.jLabelhoras_extra150AsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150+" : *");
		this.jLabelhoras_extra150AsistenciaMensual.setToolTipText("Horas Extra150");
		this.jLabelhoras_extra150AsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra150AsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra150AsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_extra150AsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_extra150AsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_extra150AsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA150);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelhoras_extra150AsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldhoras_extra150AsistenciaMensual= new JTextFieldMe();
		jTextFieldhoras_extra150AsistenciaMensual.setEnabled(false);
		jTextFieldhoras_extra150AsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra150AsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra150AsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_extra150AsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_extra150AsistenciaMensual.setText("0.0");

		this.jButtonhoras_extra150AsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonhoras_extra150AsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra150AsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra150AsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_extra150AsistenciaMensualBusqueda.setText("U");
		this.jButtonhoras_extra150AsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_extra150AsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_extra150AsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_extra150AsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_extra150AsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_extra150AsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_extra150AsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelhoras_extra0AsistenciaMensual = new JLabelMe();
		this.jLabelhoras_extra0AsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0+" : *");
		this.jLabelhoras_extra0AsistenciaMensual.setToolTipText("Horas Extra0");
		this.jLabelhoras_extra0AsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra0AsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_extra0AsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_extra0AsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_extra0AsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_extra0AsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_HORASEXTRA0);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelhoras_extra0AsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldhoras_extra0AsistenciaMensual= new JTextFieldMe();
		jTextFieldhoras_extra0AsistenciaMensual.setEnabled(false);
		jTextFieldhoras_extra0AsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra0AsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_extra0AsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_extra0AsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_extra0AsistenciaMensual.setText("0.0");

		this.jButtonhoras_extra0AsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonhoras_extra0AsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra0AsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_extra0AsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_extra0AsistenciaMensualBusqueda.setText("U");
		this.jButtonhoras_extra0AsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_extra0AsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_extra0AsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_extra0AsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_extra0AsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_extra0AsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_extra0AsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelhoras_enfermoAsistenciaMensual = new JLabelMe();
		this.jLabelhoras_enfermoAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO+" : *");
		this.jLabelhoras_enfermoAsistenciaMensual.setToolTipText("Horas Enfermo");
		this.jLabelhoras_enfermoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_enfermoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_enfermoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_enfermoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_enfermoAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_enfermoAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_HORASENFERMO);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelhoras_enfermoAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldhoras_enfermoAsistenciaMensual= new JTextFieldMe();
		jTextFieldhoras_enfermoAsistenciaMensual.setEnabled(false);
		jTextFieldhoras_enfermoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_enfermoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_enfermoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_enfermoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_enfermoAsistenciaMensual.setText("0.0");

		this.jButtonhoras_enfermoAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonhoras_enfermoAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_enfermoAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_enfermoAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_enfermoAsistenciaMensualBusqueda.setText("U");
		this.jButtonhoras_enfermoAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_enfermoAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_enfermoAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_enfermoAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_enfermoAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_enfermoAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_enfermoAsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelhoras_maternidadAsistenciaMensual = new JLabelMe();
		this.jLabelhoras_maternidadAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD+" : *");
		this.jLabelhoras_maternidadAsistenciaMensual.setToolTipText("Horas Maternidad");
		this.jLabelhoras_maternidadAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhoras_maternidadAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelhoras_maternidadAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_maternidadAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_maternidadAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_maternidadAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_HORASMATERNIDAD);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelhoras_maternidadAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldhoras_maternidadAsistenciaMensual= new JTextFieldMe();
		jTextFieldhoras_maternidadAsistenciaMensual.setEnabled(false);
		jTextFieldhoras_maternidadAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_maternidadAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_maternidadAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_maternidadAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_maternidadAsistenciaMensual.setText("0.0");

		this.jButtonhoras_maternidadAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonhoras_maternidadAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_maternidadAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_maternidadAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_maternidadAsistenciaMensualBusqueda.setText("U");
		this.jButtonhoras_maternidadAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_maternidadAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_maternidadAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_maternidadAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_maternidadAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_maternidadAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_maternidadAsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelhoras_vacacionAsistenciaMensual = new JLabelMe();
		this.jLabelhoras_vacacionAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION+" : *");
		this.jLabelhoras_vacacionAsistenciaMensual.setToolTipText("Horas Vacacion");
		this.jLabelhoras_vacacionAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_vacacionAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoras_vacacionAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoras_vacacionAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoras_vacacionAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoras_vacacionAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_HORASVACACION);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelhoras_vacacionAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldhoras_vacacionAsistenciaMensual= new JTextFieldMe();
		jTextFieldhoras_vacacionAsistenciaMensual.setEnabled(false);
		jTextFieldhoras_vacacionAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_vacacionAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldhoras_vacacionAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldhoras_vacacionAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldhoras_vacacionAsistenciaMensual.setText("0.0");

		this.jButtonhoras_vacacionAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonhoras_vacacionAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_vacacionAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoras_vacacionAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoras_vacacionAsistenciaMensualBusqueda.setText("U");
		this.jButtonhoras_vacacionAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoras_vacacionAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoras_vacacionAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldhoras_vacacionAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldhoras_vacacionAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horas_vacacionAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoras_vacacionAsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelnumero_diasAsistenciaMensual = new JLabelMe();
		this.jLabelnumero_diasAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS+" : *");
		this.jLabelnumero_diasAsistenciaMensual.setToolTipText("Numero Dias");
		this.jLabelnumero_diasAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diasAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diasAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diasAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_NUMERODIAS);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelnumero_diasAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldnumero_diasAsistenciaMensual= new JTextFieldMe();
		jTextFieldnumero_diasAsistenciaMensual.setEnabled(false);
		jTextFieldnumero_diasAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diasAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_diasAsistenciaMensual.setText("0.0");

		this.jButtonnumero_diasAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonnumero_diasAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diasAsistenciaMensualBusqueda.setText("U");
		this.jButtonnumero_diasAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diasAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diasAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diasAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diasAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diasAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diasAsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelnumero_nochesAsistenciaMensual = new JLabelMe();
		this.jLabelnumero_nochesAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES+" : *");
		this.jLabelnumero_nochesAsistenciaMensual.setToolTipText("Numero Noches");
		this.jLabelnumero_nochesAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_nochesAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_nochesAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_nochesAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_nochesAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_nochesAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_NUMERONOCHES);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelnumero_nochesAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldnumero_nochesAsistenciaMensual= new JTextFieldMe();
		jTextFieldnumero_nochesAsistenciaMensual.setEnabled(false);
		jTextFieldnumero_nochesAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_nochesAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_nochesAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_nochesAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_nochesAsistenciaMensual.setText("0.0");

		this.jButtonnumero_nochesAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonnumero_nochesAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_nochesAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_nochesAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_nochesAsistenciaMensualBusqueda.setText("U");
		this.jButtonnumero_nochesAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_nochesAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_nochesAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_nochesAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_nochesAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_nochesAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_nochesAsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelnumero_feriadosAsistenciaMensual = new JLabelMe();
		this.jLabelnumero_feriadosAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS+" : *");
		this.jLabelnumero_feriadosAsistenciaMensual.setToolTipText("Numero Feriados");
		this.jLabelnumero_feriadosAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_feriadosAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_feriadosAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_feriadosAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_feriadosAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_feriadosAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_NUMEROFERIADOS);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelnumero_feriadosAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldnumero_feriadosAsistenciaMensual= new JTextFieldMe();
		jTextFieldnumero_feriadosAsistenciaMensual.setEnabled(false);
		jTextFieldnumero_feriadosAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_feriadosAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_feriadosAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_feriadosAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_feriadosAsistenciaMensual.setText("0.0");

		this.jButtonnumero_feriadosAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonnumero_feriadosAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_feriadosAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_feriadosAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_feriadosAsistenciaMensualBusqueda.setText("U");
		this.jButtonnumero_feriadosAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_feriadosAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_feriadosAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_feriadosAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_feriadosAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_feriadosAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_feriadosAsistenciaMensualBusqueda.setVisible(false);		}


					
		this.jLabelnumero_trabajoAsistenciaMensual = new JLabelMe();
		this.jLabelnumero_trabajoAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO+" : *");
		this.jLabelnumero_trabajoAsistenciaMensual.setToolTipText("Numero Trabajo");
		this.jLabelnumero_trabajoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_trabajoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_trabajoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_trabajoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_trabajoAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_trabajoAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_NUMEROTRABAJO);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelnumero_trabajoAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jTextFieldnumero_trabajoAsistenciaMensual= new JTextFieldMe();
		jTextFieldnumero_trabajoAsistenciaMensual.setEnabled(false);
		jTextFieldnumero_trabajoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_trabajoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_trabajoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_trabajoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_trabajoAsistenciaMensual.setText("0.0");

		this.jButtonnumero_trabajoAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonnumero_trabajoAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_trabajoAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_trabajoAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_trabajoAsistenciaMensualBusqueda.setText("U");
		this.jButtonnumero_trabajoAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_trabajoAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_trabajoAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_trabajoAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_trabajoAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_trabajoAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_trabajoAsistenciaMensualBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAsistenciaMensual() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAsistenciaMensual = new JLabelMe();
		this.jLabelid_empresaAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAsistenciaMensual.setToolTipText("Empresa");
		this.jLabelid_empresaAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelid_empresaAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jComboBoxid_empresaAsistenciaMensual= new JComboBoxMe();
		jComboBoxid_empresaAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAsistenciaMensual.setEnabled(false);

		this.jButtonid_empresaAsistenciaMensual= new JButtonMe();
		this.jButtonid_empresaAsistenciaMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsistenciaMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsistenciaMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsistenciaMensual.setText("Buscar");
		this.jButtonid_empresaAsistenciaMensual.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAsistenciaMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsistenciaMensual,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsistenciaMensual"));

		this.jButtonid_empresaAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonid_empresaAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAsistenciaMensualBusqueda.setText("U");
		this.jButtonid_empresaAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAsistenciaMensualBusqueda.setVisible(false);		}

		this.jButtonid_empresaAsistenciaMensualUpdate= new JButtonMe();
		this.jButtonid_empresaAsistenciaMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsistenciaMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsistenciaMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAsistenciaMensualUpdate.setText("U");
		this.jButtonid_empresaAsistenciaMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAsistenciaMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsistenciaMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsistenciaMensualUpdate"));



					
		this.jLabelid_empleadoAsistenciaMensual = new JLabelMe();
		this.jLabelid_empleadoAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoAsistenciaMensual.setToolTipText("Empleado");
		this.jLabelid_empleadoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelid_empleadoAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jComboBoxid_empleadoAsistenciaMensual= new JComboBoxMe();
		jComboBoxid_empleadoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoAsistenciaMensual= new JButtonMe();
		this.jButtonid_empleadoAsistenciaMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAsistenciaMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAsistenciaMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAsistenciaMensual.setText("Buscar");
		this.jButtonid_empleadoAsistenciaMensual.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoAsistenciaMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAsistenciaMensual,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAsistenciaMensual"));

		this.jButtonid_empleadoAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonid_empleadoAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoAsistenciaMensualBusqueda.setText("U");
		this.jButtonid_empleadoAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoAsistenciaMensualBusqueda.setVisible(false);		}

		this.jButtonid_empleadoAsistenciaMensualUpdate= new JButtonMe();
		this.jButtonid_empleadoAsistenciaMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsistenciaMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsistenciaMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoAsistenciaMensualUpdate.setText("U");
		this.jButtonid_empleadoAsistenciaMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoAsistenciaMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAsistenciaMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAsistenciaMensualUpdate"));



					
		this.jLabelid_cargoAsistenciaMensual = new JLabelMe();
		this.jLabelid_cargoAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_IDCARGO+" : *");
		this.jLabelid_cargoAsistenciaMensual.setToolTipText("Cargo");
		this.jLabelid_cargoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cargoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cargoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cargoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cargoAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cargoAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_IDCARGO);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelid_cargoAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jComboBoxid_cargoAsistenciaMensual= new JComboBoxMe();
		jComboBoxid_cargoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cargoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cargoAsistenciaMensual= new JButtonMe();
		this.jButtonid_cargoAsistenciaMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoAsistenciaMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoAsistenciaMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoAsistenciaMensual.setText("Buscar");
		this.jButtonid_cargoAsistenciaMensual.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cargoAsistenciaMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoAsistenciaMensual,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cargoAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoAsistenciaMensual"));

		this.jButtonid_cargoAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonid_cargoAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cargoAsistenciaMensualBusqueda.setText("U");
		this.jButtonid_cargoAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cargoAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cargoAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cargoAsistenciaMensualBusqueda.setVisible(false);		}

		this.jButtonid_cargoAsistenciaMensualUpdate= new JButtonMe();
		this.jButtonid_cargoAsistenciaMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoAsistenciaMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoAsistenciaMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cargoAsistenciaMensualUpdate.setText("U");
		this.jButtonid_cargoAsistenciaMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cargoAsistenciaMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoAsistenciaMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cargoAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoAsistenciaMensualUpdate"));


		jButtonid_cargoAsistenciaMensualArbol= new JButtonMe();
		jButtonid_cargoAsistenciaMensualArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cargoAsistenciaMensualArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cargoAsistenciaMensualArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cargoAsistenciaMensualArbol.setText("Arbol");
		jButtonid_cargoAsistenciaMensualArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cargoAsistenciaMensualArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoAsistenciaMensualArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cargoAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoAsistenciaMensualArbol"));



					
		this.jLabelid_estructuraAsistenciaMensual = new JLabelMe();
		this.jLabelid_estructuraAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraAsistenciaMensual.setToolTipText("Estructura");
		this.jLabelid_estructuraAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelid_estructuraAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jComboBoxid_estructuraAsistenciaMensual= new JComboBoxMe();
		jComboBoxid_estructuraAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraAsistenciaMensual= new JButtonMe();
		this.jButtonid_estructuraAsistenciaMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraAsistenciaMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraAsistenciaMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraAsistenciaMensual.setText("Buscar");
		this.jButtonid_estructuraAsistenciaMensual.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraAsistenciaMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraAsistenciaMensual,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraAsistenciaMensual"));

		this.jButtonid_estructuraAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonid_estructuraAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraAsistenciaMensualBusqueda.setText("U");
		this.jButtonid_estructuraAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraAsistenciaMensualBusqueda.setVisible(false);		}

		this.jButtonid_estructuraAsistenciaMensualUpdate= new JButtonMe();
		this.jButtonid_estructuraAsistenciaMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraAsistenciaMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraAsistenciaMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraAsistenciaMensualUpdate.setText("U");
		this.jButtonid_estructuraAsistenciaMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraAsistenciaMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraAsistenciaMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraAsistenciaMensualUpdate"));


		jButtonid_estructuraAsistenciaMensualArbol= new JButtonMe();
		jButtonid_estructuraAsistenciaMensualArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraAsistenciaMensualArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraAsistenciaMensualArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraAsistenciaMensualArbol.setText("Arbol");
		jButtonid_estructuraAsistenciaMensualArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraAsistenciaMensualArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraAsistenciaMensualArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraAsistenciaMensualArbol"));



					
		this.jLabelid_anioAsistenciaMensual = new JLabelMe();
		this.jLabelid_anioAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioAsistenciaMensual.setToolTipText("Anio");
		this.jLabelid_anioAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelid_anioAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jComboBoxid_anioAsistenciaMensual= new JComboBoxMe();
		jComboBoxid_anioAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioAsistenciaMensual= new JButtonMe();
		this.jButtonid_anioAsistenciaMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioAsistenciaMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioAsistenciaMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioAsistenciaMensual.setText("Buscar");
		this.jButtonid_anioAsistenciaMensual.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioAsistenciaMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioAsistenciaMensual,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioAsistenciaMensual"));

		this.jButtonid_anioAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonid_anioAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioAsistenciaMensualBusqueda.setText("U");
		this.jButtonid_anioAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioAsistenciaMensualBusqueda.setVisible(false);		}

		this.jButtonid_anioAsistenciaMensualUpdate= new JButtonMe();
		this.jButtonid_anioAsistenciaMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioAsistenciaMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioAsistenciaMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioAsistenciaMensualUpdate.setText("U");
		this.jButtonid_anioAsistenciaMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioAsistenciaMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioAsistenciaMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioAsistenciaMensualUpdate"));



					
		this.jLabelid_mesAsistenciaMensual = new JLabelMe();
		this.jLabelid_mesAsistenciaMensual.setText(""+AsistenciaMensualConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesAsistenciaMensual.setToolTipText("Mes");
		this.jLabelid_mesAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesAsistenciaMensual.setToolTipText(AsistenciaMensualConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		this.jPanelid_mesAsistenciaMensual.setLayout(this.gridaBagLayoutAsistenciaMensual);


		jComboBoxid_mesAsistenciaMensual= new JComboBoxMe();
		jComboBoxid_mesAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesAsistenciaMensual= new JButtonMe();
		this.jButtonid_mesAsistenciaMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesAsistenciaMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesAsistenciaMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesAsistenciaMensual.setText("Buscar");
		this.jButtonid_mesAsistenciaMensual.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesAsistenciaMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesAsistenciaMensual,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesAsistenciaMensual"));

		this.jButtonid_mesAsistenciaMensualBusqueda= new JButtonMe();
		this.jButtonid_mesAsistenciaMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesAsistenciaMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesAsistenciaMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesAsistenciaMensualBusqueda.setText("U");
		this.jButtonid_mesAsistenciaMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesAsistenciaMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesAsistenciaMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesAsistenciaMensualBusqueda"));

		if(this.asistenciamensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesAsistenciaMensualBusqueda.setVisible(false);		}

		this.jButtonid_mesAsistenciaMensualUpdate= new JButtonMe();
		this.jButtonid_mesAsistenciaMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesAsistenciaMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesAsistenciaMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesAsistenciaMensualUpdate.setText("U");
		this.jButtonid_mesAsistenciaMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesAsistenciaMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesAsistenciaMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesAsistenciaMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesAsistenciaMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesAsistenciaMensualUpdate"));



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
		//this.jInternalFrameDetalleAsistenciaMensual = new AsistenciaMensualBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Asistencia Mensual DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAsistenciaMensual= new GridBagLayout();
		

		
		String sToolTipAsistenciaMensual="";
		sToolTipAsistenciaMensual=AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAsistenciaMensual+="(Nomina.AsistenciaMensual)";
		}
		
		if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
			sToolTipAsistenciaMensual+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAsistenciaMensual = new JButtonMe();
		this.jButtonModificarAsistenciaMensual = new JButtonMe();
        this.jButtonActualizarAsistenciaMensual = new JButtonMe();
        this.jButtonEliminarAsistenciaMensual = new JButtonMe();
        this.jButtonCancelarAsistenciaMensual = new JButtonMe();
        this.jButtonGuardarCambiosAsistenciaMensual = new JButtonMe();
		this.jButtonGuardarCambiosTablaAsistenciaMensual = new JButtonMe();
		this.jButtonCerrarAsistenciaMensual = new JButtonMe();
		
		this.jScrollPanelDatosAsistenciaMensual = new JScrollPane();   
        this.jScrollPanelDatosEdicionAsistenciaMensual = new JScrollPane();
		this.jScrollPanelDatosGeneralAsistenciaMensual = new JScrollPane();
				
		
		
		this.jPanelCamposAsistenciaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAsistenciaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAsistenciaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAsistenciaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Asistencia Mensual";
		
		if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Mensuales" + this.sPath));
		} else {
			this.jScrollPanelDatosAsistenciaMensual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAsistenciaMensual.setName("jPanelCamposAsistenciaMensual"); 

		this.jPanelCamposOcultosAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAsistenciaMensual.setName("jPanelCamposOcultosAsistenciaMensual"); 

        this.jPanelAccionesAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAsistenciaMensual.setToolTipText("Acciones");
        this.jPanelAccionesAsistenciaMensual.setName("Acciones"); 

		this.jPanelAccionesFormularioAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAsistenciaMensual.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAsistenciaMensual.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAsistenciaMensual.setText("Nuevo");
		this.jButtonModificarAsistenciaMensual.setText("Editar");
        this.jButtonActualizarAsistenciaMensual.setText("Actualizar");
        this.jButtonEliminarAsistenciaMensual.setText("Eliminar");
        this.jButtonCancelarAsistenciaMensual.setText("Cancelar");
        this.jButtonGuardarCambiosAsistenciaMensual.setText("Guardar");
		this.jButtonGuardarCambiosTablaAsistenciaMensual.setText("Guardar");
		this.jButtonCerrarAsistenciaMensual.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAsistenciaMensual,"nuevo_button","Nuevo",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAsistenciaMensual,"modificar_button","Editar",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAsistenciaMensual,"actualizar_button","Actualizar",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAsistenciaMensual,"eliminar_button","Eliminar",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAsistenciaMensual,"cancelar_button","Cancelar",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAsistenciaMensual,"guardarcambios_button","Guardar",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAsistenciaMensual,"guardarcambiostabla_button","Guardar",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAsistenciaMensual,"cerrar_button","Salir",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAsistenciaMensual.setToolTipText("Nuevo"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAsistenciaMensual.setToolTipText("Editar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAsistenciaMensual.setToolTipText("Actualizar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAsistenciaMensual.setToolTipText("Eliminar)"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAsistenciaMensual.setToolTipText("Cancelar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAsistenciaMensual.setToolTipText("Guardar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAsistenciaMensual.setToolTipText("Guardar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAsistenciaMensual.setToolTipText("Salir"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAsistenciaMensual";
		inputMap = this.jButtonNuevoAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAsistenciaMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAsistenciaMensual"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAsistenciaMensual";
		inputMap = this.jButtonActualizarAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAsistenciaMensual"));
		
		//ELIMINAR
		sMapKey = "EliminarAsistenciaMensual";
		inputMap = this.jButtonEliminarAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAsistenciaMensual"));
		
		//CANCELAR	
		sMapKey = "CancelarAsistenciaMensual";
		inputMap = this.jButtonCancelarAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAsistenciaMensual"));
		
		//CERRAR		
		sMapKey = "CerrarAsistenciaMensual";
		inputMap = this.jButtonCerrarAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAsistenciaMensual"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAsistenciaMensual";
		inputMap = this.jButtonGuardarCambiosTablaAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAsistenciaMensual"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAsistenciaMensual = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAsistenciaMensual.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAsistenciaMensual.setToolTipText("Nuevo AsistenciaMensual");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAsistenciaMensual = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAsistenciaMensual.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAsistenciaMensual.setToolTipText("Sin Cerrar Ventana AsistenciaMensual");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAsistenciaMensual = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAsistenciaMensual.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAsistenciaMensual.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAsistenciaMensual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAsistenciaMensual.setText("Accion");
		this.jComboBoxTiposAccionesAsistenciaMensual.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAsistenciaMensual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAsistenciaMensual.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAsistenciaMensual.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAsistenciaMensual = new JLabelMe();
		
		this.jLabelAccionesAsistenciaMensual.setText("Acciones");		
		this.jLabelAccionesAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAsistenciaMensual();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAsistenciaMensual();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAsistenciaMensual=new JTabbedPane();
		this.jTabbedPaneRelacionesAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAsistenciaMensual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsistenciaMensual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsistenciaMensual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAsistenciaMensual.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAsistenciaMensual.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAsistenciaMensual.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAsistenciaMensual = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAsistenciaMensual = new GridBagLayout();
		
		this.jPanelCamposAsistenciaMensual.setLayout(gridaBagLayoutCamposAsistenciaMensual);
		this.jPanelCamposOcultosAsistenciaMensual.setLayout(gridaBagLayoutCamposOcultosAsistenciaMensual);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAsistenciaMensual.add(jLabelIdAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAsistenciaMensual.add(jLabelidAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAsistenciaMensual.add(jLabelid_empresaAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAsistenciaMensual.add(jButtonid_empresaAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 3;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAsistenciaMensual.add(jButtonid_empresaAsistenciaMensualUpdate, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAsistenciaMensual.add(jComboBoxid_empresaAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoAsistenciaMensual.add(jLabelid_empleadoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 2;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoAsistenciaMensual.add(jButtonid_empleadoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 3;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoAsistenciaMensual.add(jButtonid_empleadoAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 4;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoAsistenciaMensual.add(jButtonid_empleadoAsistenciaMensualUpdate, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoAsistenciaMensual.add(jComboBoxid_empleadoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cargoAsistenciaMensual.add(jLabelid_cargoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cargoAsistenciaMensual.add(jButtonid_cargoAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 3;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cargoAsistenciaMensual.add(jButtonid_cargoAsistenciaMensualUpdate, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cargoAsistenciaMensual.add(jComboBoxid_cargoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraAsistenciaMensual.add(jLabelid_estructuraAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraAsistenciaMensual.add(jButtonid_estructuraAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 3;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraAsistenciaMensual.add(jButtonid_estructuraAsistenciaMensualUpdate, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraAsistenciaMensual.add(jComboBoxid_estructuraAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioAsistenciaMensual.add(jLabelid_anioAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioAsistenciaMensual.add(jButtonid_anioAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 3;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioAsistenciaMensual.add(jButtonid_anioAsistenciaMensualUpdate, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioAsistenciaMensual.add(jComboBoxid_anioAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesAsistenciaMensual.add(jLabelid_mesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesAsistenciaMensual.add(jButtonid_mesAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 3;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesAsistenciaMensual.add(jButtonid_mesAsistenciaMensualUpdate, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesAsistenciaMensual.add(jComboBoxid_mesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaAsistenciaMensual.add(jLabelfechaAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaAsistenciaMensual.add(jButtonfechaAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaAsistenciaMensual.add(jDateChooserfechaAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_trabajoAsistenciaMensual.add(jLabelhoras_trabajoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_trabajoAsistenciaMensual.add(jButtonhoras_trabajoAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_trabajoAsistenciaMensual.add(jTextFieldhoras_trabajoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_atrasoAsistenciaMensual.add(jLabelhoras_atrasoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_atrasoAsistenciaMensual.add(jButtonhoras_atrasoAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_atrasoAsistenciaMensual.add(jTextFieldhoras_atrasoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_faltasAsistenciaMensual.add(jLabelhoras_faltasAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_faltasAsistenciaMensual.add(jButtonhoras_faltasAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_faltasAsistenciaMensual.add(jTextFieldhoras_faltasAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_permisoAsistenciaMensual.add(jLabelhoras_permisoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_permisoAsistenciaMensual.add(jButtonhoras_permisoAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_permisoAsistenciaMensual.add(jTextFieldhoras_permisoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_extra25AsistenciaMensual.add(jLabelhoras_extra25AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_extra25AsistenciaMensual.add(jButtonhoras_extra25AsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_extra25AsistenciaMensual.add(jTextFieldhoras_extra25AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_extra50AsistenciaMensual.add(jLabelhoras_extra50AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_extra50AsistenciaMensual.add(jButtonhoras_extra50AsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_extra50AsistenciaMensual.add(jTextFieldhoras_extra50AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_extra100AsistenciaMensual.add(jLabelhoras_extra100AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_extra100AsistenciaMensual.add(jButtonhoras_extra100AsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_extra100AsistenciaMensual.add(jTextFieldhoras_extra100AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_extra150AsistenciaMensual.add(jLabelhoras_extra150AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_extra150AsistenciaMensual.add(jButtonhoras_extra150AsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_extra150AsistenciaMensual.add(jTextFieldhoras_extra150AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_extra0AsistenciaMensual.add(jLabelhoras_extra0AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_extra0AsistenciaMensual.add(jButtonhoras_extra0AsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_extra0AsistenciaMensual.add(jTextFieldhoras_extra0AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_enfermoAsistenciaMensual.add(jLabelhoras_enfermoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_enfermoAsistenciaMensual.add(jButtonhoras_enfermoAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_enfermoAsistenciaMensual.add(jTextFieldhoras_enfermoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_maternidadAsistenciaMensual.add(jLabelhoras_maternidadAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_maternidadAsistenciaMensual.add(jButtonhoras_maternidadAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_maternidadAsistenciaMensual.add(jTextFieldhoras_maternidadAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoras_vacacionAsistenciaMensual.add(jLabelhoras_vacacionAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoras_vacacionAsistenciaMensual.add(jButtonhoras_vacacionAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoras_vacacionAsistenciaMensual.add(jTextFieldhoras_vacacionAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_diasAsistenciaMensual.add(jLabelnumero_diasAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diasAsistenciaMensual.add(jButtonnumero_diasAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_diasAsistenciaMensual.add(jTextFieldnumero_diasAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_nochesAsistenciaMensual.add(jLabelnumero_nochesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_nochesAsistenciaMensual.add(jButtonnumero_nochesAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_nochesAsistenciaMensual.add(jTextFieldnumero_nochesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_feriadosAsistenciaMensual.add(jLabelnumero_feriadosAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_feriadosAsistenciaMensual.add(jButtonnumero_feriadosAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_feriadosAsistenciaMensual.add(jTextFieldnumero_feriadosAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_trabajoAsistenciaMensual.add(jLabelnumero_trabajoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 2;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
		this.gridBagConstraintsAsistenciaMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_trabajoAsistenciaMensual.add(jButtonnumero_trabajoAsistenciaMensualBusqueda, this.gridBagConstraintsAsistenciaMensual);
	}

	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsistenciaMensual.gridy = 0;
	this.gridBagConstraintsAsistenciaMensual.gridx = 1;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_trabajoAsistenciaMensual.add(jTextFieldnumero_trabajoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelidAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelid_empleadoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelid_cargoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelid_estructuraAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelid_anioAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelid_mesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelfechaAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelhoras_trabajoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelhoras_atrasoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelhoras_faltasAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelhoras_permisoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelhoras_extra25AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelhoras_extra50AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelhoras_extra100AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelhoras_extra150AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelhoras_extra0AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelhoras_enfermoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelhoras_maternidadAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelhoras_vacacionAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelnumero_diasAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelnumero_nochesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelnumero_feriadosAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsistenciaMensual.add(this.jPanelnumero_trabajoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposAsistenciaMensual % 3==0) {
		iXPanelCamposAsistenciaMensual=0;
		iYPanelCamposAsistenciaMensual++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsistenciaMensual.gridy = iYPanelCamposOcultosAsistenciaMensual;
	this.gridBagConstraintsAsistenciaMensual.gridx = iXPanelCamposOcultosAsistenciaMensual++;
	this.gridBagConstraintsAsistenciaMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsistenciaMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAsistenciaMensual.add(this.jPanelid_empresaAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);



	if(iXPanelCamposOcultosAsistenciaMensual % 3==0) {
		iXPanelCamposOcultosAsistenciaMensual=0;
		iYPanelCamposOcultosAsistenciaMensual++;
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
			
		GridBagLayout gridaBagLayoutAccionesAsistenciaMensual= new GridBagLayout();
		this.jPanelAccionesAsistenciaMensual.setLayout(gridaBagLayoutAccionesAsistenciaMensual);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAsistenciaMensual= new GridBagLayout();
		this.jPanelAccionesFormularioAsistenciaMensual.setLayout(gridaBagLayoutAccionesFormularioAsistenciaMensual);
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAsistenciaMensual.add(this.jComboBoxTiposAccionesFormularioAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAsistenciaMensual.add(this.jCheckBoxPostAccionNuevoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAsistenciaMensual.add(this.jCheckBoxPostAccionSinCerrarAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.asistenciamensualSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAsistenciaMensual.add(this.jCheckBoxPostAccionSinMensajeAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXAccion++;
			
		this.jPanelAccionesAsistenciaMensual.add(this.jButtonModificarAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);							

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx =iPosXAccion++;
			
		this.jPanelAccionesAsistenciaMensual.add(this.jButtonEliminarAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
			
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXAccion++;
		
		this.jPanelAccionesAsistenciaMensual.add(this.jButtonActualizarAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXAccion++;
		
		this.jPanelAccionesAsistenciaMensual.add(this.jButtonGuardarCambiosAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);	
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;		
		this.gridBagConstraintsAsistenciaMensual.gridx =iPosXAccion++;
		
		this.jPanelAccionesAsistenciaMensual.add(this.jButtonCancelarAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAsistenciaMensual);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();						
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsistenciaMensual.gridx = 0;		
			//this.gridBagConstraintsAsistenciaMensual.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAsistenciaMensual.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAsistenciaMensual.gridx =0;
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAsistenciaMensual.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AsistenciaMensualJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAsistenciaMensual = new AsistenciaMensualBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Asistencia Mensual DATOS");
			
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
			
	        //this.setTitle("[FOR] - Asistencia Mensual DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Asistencia Mensual Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AsistenciaMensualModel asistenciamensualModel=new AsistenciaMensualModel(this);
			
			//SI USARA CLASE INTERNA
			//AsistenciaMensualModel.AsistenciaMensualFocusTraversalPolicy asistenciamensualFocusTraversalPolicy = asistenciamensualModel.new AsistenciaMensualFocusTraversalPolicy(this);
			
			//asistenciamensualFocusTraversalPolicy.setasistenciamensualJInternalFrame(this);
			
			this.setFocusTraversalPolicy(asistenciamensualModel);
			
			
			this.jContentPaneDetalleAsistenciaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAsistenciaMensual = new GridBagLayout();	
			this.jContentPaneDetalleAsistenciaMensual.setLayout(gridaBagLayoutDetalleAsistenciaMensual);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAsistenciaMensual = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
				this.gridBagConstraintsAsistenciaMensual.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAsistenciaMensual.gridx = 0;
					
				
				this.jContentPaneDetalleAsistenciaMensual.add(jTtoolBarDetalleAsistenciaMensual, gridBagConstraintsAsistenciaMensual);								
				
}
			
			this.jScrollPanelDatosEdicionAsistenciaMensual=   new JScrollPane(jContentPaneDetalleAsistenciaMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAsistenciaMensual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsistenciaMensual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsistenciaMensual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAsistenciaMensual=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAsistenciaMensual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsistenciaMensual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsistenciaMensual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAsistenciaMensual.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	        
			this.jContentPaneDetalleAsistenciaMensual.add(jPanelCamposAsistenciaMensual, gridBagConstraintsAsistenciaMensual);
			
			
			
			
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
						&& asistenciamensualSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.asistenciamensualSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAsistenciaMensual= new GridBagConstraints();
						this.gridBagConstraintsAsistenciaMensual.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAsistenciaMensual.gridx = 0;
						this.jContentPaneDetalleAsistenciaMensual.add(this.jTabbedPaneRelacionesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAsistenciaMensual.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAsistenciaMensual.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
					this.gridBagConstraintsAsistenciaMensual.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAsistenciaMensual.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAsistenciaMensual.gridx = 0;
					
				
					this.jContentPaneDetalleAsistenciaMensual.add(jPanelCamposOcultosAsistenciaMensual, gridBagConstraintsAsistenciaMensual);
				
					this.jPanelCamposOcultosAsistenciaMensual.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	        this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAsistenciaMensual.add(this.jPanelAccionesFormularioAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);							
			
			
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
	        this.gridBagConstraintsAsistenciaMensual.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAsistenciaMensual.gridx = 0;
	        
			
			this.jContentPaneDetalleAsistenciaMensual.add(this.jPanelAccionesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAsistenciaMensual);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAsistenciaMensual=   new JScrollPane(this.jPanelCamposAsistenciaMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAsistenciaMensual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsistenciaMensual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsistenciaMensual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAsistenciaMensual.gridx = 0;
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAsistenciaMensual.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAsistenciaMensual.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);			
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAsistenciaMensual.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaMensual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
			
			
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaMensual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
			
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaMensual.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAsistenciaMensual;//jContentPane;
		
		return jScrollPanelDatosEdicionAsistenciaMensual;
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
