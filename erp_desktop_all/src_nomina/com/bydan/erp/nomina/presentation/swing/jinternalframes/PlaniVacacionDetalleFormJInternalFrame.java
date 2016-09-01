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
import com.bydan.erp.nomina.util.PlaniVacacionConstantesFunciones;

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
public class PlaniVacacionDetalleFormJInternalFrame extends PlaniVacacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePlaniVacacion;
	
	protected JMenuBar jmenuBarDetallePlaniVacacion;
	
	protected JMenu jmenuDetallePlaniVacacion;
	protected JMenu jmenuDetalleArchivoPlaniVacacion;
	protected JMenu jmenuDetalleAccionesPlaniVacacion;
	protected JMenu jmenuDetalleDatosPlaniVacacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePlaniVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPlaniVacacion;	
	protected GridBagConstraints gridBagConstraintsPlaniVacacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PlaniVacacionBeanSwingJInternalFrameAdditional jInternalFrameDetallePlaniVacacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EstructuraBeanSwingJInternalFrame estructuraseccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructuraseccion="";

	protected EstructuraBeanSwingJInternalFrame estructuracargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructuracargo="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public PlaniVacacionSessionBean planivacacionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EstructuraSessionBean estructuraseccionSessionBean;
	public EstructuraSessionBean estructuracargoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public PlaniVacacionLogic planivacacionLogic;
	
	public JScrollPane jScrollPanelDatosPlaniVacacion;
	public JScrollPane jScrollPanelDatosEdicionPlaniVacacion;
	public JScrollPane jScrollPanelDatosGeneralPlaniVacacion;
	
	protected JPanel jPanelCamposPlaniVacacion;    
	protected JPanel jPanelCamposOcultosPlaniVacacion;    	
	protected JPanel jPanelAccionesPlaniVacacion;
	protected JPanel jPanelAccionesFormularioPlaniVacacion;
    
	
	
	protected Integer iXPanelCamposPlaniVacacion=0;
	protected Integer iYPanelCamposPlaniVacacion=0;
	
	protected Integer iXPanelCamposOcultosPlaniVacacion=0;
	protected Integer iYPanelCamposOcultosPlaniVacacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPlaniVacacion;
	public JButton jButtonModificarPlaniVacacion;
	public JButton jButtonActualizarPlaniVacacion;
    public JButton jButtonEliminarPlaniVacacion;
	public JButton jButtonCancelarPlaniVacacion;
    public JButton jButtonGuardarCambiosPlaniVacacion;
	public JButton jButtonGuardarCambiosTablaPlaniVacacion;
	protected JButton jButtonCerrarPlaniVacacion;
	
	
	protected JButton jButtonProcesarInformacionPlaniVacacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPlaniVacacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPlaniVacacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajePlaniVacacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPlaniVacacion;
	protected JButton jButtonModificarToolBarPlaniVacacion;
	protected JButton jButtonActualizarToolBarPlaniVacacion;
    protected JButton jButtonEliminarToolBarPlaniVacacion;
	protected JButton jButtonCancelarToolBarPlaniVacacion;
    protected JButton jButtonGuardarCambiosToolBarPlaniVacacion;
	protected JButton jButtonGuardarCambiosTablaToolBarPlaniVacacion;
	protected JButton jButtonMostrarOcultarTablaToolBarPlaniVacacion;
	protected JButton jButtonCerrarToolBarPlaniVacacion;
	
	protected JButton jButtonProcesarInformacionToolBarPlaniVacacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPlaniVacacion;
	protected JMenuItem jMenuItemModificarPlaniVacacion;
	protected JMenuItem jMenuItemActualizarPlaniVacacion;
    protected JMenuItem jMenuItemEliminarPlaniVacacion;
	protected JMenuItem jMenuItemCancelarPlaniVacacion;
    protected JMenuItem jMenuItemGuardarCambiosPlaniVacacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaPlaniVacacion;
	protected JMenuItem jMenuItemCerrarPlaniVacacion;
	protected JMenuItem jMenuItemDetalleCerrarPlaniVacacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarPlaniVacacion;
	
	protected JMenuItem jMenuItemProcesarInformacionPlaniVacacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPlaniVacacion;
	protected JMenuItem jMenuItemMostrarOcultarPlaniVacacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPlaniVacacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPlaniVacacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPlaniVacacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPlaniVacacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPlaniVacacion;
	public JLabel jLabelIdPlaniVacacion;
	public JLabel jLabelidPlaniVacacion;
	public JButton jButtonidPlaniVacacionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioPlaniVacacion;
	public JLabel jLabelfecha_inicioPlaniVacacion;
	//public JFormattedTextField jDateChooserfecha_inicioPlaniVacacion;

	public JDateChooser jDateChooserfecha_inicioPlaniVacacion;
	public JButton jButtonfecha_inicioPlaniVacacionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finPlaniVacacion;
	public JLabel jLabelfecha_finPlaniVacacion;
	//public JFormattedTextField jDateChooserfecha_finPlaniVacacion;

	public JDateChooser jDateChooserfecha_finPlaniVacacion;
	public JButton jButtonfecha_finPlaniVacacionBusqueda= new JButtonMe();

	public JPanel jPaneldias_anioPlaniVacacion;
	public JLabel jLabeldias_anioPlaniVacacion;
	public JTextField jTextFielddias_anioPlaniVacacion;
	public JButton jButtondias_anioPlaniVacacionBusqueda= new JButtonMe();

	public JPanel jPaneldias_realizadasPlaniVacacion;
	public JLabel jLabeldias_realizadasPlaniVacacion;
	public JTextField jTextFielddias_realizadasPlaniVacacion;
	public JButton jButtondias_realizadasPlaniVacacionBusqueda= new JButtonMe();

	public JPanel jPaneldias_pendientePlaniVacacion;
	public JLabel jLabeldias_pendientePlaniVacacion;
	public JTextField jTextFielddias_pendientePlaniVacacion;
	public JButton jButtondias_pendientePlaniVacacionBusqueda= new JButtonMe();

	public JPanel jPaneldias_tomadosPlaniVacacion;
	public JLabel jLabeldias_tomadosPlaniVacacion;
	public JTextField jTextFielddias_tomadosPlaniVacacion;
	public JButton jButtondias_tomadosPlaniVacacionBusqueda= new JButtonMe();

	public JPanel jPaneldias_anticipadasPlaniVacacion;
	public JLabel jLabeldias_anticipadasPlaniVacacion;
	public JTextField jTextFielddias_anticipadasPlaniVacacion;
	public JButton jButtondias_anticipadasPlaniVacacionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPlaniVacacion;
	public JLabel jLabeldescripcionPlaniVacacion;
	public JTextArea jTextAreadescripcionPlaniVacacion;
	public JScrollPane jscrollPanedescripcionPlaniVacacion;
	public JButton jButtondescripcionPlaniVacacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPlaniVacacion;
	public JLabel jLabelid_empresaPlaniVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPlaniVacacion;
	public JButton jButtonid_empresaPlaniVacacion= new JButtonMe();
	public JButton jButtonid_empresaPlaniVacacionUpdate= new JButtonMe();
	public JButton jButtonid_empresaPlaniVacacionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPlaniVacacion;
	public JLabel jLabelid_sucursalPlaniVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPlaniVacacion;
	public JButton jButtonid_sucursalPlaniVacacion= new JButtonMe();
	public JButton jButtonid_sucursalPlaniVacacionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPlaniVacacionBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraPlaniVacacion;
	public JLabel jLabelid_estructuraPlaniVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraPlaniVacacion;
	public JButton jButtonid_estructuraPlaniVacacion= new JButtonMe();
	public JButton jButtonid_estructuraPlaniVacacionUpdate= new JButtonMe();
	public JButton jButtonid_estructuraPlaniVacacionBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraPlaniVacacionArbol= new JButtonMe();

	public JPanel jPanelid_estructura_seccionPlaniVacacion;
	public JLabel jLabelid_estructura_seccionPlaniVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructura_seccionPlaniVacacion;
	public JButton jButtonid_estructura_seccionPlaniVacacion= new JButtonMe();
	public JButton jButtonid_estructura_seccionPlaniVacacionUpdate= new JButtonMe();
	public JButton jButtonid_estructura_seccionPlaniVacacionBusqueda= new JButtonMe();
	public JButton jButtonid_estructura_seccionPlaniVacacionArbol= new JButtonMe();

	public JPanel jPanelid_estructura_cargoPlaniVacacion;
	public JLabel jLabelid_estructura_cargoPlaniVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructura_cargoPlaniVacacion;
	public JButton jButtonid_estructura_cargoPlaniVacacion= new JButtonMe();
	public JButton jButtonid_estructura_cargoPlaniVacacionUpdate= new JButtonMe();
	public JButton jButtonid_estructura_cargoPlaniVacacionBusqueda= new JButtonMe();
	public JButton jButtonid_estructura_cargoPlaniVacacionArbol= new JButtonMe();

	public JPanel jPanelid_empleadoPlaniVacacion;
	public JLabel jLabelid_empleadoPlaniVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoPlaniVacacion;
	public JButton jButtonid_empleadoPlaniVacacion= new JButtonMe();
	public JButton jButtonid_empleadoPlaniVacacionUpdate= new JButtonMe();
	public JButton jButtonid_empleadoPlaniVacacionBusqueda= new JButtonMe();

	public JPanel jPanelid_mesPlaniVacacion;
	public JLabel jLabelid_mesPlaniVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesPlaniVacacion;
	public JButton jButtonid_mesPlaniVacacion= new JButtonMe();
	public JButton jButtonid_mesPlaniVacacionUpdate= new JButtonMe();
	public JButton jButtonid_mesPlaniVacacionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPlaniVacacion;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PlaniVacacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPlaniVacacion=new JPanel();
				this.jPanelAccionesFormularioPlaniVacacion=new JPanel();
				this.jmenuBarDetallePlaniVacacion=new JMenuBar();
				this.jTtoolBarDetallePlaniVacacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaniVacacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PlaniVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PlaniVacacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PlaniVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaniVacacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlaniVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaniVacacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlaniVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaniVacacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PlaniVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPlaniVacacion() {
		return this.jButtonActualizarToolBarPlaniVacacion;
	}
	
	public JButton getjButtonEliminarToolBarPlaniVacacion() {
		return this.jButtonEliminarToolBarPlaniVacacion;
	}
	
	public JButton getjButtonCancelarToolBarPlaniVacacion() {
		return this.jButtonCancelarToolBarPlaniVacacion;
	}		
	
	public JButton getjButtonProcesarInformacionPlaniVacacion() {
		return this.jButtonProcesarInformacionPlaniVacacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPlaniVacacion)	{
		this.jButtonProcesarInformacionPlaniVacacion = jButtonProcesarInformacionPlaniVacacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPlaniVacacion() {
		return this.jComboBoxTiposAccionesPlaniVacacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPlaniVacacion(
			JComboBox jComboBoxTiposRelacionesPlaniVacacion) {
		this.jComboBoxTiposRelacionesPlaniVacacion = jComboBoxTiposRelacionesPlaniVacacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPlaniVacacion(
			JComboBox jComboBoxTiposAccionesPlaniVacacion) {
		this.jComboBoxTiposAccionesPlaniVacacion = jComboBoxTiposAccionesPlaniVacacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPlaniVacacion() {
		return this.jComboBoxTiposAccionesFormularioPlaniVacacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPlaniVacacion(
			JComboBox jComboBoxTiposAccionesFormularioPlaniVacacion) {
		this.jComboBoxTiposAccionesFormularioPlaniVacacion = jComboBoxTiposAccionesFormularioPlaniVacacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.planivacacionSessionBean=new PlaniVacacionSessionBean();
		
		this.planivacacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.planivacacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.planivacacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PlaniVacacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PlaniVacacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PlaniVacacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Plani Vacacion MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
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
	
		PlaniVacacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePlaniVacacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPlaniVacacion=new JButtonMe();
				this.jButtonModificarToolBarPlaniVacacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPlaniVacacion,this.jTtoolBarDetallePlaniVacacion,
							"actualizar","actualizar","Actualizar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPlaniVacacion,this.jTtoolBarDetallePlaniVacacion,
							"eliminar","eliminar","Eliminar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPlaniVacacion,this.jTtoolBarDetallePlaniVacacion,
							"cancelar","cancelar","Cancelar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPlaniVacacion,this.jTtoolBarDetallePlaniVacacion,
							"guardarcambios","guardarcambios","Guardar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePlaniVacacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePlaniVacacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPlaniVacacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPlaniVacacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPlaniVacacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPlaniVacacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPlaniVacacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPlaniVacacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPlaniVacacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPlaniVacacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPlaniVacacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPlaniVacacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPlaniVacacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPlaniVacacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPlaniVacacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPlaniVacacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPlaniVacacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPlaniVacacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPlaniVacacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPlaniVacacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPlaniVacacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPlaniVacacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPlaniVacacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPlaniVacacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPlaniVacacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPlaniVacacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPlaniVacacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPlaniVacacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPlaniVacacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPlaniVacacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPlaniVacacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPlaniVacacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPlaniVacacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPlaniVacacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPlaniVacacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPlaniVacacion.add(this.jMenuItemDetalleCerrarPlaniVacacion);
		
		this.jmenuDetalleAccionesPlaniVacacion.add(this.jMenuItemActualizarPlaniVacacion);
		this.jmenuDetalleAccionesPlaniVacacion.add(this.jMenuItemEliminarPlaniVacacion);
		this.jmenuDetalleAccionesPlaniVacacion.add(this.jMenuItemCancelarPlaniVacacion);		
		
		//this.jmenuDetalleDatosPlaniVacacion.add(this.jMenuItemDetalleAbrirOrderByPlaniVacacion);				
		this.jmenuDetalleDatosPlaniVacacion.add(this.jMenuItemDetalleMostarOcultarPlaniVacacion);				
				
		//this.jmenuDetalleAccionesPlaniVacacion.add(this.jMenuItemGuardarCambiosPlaniVacacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePlaniVacacion.add(this.jmenuDetalleArchivoPlaniVacacion);		
		this.jmenuBarDetallePlaniVacacion.add(this.jmenuDetalleAccionesPlaniVacacion);		
		this.jmenuBarDetallePlaniVacacion.add(this.jmenuDetalleDatosPlaniVacacion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePlaniVacacion);				
	}
	
	
	public void inicializarElementosCamposPlaniVacacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPlaniVacacion = new JLabelMe();
		jLabelIdPlaniVacacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPlaniVacacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPlaniVacacion= new GridBagLayout();

		this.jPanelidPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);

		jLabelidPlaniVacacion = new JLabel();
		jLabelidPlaniVacacion.setText("Id");

		jLabelidPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioPlaniVacacion = new JLabelMe();
		this.jLabelfecha_inicioPlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioPlaniVacacion.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPanelfecha_inicioPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		//jFormattedTextFieldfecha_inicioPlaniVacacion= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioPlaniVacacion= new JDateChooser();
		jDateChooserfecha_inicioPlaniVacacion.setEnabled(false);
		jDateChooserfecha_inicioPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioPlaniVacacion.setDate(new Date());
		jDateChooserfecha_inicioPlaniVacacion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioPlaniVacacion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioPlaniVacacionBusqueda= new JButtonMe();
		this.jButtonfecha_inicioPlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioPlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioPlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioPlaniVacacionBusqueda.setText("U");
		this.jButtonfecha_inicioPlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioPlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioPlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioPlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioPlaniVacacionBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finPlaniVacacion = new JLabelMe();
		this.jLabelfecha_finPlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finPlaniVacacion.setToolTipText("Fecha Fin");
		this.jLabelfecha_finPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPanelfecha_finPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		//jFormattedTextFieldfecha_finPlaniVacacion= new JFormattedTextFieldMe();

		jDateChooserfecha_finPlaniVacacion= new JDateChooser();
		jDateChooserfecha_finPlaniVacacion.setEnabled(false);
		jDateChooserfecha_finPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finPlaniVacacion.setDate(new Date());
		jDateChooserfecha_finPlaniVacacion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finPlaniVacacion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finPlaniVacacionBusqueda= new JButtonMe();
		this.jButtonfecha_finPlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finPlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finPlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finPlaniVacacionBusqueda.setText("U");
		this.jButtonfecha_finPlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finPlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finPlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finPlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finPlaniVacacionBusqueda.setVisible(false);		}


					
		this.jLabeldias_anioPlaniVacacion = new JLabelMe();
		this.jLabeldias_anioPlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_DIASANIO+" : *");
		this.jLabeldias_anioPlaniVacacion.setToolTipText("Dias Anio");
		this.jLabeldias_anioPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldias_anioPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldias_anioPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldias_anioPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldias_anioPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldias_anioPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_DIASANIO);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPaneldias_anioPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		jTextFielddias_anioPlaniVacacion= new JTextFieldMe();
		jTextFielddias_anioPlaniVacacion.setEnabled(false);
		jTextFielddias_anioPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_anioPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_anioPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddias_anioPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddias_anioPlaniVacacion.setText("0.0");

		this.jButtondias_anioPlaniVacacionBusqueda= new JButtonMe();
		this.jButtondias_anioPlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_anioPlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_anioPlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondias_anioPlaniVacacionBusqueda.setText("U");
		this.jButtondias_anioPlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondias_anioPlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondias_anioPlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddias_anioPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddias_anioPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dias_anioPlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondias_anioPlaniVacacionBusqueda.setVisible(false);		}


					
		this.jLabeldias_realizadasPlaniVacacion = new JLabelMe();
		this.jLabeldias_realizadasPlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS+" : *");
		this.jLabeldias_realizadasPlaniVacacion.setToolTipText("Dias Realizadas");
		this.jLabeldias_realizadasPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldias_realizadasPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldias_realizadasPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldias_realizadasPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldias_realizadasPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldias_realizadasPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_DIASREALIZADAS);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPaneldias_realizadasPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		jTextFielddias_realizadasPlaniVacacion= new JTextFieldMe();
		jTextFielddias_realizadasPlaniVacacion.setEnabled(false);
		jTextFielddias_realizadasPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_realizadasPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_realizadasPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddias_realizadasPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddias_realizadasPlaniVacacion.setText("0.0");

		this.jButtondias_realizadasPlaniVacacionBusqueda= new JButtonMe();
		this.jButtondias_realizadasPlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_realizadasPlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_realizadasPlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondias_realizadasPlaniVacacionBusqueda.setText("U");
		this.jButtondias_realizadasPlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondias_realizadasPlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondias_realizadasPlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddias_realizadasPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddias_realizadasPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dias_realizadasPlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondias_realizadasPlaniVacacionBusqueda.setVisible(false);		}


					
		this.jLabeldias_pendientePlaniVacacion = new JLabelMe();
		this.jLabeldias_pendientePlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE+" : *");
		this.jLabeldias_pendientePlaniVacacion.setToolTipText("Dias Pendiente");
		this.jLabeldias_pendientePlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldias_pendientePlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldias_pendientePlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldias_pendientePlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldias_pendientePlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldias_pendientePlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_DIASPENDIENTE);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPaneldias_pendientePlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		jTextFielddias_pendientePlaniVacacion= new JTextFieldMe();
		jTextFielddias_pendientePlaniVacacion.setEnabled(false);
		jTextFielddias_pendientePlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_pendientePlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_pendientePlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddias_pendientePlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddias_pendientePlaniVacacion.setText("0.0");

		this.jButtondias_pendientePlaniVacacionBusqueda= new JButtonMe();
		this.jButtondias_pendientePlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_pendientePlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_pendientePlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondias_pendientePlaniVacacionBusqueda.setText("U");
		this.jButtondias_pendientePlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondias_pendientePlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondias_pendientePlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddias_pendientePlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddias_pendientePlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dias_pendientePlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondias_pendientePlaniVacacionBusqueda.setVisible(false);		}


					
		this.jLabeldias_tomadosPlaniVacacion = new JLabelMe();
		this.jLabeldias_tomadosPlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS+" : *");
		this.jLabeldias_tomadosPlaniVacacion.setToolTipText("Dias Tomados");
		this.jLabeldias_tomadosPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldias_tomadosPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldias_tomadosPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldias_tomadosPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldias_tomadosPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldias_tomadosPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_DIASTOMADOS);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPaneldias_tomadosPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		jTextFielddias_tomadosPlaniVacacion= new JTextFieldMe();
		jTextFielddias_tomadosPlaniVacacion.setEnabled(false);
		jTextFielddias_tomadosPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_tomadosPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_tomadosPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddias_tomadosPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddias_tomadosPlaniVacacion.setText("0.0");

		this.jButtondias_tomadosPlaniVacacionBusqueda= new JButtonMe();
		this.jButtondias_tomadosPlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_tomadosPlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_tomadosPlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondias_tomadosPlaniVacacionBusqueda.setText("U");
		this.jButtondias_tomadosPlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondias_tomadosPlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondias_tomadosPlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddias_tomadosPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddias_tomadosPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dias_tomadosPlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondias_tomadosPlaniVacacionBusqueda.setVisible(false);		}


					
		this.jLabeldias_anticipadasPlaniVacacion = new JLabelMe();
		this.jLabeldias_anticipadasPlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS+" : *");
		this.jLabeldias_anticipadasPlaniVacacion.setToolTipText("Dias Anticipadas");
		this.jLabeldias_anticipadasPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldias_anticipadasPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldias_anticipadasPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldias_anticipadasPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldias_anticipadasPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldias_anticipadasPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_DIASANTICIPADAS);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPaneldias_anticipadasPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		jTextFielddias_anticipadasPlaniVacacion= new JTextFieldMe();
		jTextFielddias_anticipadasPlaniVacacion.setEnabled(false);
		jTextFielddias_anticipadasPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_anticipadasPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddias_anticipadasPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddias_anticipadasPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddias_anticipadasPlaniVacacion.setText("0.0");

		this.jButtondias_anticipadasPlaniVacacionBusqueda= new JButtonMe();
		this.jButtondias_anticipadasPlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_anticipadasPlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondias_anticipadasPlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondias_anticipadasPlaniVacacionBusqueda.setText("U");
		this.jButtondias_anticipadasPlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondias_anticipadasPlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondias_anticipadasPlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddias_anticipadasPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddias_anticipadasPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dias_anticipadasPlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondias_anticipadasPlaniVacacionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPlaniVacacion = new JLabelMe();
		this.jLabeldescripcionPlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionPlaniVacacion.setToolTipText("Descripcion");
		this.jLabeldescripcionPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPaneldescripcionPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		jTextAreadescripcionPlaniVacacion= new JTextAreaMe();
		jTextAreadescripcionPlaniVacacion.setEnabled(false);
		jTextAreadescripcionPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPlaniVacacion.setLineWrap(true);
		jTextAreadescripcionPlaniVacacion.setWrapStyleWord(true);
		jTextAreadescripcionPlaniVacacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPlaniVacacion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPlaniVacacion = new JScrollPane(jTextAreadescripcionPlaniVacacion);
		jscrollPanedescripcionPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionPlaniVacacionBusqueda= new JButtonMe();
		this.jButtondescripcionPlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPlaniVacacionBusqueda.setText("U");
		this.jButtondescripcionPlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPlaniVacacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPlaniVacacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPlaniVacacion = new JLabelMe();
		this.jLabelid_empresaPlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPlaniVacacion.setToolTipText("Empresa");
		this.jLabelid_empresaPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPanelid_empresaPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		jComboBoxid_empresaPlaniVacacion= new JComboBoxMe();
		jComboBoxid_empresaPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPlaniVacacion.setEnabled(false);

		this.jButtonid_empresaPlaniVacacion= new JButtonMe();
		this.jButtonid_empresaPlaniVacacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPlaniVacacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPlaniVacacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPlaniVacacion.setText("Buscar");
		this.jButtonid_empresaPlaniVacacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPlaniVacacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPlaniVacacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPlaniVacacion"));

		this.jButtonid_empresaPlaniVacacionBusqueda= new JButtonMe();
		this.jButtonid_empresaPlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPlaniVacacionBusqueda.setText("U");
		this.jButtonid_empresaPlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPlaniVacacionBusqueda.setVisible(false);		}

		this.jButtonid_empresaPlaniVacacionUpdate= new JButtonMe();
		this.jButtonid_empresaPlaniVacacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlaniVacacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPlaniVacacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPlaniVacacionUpdate.setText("U");
		this.jButtonid_empresaPlaniVacacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPlaniVacacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPlaniVacacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPlaniVacacionUpdate"));



					
		this.jLabelid_sucursalPlaniVacacion = new JLabelMe();
		this.jLabelid_sucursalPlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPlaniVacacion.setToolTipText("Sucursal");
		this.jLabelid_sucursalPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPanelid_sucursalPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		jComboBoxid_sucursalPlaniVacacion= new JComboBoxMe();
		jComboBoxid_sucursalPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPlaniVacacion.setEnabled(false);

		this.jButtonid_sucursalPlaniVacacion= new JButtonMe();
		this.jButtonid_sucursalPlaniVacacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPlaniVacacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPlaniVacacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPlaniVacacion.setText("Buscar");
		this.jButtonid_sucursalPlaniVacacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPlaniVacacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPlaniVacacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPlaniVacacion"));

		this.jButtonid_sucursalPlaniVacacionBusqueda= new JButtonMe();
		this.jButtonid_sucursalPlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPlaniVacacionBusqueda.setText("U");
		this.jButtonid_sucursalPlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPlaniVacacionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPlaniVacacionUpdate= new JButtonMe();
		this.jButtonid_sucursalPlaniVacacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPlaniVacacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPlaniVacacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPlaniVacacionUpdate.setText("U");
		this.jButtonid_sucursalPlaniVacacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPlaniVacacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPlaniVacacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPlaniVacacionUpdate"));



					
		this.jLabelid_estructuraPlaniVacacion = new JLabelMe();
		this.jLabelid_estructuraPlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraPlaniVacacion.setToolTipText("Estructura");
		this.jLabelid_estructuraPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPanelid_estructuraPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		jComboBoxid_estructuraPlaniVacacion= new JComboBoxMe();
		jComboBoxid_estructuraPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraPlaniVacacion= new JButtonMe();
		this.jButtonid_estructuraPlaniVacacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraPlaniVacacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraPlaniVacacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraPlaniVacacion.setText("Buscar");
		this.jButtonid_estructuraPlaniVacacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraPlaniVacacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraPlaniVacacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraPlaniVacacion"));

		this.jButtonid_estructuraPlaniVacacionBusqueda= new JButtonMe();
		this.jButtonid_estructuraPlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraPlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraPlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraPlaniVacacionBusqueda.setText("U");
		this.jButtonid_estructuraPlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraPlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraPlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraPlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraPlaniVacacionBusqueda.setVisible(false);		}

		this.jButtonid_estructuraPlaniVacacionUpdate= new JButtonMe();
		this.jButtonid_estructuraPlaniVacacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraPlaniVacacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraPlaniVacacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraPlaniVacacionUpdate.setText("U");
		this.jButtonid_estructuraPlaniVacacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraPlaniVacacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraPlaniVacacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraPlaniVacacionUpdate"));


		jButtonid_estructuraPlaniVacacionArbol= new JButtonMe();
		jButtonid_estructuraPlaniVacacionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraPlaniVacacionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraPlaniVacacionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraPlaniVacacionArbol.setText("Arbol");
		jButtonid_estructuraPlaniVacacionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraPlaniVacacionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraPlaniVacacionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraPlaniVacacionArbol"));



					
		this.jLabelid_estructura_seccionPlaniVacacion = new JLabelMe();
		this.jLabelid_estructura_seccionPlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION+" : *");
		this.jLabelid_estructura_seccionPlaniVacacion.setToolTipText("Estructura Seccion");
		this.jLabelid_estructura_seccionPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estructura_seccionPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estructura_seccionPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructura_seccionPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructura_seccionPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructura_seccionPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURASECCION);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPanelid_estructura_seccionPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		jComboBoxid_estructura_seccionPlaniVacacion= new JComboBoxMe();
		jComboBoxid_estructura_seccionPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_seccionPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_seccionPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructura_seccionPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructura_seccionPlaniVacacion= new JButtonMe();
		this.jButtonid_estructura_seccionPlaniVacacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructura_seccionPlaniVacacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructura_seccionPlaniVacacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructura_seccionPlaniVacacion.setText("Buscar");
		this.jButtonid_estructura_seccionPlaniVacacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructura_seccionPlaniVacacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_seccionPlaniVacacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructura_seccionPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_seccionPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_seccionPlaniVacacion"));

		this.jButtonid_estructura_seccionPlaniVacacionBusqueda= new JButtonMe();
		this.jButtonid_estructura_seccionPlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_seccionPlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_seccionPlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructura_seccionPlaniVacacionBusqueda.setText("U");
		this.jButtonid_estructura_seccionPlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructura_seccionPlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_seccionPlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructura_seccionPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_seccionPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_seccionPlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructura_seccionPlaniVacacionBusqueda.setVisible(false);		}

		this.jButtonid_estructura_seccionPlaniVacacionUpdate= new JButtonMe();
		this.jButtonid_estructura_seccionPlaniVacacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_seccionPlaniVacacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_seccionPlaniVacacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructura_seccionPlaniVacacionUpdate.setText("U");
		this.jButtonid_estructura_seccionPlaniVacacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructura_seccionPlaniVacacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_seccionPlaniVacacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructura_seccionPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_seccionPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_seccionPlaniVacacionUpdate"));


		jButtonid_estructura_seccionPlaniVacacionArbol= new JButtonMe();
		jButtonid_estructura_seccionPlaniVacacionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructura_seccionPlaniVacacionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructura_seccionPlaniVacacionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructura_seccionPlaniVacacionArbol.setText("Arbol");
		jButtonid_estructura_seccionPlaniVacacionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructura_seccionPlaniVacacionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_seccionPlaniVacacionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructura_seccionPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_seccionPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_seccionPlaniVacacionArbol"));



					
		this.jLabelid_estructura_cargoPlaniVacacion = new JLabelMe();
		this.jLabelid_estructura_cargoPlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO+" : *");
		this.jLabelid_estructura_cargoPlaniVacacion.setToolTipText("Estructura Cargo");
		this.jLabelid_estructura_cargoPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estructura_cargoPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estructura_cargoPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructura_cargoPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructura_cargoPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructura_cargoPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_IDESTRUCTURACARGO);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPanelid_estructura_cargoPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		jComboBoxid_estructura_cargoPlaniVacacion= new JComboBoxMe();
		jComboBoxid_estructura_cargoPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_cargoPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_cargoPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructura_cargoPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructura_cargoPlaniVacacion= new JButtonMe();
		this.jButtonid_estructura_cargoPlaniVacacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructura_cargoPlaniVacacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructura_cargoPlaniVacacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructura_cargoPlaniVacacion.setText("Buscar");
		this.jButtonid_estructura_cargoPlaniVacacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructura_cargoPlaniVacacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_cargoPlaniVacacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructura_cargoPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_cargoPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_cargoPlaniVacacion"));

		this.jButtonid_estructura_cargoPlaniVacacionBusqueda= new JButtonMe();
		this.jButtonid_estructura_cargoPlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_cargoPlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_cargoPlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructura_cargoPlaniVacacionBusqueda.setText("U");
		this.jButtonid_estructura_cargoPlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructura_cargoPlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_cargoPlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructura_cargoPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_cargoPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_cargoPlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructura_cargoPlaniVacacionBusqueda.setVisible(false);		}

		this.jButtonid_estructura_cargoPlaniVacacionUpdate= new JButtonMe();
		this.jButtonid_estructura_cargoPlaniVacacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_cargoPlaniVacacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_cargoPlaniVacacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructura_cargoPlaniVacacionUpdate.setText("U");
		this.jButtonid_estructura_cargoPlaniVacacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructura_cargoPlaniVacacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_cargoPlaniVacacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructura_cargoPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_cargoPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_cargoPlaniVacacionUpdate"));


		jButtonid_estructura_cargoPlaniVacacionArbol= new JButtonMe();
		jButtonid_estructura_cargoPlaniVacacionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructura_cargoPlaniVacacionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructura_cargoPlaniVacacionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructura_cargoPlaniVacacionArbol.setText("Arbol");
		jButtonid_estructura_cargoPlaniVacacionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructura_cargoPlaniVacacionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_cargoPlaniVacacionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructura_cargoPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_cargoPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_cargoPlaniVacacionArbol"));



					
		this.jLabelid_empleadoPlaniVacacion = new JLabelMe();
		this.jLabelid_empleadoPlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoPlaniVacacion.setToolTipText("Empleado");
		this.jLabelid_empleadoPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPanelid_empleadoPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		jComboBoxid_empleadoPlaniVacacion= new JComboBoxMe();
		jComboBoxid_empleadoPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoPlaniVacacion= new JButtonMe();
		this.jButtonid_empleadoPlaniVacacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPlaniVacacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPlaniVacacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPlaniVacacion.setText("Buscar");
		this.jButtonid_empleadoPlaniVacacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoPlaniVacacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPlaniVacacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPlaniVacacion"));

		this.jButtonid_empleadoPlaniVacacionBusqueda= new JButtonMe();
		this.jButtonid_empleadoPlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPlaniVacacionBusqueda.setText("U");
		this.jButtonid_empleadoPlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoPlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoPlaniVacacionBusqueda.setVisible(false);		}

		this.jButtonid_empleadoPlaniVacacionUpdate= new JButtonMe();
		this.jButtonid_empleadoPlaniVacacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPlaniVacacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPlaniVacacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPlaniVacacionUpdate.setText("U");
		this.jButtonid_empleadoPlaniVacacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoPlaniVacacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPlaniVacacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPlaniVacacionUpdate"));



					
		this.jLabelid_mesPlaniVacacion = new JLabelMe();
		this.jLabelid_mesPlaniVacacion.setText(""+PlaniVacacionConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesPlaniVacacion.setToolTipText("Mes");
		this.jLabelid_mesPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesPlaniVacacion.setToolTipText(PlaniVacacionConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutPlaniVacacion = new GridBagLayout();
		this.jPanelid_mesPlaniVacacion.setLayout(this.gridaBagLayoutPlaniVacacion);


		jComboBoxid_mesPlaniVacacion= new JComboBoxMe();
		jComboBoxid_mesPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesPlaniVacacion= new JButtonMe();
		this.jButtonid_mesPlaniVacacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPlaniVacacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPlaniVacacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPlaniVacacion.setText("Buscar");
		this.jButtonid_mesPlaniVacacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesPlaniVacacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPlaniVacacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPlaniVacacion"));

		this.jButtonid_mesPlaniVacacionBusqueda= new JButtonMe();
		this.jButtonid_mesPlaniVacacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPlaniVacacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPlaniVacacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPlaniVacacionBusqueda.setText("U");
		this.jButtonid_mesPlaniVacacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesPlaniVacacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPlaniVacacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPlaniVacacionBusqueda"));

		if(this.planivacacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesPlaniVacacionBusqueda.setVisible(false);		}

		this.jButtonid_mesPlaniVacacionUpdate= new JButtonMe();
		this.jButtonid_mesPlaniVacacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPlaniVacacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPlaniVacacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPlaniVacacionUpdate.setText("U");
		this.jButtonid_mesPlaniVacacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesPlaniVacacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPlaniVacacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesPlaniVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPlaniVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPlaniVacacionUpdate"));



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
		//this.jInternalFrameDetallePlaniVacacion = new PlaniVacacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Plani Vacacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPlaniVacacion= new GridBagLayout();
		

		
		String sToolTipPlaniVacacion="";
		sToolTipPlaniVacacion=PlaniVacacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPlaniVacacion+="(Nomina.PlaniVacacion)";
		}
		
		if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipPlaniVacacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPlaniVacacion = new JButtonMe();
		this.jButtonModificarPlaniVacacion = new JButtonMe();
        this.jButtonActualizarPlaniVacacion = new JButtonMe();
        this.jButtonEliminarPlaniVacacion = new JButtonMe();
        this.jButtonCancelarPlaniVacacion = new JButtonMe();
        this.jButtonGuardarCambiosPlaniVacacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaPlaniVacacion = new JButtonMe();
		this.jButtonCerrarPlaniVacacion = new JButtonMe();
		
		this.jScrollPanelDatosPlaniVacacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionPlaniVacacion = new JScrollPane();
		this.jScrollPanelDatosGeneralPlaniVacacion = new JScrollPane();
				
		
		
		this.jPanelCamposPlaniVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPlaniVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPlaniVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPlaniVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Plani Vacacion";
		
		if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Plani Vacaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosPlaniVacacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPlaniVacacion.setName("jPanelCamposPlaniVacacion"); 

		this.jPanelCamposOcultosPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPlaniVacacion.setName("jPanelCamposOcultosPlaniVacacion"); 

        this.jPanelAccionesPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPlaniVacacion.setToolTipText("Acciones");
        this.jPanelAccionesPlaniVacacion.setName("Acciones"); 

		this.jPanelAccionesFormularioPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPlaniVacacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPlaniVacacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPlaniVacacion.setText("Nuevo");
		this.jButtonModificarPlaniVacacion.setText("Editar");
        this.jButtonActualizarPlaniVacacion.setText("Actualizar");
        this.jButtonEliminarPlaniVacacion.setText("Eliminar");
        this.jButtonCancelarPlaniVacacion.setText("Cancelar");
        this.jButtonGuardarCambiosPlaniVacacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaPlaniVacacion.setText("Guardar");
		this.jButtonCerrarPlaniVacacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPlaniVacacion,"nuevo_button","Nuevo",this.planivacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPlaniVacacion,"modificar_button","Editar",this.planivacacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPlaniVacacion,"actualizar_button","Actualizar",this.planivacacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPlaniVacacion,"eliminar_button","Eliminar",this.planivacacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPlaniVacacion,"cancelar_button","Cancelar",this.planivacacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPlaniVacacion,"guardarcambios_button","Guardar",this.planivacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPlaniVacacion,"guardarcambiostabla_button","Guardar",this.planivacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPlaniVacacion,"cerrar_button","Salir",this.planivacacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPlaniVacacion.setToolTipText("Nuevo"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPlaniVacacion.setToolTipText("Editar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPlaniVacacion.setToolTipText("Actualizar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPlaniVacacion.setToolTipText("Eliminar)"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPlaniVacacion.setToolTipText("Cancelar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPlaniVacacion.setToolTipText("Guardar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPlaniVacacion.setToolTipText("Guardar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPlaniVacacion.setToolTipText("Salir"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPlaniVacacion";
		inputMap = this.jButtonNuevoPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPlaniVacacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPlaniVacacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPlaniVacacion";
		inputMap = this.jButtonActualizarPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPlaniVacacion"));
		
		//ELIMINAR
		sMapKey = "EliminarPlaniVacacion";
		inputMap = this.jButtonEliminarPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPlaniVacacion"));
		
		//CANCELAR	
		sMapKey = "CancelarPlaniVacacion";
		inputMap = this.jButtonCancelarPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPlaniVacacion"));
		
		//CERRAR		
		sMapKey = "CerrarPlaniVacacion";
		inputMap = this.jButtonCerrarPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPlaniVacacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPlaniVacacion";
		inputMap = this.jButtonGuardarCambiosTablaPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPlaniVacacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPlaniVacacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPlaniVacacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPlaniVacacion.setToolTipText("Nuevo PlaniVacacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPlaniVacacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPlaniVacacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPlaniVacacion.setToolTipText("Sin Cerrar Ventana PlaniVacacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePlaniVacacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePlaniVacacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePlaniVacacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPlaniVacacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPlaniVacacion.setText("Accion");
		this.jComboBoxTiposAccionesPlaniVacacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPlaniVacacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPlaniVacacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPlaniVacacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPlaniVacacion = new JLabelMe();
		
		this.jLabelAccionesPlaniVacacion.setText("Acciones");		
		this.jLabelAccionesPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPlaniVacacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPlaniVacacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPlaniVacacion=new JTabbedPane();
		this.jTabbedPaneRelacionesPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPlaniVacacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPlaniVacacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlaniVacacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlaniVacacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPlaniVacacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPlaniVacacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPlaniVacacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPlaniVacacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPlaniVacacion = new GridBagLayout();
		
		this.jPanelCamposPlaniVacacion.setLayout(gridaBagLayoutCamposPlaniVacacion);
		this.jPanelCamposOcultosPlaniVacacion.setLayout(gridaBagLayoutCamposOcultosPlaniVacacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPlaniVacacion.add(jLabelIdPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPlaniVacacion.add(jLabelidPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPlaniVacacion.add(jLabelid_empresaPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPlaniVacacion.add(jButtonid_empresaPlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 3;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPlaniVacacion.add(jButtonid_empresaPlaniVacacionUpdate, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPlaniVacacion.add(jComboBoxid_empresaPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPlaniVacacion.add(jLabelid_sucursalPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPlaniVacacion.add(jButtonid_sucursalPlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 3;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPlaniVacacion.add(jButtonid_sucursalPlaniVacacionUpdate, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPlaniVacacion.add(jComboBoxid_sucursalPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraPlaniVacacion.add(jLabelid_estructuraPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraPlaniVacacion.add(jButtonid_estructuraPlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 3;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraPlaniVacacion.add(jButtonid_estructuraPlaniVacacionUpdate, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraPlaniVacacion.add(jComboBoxid_estructuraPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructura_seccionPlaniVacacion.add(jLabelid_estructura_seccionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructura_seccionPlaniVacacion.add(jButtonid_estructura_seccionPlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 3;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructura_seccionPlaniVacacion.add(jButtonid_estructura_seccionPlaniVacacionUpdate, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructura_seccionPlaniVacacion.add(jComboBoxid_estructura_seccionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructura_cargoPlaniVacacion.add(jLabelid_estructura_cargoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructura_cargoPlaniVacacion.add(jButtonid_estructura_cargoPlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 3;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructura_cargoPlaniVacacion.add(jButtonid_estructura_cargoPlaniVacacionUpdate, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructura_cargoPlaniVacacion.add(jComboBoxid_estructura_cargoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoPlaniVacacion.add(jLabelid_empleadoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPlaniVacacion.add(jButtonid_empleadoPlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 3;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPlaniVacacion.add(jButtonid_empleadoPlaniVacacionUpdate, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoPlaniVacacion.add(jComboBoxid_empleadoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioPlaniVacacion.add(jLabelfecha_inicioPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioPlaniVacacion.add(jButtonfecha_inicioPlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioPlaniVacacion.add(jDateChooserfecha_inicioPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finPlaniVacacion.add(jLabelfecha_finPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finPlaniVacacion.add(jButtonfecha_finPlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finPlaniVacacion.add(jDateChooserfecha_finPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesPlaniVacacion.add(jLabelid_mesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPlaniVacacion.add(jButtonid_mesPlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 3;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPlaniVacacion.add(jButtonid_mesPlaniVacacionUpdate, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesPlaniVacacion.add(jComboBoxid_mesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldias_anioPlaniVacacion.add(jLabeldias_anioPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldias_anioPlaniVacacion.add(jButtondias_anioPlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldias_anioPlaniVacacion.add(jTextFielddias_anioPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldias_realizadasPlaniVacacion.add(jLabeldias_realizadasPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldias_realizadasPlaniVacacion.add(jButtondias_realizadasPlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldias_realizadasPlaniVacacion.add(jTextFielddias_realizadasPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldias_pendientePlaniVacacion.add(jLabeldias_pendientePlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldias_pendientePlaniVacacion.add(jButtondias_pendientePlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldias_pendientePlaniVacacion.add(jTextFielddias_pendientePlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldias_tomadosPlaniVacacion.add(jLabeldias_tomadosPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldias_tomadosPlaniVacacion.add(jButtondias_tomadosPlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldias_tomadosPlaniVacacion.add(jTextFielddias_tomadosPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldias_anticipadasPlaniVacacion.add(jLabeldias_anticipadasPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldias_anticipadasPlaniVacacion.add(jButtondias_anticipadasPlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldias_anticipadasPlaniVacacion.add(jTextFielddias_anticipadasPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 0;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPlaniVacacion.add(jLabeldescripcionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 2;
		this.gridBagConstraintsPlaniVacacion.ipadx = 0;
		this.gridBagConstraintsPlaniVacacion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPlaniVacacion.add(jButtondescripcionPlaniVacacionBusqueda, this.gridBagConstraintsPlaniVacacion);
	}

	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlaniVacacion.gridy = 0;
	this.gridBagConstraintsPlaniVacacion.gridx = 1;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPlaniVacacion.add(jscrollPanedescripcionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaniVacacion.add(this.jPanelidPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposPlaniVacacion % 2==0) {
		iXPanelCamposPlaniVacacion=0;
		iYPanelCamposPlaniVacacion++;
	}
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaniVacacion.add(this.jPanelid_estructuraPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposPlaniVacacion % 2==0) {
		iXPanelCamposPlaniVacacion=0;
		iYPanelCamposPlaniVacacion++;
	}
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaniVacacion.add(this.jPanelid_estructura_seccionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposPlaniVacacion % 2==0) {
		iXPanelCamposPlaniVacacion=0;
		iYPanelCamposPlaniVacacion++;
	}
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaniVacacion.add(this.jPanelid_estructura_cargoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposPlaniVacacion % 2==0) {
		iXPanelCamposPlaniVacacion=0;
		iYPanelCamposPlaniVacacion++;
	}
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaniVacacion.add(this.jPanelid_empleadoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposPlaniVacacion % 2==0) {
		iXPanelCamposPlaniVacacion=0;
		iYPanelCamposPlaniVacacion++;
	}
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaniVacacion.add(this.jPanelfecha_inicioPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposPlaniVacacion % 2==0) {
		iXPanelCamposPlaniVacacion=0;
		iYPanelCamposPlaniVacacion++;
	}
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaniVacacion.add(this.jPanelfecha_finPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposPlaniVacacion % 2==0) {
		iXPanelCamposPlaniVacacion=0;
		iYPanelCamposPlaniVacacion++;
	}
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaniVacacion.add(this.jPanelid_mesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposPlaniVacacion % 2==0) {
		iXPanelCamposPlaniVacacion=0;
		iYPanelCamposPlaniVacacion++;
	}
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaniVacacion.add(this.jPaneldias_anioPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposPlaniVacacion % 2==0) {
		iXPanelCamposPlaniVacacion=0;
		iYPanelCamposPlaniVacacion++;
	}
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaniVacacion.add(this.jPaneldias_realizadasPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposPlaniVacacion % 2==0) {
		iXPanelCamposPlaniVacacion=0;
		iYPanelCamposPlaniVacacion++;
	}
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaniVacacion.add(this.jPaneldias_pendientePlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposPlaniVacacion % 2==0) {
		iXPanelCamposPlaniVacacion=0;
		iYPanelCamposPlaniVacacion++;
	}
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaniVacacion.add(this.jPaneldias_tomadosPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposPlaniVacacion % 2==0) {
		iXPanelCamposPlaniVacacion=0;
		iYPanelCamposPlaniVacacion++;
	}
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaniVacacion.add(this.jPaneldias_anticipadasPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposPlaniVacacion % 2==0) {
		iXPanelCamposPlaniVacacion=0;
		iYPanelCamposPlaniVacacion++;
	}
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlaniVacacion.add(this.jPaneldescripcionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposPlaniVacacion % 2==0) {
		iXPanelCamposPlaniVacacion=0;
		iYPanelCamposPlaniVacacion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposOcultosPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposOcultosPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPlaniVacacion.add(this.jPanelid_empresaPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposOcultosPlaniVacacion % 2==0) {
		iXPanelCamposOcultosPlaniVacacion=0;
		iYPanelCamposOcultosPlaniVacacion++;
	}
	this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlaniVacacion.gridy = iYPanelCamposOcultosPlaniVacacion;
	this.gridBagConstraintsPlaniVacacion.gridx = iXPanelCamposOcultosPlaniVacacion++;
	this.gridBagConstraintsPlaniVacacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlaniVacacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPlaniVacacion.add(this.jPanelid_sucursalPlaniVacacion, this.gridBagConstraintsPlaniVacacion);



	if(iXPanelCamposOcultosPlaniVacacion % 2==0) {
		iXPanelCamposOcultosPlaniVacacion=0;
		iYPanelCamposOcultosPlaniVacacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesPlaniVacacion= new GridBagLayout();
		this.jPanelAccionesPlaniVacacion.setLayout(gridaBagLayoutAccionesPlaniVacacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPlaniVacacion= new GridBagLayout();
		this.jPanelAccionesFormularioPlaniVacacion.setLayout(gridaBagLayoutAccionesFormularioPlaniVacacion);
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPlaniVacacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPlaniVacacion.add(this.jComboBoxTiposAccionesFormularioPlaniVacacion, this.gridBagConstraintsPlaniVacacion);

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPlaniVacacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPlaniVacacion.add(this.jCheckBoxPostAccionNuevoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.planivacacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPlaniVacacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPlaniVacacion.add(this.jCheckBoxPostAccionSinCerrarPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.planivacacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.planivacacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPlaniVacacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPlaniVacacion.add(this.jCheckBoxPostAccionSinMensajePlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesPlaniVacacion.add(this.jButtonModificarPlaniVacacion, this.gridBagConstraintsPlaniVacacion);							

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesPlaniVacacion.add(this.jButtonEliminarPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
			
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy = 0;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesPlaniVacacion.add(this.jButtonActualizarPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy = 0;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesPlaniVacacion.add(this.jButtonGuardarCambiosPlaniVacacion, this.gridBagConstraintsPlaniVacacion);	
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy = 0;		
		this.gridBagConstraintsPlaniVacacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesPlaniVacacion.add(this.jButtonCancelarPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPlaniVacacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPlaniVacacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.planivacacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();						
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlaniVacacion.gridx = 0;		
			//this.gridBagConstraintsPlaniVacacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPlaniVacacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPlaniVacacion.gridx =0;
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPlaniVacacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PlaniVacacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePlaniVacacion = new PlaniVacacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Plani Vacacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Plani Vacacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Plani Vacacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PlaniVacacionModel planivacacionModel=new PlaniVacacionModel(this);
			
			//SI USARA CLASE INTERNA
			//PlaniVacacionModel.PlaniVacacionFocusTraversalPolicy planivacacionFocusTraversalPolicy = planivacacionModel.new PlaniVacacionFocusTraversalPolicy(this);
			
			//planivacacionFocusTraversalPolicy.setplanivacacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(planivacacionModel);
			
			
			this.jContentPaneDetallePlaniVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePlaniVacacion = new GridBagLayout();	
			this.jContentPaneDetallePlaniVacacion.setLayout(gridaBagLayoutDetallePlaniVacacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPlaniVacacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
				this.gridBagConstraintsPlaniVacacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPlaniVacacion.gridx = 0;
					
				
				this.jContentPaneDetallePlaniVacacion.add(jTtoolBarDetallePlaniVacacion, gridBagConstraintsPlaniVacacion);								
				
}
			
			this.jScrollPanelDatosEdicionPlaniVacacion=   new JScrollPane(jContentPaneDetallePlaniVacacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPlaniVacacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlaniVacacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlaniVacacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPlaniVacacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPlaniVacacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlaniVacacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlaniVacacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPlaniVacacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPlaniVacacion.gridx = 0;
	        
			this.jContentPaneDetallePlaniVacacion.add(jPanelCamposPlaniVacacion, gridBagConstraintsPlaniVacacion);
			
			
			
			
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
						&& planivacacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.planivacacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPlaniVacacion= new GridBagConstraints();
						this.gridBagConstraintsPlaniVacacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPlaniVacacion.gridx = 0;
						this.jContentPaneDetallePlaniVacacion.add(this.jTabbedPaneRelacionesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPlaniVacacion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPlaniVacacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
					this.gridBagConstraintsPlaniVacacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPlaniVacacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPlaniVacacion.gridx = 0;
					
				
					this.jContentPaneDetallePlaniVacacion.add(jPanelCamposOcultosPlaniVacacion, gridBagConstraintsPlaniVacacion);
				
					this.jPanelCamposOcultosPlaniVacacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPlaniVacacion.gridx = 0;
	        this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePlaniVacacion.add(this.jPanelAccionesFormularioPlaniVacacion, this.gridBagConstraintsPlaniVacacion);							
			
			
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
	        this.gridBagConstraintsPlaniVacacion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPlaniVacacion.gridx = 0;
	        
			
			this.jContentPaneDetallePlaniVacacion.add(this.jPanelAccionesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPlaniVacacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPlaniVacacion=   new JScrollPane(this.jPanelCamposPlaniVacacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPlaniVacacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlaniVacacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlaniVacacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPlaniVacacion.gridx = 0;
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPlaniVacacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPlaniVacacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPlaniVacacion, this.gridBagConstraintsPlaniVacacion);			
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPlaniVacacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaniVacacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
			
			
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaniVacacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
			
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPlaniVacacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPlaniVacacion;//jContentPane;
		
		return jScrollPanelDatosEdicionPlaniVacacion;
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
