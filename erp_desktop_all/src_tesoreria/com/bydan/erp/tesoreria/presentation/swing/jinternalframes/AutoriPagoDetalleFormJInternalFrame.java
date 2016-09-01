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
import com.bydan.erp.tesoreria.util.AutoriPagoConstantesFunciones;

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
public class AutoriPagoDetalleFormJInternalFrame extends AutoriPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAutoriPago;
	
	protected JMenuBar jmenuBarDetalleAutoriPago;
	
	protected JMenu jmenuDetalleAutoriPago;
	protected JMenu jmenuDetalleArchivoAutoriPago;
	protected JMenu jmenuDetalleAccionesAutoriPago;
	protected JMenu jmenuDetalleDatosAutoriPago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAutoriPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAutoriPago;	
	protected GridBagConstraints gridBagConstraintsAutoriPago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AutoriPagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleAutoriPago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centroactividad="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentabanco="";

	protected DetalleProveBeanSwingJInternalFrame detalleproveBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleprove="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";
	
	public AutoriPagoSessionBean autoripagoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CentroActividadSessionBean centroactividadSessionBean;
	public BancoSessionBean bancoSessionBean;
	public CuentaBancoSessionBean cuentabancoSessionBean;
	public DetalleProveSessionBean detalleproveSessionBean;
	public TransaccionSessionBean transaccionSessionBean;	
	
	public AutoriPagoLogic autoripagoLogic;
	
	public JScrollPane jScrollPanelDatosAutoriPago;
	public JScrollPane jScrollPanelDatosEdicionAutoriPago;
	public JScrollPane jScrollPanelDatosGeneralAutoriPago;
	
	protected JPanel jPanelCamposAutoriPago;    
	protected JPanel jPanelCamposOcultosAutoriPago;    	
	protected JPanel jPanelAccionesAutoriPago;
	protected JPanel jPanelAccionesFormularioAutoriPago;
    
	
	
	protected Integer iXPanelCamposAutoriPago=0;
	protected Integer iYPanelCamposAutoriPago=0;
	
	protected Integer iXPanelCamposOcultosAutoriPago=0;
	protected Integer iYPanelCamposOcultosAutoriPago=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAutoriPago;
	public JButton jButtonModificarAutoriPago;
	public JButton jButtonActualizarAutoriPago;
    public JButton jButtonEliminarAutoriPago;
	public JButton jButtonCancelarAutoriPago;
    public JButton jButtonGuardarCambiosAutoriPago;
	public JButton jButtonGuardarCambiosTablaAutoriPago;
	protected JButton jButtonCerrarAutoriPago;
	
	
	protected JButton jButtonProcesarInformacionAutoriPago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAutoriPago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAutoriPago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAutoriPago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAutoriPago;
	protected JButton jButtonModificarToolBarAutoriPago;
	protected JButton jButtonActualizarToolBarAutoriPago;
    protected JButton jButtonEliminarToolBarAutoriPago;
	protected JButton jButtonCancelarToolBarAutoriPago;
    protected JButton jButtonGuardarCambiosToolBarAutoriPago;
	protected JButton jButtonGuardarCambiosTablaToolBarAutoriPago;
	protected JButton jButtonMostrarOcultarTablaToolBarAutoriPago;
	protected JButton jButtonCerrarToolBarAutoriPago;
	
	protected JButton jButtonProcesarInformacionToolBarAutoriPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAutoriPago;
	protected JMenuItem jMenuItemModificarAutoriPago;
	protected JMenuItem jMenuItemActualizarAutoriPago;
    protected JMenuItem jMenuItemEliminarAutoriPago;
	protected JMenuItem jMenuItemCancelarAutoriPago;
    protected JMenuItem jMenuItemGuardarCambiosAutoriPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaAutoriPago;
	protected JMenuItem jMenuItemCerrarAutoriPago;
	protected JMenuItem jMenuItemDetalleCerrarAutoriPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarAutoriPago;
	
	protected JMenuItem jMenuItemProcesarInformacionAutoriPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAutoriPago;
	protected JMenuItem jMenuItemMostrarOcultarAutoriPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAutoriPago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAutoriPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAutoriPago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAutoriPago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAutoriPago;
	public JLabel jLabelIdAutoriPago;
	public JLabel jLabelidAutoriPago;
	public JButton jButtonidAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionAutoriPago;
	public JLabel jLabelfecha_emisionAutoriPago;
	//public JFormattedTextField jDateChooserfecha_emisionAutoriPago;

	public JDateChooser jDateChooserfecha_emisionAutoriPago;
	public JButton jButtonfecha_emisionAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoAutoriPago;
	public JLabel jLabelfecha_vencimientoAutoriPago;
	//public JFormattedTextField jDateChooserfecha_vencimientoAutoriPago;

	public JDateChooser jDateChooserfecha_vencimientoAutoriPago;
	public JButton jButtonfecha_vencimientoAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_pagoAutoriPago;
	public JLabel jLabelvalor_pagoAutoriPago;
	public JTextField jTextFieldvalor_pagoAutoriPago;
	public JButton jButtonvalor_pagoAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_canceladoAutoriPago;
	public JLabel jLabelvalor_canceladoAutoriPago;
	public JTextField jTextFieldvalor_canceladoAutoriPago;
	public JButton jButtonvalor_canceladoAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaAutoriPago;
	public JLabel jLabelnumero_facturaAutoriPago;
	public JTextField jTextFieldnumero_facturaAutoriPago;
	public JButton jButtonnumero_facturaAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPaneldetalle_facturaAutoriPago;
	public JLabel jLabeldetalle_facturaAutoriPago;
	public JTextArea jTextAreadetalle_facturaAutoriPago;
	public JScrollPane jscrollPanedetalle_facturaAutoriPago;
	public JButton jButtondetalle_facturaAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_corteAutoriPago;
	public JLabel jLabelfecha_corteAutoriPago;
	//public JFormattedTextField jDateChooserfecha_corteAutoriPago;

	public JDateChooser jDateChooserfecha_corteAutoriPago;
	public JButton jButtonfecha_corteAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionAutoriPago;
	public JLabel jLabeldescripcionAutoriPago;
	public JTextArea jTextAreadescripcionAutoriPago;
	public JScrollPane jscrollPanedescripcionAutoriPago;
	public JButton jButtondescripcionAutoriPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAutoriPago;
	public JLabel jLabelid_empresaAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAutoriPago;
	public JButton jButtonid_empresaAutoriPago= new JButtonMe();
	public JButton jButtonid_empresaAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_empresaAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalAutoriPago;
	public JLabel jLabelid_sucursalAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalAutoriPago;
	public JButton jButtonid_sucursalAutoriPago= new JButtonMe();
	public JButton jButtonid_sucursalAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioAutoriPago;
	public JLabel jLabelid_ejercicioAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioAutoriPago;
	public JButton jButtonid_ejercicioAutoriPago= new JButtonMe();
	public JButton jButtonid_ejercicioAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteAutoriPago;
	public JLabel jLabelid_clienteAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteAutoriPago;
	public JButton jButtonid_clienteAutoriPago= new JButtonMe();
	public JButton jButtonid_clienteAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_clienteAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaAutoriPago;
	public JLabel jLabelid_facturaAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaAutoriPago;
	public JButton jButtonid_facturaAutoriPago= new JButtonMe();
	public JButton jButtonid_facturaAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_facturaAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableAutoriPago;
	public JLabel jLabelid_asiento_contableAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableAutoriPago;
	public JButton jButtonid_asiento_contableAutoriPago= new JButtonMe();
	public JButton jButtonid_asiento_contableAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoAutoriPago;
	public JLabel jLabelid_centro_costoAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoAutoriPago;
	public JButton jButtonid_centro_costoAutoriPago= new JButtonMe();
	public JButton jButtonid_centro_costoAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoAutoriPagoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoAutoriPagoArbol= new JButtonMe();

	public JPanel jPanelid_centro_actividadAutoriPago;
	public JLabel jLabelid_centro_actividadAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_actividadAutoriPago;
	public JButton jButtonid_centro_actividadAutoriPago= new JButtonMe();
	public JButton jButtonid_centro_actividadAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_centro_actividadAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_bancoAutoriPago;
	public JLabel jLabelid_bancoAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoAutoriPago;
	public JButton jButtonid_bancoAutoriPago= new JButtonMe();
	public JButton jButtonid_bancoAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_bancoAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_bancoAutoriPago;
	public JLabel jLabelid_cuenta_bancoAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_bancoAutoriPago;
	public JButton jButtonid_cuenta_bancoAutoriPago= new JButtonMe();
	public JButton jButtonid_cuenta_bancoAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_bancoAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_proveAutoriPago;
	public JLabel jLabelid_detalle_proveAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_proveAutoriPago;
	public JButton jButtonid_detalle_proveAutoriPago= new JButtonMe();
	public JButton jButtonid_detalle_proveAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_proveAutoriPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionAutoriPago;
	public JLabel jLabelid_transaccionAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionAutoriPago;
	public JButton jButtonid_transaccionAutoriPago= new JButtonMe();
	public JButton jButtonid_transaccionAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_transaccionAutoriPagoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAutoriPago;
	
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
	
	public AutoriPagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAutoriPago=new JPanel();
				this.jPanelAccionesFormularioAutoriPago=new JPanel();
				this.jmenuBarDetalleAutoriPago=new JMenuBar();
				this.jTtoolBarDetalleAutoriPago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriPagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AutoriPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AutoriPagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AutoriPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriPagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriPagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriPagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AutoriPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAutoriPago() {
		return this.jButtonActualizarToolBarAutoriPago;
	}
	
	public JButton getjButtonEliminarToolBarAutoriPago() {
		return this.jButtonEliminarToolBarAutoriPago;
	}
	
	public JButton getjButtonCancelarToolBarAutoriPago() {
		return this.jButtonCancelarToolBarAutoriPago;
	}		
	
	public JButton getjButtonProcesarInformacionAutoriPago() {
		return this.jButtonProcesarInformacionAutoriPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAutoriPago)	{
		this.jButtonProcesarInformacionAutoriPago = jButtonProcesarInformacionAutoriPago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAutoriPago() {
		return this.jComboBoxTiposAccionesAutoriPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAutoriPago(
			JComboBox jComboBoxTiposRelacionesAutoriPago) {
		this.jComboBoxTiposRelacionesAutoriPago = jComboBoxTiposRelacionesAutoriPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAutoriPago(
			JComboBox jComboBoxTiposAccionesAutoriPago) {
		this.jComboBoxTiposAccionesAutoriPago = jComboBoxTiposAccionesAutoriPago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAutoriPago() {
		return this.jComboBoxTiposAccionesFormularioAutoriPago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAutoriPago(
			JComboBox jComboBoxTiposAccionesFormularioAutoriPago) {
		this.jComboBoxTiposAccionesFormularioAutoriPago = jComboBoxTiposAccionesFormularioAutoriPago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.autoripagoSessionBean=new AutoriPagoSessionBean();
		
		this.autoripagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autoripagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.autoripagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AutoriPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AutoriPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AutoriPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Autori Pago MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.autoripagoSessionBean.getEsGuardarRelacionado()) {
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
	
		AutoriPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAutoriPago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAutoriPago=new JButtonMe();
				this.jButtonModificarToolBarAutoriPago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAutoriPago,this.jTtoolBarDetalleAutoriPago,
							"actualizar","actualizar","Actualizar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAutoriPago,this.jTtoolBarDetalleAutoriPago,
							"eliminar","eliminar","Eliminar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAutoriPago,this.jTtoolBarDetalleAutoriPago,
							"cancelar","cancelar","Cancelar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAutoriPago,this.jTtoolBarDetalleAutoriPago,
							"guardarcambios","guardarcambios","Guardar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAutoriPago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAutoriPago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAutoriPago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAutoriPago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAutoriPago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAutoriPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAutoriPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAutoriPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAutoriPago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAutoriPago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAutoriPago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAutoriPago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAutoriPago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAutoriPago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAutoriPago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAutoriPago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAutoriPago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAutoriPago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAutoriPago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAutoriPago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAutoriPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAutoriPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAutoriPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAutoriPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAutoriPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAutoriPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAutoriPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAutoriPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAutoriPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAutoriPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAutoriPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAutoriPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAutoriPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAutoriPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAutoriPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAutoriPago.add(this.jMenuItemDetalleCerrarAutoriPago);
		
		this.jmenuDetalleAccionesAutoriPago.add(this.jMenuItemActualizarAutoriPago);
		this.jmenuDetalleAccionesAutoriPago.add(this.jMenuItemEliminarAutoriPago);
		this.jmenuDetalleAccionesAutoriPago.add(this.jMenuItemCancelarAutoriPago);		
		
		//this.jmenuDetalleDatosAutoriPago.add(this.jMenuItemDetalleAbrirOrderByAutoriPago);				
		this.jmenuDetalleDatosAutoriPago.add(this.jMenuItemDetalleMostarOcultarAutoriPago);				
				
		//this.jmenuDetalleAccionesAutoriPago.add(this.jMenuItemGuardarCambiosAutoriPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAutoriPago.add(this.jmenuDetalleArchivoAutoriPago);		
		this.jmenuBarDetalleAutoriPago.add(this.jmenuDetalleAccionesAutoriPago);		
		this.jmenuBarDetalleAutoriPago.add(this.jmenuDetalleDatosAutoriPago);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAutoriPago);				
	}
	
	
	public void inicializarElementosCamposAutoriPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAutoriPago = new JLabelMe();
		jLabelIdAutoriPago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAutoriPago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAutoriPago= new GridBagLayout();

		this.jPanelidAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);

		jLabelidAutoriPago = new JLabel();
		jLabelidAutoriPago.setText("Id");

		jLabelidAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emisionAutoriPago = new JLabelMe();
		this.jLabelfecha_emisionAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionAutoriPago.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelfecha_emisionAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		//jFormattedTextFieldfecha_emisionAutoriPago= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionAutoriPago= new JDateChooser();
		jDateChooserfecha_emisionAutoriPago.setEnabled(false);
		jDateChooserfecha_emisionAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionAutoriPago.setDate(new Date());
		jDateChooserfecha_emisionAutoriPago.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionAutoriPago.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionAutoriPagoBusqueda= new JButtonMe();
		this.jButtonfecha_emisionAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionAutoriPagoBusqueda.setText("U");
		this.jButtonfecha_emisionAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionAutoriPagoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoAutoriPago = new JLabelMe();
		this.jLabelfecha_vencimientoAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoAutoriPago.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelfecha_vencimientoAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		//jFormattedTextFieldfecha_vencimientoAutoriPago= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoAutoriPago= new JDateChooser();
		jDateChooserfecha_vencimientoAutoriPago.setEnabled(false);
		jDateChooserfecha_vencimientoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoAutoriPago.setDate(new Date());
		jDateChooserfecha_vencimientoAutoriPago.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoAutoriPago.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoAutoriPagoBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoAutoriPagoBusqueda.setText("U");
		this.jButtonfecha_vencimientoAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoAutoriPagoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_pagoAutoriPago = new JLabelMe();
		this.jLabelvalor_pagoAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_VALORPAGO+" : *");
		this.jLabelvalor_pagoAutoriPago.setToolTipText("Valor Pago");
		this.jLabelvalor_pagoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pagoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pagoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_pagoAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_pagoAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_pagoAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_VALORPAGO);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelvalor_pagoAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jTextFieldvalor_pagoAutoriPago= new JTextFieldMe();
		jTextFieldvalor_pagoAutoriPago.setEnabled(false);
		jTextFieldvalor_pagoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pagoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pagoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_pagoAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_pagoAutoriPago.setText("0.0");

		this.jButtonvalor_pagoAutoriPagoBusqueda= new JButtonMe();
		this.jButtonvalor_pagoAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pagoAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pagoAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_pagoAutoriPagoBusqueda.setText("U");
		this.jButtonvalor_pagoAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_pagoAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_pagoAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_pagoAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_pagoAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_pagoAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_pagoAutoriPagoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_canceladoAutoriPago = new JLabelMe();
		this.jLabelvalor_canceladoAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_VALORCANCELADO+" : *");
		this.jLabelvalor_canceladoAutoriPago.setToolTipText("Valor Cancelado");
		this.jLabelvalor_canceladoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_canceladoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_canceladoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_canceladoAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_canceladoAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_canceladoAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_VALORCANCELADO);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelvalor_canceladoAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jTextFieldvalor_canceladoAutoriPago= new JTextFieldMe();
		jTextFieldvalor_canceladoAutoriPago.setEnabled(false);
		jTextFieldvalor_canceladoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_canceladoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_canceladoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_canceladoAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_canceladoAutoriPago.setText("0.0");

		this.jButtonvalor_canceladoAutoriPagoBusqueda= new JButtonMe();
		this.jButtonvalor_canceladoAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_canceladoAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_canceladoAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_canceladoAutoriPagoBusqueda.setText("U");
		this.jButtonvalor_canceladoAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_canceladoAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_canceladoAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_canceladoAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_canceladoAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_canceladoAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_canceladoAutoriPagoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaAutoriPago = new JLabelMe();
		this.jLabelnumero_facturaAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaAutoriPago.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelnumero_facturaAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jTextFieldnumero_facturaAutoriPago= new JTextFieldMe();

		jTextFieldnumero_facturaAutoriPago.setEnabled(false);
		jTextFieldnumero_facturaAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaAutoriPagoBusqueda= new JButtonMe();
		this.jButtonnumero_facturaAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaAutoriPagoBusqueda.setText("U");
		this.jButtonnumero_facturaAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaAutoriPagoBusqueda.setVisible(false);		}


					
		this.jLabeldetalle_facturaAutoriPago = new JLabelMe();
		this.jLabeldetalle_facturaAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_DETALLEFACTURA+" : *");
		this.jLabeldetalle_facturaAutoriPago.setToolTipText("Detalle Factura");
		this.jLabeldetalle_facturaAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldetalle_facturaAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldetalle_facturaAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalle_facturaAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalle_facturaAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalle_facturaAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_DETALLEFACTURA);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPaneldetalle_facturaAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jTextAreadetalle_facturaAutoriPago= new JTextAreaMe();
		jTextAreadetalle_facturaAutoriPago.setEnabled(false);
		jTextAreadetalle_facturaAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalle_facturaAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalle_facturaAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalle_facturaAutoriPago.setLineWrap(true);
		jTextAreadetalle_facturaAutoriPago.setWrapStyleWord(true);
		jTextAreadetalle_facturaAutoriPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalle_facturaAutoriPago.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalle_facturaAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalle_facturaAutoriPago = new JScrollPane(jTextAreadetalle_facturaAutoriPago);
		jscrollPanedetalle_facturaAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalle_facturaAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalle_facturaAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondetalle_facturaAutoriPagoBusqueda= new JButtonMe();
		this.jButtondetalle_facturaAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalle_facturaAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalle_facturaAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalle_facturaAutoriPagoBusqueda.setText("U");
		this.jButtondetalle_facturaAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalle_facturaAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalle_facturaAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalle_facturaAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalle_facturaAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalle_facturaAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalle_facturaAutoriPagoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_corteAutoriPago = new JLabelMe();
		this.jLabelfecha_corteAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_FECHACORTE+" : *");
		this.jLabelfecha_corteAutoriPago.setToolTipText("Fecha Corte");
		this.jLabelfecha_corteAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_corteAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_corteAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_corteAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_corteAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_corteAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_FECHACORTE);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelfecha_corteAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		//jFormattedTextFieldfecha_corteAutoriPago= new JFormattedTextFieldMe();

		jDateChooserfecha_corteAutoriPago= new JDateChooser();
		jDateChooserfecha_corteAutoriPago.setEnabled(false);
		jDateChooserfecha_corteAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_corteAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_corteAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_corteAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_corteAutoriPago.setDate(new Date());
		jDateChooserfecha_corteAutoriPago.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_corteAutoriPago.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_corteAutoriPagoBusqueda= new JButtonMe();
		this.jButtonfecha_corteAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_corteAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_corteAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_corteAutoriPagoBusqueda.setText("U");
		this.jButtonfecha_corteAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_corteAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_corteAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_corteAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_corteAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_corteAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_corteAutoriPagoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionAutoriPago = new JLabelMe();
		this.jLabeldescripcionAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionAutoriPago.setToolTipText("Descripcion");
		this.jLabeldescripcionAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPaneldescripcionAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jTextAreadescripcionAutoriPago= new JTextAreaMe();
		jTextAreadescripcionAutoriPago.setEnabled(false);
		jTextAreadescripcionAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionAutoriPago.setLineWrap(true);
		jTextAreadescripcionAutoriPago.setWrapStyleWord(true);
		jTextAreadescripcionAutoriPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionAutoriPago.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionAutoriPago = new JScrollPane(jTextAreadescripcionAutoriPago);
		jscrollPanedescripcionAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionAutoriPagoBusqueda= new JButtonMe();
		this.jButtondescripcionAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionAutoriPagoBusqueda.setText("U");
		this.jButtondescripcionAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionAutoriPagoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAutoriPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAutoriPago = new JLabelMe();
		this.jLabelid_empresaAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAutoriPago.setToolTipText("Empresa");
		this.jLabelid_empresaAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelid_empresaAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jComboBoxid_empresaAutoriPago= new JComboBoxMe();
		jComboBoxid_empresaAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAutoriPago.setEnabled(false);

		this.jButtonid_empresaAutoriPago= new JButtonMe();
		this.jButtonid_empresaAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriPago.setText("Buscar");
		this.jButtonid_empresaAutoriPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAutoriPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriPago"));

		this.jButtonid_empresaAutoriPagoBusqueda= new JButtonMe();
		this.jButtonid_empresaAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAutoriPagoBusqueda.setText("U");
		this.jButtonid_empresaAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAutoriPagoBusqueda.setVisible(false);		}

		this.jButtonid_empresaAutoriPagoUpdate= new JButtonMe();
		this.jButtonid_empresaAutoriPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAutoriPagoUpdate.setText("U");
		this.jButtonid_empresaAutoriPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAutoriPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriPagoUpdate"));



					
		this.jLabelid_sucursalAutoriPago = new JLabelMe();
		this.jLabelid_sucursalAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalAutoriPago.setToolTipText("Sucursal");
		this.jLabelid_sucursalAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelid_sucursalAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jComboBoxid_sucursalAutoriPago= new JComboBoxMe();
		jComboBoxid_sucursalAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalAutoriPago.setEnabled(false);

		this.jButtonid_sucursalAutoriPago= new JButtonMe();
		this.jButtonid_sucursalAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutoriPago.setText("Buscar");
		this.jButtonid_sucursalAutoriPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalAutoriPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutoriPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutoriPago"));

		this.jButtonid_sucursalAutoriPagoBusqueda= new JButtonMe();
		this.jButtonid_sucursalAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAutoriPagoBusqueda.setText("U");
		this.jButtonid_sucursalAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalAutoriPagoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalAutoriPagoUpdate= new JButtonMe();
		this.jButtonid_sucursalAutoriPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAutoriPagoUpdate.setText("U");
		this.jButtonid_sucursalAutoriPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalAutoriPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutoriPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutoriPagoUpdate"));



					
		this.jLabelid_ejercicioAutoriPago = new JLabelMe();
		this.jLabelid_ejercicioAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioAutoriPago.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelid_ejercicioAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jComboBoxid_ejercicioAutoriPago= new JComboBoxMe();
		jComboBoxid_ejercicioAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioAutoriPago.setEnabled(false);

		this.jButtonid_ejercicioAutoriPago= new JButtonMe();
		this.jButtonid_ejercicioAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioAutoriPago.setText("Buscar");
		this.jButtonid_ejercicioAutoriPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioAutoriPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioAutoriPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioAutoriPago"));

		this.jButtonid_ejercicioAutoriPagoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioAutoriPagoBusqueda.setText("U");
		this.jButtonid_ejercicioAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioAutoriPagoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioAutoriPagoUpdate= new JButtonMe();
		this.jButtonid_ejercicioAutoriPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAutoriPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAutoriPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioAutoriPagoUpdate.setText("U");
		this.jButtonid_ejercicioAutoriPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioAutoriPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioAutoriPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioAutoriPagoUpdate"));



					
		this.jLabelid_clienteAutoriPago = new JLabelMe();
		this.jLabelid_clienteAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteAutoriPago.setToolTipText("Cliente");
		this.jLabelid_clienteAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelid_clienteAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jComboBoxid_clienteAutoriPago= new JComboBoxMe();
		jComboBoxid_clienteAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteAutoriPago= new JButtonMe();
		this.jButtonid_clienteAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAutoriPago.setText("Buscar");
		this.jButtonid_clienteAutoriPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteAutoriPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAutoriPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAutoriPago"));

		this.jButtonid_clienteAutoriPagoBusqueda= new JButtonMe();
		this.jButtonid_clienteAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteAutoriPagoBusqueda.setText("U");
		this.jButtonid_clienteAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteAutoriPagoBusqueda.setVisible(false);		}

		this.jButtonid_clienteAutoriPagoUpdate= new JButtonMe();
		this.jButtonid_clienteAutoriPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAutoriPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAutoriPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteAutoriPagoUpdate.setText("U");
		this.jButtonid_clienteAutoriPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteAutoriPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAutoriPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAutoriPagoUpdate"));



					
		this.jLabelid_facturaAutoriPago = new JLabelMe();
		this.jLabelid_facturaAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaAutoriPago.setToolTipText("Factura");
		this.jLabelid_facturaAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelid_facturaAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jComboBoxid_facturaAutoriPago= new JComboBoxMe();
		jComboBoxid_facturaAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaAutoriPago= new JButtonMe();
		this.jButtonid_facturaAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaAutoriPago.setText("Buscar");
		this.jButtonid_facturaAutoriPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaAutoriPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaAutoriPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaAutoriPago"));

		this.jButtonid_facturaAutoriPagoBusqueda= new JButtonMe();
		this.jButtonid_facturaAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaAutoriPagoBusqueda.setText("U");
		this.jButtonid_facturaAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaAutoriPagoBusqueda.setVisible(false);		}

		this.jButtonid_facturaAutoriPagoUpdate= new JButtonMe();
		this.jButtonid_facturaAutoriPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaAutoriPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaAutoriPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaAutoriPagoUpdate.setText("U");
		this.jButtonid_facturaAutoriPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaAutoriPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaAutoriPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaAutoriPagoUpdate"));



					
		this.jLabelid_asiento_contableAutoriPago = new JLabelMe();
		this.jLabelid_asiento_contableAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableAutoriPago.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelid_asiento_contableAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jComboBoxid_asiento_contableAutoriPago= new JComboBoxMe();
		jComboBoxid_asiento_contableAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableAutoriPago= new JButtonMe();
		this.jButtonid_asiento_contableAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableAutoriPago.setText("Buscar");
		this.jButtonid_asiento_contableAutoriPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableAutoriPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableAutoriPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableAutoriPago"));

		this.jButtonid_asiento_contableAutoriPagoBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableAutoriPagoBusqueda.setText("U");
		this.jButtonid_asiento_contableAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableAutoriPagoBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableAutoriPagoUpdate= new JButtonMe();
		this.jButtonid_asiento_contableAutoriPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableAutoriPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableAutoriPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableAutoriPagoUpdate.setText("U");
		this.jButtonid_asiento_contableAutoriPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableAutoriPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableAutoriPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableAutoriPagoUpdate"));



					
		this.jLabelid_centro_costoAutoriPago = new JLabelMe();
		this.jLabelid_centro_costoAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoAutoriPago.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelid_centro_costoAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jComboBoxid_centro_costoAutoriPago= new JComboBoxMe();
		jComboBoxid_centro_costoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoAutoriPago= new JButtonMe();
		this.jButtonid_centro_costoAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoAutoriPago.setText("Buscar");
		this.jButtonid_centro_costoAutoriPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoAutoriPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoAutoriPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoAutoriPago"));

		this.jButtonid_centro_costoAutoriPagoBusqueda= new JButtonMe();
		this.jButtonid_centro_costoAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoAutoriPagoBusqueda.setText("U");
		this.jButtonid_centro_costoAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoAutoriPagoBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoAutoriPagoUpdate= new JButtonMe();
		this.jButtonid_centro_costoAutoriPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoAutoriPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoAutoriPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoAutoriPagoUpdate.setText("U");
		this.jButtonid_centro_costoAutoriPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoAutoriPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoAutoriPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoAutoriPagoUpdate"));


		jButtonid_centro_costoAutoriPagoArbol= new JButtonMe();
		jButtonid_centro_costoAutoriPagoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoAutoriPagoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoAutoriPagoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoAutoriPagoArbol.setText("Arbol");
		jButtonid_centro_costoAutoriPagoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoAutoriPagoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoAutoriPagoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoAutoriPagoArbol"));



					
		this.jLabelid_centro_actividadAutoriPago = new JLabelMe();
		this.jLabelid_centro_actividadAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_IDCENTROACTIVIDAD+" : *");
		this.jLabelid_centro_actividadAutoriPago.setToolTipText("Centro Activad");
		this.jLabelid_centro_actividadAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_actividadAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_actividadAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_actividadAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_actividadAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_actividadAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_IDCENTROACTIVIDAD);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelid_centro_actividadAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jComboBoxid_centro_actividadAutoriPago= new JComboBoxMe();
		jComboBoxid_centro_actividadAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_actividadAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_actividadAutoriPago= new JButtonMe();
		this.jButtonid_centro_actividadAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadAutoriPago.setText("Buscar");
		this.jButtonid_centro_actividadAutoriPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_actividadAutoriPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadAutoriPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_actividadAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadAutoriPago"));

		this.jButtonid_centro_actividadAutoriPagoBusqueda= new JButtonMe();
		this.jButtonid_centro_actividadAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_actividadAutoriPagoBusqueda.setText("U");
		this.jButtonid_centro_actividadAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_actividadAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_actividadAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_actividadAutoriPagoBusqueda.setVisible(false);		}

		this.jButtonid_centro_actividadAutoriPagoUpdate= new JButtonMe();
		this.jButtonid_centro_actividadAutoriPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadAutoriPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadAutoriPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_actividadAutoriPagoUpdate.setText("U");
		this.jButtonid_centro_actividadAutoriPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_actividadAutoriPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadAutoriPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_actividadAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadAutoriPagoUpdate"));



					
		this.jLabelid_bancoAutoriPago = new JLabelMe();
		this.jLabelid_bancoAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_IDBANCO+" : *");
		this.jLabelid_bancoAutoriPago.setToolTipText("Banco");
		this.jLabelid_bancoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bancoAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bancoAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bancoAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelid_bancoAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jComboBoxid_bancoAutoriPago= new JComboBoxMe();
		jComboBoxid_bancoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bancoAutoriPago= new JButtonMe();
		this.jButtonid_bancoAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoAutoriPago.setText("Buscar");
		this.jButtonid_bancoAutoriPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bancoAutoriPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoAutoriPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bancoAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoAutoriPago"));

		this.jButtonid_bancoAutoriPagoBusqueda= new JButtonMe();
		this.jButtonid_bancoAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoAutoriPagoBusqueda.setText("U");
		this.jButtonid_bancoAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bancoAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bancoAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bancoAutoriPagoBusqueda.setVisible(false);		}

		this.jButtonid_bancoAutoriPagoUpdate= new JButtonMe();
		this.jButtonid_bancoAutoriPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoAutoriPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoAutoriPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoAutoriPagoUpdate.setText("U");
		this.jButtonid_bancoAutoriPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bancoAutoriPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoAutoriPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bancoAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoAutoriPagoUpdate"));



					
		this.jLabelid_cuenta_bancoAutoriPago = new JLabelMe();
		this.jLabelid_cuenta_bancoAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_IDCUENTABANCO+" : *");
		this.jLabelid_cuenta_bancoAutoriPago.setToolTipText("Cuenta Banco");
		this.jLabelid_cuenta_bancoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_bancoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_bancoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_bancoAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_bancoAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_bancoAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_IDCUENTABANCO);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelid_cuenta_bancoAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jComboBoxid_cuenta_bancoAutoriPago= new JComboBoxMe();
		jComboBoxid_cuenta_bancoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_bancoAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_bancoAutoriPago= new JButtonMe();
		this.jButtonid_cuenta_bancoAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoAutoriPago.setText("Buscar");
		this.jButtonid_cuenta_bancoAutoriPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_bancoAutoriPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoAutoriPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_bancoAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoAutoriPago"));

		this.jButtonid_cuenta_bancoAutoriPagoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_bancoAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_bancoAutoriPagoBusqueda.setText("U");
		this.jButtonid_cuenta_bancoAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_bancoAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_bancoAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_bancoAutoriPagoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_bancoAutoriPagoUpdate= new JButtonMe();
		this.jButtonid_cuenta_bancoAutoriPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoAutoriPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoAutoriPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_bancoAutoriPagoUpdate.setText("U");
		this.jButtonid_cuenta_bancoAutoriPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_bancoAutoriPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoAutoriPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_bancoAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoAutoriPagoUpdate"));



					
		this.jLabelid_detalle_proveAutoriPago = new JLabelMe();
		this.jLabelid_detalle_proveAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_IDDETALLEPROVE+" : *");
		this.jLabelid_detalle_proveAutoriPago.setToolTipText("Detalle Prove");
		this.jLabelid_detalle_proveAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_detalle_proveAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_detalle_proveAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_proveAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_proveAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_proveAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_IDDETALLEPROVE);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelid_detalle_proveAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jComboBoxid_detalle_proveAutoriPago= new JComboBoxMe();
		jComboBoxid_detalle_proveAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_proveAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_proveAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_proveAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_proveAutoriPago= new JButtonMe();
		this.jButtonid_detalle_proveAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_proveAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_proveAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_proveAutoriPago.setText("Buscar");
		this.jButtonid_detalle_proveAutoriPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_proveAutoriPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_proveAutoriPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_proveAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_proveAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_proveAutoriPago"));

		this.jButtonid_detalle_proveAutoriPagoBusqueda= new JButtonMe();
		this.jButtonid_detalle_proveAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_proveAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_proveAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_proveAutoriPagoBusqueda.setText("U");
		this.jButtonid_detalle_proveAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_proveAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_proveAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_proveAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_proveAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_proveAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_proveAutoriPagoBusqueda.setVisible(false);		}

		this.jButtonid_detalle_proveAutoriPagoUpdate= new JButtonMe();
		this.jButtonid_detalle_proveAutoriPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_proveAutoriPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_proveAutoriPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_proveAutoriPagoUpdate.setText("U");
		this.jButtonid_detalle_proveAutoriPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_proveAutoriPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_proveAutoriPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_proveAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_proveAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_proveAutoriPagoUpdate"));



					
		this.jLabelid_transaccionAutoriPago = new JLabelMe();
		this.jLabelid_transaccionAutoriPago.setText(""+AutoriPagoConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionAutoriPago.setToolTipText("Transaccion");
		this.jLabelid_transaccionAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionAutoriPago.setToolTipText(AutoriPagoConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutAutoriPago = new GridBagLayout();
		this.jPanelid_transaccionAutoriPago.setLayout(this.gridaBagLayoutAutoriPago);


		jComboBoxid_transaccionAutoriPago= new JComboBoxMe();
		jComboBoxid_transaccionAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionAutoriPago= new JButtonMe();
		this.jButtonid_transaccionAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionAutoriPago.setText("Buscar");
		this.jButtonid_transaccionAutoriPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionAutoriPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionAutoriPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionAutoriPago"));

		this.jButtonid_transaccionAutoriPagoBusqueda= new JButtonMe();
		this.jButtonid_transaccionAutoriPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAutoriPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAutoriPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionAutoriPagoBusqueda.setText("U");
		this.jButtonid_transaccionAutoriPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionAutoriPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionAutoriPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionAutoriPagoBusqueda"));

		if(this.autoripagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionAutoriPagoBusqueda.setVisible(false);		}

		this.jButtonid_transaccionAutoriPagoUpdate= new JButtonMe();
		this.jButtonid_transaccionAutoriPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAutoriPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAutoriPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionAutoriPagoUpdate.setText("U");
		this.jButtonid_transaccionAutoriPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionAutoriPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionAutoriPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionAutoriPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionAutoriPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionAutoriPagoUpdate"));



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
		//this.jInternalFrameDetalleAutoriPago = new AutoriPagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Autori Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAutoriPago= new GridBagLayout();
		

		
		String sToolTipAutoriPago="";
		sToolTipAutoriPago=AutoriPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAutoriPago+="(Tesoreria.AutoriPago)";
		}
		
		if(!this.autoripagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipAutoriPago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAutoriPago = new JButtonMe();
		this.jButtonModificarAutoriPago = new JButtonMe();
        this.jButtonActualizarAutoriPago = new JButtonMe();
        this.jButtonEliminarAutoriPago = new JButtonMe();
        this.jButtonCancelarAutoriPago = new JButtonMe();
        this.jButtonGuardarCambiosAutoriPago = new JButtonMe();
		this.jButtonGuardarCambiosTablaAutoriPago = new JButtonMe();
		this.jButtonCerrarAutoriPago = new JButtonMe();
		
		this.jScrollPanelDatosAutoriPago = new JScrollPane();   
        this.jScrollPanelDatosEdicionAutoriPago = new JScrollPane();
		this.jScrollPanelDatosGeneralAutoriPago = new JScrollPane();
				
		
		
		this.jPanelCamposAutoriPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAutoriPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAutoriPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAutoriPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Autori Pago";
		
		if(!this.autoripagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosAutoriPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAutoriPago.setName("jPanelCamposAutoriPago"); 

		this.jPanelCamposOcultosAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAutoriPago.setName("jPanelCamposOcultosAutoriPago"); 

        this.jPanelAccionesAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAutoriPago.setToolTipText("Acciones");
        this.jPanelAccionesAutoriPago.setName("Acciones"); 

		this.jPanelAccionesFormularioAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAutoriPago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAutoriPago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAutoriPago.setText("Nuevo");
		this.jButtonModificarAutoriPago.setText("Editar");
        this.jButtonActualizarAutoriPago.setText("Actualizar");
        this.jButtonEliminarAutoriPago.setText("Eliminar");
        this.jButtonCancelarAutoriPago.setText("Cancelar");
        this.jButtonGuardarCambiosAutoriPago.setText("Guardar");
		this.jButtonGuardarCambiosTablaAutoriPago.setText("Guardar");
		this.jButtonCerrarAutoriPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAutoriPago,"nuevo_button","Nuevo",this.autoripagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAutoriPago,"modificar_button","Editar",this.autoripagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAutoriPago,"actualizar_button","Actualizar",this.autoripagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAutoriPago,"eliminar_button","Eliminar",this.autoripagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAutoriPago,"cancelar_button","Cancelar",this.autoripagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAutoriPago,"guardarcambios_button","Guardar",this.autoripagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAutoriPago,"guardarcambiostabla_button","Guardar",this.autoripagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAutoriPago,"cerrar_button","Salir",this.autoripagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAutoriPago.setToolTipText("Nuevo"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAutoriPago.setToolTipText("Editar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAutoriPago.setToolTipText("Actualizar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAutoriPago.setToolTipText("Eliminar)"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAutoriPago.setToolTipText("Cancelar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAutoriPago.setToolTipText("Guardar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAutoriPago.setToolTipText("Guardar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAutoriPago.setToolTipText("Salir"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAutoriPago";
		inputMap = this.jButtonNuevoAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAutoriPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAutoriPago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAutoriPago";
		inputMap = this.jButtonActualizarAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAutoriPago"));
		
		//ELIMINAR
		sMapKey = "EliminarAutoriPago";
		inputMap = this.jButtonEliminarAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAutoriPago"));
		
		//CANCELAR	
		sMapKey = "CancelarAutoriPago";
		inputMap = this.jButtonCancelarAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAutoriPago"));
		
		//CERRAR		
		sMapKey = "CerrarAutoriPago";
		inputMap = this.jButtonCerrarAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAutoriPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAutoriPago";
		inputMap = this.jButtonGuardarCambiosTablaAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAutoriPago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAutoriPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAutoriPago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAutoriPago.setToolTipText("Nuevo AutoriPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAutoriPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAutoriPago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAutoriPago.setToolTipText("Sin Cerrar Ventana AutoriPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAutoriPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAutoriPago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAutoriPago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAutoriPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAutoriPago.setText("Accion");
		this.jComboBoxTiposAccionesAutoriPago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAutoriPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAutoriPago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAutoriPago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAutoriPago = new JLabelMe();
		
		this.jLabelAccionesAutoriPago.setText("Acciones");		
		this.jLabelAccionesAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAutoriPago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAutoriPago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAutoriPago=new JTabbedPane();
		this.jTabbedPaneRelacionesAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAutoriPago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAutoriPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAutoriPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAutoriPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAutoriPago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAutoriPago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAutoriPago = new GridBagLayout();
		
		this.jPanelCamposAutoriPago.setLayout(gridaBagLayoutCamposAutoriPago);
		this.jPanelCamposOcultosAutoriPago.setLayout(gridaBagLayoutCamposOcultosAutoriPago);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAutoriPago.add(jLabelIdAutoriPago, this.gridBagConstraintsAutoriPago);



	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAutoriPago.add(jLabelidAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAutoriPago.add(jLabelid_empresaAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAutoriPago.add(jButtonid_empresaAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 3;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAutoriPago.add(jButtonid_empresaAutoriPagoUpdate, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAutoriPago.add(jComboBoxid_empresaAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalAutoriPago.add(jLabelid_sucursalAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAutoriPago.add(jButtonid_sucursalAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 3;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAutoriPago.add(jButtonid_sucursalAutoriPagoUpdate, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalAutoriPago.add(jComboBoxid_sucursalAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioAutoriPago.add(jLabelid_ejercicioAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioAutoriPago.add(jButtonid_ejercicioAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 3;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioAutoriPago.add(jButtonid_ejercicioAutoriPagoUpdate, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioAutoriPago.add(jComboBoxid_ejercicioAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteAutoriPago.add(jLabelid_clienteAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 2;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteAutoriPago.add(jButtonid_clienteAutoriPago, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 3;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteAutoriPago.add(jButtonid_clienteAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 4;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteAutoriPago.add(jButtonid_clienteAutoriPagoUpdate, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteAutoriPago.add(jComboBoxid_clienteAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaAutoriPago.add(jLabelid_facturaAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 2;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaAutoriPago.add(jButtonid_facturaAutoriPago, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 3;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaAutoriPago.add(jButtonid_facturaAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 4;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaAutoriPago.add(jButtonid_facturaAutoriPagoUpdate, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaAutoriPago.add(jComboBoxid_facturaAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableAutoriPago.add(jLabelid_asiento_contableAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 2;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableAutoriPago.add(jButtonid_asiento_contableAutoriPago, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 3;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableAutoriPago.add(jButtonid_asiento_contableAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 4;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableAutoriPago.add(jButtonid_asiento_contableAutoriPagoUpdate, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableAutoriPago.add(jComboBoxid_asiento_contableAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoAutoriPago.add(jLabelid_centro_costoAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoAutoriPago.add(jButtonid_centro_costoAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 3;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoAutoriPago.add(jButtonid_centro_costoAutoriPagoUpdate, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoAutoriPago.add(jComboBoxid_centro_costoAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_actividadAutoriPago.add(jLabelid_centro_actividadAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_actividadAutoriPago.add(jButtonid_centro_actividadAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 3;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_actividadAutoriPago.add(jButtonid_centro_actividadAutoriPagoUpdate, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_actividadAutoriPago.add(jComboBoxid_centro_actividadAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bancoAutoriPago.add(jLabelid_bancoAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoAutoriPago.add(jButtonid_bancoAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 3;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoAutoriPago.add(jButtonid_bancoAutoriPagoUpdate, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bancoAutoriPago.add(jComboBoxid_bancoAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_bancoAutoriPago.add(jLabelid_cuenta_bancoAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_bancoAutoriPago.add(jButtonid_cuenta_bancoAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 3;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_bancoAutoriPago.add(jButtonid_cuenta_bancoAutoriPagoUpdate, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_bancoAutoriPago.add(jComboBoxid_cuenta_bancoAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_proveAutoriPago.add(jLabelid_detalle_proveAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_proveAutoriPago.add(jButtonid_detalle_proveAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 3;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_proveAutoriPago.add(jButtonid_detalle_proveAutoriPagoUpdate, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_proveAutoriPago.add(jComboBoxid_detalle_proveAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionAutoriPago.add(jLabelid_transaccionAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionAutoriPago.add(jButtonid_transaccionAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 3;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionAutoriPago.add(jButtonid_transaccionAutoriPagoUpdate, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionAutoriPago.add(jComboBoxid_transaccionAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionAutoriPago.add(jLabelfecha_emisionAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionAutoriPago.add(jButtonfecha_emisionAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionAutoriPago.add(jDateChooserfecha_emisionAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoAutoriPago.add(jLabelfecha_vencimientoAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoAutoriPago.add(jButtonfecha_vencimientoAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoAutoriPago.add(jDateChooserfecha_vencimientoAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_pagoAutoriPago.add(jLabelvalor_pagoAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_pagoAutoriPago.add(jButtonvalor_pagoAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_pagoAutoriPago.add(jTextFieldvalor_pagoAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_canceladoAutoriPago.add(jLabelvalor_canceladoAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_canceladoAutoriPago.add(jButtonvalor_canceladoAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_canceladoAutoriPago.add(jTextFieldvalor_canceladoAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaAutoriPago.add(jLabelnumero_facturaAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaAutoriPago.add(jButtonnumero_facturaAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaAutoriPago.add(jTextFieldnumero_facturaAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalle_facturaAutoriPago.add(jLabeldetalle_facturaAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalle_facturaAutoriPago.add(jButtondetalle_facturaAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalle_facturaAutoriPago.add(jscrollPanedetalle_facturaAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_corteAutoriPago.add(jLabelfecha_corteAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_corteAutoriPago.add(jButtonfecha_corteAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_corteAutoriPago.add(jDateChooserfecha_corteAutoriPago, this.gridBagConstraintsAutoriPago);


	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 0;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionAutoriPago.add(jLabeldescripcionAutoriPago, this.gridBagConstraintsAutoriPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 2;
		this.gridBagConstraintsAutoriPago.ipadx = 0;
		this.gridBagConstraintsAutoriPago.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionAutoriPago.add(jButtondescripcionAutoriPagoBusqueda, this.gridBagConstraintsAutoriPago);
	}

	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriPago.gridy = 0;
	this.gridBagConstraintsAutoriPago.gridx = 1;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionAutoriPago.add(jscrollPanedescripcionAutoriPago, this.gridBagConstraintsAutoriPago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelidAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelid_clienteAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelid_facturaAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelid_asiento_contableAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelid_centro_costoAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelid_centro_actividadAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelid_bancoAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelid_cuenta_bancoAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelid_detalle_proveAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelid_transaccionAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelfecha_emisionAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelfecha_vencimientoAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelvalor_pagoAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelvalor_canceladoAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelnumero_facturaAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPaneldetalle_facturaAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPanelfecha_corteAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriPago.add(this.jPaneldescripcionAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposAutoriPago % 2==0) {
		iXPanelCamposAutoriPago=0;
		iYPanelCamposAutoriPago++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposOcultosAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposOcultosAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutoriPago.add(this.jPanelid_empresaAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposOcultosAutoriPago % 2==0) {
		iXPanelCamposOcultosAutoriPago=0;
		iYPanelCamposOcultosAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposOcultosAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposOcultosAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutoriPago.add(this.jPanelid_sucursalAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposOcultosAutoriPago % 2==0) {
		iXPanelCamposOcultosAutoriPago=0;
		iYPanelCamposOcultosAutoriPago++;
	}
	this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriPago.gridy = iYPanelCamposOcultosAutoriPago;
	this.gridBagConstraintsAutoriPago.gridx = iXPanelCamposOcultosAutoriPago++;
	this.gridBagConstraintsAutoriPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutoriPago.add(this.jPanelid_ejercicioAutoriPago, this.gridBagConstraintsAutoriPago);



	if(iXPanelCamposOcultosAutoriPago % 2==0) {
		iXPanelCamposOcultosAutoriPago=0;
		iYPanelCamposOcultosAutoriPago++;
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
			
		GridBagLayout gridaBagLayoutAccionesAutoriPago= new GridBagLayout();
		this.jPanelAccionesAutoriPago.setLayout(gridaBagLayoutAccionesAutoriPago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAutoriPago= new GridBagLayout();
		this.jPanelAccionesFormularioAutoriPago.setLayout(gridaBagLayoutAccionesFormularioAutoriPago);
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAutoriPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAutoriPago.add(this.jComboBoxTiposAccionesFormularioAutoriPago, this.gridBagConstraintsAutoriPago);

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAutoriPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAutoriPago.add(this.jCheckBoxPostAccionNuevoAutoriPago, this.gridBagConstraintsAutoriPago);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.autoripagoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAutoriPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAutoriPago.add(this.jCheckBoxPostAccionSinCerrarAutoriPago, this.gridBagConstraintsAutoriPago);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.autoripagoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.autoripagoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAutoriPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAutoriPago.add(this.jCheckBoxPostAccionSinMensajeAutoriPago, this.gridBagConstraintsAutoriPago);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = iPosXAccion++;
			
		this.jPanelAccionesAutoriPago.add(this.jButtonModificarAutoriPago, this.gridBagConstraintsAutoriPago);							

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx =iPosXAccion++;
			
		this.jPanelAccionesAutoriPago.add(this.jButtonEliminarAutoriPago, this.gridBagConstraintsAutoriPago);
		
			
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy = 0;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesAutoriPago.add(this.jButtonActualizarAutoriPago, this.gridBagConstraintsAutoriPago);


		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy = 0;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesAutoriPago.add(this.jButtonGuardarCambiosAutoriPago, this.gridBagConstraintsAutoriPago);	
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy = 0;		
		this.gridBagConstraintsAutoriPago.gridx =iPosXAccion++;
		
		this.jPanelAccionesAutoriPago.add(this.jButtonCancelarAutoriPago, this.gridBagConstraintsAutoriPago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAutoriPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAutoriPago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.autoripagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();						
			this.gridBagConstraintsAutoriPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutoriPago.gridx = 0;		
			//this.gridBagConstraintsAutoriPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAutoriPago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAutoriPago.gridx =0;
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAutoriPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAutoriPago, this.gridBagConstraintsAutoriPago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AutoriPagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAutoriPago = new AutoriPagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Autori Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Autori Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Autori Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AutoriPagoModel autoripagoModel=new AutoriPagoModel(this);
			
			//SI USARA CLASE INTERNA
			//AutoriPagoModel.AutoriPagoFocusTraversalPolicy autoripagoFocusTraversalPolicy = autoripagoModel.new AutoriPagoFocusTraversalPolicy(this);
			
			//autoripagoFocusTraversalPolicy.setautoripagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(autoripagoModel);
			
			
			this.jContentPaneDetalleAutoriPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAutoriPago = new GridBagLayout();	
			this.jContentPaneDetalleAutoriPago.setLayout(gridaBagLayoutDetalleAutoriPago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAutoriPago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAutoriPago = new GridBagConstraints();
				this.gridBagConstraintsAutoriPago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAutoriPago.gridx = 0;
					
				
				this.jContentPaneDetalleAutoriPago.add(jTtoolBarDetalleAutoriPago, gridBagConstraintsAutoriPago);								
				
}
			
			this.jScrollPanelDatosEdicionAutoriPago=   new JScrollPane(jContentPaneDetalleAutoriPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAutoriPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAutoriPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAutoriPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAutoriPago.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAutoriPago.gridx = 0;
	        
			this.jContentPaneDetalleAutoriPago.add(jPanelCamposAutoriPago, gridBagConstraintsAutoriPago);
			
			
			
			
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
						&& autoripagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.autoripagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAutoriPago= new GridBagConstraints();
						this.gridBagConstraintsAutoriPago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAutoriPago.gridx = 0;
						this.jContentPaneDetalleAutoriPago.add(this.jTabbedPaneRelacionesAutoriPago, this.gridBagConstraintsAutoriPago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAutoriPago.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAutoriPago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAutoriPago = new GridBagConstraints();
					this.gridBagConstraintsAutoriPago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAutoriPago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAutoriPago.gridx = 0;
					
				
					this.jContentPaneDetalleAutoriPago.add(jPanelCamposOcultosAutoriPago, gridBagConstraintsAutoriPago);
				
					this.jPanelCamposOcultosAutoriPago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAutoriPago.gridx = 0;
	        this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAutoriPago.add(this.jPanelAccionesFormularioAutoriPago, this.gridBagConstraintsAutoriPago);							
			
			
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
	        this.gridBagConstraintsAutoriPago.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAutoriPago.gridx = 0;
	        
			
			this.jContentPaneDetalleAutoriPago.add(this.jPanelAccionesAutoriPago, this.gridBagConstraintsAutoriPago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAutoriPago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAutoriPago=   new JScrollPane(this.jPanelCamposAutoriPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAutoriPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAutoriPago.gridx = 0;
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAutoriPago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAutoriPago, this.gridBagConstraintsAutoriPago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAutoriPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAutoriPago, this.gridBagConstraintsAutoriPago);			
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAutoriPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAutoriPago, this.gridBagConstraintsAutoriPago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAutoriPago, this.gridBagConstraintsAutoriPago);
			
			
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAutoriPago, this.gridBagConstraintsAutoriPago);
		
			
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAutoriPago, this.gridBagConstraintsAutoriPago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAutoriPago;//jContentPane;
		
		return jScrollPanelDatosEdicionAutoriPago;
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
