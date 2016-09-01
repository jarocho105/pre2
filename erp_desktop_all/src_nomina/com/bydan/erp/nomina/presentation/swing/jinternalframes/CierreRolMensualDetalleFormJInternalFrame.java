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
import com.bydan.erp.nomina.util.CierreRolMensualConstantesFunciones;

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
public class CierreRolMensualDetalleFormJInternalFrame extends CierreRolMensualBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCierreRolMensual;
	
	protected JMenuBar jmenuBarDetalleCierreRolMensual;
	
	protected JMenu jmenuDetalleCierreRolMensual;
	protected JMenu jmenuDetalleArchivoCierreRolMensual;
	protected JMenu jmenuDetalleAccionesCierreRolMensual;
	protected JMenu jmenuDetalleDatosCierreRolMensual;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCierreRolMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCierreRolMensual;	
	protected GridBagConstraints gridBagConstraintsCierreRolMensual;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CierreRolMensualBeanSwingJInternalFrameAdditional jInternalFrameDetalleCierreRolMensual;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EstadoEmpleadoBeanSwingJInternalFrame estadoempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoempleado="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public CierreRolMensualSessionBean cierrerolmensualSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EstadoEmpleadoSessionBean estadoempleadoSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;	
	
	public CierreRolMensualLogic cierrerolmensualLogic;
	
	public JScrollPane jScrollPanelDatosCierreRolMensual;
	public JScrollPane jScrollPanelDatosEdicionCierreRolMensual;
	public JScrollPane jScrollPanelDatosGeneralCierreRolMensual;
	
	protected JPanel jPanelCamposCierreRolMensual;    
	protected JPanel jPanelCamposOcultosCierreRolMensual;    	
	protected JPanel jPanelAccionesCierreRolMensual;
	protected JPanel jPanelAccionesFormularioCierreRolMensual;
    
	
	
	protected Integer iXPanelCamposCierreRolMensual=0;
	protected Integer iYPanelCamposCierreRolMensual=0;
	
	protected Integer iXPanelCamposOcultosCierreRolMensual=0;
	protected Integer iYPanelCamposOcultosCierreRolMensual=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCierreRolMensual;
	public JButton jButtonModificarCierreRolMensual;
	public JButton jButtonActualizarCierreRolMensual;
    public JButton jButtonEliminarCierreRolMensual;
	public JButton jButtonCancelarCierreRolMensual;
    public JButton jButtonGuardarCambiosCierreRolMensual;
	public JButton jButtonGuardarCambiosTablaCierreRolMensual;
	protected JButton jButtonCerrarCierreRolMensual;
	
	
	protected JButton jButtonProcesarInformacionCierreRolMensual;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCierreRolMensual;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCierreRolMensual;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCierreRolMensual;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCierreRolMensual;
	protected JButton jButtonModificarToolBarCierreRolMensual;
	protected JButton jButtonActualizarToolBarCierreRolMensual;
    protected JButton jButtonEliminarToolBarCierreRolMensual;
	protected JButton jButtonCancelarToolBarCierreRolMensual;
    protected JButton jButtonGuardarCambiosToolBarCierreRolMensual;
	protected JButton jButtonGuardarCambiosTablaToolBarCierreRolMensual;
	protected JButton jButtonMostrarOcultarTablaToolBarCierreRolMensual;
	protected JButton jButtonCerrarToolBarCierreRolMensual;
	
	protected JButton jButtonProcesarInformacionToolBarCierreRolMensual;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCierreRolMensual;
	protected JMenuItem jMenuItemModificarCierreRolMensual;
	protected JMenuItem jMenuItemActualizarCierreRolMensual;
    protected JMenuItem jMenuItemEliminarCierreRolMensual;
	protected JMenuItem jMenuItemCancelarCierreRolMensual;
    protected JMenuItem jMenuItemGuardarCambiosCierreRolMensual;
	protected JMenuItem jMenuItemGuardarCambiosTablaCierreRolMensual;
	protected JMenuItem jMenuItemCerrarCierreRolMensual;
	protected JMenuItem jMenuItemDetalleCerrarCierreRolMensual;
	protected JMenuItem jMenuItemDetalleMostarOcultarCierreRolMensual;
	
	protected JMenuItem jMenuItemProcesarInformacionCierreRolMensual;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCierreRolMensual;
	protected JMenuItem jMenuItemMostrarOcultarCierreRolMensual;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCierreRolMensual;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCierreRolMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCierreRolMensual;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCierreRolMensual;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCierreRolMensual;
	public JLabel jLabelIdCierreRolMensual;
	public JLabel jLabelidCierreRolMensual;
	public JButton jButtonidCierreRolMensualBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeCierreRolMensual;
	public JLabel jLabelporcentajeCierreRolMensual;
	public JTextField jTextFieldporcentajeCierreRolMensual;
	public JButton jButtonporcentajeCierreRolMensualBusqueda= new JButtonMe();

	public JPanel jPanelfechaCierreRolMensual;
	public JLabel jLabelfechaCierreRolMensual;
	//public JFormattedTextField jDateChooserfechaCierreRolMensual;

	public JDateChooser jDateChooserfechaCierreRolMensual;
	public JButton jButtonfechaCierreRolMensualBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCierreRolMensual;
	public JLabel jLabelid_empresaCierreRolMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCierreRolMensual;
	public JButton jButtonid_empresaCierreRolMensual= new JButtonMe();
	public JButton jButtonid_empresaCierreRolMensualUpdate= new JButtonMe();
	public JButton jButtonid_empresaCierreRolMensualBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCierreRolMensual;
	public JLabel jLabelid_sucursalCierreRolMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCierreRolMensual;
	public JButton jButtonid_sucursalCierreRolMensual= new JButtonMe();
	public JButton jButtonid_sucursalCierreRolMensualUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCierreRolMensualBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioCierreRolMensual;
	public JLabel jLabelid_ejercicioCierreRolMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioCierreRolMensual;
	public JButton jButtonid_ejercicioCierreRolMensual= new JButtonMe();
	public JButton jButtonid_ejercicioCierreRolMensualUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioCierreRolMensualBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoCierreRolMensual;
	public JLabel jLabelid_empleadoCierreRolMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoCierreRolMensual;
	public JButton jButtonid_empleadoCierreRolMensual= new JButtonMe();
	public JButton jButtonid_empleadoCierreRolMensualUpdate= new JButtonMe();
	public JButton jButtonid_empleadoCierreRolMensualBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraCierreRolMensual;
	public JLabel jLabelid_estructuraCierreRolMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraCierreRolMensual;
	public JButton jButtonid_estructuraCierreRolMensual= new JButtonMe();
	public JButton jButtonid_estructuraCierreRolMensualUpdate= new JButtonMe();
	public JButton jButtonid_estructuraCierreRolMensualBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraCierreRolMensualArbol= new JButtonMe();

	public JPanel jPanelid_estado_empleadoCierreRolMensual;
	public JLabel jLabelid_estado_empleadoCierreRolMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_empleadoCierreRolMensual;
	public JButton jButtonid_estado_empleadoCierreRolMensual= new JButtonMe();
	public JButton jButtonid_estado_empleadoCierreRolMensualUpdate= new JButtonMe();
	public JButton jButtonid_estado_empleadoCierreRolMensualBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableCierreRolMensual;
	public JLabel jLabelid_asiento_contableCierreRolMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableCierreRolMensual;
	public JButton jButtonid_asiento_contableCierreRolMensual= new JButtonMe();
	public JButton jButtonid_asiento_contableCierreRolMensualUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableCierreRolMensualBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCierreRolMensual;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CierreRolMensualDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCierreRolMensual=new JPanel();
				this.jPanelAccionesFormularioCierreRolMensual=new JPanel();
				this.jmenuBarDetalleCierreRolMensual=new JMenuBar();
				this.jTtoolBarDetalleCierreRolMensual=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CierreRolMensualDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CierreRolMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CierreRolMensualDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CierreRolMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CierreRolMensualDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CierreRolMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CierreRolMensualDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CierreRolMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CierreRolMensualDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CierreRolMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCierreRolMensual() {
		return this.jButtonActualizarToolBarCierreRolMensual;
	}
	
	public JButton getjButtonEliminarToolBarCierreRolMensual() {
		return this.jButtonEliminarToolBarCierreRolMensual;
	}
	
	public JButton getjButtonCancelarToolBarCierreRolMensual() {
		return this.jButtonCancelarToolBarCierreRolMensual;
	}		
	
	public JButton getjButtonProcesarInformacionCierreRolMensual() {
		return this.jButtonProcesarInformacionCierreRolMensual;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCierreRolMensual)	{
		this.jButtonProcesarInformacionCierreRolMensual = jButtonProcesarInformacionCierreRolMensual;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCierreRolMensual() {
		return this.jComboBoxTiposAccionesCierreRolMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCierreRolMensual(
			JComboBox jComboBoxTiposRelacionesCierreRolMensual) {
		this.jComboBoxTiposRelacionesCierreRolMensual = jComboBoxTiposRelacionesCierreRolMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCierreRolMensual(
			JComboBox jComboBoxTiposAccionesCierreRolMensual) {
		this.jComboBoxTiposAccionesCierreRolMensual = jComboBoxTiposAccionesCierreRolMensual;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCierreRolMensual() {
		return this.jComboBoxTiposAccionesFormularioCierreRolMensual;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCierreRolMensual(
			JComboBox jComboBoxTiposAccionesFormularioCierreRolMensual) {
		this.jComboBoxTiposAccionesFormularioCierreRolMensual = jComboBoxTiposAccionesFormularioCierreRolMensual;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
		
		this.cierrerolmensualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cierrerolmensualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cierrerolmensualSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CierreRolMensualJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CierreRolMensualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CierreRolMensualJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cierre Rol Mensual MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
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
	
		CierreRolMensualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCierreRolMensual= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCierreRolMensual=new JButtonMe();
				this.jButtonModificarToolBarCierreRolMensual=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCierreRolMensual,this.jTtoolBarDetalleCierreRolMensual,
							"actualizar","actualizar","Actualizar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCierreRolMensual,this.jTtoolBarDetalleCierreRolMensual,
							"eliminar","eliminar","Eliminar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCierreRolMensual,this.jTtoolBarDetalleCierreRolMensual,
							"cancelar","cancelar","Cancelar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCierreRolMensual,this.jTtoolBarDetalleCierreRolMensual,
							"guardarcambios","guardarcambios","Guardar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCierreRolMensual=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCierreRolMensual=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCierreRolMensual=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCierreRolMensual=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCierreRolMensual=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCierreRolMensual= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCierreRolMensual.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCierreRolMensual,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCierreRolMensual= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCierreRolMensual.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCierreRolMensual,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCierreRolMensual= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCierreRolMensual.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCierreRolMensual,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCierreRolMensual= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCierreRolMensual.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCierreRolMensual,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCierreRolMensual= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCierreRolMensual.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCierreRolMensual,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCierreRolMensual= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCierreRolMensual.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCierreRolMensual,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCierreRolMensual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCierreRolMensual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCierreRolMensual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCierreRolMensual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCierreRolMensual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCierreRolMensual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCierreRolMensual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCierreRolMensual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCierreRolMensual,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCierreRolMensual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCierreRolMensual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCierreRolMensual,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCierreRolMensual.add(this.jMenuItemDetalleCerrarCierreRolMensual);
		
		this.jmenuDetalleAccionesCierreRolMensual.add(this.jMenuItemActualizarCierreRolMensual);
		this.jmenuDetalleAccionesCierreRolMensual.add(this.jMenuItemEliminarCierreRolMensual);
		this.jmenuDetalleAccionesCierreRolMensual.add(this.jMenuItemCancelarCierreRolMensual);		
		
		//this.jmenuDetalleDatosCierreRolMensual.add(this.jMenuItemDetalleAbrirOrderByCierreRolMensual);				
		this.jmenuDetalleDatosCierreRolMensual.add(this.jMenuItemDetalleMostarOcultarCierreRolMensual);				
				
		//this.jmenuDetalleAccionesCierreRolMensual.add(this.jMenuItemGuardarCambiosCierreRolMensual);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCierreRolMensual.add(this.jmenuDetalleArchivoCierreRolMensual);		
		this.jmenuBarDetalleCierreRolMensual.add(this.jmenuDetalleAccionesCierreRolMensual);		
		this.jmenuBarDetalleCierreRolMensual.add(this.jmenuDetalleDatosCierreRolMensual);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCierreRolMensual);				
	}
	
	
	public void inicializarElementosCamposCierreRolMensual() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCierreRolMensual = new JLabelMe();
		jLabelIdCierreRolMensual.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCierreRolMensual = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCierreRolMensual.setToolTipText(CierreRolMensualConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCierreRolMensual= new GridBagLayout();

		this.jPanelidCierreRolMensual.setLayout(this.gridaBagLayoutCierreRolMensual);

		jLabelidCierreRolMensual = new JLabel();
		jLabelidCierreRolMensual.setText("Id");

		jLabelidCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeCierreRolMensual = new JLabelMe();
		this.jLabelporcentajeCierreRolMensual.setText(""+CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeCierreRolMensual.setToolTipText("Porcentaje");
		this.jLabelporcentajeCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeCierreRolMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeCierreRolMensual.setToolTipText(CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutCierreRolMensual = new GridBagLayout();
		this.jPanelporcentajeCierreRolMensual.setLayout(this.gridaBagLayoutCierreRolMensual);


		jTextFieldporcentajeCierreRolMensual= new JTextFieldMe();
		jTextFieldporcentajeCierreRolMensual.setEnabled(false);
		jTextFieldporcentajeCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeCierreRolMensual.setText("0");

		this.jButtonporcentajeCierreRolMensualBusqueda= new JButtonMe();
		this.jButtonporcentajeCierreRolMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeCierreRolMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeCierreRolMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeCierreRolMensualBusqueda.setText("U");
		this.jButtonporcentajeCierreRolMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeCierreRolMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeCierreRolMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeCierreRolMensualBusqueda"));

		if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeCierreRolMensualBusqueda.setVisible(false);		}


					
		this.jLabelfechaCierreRolMensual = new JLabelMe();
		this.jLabelfechaCierreRolMensual.setText(""+CierreRolMensualConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaCierreRolMensual.setToolTipText("Fecha");
		this.jLabelfechaCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaCierreRolMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaCierreRolMensual.setToolTipText(CierreRolMensualConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutCierreRolMensual = new GridBagLayout();
		this.jPanelfechaCierreRolMensual.setLayout(this.gridaBagLayoutCierreRolMensual);


		//jFormattedTextFieldfechaCierreRolMensual= new JFormattedTextFieldMe();

		jDateChooserfechaCierreRolMensual= new JDateChooser();
		jDateChooserfechaCierreRolMensual.setEnabled(false);
		jDateChooserfechaCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaCierreRolMensual.setDate(new Date());
		jDateChooserfechaCierreRolMensual.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaCierreRolMensual.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaCierreRolMensualBusqueda= new JButtonMe();
		this.jButtonfechaCierreRolMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCierreRolMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCierreRolMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaCierreRolMensualBusqueda.setText("U");
		this.jButtonfechaCierreRolMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaCierreRolMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaCierreRolMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaCierreRolMensualBusqueda"));

		if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaCierreRolMensualBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCierreRolMensual() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCierreRolMensual = new JLabelMe();
		this.jLabelid_empresaCierreRolMensual.setText(""+CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCierreRolMensual.setToolTipText("Empresa");
		this.jLabelid_empresaCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCierreRolMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCierreRolMensual.setToolTipText(CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCierreRolMensual = new GridBagLayout();
		this.jPanelid_empresaCierreRolMensual.setLayout(this.gridaBagLayoutCierreRolMensual);


		jComboBoxid_empresaCierreRolMensual= new JComboBoxMe();
		jComboBoxid_empresaCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCierreRolMensual.setEnabled(false);

		this.jButtonid_empresaCierreRolMensual= new JButtonMe();
		this.jButtonid_empresaCierreRolMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCierreRolMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCierreRolMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCierreRolMensual.setText("Buscar");
		this.jButtonid_empresaCierreRolMensual.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCierreRolMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCierreRolMensual,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCierreRolMensual"));

		this.jButtonid_empresaCierreRolMensualBusqueda= new JButtonMe();
		this.jButtonid_empresaCierreRolMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCierreRolMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCierreRolMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCierreRolMensualBusqueda.setText("U");
		this.jButtonid_empresaCierreRolMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCierreRolMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCierreRolMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCierreRolMensualBusqueda"));

		if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCierreRolMensualBusqueda.setVisible(false);		}

		this.jButtonid_empresaCierreRolMensualUpdate= new JButtonMe();
		this.jButtonid_empresaCierreRolMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCierreRolMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCierreRolMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCierreRolMensualUpdate.setText("U");
		this.jButtonid_empresaCierreRolMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCierreRolMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCierreRolMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCierreRolMensualUpdate"));



					
		this.jLabelid_sucursalCierreRolMensual = new JLabelMe();
		this.jLabelid_sucursalCierreRolMensual.setText(""+CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCierreRolMensual.setToolTipText("Sucursal");
		this.jLabelid_sucursalCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCierreRolMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCierreRolMensual.setToolTipText(CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCierreRolMensual = new GridBagLayout();
		this.jPanelid_sucursalCierreRolMensual.setLayout(this.gridaBagLayoutCierreRolMensual);


		jComboBoxid_sucursalCierreRolMensual= new JComboBoxMe();
		jComboBoxid_sucursalCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCierreRolMensual.setEnabled(false);

		this.jButtonid_sucursalCierreRolMensual= new JButtonMe();
		this.jButtonid_sucursalCierreRolMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCierreRolMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCierreRolMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCierreRolMensual.setText("Buscar");
		this.jButtonid_sucursalCierreRolMensual.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCierreRolMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCierreRolMensual,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCierreRolMensual"));

		this.jButtonid_sucursalCierreRolMensualBusqueda= new JButtonMe();
		this.jButtonid_sucursalCierreRolMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCierreRolMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCierreRolMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCierreRolMensualBusqueda.setText("U");
		this.jButtonid_sucursalCierreRolMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCierreRolMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCierreRolMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCierreRolMensualBusqueda"));

		if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCierreRolMensualBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCierreRolMensualUpdate= new JButtonMe();
		this.jButtonid_sucursalCierreRolMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCierreRolMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCierreRolMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCierreRolMensualUpdate.setText("U");
		this.jButtonid_sucursalCierreRolMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCierreRolMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCierreRolMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCierreRolMensualUpdate"));



					
		this.jLabelid_ejercicioCierreRolMensual = new JLabelMe();
		this.jLabelid_ejercicioCierreRolMensual.setText(""+CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioCierreRolMensual.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioCierreRolMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioCierreRolMensual.setToolTipText(CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutCierreRolMensual = new GridBagLayout();
		this.jPanelid_ejercicioCierreRolMensual.setLayout(this.gridaBagLayoutCierreRolMensual);


		jComboBoxid_ejercicioCierreRolMensual= new JComboBoxMe();
		jComboBoxid_ejercicioCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioCierreRolMensual.setEnabled(false);

		this.jButtonid_ejercicioCierreRolMensual= new JButtonMe();
		this.jButtonid_ejercicioCierreRolMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCierreRolMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCierreRolMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCierreRolMensual.setText("Buscar");
		this.jButtonid_ejercicioCierreRolMensual.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioCierreRolMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCierreRolMensual,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCierreRolMensual"));

		this.jButtonid_ejercicioCierreRolMensualBusqueda= new JButtonMe();
		this.jButtonid_ejercicioCierreRolMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCierreRolMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCierreRolMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioCierreRolMensualBusqueda.setText("U");
		this.jButtonid_ejercicioCierreRolMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioCierreRolMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCierreRolMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCierreRolMensualBusqueda"));

		if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioCierreRolMensualBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioCierreRolMensualUpdate= new JButtonMe();
		this.jButtonid_ejercicioCierreRolMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCierreRolMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCierreRolMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioCierreRolMensualUpdate.setText("U");
		this.jButtonid_ejercicioCierreRolMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioCierreRolMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCierreRolMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCierreRolMensualUpdate"));



					
		this.jLabelid_empleadoCierreRolMensual = new JLabelMe();
		this.jLabelid_empleadoCierreRolMensual.setText(""+CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoCierreRolMensual.setToolTipText("Empleado");
		this.jLabelid_empleadoCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoCierreRolMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoCierreRolMensual.setToolTipText(CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutCierreRolMensual = new GridBagLayout();
		this.jPanelid_empleadoCierreRolMensual.setLayout(this.gridaBagLayoutCierreRolMensual);


		jComboBoxid_empleadoCierreRolMensual= new JComboBoxMe();
		jComboBoxid_empleadoCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoCierreRolMensual= new JButtonMe();
		this.jButtonid_empleadoCierreRolMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCierreRolMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCierreRolMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCierreRolMensual.setText("Buscar");
		this.jButtonid_empleadoCierreRolMensual.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoCierreRolMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCierreRolMensual,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCierreRolMensual"));

		this.jButtonid_empleadoCierreRolMensualBusqueda= new JButtonMe();
		this.jButtonid_empleadoCierreRolMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCierreRolMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCierreRolMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoCierreRolMensualBusqueda.setText("U");
		this.jButtonid_empleadoCierreRolMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoCierreRolMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCierreRolMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCierreRolMensualBusqueda"));

		if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoCierreRolMensualBusqueda.setVisible(false);		}

		this.jButtonid_empleadoCierreRolMensualUpdate= new JButtonMe();
		this.jButtonid_empleadoCierreRolMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCierreRolMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCierreRolMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoCierreRolMensualUpdate.setText("U");
		this.jButtonid_empleadoCierreRolMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoCierreRolMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCierreRolMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCierreRolMensualUpdate"));



					
		this.jLabelid_estructuraCierreRolMensual = new JLabelMe();
		this.jLabelid_estructuraCierreRolMensual.setText(""+CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraCierreRolMensual.setToolTipText("Estructura");
		this.jLabelid_estructuraCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraCierreRolMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraCierreRolMensual.setToolTipText(CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutCierreRolMensual = new GridBagLayout();
		this.jPanelid_estructuraCierreRolMensual.setLayout(this.gridaBagLayoutCierreRolMensual);


		jComboBoxid_estructuraCierreRolMensual= new JComboBoxMe();
		jComboBoxid_estructuraCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraCierreRolMensual= new JButtonMe();
		this.jButtonid_estructuraCierreRolMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraCierreRolMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraCierreRolMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraCierreRolMensual.setText("Buscar");
		this.jButtonid_estructuraCierreRolMensual.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraCierreRolMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraCierreRolMensual,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraCierreRolMensual"));

		this.jButtonid_estructuraCierreRolMensualBusqueda= new JButtonMe();
		this.jButtonid_estructuraCierreRolMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCierreRolMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCierreRolMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraCierreRolMensualBusqueda.setText("U");
		this.jButtonid_estructuraCierreRolMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraCierreRolMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraCierreRolMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraCierreRolMensualBusqueda"));

		if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraCierreRolMensualBusqueda.setVisible(false);		}

		this.jButtonid_estructuraCierreRolMensualUpdate= new JButtonMe();
		this.jButtonid_estructuraCierreRolMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCierreRolMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraCierreRolMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraCierreRolMensualUpdate.setText("U");
		this.jButtonid_estructuraCierreRolMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraCierreRolMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraCierreRolMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraCierreRolMensualUpdate"));


		jButtonid_estructuraCierreRolMensualArbol= new JButtonMe();
		jButtonid_estructuraCierreRolMensualArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraCierreRolMensualArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraCierreRolMensualArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraCierreRolMensualArbol.setText("Arbol");
		jButtonid_estructuraCierreRolMensualArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraCierreRolMensualArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraCierreRolMensualArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraCierreRolMensualArbol"));



					
		this.jLabelid_estado_empleadoCierreRolMensual = new JLabelMe();
		this.jLabelid_estado_empleadoCierreRolMensual.setText(""+CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO+" : *");
		this.jLabelid_estado_empleadoCierreRolMensual.setToolTipText("Estado Empleado");
		this.jLabelid_estado_empleadoCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_empleadoCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_empleadoCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_empleadoCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_empleadoCierreRolMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_empleadoCierreRolMensual.setToolTipText(CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO);
		this.gridaBagLayoutCierreRolMensual = new GridBagLayout();
		this.jPanelid_estado_empleadoCierreRolMensual.setLayout(this.gridaBagLayoutCierreRolMensual);


		jComboBoxid_estado_empleadoCierreRolMensual= new JComboBoxMe();
		jComboBoxid_estado_empleadoCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_empleadoCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_empleadoCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_empleadoCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_empleadoCierreRolMensual= new JButtonMe();
		this.jButtonid_estado_empleadoCierreRolMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_empleadoCierreRolMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_empleadoCierreRolMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_empleadoCierreRolMensual.setText("Buscar");
		this.jButtonid_estado_empleadoCierreRolMensual.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_empleadoCierreRolMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_empleadoCierreRolMensual,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_empleadoCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_empleadoCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_empleadoCierreRolMensual"));

		this.jButtonid_estado_empleadoCierreRolMensualBusqueda= new JButtonMe();
		this.jButtonid_estado_empleadoCierreRolMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_empleadoCierreRolMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_empleadoCierreRolMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_empleadoCierreRolMensualBusqueda.setText("U");
		this.jButtonid_estado_empleadoCierreRolMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_empleadoCierreRolMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_empleadoCierreRolMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_empleadoCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_empleadoCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_empleadoCierreRolMensualBusqueda"));

		if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_empleadoCierreRolMensualBusqueda.setVisible(false);		}

		this.jButtonid_estado_empleadoCierreRolMensualUpdate= new JButtonMe();
		this.jButtonid_estado_empleadoCierreRolMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_empleadoCierreRolMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_empleadoCierreRolMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_empleadoCierreRolMensualUpdate.setText("U");
		this.jButtonid_estado_empleadoCierreRolMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_empleadoCierreRolMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_empleadoCierreRolMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_empleadoCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_empleadoCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_empleadoCierreRolMensualUpdate"));



					
		this.jLabelid_asiento_contableCierreRolMensual = new JLabelMe();
		this.jLabelid_asiento_contableCierreRolMensual.setText(""+CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableCierreRolMensual.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableCierreRolMensual=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableCierreRolMensual.setToolTipText(CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutCierreRolMensual = new GridBagLayout();
		this.jPanelid_asiento_contableCierreRolMensual.setLayout(this.gridaBagLayoutCierreRolMensual);


		jComboBoxid_asiento_contableCierreRolMensual= new JComboBoxMe();
		jComboBoxid_asiento_contableCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableCierreRolMensual= new JButtonMe();
		this.jButtonid_asiento_contableCierreRolMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableCierreRolMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableCierreRolMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableCierreRolMensual.setText("Buscar");
		this.jButtonid_asiento_contableCierreRolMensual.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableCierreRolMensual.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableCierreRolMensual,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableCierreRolMensual"));

		this.jButtonid_asiento_contableCierreRolMensualBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableCierreRolMensualBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableCierreRolMensualBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableCierreRolMensualBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableCierreRolMensualBusqueda.setText("U");
		this.jButtonid_asiento_contableCierreRolMensualBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableCierreRolMensualBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableCierreRolMensualBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableCierreRolMensualBusqueda"));

		if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableCierreRolMensualBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableCierreRolMensualUpdate= new JButtonMe();
		this.jButtonid_asiento_contableCierreRolMensualUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableCierreRolMensualUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableCierreRolMensualUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableCierreRolMensualUpdate.setText("U");
		this.jButtonid_asiento_contableCierreRolMensualUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableCierreRolMensualUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableCierreRolMensualUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableCierreRolMensualUpdate"));



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
		//this.jInternalFrameDetalleCierreRolMensual = new CierreRolMensualBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cierre Rol Mensual DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCierreRolMensual= new GridBagLayout();
		

		
		String sToolTipCierreRolMensual="";
		sToolTipCierreRolMensual=CierreRolMensualConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCierreRolMensual+="(Nomina.CierreRolMensual)";
		}
		
		if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
			sToolTipCierreRolMensual+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCierreRolMensual = new JButtonMe();
		this.jButtonModificarCierreRolMensual = new JButtonMe();
        this.jButtonActualizarCierreRolMensual = new JButtonMe();
        this.jButtonEliminarCierreRolMensual = new JButtonMe();
        this.jButtonCancelarCierreRolMensual = new JButtonMe();
        this.jButtonGuardarCambiosCierreRolMensual = new JButtonMe();
		this.jButtonGuardarCambiosTablaCierreRolMensual = new JButtonMe();
		this.jButtonCerrarCierreRolMensual = new JButtonMe();
		
		this.jScrollPanelDatosCierreRolMensual = new JScrollPane();   
        this.jScrollPanelDatosEdicionCierreRolMensual = new JScrollPane();
		this.jScrollPanelDatosGeneralCierreRolMensual = new JScrollPane();
				
		
		
		this.jPanelCamposCierreRolMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCierreRolMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCierreRolMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCierreRolMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cierre Rol Mensual";
		
		if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Rol Mensuales" + this.sPath));
		} else {
			this.jScrollPanelDatosCierreRolMensual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCierreRolMensual.setName("jPanelCamposCierreRolMensual"); 

		this.jPanelCamposOcultosCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCierreRolMensual.setName("jPanelCamposOcultosCierreRolMensual"); 

        this.jPanelAccionesCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCierreRolMensual.setToolTipText("Acciones");
        this.jPanelAccionesCierreRolMensual.setName("Acciones"); 

		this.jPanelAccionesFormularioCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCierreRolMensual.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCierreRolMensual.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCierreRolMensual.setText("Nuevo");
		this.jButtonModificarCierreRolMensual.setText("Editar");
        this.jButtonActualizarCierreRolMensual.setText("Actualizar");
        this.jButtonEliminarCierreRolMensual.setText("Eliminar");
        this.jButtonCancelarCierreRolMensual.setText("Cancelar");
        this.jButtonGuardarCambiosCierreRolMensual.setText("Guardar");
		this.jButtonGuardarCambiosTablaCierreRolMensual.setText("Guardar");
		this.jButtonCerrarCierreRolMensual.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCierreRolMensual,"nuevo_button","Nuevo",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCierreRolMensual,"modificar_button","Editar",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCierreRolMensual,"actualizar_button","Actualizar",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCierreRolMensual,"eliminar_button","Eliminar",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCierreRolMensual,"cancelar_button","Cancelar",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCierreRolMensual,"guardarcambios_button","Guardar",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCierreRolMensual,"guardarcambiostabla_button","Guardar",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCierreRolMensual,"cerrar_button","Salir",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCierreRolMensual.setToolTipText("Nuevo"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCierreRolMensual.setToolTipText("Editar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCierreRolMensual.setToolTipText("Actualizar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCierreRolMensual.setToolTipText("Eliminar)"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCierreRolMensual.setToolTipText("Cancelar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCierreRolMensual.setToolTipText("Guardar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCierreRolMensual.setToolTipText("Guardar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCierreRolMensual.setToolTipText("Salir"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCierreRolMensual";
		inputMap = this.jButtonNuevoCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCierreRolMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCierreRolMensual"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCierreRolMensual";
		inputMap = this.jButtonActualizarCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCierreRolMensual"));
		
		//ELIMINAR
		sMapKey = "EliminarCierreRolMensual";
		inputMap = this.jButtonEliminarCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCierreRolMensual"));
		
		//CANCELAR	
		sMapKey = "CancelarCierreRolMensual";
		inputMap = this.jButtonCancelarCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCierreRolMensual"));
		
		//CERRAR		
		sMapKey = "CerrarCierreRolMensual";
		inputMap = this.jButtonCerrarCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCierreRolMensual"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCierreRolMensual";
		inputMap = this.jButtonGuardarCambiosTablaCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCierreRolMensual"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCierreRolMensual = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCierreRolMensual.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCierreRolMensual.setToolTipText("Nuevo CierreRolMensual");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCierreRolMensual = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCierreRolMensual.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCierreRolMensual.setToolTipText("Sin Cerrar Ventana CierreRolMensual");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCierreRolMensual = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCierreRolMensual.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCierreRolMensual.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCierreRolMensual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCierreRolMensual.setText("Accion");
		this.jComboBoxTiposAccionesCierreRolMensual.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCierreRolMensual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCierreRolMensual.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCierreRolMensual.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCierreRolMensual = new JLabelMe();
		
		this.jLabelAccionesCierreRolMensual.setText("Acciones");		
		this.jLabelAccionesCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCierreRolMensual();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCierreRolMensual();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCierreRolMensual=new JTabbedPane();
		this.jTabbedPaneRelacionesCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCierreRolMensual,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCierreRolMensual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCierreRolMensual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCierreRolMensual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCierreRolMensual.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCierreRolMensual.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCierreRolMensual.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCierreRolMensual = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCierreRolMensual = new GridBagLayout();
		
		this.jPanelCamposCierreRolMensual.setLayout(gridaBagLayoutCamposCierreRolMensual);
		this.jPanelCamposOcultosCierreRolMensual.setLayout(gridaBagLayoutCamposOcultosCierreRolMensual);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 0;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCierreRolMensual.add(jLabelIdCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 1;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCierreRolMensual.add(jLabelidCierreRolMensual, this.gridBagConstraintsCierreRolMensual);


	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 0;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCierreRolMensual.add(jLabelid_empresaCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 2;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCierreRolMensual.add(jButtonid_empresaCierreRolMensualBusqueda, this.gridBagConstraintsCierreRolMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 3;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCierreRolMensual.add(jButtonid_empresaCierreRolMensualUpdate, this.gridBagConstraintsCierreRolMensual);
	}

	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 1;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCierreRolMensual.add(jComboBoxid_empresaCierreRolMensual, this.gridBagConstraintsCierreRolMensual);


	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 0;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCierreRolMensual.add(jLabelid_sucursalCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 2;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCierreRolMensual.add(jButtonid_sucursalCierreRolMensualBusqueda, this.gridBagConstraintsCierreRolMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 3;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCierreRolMensual.add(jButtonid_sucursalCierreRolMensualUpdate, this.gridBagConstraintsCierreRolMensual);
	}

	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 1;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCierreRolMensual.add(jComboBoxid_sucursalCierreRolMensual, this.gridBagConstraintsCierreRolMensual);


	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 0;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioCierreRolMensual.add(jLabelid_ejercicioCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 2;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioCierreRolMensual.add(jButtonid_ejercicioCierreRolMensualBusqueda, this.gridBagConstraintsCierreRolMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 3;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioCierreRolMensual.add(jButtonid_ejercicioCierreRolMensualUpdate, this.gridBagConstraintsCierreRolMensual);
	}

	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 1;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioCierreRolMensual.add(jComboBoxid_ejercicioCierreRolMensual, this.gridBagConstraintsCierreRolMensual);


	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 0;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoCierreRolMensual.add(jLabelid_empleadoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 2;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoCierreRolMensual.add(jButtonid_empleadoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 3;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCierreRolMensual.add(jButtonid_empleadoCierreRolMensualBusqueda, this.gridBagConstraintsCierreRolMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 4;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCierreRolMensual.add(jButtonid_empleadoCierreRolMensualUpdate, this.gridBagConstraintsCierreRolMensual);
	}

	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 1;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoCierreRolMensual.add(jComboBoxid_empleadoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);


	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 0;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraCierreRolMensual.add(jLabelid_estructuraCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 2;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraCierreRolMensual.add(jButtonid_estructuraCierreRolMensualBusqueda, this.gridBagConstraintsCierreRolMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 3;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraCierreRolMensual.add(jButtonid_estructuraCierreRolMensualUpdate, this.gridBagConstraintsCierreRolMensual);
	}

	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 1;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraCierreRolMensual.add(jComboBoxid_estructuraCierreRolMensual, this.gridBagConstraintsCierreRolMensual);


	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 0;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_empleadoCierreRolMensual.add(jLabelid_estado_empleadoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 2;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_empleadoCierreRolMensual.add(jButtonid_estado_empleadoCierreRolMensualBusqueda, this.gridBagConstraintsCierreRolMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 3;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_empleadoCierreRolMensual.add(jButtonid_estado_empleadoCierreRolMensualUpdate, this.gridBagConstraintsCierreRolMensual);
	}

	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 1;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_empleadoCierreRolMensual.add(jComboBoxid_estado_empleadoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);


	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 0;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableCierreRolMensual.add(jLabelid_asiento_contableCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 2;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableCierreRolMensual.add(jButtonid_asiento_contableCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 3;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableCierreRolMensual.add(jButtonid_asiento_contableCierreRolMensualBusqueda, this.gridBagConstraintsCierreRolMensual);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 4;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableCierreRolMensual.add(jButtonid_asiento_contableCierreRolMensualUpdate, this.gridBagConstraintsCierreRolMensual);
	}

	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 1;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableCierreRolMensual.add(jComboBoxid_asiento_contableCierreRolMensual, this.gridBagConstraintsCierreRolMensual);


	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 0;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeCierreRolMensual.add(jLabelporcentajeCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 2;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeCierreRolMensual.add(jButtonporcentajeCierreRolMensualBusqueda, this.gridBagConstraintsCierreRolMensual);
	}

	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 1;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeCierreRolMensual.add(jTextFieldporcentajeCierreRolMensual, this.gridBagConstraintsCierreRolMensual);


	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 0;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaCierreRolMensual.add(jLabelfechaCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 2;
		this.gridBagConstraintsCierreRolMensual.ipadx = 0;
		this.gridBagConstraintsCierreRolMensual.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaCierreRolMensual.add(jButtonfechaCierreRolMensualBusqueda, this.gridBagConstraintsCierreRolMensual);
	}

	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreRolMensual.gridy = 0;
	this.gridBagConstraintsCierreRolMensual.gridx = 1;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaCierreRolMensual.add(jDateChooserfechaCierreRolMensual, this.gridBagConstraintsCierreRolMensual);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreRolMensual.gridy = iYPanelCamposCierreRolMensual;
	this.gridBagConstraintsCierreRolMensual.gridx = iXPanelCamposCierreRolMensual++;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCierreRolMensual.add(this.jPanelidCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(iXPanelCamposCierreRolMensual % 1==0) {
		iXPanelCamposCierreRolMensual=0;
		iYPanelCamposCierreRolMensual++;
	}
	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreRolMensual.gridy = iYPanelCamposCierreRolMensual;
	this.gridBagConstraintsCierreRolMensual.gridx = iXPanelCamposCierreRolMensual++;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCierreRolMensual.add(this.jPanelid_empleadoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(iXPanelCamposCierreRolMensual % 1==0) {
		iXPanelCamposCierreRolMensual=0;
		iYPanelCamposCierreRolMensual++;
	}
	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreRolMensual.gridy = iYPanelCamposCierreRolMensual;
	this.gridBagConstraintsCierreRolMensual.gridx = iXPanelCamposCierreRolMensual++;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCierreRolMensual.add(this.jPanelid_estructuraCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(iXPanelCamposCierreRolMensual % 1==0) {
		iXPanelCamposCierreRolMensual=0;
		iYPanelCamposCierreRolMensual++;
	}
	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreRolMensual.gridy = iYPanelCamposCierreRolMensual;
	this.gridBagConstraintsCierreRolMensual.gridx = iXPanelCamposCierreRolMensual++;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCierreRolMensual.add(this.jPanelid_estado_empleadoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(iXPanelCamposCierreRolMensual % 1==0) {
		iXPanelCamposCierreRolMensual=0;
		iYPanelCamposCierreRolMensual++;
	}
	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreRolMensual.gridy = iYPanelCamposCierreRolMensual;
	this.gridBagConstraintsCierreRolMensual.gridx = iXPanelCamposCierreRolMensual++;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCierreRolMensual.add(this.jPanelid_asiento_contableCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(iXPanelCamposCierreRolMensual % 1==0) {
		iXPanelCamposCierreRolMensual=0;
		iYPanelCamposCierreRolMensual++;
	}
	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreRolMensual.gridy = iYPanelCamposCierreRolMensual;
	this.gridBagConstraintsCierreRolMensual.gridx = iXPanelCamposCierreRolMensual++;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCierreRolMensual.add(this.jPanelporcentajeCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(iXPanelCamposCierreRolMensual % 1==0) {
		iXPanelCamposCierreRolMensual=0;
		iYPanelCamposCierreRolMensual++;
	}
	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreRolMensual.gridy = iYPanelCamposCierreRolMensual;
	this.gridBagConstraintsCierreRolMensual.gridx = iXPanelCamposCierreRolMensual++;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCierreRolMensual.add(this.jPanelfechaCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(iXPanelCamposCierreRolMensual % 1==0) {
		iXPanelCamposCierreRolMensual=0;
		iYPanelCamposCierreRolMensual++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreRolMensual.gridy = iYPanelCamposOcultosCierreRolMensual;
	this.gridBagConstraintsCierreRolMensual.gridx = iXPanelCamposOcultosCierreRolMensual++;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCierreRolMensual.add(this.jPanelid_empresaCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(iXPanelCamposOcultosCierreRolMensual % 1==0) {
		iXPanelCamposOcultosCierreRolMensual=0;
		iYPanelCamposOcultosCierreRolMensual++;
	}
	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreRolMensual.gridy = iYPanelCamposOcultosCierreRolMensual;
	this.gridBagConstraintsCierreRolMensual.gridx = iXPanelCamposOcultosCierreRolMensual++;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCierreRolMensual.add(this.jPanelid_sucursalCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(iXPanelCamposOcultosCierreRolMensual % 1==0) {
		iXPanelCamposOcultosCierreRolMensual=0;
		iYPanelCamposOcultosCierreRolMensual++;
	}
	this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreRolMensual.gridy = iYPanelCamposOcultosCierreRolMensual;
	this.gridBagConstraintsCierreRolMensual.gridx = iXPanelCamposOcultosCierreRolMensual++;
	this.gridBagConstraintsCierreRolMensual.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreRolMensual.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCierreRolMensual.add(this.jPanelid_ejercicioCierreRolMensual, this.gridBagConstraintsCierreRolMensual);



	if(iXPanelCamposOcultosCierreRolMensual % 1==0) {
		iXPanelCamposOcultosCierreRolMensual=0;
		iYPanelCamposOcultosCierreRolMensual++;
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
			
		GridBagLayout gridaBagLayoutAccionesCierreRolMensual= new GridBagLayout();
		this.jPanelAccionesCierreRolMensual.setLayout(gridaBagLayoutAccionesCierreRolMensual);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCierreRolMensual= new GridBagLayout();
		this.jPanelAccionesFormularioCierreRolMensual.setLayout(gridaBagLayoutAccionesFormularioCierreRolMensual);
		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCierreRolMensual.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCierreRolMensual.add(this.jComboBoxTiposAccionesFormularioCierreRolMensual, this.gridBagConstraintsCierreRolMensual);

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCierreRolMensual.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCierreRolMensual.add(this.jCheckBoxPostAccionNuevoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCierreRolMensual.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCierreRolMensual.add(this.jCheckBoxPostAccionSinCerrarCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCierreRolMensual.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCierreRolMensual.add(this.jCheckBoxPostAccionSinMensajeCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXAccion++;
			
		this.jPanelAccionesCierreRolMensual.add(this.jButtonModificarCierreRolMensual, this.gridBagConstraintsCierreRolMensual);							

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx =iPosXAccion++;
			
		this.jPanelAccionesCierreRolMensual.add(this.jButtonEliminarCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		
			
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy = 0;		
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXAccion++;
		
		this.jPanelAccionesCierreRolMensual.add(this.jButtonActualizarCierreRolMensual, this.gridBagConstraintsCierreRolMensual);


		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy = 0;		
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXAccion++;
		
		this.jPanelAccionesCierreRolMensual.add(this.jButtonGuardarCambiosCierreRolMensual, this.gridBagConstraintsCierreRolMensual);	
		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy = 0;		
		this.gridBagConstraintsCierreRolMensual.gridx =iPosXAccion++;
		
		this.jPanelAccionesCierreRolMensual.add(this.jButtonCancelarCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCierreRolMensual = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCierreRolMensual);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();						
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCierreRolMensual.gridx = 0;		
			//this.gridBagConstraintsCierreRolMensual.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCierreRolMensual.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCierreRolMensual.gridx =0;
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCierreRolMensual.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CierreRolMensualJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCierreRolMensual = new CierreRolMensualBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cierre Rol Mensual DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cierre Rol Mensual DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cierre Rol Mensual Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CierreRolMensualModel cierrerolmensualModel=new CierreRolMensualModel(this);
			
			//SI USARA CLASE INTERNA
			//CierreRolMensualModel.CierreRolMensualFocusTraversalPolicy cierrerolmensualFocusTraversalPolicy = cierrerolmensualModel.new CierreRolMensualFocusTraversalPolicy(this);
			
			//cierrerolmensualFocusTraversalPolicy.setcierrerolmensualJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cierrerolmensualModel);
			
			
			this.jContentPaneDetalleCierreRolMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCierreRolMensual = new GridBagLayout();	
			this.jContentPaneDetalleCierreRolMensual.setLayout(gridaBagLayoutDetalleCierreRolMensual);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCierreRolMensual = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
				this.gridBagConstraintsCierreRolMensual.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCierreRolMensual.gridx = 0;
					
				
				this.jContentPaneDetalleCierreRolMensual.add(jTtoolBarDetalleCierreRolMensual, gridBagConstraintsCierreRolMensual);								
				
}
			
			this.jScrollPanelDatosEdicionCierreRolMensual=   new JScrollPane(jContentPaneDetalleCierreRolMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCierreRolMensual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCierreRolMensual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCierreRolMensual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCierreRolMensual=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCierreRolMensual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCierreRolMensual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCierreRolMensual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCierreRolMensual.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCierreRolMensual.gridx = 0;
	        
			this.jContentPaneDetalleCierreRolMensual.add(jPanelCamposCierreRolMensual, gridBagConstraintsCierreRolMensual);
			
			
			
			
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
						&& cierrerolmensualSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cierrerolmensualSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCierreRolMensual= new GridBagConstraints();
						this.gridBagConstraintsCierreRolMensual.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCierreRolMensual.gridx = 0;
						this.jContentPaneDetalleCierreRolMensual.add(this.jTabbedPaneRelacionesCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCierreRolMensual.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCierreRolMensual.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
					this.gridBagConstraintsCierreRolMensual.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCierreRolMensual.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCierreRolMensual.gridx = 0;
					
				
					this.jContentPaneDetalleCierreRolMensual.add(jPanelCamposOcultosCierreRolMensual, gridBagConstraintsCierreRolMensual);
				
					this.jPanelCamposOcultosCierreRolMensual.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCierreRolMensual.gridx = 0;
	        this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCierreRolMensual.add(this.jPanelAccionesFormularioCierreRolMensual, this.gridBagConstraintsCierreRolMensual);							
			
			
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
	        this.gridBagConstraintsCierreRolMensual.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCierreRolMensual.gridx = 0;
	        
			
			this.jContentPaneDetalleCierreRolMensual.add(this.jPanelAccionesCierreRolMensual, this.gridBagConstraintsCierreRolMensual);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCierreRolMensual);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCierreRolMensual=   new JScrollPane(this.jPanelCamposCierreRolMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCierreRolMensual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCierreRolMensual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCierreRolMensual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCierreRolMensual.gridx = 0;
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCierreRolMensual.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCierreRolMensual.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCierreRolMensual, this.gridBagConstraintsCierreRolMensual);			
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCierreRolMensual.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCierreRolMensual, this.gridBagConstraintsCierreRolMensual);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCierreRolMensual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
			
			
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCierreRolMensual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		
			
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCierreRolMensual.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCierreRolMensual;//jContentPane;
		
		return jScrollPanelDatosEdicionCierreRolMensual;
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
