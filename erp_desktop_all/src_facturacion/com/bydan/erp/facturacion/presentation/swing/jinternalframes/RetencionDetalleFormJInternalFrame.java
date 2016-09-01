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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.RetencionConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class RetencionDetalleFormJInternalFrame extends RetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	/*
	public JToolBar jTtoolBarDetalleRetencion;
	
	protected JMenuBar jmenuBarDetalleRetencion;
	
	protected JMenu jmenuDetalleRetencion;
	protected JMenu jmenuDetalleArchivoRetencion;
	protected JMenu jmenuDetalleAccionesRetencion;
	protected JMenu jmenuDetalleDatosRetencion;
	
	*/
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRetencion;	
	protected GridBagConstraints gridBagConstraintsRetencion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RetencionBeanSwingJInternalFrameAdditional jInternalFrameDetalleRetencion;		
	
	
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

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableretencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableretencion="";

	protected EstadoRetencionBeanSwingJInternalFrame estadoretencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoretencion="";
	
	public RetencionSessionBean retencionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public CuentaContableSessionBean cuentacontableretencionSessionBean;
	public EstadoRetencionSessionBean estadoretencionSessionBean;	
	
	public RetencionLogic retencionLogic;
	
	public JScrollPane jScrollPanelDatosRetencion;
	public JScrollPane jScrollPanelDatosEdicionRetencion;
	public JScrollPane jScrollPanelDatosGeneralRetencion;
	
	protected JPanel jPanelCamposRetencion;    
	protected JPanel jPanelCamposOcultosRetencion;    	
	protected JPanel jPanelAccionesRetencion;
	protected JPanel jPanelAccionesFormularioRetencion;
    
	
	
	protected JTabbedPane jTabbedPaneCamposRetencion;	
	protected Integer iXPanelCamposRetencion=0;
	protected Integer iYPanelCamposRetencion=0;
	
	protected Integer iXPanelCamposOcultosRetencion=0;
	protected Integer iYPanelCamposOcultosRetencion=0;
	
	

	protected JPanel jPanelCamposIniciogeneralRetencion;
	protected Integer iXPanelCamposIniciogeneralRetencion=0;
	protected Integer iYPanelCamposIniciogeneralRetencion=0;

	protected JPanel jPanelCamposIniciobeneficiarioRetencion;
	protected Integer iXPanelCamposIniciobeneficiarioRetencion=0;
	protected Integer iYPanelCamposIniciobeneficiarioRetencion=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRetencion;
	public JButton jButtonModificarRetencion;
	public JButton jButtonActualizarRetencion;
    public JButton jButtonEliminarRetencion;
	public JButton jButtonCancelarRetencion;
    public JButton jButtonGuardarCambiosRetencion;
	public JButton jButtonGuardarCambiosTablaRetencion;
	protected JButton jButtonCerrarRetencion;
	
	/*
	protected JButton jButtonProcesarInformacionRetencion;
	*/
	
	protected JCheckBox jCheckBoxPostAccionNuevoRetencion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRetencion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRetencion;
	
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarRetencion;
	protected JButton jButtonModificarToolBarRetencion;
	protected JButton jButtonActualizarToolBarRetencion;
    protected JButton jButtonEliminarToolBarRetencion;
	protected JButton jButtonCancelarToolBarRetencion;
    protected JButton jButtonGuardarCambiosToolBarRetencion;
	protected JButton jButtonGuardarCambiosTablaToolBarRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarRetencion;
	protected JButton jButtonCerrarToolBarRetencion;
	
	protected JButton jButtonProcesarInformacionToolBarRetencion;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoRetencion;
	protected JMenuItem jMenuItemModificarRetencion;
	protected JMenuItem jMenuItemActualizarRetencion;
    protected JMenuItem jMenuItemEliminarRetencion;
	protected JMenuItem jMenuItemCancelarRetencion;
    protected JMenuItem jMenuItemGuardarCambiosRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaRetencion;
	protected JMenuItem jMenuItemCerrarRetencion;
	protected JMenuItem jMenuItemDetalleCerrarRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarRetencion;
	
	protected JMenuItem jMenuItemProcesarInformacionRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRetencion;
	protected JMenuItem jMenuItemMostrarOcultarRetencion;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesRetencion;	
		
	/*
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRetencion;
	*/
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRetencion;
	
	/*	
	
	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRetencion;
	public JLabel jLabelIdRetencion;
	public JLabel jLabelidRetencion;
	public JButton jButtonidRetencionBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeRetencion;
	public JLabel jLabelporcentajeRetencion;
	public JTextField jTextFieldporcentajeRetencion;
	public JButton jButtonporcentajeRetencionBusqueda= new JButtonMe();

	public JPanel jPanelbase_imponibleRetencion;
	public JLabel jLabelbase_imponibleRetencion;
	public JTextField jTextFieldbase_imponibleRetencion;
	public JButton jButtonbase_imponibleRetencionBusqueda= new JButtonMe();

	public JPanel jPanelvalorRetencion;
	public JLabel jLabelvalorRetencion;
	public JTextField jTextFieldvalorRetencion;
	public JButton jButtonvalorRetencionBusqueda= new JButtonMe();

	public JPanel jPanelnumeroRetencion;
	public JLabel jLabelnumeroRetencion;
	public JTextField jTextFieldnumeroRetencion;
	public JButton jButtonnumeroRetencionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionRetencion;
	public JLabel jLabeldescripcionRetencion;
	public JTextArea jTextAreadescripcionRetencion;
	public JScrollPane jscrollPanedescripcionRetencion;
	public JButton jButtondescripcionRetencionBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localRetencion;
	public JLabel jLabeldebito_mone_localRetencion;
	public JTextField jTextFielddebito_mone_localRetencion;
	public JButton jButtondebito_mone_localRetencionBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localRetencion;
	public JLabel jLabelcredito_mone_localRetencion;
	public JTextField jTextFieldcredito_mone_localRetencion;
	public JButton jButtoncredito_mone_localRetencionBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_extraRetencion;
	public JLabel jLabeldebito_mone_extraRetencion;
	public JTextField jTextFielddebito_mone_extraRetencion;
	public JButton jButtondebito_mone_extraRetencionBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_extraRetencion;
	public JLabel jLabelcredito_mone_extraRetencion;
	public JTextField jTextFieldcredito_mone_extraRetencion;
	public JButton jButtoncredito_mone_extraRetencionBusqueda= new JButtonMe();

	public JPanel jPanelcotizacionRetencion;
	public JLabel jLabelcotizacionRetencion;
	public JTextField jTextFieldcotizacionRetencion;
	public JButton jButtoncotizacionRetencionBusqueda= new JButtonMe();

	public JPanel jPanelnombre_benefRetencion;
	public JLabel jLabelnombre_benefRetencion;
	public JTextArea jTextAreanombre_benefRetencion;
	public JScrollPane jscrollPanenombre_benefRetencion;
	public JButton jButtonnombre_benefRetencionBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_benefRetencion;
	public JLabel jLabeldireccion_benefRetencion;
	public JTextArea jTextAreadireccion_benefRetencion;
	public JScrollPane jscrollPanedireccion_benefRetencion;
	public JButton jButtondireccion_benefRetencionBusqueda= new JButtonMe();

	public JPanel jPanelruc_benefRetencion;
	public JLabel jLabelruc_benefRetencion;
	public JTextField jTextFieldruc_benefRetencion;
	public JButton jButtonruc_benefRetencionBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_benefRetencion;
	public JLabel jLabeltelefono_benefRetencion;
	public JTextArea jTextAreatelefono_benefRetencion;
	public JScrollPane jscrollPanetelefono_benefRetencion;
	public JButton jButtontelefono_benefRetencionBusqueda= new JButtonMe();

	public JPanel jPanelfechaRetencion;
	public JLabel jLabelfechaRetencion;
	//public JFormattedTextField jDateChooserfechaRetencion;

	public JDateChooser jDateChooserfechaRetencion;
	public JButton jButtonfechaRetencionBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioRetencion;
	public JLabel jLabelbeneficiarioRetencion;
	public JTextArea jTextAreabeneficiarioRetencion;
	public JScrollPane jscrollPanebeneficiarioRetencion;
	public JButton jButtonbeneficiarioRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRetencion;
	public JLabel jLabelid_empresaRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRetencion;
	public JButton jButtonid_empresaRetencion= new JButtonMe();
	public JButton jButtonid_empresaRetencionUpdate= new JButtonMe();
	public JButton jButtonid_empresaRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalRetencion;
	public JLabel jLabelid_sucursalRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalRetencion;
	public JButton jButtonid_sucursalRetencion= new JButtonMe();
	public JButton jButtonid_sucursalRetencionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioRetencion;
	public JLabel jLabelid_ejercicioRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioRetencion;
	public JButton jButtonid_ejercicioRetencion= new JButtonMe();
	public JButton jButtonid_ejercicioRetencionUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoRetencion;
	public JLabel jLabelid_periodoRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoRetencion;
	public JButton jButtonid_periodoRetencion= new JButtonMe();
	public JButton jButtonid_periodoRetencionUpdate= new JButtonMe();
	public JButton jButtonid_periodoRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_anioRetencion;
	public JLabel jLabelid_anioRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioRetencion;
	public JButton jButtonid_anioRetencion= new JButtonMe();
	public JButton jButtonid_anioRetencionUpdate= new JButtonMe();
	public JButton jButtonid_anioRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_mesRetencion;
	public JLabel jLabelid_mesRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesRetencion;
	public JButton jButtonid_mesRetencion= new JButtonMe();
	public JButton jButtonid_mesRetencionUpdate= new JButtonMe();
	public JButton jButtonid_mesRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableRetencion;
	public JLabel jLabelid_asiento_contableRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableRetencion;
	public JButton jButtonid_asiento_contableRetencion= new JButtonMe();
	public JButton jButtonid_asiento_contableRetencionUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencionRetencion;
	public JLabel jLabelid_tipo_retencionRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionRetencion;
	public JButton jButtonid_tipo_retencionRetencion= new JButtonMe();
	public JButton jButtonid_tipo_retencionRetencionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteRetencion;
	public JLabel jLabelid_clienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteRetencion;
	public JButton jButtonid_clienteRetencion= new JButtonMe();
	public JButton jButtonid_clienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_clienteRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaRetencion;
	public JLabel jLabelid_facturaRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaRetencion;
	public JButton jButtonid_facturaRetencion= new JButtonMe();
	public JButton jButtonid_facturaRetencionUpdate= new JButtonMe();
	public JButton jButtonid_facturaRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaRetencion;
	public JLabel jLabelid_monedaRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaRetencion;
	public JButton jButtonid_monedaRetencion= new JButtonMe();
	public JButton jButtonid_monedaRetencionUpdate= new JButtonMe();
	public JButton jButtonid_monedaRetencionBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_retencionRetencion;
	public JLabel jLabelid_cuenta_contable_retencionRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_retencionRetencion;
	public JButton jButtonid_cuenta_contable_retencionRetencion= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionRetencionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionRetencionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionRetencionArbol= new JButtonMe();

	public JPanel jPanelid_estado_retencionRetencion;
	public JLabel jLabelid_estado_retencionRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_retencionRetencion;
	public JButton jButtonid_estado_retencionRetencion= new JButtonMe();
	public JButton jButtonid_estado_retencionRetencionUpdate= new JButtonMe();
	public JButton jButtonid_estado_retencionRetencionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRetencion;
	
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
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RetencionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRetencion=new JPanel();
				this.jPanelAccionesFormularioRetencion=new JPanel();
				this.jmenuBarDetalleRetencion=new JMenuBar();
				this.jTtoolBarDetalleRetencion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Retencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RetencionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Retencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Retencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Retencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Retencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	/*
	public JButton getjButtonActualizarToolBarRetencion() {
		return this.jButtonActualizarToolBarRetencion;
	}
	
	public JButton getjButtonEliminarToolBarRetencion() {
		return this.jButtonEliminarToolBarRetencion;
	}
	
	public JButton getjButtonCancelarToolBarRetencion() {
		return this.jButtonCancelarToolBarRetencion;
	}		
	
	public JButton getjButtonProcesarInformacionRetencion() {
		return this.jButtonProcesarInformacionRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRetencion)	{
		this.jButtonProcesarInformacionRetencion = jButtonProcesarInformacionRetencion;
	}
	*/
	
	

	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRetencion() {
		return this.jComboBoxTiposAccionesRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRetencion(
			JComboBox jComboBoxTiposRelacionesRetencion) {
		this.jComboBoxTiposRelacionesRetencion = jComboBoxTiposRelacionesRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRetencion(
			JComboBox jComboBoxTiposAccionesRetencion) {
		this.jComboBoxTiposAccionesRetencion = jComboBoxTiposAccionesRetencion;
	}		
	
	*/		
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRetencion() {
		return this.jComboBoxTiposAccionesFormularioRetencion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRetencion(
			JComboBox jComboBoxTiposAccionesFormularioRetencion) {
		this.jComboBoxTiposAccionesFormularioRetencion = jComboBoxTiposAccionesFormularioRetencion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.retencionSessionBean=new RetencionSessionBean();
		
		this.retencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.retencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.retencionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.retencionSessionBean.getEsGuardarRelacionado()) {
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
	
		RetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRetencion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRetencion=new JButtonMe();
				this.jButtonModificarToolBarRetencion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRetencion,this.jTtoolBarDetalleRetencion,
							"actualizar","actualizar","Actualizar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRetencion,this.jTtoolBarDetalleRetencion,
							"eliminar","eliminar","Eliminar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRetencion,this.jTtoolBarDetalleRetencion,
							"cancelar","cancelar","Cancelar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRetencion,this.jTtoolBarDetalleRetencion,
							"guardarcambios","guardarcambios","Guardar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	*/
	
	/*
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRetencion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRetencion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRetencion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRetencion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRetencion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRetencion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRetencion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRetencion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRetencion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRetencion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRetencion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRetencion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRetencion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRetencion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRetencion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRetencion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRetencion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRetencion.add(this.jMenuItemDetalleCerrarRetencion);
		
		this.jmenuDetalleAccionesRetencion.add(this.jMenuItemActualizarRetencion);
		this.jmenuDetalleAccionesRetencion.add(this.jMenuItemEliminarRetencion);
		this.jmenuDetalleAccionesRetencion.add(this.jMenuItemCancelarRetencion);		
		
		//this.jmenuDetalleDatosRetencion.add(this.jMenuItemDetalleAbrirOrderByRetencion);				
		this.jmenuDetalleDatosRetencion.add(this.jMenuItemDetalleMostarOcultarRetencion);				
				
		//this.jmenuDetalleAccionesRetencion.add(this.jMenuItemGuardarCambiosRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRetencion.add(this.jmenuDetalleArchivoRetencion);		
		this.jmenuBarDetalleRetencion.add(this.jmenuDetalleAccionesRetencion);		
		this.jmenuBarDetalleRetencion.add(this.jmenuDetalleDatosRetencion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRetencion);				
	}
	*/
	
	public void inicializarElementosCamposRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRetencion = new JLabelMe();
		jLabelIdRetencion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRetencion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRetencion= new GridBagLayout();

		this.jPanelidRetencion.setLayout(this.gridaBagLayoutRetencion);

		jLabelidRetencion = new JLabel();
		jLabelidRetencion.setText("Id");

		jLabelidRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeRetencion = new JLabelMe();
		this.jLabelporcentajeRetencion.setText(""+RetencionConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeRetencion.setToolTipText("Porcentaje(%)");
		this.jLabelporcentajeRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelporcentajeRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextFieldporcentajeRetencion= new JTextFieldMe();
		jTextFieldporcentajeRetencion.setEnabled(false);
		jTextFieldporcentajeRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeRetencion.setText("0.0");

		this.jButtonporcentajeRetencionBusqueda= new JButtonMe();
		this.jButtonporcentajeRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeRetencionBusqueda.setText("U");
		this.jButtonporcentajeRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeRetencionBusqueda.setVisible(false);		}


					
		this.jLabelbase_imponibleRetencion = new JLabelMe();
		this.jLabelbase_imponibleRetencion.setText(""+RetencionConstantesFunciones.LABEL_BASEIMPONIBLE+" : *");
		this.jLabelbase_imponibleRetencion.setToolTipText("Base Imponible");
		this.jLabelbase_imponibleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_imponibleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_imponibleRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_imponibleRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_BASEIMPONIBLE);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelbase_imponibleRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextFieldbase_imponibleRetencion= new JTextFieldMe();
		jTextFieldbase_imponibleRetencion.setEnabled(false);
		jTextFieldbase_imponibleRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_imponibleRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_imponibleRetencion.setText("0.0");

		this.jButtonbase_imponibleRetencionBusqueda= new JButtonMe();
		this.jButtonbase_imponibleRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_imponibleRetencionBusqueda.setText("U");
		this.jButtonbase_imponibleRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_imponibleRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_imponibleRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_imponibleRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_imponibleRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_imponibleRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_imponibleRetencionBusqueda.setVisible(false);		}


					
		this.jLabelvalorRetencion = new JLabelMe();
		this.jLabelvalorRetencion.setText(""+RetencionConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorRetencion.setToolTipText("Valor");
		this.jLabelvalorRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelvalorRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextFieldvalorRetencion= new JTextFieldMe();
		jTextFieldvalorRetencion.setEnabled(false);
		jTextFieldvalorRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorRetencion.setText("0.0");

		this.jButtonvalorRetencionBusqueda= new JButtonMe();
		this.jButtonvalorRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorRetencionBusqueda.setText("U");
		this.jButtonvalorRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorRetencionBusqueda.setVisible(false);		}


					
		this.jLabelnumeroRetencion = new JLabelMe();
		this.jLabelnumeroRetencion.setText(""+RetencionConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroRetencion.setToolTipText("No Retencion");
		this.jLabelnumeroRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelnumeroRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextFieldnumeroRetencion= new JTextFieldMe();

		jTextFieldnumeroRetencion.setEnabled(false);
		jTextFieldnumeroRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroRetencionBusqueda= new JButtonMe();
		this.jButtonnumeroRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroRetencionBusqueda.setText("U");
		this.jButtonnumeroRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroRetencionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionRetencion = new JLabelMe();
		this.jLabeldescripcionRetencion.setText(""+RetencionConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionRetencion.setToolTipText("Descripcion");
		this.jLabeldescripcionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPaneldescripcionRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextAreadescripcionRetencion= new JTextAreaMe();
		jTextAreadescripcionRetencion.setEnabled(false);
		jTextAreadescripcionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRetencion.setLineWrap(true);
		jTextAreadescripcionRetencion.setWrapStyleWord(true);
		jTextAreadescripcionRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionRetencion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionRetencion = new JScrollPane(jTextAreadescripcionRetencion);
		jscrollPanedescripcionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionRetencionBusqueda= new JButtonMe();
		this.jButtondescripcionRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionRetencionBusqueda.setText("U");
		this.jButtondescripcionRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionRetencionBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_localRetencion = new JLabelMe();
		this.jLabeldebito_mone_localRetencion.setText(""+RetencionConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localRetencion.setToolTipText("Debito Local");
		this.jLabeldebito_mone_localRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_mone_localRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_mone_localRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPaneldebito_mone_localRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextFielddebito_mone_localRetencion= new JTextFieldMe();
		jTextFielddebito_mone_localRetencion.setEnabled(false);
		jTextFielddebito_mone_localRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localRetencion.setText("0.0");

		this.jButtondebito_mone_localRetencionBusqueda= new JButtonMe();
		this.jButtondebito_mone_localRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localRetencionBusqueda.setText("U");
		this.jButtondebito_mone_localRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localRetencionBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localRetencion = new JLabelMe();
		this.jLabelcredito_mone_localRetencion.setText(""+RetencionConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localRetencion.setToolTipText("Credito Local");
		this.jLabelcredito_mone_localRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_mone_localRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_mone_localRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelcredito_mone_localRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextFieldcredito_mone_localRetencion= new JTextFieldMe();
		jTextFieldcredito_mone_localRetencion.setEnabled(false);
		jTextFieldcredito_mone_localRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localRetencion.setText("0.0");

		this.jButtoncredito_mone_localRetencionBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localRetencionBusqueda.setText("U");
		this.jButtoncredito_mone_localRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localRetencionBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_extraRetencion = new JLabelMe();
		this.jLabeldebito_mone_extraRetencion.setText(""+RetencionConstantesFunciones.LABEL_DEBITOMONEEXTRA+" : *");
		this.jLabeldebito_mone_extraRetencion.setToolTipText("Debito Extran");
		this.jLabeldebito_mone_extraRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_mone_extraRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_mone_extraRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_extraRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_extraRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_extraRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_DEBITOMONEEXTRA);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPaneldebito_mone_extraRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextFielddebito_mone_extraRetencion= new JTextFieldMe();
		jTextFielddebito_mone_extraRetencion.setEnabled(false);
		jTextFielddebito_mone_extraRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_extraRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_extraRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_extraRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_extraRetencion.setText("0.0");

		this.jButtondebito_mone_extraRetencionBusqueda= new JButtonMe();
		this.jButtondebito_mone_extraRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_extraRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_extraRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_extraRetencionBusqueda.setText("U");
		this.jButtondebito_mone_extraRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_extraRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_extraRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_extraRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_extraRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_extraRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_extraRetencionBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_extraRetencion = new JLabelMe();
		this.jLabelcredito_mone_extraRetencion.setText(""+RetencionConstantesFunciones.LABEL_CREDITOMONEEXTRA+" : *");
		this.jLabelcredito_mone_extraRetencion.setToolTipText("Credito Extran");
		this.jLabelcredito_mone_extraRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_mone_extraRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_mone_extraRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_extraRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_extraRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_extraRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_CREDITOMONEEXTRA);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelcredito_mone_extraRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextFieldcredito_mone_extraRetencion= new JTextFieldMe();
		jTextFieldcredito_mone_extraRetencion.setEnabled(false);
		jTextFieldcredito_mone_extraRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_extraRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_extraRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_extraRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_extraRetencion.setText("0.0");

		this.jButtoncredito_mone_extraRetencionBusqueda= new JButtonMe();
		this.jButtoncredito_mone_extraRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_extraRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_extraRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_extraRetencionBusqueda.setText("U");
		this.jButtoncredito_mone_extraRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_extraRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_extraRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_extraRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_extraRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_extraRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_extraRetencionBusqueda.setVisible(false);		}


					
		this.jLabelcotizacionRetencion = new JLabelMe();
		this.jLabelcotizacionRetencion.setText(""+RetencionConstantesFunciones.LABEL_COTIZACION+" : *");
		this.jLabelcotizacionRetencion.setToolTipText("Cotizacion");
		this.jLabelcotizacionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcotizacionRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcotizacionRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcotizacionRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_COTIZACION);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelcotizacionRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextFieldcotizacionRetencion= new JTextFieldMe();
		jTextFieldcotizacionRetencion.setEnabled(false);
		jTextFieldcotizacionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcotizacionRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcotizacionRetencion.setText("0.0");

		this.jButtoncotizacionRetencionBusqueda= new JButtonMe();
		this.jButtoncotizacionRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncotizacionRetencionBusqueda.setText("U");
		this.jButtoncotizacionRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncotizacionRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncotizacionRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcotizacionRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcotizacionRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cotizacionRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncotizacionRetencionBusqueda.setVisible(false);		}


					
		this.jLabelnombre_benefRetencion = new JLabelMe();
		this.jLabelnombre_benefRetencion.setText(""+RetencionConstantesFunciones.LABEL_NOMBREBENEF+" : *");
		this.jLabelnombre_benefRetencion.setToolTipText("Nombre");
		this.jLabelnombre_benefRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_benefRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_benefRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_benefRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_benefRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_benefRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_NOMBREBENEF);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelnombre_benefRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextAreanombre_benefRetencion= new JTextAreaMe();
		jTextAreanombre_benefRetencion.setEnabled(false);
		jTextAreanombre_benefRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefRetencion.setLineWrap(true);
		jTextAreanombre_benefRetencion.setWrapStyleWord(true);
		jTextAreanombre_benefRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_benefRetencion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_benefRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_benefRetencion = new JScrollPane(jTextAreanombre_benefRetencion);
		jscrollPanenombre_benefRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_benefRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_benefRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_benefRetencionBusqueda= new JButtonMe();
		this.jButtonnombre_benefRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_benefRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_benefRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_benefRetencionBusqueda.setText("U");
		this.jButtonnombre_benefRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_benefRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_benefRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_benefRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_benefRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_benefRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_benefRetencionBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_benefRetencion = new JLabelMe();
		this.jLabeldireccion_benefRetencion.setText(""+RetencionConstantesFunciones.LABEL_DIRECCIONBENEF+" :");
		this.jLabeldireccion_benefRetencion.setToolTipText("Direccion");
		this.jLabeldireccion_benefRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccion_benefRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccion_benefRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_benefRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_benefRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_benefRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_DIRECCIONBENEF);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPaneldireccion_benefRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextAreadireccion_benefRetencion= new JTextAreaMe();
		jTextAreadireccion_benefRetencion.setEnabled(false);
		jTextAreadireccion_benefRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_benefRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_benefRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_benefRetencion.setLineWrap(true);
		jTextAreadireccion_benefRetencion.setWrapStyleWord(true);
		jTextAreadireccion_benefRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_benefRetencion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_benefRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_benefRetencion = new JScrollPane(jTextAreadireccion_benefRetencion);
		jscrollPanedireccion_benefRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccion_benefRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccion_benefRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccion_benefRetencionBusqueda= new JButtonMe();
		this.jButtondireccion_benefRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_benefRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_benefRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_benefRetencionBusqueda.setText("U");
		this.jButtondireccion_benefRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_benefRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_benefRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_benefRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_benefRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_benefRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_benefRetencionBusqueda.setVisible(false);		}


					
		this.jLabelruc_benefRetencion = new JLabelMe();
		this.jLabelruc_benefRetencion.setText(""+RetencionConstantesFunciones.LABEL_RUCBENEF+" :");
		this.jLabelruc_benefRetencion.setToolTipText("Ruc");
		this.jLabelruc_benefRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_benefRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_benefRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_benefRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_benefRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_benefRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_RUCBENEF);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelruc_benefRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextFieldruc_benefRetencion= new JTextFieldMe();

		jTextFieldruc_benefRetencion.setEnabled(false);
		jTextFieldruc_benefRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_benefRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_benefRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_benefRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_benefRetencionBusqueda= new JButtonMe();
		this.jButtonruc_benefRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_benefRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_benefRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_benefRetencionBusqueda.setText("U");
		this.jButtonruc_benefRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_benefRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_benefRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_benefRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_benefRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_benefRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_benefRetencionBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_benefRetencion = new JLabelMe();
		this.jLabeltelefono_benefRetencion.setText(""+RetencionConstantesFunciones.LABEL_TELEFONOBENEF+" :");
		this.jLabeltelefono_benefRetencion.setToolTipText("Telefono");
		this.jLabeltelefono_benefRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefono_benefRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefono_benefRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_benefRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_benefRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_benefRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_TELEFONOBENEF);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPaneltelefono_benefRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextAreatelefono_benefRetencion= new JTextAreaMe();
		jTextAreatelefono_benefRetencion.setEnabled(false);
		jTextAreatelefono_benefRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_benefRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_benefRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_benefRetencion.setLineWrap(true);
		jTextAreatelefono_benefRetencion.setWrapStyleWord(true);
		jTextAreatelefono_benefRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_benefRetencion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_benefRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_benefRetencion = new JScrollPane(jTextAreatelefono_benefRetencion);
		jscrollPanetelefono_benefRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefono_benefRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefono_benefRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontelefono_benefRetencionBusqueda= new JButtonMe();
		this.jButtontelefono_benefRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_benefRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_benefRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_benefRetencionBusqueda.setText("U");
		this.jButtontelefono_benefRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_benefRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_benefRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_benefRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_benefRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_benefRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_benefRetencionBusqueda.setVisible(false);		}


					
		this.jLabelfechaRetencion = new JLabelMe();
		this.jLabelfechaRetencion.setText(""+RetencionConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaRetencion.setToolTipText("Fecha");
		this.jLabelfechaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelfechaRetencion.setLayout(this.gridaBagLayoutRetencion);


		//jFormattedTextFieldfechaRetencion= new JFormattedTextFieldMe();

		jDateChooserfechaRetencion= new JDateChooser();
		jDateChooserfechaRetencion.setEnabled(false);
		jDateChooserfechaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaRetencion.setDate(new Date());
		jDateChooserfechaRetencion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaRetencion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaRetencionBusqueda= new JButtonMe();
		this.jButtonfechaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaRetencionBusqueda.setText("U");
		this.jButtonfechaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaRetencionBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioRetencion = new JLabelMe();
		this.jLabelbeneficiarioRetencion.setText(""+RetencionConstantesFunciones.LABEL_BENEFICIARIO+" : *");
		this.jLabelbeneficiarioRetencion.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelbeneficiarioRetencion.setLayout(this.gridaBagLayoutRetencion);


		jTextAreabeneficiarioRetencion= new JTextAreaMe();
		jTextAreabeneficiarioRetencion.setEnabled(false);
		jTextAreabeneficiarioRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioRetencion.setLineWrap(true);
		jTextAreabeneficiarioRetencion.setWrapStyleWord(true);
		jTextAreabeneficiarioRetencion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioRetencion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioRetencion = new JScrollPane(jTextAreabeneficiarioRetencion);
		jscrollPanebeneficiarioRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonbeneficiarioRetencionBusqueda= new JButtonMe();
		this.jButtonbeneficiarioRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioRetencionBusqueda.setText("U");
		this.jButtonbeneficiarioRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioRetencionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRetencion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRetencion = new JLabelMe();
		this.jLabelid_empresaRetencion.setText(""+RetencionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRetencion.setToolTipText("Empresa");
		this.jLabelid_empresaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelid_empresaRetencion.setLayout(this.gridaBagLayoutRetencion);


		jComboBoxid_empresaRetencion= new JComboBoxMe();
		jComboBoxid_empresaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRetencion.setEnabled(false);

		this.jButtonid_empresaRetencion= new JButtonMe();
		this.jButtonid_empresaRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRetencion.setText("Buscar");
		this.jButtonid_empresaRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencion"));

		this.jButtonid_empresaRetencionBusqueda= new JButtonMe();
		this.jButtonid_empresaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRetencionBusqueda.setText("U");
		this.jButtonid_empresaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRetencionBusqueda.setVisible(false);		}

		this.jButtonid_empresaRetencionUpdate= new JButtonMe();
		this.jButtonid_empresaRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRetencionUpdate.setText("U");
		this.jButtonid_empresaRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRetencionUpdate"));



					
		this.jLabelid_sucursalRetencion = new JLabelMe();
		this.jLabelid_sucursalRetencion.setText(""+RetencionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalRetencion.setToolTipText("Sucursal");
		this.jLabelid_sucursalRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelid_sucursalRetencion.setLayout(this.gridaBagLayoutRetencion);


		jComboBoxid_sucursalRetencion= new JComboBoxMe();
		jComboBoxid_sucursalRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalRetencion.setEnabled(false);

		this.jButtonid_sucursalRetencion= new JButtonMe();
		this.jButtonid_sucursalRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRetencion.setText("Buscar");
		this.jButtonid_sucursalRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRetencion"));

		this.jButtonid_sucursalRetencionBusqueda= new JButtonMe();
		this.jButtonid_sucursalRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRetencionBusqueda.setText("U");
		this.jButtonid_sucursalRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalRetencionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalRetencionUpdate= new JButtonMe();
		this.jButtonid_sucursalRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRetencionUpdate.setText("U");
		this.jButtonid_sucursalRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRetencionUpdate"));



					
		this.jLabelid_ejercicioRetencion = new JLabelMe();
		this.jLabelid_ejercicioRetencion.setText(""+RetencionConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioRetencion.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelid_ejercicioRetencion.setLayout(this.gridaBagLayoutRetencion);


		jComboBoxid_ejercicioRetencion= new JComboBoxMe();
		jComboBoxid_ejercicioRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioRetencion.setEnabled(false);

		this.jButtonid_ejercicioRetencion= new JButtonMe();
		this.jButtonid_ejercicioRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRetencion.setText("Buscar");
		this.jButtonid_ejercicioRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRetencion"));

		this.jButtonid_ejercicioRetencionBusqueda= new JButtonMe();
		this.jButtonid_ejercicioRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioRetencionBusqueda.setText("U");
		this.jButtonid_ejercicioRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioRetencionBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioRetencionUpdate= new JButtonMe();
		this.jButtonid_ejercicioRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioRetencionUpdate.setText("U");
		this.jButtonid_ejercicioRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRetencionUpdate"));



					
		this.jLabelid_periodoRetencion = new JLabelMe();
		this.jLabelid_periodoRetencion.setText(""+RetencionConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoRetencion.setToolTipText("Periodo");
		this.jLabelid_periodoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelid_periodoRetencion.setLayout(this.gridaBagLayoutRetencion);


		jComboBoxid_periodoRetencion= new JComboBoxMe();
		jComboBoxid_periodoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoRetencion.setEnabled(false);

		this.jButtonid_periodoRetencion= new JButtonMe();
		this.jButtonid_periodoRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRetencion.setText("Buscar");
		this.jButtonid_periodoRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRetencion"));

		this.jButtonid_periodoRetencionBusqueda= new JButtonMe();
		this.jButtonid_periodoRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoRetencionBusqueda.setText("U");
		this.jButtonid_periodoRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoRetencionBusqueda.setVisible(false);		}

		this.jButtonid_periodoRetencionUpdate= new JButtonMe();
		this.jButtonid_periodoRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoRetencionUpdate.setText("U");
		this.jButtonid_periodoRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRetencionUpdate"));



					
		this.jLabelid_anioRetencion = new JLabelMe();
		this.jLabelid_anioRetencion.setText(""+RetencionConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioRetencion.setToolTipText("Anio");
		this.jLabelid_anioRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelid_anioRetencion.setLayout(this.gridaBagLayoutRetencion);


		jComboBoxid_anioRetencion= new JComboBoxMe();
		jComboBoxid_anioRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioRetencion.setEnabled(false);

		this.jButtonid_anioRetencion= new JButtonMe();
		this.jButtonid_anioRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioRetencion.setText("Buscar");
		this.jButtonid_anioRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioRetencion"));

		this.jButtonid_anioRetencionBusqueda= new JButtonMe();
		this.jButtonid_anioRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioRetencionBusqueda.setText("U");
		this.jButtonid_anioRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioRetencionBusqueda.setVisible(false);		}

		this.jButtonid_anioRetencionUpdate= new JButtonMe();
		this.jButtonid_anioRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioRetencionUpdate.setText("U");
		this.jButtonid_anioRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioRetencionUpdate"));



					
		this.jLabelid_mesRetencion = new JLabelMe();
		this.jLabelid_mesRetencion.setText(""+RetencionConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesRetencion.setToolTipText("Mes");
		this.jLabelid_mesRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelid_mesRetencion.setLayout(this.gridaBagLayoutRetencion);


		jComboBoxid_mesRetencion= new JComboBoxMe();
		jComboBoxid_mesRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesRetencion.setEnabled(false);

		this.jButtonid_mesRetencion= new JButtonMe();
		this.jButtonid_mesRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesRetencion.setText("Buscar");
		this.jButtonid_mesRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesRetencion"));

		this.jButtonid_mesRetencionBusqueda= new JButtonMe();
		this.jButtonid_mesRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesRetencionBusqueda.setText("U");
		this.jButtonid_mesRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesRetencionBusqueda.setVisible(false);		}

		this.jButtonid_mesRetencionUpdate= new JButtonMe();
		this.jButtonid_mesRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesRetencionUpdate.setText("U");
		this.jButtonid_mesRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesRetencionUpdate"));



					
		this.jLabelid_asiento_contableRetencion = new JLabelMe();
		this.jLabelid_asiento_contableRetencion.setText(""+RetencionConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableRetencion.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelid_asiento_contableRetencion.setLayout(this.gridaBagLayoutRetencion);


		jComboBoxid_asiento_contableRetencion= new JComboBoxMe();
		jComboBoxid_asiento_contableRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableRetencion= new JButtonMe();
		this.jButtonid_asiento_contableRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableRetencion.setText("Buscar");
		this.jButtonid_asiento_contableRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableRetencion"));

		this.jButtonid_asiento_contableRetencionBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableRetencionBusqueda.setText("U");
		this.jButtonid_asiento_contableRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableRetencionBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableRetencionUpdate= new JButtonMe();
		this.jButtonid_asiento_contableRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableRetencionUpdate.setText("U");
		this.jButtonid_asiento_contableRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableRetencionUpdate"));



					
		this.jLabelid_tipo_retencionRetencion = new JLabelMe();
		this.jLabelid_tipo_retencionRetencion.setText(""+RetencionConstantesFunciones.LABEL_IDTIPORETENCION+" : *");
		this.jLabelid_tipo_retencionRetencion.setToolTipText("Tipo Retencion");
		this.jLabelid_tipo_retencionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencionRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencionRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_IDTIPORETENCION);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelid_tipo_retencionRetencion.setLayout(this.gridaBagLayoutRetencion);


		jComboBoxid_tipo_retencionRetencion= new JComboBoxMe();
		jComboBoxid_tipo_retencionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencionRetencion= new JButtonMe();
		this.jButtonid_tipo_retencionRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionRetencion.setText("Buscar");
		this.jButtonid_tipo_retencionRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencionRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencionRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionRetencion"));

		this.jButtonid_tipo_retencionRetencionBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencionRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionRetencionBusqueda.setText("U");
		this.jButtonid_tipo_retencionRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencionRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencionRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencionRetencionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencionRetencionUpdate= new JButtonMe();
		this.jButtonid_tipo_retencionRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionRetencionUpdate.setText("U");
		this.jButtonid_tipo_retencionRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencionRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencionRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionRetencionUpdate"));



					
		this.jLabelid_clienteRetencion = new JLabelMe();
		this.jLabelid_clienteRetencion.setText(""+RetencionConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteRetencion.setToolTipText("Proveedor");
		this.jLabelid_clienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelid_clienteRetencion.setLayout(this.gridaBagLayoutRetencion);


		jComboBoxid_clienteRetencion= new JComboBoxMe();
		jComboBoxid_clienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteRetencion= new JButtonMe();
		this.jButtonid_clienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteRetencion.setText("Buscar");
		this.jButtonid_clienteRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteRetencion"));

		this.jButtonid_clienteRetencionBusqueda= new JButtonMe();
		this.jButtonid_clienteRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteRetencionBusqueda.setText("U");
		this.jButtonid_clienteRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteRetencionBusqueda.setVisible(false);		}

		this.jButtonid_clienteRetencionUpdate= new JButtonMe();
		this.jButtonid_clienteRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteRetencionUpdate.setText("U");
		this.jButtonid_clienteRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteRetencionUpdate"));



					
		this.jLabelid_facturaRetencion = new JLabelMe();
		this.jLabelid_facturaRetencion.setText(""+RetencionConstantesFunciones.LABEL_IDFACTURA+" :");
		this.jLabelid_facturaRetencion.setToolTipText("Factura");
		this.jLabelid_facturaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelid_facturaRetencion.setLayout(this.gridaBagLayoutRetencion);


		jComboBoxid_facturaRetencion= new JComboBoxMe();
		jComboBoxid_facturaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaRetencion= new JButtonMe();
		this.jButtonid_facturaRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaRetencion.setText("Buscar");
		this.jButtonid_facturaRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaRetencion"));

		this.jButtonid_facturaRetencionBusqueda= new JButtonMe();
		this.jButtonid_facturaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaRetencionBusqueda.setText("U");
		this.jButtonid_facturaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaRetencionBusqueda.setVisible(false);		}

		this.jButtonid_facturaRetencionUpdate= new JButtonMe();
		this.jButtonid_facturaRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaRetencionUpdate.setText("U");
		this.jButtonid_facturaRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaRetencionUpdate"));



					
		this.jLabelid_monedaRetencion = new JLabelMe();
		this.jLabelid_monedaRetencion.setText(""+RetencionConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaRetencion.setToolTipText("Moneda");
		this.jLabelid_monedaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelid_monedaRetencion.setLayout(this.gridaBagLayoutRetencion);


		jComboBoxid_monedaRetencion= new JComboBoxMe();
		jComboBoxid_monedaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaRetencion= new JButtonMe();
		this.jButtonid_monedaRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaRetencion.setText("Buscar");
		this.jButtonid_monedaRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaRetencion"));

		this.jButtonid_monedaRetencionBusqueda= new JButtonMe();
		this.jButtonid_monedaRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaRetencionBusqueda.setText("U");
		this.jButtonid_monedaRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaRetencionBusqueda.setVisible(false);		}

		this.jButtonid_monedaRetencionUpdate= new JButtonMe();
		this.jButtonid_monedaRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaRetencionUpdate.setText("U");
		this.jButtonid_monedaRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaRetencionUpdate"));



					
		this.jLabelid_cuenta_contable_retencionRetencion = new JLabelMe();
		this.jLabelid_cuenta_contable_retencionRetencion.setText(""+RetencionConstantesFunciones.LABEL_IDCUENTACONTABLERETENCION+" : *");
		this.jLabelid_cuenta_contable_retencionRetencion.setToolTipText("Cuenta Retencion");
		this.jLabelid_cuenta_contable_retencionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_retencionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_retencionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_retencionRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_retencionRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_retencionRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_IDCUENTACONTABLERETENCION);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelid_cuenta_contable_retencionRetencion.setLayout(this.gridaBagLayoutRetencion);


		jComboBoxid_cuenta_contable_retencionRetencion= new JComboBoxMe();
		jComboBoxid_cuenta_contable_retencionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_retencionRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cuenta_contable_retencionRetencion.setEnabled(false);

		this.jButtonid_cuenta_contable_retencionRetencion= new JButtonMe();
		this.jButtonid_cuenta_contable_retencionRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencionRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencionRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencionRetencion.setText("Buscar");
		this.jButtonid_cuenta_contable_retencionRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_retencionRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencionRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_retencionRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencionRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencionRetencion"));

		this.jButtonid_cuenta_contable_retencionRetencionBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_retencionRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencionRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencionRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_retencionRetencionBusqueda.setText("U");
		this.jButtonid_cuenta_contable_retencionRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_retencionRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencionRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_retencionRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencionRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencionRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_retencionRetencionBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_retencionRetencionUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_retencionRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencionRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencionRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_retencionRetencionUpdate.setText("U");
		this.jButtonid_cuenta_contable_retencionRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_retencionRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencionRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_retencionRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencionRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencionRetencionUpdate"));


		jButtonid_cuenta_contable_retencionRetencionArbol= new JButtonMe();
		jButtonid_cuenta_contable_retencionRetencionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencionRetencionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencionRetencionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencionRetencionArbol.setText("Arbol");
		jButtonid_cuenta_contable_retencionRetencionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_retencionRetencionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencionRetencionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_retencionRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencionRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencionRetencionArbol"));



					
		this.jLabelid_estado_retencionRetencion = new JLabelMe();
		this.jLabelid_estado_retencionRetencion.setText(""+RetencionConstantesFunciones.LABEL_IDESTADORETENCION+" : *");
		this.jLabelid_estado_retencionRetencion.setToolTipText("Estado Retencion");
		this.jLabelid_estado_retencionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_retencionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_retencionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_retencionRetencion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_retencionRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_retencionRetencion.setToolTipText(RetencionConstantesFunciones.LABEL_IDESTADORETENCION);
		this.gridaBagLayoutRetencion = new GridBagLayout();
		this.jPanelid_estado_retencionRetencion.setLayout(this.gridaBagLayoutRetencion);


		jComboBoxid_estado_retencionRetencion= new JComboBoxMe();
		jComboBoxid_estado_retencionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_retencionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_retencionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_retencionRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_retencionRetencion.setEnabled(false);

		this.jButtonid_estado_retencionRetencion= new JButtonMe();
		this.jButtonid_estado_retencionRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_retencionRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_retencionRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_retencionRetencion.setText("Buscar");
		this.jButtonid_estado_retencionRetencion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_retencionRetencion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_retencionRetencion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_retencionRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_retencionRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_retencionRetencion"));

		this.jButtonid_estado_retencionRetencionBusqueda= new JButtonMe();
		this.jButtonid_estado_retencionRetencionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_retencionRetencionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_retencionRetencionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_retencionRetencionBusqueda.setText("U");
		this.jButtonid_estado_retencionRetencionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_retencionRetencionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_retencionRetencionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_retencionRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_retencionRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_retencionRetencionBusqueda"));

		if(this.retencionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_retencionRetencionBusqueda.setVisible(false);		}

		this.jButtonid_estado_retencionRetencionUpdate= new JButtonMe();
		this.jButtonid_estado_retencionRetencionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_retencionRetencionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_retencionRetencionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_retencionRetencionUpdate.setText("U");
		this.jButtonid_estado_retencionRetencionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_retencionRetencionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_retencionRetencionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_retencionRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_retencionRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_retencionRetencionUpdate"));



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
		
		/*
		this.inicializarToolBar();		
		*/
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleRetencion = new RetencionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Retencion DATOS");
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutRetencion= new GridBagLayout();
		

		
		String sToolTipRetencion="";
		sToolTipRetencion=RetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRetencion+="(Facturacion.Retencion)";
		}
		
		if(!this.retencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipRetencion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRetencion = new JButtonMe();
		this.jButtonModificarRetencion = new JButtonMe();
        this.jButtonActualizarRetencion = new JButtonMe();
        this.jButtonEliminarRetencion = new JButtonMe();
        this.jButtonCancelarRetencion = new JButtonMe();
        this.jButtonGuardarCambiosRetencion = new JButtonMe();
		this.jButtonGuardarCambiosTablaRetencion = new JButtonMe();
		this.jButtonCerrarRetencion = new JButtonMe();
		
		this.jScrollPanelDatosRetencion = new JScrollPane();   
        this.jScrollPanelDatosEdicionRetencion = new JScrollPane();
		this.jScrollPanelDatosGeneralRetencion = new JScrollPane();
				
		
		
		this.jPanelCamposRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposRetencion=new JTabbedPane();
		
		
		this.jTabbedPaneCamposRetencion.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciobeneficiarioRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Retencion";
		
		if(!this.retencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones" + this.sPath));
		} else {
			this.jScrollPanelDatosRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRetencion.setName("jPanelCamposRetencion"); 

		this.jPanelCamposOcultosRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRetencion.setName("jPanelCamposOcultosRetencion"); 

        this.jPanelAccionesRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRetencion.setToolTipText("Acciones");
        this.jPanelAccionesRetencion.setName("Acciones"); 

		this.jPanelAccionesFormularioRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRetencion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRetencion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralRetencion.setName("jPanelCamposFingeneralRetencion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralRetencion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciobeneficiarioRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Beneficiario"));
		this.jPanelCamposIniciobeneficiarioRetencion.setName("jPanelCamposFinbeneficiarioRetencion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciobeneficiarioRetencion, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRetencion.setText("Nuevo");
		this.jButtonModificarRetencion.setText("Editar");
        this.jButtonActualizarRetencion.setText("Actualizar");
        this.jButtonEliminarRetencion.setText("Eliminar");
        this.jButtonCancelarRetencion.setText("Cancelar");
        this.jButtonGuardarCambiosRetencion.setText("Guardar");
		this.jButtonGuardarCambiosTablaRetencion.setText("Guardar");
		this.jButtonCerrarRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRetencion,"nuevo_button","Nuevo",this.retencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRetencion,"modificar_button","Editar",this.retencionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRetencion,"actualizar_button","Actualizar",this.retencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRetencion,"eliminar_button","Eliminar",this.retencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRetencion,"cancelar_button","Cancelar",this.retencionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRetencion,"guardarcambios_button","Guardar",this.retencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRetencion,"guardarcambiostabla_button","Guardar",this.retencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRetencion,"cerrar_button","Salir",this.retencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRetencion.setToolTipText("Nuevo"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRetencion.setToolTipText("Editar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRetencion.setToolTipText("Actualizar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRetencion.setToolTipText("Eliminar)"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRetencion.setToolTipText("Cancelar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRetencion.setToolTipText("Guardar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRetencion.setToolTipText("Guardar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRetencion.setToolTipText("Salir"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRetencion";
		inputMap = this.jButtonNuevoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRetencion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRetencion";
		inputMap = this.jButtonActualizarRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRetencion"));
		
		//ELIMINAR
		sMapKey = "EliminarRetencion";
		inputMap = this.jButtonEliminarRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRetencion"));
		
		//CANCELAR	
		sMapKey = "CancelarRetencion";
		inputMap = this.jButtonCancelarRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRetencion"));
		
		//CERRAR		
		sMapKey = "CerrarRetencion";
		inputMap = this.jButtonCerrarRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRetencion";
		inputMap = this.jButtonGuardarCambiosTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRetencion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRetencion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRetencion.setToolTipText("Nuevo Retencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRetencion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRetencion.setToolTipText("Sin Cerrar Ventana Retencion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRetencion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRetencion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRetencion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRetencion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
		/*	
			
		this.jComboBoxTiposAccionesRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRetencion.setText("Accion");
		this.jComboBoxTiposAccionesRetencion.setToolTipText("Tipos de Acciones");
							
		*/

		this.jComboBoxTiposAccionesFormularioRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRetencion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRetencion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRetencion = new JLabelMe();
		
		this.jLabelAccionesRetencion.setText("Acciones");		
		this.jLabelAccionesRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRetencion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRetencion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRetencion=new JTabbedPane();
		this.jTabbedPaneRelacionesRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRetencion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		/*
		this.jComboBoxTiposAccionesRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		*/
		
		this.jComboBoxTiposAccionesFormularioRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRetencion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRetencion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRetencion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRetencion = new GridBagLayout();
		
		this.jPanelCamposRetencion.setLayout(gridaBagLayoutCamposRetencion);
		this.jPanelCamposOcultosRetencion.setLayout(gridaBagLayoutCamposOcultosRetencion);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralRetencion= new GridBagLayout();
		this.jPanelCamposIniciogeneralRetencion.setLayout(gridaBagLayoutCamposIniciogeneralRetencion);

		GridBagLayout gridaBagLayoutCamposIniciobeneficiarioRetencion= new GridBagLayout();
		this.jPanelCamposIniciobeneficiarioRetencion.setLayout(gridaBagLayoutCamposIniciobeneficiarioRetencion);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidRetencion.add(jLabelIdRetencion, this.gridBagConstraintsRetencion);



	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidRetencion.add(jLabelidRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaRetencion.add(jLabelid_empresaRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRetencion.add(jButtonid_empresaRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 3;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRetencion.add(jButtonid_empresaRetencionUpdate, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaRetencion.add(jComboBoxid_empresaRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalRetencion.add(jLabelid_sucursalRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRetencion.add(jButtonid_sucursalRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 3;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRetencion.add(jButtonid_sucursalRetencionUpdate, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalRetencion.add(jComboBoxid_sucursalRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioRetencion.add(jLabelid_ejercicioRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioRetencion.add(jButtonid_ejercicioRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 3;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioRetencion.add(jButtonid_ejercicioRetencionUpdate, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioRetencion.add(jComboBoxid_ejercicioRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoRetencion.add(jLabelid_periodoRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoRetencion.add(jButtonid_periodoRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 3;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoRetencion.add(jButtonid_periodoRetencionUpdate, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoRetencion.add(jComboBoxid_periodoRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioRetencion.add(jLabelid_anioRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioRetencion.add(jButtonid_anioRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 3;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioRetencion.add(jButtonid_anioRetencionUpdate, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioRetencion.add(jComboBoxid_anioRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesRetencion.add(jLabelid_mesRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesRetencion.add(jButtonid_mesRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 3;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesRetencion.add(jButtonid_mesRetencionUpdate, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesRetencion.add(jComboBoxid_mesRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_asiento_contableRetencion.add(jLabelid_asiento_contableRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 2;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableRetencion.add(jButtonid_asiento_contableRetencion, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 3;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableRetencion.add(jButtonid_asiento_contableRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 4;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableRetencion.add(jButtonid_asiento_contableRetencionUpdate, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_asiento_contableRetencion.add(jComboBoxid_asiento_contableRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_retencionRetencion.add(jLabelid_tipo_retencionRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionRetencion.add(jButtonid_tipo_retencionRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 3;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionRetencion.add(jButtonid_tipo_retencionRetencionUpdate, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_retencionRetencion.add(jComboBoxid_tipo_retencionRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteRetencion.add(jLabelid_clienteRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 2;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteRetencion.add(jButtonid_clienteRetencion, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 3;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteRetencion.add(jButtonid_clienteRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 4;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteRetencion.add(jButtonid_clienteRetencionUpdate, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteRetencion.add(jComboBoxid_clienteRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelporcentajeRetencion.add(jLabelporcentajeRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeRetencion.add(jButtonporcentajeRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelporcentajeRetencion.add(jTextFieldporcentajeRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelbase_imponibleRetencion.add(jLabelbase_imponibleRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_imponibleRetencion.add(jButtonbase_imponibleRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelbase_imponibleRetencion.add(jTextFieldbase_imponibleRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelvalorRetencion.add(jLabelvalorRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorRetencion.add(jButtonvalorRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelvalorRetencion.add(jTextFieldvalorRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumeroRetencion.add(jLabelnumeroRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroRetencion.add(jButtonnumeroRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumeroRetencion.add(jTextFieldnumeroRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_facturaRetencion.add(jLabelid_facturaRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 2;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaRetencion.add(jButtonid_facturaRetencion, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 3;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaRetencion.add(jButtonid_facturaRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 4;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaRetencion.add(jButtonid_facturaRetencionUpdate, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_facturaRetencion.add(jComboBoxid_facturaRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionRetencion.add(jLabeldescripcionRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionRetencion.add(jButtondescripcionRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionRetencion.add(jscrollPanedescripcionRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldebito_mone_localRetencion.add(jLabeldebito_mone_localRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localRetencion.add(jButtondebito_mone_localRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldebito_mone_localRetencion.add(jTextFielddebito_mone_localRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcredito_mone_localRetencion.add(jLabelcredito_mone_localRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localRetencion.add(jButtoncredito_mone_localRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcredito_mone_localRetencion.add(jTextFieldcredito_mone_localRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldebito_mone_extraRetencion.add(jLabeldebito_mone_extraRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_extraRetencion.add(jButtondebito_mone_extraRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldebito_mone_extraRetencion.add(jTextFielddebito_mone_extraRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcredito_mone_extraRetencion.add(jLabelcredito_mone_extraRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_extraRetencion.add(jButtoncredito_mone_extraRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcredito_mone_extraRetencion.add(jTextFieldcredito_mone_extraRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_monedaRetencion.add(jLabelid_monedaRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaRetencion.add(jButtonid_monedaRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 3;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaRetencion.add(jButtonid_monedaRetencionUpdate, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_monedaRetencion.add(jComboBoxid_monedaRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcotizacionRetencion.add(jLabelcotizacionRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcotizacionRetencion.add(jButtoncotizacionRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcotizacionRetencion.add(jTextFieldcotizacionRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnombre_benefRetencion.add(jLabelnombre_benefRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_benefRetencion.add(jButtonnombre_benefRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnombre_benefRetencion.add(jscrollPanenombre_benefRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldireccion_benefRetencion.add(jLabeldireccion_benefRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_benefRetencion.add(jButtondireccion_benefRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldireccion_benefRetencion.add(jscrollPanedireccion_benefRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelruc_benefRetencion.add(jLabelruc_benefRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_benefRetencion.add(jButtonruc_benefRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelruc_benefRetencion.add(jTextFieldruc_benefRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltelefono_benefRetencion.add(jLabeltelefono_benefRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_benefRetencion.add(jButtontelefono_benefRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltelefono_benefRetencion.add(jscrollPanetelefono_benefRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaRetencion.add(jLabelfechaRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaRetencion.add(jButtonfechaRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaRetencion.add(jDateChooserfechaRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cuenta_contable_retencionRetencion.add(jLabelid_cuenta_contable_retencionRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 2;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_retencionRetencion.add(jButtonid_cuenta_contable_retencionRetencion, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 3;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_retencionRetencion.add(jButtonid_cuenta_contable_retencionRetencionArbol, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 4;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_retencionRetencion.add(jButtonid_cuenta_contable_retencionRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 5;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_retencionRetencion.add(jButtonid_cuenta_contable_retencionRetencionUpdate, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cuenta_contable_retencionRetencion.add(jComboBoxid_cuenta_contable_retencionRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_retencionRetencion.add(jLabelid_estado_retencionRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_retencionRetencion.add(jButtonid_estado_retencionRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 3;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_retencionRetencion.add(jButtonid_estado_retencionRetencionUpdate, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_retencionRetencion.add(jComboBoxid_estado_retencionRetencion, this.gridBagConstraintsRetencion);


	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 0;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelbeneficiarioRetencion.add(jLabelbeneficiarioRetencion, this.gridBagConstraintsRetencion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 2;
		this.gridBagConstraintsRetencion.ipadx = 0;
		this.gridBagConstraintsRetencion.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioRetencion.add(jButtonbeneficiarioRetencionBusqueda, this.gridBagConstraintsRetencion);
	}

	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRetencion.gridy = 0;
	this.gridBagConstraintsRetencion.gridx = 1;
	this.gridBagConstraintsRetencion.ipadx = 0;
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelbeneficiarioRetencion.add(jscrollPanebeneficiarioRetencion, this.gridBagConstraintsRetencion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposRetencion.add(this.jPanelid_tipo_retencionRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposRetencion % 2==0) {
		iXPanelCamposRetencion=0;
		iYPanelCamposRetencion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposOcultosRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposOcultosRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosRetencion.add(this.jPanelid_empresaRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposOcultosRetencion % 2==0) {
		iXPanelCamposOcultosRetencion=0;
		iYPanelCamposOcultosRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposOcultosRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposOcultosRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosRetencion.add(this.jPanelid_sucursalRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposOcultosRetencion % 2==0) {
		iXPanelCamposOcultosRetencion=0;
		iYPanelCamposOcultosRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposOcultosRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposOcultosRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosRetencion.add(this.jPanelid_ejercicioRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposOcultosRetencion % 2==0) {
		iXPanelCamposOcultosRetencion=0;
		iYPanelCamposOcultosRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposOcultosRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposOcultosRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosRetencion.add(this.jPanelid_periodoRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposOcultosRetencion % 2==0) {
		iXPanelCamposOcultosRetencion=0;
		iYPanelCamposOcultosRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposOcultosRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposOcultosRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosRetencion.add(this.jPanelid_anioRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposOcultosRetencion % 2==0) {
		iXPanelCamposOcultosRetencion=0;
		iYPanelCamposOcultosRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposOcultosRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposOcultosRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosRetencion.add(this.jPanelid_mesRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposOcultosRetencion % 2==0) {
		iXPanelCamposOcultosRetencion=0;
		iYPanelCamposOcultosRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposOcultosRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposOcultosRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosRetencion.add(this.jPanelfechaRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposOcultosRetencion % 2==0) {
		iXPanelCamposOcultosRetencion=0;
		iYPanelCamposOcultosRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposOcultosRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposOcultosRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosRetencion.add(this.jPanelid_cuenta_contable_retencionRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposOcultosRetencion % 2==0) {
		iXPanelCamposOcultosRetencion=0;
		iYPanelCamposOcultosRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposOcultosRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposOcultosRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosRetencion.add(this.jPanelid_estado_retencionRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposOcultosRetencion % 2==0) {
		iXPanelCamposOcultosRetencion=0;
		iYPanelCamposOcultosRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposOcultosRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposOcultosRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosRetencion.add(this.jPanelbeneficiarioRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposOcultosRetencion % 2==0) {
		iXPanelCamposOcultosRetencion=0;
		iYPanelCamposOcultosRetencion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPanelidRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPanelid_asiento_contableRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPanelid_clienteRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPanelporcentajeRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPanelbase_imponibleRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPanelvalorRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPanelnumeroRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPanelid_facturaRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPaneldescripcionRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPaneldebito_mone_localRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPanelcredito_mone_localRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPaneldebito_mone_extraRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPanelcredito_mone_extraRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPanelid_monedaRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciogeneralRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciogeneralRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralRetencion.add(this.jPanelcotizacionRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciogeneralRetencion % 2==0) {
		iXPanelCamposIniciogeneralRetencion=0;
		iYPanelCamposIniciogeneralRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciobeneficiarioRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciobeneficiarioRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobeneficiarioRetencion.add(this.jPanelnombre_benefRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciobeneficiarioRetencion % 2==0) {
		iXPanelCamposIniciobeneficiarioRetencion=0;
		iYPanelCamposIniciobeneficiarioRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciobeneficiarioRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciobeneficiarioRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobeneficiarioRetencion.add(this.jPaneldireccion_benefRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciobeneficiarioRetencion % 2==0) {
		iXPanelCamposIniciobeneficiarioRetencion=0;
		iYPanelCamposIniciobeneficiarioRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciobeneficiarioRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciobeneficiarioRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobeneficiarioRetencion.add(this.jPanelruc_benefRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciobeneficiarioRetencion % 2==0) {
		iXPanelCamposIniciobeneficiarioRetencion=0;
		iYPanelCamposIniciobeneficiarioRetencion++;
	}
	this.gridBagConstraintsRetencion = new GridBagConstraints();
	this.gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRetencion.gridy = iYPanelCamposIniciobeneficiarioRetencion;
	this.gridBagConstraintsRetencion.gridx = iXPanelCamposIniciobeneficiarioRetencion++;
	this.gridBagConstraintsRetencion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRetencion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobeneficiarioRetencion.add(this.jPaneltelefono_benefRetencion, this.gridBagConstraintsRetencion);



	if(iXPanelCamposIniciobeneficiarioRetencion % 2==0) {
		iXPanelCamposIniciobeneficiarioRetencion=0;
		iYPanelCamposIniciobeneficiarioRetencion++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesRetencion= new GridBagLayout();
		this.jPanelAccionesRetencion.setLayout(gridaBagLayoutAccionesRetencion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRetencion= new GridBagLayout();
		this.jPanelAccionesFormularioRetencion.setLayout(gridaBagLayoutAccionesFormularioRetencion);
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRetencion.add(this.jComboBoxTiposAccionesFormularioRetencion, this.gridBagConstraintsRetencion);

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRetencion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRetencion.add(this.jCheckBoxPostAccionNuevoRetencion, this.gridBagConstraintsRetencion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.retencionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRetencion.add(this.jCheckBoxPostAccionSinCerrarRetencion, this.gridBagConstraintsRetencion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.retencionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.retencionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRetencion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRetencion.add(this.jCheckBoxPostAccionSinMensajeRetencion, this.gridBagConstraintsRetencion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = iPosXAccion++;
			
		this.jPanelAccionesRetencion.add(this.jButtonModificarRetencion, this.gridBagConstraintsRetencion);							

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx =iPosXAccion++;
			
		this.jPanelAccionesRetencion.add(this.jButtonEliminarRetencion, this.gridBagConstraintsRetencion);
		
			
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy = 0;		
		this.gridBagConstraintsRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesRetencion.add(this.jButtonActualizarRetencion, this.gridBagConstraintsRetencion);


		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy = 0;		
		this.gridBagConstraintsRetencion.gridx = iPosXAccion++;
		
		this.jPanelAccionesRetencion.add(this.jButtonGuardarCambiosRetencion, this.gridBagConstraintsRetencion);	
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy = 0;		
		this.gridBagConstraintsRetencion.gridx =iPosXAccion++;
		
		this.jPanelAccionesRetencion.add(this.jButtonCancelarRetencion, this.gridBagConstraintsRetencion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRetencion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.retencionSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsRetencion = new GridBagConstraints();						
			this.gridBagConstraintsRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencion.gridx = 0;		
			//this.gridBagConstraintsRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRetencion.ipadx = 100;
				
			*/
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRetencion.gridx =0;
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRetencion, this.gridBagConstraintsRetencion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RetencionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRetencion = new RetencionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Retencion DATOS");
			
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
		    
			RetencionModel retencionModel=new RetencionModel(this);
			
			//SI USARA CLASE INTERNA
			//RetencionModel.RetencionFocusTraversalPolicy retencionFocusTraversalPolicy = retencionModel.new RetencionFocusTraversalPolicy(this);
			
			//retencionFocusTraversalPolicy.setretencionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(retencionModel);
			
			
			this.jContentPaneDetalleRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRetencion = new GridBagLayout();	
			this.jContentPaneDetalleRetencion.setLayout(gridaBagLayoutDetalleRetencion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRetencion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				/*
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRetencion = new GridBagConstraints();
				this.gridBagConstraintsRetencion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRetencion.gridx = 0;
					
				
				this.jContentPaneDetalleRetencion.add(jTtoolBarDetalleRetencion, gridBagConstraintsRetencion);								
				*/
}
			
			this.jScrollPanelDatosEdicionRetencion=   new JScrollPane(jContentPaneDetalleRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposRetencion.add("General",this.jPanelCamposIniciogeneralRetencion);
		this.jTabbedPaneCamposRetencion.add("Beneficiario",this.jPanelCamposIniciobeneficiarioRetencion);
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
						
			this.gridBagConstraintsRetencion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRetencion.gridx = 0;
	        
			this.jContentPaneDetalleRetencion.add(jTabbedPaneCamposRetencion, gridBagConstraintsRetencion);
			
			
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
						&& retencionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.retencionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRetencion= new GridBagConstraints();
						this.gridBagConstraintsRetencion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRetencion.gridx = 0;
						this.jContentPaneDetalleRetencion.add(this.jTabbedPaneRelacionesRetencion, this.gridBagConstraintsRetencion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRetencion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRetencion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRetencion = new GridBagConstraints();
					this.gridBagConstraintsRetencion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRetencion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRetencion.gridx = 0;
					
				
					this.jContentPaneDetalleRetencion.add(jPanelCamposOcultosRetencion, gridBagConstraintsRetencion);
				
					this.jPanelCamposOcultosRetencion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRetencion.gridx = 0;
	        this.gridBagConstraintsRetencion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRetencion.add(this.jPanelAccionesFormularioRetencion, this.gridBagConstraintsRetencion);							
			
			
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
	        this.gridBagConstraintsRetencion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRetencion.gridx = 0;
	        
			
			this.jContentPaneDetalleRetencion.add(this.jPanelAccionesRetencion, this.gridBagConstraintsRetencion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRetencion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRetencion=   new JScrollPane(this.jPanelCamposRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRetencion.gridx = 0;
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRetencion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRetencion, this.gridBagConstraintsRetencion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRetencion, this.gridBagConstraintsRetencion);			
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRetencion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRetencion, this.gridBagConstraintsRetencion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRetencion, this.gridBagConstraintsRetencion);
			
			
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRetencion, this.gridBagConstraintsRetencion);
		
			
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRetencion, this.gridBagConstraintsRetencion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRetencion;//jContentPane;
		
		return jScrollPanelDatosEdicionRetencion;
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
