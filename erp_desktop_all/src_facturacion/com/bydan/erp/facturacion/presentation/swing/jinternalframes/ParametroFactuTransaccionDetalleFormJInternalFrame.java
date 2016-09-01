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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.facturacion.util.ParametroFactuTransaccionConstantesFunciones;

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
public class ParametroFactuTransaccionDetalleFormJInternalFrame extends ParametroFactuTransaccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroFactuTransaccion;
	
	protected JMenuBar jmenuBarDetalleParametroFactuTransaccion;
	
	protected JMenu jmenuDetalleParametroFactuTransaccion;
	protected JMenu jmenuDetalleArchivoParametroFactuTransaccion;
	protected JMenu jmenuDetalleAccionesParametroFactuTransaccion;
	protected JMenu jmenuDetalleDatosParametroFactuTransaccion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFactuTransaccion;	
	protected GridBagConstraints gridBagConstraintsParametroFactuTransaccion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroFactuTransaccionBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroFactuTransaccion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TransaccionBeanSwingJInternalFrame transaccioninvenfacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioninvenfactura="";

	protected TransaccionBeanSwingJInternalFrame transaccioninvennotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioninvennotacredito="";

	protected TransaccionBeanSwingJInternalFrame transaccioninvennotaventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioninvennotaventa="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentacofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentacofactura="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentaconotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentaconotacredito="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentaconotaventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentaconotaventa="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentacotarjetaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentacotarjeta="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentapafacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentapafactura="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentapanotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentapanotacredito="";
	
	public ParametroFactuTransaccionSessionBean parametrofactutransaccionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TransaccionSessionBean transaccioninvenfacturaSessionBean;
	public TransaccionSessionBean transaccioninvennotacreditoSessionBean;
	public TransaccionSessionBean transaccioninvennotaventaSessionBean;
	public TransaccionSessionBean transaccioncuentacofacturaSessionBean;
	public TransaccionSessionBean transaccioncuentaconotacreditoSessionBean;
	public TransaccionSessionBean transaccioncuentaconotaventaSessionBean;
	public TransaccionSessionBean transaccioncuentacotarjetaSessionBean;
	public TransaccionSessionBean transaccioncuentapafacturaSessionBean;
	public TransaccionSessionBean transaccioncuentapanotacreditoSessionBean;	
	
	public ParametroFactuTransaccionLogic parametrofactutransaccionLogic;
	
	public JScrollPane jScrollPanelDatosParametroFactuTransaccion;
	public JScrollPane jScrollPanelDatosEdicionParametroFactuTransaccion;
	public JScrollPane jScrollPanelDatosGeneralParametroFactuTransaccion;
	
	protected JPanel jPanelCamposParametroFactuTransaccion;    
	protected JPanel jPanelCamposOcultosParametroFactuTransaccion;    	
	protected JPanel jPanelAccionesParametroFactuTransaccion;
	protected JPanel jPanelAccionesFormularioParametroFactuTransaccion;
    
	
	
	protected JTabbedPane jTabbedPaneCamposParametroFactuTransaccion;	
	protected Integer iXPanelCamposParametroFactuTransaccion=0;
	protected Integer iYPanelCamposParametroFactuTransaccion=0;
	
	protected Integer iXPanelCamposOcultosParametroFactuTransaccion=0;
	protected Integer iYPanelCamposOcultosParametroFactuTransaccion=0;
	
	

	protected JPanel jPanelCamposInicioinventarioParametroFactuTransaccion;
	protected Integer iXPanelCamposInicioinventarioParametroFactuTransaccion=0;
	protected Integer iYPanelCamposInicioinventarioParametroFactuTransaccion=0;

	protected JPanel jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion;
	protected Integer iXPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion=0;
	protected Integer iYPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion=0;

	protected JPanel jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion;
	protected Integer iXPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion=0;
	protected Integer iYPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroFactuTransaccion;
	public JButton jButtonModificarParametroFactuTransaccion;
	public JButton jButtonActualizarParametroFactuTransaccion;
    public JButton jButtonEliminarParametroFactuTransaccion;
	public JButton jButtonCancelarParametroFactuTransaccion;
    public JButton jButtonGuardarCambiosParametroFactuTransaccion;
	public JButton jButtonGuardarCambiosTablaParametroFactuTransaccion;
	protected JButton jButtonCerrarParametroFactuTransaccion;
	
	
	protected JButton jButtonProcesarInformacionParametroFactuTransaccion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroFactuTransaccion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroFactuTransaccion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroFactuTransaccion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFactuTransaccion;
	protected JButton jButtonModificarToolBarParametroFactuTransaccion;
	protected JButton jButtonActualizarToolBarParametroFactuTransaccion;
    protected JButton jButtonEliminarToolBarParametroFactuTransaccion;
	protected JButton jButtonCancelarToolBarParametroFactuTransaccion;
    protected JButton jButtonGuardarCambiosToolBarParametroFactuTransaccion;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroFactuTransaccion;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFactuTransaccion;
	protected JButton jButtonCerrarToolBarParametroFactuTransaccion;
	
	protected JButton jButtonProcesarInformacionToolBarParametroFactuTransaccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFactuTransaccion;
	protected JMenuItem jMenuItemModificarParametroFactuTransaccion;
	protected JMenuItem jMenuItemActualizarParametroFactuTransaccion;
    protected JMenuItem jMenuItemEliminarParametroFactuTransaccion;
	protected JMenuItem jMenuItemCancelarParametroFactuTransaccion;
    protected JMenuItem jMenuItemGuardarCambiosParametroFactuTransaccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFactuTransaccion;
	protected JMenuItem jMenuItemCerrarParametroFactuTransaccion;
	protected JMenuItem jMenuItemDetalleCerrarParametroFactuTransaccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFactuTransaccion;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroFactuTransaccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFactuTransaccion;
	protected JMenuItem jMenuItemMostrarOcultarParametroFactuTransaccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFactuTransaccion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFactuTransaccion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroFactuTransaccion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroFactuTransaccion;
	public JLabel jLabelIdParametroFactuTransaccion;
	public JLabel jLabelidParametroFactuTransaccion;
	public JButton jButtonidParametroFactuTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroFactuTransaccion;
	public JLabel jLabelid_empresaParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroFactuTransaccion;
	public JButton jButtonid_empresaParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_empresaParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroFactuTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroFactuTransaccion;
	public JLabel jLabelid_sucursalParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroFactuTransaccion;
	public JButton jButtonid_sucursalParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_sucursalParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroFactuTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_inven_facturaParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_inven_facturaParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion;
	public JButton jButtonid_transaccion_inven_facturaParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_inven_facturaParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_inven_facturaParametroFactuTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_inven_nota_creditoParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_inven_nota_creditoParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion;
	public JButton jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_inven_nota_ventaParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_inven_nota_ventaParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion;
	public JButton jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_cuenta_co_facturaParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_cuenta_co_facturaParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion;
	public JButton jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion;
	public JButton jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion;
	public JButton jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion;
	public JButton jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion;
	public JButton jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion;
	public JButton jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroFactuTransaccion;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroFactuTransaccionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroFactuTransaccion=new JPanel();
				this.jPanelAccionesFormularioParametroFactuTransaccion=new JPanel();
				this.jmenuBarDetalleParametroFactuTransaccion=new JMenuBar();
				this.jTtoolBarDetalleParametroFactuTransaccion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuTransaccionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroFactuTransaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroFactuTransaccionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroFactuTransaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuTransaccionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuTransaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuTransaccionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuTransaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuTransaccionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFactuTransaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroFactuTransaccion() {
		return this.jButtonActualizarToolBarParametroFactuTransaccion;
	}
	
	public JButton getjButtonEliminarToolBarParametroFactuTransaccion() {
		return this.jButtonEliminarToolBarParametroFactuTransaccion;
	}
	
	public JButton getjButtonCancelarToolBarParametroFactuTransaccion() {
		return this.jButtonCancelarToolBarParametroFactuTransaccion;
	}		
	
	public JButton getjButtonProcesarInformacionParametroFactuTransaccion() {
		return this.jButtonProcesarInformacionParametroFactuTransaccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFactuTransaccion)	{
		this.jButtonProcesarInformacionParametroFactuTransaccion = jButtonProcesarInformacionParametroFactuTransaccion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFactuTransaccion() {
		return this.jComboBoxTiposAccionesParametroFactuTransaccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFactuTransaccion(
			JComboBox jComboBoxTiposRelacionesParametroFactuTransaccion) {
		this.jComboBoxTiposRelacionesParametroFactuTransaccion = jComboBoxTiposRelacionesParametroFactuTransaccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFactuTransaccion(
			JComboBox jComboBoxTiposAccionesParametroFactuTransaccion) {
		this.jComboBoxTiposAccionesParametroFactuTransaccion = jComboBoxTiposAccionesParametroFactuTransaccion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroFactuTransaccion() {
		return this.jComboBoxTiposAccionesFormularioParametroFactuTransaccion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroFactuTransaccion(
			JComboBox jComboBoxTiposAccionesFormularioParametroFactuTransaccion) {
		this.jComboBoxTiposAccionesFormularioParametroFactuTransaccion = jComboBoxTiposAccionesFormularioParametroFactuTransaccion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrofactutransaccionSessionBean=new ParametroFactuTransaccionSessionBean();
		
		this.parametrofactutransaccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofactutransaccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFactuTransaccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFactuTransaccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFactuTransaccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Transaccion  MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroFactuTransaccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroFactuTransaccion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroFactuTransaccion=new JButtonMe();
				this.jButtonModificarToolBarParametroFactuTransaccion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroFactuTransaccion,this.jTtoolBarDetalleParametroFactuTransaccion,
							"actualizar","actualizar","Actualizar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroFactuTransaccion,this.jTtoolBarDetalleParametroFactuTransaccion,
							"eliminar","eliminar","Eliminar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroFactuTransaccion,this.jTtoolBarDetalleParametroFactuTransaccion,
							"cancelar","cancelar","Cancelar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroFactuTransaccion,this.jTtoolBarDetalleParametroFactuTransaccion,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroFactuTransaccion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroFactuTransaccion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroFactuTransaccion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroFactuTransaccion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroFactuTransaccion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFactuTransaccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFactuTransaccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFactuTransaccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroFactuTransaccion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroFactuTransaccion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroFactuTransaccion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroFactuTransaccion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroFactuTransaccion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroFactuTransaccion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroFactuTransaccion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroFactuTransaccion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroFactuTransaccion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroFactuTransaccion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroFactuTransaccion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroFactuTransaccion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroFactuTransaccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFactuTransaccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFactuTransaccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFactuTransaccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFactuTransaccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFactuTransaccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroFactuTransaccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroFactuTransaccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroFactuTransaccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFactuTransaccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFactuTransaccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFactuTransaccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFactuTransaccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFactuTransaccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFactuTransaccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroFactuTransaccion.add(this.jMenuItemDetalleCerrarParametroFactuTransaccion);
		
		this.jmenuDetalleAccionesParametroFactuTransaccion.add(this.jMenuItemActualizarParametroFactuTransaccion);
		this.jmenuDetalleAccionesParametroFactuTransaccion.add(this.jMenuItemEliminarParametroFactuTransaccion);
		this.jmenuDetalleAccionesParametroFactuTransaccion.add(this.jMenuItemCancelarParametroFactuTransaccion);		
		
		//this.jmenuDetalleDatosParametroFactuTransaccion.add(this.jMenuItemDetalleAbrirOrderByParametroFactuTransaccion);				
		this.jmenuDetalleDatosParametroFactuTransaccion.add(this.jMenuItemDetalleMostarOcultarParametroFactuTransaccion);				
				
		//this.jmenuDetalleAccionesParametroFactuTransaccion.add(this.jMenuItemGuardarCambiosParametroFactuTransaccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroFactuTransaccion.add(this.jmenuDetalleArchivoParametroFactuTransaccion);		
		this.jmenuBarDetalleParametroFactuTransaccion.add(this.jmenuDetalleAccionesParametroFactuTransaccion);		
		this.jmenuBarDetalleParametroFactuTransaccion.add(this.jmenuDetalleDatosParametroFactuTransaccion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroFactuTransaccion);				
	}
	
	
	public void inicializarElementosCamposParametroFactuTransaccion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroFactuTransaccion = new JLabelMe();
		jLabelIdParametroFactuTransaccion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroFactuTransaccion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroFactuTransaccion.setToolTipText(ParametroFactuTransaccionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroFactuTransaccion= new GridBagLayout();

		this.jPanelidParametroFactuTransaccion.setLayout(this.gridaBagLayoutParametroFactuTransaccion);

		jLabelidParametroFactuTransaccion = new JLabel();
		jLabelidParametroFactuTransaccion.setText("Id");

		jLabelidParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysParametroFactuTransaccion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroFactuTransaccion = new JLabelMe();
		this.jLabelid_empresaParametroFactuTransaccion.setText(""+ParametroFactuTransaccionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroFactuTransaccion.setToolTipText("Empresa");
		this.jLabelid_empresaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroFactuTransaccion.setToolTipText(ParametroFactuTransaccionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroFactuTransaccion = new GridBagLayout();
		this.jPanelid_empresaParametroFactuTransaccion.setLayout(this.gridaBagLayoutParametroFactuTransaccion);


		jComboBoxid_empresaParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_empresaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroFactuTransaccion.setEnabled(false);

		this.jButtonid_empresaParametroFactuTransaccion= new JButtonMe();
		this.jButtonid_empresaParametroFactuTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactuTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactuTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactuTransaccion.setText("Buscar");
		this.jButtonid_empresaParametroFactuTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroFactuTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactuTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactuTransaccion"));

		this.jButtonid_empresaParametroFactuTransaccionBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroFactuTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroFactuTransaccionBusqueda.setText("U");
		this.jButtonid_empresaParametroFactuTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroFactuTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactuTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactuTransaccionBusqueda"));

		if(this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroFactuTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroFactuTransaccionUpdate= new JButtonMe();
		this.jButtonid_empresaParametroFactuTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroFactuTransaccionUpdate.setText("U");
		this.jButtonid_empresaParametroFactuTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroFactuTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactuTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactuTransaccionUpdate"));



					
		this.jLabelid_sucursalParametroFactuTransaccion = new JLabelMe();
		this.jLabelid_sucursalParametroFactuTransaccion.setText(""+ParametroFactuTransaccionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroFactuTransaccion.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroFactuTransaccion.setToolTipText(ParametroFactuTransaccionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroFactuTransaccion = new GridBagLayout();
		this.jPanelid_sucursalParametroFactuTransaccion.setLayout(this.gridaBagLayoutParametroFactuTransaccion);


		jComboBoxid_sucursalParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_sucursalParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalParametroFactuTransaccion.setEnabled(false);

		this.jButtonid_sucursalParametroFactuTransaccion= new JButtonMe();
		this.jButtonid_sucursalParametroFactuTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactuTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactuTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactuTransaccion.setText("Buscar");
		this.jButtonid_sucursalParametroFactuTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroFactuTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactuTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactuTransaccion"));

		this.jButtonid_sucursalParametroFactuTransaccionBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroFactuTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroFactuTransaccionBusqueda.setText("U");
		this.jButtonid_sucursalParametroFactuTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroFactuTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactuTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactuTransaccionBusqueda"));

		if(this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroFactuTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroFactuTransaccionUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroFactuTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroFactuTransaccionUpdate.setText("U");
		this.jButtonid_sucursalParametroFactuTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroFactuTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactuTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactuTransaccionUpdate"));



					
		this.jLabelid_transaccion_inven_facturaParametroFactuTransaccion = new JLabelMe();
		this.jLabelid_transaccion_inven_facturaParametroFactuTransaccion.setText(""+ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONINVENFACTURA+" : *");
		this.jLabelid_transaccion_inven_facturaParametroFactuTransaccion.setToolTipText("Facturacion.");
		this.jLabelid_transaccion_inven_facturaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_inven_facturaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_inven_facturaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_inven_facturaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_inven_facturaParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_inven_facturaParametroFactuTransaccion.setToolTipText(ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONINVENFACTURA);
		this.gridaBagLayoutParametroFactuTransaccion = new GridBagLayout();
		this.jPanelid_transaccion_inven_facturaParametroFactuTransaccion.setLayout(this.gridaBagLayoutParametroFactuTransaccion);


		jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccion= new JButtonMe();
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccion.setText("Buscar");
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_inven_facturaParametroFactuTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_inven_facturaParametroFactuTransaccion"));

		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionBusqueda= new JButtonMe();
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionBusqueda.setText("U");
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_inven_facturaParametroFactuTransaccionBusqueda"));

		if(this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionUpdate= new JButtonMe();
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionUpdate.setText("U");
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_inven_facturaParametroFactuTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_inven_facturaParametroFactuTransaccionUpdate"));



					
		this.jLabelid_transaccion_inven_nota_creditoParametroFactuTransaccion = new JLabelMe();
		this.jLabelid_transaccion_inven_nota_creditoParametroFactuTransaccion.setText(""+ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONINVENNOTACREDITO+" : *");
		this.jLabelid_transaccion_inven_nota_creditoParametroFactuTransaccion.setToolTipText("Nota De Credito.");
		this.jLabelid_transaccion_inven_nota_creditoParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_inven_nota_creditoParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_inven_nota_creditoParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_inven_nota_creditoParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_inven_nota_creditoParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_inven_nota_creditoParametroFactuTransaccion.setToolTipText(ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONINVENNOTACREDITO);
		this.gridaBagLayoutParametroFactuTransaccion = new GridBagLayout();
		this.jPanelid_transaccion_inven_nota_creditoParametroFactuTransaccion.setLayout(this.gridaBagLayoutParametroFactuTransaccion);


		jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccion= new JButtonMe();
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccion.setText("Buscar");
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_inven_nota_creditoParametroFactuTransaccion"));

		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionBusqueda= new JButtonMe();
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionBusqueda.setText("U");
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_inven_nota_creditoParametroFactuTransaccionBusqueda"));

		if(this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionUpdate= new JButtonMe();
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionUpdate.setText("U");
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_inven_nota_creditoParametroFactuTransaccionUpdate"));



					
		this.jLabelid_transaccion_inven_nota_ventaParametroFactuTransaccion = new JLabelMe();
		this.jLabelid_transaccion_inven_nota_ventaParametroFactuTransaccion.setText(""+ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONINVENNOTAVENTA+" : *");
		this.jLabelid_transaccion_inven_nota_ventaParametroFactuTransaccion.setToolTipText("Nota De Venta.");
		this.jLabelid_transaccion_inven_nota_ventaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_inven_nota_ventaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_inven_nota_ventaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_inven_nota_ventaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_inven_nota_ventaParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_inven_nota_ventaParametroFactuTransaccion.setToolTipText(ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONINVENNOTAVENTA);
		this.gridaBagLayoutParametroFactuTransaccion = new GridBagLayout();
		this.jPanelid_transaccion_inven_nota_ventaParametroFactuTransaccion.setLayout(this.gridaBagLayoutParametroFactuTransaccion);


		jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccion= new JButtonMe();
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccion.setText("Buscar");
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_inven_nota_ventaParametroFactuTransaccion"));

		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionBusqueda= new JButtonMe();
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionBusqueda.setText("U");
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_inven_nota_ventaParametroFactuTransaccionBusqueda"));

		if(this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionUpdate= new JButtonMe();
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionUpdate.setText("U");
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_inven_nota_ventaParametroFactuTransaccionUpdate"));



					
		this.jLabelid_transaccion_cuenta_co_facturaParametroFactuTransaccion = new JLabelMe();
		this.jLabelid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setText(""+ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTACOFACTURA+" : *");
		this.jLabelid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setToolTipText("Facturacion");
		this.jLabelid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_co_facturaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_cuenta_co_facturaParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setToolTipText(ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTACOFACTURA);
		this.gridaBagLayoutParametroFactuTransaccion = new GridBagLayout();
		this.jPanelid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setLayout(this.gridaBagLayoutParametroFactuTransaccion);


		jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccion= new JButtonMe();
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setText("Buscar");
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_co_facturaParametroFactuTransaccion"));

		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionBusqueda= new JButtonMe();
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionBusqueda.setText("U");
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_co_facturaParametroFactuTransaccionBusqueda"));

		if(this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionUpdate= new JButtonMe();
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionUpdate.setText("U");
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_co_facturaParametroFactuTransaccionUpdate"));



					
		this.jLabelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion = new JLabelMe();
		this.jLabelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setText(""+ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTACONOTACREDITO+" : *");
		this.jLabelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setToolTipText("Nota De Credito");
		this.jLabelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setToolTipText(ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTACONOTACREDITO);
		this.gridaBagLayoutParametroFactuTransaccion = new GridBagLayout();
		this.jPanelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setLayout(this.gridaBagLayoutParametroFactuTransaccion);


		jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion= new JButtonMe();
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setText("Buscar");
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion"));

		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionBusqueda= new JButtonMe();
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionBusqueda.setText("U");
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionBusqueda"));

		if(this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionUpdate= new JButtonMe();
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionUpdate.setText("U");
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionUpdate"));



					
		this.jLabelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion = new JLabelMe();
		this.jLabelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setText(""+ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTACONOTAVENTA+" : *");
		this.jLabelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setToolTipText("Nota De Venta");
		this.jLabelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setToolTipText(ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTACONOTAVENTA);
		this.gridaBagLayoutParametroFactuTransaccion = new GridBagLayout();
		this.jPanelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setLayout(this.gridaBagLayoutParametroFactuTransaccion);


		jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion= new JButtonMe();
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setText("Buscar");
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion"));

		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionBusqueda= new JButtonMe();
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionBusqueda.setText("U");
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionBusqueda"));

		if(this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionUpdate= new JButtonMe();
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionUpdate.setText("U");
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionUpdate"));



					
		this.jLabelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion = new JLabelMe();
		this.jLabelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setText(""+ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTACOTARJETA+" : *");
		this.jLabelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setToolTipText("Tarjeta De Credito");
		this.jLabelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setToolTipText(ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTACOTARJETA);
		this.gridaBagLayoutParametroFactuTransaccion = new GridBagLayout();
		this.jPanelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setLayout(this.gridaBagLayoutParametroFactuTransaccion);


		jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion= new JButtonMe();
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setText("Buscar");
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_co_tarjetaParametroFactuTransaccion"));

		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionBusqueda= new JButtonMe();
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionBusqueda.setText("U");
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_co_tarjetaParametroFactuTransaccionBusqueda"));

		if(this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionUpdate= new JButtonMe();
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionUpdate.setText("U");
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_co_tarjetaParametroFactuTransaccionUpdate"));



					
		this.jLabelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion = new JLabelMe();
		this.jLabelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setText(""+ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTAPAFACTURA+" : *");
		this.jLabelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setToolTipText("Facturacion_");
		this.jLabelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setToolTipText(ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTAPAFACTURA);
		this.gridaBagLayoutParametroFactuTransaccion = new GridBagLayout();
		this.jPanelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setLayout(this.gridaBagLayoutParametroFactuTransaccion);


		jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccion= new JButtonMe();
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setText("Buscar");
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_pa_facturaParametroFactuTransaccion"));

		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionBusqueda= new JButtonMe();
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionBusqueda.setText("U");
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_pa_facturaParametroFactuTransaccionBusqueda"));

		if(this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionUpdate= new JButtonMe();
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionUpdate.setText("U");
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_pa_facturaParametroFactuTransaccionUpdate"));



					
		this.jLabelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion = new JLabelMe();
		this.jLabelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setText(""+ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTAPANOTACREDITO+" : *");
		this.jLabelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setToolTipText("Nota De Credito_");
		this.jLabelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setToolTipText(ParametroFactuTransaccionConstantesFunciones.LABEL_IDTRANSACCIONCUENTAPANOTACREDITO);
		this.gridaBagLayoutParametroFactuTransaccion = new GridBagLayout();
		this.jPanelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setLayout(this.gridaBagLayoutParametroFactuTransaccion);


		jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion= new JButtonMe();
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setText("Buscar");
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion"));

		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionBusqueda= new JButtonMe();
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionBusqueda.setText("U");
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionBusqueda"));

		if(this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionUpdate= new JButtonMe();
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionUpdate.setText("U");
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionUpdate"));



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
		//this.jInternalFrameDetalleParametroFactuTransaccion = new ParametroFactuTransaccionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Transaccion  DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFactuTransaccion= new GridBagLayout();
		

		
		String sToolTipParametroFactuTransaccion="";
		sToolTipParametroFactuTransaccion=ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFactuTransaccion+="(Facturacion.ParametroFactuTransaccion)";
		}
		
		if(!this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFactuTransaccion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroFactuTransaccion = new JButtonMe();
		this.jButtonModificarParametroFactuTransaccion = new JButtonMe();
        this.jButtonActualizarParametroFactuTransaccion = new JButtonMe();
        this.jButtonEliminarParametroFactuTransaccion = new JButtonMe();
        this.jButtonCancelarParametroFactuTransaccion = new JButtonMe();
        this.jButtonGuardarCambiosParametroFactuTransaccion = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroFactuTransaccion = new JButtonMe();
		this.jButtonCerrarParametroFactuTransaccion = new JButtonMe();
		
		this.jScrollPanelDatosParametroFactuTransaccion = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroFactuTransaccion = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroFactuTransaccion = new JScrollPane();
				
		
		
		this.jPanelCamposParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposParametroFactuTransaccion=new JTabbedPane();
		
		
		this.jTabbedPaneCamposParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposInicioinventarioParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Transaccion ";
		
		if(!this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Transaccion s" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFactuTransaccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroFactuTransaccion.setName("jPanelCamposParametroFactuTransaccion"); 

		this.jPanelCamposOcultosParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroFactuTransaccion.setName("jPanelCamposOcultosParametroFactuTransaccion"); 

        this.jPanelAccionesParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFactuTransaccion.setToolTipText("Acciones");
        this.jPanelAccionesParametroFactuTransaccion.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroFactuTransaccion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroFactuTransaccion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposInicioinventarioParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Inventario"));
		this.jPanelCamposInicioinventarioParametroFactuTransaccion.setName("jPanelCamposFininventarioParametroFactuTransaccion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioinventarioParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas Por Cobrar"));
		this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion.setName("jPanelCamposFincuentas_por_cobrarParametroFactuTransaccion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas Por Pagar"));
		this.jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion.setName("jPanelCamposFincuentas_por_pagarParametroFactuTransaccion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroFactuTransaccion.setText("Nuevo");
		this.jButtonModificarParametroFactuTransaccion.setText("Editar");
        this.jButtonActualizarParametroFactuTransaccion.setText("Actualizar");
        this.jButtonEliminarParametroFactuTransaccion.setText("Eliminar");
        this.jButtonCancelarParametroFactuTransaccion.setText("Cancelar");
        this.jButtonGuardarCambiosParametroFactuTransaccion.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroFactuTransaccion.setText("Guardar");
		this.jButtonCerrarParametroFactuTransaccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFactuTransaccion,"nuevo_button","Nuevo",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroFactuTransaccion,"modificar_button","Editar",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroFactuTransaccion,"actualizar_button","Actualizar",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroFactuTransaccion,"eliminar_button","Eliminar",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroFactuTransaccion,"cancelar_button","Cancelar",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroFactuTransaccion,"guardarcambios_button","Guardar",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFactuTransaccion,"guardarcambiostabla_button","Guardar",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFactuTransaccion,"cerrar_button","Salir",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroFactuTransaccion.setToolTipText("Nuevo"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroFactuTransaccion.setToolTipText("Editar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroFactuTransaccion.setToolTipText("Actualizar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroFactuTransaccion.setToolTipText("Eliminar)"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroFactuTransaccion.setToolTipText("Cancelar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroFactuTransaccion.setToolTipText("Guardar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroFactuTransaccion.setToolTipText("Guardar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFactuTransaccion.setToolTipText("Salir"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFactuTransaccion";
		inputMap = this.jButtonNuevoParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFactuTransaccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFactuTransaccion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroFactuTransaccion";
		inputMap = this.jButtonActualizarParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroFactuTransaccion"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroFactuTransaccion";
		inputMap = this.jButtonEliminarParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroFactuTransaccion"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroFactuTransaccion";
		inputMap = this.jButtonCancelarParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroFactuTransaccion"));
		
		//CERRAR		
		sMapKey = "CerrarParametroFactuTransaccion";
		inputMap = this.jButtonCerrarParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFactuTransaccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFactuTransaccion";
		inputMap = this.jButtonGuardarCambiosTablaParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFactuTransaccion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroFactuTransaccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroFactuTransaccion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroFactuTransaccion.setToolTipText("Nuevo ParametroFactuTransaccion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroFactuTransaccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroFactuTransaccion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroFactuTransaccion.setToolTipText("Sin Cerrar Ventana ParametroFactuTransaccion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroFactuTransaccion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroFactuTransaccion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroFactuTransaccion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroFactuTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFactuTransaccion.setText("Accion");
		this.jComboBoxTiposAccionesParametroFactuTransaccion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroFactuTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroFactuTransaccion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroFactuTransaccion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroFactuTransaccion = new JLabelMe();
		
		this.jLabelAccionesParametroFactuTransaccion.setText("Acciones");		
		this.jLabelAccionesParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroFactuTransaccion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroFactuTransaccion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroFactuTransaccion=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroFactuTransaccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuTransaccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuTransaccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroFactuTransaccion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFactuTransaccion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFactuTransaccion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroFactuTransaccion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroFactuTransaccion = new GridBagLayout();
		
		this.jPanelCamposParametroFactuTransaccion.setLayout(gridaBagLayoutCamposParametroFactuTransaccion);
		this.jPanelCamposOcultosParametroFactuTransaccion.setLayout(gridaBagLayoutCamposOcultosParametroFactuTransaccion);
		
		

		GridBagLayout gridaBagLayoutCamposInicioinventarioParametroFactuTransaccion= new GridBagLayout();
		this.jPanelCamposInicioinventarioParametroFactuTransaccion.setLayout(gridaBagLayoutCamposInicioinventarioParametroFactuTransaccion);

		GridBagLayout gridaBagLayoutCamposIniciocuentas_por_cobrarParametroFactuTransaccion= new GridBagLayout();
		this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion.setLayout(gridaBagLayoutCamposIniciocuentas_por_cobrarParametroFactuTransaccion);

		GridBagLayout gridaBagLayoutCamposIniciocuentas_por_pagarParametroFactuTransaccion= new GridBagLayout();
		this.jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion.setLayout(gridaBagLayoutCamposIniciocuentas_por_pagarParametroFactuTransaccion);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroFactuTransaccion.add(jLabelIdParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 1;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroFactuTransaccion.add(jLabelidParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);


	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroFactuTransaccion.add(jLabelid_empresaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 2;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroFactuTransaccion.add(jButtonid_empresaParametroFactuTransaccionBusqueda, this.gridBagConstraintsParametroFactuTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 3;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroFactuTransaccion.add(jButtonid_empresaParametroFactuTransaccionUpdate, this.gridBagConstraintsParametroFactuTransaccion);
	}

	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 1;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroFactuTransaccion.add(jComboBoxid_empresaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);


	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParametroFactuTransaccion.add(jLabelid_sucursalParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 2;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroFactuTransaccion.add(jButtonid_sucursalParametroFactuTransaccionBusqueda, this.gridBagConstraintsParametroFactuTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 3;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroFactuTransaccion.add(jButtonid_sucursalParametroFactuTransaccionUpdate, this.gridBagConstraintsParametroFactuTransaccion);
	}

	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 1;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParametroFactuTransaccion.add(jComboBoxid_sucursalParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);


	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_inven_facturaParametroFactuTransaccion.add(jLabelid_transaccion_inven_facturaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 2;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_inven_facturaParametroFactuTransaccion.add(jButtonid_transaccion_inven_facturaParametroFactuTransaccionBusqueda, this.gridBagConstraintsParametroFactuTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 3;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_inven_facturaParametroFactuTransaccion.add(jButtonid_transaccion_inven_facturaParametroFactuTransaccionUpdate, this.gridBagConstraintsParametroFactuTransaccion);
	}

	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 1;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_inven_facturaParametroFactuTransaccion.add(jComboBoxid_transaccion_inven_facturaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);


	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_inven_nota_creditoParametroFactuTransaccion.add(jLabelid_transaccion_inven_nota_creditoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 2;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_inven_nota_creditoParametroFactuTransaccion.add(jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionBusqueda, this.gridBagConstraintsParametroFactuTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 3;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_inven_nota_creditoParametroFactuTransaccion.add(jButtonid_transaccion_inven_nota_creditoParametroFactuTransaccionUpdate, this.gridBagConstraintsParametroFactuTransaccion);
	}

	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 1;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_inven_nota_creditoParametroFactuTransaccion.add(jComboBoxid_transaccion_inven_nota_creditoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);


	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_inven_nota_ventaParametroFactuTransaccion.add(jLabelid_transaccion_inven_nota_ventaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 2;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_inven_nota_ventaParametroFactuTransaccion.add(jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionBusqueda, this.gridBagConstraintsParametroFactuTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 3;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_inven_nota_ventaParametroFactuTransaccion.add(jButtonid_transaccion_inven_nota_ventaParametroFactuTransaccionUpdate, this.gridBagConstraintsParametroFactuTransaccion);
	}

	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 1;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_inven_nota_ventaParametroFactuTransaccion.add(jComboBoxid_transaccion_inven_nota_ventaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);


	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_cuenta_co_facturaParametroFactuTransaccion.add(jLabelid_transaccion_cuenta_co_facturaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 2;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_co_facturaParametroFactuTransaccion.add(jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionBusqueda, this.gridBagConstraintsParametroFactuTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 3;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_co_facturaParametroFactuTransaccion.add(jButtonid_transaccion_cuenta_co_facturaParametroFactuTransaccionUpdate, this.gridBagConstraintsParametroFactuTransaccion);
	}

	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 1;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_cuenta_co_facturaParametroFactuTransaccion.add(jComboBoxid_transaccion_cuenta_co_facturaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);


	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.add(jLabelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 2;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.add(jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionBusqueda, this.gridBagConstraintsParametroFactuTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 3;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.add(jButtonid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccionUpdate, this.gridBagConstraintsParametroFactuTransaccion);
	}

	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 1;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion.add(jComboBoxid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);


	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.add(jLabelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 2;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.add(jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionBusqueda, this.gridBagConstraintsParametroFactuTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 3;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.add(jButtonid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccionUpdate, this.gridBagConstraintsParametroFactuTransaccion);
	}

	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 1;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion.add(jComboBoxid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);


	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.add(jLabelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 2;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.add(jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionBusqueda, this.gridBagConstraintsParametroFactuTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 3;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.add(jButtonid_transaccion_cuenta_co_tarjetaParametroFactuTransaccionUpdate, this.gridBagConstraintsParametroFactuTransaccion);
	}

	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 1;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion.add(jComboBoxid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);


	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.add(jLabelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 2;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.add(jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionBusqueda, this.gridBagConstraintsParametroFactuTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 3;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.add(jButtonid_transaccion_cuenta_pa_facturaParametroFactuTransaccionUpdate, this.gridBagConstraintsParametroFactuTransaccion);
	}

	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 1;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion.add(jComboBoxid_transaccion_cuenta_pa_facturaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);


	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.add(jLabelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 2;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.add(jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionBusqueda, this.gridBagConstraintsParametroFactuTransaccion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 3;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
		this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.add(jButtonid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccionUpdate, this.gridBagConstraintsParametroFactuTransaccion);
	}

	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = 1;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion.add(jComboBoxid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = iYPanelCamposOcultosParametroFactuTransaccion;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = iXPanelCamposOcultosParametroFactuTransaccion++;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroFactuTransaccion.add(this.jPanelid_empresaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(iXPanelCamposOcultosParametroFactuTransaccion % 1==0) {
		iXPanelCamposOcultosParametroFactuTransaccion=0;
		iYPanelCamposOcultosParametroFactuTransaccion++;
	}
	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = iYPanelCamposOcultosParametroFactuTransaccion;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = iXPanelCamposOcultosParametroFactuTransaccion++;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroFactuTransaccion.add(this.jPanelid_sucursalParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(iXPanelCamposOcultosParametroFactuTransaccion % 1==0) {
		iXPanelCamposOcultosParametroFactuTransaccion=0;
		iYPanelCamposOcultosParametroFactuTransaccion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = iYPanelCamposInicioinventarioParametroFactuTransaccion;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = iXPanelCamposInicioinventarioParametroFactuTransaccion++;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioinventarioParametroFactuTransaccion.add(this.jPanelidParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(iXPanelCamposInicioinventarioParametroFactuTransaccion % 1==0) {
		iXPanelCamposInicioinventarioParametroFactuTransaccion=0;
		iYPanelCamposInicioinventarioParametroFactuTransaccion++;
	}
	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = iYPanelCamposInicioinventarioParametroFactuTransaccion;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = iXPanelCamposInicioinventarioParametroFactuTransaccion++;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioinventarioParametroFactuTransaccion.add(this.jPanelid_transaccion_inven_facturaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(iXPanelCamposInicioinventarioParametroFactuTransaccion % 1==0) {
		iXPanelCamposInicioinventarioParametroFactuTransaccion=0;
		iYPanelCamposInicioinventarioParametroFactuTransaccion++;
	}
	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = iYPanelCamposInicioinventarioParametroFactuTransaccion;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = iXPanelCamposInicioinventarioParametroFactuTransaccion++;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioinventarioParametroFactuTransaccion.add(this.jPanelid_transaccion_inven_nota_creditoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(iXPanelCamposInicioinventarioParametroFactuTransaccion % 1==0) {
		iXPanelCamposInicioinventarioParametroFactuTransaccion=0;
		iYPanelCamposInicioinventarioParametroFactuTransaccion++;
	}
	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = iYPanelCamposInicioinventarioParametroFactuTransaccion;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = iXPanelCamposInicioinventarioParametroFactuTransaccion++;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioinventarioParametroFactuTransaccion.add(this.jPanelid_transaccion_inven_nota_ventaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(iXPanelCamposInicioinventarioParametroFactuTransaccion % 1==0) {
		iXPanelCamposInicioinventarioParametroFactuTransaccion=0;
		iYPanelCamposInicioinventarioParametroFactuTransaccion++;
	}
	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = iYPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = iXPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion++;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion.add(this.jPanelid_transaccion_cuenta_co_facturaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(iXPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion % 1==0) {
		iXPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion=0;
		iYPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion++;
	}
	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = iYPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = iXPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion++;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion.add(this.jPanelid_transaccion_cuenta_co_nota_creditoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(iXPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion % 1==0) {
		iXPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion=0;
		iYPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion++;
	}
	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = iYPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = iXPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion++;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion.add(this.jPanelid_transaccion_cuenta_co_nota_ventaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(iXPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion % 1==0) {
		iXPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion=0;
		iYPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion++;
	}
	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = iYPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = iXPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion++;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion.add(this.jPanelid_transaccion_cuenta_co_tarjetaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(iXPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion % 1==0) {
		iXPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion=0;
		iYPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion++;
	}
	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = iYPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = iXPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion++;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion.add(this.jPanelid_transaccion_cuenta_pa_facturaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(iXPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion % 1==0) {
		iXPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion=0;
		iYPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion++;
	}
	this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuTransaccion.gridy = iYPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion;
	this.gridBagConstraintsParametroFactuTransaccion.gridx = iXPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion++;
	this.gridBagConstraintsParametroFactuTransaccion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuTransaccion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion.add(this.jPanelid_transaccion_cuenta_pa_nota_creditoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);



	if(iXPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion % 1==0) {
		iXPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion=0;
		iYPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroFactuTransaccion= new GridBagLayout();
		this.jPanelAccionesParametroFactuTransaccion.setLayout(gridaBagLayoutAccionesParametroFactuTransaccion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroFactuTransaccion= new GridBagLayout();
		this.jPanelAccionesFormularioParametroFactuTransaccion.setLayout(gridaBagLayoutAccionesFormularioParametroFactuTransaccion);
		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFactuTransaccion.add(this.jComboBoxTiposAccionesFormularioParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFactuTransaccion.add(this.jCheckBoxPostAccionNuevoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrofactutransaccionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFactuTransaccion.add(this.jCheckBoxPostAccionSinCerrarParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrofactutransaccionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFactuTransaccion.add(this.jCheckBoxPostAccionSinMensajeParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroFactuTransaccion.add(this.jButtonModificarParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);							

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroFactuTransaccion.add(this.jButtonEliminarParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		
			
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFactuTransaccion.add(this.jButtonActualizarParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);


		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFactuTransaccion.add(this.jButtonGuardarCambiosParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);	
		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroFactuTransaccion.add(this.jButtonCancelarParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFactuTransaccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFactuTransaccion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();						
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;		
			//this.gridBagConstraintsParametroFactuTransaccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFactuTransaccion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFactuTransaccion.gridx =0;
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFactuTransaccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroFactuTransaccionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroFactuTransaccion = new ParametroFactuTransaccionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Transaccion  DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Transaccion  DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Transaccion  Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroFactuTransaccionModel parametrofactutransaccionModel=new ParametroFactuTransaccionModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroFactuTransaccionModel.ParametroFactuTransaccionFocusTraversalPolicy parametrofactutransaccionFocusTraversalPolicy = parametrofactutransaccionModel.new ParametroFactuTransaccionFocusTraversalPolicy(this);
			
			//parametrofactutransaccionFocusTraversalPolicy.setparametrofactutransaccionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrofactutransaccionModel);
			
			
			this.jContentPaneDetalleParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroFactuTransaccion = new GridBagLayout();	
			this.jContentPaneDetalleParametroFactuTransaccion.setLayout(gridaBagLayoutDetalleParametroFactuTransaccion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFactuTransaccion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
				this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
					
				
				this.jContentPaneDetalleParametroFactuTransaccion.add(jTtoolBarDetalleParametroFactuTransaccion, gridBagConstraintsParametroFactuTransaccion);								
				
}
			
			this.jScrollPanelDatosEdicionParametroFactuTransaccion=   new JScrollPane(jContentPaneDetalleParametroFactuTransaccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFactuTransaccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuTransaccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuTransaccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroFactuTransaccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFactuTransaccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuTransaccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuTransaccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposParametroFactuTransaccion.add("Inventario",this.jPanelCamposInicioinventarioParametroFactuTransaccion);
		this.jTabbedPaneCamposParametroFactuTransaccion.add("Cuentas Por Cobrar",this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion);
		this.jTabbedPaneCamposParametroFactuTransaccion.add("Cuentas Por Pagar",this.jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion);
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
						
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	        
			this.jContentPaneDetalleParametroFactuTransaccion.add(jTabbedPaneCamposParametroFactuTransaccion, gridBagConstraintsParametroFactuTransaccion);
			
			
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
						&& parametrofactutransaccionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrofactutransaccionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroFactuTransaccion= new GridBagConstraints();
						this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
						this.jContentPaneDetalleParametroFactuTransaccion.add(this.jTabbedPaneRelacionesParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroFactuTransaccion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroFactuTransaccion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
					this.gridBagConstraintsParametroFactuTransaccion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
					
				
					this.jContentPaneDetalleParametroFactuTransaccion.add(jPanelCamposOcultosParametroFactuTransaccion, gridBagConstraintsParametroFactuTransaccion);
				
					this.jPanelCamposOcultosParametroFactuTransaccion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	        this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroFactuTransaccion.add(this.jPanelAccionesFormularioParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);							
			
			
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
	        this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroFactuTransaccion.add(this.jPanelAccionesParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroFactuTransaccion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroFactuTransaccion=   new JScrollPane(this.jPanelCamposParametroFactuTransaccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFactuTransaccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuTransaccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuTransaccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroFactuTransaccion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);			
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
			
			
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		
			
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroFactuTransaccion;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroFactuTransaccion;
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
