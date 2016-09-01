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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.CuentaPorCobrarConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class CuentaPorCobrarDetalleFormJInternalFrame extends CuentaPorCobrarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCuentaPorCobrar;
	
	protected JMenuBar jmenuBarDetalleCuentaPorCobrar;
	
	protected JMenu jmenuDetalleCuentaPorCobrar;
	protected JMenu jmenuDetalleArchivoCuentaPorCobrar;
	protected JMenu jmenuDetalleAccionesCuentaPorCobrar;
	protected JMenu jmenuDetalleDatosCuentaPorCobrar;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCuentaPorCobrar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaPorCobrar;	
	protected GridBagConstraints gridBagConstraintsCuentaPorCobrar;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CuentaPorCobrarBeanSwingJInternalFrameAdditional jInternalFrameDetalleCuentaPorCobrar;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";
	
	public CuentaPorCobrarSessionBean cuentaporcobrarSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public FacturaSessionBean facturaSessionBean;	
	
	public CuentaPorCobrarLogic cuentaporcobrarLogic;
	
	public JScrollPane jScrollPanelDatosCuentaPorCobrar;
	public JScrollPane jScrollPanelDatosEdicionCuentaPorCobrar;
	public JScrollPane jScrollPanelDatosGeneralCuentaPorCobrar;
	
	protected JPanel jPanelCamposCuentaPorCobrar;    
	protected JPanel jPanelCamposOcultosCuentaPorCobrar;    	
	protected JPanel jPanelAccionesCuentaPorCobrar;
	protected JPanel jPanelAccionesFormularioCuentaPorCobrar;
    
	
	
	protected Integer iXPanelCamposCuentaPorCobrar=0;
	protected Integer iYPanelCamposCuentaPorCobrar=0;
	
	protected Integer iXPanelCamposOcultosCuentaPorCobrar=0;
	protected Integer iYPanelCamposOcultosCuentaPorCobrar=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCuentaPorCobrar;
	public JButton jButtonModificarCuentaPorCobrar;
	public JButton jButtonActualizarCuentaPorCobrar;
    public JButton jButtonEliminarCuentaPorCobrar;
	public JButton jButtonCancelarCuentaPorCobrar;
    public JButton jButtonGuardarCambiosCuentaPorCobrar;
	public JButton jButtonGuardarCambiosTablaCuentaPorCobrar;
	protected JButton jButtonCerrarCuentaPorCobrar;
	
	
	protected JButton jButtonProcesarInformacionCuentaPorCobrar;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCuentaPorCobrar;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCuentaPorCobrar;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCuentaPorCobrar;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaPorCobrar;
	protected JButton jButtonModificarToolBarCuentaPorCobrar;
	protected JButton jButtonActualizarToolBarCuentaPorCobrar;
    protected JButton jButtonEliminarToolBarCuentaPorCobrar;
	protected JButton jButtonCancelarToolBarCuentaPorCobrar;
    protected JButton jButtonGuardarCambiosToolBarCuentaPorCobrar;
	protected JButton jButtonGuardarCambiosTablaToolBarCuentaPorCobrar;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaPorCobrar;
	protected JButton jButtonCerrarToolBarCuentaPorCobrar;
	
	protected JButton jButtonProcesarInformacionToolBarCuentaPorCobrar;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaPorCobrar;
	protected JMenuItem jMenuItemModificarCuentaPorCobrar;
	protected JMenuItem jMenuItemActualizarCuentaPorCobrar;
    protected JMenuItem jMenuItemEliminarCuentaPorCobrar;
	protected JMenuItem jMenuItemCancelarCuentaPorCobrar;
    protected JMenuItem jMenuItemGuardarCambiosCuentaPorCobrar;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaPorCobrar;
	protected JMenuItem jMenuItemCerrarCuentaPorCobrar;
	protected JMenuItem jMenuItemDetalleCerrarCuentaPorCobrar;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaPorCobrar;
	
	protected JMenuItem jMenuItemProcesarInformacionCuentaPorCobrar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaPorCobrar;
	protected JMenuItem jMenuItemMostrarOcultarCuentaPorCobrar;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaPorCobrar;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaPorCobrar;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCuentaPorCobrar;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCuentaPorCobrar;
	public JLabel jLabelIdCuentaPorCobrar;
	public JLabel jLabelidCuentaPorCobrar;
	public JButton jButtonidCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPanelfechaCuentaPorCobrar;
	public JLabel jLabelfechaCuentaPorCobrar;
	//public JFormattedTextField jDateChooserfechaCuentaPorCobrar;

	public JDateChooser jDateChooserfechaCuentaPorCobrar;
	public JButton jButtonfechaCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPanelmontoCuentaPorCobrar;
	public JLabel jLabelmontoCuentaPorCobrar;
	public JTextField jTextFieldmontoCuentaPorCobrar;
	public JButton jButtonmontoCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteCuentaPorCobrar;
	public JLabel jLabelnumero_comprobanteCuentaPorCobrar;
	public JTextField jTextFieldnumero_comprobanteCuentaPorCobrar;
	public JButton jButtonnumero_comprobanteCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPaneldebitoCuentaPorCobrar;
	public JLabel jLabeldebitoCuentaPorCobrar;
	public JTextField jTextFielddebitoCuentaPorCobrar;
	public JButton jButtondebitoCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPanelcreditoCuentaPorCobrar;
	public JLabel jLabelcreditoCuentaPorCobrar;
	public JTextField jTextFieldcreditoCuentaPorCobrar;
	public JButton jButtoncreditoCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPaneldetalleCuentaPorCobrar;
	public JLabel jLabeldetalleCuentaPorCobrar;
	public JTextArea jTextAreadetalleCuentaPorCobrar;
	public JScrollPane jscrollPanedetalleCuentaPorCobrar;
	public JButton jButtondetalleCuentaPorCobrarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCuentaPorCobrar;
	public JLabel jLabelid_empresaCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCuentaPorCobrar;
	public JButton jButtonid_empresaCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_empresaCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_empresaCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCuentaPorCobrar;
	public JLabel jLabelid_sucursalCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCuentaPorCobrar;
	public JButton jButtonid_sucursalCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_sucursalCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloCuentaPorCobrar;
	public JLabel jLabelid_moduloCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloCuentaPorCobrar;
	public JButton jButtonid_moduloCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_moduloCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_moduloCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioCuentaPorCobrar;
	public JLabel jLabelid_ejercicioCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioCuentaPorCobrar;
	public JButton jButtonid_ejercicioCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_ejercicioCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaCuentaPorCobrar;
	public JLabel jLabelid_monedaCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaCuentaPorCobrar;
	public JButton jButtonid_monedaCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_monedaCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_monedaCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteCuentaPorCobrar;
	public JLabel jLabelid_clienteCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteCuentaPorCobrar;
	public JButton jButtonid_clienteCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_clienteCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_clienteCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionCuentaPorCobrar;
	public JLabel jLabelid_transaccionCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionCuentaPorCobrar;
	public JButton jButtonid_transaccionCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_transaccionCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_transaccionCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloCuentaPorCobrar;
	public JLabel jLabelid_tipo_transaccion_moduloCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar;
	public JButton jButtonid_tipo_transaccion_moduloCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableCuentaPorCobrar;
	public JLabel jLabelid_asiento_contableCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableCuentaPorCobrar;
	public JButton jButtonid_asiento_contableCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_asiento_contableCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableCuentaPorCobrarBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaCuentaPorCobrar;
	public JLabel jLabelid_facturaCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaCuentaPorCobrar;
	public JButton jButtonid_facturaCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_facturaCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_facturaCuentaPorCobrarBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCuentaPorCobrar;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CuentaPorCobrarDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCuentaPorCobrar=new JPanel();
				this.jPanelAccionesFormularioCuentaPorCobrar=new JPanel();
				this.jmenuBarDetalleCuentaPorCobrar=new JMenuBar();
				this.jTtoolBarDetalleCuentaPorCobrar=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaPorCobrarDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CuentaPorCobrar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CuentaPorCobrarDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CuentaPorCobrar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaPorCobrarDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaPorCobrar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaPorCobrarDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaPorCobrar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaPorCobrarDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaPorCobrar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCuentaPorCobrar() {
		return this.jButtonActualizarToolBarCuentaPorCobrar;
	}
	
	public JButton getjButtonEliminarToolBarCuentaPorCobrar() {
		return this.jButtonEliminarToolBarCuentaPorCobrar;
	}
	
	public JButton getjButtonCancelarToolBarCuentaPorCobrar() {
		return this.jButtonCancelarToolBarCuentaPorCobrar;
	}		
	
	public JButton getjButtonProcesarInformacionCuentaPorCobrar() {
		return this.jButtonProcesarInformacionCuentaPorCobrar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaPorCobrar)	{
		this.jButtonProcesarInformacionCuentaPorCobrar = jButtonProcesarInformacionCuentaPorCobrar;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaPorCobrar() {
		return this.jComboBoxTiposAccionesCuentaPorCobrar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaPorCobrar(
			JComboBox jComboBoxTiposRelacionesCuentaPorCobrar) {
		this.jComboBoxTiposRelacionesCuentaPorCobrar = jComboBoxTiposRelacionesCuentaPorCobrar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaPorCobrar(
			JComboBox jComboBoxTiposAccionesCuentaPorCobrar) {
		this.jComboBoxTiposAccionesCuentaPorCobrar = jComboBoxTiposAccionesCuentaPorCobrar;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCuentaPorCobrar() {
		return this.jComboBoxTiposAccionesFormularioCuentaPorCobrar;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCuentaPorCobrar(
			JComboBox jComboBoxTiposAccionesFormularioCuentaPorCobrar) {
		this.jComboBoxTiposAccionesFormularioCuentaPorCobrar = jComboBoxTiposAccionesFormularioCuentaPorCobrar;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
		
		this.cuentaporcobrarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentaporcobrarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentaporcobrarSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaPorCobrarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaPorCobrarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaPorCobrarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Por Cobrar MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
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
	
		CuentaPorCobrarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCuentaPorCobrar= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCuentaPorCobrar=new JButtonMe();
				this.jButtonModificarToolBarCuentaPorCobrar=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCuentaPorCobrar,this.jTtoolBarDetalleCuentaPorCobrar,
							"actualizar","actualizar","Actualizar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCuentaPorCobrar,this.jTtoolBarDetalleCuentaPorCobrar,
							"eliminar","eliminar","Eliminar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCuentaPorCobrar,this.jTtoolBarDetalleCuentaPorCobrar,
							"cancelar","cancelar","Cancelar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCuentaPorCobrar,this.jTtoolBarDetalleCuentaPorCobrar,
							"guardarcambios","guardarcambios","Guardar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCuentaPorCobrar=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCuentaPorCobrar=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCuentaPorCobrar=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCuentaPorCobrar=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCuentaPorCobrar=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaPorCobrar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaPorCobrar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaPorCobrar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCuentaPorCobrar= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCuentaPorCobrar.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCuentaPorCobrar,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCuentaPorCobrar= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCuentaPorCobrar.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCuentaPorCobrar,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCuentaPorCobrar= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCuentaPorCobrar.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCuentaPorCobrar,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCuentaPorCobrar= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCuentaPorCobrar.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCuentaPorCobrar,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCuentaPorCobrar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaPorCobrar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaPorCobrar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaPorCobrar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaPorCobrar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaPorCobrar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCuentaPorCobrar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCuentaPorCobrar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCuentaPorCobrar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaPorCobrar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaPorCobrar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaPorCobrar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaPorCobrar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaPorCobrar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaPorCobrar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCuentaPorCobrar.add(this.jMenuItemDetalleCerrarCuentaPorCobrar);
		
		this.jmenuDetalleAccionesCuentaPorCobrar.add(this.jMenuItemActualizarCuentaPorCobrar);
		this.jmenuDetalleAccionesCuentaPorCobrar.add(this.jMenuItemEliminarCuentaPorCobrar);
		this.jmenuDetalleAccionesCuentaPorCobrar.add(this.jMenuItemCancelarCuentaPorCobrar);		
		
		//this.jmenuDetalleDatosCuentaPorCobrar.add(this.jMenuItemDetalleAbrirOrderByCuentaPorCobrar);				
		this.jmenuDetalleDatosCuentaPorCobrar.add(this.jMenuItemDetalleMostarOcultarCuentaPorCobrar);				
				
		//this.jmenuDetalleAccionesCuentaPorCobrar.add(this.jMenuItemGuardarCambiosCuentaPorCobrar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCuentaPorCobrar.add(this.jmenuDetalleArchivoCuentaPorCobrar);		
		this.jmenuBarDetalleCuentaPorCobrar.add(this.jmenuDetalleAccionesCuentaPorCobrar);		
		this.jmenuBarDetalleCuentaPorCobrar.add(this.jmenuDetalleDatosCuentaPorCobrar);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCuentaPorCobrar);				
	}
	
	
	public void inicializarElementosCamposCuentaPorCobrar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCuentaPorCobrar = new JLabelMe();
		jLabelIdCuentaPorCobrar.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCuentaPorCobrar = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCuentaPorCobrar= new GridBagLayout();

		this.jPanelidCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);

		jLabelidCuentaPorCobrar = new JLabel();
		jLabelidCuentaPorCobrar.setText("Id");

		jLabelidCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaCuentaPorCobrar = new JLabelMe();
		this.jLabelfechaCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaCuentaPorCobrar.setToolTipText("Fecha");
		this.jLabelfechaCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPanelfechaCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		//jFormattedTextFieldfechaCuentaPorCobrar= new JFormattedTextFieldMe();

		jDateChooserfechaCuentaPorCobrar= new JDateChooser();
		jDateChooserfechaCuentaPorCobrar.setEnabled(false);
		jDateChooserfechaCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaCuentaPorCobrar.setDate(new Date());
		jDateChooserfechaCuentaPorCobrar.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaCuentaPorCobrar.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtonfechaCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaCuentaPorCobrarBusqueda.setText("U");
		this.jButtonfechaCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaCuentaPorCobrarBusqueda.setVisible(false);		}


					
		this.jLabelmontoCuentaPorCobrar = new JLabelMe();
		this.jLabelmontoCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoCuentaPorCobrar.setToolTipText("Monto");
		this.jLabelmontoCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPanelmontoCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jTextFieldmontoCuentaPorCobrar= new JTextFieldMe();
		jTextFieldmontoCuentaPorCobrar.setEnabled(false);
		jTextFieldmontoCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoCuentaPorCobrar.setText("0.0");

		this.jButtonmontoCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtonmontoCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoCuentaPorCobrarBusqueda.setText("U");
		this.jButtonmontoCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoCuentaPorCobrarBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteCuentaPorCobrar = new JLabelMe();
		this.jLabelnumero_comprobanteCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteCuentaPorCobrar.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPanelnumero_comprobanteCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jTextFieldnumero_comprobanteCuentaPorCobrar= new JTextFieldMe();

		jTextFieldnumero_comprobanteCuentaPorCobrar.setEnabled(false);
		jTextFieldnumero_comprobanteCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteCuentaPorCobrarBusqueda.setText("U");
		this.jButtonnumero_comprobanteCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteCuentaPorCobrarBusqueda.setVisible(false);		}


					
		this.jLabeldebitoCuentaPorCobrar = new JLabelMe();
		this.jLabeldebitoCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_DEBITO+" : *");
		this.jLabeldebitoCuentaPorCobrar.setToolTipText("Debito");
		this.jLabeldebitoCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebitoCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebitoCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebitoCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebitoCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebitoCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_DEBITO);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPaneldebitoCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jTextFielddebitoCuentaPorCobrar= new JTextFieldMe();
		jTextFielddebitoCuentaPorCobrar.setEnabled(false);
		jTextFielddebitoCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebitoCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebitoCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebitoCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebitoCuentaPorCobrar.setText("0.0");

		this.jButtondebitoCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtondebitoCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebitoCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebitoCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebitoCuentaPorCobrarBusqueda.setText("U");
		this.jButtondebitoCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebitoCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebitoCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebitoCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebitoCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debitoCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebitoCuentaPorCobrarBusqueda.setVisible(false);		}


					
		this.jLabelcreditoCuentaPorCobrar = new JLabelMe();
		this.jLabelcreditoCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_CREDITO+" : *");
		this.jLabelcreditoCuentaPorCobrar.setToolTipText("Credito");
		this.jLabelcreditoCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcreditoCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcreditoCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcreditoCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcreditoCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcreditoCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_CREDITO);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPanelcreditoCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jTextFieldcreditoCuentaPorCobrar= new JTextFieldMe();
		jTextFieldcreditoCuentaPorCobrar.setEnabled(false);
		jTextFieldcreditoCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcreditoCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcreditoCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcreditoCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcreditoCuentaPorCobrar.setText("0.0");

		this.jButtoncreditoCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtoncreditoCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncreditoCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncreditoCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncreditoCuentaPorCobrarBusqueda.setText("U");
		this.jButtoncreditoCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncreditoCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncreditoCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcreditoCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcreditoCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"creditoCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncreditoCuentaPorCobrarBusqueda.setVisible(false);		}


					
		this.jLabeldetalleCuentaPorCobrar = new JLabelMe();
		this.jLabeldetalleCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_DETALLE+" : *");
		this.jLabeldetalleCuentaPorCobrar.setToolTipText("Detalle");
		this.jLabeldetalleCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPaneldetalleCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jTextAreadetalleCuentaPorCobrar= new JTextAreaMe();
		jTextAreadetalleCuentaPorCobrar.setEnabled(false);
		jTextAreadetalleCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleCuentaPorCobrar.setLineWrap(true);
		jTextAreadetalleCuentaPorCobrar.setWrapStyleWord(true);
		jTextAreadetalleCuentaPorCobrar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleCuentaPorCobrar.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleCuentaPorCobrar = new JScrollPane(jTextAreadetalleCuentaPorCobrar);
		jscrollPanedetalleCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondetalleCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtondetalleCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleCuentaPorCobrarBusqueda.setText("U");
		this.jButtondetalleCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleCuentaPorCobrarBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCuentaPorCobrar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCuentaPorCobrar = new JLabelMe();
		this.jLabelid_empresaCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCuentaPorCobrar.setToolTipText("Empresa");
		this.jLabelid_empresaCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPanelid_empresaCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jComboBoxid_empresaCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_empresaCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCuentaPorCobrar.setEnabled(false);

		this.jButtonid_empresaCuentaPorCobrar= new JButtonMe();
		this.jButtonid_empresaCuentaPorCobrar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaPorCobrar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaPorCobrar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaPorCobrar.setText("Buscar");
		this.jButtonid_empresaCuentaPorCobrar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCuentaPorCobrar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaPorCobrar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaPorCobrar"));

		this.jButtonid_empresaCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtonid_empresaCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentaPorCobrarBusqueda.setText("U");
		this.jButtonid_empresaCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCuentaPorCobrarBusqueda.setVisible(false);		}

		this.jButtonid_empresaCuentaPorCobrarUpdate= new JButtonMe();
		this.jButtonid_empresaCuentaPorCobrarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaPorCobrarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaPorCobrarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentaPorCobrarUpdate.setText("U");
		this.jButtonid_empresaCuentaPorCobrarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCuentaPorCobrarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaPorCobrarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaPorCobrarUpdate"));



					
		this.jLabelid_sucursalCuentaPorCobrar = new JLabelMe();
		this.jLabelid_sucursalCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCuentaPorCobrar.setToolTipText("Sucursal");
		this.jLabelid_sucursalCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPanelid_sucursalCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jComboBoxid_sucursalCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_sucursalCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCuentaPorCobrar.setEnabled(false);

		this.jButtonid_sucursalCuentaPorCobrar= new JButtonMe();
		this.jButtonid_sucursalCuentaPorCobrar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCuentaPorCobrar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCuentaPorCobrar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCuentaPorCobrar.setText("Buscar");
		this.jButtonid_sucursalCuentaPorCobrar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCuentaPorCobrar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCuentaPorCobrar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCuentaPorCobrar"));

		this.jButtonid_sucursalCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtonid_sucursalCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCuentaPorCobrarBusqueda.setText("U");
		this.jButtonid_sucursalCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCuentaPorCobrarBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCuentaPorCobrarUpdate= new JButtonMe();
		this.jButtonid_sucursalCuentaPorCobrarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCuentaPorCobrarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCuentaPorCobrarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCuentaPorCobrarUpdate.setText("U");
		this.jButtonid_sucursalCuentaPorCobrarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCuentaPorCobrarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCuentaPorCobrarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCuentaPorCobrarUpdate"));



					
		this.jLabelid_moduloCuentaPorCobrar = new JLabelMe();
		this.jLabelid_moduloCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloCuentaPorCobrar.setToolTipText("Modulo");
		this.jLabelid_moduloCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPanelid_moduloCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jComboBoxid_moduloCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_moduloCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloCuentaPorCobrar.setEnabled(false);

		this.jButtonid_moduloCuentaPorCobrar= new JButtonMe();
		this.jButtonid_moduloCuentaPorCobrar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloCuentaPorCobrar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloCuentaPorCobrar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloCuentaPorCobrar.setText("Buscar");
		this.jButtonid_moduloCuentaPorCobrar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloCuentaPorCobrar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloCuentaPorCobrar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloCuentaPorCobrar"));

		this.jButtonid_moduloCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtonid_moduloCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloCuentaPorCobrarBusqueda.setText("U");
		this.jButtonid_moduloCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloCuentaPorCobrarBusqueda.setVisible(false);		}

		this.jButtonid_moduloCuentaPorCobrarUpdate= new JButtonMe();
		this.jButtonid_moduloCuentaPorCobrarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloCuentaPorCobrarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloCuentaPorCobrarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloCuentaPorCobrarUpdate.setText("U");
		this.jButtonid_moduloCuentaPorCobrarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloCuentaPorCobrarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloCuentaPorCobrarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloCuentaPorCobrarUpdate"));



					
		this.jLabelid_ejercicioCuentaPorCobrar = new JLabelMe();
		this.jLabelid_ejercicioCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioCuentaPorCobrar.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPanelid_ejercicioCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jComboBoxid_ejercicioCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_ejercicioCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioCuentaPorCobrar.setEnabled(false);

		this.jButtonid_ejercicioCuentaPorCobrar= new JButtonMe();
		this.jButtonid_ejercicioCuentaPorCobrar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCuentaPorCobrar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCuentaPorCobrar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCuentaPorCobrar.setText("Buscar");
		this.jButtonid_ejercicioCuentaPorCobrar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioCuentaPorCobrar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCuentaPorCobrar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCuentaPorCobrar"));

		this.jButtonid_ejercicioCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtonid_ejercicioCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioCuentaPorCobrarBusqueda.setText("U");
		this.jButtonid_ejercicioCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioCuentaPorCobrarBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioCuentaPorCobrarUpdate= new JButtonMe();
		this.jButtonid_ejercicioCuentaPorCobrarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCuentaPorCobrarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCuentaPorCobrarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioCuentaPorCobrarUpdate.setText("U");
		this.jButtonid_ejercicioCuentaPorCobrarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioCuentaPorCobrarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCuentaPorCobrarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCuentaPorCobrarUpdate"));



					
		this.jLabelid_monedaCuentaPorCobrar = new JLabelMe();
		this.jLabelid_monedaCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaCuentaPorCobrar.setToolTipText("Moneda");
		this.jLabelid_monedaCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPanelid_monedaCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jComboBoxid_monedaCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_monedaCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaCuentaPorCobrar= new JButtonMe();
		this.jButtonid_monedaCuentaPorCobrar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaCuentaPorCobrar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaCuentaPorCobrar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaCuentaPorCobrar.setText("Buscar");
		this.jButtonid_monedaCuentaPorCobrar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaCuentaPorCobrar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaCuentaPorCobrar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaCuentaPorCobrar"));

		this.jButtonid_monedaCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtonid_monedaCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaCuentaPorCobrarBusqueda.setText("U");
		this.jButtonid_monedaCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaCuentaPorCobrarBusqueda.setVisible(false);		}

		this.jButtonid_monedaCuentaPorCobrarUpdate= new JButtonMe();
		this.jButtonid_monedaCuentaPorCobrarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaCuentaPorCobrarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaCuentaPorCobrarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaCuentaPorCobrarUpdate.setText("U");
		this.jButtonid_monedaCuentaPorCobrarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaCuentaPorCobrarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaCuentaPorCobrarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaCuentaPorCobrarUpdate"));



					
		this.jLabelid_clienteCuentaPorCobrar = new JLabelMe();
		this.jLabelid_clienteCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteCuentaPorCobrar.setToolTipText("Cliente");
		this.jLabelid_clienteCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPanelid_clienteCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jComboBoxid_clienteCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_clienteCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteCuentaPorCobrar= new JButtonMe();
		this.jButtonid_clienteCuentaPorCobrar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCuentaPorCobrar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCuentaPorCobrar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCuentaPorCobrar.setText("Buscar");
		this.jButtonid_clienteCuentaPorCobrar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteCuentaPorCobrar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCuentaPorCobrar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCuentaPorCobrar"));

		this.jButtonid_clienteCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtonid_clienteCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCuentaPorCobrarBusqueda.setText("U");
		this.jButtonid_clienteCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteCuentaPorCobrarBusqueda.setVisible(false);		}

		this.jButtonid_clienteCuentaPorCobrarUpdate= new JButtonMe();
		this.jButtonid_clienteCuentaPorCobrarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCuentaPorCobrarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCuentaPorCobrarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCuentaPorCobrarUpdate.setText("U");
		this.jButtonid_clienteCuentaPorCobrarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteCuentaPorCobrarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCuentaPorCobrarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCuentaPorCobrarUpdate"));



					
		this.jLabelid_transaccionCuentaPorCobrar = new JLabelMe();
		this.jLabelid_transaccionCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionCuentaPorCobrar.setToolTipText("Transaccion");
		this.jLabelid_transaccionCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPanelid_transaccionCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jComboBoxid_transaccionCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_transaccionCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionCuentaPorCobrar= new JButtonMe();
		this.jButtonid_transaccionCuentaPorCobrar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionCuentaPorCobrar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionCuentaPorCobrar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionCuentaPorCobrar.setText("Buscar");
		this.jButtonid_transaccionCuentaPorCobrar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionCuentaPorCobrar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionCuentaPorCobrar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionCuentaPorCobrar"));

		this.jButtonid_transaccionCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtonid_transaccionCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionCuentaPorCobrarBusqueda.setText("U");
		this.jButtonid_transaccionCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionCuentaPorCobrarBusqueda.setVisible(false);		}

		this.jButtonid_transaccionCuentaPorCobrarUpdate= new JButtonMe();
		this.jButtonid_transaccionCuentaPorCobrarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionCuentaPorCobrarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionCuentaPorCobrarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionCuentaPorCobrarUpdate.setText("U");
		this.jButtonid_transaccionCuentaPorCobrarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionCuentaPorCobrarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionCuentaPorCobrarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionCuentaPorCobrarUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloCuentaPorCobrar = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloCuentaPorCobrar.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrar= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrar.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloCuentaPorCobrar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloCuentaPorCobrar"));

		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloCuentaPorCobrarUpdate"));



					
		this.jLabelid_asiento_contableCuentaPorCobrar = new JLabelMe();
		this.jLabelid_asiento_contableCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableCuentaPorCobrar.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPanelid_asiento_contableCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jComboBoxid_asiento_contableCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_asiento_contableCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableCuentaPorCobrar= new JButtonMe();
		this.jButtonid_asiento_contableCuentaPorCobrar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableCuentaPorCobrar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableCuentaPorCobrar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableCuentaPorCobrar.setText("Buscar");
		this.jButtonid_asiento_contableCuentaPorCobrar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableCuentaPorCobrar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableCuentaPorCobrar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableCuentaPorCobrar"));

		this.jButtonid_asiento_contableCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableCuentaPorCobrarBusqueda.setText("U");
		this.jButtonid_asiento_contableCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableCuentaPorCobrarBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableCuentaPorCobrarUpdate= new JButtonMe();
		this.jButtonid_asiento_contableCuentaPorCobrarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableCuentaPorCobrarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableCuentaPorCobrarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableCuentaPorCobrarUpdate.setText("U");
		this.jButtonid_asiento_contableCuentaPorCobrarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableCuentaPorCobrarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableCuentaPorCobrarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableCuentaPorCobrarUpdate"));



					
		this.jLabelid_facturaCuentaPorCobrar = new JLabelMe();
		this.jLabelid_facturaCuentaPorCobrar.setText(""+CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaCuentaPorCobrar.setToolTipText("Factura");
		this.jLabelid_facturaCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaCuentaPorCobrar.setToolTipText(CuentaPorCobrarConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		this.jPanelid_facturaCuentaPorCobrar.setLayout(this.gridaBagLayoutCuentaPorCobrar);


		jComboBoxid_facturaCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_facturaCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaCuentaPorCobrar= new JButtonMe();
		this.jButtonid_facturaCuentaPorCobrar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaCuentaPorCobrar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaCuentaPorCobrar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaCuentaPorCobrar.setText("Buscar");
		this.jButtonid_facturaCuentaPorCobrar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaCuentaPorCobrar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaCuentaPorCobrar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaCuentaPorCobrar"));

		this.jButtonid_facturaCuentaPorCobrarBusqueda= new JButtonMe();
		this.jButtonid_facturaCuentaPorCobrarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaCuentaPorCobrarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaCuentaPorCobrarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaCuentaPorCobrarBusqueda.setText("U");
		this.jButtonid_facturaCuentaPorCobrarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaCuentaPorCobrarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaCuentaPorCobrarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaCuentaPorCobrarBusqueda"));

		if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaCuentaPorCobrarBusqueda.setVisible(false);		}

		this.jButtonid_facturaCuentaPorCobrarUpdate= new JButtonMe();
		this.jButtonid_facturaCuentaPorCobrarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaCuentaPorCobrarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaCuentaPorCobrarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaCuentaPorCobrarUpdate.setText("U");
		this.jButtonid_facturaCuentaPorCobrarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaCuentaPorCobrarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaCuentaPorCobrarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaCuentaPorCobrar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaCuentaPorCobrar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaCuentaPorCobrarUpdate"));



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
		//this.jInternalFrameDetalleCuentaPorCobrar = new CuentaPorCobrarBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cuenta Por Cobrar DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaPorCobrar= new GridBagLayout();
		

		
		String sToolTipCuentaPorCobrar="";
		sToolTipCuentaPorCobrar=CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaPorCobrar+="(Cartera.CuentaPorCobrar)";
		}
		
		if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaPorCobrar+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCuentaPorCobrar = new JButtonMe();
		this.jButtonModificarCuentaPorCobrar = new JButtonMe();
        this.jButtonActualizarCuentaPorCobrar = new JButtonMe();
        this.jButtonEliminarCuentaPorCobrar = new JButtonMe();
        this.jButtonCancelarCuentaPorCobrar = new JButtonMe();
        this.jButtonGuardarCambiosCuentaPorCobrar = new JButtonMe();
		this.jButtonGuardarCambiosTablaCuentaPorCobrar = new JButtonMe();
		this.jButtonCerrarCuentaPorCobrar = new JButtonMe();
		
		this.jScrollPanelDatosCuentaPorCobrar = new JScrollPane();   
        this.jScrollPanelDatosEdicionCuentaPorCobrar = new JScrollPane();
		this.jScrollPanelDatosGeneralCuentaPorCobrar = new JScrollPane();
				
		
		
		this.jPanelCamposCuentaPorCobrar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCuentaPorCobrar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCuentaPorCobrar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCuentaPorCobrar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Por Cobrar";
		
		if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Por Cobrares" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaPorCobrar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCuentaPorCobrar.setName("jPanelCamposCuentaPorCobrar"); 

		this.jPanelCamposOcultosCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCuentaPorCobrar.setName("jPanelCamposOcultosCuentaPorCobrar"); 

        this.jPanelAccionesCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaPorCobrar.setToolTipText("Acciones");
        this.jPanelAccionesCuentaPorCobrar.setName("Acciones"); 

		this.jPanelAccionesFormularioCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCuentaPorCobrar.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCuentaPorCobrar.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCuentaPorCobrar.setText("Nuevo");
		this.jButtonModificarCuentaPorCobrar.setText("Editar");
        this.jButtonActualizarCuentaPorCobrar.setText("Actualizar");
        this.jButtonEliminarCuentaPorCobrar.setText("Eliminar");
        this.jButtonCancelarCuentaPorCobrar.setText("Cancelar");
        this.jButtonGuardarCambiosCuentaPorCobrar.setText("Guardar");
		this.jButtonGuardarCambiosTablaCuentaPorCobrar.setText("Guardar");
		this.jButtonCerrarCuentaPorCobrar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaPorCobrar,"nuevo_button","Nuevo",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCuentaPorCobrar,"modificar_button","Editar",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCuentaPorCobrar,"actualizar_button","Actualizar",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCuentaPorCobrar,"eliminar_button","Eliminar",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCuentaPorCobrar,"cancelar_button","Cancelar",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCuentaPorCobrar,"guardarcambios_button","Guardar",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaPorCobrar,"guardarcambiostabla_button","Guardar",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaPorCobrar,"cerrar_button","Salir",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCuentaPorCobrar.setToolTipText("Nuevo"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCuentaPorCobrar.setToolTipText("Editar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCuentaPorCobrar.setToolTipText("Actualizar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCuentaPorCobrar.setToolTipText("Eliminar)"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCuentaPorCobrar.setToolTipText("Cancelar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCuentaPorCobrar.setToolTipText("Guardar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCuentaPorCobrar.setToolTipText("Guardar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaPorCobrar.setToolTipText("Salir"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaPorCobrar";
		inputMap = this.jButtonNuevoCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaPorCobrar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaPorCobrar"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCuentaPorCobrar";
		inputMap = this.jButtonActualizarCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCuentaPorCobrar"));
		
		//ELIMINAR
		sMapKey = "EliminarCuentaPorCobrar";
		inputMap = this.jButtonEliminarCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCuentaPorCobrar"));
		
		//CANCELAR	
		sMapKey = "CancelarCuentaPorCobrar";
		inputMap = this.jButtonCancelarCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCuentaPorCobrar"));
		
		//CERRAR		
		sMapKey = "CerrarCuentaPorCobrar";
		inputMap = this.jButtonCerrarCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaPorCobrar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaPorCobrar";
		inputMap = this.jButtonGuardarCambiosTablaCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaPorCobrar"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCuentaPorCobrar = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCuentaPorCobrar.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCuentaPorCobrar.setToolTipText("Nuevo CuentaPorCobrar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCuentaPorCobrar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCuentaPorCobrar.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCuentaPorCobrar.setToolTipText("Sin Cerrar Ventana CuentaPorCobrar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCuentaPorCobrar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCuentaPorCobrar.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCuentaPorCobrar.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCuentaPorCobrar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaPorCobrar.setText("Accion");
		this.jComboBoxTiposAccionesCuentaPorCobrar.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCuentaPorCobrar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCuentaPorCobrar.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCuentaPorCobrar.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCuentaPorCobrar = new JLabelMe();
		
		this.jLabelAccionesCuentaPorCobrar.setText("Acciones");		
		this.jLabelAccionesCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCuentaPorCobrar();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCuentaPorCobrar();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCuentaPorCobrar=new JTabbedPane();
		this.jTabbedPaneRelacionesCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCuentaPorCobrar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaPorCobrar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaPorCobrar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCuentaPorCobrar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaPorCobrar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaPorCobrar.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCuentaPorCobrar = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCuentaPorCobrar = new GridBagLayout();
		
		this.jPanelCamposCuentaPorCobrar.setLayout(gridaBagLayoutCamposCuentaPorCobrar);
		this.jPanelCamposOcultosCuentaPorCobrar.setLayout(gridaBagLayoutCamposOcultosCuentaPorCobrar);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCuentaPorCobrar.add(jLabelIdCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCuentaPorCobrar.add(jLabelidCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCuentaPorCobrar.add(jLabelid_empresaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentaPorCobrar.add(jButtonid_empresaCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 3;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentaPorCobrar.add(jButtonid_empresaCuentaPorCobrarUpdate, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCuentaPorCobrar.add(jComboBoxid_empresaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCuentaPorCobrar.add(jLabelid_sucursalCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCuentaPorCobrar.add(jButtonid_sucursalCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 3;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCuentaPorCobrar.add(jButtonid_sucursalCuentaPorCobrarUpdate, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCuentaPorCobrar.add(jComboBoxid_sucursalCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloCuentaPorCobrar.add(jLabelid_moduloCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloCuentaPorCobrar.add(jButtonid_moduloCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 3;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloCuentaPorCobrar.add(jButtonid_moduloCuentaPorCobrarUpdate, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloCuentaPorCobrar.add(jComboBoxid_moduloCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioCuentaPorCobrar.add(jLabelid_ejercicioCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioCuentaPorCobrar.add(jButtonid_ejercicioCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 3;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioCuentaPorCobrar.add(jButtonid_ejercicioCuentaPorCobrarUpdate, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioCuentaPorCobrar.add(jComboBoxid_ejercicioCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaCuentaPorCobrar.add(jLabelid_monedaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaCuentaPorCobrar.add(jButtonid_monedaCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 3;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaCuentaPorCobrar.add(jButtonid_monedaCuentaPorCobrarUpdate, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaCuentaPorCobrar.add(jComboBoxid_monedaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteCuentaPorCobrar.add(jLabelid_clienteCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteCuentaPorCobrar.add(jButtonid_clienteCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 3;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCuentaPorCobrar.add(jButtonid_clienteCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 4;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCuentaPorCobrar.add(jButtonid_clienteCuentaPorCobrarUpdate, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteCuentaPorCobrar.add(jComboBoxid_clienteCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionCuentaPorCobrar.add(jLabelid_transaccionCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionCuentaPorCobrar.add(jButtonid_transaccionCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 3;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionCuentaPorCobrar.add(jButtonid_transaccionCuentaPorCobrarUpdate, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionCuentaPorCobrar.add(jComboBoxid_transaccionCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_transaccion_moduloCuentaPorCobrar.add(jLabelid_tipo_transaccion_moduloCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloCuentaPorCobrar.add(jButtonid_tipo_transaccion_moduloCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 3;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloCuentaPorCobrar.add(jButtonid_tipo_transaccion_moduloCuentaPorCobrarUpdate, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_transaccion_moduloCuentaPorCobrar.add(jComboBoxid_tipo_transaccion_moduloCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableCuentaPorCobrar.add(jLabelid_asiento_contableCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableCuentaPorCobrar.add(jButtonid_asiento_contableCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 3;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableCuentaPorCobrar.add(jButtonid_asiento_contableCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 4;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableCuentaPorCobrar.add(jButtonid_asiento_contableCuentaPorCobrarUpdate, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableCuentaPorCobrar.add(jComboBoxid_asiento_contableCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaCuentaPorCobrar.add(jLabelid_facturaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaCuentaPorCobrar.add(jButtonid_facturaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 3;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaCuentaPorCobrar.add(jButtonid_facturaCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 4;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaCuentaPorCobrar.add(jButtonid_facturaCuentaPorCobrarUpdate, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaCuentaPorCobrar.add(jComboBoxid_facturaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaCuentaPorCobrar.add(jLabelfechaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaCuentaPorCobrar.add(jButtonfechaCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaCuentaPorCobrar.add(jDateChooserfechaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoCuentaPorCobrar.add(jLabelmontoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoCuentaPorCobrar.add(jButtonmontoCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoCuentaPorCobrar.add(jTextFieldmontoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteCuentaPorCobrar.add(jLabelnumero_comprobanteCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteCuentaPorCobrar.add(jButtonnumero_comprobanteCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteCuentaPorCobrar.add(jTextFieldnumero_comprobanteCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebitoCuentaPorCobrar.add(jLabeldebitoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebitoCuentaPorCobrar.add(jButtondebitoCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebitoCuentaPorCobrar.add(jTextFielddebitoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcreditoCuentaPorCobrar.add(jLabelcreditoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPanelcreditoCuentaPorCobrar.add(jButtoncreditoCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcreditoCuentaPorCobrar.add(jTextFieldcreditoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalleCuentaPorCobrar.add(jLabeldetalleCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 2;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
		this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleCuentaPorCobrar.add(jButtondetalleCuentaPorCobrarBusqueda, this.gridBagConstraintsCuentaPorCobrar);
	}

	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
	this.gridBagConstraintsCuentaPorCobrar.gridx = 1;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalleCuentaPorCobrar.add(jscrollPanedetalleCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaPorCobrar.add(this.jPanelidCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposCuentaPorCobrar % 2==0) {
		iXPanelCamposCuentaPorCobrar=0;
		iYPanelCamposCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaPorCobrar.add(this.jPanelid_monedaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposCuentaPorCobrar % 2==0) {
		iXPanelCamposCuentaPorCobrar=0;
		iYPanelCamposCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaPorCobrar.add(this.jPanelid_clienteCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposCuentaPorCobrar % 2==0) {
		iXPanelCamposCuentaPorCobrar=0;
		iYPanelCamposCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaPorCobrar.add(this.jPanelid_transaccionCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposCuentaPorCobrar % 2==0) {
		iXPanelCamposCuentaPorCobrar=0;
		iYPanelCamposCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaPorCobrar.add(this.jPanelid_asiento_contableCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposCuentaPorCobrar % 2==0) {
		iXPanelCamposCuentaPorCobrar=0;
		iYPanelCamposCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaPorCobrar.add(this.jPanelid_facturaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposCuentaPorCobrar % 2==0) {
		iXPanelCamposCuentaPorCobrar=0;
		iYPanelCamposCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaPorCobrar.add(this.jPanelfechaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposCuentaPorCobrar % 2==0) {
		iXPanelCamposCuentaPorCobrar=0;
		iYPanelCamposCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaPorCobrar.add(this.jPanelmontoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposCuentaPorCobrar % 2==0) {
		iXPanelCamposCuentaPorCobrar=0;
		iYPanelCamposCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaPorCobrar.add(this.jPanelnumero_comprobanteCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposCuentaPorCobrar % 2==0) {
		iXPanelCamposCuentaPorCobrar=0;
		iYPanelCamposCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaPorCobrar.add(this.jPaneldebitoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposCuentaPorCobrar % 2==0) {
		iXPanelCamposCuentaPorCobrar=0;
		iYPanelCamposCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaPorCobrar.add(this.jPanelcreditoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposCuentaPorCobrar % 2==0) {
		iXPanelCamposCuentaPorCobrar=0;
		iYPanelCamposCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaPorCobrar.add(this.jPaneldetalleCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposCuentaPorCobrar % 2==0) {
		iXPanelCamposCuentaPorCobrar=0;
		iYPanelCamposCuentaPorCobrar++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposOcultosCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposOcultosCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCuentaPorCobrar.add(this.jPanelid_empresaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposOcultosCuentaPorCobrar % 2==0) {
		iXPanelCamposOcultosCuentaPorCobrar=0;
		iYPanelCamposOcultosCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposOcultosCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposOcultosCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCuentaPorCobrar.add(this.jPanelid_sucursalCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposOcultosCuentaPorCobrar % 2==0) {
		iXPanelCamposOcultosCuentaPorCobrar=0;
		iYPanelCamposOcultosCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposOcultosCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposOcultosCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCuentaPorCobrar.add(this.jPanelid_moduloCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposOcultosCuentaPorCobrar % 2==0) {
		iXPanelCamposOcultosCuentaPorCobrar=0;
		iYPanelCamposOcultosCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposOcultosCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposOcultosCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCuentaPorCobrar.add(this.jPanelid_ejercicioCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposOcultosCuentaPorCobrar % 2==0) {
		iXPanelCamposOcultosCuentaPorCobrar=0;
		iYPanelCamposOcultosCuentaPorCobrar++;
	}
	this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaPorCobrar.gridy = iYPanelCamposOcultosCuentaPorCobrar;
	this.gridBagConstraintsCuentaPorCobrar.gridx = iXPanelCamposOcultosCuentaPorCobrar++;
	this.gridBagConstraintsCuentaPorCobrar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaPorCobrar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCuentaPorCobrar.add(this.jPanelid_tipo_transaccion_moduloCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);



	if(iXPanelCamposOcultosCuentaPorCobrar % 2==0) {
		iXPanelCamposOcultosCuentaPorCobrar=0;
		iYPanelCamposOcultosCuentaPorCobrar++;
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
			
		GridBagLayout gridaBagLayoutAccionesCuentaPorCobrar= new GridBagLayout();
		this.jPanelAccionesCuentaPorCobrar.setLayout(gridaBagLayoutAccionesCuentaPorCobrar);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCuentaPorCobrar= new GridBagLayout();
		this.jPanelAccionesFormularioCuentaPorCobrar.setLayout(gridaBagLayoutAccionesFormularioCuentaPorCobrar);
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaPorCobrar.add(this.jComboBoxTiposAccionesFormularioCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaPorCobrar.add(this.jCheckBoxPostAccionNuevoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaPorCobrar.add(this.jCheckBoxPostAccionSinCerrarCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cuentaporcobrarSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaPorCobrar.add(this.jCheckBoxPostAccionSinMensajeCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXAccion++;
			
		this.jPanelAccionesCuentaPorCobrar.add(this.jButtonModificarCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);							

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx =iPosXAccion++;
			
		this.jPanelAccionesCuentaPorCobrar.add(this.jButtonEliminarCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
			
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaPorCobrar.add(this.jButtonActualizarCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaPorCobrar.add(this.jButtonGuardarCambiosCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);	
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;		
		this.gridBagConstraintsCuentaPorCobrar.gridx =iPosXAccion++;
		
		this.jPanelAccionesCuentaPorCobrar.add(this.jButtonCancelarCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaPorCobrar);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();						
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaPorCobrar.gridx = 0;		
			//this.gridBagConstraintsCuentaPorCobrar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaPorCobrar.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaPorCobrar.gridx =0;
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaPorCobrar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CuentaPorCobrarJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCuentaPorCobrar = new CuentaPorCobrarBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cuenta Por Cobrar DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cuenta Por Cobrar DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Por Cobrar Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CuentaPorCobrarModel cuentaporcobrarModel=new CuentaPorCobrarModel(this);
			
			//SI USARA CLASE INTERNA
			//CuentaPorCobrarModel.CuentaPorCobrarFocusTraversalPolicy cuentaporcobrarFocusTraversalPolicy = cuentaporcobrarModel.new CuentaPorCobrarFocusTraversalPolicy(this);
			
			//cuentaporcobrarFocusTraversalPolicy.setcuentaporcobrarJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cuentaporcobrarModel);
			
			
			this.jContentPaneDetalleCuentaPorCobrar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCuentaPorCobrar = new GridBagLayout();	
			this.jContentPaneDetalleCuentaPorCobrar.setLayout(gridaBagLayoutDetalleCuentaPorCobrar);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaPorCobrar = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
				this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
					
				
				this.jContentPaneDetalleCuentaPorCobrar.add(jTtoolBarDetalleCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);								
				
}
			
			this.jScrollPanelDatosEdicionCuentaPorCobrar=   new JScrollPane(jContentPaneDetalleCuentaPorCobrar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaPorCobrar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaPorCobrar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaPorCobrar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCuentaPorCobrar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaPorCobrar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaPorCobrar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaPorCobrar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	        
			this.jContentPaneDetalleCuentaPorCobrar.add(jPanelCamposCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);
			
			
			
			
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
						&& cuentaporcobrarSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cuentaporcobrarSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCuentaPorCobrar= new GridBagConstraints();
						this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
						this.jContentPaneDetalleCuentaPorCobrar.add(this.jTabbedPaneRelacionesCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCuentaPorCobrar.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCuentaPorCobrar.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
					this.gridBagConstraintsCuentaPorCobrar.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
					
				
					this.jContentPaneDetalleCuentaPorCobrar.add(jPanelCamposOcultosCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);
				
					this.jPanelCamposOcultosCuentaPorCobrar.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	        this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCuentaPorCobrar.add(this.jPanelAccionesFormularioCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);							
			
			
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
	        this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
	        
			
			this.jContentPaneDetalleCuentaPorCobrar.add(this.jPanelAccionesCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCuentaPorCobrar);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCuentaPorCobrar=   new JScrollPane(this.jPanelCamposCuentaPorCobrar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaPorCobrar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaPorCobrar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaPorCobrar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCuentaPorCobrar.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);			
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
			
			
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
			
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaPorCobrar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCuentaPorCobrar;//jContentPane;
		
		return jScrollPanelDatosEdicionCuentaPorCobrar;
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
