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
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.TipoFormaPagoConstantesFunciones;

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
public class TipoFormaPagoDetalleFormJInternalFrame extends TipoFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoFormaPago;
	
	protected JMenuBar jmenuBarDetalleTipoFormaPago;
	
	protected JMenu jmenuDetalleTipoFormaPago;
	protected JMenu jmenuDetalleArchivoTipoFormaPago;
	protected JMenu jmenuDetalleAccionesTipoFormaPago;
	protected JMenu jmenuDetalleDatosTipoFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFormaPago;	
	protected GridBagConstraints gridBagConstraintsTipoFormaPago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoFormaPagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoFormaPago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoGrupoFormaPagoBeanSwingJInternalFrame tipogrupoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogrupoformapago="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	
	

	public RegistroFormaPagoBancoBeanSwingJInternalFrame registroformapagobancoBeanSwingJInternalFrame=null;
	public RegistroFormaPagoBancoBeanSwingJInternalFrame registroformapagobancoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRegistroFormaPagoBanco=false;
	public RegistroFormaPagoBancoSessionBean registroformapagobancoSessionBean;

	public DetaFormaPagoFactuBeanSwingJInternalFrame detaformapagofactuBeanSwingJInternalFrame=null;
	public DetaFormaPagoFactuBeanSwingJInternalFrame detaformapagofactuBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetaFormaPagoFactu=false;
	public DetaFormaPagoFactuSessionBean detaformapagofactuSessionBean;

	public GrupoClienteFormaPagoBeanSwingJInternalFrame grupoclienteformapagoBeanSwingJInternalFrame=null;
	public GrupoClienteFormaPagoBeanSwingJInternalFrame grupoclienteformapagoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteGrupoClienteFormaPago=false;
	public GrupoClienteFormaPagoSessionBean grupoclienteformapagoSessionBean;

	public DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFrame=null;
	public DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetaFormaPago=false;
	public DetaFormaPagoSessionBean detaformapagoSessionBean;

	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;
	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormaPagoPuntoVenta=false;
	public FormaPagoPuntoVentaSessionBean formapagopuntoventaSessionBean;

	public FormaPagoBeanSwingJInternalFrame formapagoBeanSwingJInternalFrame=null;
	public FormaPagoBeanSwingJInternalFrame formapagoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormaPago=false;
	public FormaPagoSessionBean formapagoSessionBean;

	public FormaPagoInvenBeanSwingJInternalFrame formapagoinvenBeanSwingJInternalFrame=null;
	public FormaPagoInvenBeanSwingJInternalFrame formapagoinvenBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormaPagoInven=false;
	public FormaPagoInvenSessionBean formapagoinvenSessionBean;

	public CierreCajaBeanSwingJInternalFrame cierrecajaBeanSwingJInternalFrame=null;
	public CierreCajaBeanSwingJInternalFrame cierrecajaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCierreCaja=false;
	public CierreCajaSessionBean cierrecajaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoGrupoFormaPagoSessionBean tipogrupoformapagoSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public TipoFormaPagoLogic tipoformapagoLogic;
	
	public JScrollPane jScrollPanelDatosTipoFormaPago;
	public JScrollPane jScrollPanelDatosEdicionTipoFormaPago;
	public JScrollPane jScrollPanelDatosGeneralTipoFormaPago;
	
	protected JPanel jPanelCamposTipoFormaPago;    
	protected JPanel jPanelCamposOcultosTipoFormaPago;    	
	protected JPanel jPanelAccionesTipoFormaPago;
	protected JPanel jPanelAccionesFormularioTipoFormaPago;
    
	
	
	protected Integer iXPanelCamposTipoFormaPago=0;
	protected Integer iYPanelCamposTipoFormaPago=0;
	
	protected Integer iXPanelCamposOcultosTipoFormaPago=0;
	protected Integer iYPanelCamposOcultosTipoFormaPago=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoFormaPago;
	public JButton jButtonModificarTipoFormaPago;
	public JButton jButtonActualizarTipoFormaPago;
    public JButton jButtonEliminarTipoFormaPago;
	public JButton jButtonCancelarTipoFormaPago;
    public JButton jButtonGuardarCambiosTipoFormaPago;
	public JButton jButtonGuardarCambiosTablaTipoFormaPago;
	protected JButton jButtonCerrarTipoFormaPago;
	
	
	protected JButton jButtonProcesarInformacionTipoFormaPago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoFormaPago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFormaPago;
	protected JButton jButtonModificarToolBarTipoFormaPago;
	protected JButton jButtonActualizarToolBarTipoFormaPago;
    protected JButton jButtonEliminarToolBarTipoFormaPago;
	protected JButton jButtonCancelarToolBarTipoFormaPago;
    protected JButton jButtonGuardarCambiosToolBarTipoFormaPago;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFormaPago;
	protected JButton jButtonCerrarToolBarTipoFormaPago;
	
	protected JButton jButtonProcesarInformacionToolBarTipoFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFormaPago;
	protected JMenuItem jMenuItemModificarTipoFormaPago;
	protected JMenuItem jMenuItemActualizarTipoFormaPago;
    protected JMenuItem jMenuItemEliminarTipoFormaPago;
	protected JMenuItem jMenuItemCancelarTipoFormaPago;
    protected JMenuItem jMenuItemGuardarCambiosTipoFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFormaPago;
	protected JMenuItem jMenuItemCerrarTipoFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarTipoFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFormaPago;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarTipoFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFormaPago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFormaPago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoFormaPago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoFormaPago;
	public JLabel jLabelIdTipoFormaPago;
	public JLabel jLabelidTipoFormaPago;
	public JButton jButtonidTipoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoFormaPago;
	public JLabel jLabelnombreTipoFormaPago;
	public JTextArea jTextAreanombreTipoFormaPago;
	public JScrollPane jscrollPanenombreTipoFormaPago;
	public JButton jButtonnombreTipoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelsiglasTipoFormaPago;
	public JLabel jLabelsiglasTipoFormaPago;
	public JTextField jTextFieldsiglasTipoFormaPago;
	public JButton jButtonsiglasTipoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelcon_detalleTipoFormaPago;
	public JLabel jLabelcon_detalleTipoFormaPago;
	public JCheckBox jCheckBoxcon_detalleTipoFormaPago;
	public JButton jButtoncon_detalleTipoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelcon_cuotasTipoFormaPago;
	public JLabel jLabelcon_cuotasTipoFormaPago;
	public JCheckBox jCheckBoxcon_cuotasTipoFormaPago;
	public JButton jButtoncon_cuotasTipoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoFormaPago;
	public JLabel jLabeldescripcionTipoFormaPago;
	public JTextArea jTextAreadescripcionTipoFormaPago;
	public JScrollPane jscrollPanedescripcionTipoFormaPago;
	public JButton jButtondescripcionTipoFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoFormaPago;
	public JLabel jLabelid_empresaTipoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoFormaPago;
	public JButton jButtonid_empresaTipoFormaPago= new JButtonMe();
	public JButton jButtonid_empresaTipoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTipoFormaPago;
	public JLabel jLabelid_sucursalTipoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTipoFormaPago;
	public JButton jButtonid_sucursalTipoFormaPago= new JButtonMe();
	public JButton jButtonid_sucursalTipoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTipoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloTipoFormaPago;
	public JLabel jLabelid_moduloTipoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloTipoFormaPago;
	public JButton jButtonid_moduloTipoFormaPago= new JButtonMe();
	public JButton jButtonid_moduloTipoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_moduloTipoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_grupo_forma_pagoTipoFormaPago;
	public JLabel jLabelid_tipo_grupo_forma_pagoTipoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_grupo_forma_pagoTipoFormaPago;
	public JButton jButtonid_tipo_grupo_forma_pagoTipoFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoTipoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoTipoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloTipoFormaPago;
	public JLabel jLabelid_tipo_transaccion_moduloTipoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloTipoFormaPago;
	public JButton jButtonid_tipo_transaccion_moduloTipoFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloTipoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloTipoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionTipoFormaPago;
	public JLabel jLabelid_transaccionTipoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionTipoFormaPago;
	public JButton jButtonid_transaccionTipoFormaPago= new JButtonMe();
	public JButton jButtonid_transaccionTipoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_transaccionTipoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableTipoFormaPago;
	public JLabel jLabelid_cuenta_contableTipoFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableTipoFormaPago;
	public JButton jButtonid_cuenta_contableTipoFormaPago= new JButtonMe();
	public JButton jButtonid_cuenta_contableTipoFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableTipoFormaPagoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableTipoFormaPagoArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoFormaPago;
	
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
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoFormaPagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoFormaPago=new JPanel();
				this.jPanelAccionesFormularioTipoFormaPago=new JPanel();
				this.jmenuBarDetalleTipoFormaPago=new JMenuBar();
				this.jTtoolBarDetalleTipoFormaPago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormaPagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoFormaPagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormaPagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormaPagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFormaPagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoFormaPago() {
		return this.jButtonActualizarToolBarTipoFormaPago;
	}
	
	public JButton getjButtonEliminarToolBarTipoFormaPago() {
		return this.jButtonEliminarToolBarTipoFormaPago;
	}
	
	public JButton getjButtonCancelarToolBarTipoFormaPago() {
		return this.jButtonCancelarToolBarTipoFormaPago;
	}		
	
	public JButton getjButtonProcesarInformacionTipoFormaPago() {
		return this.jButtonProcesarInformacionTipoFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFormaPago)	{
		this.jButtonProcesarInformacionTipoFormaPago = jButtonProcesarInformacionTipoFormaPago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFormaPago() {
		return this.jComboBoxTiposAccionesTipoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFormaPago(
			JComboBox jComboBoxTiposRelacionesTipoFormaPago) {
		this.jComboBoxTiposRelacionesTipoFormaPago = jComboBoxTiposRelacionesTipoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFormaPago(
			JComboBox jComboBoxTiposAccionesTipoFormaPago) {
		this.jComboBoxTiposAccionesTipoFormaPago = jComboBoxTiposAccionesTipoFormaPago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoFormaPago() {
		return this.jComboBoxTiposAccionesFormularioTipoFormaPago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoFormaPago(
			JComboBox jComboBoxTiposAccionesFormularioTipoFormaPago) {
		this.jComboBoxTiposAccionesFormularioTipoFormaPago = jComboBoxTiposAccionesFormularioTipoFormaPago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoformapagoSessionBean=new TipoFormaPagoSessionBean();
		
		this.tipoformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoformapagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.registroformapagobancoSessionBean=new RegistroFormaPagoBancoSessionBean();
		//this.detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean();
		//this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
		//this.detaformapagoSessionBean=new DetaFormaPagoSessionBean();
		//this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		//this.formapagoSessionBean=new FormaPagoSessionBean();
		//this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
		//this.cierrecajaSessionBean=new CierreCajaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoformapagoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoFormaPago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoFormaPago=new JButtonMe();
				this.jButtonModificarToolBarTipoFormaPago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoFormaPago,this.jTtoolBarDetalleTipoFormaPago,
							"actualizar","actualizar","Actualizar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoFormaPago,this.jTtoolBarDetalleTipoFormaPago,
							"eliminar","eliminar","Eliminar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoFormaPago,this.jTtoolBarDetalleTipoFormaPago,
							"cancelar","cancelar","Cancelar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoFormaPago,this.jTtoolBarDetalleTipoFormaPago,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoFormaPago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoFormaPago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoFormaPago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoFormaPago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoFormaPago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoFormaPago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoFormaPago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoFormaPago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoFormaPago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoFormaPago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoFormaPago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoFormaPago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoFormaPago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoFormaPago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoFormaPago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoFormaPago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoFormaPago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoFormaPago.add(this.jMenuItemDetalleCerrarTipoFormaPago);
		
		this.jmenuDetalleAccionesTipoFormaPago.add(this.jMenuItemActualizarTipoFormaPago);
		this.jmenuDetalleAccionesTipoFormaPago.add(this.jMenuItemEliminarTipoFormaPago);
		this.jmenuDetalleAccionesTipoFormaPago.add(this.jMenuItemCancelarTipoFormaPago);		
		
		//this.jmenuDetalleDatosTipoFormaPago.add(this.jMenuItemDetalleAbrirOrderByTipoFormaPago);				
		this.jmenuDetalleDatosTipoFormaPago.add(this.jMenuItemDetalleMostarOcultarTipoFormaPago);				
				
		//this.jmenuDetalleAccionesTipoFormaPago.add(this.jMenuItemGuardarCambiosTipoFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoFormaPago.add(this.jmenuDetalleArchivoTipoFormaPago);		
		this.jmenuBarDetalleTipoFormaPago.add(this.jmenuDetalleAccionesTipoFormaPago);		
		this.jmenuBarDetalleTipoFormaPago.add(this.jmenuDetalleDatosTipoFormaPago);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoFormaPago.add(this.jmenuDetalleTipoFormaPago);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoFormaPago);				
	}
	
	
	public void inicializarElementosCamposTipoFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoFormaPago = new JLabelMe();
		jLabelIdTipoFormaPago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoFormaPago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoFormaPago.setToolTipText(TipoFormaPagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoFormaPago= new GridBagLayout();

		this.jPanelidTipoFormaPago.setLayout(this.gridaBagLayoutTipoFormaPago);

		jLabelidTipoFormaPago = new JLabel();
		jLabelidTipoFormaPago.setText("Id");

		jLabelidTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoFormaPago = new JLabelMe();
		this.jLabelnombreTipoFormaPago.setText(""+TipoFormaPagoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoFormaPago.setToolTipText("Nombre");
		this.jLabelnombreTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoFormaPago.setToolTipText(TipoFormaPagoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoFormaPago = new GridBagLayout();
		this.jPanelnombreTipoFormaPago.setLayout(this.gridaBagLayoutTipoFormaPago);


		jTextAreanombreTipoFormaPago= new JTextAreaMe();
		jTextAreanombreTipoFormaPago.setEnabled(false);
		jTextAreanombreTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFormaPago.setLineWrap(true);
		jTextAreanombreTipoFormaPago.setWrapStyleWord(true);
		jTextAreanombreTipoFormaPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoFormaPago.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoFormaPago = new JScrollPane(jTextAreanombreTipoFormaPago);
		jscrollPanenombreTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoFormaPagoBusqueda= new JButtonMe();
		this.jButtonnombreTipoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoFormaPagoBusqueda.setText("U");
		this.jButtonnombreTipoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoFormaPagoBusqueda"));

		if(this.tipoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelsiglasTipoFormaPago = new JLabelMe();
		this.jLabelsiglasTipoFormaPago.setText(""+TipoFormaPagoConstantesFunciones.LABEL_SIGLAS+" : *");
		this.jLabelsiglasTipoFormaPago.setToolTipText("Siglas");
		this.jLabelsiglasTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglasTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglasTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglasTipoFormaPago.setToolTipText(TipoFormaPagoConstantesFunciones.LABEL_SIGLAS);
		this.gridaBagLayoutTipoFormaPago = new GridBagLayout();
		this.jPanelsiglasTipoFormaPago.setLayout(this.gridaBagLayoutTipoFormaPago);


		jTextFieldsiglasTipoFormaPago= new JTextFieldMe();

		jTextFieldsiglasTipoFormaPago.setEnabled(false);
		jTextFieldsiglasTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglasTipoFormaPagoBusqueda= new JButtonMe();
		this.jButtonsiglasTipoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasTipoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasTipoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglasTipoFormaPagoBusqueda.setText("U");
		this.jButtonsiglasTipoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglasTipoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglasTipoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglasTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglasTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglasTipoFormaPagoBusqueda"));

		if(this.tipoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglasTipoFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelcon_detalleTipoFormaPago = new JLabelMe();
		this.jLabelcon_detalleTipoFormaPago.setText(""+TipoFormaPagoConstantesFunciones.LABEL_CONDETALLE+" : *");
		this.jLabelcon_detalleTipoFormaPago.setToolTipText("Con Detalle");
		this.jLabelcon_detalleTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_detalleTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_detalleTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_detalleTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_detalleTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_detalleTipoFormaPago.setToolTipText(TipoFormaPagoConstantesFunciones.LABEL_CONDETALLE);
		this.gridaBagLayoutTipoFormaPago = new GridBagLayout();
		this.jPanelcon_detalleTipoFormaPago.setLayout(this.gridaBagLayoutTipoFormaPago);


		jCheckBoxcon_detalleTipoFormaPago= new JCheckBoxMe();
		jCheckBoxcon_detalleTipoFormaPago.setEnabled(false);

		jCheckBoxcon_detalleTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalleTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalleTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_detalleTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_detalleTipoFormaPagoBusqueda= new JButtonMe();
		this.jButtoncon_detalleTipoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalleTipoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalleTipoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_detalleTipoFormaPagoBusqueda.setText("U");
		this.jButtoncon_detalleTipoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_detalleTipoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_detalleTipoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_detalleTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_detalleTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_detalleTipoFormaPagoBusqueda"));

		if(this.tipoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_detalleTipoFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabelcon_cuotasTipoFormaPago = new JLabelMe();
		this.jLabelcon_cuotasTipoFormaPago.setText(""+TipoFormaPagoConstantesFunciones.LABEL_CONCUOTAS+" : *");
		this.jLabelcon_cuotasTipoFormaPago.setToolTipText("Con Cuotas");
		this.jLabelcon_cuotasTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_cuotasTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_cuotasTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_cuotasTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_cuotasTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_cuotasTipoFormaPago.setToolTipText(TipoFormaPagoConstantesFunciones.LABEL_CONCUOTAS);
		this.gridaBagLayoutTipoFormaPago = new GridBagLayout();
		this.jPanelcon_cuotasTipoFormaPago.setLayout(this.gridaBagLayoutTipoFormaPago);


		jCheckBoxcon_cuotasTipoFormaPago= new JCheckBoxMe();
		jCheckBoxcon_cuotasTipoFormaPago.setEnabled(false);

		jCheckBoxcon_cuotasTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cuotasTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cuotasTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_cuotasTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_cuotasTipoFormaPagoBusqueda= new JButtonMe();
		this.jButtoncon_cuotasTipoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cuotasTipoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cuotasTipoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_cuotasTipoFormaPagoBusqueda.setText("U");
		this.jButtoncon_cuotasTipoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_cuotasTipoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_cuotasTipoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_cuotasTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_cuotasTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cuotasTipoFormaPagoBusqueda"));

		if(this.tipoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_cuotasTipoFormaPagoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoFormaPago = new JLabelMe();
		this.jLabeldescripcionTipoFormaPago.setText(""+TipoFormaPagoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionTipoFormaPago.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoFormaPago.setToolTipText(TipoFormaPagoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoFormaPago = new GridBagLayout();
		this.jPaneldescripcionTipoFormaPago.setLayout(this.gridaBagLayoutTipoFormaPago);


		jTextAreadescripcionTipoFormaPago= new JTextAreaMe();
		jTextAreadescripcionTipoFormaPago.setEnabled(false);
		jTextAreadescripcionTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoFormaPago.setLineWrap(true);
		jTextAreadescripcionTipoFormaPago.setWrapStyleWord(true);
		jTextAreadescripcionTipoFormaPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoFormaPago.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoFormaPago = new JScrollPane(jTextAreadescripcionTipoFormaPago);
		jscrollPanedescripcionTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoFormaPagoBusqueda= new JButtonMe();
		this.jButtondescripcionTipoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoFormaPagoBusqueda.setText("U");
		this.jButtondescripcionTipoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoFormaPagoBusqueda"));

		if(this.tipoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoFormaPagoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoFormaPago = new JLabelMe();
		this.jLabelid_empresaTipoFormaPago.setText(""+TipoFormaPagoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoFormaPago.setToolTipText("Empresa");
		this.jLabelid_empresaTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoFormaPago.setToolTipText(TipoFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoFormaPago = new GridBagLayout();
		this.jPanelid_empresaTipoFormaPago.setLayout(this.gridaBagLayoutTipoFormaPago);


		jComboBoxid_empresaTipoFormaPago= new JComboBoxMe();
		jComboBoxid_empresaTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoFormaPago.setEnabled(false);

		this.jButtonid_empresaTipoFormaPago= new JButtonMe();
		this.jButtonid_empresaTipoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoFormaPago.setText("Buscar");
		this.jButtonid_empresaTipoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoFormaPago"));

		this.jButtonid_empresaTipoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoFormaPagoBusqueda.setText("U");
		this.jButtonid_empresaTipoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoFormaPagoBusqueda"));

		if(this.tipoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoFormaPagoUpdate.setText("U");
		this.jButtonid_empresaTipoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoFormaPagoUpdate"));



					
		this.jLabelid_sucursalTipoFormaPago = new JLabelMe();
		this.jLabelid_sucursalTipoFormaPago.setText(""+TipoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTipoFormaPago.setToolTipText("Sucursal");
		this.jLabelid_sucursalTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTipoFormaPago.setToolTipText(TipoFormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTipoFormaPago = new GridBagLayout();
		this.jPanelid_sucursalTipoFormaPago.setLayout(this.gridaBagLayoutTipoFormaPago);


		jComboBoxid_sucursalTipoFormaPago= new JComboBoxMe();
		jComboBoxid_sucursalTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTipoFormaPago.setEnabled(false);

		this.jButtonid_sucursalTipoFormaPago= new JButtonMe();
		this.jButtonid_sucursalTipoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTipoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTipoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTipoFormaPago.setText("Buscar");
		this.jButtonid_sucursalTipoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTipoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTipoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTipoFormaPago"));

		this.jButtonid_sucursalTipoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_sucursalTipoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTipoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTipoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTipoFormaPagoBusqueda.setText("U");
		this.jButtonid_sucursalTipoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTipoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTipoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTipoFormaPagoBusqueda"));

		if(this.tipoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTipoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTipoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_sucursalTipoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTipoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTipoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTipoFormaPagoUpdate.setText("U");
		this.jButtonid_sucursalTipoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTipoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTipoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTipoFormaPagoUpdate"));



					
		this.jLabelid_moduloTipoFormaPago = new JLabelMe();
		this.jLabelid_moduloTipoFormaPago.setText(""+TipoFormaPagoConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloTipoFormaPago.setToolTipText("Modulo");
		this.jLabelid_moduloTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloTipoFormaPago.setToolTipText(TipoFormaPagoConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutTipoFormaPago = new GridBagLayout();
		this.jPanelid_moduloTipoFormaPago.setLayout(this.gridaBagLayoutTipoFormaPago);


		jComboBoxid_moduloTipoFormaPago= new JComboBoxMe();
		jComboBoxid_moduloTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloTipoFormaPago.setEnabled(false);

		this.jButtonid_moduloTipoFormaPago= new JButtonMe();
		this.jButtonid_moduloTipoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoFormaPago.setText("Buscar");
		this.jButtonid_moduloTipoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloTipoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoFormaPago"));

		this.jButtonid_moduloTipoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_moduloTipoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTipoFormaPagoBusqueda.setText("U");
		this.jButtonid_moduloTipoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloTipoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoFormaPagoBusqueda"));

		if(this.tipoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloTipoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_moduloTipoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_moduloTipoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTipoFormaPagoUpdate.setText("U");
		this.jButtonid_moduloTipoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloTipoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoFormaPagoUpdate"));



					
		this.jLabelid_tipo_grupo_forma_pagoTipoFormaPago = new JLabelMe();
		this.jLabelid_tipo_grupo_forma_pagoTipoFormaPago.setText(""+TipoFormaPagoConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO+" : *");
		this.jLabelid_tipo_grupo_forma_pagoTipoFormaPago.setToolTipText("T. Forma Pago");
		this.jLabelid_tipo_grupo_forma_pagoTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_grupo_forma_pagoTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_grupo_forma_pagoTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_grupo_forma_pagoTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_grupo_forma_pagoTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_grupo_forma_pagoTipoFormaPago.setToolTipText(TipoFormaPagoConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO);
		this.gridaBagLayoutTipoFormaPago = new GridBagLayout();
		this.jPanelid_tipo_grupo_forma_pagoTipoFormaPago.setLayout(this.gridaBagLayoutTipoFormaPago);


		jComboBoxid_tipo_grupo_forma_pagoTipoFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_grupo_forma_pagoTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_grupo_forma_pagoTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPago= new JButtonMe();
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPago.setText("Buscar");
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_forma_pagoTipoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_grupo_forma_pagoTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_forma_pagoTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_forma_pagoTipoFormaPago"));

		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoBusqueda.setText("U");
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_grupo_forma_pagoTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_forma_pagoTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_forma_pagoTipoFormaPagoBusqueda"));

		if(this.tipoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoUpdate.setText("U");
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_forma_pagoTipoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_grupo_forma_pagoTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_forma_pagoTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_forma_pagoTipoFormaPagoUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloTipoFormaPago = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloTipoFormaPago.setText(""+TipoFormaPagoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloTipoFormaPago.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloTipoFormaPago.setToolTipText(TipoFormaPagoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutTipoFormaPago = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloTipoFormaPago.setLayout(this.gridaBagLayoutTipoFormaPago);


		jComboBoxid_tipo_transaccion_moduloTipoFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloTipoFormaPago.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloTipoFormaPago= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloTipoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloTipoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloTipoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloTipoFormaPago.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloTipoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloTipoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloTipoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloTipoFormaPago"));

		this.jButtonid_tipo_transaccion_moduloTipoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloTipoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloTipoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloTipoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloTipoFormaPagoBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloTipoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloTipoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloTipoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloTipoFormaPagoBusqueda"));

		if(this.tipoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloTipoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloTipoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloTipoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloTipoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloTipoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloTipoFormaPagoUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloTipoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloTipoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloTipoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloTipoFormaPagoUpdate"));



					
		this.jLabelid_transaccionTipoFormaPago = new JLabelMe();
		this.jLabelid_transaccionTipoFormaPago.setText(""+TipoFormaPagoConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionTipoFormaPago.setToolTipText("Transaccion");
		this.jLabelid_transaccionTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionTipoFormaPago.setToolTipText(TipoFormaPagoConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutTipoFormaPago = new GridBagLayout();
		this.jPanelid_transaccionTipoFormaPago.setLayout(this.gridaBagLayoutTipoFormaPago);


		jComboBoxid_transaccionTipoFormaPago= new JComboBoxMe();
		jComboBoxid_transaccionTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionTipoFormaPago= new JButtonMe();
		this.jButtonid_transaccionTipoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionTipoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionTipoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionTipoFormaPago.setText("Buscar");
		this.jButtonid_transaccionTipoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionTipoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionTipoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionTipoFormaPago"));

		this.jButtonid_transaccionTipoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_transaccionTipoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionTipoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionTipoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionTipoFormaPagoBusqueda.setText("U");
		this.jButtonid_transaccionTipoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionTipoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionTipoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionTipoFormaPagoBusqueda"));

		if(this.tipoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionTipoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_transaccionTipoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_transaccionTipoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionTipoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionTipoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionTipoFormaPagoUpdate.setText("U");
		this.jButtonid_transaccionTipoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionTipoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionTipoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionTipoFormaPagoUpdate"));



					
		this.jLabelid_cuenta_contableTipoFormaPago = new JLabelMe();
		this.jLabelid_cuenta_contableTipoFormaPago.setText(""+TipoFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableTipoFormaPago.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableTipoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableTipoFormaPago.setToolTipText(TipoFormaPagoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutTipoFormaPago = new GridBagLayout();
		this.jPanelid_cuenta_contableTipoFormaPago.setLayout(this.gridaBagLayoutTipoFormaPago);


		jComboBoxid_cuenta_contableTipoFormaPago= new JComboBoxMe();
		jComboBoxid_cuenta_contableTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableTipoFormaPago= new JButtonMe();
		this.jButtonid_cuenta_contableTipoFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTipoFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTipoFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTipoFormaPago.setText("Buscar");
		this.jButtonid_cuenta_contableTipoFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableTipoFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoFormaPago"));

		this.jButtonid_cuenta_contableTipoFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableTipoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableTipoFormaPagoBusqueda.setText("U");
		this.jButtonid_cuenta_contableTipoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableTipoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoFormaPagoBusqueda"));

		if(this.tipoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableTipoFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableTipoFormaPagoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableTipoFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableTipoFormaPagoUpdate.setText("U");
		this.jButtonid_cuenta_contableTipoFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableTipoFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoFormaPagoUpdate"));


		jButtonid_cuenta_contableTipoFormaPagoArbol= new JButtonMe();
		jButtonid_cuenta_contableTipoFormaPagoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTipoFormaPagoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTipoFormaPagoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTipoFormaPagoArbol.setText("Arbol");
		jButtonid_cuenta_contableTipoFormaPagoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableTipoFormaPagoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoFormaPagoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableTipoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoFormaPagoArbol"));



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
		//this.jInternalFrameDetalleTipoFormaPago = new TipoFormaPagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Forma Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFormaPago= new GridBagLayout();
		

		
		String sToolTipTipoFormaPago="";
		sToolTipTipoFormaPago=TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFormaPago+="(Facturacion.TipoFormaPago)";
		}
		
		if(!this.tipoformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFormaPago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoFormaPago = new JButtonMe();
		this.jButtonModificarTipoFormaPago = new JButtonMe();
        this.jButtonActualizarTipoFormaPago = new JButtonMe();
        this.jButtonEliminarTipoFormaPago = new JButtonMe();
        this.jButtonCancelarTipoFormaPago = new JButtonMe();
        this.jButtonGuardarCambiosTipoFormaPago = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoFormaPago = new JButtonMe();
		this.jButtonCerrarTipoFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosTipoFormaPago = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoFormaPago = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoFormaPago = new JScrollPane();
				
		
		
		this.jPanelCamposTipoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Forma Pago";
		
		if(!this.tipoformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoFormaPago.setName("jPanelCamposTipoFormaPago"); 

		this.jPanelCamposOcultosTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoFormaPago.setName("jPanelCamposOcultosTipoFormaPago"); 

        this.jPanelAccionesTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesTipoFormaPago.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoFormaPago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoFormaPago.setText("Nuevo");
		this.jButtonModificarTipoFormaPago.setText("Editar");
        this.jButtonActualizarTipoFormaPago.setText("Actualizar");
        this.jButtonEliminarTipoFormaPago.setText("Eliminar");
        this.jButtonCancelarTipoFormaPago.setText("Cancelar");
        this.jButtonGuardarCambiosTipoFormaPago.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoFormaPago.setText("Guardar");
		this.jButtonCerrarTipoFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFormaPago,"nuevo_button","Nuevo",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoFormaPago,"modificar_button","Editar",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoFormaPago,"actualizar_button","Actualizar",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoFormaPago,"eliminar_button","Eliminar",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoFormaPago,"cancelar_button","Cancelar",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoFormaPago,"guardarcambios_button","Guardar",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFormaPago,"guardarcambiostabla_button","Guardar",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFormaPago,"cerrar_button","Salir",this.tipoformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoFormaPago.setToolTipText("Nuevo"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoFormaPago.setToolTipText("Editar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoFormaPago.setToolTipText("Actualizar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoFormaPago.setToolTipText("Eliminar)"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoFormaPago.setToolTipText("Cancelar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoFormaPago.setToolTipText("Guardar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoFormaPago.setToolTipText("Guardar"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFormaPago.setToolTipText("Salir"+" "+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFormaPago";
		inputMap = this.jButtonNuevoTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFormaPago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoFormaPago";
		inputMap = this.jButtonActualizarTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoFormaPago"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoFormaPago";
		inputMap = this.jButtonEliminarTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoFormaPago"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoFormaPago";
		inputMap = this.jButtonCancelarTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoFormaPago"));
		
		//CERRAR		
		sMapKey = "CerrarTipoFormaPago";
		inputMap = this.jButtonCerrarTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaTipoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFormaPago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoFormaPago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoFormaPago.setToolTipText("Nuevo TipoFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoFormaPago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoFormaPago.setToolTipText("Sin Cerrar Ventana TipoFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoFormaPago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoFormaPago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesTipoFormaPago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoFormaPago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoFormaPago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoFormaPago = new JLabelMe();
		
		this.jLabelAccionesTipoFormaPago.setText("Acciones");		
		this.jLabelAccionesTipoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoFormaPago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoFormaPago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoFormaPago=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFormaPago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoFormaPago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoFormaPago = new GridBagLayout();
		
		this.jPanelCamposTipoFormaPago.setLayout(gridaBagLayoutCamposTipoFormaPago);
		this.jPanelCamposOcultosTipoFormaPago.setLayout(gridaBagLayoutCamposOcultosTipoFormaPago);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoFormaPago.add(jLabelIdTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoFormaPago.add(jLabelidTipoFormaPago, this.gridBagConstraintsTipoFormaPago);


	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoFormaPago.add(jLabelid_empresaTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoFormaPago.add(jButtonid_empresaTipoFormaPagoBusqueda, this.gridBagConstraintsTipoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 3;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoFormaPago.add(jButtonid_empresaTipoFormaPagoUpdate, this.gridBagConstraintsTipoFormaPago);
	}

	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoFormaPago.add(jComboBoxid_empresaTipoFormaPago, this.gridBagConstraintsTipoFormaPago);


	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalTipoFormaPago.add(jLabelid_sucursalTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTipoFormaPago.add(jButtonid_sucursalTipoFormaPagoBusqueda, this.gridBagConstraintsTipoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 3;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTipoFormaPago.add(jButtonid_sucursalTipoFormaPagoUpdate, this.gridBagConstraintsTipoFormaPago);
	}

	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalTipoFormaPago.add(jComboBoxid_sucursalTipoFormaPago, this.gridBagConstraintsTipoFormaPago);


	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloTipoFormaPago.add(jLabelid_moduloTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTipoFormaPago.add(jButtonid_moduloTipoFormaPagoBusqueda, this.gridBagConstraintsTipoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 3;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTipoFormaPago.add(jButtonid_moduloTipoFormaPagoUpdate, this.gridBagConstraintsTipoFormaPago);
	}

	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloTipoFormaPago.add(jComboBoxid_moduloTipoFormaPago, this.gridBagConstraintsTipoFormaPago);


	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_grupo_forma_pagoTipoFormaPago.add(jLabelid_tipo_grupo_forma_pagoTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_grupo_forma_pagoTipoFormaPago.add(jButtonid_tipo_grupo_forma_pagoTipoFormaPagoBusqueda, this.gridBagConstraintsTipoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 3;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_grupo_forma_pagoTipoFormaPago.add(jButtonid_tipo_grupo_forma_pagoTipoFormaPagoUpdate, this.gridBagConstraintsTipoFormaPago);
	}

	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_grupo_forma_pagoTipoFormaPago.add(jComboBoxid_tipo_grupo_forma_pagoTipoFormaPago, this.gridBagConstraintsTipoFormaPago);


	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoFormaPago.add(jLabelnombreTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoFormaPago.add(jButtonnombreTipoFormaPagoBusqueda, this.gridBagConstraintsTipoFormaPago);
	}

	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoFormaPago.add(jscrollPanenombreTipoFormaPago, this.gridBagConstraintsTipoFormaPago);


	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglasTipoFormaPago.add(jLabelsiglasTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglasTipoFormaPago.add(jButtonsiglasTipoFormaPagoBusqueda, this.gridBagConstraintsTipoFormaPago);
	}

	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglasTipoFormaPago.add(jTextFieldsiglasTipoFormaPago, this.gridBagConstraintsTipoFormaPago);


	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_detalleTipoFormaPago.add(jLabelcon_detalleTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_detalleTipoFormaPago.add(jButtoncon_detalleTipoFormaPagoBusqueda, this.gridBagConstraintsTipoFormaPago);
	}

	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_detalleTipoFormaPago.add(jCheckBoxcon_detalleTipoFormaPago, this.gridBagConstraintsTipoFormaPago);


	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_cuotasTipoFormaPago.add(jLabelcon_cuotasTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_cuotasTipoFormaPago.add(jButtoncon_cuotasTipoFormaPagoBusqueda, this.gridBagConstraintsTipoFormaPago);
	}

	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_cuotasTipoFormaPago.add(jCheckBoxcon_cuotasTipoFormaPago, this.gridBagConstraintsTipoFormaPago);


	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_transaccion_moduloTipoFormaPago.add(jLabelid_tipo_transaccion_moduloTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloTipoFormaPago.add(jButtonid_tipo_transaccion_moduloTipoFormaPagoBusqueda, this.gridBagConstraintsTipoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 3;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloTipoFormaPago.add(jButtonid_tipo_transaccion_moduloTipoFormaPagoUpdate, this.gridBagConstraintsTipoFormaPago);
	}

	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_transaccion_moduloTipoFormaPago.add(jComboBoxid_tipo_transaccion_moduloTipoFormaPago, this.gridBagConstraintsTipoFormaPago);


	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionTipoFormaPago.add(jLabelid_transaccionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionTipoFormaPago.add(jButtonid_transaccionTipoFormaPagoBusqueda, this.gridBagConstraintsTipoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 3;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionTipoFormaPago.add(jButtonid_transaccionTipoFormaPagoUpdate, this.gridBagConstraintsTipoFormaPago);
	}

	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionTipoFormaPago.add(jComboBoxid_transaccionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);


	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableTipoFormaPago.add(jLabelid_cuenta_contableTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 2;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableTipoFormaPago.add(jButtonid_cuenta_contableTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 3;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableTipoFormaPago.add(jButtonid_cuenta_contableTipoFormaPagoArbol, this.gridBagConstraintsTipoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 4;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableTipoFormaPago.add(jButtonid_cuenta_contableTipoFormaPagoBusqueda, this.gridBagConstraintsTipoFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 5;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableTipoFormaPago.add(jButtonid_cuenta_contableTipoFormaPagoUpdate, this.gridBagConstraintsTipoFormaPago);
	}

	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableTipoFormaPago.add(jComboBoxid_cuenta_contableTipoFormaPago, this.gridBagConstraintsTipoFormaPago);


	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoFormaPago.add(jLabeldescripcionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoFormaPago.add(jButtondescripcionTipoFormaPagoBusqueda, this.gridBagConstraintsTipoFormaPago);
	}

	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoFormaPago.add(jscrollPanedescripcionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPago.gridy = iYPanelCamposTipoFormaPago;
	this.gridBagConstraintsTipoFormaPago.gridx = iXPanelCamposTipoFormaPago++;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormaPago.add(this.jPanelidTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(iXPanelCamposTipoFormaPago % 1==0) {
		iXPanelCamposTipoFormaPago=0;
		iYPanelCamposTipoFormaPago++;
	}
	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPago.gridy = iYPanelCamposTipoFormaPago;
	this.gridBagConstraintsTipoFormaPago.gridx = iXPanelCamposTipoFormaPago++;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormaPago.add(this.jPanelid_tipo_grupo_forma_pagoTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(iXPanelCamposTipoFormaPago % 1==0) {
		iXPanelCamposTipoFormaPago=0;
		iYPanelCamposTipoFormaPago++;
	}
	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPago.gridy = iYPanelCamposTipoFormaPago;
	this.gridBagConstraintsTipoFormaPago.gridx = iXPanelCamposTipoFormaPago++;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormaPago.add(this.jPanelnombreTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(iXPanelCamposTipoFormaPago % 1==0) {
		iXPanelCamposTipoFormaPago=0;
		iYPanelCamposTipoFormaPago++;
	}
	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPago.gridy = iYPanelCamposTipoFormaPago;
	this.gridBagConstraintsTipoFormaPago.gridx = iXPanelCamposTipoFormaPago++;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormaPago.add(this.jPanelsiglasTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(iXPanelCamposTipoFormaPago % 1==0) {
		iXPanelCamposTipoFormaPago=0;
		iYPanelCamposTipoFormaPago++;
	}
	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPago.gridy = iYPanelCamposTipoFormaPago;
	this.gridBagConstraintsTipoFormaPago.gridx = iXPanelCamposTipoFormaPago++;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormaPago.add(this.jPanelcon_detalleTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(iXPanelCamposTipoFormaPago % 1==0) {
		iXPanelCamposTipoFormaPago=0;
		iYPanelCamposTipoFormaPago++;
	}
	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPago.gridy = iYPanelCamposTipoFormaPago;
	this.gridBagConstraintsTipoFormaPago.gridx = iXPanelCamposTipoFormaPago++;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormaPago.add(this.jPanelcon_cuotasTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(iXPanelCamposTipoFormaPago % 1==0) {
		iXPanelCamposTipoFormaPago=0;
		iYPanelCamposTipoFormaPago++;
	}
	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPago.gridy = iYPanelCamposTipoFormaPago;
	this.gridBagConstraintsTipoFormaPago.gridx = iXPanelCamposTipoFormaPago++;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormaPago.add(this.jPanelid_transaccionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(iXPanelCamposTipoFormaPago % 1==0) {
		iXPanelCamposTipoFormaPago=0;
		iYPanelCamposTipoFormaPago++;
	}
	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPago.gridy = iYPanelCamposTipoFormaPago;
	this.gridBagConstraintsTipoFormaPago.gridx = iXPanelCamposTipoFormaPago++;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormaPago.add(this.jPanelid_cuenta_contableTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(iXPanelCamposTipoFormaPago % 1==0) {
		iXPanelCamposTipoFormaPago=0;
		iYPanelCamposTipoFormaPago++;
	}
	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPago.gridy = iYPanelCamposTipoFormaPago;
	this.gridBagConstraintsTipoFormaPago.gridx = iXPanelCamposTipoFormaPago++;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFormaPago.add(this.jPaneldescripcionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(iXPanelCamposTipoFormaPago % 1==0) {
		iXPanelCamposTipoFormaPago=0;
		iYPanelCamposTipoFormaPago++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPago.gridy = iYPanelCamposOcultosTipoFormaPago;
	this.gridBagConstraintsTipoFormaPago.gridx = iXPanelCamposOcultosTipoFormaPago++;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoFormaPago.add(this.jPanelid_empresaTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(iXPanelCamposOcultosTipoFormaPago % 1==0) {
		iXPanelCamposOcultosTipoFormaPago=0;
		iYPanelCamposOcultosTipoFormaPago++;
	}
	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPago.gridy = iYPanelCamposOcultosTipoFormaPago;
	this.gridBagConstraintsTipoFormaPago.gridx = iXPanelCamposOcultosTipoFormaPago++;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoFormaPago.add(this.jPanelid_sucursalTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(iXPanelCamposOcultosTipoFormaPago % 1==0) {
		iXPanelCamposOcultosTipoFormaPago=0;
		iYPanelCamposOcultosTipoFormaPago++;
	}
	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPago.gridy = iYPanelCamposOcultosTipoFormaPago;
	this.gridBagConstraintsTipoFormaPago.gridx = iXPanelCamposOcultosTipoFormaPago++;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoFormaPago.add(this.jPanelid_moduloTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(iXPanelCamposOcultosTipoFormaPago % 1==0) {
		iXPanelCamposOcultosTipoFormaPago=0;
		iYPanelCamposOcultosTipoFormaPago++;
	}
	this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFormaPago.gridy = iYPanelCamposOcultosTipoFormaPago;
	this.gridBagConstraintsTipoFormaPago.gridx = iXPanelCamposOcultosTipoFormaPago++;
	this.gridBagConstraintsTipoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoFormaPago.add(this.jPanelid_tipo_transaccion_moduloTipoFormaPago, this.gridBagConstraintsTipoFormaPago);



	if(iXPanelCamposOcultosTipoFormaPago % 1==0) {
		iXPanelCamposOcultosTipoFormaPago=0;
		iYPanelCamposOcultosTipoFormaPago++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoFormaPago= new GridBagLayout();
		this.jPanelAccionesTipoFormaPago.setLayout(gridaBagLayoutAccionesTipoFormaPago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoFormaPago= new GridBagLayout();
		this.jPanelAccionesFormularioTipoFormaPago.setLayout(gridaBagLayoutAccionesFormularioTipoFormaPago);
		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFormaPago.add(this.jComboBoxTiposAccionesFormularioTipoFormaPago, this.gridBagConstraintsTipoFormaPago);

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFormaPago.add(this.jCheckBoxPostAccionNuevoTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoformapagoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFormaPago.add(this.jCheckBoxPostAccionSinCerrarTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoformapagoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFormaPago.add(this.jCheckBoxPostAccionSinMensajeTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoFormaPago.add(this.jButtonModificarTipoFormaPago, this.gridBagConstraintsTipoFormaPago);							

		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoFormaPago.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoFormaPago.add(this.jButtonEliminarTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		
			
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy = 0;		
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFormaPago.add(this.jButtonActualizarTipoFormaPago, this.gridBagConstraintsTipoFormaPago);


		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy = 0;		
		this.gridBagConstraintsTipoFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFormaPago.add(this.jButtonGuardarCambiosTipoFormaPago, this.gridBagConstraintsTipoFormaPago);	
		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy = 0;		
		this.gridBagConstraintsTipoFormaPago.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoFormaPago.add(this.jButtonCancelarTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFormaPago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFormaPago.gridx = 0;		
			//this.gridBagConstraintsTipoFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFormaPago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFormaPago.gridx =0;
		this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoFormaPago = new TipoFormaPagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Forma Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Forma Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Forma Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoFormaPagoModel tipoformapagoModel=new TipoFormaPagoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoFormaPagoModel.TipoFormaPagoFocusTraversalPolicy tipoformapagoFocusTraversalPolicy = tipoformapagoModel.new TipoFormaPagoFocusTraversalPolicy(this);
			
			//tipoformapagoFocusTraversalPolicy.settipoformapagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoformapagoModel);
			
			
			this.jContentPaneDetalleTipoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoFormaPago = new GridBagLayout();	
			this.jContentPaneDetalleTipoFormaPago.setLayout(gridaBagLayoutDetalleTipoFormaPago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFormaPago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoFormaPago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoFormaPago.gridx = 0;
					
				
				this.jContentPaneDetalleTipoFormaPago.add(jTtoolBarDetalleTipoFormaPago, gridBagConstraintsTipoFormaPago);								
				
}
			
			this.jScrollPanelDatosEdicionTipoFormaPago=   new JScrollPane(jContentPaneDetalleTipoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoFormaPago.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoFormaPago.gridx = 0;
	        
			this.jContentPaneDetalleTipoFormaPago.add(jPanelCamposTipoFormaPago, gridBagConstraintsTipoFormaPago);
			
			
			
			
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
						&& tipoformapagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCierreCaja(this.puedeCargarPorParteCierreCaja,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetaFormaPago(this.puedeCargarPorParteDetaFormaPago,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetaFormaPagoFactu(this.puedeCargarPorParteDetaFormaPagoFactu,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormaPago(this.puedeCargarPorParteFormaPago,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoInven(this.puedeCargarPorParteFormaPagoInven,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(this.puedeCargarPorParteFormaPagoPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGrupoClienteFormaPago(this.puedeCargarPorParteGrupoClienteFormaPago,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRegistroFormaPagoBanco(this.puedeCargarPorParteRegistroFormaPagoBanco,false,-1);
					
					if(this.tipoformapagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoFormaPago= new GridBagConstraints();
						this.gridBagConstraintsTipoFormaPago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoFormaPago.gridx = 0;
						this.jContentPaneDetalleTipoFormaPago.add(this.jTabbedPaneRelacionesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoFormaPago.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCierreCaja(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetaFormaPago(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetaFormaPagoFactu(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormaPago(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoInven(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGrupoClienteFormaPago(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRegistroFormaPagoBanco(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoFormaPago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
					this.gridBagConstraintsTipoFormaPago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoFormaPago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoFormaPago.gridx = 0;
					
				
					this.jContentPaneDetalleTipoFormaPago.add(jPanelCamposOcultosTipoFormaPago, gridBagConstraintsTipoFormaPago);
				
					this.jPanelCamposOcultosTipoFormaPago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyRelaciones++;//25;		
	        this.gridBagConstraintsTipoFormaPago.gridx = 0;
	        this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoFormaPago.add(this.jPanelAccionesFormularioTipoFormaPago, this.gridBagConstraintsTipoFormaPago);							
			
			
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
	        this.gridBagConstraintsTipoFormaPago.gridy = iGridyRelaciones;//25;		
	        this.gridBagConstraintsTipoFormaPago.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoFormaPago.add(this.jPanelAccionesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoFormaPago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoFormaPago=   new JScrollPane(this.jPanelCamposTipoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoFormaPago.gridx = 0;
			this.gridBagConstraintsTipoFormaPago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoFormaPago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoFormaPago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoFormaPago, this.gridBagConstraintsTipoFormaPago);			
			
			this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
			
			
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		
			
		this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFormaPago, this.gridBagConstraintsTipoFormaPago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoFormaPago;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoFormaPago;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCierreCaja(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cierrecajaSessionBean=new CierreCajaSessionBean();
		this.cierrecajaSessionBean.setConGuardarRelaciones(false);
		this.cierrecajaSessionBean.setEsGuardarRelacionado(true);

		this.cierrecajaBeanSwingJInternalFrame=null;//new CierreCajaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cierrecajaBeanSwingJInternalFramePopup=new CierreCajaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cierrecajaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cierrecajaSessionBean.getEsGuardarRelacionado()) {

				CierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cierrecajaSessionBean.setEsGuardarRelacionado(true);

				this.cierrecajaBeanSwingJInternalFrame=new CierreCajaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cierrecajaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cierrecajaBeanSwingJInternalFrame.setcierrecajaSessionBean(this.cierrecajaSessionBean);

				//this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
				//this.gridBagConstraintsTipoFormaPago.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoFormaPago.gridx = 0;
				//this.jContentPaneDetalleTipoFormaPago.add(this.cierrecajaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoFormaPago);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Cierre Cajas",this.cierrecajaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoFormaPago.setComponentAt(iIndexTab,this.cierrecajaBeanSwingJInternalFrame.getContentPane());
				}

				//CierreCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cierrecajaSessionBean.setEsGuardarRelacionado(false);
				this.cierrecajaBeanSwingJInternalFrame=null;//new CierreCajaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCierreCaja) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Cierre Cajas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetaFormaPago(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detaformapagoSessionBean=new DetaFormaPagoSessionBean();
		this.detaformapagoSessionBean.setConGuardarRelaciones(false);
		this.detaformapagoSessionBean.setEsGuardarRelacionado(true);

		this.detaformapagoBeanSwingJInternalFrame=null;//new DetaFormaPagoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detaformapagoBeanSwingJInternalFramePopup=new DetaFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detaformapagoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detaformapagoSessionBean.getEsGuardarRelacionado()) {

				DetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detaformapagoSessionBean.setEsGuardarRelacionado(true);

				this.detaformapagoBeanSwingJInternalFrame=new DetaFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detaformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detaformapagoBeanSwingJInternalFrame.setdetaformapagoSessionBean(this.detaformapagoSessionBean);

				//this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
				//this.gridBagConstraintsTipoFormaPago.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoFormaPago.gridx = 0;
				//this.jContentPaneDetalleTipoFormaPago.add(this.detaformapagoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoFormaPago);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Deta Forma Pagos",this.detaformapagoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoFormaPago.setComponentAt(iIndexTab,this.detaformapagoBeanSwingJInternalFrame.getContentPane());
				}

				//DetaFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detaformapagoSessionBean.setEsGuardarRelacionado(false);
				this.detaformapagoBeanSwingJInternalFrame=null;//new DetaFormaPagoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detaformapagoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetaFormaPago) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Deta Forma Pagos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetaFormaPagoFactu(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean();
		this.detaformapagofactuSessionBean.setConGuardarRelaciones(false);
		this.detaformapagofactuSessionBean.setEsGuardarRelacionado(true);

		this.detaformapagofactuBeanSwingJInternalFrame=null;//new DetaFormaPagoFactuBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detaformapagofactuBeanSwingJInternalFramePopup=new DetaFormaPagoFactuBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detaformapagofactuBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {

				DetaFormaPagoFactuJInternalFrame.STIPO_TAMANIO_GENERAL=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetaFormaPagoFactuJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detaformapagofactuSessionBean.setEsGuardarRelacionado(true);

				this.detaformapagofactuBeanSwingJInternalFrame=new DetaFormaPagoFactuBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detaformapagofactuBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detaformapagofactuBeanSwingJInternalFrame.setdetaformapagofactuSessionBean(this.detaformapagofactuSessionBean);

				//this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
				//this.gridBagConstraintsTipoFormaPago.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoFormaPago.gridx = 0;
				//this.jContentPaneDetalleTipoFormaPago.add(this.detaformapagofactuBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoFormaPago);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Deta Forma Pago Factus",this.detaformapagofactuBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoFormaPago.setComponentAt(iIndexTab,this.detaformapagofactuBeanSwingJInternalFrame.getContentPane());
				}

				//DetaFormaPagoFactuJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detaformapagofactuSessionBean.setEsGuardarRelacionado(false);
				this.detaformapagofactuBeanSwingJInternalFrame=null;//new DetaFormaPagoFactuBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetaFormaPagoFactu) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Deta Forma Pago Factus",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFormaPago(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formapagoSessionBean=new FormaPagoSessionBean();
		this.formapagoSessionBean.setConGuardarRelaciones(false);
		this.formapagoSessionBean.setEsGuardarRelacionado(true);

		this.formapagoBeanSwingJInternalFrame=null;//new FormaPagoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formapagoBeanSwingJInternalFramePopup=new FormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formapagoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formapagoSessionBean.getEsGuardarRelacionado()) {

				FormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formapagoSessionBean.setEsGuardarRelacionado(true);

				this.formapagoBeanSwingJInternalFrame=new FormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formapagoBeanSwingJInternalFrame.setformapagoSessionBean(this.formapagoSessionBean);

				//this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
				//this.gridBagConstraintsTipoFormaPago.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoFormaPago.gridx = 0;
				//this.jContentPaneDetalleTipoFormaPago.add(this.formapagoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoFormaPago);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Forma Pagos",this.formapagoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoFormaPago.setComponentAt(iIndexTab,this.formapagoBeanSwingJInternalFrame.getContentPane());
				}

				//FormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formapagoSessionBean.setEsGuardarRelacionado(false);
				this.formapagoBeanSwingJInternalFrame=null;//new FormaPagoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formapagoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormaPago) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Forma Pagos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFormaPagoInven(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
		this.formapagoinvenSessionBean.setConGuardarRelaciones(false);
		this.formapagoinvenSessionBean.setEsGuardarRelacionado(true);

		this.formapagoinvenBeanSwingJInternalFrame=null;//new FormaPagoInvenBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formapagoinvenBeanSwingJInternalFramePopup=new FormaPagoInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formapagoinvenBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {

				FormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formapagoinvenSessionBean.setEsGuardarRelacionado(true);

				this.formapagoinvenBeanSwingJInternalFrame=new FormaPagoInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formapagoinvenBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formapagoinvenBeanSwingJInternalFrame.setformapagoinvenSessionBean(this.formapagoinvenSessionBean);

				//this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
				//this.gridBagConstraintsTipoFormaPago.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoFormaPago.gridx = 0;
				//this.jContentPaneDetalleTipoFormaPago.add(this.formapagoinvenBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoFormaPago);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Forma Pagoes",this.formapagoinvenBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoFormaPago.setComponentAt(iIndexTab,this.formapagoinvenBeanSwingJInternalFrame.getContentPane());
				}

				//FormaPagoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formapagoinvenSessionBean.setEsGuardarRelacionado(false);
				this.formapagoinvenBeanSwingJInternalFrame=null;//new FormaPagoInvenBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormaPagoInven) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Forma Pagoes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		this.formapagopuntoventaSessionBean.setConGuardarRelaciones(false);
		this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formapagopuntoventaBeanSwingJInternalFramePopup=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formapagopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {

				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formapagopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formapagopuntoventaBeanSwingJInternalFrame.setformapagopuntoventaSessionBean(this.formapagopuntoventaSessionBean);

				//this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
				//this.gridBagConstraintsTipoFormaPago.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoFormaPago.gridx = 0;
				//this.jContentPaneDetalleTipoFormaPago.add(this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoFormaPago);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Forma Pagoes",this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoFormaPago.setComponentAt(iIndexTab,this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormaPagoPuntoVenta) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Forma Pagoes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameGrupoClienteFormaPago(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
		this.grupoclienteformapagoSessionBean.setConGuardarRelaciones(false);
		this.grupoclienteformapagoSessionBean.setEsGuardarRelacionado(true);

		this.grupoclienteformapagoBeanSwingJInternalFrame=null;//new GrupoClienteFormaPagoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.grupoclienteformapagoBeanSwingJInternalFramePopup=new GrupoClienteFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.grupoclienteformapagoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {

				GrupoClienteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
				GrupoClienteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.grupoclienteformapagoSessionBean.setEsGuardarRelacionado(true);

				this.grupoclienteformapagoBeanSwingJInternalFrame=new GrupoClienteFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.grupoclienteformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.grupoclienteformapagoBeanSwingJInternalFrame.setgrupoclienteformapagoSessionBean(this.grupoclienteformapagoSessionBean);

				//this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
				//this.gridBagConstraintsTipoFormaPago.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoFormaPago.gridx = 0;
				//this.jContentPaneDetalleTipoFormaPago.add(this.grupoclienteformapagoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoFormaPago);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Grupo Cliente Forma Pagos",this.grupoclienteformapagoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoFormaPago.setComponentAt(iIndexTab,this.grupoclienteformapagoBeanSwingJInternalFrame.getContentPane());
				}

				//GrupoClienteFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.grupoclienteformapagoSessionBean.setEsGuardarRelacionado(false);
				this.grupoclienteformapagoBeanSwingJInternalFrame=null;//new GrupoClienteFormaPagoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGrupoClienteFormaPago) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Grupo Cliente Forma Pagos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRegistroFormaPagoBanco(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.registroformapagobancoSessionBean=new RegistroFormaPagoBancoSessionBean();
		this.registroformapagobancoSessionBean.setConGuardarRelaciones(false);
		this.registroformapagobancoSessionBean.setEsGuardarRelacionado(true);

		this.registroformapagobancoBeanSwingJInternalFrame=null;//new RegistroFormaPagoBancoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.registroformapagobancoBeanSwingJInternalFramePopup=new RegistroFormaPagoBancoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.registroformapagobancoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado()) {

				RegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
				RegistroFormaPagoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.registroformapagobancoSessionBean.setEsGuardarRelacionado(true);

				this.registroformapagobancoBeanSwingJInternalFrame=new RegistroFormaPagoBancoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.registroformapagobancoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.registroformapagobancoBeanSwingJInternalFrame.setregistroformapagobancoSessionBean(this.registroformapagobancoSessionBean);

				//this.gridBagConstraintsTipoFormaPago = new GridBagConstraints();
				//this.gridBagConstraintsTipoFormaPago.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoFormaPago.gridx = 0;
				//this.jContentPaneDetalleTipoFormaPago.add(this.registroformapagobancoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoFormaPago);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Registro Forma Pago Bancos",this.registroformapagobancoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoFormaPago.setComponentAt(iIndexTab,this.registroformapagobancoBeanSwingJInternalFrame.getContentPane());
				}

				//RegistroFormaPagoBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.registroformapagobancoSessionBean.setEsGuardarRelacionado(false);
				this.registroformapagobancoBeanSwingJInternalFrame=null;//new RegistroFormaPagoBancoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.registroformapagobancoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRegistroFormaPagoBanco) {
					this.jTabbedPaneRelacionesTipoFormaPago.add("Registro Forma Pago Bancos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarRegistroFormaPagoBancoBeanSwingJInternalFrame(List<TipoFormaPago> tipoformapagos,TipoFormaPago tipoformapago,RegistroFormaPagoBancoBeanSwingJInternalFrame registroformapagobancoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//registroformapagobancoBeanSwingJInternalFrame=new RegistroFormaPagoBancoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					registroformapagobancoBeanSwingJInternalFrame.getRegistroFormaPagoBancoLogic().setConnexion(this.tipoformapagoLogic.getConnexion());

					registroformapagobancoBeanSwingJInternalFrame.settipoformapagosForeignKey(tipoformapagos);
					registroformapagobancoBeanSwingJInternalFrame.settipoformapagoForeignKey(tipoformapago);
					registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoSessionBean.setisBusquedaDesdeForeignKeySesionTipoFormaPago(true);
					registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoSessionBean.setlidTipoFormaPagoActual(tipoformapago.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					registroformapagobancoBeanSwingJInternalFrame.cargarCombosForeignKeyRegistroFormaPagoBanco(registroformapagobancoBeanSwingJInternalFrame.isCargarCombosDependencia);
					registroformapagobancoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoFormaPago(true);
					registroformapagobancoBeanSwingJInternalFrame.setid_tipo_forma_pagoFK_IdTipoFormaPago(tipoformapago.getId());

					if(!this.conCargarFormDetalle) {
						registroformapagobancoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					registroformapagobancoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoFormaPagoForeignKey(tipoformapago,1,false,true,true);
					registroformapagobancoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					registroformapagobancoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoFormaPago");
					registroformapagobancoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoFormaPago");
					registroformapagobancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaRegistroFormaPagoBanco(true);
					registroformapagobancoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRegistroFormaPagoBanco("n",registroformapagobancoBeanSwingJInternalFrame.isGuardarCambiosEnLote, registroformapagobancoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					registroformapagobancoBeanSwingJInternalFrame.setAutoscrolls(true);
					registroformapagobancoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						registroformapagobancoBeanSwingJInternalFrame.actualizarEstadoPanelsRegistroFormaPagoBanco("relacionado");
					} else {
						registroformapagobancoBeanSwingJInternalFrame.actualizarEstadoPanelsRegistroFormaPagoBanco("no_relacionado");
					}

					registroformapagobancoBeanSwingJInternalFrame.getjButtonRecargarInformacionRegistroFormaPagoBanco().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetaFormaPagoFactuBeanSwingJInternalFrame(List<TipoFormaPago> tipoformapagos,TipoFormaPago tipoformapago,DetaFormaPagoFactuBeanSwingJInternalFrame detaformapagofactuBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detaformapagofactuBeanSwingJInternalFrame=new DetaFormaPagoFactuBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detaformapagofactuBeanSwingJInternalFrame.getDetaFormaPagoFactuLogic().setConnexion(this.tipoformapagoLogic.getConnexion());

					detaformapagofactuBeanSwingJInternalFrame.settipoformapagosForeignKey(tipoformapagos);
					detaformapagofactuBeanSwingJInternalFrame.settipoformapagoForeignKey(tipoformapago);
					detaformapagofactuBeanSwingJInternalFrame.detaformapagofactuSessionBean.setisBusquedaDesdeForeignKeySesionTipoFormaPago(true);
					detaformapagofactuBeanSwingJInternalFrame.detaformapagofactuSessionBean.setlidTipoFormaPagoActual(tipoformapago.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detaformapagofactuBeanSwingJInternalFrame.cargarCombosForeignKeyDetaFormaPagoFactu(detaformapagofactuBeanSwingJInternalFrame.isCargarCombosDependencia);
					detaformapagofactuBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoFormaPago(true);
					detaformapagofactuBeanSwingJInternalFrame.setid_tipo_forma_pagoFK_IdTipoFormaPago(tipoformapago.getId());

					if(!this.conCargarFormDetalle) {
						detaformapagofactuBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detaformapagofactuBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoFormaPagoForeignKey(tipoformapago,1,false,true,true);
					detaformapagofactuBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detaformapagofactuBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoFormaPago");
					detaformapagofactuBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoFormaPago");
					detaformapagofactuBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaFormaPagoFactu(true);
					detaformapagofactuBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetaFormaPagoFactu("n",detaformapagofactuBeanSwingJInternalFrame.isGuardarCambiosEnLote, detaformapagofactuBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detaformapagofactuBeanSwingJInternalFrame.setAutoscrolls(true);
					detaformapagofactuBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detaformapagofactuBeanSwingJInternalFrame.actualizarEstadoPanelsDetaFormaPagoFactu("relacionado");
					} else {
						detaformapagofactuBeanSwingJInternalFrame.actualizarEstadoPanelsDetaFormaPagoFactu("no_relacionado");
					}

					detaformapagofactuBeanSwingJInternalFrame.getjButtonRecargarInformacionDetaFormaPagoFactu().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarGrupoClienteFormaPagoBeanSwingJInternalFrame(List<TipoFormaPago> tipoformapagos,TipoFormaPago tipoformapago,GrupoClienteFormaPagoBeanSwingJInternalFrame grupoclienteformapagoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//grupoclienteformapagoBeanSwingJInternalFrame=new GrupoClienteFormaPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					grupoclienteformapagoBeanSwingJInternalFrame.getGrupoClienteFormaPagoLogic().setConnexion(this.tipoformapagoLogic.getConnexion());

					grupoclienteformapagoBeanSwingJInternalFrame.settipoformapagosForeignKey(tipoformapagos);
					grupoclienteformapagoBeanSwingJInternalFrame.settipoformapagoForeignKey(tipoformapago);
					grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoSessionBean.setisBusquedaDesdeForeignKeySesionTipoFormaPago(true);
					grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoSessionBean.setlidTipoFormaPagoActual(tipoformapago.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					grupoclienteformapagoBeanSwingJInternalFrame.cargarCombosForeignKeyGrupoClienteFormaPago(grupoclienteformapagoBeanSwingJInternalFrame.isCargarCombosDependencia);
					grupoclienteformapagoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoFormaPago(true);
					grupoclienteformapagoBeanSwingJInternalFrame.setid_tipo_forma_pagoFK_IdTipoFormaPago(tipoformapago.getId());

					if(!this.conCargarFormDetalle) {
						grupoclienteformapagoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					grupoclienteformapagoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoFormaPagoForeignKey(tipoformapago,1,false,true,true);
					grupoclienteformapagoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					grupoclienteformapagoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoFormaPago");
					grupoclienteformapagoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoFormaPago");
					grupoclienteformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoClienteFormaPago(true);
					grupoclienteformapagoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesGrupoClienteFormaPago("n",grupoclienteformapagoBeanSwingJInternalFrame.isGuardarCambiosEnLote, grupoclienteformapagoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					grupoclienteformapagoBeanSwingJInternalFrame.setAutoscrolls(true);
					grupoclienteformapagoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						grupoclienteformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsGrupoClienteFormaPago("relacionado");
					} else {
						grupoclienteformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsGrupoClienteFormaPago("no_relacionado");
					}

					grupoclienteformapagoBeanSwingJInternalFrame.getjButtonRecargarInformacionGrupoClienteFormaPago().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetaFormaPagoBeanSwingJInternalFrame(List<TipoFormaPago> tipoformapagos,TipoFormaPago tipoformapago,DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detaformapagoBeanSwingJInternalFrame=new DetaFormaPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detaformapagoBeanSwingJInternalFrame.getDetaFormaPagoLogic().setConnexion(this.tipoformapagoLogic.getConnexion());

					detaformapagoBeanSwingJInternalFrame.settipoformapagosForeignKey(tipoformapagos);
					detaformapagoBeanSwingJInternalFrame.settipoformapagoForeignKey(tipoformapago);
					detaformapagoBeanSwingJInternalFrame.detaformapagoSessionBean.setisBusquedaDesdeForeignKeySesionTipoFormaPago(true);
					detaformapagoBeanSwingJInternalFrame.detaformapagoSessionBean.setlidTipoFormaPagoActual(tipoformapago.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detaformapagoBeanSwingJInternalFrame.cargarCombosForeignKeyDetaFormaPago(detaformapagoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detaformapagoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoFormaPago(true);
					detaformapagoBeanSwingJInternalFrame.setid_tipo_forma_pagoFK_IdTipoFormaPago(tipoformapago.getId());

					if(!this.conCargarFormDetalle) {
						detaformapagoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detaformapagoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoFormaPagoForeignKey(tipoformapago,1,false,true,true);
					detaformapagoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detaformapagoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoFormaPago");
					detaformapagoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoFormaPago");
					detaformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaFormaPago(true);
					detaformapagoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetaFormaPago("n",detaformapagoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detaformapagoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detaformapagoBeanSwingJInternalFrame.setAutoscrolls(true);
					detaformapagoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detaformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsDetaFormaPago("relacionado");
					} else {
						detaformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsDetaFormaPago("no_relacionado");
					}

					detaformapagoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetaFormaPago().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(List<TipoFormaPago> tipoformapagos,TipoFormaPago tipoformapago,FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formapagopuntoventaBeanSwingJInternalFrame.getFormaPagoPuntoVentaLogic().setConnexion(this.tipoformapagoLogic.getConnexion());

					formapagopuntoventaBeanSwingJInternalFrame.settipoformapagosForeignKey(tipoformapagos);
					formapagopuntoventaBeanSwingJInternalFrame.settipoformapagoForeignKey(tipoformapago);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTipoFormaPago(true);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setlidTipoFormaPagoActual(tipoformapago.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formapagopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyFormaPagoPuntoVenta(formapagopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formapagopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoFormaPago(true);
					formapagopuntoventaBeanSwingJInternalFrame.setid_tipo_forma_pagoFK_IdTipoFormaPago(tipoformapago.getId());

					if(!this.conCargarFormDetalle) {
						formapagopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formapagopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoFormaPagoForeignKey(tipoformapago,1,false,true,true);
					formapagopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formapagopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoFormaPago");
					formapagopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoFormaPago");
					formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(true);
					formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormaPagoPuntoVenta("n",formapagopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, formapagopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formapagopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					formapagopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("relacionado");
					} else {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("no_relacionado");
					}

					formapagopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionFormaPagoPuntoVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFormaPagoBeanSwingJInternalFrame(List<TipoFormaPago> tipoformapagos,TipoFormaPago tipoformapago,FormaPagoBeanSwingJInternalFrame formapagoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formapagoBeanSwingJInternalFrame=new FormaPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formapagoBeanSwingJInternalFrame.getFormaPagoLogic().setConnexion(this.tipoformapagoLogic.getConnexion());

					formapagoBeanSwingJInternalFrame.settipoformapagosForeignKey(tipoformapagos);
					formapagoBeanSwingJInternalFrame.settipoformapagoForeignKey(tipoformapago);
					formapagoBeanSwingJInternalFrame.formapagoSessionBean.setisBusquedaDesdeForeignKeySesionTipoFormaPago(true);
					formapagoBeanSwingJInternalFrame.formapagoSessionBean.setlidTipoFormaPagoActual(tipoformapago.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formapagoBeanSwingJInternalFrame.cargarCombosForeignKeyFormaPago(formapagoBeanSwingJInternalFrame.isCargarCombosDependencia);
					formapagoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoFormaPago(true);
					formapagoBeanSwingJInternalFrame.setid_tipo_forma_pagoFK_IdTipoFormaPago(tipoformapago.getId());

					if(!this.conCargarFormDetalle) {
						formapagoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formapagoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoFormaPagoForeignKey(tipoformapago,1,false,true,true);
					formapagoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formapagoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoFormaPago");
					formapagoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoFormaPago");
					formapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPago(true);
					formapagoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormaPago("n",formapagoBeanSwingJInternalFrame.isGuardarCambiosEnLote, formapagoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formapagoBeanSwingJInternalFrame.setAutoscrolls(true);
					formapagoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formapagoBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPago("relacionado");
					} else {
						formapagoBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPago("no_relacionado");
					}

					formapagoBeanSwingJInternalFrame.getjButtonRecargarInformacionFormaPago().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFormaPagoInvenBeanSwingJInternalFrame(List<TipoFormaPago> tipoformapagos,TipoFormaPago tipoformapago,FormaPagoInvenBeanSwingJInternalFrame formapagoinvenBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formapagoinvenBeanSwingJInternalFrame=new FormaPagoInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formapagoinvenBeanSwingJInternalFrame.getFormaPagoInvenLogic().setConnexion(this.tipoformapagoLogic.getConnexion());

					formapagoinvenBeanSwingJInternalFrame.settipoformapagosForeignKey(tipoformapagos);
					formapagoinvenBeanSwingJInternalFrame.settipoformapagoForeignKey(tipoformapago);
					formapagoinvenBeanSwingJInternalFrame.formapagoinvenSessionBean.setisBusquedaDesdeForeignKeySesionTipoFormaPago(true);
					formapagoinvenBeanSwingJInternalFrame.formapagoinvenSessionBean.setlidTipoFormaPagoActual(tipoformapago.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formapagoinvenBeanSwingJInternalFrame.cargarCombosForeignKeyFormaPagoInven(formapagoinvenBeanSwingJInternalFrame.isCargarCombosDependencia);
					formapagoinvenBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoFormaPago(true);
					formapagoinvenBeanSwingJInternalFrame.setid_tipo_forma_pagoFK_IdTipoFormaPago(tipoformapago.getId());

					if(!this.conCargarFormDetalle) {
						formapagoinvenBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formapagoinvenBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoFormaPagoForeignKey(tipoformapago,1,false,true,true);
					formapagoinvenBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formapagoinvenBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoFormaPago");
					formapagoinvenBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoFormaPago");
					formapagoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoInven(true);
					formapagoinvenBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormaPagoInven("n",formapagoinvenBeanSwingJInternalFrame.isGuardarCambiosEnLote, formapagoinvenBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formapagoinvenBeanSwingJInternalFrame.setAutoscrolls(true);
					formapagoinvenBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formapagoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoInven("relacionado");
					} else {
						formapagoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoInven("no_relacionado");
					}

					formapagoinvenBeanSwingJInternalFrame.getjButtonRecargarInformacionFormaPagoInven().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCierreCajaBeanSwingJInternalFrame(List<TipoFormaPago> tipoformapagos,TipoFormaPago tipoformapago,CierreCajaBeanSwingJInternalFrame cierrecajaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cierrecajaBeanSwingJInternalFrame=new CierreCajaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cierrecajaBeanSwingJInternalFrame.getCierreCajaLogic().setConnexion(this.tipoformapagoLogic.getConnexion());

					cierrecajaBeanSwingJInternalFrame.settipoformapagosForeignKey(tipoformapagos);
					cierrecajaBeanSwingJInternalFrame.settipoformapagoForeignKey(tipoformapago);
					cierrecajaBeanSwingJInternalFrame.cierrecajaSessionBean.setisBusquedaDesdeForeignKeySesionTipoFormaPago(true);
					cierrecajaBeanSwingJInternalFrame.cierrecajaSessionBean.setlidTipoFormaPagoActual(tipoformapago.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cierrecajaBeanSwingJInternalFrame.cargarCombosForeignKeyCierreCaja(cierrecajaBeanSwingJInternalFrame.isCargarCombosDependencia);
					cierrecajaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoFormaPago(true);
					cierrecajaBeanSwingJInternalFrame.setid_tipo_forma_pagoFK_IdTipoFormaPago(tipoformapago.getId());

					if(!this.conCargarFormDetalle) {
						cierrecajaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cierrecajaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoFormaPagoForeignKey(tipoformapago,1,false,true,true);
					cierrecajaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cierrecajaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoFormaPago");
					cierrecajaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoFormaPago");
					cierrecajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCierreCaja(true);
					cierrecajaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCierreCaja("n",cierrecajaBeanSwingJInternalFrame.isGuardarCambiosEnLote, cierrecajaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cierrecajaBeanSwingJInternalFrame.setAutoscrolls(true);
					cierrecajaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cierrecajaBeanSwingJInternalFrame.actualizarEstadoPanelsCierreCaja("relacionado");
					} else {
						cierrecajaBeanSwingJInternalFrame.actualizarEstadoPanelsCierreCaja("no_relacionado");
					}

					cierrecajaBeanSwingJInternalFrame.getjButtonRecargarInformacionCierreCaja().setVisible(false);

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
