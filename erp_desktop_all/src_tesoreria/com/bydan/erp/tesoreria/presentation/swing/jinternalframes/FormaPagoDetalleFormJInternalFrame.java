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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.tesoreria.util.FormaPagoConstantesFunciones;

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
public class FormaPagoDetalleFormJInternalFrame extends FormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFormaPago;
	
	protected JMenuBar jmenuBarDetalleFormaPago;
	
	protected JMenu jmenuDetalleFormaPago;
	protected JMenu jmenuDetalleArchivoFormaPago;
	protected JMenu jmenuDetalleAccionesFormaPago;
	protected JMenu jmenuDetalleDatosFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormaPago;	
	protected GridBagConstraints gridBagConstraintsFormaPago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FormaPagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleFormaPago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablereteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablerete="";
	
	public FormaPagoSessionBean formapagoSessionBean;
	
	

	public FormularioRentaExtraBeanSwingJInternalFrame formulariorentaextraBeanSwingJInternalFrame=null;
	public FormularioRentaExtraBeanSwingJInternalFrame formulariorentaextraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormularioRentaExtra=false;
	public FormularioRentaExtraSessionBean formulariorentaextraSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CuentaContableSessionBean cuentacontablereteSessionBean;	
	
	public FormaPagoLogic formapagoLogic;
	
	public JScrollPane jScrollPanelDatosFormaPago;
	public JScrollPane jScrollPanelDatosEdicionFormaPago;
	public JScrollPane jScrollPanelDatosGeneralFormaPago;
	
	protected JPanel jPanelCamposFormaPago;    
	protected JPanel jPanelCamposOcultosFormaPago;    	
	protected JPanel jPanelAccionesFormaPago;
	protected JPanel jPanelAccionesFormularioFormaPago;
    
	
	
	protected Integer iXPanelCamposFormaPago=0;
	protected Integer iYPanelCamposFormaPago=0;
	
	protected Integer iXPanelCamposOcultosFormaPago=0;
	protected Integer iYPanelCamposOcultosFormaPago=0;
	
	

	protected JPanel jPanelCamposIniciogeneralFormaPago;
	protected Integer iXPanelCamposIniciogeneralFormaPago=0;
	protected Integer iYPanelCamposIniciogeneralFormaPago=0;

	protected JPanel jPanelCamposInicioretencionFormaPago;
	protected Integer iXPanelCamposInicioretencionFormaPago=0;
	protected Integer iYPanelCamposInicioretencionFormaPago=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFormaPago;
	public JButton jButtonModificarFormaPago;
	public JButton jButtonActualizarFormaPago;
    public JButton jButtonEliminarFormaPago;
	public JButton jButtonCancelarFormaPago;
    public JButton jButtonGuardarCambiosFormaPago;
	public JButton jButtonGuardarCambiosTablaFormaPago;
	protected JButton jButtonCerrarFormaPago;
	
	
	protected JButton jButtonProcesarInformacionFormaPago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFormaPago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormaPago;
	protected JButton jButtonModificarToolBarFormaPago;
	protected JButton jButtonActualizarToolBarFormaPago;
    protected JButton jButtonEliminarToolBarFormaPago;
	protected JButton jButtonCancelarToolBarFormaPago;
    protected JButton jButtonGuardarCambiosToolBarFormaPago;
	protected JButton jButtonGuardarCambiosTablaToolBarFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarFormaPago;
	protected JButton jButtonCerrarToolBarFormaPago;
	
	protected JButton jButtonProcesarInformacionToolBarFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormaPago;
	protected JMenuItem jMenuItemModificarFormaPago;
	protected JMenuItem jMenuItemActualizarFormaPago;
    protected JMenuItem jMenuItemEliminarFormaPago;
	protected JMenuItem jMenuItemCancelarFormaPago;
    protected JMenuItem jMenuItemGuardarCambiosFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormaPago;
	protected JMenuItem jMenuItemCerrarFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormaPago;
	
	protected JMenuItem jMenuItemProcesarInformacionFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormaPago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormaPago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFormaPago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFormaPago;
	public JLabel jLabelIdFormaPago;
	public JLabel jLabelidFormaPago;
	public JButton jButtonidFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnombreFormaPago;
	public JLabel jLabelnombreFormaPago;
	public JTextArea jTextAreanombreFormaPago;
	public JScrollPane jscrollPanenombreFormaPago;
	public JButton jButtonnombreFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelsiglasFormaPago;
	public JLabel jLabelsiglasFormaPago;
	public JTextField jTextFieldsiglasFormaPago;
	public JButton jButtonsiglasFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diasFormaPago;
	public JLabel jLabelnumero_diasFormaPago;
	public JTextField jTextFieldnumero_diasFormaPago;
	public JButton jButtonnumero_diasFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeFormaPago;
	public JLabel jLabelporcentajeFormaPago;
	public JTextField jTextFieldporcentajeFormaPago;
	public JButton jButtonporcentajeFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelvalorFormaPago;
	public JLabel jLabelvalorFormaPago;
	public JTextField jTextFieldvalorFormaPago;
	public JButton jButtonvalorFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelcon_detalleFormaPago;
	public JLabel jLabelcon_detalleFormaPago;
	public JCheckBox jCheckBoxcon_detalleFormaPago;
	public JButton jButtoncon_detalleFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelcon_remesaFormaPago;
	public JLabel jLabelcon_remesaFormaPago;
	public JCheckBox jCheckBoxcon_remesaFormaPago;
	public JButton jButtoncon_remesaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelcon_maneja_cuotasFormaPago;
	public JLabel jLabelcon_maneja_cuotasFormaPago;
	public JCheckBox jCheckBoxcon_maneja_cuotasFormaPago;
	public JButton jButtoncon_maneja_cuotasFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelfechaFormaPago;
	public JLabel jLabelfechaFormaPago;
	//public JFormattedTextField jDateChooserfechaFormaPago;

	public JDateChooser jDateChooserfechaFormaPago;
	public JButton jButtonfechaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finFormaPago;
	public JLabel jLabelfecha_finFormaPago;
	//public JFormattedTextField jDateChooserfecha_finFormaPago;

	public JDateChooser jDateChooserfecha_finFormaPago;
	public JButton jButtonfecha_finFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_reteFormaPago;
	public JLabel jLabelporcentaje_reteFormaPago;
	public JTextField jTextFieldporcentaje_reteFormaPago;
	public JButton jButtonporcentaje_reteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelbase_retencionFormaPago;
	public JLabel jLabelbase_retencionFormaPago;
	public JTextField jTextFieldbase_retencionFormaPago;
	public JButton jButtonbase_retencionFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_retencionFormaPago;
	public JLabel jLabelvalor_retencionFormaPago;
	public JTextField jTextFieldvalor_retencionFormaPago;
	public JButton jButtonvalor_retencionFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencionFormaPago;
	public JLabel jLabelnumero_retencionFormaPago;
	public JTextField jTextFieldnumero_retencionFormaPago;
	public JButton jButtonnumero_retencionFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_retencionFormaPago;
	public JLabel jLabelnombre_retencionFormaPago;
	public JTextArea jTextAreanombre_retencionFormaPago;
	public JScrollPane jscrollPanenombre_retencionFormaPago;
	public JButton jButtonnombre_retencionFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFormaPago;
	public JLabel jLabelid_empresaFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFormaPago;
	public JButton jButtonid_empresaFormaPago= new JButtonMe();
	public JButton jButtonid_empresaFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_empresaFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFormaPago;
	public JLabel jLabelid_sucursalFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFormaPago;
	public JButton jButtonid_sucursalFormaPago= new JButtonMe();
	public JButton jButtonid_sucursalFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloFormaPago;
	public JLabel jLabelid_moduloFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloFormaPago;
	public JButton jButtonid_moduloFormaPago= new JButtonMe();
	public JButton jButtonid_moduloFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_moduloFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioFormaPago;
	public JLabel jLabelid_ejercicioFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioFormaPago;
	public JButton jButtonid_ejercicioFormaPago= new JButtonMe();
	public JButton jButtonid_ejercicioFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoFormaPago;
	public JLabel jLabelid_periodoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoFormaPago;
	public JButton jButtonid_periodoFormaPago= new JButtonMe();
	public JButton jButtonid_periodoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_periodoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioFormaPago;
	public JLabel jLabelid_anioFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFormaPago;
	public JButton jButtonid_anioFormaPago= new JButtonMe();
	public JButton jButtonid_anioFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_anioFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesFormaPago;
	public JLabel jLabelid_mesFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFormaPago;
	public JButton jButtonid_mesFormaPago= new JButtonMe();
	public JButton jButtonid_mesFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_mesFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_forma_pagoFormaPago;
	public JLabel jLabelid_tipo_forma_pagoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoFormaPago;
	public JButton jButtonid_tipo_forma_pagoFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionFormaPago;
	public JLabel jLabelid_transaccionFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFormaPago;
	public JButton jButtonid_transaccionFormaPago= new JButtonMe();
	public JButton jButtonid_transaccionFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloFormaPago;
	public JLabel jLabelid_tipo_transaccion_moduloFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFormaPago;
	public JButton jButtonid_tipo_transaccion_moduloFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableFormaPago;
	public JLabel jLabelid_cuenta_contableFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFormaPago;
	public JButton jButtonid_cuenta_contableFormaPago= new JButtonMe();
	public JButton jButtonid_cuenta_contableFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFormaPagoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFormaPagoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_reteFormaPago;
	public JLabel jLabelid_cuenta_contable_reteFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_reteFormaPago;
	public JButton jButtonid_cuenta_contable_reteFormaPago= new JButtonMe();
	public JButton jButtonid_cuenta_contable_reteFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_reteFormaPagoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_reteFormaPagoArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFormaPago;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FormaPagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFormaPago=new JPanel();
				this.jPanelAccionesFormularioFormaPago=new JPanel();
				this.jmenuBarDetalleFormaPago=new JMenuBar();
				this.jTtoolBarDetalleFormaPago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FormaPagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFormaPago() {
		return this.jButtonActualizarToolBarFormaPago;
	}
	
	public JButton getjButtonEliminarToolBarFormaPago() {
		return this.jButtonEliminarToolBarFormaPago;
	}
	
	public JButton getjButtonCancelarToolBarFormaPago() {
		return this.jButtonCancelarToolBarFormaPago;
	}		
	
	public JButton getjButtonProcesarInformacionFormaPago() {
		return this.jButtonProcesarInformacionFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormaPago)	{
		this.jButtonProcesarInformacionFormaPago = jButtonProcesarInformacionFormaPago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormaPago() {
		return this.jComboBoxTiposAccionesFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormaPago(
			JComboBox jComboBoxTiposRelacionesFormaPago) {
		this.jComboBoxTiposRelacionesFormaPago = jComboBoxTiposRelacionesFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormaPago(
			JComboBox jComboBoxTiposAccionesFormaPago) {
		this.jComboBoxTiposAccionesFormaPago = jComboBoxTiposAccionesFormaPago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFormaPago() {
		return this.jComboBoxTiposAccionesFormularioFormaPago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFormaPago(
			JComboBox jComboBoxTiposAccionesFormularioFormaPago) {
		this.jComboBoxTiposAccionesFormularioFormaPago = jComboBoxTiposAccionesFormularioFormaPago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formapagoSessionBean=new FormaPagoSessionBean();
		
		this.formapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formapagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.formulariorentaextraSessionBean=new FormularioRentaExtraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.formapagoSessionBean.getEsGuardarRelacionado()) {
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
	
		FormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFormaPago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFormaPago=new JButtonMe();
				this.jButtonModificarToolBarFormaPago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFormaPago,this.jTtoolBarDetalleFormaPago,
							"actualizar","actualizar","Actualizar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFormaPago,this.jTtoolBarDetalleFormaPago,
							"eliminar","eliminar","Eliminar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFormaPago,this.jTtoolBarDetalleFormaPago,
							"cancelar","cancelar","Cancelar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFormaPago,this.jTtoolBarDetalleFormaPago,
							"guardarcambios","guardarcambios","Guardar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFormaPago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFormaPago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFormaPago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFormaPago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFormaPago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFormaPago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFormaPago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFormaPago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFormaPago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFormaPago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFormaPago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFormaPago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFormaPago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFormaPago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFormaPago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFormaPago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFormaPago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFormaPago.add(this.jMenuItemDetalleCerrarFormaPago);
		
		this.jmenuDetalleAccionesFormaPago.add(this.jMenuItemActualizarFormaPago);
		this.jmenuDetalleAccionesFormaPago.add(this.jMenuItemEliminarFormaPago);
		this.jmenuDetalleAccionesFormaPago.add(this.jMenuItemCancelarFormaPago);		
		
		//this.jmenuDetalleDatosFormaPago.add(this.jMenuItemDetalleAbrirOrderByFormaPago);				
		this.jmenuDetalleDatosFormaPago.add(this.jMenuItemDetalleMostarOcultarFormaPago);				
				
		//this.jmenuDetalleAccionesFormaPago.add(this.jMenuItemGuardarCambiosFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFormaPago.add(this.jmenuDetalleArchivoFormaPago);		
		this.jmenuBarDetalleFormaPago.add(this.jmenuDetalleAccionesFormaPago);		
		this.jmenuBarDetalleFormaPago.add(this.jmenuDetalleDatosFormaPago);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFormaPago.add(this.jmenuDetalleFormaPago);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFormaPago);				
	}
	
	
	public void inicializarElementosCamposFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFormaPago = new JLabelMe();
		jLabelIdFormaPago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFormaPago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFormaPago= new GridBagLayout();

		this.jPanelidFormaPago.setLayout(this.gridaBagLayoutFormaPago);

		jLabelidFormaPago = new JLabel();
		jLabelidFormaPago.setText("Id");

		jLabelidFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreFormaPago = new JLabelMe();
		this.jLabelnombreFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreFormaPago.setToolTipText("Nombre");
		this.jLabelnombreFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelnombreFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jTextAreanombreFormaPago= new JTextAreaMe();
		jTextAreanombreFormaPago.setEnabled(false);
		jTextAreanombreFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFormaPago.setLineWrap(true);
		jTextAreanombreFormaPago.setWrapStyleWord(true);
		jTextAreanombreFormaPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreFormaPago.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreFormaPago = new JScrollPane(jTextAreanombreFormaPago);
		jscrollPanenombreFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreFormaPagoBusqueda= new JButtonMe();
		this.jButtonnombreFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreFormaPagoBusqueda.setText("U");
		this.jButtonnombreFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelsiglasFormaPago = new JLabelMe();
		this.jLabelsiglasFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_SIGLAS+" : *");
		this.jLabelsiglasFormaPago.setToolTipText("Siglas");
		this.jLabelsiglasFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglasFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglasFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglasFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_SIGLAS);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelsiglasFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jTextFieldsiglasFormaPago= new JTextFieldMe();

		jTextFieldsiglasFormaPago.setEnabled(false);
		jTextFieldsiglasFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglasFormaPagoBusqueda= new JButtonMe();
		this.jButtonsiglasFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglasFormaPagoBusqueda.setText("U");
		this.jButtonsiglasFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglasFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglasFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglasFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglasFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglasFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglasFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_diasFormaPago = new JLabelMe();
		this.jLabelnumero_diasFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_NUMERODIAS+" : *");
		this.jLabelnumero_diasFormaPago.setToolTipText("Numero Dias");
		this.jLabelnumero_diasFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diasFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diasFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diasFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_NUMERODIAS);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelnumero_diasFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jTextFieldnumero_diasFormaPago= new JTextFieldMe();
		jTextFieldnumero_diasFormaPago.setEnabled(false);
		jTextFieldnumero_diasFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diasFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_diasFormaPago.setText("0");

		this.jButtonnumero_diasFormaPagoBusqueda= new JButtonMe();
		this.jButtonnumero_diasFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diasFormaPagoBusqueda.setText("U");
		this.jButtonnumero_diasFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diasFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diasFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diasFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diasFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diasFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diasFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeFormaPago = new JLabelMe();
		this.jLabelporcentajeFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeFormaPago.setToolTipText("Porcentaje");
		this.jLabelporcentajeFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelporcentajeFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jTextFieldporcentajeFormaPago= new JTextFieldMe();
		jTextFieldporcentajeFormaPago.setEnabled(false);
		jTextFieldporcentajeFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeFormaPago.setText("0.0");

		this.jButtonporcentajeFormaPagoBusqueda= new JButtonMe();
		this.jButtonporcentajeFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeFormaPagoBusqueda.setText("U");
		this.jButtonporcentajeFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelvalorFormaPago = new JLabelMe();
		this.jLabelvalorFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorFormaPago.setToolTipText("Valor");
		this.jLabelvalorFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelvalorFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jTextFieldvalorFormaPago= new JTextFieldMe();
		jTextFieldvalorFormaPago.setEnabled(false);
		jTextFieldvalorFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorFormaPago.setText("0.0");

		this.jButtonvalorFormaPagoBusqueda= new JButtonMe();
		this.jButtonvalorFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorFormaPagoBusqueda.setText("U");
		this.jButtonvalorFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelcon_detalleFormaPago = new JLabelMe();
		this.jLabelcon_detalleFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_CONDETALLE+" : *");
		this.jLabelcon_detalleFormaPago.setToolTipText("Con Detalle");
		this.jLabelcon_detalleFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_detalleFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_detalleFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_detalleFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_detalleFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_detalleFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_CONDETALLE);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelcon_detalleFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jCheckBoxcon_detalleFormaPago= new JCheckBoxMe();
		jCheckBoxcon_detalleFormaPago.setEnabled(false);

		jCheckBoxcon_detalleFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalleFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalleFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_detalleFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_detalleFormaPagoBusqueda= new JButtonMe();
		this.jButtoncon_detalleFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalleFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalleFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_detalleFormaPagoBusqueda.setText("U");
		this.jButtoncon_detalleFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_detalleFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_detalleFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_detalleFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_detalleFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_detalleFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_detalleFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelcon_remesaFormaPago = new JLabelMe();
		this.jLabelcon_remesaFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_CONREMESA+" : *");
		this.jLabelcon_remesaFormaPago.setToolTipText("Con Remesa");
		this.jLabelcon_remesaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_remesaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_remesaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_remesaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_remesaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_remesaFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_CONREMESA);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelcon_remesaFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jCheckBoxcon_remesaFormaPago= new JCheckBoxMe();
		jCheckBoxcon_remesaFormaPago.setEnabled(false);

		jCheckBoxcon_remesaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_remesaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_remesaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_remesaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_remesaFormaPagoBusqueda= new JButtonMe();
		this.jButtoncon_remesaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_remesaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_remesaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_remesaFormaPagoBusqueda.setText("U");
		this.jButtoncon_remesaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_remesaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_remesaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_remesaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_remesaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_remesaFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_remesaFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelcon_maneja_cuotasFormaPago = new JLabelMe();
		this.jLabelcon_maneja_cuotasFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_CONMANEJACUOTAS+" : *");
		this.jLabelcon_maneja_cuotasFormaPago.setToolTipText("Con Maneja Cuotas");
		this.jLabelcon_maneja_cuotasFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_maneja_cuotasFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_maneja_cuotasFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_maneja_cuotasFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_maneja_cuotasFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_maneja_cuotasFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_CONMANEJACUOTAS);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelcon_maneja_cuotasFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jCheckBoxcon_maneja_cuotasFormaPago= new JCheckBoxMe();
		jCheckBoxcon_maneja_cuotasFormaPago.setEnabled(false);

		jCheckBoxcon_maneja_cuotasFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_maneja_cuotasFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_maneja_cuotasFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_maneja_cuotasFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_maneja_cuotasFormaPagoBusqueda= new JButtonMe();
		this.jButtoncon_maneja_cuotasFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_maneja_cuotasFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_maneja_cuotasFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_maneja_cuotasFormaPagoBusqueda.setText("U");
		this.jButtoncon_maneja_cuotasFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_maneja_cuotasFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_maneja_cuotasFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_maneja_cuotasFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_maneja_cuotasFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_maneja_cuotasFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_maneja_cuotasFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelfechaFormaPago = new JLabelMe();
		this.jLabelfechaFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaFormaPago.setToolTipText("Fecha");
		this.jLabelfechaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelfechaFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		//jFormattedTextFieldfechaFormaPago= new JFormattedTextFieldMe();

		jDateChooserfechaFormaPago= new JDateChooser();
		jDateChooserfechaFormaPago.setEnabled(false);
		jDateChooserfechaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaFormaPago.setDate(new Date());
		jDateChooserfechaFormaPago.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaFormaPago.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaFormaPagoBusqueda= new JButtonMe();
		this.jButtonfechaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaFormaPagoBusqueda.setText("U");
		this.jButtonfechaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finFormaPago = new JLabelMe();
		this.jLabelfecha_finFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finFormaPago.setToolTipText("Fecha Fin");
		this.jLabelfecha_finFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelfecha_finFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		//jFormattedTextFieldfecha_finFormaPago= new JFormattedTextFieldMe();

		jDateChooserfecha_finFormaPago= new JDateChooser();
		jDateChooserfecha_finFormaPago.setEnabled(false);
		jDateChooserfecha_finFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finFormaPago.setDate(new Date());
		jDateChooserfecha_finFormaPago.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finFormaPago.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finFormaPagoBusqueda= new JButtonMe();
		this.jButtonfecha_finFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finFormaPagoBusqueda.setText("U");
		this.jButtonfecha_finFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_reteFormaPago = new JLabelMe();
		this.jLabelporcentaje_reteFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_PORCENTAJERETE+" : *");
		this.jLabelporcentaje_reteFormaPago.setToolTipText("Porcentaje Retencion");
		this.jLabelporcentaje_reteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelporcentaje_reteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelporcentaje_reteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_reteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_reteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_reteFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_PORCENTAJERETE);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelporcentaje_reteFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jTextFieldporcentaje_reteFormaPago= new JTextFieldMe();
		jTextFieldporcentaje_reteFormaPago.setEnabled(false);
		jTextFieldporcentaje_reteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_reteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_reteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_reteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_reteFormaPago.setText("0.0");

		this.jButtonporcentaje_reteFormaPagoBusqueda= new JButtonMe();
		this.jButtonporcentaje_reteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_reteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_reteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_reteFormaPagoBusqueda.setText("U");
		this.jButtonporcentaje_reteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_reteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_reteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_reteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_reteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_reteFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_reteFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelbase_retencionFormaPago = new JLabelMe();
		this.jLabelbase_retencionFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_BASERETENCION+" : *");
		this.jLabelbase_retencionFormaPago.setToolTipText("Base Retencion");
		this.jLabelbase_retencionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_retencionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_retencionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_retencionFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_retencionFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_retencionFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_BASERETENCION);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelbase_retencionFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jTextFieldbase_retencionFormaPago= new JTextFieldMe();
		jTextFieldbase_retencionFormaPago.setEnabled(false);
		jTextFieldbase_retencionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_retencionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_retencionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_retencionFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_retencionFormaPago.setText("0.0");

		this.jButtonbase_retencionFormaPagoBusqueda= new JButtonMe();
		this.jButtonbase_retencionFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_retencionFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_retencionFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_retencionFormaPagoBusqueda.setText("U");
		this.jButtonbase_retencionFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_retencionFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_retencionFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_retencionFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_retencionFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_retencionFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_retencionFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_retencionFormaPago = new JLabelMe();
		this.jLabelvalor_retencionFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_VALORRETENCION+" : *");
		this.jLabelvalor_retencionFormaPago.setToolTipText("Valor Retencion");
		this.jLabelvalor_retencionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_retencionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_retencionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_retencionFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_retencionFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_retencionFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_VALORRETENCION);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelvalor_retencionFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jTextFieldvalor_retencionFormaPago= new JTextFieldMe();
		jTextFieldvalor_retencionFormaPago.setEnabled(false);
		jTextFieldvalor_retencionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_retencionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_retencionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_retencionFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_retencionFormaPago.setText("0.0");

		this.jButtonvalor_retencionFormaPagoBusqueda= new JButtonMe();
		this.jButtonvalor_retencionFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_retencionFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_retencionFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_retencionFormaPagoBusqueda.setText("U");
		this.jButtonvalor_retencionFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_retencionFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_retencionFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_retencionFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_retencionFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_retencionFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_retencionFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencionFormaPago = new JLabelMe();
		this.jLabelnumero_retencionFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_NUMERORETENCION+" :");
		this.jLabelnumero_retencionFormaPago.setToolTipText("Numero Retencion");
		this.jLabelnumero_retencionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_retencionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_retencionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencionFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencionFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencionFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_NUMERORETENCION);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelnumero_retencionFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jTextFieldnumero_retencionFormaPago= new JTextFieldMe();

		jTextFieldnumero_retencionFormaPago.setEnabled(false);
		jTextFieldnumero_retencionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencionFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_retencionFormaPagoBusqueda= new JButtonMe();
		this.jButtonnumero_retencionFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencionFormaPagoBusqueda.setText("U");
		this.jButtonnumero_retencionFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencionFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencionFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencionFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencionFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencionFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencionFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelnombre_retencionFormaPago = new JLabelMe();
		this.jLabelnombre_retencionFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_NOMBRERETENCION+" :");
		this.jLabelnombre_retencionFormaPago.setToolTipText("Nombre Retencion");
		this.jLabelnombre_retencionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_retencionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_retencionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_retencionFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_retencionFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_retencionFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_NOMBRERETENCION);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelnombre_retencionFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jTextAreanombre_retencionFormaPago= new JTextAreaMe();
		jTextAreanombre_retencionFormaPago.setEnabled(false);
		jTextAreanombre_retencionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_retencionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_retencionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_retencionFormaPago.setLineWrap(true);
		jTextAreanombre_retencionFormaPago.setWrapStyleWord(true);
		jTextAreanombre_retencionFormaPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_retencionFormaPago.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_retencionFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_retencionFormaPago = new JScrollPane(jTextAreanombre_retencionFormaPago);
		jscrollPanenombre_retencionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_retencionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_retencionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_retencionFormaPagoBusqueda= new JButtonMe();
		this.jButtonnombre_retencionFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_retencionFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_retencionFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_retencionFormaPagoBusqueda.setText("U");
		this.jButtonnombre_retencionFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_retencionFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_retencionFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_retencionFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_retencionFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_retencionFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_retencionFormaPagoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFormaPago = new JLabelMe();
		this.jLabelid_empresaFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFormaPago.setToolTipText("Empresa");
		this.jLabelid_empresaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelid_empresaFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jComboBoxid_empresaFormaPago= new JComboBoxMe();
		jComboBoxid_empresaFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFormaPago.setEnabled(false);

		this.jButtonid_empresaFormaPago= new JButtonMe();
		this.jButtonid_empresaFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormaPago.setText("Buscar");
		this.jButtonid_empresaFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormaPago"));

		this.jButtonid_empresaFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_empresaFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormaPagoBusqueda.setText("U");
		this.jButtonid_empresaFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_empresaFormaPagoUpdate= new JButtonMe();
		this.jButtonid_empresaFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormaPagoUpdate.setText("U");
		this.jButtonid_empresaFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormaPagoUpdate"));



					
		this.jLabelid_sucursalFormaPago = new JLabelMe();
		this.jLabelid_sucursalFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFormaPago.setToolTipText("Sucursal");
		this.jLabelid_sucursalFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelid_sucursalFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jComboBoxid_sucursalFormaPago= new JComboBoxMe();
		jComboBoxid_sucursalFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFormaPago.setEnabled(false);

		this.jButtonid_sucursalFormaPago= new JButtonMe();
		this.jButtonid_sucursalFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormaPago.setText("Buscar");
		this.jButtonid_sucursalFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormaPago"));

		this.jButtonid_sucursalFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_sucursalFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFormaPagoBusqueda.setText("U");
		this.jButtonid_sucursalFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFormaPagoUpdate= new JButtonMe();
		this.jButtonid_sucursalFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFormaPagoUpdate.setText("U");
		this.jButtonid_sucursalFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormaPagoUpdate"));



					
		this.jLabelid_moduloFormaPago = new JLabelMe();
		this.jLabelid_moduloFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloFormaPago.setToolTipText("Modulo");
		this.jLabelid_moduloFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelid_moduloFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jComboBoxid_moduloFormaPago= new JComboBoxMe();
		jComboBoxid_moduloFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloFormaPago.setEnabled(false);

		this.jButtonid_moduloFormaPago= new JButtonMe();
		this.jButtonid_moduloFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloFormaPago.setText("Buscar");
		this.jButtonid_moduloFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloFormaPago"));

		this.jButtonid_moduloFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_moduloFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloFormaPagoBusqueda.setText("U");
		this.jButtonid_moduloFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_moduloFormaPagoUpdate= new JButtonMe();
		this.jButtonid_moduloFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloFormaPagoUpdate.setText("U");
		this.jButtonid_moduloFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloFormaPagoUpdate"));



					
		this.jLabelid_ejercicioFormaPago = new JLabelMe();
		this.jLabelid_ejercicioFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioFormaPago.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelid_ejercicioFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jComboBoxid_ejercicioFormaPago= new JComboBoxMe();
		jComboBoxid_ejercicioFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioFormaPago.setEnabled(false);

		this.jButtonid_ejercicioFormaPago= new JButtonMe();
		this.jButtonid_ejercicioFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormaPago.setText("Buscar");
		this.jButtonid_ejercicioFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormaPago"));

		this.jButtonid_ejercicioFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFormaPagoBusqueda.setText("U");
		this.jButtonid_ejercicioFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioFormaPagoUpdate= new JButtonMe();
		this.jButtonid_ejercicioFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFormaPagoUpdate.setText("U");
		this.jButtonid_ejercicioFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormaPagoUpdate"));



					
		this.jLabelid_periodoFormaPago = new JLabelMe();
		this.jLabelid_periodoFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoFormaPago.setToolTipText("Periodo");
		this.jLabelid_periodoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelid_periodoFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jComboBoxid_periodoFormaPago= new JComboBoxMe();
		jComboBoxid_periodoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoFormaPago.setEnabled(false);

		this.jButtonid_periodoFormaPago= new JButtonMe();
		this.jButtonid_periodoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormaPago.setText("Buscar");
		this.jButtonid_periodoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormaPago"));

		this.jButtonid_periodoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_periodoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFormaPagoBusqueda.setText("U");
		this.jButtonid_periodoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_periodoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_periodoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFormaPagoUpdate.setText("U");
		this.jButtonid_periodoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormaPagoUpdate"));



					
		this.jLabelid_anioFormaPago = new JLabelMe();
		this.jLabelid_anioFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioFormaPago.setToolTipText("Anio");
		this.jLabelid_anioFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelid_anioFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jComboBoxid_anioFormaPago= new JComboBoxMe();
		jComboBoxid_anioFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioFormaPago.setEnabled(false);

		this.jButtonid_anioFormaPago= new JButtonMe();
		this.jButtonid_anioFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFormaPago.setText("Buscar");
		this.jButtonid_anioFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFormaPago"));

		this.jButtonid_anioFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_anioFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioFormaPagoBusqueda.setText("U");
		this.jButtonid_anioFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_anioFormaPagoUpdate= new JButtonMe();
		this.jButtonid_anioFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioFormaPagoUpdate.setText("U");
		this.jButtonid_anioFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFormaPagoUpdate"));



					
		this.jLabelid_mesFormaPago = new JLabelMe();
		this.jLabelid_mesFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesFormaPago.setToolTipText("Mes");
		this.jLabelid_mesFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelid_mesFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jComboBoxid_mesFormaPago= new JComboBoxMe();
		jComboBoxid_mesFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesFormaPago.setEnabled(false);

		this.jButtonid_mesFormaPago= new JButtonMe();
		this.jButtonid_mesFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFormaPago.setText("Buscar");
		this.jButtonid_mesFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFormaPago"));

		this.jButtonid_mesFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_mesFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesFormaPagoBusqueda.setText("U");
		this.jButtonid_mesFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_mesFormaPagoUpdate= new JButtonMe();
		this.jButtonid_mesFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesFormaPagoUpdate.setText("U");
		this.jButtonid_mesFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFormaPagoUpdate"));



					
		this.jLabelid_tipo_forma_pagoFormaPago = new JLabelMe();
		this.jLabelid_tipo_forma_pagoFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO+" : *");
		this.jLabelid_tipo_forma_pagoFormaPago.setToolTipText("Tipo Forma Pago");
		this.jLabelid_tipo_forma_pagoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_forma_pagoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_forma_pagoFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelid_tipo_forma_pagoFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jComboBoxid_tipo_forma_pagoFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_forma_pagoFormaPago= new JButtonMe();
		this.jButtonid_tipo_forma_pagoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoFormaPago.setText("Buscar");
		this.jButtonid_tipo_forma_pagoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_forma_pagoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_forma_pagoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoFormaPago"));

		this.jButtonid_tipo_forma_pagoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_tipo_forma_pagoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoFormaPagoBusqueda.setText("U");
		this.jButtonid_tipo_forma_pagoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_forma_pagoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_forma_pagoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_forma_pagoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_forma_pagoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_tipo_forma_pagoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoFormaPagoUpdate.setText("U");
		this.jButtonid_tipo_forma_pagoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_forma_pagoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_forma_pagoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoFormaPagoUpdate"));



					
		this.jLabelid_transaccionFormaPago = new JLabelMe();
		this.jLabelid_transaccionFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionFormaPago.setToolTipText("Transaccion");
		this.jLabelid_transaccionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelid_transaccionFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jComboBoxid_transaccionFormaPago= new JComboBoxMe();
		jComboBoxid_transaccionFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionFormaPago= new JButtonMe();
		this.jButtonid_transaccionFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionFormaPago.setText("Buscar");
		this.jButtonid_transaccionFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionFormaPago"));

		this.jButtonid_transaccionFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_transaccionFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionFormaPagoBusqueda.setText("U");
		this.jButtonid_transaccionFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_transaccionFormaPagoUpdate= new JButtonMe();
		this.jButtonid_transaccionFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionFormaPagoUpdate.setText("U");
		this.jButtonid_transaccionFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionFormaPagoUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloFormaPago = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloFormaPago.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jComboBoxid_tipo_transaccion_moduloFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloFormaPago.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloFormaPago= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloFormaPago.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloFormaPago"));

		this.jButtonid_tipo_transaccion_moduloFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloFormaPagoBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloFormaPagoUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloFormaPagoUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloFormaPagoUpdate"));



					
		this.jLabelid_cuenta_contableFormaPago = new JLabelMe();
		this.jLabelid_cuenta_contableFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableFormaPago.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelid_cuenta_contableFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jComboBoxid_cuenta_contableFormaPago= new JComboBoxMe();
		jComboBoxid_cuenta_contableFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableFormaPago= new JButtonMe();
		this.jButtonid_cuenta_contableFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableFormaPago.setText("Buscar");
		this.jButtonid_cuenta_contableFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormaPago"));

		this.jButtonid_cuenta_contableFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableFormaPagoBusqueda.setText("U");
		this.jButtonid_cuenta_contableFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableFormaPagoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableFormaPagoUpdate.setText("U");
		this.jButtonid_cuenta_contableFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormaPagoUpdate"));


		jButtonid_cuenta_contableFormaPagoArbol= new JButtonMe();
		jButtonid_cuenta_contableFormaPagoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableFormaPagoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableFormaPagoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableFormaPagoArbol.setText("Arbol");
		jButtonid_cuenta_contableFormaPagoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableFormaPagoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormaPagoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormaPagoArbol"));



					
		this.jLabelid_cuenta_contable_reteFormaPago = new JLabelMe();
		this.jLabelid_cuenta_contable_reteFormaPago.setText(""+FormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLERETE+" :");
		this.jLabelid_cuenta_contable_reteFormaPago.setToolTipText("Cuenta Contable Retencion");
		this.jLabelid_cuenta_contable_reteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_reteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_reteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_reteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_reteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_reteFormaPago.setToolTipText(FormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLERETE);
		this.gridaBagLayoutFormaPago = new GridBagLayout();
		this.jPanelid_cuenta_contable_reteFormaPago.setLayout(this.gridaBagLayoutFormaPago);


		jComboBoxid_cuenta_contable_reteFormaPago= new JComboBoxMe();
		jComboBoxid_cuenta_contable_reteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_reteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_reteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_reteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_reteFormaPago= new JButtonMe();
		this.jButtonid_cuenta_contable_reteFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_reteFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_reteFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_reteFormaPago.setText("Buscar");
		this.jButtonid_cuenta_contable_reteFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_reteFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_reteFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_reteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_reteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_reteFormaPago"));

		this.jButtonid_cuenta_contable_reteFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_reteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_reteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_reteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_reteFormaPagoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_reteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_reteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_reteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_reteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_reteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_reteFormaPagoBusqueda"));

		if(this.formapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_reteFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_reteFormaPagoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_reteFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_reteFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_reteFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_reteFormaPagoUpdate.setText("U");
		this.jButtonid_cuenta_contable_reteFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_reteFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_reteFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_reteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_reteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_reteFormaPagoUpdate"));


		jButtonid_cuenta_contable_reteFormaPagoArbol= new JButtonMe();
		jButtonid_cuenta_contable_reteFormaPagoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_reteFormaPagoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_reteFormaPagoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_reteFormaPagoArbol.setText("Arbol");
		jButtonid_cuenta_contable_reteFormaPagoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_reteFormaPagoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_reteFormaPagoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_reteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_reteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_reteFormaPagoArbol"));



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
		//this.jInternalFrameDetalleFormaPago = new FormaPagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Forma Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormaPago= new GridBagLayout();
		

		
		String sToolTipFormaPago="";
		sToolTipFormaPago=FormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormaPago+="(Tesoreria.FormaPago)";
		}
		
		if(!this.formapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormaPago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFormaPago = new JButtonMe();
		this.jButtonModificarFormaPago = new JButtonMe();
        this.jButtonActualizarFormaPago = new JButtonMe();
        this.jButtonEliminarFormaPago = new JButtonMe();
        this.jButtonCancelarFormaPago = new JButtonMe();
        this.jButtonGuardarCambiosFormaPago = new JButtonMe();
		this.jButtonGuardarCambiosTablaFormaPago = new JButtonMe();
		this.jButtonCerrarFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosFormaPago = new JScrollPane();   
        this.jScrollPanelDatosEdicionFormaPago = new JScrollPane();
		this.jScrollPanelDatosGeneralFormaPago = new JScrollPane();
				
		
		
		this.jPanelCamposFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioretencionFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Forma Pago";
		
		if(!this.formapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFormaPago.setName("jPanelCamposFormaPago"); 

		this.jPanelCamposOcultosFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFormaPago.setName("jPanelCamposOcultosFormaPago"); 

        this.jPanelAccionesFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesFormaPago.setName("Acciones"); 

		this.jPanelAccionesFormularioFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFormaPago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralFormaPago.setName("jPanelCamposFingeneralFormaPago");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioretencionFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Retencion"));
		this.jPanelCamposInicioretencionFormaPago.setName("jPanelCamposFinretencionFormaPago");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioretencionFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFormaPago.setText("Nuevo");
		this.jButtonModificarFormaPago.setText("Editar");
        this.jButtonActualizarFormaPago.setText("Actualizar");
        this.jButtonEliminarFormaPago.setText("Eliminar");
        this.jButtonCancelarFormaPago.setText("Cancelar");
        this.jButtonGuardarCambiosFormaPago.setText("Guardar");
		this.jButtonGuardarCambiosTablaFormaPago.setText("Guardar");
		this.jButtonCerrarFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormaPago,"nuevo_button","Nuevo",this.formapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFormaPago,"modificar_button","Editar",this.formapagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFormaPago,"actualizar_button","Actualizar",this.formapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFormaPago,"eliminar_button","Eliminar",this.formapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFormaPago,"cancelar_button","Cancelar",this.formapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFormaPago,"guardarcambios_button","Guardar",this.formapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormaPago,"guardarcambiostabla_button","Guardar",this.formapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormaPago,"cerrar_button","Salir",this.formapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFormaPago.setToolTipText("Nuevo"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFormaPago.setToolTipText("Editar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFormaPago.setToolTipText("Actualizar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFormaPago.setToolTipText("Eliminar)"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFormaPago.setToolTipText("Cancelar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFormaPago.setToolTipText("Guardar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFormaPago.setToolTipText("Guardar"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormaPago.setToolTipText("Salir"+" "+FormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormaPago";
		inputMap = this.jButtonNuevoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormaPago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFormaPago";
		inputMap = this.jButtonActualizarFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFormaPago"));
		
		//ELIMINAR
		sMapKey = "EliminarFormaPago";
		inputMap = this.jButtonEliminarFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFormaPago"));
		
		//CANCELAR	
		sMapKey = "CancelarFormaPago";
		inputMap = this.jButtonCancelarFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFormaPago"));
		
		//CERRAR		
		sMapKey = "CerrarFormaPago";
		inputMap = this.jButtonCerrarFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormaPago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFormaPago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFormaPago.setToolTipText("Nuevo FormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFormaPago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFormaPago.setToolTipText("Sin Cerrar Ventana FormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFormaPago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFormaPago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesFormaPago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFormaPago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFormaPago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFormaPago = new JLabelMe();
		
		this.jLabelAccionesFormaPago.setText("Acciones");		
		this.jLabelAccionesFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFormaPago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFormaPago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFormaPago=new JTabbedPane();
		this.jTabbedPaneRelacionesFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormaPago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFormaPago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFormaPago = new GridBagLayout();
		
		this.jPanelCamposFormaPago.setLayout(gridaBagLayoutCamposFormaPago);
		this.jPanelCamposOcultosFormaPago.setLayout(gridaBagLayoutCamposOcultosFormaPago);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralFormaPago= new GridBagLayout();
		this.jPanelCamposIniciogeneralFormaPago.setLayout(gridaBagLayoutCamposIniciogeneralFormaPago);

		GridBagLayout gridaBagLayoutCamposInicioretencionFormaPago= new GridBagLayout();
		this.jPanelCamposInicioretencionFormaPago.setLayout(gridaBagLayoutCamposInicioretencionFormaPago);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFormaPago.add(jLabelIdFormaPago, this.gridBagConstraintsFormaPago);



	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFormaPago.add(jLabelidFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFormaPago.add(jLabelid_empresaFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormaPago.add(jButtonid_empresaFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 3;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormaPago.add(jButtonid_empresaFormaPagoUpdate, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFormaPago.add(jComboBoxid_empresaFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalFormaPago.add(jLabelid_sucursalFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFormaPago.add(jButtonid_sucursalFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 3;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFormaPago.add(jButtonid_sucursalFormaPagoUpdate, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalFormaPago.add(jComboBoxid_sucursalFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloFormaPago.add(jLabelid_moduloFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloFormaPago.add(jButtonid_moduloFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 3;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloFormaPago.add(jButtonid_moduloFormaPagoUpdate, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloFormaPago.add(jComboBoxid_moduloFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioFormaPago.add(jLabelid_ejercicioFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFormaPago.add(jButtonid_ejercicioFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 3;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFormaPago.add(jButtonid_ejercicioFormaPagoUpdate, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioFormaPago.add(jComboBoxid_ejercicioFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoFormaPago.add(jLabelid_periodoFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFormaPago.add(jButtonid_periodoFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 3;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFormaPago.add(jButtonid_periodoFormaPagoUpdate, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoFormaPago.add(jComboBoxid_periodoFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioFormaPago.add(jLabelid_anioFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioFormaPago.add(jButtonid_anioFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 3;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioFormaPago.add(jButtonid_anioFormaPagoUpdate, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioFormaPago.add(jComboBoxid_anioFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesFormaPago.add(jLabelid_mesFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesFormaPago.add(jButtonid_mesFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 3;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesFormaPago.add(jButtonid_mesFormaPagoUpdate, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesFormaPago.add(jComboBoxid_mesFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_forma_pagoFormaPago.add(jLabelid_tipo_forma_pagoFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoFormaPago.add(jButtonid_tipo_forma_pagoFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 3;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoFormaPago.add(jButtonid_tipo_forma_pagoFormaPagoUpdate, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_forma_pagoFormaPago.add(jComboBoxid_tipo_forma_pagoFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreFormaPago.add(jLabelnombreFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreFormaPago.add(jButtonnombreFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreFormaPago.add(jscrollPanenombreFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglasFormaPago.add(jLabelsiglasFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglasFormaPago.add(jButtonsiglasFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglasFormaPago.add(jTextFieldsiglasFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_diasFormaPago.add(jLabelnumero_diasFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diasFormaPago.add(jButtonnumero_diasFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_diasFormaPago.add(jTextFieldnumero_diasFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeFormaPago.add(jLabelporcentajeFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeFormaPago.add(jButtonporcentajeFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeFormaPago.add(jTextFieldporcentajeFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorFormaPago.add(jLabelvalorFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorFormaPago.add(jButtonvalorFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorFormaPago.add(jTextFieldvalorFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_detalleFormaPago.add(jLabelcon_detalleFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_detalleFormaPago.add(jButtoncon_detalleFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_detalleFormaPago.add(jCheckBoxcon_detalleFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_remesaFormaPago.add(jLabelcon_remesaFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_remesaFormaPago.add(jButtoncon_remesaFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_remesaFormaPago.add(jCheckBoxcon_remesaFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_maneja_cuotasFormaPago.add(jLabelcon_maneja_cuotasFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_maneja_cuotasFormaPago.add(jButtoncon_maneja_cuotasFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_maneja_cuotasFormaPago.add(jCheckBoxcon_maneja_cuotasFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaFormaPago.add(jLabelfechaFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaFormaPago.add(jButtonfechaFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaFormaPago.add(jDateChooserfechaFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finFormaPago.add(jLabelfecha_finFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finFormaPago.add(jButtonfecha_finFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finFormaPago.add(jDateChooserfecha_finFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionFormaPago.add(jLabelid_transaccionFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionFormaPago.add(jButtonid_transaccionFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 3;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionFormaPago.add(jButtonid_transaccionFormaPagoUpdate, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionFormaPago.add(jComboBoxid_transaccionFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_transaccion_moduloFormaPago.add(jLabelid_tipo_transaccion_moduloFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloFormaPago.add(jButtonid_tipo_transaccion_moduloFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 3;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloFormaPago.add(jButtonid_tipo_transaccion_moduloFormaPagoUpdate, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_transaccion_moduloFormaPago.add(jComboBoxid_tipo_transaccion_moduloFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableFormaPago.add(jLabelid_cuenta_contableFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 2;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableFormaPago.add(jButtonid_cuenta_contableFormaPago, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 3;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableFormaPago.add(jButtonid_cuenta_contableFormaPagoArbol, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 4;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableFormaPago.add(jButtonid_cuenta_contableFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 5;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableFormaPago.add(jButtonid_cuenta_contableFormaPagoUpdate, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableFormaPago.add(jComboBoxid_cuenta_contableFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_reteFormaPago.add(jLabelid_cuenta_contable_reteFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 2;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_reteFormaPago.add(jButtonid_cuenta_contable_reteFormaPago, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 3;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_reteFormaPago.add(jButtonid_cuenta_contable_reteFormaPagoArbol, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 4;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_reteFormaPago.add(jButtonid_cuenta_contable_reteFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 5;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_reteFormaPago.add(jButtonid_cuenta_contable_reteFormaPagoUpdate, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_reteFormaPago.add(jComboBoxid_cuenta_contable_reteFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_reteFormaPago.add(jLabelporcentaje_reteFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_reteFormaPago.add(jButtonporcentaje_reteFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_reteFormaPago.add(jTextFieldporcentaje_reteFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbase_retencionFormaPago.add(jLabelbase_retencionFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_retencionFormaPago.add(jButtonbase_retencionFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbase_retencionFormaPago.add(jTextFieldbase_retencionFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_retencionFormaPago.add(jLabelvalor_retencionFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_retencionFormaPago.add(jButtonvalor_retencionFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_retencionFormaPago.add(jTextFieldvalor_retencionFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_retencionFormaPago.add(jLabelnumero_retencionFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencionFormaPago.add(jButtonnumero_retencionFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_retencionFormaPago.add(jTextFieldnumero_retencionFormaPago, this.gridBagConstraintsFormaPago);


	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 0;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_retencionFormaPago.add(jLabelnombre_retencionFormaPago, this.gridBagConstraintsFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = 2;
		this.gridBagConstraintsFormaPago.ipadx = 0;
		this.gridBagConstraintsFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_retencionFormaPago.add(jButtonnombre_retencionFormaPagoBusqueda, this.gridBagConstraintsFormaPago);
	}

	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPago.gridy = 0;
	this.gridBagConstraintsFormaPago.gridx = 1;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_retencionFormaPago.add(jscrollPanenombre_retencionFormaPago, this.gridBagConstraintsFormaPago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposOcultosFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposOcultosFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPago.add(this.jPanelid_empresaFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposOcultosFormaPago % 2==0) {
		iXPanelCamposOcultosFormaPago=0;
		iYPanelCamposOcultosFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposOcultosFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposOcultosFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPago.add(this.jPanelid_sucursalFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposOcultosFormaPago % 2==0) {
		iXPanelCamposOcultosFormaPago=0;
		iYPanelCamposOcultosFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposOcultosFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposOcultosFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPago.add(this.jPanelid_moduloFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposOcultosFormaPago % 2==0) {
		iXPanelCamposOcultosFormaPago=0;
		iYPanelCamposOcultosFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposOcultosFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposOcultosFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPago.add(this.jPanelid_ejercicioFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposOcultosFormaPago % 2==0) {
		iXPanelCamposOcultosFormaPago=0;
		iYPanelCamposOcultosFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposOcultosFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposOcultosFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPago.add(this.jPanelid_periodoFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposOcultosFormaPago % 2==0) {
		iXPanelCamposOcultosFormaPago=0;
		iYPanelCamposOcultosFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposOcultosFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposOcultosFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPago.add(this.jPanelid_anioFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposOcultosFormaPago % 2==0) {
		iXPanelCamposOcultosFormaPago=0;
		iYPanelCamposOcultosFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposOcultosFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposOcultosFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPago.add(this.jPanelid_mesFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposOcultosFormaPago % 2==0) {
		iXPanelCamposOcultosFormaPago=0;
		iYPanelCamposOcultosFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposOcultosFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposOcultosFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPago.add(this.jPanelid_tipo_transaccion_moduloFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposOcultosFormaPago % 2==0) {
		iXPanelCamposOcultosFormaPago=0;
		iYPanelCamposOcultosFormaPago++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposIniciogeneralFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposIniciogeneralFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPago.add(this.jPanelidFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposIniciogeneralFormaPago % 2==0) {
		iXPanelCamposIniciogeneralFormaPago=0;
		iYPanelCamposIniciogeneralFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposIniciogeneralFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposIniciogeneralFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPago.add(this.jPanelid_tipo_forma_pagoFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposIniciogeneralFormaPago % 2==0) {
		iXPanelCamposIniciogeneralFormaPago=0;
		iYPanelCamposIniciogeneralFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposIniciogeneralFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposIniciogeneralFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPago.add(this.jPanelnombreFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposIniciogeneralFormaPago % 2==0) {
		iXPanelCamposIniciogeneralFormaPago=0;
		iYPanelCamposIniciogeneralFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposIniciogeneralFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposIniciogeneralFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPago.add(this.jPanelsiglasFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposIniciogeneralFormaPago % 2==0) {
		iXPanelCamposIniciogeneralFormaPago=0;
		iYPanelCamposIniciogeneralFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposIniciogeneralFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposIniciogeneralFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPago.add(this.jPanelnumero_diasFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposIniciogeneralFormaPago % 2==0) {
		iXPanelCamposIniciogeneralFormaPago=0;
		iYPanelCamposIniciogeneralFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposIniciogeneralFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposIniciogeneralFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPago.add(this.jPanelporcentajeFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposIniciogeneralFormaPago % 2==0) {
		iXPanelCamposIniciogeneralFormaPago=0;
		iYPanelCamposIniciogeneralFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposIniciogeneralFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposIniciogeneralFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPago.add(this.jPanelvalorFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposIniciogeneralFormaPago % 2==0) {
		iXPanelCamposIniciogeneralFormaPago=0;
		iYPanelCamposIniciogeneralFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposIniciogeneralFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposIniciogeneralFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPago.add(this.jPanelcon_detalleFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposIniciogeneralFormaPago % 2==0) {
		iXPanelCamposIniciogeneralFormaPago=0;
		iYPanelCamposIniciogeneralFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposIniciogeneralFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposIniciogeneralFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPago.add(this.jPanelcon_remesaFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposIniciogeneralFormaPago % 2==0) {
		iXPanelCamposIniciogeneralFormaPago=0;
		iYPanelCamposIniciogeneralFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposIniciogeneralFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposIniciogeneralFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPago.add(this.jPanelcon_maneja_cuotasFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposIniciogeneralFormaPago % 2==0) {
		iXPanelCamposIniciogeneralFormaPago=0;
		iYPanelCamposIniciogeneralFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposIniciogeneralFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposIniciogeneralFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPago.add(this.jPanelfechaFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposIniciogeneralFormaPago % 2==0) {
		iXPanelCamposIniciogeneralFormaPago=0;
		iYPanelCamposIniciogeneralFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposIniciogeneralFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposIniciogeneralFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPago.add(this.jPanelfecha_finFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposIniciogeneralFormaPago % 2==0) {
		iXPanelCamposIniciogeneralFormaPago=0;
		iYPanelCamposIniciogeneralFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposIniciogeneralFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposIniciogeneralFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPago.add(this.jPanelid_transaccionFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposIniciogeneralFormaPago % 2==0) {
		iXPanelCamposIniciogeneralFormaPago=0;
		iYPanelCamposIniciogeneralFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposIniciogeneralFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposIniciogeneralFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPago.add(this.jPanelid_cuenta_contableFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposIniciogeneralFormaPago % 2==0) {
		iXPanelCamposIniciogeneralFormaPago=0;
		iYPanelCamposIniciogeneralFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposInicioretencionFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposInicioretencionFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioretencionFormaPago.add(this.jPanelid_cuenta_contable_reteFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposInicioretencionFormaPago % 2==0) {
		iXPanelCamposInicioretencionFormaPago=0;
		iYPanelCamposInicioretencionFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposInicioretencionFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposInicioretencionFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioretencionFormaPago.add(this.jPanelporcentaje_reteFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposInicioretencionFormaPago % 2==0) {
		iXPanelCamposInicioretencionFormaPago=0;
		iYPanelCamposInicioretencionFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposInicioretencionFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposInicioretencionFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioretencionFormaPago.add(this.jPanelbase_retencionFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposInicioretencionFormaPago % 2==0) {
		iXPanelCamposInicioretencionFormaPago=0;
		iYPanelCamposInicioretencionFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposInicioretencionFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposInicioretencionFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioretencionFormaPago.add(this.jPanelvalor_retencionFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposInicioretencionFormaPago % 2==0) {
		iXPanelCamposInicioretencionFormaPago=0;
		iYPanelCamposInicioretencionFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposInicioretencionFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposInicioretencionFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioretencionFormaPago.add(this.jPanelnumero_retencionFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposInicioretencionFormaPago % 2==0) {
		iXPanelCamposInicioretencionFormaPago=0;
		iYPanelCamposInicioretencionFormaPago++;
	}
	this.gridBagConstraintsFormaPago = new GridBagConstraints();
	this.gridBagConstraintsFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPago.gridy = iYPanelCamposInicioretencionFormaPago;
	this.gridBagConstraintsFormaPago.gridx = iXPanelCamposInicioretencionFormaPago++;
	this.gridBagConstraintsFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioretencionFormaPago.add(this.jPanelnombre_retencionFormaPago, this.gridBagConstraintsFormaPago);



	if(iXPanelCamposInicioretencionFormaPago % 2==0) {
		iXPanelCamposInicioretencionFormaPago=0;
		iYPanelCamposInicioretencionFormaPago++;
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
			
		GridBagLayout gridaBagLayoutAccionesFormaPago= new GridBagLayout();
		this.jPanelAccionesFormaPago.setLayout(gridaBagLayoutAccionesFormaPago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFormaPago= new GridBagLayout();
		this.jPanelAccionesFormularioFormaPago.setLayout(gridaBagLayoutAccionesFormularioFormaPago);
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormaPago.add(this.jComboBoxTiposAccionesFormularioFormaPago, this.gridBagConstraintsFormaPago);

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormaPago.add(this.jCheckBoxPostAccionNuevoFormaPago, this.gridBagConstraintsFormaPago);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.formapagoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormaPago.add(this.jCheckBoxPostAccionSinCerrarFormaPago, this.gridBagConstraintsFormaPago);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.formapagoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.formapagoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormaPago.add(this.jCheckBoxPostAccionSinMensajeFormaPago, this.gridBagConstraintsFormaPago);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx = iPosXAccion++;
			
		this.jPanelAccionesFormaPago.add(this.jButtonModificarFormaPago, this.gridBagConstraintsFormaPago);							

		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPago.gridy = 0;
		this.gridBagConstraintsFormaPago.gridx =iPosXAccion++;
			
		this.jPanelAccionesFormaPago.add(this.jButtonEliminarFormaPago, this.gridBagConstraintsFormaPago);
		
			
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy = 0;		
		this.gridBagConstraintsFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormaPago.add(this.jButtonActualizarFormaPago, this.gridBagConstraintsFormaPago);


		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy = 0;		
		this.gridBagConstraintsFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormaPago.add(this.jButtonGuardarCambiosFormaPago, this.gridBagConstraintsFormaPago);	
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy = 0;		
		this.gridBagConstraintsFormaPago.gridx =iPosXAccion++;
		
		this.jPanelAccionesFormaPago.add(this.jButtonCancelarFormaPago, this.gridBagConstraintsFormaPago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormaPago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormaPago.gridx = 0;		
			//this.gridBagConstraintsFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormaPago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormaPago.gridx =0;
		this.gridBagConstraintsFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormaPago, this.gridBagConstraintsFormaPago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFormaPago = new FormaPagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Forma Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Forma Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Forma Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FormaPagoModel formapagoModel=new FormaPagoModel(this);
			
			//SI USARA CLASE INTERNA
			//FormaPagoModel.FormaPagoFocusTraversalPolicy formapagoFocusTraversalPolicy = formapagoModel.new FormaPagoFocusTraversalPolicy(this);
			
			//formapagoFocusTraversalPolicy.setformapagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(formapagoModel);
			
			
			this.jContentPaneDetalleFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFormaPago = new GridBagLayout();	
			this.jContentPaneDetalleFormaPago.setLayout(gridaBagLayoutDetalleFormaPago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormaPago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFormaPago = new GridBagConstraints();
				this.gridBagConstraintsFormaPago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFormaPago.gridx = 0;
					
				
				this.jContentPaneDetalleFormaPago.add(jTtoolBarDetalleFormaPago, gridBagConstraintsFormaPago);								
				
}
			
			this.jScrollPanelDatosEdicionFormaPago=   new JScrollPane(jContentPaneDetalleFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFormaPago.gridy = iGridyRelaciones++;
		this.gridBagConstraintsFormaPago.gridx = 0;

		this.jContentPaneDetalleFormaPago.add(jPanelCamposIniciogeneralFormaPago, gridBagConstraintsFormaPago);


		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFormaPago.gridy = iGridyRelaciones++;
		this.gridBagConstraintsFormaPago.gridx = 0;

		this.jContentPaneDetalleFormaPago.add(jPanelCamposInicioretencionFormaPago, gridBagConstraintsFormaPago);
			
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
						&& formapagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormularioRentaExtra(this.puedeCargarPorParteFormularioRentaExtra,false,-1);
					
					if(this.formapagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFormaPago= new GridBagConstraints();
						this.gridBagConstraintsFormaPago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFormaPago.gridx = 0;
						this.jContentPaneDetalleFormaPago.add(this.jTabbedPaneRelacionesFormaPago, this.gridBagConstraintsFormaPago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFormaPago.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormularioRentaExtra(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFormaPago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFormaPago = new GridBagConstraints();
					this.gridBagConstraintsFormaPago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFormaPago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFormaPago.gridx = 0;
					
				
					this.jContentPaneDetalleFormaPago.add(jPanelCamposOcultosFormaPago, gridBagConstraintsFormaPago);
				
					this.jPanelCamposOcultosFormaPago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsFormaPago.gridx = 0;
	        this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFormaPago.add(this.jPanelAccionesFormularioFormaPago, this.gridBagConstraintsFormaPago);							
			
			
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
	        this.gridBagConstraintsFormaPago.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsFormaPago.gridx = 0;
	        
			
			this.jContentPaneDetalleFormaPago.add(this.jPanelAccionesFormaPago, this.gridBagConstraintsFormaPago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFormaPago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFormaPago=   new JScrollPane(this.jPanelCamposFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFormaPago.gridx = 0;
			this.gridBagConstraintsFormaPago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFormaPago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFormaPago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFormaPago, this.gridBagConstraintsFormaPago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFormaPago, this.gridBagConstraintsFormaPago);			
			
			this.gridBagConstraintsFormaPago = new GridBagConstraints();
			this.gridBagConstraintsFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormaPago, this.gridBagConstraintsFormaPago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormaPago, this.gridBagConstraintsFormaPago);
			
			
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormaPago, this.gridBagConstraintsFormaPago);
		
			
		this.gridBagConstraintsFormaPago = new GridBagConstraints();
		this.gridBagConstraintsFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormaPago, this.gridBagConstraintsFormaPago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFormaPago;//jContentPane;
		
		return jScrollPanelDatosEdicionFormaPago;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFormularioRentaExtra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formulariorentaextraSessionBean=new FormularioRentaExtraSessionBean();
		this.formulariorentaextraSessionBean.setConGuardarRelaciones(false);
		this.formulariorentaextraSessionBean.setEsGuardarRelacionado(true);

		this.formulariorentaextraBeanSwingJInternalFrame=null;//new FormularioRentaExtraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formulariorentaextraBeanSwingJInternalFramePopup=new FormularioRentaExtraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formulariorentaextraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado()) {

				FormularioRentaExtraJInternalFrame.STIPO_TAMANIO_GENERAL=FormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormularioRentaExtraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formulariorentaextraSessionBean.setEsGuardarRelacionado(true);

				this.formulariorentaextraBeanSwingJInternalFrame=new FormularioRentaExtraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formulariorentaextraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formulariorentaextraBeanSwingJInternalFrame.setformulariorentaextraSessionBean(this.formulariorentaextraSessionBean);

				//this.gridBagConstraintsFormaPago = new GridBagConstraints();
				//this.gridBagConstraintsFormaPago.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFormaPago.gridx = 0;
				//this.jContentPaneDetalleFormaPago.add(this.formulariorentaextraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFormaPago);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFormaPago.add("Formulario Renta Extras",this.formulariorentaextraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFormaPago.setComponentAt(iIndexTab,this.formulariorentaextraBeanSwingJInternalFrame.getContentPane());
				}

				//FormularioRentaExtraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formulariorentaextraSessionBean.setEsGuardarRelacionado(false);
				this.formulariorentaextraBeanSwingJInternalFrame=null;//new FormularioRentaExtraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormularioRentaExtra) {
					this.jTabbedPaneRelacionesFormaPago.add("Formulario Renta Extras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormularioRentaExtraBeanSwingJInternalFrame(List<FormaPago> formapagos,FormaPago formapago,FormularioRentaExtraBeanSwingJInternalFrame formulariorentaextraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formulariorentaextraBeanSwingJInternalFrame=new FormularioRentaExtraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formulariorentaextraBeanSwingJInternalFrame.getFormularioRentaExtraLogic().setConnexion(this.formapagoLogic.getConnexion());

					formulariorentaextraBeanSwingJInternalFrame.setformapagosForeignKey(formapagos);
					formulariorentaextraBeanSwingJInternalFrame.setformapagoForeignKey(formapago);
					formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraSessionBean.setisBusquedaDesdeForeignKeySesionFormaPago(true);
					formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraSessionBean.setlidFormaPagoActual(formapago.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formulariorentaextraBeanSwingJInternalFrame.cargarCombosForeignKeyFormularioRentaExtra(formulariorentaextraBeanSwingJInternalFrame.isCargarCombosDependencia);
					formulariorentaextraBeanSwingJInternalFrame.setVisibilidadBusquedasParaFormaPago(true);
					formulariorentaextraBeanSwingJInternalFrame.setid_forma_pagoFK_IdFormaPago(formapago.getId());

					if(!this.conCargarFormDetalle) {
						formulariorentaextraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formulariorentaextraBeanSwingJInternalFrame.setSelectedItemCombosFrameFormaPagoForeignKey(formapago,1,false,true,true);
					formulariorentaextraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formulariorentaextraBeanSwingJInternalFrame.procesarBusqueda("FK_IdFormaPago");
					formulariorentaextraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFormaPago");
					formulariorentaextraBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormularioRentaExtra(true);
					formulariorentaextraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormularioRentaExtra("n",formulariorentaextraBeanSwingJInternalFrame.isGuardarCambiosEnLote, formulariorentaextraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formulariorentaextraBeanSwingJInternalFrame.setAutoscrolls(true);
					formulariorentaextraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formulariorentaextraBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioRentaExtra("relacionado");
					} else {
						formulariorentaextraBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioRentaExtra("no_relacionado");
					}

					formulariorentaextraBeanSwingJInternalFrame.getjButtonRecargarInformacionFormularioRentaExtra().setVisible(false);

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
