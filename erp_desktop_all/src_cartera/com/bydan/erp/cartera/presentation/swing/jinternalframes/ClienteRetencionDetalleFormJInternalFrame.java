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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.ClienteRetencionConstantesFunciones;

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
public class ClienteRetencionDetalleFormJInternalFrame extends ClienteRetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleClienteRetencion;
	
	protected JMenuBar jmenuBarDetalleClienteRetencion;
	
	protected JMenu jmenuDetalleClienteRetencion;
	protected JMenu jmenuDetalleArchivoClienteRetencion;
	protected JMenu jmenuDetalleAccionesClienteRetencion;
	protected JMenu jmenuDetalleDatosClienteRetencion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleClienteRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutClienteRetencion;	
	protected GridBagConstraints gridBagConstraintsClienteRetencion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ClienteRetencionBeanSwingJInternalFrameAdditional jInternalFrameDetalleClienteRetencion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableclienteretencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableclienteretencion="";

	protected EstadoRetencionBeanSwingJInternalFrame estadoretencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoretencion="";
	
	public ClienteRetencionSessionBean clienteretencionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public CuentaContableSessionBean cuentacontableclienteretencionSessionBean;
	public EstadoRetencionSessionBean estadoretencionSessionBean;	
	
	public ClienteRetencionLogic clienteretencionLogic;
	
	public JScrollPane jScrollPanelDatosClienteRetencion;
	public JScrollPane jScrollPanelDatosEdicionClienteRetencion;
	public JScrollPane jScrollPanelDatosGeneralClienteRetencion;
	
	protected JPanel jPanelCamposClienteRetencion;    
	protected JPanel jPanelCamposOcultosClienteRetencion;    	
	protected JPanel jPanelAccionesClienteRetencion;
	protected JPanel jPanelAccionesFormularioClienteRetencion;
    
	
	
	protected Integer iXPanelCamposClienteRetencion=0;
	protected Integer iYPanelCamposClienteRetencion=0;
	
	protected Integer iXPanelCamposOcultosClienteRetencion=0;
	protected Integer iYPanelCamposOcultosClienteRetencion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoClienteRetencion;
	public JButton jButtonModificarClienteRetencion;
	public JButton jButtonActualizarClienteRetencion;
    public JButton jButtonEliminarClienteRetencion;
	public JButton jButtonCancelarClienteRetencion;
    public JButton jButtonGuardarCambiosClienteRetencion;
	public JButton jButtonGuardarCambiosTablaClienteRetencion;
	protected JButton jButtonCerrarClienteRetencion;
	
	
	protected JButton jButtonProcesarInformacionClienteRetencion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoClienteRetencion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarClienteRetencion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeClienteRetencion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarClienteRetencion;
	protected JButton jButtonModificarToolBarClienteRetencion;
	protected JButton jButtonActualizarToolBarClienteRetencion;
    protected JButton jButtonEliminarToolBarClienteRetencion;
	protected JButton jButtonCancelarToolBarClienteRetencion;
    protected JButton jButtonGuardarCambiosToolBarClienteRetencion;
	protected JButton jButtonGuardarCambiosTablaToolBarClienteRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarClienteRetencion;
	protected JButton jButtonCerrarToolBarClienteRetencion;
	
	protected JButton jButtonProcesarInformacionToolBarClienteRetencion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoClienteRetencion;
	protected JMenuItem jMenuItemModificarClienteRetencion;
	protected JMenuItem jMenuItemActualizarClienteRetencion;
    protected JMenuItem jMenuItemEliminarClienteRetencion;
	protected JMenuItem jMenuItemCancelarClienteRetencion;
    protected JMenuItem jMenuItemGuardarCambiosClienteRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaClienteRetencion;
	protected JMenuItem jMenuItemCerrarClienteRetencion;
	protected JMenuItem jMenuItemDetalleCerrarClienteRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarClienteRetencion;
	
	protected JMenuItem jMenuItemProcesarInformacionClienteRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosClienteRetencion;
	protected JMenuItem jMenuItemMostrarOcultarClienteRetencion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesClienteRetencion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesClienteRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesClienteRetencion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioClienteRetencion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidClienteRetencion;
	public JLabel jLabelIdClienteRetencion;
	public JLabel jLabelidClienteRetencion;
	public JButton jButtonidClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelfechaClienteRetencion;
	public JLabel jLabelfechaClienteRetencion;
	//public JFormattedTextField jDateChooserfechaClienteRetencion;

	public JDateChooser jDateChooserfechaClienteRetencion;
	public JButton jButtonfechaClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeClienteRetencion;
	public JLabel jLabelporcentajeClienteRetencion;
	public JTextField jTextFieldporcentajeClienteRetencion;
	public JButton jButtonporcentajeClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelbase_imponibleClienteRetencion;
	public JLabel jLabelbase_imponibleClienteRetencion;
	public JTextField jTextFieldbase_imponibleClienteRetencion;
	public JButton jButtonbase_imponibleClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelvalorClienteRetencion;
	public JLabel jLabelvalorClienteRetencion;
	public JTextField jTextFieldvalorClienteRetencion;
	public JButton jButtonvalorClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencionClienteRetencion;
	public JLabel jLabelnumero_retencionClienteRetencion;
	public JTextField jTextFieldnumero_retencionClienteRetencion;
	public JButton jButtonnumero_retencionClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionClienteRetencion;
	public JLabel jLabeldescripcionClienteRetencion;
	public JTextArea jTextAreadescripcionClienteRetencion;
	public JScrollPane jscrollPanedescripcionClienteRetencion;
	public JButton jButtondescripcionClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelvalor_tipo_cambioClienteRetencion;
	public JLabel jLabelvalor_tipo_cambioClienteRetencion;
	public JTextField jTextFieldvalor_tipo_cambioClienteRetencion;
	public JButton jButtonvalor_tipo_cambioClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localClienteRetencion;
	public JLabel jLabeldebito_mone_localClienteRetencion;
	public JTextField jTextFielddebito_mone_localClienteRetencion;
	public JButton jButtondebito_mone_localClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localClienteRetencion;
	public JLabel jLabelcredito_mone_localClienteRetencion;
	public JTextField jTextFieldcredito_mone_localClienteRetencion;
	public JButton jButtoncredito_mone_localClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_extraClienteRetencion;
	public JLabel jLabeldebito_mone_extraClienteRetencion;
	public JTextField jTextFielddebito_mone_extraClienteRetencion;
	public JButton jButtondebito_mone_extraClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_extraClienteRetencion;
	public JLabel jLabelcredito_mone_extraClienteRetencion;
	public JTextField jTextFieldcredito_mone_extraClienteRetencion;
	public JButton jButtoncredito_mone_extraClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioClienteRetencion;
	public JLabel jLabelbeneficiarioClienteRetencion;
	public JTextArea jTextAreabeneficiarioClienteRetencion;
	public JScrollPane jscrollPanebeneficiarioClienteRetencion;
	public JButton jButtonbeneficiarioClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelnombre_benefClienteRetencion;
	public JLabel jLabelnombre_benefClienteRetencion;
	public JTextArea jTextAreanombre_benefClienteRetencion;
	public JScrollPane jscrollPanenombre_benefClienteRetencion;
	public JButton jButtonnombre_benefClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_benefClienteRetencion;
	public JLabel jLabeldireccion_benefClienteRetencion;
	public JTextArea jTextAreadireccion_benefClienteRetencion;
	public JScrollPane jscrollPanedireccion_benefClienteRetencion;
	public JButton jButtondireccion_benefClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_benefClienteRetencion;
	public JLabel jLabeltelefono_benefClienteRetencion;
	public JTextArea jTextAreatelefono_benefClienteRetencion;
	public JScrollPane jscrollPanetelefono_benefClienteRetencion;
	public JButton jButtontelefono_benefClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelruc_benefClienteRetencion;
	public JLabel jLabelruc_benefClienteRetencion;
	public JTextField jTextFieldruc_benefClienteRetencion;
	public JButton jButtonruc_benefClienteRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaClienteRetencion;
	public JLabel jLabelid_empresaClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaClienteRetencion;
	public JButton jButtonid_empresaClienteRetencion= new JButtonMe();
	public JButton jButtonid_empresaClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_empresaClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalClienteRetencion;
	public JLabel jLabelid_sucursalClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalClienteRetencion;
	public JButton jButtonid_sucursalClienteRetencion= new JButtonMe();
	public JButton jButtonid_sucursalClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioClienteRetencion;
	public JLabel jLabelid_ejercicioClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioClienteRetencion;
	public JButton jButtonid_ejercicioClienteRetencion= new JButtonMe();
	public JButton jButtonid_ejercicioClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoClienteRetencion;
	public JLabel jLabelid_periodoClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoClienteRetencion;
	public JButton jButtonid_periodoClienteRetencion= new JButtonMe();
	public JButton jButtonid_periodoClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_periodoClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_anioClienteRetencion;
	public JLabel jLabelid_anioClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioClienteRetencion;
	public JButton jButtonid_anioClienteRetencion= new JButtonMe();
	public JButton jButtonid_anioClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_anioClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_mesClienteRetencion;
	public JLabel jLabelid_mesClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesClienteRetencion;
	public JButton jButtonid_mesClienteRetencion= new JButtonMe();
	public JButton jButtonid_mesClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_mesClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteClienteRetencion;
	public JLabel jLabelid_clienteClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteClienteRetencion;
	public JButton jButtonid_clienteClienteRetencion= new JButtonMe();
	public JButton jButtonid_clienteClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_clienteClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaClienteRetencion;
	public JLabel jLabelid_facturaClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaClienteRetencion;
	public JButton jButtonid_facturaClienteRetencion= new JButtonMe();
	public JButton jButtonid_facturaClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_facturaClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionClienteRetencion;
	public JLabel jLabelid_transaccionClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionClienteRetencion;
	public JButton jButtonid_transaccionClienteRetencion= new JButtonMe();
	public JButton jButtonid_transaccionClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_transaccionClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencionClienteRetencion;
	public JLabel jLabelid_tipo_retencionClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionClienteRetencion;
	public JButton jButtonid_tipo_retencionClienteRetencion= new JButtonMe();
	public JButton jButtonid_tipo_retencionClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableClienteRetencion;
	public JLabel jLabelid_asiento_contableClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableClienteRetencion;
	public JButton jButtonid_asiento_contableClienteRetencion= new JButtonMe();
	public JButton jButtonid_asiento_contableClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableClienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_retencionClienteRetencion;
	public JLabel jLabelid_cuenta_contable_retencionClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_retencionClienteRetencion;
	public JButton jButtonid_cuenta_contable_retencionClienteRetencion= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionClienteRetencionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionClienteRetencionArbol= new JButtonMe();

	public JPanel jPanelid_estado_retencionClienteRetencion;
	public JLabel jLabelid_estado_retencionClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_retencionClienteRetencion;
	public JButton jButtonid_estado_retencionClienteRetencion= new JButtonMe();
	public JButton jButtonid_estado_retencionClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_estado_retencionClienteRetencionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesClienteRetencion;
	
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
	public int iHeightFormulario=440;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ClienteRetencionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposClienteRetencion=new JPanel();
				this.jPanelAccionesFormularioClienteRetencion=new JPanel();
				this.jmenuBarDetalleClienteRetencion=new JMenuBar();
				this.jTtoolBarDetalleClienteRetencion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteRetencionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ClienteRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ClienteRetencionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ClienteRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteRetencionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteRetencionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteRetencionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ClienteRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarClienteRetencion() {
		return this.jButtonActualizarToolBarClienteRetencion;
	}
	
	public JButton getjButtonEliminarToolBarClienteRetencion() {
		return this.jButtonEliminarToolBarClienteRetencion;
	}
	
	public JButton getjButtonCancelarToolBarClienteRetencion() {
		return this.jButtonCancelarToolBarClienteRetencion;
	}		
	
	public JButton getjButtonProcesarInformacionClienteRetencion() {
		return this.jButtonProcesarInformacionClienteRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionClienteRetencion)	{
		this.jButtonProcesarInformacionClienteRetencion = jButtonProcesarInformacionClienteRetencion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesClienteRetencion() {
		return this.jComboBoxTiposAccionesClienteRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesClienteRetencion(
			JComboBox jComboBoxTiposRelacionesClienteRetencion) {
		this.jComboBoxTiposRelacionesClienteRetencion = jComboBoxTiposRelacionesClienteRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesClienteRetencion(
			JComboBox jComboBoxTiposAccionesClienteRetencion) {
		this.jComboBoxTiposAccionesClienteRetencion = jComboBoxTiposAccionesClienteRetencion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioClienteRetencion() {
		return this.jComboBoxTiposAccionesFormularioClienteRetencion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioClienteRetencion(
			JComboBox jComboBoxTiposAccionesFormularioClienteRetencion) {
		this.jComboBoxTiposAccionesFormularioClienteRetencion = jComboBoxTiposAccionesFormularioClienteRetencion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.clienteretencionSessionBean=new ClienteRetencionSessionBean();
		
		this.clienteretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.clienteretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.clienteretencionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ClienteRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ClienteRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ClienteRetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.clienteretencionSessionBean.getEsGuardarRelacionado()) {
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
	
		ClienteRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleClienteRetencion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarClienteRetencion=new JButtonMe();
				this.jButtonModificarToolBarClienteRetencion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarClienteRetencion,this.jTtoolBarDetalleClienteRetencion,
							"actualizar","actualizar","Actualizar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarClienteRetencion,this.jTtoolBarDetalleClienteRetencion,
							"eliminar","eliminar","Eliminar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarClienteRetencion,this.jTtoolBarDetalleClienteRetencion,
							"cancelar","cancelar","Cancelar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarClienteRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarClienteRetencion,this.jTtoolBarDetalleClienteRetencion,
							"guardarcambios","guardarcambios","Guardar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleClienteRetencion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleClienteRetencion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoClienteRetencion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesClienteRetencion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosClienteRetencion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoClienteRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoClienteRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoClienteRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarClienteRetencion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarClienteRetencion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarClienteRetencion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarClienteRetencion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarClienteRetencion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarClienteRetencion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarClienteRetencion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarClienteRetencion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarClienteRetencion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarClienteRetencion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarClienteRetencion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarClienteRetencion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosClienteRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosClienteRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosClienteRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarClienteRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarClienteRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarClienteRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarClienteRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarClienteRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarClienteRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarClienteRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarClienteRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarClienteRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarClienteRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarClienteRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarClienteRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoClienteRetencion.add(this.jMenuItemDetalleCerrarClienteRetencion);
		
		this.jmenuDetalleAccionesClienteRetencion.add(this.jMenuItemActualizarClienteRetencion);
		this.jmenuDetalleAccionesClienteRetencion.add(this.jMenuItemEliminarClienteRetencion);
		this.jmenuDetalleAccionesClienteRetencion.add(this.jMenuItemCancelarClienteRetencion);		
		
		//this.jmenuDetalleDatosClienteRetencion.add(this.jMenuItemDetalleAbrirOrderByClienteRetencion);				
		this.jmenuDetalleDatosClienteRetencion.add(this.jMenuItemDetalleMostarOcultarClienteRetencion);				
				
		//this.jmenuDetalleAccionesClienteRetencion.add(this.jMenuItemGuardarCambiosClienteRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleClienteRetencion.add(this.jmenuDetalleArchivoClienteRetencion);		
		this.jmenuBarDetalleClienteRetencion.add(this.jmenuDetalleAccionesClienteRetencion);		
		this.jmenuBarDetalleClienteRetencion.add(this.jmenuDetalleDatosClienteRetencion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleClienteRetencion);				
	}
	
	
	public void inicializarElementosCamposClienteRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdClienteRetencion = new JLabelMe();
		jLabelIdClienteRetencion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidClienteRetencion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutClienteRetencion= new GridBagLayout();

		this.jPanelidClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);

		jLabelidClienteRetencion = new JLabel();
		jLabelidClienteRetencion.setText("Id");

		jLabelidClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaClienteRetencion = new JLabelMe();
		this.jLabelfechaClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaClienteRetencion.setToolTipText("Fecha");
		this.jLabelfechaClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelfechaClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		//jFormattedTextFieldfechaClienteRetencion= new JFormattedTextFieldMe();

		jDateChooserfechaClienteRetencion= new JDateChooser();
		jDateChooserfechaClienteRetencion.setEnabled(false);
		jDateChooserfechaClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaClienteRetencion.setDate(new Date());
		jDateChooserfechaClienteRetencion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaClienteRetencion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaClienteRetencionBusqueda= new JButtonMe();
		this.jButtonfechaClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaClienteRetencionBusqueda.setText("U");
		this.jButtonfechaClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeClienteRetencion = new JLabelMe();
		this.jLabelporcentajeClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeClienteRetencion.setToolTipText("Porcentaje");
		this.jLabelporcentajeClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelporcentajeClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextFieldporcentajeClienteRetencion= new JTextFieldMe();
		jTextFieldporcentajeClienteRetencion.setEnabled(false);
		jTextFieldporcentajeClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeClienteRetencion.setText("0.0");

		this.jButtonporcentajeClienteRetencionBusqueda= new JButtonMe();
		this.jButtonporcentajeClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeClienteRetencionBusqueda.setText("U");
		this.jButtonporcentajeClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabelbase_imponibleClienteRetencion = new JLabelMe();
		this.jLabelbase_imponibleClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_BASEIMPONIBLE+" : *");
		this.jLabelbase_imponibleClienteRetencion.setToolTipText("Base Imponible");
		this.jLabelbase_imponibleClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_imponibleClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_imponibleClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_imponibleClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_BASEIMPONIBLE);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelbase_imponibleClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextFieldbase_imponibleClienteRetencion= new JTextFieldMe();
		jTextFieldbase_imponibleClienteRetencion.setEnabled(false);
		jTextFieldbase_imponibleClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_imponibleClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_imponibleClienteRetencion.setText("0.0");

		this.jButtonbase_imponibleClienteRetencionBusqueda= new JButtonMe();
		this.jButtonbase_imponibleClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_imponibleClienteRetencionBusqueda.setText("U");
		this.jButtonbase_imponibleClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_imponibleClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_imponibleClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_imponibleClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_imponibleClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_imponibleClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_imponibleClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabelvalorClienteRetencion = new JLabelMe();
		this.jLabelvalorClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorClienteRetencion.setToolTipText("Valor");
		this.jLabelvalorClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelvalorClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextFieldvalorClienteRetencion= new JTextFieldMe();
		jTextFieldvalorClienteRetencion.setEnabled(false);
		jTextFieldvalorClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorClienteRetencion.setText("0.0");

		this.jButtonvalorClienteRetencionBusqueda= new JButtonMe();
		this.jButtonvalorClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorClienteRetencionBusqueda.setText("U");
		this.jButtonvalorClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencionClienteRetencion = new JLabelMe();
		this.jLabelnumero_retencionClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_NUMERORETENCION+" :");
		this.jLabelnumero_retencionClienteRetencion.setToolTipText("No Retencion");
		this.jLabelnumero_retencionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencionClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencionClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencionClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_NUMERORETENCION);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelnumero_retencionClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextFieldnumero_retencionClienteRetencion= new JTextFieldMe();

		jTextFieldnumero_retencionClienteRetencion.setEnabled(false);
		jTextFieldnumero_retencionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencionClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_retencionClienteRetencionBusqueda= new JButtonMe();
		this.jButtonnumero_retencionClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencionClienteRetencionBusqueda.setText("U");
		this.jButtonnumero_retencionClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencionClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencionClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencionClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencionClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionClienteRetencion = new JLabelMe();
		this.jLabeldescripcionClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionClienteRetencion.setToolTipText("Descripcion");
		this.jLabeldescripcionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPaneldescripcionClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextAreadescripcionClienteRetencion= new JTextAreaMe();
		jTextAreadescripcionClienteRetencion.setEnabled(false);
		jTextAreadescripcionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,250),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,250),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,250),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionClienteRetencion.setLineWrap(true);
		jTextAreadescripcionClienteRetencion.setWrapStyleWord(true);
		jTextAreadescripcionClienteRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionClienteRetencion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionClienteRetencion = new JScrollPane(jTextAreadescripcionClienteRetencion);
		jscrollPanedescripcionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,250),70));
		jscrollPanedescripcionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,250),70));
		jscrollPanedescripcionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,250),70));

		this.jButtondescripcionClienteRetencionBusqueda= new JButtonMe();
		this.jButtondescripcionClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionClienteRetencionBusqueda.setText("U");
		this.jButtondescripcionClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabelvalor_tipo_cambioClienteRetencion = new JLabelMe();
		this.jLabelvalor_tipo_cambioClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_VALORTIPOCAMBIO+" : *");
		this.jLabelvalor_tipo_cambioClienteRetencion.setToolTipText("Valor Tipo Cambio");
		this.jLabelvalor_tipo_cambioClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_tipo_cambioClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_tipo_cambioClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_tipo_cambioClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_tipo_cambioClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_tipo_cambioClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_VALORTIPOCAMBIO);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelvalor_tipo_cambioClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextFieldvalor_tipo_cambioClienteRetencion= new JTextFieldMe();
		jTextFieldvalor_tipo_cambioClienteRetencion.setEnabled(false);
		jTextFieldvalor_tipo_cambioClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_tipo_cambioClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_tipo_cambioClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_tipo_cambioClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_tipo_cambioClienteRetencion.setText("0.0");

		this.jButtonvalor_tipo_cambioClienteRetencionBusqueda= new JButtonMe();
		this.jButtonvalor_tipo_cambioClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_tipo_cambioClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_tipo_cambioClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_tipo_cambioClienteRetencionBusqueda.setText("U");
		this.jButtonvalor_tipo_cambioClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_tipo_cambioClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_tipo_cambioClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_tipo_cambioClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_tipo_cambioClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_tipo_cambioClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_tipo_cambioClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_localClienteRetencion = new JLabelMe();
		this.jLabeldebito_mone_localClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localClienteRetencion.setToolTipText("Debito Mone Local");
		this.jLabeldebito_mone_localClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPaneldebito_mone_localClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextFielddebito_mone_localClienteRetencion= new JTextFieldMe();
		jTextFielddebito_mone_localClienteRetencion.setEnabled(false);
		jTextFielddebito_mone_localClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localClienteRetencion.setText("0.0");

		this.jButtondebito_mone_localClienteRetencionBusqueda= new JButtonMe();
		this.jButtondebito_mone_localClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localClienteRetencionBusqueda.setText("U");
		this.jButtondebito_mone_localClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localClienteRetencion = new JLabelMe();
		this.jLabelcredito_mone_localClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localClienteRetencion.setToolTipText("Credito Mone Local");
		this.jLabelcredito_mone_localClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelcredito_mone_localClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextFieldcredito_mone_localClienteRetencion= new JTextFieldMe();
		jTextFieldcredito_mone_localClienteRetencion.setEnabled(false);
		jTextFieldcredito_mone_localClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localClienteRetencion.setText("0.0");

		this.jButtoncredito_mone_localClienteRetencionBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localClienteRetencionBusqueda.setText("U");
		this.jButtoncredito_mone_localClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_extraClienteRetencion = new JLabelMe();
		this.jLabeldebito_mone_extraClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_DEBITOMONEEXTRA+" : *");
		this.jLabeldebito_mone_extraClienteRetencion.setToolTipText("Debito Mone Extra");
		this.jLabeldebito_mone_extraClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_extraClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_extraClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_extraClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_extraClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_extraClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_DEBITOMONEEXTRA);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPaneldebito_mone_extraClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextFielddebito_mone_extraClienteRetencion= new JTextFieldMe();
		jTextFielddebito_mone_extraClienteRetencion.setEnabled(false);
		jTextFielddebito_mone_extraClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_extraClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_extraClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_extraClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_extraClienteRetencion.setText("0.0");

		this.jButtondebito_mone_extraClienteRetencionBusqueda= new JButtonMe();
		this.jButtondebito_mone_extraClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_extraClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_extraClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_extraClienteRetencionBusqueda.setText("U");
		this.jButtondebito_mone_extraClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_extraClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_extraClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_extraClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_extraClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_extraClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_extraClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_extraClienteRetencion = new JLabelMe();
		this.jLabelcredito_mone_extraClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_CREDITOMONEEXTRA+" : *");
		this.jLabelcredito_mone_extraClienteRetencion.setToolTipText("Credito Mone Extra");
		this.jLabelcredito_mone_extraClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_extraClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_extraClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_extraClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_extraClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_extraClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_CREDITOMONEEXTRA);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelcredito_mone_extraClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextFieldcredito_mone_extraClienteRetencion= new JTextFieldMe();
		jTextFieldcredito_mone_extraClienteRetencion.setEnabled(false);
		jTextFieldcredito_mone_extraClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_extraClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_extraClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_extraClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_extraClienteRetencion.setText("0.0");

		this.jButtoncredito_mone_extraClienteRetencionBusqueda= new JButtonMe();
		this.jButtoncredito_mone_extraClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_extraClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_extraClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_extraClienteRetencionBusqueda.setText("U");
		this.jButtoncredito_mone_extraClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_extraClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_extraClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_extraClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_extraClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_extraClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_extraClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioClienteRetencion = new JLabelMe();
		this.jLabelbeneficiarioClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_BENEFICIARIO+" :");
		this.jLabelbeneficiarioClienteRetencion.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelbeneficiarioClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextAreabeneficiarioClienteRetencion= new JTextAreaMe();
		jTextAreabeneficiarioClienteRetencion.setEnabled(false);
		jTextAreabeneficiarioClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioClienteRetencion.setLineWrap(true);
		jTextAreabeneficiarioClienteRetencion.setWrapStyleWord(true);
		jTextAreabeneficiarioClienteRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioClienteRetencion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioClienteRetencion = new JScrollPane(jTextAreabeneficiarioClienteRetencion);
		jscrollPanebeneficiarioClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonbeneficiarioClienteRetencionBusqueda= new JButtonMe();
		this.jButtonbeneficiarioClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioClienteRetencionBusqueda.setText("U");
		this.jButtonbeneficiarioClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabelnombre_benefClienteRetencion = new JLabelMe();
		this.jLabelnombre_benefClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_NOMBREBENEF+" :");
		this.jLabelnombre_benefClienteRetencion.setToolTipText("Nombre Benef");
		this.jLabelnombre_benefClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_benefClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_benefClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_benefClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_benefClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_benefClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_NOMBREBENEF);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelnombre_benefClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextAreanombre_benefClienteRetencion= new JTextAreaMe();
		jTextAreanombre_benefClienteRetencion.setEnabled(false);
		jTextAreanombre_benefClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefClienteRetencion.setLineWrap(true);
		jTextAreanombre_benefClienteRetencion.setWrapStyleWord(true);
		jTextAreanombre_benefClienteRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_benefClienteRetencion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_benefClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_benefClienteRetencion = new JScrollPane(jTextAreanombre_benefClienteRetencion);
		jscrollPanenombre_benefClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_benefClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_benefClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_benefClienteRetencionBusqueda= new JButtonMe();
		this.jButtonnombre_benefClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_benefClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_benefClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_benefClienteRetencionBusqueda.setText("U");
		this.jButtonnombre_benefClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_benefClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_benefClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_benefClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_benefClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_benefClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_benefClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_benefClienteRetencion = new JLabelMe();
		this.jLabeldireccion_benefClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_DIRECCIONBENEF+" :");
		this.jLabeldireccion_benefClienteRetencion.setToolTipText("Direccion Benef");
		this.jLabeldireccion_benefClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_benefClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_benefClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_benefClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_benefClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_benefClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_DIRECCIONBENEF);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPaneldireccion_benefClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextAreadireccion_benefClienteRetencion= new JTextAreaMe();
		jTextAreadireccion_benefClienteRetencion.setEnabled(false);
		jTextAreadireccion_benefClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_benefClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_benefClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_benefClienteRetencion.setLineWrap(true);
		jTextAreadireccion_benefClienteRetencion.setWrapStyleWord(true);
		jTextAreadireccion_benefClienteRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_benefClienteRetencion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_benefClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_benefClienteRetencion = new JScrollPane(jTextAreadireccion_benefClienteRetencion);
		jscrollPanedireccion_benefClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccion_benefClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccion_benefClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccion_benefClienteRetencionBusqueda= new JButtonMe();
		this.jButtondireccion_benefClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_benefClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_benefClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_benefClienteRetencionBusqueda.setText("U");
		this.jButtondireccion_benefClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_benefClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_benefClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_benefClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_benefClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_benefClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_benefClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_benefClienteRetencion = new JLabelMe();
		this.jLabeltelefono_benefClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_TELEFONOBENEF+" :");
		this.jLabeltelefono_benefClienteRetencion.setToolTipText("Telefono Benef");
		this.jLabeltelefono_benefClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefono_benefClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefono_benefClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_benefClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_benefClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_benefClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_TELEFONOBENEF);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPaneltelefono_benefClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextAreatelefono_benefClienteRetencion= new JTextAreaMe();
		jTextAreatelefono_benefClienteRetencion.setEnabled(false);
		jTextAreatelefono_benefClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_benefClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_benefClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_benefClienteRetencion.setLineWrap(true);
		jTextAreatelefono_benefClienteRetencion.setWrapStyleWord(true);
		jTextAreatelefono_benefClienteRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_benefClienteRetencion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_benefClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_benefClienteRetencion = new JScrollPane(jTextAreatelefono_benefClienteRetencion);
		jscrollPanetelefono_benefClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefono_benefClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefono_benefClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontelefono_benefClienteRetencionBusqueda= new JButtonMe();
		this.jButtontelefono_benefClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_benefClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_benefClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_benefClienteRetencionBusqueda.setText("U");
		this.jButtontelefono_benefClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_benefClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_benefClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_benefClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_benefClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_benefClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_benefClienteRetencionBusqueda.setVisible(false);		}


					
		this.jLabelruc_benefClienteRetencion = new JLabelMe();
		this.jLabelruc_benefClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_RUCBENEF+" :");
		this.jLabelruc_benefClienteRetencion.setToolTipText("Ruc Benef");
		this.jLabelruc_benefClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_benefClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_benefClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_benefClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_benefClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_benefClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_RUCBENEF);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelruc_benefClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jTextFieldruc_benefClienteRetencion= new JTextFieldMe();

		jTextFieldruc_benefClienteRetencion.setEnabled(false);
		jTextFieldruc_benefClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_benefClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_benefClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_benefClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_benefClienteRetencionBusqueda= new JButtonMe();
		this.jButtonruc_benefClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_benefClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_benefClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_benefClienteRetencionBusqueda.setText("U");
		this.jButtonruc_benefClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_benefClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_benefClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_benefClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_benefClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_benefClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_benefClienteRetencionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysClienteRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaClienteRetencion = new JLabelMe();
		this.jLabelid_empresaClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaClienteRetencion.setToolTipText("Empresa");
		this.jLabelid_empresaClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelid_empresaClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jComboBoxid_empresaClienteRetencion= new JComboBoxMe();
		jComboBoxid_empresaClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaClienteRetencion.setEnabled(false);

		this.jButtonid_empresaClienteRetencion= new JButtonMe();
		this.jButtonid_empresaClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaClienteRetencion.setText("Buscar");
		this.jButtonid_empresaClienteRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaClienteRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaClienteRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaClienteRetencion"));

		this.jButtonid_empresaClienteRetencionBusqueda= new JButtonMe();
		this.jButtonid_empresaClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaClienteRetencionBusqueda.setText("U");
		this.jButtonid_empresaClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaClienteRetencionBusqueda.setVisible(false);		}

		this.jButtonid_empresaClienteRetencionUpdate= new JButtonMe();
		this.jButtonid_empresaClienteRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClienteRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClienteRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaClienteRetencionUpdate.setText("U");
		this.jButtonid_empresaClienteRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaClienteRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaClienteRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaClienteRetencionUpdate"));



					
		this.jLabelid_sucursalClienteRetencion = new JLabelMe();
		this.jLabelid_sucursalClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalClienteRetencion.setToolTipText("Sucursal");
		this.jLabelid_sucursalClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelid_sucursalClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jComboBoxid_sucursalClienteRetencion= new JComboBoxMe();
		jComboBoxid_sucursalClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalClienteRetencion.setEnabled(false);

		this.jButtonid_sucursalClienteRetencion= new JButtonMe();
		this.jButtonid_sucursalClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalClienteRetencion.setText("Buscar");
		this.jButtonid_sucursalClienteRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalClienteRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalClienteRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalClienteRetencion"));

		this.jButtonid_sucursalClienteRetencionBusqueda= new JButtonMe();
		this.jButtonid_sucursalClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalClienteRetencionBusqueda.setText("U");
		this.jButtonid_sucursalClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalClienteRetencionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalClienteRetencionUpdate= new JButtonMe();
		this.jButtonid_sucursalClienteRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalClienteRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalClienteRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalClienteRetencionUpdate.setText("U");
		this.jButtonid_sucursalClienteRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalClienteRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalClienteRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalClienteRetencionUpdate"));



					
		this.jLabelid_ejercicioClienteRetencion = new JLabelMe();
		this.jLabelid_ejercicioClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioClienteRetencion.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelid_ejercicioClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jComboBoxid_ejercicioClienteRetencion= new JComboBoxMe();
		jComboBoxid_ejercicioClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioClienteRetencion.setEnabled(false);

		this.jButtonid_ejercicioClienteRetencion= new JButtonMe();
		this.jButtonid_ejercicioClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioClienteRetencion.setText("Buscar");
		this.jButtonid_ejercicioClienteRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioClienteRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioClienteRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioClienteRetencion"));

		this.jButtonid_ejercicioClienteRetencionBusqueda= new JButtonMe();
		this.jButtonid_ejercicioClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioClienteRetencionBusqueda.setText("U");
		this.jButtonid_ejercicioClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioClienteRetencionBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioClienteRetencionUpdate= new JButtonMe();
		this.jButtonid_ejercicioClienteRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioClienteRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioClienteRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioClienteRetencionUpdate.setText("U");
		this.jButtonid_ejercicioClienteRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioClienteRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioClienteRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioClienteRetencionUpdate"));



					
		this.jLabelid_periodoClienteRetencion = new JLabelMe();
		this.jLabelid_periodoClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoClienteRetencion.setToolTipText("Periodo");
		this.jLabelid_periodoClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelid_periodoClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jComboBoxid_periodoClienteRetencion= new JComboBoxMe();
		jComboBoxid_periodoClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoClienteRetencion.setEnabled(false);

		this.jButtonid_periodoClienteRetencion= new JButtonMe();
		this.jButtonid_periodoClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoClienteRetencion.setText("Buscar");
		this.jButtonid_periodoClienteRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoClienteRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoClienteRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoClienteRetencion"));

		this.jButtonid_periodoClienteRetencionBusqueda= new JButtonMe();
		this.jButtonid_periodoClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoClienteRetencionBusqueda.setText("U");
		this.jButtonid_periodoClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoClienteRetencionBusqueda.setVisible(false);		}

		this.jButtonid_periodoClienteRetencionUpdate= new JButtonMe();
		this.jButtonid_periodoClienteRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoClienteRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoClienteRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoClienteRetencionUpdate.setText("U");
		this.jButtonid_periodoClienteRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoClienteRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoClienteRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoClienteRetencionUpdate"));



					
		this.jLabelid_anioClienteRetencion = new JLabelMe();
		this.jLabelid_anioClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioClienteRetencion.setToolTipText("Anio");
		this.jLabelid_anioClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelid_anioClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jComboBoxid_anioClienteRetencion= new JComboBoxMe();
		jComboBoxid_anioClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioClienteRetencion.setEnabled(false);

		this.jButtonid_anioClienteRetencion= new JButtonMe();
		this.jButtonid_anioClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioClienteRetencion.setText("Buscar");
		this.jButtonid_anioClienteRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioClienteRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioClienteRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioClienteRetencion"));

		this.jButtonid_anioClienteRetencionBusqueda= new JButtonMe();
		this.jButtonid_anioClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioClienteRetencionBusqueda.setText("U");
		this.jButtonid_anioClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioClienteRetencionBusqueda.setVisible(false);		}

		this.jButtonid_anioClienteRetencionUpdate= new JButtonMe();
		this.jButtonid_anioClienteRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioClienteRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioClienteRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioClienteRetencionUpdate.setText("U");
		this.jButtonid_anioClienteRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioClienteRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioClienteRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioClienteRetencionUpdate"));



					
		this.jLabelid_mesClienteRetencion = new JLabelMe();
		this.jLabelid_mesClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesClienteRetencion.setToolTipText("Mes");
		this.jLabelid_mesClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelid_mesClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jComboBoxid_mesClienteRetencion= new JComboBoxMe();
		jComboBoxid_mesClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesClienteRetencion.setEnabled(false);

		this.jButtonid_mesClienteRetencion= new JButtonMe();
		this.jButtonid_mesClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesClienteRetencion.setText("Buscar");
		this.jButtonid_mesClienteRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesClienteRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesClienteRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesClienteRetencion"));

		this.jButtonid_mesClienteRetencionBusqueda= new JButtonMe();
		this.jButtonid_mesClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesClienteRetencionBusqueda.setText("U");
		this.jButtonid_mesClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesClienteRetencionBusqueda.setVisible(false);		}

		this.jButtonid_mesClienteRetencionUpdate= new JButtonMe();
		this.jButtonid_mesClienteRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesClienteRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesClienteRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesClienteRetencionUpdate.setText("U");
		this.jButtonid_mesClienteRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesClienteRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesClienteRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesClienteRetencionUpdate"));



					
		this.jLabelid_clienteClienteRetencion = new JLabelMe();
		this.jLabelid_clienteClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteClienteRetencion.setToolTipText("Cliente");
		this.jLabelid_clienteClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelid_clienteClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jComboBoxid_clienteClienteRetencion= new JComboBoxMe();
		jComboBoxid_clienteClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteClienteRetencion= new JButtonMe();
		this.jButtonid_clienteClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteClienteRetencion.setText("Buscar");
		this.jButtonid_clienteClienteRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteClienteRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteClienteRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteClienteRetencion"));

		this.jButtonid_clienteClienteRetencionBusqueda= new JButtonMe();
		this.jButtonid_clienteClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteClienteRetencionBusqueda.setText("U");
		this.jButtonid_clienteClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteClienteRetencionBusqueda.setVisible(false);		}

		this.jButtonid_clienteClienteRetencionUpdate= new JButtonMe();
		this.jButtonid_clienteClienteRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteClienteRetencionUpdate.setText("U");
		this.jButtonid_clienteClienteRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteClienteRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteClienteRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteClienteRetencionUpdate"));



					
		this.jLabelid_facturaClienteRetencion = new JLabelMe();
		this.jLabelid_facturaClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_IDFACTURA+" :");
		this.jLabelid_facturaClienteRetencion.setToolTipText("Factura");
		this.jLabelid_facturaClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelid_facturaClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jComboBoxid_facturaClienteRetencion= new JComboBoxMe();
		jComboBoxid_facturaClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaClienteRetencion= new JButtonMe();
		this.jButtonid_facturaClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaClienteRetencion.setText("Buscar");
		this.jButtonid_facturaClienteRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaClienteRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaClienteRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaClienteRetencion"));

		this.jButtonid_facturaClienteRetencionBusqueda= new JButtonMe();
		this.jButtonid_facturaClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaClienteRetencionBusqueda.setText("U");
		this.jButtonid_facturaClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaClienteRetencionBusqueda.setVisible(false);		}

		this.jButtonid_facturaClienteRetencionUpdate= new JButtonMe();
		this.jButtonid_facturaClienteRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaClienteRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaClienteRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaClienteRetencionUpdate.setText("U");
		this.jButtonid_facturaClienteRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaClienteRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaClienteRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaClienteRetencionUpdate"));



					
		this.jLabelid_transaccionClienteRetencion = new JLabelMe();
		this.jLabelid_transaccionClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionClienteRetencion.setToolTipText("Tipo");
		this.jLabelid_transaccionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelid_transaccionClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jComboBoxid_transaccionClienteRetencion= new JComboBoxMe();
		jComboBoxid_transaccionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionClienteRetencion= new JButtonMe();
		this.jButtonid_transaccionClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionClienteRetencion.setText("Buscar");
		this.jButtonid_transaccionClienteRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionClienteRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionClienteRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionClienteRetencion"));

		this.jButtonid_transaccionClienteRetencionBusqueda= new JButtonMe();
		this.jButtonid_transaccionClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionClienteRetencionBusqueda.setText("U");
		this.jButtonid_transaccionClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionClienteRetencionBusqueda.setVisible(false);		}

		this.jButtonid_transaccionClienteRetencionUpdate= new JButtonMe();
		this.jButtonid_transaccionClienteRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionClienteRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionClienteRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionClienteRetencionUpdate.setText("U");
		this.jButtonid_transaccionClienteRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionClienteRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionClienteRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionClienteRetencionUpdate"));



					
		this.jLabelid_tipo_retencionClienteRetencion = new JLabelMe();
		this.jLabelid_tipo_retencionClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_IDTIPORETENCION+" : *");
		this.jLabelid_tipo_retencionClienteRetencion.setToolTipText("Tipo Retencion");
		this.jLabelid_tipo_retencionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencionClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencionClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_IDTIPORETENCION);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelid_tipo_retencionClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jComboBoxid_tipo_retencionClienteRetencion= new JComboBoxMe();
		jComboBoxid_tipo_retencionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencionClienteRetencion= new JButtonMe();
		this.jButtonid_tipo_retencionClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionClienteRetencion.setText("Buscar");
		this.jButtonid_tipo_retencionClienteRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencionClienteRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionClienteRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionClienteRetencion"));

		this.jButtonid_tipo_retencionClienteRetencionBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencionClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionClienteRetencionBusqueda.setText("U");
		this.jButtonid_tipo_retencionClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencionClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencionClienteRetencionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencionClienteRetencionUpdate= new JButtonMe();
		this.jButtonid_tipo_retencionClienteRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionClienteRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionClienteRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionClienteRetencionUpdate.setText("U");
		this.jButtonid_tipo_retencionClienteRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencionClienteRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionClienteRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionClienteRetencionUpdate"));



					
		this.jLabelid_asiento_contableClienteRetencion = new JLabelMe();
		this.jLabelid_asiento_contableClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableClienteRetencion.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelid_asiento_contableClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jComboBoxid_asiento_contableClienteRetencion= new JComboBoxMe();
		jComboBoxid_asiento_contableClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_asiento_contableClienteRetencion.setEnabled(false);

		this.jButtonid_asiento_contableClienteRetencion= new JButtonMe();
		this.jButtonid_asiento_contableClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableClienteRetencion.setText("Buscar");
		this.jButtonid_asiento_contableClienteRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableClienteRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableClienteRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableClienteRetencion"));

		this.jButtonid_asiento_contableClienteRetencionBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableClienteRetencionBusqueda.setText("U");
		this.jButtonid_asiento_contableClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableClienteRetencionBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableClienteRetencionUpdate= new JButtonMe();
		this.jButtonid_asiento_contableClienteRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableClienteRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableClienteRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableClienteRetencionUpdate.setText("U");
		this.jButtonid_asiento_contableClienteRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableClienteRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableClienteRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableClienteRetencionUpdate"));



					
		this.jLabelid_cuenta_contable_retencionClienteRetencion = new JLabelMe();
		this.jLabelid_cuenta_contable_retencionClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECLIENTERETENCION+" : *");
		this.jLabelid_cuenta_contable_retencionClienteRetencion.setToolTipText("Cuenta Retencion");
		this.jLabelid_cuenta_contable_retencionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_retencionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_retencionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_retencionClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_retencionClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_retencionClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECLIENTERETENCION);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelid_cuenta_contable_retencionClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jComboBoxid_cuenta_contable_retencionClienteRetencion= new JComboBoxMe();
		jComboBoxid_cuenta_contable_retencionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_retencionClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cuenta_contable_retencionClienteRetencion.setEnabled(false);

		this.jButtonid_cuenta_contable_retencionClienteRetencion= new JButtonMe();
		this.jButtonid_cuenta_contable_retencionClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencionClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencionClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencionClienteRetencion.setText("Buscar");
		this.jButtonid_cuenta_contable_retencionClienteRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_retencionClienteRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencionClienteRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_retencionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencionClienteRetencion"));

		this.jButtonid_cuenta_contable_retencionClienteRetencionBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_retencionClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencionClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencionClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_retencionClienteRetencionBusqueda.setText("U");
		this.jButtonid_cuenta_contable_retencionClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_retencionClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencionClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_retencionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencionClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_retencionClienteRetencionBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_retencionClienteRetencionUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_retencionClienteRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencionClienteRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencionClienteRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_retencionClienteRetencionUpdate.setText("U");
		this.jButtonid_cuenta_contable_retencionClienteRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_retencionClienteRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencionClienteRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_retencionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencionClienteRetencionUpdate"));


		jButtonid_cuenta_contable_retencionClienteRetencionArbol= new JButtonMe();
		jButtonid_cuenta_contable_retencionClienteRetencionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencionClienteRetencionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencionClienteRetencionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencionClienteRetencionArbol.setText("Arbol");
		jButtonid_cuenta_contable_retencionClienteRetencionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_retencionClienteRetencionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencionClienteRetencionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_retencionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencionClienteRetencionArbol"));



					
		this.jLabelid_estado_retencionClienteRetencion = new JLabelMe();
		this.jLabelid_estado_retencionClienteRetencion.setText(""+ClienteRetencionConstantesFunciones.LABEL_IDESTADORETENCION+" : *");
		this.jLabelid_estado_retencionClienteRetencion.setToolTipText("Estado Retencion");
		this.jLabelid_estado_retencionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_retencionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_retencionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_retencionClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_retencionClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_retencionClienteRetencion.setToolTipText(ClienteRetencionConstantesFunciones.LABEL_IDESTADORETENCION);
		this.gridaBagLayoutClienteRetencion = new GridBagLayout();
		this.jPanelid_estado_retencionClienteRetencion.setLayout(this.gridaBagLayoutClienteRetencion);


		jComboBoxid_estado_retencionClienteRetencion= new JComboBoxMe();
		jComboBoxid_estado_retencionClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_retencionClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_retencionClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_retencionClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_retencionClienteRetencion.setEnabled(false);

		this.jButtonid_estado_retencionClienteRetencion= new JButtonMe();
		this.jButtonid_estado_retencionClienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_retencionClienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_retencionClienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_retencionClienteRetencion.setText("Buscar");
		this.jButtonid_estado_retencionClienteRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_retencionClienteRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_retencionClienteRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_retencionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_retencionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_retencionClienteRetencion"));

		this.jButtonid_estado_retencionClienteRetencionBusqueda= new JButtonMe();
		this.jButtonid_estado_retencionClienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_retencionClienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_retencionClienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_retencionClienteRetencionBusqueda.setText("U");
		this.jButtonid_estado_retencionClienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_retencionClienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_retencionClienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_retencionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_retencionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_retencionClienteRetencionBusqueda"));

		if(this.clienteretencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_retencionClienteRetencionBusqueda.setVisible(false);		}

		this.jButtonid_estado_retencionClienteRetencionUpdate= new JButtonMe();
		this.jButtonid_estado_retencionClienteRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_retencionClienteRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_retencionClienteRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_retencionClienteRetencionUpdate.setText("U");
		this.jButtonid_estado_retencionClienteRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_retencionClienteRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_retencionClienteRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_retencionClienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_retencionClienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_retencionClienteRetencionUpdate"));



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
		//this.jInternalFrameDetalleClienteRetencion = new ClienteRetencionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Retencion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutClienteRetencion= new GridBagLayout();
		

		
		String sToolTipClienteRetencion="";
		sToolTipClienteRetencion=ClienteRetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipClienteRetencion+="(Cartera.ClienteRetencion)";
		}
		
		if(!this.clienteretencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipClienteRetencion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoClienteRetencion = new JButtonMe();
		this.jButtonModificarClienteRetencion = new JButtonMe();
        this.jButtonActualizarClienteRetencion = new JButtonMe();
        this.jButtonEliminarClienteRetencion = new JButtonMe();
        this.jButtonCancelarClienteRetencion = new JButtonMe();
        this.jButtonGuardarCambiosClienteRetencion = new JButtonMe();
		this.jButtonGuardarCambiosTablaClienteRetencion = new JButtonMe();
		this.jButtonCerrarClienteRetencion = new JButtonMe();
		
		this.jScrollPanelDatosClienteRetencion = new JScrollPane();   
        this.jScrollPanelDatosEdicionClienteRetencion = new JScrollPane();
		this.jScrollPanelDatosGeneralClienteRetencion = new JScrollPane();
				
		
		
		this.jPanelCamposClienteRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosClienteRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesClienteRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioClienteRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Retencion";
		
		if(!this.clienteretencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones" + this.sPath));
		} else {
			this.jScrollPanelDatosClienteRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposClienteRetencion.setName("jPanelCamposClienteRetencion"); 

		this.jPanelCamposOcultosClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosClienteRetencion.setName("jPanelCamposOcultosClienteRetencion"); 

        this.jPanelAccionesClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesClienteRetencion.setToolTipText("Acciones");
        this.jPanelAccionesClienteRetencion.setName("Acciones"); 

		this.jPanelAccionesFormularioClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioClienteRetencion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioClienteRetencion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoClienteRetencion.setText("Nuevo");
		this.jButtonModificarClienteRetencion.setText("Editar");
        this.jButtonActualizarClienteRetencion.setText("Actualizar");
        this.jButtonEliminarClienteRetencion.setText("Eliminar");
        this.jButtonCancelarClienteRetencion.setText("Cancelar");
        this.jButtonGuardarCambiosClienteRetencion.setText("Guardar");
		this.jButtonGuardarCambiosTablaClienteRetencion.setText("Guardar");
		this.jButtonCerrarClienteRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoClienteRetencion,"nuevo_button","Nuevo",this.clienteretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarClienteRetencion,"modificar_button","Editar",this.clienteretencionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarClienteRetencion,"actualizar_button","Actualizar",this.clienteretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarClienteRetencion,"eliminar_button","Eliminar",this.clienteretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarClienteRetencion,"cancelar_button","Cancelar",this.clienteretencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosClienteRetencion,"guardarcambios_button","Guardar",this.clienteretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaClienteRetencion,"guardarcambiostabla_button","Guardar",this.clienteretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarClienteRetencion,"cerrar_button","Salir",this.clienteretencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoClienteRetencion.setToolTipText("Nuevo"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarClienteRetencion.setToolTipText("Editar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarClienteRetencion.setToolTipText("Actualizar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarClienteRetencion.setToolTipText("Eliminar)"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarClienteRetencion.setToolTipText("Cancelar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosClienteRetencion.setToolTipText("Guardar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaClienteRetencion.setToolTipText("Guardar"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarClienteRetencion.setToolTipText("Salir"+" "+ClienteRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoClienteRetencion";
		inputMap = this.jButtonNuevoClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoClienteRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoClienteRetencion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarClienteRetencion";
		inputMap = this.jButtonActualizarClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarClienteRetencion"));
		
		//ELIMINAR
		sMapKey = "EliminarClienteRetencion";
		inputMap = this.jButtonEliminarClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarClienteRetencion"));
		
		//CANCELAR	
		sMapKey = "CancelarClienteRetencion";
		inputMap = this.jButtonCancelarClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarClienteRetencion"));
		
		//CERRAR		
		sMapKey = "CerrarClienteRetencion";
		inputMap = this.jButtonCerrarClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarClienteRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaClienteRetencion";
		inputMap = this.jButtonGuardarCambiosTablaClienteRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaClienteRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaClienteRetencion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoClienteRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoClienteRetencion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoClienteRetencion.setToolTipText("Nuevo ClienteRetencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarClienteRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarClienteRetencion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarClienteRetencion.setToolTipText("Sin Cerrar Ventana ClienteRetencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeClienteRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeClienteRetencion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeClienteRetencion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesClienteRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesClienteRetencion.setText("Accion");
		this.jComboBoxTiposAccionesClienteRetencion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioClienteRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioClienteRetencion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioClienteRetencion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesClienteRetencion = new JLabelMe();
		
		this.jLabelAccionesClienteRetencion.setText("Acciones");		
		this.jLabelAccionesClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposClienteRetencion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysClienteRetencion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesClienteRetencion=new JTabbedPane();
		this.jTabbedPaneRelacionesClienteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesClienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesClienteRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioClienteRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioClienteRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioClienteRetencion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioClienteRetencion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposClienteRetencion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosClienteRetencion = new GridBagLayout();
		
		this.jPanelCamposClienteRetencion.setLayout(gridaBagLayoutCamposClienteRetencion);
		this.jPanelCamposOcultosClienteRetencion.setLayout(gridaBagLayoutCamposOcultosClienteRetencion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidClienteRetencion.add(jLabelIdClienteRetencion, this.gridBagConstraintsClienteRetencion);



	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidClienteRetencion.add(jLabelidClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaClienteRetencion.add(jLabelid_empresaClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaClienteRetencion.add(jButtonid_empresaClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 3;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaClienteRetencion.add(jButtonid_empresaClienteRetencionUpdate, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaClienteRetencion.add(jComboBoxid_empresaClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalClienteRetencion.add(jLabelid_sucursalClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalClienteRetencion.add(jButtonid_sucursalClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 3;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalClienteRetencion.add(jButtonid_sucursalClienteRetencionUpdate, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalClienteRetencion.add(jComboBoxid_sucursalClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioClienteRetencion.add(jLabelid_ejercicioClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioClienteRetencion.add(jButtonid_ejercicioClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 3;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioClienteRetencion.add(jButtonid_ejercicioClienteRetencionUpdate, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioClienteRetencion.add(jComboBoxid_ejercicioClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoClienteRetencion.add(jLabelid_periodoClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoClienteRetencion.add(jButtonid_periodoClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 3;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoClienteRetencion.add(jButtonid_periodoClienteRetencionUpdate, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoClienteRetencion.add(jComboBoxid_periodoClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioClienteRetencion.add(jLabelid_anioClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioClienteRetencion.add(jButtonid_anioClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 3;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioClienteRetencion.add(jButtonid_anioClienteRetencionUpdate, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioClienteRetencion.add(jComboBoxid_anioClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesClienteRetencion.add(jLabelid_mesClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesClienteRetencion.add(jButtonid_mesClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 3;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesClienteRetencion.add(jButtonid_mesClienteRetencionUpdate, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesClienteRetencion.add(jComboBoxid_mesClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaClienteRetencion.add(jLabelfechaClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaClienteRetencion.add(jButtonfechaClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaClienteRetencion.add(jDateChooserfechaClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteClienteRetencion.add(jLabelid_clienteClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 2;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteClienteRetencion.add(jButtonid_clienteClienteRetencion, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 3;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteClienteRetencion.add(jButtonid_clienteClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 4;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteClienteRetencion.add(jButtonid_clienteClienteRetencionUpdate, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteClienteRetencion.add(jComboBoxid_clienteClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_facturaClienteRetencion.add(jLabelid_facturaClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 2;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaClienteRetencion.add(jButtonid_facturaClienteRetencion, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 3;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaClienteRetencion.add(jButtonid_facturaClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 4;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaClienteRetencion.add(jButtonid_facturaClienteRetencionUpdate, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_facturaClienteRetencion.add(jComboBoxid_facturaClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transaccionClienteRetencion.add(jLabelid_transaccionClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionClienteRetencion.add(jButtonid_transaccionClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 3;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionClienteRetencion.add(jButtonid_transaccionClienteRetencionUpdate, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transaccionClienteRetencion.add(jComboBoxid_transaccionClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_retencionClienteRetencion.add(jLabelid_tipo_retencionClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionClienteRetencion.add(jButtonid_tipo_retencionClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 3;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionClienteRetencion.add(jButtonid_tipo_retencionClienteRetencionUpdate, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_retencionClienteRetencion.add(jComboBoxid_tipo_retencionClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelporcentajeClienteRetencion.add(jLabelporcentajeClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeClienteRetencion.add(jButtonporcentajeClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelporcentajeClienteRetencion.add(jTextFieldporcentajeClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelbase_imponibleClienteRetencion.add(jLabelbase_imponibleClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_imponibleClienteRetencion.add(jButtonbase_imponibleClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelbase_imponibleClienteRetencion.add(jTextFieldbase_imponibleClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelvalorClienteRetencion.add(jLabelvalorClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorClienteRetencion.add(jButtonvalorClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelvalorClienteRetencion.add(jTextFieldvalorClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_retencionClienteRetencion.add(jLabelnumero_retencionClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencionClienteRetencion.add(jButtonnumero_retencionClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_retencionClienteRetencion.add(jTextFieldnumero_retencionClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionClienteRetencion.add(jLabeldescripcionClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionClienteRetencion.add(jButtondescripcionClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionClienteRetencion.add(jscrollPanedescripcionClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_asiento_contableClienteRetencion.add(jLabelid_asiento_contableClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 2;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableClienteRetencion.add(jButtonid_asiento_contableClienteRetencion, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 3;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableClienteRetencion.add(jButtonid_asiento_contableClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 4;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableClienteRetencion.add(jButtonid_asiento_contableClienteRetencionUpdate, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_asiento_contableClienteRetencion.add(jComboBoxid_asiento_contableClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cuenta_contable_retencionClienteRetencion.add(jLabelid_cuenta_contable_retencionClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 2;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_retencionClienteRetencion.add(jButtonid_cuenta_contable_retencionClienteRetencion, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 3;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_retencionClienteRetencion.add(jButtonid_cuenta_contable_retencionClienteRetencionArbol, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 4;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_retencionClienteRetencion.add(jButtonid_cuenta_contable_retencionClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 5;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_retencionClienteRetencion.add(jButtonid_cuenta_contable_retencionClienteRetencionUpdate, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cuenta_contable_retencionClienteRetencion.add(jComboBoxid_cuenta_contable_retencionClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelvalor_tipo_cambioClienteRetencion.add(jLabelvalor_tipo_cambioClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_tipo_cambioClienteRetencion.add(jButtonvalor_tipo_cambioClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelvalor_tipo_cambioClienteRetencion.add(jTextFieldvalor_tipo_cambioClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldebito_mone_localClienteRetencion.add(jLabeldebito_mone_localClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localClienteRetencion.add(jButtondebito_mone_localClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldebito_mone_localClienteRetencion.add(jTextFielddebito_mone_localClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcredito_mone_localClienteRetencion.add(jLabelcredito_mone_localClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localClienteRetencion.add(jButtoncredito_mone_localClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcredito_mone_localClienteRetencion.add(jTextFieldcredito_mone_localClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldebito_mone_extraClienteRetencion.add(jLabeldebito_mone_extraClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_extraClienteRetencion.add(jButtondebito_mone_extraClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldebito_mone_extraClienteRetencion.add(jTextFielddebito_mone_extraClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcredito_mone_extraClienteRetencion.add(jLabelcredito_mone_extraClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_extraClienteRetencion.add(jButtoncredito_mone_extraClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcredito_mone_extraClienteRetencion.add(jTextFieldcredito_mone_extraClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelbeneficiarioClienteRetencion.add(jLabelbeneficiarioClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioClienteRetencion.add(jButtonbeneficiarioClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelbeneficiarioClienteRetencion.add(jscrollPanebeneficiarioClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnombre_benefClienteRetencion.add(jLabelnombre_benefClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_benefClienteRetencion.add(jButtonnombre_benefClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnombre_benefClienteRetencion.add(jscrollPanenombre_benefClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldireccion_benefClienteRetencion.add(jLabeldireccion_benefClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_benefClienteRetencion.add(jButtondireccion_benefClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldireccion_benefClienteRetencion.add(jscrollPanedireccion_benefClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltelefono_benefClienteRetencion.add(jLabeltelefono_benefClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_benefClienteRetencion.add(jButtontelefono_benefClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltelefono_benefClienteRetencion.add(jscrollPanetelefono_benefClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelruc_benefClienteRetencion.add(jLabelruc_benefClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_benefClienteRetencion.add(jButtonruc_benefClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelruc_benefClienteRetencion.add(jTextFieldruc_benefClienteRetencion, this.gridBagConstraintsClienteRetencion);


	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 0;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_retencionClienteRetencion.add(jLabelid_estado_retencionClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 2;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_retencionClienteRetencion.add(jButtonid_estado_retencionClienteRetencionBusqueda, this.gridBagConstraintsClienteRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		//this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = 3;
		this.gridBagConstraintsClienteRetencion.ipadx = 0;
		this.gridBagConstraintsClienteRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_retencionClienteRetencion.add(jButtonid_estado_retencionClienteRetencionUpdate, this.gridBagConstraintsClienteRetencion);
	}

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteRetencion.gridy = 0;
	this.gridBagConstraintsClienteRetencion.gridx = 1;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_retencionClienteRetencion.add(jComboBoxid_estado_retencionClienteRetencion, this.gridBagConstraintsClienteRetencion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposClienteRetencion.add(this.jPanelidClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposClienteRetencion % 2==0) {
		iXPanelCamposClienteRetencion=0;
		iYPanelCamposClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposClienteRetencion.add(this.jPanelfechaClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposClienteRetencion % 2==0) {
		iXPanelCamposClienteRetencion=0;
		iYPanelCamposClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposClienteRetencion.add(this.jPanelid_clienteClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposClienteRetencion % 2==0) {
		iXPanelCamposClienteRetencion=0;
		iYPanelCamposClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposClienteRetencion.add(this.jPanelid_facturaClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposClienteRetencion % 2==0) {
		iXPanelCamposClienteRetencion=0;
		iYPanelCamposClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposClienteRetencion.add(this.jPanelid_transaccionClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposClienteRetencion % 2==0) {
		iXPanelCamposClienteRetencion=0;
		iYPanelCamposClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposClienteRetencion.add(this.jPanelid_tipo_retencionClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposClienteRetencion % 2==0) {
		iXPanelCamposClienteRetencion=0;
		iYPanelCamposClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposClienteRetencion.add(this.jPanelporcentajeClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposClienteRetencion % 2==0) {
		iXPanelCamposClienteRetencion=0;
		iYPanelCamposClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposClienteRetencion.add(this.jPanelbase_imponibleClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposClienteRetencion % 2==0) {
		iXPanelCamposClienteRetencion=0;
		iYPanelCamposClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposClienteRetencion.add(this.jPanelvalorClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposClienteRetencion % 2==0) {
		iXPanelCamposClienteRetencion=0;
		iYPanelCamposClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposClienteRetencion.add(this.jPanelnumero_retencionClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposClienteRetencion % 2==0) {
		iXPanelCamposClienteRetencion=0;
		iYPanelCamposClienteRetencion++;
	}

	iXPanelCamposClienteRetencion=0;
	iYPanelCamposClienteRetencion++;

	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.gridBagConstraintsClienteRetencion.gridwidth = 2;

	this.jPanelCamposClienteRetencion.add(this.jPaneldescripcionClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposClienteRetencion % 2==0) {
		iXPanelCamposClienteRetencion=0;
		iYPanelCamposClienteRetencion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelid_empresaClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelid_sucursalClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelid_ejercicioClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelid_periodoClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelid_anioClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelid_mesClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelid_asiento_contableClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelid_cuenta_contable_retencionClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelvalor_tipo_cambioClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPaneldebito_mone_localClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelcredito_mone_localClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPaneldebito_mone_extraClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelcredito_mone_extraClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelbeneficiarioClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelnombre_benefClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPaneldireccion_benefClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPaneltelefono_benefClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelruc_benefClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
	}
	this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteRetencion.gridy = iYPanelCamposOcultosClienteRetencion;
	this.gridBagConstraintsClienteRetencion.gridx = iXPanelCamposOcultosClienteRetencion++;
	this.gridBagConstraintsClienteRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosClienteRetencion.add(this.jPanelid_estado_retencionClienteRetencion, this.gridBagConstraintsClienteRetencion);



	if(iXPanelCamposOcultosClienteRetencion % 2==0) {
		iXPanelCamposOcultosClienteRetencion=0;
		iYPanelCamposOcultosClienteRetencion++;
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
			
		GridBagLayout gridaBagLayoutAccionesClienteRetencion= new GridBagLayout();
		this.jPanelAccionesClienteRetencion.setLayout(gridaBagLayoutAccionesClienteRetencion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioClienteRetencion= new GridBagLayout();
		this.jPanelAccionesFormularioClienteRetencion.setLayout(gridaBagLayoutAccionesFormularioClienteRetencion);
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsClienteRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioClienteRetencion.add(this.jComboBoxTiposAccionesFormularioClienteRetencion, this.gridBagConstraintsClienteRetencion);

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsClienteRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioClienteRetencion.add(this.jCheckBoxPostAccionNuevoClienteRetencion, this.gridBagConstraintsClienteRetencion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.clienteretencionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsClienteRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioClienteRetencion.add(this.jCheckBoxPostAccionSinCerrarClienteRetencion, this.gridBagConstraintsClienteRetencion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.clienteretencionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.clienteretencionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsClienteRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioClienteRetencion.add(this.jCheckBoxPostAccionSinMensajeClienteRetencion, this.gridBagConstraintsClienteRetencion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx = iPosXAccion++;
			
		this.jPanelAccionesClienteRetencion.add(this.jButtonModificarClienteRetencion, this.gridBagConstraintsClienteRetencion);							

		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteRetencion.gridy = 0;
		this.gridBagConstraintsClienteRetencion.gridx =iPosXAccion++;
			
		this.jPanelAccionesClienteRetencion.add(this.jButtonEliminarClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
			
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy = 0;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesClienteRetencion.add(this.jButtonActualizarClienteRetencion, this.gridBagConstraintsClienteRetencion);


		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy = 0;		
		this.gridBagConstraintsClienteRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesClienteRetencion.add(this.jButtonGuardarCambiosClienteRetencion, this.gridBagConstraintsClienteRetencion);	
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy = 0;		
		this.gridBagConstraintsClienteRetencion.gridx =iPosXAccion++;
		
		this.jPanelAccionesClienteRetencion.add(this.jButtonCancelarClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutClienteRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutClienteRetencion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.clienteretencionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();						
			this.gridBagConstraintsClienteRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClienteRetencion.gridx = 0;		
			//this.gridBagConstraintsClienteRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsClienteRetencion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsClienteRetencion.gridx =0;
		this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsClienteRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosClienteRetencion, this.gridBagConstraintsClienteRetencion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ClienteRetencionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleClienteRetencion = new ClienteRetencionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Retencion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Retencion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Retencion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ClienteRetencionModel clienteretencionModel=new ClienteRetencionModel(this);
			
			//SI USARA CLASE INTERNA
			//ClienteRetencionModel.ClienteRetencionFocusTraversalPolicy clienteretencionFocusTraversalPolicy = clienteretencionModel.new ClienteRetencionFocusTraversalPolicy(this);
			
			//clienteretencionFocusTraversalPolicy.setclienteretencionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(clienteretencionModel);
			
			
			this.jContentPaneDetalleClienteRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleClienteRetencion = new GridBagLayout();	
			this.jContentPaneDetalleClienteRetencion.setLayout(gridaBagLayoutDetalleClienteRetencion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosClienteRetencion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
				this.gridBagConstraintsClienteRetencion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsClienteRetencion.gridx = 0;
					
				
				this.jContentPaneDetalleClienteRetencion.add(jTtoolBarDetalleClienteRetencion, gridBagConstraintsClienteRetencion);								
				
}
			
			this.jScrollPanelDatosEdicionClienteRetencion=   new JScrollPane(jContentPaneDetalleClienteRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionClienteRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralClienteRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralClienteRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsClienteRetencion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsClienteRetencion.gridx = 0;
	        
			this.jContentPaneDetalleClienteRetencion.add(jPanelCamposClienteRetencion, gridBagConstraintsClienteRetencion);
			
			
			
			
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
						&& clienteretencionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.clienteretencionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsClienteRetencion= new GridBagConstraints();
						this.gridBagConstraintsClienteRetencion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsClienteRetencion.gridx = 0;
						this.jContentPaneDetalleClienteRetencion.add(this.jTabbedPaneRelacionesClienteRetencion, this.gridBagConstraintsClienteRetencion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesClienteRetencion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosClienteRetencion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
					this.gridBagConstraintsClienteRetencion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsClienteRetencion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsClienteRetencion.gridx = 0;
					
				
					this.jContentPaneDetalleClienteRetencion.add(jPanelCamposOcultosClienteRetencion, gridBagConstraintsClienteRetencion);
				
					this.jPanelCamposOcultosClienteRetencion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsClienteRetencion.gridx = 0;
	        this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleClienteRetencion.add(this.jPanelAccionesFormularioClienteRetencion, this.gridBagConstraintsClienteRetencion);							
			
			
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
	        this.gridBagConstraintsClienteRetencion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsClienteRetencion.gridx = 0;
	        
			
			this.jContentPaneDetalleClienteRetencion.add(this.jPanelAccionesClienteRetencion, this.gridBagConstraintsClienteRetencion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionClienteRetencion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionClienteRetencion=   new JScrollPane(this.jPanelCamposClienteRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionClienteRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsClienteRetencion.gridx = 0;
			this.gridBagConstraintsClienteRetencion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsClienteRetencion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsClienteRetencion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionClienteRetencion, this.gridBagConstraintsClienteRetencion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsClienteRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioClienteRetencion, this.gridBagConstraintsClienteRetencion);			
			
			this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
			this.gridBagConstraintsClienteRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsClienteRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesClienteRetencion, this.gridBagConstraintsClienteRetencion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposClienteRetencion, this.gridBagConstraintsClienteRetencion);
			
			
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosClienteRetencion, this.gridBagConstraintsClienteRetencion);
		
			
		this.gridBagConstraintsClienteRetencion = new GridBagConstraints();
		this.gridBagConstraintsClienteRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsClienteRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesClienteRetencion, this.gridBagConstraintsClienteRetencion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralClienteRetencion;//jContentPane;
		
		return jScrollPanelDatosEdicionClienteRetencion;
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
