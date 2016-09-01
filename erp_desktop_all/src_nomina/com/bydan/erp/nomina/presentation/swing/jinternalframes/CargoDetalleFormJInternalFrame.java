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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.CargoConstantesFunciones;

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
public class CargoDetalleFormJInternalFrame extends CargoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCargo;
	
	protected JMenuBar jmenuBarDetalleCargo;
	
	protected JMenu jmenuDetalleCargo;
	protected JMenu jmenuDetalleArchivoCargo;
	protected JMenu jmenuDetalleAccionesCargo;
	protected JMenu jmenuDetalleDatosCargo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCargo;	
	protected GridBagConstraints gridBagConstraintsCargo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CargoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCargo;		
	
	public CargoBeanSwingJInternalFrameTree jInternalFrameTreeCargo;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cargo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_numeropatronal="";

	protected TipoPago_NMBeanSwingJInternalFrame tipopago_nmBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipopago_nm="";

	protected CargoGrupoBeanSwingJInternalFrame cargogrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cargogrupo="";
	
	public CargoSessionBean cargoSessionBean;
	
	

	public AsistenciaMensualBeanSwingJInternalFrame asistenciamensualBeanSwingJInternalFrame=null;
	public AsistenciaMensualBeanSwingJInternalFrame asistenciamensualBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAsistenciaMensual=false;
	public AsistenciaMensualSessionBean asistenciamensualSessionBean;

	public EmpleadoEstructuraBeanSwingJInternalFrame empleadoestructuraBeanSwingJInternalFrame=null;
	public EmpleadoEstructuraBeanSwingJInternalFrame empleadoestructuraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoEstructura=false;
	public EmpleadoEstructuraSessionBean empleadoestructuraSessionBean;

	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;
	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleado=false;
	public EmpleadoSessionBean empleadoSessionBean;

	//public CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame=null;
	public CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCargo=false;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public NumeroPatronalSessionBean numeropatronalSessionBean;
	public TipoPago_NMSessionBean tipopago_nmSessionBean;
	public CargoGrupoSessionBean cargogrupoSessionBean;	
	
	public CargoLogic cargoLogic;
	
	public JScrollPane jScrollPanelDatosCargo;
	public JScrollPane jScrollPanelDatosEdicionCargo;
	public JScrollPane jScrollPanelDatosGeneralCargo;
	
	protected JPanel jPanelCamposCargo;    
	protected JPanel jPanelCamposOcultosCargo;    	
	protected JPanel jPanelAccionesCargo;
	protected JPanel jPanelAccionesFormularioCargo;
    
	
	
	protected Integer iXPanelCamposCargo=0;
	protected Integer iYPanelCamposCargo=0;
	
	protected Integer iXPanelCamposOcultosCargo=0;
	protected Integer iYPanelCamposOcultosCargo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCargo;
	public JButton jButtonModificarCargo;
	public JButton jButtonActualizarCargo;
    public JButton jButtonEliminarCargo;
	public JButton jButtonCancelarCargo;
    public JButton jButtonGuardarCambiosCargo;
	public JButton jButtonGuardarCambiosTablaCargo;
	protected JButton jButtonCerrarCargo;
	
	
	protected JButton jButtonProcesarInformacionCargo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCargo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCargo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCargo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCargo;
	protected JButton jButtonModificarToolBarCargo;
	protected JButton jButtonActualizarToolBarCargo;
    protected JButton jButtonEliminarToolBarCargo;
	protected JButton jButtonCancelarToolBarCargo;
    protected JButton jButtonGuardarCambiosToolBarCargo;
	protected JButton jButtonGuardarCambiosTablaToolBarCargo;
	protected JButton jButtonMostrarOcultarTablaToolBarCargo;
	protected JButton jButtonCerrarToolBarCargo;
	
	protected JButton jButtonProcesarInformacionToolBarCargo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCargo;
	protected JMenuItem jMenuItemModificarCargo;
	protected JMenuItem jMenuItemActualizarCargo;
    protected JMenuItem jMenuItemEliminarCargo;
	protected JMenuItem jMenuItemCancelarCargo;
    protected JMenuItem jMenuItemGuardarCambiosCargo;
	protected JMenuItem jMenuItemGuardarCambiosTablaCargo;
	protected JMenuItem jMenuItemCerrarCargo;
	protected JMenuItem jMenuItemDetalleCerrarCargo;
	protected JMenuItem jMenuItemDetalleMostarOcultarCargo;
	
	protected JMenuItem jMenuItemProcesarInformacionCargo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCargo;
	protected JMenuItem jMenuItemMostrarOcultarCargo;
	
	
	//MENU
	
	protected JButton jButtonArbolCargo;	
	
	protected JLabel jLabelAccionesCargo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCargo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCargo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCargo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCargo;
	public JLabel jLabelIdCargo;
	public JLabel jLabelidCargo;
	public JButton jButtonidCargoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCargo;
	public JLabel jLabelcodigoCargo;
	public JTextField jTextFieldcodigoCargo;
	public JButton jButtoncodigoCargoBusqueda= new JButtonMe();

	public JPanel jPanelnombreCargo;
	public JLabel jLabelnombreCargo;
	public JTextArea jTextAreanombreCargo;
	public JScrollPane jscrollPanenombreCargo;
	public JButton jButtonnombreCargoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_anticipoCargo;
	public JLabel jLabelvalor_anticipoCargo;
	public JTextField jTextFieldvalor_anticipoCargo;
	public JButton jButtonvalor_anticipoCargoBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_anticipoCargo;
	public JLabel jLabelporcentaje_anticipoCargo;
	public JTextField jTextFieldporcentaje_anticipoCargo;
	public JButton jButtonporcentaje_anticipoCargoBusqueda= new JButtonMe();

	public JPanel jPaneles_jefeCargo;
	public JLabel jLabeles_jefeCargo;
	public JCheckBox jCheckBoxes_jefeCargo;
	public JButton jButtones_jefeCargoBusqueda= new JButtonMe();

	public JPanel jPaneles_anualCargo;
	public JLabel jLabeles_anualCargo;
	public JCheckBox jCheckBoxes_anualCargo;
	public JButton jButtones_anualCargoBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeCargo;
	public JLabel jLabelporcentajeCargo;
	public JTextField jTextFieldporcentajeCargo;
	public JButton jButtonporcentajeCargoBusqueda= new JButtonMe();

	public JPanel jPanelvalorCargo;
	public JLabel jLabelvalorCargo;
	public JTextField jTextFieldvalorCargo;
	public JButton jButtonvalorCargoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCargo;
	public JLabel jLabelid_empresaCargo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCargo;
	public JButton jButtonid_empresaCargo= new JButtonMe();
	public JButton jButtonid_empresaCargoUpdate= new JButtonMe();
	public JButton jButtonid_empresaCargoBusqueda= new JButtonMe();

	public JPanel jPanelid_cargoCargo;
	public JLabel jLabelid_cargoCargo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cargoCargo;
	public JButton jButtonid_cargoCargo= new JButtonMe();
	public JButton jButtonid_cargoCargoUpdate= new JButtonMe();
	public JButton jButtonid_cargoCargoBusqueda= new JButtonMe();
	public JButton jButtonid_cargoCargoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contableCargo;
	public JLabel jLabelid_cuenta_contableCargo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableCargo;
	public JButton jButtonid_cuenta_contableCargo= new JButtonMe();
	public JButton jButtonid_cuenta_contableCargoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableCargoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableCargoArbol= new JButtonMe();

	public JPanel jPanelid_numero_patronalCargo;
	public JLabel jLabelid_numero_patronalCargo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_numero_patronalCargo;
	public JButton jButtonid_numero_patronalCargo= new JButtonMe();
	public JButton jButtonid_numero_patronalCargoUpdate= new JButtonMe();
	public JButton jButtonid_numero_patronalCargoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_pago__n_mCargo;
	public JLabel jLabelid_tipo_pago__n_mCargo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_pago__n_mCargo;
	public JButton jButtonid_tipo_pago__n_mCargo= new JButtonMe();
	public JButton jButtonid_tipo_pago__n_mCargoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_pago__n_mCargoBusqueda= new JButtonMe();

	public JPanel jPanelid_cargo_grupoCargo;
	public JLabel jLabelid_cargo_grupoCargo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cargo_grupoCargo;
	public JButton jButtonid_cargo_grupoCargo= new JButtonMe();
	public JButton jButtonid_cargo_grupoCargoUpdate= new JButtonMe();
	public JButton jButtonid_cargo_grupoCargoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCargo;
	
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
		
	public int iWidthFormulario=945;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CargoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCargo=new JPanel();
				this.jPanelAccionesFormularioCargo=new JPanel();
				this.jmenuBarDetalleCargo=new JMenuBar();
				this.jTtoolBarDetalleCargo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Cargo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CargoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Cargo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cargo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cargo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Cargo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCargo() {
		return this.jButtonActualizarToolBarCargo;
	}
	
	public JButton getjButtonEliminarToolBarCargo() {
		return this.jButtonEliminarToolBarCargo;
	}
	
	public JButton getjButtonCancelarToolBarCargo() {
		return this.jButtonCancelarToolBarCargo;
	}		
	
	public JButton getjButtonProcesarInformacionCargo() {
		return this.jButtonProcesarInformacionCargo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCargo)	{
		this.jButtonProcesarInformacionCargo = jButtonProcesarInformacionCargo;
	}
	
	
	public JButton getjButtonArbolCargo() {
		return this.jButtonArbolCargo;
	}
	
	public void setjButtonArbol(JButton jButtonArbolCargo)	{
		this.jButtonArbolCargo = jButtonArbolCargo;
	}
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCargo() {
		return this.jComboBoxTiposAccionesCargo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCargo(
			JComboBox jComboBoxTiposRelacionesCargo) {
		this.jComboBoxTiposRelacionesCargo = jComboBoxTiposRelacionesCargo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCargo(
			JComboBox jComboBoxTiposAccionesCargo) {
		this.jComboBoxTiposAccionesCargo = jComboBoxTiposAccionesCargo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCargo() {
		return this.jComboBoxTiposAccionesFormularioCargo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCargo(
			JComboBox jComboBoxTiposAccionesFormularioCargo) {
		this.jComboBoxTiposAccionesFormularioCargo = jComboBoxTiposAccionesFormularioCargo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cargoSessionBean=new CargoSessionBean();
		
		this.cargoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cargoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
		//this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
		//this.empleadoSessionBean=new EmpleadoSessionBean();
		//this.cargoSessionBean=new CargoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CargoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CargoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CargoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cargo MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
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
	
		CargoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCargo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCargo=new JButtonMe();
				this.jButtonModificarToolBarCargo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCargo,this.jTtoolBarDetalleCargo,
							"actualizar","actualizar","Actualizar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCargo,this.jTtoolBarDetalleCargo,
							"eliminar","eliminar","Eliminar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCargo,this.jTtoolBarDetalleCargo,
							"cancelar","cancelar","Cancelar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCargo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCargo,this.jTtoolBarDetalleCargo,
							"guardarcambios","guardarcambios","Guardar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCargo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCargo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCargo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCargo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCargo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCargo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCargo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCargo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCargo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCargo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCargo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCargo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCargo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCargo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCargo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCargo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCargo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCargo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCargo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCargo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCargo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCargo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCargo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCargo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCargo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCargo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCargo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCargo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCargo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCargo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCargo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCargo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCargo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCargo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCargo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCargo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCargo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCargo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCargo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCargo.add(this.jMenuItemDetalleCerrarCargo);
		
		this.jmenuDetalleAccionesCargo.add(this.jMenuItemActualizarCargo);
		this.jmenuDetalleAccionesCargo.add(this.jMenuItemEliminarCargo);
		this.jmenuDetalleAccionesCargo.add(this.jMenuItemCancelarCargo);		
		
		//this.jmenuDetalleDatosCargo.add(this.jMenuItemDetalleAbrirOrderByCargo);				
		this.jmenuDetalleDatosCargo.add(this.jMenuItemDetalleMostarOcultarCargo);				
				
		//this.jmenuDetalleAccionesCargo.add(this.jMenuItemGuardarCambiosCargo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCargo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCargo.add(this.jmenuDetalleArchivoCargo);		
		this.jmenuBarDetalleCargo.add(this.jmenuDetalleAccionesCargo);		
		this.jmenuBarDetalleCargo.add(this.jmenuDetalleDatosCargo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCargo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCargo.add(this.jmenuDetalleCargo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCargo);				
	}
	
	
	public void inicializarElementosCamposCargo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCargo = new JLabelMe();
		jLabelIdCargo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCargo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCargo.setToolTipText(CargoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCargo= new GridBagLayout();

		this.jPanelidCargo.setLayout(this.gridaBagLayoutCargo);

		jLabelidCargo = new JLabel();
		jLabelidCargo.setText("Id");

		jLabelidCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoCargo = new JLabelMe();
		this.jLabelcodigoCargo.setText(""+CargoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCargo.setToolTipText("Codigo");
		this.jLabelcodigoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCargo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCargo.setToolTipText(CargoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCargo = new GridBagLayout();
		this.jPanelcodigoCargo.setLayout(this.gridaBagLayoutCargo);


		jTextFieldcodigoCargo= new JTextFieldMe();

		jTextFieldcodigoCargo.setEnabled(false);
		jTextFieldcodigoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCargoBusqueda= new JButtonMe();
		this.jButtoncodigoCargoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCargoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCargoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCargoBusqueda.setText("U");
		this.jButtoncodigoCargoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCargoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCargoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCargoBusqueda"));

		if(this.cargoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCargoBusqueda.setVisible(false);		}


					
		this.jLabelnombreCargo = new JLabelMe();
		this.jLabelnombreCargo.setText(""+CargoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCargo.setToolTipText("Nombre");
		this.jLabelnombreCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCargo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCargo.setToolTipText(CargoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCargo = new GridBagLayout();
		this.jPanelnombreCargo.setLayout(this.gridaBagLayoutCargo);


		jTextAreanombreCargo= new JTextAreaMe();
		jTextAreanombreCargo.setEnabled(false);
		jTextAreanombreCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCargo.setLineWrap(true);
		jTextAreanombreCargo.setWrapStyleWord(true);
		jTextAreanombreCargo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCargo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCargo = new JScrollPane(jTextAreanombreCargo);
		jscrollPanenombreCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCargoBusqueda= new JButtonMe();
		this.jButtonnombreCargoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCargoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCargoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCargoBusqueda.setText("U");
		this.jButtonnombreCargoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCargoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCargoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCargoBusqueda"));

		if(this.cargoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCargoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_anticipoCargo = new JLabelMe();
		this.jLabelvalor_anticipoCargo.setText(""+CargoConstantesFunciones.LABEL_VALORANTICIPO+" : *");
		this.jLabelvalor_anticipoCargo.setToolTipText("Valor Anticipo");
		this.jLabelvalor_anticipoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_anticipoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_anticipoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_anticipoCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_anticipoCargo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_anticipoCargo.setToolTipText(CargoConstantesFunciones.LABEL_VALORANTICIPO);
		this.gridaBagLayoutCargo = new GridBagLayout();
		this.jPanelvalor_anticipoCargo.setLayout(this.gridaBagLayoutCargo);


		jTextFieldvalor_anticipoCargo= new JTextFieldMe();
		jTextFieldvalor_anticipoCargo.setEnabled(false);
		jTextFieldvalor_anticipoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_anticipoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_anticipoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_anticipoCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_anticipoCargo.setText("0.0");

		this.jButtonvalor_anticipoCargoBusqueda= new JButtonMe();
		this.jButtonvalor_anticipoCargoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_anticipoCargoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_anticipoCargoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_anticipoCargoBusqueda.setText("U");
		this.jButtonvalor_anticipoCargoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_anticipoCargoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_anticipoCargoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_anticipoCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_anticipoCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_anticipoCargoBusqueda"));

		if(this.cargoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_anticipoCargoBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_anticipoCargo = new JLabelMe();
		this.jLabelporcentaje_anticipoCargo.setText(""+CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO+" : *");
		this.jLabelporcentaje_anticipoCargo.setToolTipText("Porcentaje Anticipo");
		this.jLabelporcentaje_anticipoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_anticipoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_anticipoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_anticipoCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_anticipoCargo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_anticipoCargo.setToolTipText(CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO);
		this.gridaBagLayoutCargo = new GridBagLayout();
		this.jPanelporcentaje_anticipoCargo.setLayout(this.gridaBagLayoutCargo);


		jTextFieldporcentaje_anticipoCargo= new JTextFieldMe();
		jTextFieldporcentaje_anticipoCargo.setEnabled(false);
		jTextFieldporcentaje_anticipoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_anticipoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_anticipoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_anticipoCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_anticipoCargo.setText("0.0");

		this.jButtonporcentaje_anticipoCargoBusqueda= new JButtonMe();
		this.jButtonporcentaje_anticipoCargoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_anticipoCargoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_anticipoCargoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_anticipoCargoBusqueda.setText("U");
		this.jButtonporcentaje_anticipoCargoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_anticipoCargoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_anticipoCargoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_anticipoCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_anticipoCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_anticipoCargoBusqueda"));

		if(this.cargoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_anticipoCargoBusqueda.setVisible(false);		}


					
		this.jLabeles_jefeCargo = new JLabelMe();
		this.jLabeles_jefeCargo.setText(""+CargoConstantesFunciones.LABEL_ESJEFE+" : *");
		this.jLabeles_jefeCargo.setToolTipText("Es Jefe");
		this.jLabeles_jefeCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_jefeCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_jefeCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_jefeCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_jefeCargo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_jefeCargo.setToolTipText(CargoConstantesFunciones.LABEL_ESJEFE);
		this.gridaBagLayoutCargo = new GridBagLayout();
		this.jPaneles_jefeCargo.setLayout(this.gridaBagLayoutCargo);


		jCheckBoxes_jefeCargo= new JCheckBoxMe();
		jCheckBoxes_jefeCargo.setEnabled(false);

		jCheckBoxes_jefeCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_jefeCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_jefeCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_jefeCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_jefeCargoBusqueda= new JButtonMe();
		this.jButtones_jefeCargoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_jefeCargoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_jefeCargoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_jefeCargoBusqueda.setText("U");
		this.jButtones_jefeCargoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_jefeCargoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_jefeCargoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_jefeCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_jefeCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_jefeCargoBusqueda"));

		if(this.cargoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_jefeCargoBusqueda.setVisible(false);		}


					
		this.jLabeles_anualCargo = new JLabelMe();
		this.jLabeles_anualCargo.setText(""+CargoConstantesFunciones.LABEL_ESANUAL+" : *");
		this.jLabeles_anualCargo.setToolTipText("Es Anual");
		this.jLabeles_anualCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_anualCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_anualCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_anualCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_anualCargo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_anualCargo.setToolTipText(CargoConstantesFunciones.LABEL_ESANUAL);
		this.gridaBagLayoutCargo = new GridBagLayout();
		this.jPaneles_anualCargo.setLayout(this.gridaBagLayoutCargo);


		jCheckBoxes_anualCargo= new JCheckBoxMe();
		jCheckBoxes_anualCargo.setEnabled(false);

		jCheckBoxes_anualCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_anualCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_anualCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_anualCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_anualCargoBusqueda= new JButtonMe();
		this.jButtones_anualCargoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_anualCargoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_anualCargoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_anualCargoBusqueda.setText("U");
		this.jButtones_anualCargoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_anualCargoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_anualCargoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_anualCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_anualCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_anualCargoBusqueda"));

		if(this.cargoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_anualCargoBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeCargo = new JLabelMe();
		this.jLabelporcentajeCargo.setText(""+CargoConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeCargo.setToolTipText("Porcentaje");
		this.jLabelporcentajeCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeCargo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeCargo.setToolTipText(CargoConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutCargo = new GridBagLayout();
		this.jPanelporcentajeCargo.setLayout(this.gridaBagLayoutCargo);


		jTextFieldporcentajeCargo= new JTextFieldMe();
		jTextFieldporcentajeCargo.setEnabled(false);
		jTextFieldporcentajeCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeCargo.setText("0.0");

		this.jButtonporcentajeCargoBusqueda= new JButtonMe();
		this.jButtonporcentajeCargoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeCargoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeCargoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeCargoBusqueda.setText("U");
		this.jButtonporcentajeCargoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeCargoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeCargoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeCargoBusqueda"));

		if(this.cargoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeCargoBusqueda.setVisible(false);		}


					
		this.jLabelvalorCargo = new JLabelMe();
		this.jLabelvalorCargo.setText(""+CargoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorCargo.setToolTipText("Valor");
		this.jLabelvalorCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorCargo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorCargo.setToolTipText(CargoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutCargo = new GridBagLayout();
		this.jPanelvalorCargo.setLayout(this.gridaBagLayoutCargo);


		jTextFieldvalorCargo= new JTextFieldMe();
		jTextFieldvalorCargo.setEnabled(false);
		jTextFieldvalorCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorCargo.setText("0.0");

		this.jButtonvalorCargoBusqueda= new JButtonMe();
		this.jButtonvalorCargoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorCargoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorCargoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorCargoBusqueda.setText("U");
		this.jButtonvalorCargoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorCargoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorCargoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorCargoBusqueda"));

		if(this.cargoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorCargoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCargo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCargo = new JLabelMe();
		this.jLabelid_empresaCargo.setText(""+CargoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCargo.setToolTipText("Empresa");
		this.jLabelid_empresaCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCargo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCargo.setToolTipText(CargoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCargo = new GridBagLayout();
		this.jPanelid_empresaCargo.setLayout(this.gridaBagLayoutCargo);


		jComboBoxid_empresaCargo= new JComboBoxMe();
		jComboBoxid_empresaCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCargo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCargo.setEnabled(false);

		this.jButtonid_empresaCargo= new JButtonMe();
		this.jButtonid_empresaCargo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargo.setText("Buscar");
		this.jButtonid_empresaCargo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCargo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargo"));

		this.jButtonid_empresaCargoBusqueda= new JButtonMe();
		this.jButtonid_empresaCargoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCargoBusqueda.setText("U");
		this.jButtonid_empresaCargoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCargoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargoBusqueda"));

		if(this.cargoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCargoBusqueda.setVisible(false);		}

		this.jButtonid_empresaCargoUpdate= new JButtonMe();
		this.jButtonid_empresaCargoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCargoUpdate.setText("U");
		this.jButtonid_empresaCargoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCargoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargoUpdate"));



					
		this.jLabelid_cargoCargo = new JLabelMe();
		this.jLabelid_cargoCargo.setText(""+CargoConstantesFunciones.LABEL_IDCARGO+" : *");
		this.jLabelid_cargoCargo.setToolTipText("Cargo");
		this.jLabelid_cargoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cargoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cargoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cargoCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cargoCargo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cargoCargo.setToolTipText(CargoConstantesFunciones.LABEL_IDCARGO);
		this.gridaBagLayoutCargo = new GridBagLayout();
		this.jPanelid_cargoCargo.setLayout(this.gridaBagLayoutCargo);


		jComboBoxid_cargoCargo= new JComboBoxMe();
		jComboBoxid_cargoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cargoCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cargoCargo= new JButtonMe();
		this.jButtonid_cargoCargo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoCargo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoCargo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoCargo.setText("Buscar");
		this.jButtonid_cargoCargo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cargoCargo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoCargo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cargoCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoCargo"));

		this.jButtonid_cargoCargoBusqueda= new JButtonMe();
		this.jButtonid_cargoCargoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoCargoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoCargoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cargoCargoBusqueda.setText("U");
		this.jButtonid_cargoCargoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cargoCargoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoCargoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cargoCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoCargoBusqueda"));

		if(this.cargoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cargoCargoBusqueda.setVisible(false);		}

		this.jButtonid_cargoCargoUpdate= new JButtonMe();
		this.jButtonid_cargoCargoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoCargoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoCargoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cargoCargoUpdate.setText("U");
		this.jButtonid_cargoCargoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cargoCargoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoCargoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cargoCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoCargoUpdate"));


		jButtonid_cargoCargoArbol= new JButtonMe();
		jButtonid_cargoCargoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cargoCargoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cargoCargoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cargoCargoArbol.setText("Arbol");
		jButtonid_cargoCargoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cargoCargoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoCargoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cargoCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoCargoArbol"));



					
		this.jLabelid_cuenta_contableCargo = new JLabelMe();
		this.jLabelid_cuenta_contableCargo.setText(""+CargoConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableCargo.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableCargo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableCargo.setToolTipText(CargoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutCargo = new GridBagLayout();
		this.jPanelid_cuenta_contableCargo.setLayout(this.gridaBagLayoutCargo);


		jComboBoxid_cuenta_contableCargo= new JComboBoxMe();
		jComboBoxid_cuenta_contableCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableCargo= new JButtonMe();
		this.jButtonid_cuenta_contableCargo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCargo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCargo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCargo.setText("Buscar");
		this.jButtonid_cuenta_contableCargo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableCargo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCargo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCargo"));

		this.jButtonid_cuenta_contableCargoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableCargoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCargoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCargoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCargoBusqueda.setText("U");
		this.jButtonid_cuenta_contableCargoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableCargoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCargoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCargoBusqueda"));

		if(this.cargoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableCargoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableCargoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableCargoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCargoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCargoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCargoUpdate.setText("U");
		this.jButtonid_cuenta_contableCargoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableCargoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCargoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCargoUpdate"));


		jButtonid_cuenta_contableCargoArbol= new JButtonMe();
		jButtonid_cuenta_contableCargoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCargoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCargoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCargoArbol.setText("Arbol");
		jButtonid_cuenta_contableCargoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableCargoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCargoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCargoArbol"));



					
		this.jLabelid_numero_patronalCargo = new JLabelMe();
		this.jLabelid_numero_patronalCargo.setText(""+CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL+" : *");
		this.jLabelid_numero_patronalCargo.setToolTipText("Numero Patronal");
		this.jLabelid_numero_patronalCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_numero_patronalCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_numero_patronalCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_numero_patronalCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_numero_patronalCargo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_numero_patronalCargo.setToolTipText(CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL);
		this.gridaBagLayoutCargo = new GridBagLayout();
		this.jPanelid_numero_patronalCargo.setLayout(this.gridaBagLayoutCargo);


		jComboBoxid_numero_patronalCargo= new JComboBoxMe();
		jComboBoxid_numero_patronalCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_numero_patronalCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_numero_patronalCargo= new JButtonMe();
		this.jButtonid_numero_patronalCargo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalCargo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalCargo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalCargo.setText("Buscar");
		this.jButtonid_numero_patronalCargo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_numero_patronalCargo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalCargo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_numero_patronalCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalCargo"));

		this.jButtonid_numero_patronalCargoBusqueda= new JButtonMe();
		this.jButtonid_numero_patronalCargoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalCargoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalCargoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_numero_patronalCargoBusqueda.setText("U");
		this.jButtonid_numero_patronalCargoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_numero_patronalCargoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalCargoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_numero_patronalCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalCargoBusqueda"));

		if(this.cargoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_numero_patronalCargoBusqueda.setVisible(false);		}

		this.jButtonid_numero_patronalCargoUpdate= new JButtonMe();
		this.jButtonid_numero_patronalCargoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalCargoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalCargoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_numero_patronalCargoUpdate.setText("U");
		this.jButtonid_numero_patronalCargoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_numero_patronalCargoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalCargoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_numero_patronalCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalCargoUpdate"));



					
		this.jLabelid_tipo_pago__n_mCargo = new JLabelMe();
		this.jLabelid_tipo_pago__n_mCargo.setText(""+CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM+" : *");
		this.jLabelid_tipo_pago__n_mCargo.setToolTipText("Tipo Pago_ N M");
		this.jLabelid_tipo_pago__n_mCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_pago__n_mCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_pago__n_mCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_pago__n_mCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_pago__n_mCargo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_pago__n_mCargo.setToolTipText(CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM);
		this.gridaBagLayoutCargo = new GridBagLayout();
		this.jPanelid_tipo_pago__n_mCargo.setLayout(this.gridaBagLayoutCargo);


		jComboBoxid_tipo_pago__n_mCargo= new JComboBoxMe();
		jComboBoxid_tipo_pago__n_mCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_pago__n_mCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_pago__n_mCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_pago__n_mCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_pago__n_mCargo= new JButtonMe();
		this.jButtonid_tipo_pago__n_mCargo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_pago__n_mCargo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_pago__n_mCargo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_pago__n_mCargo.setText("Buscar");
		this.jButtonid_tipo_pago__n_mCargo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_pago__n_mCargo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_pago__n_mCargo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_pago__n_mCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_pago__n_mCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_pago__n_mCargo"));

		this.jButtonid_tipo_pago__n_mCargoBusqueda= new JButtonMe();
		this.jButtonid_tipo_pago__n_mCargoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_pago__n_mCargoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_pago__n_mCargoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_pago__n_mCargoBusqueda.setText("U");
		this.jButtonid_tipo_pago__n_mCargoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_pago__n_mCargoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_pago__n_mCargoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_pago__n_mCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_pago__n_mCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_pago__n_mCargoBusqueda"));

		if(this.cargoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_pago__n_mCargoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_pago__n_mCargoUpdate= new JButtonMe();
		this.jButtonid_tipo_pago__n_mCargoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_pago__n_mCargoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_pago__n_mCargoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_pago__n_mCargoUpdate.setText("U");
		this.jButtonid_tipo_pago__n_mCargoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_pago__n_mCargoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_pago__n_mCargoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_pago__n_mCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_pago__n_mCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_pago__n_mCargoUpdate"));



					
		this.jLabelid_cargo_grupoCargo = new JLabelMe();
		this.jLabelid_cargo_grupoCargo.setText(""+CargoConstantesFunciones.LABEL_IDCARGOGRUPO+" : *");
		this.jLabelid_cargo_grupoCargo.setToolTipText("Cargo Grupo");
		this.jLabelid_cargo_grupoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cargo_grupoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cargo_grupoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cargo_grupoCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cargo_grupoCargo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cargo_grupoCargo.setToolTipText(CargoConstantesFunciones.LABEL_IDCARGOGRUPO);
		this.gridaBagLayoutCargo = new GridBagLayout();
		this.jPanelid_cargo_grupoCargo.setLayout(this.gridaBagLayoutCargo);


		jComboBoxid_cargo_grupoCargo= new JComboBoxMe();
		jComboBoxid_cargo_grupoCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargo_grupoCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargo_grupoCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cargo_grupoCargo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cargo_grupoCargo= new JButtonMe();
		this.jButtonid_cargo_grupoCargo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargo_grupoCargo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargo_grupoCargo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargo_grupoCargo.setText("Buscar");
		this.jButtonid_cargo_grupoCargo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cargo_grupoCargo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargo_grupoCargo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cargo_grupoCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargo_grupoCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargo_grupoCargo"));

		this.jButtonid_cargo_grupoCargoBusqueda= new JButtonMe();
		this.jButtonid_cargo_grupoCargoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargo_grupoCargoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargo_grupoCargoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cargo_grupoCargoBusqueda.setText("U");
		this.jButtonid_cargo_grupoCargoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cargo_grupoCargoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargo_grupoCargoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cargo_grupoCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargo_grupoCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargo_grupoCargoBusqueda"));

		if(this.cargoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cargo_grupoCargoBusqueda.setVisible(false);		}

		this.jButtonid_cargo_grupoCargoUpdate= new JButtonMe();
		this.jButtonid_cargo_grupoCargoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargo_grupoCargoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargo_grupoCargoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cargo_grupoCargoUpdate.setText("U");
		this.jButtonid_cargo_grupoCargoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cargo_grupoCargoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargo_grupoCargoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cargo_grupoCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargo_grupoCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargo_grupoCargoUpdate"));



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
		//this.jInternalFrameDetalleCargo = new CargoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cargo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCargo= new GridBagLayout();
		

		
		String sToolTipCargo="";
		sToolTipCargo=CargoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCargo+="(Nomina.Cargo)";
		}
		
		if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCargo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCargo = new JButtonMe();
		this.jButtonModificarCargo = new JButtonMe();
        this.jButtonActualizarCargo = new JButtonMe();
        this.jButtonEliminarCargo = new JButtonMe();
        this.jButtonCancelarCargo = new JButtonMe();
        this.jButtonGuardarCambiosCargo = new JButtonMe();
		this.jButtonGuardarCambiosTablaCargo = new JButtonMe();
		this.jButtonCerrarCargo = new JButtonMe();
		
		this.jScrollPanelDatosCargo = new JScrollPane();   
        this.jScrollPanelDatosEdicionCargo = new JScrollPane();
		this.jScrollPanelDatosGeneralCargo = new JScrollPane();
				
		
		
		this.jPanelCamposCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cargo";
		
		if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargos" + this.sPath));
		} else {
			this.jScrollPanelDatosCargo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCargo.setName("jPanelCamposCargo"); 

		this.jPanelCamposOcultosCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCargo.setName("jPanelCamposOcultosCargo"); 

        this.jPanelAccionesCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCargo.setToolTipText("Acciones");
        this.jPanelAccionesCargo.setName("Acciones"); 

		this.jPanelAccionesFormularioCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCargo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCargo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCargo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCargo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCargo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCargo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCargo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCargo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCargo.setText("Nuevo");
		this.jButtonModificarCargo.setText("Editar");
        this.jButtonActualizarCargo.setText("Actualizar");
        this.jButtonEliminarCargo.setText("Eliminar");
        this.jButtonCancelarCargo.setText("Cancelar");
        this.jButtonGuardarCambiosCargo.setText("Guardar");
		this.jButtonGuardarCambiosTablaCargo.setText("Guardar");
		this.jButtonCerrarCargo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCargo,"nuevo_button","Nuevo",this.cargoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCargo,"modificar_button","Editar",this.cargoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCargo,"actualizar_button","Actualizar",this.cargoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCargo,"eliminar_button","Eliminar",this.cargoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCargo,"cancelar_button","Cancelar",this.cargoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCargo,"guardarcambios_button","Guardar",this.cargoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCargo,"guardarcambiostabla_button","Guardar",this.cargoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCargo,"cerrar_button","Salir",this.cargoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCargo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCargo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCargo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCargo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCargo.setToolTipText("Nuevo"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCargo.setToolTipText("Editar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCargo.setToolTipText("Actualizar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCargo.setToolTipText("Eliminar)"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCargo.setToolTipText("Cancelar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCargo.setToolTipText("Guardar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCargo.setToolTipText("Guardar"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCargo.setToolTipText("Salir"+" "+CargoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCargo";
		inputMap = this.jButtonNuevoCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCargo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCargo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCargo";
		inputMap = this.jButtonActualizarCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCargo"));
		
		//ELIMINAR
		sMapKey = "EliminarCargo";
		inputMap = this.jButtonEliminarCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCargo"));
		
		//CANCELAR	
		sMapKey = "CancelarCargo";
		inputMap = this.jButtonCancelarCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCargo"));
		
		//CERRAR		
		sMapKey = "CerrarCargo";
		inputMap = this.jButtonCerrarCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCargo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCargo";
		inputMap = this.jButtonGuardarCambiosTablaCargo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCargo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCargo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCargo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCargo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCargo.setToolTipText("Nuevo Cargo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCargo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCargo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCargo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCargo.setToolTipText("Sin Cerrar Ventana Cargo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCargo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCargo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCargo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCargo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCargo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
		this.jButtonArbolCargo = new JButtonMe();
		this.jButtonArbolCargo.setText("Arbol");		
		this.jButtonArbolCargo.setToolTipText("Buscar Por Arbol");
				
		
			
			
		this.jComboBoxTiposAccionesCargo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCargo.setText("Accion");
		this.jComboBoxTiposAccionesCargo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCargo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCargo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCargo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCargo = new JLabelMe();
		
		this.jLabelAccionesCargo.setText("Acciones");		
		this.jLabelAccionesCargo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCargo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCargo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCargo=new JTabbedPane();
		this.jTabbedPaneRelacionesCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCargo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		this.jButtonArbolCargo.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolCargo.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolCargo.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposAccionesCargo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCargo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCargo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCargo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCargo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCargo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCargo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCargo = new GridBagLayout();
		
		this.jPanelCamposCargo.setLayout(gridaBagLayoutCamposCargo);
		this.jPanelCamposOcultosCargo.setLayout(gridaBagLayoutCamposOcultosCargo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCargo.add(jLabelIdCargo, this.gridBagConstraintsCargo);



	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCargo.add(jLabelidCargo, this.gridBagConstraintsCargo);


	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCargo.add(jLabelid_empresaCargo, this.gridBagConstraintsCargo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 2;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCargo.add(jButtonid_empresaCargoBusqueda, this.gridBagConstraintsCargo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 3;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCargo.add(jButtonid_empresaCargoUpdate, this.gridBagConstraintsCargo);
	}

	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCargo.add(jComboBoxid_empresaCargo, this.gridBagConstraintsCargo);


	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cargoCargo.add(jLabelid_cargoCargo, this.gridBagConstraintsCargo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 2;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cargoCargo.add(jButtonid_cargoCargoBusqueda, this.gridBagConstraintsCargo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 3;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cargoCargo.add(jButtonid_cargoCargoUpdate, this.gridBagConstraintsCargo);
	}

	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cargoCargo.add(jComboBoxid_cargoCargo, this.gridBagConstraintsCargo);


	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableCargo.add(jLabelid_cuenta_contableCargo, this.gridBagConstraintsCargo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 2;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCargo.add(jButtonid_cuenta_contableCargoBusqueda, this.gridBagConstraintsCargo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 3;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCargo.add(jButtonid_cuenta_contableCargoUpdate, this.gridBagConstraintsCargo);
	}

	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableCargo.add(jComboBoxid_cuenta_contableCargo, this.gridBagConstraintsCargo);


	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_numero_patronalCargo.add(jLabelid_numero_patronalCargo, this.gridBagConstraintsCargo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 2;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_numero_patronalCargo.add(jButtonid_numero_patronalCargoBusqueda, this.gridBagConstraintsCargo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 3;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_numero_patronalCargo.add(jButtonid_numero_patronalCargoUpdate, this.gridBagConstraintsCargo);
	}

	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_numero_patronalCargo.add(jComboBoxid_numero_patronalCargo, this.gridBagConstraintsCargo);


	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_pago__n_mCargo.add(jLabelid_tipo_pago__n_mCargo, this.gridBagConstraintsCargo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 2;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_pago__n_mCargo.add(jButtonid_tipo_pago__n_mCargoBusqueda, this.gridBagConstraintsCargo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 3;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_pago__n_mCargo.add(jButtonid_tipo_pago__n_mCargoUpdate, this.gridBagConstraintsCargo);
	}

	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_pago__n_mCargo.add(jComboBoxid_tipo_pago__n_mCargo, this.gridBagConstraintsCargo);


	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cargo_grupoCargo.add(jLabelid_cargo_grupoCargo, this.gridBagConstraintsCargo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 2;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cargo_grupoCargo.add(jButtonid_cargo_grupoCargoBusqueda, this.gridBagConstraintsCargo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 3;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cargo_grupoCargo.add(jButtonid_cargo_grupoCargoUpdate, this.gridBagConstraintsCargo);
	}

	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cargo_grupoCargo.add(jComboBoxid_cargo_grupoCargo, this.gridBagConstraintsCargo);


	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCargo.add(jLabelcodigoCargo, this.gridBagConstraintsCargo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 2;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCargo.add(jButtoncodigoCargoBusqueda, this.gridBagConstraintsCargo);
	}

	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCargo.add(jTextFieldcodigoCargo, this.gridBagConstraintsCargo);


	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCargo.add(jLabelnombreCargo, this.gridBagConstraintsCargo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 2;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCargo.add(jButtonnombreCargoBusqueda, this.gridBagConstraintsCargo);
	}

	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCargo.add(jscrollPanenombreCargo, this.gridBagConstraintsCargo);


	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_anticipoCargo.add(jLabelvalor_anticipoCargo, this.gridBagConstraintsCargo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 2;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_anticipoCargo.add(jButtonvalor_anticipoCargoBusqueda, this.gridBagConstraintsCargo);
	}

	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_anticipoCargo.add(jTextFieldvalor_anticipoCargo, this.gridBagConstraintsCargo);


	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_anticipoCargo.add(jLabelporcentaje_anticipoCargo, this.gridBagConstraintsCargo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 2;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_anticipoCargo.add(jButtonporcentaje_anticipoCargoBusqueda, this.gridBagConstraintsCargo);
	}

	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_anticipoCargo.add(jTextFieldporcentaje_anticipoCargo, this.gridBagConstraintsCargo);


	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_jefeCargo.add(jLabeles_jefeCargo, this.gridBagConstraintsCargo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 2;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_jefeCargo.add(jButtones_jefeCargoBusqueda, this.gridBagConstraintsCargo);
	}

	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_jefeCargo.add(jCheckBoxes_jefeCargo, this.gridBagConstraintsCargo);


	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_anualCargo.add(jLabeles_anualCargo, this.gridBagConstraintsCargo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 2;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_anualCargo.add(jButtones_anualCargoBusqueda, this.gridBagConstraintsCargo);
	}

	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_anualCargo.add(jCheckBoxes_anualCargo, this.gridBagConstraintsCargo);


	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeCargo.add(jLabelporcentajeCargo, this.gridBagConstraintsCargo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 2;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeCargo.add(jButtonporcentajeCargoBusqueda, this.gridBagConstraintsCargo);
	}

	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeCargo.add(jTextFieldporcentajeCargo, this.gridBagConstraintsCargo);


	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 0;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorCargo.add(jLabelvalorCargo, this.gridBagConstraintsCargo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargo = new GridBagConstraints();
		//this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = 2;
		this.gridBagConstraintsCargo.ipadx = 0;
		this.gridBagConstraintsCargo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorCargo.add(jButtonvalorCargoBusqueda, this.gridBagConstraintsCargo);
	}

	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargo.gridy = 0;
	this.gridBagConstraintsCargo.gridx = 1;
	this.gridBagConstraintsCargo.ipadx = 0;
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorCargo.add(jTextFieldvalorCargo, this.gridBagConstraintsCargo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargo.add(this.jPanelidCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposCargo % 2==0) {
		iXPanelCamposCargo=0;
		iYPanelCamposCargo++;
	}
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargo.add(this.jPanelid_cargoCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposCargo % 2==0) {
		iXPanelCamposCargo=0;
		iYPanelCamposCargo++;
	}
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargo.add(this.jPanelid_cuenta_contableCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposCargo % 2==0) {
		iXPanelCamposCargo=0;
		iYPanelCamposCargo++;
	}
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargo.add(this.jPanelid_numero_patronalCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposCargo % 2==0) {
		iXPanelCamposCargo=0;
		iYPanelCamposCargo++;
	}
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargo.add(this.jPanelid_tipo_pago__n_mCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposCargo % 2==0) {
		iXPanelCamposCargo=0;
		iYPanelCamposCargo++;
	}
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargo.add(this.jPanelid_cargo_grupoCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposCargo % 2==0) {
		iXPanelCamposCargo=0;
		iYPanelCamposCargo++;
	}
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargo.add(this.jPanelcodigoCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposCargo % 2==0) {
		iXPanelCamposCargo=0;
		iYPanelCamposCargo++;
	}
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargo.add(this.jPanelnombreCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposCargo % 2==0) {
		iXPanelCamposCargo=0;
		iYPanelCamposCargo++;
	}
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargo.add(this.jPanelvalor_anticipoCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposCargo % 2==0) {
		iXPanelCamposCargo=0;
		iYPanelCamposCargo++;
	}
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargo.add(this.jPanelporcentaje_anticipoCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposCargo % 2==0) {
		iXPanelCamposCargo=0;
		iYPanelCamposCargo++;
	}
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargo.add(this.jPaneles_jefeCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposCargo % 2==0) {
		iXPanelCamposCargo=0;
		iYPanelCamposCargo++;
	}
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargo.add(this.jPaneles_anualCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposCargo % 2==0) {
		iXPanelCamposCargo=0;
		iYPanelCamposCargo++;
	}
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargo.add(this.jPanelporcentajeCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposCargo % 2==0) {
		iXPanelCamposCargo=0;
		iYPanelCamposCargo++;
	}
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargo.add(this.jPanelvalorCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposCargo % 2==0) {
		iXPanelCamposCargo=0;
		iYPanelCamposCargo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCargo = new GridBagConstraints();
	this.gridBagConstraintsCargo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargo.gridy = iYPanelCamposOcultosCargo;
	this.gridBagConstraintsCargo.gridx = iXPanelCamposOcultosCargo++;
	this.gridBagConstraintsCargo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCargo.add(this.jPanelid_empresaCargo, this.gridBagConstraintsCargo);



	if(iXPanelCamposOcultosCargo % 2==0) {
		iXPanelCamposOcultosCargo=0;
		iYPanelCamposOcultosCargo++;
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
			
		GridBagLayout gridaBagLayoutAccionesCargo= new GridBagLayout();
		this.jPanelAccionesCargo.setLayout(gridaBagLayoutAccionesCargo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCargo= new GridBagLayout();
		this.jPanelAccionesFormularioCargo.setLayout(gridaBagLayoutAccionesFormularioCargo);
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCargo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCargo.add(this.jComboBoxTiposAccionesFormularioCargo, this.gridBagConstraintsCargo);

		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCargo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCargo.add(this.jCheckBoxPostAccionNuevoCargo, this.gridBagConstraintsCargo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cargoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCargo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCargo.add(this.jCheckBoxPostAccionSinCerrarCargo, this.gridBagConstraintsCargo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cargoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cargoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCargo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCargo.add(this.jCheckBoxPostAccionSinMensajeCargo, this.gridBagConstraintsCargo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx = iPosXAccion++;
			
		this.jPanelAccionesCargo.add(this.jButtonModificarCargo, this.gridBagConstraintsCargo);							

		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargo.gridy = 0;
		this.gridBagConstraintsCargo.gridx =iPosXAccion++;
			
		this.jPanelAccionesCargo.add(this.jButtonEliminarCargo, this.gridBagConstraintsCargo);
		
			
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = 0;		
		this.gridBagConstraintsCargo.gridx = iPosXAccion++;
		
		this.jPanelAccionesCargo.add(this.jButtonActualizarCargo, this.gridBagConstraintsCargo);


		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = 0;		
		this.gridBagConstraintsCargo.gridx = iPosXAccion++;
		
		this.jPanelAccionesCargo.add(this.jButtonGuardarCambiosCargo, this.gridBagConstraintsCargo);	
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = 0;		
		this.gridBagConstraintsCargo.gridx =iPosXAccion++;
		
		this.jPanelAccionesCargo.add(this.jButtonCancelarCargo, this.gridBagConstraintsCargo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCargo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCargo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cargoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCargo = new GridBagConstraints();						
			this.gridBagConstraintsCargo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCargo.gridx = 0;		
			//this.gridBagConstraintsCargo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCargo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCargo.gridx =0;
		this.gridBagConstraintsCargo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCargo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCargo, this.gridBagConstraintsCargo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeCargo = new CargoBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeCargo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeCargo.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeCargo.setTitle("Cargo ARBOL");
		this.jInternalFrameTreeCargo.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cargo Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeCargo.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeCargo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeCargo.setResizable(true);
	    this.jInternalFrameTreeCargo.setClosable(true);
	    this.jInternalFrameTreeCargo.setMaximizable(true);
			
			
		//if(CargoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCargo = new CargoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cargo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cargo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cargo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CargoModel cargoModel=new CargoModel(this);
			
			//SI USARA CLASE INTERNA
			//CargoModel.CargoFocusTraversalPolicy cargoFocusTraversalPolicy = cargoModel.new CargoFocusTraversalPolicy(this);
			
			//cargoFocusTraversalPolicy.setcargoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cargoModel);
			
			
			this.jContentPaneDetalleCargo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCargo = new GridBagLayout();	
			this.jContentPaneDetalleCargo.setLayout(gridaBagLayoutDetalleCargo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCargo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCargo = new GridBagConstraints();
				this.gridBagConstraintsCargo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCargo.gridx = 0;
					
				
				this.jContentPaneDetalleCargo.add(jTtoolBarDetalleCargo, gridBagConstraintsCargo);								
				
}
			
			this.jScrollPanelDatosEdicionCargo=   new JScrollPane(jContentPaneDetalleCargo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCargo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCargo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCargo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCargo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCargo.gridx = 0;
	        
			this.jContentPaneDetalleCargo.add(jPanelCamposCargo, gridBagConstraintsCargo);
			
			
			
			
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
						&& cargoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAsistenciaMensual(this.puedeCargarPorParteAsistenciaMensual,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCargo(this.puedeCargarPorParteCargo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(this.puedeCargarPorParteEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoEstructura(this.puedeCargarPorParteEmpleadoEstructura,false,-1);
					
					if(this.cargoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCargo= new GridBagConstraints();
						this.gridBagConstraintsCargo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCargo.gridx = 0;
						this.jContentPaneDetalleCargo.add(this.jTabbedPaneRelacionesCargo, this.gridBagConstraintsCargo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCargo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAsistenciaMensual(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCargo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoEstructura(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCargo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCargo = new GridBagConstraints();
					this.gridBagConstraintsCargo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCargo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCargo.gridx = 0;
					
				
					this.jContentPaneDetalleCargo.add(jPanelCamposOcultosCargo, gridBagConstraintsCargo);
				
					this.jPanelCamposOcultosCargo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.gridy = iGridyRelaciones++;//13;		
	        this.gridBagConstraintsCargo.gridx = 0;
	        this.gridBagConstraintsCargo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCargo.add(this.jPanelAccionesFormularioCargo, this.gridBagConstraintsCargo);							
			
			
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
	        this.gridBagConstraintsCargo.gridy = iGridyRelaciones;//13;		
	        this.gridBagConstraintsCargo.gridx = 0;
	        
			
			this.jContentPaneDetalleCargo.add(this.jPanelAccionesCargo, this.gridBagConstraintsCargo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCargo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCargo=   new JScrollPane(this.jPanelCamposCargo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCargo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCargo.gridx = 0;
			this.gridBagConstraintsCargo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCargo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCargo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCargo, this.gridBagConstraintsCargo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCargo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCargo, this.gridBagConstraintsCargo);			
			
			this.gridBagConstraintsCargo = new GridBagConstraints();
			this.gridBagConstraintsCargo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCargo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCargo, this.gridBagConstraintsCargo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCargo, this.gridBagConstraintsCargo);
			
			
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCargo, this.gridBagConstraintsCargo);
		
			
		this.gridBagConstraintsCargo = new GridBagConstraints();
		this.gridBagConstraintsCargo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCargo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCargo, this.gridBagConstraintsCargo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCargo;//jContentPane;
		
		return jScrollPanelDatosEdicionCargo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAsistenciaMensual(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
		this.asistenciamensualSessionBean.setConGuardarRelaciones(false);
		this.asistenciamensualSessionBean.setEsGuardarRelacionado(true);

		this.asistenciamensualBeanSwingJInternalFrame=null;//new AsistenciaMensualBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.asistenciamensualBeanSwingJInternalFramePopup=new AsistenciaMensualBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.asistenciamensualBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {

				AsistenciaMensualJInternalFrame.STIPO_TAMANIO_GENERAL=CargoJInternalFrame.STIPO_TAMANIO_GENERAL;
				AsistenciaMensualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CargoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.asistenciamensualSessionBean.setEsGuardarRelacionado(true);

				this.asistenciamensualBeanSwingJInternalFrame=new AsistenciaMensualBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.asistenciamensualBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.asistenciamensualBeanSwingJInternalFrame.setasistenciamensualSessionBean(this.asistenciamensualSessionBean);

				//this.gridBagConstraintsCargo = new GridBagConstraints();
				//this.gridBagConstraintsCargo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCargo.gridx = 0;
				//this.jContentPaneDetalleCargo.add(this.asistenciamensualBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCargo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCargo.add("Asistencia Mensuales",this.asistenciamensualBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCargo.setComponentAt(iIndexTab,this.asistenciamensualBeanSwingJInternalFrame.getContentPane());
				}

				//AsistenciaMensualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.asistenciamensualSessionBean.setEsGuardarRelacionado(false);
				this.asistenciamensualBeanSwingJInternalFrame=null;//new AsistenciaMensualBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAsistenciaMensual) {
					this.jTabbedPaneRelacionesCargo.add("Asistencia Mensuales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCargo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cargoSessionBean=new CargoSessionBean();
		this.cargoSessionBean.setConGuardarRelaciones(false);
		//this.cargoSessionBean.setEsGuardarRelacionado(true);

		this.cargoBeanSwingJInternalFrame=null;//new CargoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cargoBeanSwingJInternalFramePopup=new CargoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cargoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cargoSessionBean.getEsGuardarRelacionado()) {
				CargoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CargoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cargoSessionBean.setEsGuardarRelacionado(true);

				this.cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cargoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cargoBeanSwingJInternalFrame.setcargoSessionBean(this.cargoSessionBean);

				//this.gridBagConstraintsCargo = new GridBagConstraints();
				//this.gridBagConstraintsCargo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCargo.gridx = 0;
				//this.jContentPaneDetalleCargo.add(this.cargoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCargo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCargo.add("Cargos",this.cargoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCargo.setComponentAt(iIndexTab,this.cargoBeanSwingJInternalFrame.getContentPane());
				}

				//CargoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cargoSessionBean.setEsGuardarRelacionado(false);
				this.cargoBeanSwingJInternalFrame=null;//new CargoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cargoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCargo) {
					this.jTabbedPaneRelacionesCargo.add("Cargos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoSessionBean=new EmpleadoSessionBean();
		this.empleadoSessionBean.setConGuardarRelaciones(false);
		this.empleadoSessionBean.setEsGuardarRelacionado(true);

		this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {

				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=CargoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CargoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoSessionBean.setEsGuardarRelacionado(true);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoBeanSwingJInternalFrame.setempleadoSessionBean(this.empleadoSessionBean);

				//this.gridBagConstraintsCargo = new GridBagConstraints();
				//this.gridBagConstraintsCargo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCargo.gridx = 0;
				//this.jContentPaneDetalleCargo.add(this.empleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCargo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCargo.add("Empleados",this.empleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCargo.setComponentAt(iIndexTab,this.empleadoBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoSessionBean.setEsGuardarRelacionado(false);
				this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleado) {
					this.jTabbedPaneRelacionesCargo.add("Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoEstructura(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
		this.empleadoestructuraSessionBean.setConGuardarRelaciones(false);
		this.empleadoestructuraSessionBean.setEsGuardarRelacionado(true);

		this.empleadoestructuraBeanSwingJInternalFrame=null;//new EmpleadoEstructuraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoestructuraBeanSwingJInternalFramePopup=new EmpleadoEstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoestructuraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {

				EmpleadoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=CargoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CargoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoestructuraSessionBean.setEsGuardarRelacionado(true);

				this.empleadoestructuraBeanSwingJInternalFrame=new EmpleadoEstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoestructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoestructuraBeanSwingJInternalFrame.setempleadoestructuraSessionBean(this.empleadoestructuraSessionBean);

				//this.gridBagConstraintsCargo = new GridBagConstraints();
				//this.gridBagConstraintsCargo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCargo.gridx = 0;
				//this.jContentPaneDetalleCargo.add(this.empleadoestructuraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCargo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCargo.add("Empleado Estructuras",this.empleadoestructuraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCargo.setComponentAt(iIndexTab,this.empleadoestructuraBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoestructuraSessionBean.setEsGuardarRelacionado(false);
				this.empleadoestructuraBeanSwingJInternalFrame=null;//new EmpleadoEstructuraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoEstructura) {
					this.jTabbedPaneRelacionesCargo.add("Empleado Estructuras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarAsistenciaMensualBeanSwingJInternalFrame(List<Cargo> cargos,Cargo cargo,AsistenciaMensualBeanSwingJInternalFrame asistenciamensualBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//asistenciamensualBeanSwingJInternalFrame=new AsistenciaMensualBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					asistenciamensualBeanSwingJInternalFrame.getAsistenciaMensualLogic().setConnexion(this.cargoLogic.getConnexion());

					asistenciamensualBeanSwingJInternalFrame.setcargosForeignKey(cargos);
					asistenciamensualBeanSwingJInternalFrame.setcargoForeignKey(cargo);
					asistenciamensualBeanSwingJInternalFrame.asistenciamensualSessionBean.setisBusquedaDesdeForeignKeySesionCargo(true);
					asistenciamensualBeanSwingJInternalFrame.asistenciamensualSessionBean.setlidCargoActual(cargo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					asistenciamensualBeanSwingJInternalFrame.cargarCombosForeignKeyAsistenciaMensual(asistenciamensualBeanSwingJInternalFrame.isCargarCombosDependencia);
					asistenciamensualBeanSwingJInternalFrame.setVisibilidadBusquedasParaCargo(true);
					asistenciamensualBeanSwingJInternalFrame.setid_cargoFK_IdCargo(cargo.getId());

					if(!this.conCargarFormDetalle) {
						asistenciamensualBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					asistenciamensualBeanSwingJInternalFrame.setSelectedItemCombosFrameCargoForeignKey(cargo,1,false,true,true);
					asistenciamensualBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					asistenciamensualBeanSwingJInternalFrame.procesarBusqueda("FK_IdCargo");
					asistenciamensualBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCargo");
					asistenciamensualBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsistenciaMensual(true);
					asistenciamensualBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAsistenciaMensual("n",asistenciamensualBeanSwingJInternalFrame.isGuardarCambiosEnLote, asistenciamensualBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					asistenciamensualBeanSwingJInternalFrame.setAutoscrolls(true);
					asistenciamensualBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						asistenciamensualBeanSwingJInternalFrame.actualizarEstadoPanelsAsistenciaMensual("relacionado");
					} else {
						asistenciamensualBeanSwingJInternalFrame.actualizarEstadoPanelsAsistenciaMensual("no_relacionado");
					}

					asistenciamensualBeanSwingJInternalFrame.getjButtonRecargarInformacionAsistenciaMensual().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoEstructuraBeanSwingJInternalFrame(List<Cargo> cargos,Cargo cargo,EmpleadoEstructuraBeanSwingJInternalFrame empleadoestructuraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoestructuraBeanSwingJInternalFrame=new EmpleadoEstructuraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoestructuraBeanSwingJInternalFrame.getEmpleadoEstructuraLogic().setConnexion(this.cargoLogic.getConnexion());

					empleadoestructuraBeanSwingJInternalFrame.setcargosForeignKey(cargos);
					empleadoestructuraBeanSwingJInternalFrame.setcargoForeignKey(cargo);
					empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraSessionBean.setisBusquedaDesdeForeignKeySesionCargo(true);
					empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraSessionBean.setlidCargoActual(cargo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoestructuraBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoEstructura(empleadoestructuraBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoestructuraBeanSwingJInternalFrame.setVisibilidadBusquedasParaCargo(true);
					empleadoestructuraBeanSwingJInternalFrame.setid_cargoFK_IdCargo(cargo.getId());

					if(!this.conCargarFormDetalle) {
						empleadoestructuraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoestructuraBeanSwingJInternalFrame.setSelectedItemCombosFrameCargoForeignKey(cargo,1,false,true,true);
					empleadoestructuraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoestructuraBeanSwingJInternalFrame.procesarBusqueda("FK_IdCargo");
					empleadoestructuraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCargo");
					empleadoestructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoEstructura(true);
					empleadoestructuraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoEstructura("n",empleadoestructuraBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoestructuraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoestructuraBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoestructuraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoestructuraBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoEstructura("relacionado");
					} else {
						empleadoestructuraBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoEstructura("no_relacionado");
					}

					empleadoestructuraBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoEstructura().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoBeanSwingJInternalFrame(List<Cargo> cargos,Cargo cargo,EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.cargoLogic.getConnexion());

					empleadoBeanSwingJInternalFrame.setcargosForeignKey(cargos);
					empleadoBeanSwingJInternalFrame.setcargoForeignKey(cargo);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionCargo(true);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setlidCargoActual(cargo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleado(empleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCargo(true);
					empleadoBeanSwingJInternalFrame.setid_cargoFK_IdCargo(cargo.getId());

					if(!this.conCargarFormDetalle) {
						empleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameCargoForeignKey(cargo,1,false,true,true);
					empleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCargo");
					empleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCargo");
					empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(true);
					empleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleado("n",empleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("relacionado");
					} else {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");
					}

					empleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCargoBeanSwingJInternalFrame(List<Cargo> cargos,Cargo cargo,CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cargoBeanSwingJInternalFrame.getCargoLogic().setConnexion(this.cargoLogic.getConnexion());

					cargoBeanSwingJInternalFrame.setcargosForeignKey(cargos);
					cargoBeanSwingJInternalFrame.setcargoForeignKey(cargo);
					cargoBeanSwingJInternalFrame.cargoSessionBean.setisBusquedaDesdeForeignKeySesionCargo(true);
					cargoBeanSwingJInternalFrame.cargoSessionBean.setlidCargoActual(cargo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cargoBeanSwingJInternalFrame.cargarCombosForeignKeyCargo(cargoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cargoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCargo(true);
					cargoBeanSwingJInternalFrame.setid_cargoFK_IdCargo(cargo.getId());

					if(!this.conCargarFormDetalle) {
						cargoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cargoBeanSwingJInternalFrame.setSelectedItemCombosFrameCargoForeignKey(cargo,1,false,true,true);
					cargoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cargoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCargo");
					cargoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCargo");
					cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo(true);
					cargoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCargo("n",cargoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cargoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cargoBeanSwingJInternalFrame.setAutoscrolls(true);
					cargoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cargoBeanSwingJInternalFrame.actualizarEstadoPanelsCargo("relacionado");
					} else {
						cargoBeanSwingJInternalFrame.actualizarEstadoPanelsCargo("no_relacionado");
					}

					cargoBeanSwingJInternalFrame.getjButtonRecargarInformacionCargo().setVisible(false);

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
