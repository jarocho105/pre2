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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.util.RegistroFormaPagoBancoConstantesFunciones;

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
public class RegistroFormaPagoBancoDetalleFormJInternalFrame extends RegistroFormaPagoBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRegistroFormaPagoBanco;
	
	protected JMenuBar jmenuBarDetalleRegistroFormaPagoBanco;
	
	protected JMenu jmenuDetalleRegistroFormaPagoBanco;
	protected JMenu jmenuDetalleArchivoRegistroFormaPagoBanco;
	protected JMenu jmenuDetalleAccionesRegistroFormaPagoBanco;
	protected JMenu jmenuDetalleDatosRegistroFormaPagoBanco;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRegistroFormaPagoBanco;	
	protected GridBagConstraints gridBagConstraintsRegistroFormaPagoBanco;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RegistroFormaPagoBancoBeanSwingJInternalFrameAdditional jInternalFrameDetalleRegistroFormaPagoBanco;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame estadoregistroformapagobancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoregistroformapagobanco="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public RegistroFormaPagoBancoSessionBean registroformapagobancoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public EstadoRegistroFormaPagoBancoSessionBean estadoregistroformapagobancoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public RegistroFormaPagoBancoLogic registroformapagobancoLogic;
	
	public JScrollPane jScrollPanelDatosRegistroFormaPagoBanco;
	public JScrollPane jScrollPanelDatosEdicionRegistroFormaPagoBanco;
	public JScrollPane jScrollPanelDatosGeneralRegistroFormaPagoBanco;
	
	protected JPanel jPanelCamposRegistroFormaPagoBanco;    
	protected JPanel jPanelCamposOcultosRegistroFormaPagoBanco;    	
	protected JPanel jPanelAccionesRegistroFormaPagoBanco;
	protected JPanel jPanelAccionesFormularioRegistroFormaPagoBanco;
    
	
	
	protected Integer iXPanelCamposRegistroFormaPagoBanco=0;
	protected Integer iYPanelCamposRegistroFormaPagoBanco=0;
	
	protected Integer iXPanelCamposOcultosRegistroFormaPagoBanco=0;
	protected Integer iYPanelCamposOcultosRegistroFormaPagoBanco=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRegistroFormaPagoBanco;
	public JButton jButtonModificarRegistroFormaPagoBanco;
	public JButton jButtonActualizarRegistroFormaPagoBanco;
    public JButton jButtonEliminarRegistroFormaPagoBanco;
	public JButton jButtonCancelarRegistroFormaPagoBanco;
    public JButton jButtonGuardarCambiosRegistroFormaPagoBanco;
	public JButton jButtonGuardarCambiosTablaRegistroFormaPagoBanco;
	protected JButton jButtonCerrarRegistroFormaPagoBanco;
	
	
	protected JButton jButtonProcesarInformacionRegistroFormaPagoBanco;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRegistroFormaPagoBanco;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRegistroFormaPagoBanco;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRegistroFormaPagoBanco;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRegistroFormaPagoBanco;
	protected JButton jButtonModificarToolBarRegistroFormaPagoBanco;
	protected JButton jButtonActualizarToolBarRegistroFormaPagoBanco;
    protected JButton jButtonEliminarToolBarRegistroFormaPagoBanco;
	protected JButton jButtonCancelarToolBarRegistroFormaPagoBanco;
    protected JButton jButtonGuardarCambiosToolBarRegistroFormaPagoBanco;
	protected JButton jButtonGuardarCambiosTablaToolBarRegistroFormaPagoBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarRegistroFormaPagoBanco;
	protected JButton jButtonCerrarToolBarRegistroFormaPagoBanco;
	
	protected JButton jButtonProcesarInformacionToolBarRegistroFormaPagoBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemModificarRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemActualizarRegistroFormaPagoBanco;
    protected JMenuItem jMenuItemEliminarRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemCancelarRegistroFormaPagoBanco;
    protected JMenuItem jMenuItemGuardarCambiosRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemCerrarRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemDetalleCerrarRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarRegistroFormaPagoBanco;
	
	protected JMenuItem jMenuItemProcesarInformacionRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRegistroFormaPagoBanco;
	protected JMenuItem jMenuItemMostrarOcultarRegistroFormaPagoBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRegistroFormaPagoBanco;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRegistroFormaPagoBanco;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRegistroFormaPagoBanco;
	public JLabel jLabelIdRegistroFormaPagoBanco;
	public JLabel jLabelidRegistroFormaPagoBanco;
	public JButton jButtonidRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bancoRegistroFormaPagoBanco;
	public JLabel jLabelnombre_bancoRegistroFormaPagoBanco;
	public JTextArea jTextAreanombre_bancoRegistroFormaPagoBanco;
	public JScrollPane jscrollPanenombre_bancoRegistroFormaPagoBanco;
	public JButton jButtonnombre_bancoRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_giradorRegistroFormaPagoBanco;
	public JLabel jLabelnombre_giradorRegistroFormaPagoBanco;
	public JTextArea jTextAreanombre_giradorRegistroFormaPagoBanco;
	public JScrollPane jscrollPanenombre_giradorRegistroFormaPagoBanco;
	public JButton jButtonnombre_giradorRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoRegistroFormaPagoBanco;
	public JLabel jLabelfecha_vencimientoRegistroFormaPagoBanco;
	//public JFormattedTextField jDateChooserfecha_vencimientoRegistroFormaPagoBanco;

	public JDateChooser jDateChooserfecha_vencimientoRegistroFormaPagoBanco;
	public JButton jButtonfecha_vencimientoRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuentaRegistroFormaPagoBanco;
	public JLabel jLabelnumero_cuentaRegistroFormaPagoBanco;
	public JTextField jTextFieldnumero_cuentaRegistroFormaPagoBanco;
	public JButton jButtonnumero_cuentaRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequeRegistroFormaPagoBanco;
	public JLabel jLabelnumero_chequeRegistroFormaPagoBanco;
	public JTextField jTextFieldnumero_chequeRegistroFormaPagoBanco;
	public JButton jButtonnumero_chequeRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_montoRegistroFormaPagoBanco;
	public JLabel jLabelvalor_montoRegistroFormaPagoBanco;
	public JTextField jTextFieldvalor_montoRegistroFormaPagoBanco;
	public JButton jButtonvalor_montoRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelfechaRegistroFormaPagoBanco;
	public JLabel jLabelfechaRegistroFormaPagoBanco;
	//public JFormattedTextField jDateChooserfechaRegistroFormaPagoBanco;

	public JDateChooser jDateChooserfechaRegistroFormaPagoBanco;
	public JButton jButtonfechaRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimiento_originalRegistroFormaPagoBanco;
	public JLabel jLabelfecha_vencimiento_originalRegistroFormaPagoBanco;
	//public JFormattedTextField jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco;

	public JDateChooser jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco;
	public JButton jButtonfecha_vencimiento_originalRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cambioRegistroFormaPagoBanco;
	public JLabel jLabelnumero_cambioRegistroFormaPagoBanco;
	public JTextField jTextFieldnumero_cambioRegistroFormaPagoBanco;
	public JButton jButtonnumero_cambioRegistroFormaPagoBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRegistroFormaPagoBanco;
	public JLabel jLabelid_empresaRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRegistroFormaPagoBanco;
	public JButton jButtonid_empresaRegistroFormaPagoBanco= new JButtonMe();
	public JButton jButtonid_empresaRegistroFormaPagoBancoUpdate= new JButtonMe();
	public JButton jButtonid_empresaRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalRegistroFormaPagoBanco;
	public JLabel jLabelid_sucursalRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalRegistroFormaPagoBanco;
	public JButton jButtonid_sucursalRegistroFormaPagoBanco= new JButtonMe();
	public JButton jButtonid_sucursalRegistroFormaPagoBancoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioRegistroFormaPagoBanco;
	public JLabel jLabelid_ejercicioRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioRegistroFormaPagoBanco;
	public JButton jButtonid_ejercicioRegistroFormaPagoBanco= new JButtonMe();
	public JButton jButtonid_ejercicioRegistroFormaPagoBancoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoRegistroFormaPagoBanco;
	public JLabel jLabelid_periodoRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoRegistroFormaPagoBanco;
	public JButton jButtonid_periodoRegistroFormaPagoBanco= new JButtonMe();
	public JButton jButtonid_periodoRegistroFormaPagoBancoUpdate= new JButtonMe();
	public JButton jButtonid_periodoRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableRegistroFormaPagoBanco;
	public JLabel jLabelid_asiento_contableRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableRegistroFormaPagoBanco;
	public JButton jButtonid_asiento_contableRegistroFormaPagoBanco= new JButtonMe();
	public JButton jButtonid_asiento_contableRegistroFormaPagoBancoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_forma_pagoRegistroFormaPagoBanco;
	public JLabel jLabelid_tipo_forma_pagoRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco;
	public JButton jButtonid_tipo_forma_pagoRegistroFormaPagoBanco= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoRegistroFormaPagoBancoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco;
	public JLabel jLabelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco;
	public JButton jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco= new JButtonMe();
	public JButton jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoUpdate= new JButtonMe();
	public JButton jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteRegistroFormaPagoBanco;
	public JLabel jLabelid_clienteRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteRegistroFormaPagoBanco;
	public JButton jButtonid_clienteRegistroFormaPagoBanco= new JButtonMe();
	public JButton jButtonid_clienteRegistroFormaPagoBancoUpdate= new JButtonMe();
	public JButton jButtonid_clienteRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioRegistroFormaPagoBanco;
	public JLabel jLabelid_anioRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioRegistroFormaPagoBanco;
	public JButton jButtonid_anioRegistroFormaPagoBanco= new JButtonMe();
	public JButton jButtonid_anioRegistroFormaPagoBancoUpdate= new JButtonMe();
	public JButton jButtonid_anioRegistroFormaPagoBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesRegistroFormaPagoBanco;
	public JLabel jLabelid_mesRegistroFormaPagoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesRegistroFormaPagoBanco;
	public JButton jButtonid_mesRegistroFormaPagoBanco= new JButtonMe();
	public JButton jButtonid_mesRegistroFormaPagoBancoUpdate= new JButtonMe();
	public JButton jButtonid_mesRegistroFormaPagoBancoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRegistroFormaPagoBanco;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RegistroFormaPagoBancoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRegistroFormaPagoBanco=new JPanel();
				this.jPanelAccionesFormularioRegistroFormaPagoBanco=new JPanel();
				this.jmenuBarDetalleRegistroFormaPagoBanco=new JMenuBar();
				this.jTtoolBarDetalleRegistroFormaPagoBanco=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RegistroFormaPagoBancoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RegistroFormaPagoBancoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RegistroFormaPagoBancoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RegistroFormaPagoBancoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RegistroFormaPagoBancoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RegistroFormaPagoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRegistroFormaPagoBanco() {
		return this.jButtonActualizarToolBarRegistroFormaPagoBanco;
	}
	
	public JButton getjButtonEliminarToolBarRegistroFormaPagoBanco() {
		return this.jButtonEliminarToolBarRegistroFormaPagoBanco;
	}
	
	public JButton getjButtonCancelarToolBarRegistroFormaPagoBanco() {
		return this.jButtonCancelarToolBarRegistroFormaPagoBanco;
	}		
	
	public JButton getjButtonProcesarInformacionRegistroFormaPagoBanco() {
		return this.jButtonProcesarInformacionRegistroFormaPagoBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRegistroFormaPagoBanco)	{
		this.jButtonProcesarInformacionRegistroFormaPagoBanco = jButtonProcesarInformacionRegistroFormaPagoBanco;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRegistroFormaPagoBanco() {
		return this.jComboBoxTiposAccionesRegistroFormaPagoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposRelacionesRegistroFormaPagoBanco) {
		this.jComboBoxTiposRelacionesRegistroFormaPagoBanco = jComboBoxTiposRelacionesRegistroFormaPagoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposAccionesRegistroFormaPagoBanco) {
		this.jComboBoxTiposAccionesRegistroFormaPagoBanco = jComboBoxTiposAccionesRegistroFormaPagoBanco;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRegistroFormaPagoBanco() {
		return this.jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRegistroFormaPagoBanco(
			JComboBox jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco) {
		this.jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco = jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.registroformapagobancoSessionBean=new RegistroFormaPagoBancoSessionBean();
		
		this.registroformapagobancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.registroformapagobancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.registroformapagobancoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RegistroFormaPagoBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Registro Forma Pago Banco MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.registroformapagobancoSessionBean.getEsGuardarRelacionado()) {
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
	
		RegistroFormaPagoBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRegistroFormaPagoBanco= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRegistroFormaPagoBanco=new JButtonMe();
				this.jButtonModificarToolBarRegistroFormaPagoBanco=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRegistroFormaPagoBanco,this.jTtoolBarDetalleRegistroFormaPagoBanco,
							"actualizar","actualizar","Actualizar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRegistroFormaPagoBanco,this.jTtoolBarDetalleRegistroFormaPagoBanco,
							"eliminar","eliminar","Eliminar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRegistroFormaPagoBanco,this.jTtoolBarDetalleRegistroFormaPagoBanco,
							"cancelar","cancelar","Cancelar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRegistroFormaPagoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRegistroFormaPagoBanco,this.jTtoolBarDetalleRegistroFormaPagoBanco,
							"guardarcambios","guardarcambios","Guardar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRegistroFormaPagoBanco=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRegistroFormaPagoBanco=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRegistroFormaPagoBanco=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRegistroFormaPagoBanco=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRegistroFormaPagoBanco=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRegistroFormaPagoBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRegistroFormaPagoBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRegistroFormaPagoBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRegistroFormaPagoBanco= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRegistroFormaPagoBanco.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRegistroFormaPagoBanco,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRegistroFormaPagoBanco= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRegistroFormaPagoBanco.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRegistroFormaPagoBanco,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRegistroFormaPagoBanco= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRegistroFormaPagoBanco.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRegistroFormaPagoBanco,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRegistroFormaPagoBanco= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRegistroFormaPagoBanco.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRegistroFormaPagoBanco,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRegistroFormaPagoBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRegistroFormaPagoBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRegistroFormaPagoBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRegistroFormaPagoBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRegistroFormaPagoBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRegistroFormaPagoBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRegistroFormaPagoBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRegistroFormaPagoBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRegistroFormaPagoBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRegistroFormaPagoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRegistroFormaPagoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRegistroFormaPagoBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRegistroFormaPagoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRegistroFormaPagoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRegistroFormaPagoBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRegistroFormaPagoBanco.add(this.jMenuItemDetalleCerrarRegistroFormaPagoBanco);
		
		this.jmenuDetalleAccionesRegistroFormaPagoBanco.add(this.jMenuItemActualizarRegistroFormaPagoBanco);
		this.jmenuDetalleAccionesRegistroFormaPagoBanco.add(this.jMenuItemEliminarRegistroFormaPagoBanco);
		this.jmenuDetalleAccionesRegistroFormaPagoBanco.add(this.jMenuItemCancelarRegistroFormaPagoBanco);		
		
		//this.jmenuDetalleDatosRegistroFormaPagoBanco.add(this.jMenuItemDetalleAbrirOrderByRegistroFormaPagoBanco);				
		this.jmenuDetalleDatosRegistroFormaPagoBanco.add(this.jMenuItemDetalleMostarOcultarRegistroFormaPagoBanco);				
				
		//this.jmenuDetalleAccionesRegistroFormaPagoBanco.add(this.jMenuItemGuardarCambiosRegistroFormaPagoBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRegistroFormaPagoBanco.add(this.jmenuDetalleArchivoRegistroFormaPagoBanco);		
		this.jmenuBarDetalleRegistroFormaPagoBanco.add(this.jmenuDetalleAccionesRegistroFormaPagoBanco);		
		this.jmenuBarDetalleRegistroFormaPagoBanco.add(this.jmenuDetalleDatosRegistroFormaPagoBanco);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRegistroFormaPagoBanco);				
	}
	
	
	public void inicializarElementosCamposRegistroFormaPagoBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRegistroFormaPagoBanco = new JLabelMe();
		jLabelIdRegistroFormaPagoBanco.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRegistroFormaPagoBanco = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRegistroFormaPagoBanco= new GridBagLayout();

		this.jPanelidRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);

		jLabelidRegistroFormaPagoBanco = new JLabel();
		jLabelidRegistroFormaPagoBanco.setText("Id");

		jLabelidRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_bancoRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelnombre_bancoRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBREBANCO+" : *");
		this.jLabelnombre_bancoRegistroFormaPagoBanco.setToolTipText("Nombre Banco");
		this.jLabelnombre_bancoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bancoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bancoRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bancoRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBREBANCO);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelnombre_bancoRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jTextAreanombre_bancoRegistroFormaPagoBanco= new JTextAreaMe();
		jTextAreanombre_bancoRegistroFormaPagoBanco.setEnabled(false);
		jTextAreanombre_bancoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoRegistroFormaPagoBanco.setLineWrap(true);
		jTextAreanombre_bancoRegistroFormaPagoBanco.setWrapStyleWord(true);
		jTextAreanombre_bancoRegistroFormaPagoBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bancoRegistroFormaPagoBanco.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bancoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bancoRegistroFormaPagoBanco = new JScrollPane(jTextAreanombre_bancoRegistroFormaPagoBanco);
		jscrollPanenombre_bancoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_bancoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_bancoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_bancoRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonnombre_bancoRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bancoRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonnombre_bancoRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bancoRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bancoRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bancoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bancoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bancoRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bancoRegistroFormaPagoBancoBusqueda.setVisible(false);		}


					
		this.jLabelnombre_giradorRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelnombre_giradorRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBREGIRADOR+" : *");
		this.jLabelnombre_giradorRegistroFormaPagoBanco.setToolTipText("Nombre Girador");
		this.jLabelnombre_giradorRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_giradorRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_giradorRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_giradorRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_giradorRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_giradorRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBREGIRADOR);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelnombre_giradorRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jTextAreanombre_giradorRegistroFormaPagoBanco= new JTextAreaMe();
		jTextAreanombre_giradorRegistroFormaPagoBanco.setEnabled(false);
		jTextAreanombre_giradorRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_giradorRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_giradorRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_giradorRegistroFormaPagoBanco.setLineWrap(true);
		jTextAreanombre_giradorRegistroFormaPagoBanco.setWrapStyleWord(true);
		jTextAreanombre_giradorRegistroFormaPagoBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_giradorRegistroFormaPagoBanco.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_giradorRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_giradorRegistroFormaPagoBanco = new JScrollPane(jTextAreanombre_giradorRegistroFormaPagoBanco);
		jscrollPanenombre_giradorRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_giradorRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_giradorRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_giradorRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonnombre_giradorRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_giradorRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_giradorRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_giradorRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonnombre_giradorRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_giradorRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_giradorRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_giradorRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_giradorRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_giradorRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_giradorRegistroFormaPagoBancoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelfecha_vencimientoRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoRegistroFormaPagoBanco.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelfecha_vencimientoRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		//jFormattedTextFieldfecha_vencimientoRegistroFormaPagoBanco= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoRegistroFormaPagoBanco= new JDateChooser();
		jDateChooserfecha_vencimientoRegistroFormaPagoBanco.setEnabled(false);
		jDateChooserfecha_vencimientoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoRegistroFormaPagoBanco.setDate(new Date());
		jDateChooserfecha_vencimientoRegistroFormaPagoBanco.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoRegistroFormaPagoBanco.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonfecha_vencimientoRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoRegistroFormaPagoBancoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuentaRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelnumero_cuentaRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_NUMEROCUENTA+" : *");
		this.jLabelnumero_cuentaRegistroFormaPagoBanco.setToolTipText("Numero Cuenta");
		this.jLabelnumero_cuentaRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuentaRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuentaRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_NUMEROCUENTA);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelnumero_cuentaRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jTextFieldnumero_cuentaRegistroFormaPagoBanco= new JTextFieldMe();

		jTextFieldnumero_cuentaRegistroFormaPagoBanco.setEnabled(false);
		jTextFieldnumero_cuentaRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuentaRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonnumero_cuentaRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuentaRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonnumero_cuentaRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuentaRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuentaRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuentaRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuentaRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuentaRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuentaRegistroFormaPagoBancoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chequeRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelnumero_chequeRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_NUMEROCHEQUE+" : *");
		this.jLabelnumero_chequeRegistroFormaPagoBanco.setToolTipText("Numero Cheque");
		this.jLabelnumero_chequeRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequeRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequeRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelnumero_chequeRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jTextFieldnumero_chequeRegistroFormaPagoBanco= new JTextFieldMe();

		jTextFieldnumero_chequeRegistroFormaPagoBanco.setEnabled(false);
		jTextFieldnumero_chequeRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequeRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonnumero_chequeRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequeRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonnumero_chequeRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequeRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequeRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequeRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequeRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequeRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequeRegistroFormaPagoBancoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_montoRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelvalor_montoRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_VALORMONTO+" : *");
		this.jLabelvalor_montoRegistroFormaPagoBanco.setToolTipText("Valor Monto");
		this.jLabelvalor_montoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_montoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_montoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_montoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_montoRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_montoRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_VALORMONTO);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelvalor_montoRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jTextFieldvalor_montoRegistroFormaPagoBanco= new JTextFieldMe();
		jTextFieldvalor_montoRegistroFormaPagoBanco.setEnabled(false);
		jTextFieldvalor_montoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_montoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_montoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_montoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_montoRegistroFormaPagoBanco.setText("0.0");

		this.jButtonvalor_montoRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonvalor_montoRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_montoRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_montoRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_montoRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonvalor_montoRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_montoRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_montoRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_montoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_montoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_montoRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_montoRegistroFormaPagoBancoBusqueda.setVisible(false);		}


					
		this.jLabelfechaRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelfechaRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaRegistroFormaPagoBanco.setToolTipText("Fecha");
		this.jLabelfechaRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelfechaRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		//jFormattedTextFieldfechaRegistroFormaPagoBanco= new JFormattedTextFieldMe();

		jDateChooserfechaRegistroFormaPagoBanco= new JDateChooser();
		jDateChooserfechaRegistroFormaPagoBanco.setEnabled(false);
		jDateChooserfechaRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaRegistroFormaPagoBanco.setDate(new Date());
		jDateChooserfechaRegistroFormaPagoBanco.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaRegistroFormaPagoBanco.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonfechaRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonfechaRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaRegistroFormaPagoBancoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimiento_originalRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelfecha_vencimiento_originalRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL+" : *");
		this.jLabelfecha_vencimiento_originalRegistroFormaPagoBanco.setToolTipText("Fecha Vencimiento Original");
		this.jLabelfecha_vencimiento_originalRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_originalRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_vencimiento_originalRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimiento_originalRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimiento_originalRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimiento_originalRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelfecha_vencimiento_originalRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		//jFormattedTextFieldfecha_vencimiento_originalRegistroFormaPagoBanco= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco= new JDateChooser();
		jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco.setEnabled(false);
		jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco.setDate(new Date());
		jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimiento_originalRegistroFormaPagoBanco.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimiento_originalRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonfecha_vencimiento_originalRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_originalRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimiento_originalRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimiento_originalRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonfecha_vencimiento_originalRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimiento_originalRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimiento_originalRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimiento_originalRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimiento_originalRegistroFormaPagoBancoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cambioRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelnumero_cambioRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_NUMEROCAMBIO+" : *");
		this.jLabelnumero_cambioRegistroFormaPagoBanco.setToolTipText("Numero Cambio");
		this.jLabelnumero_cambioRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cambioRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cambioRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cambioRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cambioRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cambioRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_NUMEROCAMBIO);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelnumero_cambioRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jTextFieldnumero_cambioRegistroFormaPagoBanco= new JTextFieldMe();
		jTextFieldnumero_cambioRegistroFormaPagoBanco.setEnabled(false);
		jTextFieldnumero_cambioRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cambioRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cambioRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cambioRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_cambioRegistroFormaPagoBanco.setText("0");

		this.jButtonnumero_cambioRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonnumero_cambioRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cambioRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cambioRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cambioRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonnumero_cambioRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cambioRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cambioRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cambioRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cambioRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cambioRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cambioRegistroFormaPagoBancoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRegistroFormaPagoBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelid_empresaRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRegistroFormaPagoBanco.setToolTipText("Empresa");
		this.jLabelid_empresaRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelid_empresaRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jComboBoxid_empresaRegistroFormaPagoBanco= new JComboBoxMe();
		jComboBoxid_empresaRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRegistroFormaPagoBanco.setEnabled(false);

		this.jButtonid_empresaRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonid_empresaRegistroFormaPagoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRegistroFormaPagoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRegistroFormaPagoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonid_empresaRegistroFormaPagoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRegistroFormaPagoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRegistroFormaPagoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRegistroFormaPagoBanco"));

		this.jButtonid_empresaRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonid_empresaRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonid_empresaRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRegistroFormaPagoBancoBusqueda.setVisible(false);		}

		this.jButtonid_empresaRegistroFormaPagoBancoUpdate= new JButtonMe();
		this.jButtonid_empresaRegistroFormaPagoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRegistroFormaPagoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRegistroFormaPagoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRegistroFormaPagoBancoUpdate.setText("U");
		this.jButtonid_empresaRegistroFormaPagoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRegistroFormaPagoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRegistroFormaPagoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRegistroFormaPagoBancoUpdate"));



					
		this.jLabelid_sucursalRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelid_sucursalRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalRegistroFormaPagoBanco.setToolTipText("Sucursal");
		this.jLabelid_sucursalRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelid_sucursalRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jComboBoxid_sucursalRegistroFormaPagoBanco= new JComboBoxMe();
		jComboBoxid_sucursalRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalRegistroFormaPagoBanco.setEnabled(false);

		this.jButtonid_sucursalRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonid_sucursalRegistroFormaPagoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRegistroFormaPagoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRegistroFormaPagoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonid_sucursalRegistroFormaPagoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalRegistroFormaPagoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRegistroFormaPagoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRegistroFormaPagoBanco"));

		this.jButtonid_sucursalRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonid_sucursalRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonid_sucursalRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalRegistroFormaPagoBancoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalRegistroFormaPagoBancoUpdate= new JButtonMe();
		this.jButtonid_sucursalRegistroFormaPagoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRegistroFormaPagoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRegistroFormaPagoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRegistroFormaPagoBancoUpdate.setText("U");
		this.jButtonid_sucursalRegistroFormaPagoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalRegistroFormaPagoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRegistroFormaPagoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRegistroFormaPagoBancoUpdate"));



					
		this.jLabelid_ejercicioRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelid_ejercicioRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioRegistroFormaPagoBanco.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelid_ejercicioRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jComboBoxid_ejercicioRegistroFormaPagoBanco= new JComboBoxMe();
		jComboBoxid_ejercicioRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioRegistroFormaPagoBanco.setEnabled(false);

		this.jButtonid_ejercicioRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonid_ejercicioRegistroFormaPagoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRegistroFormaPagoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRegistroFormaPagoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonid_ejercicioRegistroFormaPagoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioRegistroFormaPagoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRegistroFormaPagoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRegistroFormaPagoBanco"));

		this.jButtonid_ejercicioRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonid_ejercicioRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioRegistroFormaPagoBancoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioRegistroFormaPagoBancoUpdate= new JButtonMe();
		this.jButtonid_ejercicioRegistroFormaPagoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRegistroFormaPagoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRegistroFormaPagoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioRegistroFormaPagoBancoUpdate.setText("U");
		this.jButtonid_ejercicioRegistroFormaPagoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioRegistroFormaPagoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRegistroFormaPagoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRegistroFormaPagoBancoUpdate"));



					
		this.jLabelid_periodoRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelid_periodoRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoRegistroFormaPagoBanco.setToolTipText("Periodo");
		this.jLabelid_periodoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelid_periodoRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jComboBoxid_periodoRegistroFormaPagoBanco= new JComboBoxMe();
		jComboBoxid_periodoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoRegistroFormaPagoBanco.setEnabled(false);

		this.jButtonid_periodoRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonid_periodoRegistroFormaPagoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRegistroFormaPagoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRegistroFormaPagoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonid_periodoRegistroFormaPagoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoRegistroFormaPagoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRegistroFormaPagoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRegistroFormaPagoBanco"));

		this.jButtonid_periodoRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonid_periodoRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonid_periodoRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoRegistroFormaPagoBancoBusqueda.setVisible(false);		}

		this.jButtonid_periodoRegistroFormaPagoBancoUpdate= new JButtonMe();
		this.jButtonid_periodoRegistroFormaPagoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRegistroFormaPagoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRegistroFormaPagoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoRegistroFormaPagoBancoUpdate.setText("U");
		this.jButtonid_periodoRegistroFormaPagoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoRegistroFormaPagoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRegistroFormaPagoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRegistroFormaPagoBancoUpdate"));



					
		this.jLabelid_asiento_contableRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelid_asiento_contableRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableRegistroFormaPagoBanco.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelid_asiento_contableRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jComboBoxid_asiento_contableRegistroFormaPagoBanco= new JComboBoxMe();
		jComboBoxid_asiento_contableRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonid_asiento_contableRegistroFormaPagoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableRegistroFormaPagoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableRegistroFormaPagoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonid_asiento_contableRegistroFormaPagoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableRegistroFormaPagoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableRegistroFormaPagoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableRegistroFormaPagoBanco"));

		this.jButtonid_asiento_contableRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonid_asiento_contableRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableRegistroFormaPagoBancoBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableRegistroFormaPagoBancoUpdate= new JButtonMe();
		this.jButtonid_asiento_contableRegistroFormaPagoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableRegistroFormaPagoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableRegistroFormaPagoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableRegistroFormaPagoBancoUpdate.setText("U");
		this.jButtonid_asiento_contableRegistroFormaPagoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableRegistroFormaPagoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableRegistroFormaPagoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableRegistroFormaPagoBancoUpdate"));



					
		this.jLabelid_tipo_forma_pagoRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelid_tipo_forma_pagoRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_IDTIPOFORMAPAGO+" : *");
		this.jLabelid_tipo_forma_pagoRegistroFormaPagoBanco.setToolTipText("Tipo Forma Pago");
		this.jLabelid_tipo_forma_pagoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_forma_pagoRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_forma_pagoRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelid_tipo_forma_pagoRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoRegistroFormaPagoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoRegistroFormaPagoBanco"));

		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoUpdate= new JButtonMe();
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoUpdate.setText("U");
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoRegistroFormaPagoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoRegistroFormaPagoBancoUpdate"));



					
		this.jLabelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_IDESTADOREGISTROFORMAPAGOBANCO+" : *");
		this.jLabelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setToolTipText("Estado Registro Forma Pago Banco");
		this.jLabelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_IDESTADOREGISTROFORMAPAGOBANCO);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco= new JComboBoxMe();
		jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_registro_forma_pago_bancoRegistroFormaPagoBanco"));

		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_registro_forma_pago_bancoRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoBusqueda.setVisible(false);		}

		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoUpdate= new JButtonMe();
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoUpdate.setText("U");
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_registro_forma_pago_bancoRegistroFormaPagoBancoUpdate"));



					
		this.jLabelid_clienteRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelid_clienteRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteRegistroFormaPagoBanco.setToolTipText("Cliente");
		this.jLabelid_clienteRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelid_clienteRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jComboBoxid_clienteRegistroFormaPagoBanco= new JComboBoxMe();
		jComboBoxid_clienteRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonid_clienteRegistroFormaPagoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteRegistroFormaPagoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteRegistroFormaPagoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonid_clienteRegistroFormaPagoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteRegistroFormaPagoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteRegistroFormaPagoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteRegistroFormaPagoBanco"));

		this.jButtonid_clienteRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonid_clienteRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonid_clienteRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteRegistroFormaPagoBancoBusqueda.setVisible(false);		}

		this.jButtonid_clienteRegistroFormaPagoBancoUpdate= new JButtonMe();
		this.jButtonid_clienteRegistroFormaPagoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteRegistroFormaPagoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteRegistroFormaPagoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteRegistroFormaPagoBancoUpdate.setText("U");
		this.jButtonid_clienteRegistroFormaPagoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteRegistroFormaPagoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteRegistroFormaPagoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteRegistroFormaPagoBancoUpdate"));



					
		this.jLabelid_anioRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelid_anioRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioRegistroFormaPagoBanco.setToolTipText("Anio");
		this.jLabelid_anioRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelid_anioRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jComboBoxid_anioRegistroFormaPagoBanco= new JComboBoxMe();
		jComboBoxid_anioRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioRegistroFormaPagoBanco.setEnabled(false);

		this.jButtonid_anioRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonid_anioRegistroFormaPagoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioRegistroFormaPagoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioRegistroFormaPagoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonid_anioRegistroFormaPagoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioRegistroFormaPagoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioRegistroFormaPagoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioRegistroFormaPagoBanco"));

		this.jButtonid_anioRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonid_anioRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonid_anioRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioRegistroFormaPagoBancoBusqueda.setVisible(false);		}

		this.jButtonid_anioRegistroFormaPagoBancoUpdate= new JButtonMe();
		this.jButtonid_anioRegistroFormaPagoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRegistroFormaPagoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRegistroFormaPagoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioRegistroFormaPagoBancoUpdate.setText("U");
		this.jButtonid_anioRegistroFormaPagoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioRegistroFormaPagoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioRegistroFormaPagoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioRegistroFormaPagoBancoUpdate"));



					
		this.jLabelid_mesRegistroFormaPagoBanco = new JLabelMe();
		this.jLabelid_mesRegistroFormaPagoBanco.setText(""+RegistroFormaPagoBancoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesRegistroFormaPagoBanco.setToolTipText("Mes");
		this.jLabelid_mesRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesRegistroFormaPagoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesRegistroFormaPagoBanco.setToolTipText(RegistroFormaPagoBancoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		this.jPanelid_mesRegistroFormaPagoBanco.setLayout(this.gridaBagLayoutRegistroFormaPagoBanco);


		jComboBoxid_mesRegistroFormaPagoBanco= new JComboBoxMe();
		jComboBoxid_mesRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesRegistroFormaPagoBanco.setEnabled(false);

		this.jButtonid_mesRegistroFormaPagoBanco= new JButtonMe();
		this.jButtonid_mesRegistroFormaPagoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesRegistroFormaPagoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesRegistroFormaPagoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesRegistroFormaPagoBanco.setText("Buscar");
		this.jButtonid_mesRegistroFormaPagoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesRegistroFormaPagoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesRegistroFormaPagoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesRegistroFormaPagoBanco"));

		this.jButtonid_mesRegistroFormaPagoBancoBusqueda= new JButtonMe();
		this.jButtonid_mesRegistroFormaPagoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRegistroFormaPagoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRegistroFormaPagoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesRegistroFormaPagoBancoBusqueda.setText("U");
		this.jButtonid_mesRegistroFormaPagoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesRegistroFormaPagoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesRegistroFormaPagoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesRegistroFormaPagoBancoBusqueda"));

		if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesRegistroFormaPagoBancoBusqueda.setVisible(false);		}

		this.jButtonid_mesRegistroFormaPagoBancoUpdate= new JButtonMe();
		this.jButtonid_mesRegistroFormaPagoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRegistroFormaPagoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRegistroFormaPagoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesRegistroFormaPagoBancoUpdate.setText("U");
		this.jButtonid_mesRegistroFormaPagoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesRegistroFormaPagoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesRegistroFormaPagoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesRegistroFormaPagoBancoUpdate"));



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
		//this.jInternalFrameDetalleRegistroFormaPagoBanco = new RegistroFormaPagoBancoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Registro Forma Pago Banco DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRegistroFormaPagoBanco= new GridBagLayout();
		

		
		String sToolTipRegistroFormaPagoBanco="";
		sToolTipRegistroFormaPagoBanco=RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRegistroFormaPagoBanco+="(Tesoreria.RegistroFormaPagoBanco)";
		}
		
		if(!this.registroformapagobancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipRegistroFormaPagoBanco+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonModificarRegistroFormaPagoBanco = new JButtonMe();
        this.jButtonActualizarRegistroFormaPagoBanco = new JButtonMe();
        this.jButtonEliminarRegistroFormaPagoBanco = new JButtonMe();
        this.jButtonCancelarRegistroFormaPagoBanco = new JButtonMe();
        this.jButtonGuardarCambiosRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco = new JButtonMe();
		this.jButtonCerrarRegistroFormaPagoBanco = new JButtonMe();
		
		this.jScrollPanelDatosRegistroFormaPagoBanco = new JScrollPane();   
        this.jScrollPanelDatosEdicionRegistroFormaPagoBanco = new JScrollPane();
		this.jScrollPanelDatosGeneralRegistroFormaPagoBanco = new JScrollPane();
				
		
		
		this.jPanelCamposRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Registro Forma Pago Banco";
		
		if(!this.registroformapagobancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Registro Forma Pago Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosRegistroFormaPagoBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRegistroFormaPagoBanco.setName("jPanelCamposRegistroFormaPagoBanco"); 

		this.jPanelCamposOcultosRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRegistroFormaPagoBanco.setName("jPanelCamposOcultosRegistroFormaPagoBanco"); 

        this.jPanelAccionesRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRegistroFormaPagoBanco.setToolTipText("Acciones");
        this.jPanelAccionesRegistroFormaPagoBanco.setName("Acciones"); 

		this.jPanelAccionesFormularioRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRegistroFormaPagoBanco.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRegistroFormaPagoBanco.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRegistroFormaPagoBanco.setText("Nuevo");
		this.jButtonModificarRegistroFormaPagoBanco.setText("Editar");
        this.jButtonActualizarRegistroFormaPagoBanco.setText("Actualizar");
        this.jButtonEliminarRegistroFormaPagoBanco.setText("Eliminar");
        this.jButtonCancelarRegistroFormaPagoBanco.setText("Cancelar");
        this.jButtonGuardarCambiosRegistroFormaPagoBanco.setText("Guardar");
		this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco.setText("Guardar");
		this.jButtonCerrarRegistroFormaPagoBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRegistroFormaPagoBanco,"nuevo_button","Nuevo",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRegistroFormaPagoBanco,"modificar_button","Editar",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRegistroFormaPagoBanco,"actualizar_button","Actualizar",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRegistroFormaPagoBanco,"eliminar_button","Eliminar",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRegistroFormaPagoBanco,"cancelar_button","Cancelar",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRegistroFormaPagoBanco,"guardarcambios_button","Guardar",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco,"guardarcambiostabla_button","Guardar",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRegistroFormaPagoBanco,"cerrar_button","Salir",this.registroformapagobancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRegistroFormaPagoBanco.setToolTipText("Nuevo"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRegistroFormaPagoBanco.setToolTipText("Editar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRegistroFormaPagoBanco.setToolTipText("Actualizar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRegistroFormaPagoBanco.setToolTipText("Eliminar)"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRegistroFormaPagoBanco.setToolTipText("Cancelar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRegistroFormaPagoBanco.setToolTipText("Guardar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco.setToolTipText("Guardar"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRegistroFormaPagoBanco.setToolTipText("Salir"+" "+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRegistroFormaPagoBanco";
		inputMap = this.jButtonNuevoRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRegistroFormaPagoBanco"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRegistroFormaPagoBanco";
		inputMap = this.jButtonActualizarRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRegistroFormaPagoBanco"));
		
		//ELIMINAR
		sMapKey = "EliminarRegistroFormaPagoBanco";
		inputMap = this.jButtonEliminarRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRegistroFormaPagoBanco"));
		
		//CANCELAR	
		sMapKey = "CancelarRegistroFormaPagoBanco";
		inputMap = this.jButtonCancelarRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRegistroFormaPagoBanco"));
		
		//CERRAR		
		sMapKey = "CerrarRegistroFormaPagoBanco";
		inputMap = this.jButtonCerrarRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRegistroFormaPagoBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRegistroFormaPagoBanco";
		inputMap = this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRegistroFormaPagoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRegistroFormaPagoBanco"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRegistroFormaPagoBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRegistroFormaPagoBanco.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRegistroFormaPagoBanco.setToolTipText("Nuevo RegistroFormaPagoBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRegistroFormaPagoBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRegistroFormaPagoBanco.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRegistroFormaPagoBanco.setToolTipText("Sin Cerrar Ventana RegistroFormaPagoBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRegistroFormaPagoBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRegistroFormaPagoBanco.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRegistroFormaPagoBanco.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRegistroFormaPagoBanco.setText("Accion");
		this.jComboBoxTiposAccionesRegistroFormaPagoBanco.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRegistroFormaPagoBanco = new JLabelMe();
		
		this.jLabelAccionesRegistroFormaPagoBanco.setText("Acciones");		
		this.jLabelAccionesRegistroFormaPagoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRegistroFormaPagoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRegistroFormaPagoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRegistroFormaPagoBanco();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRegistroFormaPagoBanco();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRegistroFormaPagoBanco=new JTabbedPane();
		this.jTabbedPaneRelacionesRegistroFormaPagoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRegistroFormaPagoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRegistroFormaPagoBanco = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRegistroFormaPagoBanco = new GridBagLayout();
		
		this.jPanelCamposRegistroFormaPagoBanco.setLayout(gridaBagLayoutCamposRegistroFormaPagoBanco);
		this.jPanelCamposOcultosRegistroFormaPagoBanco.setLayout(gridaBagLayoutCamposOcultosRegistroFormaPagoBanco);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRegistroFormaPagoBanco.add(jLabelIdRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRegistroFormaPagoBanco.add(jLabelidRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRegistroFormaPagoBanco.add(jLabelid_empresaRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRegistroFormaPagoBanco.add(jButtonid_empresaRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 3;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRegistroFormaPagoBanco.add(jButtonid_empresaRegistroFormaPagoBancoUpdate, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRegistroFormaPagoBanco.add(jComboBoxid_empresaRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalRegistroFormaPagoBanco.add(jLabelid_sucursalRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRegistroFormaPagoBanco.add(jButtonid_sucursalRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 3;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRegistroFormaPagoBanco.add(jButtonid_sucursalRegistroFormaPagoBancoUpdate, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalRegistroFormaPagoBanco.add(jComboBoxid_sucursalRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioRegistroFormaPagoBanco.add(jLabelid_ejercicioRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioRegistroFormaPagoBanco.add(jButtonid_ejercicioRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 3;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioRegistroFormaPagoBanco.add(jButtonid_ejercicioRegistroFormaPagoBancoUpdate, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioRegistroFormaPagoBanco.add(jComboBoxid_ejercicioRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoRegistroFormaPagoBanco.add(jLabelid_periodoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoRegistroFormaPagoBanco.add(jButtonid_periodoRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 3;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoRegistroFormaPagoBanco.add(jButtonid_periodoRegistroFormaPagoBancoUpdate, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoRegistroFormaPagoBanco.add(jComboBoxid_periodoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableRegistroFormaPagoBanco.add(jLabelid_asiento_contableRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableRegistroFormaPagoBanco.add(jButtonid_asiento_contableRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 3;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableRegistroFormaPagoBanco.add(jButtonid_asiento_contableRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 4;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableRegistroFormaPagoBanco.add(jButtonid_asiento_contableRegistroFormaPagoBancoUpdate, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableRegistroFormaPagoBanco.add(jComboBoxid_asiento_contableRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_forma_pagoRegistroFormaPagoBanco.add(jLabelid_tipo_forma_pagoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoRegistroFormaPagoBanco.add(jButtonid_tipo_forma_pagoRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 3;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoRegistroFormaPagoBanco.add(jButtonid_tipo_forma_pagoRegistroFormaPagoBancoUpdate, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_forma_pagoRegistroFormaPagoBanco.add(jComboBoxid_tipo_forma_pagoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.add(jLabelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.add(jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 3;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.add(jButtonid_estado_registro_forma_pago_bancoRegistroFormaPagoBancoUpdate, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco.add(jComboBoxid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteRegistroFormaPagoBanco.add(jLabelid_clienteRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteRegistroFormaPagoBanco.add(jButtonid_clienteRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 3;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteRegistroFormaPagoBanco.add(jButtonid_clienteRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 4;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteRegistroFormaPagoBanco.add(jButtonid_clienteRegistroFormaPagoBancoUpdate, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteRegistroFormaPagoBanco.add(jComboBoxid_clienteRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bancoRegistroFormaPagoBanco.add(jLabelnombre_bancoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bancoRegistroFormaPagoBanco.add(jButtonnombre_bancoRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bancoRegistroFormaPagoBanco.add(jscrollPanenombre_bancoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_giradorRegistroFormaPagoBanco.add(jLabelnombre_giradorRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_giradorRegistroFormaPagoBanco.add(jButtonnombre_giradorRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_giradorRegistroFormaPagoBanco.add(jscrollPanenombre_giradorRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoRegistroFormaPagoBanco.add(jLabelfecha_vencimientoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoRegistroFormaPagoBanco.add(jButtonfecha_vencimientoRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoRegistroFormaPagoBanco.add(jDateChooserfecha_vencimientoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuentaRegistroFormaPagoBanco.add(jLabelnumero_cuentaRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuentaRegistroFormaPagoBanco.add(jButtonnumero_cuentaRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuentaRegistroFormaPagoBanco.add(jTextFieldnumero_cuentaRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequeRegistroFormaPagoBanco.add(jLabelnumero_chequeRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequeRegistroFormaPagoBanco.add(jButtonnumero_chequeRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequeRegistroFormaPagoBanco.add(jTextFieldnumero_chequeRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_montoRegistroFormaPagoBanco.add(jLabelvalor_montoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_montoRegistroFormaPagoBanco.add(jButtonvalor_montoRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_montoRegistroFormaPagoBanco.add(jTextFieldvalor_montoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaRegistroFormaPagoBanco.add(jLabelfechaRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaRegistroFormaPagoBanco.add(jButtonfechaRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaRegistroFormaPagoBanco.add(jDateChooserfechaRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimiento_originalRegistroFormaPagoBanco.add(jLabelfecha_vencimiento_originalRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimiento_originalRegistroFormaPagoBanco.add(jButtonfecha_vencimiento_originalRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimiento_originalRegistroFormaPagoBanco.add(jDateChooserfecha_vencimiento_originalRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cambioRegistroFormaPagoBanco.add(jLabelnumero_cambioRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cambioRegistroFormaPagoBanco.add(jButtonnumero_cambioRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cambioRegistroFormaPagoBanco.add(jTextFieldnumero_cambioRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioRegistroFormaPagoBanco.add(jLabelid_anioRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioRegistroFormaPagoBanco.add(jButtonid_anioRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 3;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioRegistroFormaPagoBanco.add(jButtonid_anioRegistroFormaPagoBancoUpdate, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioRegistroFormaPagoBanco.add(jComboBoxid_anioRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesRegistroFormaPagoBanco.add(jLabelid_mesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 2;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesRegistroFormaPagoBanco.add(jButtonid_mesRegistroFormaPagoBancoBusqueda, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		//this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 3;
		this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesRegistroFormaPagoBanco.add(jButtonid_mesRegistroFormaPagoBancoUpdate, this.gridBagConstraintsRegistroFormaPagoBanco);
	}

	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 1;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesRegistroFormaPagoBanco.add(jComboBoxid_mesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegistroFormaPagoBanco.add(this.jPanelidRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposRegistroFormaPagoBanco=0;
		iYPanelCamposRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegistroFormaPagoBanco.add(this.jPanelid_asiento_contableRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposRegistroFormaPagoBanco=0;
		iYPanelCamposRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegistroFormaPagoBanco.add(this.jPanelid_tipo_forma_pagoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposRegistroFormaPagoBanco=0;
		iYPanelCamposRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegistroFormaPagoBanco.add(this.jPanelid_estado_registro_forma_pago_bancoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposRegistroFormaPagoBanco=0;
		iYPanelCamposRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegistroFormaPagoBanco.add(this.jPanelid_clienteRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposRegistroFormaPagoBanco=0;
		iYPanelCamposRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegistroFormaPagoBanco.add(this.jPanelnombre_bancoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposRegistroFormaPagoBanco=0;
		iYPanelCamposRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegistroFormaPagoBanco.add(this.jPanelnombre_giradorRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposRegistroFormaPagoBanco=0;
		iYPanelCamposRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegistroFormaPagoBanco.add(this.jPanelfecha_vencimientoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposRegistroFormaPagoBanco=0;
		iYPanelCamposRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegistroFormaPagoBanco.add(this.jPanelnumero_cuentaRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposRegistroFormaPagoBanco=0;
		iYPanelCamposRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegistroFormaPagoBanco.add(this.jPanelnumero_chequeRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposRegistroFormaPagoBanco=0;
		iYPanelCamposRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegistroFormaPagoBanco.add(this.jPanelvalor_montoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposRegistroFormaPagoBanco=0;
		iYPanelCamposRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegistroFormaPagoBanco.add(this.jPanelfechaRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposRegistroFormaPagoBanco=0;
		iYPanelCamposRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegistroFormaPagoBanco.add(this.jPanelfecha_vencimiento_originalRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposRegistroFormaPagoBanco=0;
		iYPanelCamposRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegistroFormaPagoBanco.add(this.jPanelnumero_cambioRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposRegistroFormaPagoBanco=0;
		iYPanelCamposRegistroFormaPagoBanco++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposOcultosRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposOcultosRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRegistroFormaPagoBanco.add(this.jPanelid_empresaRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposOcultosRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposOcultosRegistroFormaPagoBanco=0;
		iYPanelCamposOcultosRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposOcultosRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposOcultosRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRegistroFormaPagoBanco.add(this.jPanelid_sucursalRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposOcultosRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposOcultosRegistroFormaPagoBanco=0;
		iYPanelCamposOcultosRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposOcultosRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposOcultosRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRegistroFormaPagoBanco.add(this.jPanelid_ejercicioRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposOcultosRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposOcultosRegistroFormaPagoBanco=0;
		iYPanelCamposOcultosRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposOcultosRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposOcultosRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRegistroFormaPagoBanco.add(this.jPanelid_periodoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposOcultosRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposOcultosRegistroFormaPagoBanco=0;
		iYPanelCamposOcultosRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposOcultosRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposOcultosRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRegistroFormaPagoBanco.add(this.jPanelid_anioRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposOcultosRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposOcultosRegistroFormaPagoBanco=0;
		iYPanelCamposOcultosRegistroFormaPagoBanco++;
	}
	this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iYPanelCamposOcultosRegistroFormaPagoBanco;
	this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iXPanelCamposOcultosRegistroFormaPagoBanco++;
	this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegistroFormaPagoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRegistroFormaPagoBanco.add(this.jPanelid_mesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);



	if(iXPanelCamposOcultosRegistroFormaPagoBanco % 2==0) {
		iXPanelCamposOcultosRegistroFormaPagoBanco=0;
		iYPanelCamposOcultosRegistroFormaPagoBanco++;
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
			
		GridBagLayout gridaBagLayoutAccionesRegistroFormaPagoBanco= new GridBagLayout();
		this.jPanelAccionesRegistroFormaPagoBanco.setLayout(gridaBagLayoutAccionesRegistroFormaPagoBanco);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRegistroFormaPagoBanco= new GridBagLayout();
		this.jPanelAccionesFormularioRegistroFormaPagoBanco.setLayout(gridaBagLayoutAccionesFormularioRegistroFormaPagoBanco);
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRegistroFormaPagoBanco.add(this.jComboBoxTiposAccionesFormularioRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRegistroFormaPagoBanco.add(this.jCheckBoxPostAccionNuevoRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.registroformapagobancoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRegistroFormaPagoBanco.add(this.jCheckBoxPostAccionSinCerrarRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.registroformapagobancoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.registroformapagobancoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRegistroFormaPagoBanco.add(this.jCheckBoxPostAccionSinMensajeRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXAccion++;
			
		this.jPanelAccionesRegistroFormaPagoBanco.add(this.jButtonModificarRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);							

		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx =iPosXAccion++;
			
		this.jPanelAccionesRegistroFormaPagoBanco.add(this.jButtonEliminarRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
			
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesRegistroFormaPagoBanco.add(this.jButtonActualizarRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);


		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesRegistroFormaPagoBanco.add(this.jButtonGuardarCambiosRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);	
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = 0;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx =iPosXAccion++;
		
		this.jPanelAccionesRegistroFormaPagoBanco.add(this.jButtonCancelarRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRegistroFormaPagoBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRegistroFormaPagoBanco);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.registroformapagobancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();						
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;		
			//this.gridBagConstraintsRegistroFormaPagoBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRegistroFormaPagoBanco.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx =0;
		this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRegistroFormaPagoBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RegistroFormaPagoBancoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRegistroFormaPagoBanco = new RegistroFormaPagoBancoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Registro Forma Pago Banco DATOS");
			
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
			
	        //this.setTitle("[FOR] - Registro Forma Pago Banco DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Registro Forma Pago Banco Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RegistroFormaPagoBancoModel registroformapagobancoModel=new RegistroFormaPagoBancoModel(this);
			
			//SI USARA CLASE INTERNA
			//RegistroFormaPagoBancoModel.RegistroFormaPagoBancoFocusTraversalPolicy registroformapagobancoFocusTraversalPolicy = registroformapagobancoModel.new RegistroFormaPagoBancoFocusTraversalPolicy(this);
			
			//registroformapagobancoFocusTraversalPolicy.setregistroformapagobancoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(registroformapagobancoModel);
			
			
			this.jContentPaneDetalleRegistroFormaPagoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRegistroFormaPagoBanco = new GridBagLayout();	
			this.jContentPaneDetalleRegistroFormaPagoBanco.setLayout(gridaBagLayoutDetalleRegistroFormaPagoBanco);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRegistroFormaPagoBanco = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
				this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
					
				
				this.jContentPaneDetalleRegistroFormaPagoBanco.add(jTtoolBarDetalleRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);								
				
}
			
			this.jScrollPanelDatosEdicionRegistroFormaPagoBanco=   new JScrollPane(jContentPaneDetalleRegistroFormaPagoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRegistroFormaPagoBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	        
			this.jContentPaneDetalleRegistroFormaPagoBanco.add(jPanelCamposRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);
			
			
			
			
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
						&& registroformapagobancoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.registroformapagobancoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRegistroFormaPagoBanco= new GridBagConstraints();
						this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
						this.jContentPaneDetalleRegistroFormaPagoBanco.add(this.jTabbedPaneRelacionesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRegistroFormaPagoBanco.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRegistroFormaPagoBanco.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
					this.gridBagConstraintsRegistroFormaPagoBanco.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
					
				
					this.jContentPaneDetalleRegistroFormaPagoBanco.add(jPanelCamposOcultosRegistroFormaPagoBanco, gridBagConstraintsRegistroFormaPagoBanco);
				
					this.jPanelCamposOcultosRegistroFormaPagoBanco.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	        this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRegistroFormaPagoBanco.add(this.jPanelAccionesFormularioRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);							
			
			
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
	        this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
	        
			
			this.jContentPaneDetalleRegistroFormaPagoBanco.add(this.jPanelAccionesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRegistroFormaPagoBanco);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRegistroFormaPagoBanco=   new JScrollPane(this.jPanelCamposRegistroFormaPagoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRegistroFormaPagoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRegistroFormaPagoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRegistroFormaPagoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
			this.gridBagConstraintsRegistroFormaPagoBanco.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRegistroFormaPagoBanco.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRegistroFormaPagoBanco.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);			
			
			this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
			this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
			
			
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		
			
		this.gridBagConstraintsRegistroFormaPagoBanco = new GridBagConstraints();
		this.gridBagConstraintsRegistroFormaPagoBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRegistroFormaPagoBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRegistroFormaPagoBanco, this.gridBagConstraintsRegistroFormaPagoBanco);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRegistroFormaPagoBanco;//jContentPane;
		
		return jScrollPanelDatosEdicionRegistroFormaPagoBanco;
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
