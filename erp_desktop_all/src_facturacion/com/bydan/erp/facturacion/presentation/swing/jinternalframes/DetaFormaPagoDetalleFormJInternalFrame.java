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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.DetaFormaPagoConstantesFunciones;

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
public class DetaFormaPagoDetalleFormJInternalFrame extends DetaFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetaFormaPago;
	
	protected JMenuBar jmenuBarDetalleDetaFormaPago;
	
	protected JMenu jmenuDetalleDetaFormaPago;
	protected JMenu jmenuDetalleArchivoDetaFormaPago;
	protected JMenu jmenuDetalleAccionesDetaFormaPago;
	protected JMenu jmenuDetalleDatosDetaFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetaFormaPago;	
	protected GridBagConstraints gridBagConstraintsDetaFormaPago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetaFormaPagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetaFormaPago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected TipoDetaFormaPagoBeanSwingJInternalFrame tipodetaformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodetaformapago="";

	protected DetaFormaPagoFactuBeanSwingJInternalFrame detaformapagofactuBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detaformapagofactu="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetaFormaPagoSessionBean detaformapagoSessionBean;
	
	

	public BancoFormaPagoBeanSwingJInternalFrame bancoformapagoBeanSwingJInternalFrame=null;
	public BancoFormaPagoBeanSwingJInternalFrame bancoformapagoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteBancoFormaPago=false;
	public BancoFormaPagoSessionBean bancoformapagoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public TipoDetaFormaPagoSessionBean tipodetaformapagoSessionBean;
	public DetaFormaPagoFactuSessionBean detaformapagofactuSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public DetaFormaPagoLogic detaformapagoLogic;
	
	public JScrollPane jScrollPanelDatosDetaFormaPago;
	public JScrollPane jScrollPanelDatosEdicionDetaFormaPago;
	public JScrollPane jScrollPanelDatosGeneralDetaFormaPago;
	
	protected JPanel jPanelCamposDetaFormaPago;    
	protected JPanel jPanelCamposOcultosDetaFormaPago;    	
	protected JPanel jPanelAccionesDetaFormaPago;
	protected JPanel jPanelAccionesFormularioDetaFormaPago;
    
	
	
	protected Integer iXPanelCamposDetaFormaPago=0;
	protected Integer iYPanelCamposDetaFormaPago=0;
	
	protected Integer iXPanelCamposOcultosDetaFormaPago=0;
	protected Integer iYPanelCamposOcultosDetaFormaPago=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetaFormaPago;
	public JButton jButtonModificarDetaFormaPago;
	public JButton jButtonActualizarDetaFormaPago;
    public JButton jButtonEliminarDetaFormaPago;
	public JButton jButtonCancelarDetaFormaPago;
    public JButton jButtonGuardarCambiosDetaFormaPago;
	public JButton jButtonGuardarCambiosTablaDetaFormaPago;
	protected JButton jButtonCerrarDetaFormaPago;
	
	
	protected JButton jButtonProcesarInformacionDetaFormaPago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetaFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetaFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetaFormaPago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetaFormaPago;
	protected JButton jButtonModificarToolBarDetaFormaPago;
	protected JButton jButtonActualizarToolBarDetaFormaPago;
    protected JButton jButtonEliminarToolBarDetaFormaPago;
	protected JButton jButtonCancelarToolBarDetaFormaPago;
    protected JButton jButtonGuardarCambiosToolBarDetaFormaPago;
	protected JButton jButtonGuardarCambiosTablaToolBarDetaFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarDetaFormaPago;
	protected JButton jButtonCerrarToolBarDetaFormaPago;
	
	protected JButton jButtonProcesarInformacionToolBarDetaFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetaFormaPago;
	protected JMenuItem jMenuItemModificarDetaFormaPago;
	protected JMenuItem jMenuItemActualizarDetaFormaPago;
    protected JMenuItem jMenuItemEliminarDetaFormaPago;
	protected JMenuItem jMenuItemCancelarDetaFormaPago;
    protected JMenuItem jMenuItemGuardarCambiosDetaFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetaFormaPago;
	protected JMenuItem jMenuItemCerrarDetaFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarDetaFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetaFormaPago;
	
	protected JMenuItem jMenuItemProcesarInformacionDetaFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetaFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarDetaFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetaFormaPago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetaFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetaFormaPago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetaFormaPago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetaFormaPago;
	public JLabel jLabelIdDetaFormaPago;
	public JLabel jLabelidDetaFormaPago;
	public JButton jButtonidDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelvalorDetaFormaPago;
	public JLabel jLabelvalorDetaFormaPago;
	public JTextField jTextFieldvalorDetaFormaPago;
	public JButton jButtonvalorDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicialDetaFormaPago;
	public JLabel jLabelfecha_inicialDetaFormaPago;
	//public JFormattedTextField jDateChooserfecha_inicialDetaFormaPago;

	public JDateChooser jDateChooserfecha_inicialDetaFormaPago;
	public JButton jButtonfecha_inicialDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finalDetaFormaPago;
	public JLabel jLabelfecha_finalDetaFormaPago;
	//public JFormattedTextField jDateChooserfecha_finalDetaFormaPago;

	public JDateChooser jDateChooserfecha_finalDetaFormaPago;
	public JButton jButtonfecha_finalDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeDetaFormaPago;
	public JLabel jLabelporcentajeDetaFormaPago;
	public JTextField jTextFieldporcentajeDetaFormaPago;
	public JButton jButtonporcentajeDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelretencionDetaFormaPago;
	public JLabel jLabelretencionDetaFormaPago;
	public JTextField jTextFieldretencionDetaFormaPago;
	public JButton jButtonretencionDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_retencionDetaFormaPago;
	public JLabel jLabelporcentaje_retencionDetaFormaPago;
	public JTextField jTextFieldporcentaje_retencionDetaFormaPago;
	public JButton jButtonporcentaje_retencionDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelbase_retencionDetaFormaPago;
	public JLabel jLabelbase_retencionDetaFormaPago;
	public JTextField jTextFieldbase_retencionDetaFormaPago;
	public JButton jButtonbase_retencionDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_retencionDetaFormaPago;
	public JLabel jLabelvalor_retencionDetaFormaPago;
	public JTextField jTextFieldvalor_retencionDetaFormaPago;
	public JButton jButtonvalor_retencionDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencionDetaFormaPago;
	public JLabel jLabelnumero_retencionDetaFormaPago;
	public JTextField jTextFieldnumero_retencionDetaFormaPago;
	public JButton jButtonnumero_retencionDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diasDetaFormaPago;
	public JLabel jLabelnumero_diasDetaFormaPago;
	public JTextField jTextFieldnumero_diasDetaFormaPago;
	public JButton jButtonnumero_diasDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuotaDetaFormaPago;
	public JLabel jLabelnumero_cuotaDetaFormaPago;
	public JTextField jTextFieldnumero_cuotaDetaFormaPago;
	public JButton jButtonnumero_cuotaDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetaFormaPago;
	public JLabel jLabeldescripcionDetaFormaPago;
	public JTextArea jTextAreadescripcionDetaFormaPago;
	public JScrollPane jscrollPanedescripcionDetaFormaPago;
	public JButton jButtondescripcionDetaFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetaFormaPago;
	public JLabel jLabelid_empresaDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetaFormaPago;
	public JButton jButtonid_empresaDetaFormaPago= new JButtonMe();
	public JButton jButtonid_empresaDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetaFormaPago;
	public JLabel jLabelid_sucursalDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetaFormaPago;
	public JButton jButtonid_sucursalDetaFormaPago= new JButtonMe();
	public JButton jButtonid_sucursalDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetaFormaPago;
	public JLabel jLabelid_ejercicioDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetaFormaPago;
	public JButton jButtonid_ejercicioDetaFormaPago= new JButtonMe();
	public JButton jButtonid_ejercicioDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetaFormaPago;
	public JLabel jLabelid_periodoDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetaFormaPago;
	public JButton jButtonid_periodoDetaFormaPago= new JButtonMe();
	public JButton jButtonid_periodoDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaDetaFormaPago;
	public JLabel jLabelid_facturaDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaDetaFormaPago;
	public JButton jButtonid_facturaDetaFormaPago= new JButtonMe();
	public JButton jButtonid_facturaDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_facturaDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_forma_pagoDetaFormaPago;
	public JLabel jLabelid_tipo_forma_pagoDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoDetaFormaPago;
	public JButton jButtonid_tipo_forma_pagoDetaFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_deta_forma_pagoDetaFormaPago;
	public JLabel jLabelid_tipo_deta_forma_pagoDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_deta_forma_pagoDetaFormaPago;
	public JButton jButtonid_tipo_deta_forma_pagoDetaFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_deta_forma_pagoDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_deta_forma_pagoDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_deta_forma_pago_factuDetaFormaPago;
	public JLabel jLabelid_deta_forma_pago_factuDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_deta_forma_pago_factuDetaFormaPago;
	public JButton jButtonid_deta_forma_pago_factuDetaFormaPago= new JButtonMe();
	public JButton jButtonid_deta_forma_pago_factuDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_deta_forma_pago_factuDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableDetaFormaPago;
	public JLabel jLabelid_cuenta_contableDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableDetaFormaPago;
	public JButton jButtonid_cuenta_contableDetaFormaPago= new JButtonMe();
	public JButton jButtonid_cuenta_contableDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableDetaFormaPagoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableDetaFormaPagoArbol= new JButtonMe();

	public JPanel jPanelid_tipo_retencionDetaFormaPago;
	public JLabel jLabelid_tipo_retencionDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionDetaFormaPago;
	public JButton jButtonid_tipo_retencionDetaFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_retencionDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetaFormaPago;
	public JLabel jLabelid_anioDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetaFormaPago;
	public JButton jButtonid_anioDetaFormaPago= new JButtonMe();
	public JButton jButtonid_anioDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_anioDetaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetaFormaPago;
	public JLabel jLabelid_mesDetaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetaFormaPago;
	public JButton jButtonid_mesDetaFormaPago= new JButtonMe();
	public JButton jButtonid_mesDetaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_mesDetaFormaPagoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetaFormaPago;
	
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
	public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetaFormaPagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetaFormaPago=new JPanel();
				this.jPanelAccionesFormularioDetaFormaPago=new JPanel();
				this.jmenuBarDetalleDetaFormaPago=new JMenuBar();
				this.jTtoolBarDetalleDetaFormaPago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaFormaPagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetaFormaPagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaFormaPagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaFormaPagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaFormaPagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetaFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetaFormaPago() {
		return this.jButtonActualizarToolBarDetaFormaPago;
	}
	
	public JButton getjButtonEliminarToolBarDetaFormaPago() {
		return this.jButtonEliminarToolBarDetaFormaPago;
	}
	
	public JButton getjButtonCancelarToolBarDetaFormaPago() {
		return this.jButtonCancelarToolBarDetaFormaPago;
	}		
	
	public JButton getjButtonProcesarInformacionDetaFormaPago() {
		return this.jButtonProcesarInformacionDetaFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetaFormaPago)	{
		this.jButtonProcesarInformacionDetaFormaPago = jButtonProcesarInformacionDetaFormaPago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetaFormaPago() {
		return this.jComboBoxTiposAccionesDetaFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetaFormaPago(
			JComboBox jComboBoxTiposRelacionesDetaFormaPago) {
		this.jComboBoxTiposRelacionesDetaFormaPago = jComboBoxTiposRelacionesDetaFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetaFormaPago(
			JComboBox jComboBoxTiposAccionesDetaFormaPago) {
		this.jComboBoxTiposAccionesDetaFormaPago = jComboBoxTiposAccionesDetaFormaPago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetaFormaPago() {
		return this.jComboBoxTiposAccionesFormularioDetaFormaPago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetaFormaPago(
			JComboBox jComboBoxTiposAccionesFormularioDetaFormaPago) {
		this.jComboBoxTiposAccionesFormularioDetaFormaPago = jComboBoxTiposAccionesFormularioDetaFormaPago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detaformapagoSessionBean=new DetaFormaPagoSessionBean();
		
		this.detaformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detaformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detaformapagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetaFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Deta Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detaformapagoSessionBean.getEsGuardarRelacionado()) {
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
	
		DetaFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetaFormaPago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetaFormaPago=new JButtonMe();
				this.jButtonModificarToolBarDetaFormaPago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetaFormaPago,this.jTtoolBarDetalleDetaFormaPago,
							"actualizar","actualizar","Actualizar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetaFormaPago,this.jTtoolBarDetalleDetaFormaPago,
							"eliminar","eliminar","Eliminar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetaFormaPago,this.jTtoolBarDetalleDetaFormaPago,
							"cancelar","cancelar","Cancelar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetaFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetaFormaPago,this.jTtoolBarDetalleDetaFormaPago,
							"guardarcambios","guardarcambios","Guardar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetaFormaPago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetaFormaPago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetaFormaPago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetaFormaPago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetaFormaPago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetaFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetaFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetaFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetaFormaPago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetaFormaPago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetaFormaPago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetaFormaPago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetaFormaPago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetaFormaPago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetaFormaPago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetaFormaPago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetaFormaPago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetaFormaPago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetaFormaPago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetaFormaPago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetaFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetaFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetaFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetaFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetaFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetaFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetaFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetaFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetaFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetaFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetaFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetaFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetaFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetaFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetaFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetaFormaPago.add(this.jMenuItemDetalleCerrarDetaFormaPago);
		
		this.jmenuDetalleAccionesDetaFormaPago.add(this.jMenuItemActualizarDetaFormaPago);
		this.jmenuDetalleAccionesDetaFormaPago.add(this.jMenuItemEliminarDetaFormaPago);
		this.jmenuDetalleAccionesDetaFormaPago.add(this.jMenuItemCancelarDetaFormaPago);		
		
		//this.jmenuDetalleDatosDetaFormaPago.add(this.jMenuItemDetalleAbrirOrderByDetaFormaPago);				
		this.jmenuDetalleDatosDetaFormaPago.add(this.jMenuItemDetalleMostarOcultarDetaFormaPago);				
				
		//this.jmenuDetalleAccionesDetaFormaPago.add(this.jMenuItemGuardarCambiosDetaFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetaFormaPago.add(this.jmenuDetalleArchivoDetaFormaPago);		
		this.jmenuBarDetalleDetaFormaPago.add(this.jmenuDetalleAccionesDetaFormaPago);		
		this.jmenuBarDetalleDetaFormaPago.add(this.jmenuDetalleDatosDetaFormaPago);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleDetaFormaPago.add(this.jmenuDetalleDetaFormaPago);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetaFormaPago);				
	}
	
	
	public void inicializarElementosCamposDetaFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetaFormaPago = new JLabelMe();
		jLabelIdDetaFormaPago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetaFormaPago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetaFormaPago= new GridBagLayout();

		this.jPanelidDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);

		jLabelidDetaFormaPago = new JLabel();
		jLabelidDetaFormaPago.setText("Id");

		jLabelidDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorDetaFormaPago = new JLabelMe();
		this.jLabelvalorDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorDetaFormaPago.setToolTipText("Valor");
		this.jLabelvalorDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelvalorDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jTextFieldvalorDetaFormaPago= new JTextFieldMe();
		jTextFieldvalorDetaFormaPago.setEnabled(false);
		jTextFieldvalorDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorDetaFormaPago.setText("0.0");

		this.jButtonvalorDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonvalorDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorDetaFormaPagoBusqueda.setText("U");
		this.jButtonvalorDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorDetaFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicialDetaFormaPago = new JLabelMe();
		this.jLabelfecha_inicialDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_FECHAINICIAL+" : *");
		this.jLabelfecha_inicialDetaFormaPago.setToolTipText("Fecha Inicial");
		this.jLabelfecha_inicialDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicialDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicialDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicialDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicialDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicialDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_FECHAINICIAL);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelfecha_inicialDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		//jFormattedTextFieldfecha_inicialDetaFormaPago= new JFormattedTextFieldMe();

		jDateChooserfecha_inicialDetaFormaPago= new JDateChooser();
		jDateChooserfecha_inicialDetaFormaPago.setEnabled(false);
		jDateChooserfecha_inicialDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicialDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicialDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicialDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicialDetaFormaPago.setDate(new Date());
		jDateChooserfecha_inicialDetaFormaPago.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicialDetaFormaPago.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicialDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonfecha_inicialDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicialDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicialDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicialDetaFormaPagoBusqueda.setText("U");
		this.jButtonfecha_inicialDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicialDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicialDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicialDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicialDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicialDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicialDetaFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finalDetaFormaPago = new JLabelMe();
		this.jLabelfecha_finalDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_FECHAFINAL+" : *");
		this.jLabelfecha_finalDetaFormaPago.setToolTipText("Fecha Final");
		this.jLabelfecha_finalDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finalDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finalDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finalDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finalDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finalDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_FECHAFINAL);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelfecha_finalDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		//jFormattedTextFieldfecha_finalDetaFormaPago= new JFormattedTextFieldMe();

		jDateChooserfecha_finalDetaFormaPago= new JDateChooser();
		jDateChooserfecha_finalDetaFormaPago.setEnabled(false);
		jDateChooserfecha_finalDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finalDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finalDetaFormaPago.setDate(new Date());
		jDateChooserfecha_finalDetaFormaPago.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finalDetaFormaPago.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finalDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonfecha_finalDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finalDetaFormaPagoBusqueda.setText("U");
		this.jButtonfecha_finalDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finalDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finalDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finalDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finalDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finalDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finalDetaFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeDetaFormaPago = new JLabelMe();
		this.jLabelporcentajeDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeDetaFormaPago.setToolTipText("Porcentaje");
		this.jLabelporcentajeDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelporcentajeDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jTextFieldporcentajeDetaFormaPago= new JTextFieldMe();
		jTextFieldporcentajeDetaFormaPago.setEnabled(false);
		jTextFieldporcentajeDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeDetaFormaPago.setText("0.0");

		this.jButtonporcentajeDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonporcentajeDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeDetaFormaPagoBusqueda.setText("U");
		this.jButtonporcentajeDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeDetaFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelretencionDetaFormaPago = new JLabelMe();
		this.jLabelretencionDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_RETENCION+" : *");
		this.jLabelretencionDetaFormaPago.setToolTipText("Retencion");
		this.jLabelretencionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelretencionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelretencionDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelretencionDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_RETENCION);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelretencionDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jTextFieldretencionDetaFormaPago= new JTextFieldMe();
		jTextFieldretencionDetaFormaPago.setEnabled(false);
		jTextFieldretencionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldretencionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldretencionDetaFormaPago.setText("0.0");

		this.jButtonretencionDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonretencionDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonretencionDetaFormaPagoBusqueda.setText("U");
		this.jButtonretencionDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonretencionDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonretencionDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldretencionDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldretencionDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"retencionDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonretencionDetaFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_retencionDetaFormaPago = new JLabelMe();
		this.jLabelporcentaje_retencionDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION+" : *");
		this.jLabelporcentaje_retencionDetaFormaPago.setToolTipText("Porcentaje Retencion");
		this.jLabelporcentaje_retencionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelporcentaje_retencionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelporcentaje_retencionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_retencionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_retencionDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_retencionDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_PORCENTAJERETENCION);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelporcentaje_retencionDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jTextFieldporcentaje_retencionDetaFormaPago= new JTextFieldMe();
		jTextFieldporcentaje_retencionDetaFormaPago.setEnabled(false);
		jTextFieldporcentaje_retencionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_retencionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_retencionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_retencionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_retencionDetaFormaPago.setText("0.0");

		this.jButtonporcentaje_retencionDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonporcentaje_retencionDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_retencionDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_retencionDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_retencionDetaFormaPagoBusqueda.setText("U");
		this.jButtonporcentaje_retencionDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_retencionDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_retencionDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_retencionDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_retencionDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_retencionDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_retencionDetaFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelbase_retencionDetaFormaPago = new JLabelMe();
		this.jLabelbase_retencionDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_BASERETENCION+" : *");
		this.jLabelbase_retencionDetaFormaPago.setToolTipText("Base");
		this.jLabelbase_retencionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_retencionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_retencionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_retencionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_retencionDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_retencionDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_BASERETENCION);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelbase_retencionDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jTextFieldbase_retencionDetaFormaPago= new JTextFieldMe();
		jTextFieldbase_retencionDetaFormaPago.setEnabled(false);
		jTextFieldbase_retencionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_retencionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_retencionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_retencionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_retencionDetaFormaPago.setText("0.0");

		this.jButtonbase_retencionDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonbase_retencionDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_retencionDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_retencionDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_retencionDetaFormaPagoBusqueda.setText("U");
		this.jButtonbase_retencionDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_retencionDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_retencionDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_retencionDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_retencionDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_retencionDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_retencionDetaFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_retencionDetaFormaPago = new JLabelMe();
		this.jLabelvalor_retencionDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_VALORRETENCION+" : *");
		this.jLabelvalor_retencionDetaFormaPago.setToolTipText("Valor Retencion");
		this.jLabelvalor_retencionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_retencionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_retencionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_retencionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_retencionDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_retencionDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_VALORRETENCION);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelvalor_retencionDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jTextFieldvalor_retencionDetaFormaPago= new JTextFieldMe();
		jTextFieldvalor_retencionDetaFormaPago.setEnabled(false);
		jTextFieldvalor_retencionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_retencionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_retencionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_retencionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_retencionDetaFormaPago.setText("0.0");

		this.jButtonvalor_retencionDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonvalor_retencionDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_retencionDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_retencionDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_retencionDetaFormaPagoBusqueda.setText("U");
		this.jButtonvalor_retencionDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_retencionDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_retencionDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_retencionDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_retencionDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_retencionDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_retencionDetaFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencionDetaFormaPago = new JLabelMe();
		this.jLabelnumero_retencionDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_NUMERORETENCION+" : *");
		this.jLabelnumero_retencionDetaFormaPago.setToolTipText("Numero Retencion");
		this.jLabelnumero_retencionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_retencionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_retencionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencionDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencionDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_NUMERORETENCION);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelnumero_retencionDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jTextFieldnumero_retencionDetaFormaPago= new JTextFieldMe();

		jTextFieldnumero_retencionDetaFormaPago.setEnabled(false);
		jTextFieldnumero_retencionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_retencionDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonnumero_retencionDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencionDetaFormaPagoBusqueda.setText("U");
		this.jButtonnumero_retencionDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencionDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencionDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencionDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencionDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencionDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencionDetaFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_diasDetaFormaPago = new JLabelMe();
		this.jLabelnumero_diasDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_NUMERODIAS+" : *");
		this.jLabelnumero_diasDetaFormaPago.setToolTipText("Numero Dias");
		this.jLabelnumero_diasDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diasDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diasDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diasDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_NUMERODIAS);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelnumero_diasDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jTextFieldnumero_diasDetaFormaPago= new JTextFieldMe();
		jTextFieldnumero_diasDetaFormaPago.setEnabled(false);
		jTextFieldnumero_diasDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diasDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_diasDetaFormaPago.setText("0");

		this.jButtonnumero_diasDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonnumero_diasDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diasDetaFormaPagoBusqueda.setText("U");
		this.jButtonnumero_diasDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diasDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diasDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diasDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diasDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diasDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diasDetaFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuotaDetaFormaPago = new JLabelMe();
		this.jLabelnumero_cuotaDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_NUMEROCUOTA+" : *");
		this.jLabelnumero_cuotaDetaFormaPago.setToolTipText("Numero Cuota");
		this.jLabelnumero_cuotaDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuotaDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuotaDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuotaDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuotaDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuotaDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_NUMEROCUOTA);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelnumero_cuotaDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jTextFieldnumero_cuotaDetaFormaPago= new JTextFieldMe();
		jTextFieldnumero_cuotaDetaFormaPago.setEnabled(false);
		jTextFieldnumero_cuotaDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuotaDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuotaDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuotaDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_cuotaDetaFormaPago.setText("0");

		this.jButtonnumero_cuotaDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonnumero_cuotaDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuotaDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuotaDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuotaDetaFormaPagoBusqueda.setText("U");
		this.jButtonnumero_cuotaDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuotaDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuotaDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuotaDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuotaDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuotaDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuotaDetaFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetaFormaPago = new JLabelMe();
		this.jLabeldescripcionDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetaFormaPago.setToolTipText("Descripcion");
		this.jLabeldescripcionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPaneldescripcionDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jTextAreadescripcionDetaFormaPago= new JTextAreaMe();
		jTextAreadescripcionDetaFormaPago.setEnabled(false);
		jTextAreadescripcionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetaFormaPago.setLineWrap(true);
		jTextAreadescripcionDetaFormaPago.setWrapStyleWord(true);
		jTextAreadescripcionDetaFormaPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetaFormaPago.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetaFormaPago = new JScrollPane(jTextAreadescripcionDetaFormaPago);
		jscrollPanedescripcionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtondescripcionDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetaFormaPagoBusqueda.setText("U");
		this.jButtondescripcionDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetaFormaPagoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetaFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetaFormaPago = new JLabelMe();
		this.jLabelid_empresaDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetaFormaPago.setToolTipText("Empresa");
		this.jLabelid_empresaDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelid_empresaDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jComboBoxid_empresaDetaFormaPago= new JComboBoxMe();
		jComboBoxid_empresaDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetaFormaPago.setEnabled(false);

		this.jButtonid_empresaDetaFormaPago= new JButtonMe();
		this.jButtonid_empresaDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetaFormaPago.setText("Buscar");
		this.jButtonid_empresaDetaFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetaFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetaFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetaFormaPago"));

		this.jButtonid_empresaDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_empresaDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetaFormaPagoBusqueda.setText("U");
		this.jButtonid_empresaDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetaFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetaFormaPagoUpdate= new JButtonMe();
		this.jButtonid_empresaDetaFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetaFormaPagoUpdate.setText("U");
		this.jButtonid_empresaDetaFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetaFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetaFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetaFormaPagoUpdate"));



					
		this.jLabelid_sucursalDetaFormaPago = new JLabelMe();
		this.jLabelid_sucursalDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetaFormaPago.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelid_sucursalDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jComboBoxid_sucursalDetaFormaPago= new JComboBoxMe();
		jComboBoxid_sucursalDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetaFormaPago.setEnabled(false);

		this.jButtonid_sucursalDetaFormaPago= new JButtonMe();
		this.jButtonid_sucursalDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetaFormaPago.setText("Buscar");
		this.jButtonid_sucursalDetaFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetaFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetaFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetaFormaPago"));

		this.jButtonid_sucursalDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetaFormaPagoBusqueda.setText("U");
		this.jButtonid_sucursalDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetaFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetaFormaPagoUpdate= new JButtonMe();
		this.jButtonid_sucursalDetaFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetaFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetaFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetaFormaPagoUpdate.setText("U");
		this.jButtonid_sucursalDetaFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetaFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetaFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetaFormaPagoUpdate"));



					
		this.jLabelid_ejercicioDetaFormaPago = new JLabelMe();
		this.jLabelid_ejercicioDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetaFormaPago.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelid_ejercicioDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jComboBoxid_ejercicioDetaFormaPago= new JComboBoxMe();
		jComboBoxid_ejercicioDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetaFormaPago.setEnabled(false);

		this.jButtonid_ejercicioDetaFormaPago= new JButtonMe();
		this.jButtonid_ejercicioDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetaFormaPago.setText("Buscar");
		this.jButtonid_ejercicioDetaFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetaFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetaFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetaFormaPago"));

		this.jButtonid_ejercicioDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetaFormaPagoBusqueda.setText("U");
		this.jButtonid_ejercicioDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetaFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetaFormaPagoUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetaFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetaFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetaFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetaFormaPagoUpdate.setText("U");
		this.jButtonid_ejercicioDetaFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetaFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetaFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetaFormaPagoUpdate"));



					
		this.jLabelid_periodoDetaFormaPago = new JLabelMe();
		this.jLabelid_periodoDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetaFormaPago.setToolTipText("Periodo");
		this.jLabelid_periodoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelid_periodoDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jComboBoxid_periodoDetaFormaPago= new JComboBoxMe();
		jComboBoxid_periodoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetaFormaPago.setEnabled(false);

		this.jButtonid_periodoDetaFormaPago= new JButtonMe();
		this.jButtonid_periodoDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetaFormaPago.setText("Buscar");
		this.jButtonid_periodoDetaFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetaFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetaFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetaFormaPago"));

		this.jButtonid_periodoDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_periodoDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetaFormaPagoBusqueda.setText("U");
		this.jButtonid_periodoDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetaFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetaFormaPagoUpdate= new JButtonMe();
		this.jButtonid_periodoDetaFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetaFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetaFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetaFormaPagoUpdate.setText("U");
		this.jButtonid_periodoDetaFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetaFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetaFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetaFormaPagoUpdate"));



					
		this.jLabelid_facturaDetaFormaPago = new JLabelMe();
		this.jLabelid_facturaDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaDetaFormaPago.setToolTipText("Factura");
		this.jLabelid_facturaDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelid_facturaDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jComboBoxid_facturaDetaFormaPago= new JComboBoxMe();
		jComboBoxid_facturaDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaDetaFormaPago= new JButtonMe();
		this.jButtonid_facturaDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetaFormaPago.setText("Buscar");
		this.jButtonid_facturaDetaFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaDetaFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetaFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetaFormaPago"));

		this.jButtonid_facturaDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_facturaDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaDetaFormaPagoBusqueda.setText("U");
		this.jButtonid_facturaDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaDetaFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_facturaDetaFormaPagoUpdate= new JButtonMe();
		this.jButtonid_facturaDetaFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetaFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetaFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaDetaFormaPagoUpdate.setText("U");
		this.jButtonid_facturaDetaFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaDetaFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetaFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetaFormaPagoUpdate"));



					
		this.jLabelid_tipo_forma_pagoDetaFormaPago = new JLabelMe();
		this.jLabelid_tipo_forma_pagoDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO+" : *");
		this.jLabelid_tipo_forma_pagoDetaFormaPago.setToolTipText("Tipo Forma Pago");
		this.jLabelid_tipo_forma_pagoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_forma_pagoDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_forma_pagoDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelid_tipo_forma_pagoDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jComboBoxid_tipo_forma_pagoDetaFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_forma_pagoDetaFormaPago= new JButtonMe();
		this.jButtonid_tipo_forma_pagoDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoDetaFormaPago.setText("Buscar");
		this.jButtonid_tipo_forma_pagoDetaFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_forma_pagoDetaFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoDetaFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_forma_pagoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoDetaFormaPago"));

		this.jButtonid_tipo_forma_pagoDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_tipo_forma_pagoDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoDetaFormaPagoBusqueda.setText("U");
		this.jButtonid_tipo_forma_pagoDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_forma_pagoDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_forma_pagoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_forma_pagoDetaFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_forma_pagoDetaFormaPagoUpdate= new JButtonMe();
		this.jButtonid_tipo_forma_pagoDetaFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoDetaFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoDetaFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoDetaFormaPagoUpdate.setText("U");
		this.jButtonid_tipo_forma_pagoDetaFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_forma_pagoDetaFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoDetaFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_forma_pagoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoDetaFormaPagoUpdate"));



					
		this.jLabelid_tipo_deta_forma_pagoDetaFormaPago = new JLabelMe();
		this.jLabelid_tipo_deta_forma_pagoDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_IDTIPODETAFORMAPAGO+" : *");
		this.jLabelid_tipo_deta_forma_pagoDetaFormaPago.setToolTipText("Tipo Deta Forma Pago");
		this.jLabelid_tipo_deta_forma_pagoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_deta_forma_pagoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_deta_forma_pagoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_deta_forma_pagoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_deta_forma_pagoDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_deta_forma_pagoDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_IDTIPODETAFORMAPAGO);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelid_tipo_deta_forma_pagoDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jComboBoxid_tipo_deta_forma_pagoDetaFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_deta_forma_pagoDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_deta_forma_pagoDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_deta_forma_pagoDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_deta_forma_pagoDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_deta_forma_pagoDetaFormaPago= new JButtonMe();
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPago.setText("Buscar");
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_deta_forma_pagoDetaFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_deta_forma_pagoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_deta_forma_pagoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_deta_forma_pagoDetaFormaPago"));

		this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoBusqueda.setText("U");
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_deta_forma_pagoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_deta_forma_pagoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_deta_forma_pagoDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoUpdate= new JButtonMe();
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoUpdate.setText("U");
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_deta_forma_pagoDetaFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_deta_forma_pagoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_deta_forma_pagoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_deta_forma_pagoDetaFormaPagoUpdate"));



					
		this.jLabelid_deta_forma_pago_factuDetaFormaPago = new JLabelMe();
		this.jLabelid_deta_forma_pago_factuDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGOFACTU+" : *");
		this.jLabelid_deta_forma_pago_factuDetaFormaPago.setToolTipText("Deta Forma Pago Factu");
		this.jLabelid_deta_forma_pago_factuDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_deta_forma_pago_factuDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_deta_forma_pago_factuDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_deta_forma_pago_factuDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_deta_forma_pago_factuDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_deta_forma_pago_factuDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_IDDETAFORMAPAGOFACTU);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelid_deta_forma_pago_factuDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jComboBoxid_deta_forma_pago_factuDetaFormaPago= new JComboBoxMe();
		jComboBoxid_deta_forma_pago_factuDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_deta_forma_pago_factuDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_deta_forma_pago_factuDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_deta_forma_pago_factuDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_deta_forma_pago_factuDetaFormaPago= new JButtonMe();
		this.jButtonid_deta_forma_pago_factuDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_deta_forma_pago_factuDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_deta_forma_pago_factuDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_deta_forma_pago_factuDetaFormaPago.setText("Buscar");
		this.jButtonid_deta_forma_pago_factuDetaFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_deta_forma_pago_factuDetaFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_deta_forma_pago_factuDetaFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_deta_forma_pago_factuDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_deta_forma_pago_factuDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_deta_forma_pago_factuDetaFormaPago"));

		this.jButtonid_deta_forma_pago_factuDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_deta_forma_pago_factuDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_deta_forma_pago_factuDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_deta_forma_pago_factuDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_deta_forma_pago_factuDetaFormaPagoBusqueda.setText("U");
		this.jButtonid_deta_forma_pago_factuDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_deta_forma_pago_factuDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_deta_forma_pago_factuDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_deta_forma_pago_factuDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_deta_forma_pago_factuDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_deta_forma_pago_factuDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_deta_forma_pago_factuDetaFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_deta_forma_pago_factuDetaFormaPagoUpdate= new JButtonMe();
		this.jButtonid_deta_forma_pago_factuDetaFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_deta_forma_pago_factuDetaFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_deta_forma_pago_factuDetaFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_deta_forma_pago_factuDetaFormaPagoUpdate.setText("U");
		this.jButtonid_deta_forma_pago_factuDetaFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_deta_forma_pago_factuDetaFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_deta_forma_pago_factuDetaFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_deta_forma_pago_factuDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_deta_forma_pago_factuDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_deta_forma_pago_factuDetaFormaPagoUpdate"));



					
		this.jLabelid_cuenta_contableDetaFormaPago = new JLabelMe();
		this.jLabelid_cuenta_contableDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableDetaFormaPago.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelid_cuenta_contableDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jComboBoxid_cuenta_contableDetaFormaPago= new JComboBoxMe();
		jComboBoxid_cuenta_contableDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableDetaFormaPago= new JButtonMe();
		this.jButtonid_cuenta_contableDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDetaFormaPago.setText("Buscar");
		this.jButtonid_cuenta_contableDetaFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableDetaFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetaFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetaFormaPago"));

		this.jButtonid_cuenta_contableDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableDetaFormaPagoBusqueda.setText("U");
		this.jButtonid_cuenta_contableDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableDetaFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableDetaFormaPagoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableDetaFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetaFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetaFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableDetaFormaPagoUpdate.setText("U");
		this.jButtonid_cuenta_contableDetaFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableDetaFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetaFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetaFormaPagoUpdate"));


		jButtonid_cuenta_contableDetaFormaPagoArbol= new JButtonMe();
		jButtonid_cuenta_contableDetaFormaPagoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDetaFormaPagoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDetaFormaPagoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDetaFormaPagoArbol.setText("Arbol");
		jButtonid_cuenta_contableDetaFormaPagoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableDetaFormaPagoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetaFormaPagoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetaFormaPagoArbol"));



					
		this.jLabelid_tipo_retencionDetaFormaPago = new JLabelMe();
		this.jLabelid_tipo_retencionDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_IDTIPORETENCION+" : *");
		this.jLabelid_tipo_retencionDetaFormaPago.setToolTipText("Tipo Retencion");
		this.jLabelid_tipo_retencionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencionDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencionDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_IDTIPORETENCION);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelid_tipo_retencionDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jComboBoxid_tipo_retencionDetaFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_retencionDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencionDetaFormaPago= new JButtonMe();
		this.jButtonid_tipo_retencionDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionDetaFormaPago.setText("Buscar");
		this.jButtonid_tipo_retencionDetaFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencionDetaFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionDetaFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencionDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionDetaFormaPago"));

		this.jButtonid_tipo_retencionDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencionDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionDetaFormaPagoBusqueda.setText("U");
		this.jButtonid_tipo_retencionDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencionDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencionDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencionDetaFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencionDetaFormaPagoUpdate= new JButtonMe();
		this.jButtonid_tipo_retencionDetaFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionDetaFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionDetaFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionDetaFormaPagoUpdate.setText("U");
		this.jButtonid_tipo_retencionDetaFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencionDetaFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionDetaFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencionDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionDetaFormaPagoUpdate"));



					
		this.jLabelid_anioDetaFormaPago = new JLabelMe();
		this.jLabelid_anioDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetaFormaPago.setToolTipText("Anio");
		this.jLabelid_anioDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelid_anioDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jComboBoxid_anioDetaFormaPago= new JComboBoxMe();
		jComboBoxid_anioDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetaFormaPago.setEnabled(false);

		this.jButtonid_anioDetaFormaPago= new JButtonMe();
		this.jButtonid_anioDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetaFormaPago.setText("Buscar");
		this.jButtonid_anioDetaFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetaFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetaFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetaFormaPago"));

		this.jButtonid_anioDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_anioDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetaFormaPagoBusqueda.setText("U");
		this.jButtonid_anioDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetaFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_anioDetaFormaPagoUpdate= new JButtonMe();
		this.jButtonid_anioDetaFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetaFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetaFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetaFormaPagoUpdate.setText("U");
		this.jButtonid_anioDetaFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetaFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetaFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetaFormaPagoUpdate"));



					
		this.jLabelid_mesDetaFormaPago = new JLabelMe();
		this.jLabelid_mesDetaFormaPago.setText(""+DetaFormaPagoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetaFormaPago.setToolTipText("Mes");
		this.jLabelid_mesDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetaFormaPago.setToolTipText(DetaFormaPagoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetaFormaPago = new GridBagLayout();
		this.jPanelid_mesDetaFormaPago.setLayout(this.gridaBagLayoutDetaFormaPago);


		jComboBoxid_mesDetaFormaPago= new JComboBoxMe();
		jComboBoxid_mesDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetaFormaPago.setEnabled(false);

		this.jButtonid_mesDetaFormaPago= new JButtonMe();
		this.jButtonid_mesDetaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetaFormaPago.setText("Buscar");
		this.jButtonid_mesDetaFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetaFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetaFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetaFormaPago"));

		this.jButtonid_mesDetaFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_mesDetaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetaFormaPagoBusqueda.setText("U");
		this.jButtonid_mesDetaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetaFormaPagoBusqueda"));

		if(this.detaformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetaFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_mesDetaFormaPagoUpdate= new JButtonMe();
		this.jButtonid_mesDetaFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetaFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetaFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetaFormaPagoUpdate.setText("U");
		this.jButtonid_mesDetaFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetaFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetaFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetaFormaPagoUpdate"));



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
		//this.jInternalFrameDetalleDetaFormaPago = new DetaFormaPagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Deta Forma Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetaFormaPago= new GridBagLayout();
		

		
		String sToolTipDetaFormaPago="";
		sToolTipDetaFormaPago=DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetaFormaPago+="(Facturacion.DetaFormaPago)";
		}
		
		if(!this.detaformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetaFormaPago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetaFormaPago = new JButtonMe();
		this.jButtonModificarDetaFormaPago = new JButtonMe();
        this.jButtonActualizarDetaFormaPago = new JButtonMe();
        this.jButtonEliminarDetaFormaPago = new JButtonMe();
        this.jButtonCancelarDetaFormaPago = new JButtonMe();
        this.jButtonGuardarCambiosDetaFormaPago = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetaFormaPago = new JButtonMe();
		this.jButtonCerrarDetaFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosDetaFormaPago = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetaFormaPago = new JScrollPane();
		this.jScrollPanelDatosGeneralDetaFormaPago = new JScrollPane();
		//this.jScrollPanelDatosDetaFormaPagoTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Deta Forma Pago";
		
		if(!this.detaformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetaFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetaFormaPagoTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetaFormaPago.setName("jPanelCamposDetaFormaPago"); 

		this.jPanelCamposOcultosDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetaFormaPago.setName("jPanelCamposOcultosDetaFormaPago"); 

        this.jPanelAccionesDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetaFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesDetaFormaPago.setName("Acciones"); 

		this.jPanelAccionesFormularioDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetaFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetaFormaPago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetaFormaPago.setText("Nuevo");
		this.jButtonModificarDetaFormaPago.setText("Editar");
        this.jButtonActualizarDetaFormaPago.setText("Actualizar");
        this.jButtonEliminarDetaFormaPago.setText("Eliminar");
        this.jButtonCancelarDetaFormaPago.setText("Cancelar");
        this.jButtonGuardarCambiosDetaFormaPago.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetaFormaPago.setText("Guardar");
		this.jButtonCerrarDetaFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetaFormaPago,"nuevo_button","Nuevo",this.detaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetaFormaPago,"modificar_button","Editar",this.detaformapagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetaFormaPago,"actualizar_button","Actualizar",this.detaformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetaFormaPago,"eliminar_button","Eliminar",this.detaformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetaFormaPago,"cancelar_button","Cancelar",this.detaformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetaFormaPago,"guardarcambios_button","Guardar",this.detaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetaFormaPago,"guardarcambiostabla_button","Guardar",this.detaformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetaFormaPago,"cerrar_button","Salir",this.detaformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetaFormaPago.setToolTipText("Nuevo"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetaFormaPago.setToolTipText("Editar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetaFormaPago.setToolTipText("Actualizar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetaFormaPago.setToolTipText("Eliminar)"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetaFormaPago.setToolTipText("Cancelar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetaFormaPago.setToolTipText("Guardar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetaFormaPago.setToolTipText("Guardar"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetaFormaPago.setToolTipText("Salir"+" "+DetaFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetaFormaPago";
		inputMap = this.jButtonNuevoDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetaFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetaFormaPago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetaFormaPago";
		inputMap = this.jButtonActualizarDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetaFormaPago"));
		
		//ELIMINAR
		sMapKey = "EliminarDetaFormaPago";
		inputMap = this.jButtonEliminarDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetaFormaPago"));
		
		//CANCELAR	
		sMapKey = "CancelarDetaFormaPago";
		inputMap = this.jButtonCancelarDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetaFormaPago"));
		
		//CERRAR		
		sMapKey = "CerrarDetaFormaPago";
		inputMap = this.jButtonCerrarDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetaFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetaFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaDetaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetaFormaPago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetaFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetaFormaPago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetaFormaPago.setToolTipText("Nuevo DetaFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetaFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetaFormaPago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetaFormaPago.setToolTipText("Sin Cerrar Ventana DetaFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetaFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetaFormaPago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetaFormaPago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetaFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesDetaFormaPago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetaFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetaFormaPago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetaFormaPago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetaFormaPago = new JLabelMe();
		
		this.jLabelAccionesDetaFormaPago.setText("Acciones");		
		this.jLabelAccionesDetaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetaFormaPago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetaFormaPago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetaFormaPago=new JTabbedPane();
		this.jTabbedPaneRelacionesDetaFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetaFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetaFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetaFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetaFormaPago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetaFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetaFormaPago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetaFormaPago = new GridBagLayout();
		
		this.jPanelCamposDetaFormaPago.setLayout(gridaBagLayoutCamposDetaFormaPago);
		this.jPanelCamposOcultosDetaFormaPago.setLayout(gridaBagLayoutCamposOcultosDetaFormaPago);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetaFormaPago.add(jLabelIdDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetaFormaPago.add(jLabelidDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetaFormaPago.add(jLabelid_empresaDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetaFormaPago.add(jButtonid_empresaDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 3;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetaFormaPago.add(jButtonid_empresaDetaFormaPagoUpdate, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetaFormaPago.add(jComboBoxid_empresaDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetaFormaPago.add(jLabelid_sucursalDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetaFormaPago.add(jButtonid_sucursalDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 3;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetaFormaPago.add(jButtonid_sucursalDetaFormaPagoUpdate, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetaFormaPago.add(jComboBoxid_sucursalDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetaFormaPago.add(jLabelid_ejercicioDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetaFormaPago.add(jButtonid_ejercicioDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 3;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetaFormaPago.add(jButtonid_ejercicioDetaFormaPagoUpdate, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetaFormaPago.add(jComboBoxid_ejercicioDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetaFormaPago.add(jLabelid_periodoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetaFormaPago.add(jButtonid_periodoDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 3;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetaFormaPago.add(jButtonid_periodoDetaFormaPagoUpdate, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetaFormaPago.add(jComboBoxid_periodoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaDetaFormaPago.add(jLabelid_facturaDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 2;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaDetaFormaPago.add(jButtonid_facturaDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 3;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaDetaFormaPago.add(jButtonid_facturaDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 4;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaDetaFormaPago.add(jButtonid_facturaDetaFormaPagoUpdate, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaDetaFormaPago.add(jComboBoxid_facturaDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_forma_pagoDetaFormaPago.add(jLabelid_tipo_forma_pagoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoDetaFormaPago.add(jButtonid_tipo_forma_pagoDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 3;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoDetaFormaPago.add(jButtonid_tipo_forma_pagoDetaFormaPagoUpdate, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_forma_pagoDetaFormaPago.add(jComboBoxid_tipo_forma_pagoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_deta_forma_pagoDetaFormaPago.add(jLabelid_tipo_deta_forma_pagoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_deta_forma_pagoDetaFormaPago.add(jButtonid_tipo_deta_forma_pagoDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 3;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_deta_forma_pagoDetaFormaPago.add(jButtonid_tipo_deta_forma_pagoDetaFormaPagoUpdate, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_deta_forma_pagoDetaFormaPago.add(jComboBoxid_tipo_deta_forma_pagoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_deta_forma_pago_factuDetaFormaPago.add(jLabelid_deta_forma_pago_factuDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_deta_forma_pago_factuDetaFormaPago.add(jButtonid_deta_forma_pago_factuDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 3;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_deta_forma_pago_factuDetaFormaPago.add(jButtonid_deta_forma_pago_factuDetaFormaPagoUpdate, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_deta_forma_pago_factuDetaFormaPago.add(jComboBoxid_deta_forma_pago_factuDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableDetaFormaPago.add(jLabelid_cuenta_contableDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 2;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableDetaFormaPago.add(jButtonid_cuenta_contableDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 3;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableDetaFormaPago.add(jButtonid_cuenta_contableDetaFormaPagoArbol, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 4;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableDetaFormaPago.add(jButtonid_cuenta_contableDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 5;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableDetaFormaPago.add(jButtonid_cuenta_contableDetaFormaPagoUpdate, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableDetaFormaPago.add(jComboBoxid_cuenta_contableDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencionDetaFormaPago.add(jLabelid_tipo_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionDetaFormaPago.add(jButtonid_tipo_retencionDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 3;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionDetaFormaPago.add(jButtonid_tipo_retencionDetaFormaPagoUpdate, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencionDetaFormaPago.add(jComboBoxid_tipo_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorDetaFormaPago.add(jLabelvalorDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorDetaFormaPago.add(jButtonvalorDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorDetaFormaPago.add(jTextFieldvalorDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicialDetaFormaPago.add(jLabelfecha_inicialDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicialDetaFormaPago.add(jButtonfecha_inicialDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicialDetaFormaPago.add(jDateChooserfecha_inicialDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finalDetaFormaPago.add(jLabelfecha_finalDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finalDetaFormaPago.add(jButtonfecha_finalDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finalDetaFormaPago.add(jDateChooserfecha_finalDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeDetaFormaPago.add(jLabelporcentajeDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeDetaFormaPago.add(jButtonporcentajeDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeDetaFormaPago.add(jTextFieldporcentajeDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelretencionDetaFormaPago.add(jLabelretencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelretencionDetaFormaPago.add(jButtonretencionDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelretencionDetaFormaPago.add(jTextFieldretencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_retencionDetaFormaPago.add(jLabelporcentaje_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_retencionDetaFormaPago.add(jButtonporcentaje_retencionDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_retencionDetaFormaPago.add(jTextFieldporcentaje_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbase_retencionDetaFormaPago.add(jLabelbase_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_retencionDetaFormaPago.add(jButtonbase_retencionDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbase_retencionDetaFormaPago.add(jTextFieldbase_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_retencionDetaFormaPago.add(jLabelvalor_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_retencionDetaFormaPago.add(jButtonvalor_retencionDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_retencionDetaFormaPago.add(jTextFieldvalor_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_retencionDetaFormaPago.add(jLabelnumero_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencionDetaFormaPago.add(jButtonnumero_retencionDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_retencionDetaFormaPago.add(jTextFieldnumero_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_diasDetaFormaPago.add(jLabelnumero_diasDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diasDetaFormaPago.add(jButtonnumero_diasDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_diasDetaFormaPago.add(jTextFieldnumero_diasDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuotaDetaFormaPago.add(jLabelnumero_cuotaDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuotaDetaFormaPago.add(jButtonnumero_cuotaDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuotaDetaFormaPago.add(jTextFieldnumero_cuotaDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetaFormaPago.add(jLabeldescripcionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetaFormaPago.add(jButtondescripcionDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetaFormaPago.add(jscrollPanedescripcionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetaFormaPago.add(jLabelid_anioDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetaFormaPago.add(jButtonid_anioDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 3;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetaFormaPago.add(jButtonid_anioDetaFormaPagoUpdate, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetaFormaPago.add(jComboBoxid_anioDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 0;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetaFormaPago.add(jLabelid_mesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 2;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetaFormaPago.add(jButtonid_mesDetaFormaPagoBusqueda, this.gridBagConstraintsDetaFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = 3;
		this.gridBagConstraintsDetaFormaPago.ipadx = 0;
		this.gridBagConstraintsDetaFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetaFormaPago.add(jButtonid_mesDetaFormaPagoUpdate, this.gridBagConstraintsDetaFormaPago);
	}

	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaFormaPago.gridy = 0;
	this.gridBagConstraintsDetaFormaPago.gridx = 1;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetaFormaPago.add(jComboBoxid_mesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelidDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelid_facturaDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelid_tipo_forma_pagoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelid_tipo_deta_forma_pagoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelid_deta_forma_pago_factuDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelid_cuenta_contableDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelid_tipo_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelvalorDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelfecha_inicialDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelfecha_finalDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelporcentajeDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelretencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelporcentaje_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelbase_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelvalor_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelnumero_retencionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelnumero_diasDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPanelnumero_cuotaDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaFormaPago.add(this.jPaneldescripcionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposDetaFormaPago % 2==0) {
		iXPanelCamposDetaFormaPago=0;
		iYPanelCamposDetaFormaPago++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposOcultosDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposOcultosDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaFormaPago.add(this.jPanelid_empresaDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposOcultosDetaFormaPago % 2==0) {
		iXPanelCamposOcultosDetaFormaPago=0;
		iYPanelCamposOcultosDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposOcultosDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposOcultosDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaFormaPago.add(this.jPanelid_sucursalDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposOcultosDetaFormaPago % 2==0) {
		iXPanelCamposOcultosDetaFormaPago=0;
		iYPanelCamposOcultosDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposOcultosDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposOcultosDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaFormaPago.add(this.jPanelid_ejercicioDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposOcultosDetaFormaPago % 2==0) {
		iXPanelCamposOcultosDetaFormaPago=0;
		iYPanelCamposOcultosDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposOcultosDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposOcultosDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaFormaPago.add(this.jPanelid_periodoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposOcultosDetaFormaPago % 2==0) {
		iXPanelCamposOcultosDetaFormaPago=0;
		iYPanelCamposOcultosDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposOcultosDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposOcultosDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaFormaPago.add(this.jPanelid_anioDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposOcultosDetaFormaPago % 2==0) {
		iXPanelCamposOcultosDetaFormaPago=0;
		iYPanelCamposOcultosDetaFormaPago++;
	}
	this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaFormaPago.gridy = iYPanelCamposOcultosDetaFormaPago;
	this.gridBagConstraintsDetaFormaPago.gridx = iXPanelCamposOcultosDetaFormaPago++;
	this.gridBagConstraintsDetaFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaFormaPago.add(this.jPanelid_mesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);



	if(iXPanelCamposOcultosDetaFormaPago % 2==0) {
		iXPanelCamposOcultosDetaFormaPago=0;
		iYPanelCamposOcultosDetaFormaPago++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetaFormaPago= new GridBagLayout();
		this.jPanelAccionesDetaFormaPago.setLayout(gridaBagLayoutAccionesDetaFormaPago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetaFormaPago= new GridBagLayout();
		this.jPanelAccionesFormularioDetaFormaPago.setLayout(gridaBagLayoutAccionesFormularioDetaFormaPago);
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetaFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetaFormaPago.add(this.jComboBoxTiposAccionesFormularioDetaFormaPago, this.gridBagConstraintsDetaFormaPago);

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetaFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetaFormaPago.add(this.jCheckBoxPostAccionNuevoDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detaformapagoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetaFormaPago.add(this.jCheckBoxPostAccionSinCerrarDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detaformapagoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detaformapagoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetaFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetaFormaPago.add(this.jCheckBoxPostAccionSinMensajeDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetaFormaPago.add(this.jButtonModificarDetaFormaPago, this.gridBagConstraintsDetaFormaPago);							

		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPago.gridy = 0;
		this.gridBagConstraintsDetaFormaPago.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetaFormaPago.add(this.jButtonEliminarDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
			
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy = 0;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetaFormaPago.add(this.jButtonActualizarDetaFormaPago, this.gridBagConstraintsDetaFormaPago);


		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy = 0;		
		this.gridBagConstraintsDetaFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetaFormaPago.add(this.jButtonGuardarCambiosDetaFormaPago, this.gridBagConstraintsDetaFormaPago);	
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy = 0;		
		this.gridBagConstraintsDetaFormaPago.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetaFormaPago.add(this.jButtonCancelarDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetaFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetaFormaPago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detaformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetaFormaPago.gridx = 0;		
			//this.gridBagConstraintsDetaFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetaFormaPago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetaFormaPago.gridx =0;
		this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetaFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetaFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetaFormaPago = new DetaFormaPagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Deta Forma Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Deta Forma Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Deta Forma Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetaFormaPagoModel detaformapagoModel=new DetaFormaPagoModel(this);
			
			//SI USARA CLASE INTERNA
			//DetaFormaPagoModel.DetaFormaPagoFocusTraversalPolicy detaformapagoFocusTraversalPolicy = detaformapagoModel.new DetaFormaPagoFocusTraversalPolicy(this);
			
			//detaformapagoFocusTraversalPolicy.setdetaformapagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detaformapagoModel);
			
			
			this.jContentPaneDetalleDetaFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetaFormaPago = new GridBagLayout();	
			this.jContentPaneDetalleDetaFormaPago.setLayout(gridaBagLayoutDetalleDetaFormaPago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetaFormaPago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
				this.gridBagConstraintsDetaFormaPago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetaFormaPago.gridx = 0;
					
				
				this.jContentPaneDetalleDetaFormaPago.add(jTtoolBarDetalleDetaFormaPago, gridBagConstraintsDetaFormaPago);								
				
}
			
			this.jScrollPanelDatosEdicionDetaFormaPago=   new JScrollPane(jContentPaneDetalleDetaFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetaFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetaFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetaFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetaFormaPago.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetaFormaPago.gridx = 0;
	        
			this.jContentPaneDetalleDetaFormaPago.add(jPanelCamposDetaFormaPago, gridBagConstraintsDetaFormaPago);
			
			
			
			
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
						&& detaformapagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameBancoFormaPago(this.puedeCargarPorParteBancoFormaPago,false,-1);
					
					if(this.detaformapagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetaFormaPago= new GridBagConstraints();
						this.gridBagConstraintsDetaFormaPago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetaFormaPago.gridx = 0;
						this.jContentPaneDetalleDetaFormaPago.add(this.jTabbedPaneRelacionesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetaFormaPago.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameBancoFormaPago(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetaFormaPago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
					this.gridBagConstraintsDetaFormaPago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetaFormaPago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetaFormaPago.gridx = 0;
					
				
					this.jContentPaneDetalleDetaFormaPago.add(jPanelCamposOcultosDetaFormaPago, gridBagConstraintsDetaFormaPago);
				
					this.jPanelCamposOcultosDetaFormaPago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsDetaFormaPago.gridx = 0;
	        this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetaFormaPago.add(this.jPanelAccionesFormularioDetaFormaPago, this.gridBagConstraintsDetaFormaPago);							
			
			
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
	        this.gridBagConstraintsDetaFormaPago.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsDetaFormaPago.gridx = 0;
	        
			
			this.jContentPaneDetalleDetaFormaPago.add(this.jPanelAccionesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetaFormaPago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetaFormaPago=   new JScrollPane(this.jPanelCamposDetaFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetaFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetaFormaPago.gridx = 0;
			this.gridBagConstraintsDetaFormaPago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetaFormaPago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetaFormaPago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetaFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetaFormaPago, this.gridBagConstraintsDetaFormaPago);			
			
			this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetaFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
			
			
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		
			
		this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetaFormaPago, this.gridBagConstraintsDetaFormaPago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetaFormaPago;//jContentPane;
		
		return jScrollPanelDatosEdicionDetaFormaPago;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameBancoFormaPago(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
		this.bancoformapagoSessionBean.setConGuardarRelaciones(false);
		this.bancoformapagoSessionBean.setEsGuardarRelacionado(true);

		this.bancoformapagoBeanSwingJInternalFrame=null;//new BancoFormaPagoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.bancoformapagoBeanSwingJInternalFramePopup=new BancoFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.bancoformapagoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {

				BancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=DetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
				BancoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.bancoformapagoSessionBean.setEsGuardarRelacionado(true);

				this.bancoformapagoBeanSwingJInternalFrame=new BancoFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.bancoformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.bancoformapagoBeanSwingJInternalFrame.setbancoformapagoSessionBean(this.bancoformapagoSessionBean);

				//this.gridBagConstraintsDetaFormaPago = new GridBagConstraints();
				//this.gridBagConstraintsDetaFormaPago.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetaFormaPago.gridx = 0;
				//this.jContentPaneDetalleDetaFormaPago.add(this.bancoformapagoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetaFormaPago);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetaFormaPago.add("Banco Forma Pagos",this.bancoformapagoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetaFormaPago.setComponentAt(iIndexTab,this.bancoformapagoBeanSwingJInternalFrame.getContentPane());
				}

				//BancoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.bancoformapagoSessionBean.setEsGuardarRelacionado(false);
				this.bancoformapagoBeanSwingJInternalFrame=null;//new BancoFormaPagoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.bancoformapagoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteBancoFormaPago) {
					this.jTabbedPaneRelacionesDetaFormaPago.add("Banco Forma Pagos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarBancoFormaPagoBeanSwingJInternalFrame(List<DetaFormaPago> detaformapagos,DetaFormaPago detaformapago,BancoFormaPagoBeanSwingJInternalFrame bancoformapagoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//bancoformapagoBeanSwingJInternalFrame=new BancoFormaPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					bancoformapagoBeanSwingJInternalFrame.getBancoFormaPagoLogic().setConnexion(this.detaformapagoLogic.getConnexion());

					bancoformapagoBeanSwingJInternalFrame.setdetaformapagosForeignKey(detaformapagos);
					bancoformapagoBeanSwingJInternalFrame.setdetaformapagoForeignKey(detaformapago);
					bancoformapagoBeanSwingJInternalFrame.bancoformapagoSessionBean.setisBusquedaDesdeForeignKeySesionDetaFormaPago(true);
					bancoformapagoBeanSwingJInternalFrame.bancoformapagoSessionBean.setlidDetaFormaPagoActual(detaformapago.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					bancoformapagoBeanSwingJInternalFrame.cargarCombosForeignKeyBancoFormaPago(bancoformapagoBeanSwingJInternalFrame.isCargarCombosDependencia);
					bancoformapagoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetaFormaPago(true);
					bancoformapagoBeanSwingJInternalFrame.setid_deta_forma_pagoFK_IdDetaFormaPago(detaformapago.getId());

					if(!this.conCargarFormDetalle) {
						bancoformapagoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					bancoformapagoBeanSwingJInternalFrame.setSelectedItemCombosFrameDetaFormaPagoForeignKey(detaformapago,1,false,true,true);
					bancoformapagoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					bancoformapagoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetaFormaPago");
					bancoformapagoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetaFormaPago");
					bancoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBancoFormaPago(true);
					bancoformapagoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesBancoFormaPago("n",bancoformapagoBeanSwingJInternalFrame.isGuardarCambiosEnLote, bancoformapagoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					bancoformapagoBeanSwingJInternalFrame.setAutoscrolls(true);
					bancoformapagoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						bancoformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsBancoFormaPago("relacionado");
					} else {
						bancoformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsBancoFormaPago("no_relacionado");
					}

					bancoformapagoBeanSwingJInternalFrame.getjButtonRecargarInformacionBancoFormaPago().setVisible(false);

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
