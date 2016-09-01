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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.PagoAutoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class PagoAutoDetalleFormJInternalFrame extends PagoAutoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePagoAuto;
	
	protected JMenuBar jmenuBarDetallePagoAuto;
	
	protected JMenu jmenuDetallePagoAuto;
	protected JMenu jmenuDetalleArchivoPagoAuto;
	protected JMenu jmenuDetalleAccionesPagoAuto;
	protected JMenu jmenuDetalleDatosPagoAuto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPagoAuto;	
	protected GridBagConstraints gridBagConstraintsPagoAuto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PagoAutoBeanSwingJInternalFrameAdditional jInternalFrameDetallePagoAuto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centroactividad="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected DetalleProveBeanSwingJInternalFrame detalleproveBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleprove="";

	protected CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentabanco="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected EstadoPagoAutoBeanSwingJInternalFrame estadopagoautoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopagoauto="";
	
	public PagoAutoSessionBean pagoautoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CentroActividadSessionBean centroactividadSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public DetalleProveSessionBean detalleproveSessionBean;
	public CuentaBancoSessionBean cuentabancoSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public EstadoPagoAutoSessionBean estadopagoautoSessionBean;	
	
	public PagoAutoLogic pagoautoLogic;
	
	public JScrollPane jScrollPanelDatosPagoAuto;
	public JScrollPane jScrollPanelDatosEdicionPagoAuto;
	public JScrollPane jScrollPanelDatosGeneralPagoAuto;
	
	protected JPanel jPanelCamposPagoAuto;    
	protected JPanel jPanelCamposOcultosPagoAuto;    	
	protected JPanel jPanelAccionesPagoAuto;
	protected JPanel jPanelAccionesFormularioPagoAuto;
    
	
	
	protected Integer iXPanelCamposPagoAuto=0;
	protected Integer iYPanelCamposPagoAuto=0;
	
	protected Integer iXPanelCamposOcultosPagoAuto=0;
	protected Integer iYPanelCamposOcultosPagoAuto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPagoAuto;
	public JButton jButtonModificarPagoAuto;
	public JButton jButtonActualizarPagoAuto;
    public JButton jButtonEliminarPagoAuto;
	public JButton jButtonCancelarPagoAuto;
    public JButton jButtonGuardarCambiosPagoAuto;
	public JButton jButtonGuardarCambiosTablaPagoAuto;
	protected JButton jButtonCerrarPagoAuto;
	
	
	protected JButton jButtonProcesarInformacionPagoAuto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPagoAuto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPagoAuto;
	protected JCheckBox jCheckBoxPostAccionSinMensajePagoAuto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPagoAuto;
	protected JButton jButtonModificarToolBarPagoAuto;
	protected JButton jButtonActualizarToolBarPagoAuto;
    protected JButton jButtonEliminarToolBarPagoAuto;
	protected JButton jButtonCancelarToolBarPagoAuto;
    protected JButton jButtonGuardarCambiosToolBarPagoAuto;
	protected JButton jButtonGuardarCambiosTablaToolBarPagoAuto;
	protected JButton jButtonMostrarOcultarTablaToolBarPagoAuto;
	protected JButton jButtonCerrarToolBarPagoAuto;
	
	protected JButton jButtonProcesarInformacionToolBarPagoAuto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPagoAuto;
	protected JMenuItem jMenuItemModificarPagoAuto;
	protected JMenuItem jMenuItemActualizarPagoAuto;
    protected JMenuItem jMenuItemEliminarPagoAuto;
	protected JMenuItem jMenuItemCancelarPagoAuto;
    protected JMenuItem jMenuItemGuardarCambiosPagoAuto;
	protected JMenuItem jMenuItemGuardarCambiosTablaPagoAuto;
	protected JMenuItem jMenuItemCerrarPagoAuto;
	protected JMenuItem jMenuItemDetalleCerrarPagoAuto;
	protected JMenuItem jMenuItemDetalleMostarOcultarPagoAuto;
	
	protected JMenuItem jMenuItemProcesarInformacionPagoAuto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPagoAuto;
	protected JMenuItem jMenuItemMostrarOcultarPagoAuto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPagoAuto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPagoAuto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPagoAuto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPagoAuto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPagoAuto;
	public JLabel jLabelIdPagoAuto;
	public JLabel jLabelidPagoAuto;
	public JButton jButtonidPagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaPagoAuto;
	public JLabel jLabelnumero_facturaPagoAuto;
	public JTextField jTextFieldnumero_facturaPagoAuto;
	public JButton jButtonnumero_facturaPagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionPagoAuto;
	public JLabel jLabelfecha_emisionPagoAuto;
	//public JFormattedTextField jDateChooserfecha_emisionPagoAuto;

	public JDateChooser jDateChooserfecha_emisionPagoAuto;
	public JButton jButtonfecha_emisionPagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoPagoAuto;
	public JLabel jLabelfecha_vencimientoPagoAuto;
	//public JFormattedTextField jDateChooserfecha_vencimientoPagoAuto;

	public JDateChooser jDateChooserfecha_vencimientoPagoAuto;
	public JButton jButtonfecha_vencimientoPagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_cortePagoAuto;
	public JLabel jLabelfecha_cortePagoAuto;
	//public JFormattedTextField jDateChooserfecha_cortePagoAuto;

	public JDateChooser jDateChooserfecha_cortePagoAuto;
	public JButton jButtonfecha_cortePagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_por_pagarPagoAuto;
	public JLabel jLabelvalor_por_pagarPagoAuto;
	public JTextField jTextFieldvalor_por_pagarPagoAuto;
	public JButton jButtonvalor_por_pagarPagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_canceladoPagoAuto;
	public JLabel jLabelvalor_canceladoPagoAuto;
	public JTextField jTextFieldvalor_canceladoPagoAuto;
	public JButton jButtonvalor_canceladoPagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelesta_autorizadoPagoAuto;
	public JLabel jLabelesta_autorizadoPagoAuto;
	public JCheckBox jCheckBoxesta_autorizadoPagoAuto;
	public JButton jButtonesta_autorizadoPagoAutoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPagoAuto;
	public JLabel jLabeldescripcionPagoAuto;
	public JTextArea jTextAreadescripcionPagoAuto;
	public JScrollPane jscrollPanedescripcionPagoAuto;
	public JButton jButtondescripcionPagoAutoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPagoAuto;
	public JLabel jLabelid_empresaPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPagoAuto;
	public JButton jButtonid_empresaPagoAuto= new JButtonMe();
	public JButton jButtonid_empresaPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_empresaPagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPagoAuto;
	public JLabel jLabelid_sucursalPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPagoAuto;
	public JButton jButtonid_sucursalPagoAuto= new JButtonMe();
	public JButton jButtonid_sucursalPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPagoAuto;
	public JLabel jLabelid_ejercicioPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPagoAuto;
	public JButton jButtonid_ejercicioPagoAuto= new JButtonMe();
	public JButton jButtonid_ejercicioPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelid_clientePagoAuto;
	public JLabel jLabelid_clientePagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clientePagoAuto;
	public JButton jButtonid_clientePagoAuto= new JButtonMe();
	public JButton jButtonid_clientePagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_clientePagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contablePagoAuto;
	public JLabel jLabelid_asiento_contablePagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contablePagoAuto;
	public JButton jButtonid_asiento_contablePagoAuto= new JButtonMe();
	public JButton jButtonid_asiento_contablePagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contablePagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoPagoAuto;
	public JLabel jLabelid_centro_costoPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoPagoAuto;
	public JButton jButtonid_centro_costoPagoAuto= new JButtonMe();
	public JButton jButtonid_centro_costoPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoPagoAutoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoPagoAutoArbol= new JButtonMe();

	public JPanel jPanelid_centro_actividadPagoAuto;
	public JLabel jLabelid_centro_actividadPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_actividadPagoAuto;
	public JButton jButtonid_centro_actividadPagoAuto= new JButtonMe();
	public JButton jButtonid_centro_actividadPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_centro_actividadPagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaPagoAuto;
	public JLabel jLabelid_facturaPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaPagoAuto;
	public JButton jButtonid_facturaPagoAuto= new JButtonMe();
	public JButton jButtonid_facturaPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_facturaPagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_provePagoAuto;
	public JLabel jLabelid_detalle_provePagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_provePagoAuto;
	public JButton jButtonid_detalle_provePagoAuto= new JButtonMe();
	public JButton jButtonid_detalle_provePagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_provePagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_bancoPagoAuto;
	public JLabel jLabelid_cuenta_bancoPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_bancoPagoAuto;
	public JButton jButtonid_cuenta_bancoPagoAuto= new JButtonMe();
	public JButton jButtonid_cuenta_bancoPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_bancoPagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionPagoAuto;
	public JLabel jLabelid_transaccionPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionPagoAuto;
	public JButton jButtonid_transaccionPagoAuto= new JButtonMe();
	public JButton jButtonid_transaccionPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_transaccionPagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_pago_autoPagoAuto;
	public JLabel jLabelid_estado_pago_autoPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pago_autoPagoAuto;
	public JButton jButtonid_estado_pago_autoPagoAuto= new JButtonMe();
	public JButton jButtonid_estado_pago_autoPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_estado_pago_autoPagoAutoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPagoAuto;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PagoAutoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPagoAuto=new JPanel();
				this.jPanelAccionesFormularioPagoAuto=new JPanel();
				this.jmenuBarDetallePagoAuto=new JMenuBar();
				this.jTtoolBarDetallePagoAuto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagoAutoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PagoAutoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagoAutoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagoAutoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagoAutoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPagoAuto() {
		return this.jButtonActualizarToolBarPagoAuto;
	}
	
	public JButton getjButtonEliminarToolBarPagoAuto() {
		return this.jButtonEliminarToolBarPagoAuto;
	}
	
	public JButton getjButtonCancelarToolBarPagoAuto() {
		return this.jButtonCancelarToolBarPagoAuto;
	}		
	
	public JButton getjButtonProcesarInformacionPagoAuto() {
		return this.jButtonProcesarInformacionPagoAuto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPagoAuto)	{
		this.jButtonProcesarInformacionPagoAuto = jButtonProcesarInformacionPagoAuto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPagoAuto() {
		return this.jComboBoxTiposAccionesPagoAuto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPagoAuto(
			JComboBox jComboBoxTiposRelacionesPagoAuto) {
		this.jComboBoxTiposRelacionesPagoAuto = jComboBoxTiposRelacionesPagoAuto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPagoAuto(
			JComboBox jComboBoxTiposAccionesPagoAuto) {
		this.jComboBoxTiposAccionesPagoAuto = jComboBoxTiposAccionesPagoAuto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPagoAuto() {
		return this.jComboBoxTiposAccionesFormularioPagoAuto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPagoAuto(
			JComboBox jComboBoxTiposAccionesFormularioPagoAuto) {
		this.jComboBoxTiposAccionesFormularioPagoAuto = jComboBoxTiposAccionesFormularioPagoAuto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.pagoautoSessionBean=new PagoAutoSessionBean();
		
		this.pagoautoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pagoautoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pagoautoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PagoAutoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pago Auto MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.pagoautoSessionBean.getEsGuardarRelacionado()) {
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
	
		PagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePagoAuto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPagoAuto=new JButtonMe();
				this.jButtonModificarToolBarPagoAuto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPagoAuto,this.jTtoolBarDetallePagoAuto,
							"actualizar","actualizar","Actualizar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPagoAuto,this.jTtoolBarDetallePagoAuto,
							"eliminar","eliminar","Eliminar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPagoAuto,this.jTtoolBarDetallePagoAuto,
							"cancelar","cancelar","Cancelar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPagoAuto,this.jTtoolBarDetallePagoAuto,
							"guardarcambios","guardarcambios","Guardar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePagoAuto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePagoAuto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPagoAuto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPagoAuto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPagoAuto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPagoAuto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPagoAuto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPagoAuto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPagoAuto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPagoAuto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPagoAuto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPagoAuto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPagoAuto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPagoAuto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPagoAuto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPagoAuto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPagoAuto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPagoAuto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPagoAuto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPagoAuto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPagoAuto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPagoAuto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPagoAuto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPagoAuto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPagoAuto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPagoAuto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPagoAuto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPagoAuto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPagoAuto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPagoAuto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPagoAuto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPagoAuto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPagoAuto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPagoAuto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPagoAuto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPagoAuto.add(this.jMenuItemDetalleCerrarPagoAuto);
		
		this.jmenuDetalleAccionesPagoAuto.add(this.jMenuItemActualizarPagoAuto);
		this.jmenuDetalleAccionesPagoAuto.add(this.jMenuItemEliminarPagoAuto);
		this.jmenuDetalleAccionesPagoAuto.add(this.jMenuItemCancelarPagoAuto);		
		
		//this.jmenuDetalleDatosPagoAuto.add(this.jMenuItemDetalleAbrirOrderByPagoAuto);				
		this.jmenuDetalleDatosPagoAuto.add(this.jMenuItemDetalleMostarOcultarPagoAuto);				
				
		//this.jmenuDetalleAccionesPagoAuto.add(this.jMenuItemGuardarCambiosPagoAuto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePagoAuto.add(this.jmenuDetalleArchivoPagoAuto);		
		this.jmenuBarDetallePagoAuto.add(this.jmenuDetalleAccionesPagoAuto);		
		this.jmenuBarDetallePagoAuto.add(this.jmenuDetalleDatosPagoAuto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePagoAuto);				
	}
	
	
	public void inicializarElementosCamposPagoAuto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPagoAuto = new JLabelMe();
		jLabelIdPagoAuto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPagoAuto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPagoAuto= new GridBagLayout();

		this.jPanelidPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);

		jLabelidPagoAuto = new JLabel();
		jLabelidPagoAuto.setText("Id");

		jLabelidPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_facturaPagoAuto = new JLabelMe();
		this.jLabelnumero_facturaPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaPagoAuto.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelnumero_facturaPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jTextFieldnumero_facturaPagoAuto= new JTextFieldMe();

		jTextFieldnumero_facturaPagoAuto.setEnabled(false);
		jTextFieldnumero_facturaPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaPagoAutoBusqueda= new JButtonMe();
		this.jButtonnumero_facturaPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaPagoAutoBusqueda.setText("U");
		this.jButtonnumero_facturaPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaPagoAutoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionPagoAuto = new JLabelMe();
		this.jLabelfecha_emisionPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionPagoAuto.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelfecha_emisionPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		//jFormattedTextFieldfecha_emisionPagoAuto= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionPagoAuto= new JDateChooser();
		jDateChooserfecha_emisionPagoAuto.setEnabled(false);
		jDateChooserfecha_emisionPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionPagoAuto.setDate(new Date());
		jDateChooserfecha_emisionPagoAuto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionPagoAuto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionPagoAutoBusqueda= new JButtonMe();
		this.jButtonfecha_emisionPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionPagoAutoBusqueda.setText("U");
		this.jButtonfecha_emisionPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionPagoAutoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoPagoAuto = new JLabelMe();
		this.jLabelfecha_vencimientoPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoPagoAuto.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelfecha_vencimientoPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		//jFormattedTextFieldfecha_vencimientoPagoAuto= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoPagoAuto= new JDateChooser();
		jDateChooserfecha_vencimientoPagoAuto.setEnabled(false);
		jDateChooserfecha_vencimientoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoPagoAuto.setDate(new Date());
		jDateChooserfecha_vencimientoPagoAuto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoPagoAuto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoPagoAutoBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoPagoAutoBusqueda.setText("U");
		this.jButtonfecha_vencimientoPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoPagoAutoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_cortePagoAuto = new JLabelMe();
		this.jLabelfecha_cortePagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_FECHACORTE+" : *");
		this.jLabelfecha_cortePagoAuto.setToolTipText("Fecha Corte");
		this.jLabelfecha_cortePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_cortePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_cortePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_cortePagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_cortePagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_cortePagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_FECHACORTE);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelfecha_cortePagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		//jFormattedTextFieldfecha_cortePagoAuto= new JFormattedTextFieldMe();

		jDateChooserfecha_cortePagoAuto= new JDateChooser();
		jDateChooserfecha_cortePagoAuto.setEnabled(false);
		jDateChooserfecha_cortePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_cortePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_cortePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_cortePagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_cortePagoAuto.setDate(new Date());
		jDateChooserfecha_cortePagoAuto.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_cortePagoAuto.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_cortePagoAutoBusqueda= new JButtonMe();
		this.jButtonfecha_cortePagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_cortePagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_cortePagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_cortePagoAutoBusqueda.setText("U");
		this.jButtonfecha_cortePagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_cortePagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_cortePagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_cortePagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_cortePagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_cortePagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_cortePagoAutoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_por_pagarPagoAuto = new JLabelMe();
		this.jLabelvalor_por_pagarPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_VALORPORPAGAR+" : *");
		this.jLabelvalor_por_pagarPagoAuto.setToolTipText("Valor Por Pagar");
		this.jLabelvalor_por_pagarPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_por_pagarPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_por_pagarPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_por_pagarPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_por_pagarPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_por_pagarPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_VALORPORPAGAR);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelvalor_por_pagarPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jTextFieldvalor_por_pagarPagoAuto= new JTextFieldMe();
		jTextFieldvalor_por_pagarPagoAuto.setEnabled(false);
		jTextFieldvalor_por_pagarPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_por_pagarPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_por_pagarPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_por_pagarPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_por_pagarPagoAuto.setText("0.0");

		this.jButtonvalor_por_pagarPagoAutoBusqueda= new JButtonMe();
		this.jButtonvalor_por_pagarPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_por_pagarPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_por_pagarPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_por_pagarPagoAutoBusqueda.setText("U");
		this.jButtonvalor_por_pagarPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_por_pagarPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_por_pagarPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_por_pagarPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_por_pagarPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_por_pagarPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_por_pagarPagoAutoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_canceladoPagoAuto = new JLabelMe();
		this.jLabelvalor_canceladoPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_VALORCANCELADO+" : *");
		this.jLabelvalor_canceladoPagoAuto.setToolTipText("Valor Cancelado");
		this.jLabelvalor_canceladoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_canceladoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_canceladoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_canceladoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_canceladoPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_canceladoPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_VALORCANCELADO);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelvalor_canceladoPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jTextFieldvalor_canceladoPagoAuto= new JTextFieldMe();
		jTextFieldvalor_canceladoPagoAuto.setEnabled(false);
		jTextFieldvalor_canceladoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_canceladoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_canceladoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_canceladoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_canceladoPagoAuto.setText("0.0");

		this.jButtonvalor_canceladoPagoAutoBusqueda= new JButtonMe();
		this.jButtonvalor_canceladoPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_canceladoPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_canceladoPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_canceladoPagoAutoBusqueda.setText("U");
		this.jButtonvalor_canceladoPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_canceladoPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_canceladoPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_canceladoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_canceladoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_canceladoPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_canceladoPagoAutoBusqueda.setVisible(false);		}


					
		this.jLabelesta_autorizadoPagoAuto = new JLabelMe();
		this.jLabelesta_autorizadoPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_ESTAAUTORIZADO+" : *");
		this.jLabelesta_autorizadoPagoAuto.setToolTipText("Esta Autorizado");
		this.jLabelesta_autorizadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelesta_autorizadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelesta_autorizadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_autorizadoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_autorizadoPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_autorizadoPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_ESTAAUTORIZADO);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelesta_autorizadoPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jCheckBoxesta_autorizadoPagoAuto= new JCheckBoxMe();
		jCheckBoxesta_autorizadoPagoAuto.setEnabled(false);

		jCheckBoxesta_autorizadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_autorizadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_autorizadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_autorizadoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_autorizadoPagoAutoBusqueda= new JButtonMe();
		this.jButtonesta_autorizadoPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_autorizadoPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_autorizadoPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_autorizadoPagoAutoBusqueda.setText("U");
		this.jButtonesta_autorizadoPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_autorizadoPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_autorizadoPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_autorizadoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_autorizadoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_autorizadoPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_autorizadoPagoAutoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPagoAuto = new JLabelMe();
		this.jLabeldescripcionPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionPagoAuto.setToolTipText("Descripcion");
		this.jLabeldescripcionPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPaneldescripcionPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jTextAreadescripcionPagoAuto= new JTextAreaMe();
		jTextAreadescripcionPagoAuto.setEnabled(false);
		jTextAreadescripcionPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPagoAuto.setLineWrap(true);
		jTextAreadescripcionPagoAuto.setWrapStyleWord(true);
		jTextAreadescripcionPagoAuto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPagoAuto.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPagoAuto = new JScrollPane(jTextAreadescripcionPagoAuto);
		jscrollPanedescripcionPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionPagoAutoBusqueda= new JButtonMe();
		this.jButtondescripcionPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPagoAutoBusqueda.setText("U");
		this.jButtondescripcionPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPagoAutoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPagoAuto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPagoAuto = new JLabelMe();
		this.jLabelid_empresaPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPagoAuto.setToolTipText("Empresa");
		this.jLabelid_empresaPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelid_empresaPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jComboBoxid_empresaPagoAuto= new JComboBoxMe();
		jComboBoxid_empresaPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPagoAuto.setEnabled(false);

		this.jButtonid_empresaPagoAuto= new JButtonMe();
		this.jButtonid_empresaPagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagoAuto.setText("Buscar");
		this.jButtonid_empresaPagoAuto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPagoAuto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagoAuto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagoAuto"));

		this.jButtonid_empresaPagoAutoBusqueda= new JButtonMe();
		this.jButtonid_empresaPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPagoAutoBusqueda.setText("U");
		this.jButtonid_empresaPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPagoAutoBusqueda.setVisible(false);		}

		this.jButtonid_empresaPagoAutoUpdate= new JButtonMe();
		this.jButtonid_empresaPagoAutoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagoAutoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagoAutoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPagoAutoUpdate.setText("U");
		this.jButtonid_empresaPagoAutoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPagoAutoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagoAutoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagoAutoUpdate"));



					
		this.jLabelid_sucursalPagoAuto = new JLabelMe();
		this.jLabelid_sucursalPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPagoAuto.setToolTipText("Sucursal");
		this.jLabelid_sucursalPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelid_sucursalPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jComboBoxid_sucursalPagoAuto= new JComboBoxMe();
		jComboBoxid_sucursalPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPagoAuto.setEnabled(false);

		this.jButtonid_sucursalPagoAuto= new JButtonMe();
		this.jButtonid_sucursalPagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPagoAuto.setText("Buscar");
		this.jButtonid_sucursalPagoAuto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPagoAuto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPagoAuto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPagoAuto"));

		this.jButtonid_sucursalPagoAutoBusqueda= new JButtonMe();
		this.jButtonid_sucursalPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPagoAutoBusqueda.setText("U");
		this.jButtonid_sucursalPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPagoAutoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPagoAutoUpdate= new JButtonMe();
		this.jButtonid_sucursalPagoAutoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPagoAutoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPagoAutoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPagoAutoUpdate.setText("U");
		this.jButtonid_sucursalPagoAutoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPagoAutoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPagoAutoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPagoAutoUpdate"));



					
		this.jLabelid_ejercicioPagoAuto = new JLabelMe();
		this.jLabelid_ejercicioPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPagoAuto.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelid_ejercicioPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jComboBoxid_ejercicioPagoAuto= new JComboBoxMe();
		jComboBoxid_ejercicioPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPagoAuto.setEnabled(false);

		this.jButtonid_ejercicioPagoAuto= new JButtonMe();
		this.jButtonid_ejercicioPagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPagoAuto.setText("Buscar");
		this.jButtonid_ejercicioPagoAuto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPagoAuto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPagoAuto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPagoAuto"));

		this.jButtonid_ejercicioPagoAutoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPagoAutoBusqueda.setText("U");
		this.jButtonid_ejercicioPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPagoAutoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPagoAutoUpdate= new JButtonMe();
		this.jButtonid_ejercicioPagoAutoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPagoAutoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPagoAutoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPagoAutoUpdate.setText("U");
		this.jButtonid_ejercicioPagoAutoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPagoAutoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPagoAutoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPagoAutoUpdate"));



					
		this.jLabelid_clientePagoAuto = new JLabelMe();
		this.jLabelid_clientePagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clientePagoAuto.setToolTipText("Cliente");
		this.jLabelid_clientePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clientePagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clientePagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clientePagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelid_clientePagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jComboBoxid_clientePagoAuto= new JComboBoxMe();
		jComboBoxid_clientePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clientePagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clientePagoAuto= new JButtonMe();
		this.jButtonid_clientePagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePagoAuto.setText("Buscar");
		this.jButtonid_clientePagoAuto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clientePagoAuto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePagoAuto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clientePagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePagoAuto"));

		this.jButtonid_clientePagoAutoBusqueda= new JButtonMe();
		this.jButtonid_clientePagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePagoAutoBusqueda.setText("U");
		this.jButtonid_clientePagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clientePagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clientePagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clientePagoAutoBusqueda.setVisible(false);		}

		this.jButtonid_clientePagoAutoUpdate= new JButtonMe();
		this.jButtonid_clientePagoAutoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePagoAutoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePagoAutoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePagoAutoUpdate.setText("U");
		this.jButtonid_clientePagoAutoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clientePagoAutoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePagoAutoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clientePagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePagoAutoUpdate"));



					
		this.jLabelid_asiento_contablePagoAuto = new JLabelMe();
		this.jLabelid_asiento_contablePagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contablePagoAuto.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contablePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contablePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contablePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contablePagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contablePagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contablePagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelid_asiento_contablePagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jComboBoxid_asiento_contablePagoAuto= new JComboBoxMe();
		jComboBoxid_asiento_contablePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contablePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contablePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contablePagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contablePagoAuto= new JButtonMe();
		this.jButtonid_asiento_contablePagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contablePagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contablePagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contablePagoAuto.setText("Buscar");
		this.jButtonid_asiento_contablePagoAuto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contablePagoAuto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contablePagoAuto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contablePagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contablePagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contablePagoAuto"));

		this.jButtonid_asiento_contablePagoAutoBusqueda= new JButtonMe();
		this.jButtonid_asiento_contablePagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contablePagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contablePagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contablePagoAutoBusqueda.setText("U");
		this.jButtonid_asiento_contablePagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contablePagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contablePagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contablePagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contablePagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contablePagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contablePagoAutoBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contablePagoAutoUpdate= new JButtonMe();
		this.jButtonid_asiento_contablePagoAutoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contablePagoAutoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contablePagoAutoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contablePagoAutoUpdate.setText("U");
		this.jButtonid_asiento_contablePagoAutoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contablePagoAutoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contablePagoAutoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contablePagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contablePagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contablePagoAutoUpdate"));



					
		this.jLabelid_centro_costoPagoAuto = new JLabelMe();
		this.jLabelid_centro_costoPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoPagoAuto.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelid_centro_costoPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jComboBoxid_centro_costoPagoAuto= new JComboBoxMe();
		jComboBoxid_centro_costoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoPagoAuto= new JButtonMe();
		this.jButtonid_centro_costoPagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPagoAuto.setText("Buscar");
		this.jButtonid_centro_costoPagoAuto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoPagoAuto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPagoAuto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPagoAuto"));

		this.jButtonid_centro_costoPagoAutoBusqueda= new JButtonMe();
		this.jButtonid_centro_costoPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoPagoAutoBusqueda.setText("U");
		this.jButtonid_centro_costoPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoPagoAutoBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoPagoAutoUpdate= new JButtonMe();
		this.jButtonid_centro_costoPagoAutoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPagoAutoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPagoAutoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoPagoAutoUpdate.setText("U");
		this.jButtonid_centro_costoPagoAutoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoPagoAutoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPagoAutoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPagoAutoUpdate"));


		jButtonid_centro_costoPagoAutoArbol= new JButtonMe();
		jButtonid_centro_costoPagoAutoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPagoAutoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPagoAutoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPagoAutoArbol.setText("Arbol");
		jButtonid_centro_costoPagoAutoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoPagoAutoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPagoAutoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPagoAutoArbol"));



					
		this.jLabelid_centro_actividadPagoAuto = new JLabelMe();
		this.jLabelid_centro_actividadPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_IDCENTROACTIVIDAD+" : *");
		this.jLabelid_centro_actividadPagoAuto.setToolTipText("Centro Activad");
		this.jLabelid_centro_actividadPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_actividadPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_actividadPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_actividadPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_actividadPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_actividadPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_IDCENTROACTIVIDAD);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelid_centro_actividadPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jComboBoxid_centro_actividadPagoAuto= new JComboBoxMe();
		jComboBoxid_centro_actividadPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_actividadPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_actividadPagoAuto= new JButtonMe();
		this.jButtonid_centro_actividadPagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadPagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadPagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadPagoAuto.setText("Buscar");
		this.jButtonid_centro_actividadPagoAuto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_actividadPagoAuto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadPagoAuto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_actividadPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadPagoAuto"));

		this.jButtonid_centro_actividadPagoAutoBusqueda= new JButtonMe();
		this.jButtonid_centro_actividadPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_actividadPagoAutoBusqueda.setText("U");
		this.jButtonid_centro_actividadPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_actividadPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_actividadPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_actividadPagoAutoBusqueda.setVisible(false);		}

		this.jButtonid_centro_actividadPagoAutoUpdate= new JButtonMe();
		this.jButtonid_centro_actividadPagoAutoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadPagoAutoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadPagoAutoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_actividadPagoAutoUpdate.setText("U");
		this.jButtonid_centro_actividadPagoAutoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_actividadPagoAutoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadPagoAutoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_actividadPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadPagoAutoUpdate"));



					
		this.jLabelid_facturaPagoAuto = new JLabelMe();
		this.jLabelid_facturaPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaPagoAuto.setToolTipText("Factura");
		this.jLabelid_facturaPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelid_facturaPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jComboBoxid_facturaPagoAuto= new JComboBoxMe();
		jComboBoxid_facturaPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaPagoAuto= new JButtonMe();
		this.jButtonid_facturaPagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaPagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaPagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaPagoAuto.setText("Buscar");
		this.jButtonid_facturaPagoAuto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaPagoAuto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaPagoAuto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaPagoAuto"));

		this.jButtonid_facturaPagoAutoBusqueda= new JButtonMe();
		this.jButtonid_facturaPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaPagoAutoBusqueda.setText("U");
		this.jButtonid_facturaPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaPagoAutoBusqueda.setVisible(false);		}

		this.jButtonid_facturaPagoAutoUpdate= new JButtonMe();
		this.jButtonid_facturaPagoAutoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaPagoAutoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaPagoAutoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaPagoAutoUpdate.setText("U");
		this.jButtonid_facturaPagoAutoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaPagoAutoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaPagoAutoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaPagoAutoUpdate"));



					
		this.jLabelid_detalle_provePagoAuto = new JLabelMe();
		this.jLabelid_detalle_provePagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_IDDETALLEPROVE+" : *");
		this.jLabelid_detalle_provePagoAuto.setToolTipText("Detalle Prove");
		this.jLabelid_detalle_provePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_detalle_provePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_detalle_provePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_provePagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_provePagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_provePagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_IDDETALLEPROVE);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelid_detalle_provePagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jComboBoxid_detalle_provePagoAuto= new JComboBoxMe();
		jComboBoxid_detalle_provePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_provePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_provePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_provePagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_provePagoAuto= new JButtonMe();
		this.jButtonid_detalle_provePagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_provePagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_provePagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_provePagoAuto.setText("Buscar");
		this.jButtonid_detalle_provePagoAuto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_provePagoAuto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_provePagoAuto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_provePagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_provePagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_provePagoAuto"));

		this.jButtonid_detalle_provePagoAutoBusqueda= new JButtonMe();
		this.jButtonid_detalle_provePagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_provePagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_provePagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_provePagoAutoBusqueda.setText("U");
		this.jButtonid_detalle_provePagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_provePagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_provePagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_provePagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_provePagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_provePagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_provePagoAutoBusqueda.setVisible(false);		}

		this.jButtonid_detalle_provePagoAutoUpdate= new JButtonMe();
		this.jButtonid_detalle_provePagoAutoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_provePagoAutoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_provePagoAutoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_provePagoAutoUpdate.setText("U");
		this.jButtonid_detalle_provePagoAutoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_provePagoAutoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_provePagoAutoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_provePagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_provePagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_provePagoAutoUpdate"));



					
		this.jLabelid_cuenta_bancoPagoAuto = new JLabelMe();
		this.jLabelid_cuenta_bancoPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_IDCUENTABANCO+" : *");
		this.jLabelid_cuenta_bancoPagoAuto.setToolTipText("Cuenta Banco");
		this.jLabelid_cuenta_bancoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_bancoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_bancoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_bancoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_bancoPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_bancoPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_IDCUENTABANCO);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelid_cuenta_bancoPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jComboBoxid_cuenta_bancoPagoAuto= new JComboBoxMe();
		jComboBoxid_cuenta_bancoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_bancoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_bancoPagoAuto= new JButtonMe();
		this.jButtonid_cuenta_bancoPagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoPagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoPagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoPagoAuto.setText("Buscar");
		this.jButtonid_cuenta_bancoPagoAuto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_bancoPagoAuto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoPagoAuto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_bancoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoPagoAuto"));

		this.jButtonid_cuenta_bancoPagoAutoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_bancoPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_bancoPagoAutoBusqueda.setText("U");
		this.jButtonid_cuenta_bancoPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_bancoPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_bancoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_bancoPagoAutoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_bancoPagoAutoUpdate= new JButtonMe();
		this.jButtonid_cuenta_bancoPagoAutoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoPagoAutoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoPagoAutoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_bancoPagoAutoUpdate.setText("U");
		this.jButtonid_cuenta_bancoPagoAutoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_bancoPagoAutoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoPagoAutoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_bancoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoPagoAutoUpdate"));



					
		this.jLabelid_transaccionPagoAuto = new JLabelMe();
		this.jLabelid_transaccionPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionPagoAuto.setToolTipText("Transaccion");
		this.jLabelid_transaccionPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelid_transaccionPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jComboBoxid_transaccionPagoAuto= new JComboBoxMe();
		jComboBoxid_transaccionPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionPagoAuto= new JButtonMe();
		this.jButtonid_transaccionPagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionPagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionPagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionPagoAuto.setText("Buscar");
		this.jButtonid_transaccionPagoAuto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionPagoAuto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionPagoAuto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionPagoAuto"));

		this.jButtonid_transaccionPagoAutoBusqueda= new JButtonMe();
		this.jButtonid_transaccionPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionPagoAutoBusqueda.setText("U");
		this.jButtonid_transaccionPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionPagoAutoBusqueda.setVisible(false);		}

		this.jButtonid_transaccionPagoAutoUpdate= new JButtonMe();
		this.jButtonid_transaccionPagoAutoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionPagoAutoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionPagoAutoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionPagoAutoUpdate.setText("U");
		this.jButtonid_transaccionPagoAutoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionPagoAutoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionPagoAutoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionPagoAutoUpdate"));



					
		this.jLabelid_estado_pago_autoPagoAuto = new JLabelMe();
		this.jLabelid_estado_pago_autoPagoAuto.setText(""+PagoAutoConstantesFunciones.LABEL_IDESTADOPAGOAUTO+" : *");
		this.jLabelid_estado_pago_autoPagoAuto.setToolTipText("Estado Pago Auto");
		this.jLabelid_estado_pago_autoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_pago_autoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_pago_autoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pago_autoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_pago_autoPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_pago_autoPagoAuto.setToolTipText(PagoAutoConstantesFunciones.LABEL_IDESTADOPAGOAUTO);
		this.gridaBagLayoutPagoAuto = new GridBagLayout();
		this.jPanelid_estado_pago_autoPagoAuto.setLayout(this.gridaBagLayoutPagoAuto);


		jComboBoxid_estado_pago_autoPagoAuto= new JComboBoxMe();
		jComboBoxid_estado_pago_autoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pago_autoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pago_autoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pago_autoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_pago_autoPagoAuto= new JButtonMe();
		this.jButtonid_estado_pago_autoPagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pago_autoPagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pago_autoPagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pago_autoPagoAuto.setText("Buscar");
		this.jButtonid_estado_pago_autoPagoAuto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_pago_autoPagoAuto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pago_autoPagoAuto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_pago_autoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pago_autoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pago_autoPagoAuto"));

		this.jButtonid_estado_pago_autoPagoAutoBusqueda= new JButtonMe();
		this.jButtonid_estado_pago_autoPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pago_autoPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pago_autoPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pago_autoPagoAutoBusqueda.setText("U");
		this.jButtonid_estado_pago_autoPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_pago_autoPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pago_autoPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_pago_autoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pago_autoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pago_autoPagoAutoBusqueda"));

		if(this.pagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_pago_autoPagoAutoBusqueda.setVisible(false);		}

		this.jButtonid_estado_pago_autoPagoAutoUpdate= new JButtonMe();
		this.jButtonid_estado_pago_autoPagoAutoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pago_autoPagoAutoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pago_autoPagoAutoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pago_autoPagoAutoUpdate.setText("U");
		this.jButtonid_estado_pago_autoPagoAutoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_pago_autoPagoAutoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pago_autoPagoAutoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_pago_autoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pago_autoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pago_autoPagoAutoUpdate"));



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
		//this.jInternalFrameDetallePagoAuto = new PagoAutoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pago Auto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPagoAuto= new GridBagLayout();
		

		
		String sToolTipPagoAuto="";
		sToolTipPagoAuto=PagoAutoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPagoAuto+="(Tesoreria.PagoAuto)";
		}
		
		if(!this.pagoautoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPagoAuto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPagoAuto = new JButtonMe();
		this.jButtonModificarPagoAuto = new JButtonMe();
        this.jButtonActualizarPagoAuto = new JButtonMe();
        this.jButtonEliminarPagoAuto = new JButtonMe();
        this.jButtonCancelarPagoAuto = new JButtonMe();
        this.jButtonGuardarCambiosPagoAuto = new JButtonMe();
		this.jButtonGuardarCambiosTablaPagoAuto = new JButtonMe();
		this.jButtonCerrarPagoAuto = new JButtonMe();
		
		this.jScrollPanelDatosPagoAuto = new JScrollPane();   
        this.jScrollPanelDatosEdicionPagoAuto = new JScrollPane();
		this.jScrollPanelDatosGeneralPagoAuto = new JScrollPane();
				
		
		
		this.jPanelCamposPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pago Auto";
		
		if(!this.pagoautoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pago Autos" + this.sPath));
		} else {
			this.jScrollPanelDatosPagoAuto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPagoAuto.setName("jPanelCamposPagoAuto"); 

		this.jPanelCamposOcultosPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPagoAuto.setName("jPanelCamposOcultosPagoAuto"); 

        this.jPanelAccionesPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPagoAuto.setToolTipText("Acciones");
        this.jPanelAccionesPagoAuto.setName("Acciones"); 

		this.jPanelAccionesFormularioPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPagoAuto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPagoAuto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPagoAuto.setText("Nuevo");
		this.jButtonModificarPagoAuto.setText("Editar");
        this.jButtonActualizarPagoAuto.setText("Actualizar");
        this.jButtonEliminarPagoAuto.setText("Eliminar");
        this.jButtonCancelarPagoAuto.setText("Cancelar");
        this.jButtonGuardarCambiosPagoAuto.setText("Guardar");
		this.jButtonGuardarCambiosTablaPagoAuto.setText("Guardar");
		this.jButtonCerrarPagoAuto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPagoAuto,"nuevo_button","Nuevo",this.pagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPagoAuto,"modificar_button","Editar",this.pagoautoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPagoAuto,"actualizar_button","Actualizar",this.pagoautoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPagoAuto,"eliminar_button","Eliminar",this.pagoautoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPagoAuto,"cancelar_button","Cancelar",this.pagoautoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPagoAuto,"guardarcambios_button","Guardar",this.pagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPagoAuto,"guardarcambiostabla_button","Guardar",this.pagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPagoAuto,"cerrar_button","Salir",this.pagoautoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPagoAuto.setToolTipText("Nuevo"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPagoAuto.setToolTipText("Editar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPagoAuto.setToolTipText("Actualizar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPagoAuto.setToolTipText("Eliminar)"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPagoAuto.setToolTipText("Cancelar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPagoAuto.setToolTipText("Guardar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPagoAuto.setToolTipText("Guardar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPagoAuto.setToolTipText("Salir"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPagoAuto";
		inputMap = this.jButtonNuevoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPagoAuto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPagoAuto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPagoAuto";
		inputMap = this.jButtonActualizarPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPagoAuto"));
		
		//ELIMINAR
		sMapKey = "EliminarPagoAuto";
		inputMap = this.jButtonEliminarPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPagoAuto"));
		
		//CANCELAR	
		sMapKey = "CancelarPagoAuto";
		inputMap = this.jButtonCancelarPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPagoAuto"));
		
		//CERRAR		
		sMapKey = "CerrarPagoAuto";
		inputMap = this.jButtonCerrarPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPagoAuto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPagoAuto";
		inputMap = this.jButtonGuardarCambiosTablaPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPagoAuto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPagoAuto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPagoAuto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPagoAuto.setToolTipText("Nuevo PagoAuto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPagoAuto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPagoAuto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPagoAuto.setToolTipText("Sin Cerrar Ventana PagoAuto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePagoAuto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePagoAuto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePagoAuto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPagoAuto.setText("Accion");
		this.jComboBoxTiposAccionesPagoAuto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPagoAuto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPagoAuto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPagoAuto = new JLabelMe();
		
		this.jLabelAccionesPagoAuto.setText("Acciones");		
		this.jLabelAccionesPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPagoAuto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPagoAuto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPagoAuto=new JTabbedPane();
		this.jTabbedPaneRelacionesPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPagoAuto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagoAuto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagoAuto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPagoAuto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPagoAuto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPagoAuto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPagoAuto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPagoAuto = new GridBagLayout();
		
		this.jPanelCamposPagoAuto.setLayout(gridaBagLayoutCamposPagoAuto);
		this.jPanelCamposOcultosPagoAuto.setLayout(gridaBagLayoutCamposOcultosPagoAuto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPagoAuto.add(jLabelIdPagoAuto, this.gridBagConstraintsPagoAuto);



	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPagoAuto.add(jLabelidPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPagoAuto.add(jLabelid_empresaPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPagoAuto.add(jButtonid_empresaPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 3;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPagoAuto.add(jButtonid_empresaPagoAutoUpdate, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPagoAuto.add(jComboBoxid_empresaPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPagoAuto.add(jLabelid_sucursalPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPagoAuto.add(jButtonid_sucursalPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 3;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPagoAuto.add(jButtonid_sucursalPagoAutoUpdate, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPagoAuto.add(jComboBoxid_sucursalPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPagoAuto.add(jLabelid_ejercicioPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPagoAuto.add(jButtonid_ejercicioPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 3;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPagoAuto.add(jButtonid_ejercicioPagoAutoUpdate, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPagoAuto.add(jComboBoxid_ejercicioPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clientePagoAuto.add(jLabelid_clientePagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 2;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clientePagoAuto.add(jButtonid_clientePagoAuto, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 3;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePagoAuto.add(jButtonid_clientePagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 4;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePagoAuto.add(jButtonid_clientePagoAutoUpdate, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clientePagoAuto.add(jComboBoxid_clientePagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contablePagoAuto.add(jLabelid_asiento_contablePagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 2;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contablePagoAuto.add(jButtonid_asiento_contablePagoAuto, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 3;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contablePagoAuto.add(jButtonid_asiento_contablePagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 4;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contablePagoAuto.add(jButtonid_asiento_contablePagoAutoUpdate, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contablePagoAuto.add(jComboBoxid_asiento_contablePagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoPagoAuto.add(jLabelid_centro_costoPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoPagoAuto.add(jButtonid_centro_costoPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 3;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoPagoAuto.add(jButtonid_centro_costoPagoAutoUpdate, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoPagoAuto.add(jComboBoxid_centro_costoPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_actividadPagoAuto.add(jLabelid_centro_actividadPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_actividadPagoAuto.add(jButtonid_centro_actividadPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 3;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_actividadPagoAuto.add(jButtonid_centro_actividadPagoAutoUpdate, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_actividadPagoAuto.add(jComboBoxid_centro_actividadPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaPagoAuto.add(jLabelid_facturaPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 2;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaPagoAuto.add(jButtonid_facturaPagoAuto, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 3;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaPagoAuto.add(jButtonid_facturaPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 4;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaPagoAuto.add(jButtonid_facturaPagoAutoUpdate, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaPagoAuto.add(jComboBoxid_facturaPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_provePagoAuto.add(jLabelid_detalle_provePagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_provePagoAuto.add(jButtonid_detalle_provePagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 3;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_provePagoAuto.add(jButtonid_detalle_provePagoAutoUpdate, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_provePagoAuto.add(jComboBoxid_detalle_provePagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_bancoPagoAuto.add(jLabelid_cuenta_bancoPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_bancoPagoAuto.add(jButtonid_cuenta_bancoPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 3;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_bancoPagoAuto.add(jButtonid_cuenta_bancoPagoAutoUpdate, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_bancoPagoAuto.add(jComboBoxid_cuenta_bancoPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionPagoAuto.add(jLabelid_transaccionPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionPagoAuto.add(jButtonid_transaccionPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 3;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionPagoAuto.add(jButtonid_transaccionPagoAutoUpdate, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionPagoAuto.add(jComboBoxid_transaccionPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_pago_autoPagoAuto.add(jLabelid_estado_pago_autoPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pago_autoPagoAuto.add(jButtonid_estado_pago_autoPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 3;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pago_autoPagoAuto.add(jButtonid_estado_pago_autoPagoAutoUpdate, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_pago_autoPagoAuto.add(jComboBoxid_estado_pago_autoPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaPagoAuto.add(jLabelnumero_facturaPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaPagoAuto.add(jButtonnumero_facturaPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaPagoAuto.add(jTextFieldnumero_facturaPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionPagoAuto.add(jLabelfecha_emisionPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionPagoAuto.add(jButtonfecha_emisionPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionPagoAuto.add(jDateChooserfecha_emisionPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoPagoAuto.add(jLabelfecha_vencimientoPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoPagoAuto.add(jButtonfecha_vencimientoPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoPagoAuto.add(jDateChooserfecha_vencimientoPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_cortePagoAuto.add(jLabelfecha_cortePagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_cortePagoAuto.add(jButtonfecha_cortePagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_cortePagoAuto.add(jDateChooserfecha_cortePagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_por_pagarPagoAuto.add(jLabelvalor_por_pagarPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_por_pagarPagoAuto.add(jButtonvalor_por_pagarPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_por_pagarPagoAuto.add(jTextFieldvalor_por_pagarPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_canceladoPagoAuto.add(jLabelvalor_canceladoPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_canceladoPagoAuto.add(jButtonvalor_canceladoPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_canceladoPagoAuto.add(jTextFieldvalor_canceladoPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_autorizadoPagoAuto.add(jLabelesta_autorizadoPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_autorizadoPagoAuto.add(jButtonesta_autorizadoPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_autorizadoPagoAuto.add(jCheckBoxesta_autorizadoPagoAuto, this.gridBagConstraintsPagoAuto);


	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 0;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPagoAuto.add(jLabeldescripcionPagoAuto, this.gridBagConstraintsPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 2;
		this.gridBagConstraintsPagoAuto.ipadx = 0;
		this.gridBagConstraintsPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPagoAuto.add(jButtondescripcionPagoAutoBusqueda, this.gridBagConstraintsPagoAuto);
	}

	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagoAuto.gridy = 0;
	this.gridBagConstraintsPagoAuto.gridx = 1;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPagoAuto.add(jscrollPanedescripcionPagoAuto, this.gridBagConstraintsPagoAuto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelidPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelid_clientePagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelid_asiento_contablePagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelid_centro_costoPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelid_centro_actividadPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelid_facturaPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelid_detalle_provePagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelid_cuenta_bancoPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelid_transaccionPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelid_estado_pago_autoPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelnumero_facturaPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelfecha_emisionPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelfecha_vencimientoPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelfecha_cortePagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelvalor_por_pagarPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelvalor_canceladoPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPanelesta_autorizadoPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagoAuto.add(this.jPaneldescripcionPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposPagoAuto % 2==0) {
		iXPanelCamposPagoAuto=0;
		iYPanelCamposPagoAuto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposOcultosPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposOcultosPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPagoAuto.add(this.jPanelid_empresaPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposOcultosPagoAuto % 2==0) {
		iXPanelCamposOcultosPagoAuto=0;
		iYPanelCamposOcultosPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposOcultosPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposOcultosPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPagoAuto.add(this.jPanelid_sucursalPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposOcultosPagoAuto % 2==0) {
		iXPanelCamposOcultosPagoAuto=0;
		iYPanelCamposOcultosPagoAuto++;
	}
	this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagoAuto.gridy = iYPanelCamposOcultosPagoAuto;
	this.gridBagConstraintsPagoAuto.gridx = iXPanelCamposOcultosPagoAuto++;
	this.gridBagConstraintsPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPagoAuto.add(this.jPanelid_ejercicioPagoAuto, this.gridBagConstraintsPagoAuto);



	if(iXPanelCamposOcultosPagoAuto % 2==0) {
		iXPanelCamposOcultosPagoAuto=0;
		iYPanelCamposOcultosPagoAuto++;
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
			
		GridBagLayout gridaBagLayoutAccionesPagoAuto= new GridBagLayout();
		this.jPanelAccionesPagoAuto.setLayout(gridaBagLayoutAccionesPagoAuto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPagoAuto= new GridBagLayout();
		this.jPanelAccionesFormularioPagoAuto.setLayout(gridaBagLayoutAccionesFormularioPagoAuto);
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPagoAuto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPagoAuto.add(this.jComboBoxTiposAccionesFormularioPagoAuto, this.gridBagConstraintsPagoAuto);

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPagoAuto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPagoAuto.add(this.jCheckBoxPostAccionNuevoPagoAuto, this.gridBagConstraintsPagoAuto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.pagoautoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPagoAuto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPagoAuto.add(this.jCheckBoxPostAccionSinCerrarPagoAuto, this.gridBagConstraintsPagoAuto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.pagoautoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.pagoautoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPagoAuto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPagoAuto.add(this.jCheckBoxPostAccionSinMensajePagoAuto, this.gridBagConstraintsPagoAuto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = iPosXAccion++;
			
		this.jPanelAccionesPagoAuto.add(this.jButtonModificarPagoAuto, this.gridBagConstraintsPagoAuto);							

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx =iPosXAccion++;
			
		this.jPanelAccionesPagoAuto.add(this.jButtonEliminarPagoAuto, this.gridBagConstraintsPagoAuto);
		
			
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy = 0;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXAccion++;
		
		this.jPanelAccionesPagoAuto.add(this.jButtonActualizarPagoAuto, this.gridBagConstraintsPagoAuto);


		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy = 0;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXAccion++;
		
		this.jPanelAccionesPagoAuto.add(this.jButtonGuardarCambiosPagoAuto, this.gridBagConstraintsPagoAuto);	
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy = 0;		
		this.gridBagConstraintsPagoAuto.gridx =iPosXAccion++;
		
		this.jPanelAccionesPagoAuto.add(this.jButtonCancelarPagoAuto, this.gridBagConstraintsPagoAuto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPagoAuto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPagoAuto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pagoautoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();						
			this.gridBagConstraintsPagoAuto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagoAuto.gridx = 0;		
			//this.gridBagConstraintsPagoAuto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPagoAuto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPagoAuto.gridx =0;
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPagoAuto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPagoAuto, this.gridBagConstraintsPagoAuto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PagoAutoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePagoAuto = new PagoAutoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pago Auto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pago Auto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pago Auto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PagoAutoModel pagoautoModel=new PagoAutoModel(this);
			
			//SI USARA CLASE INTERNA
			//PagoAutoModel.PagoAutoFocusTraversalPolicy pagoautoFocusTraversalPolicy = pagoautoModel.new PagoAutoFocusTraversalPolicy(this);
			
			//pagoautoFocusTraversalPolicy.setpagoautoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(pagoautoModel);
			
			
			this.jContentPaneDetallePagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePagoAuto = new GridBagLayout();	
			this.jContentPaneDetallePagoAuto.setLayout(gridaBagLayoutDetallePagoAuto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPagoAuto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPagoAuto = new GridBagConstraints();
				this.gridBagConstraintsPagoAuto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPagoAuto.gridx = 0;
					
				
				this.jContentPaneDetallePagoAuto.add(jTtoolBarDetallePagoAuto, gridBagConstraintsPagoAuto);								
				
}
			
			this.jScrollPanelDatosEdicionPagoAuto=   new JScrollPane(jContentPaneDetallePagoAuto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPagoAuto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagoAuto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagoAuto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPagoAuto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPagoAuto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagoAuto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagoAuto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPagoAuto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPagoAuto.gridx = 0;
	        
			this.jContentPaneDetallePagoAuto.add(jPanelCamposPagoAuto, gridBagConstraintsPagoAuto);
			
			
			
			
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
						&& pagoautoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.pagoautoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPagoAuto= new GridBagConstraints();
						this.gridBagConstraintsPagoAuto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPagoAuto.gridx = 0;
						this.jContentPaneDetallePagoAuto.add(this.jTabbedPaneRelacionesPagoAuto, this.gridBagConstraintsPagoAuto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPagoAuto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPagoAuto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPagoAuto = new GridBagConstraints();
					this.gridBagConstraintsPagoAuto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPagoAuto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPagoAuto.gridx = 0;
					
				
					this.jContentPaneDetallePagoAuto.add(jPanelCamposOcultosPagoAuto, gridBagConstraintsPagoAuto);
				
					this.jPanelCamposOcultosPagoAuto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPagoAuto.gridx = 0;
	        this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePagoAuto.add(this.jPanelAccionesFormularioPagoAuto, this.gridBagConstraintsPagoAuto);							
			
			
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
	        this.gridBagConstraintsPagoAuto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPagoAuto.gridx = 0;
	        
			
			this.jContentPaneDetallePagoAuto.add(this.jPanelAccionesPagoAuto, this.gridBagConstraintsPagoAuto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPagoAuto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPagoAuto=   new JScrollPane(this.jPanelCamposPagoAuto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPagoAuto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagoAuto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagoAuto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPagoAuto.gridx = 0;
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPagoAuto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPagoAuto, this.gridBagConstraintsPagoAuto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPagoAuto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPagoAuto, this.gridBagConstraintsPagoAuto);			
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPagoAuto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPagoAuto, this.gridBagConstraintsPagoAuto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagoAuto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPagoAuto, this.gridBagConstraintsPagoAuto);
			
			
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagoAuto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPagoAuto, this.gridBagConstraintsPagoAuto);
		
			
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPagoAuto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPagoAuto, this.gridBagConstraintsPagoAuto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPagoAuto;//jContentPane;
		
		return jScrollPanelDatosEdicionPagoAuto;
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
