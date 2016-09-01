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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.ProductoCuentaContableConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class ProductoCuentaContableDetalleFormJInternalFrame extends ProductoCuentaContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoCuentaContable;
	
	protected JMenuBar jmenuBarDetalleProductoCuentaContable;
	
	protected JMenu jmenuDetalleProductoCuentaContable;
	protected JMenu jmenuDetalleArchivoProductoCuentaContable;
	protected JMenu jmenuDetalleAccionesProductoCuentaContable;
	protected JMenu jmenuDetalleDatosProductoCuentaContable;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoCuentaContable;	
	protected GridBagConstraints gridBagConstraintsProductoCuentaContable;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoCuentaContableBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoCuentaContable;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinventario="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecosto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledescuentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledescuento="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledevolucionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledevolucion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public ProductoCuentaContableSessionBean productocuentacontableSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CuentaContableSessionBean cuentacontableinventarioSessionBean;
	public CuentaContableSessionBean cuentacontablecostoSessionBean;
	public CuentaContableSessionBean cuentacontableventaSessionBean;
	public CuentaContableSessionBean cuentacontabledescuentoSessionBean;
	public CuentaContableSessionBean cuentacontabledevolucionSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;	
	
	public ProductoCuentaContableLogic productocuentacontableLogic;
	
	public JScrollPane jScrollPanelDatosProductoCuentaContable;
	public JScrollPane jScrollPanelDatosEdicionProductoCuentaContable;
	public JScrollPane jScrollPanelDatosGeneralProductoCuentaContable;
	
	protected JPanel jPanelCamposProductoCuentaContable;    
	protected JPanel jPanelCamposOcultosProductoCuentaContable;    	
	protected JPanel jPanelAccionesProductoCuentaContable;
	protected JPanel jPanelAccionesFormularioProductoCuentaContable;
    
	
	
	protected Integer iXPanelCamposProductoCuentaContable=0;
	protected Integer iYPanelCamposProductoCuentaContable=0;
	
	protected Integer iXPanelCamposOcultosProductoCuentaContable=0;
	protected Integer iYPanelCamposOcultosProductoCuentaContable=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoCuentaContable;
	public JButton jButtonModificarProductoCuentaContable;
	public JButton jButtonActualizarProductoCuentaContable;
    public JButton jButtonEliminarProductoCuentaContable;
	public JButton jButtonCancelarProductoCuentaContable;
    public JButton jButtonGuardarCambiosProductoCuentaContable;
	public JButton jButtonGuardarCambiosTablaProductoCuentaContable;
	protected JButton jButtonCerrarProductoCuentaContable;
	
	
	protected JButton jButtonProcesarInformacionProductoCuentaContable;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoCuentaContable;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoCuentaContable;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoCuentaContable;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoCuentaContable;
	protected JButton jButtonModificarToolBarProductoCuentaContable;
	protected JButton jButtonActualizarToolBarProductoCuentaContable;
    protected JButton jButtonEliminarToolBarProductoCuentaContable;
	protected JButton jButtonCancelarToolBarProductoCuentaContable;
    protected JButton jButtonGuardarCambiosToolBarProductoCuentaContable;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoCuentaContable;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoCuentaContable;
	protected JButton jButtonCerrarToolBarProductoCuentaContable;
	
	protected JButton jButtonProcesarInformacionToolBarProductoCuentaContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoCuentaContable;
	protected JMenuItem jMenuItemModificarProductoCuentaContable;
	protected JMenuItem jMenuItemActualizarProductoCuentaContable;
    protected JMenuItem jMenuItemEliminarProductoCuentaContable;
	protected JMenuItem jMenuItemCancelarProductoCuentaContable;
    protected JMenuItem jMenuItemGuardarCambiosProductoCuentaContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoCuentaContable;
	protected JMenuItem jMenuItemCerrarProductoCuentaContable;
	protected JMenuItem jMenuItemDetalleCerrarProductoCuentaContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoCuentaContable;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoCuentaContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoCuentaContable;
	protected JMenuItem jMenuItemMostrarOcultarProductoCuentaContable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoCuentaContable;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoCuentaContable;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoCuentaContable;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoCuentaContable;
	public JLabel jLabelIdProductoCuentaContable;
	public JLabel jLabelidProductoCuentaContable;
	public JButton jButtonidProductoCuentaContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProductoCuentaContable;
	public JLabel jLabelid_empresaProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProductoCuentaContable;
	public JButton jButtonid_empresaProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_empresaProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_empresaProductoCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProductoCuentaContable;
	public JLabel jLabelid_sucursalProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProductoCuentaContable;
	public JButton jButtonid_sucursalProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_sucursalProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProductoCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaProductoCuentaContable;
	public JLabel jLabelid_bodegaProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaProductoCuentaContable;
	public JButton jButtonid_bodegaProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_bodegaProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_bodegaProductoCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelid_productoProductoCuentaContable;
	public JLabel jLabelid_productoProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoProductoCuentaContable;
	public JButton jButtonid_productoProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_productoProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_productoProductoCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoProductoCuentaContable;
	public JLabel jLabelid_centro_costoProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoProductoCuentaContable;
	public JButton jButtonid_centro_costoProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_centro_costoProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoProductoCuentaContableArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_inventarioProductoCuentaContable;
	public JLabel jLabelid_cuenta_contable_inventarioProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_inventarioProductoCuentaContable;
	public JButton jButtonid_cuenta_contable_inventarioProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioProductoCuentaContableArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_costoProductoCuentaContable;
	public JLabel jLabelid_cuenta_contable_costoProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costoProductoCuentaContable;
	public JButton jButtonid_cuenta_contable_costoProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoProductoCuentaContableArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_ventaProductoCuentaContable;
	public JLabel jLabelid_cuenta_contable_ventaProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ventaProductoCuentaContable;
	public JButton jButtonid_cuenta_contable_ventaProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaProductoCuentaContableArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_descuentoProductoCuentaContable;
	public JLabel jLabelid_cuenta_contable_descuentoProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_descuentoProductoCuentaContable;
	public JButton jButtonid_cuenta_contable_descuentoProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoProductoCuentaContableArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_devolucionProductoCuentaContable;
	public JLabel jLabelid_cuenta_contable_devolucionProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_devolucionProductoCuentaContable;
	public JButton jButtonid_cuenta_contable_devolucionProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionProductoCuentaContableArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_debitoProductoCuentaContable;
	public JLabel jLabelid_cuenta_contable_debitoProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoProductoCuentaContable;
	public JButton jButtonid_cuenta_contable_debitoProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoProductoCuentaContableArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoProductoCuentaContable;
	public JLabel jLabelid_cuenta_contable_creditoProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoProductoCuentaContable;
	public JButton jButtonid_cuenta_contable_creditoProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoProductoCuentaContableArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoCuentaContable;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProductoCuentaContableDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoCuentaContable=new JPanel();
				this.jPanelAccionesFormularioProductoCuentaContable=new JPanel();
				this.jmenuBarDetalleProductoCuentaContable=new JMenuBar();
				this.jTtoolBarDetalleProductoCuentaContable=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoCuentaContableDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoCuentaContableDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoCuentaContableDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoCuentaContableDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoCuentaContableDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoCuentaContable() {
		return this.jButtonActualizarToolBarProductoCuentaContable;
	}
	
	public JButton getjButtonEliminarToolBarProductoCuentaContable() {
		return this.jButtonEliminarToolBarProductoCuentaContable;
	}
	
	public JButton getjButtonCancelarToolBarProductoCuentaContable() {
		return this.jButtonCancelarToolBarProductoCuentaContable;
	}		
	
	public JButton getjButtonProcesarInformacionProductoCuentaContable() {
		return this.jButtonProcesarInformacionProductoCuentaContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoCuentaContable)	{
		this.jButtonProcesarInformacionProductoCuentaContable = jButtonProcesarInformacionProductoCuentaContable;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoCuentaContable() {
		return this.jComboBoxTiposAccionesProductoCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoCuentaContable(
			JComboBox jComboBoxTiposRelacionesProductoCuentaContable) {
		this.jComboBoxTiposRelacionesProductoCuentaContable = jComboBoxTiposRelacionesProductoCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoCuentaContable(
			JComboBox jComboBoxTiposAccionesProductoCuentaContable) {
		this.jComboBoxTiposAccionesProductoCuentaContable = jComboBoxTiposAccionesProductoCuentaContable;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoCuentaContable() {
		return this.jComboBoxTiposAccionesFormularioProductoCuentaContable;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoCuentaContable(
			JComboBox jComboBoxTiposAccionesFormularioProductoCuentaContable) {
		this.jComboBoxTiposAccionesFormularioProductoCuentaContable = jComboBoxTiposAccionesFormularioProductoCuentaContable;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productocuentacontableSessionBean=new ProductoCuentaContableSessionBean();
		
		this.productocuentacontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productocuentacontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productocuentacontableSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoCuentaContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Cuenta Contable MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productocuentacontableSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoCuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoCuentaContable= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoCuentaContable=new JButtonMe();
				this.jButtonModificarToolBarProductoCuentaContable=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoCuentaContable,this.jTtoolBarDetalleProductoCuentaContable,
							"actualizar","actualizar","Actualizar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoCuentaContable,this.jTtoolBarDetalleProductoCuentaContable,
							"eliminar","eliminar","Eliminar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoCuentaContable,this.jTtoolBarDetalleProductoCuentaContable,
							"cancelar","cancelar","Cancelar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoCuentaContable,this.jTtoolBarDetalleProductoCuentaContable,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoCuentaContable=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoCuentaContable=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoCuentaContable=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoCuentaContable=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoCuentaContable=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoCuentaContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoCuentaContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoCuentaContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoCuentaContable= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoCuentaContable.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoCuentaContable,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoCuentaContable= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoCuentaContable.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoCuentaContable,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoCuentaContable= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoCuentaContable.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoCuentaContable,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoCuentaContable= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoCuentaContable.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoCuentaContable,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoCuentaContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoCuentaContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoCuentaContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoCuentaContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoCuentaContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoCuentaContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoCuentaContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoCuentaContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoCuentaContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoCuentaContable.add(this.jMenuItemDetalleCerrarProductoCuentaContable);
		
		this.jmenuDetalleAccionesProductoCuentaContable.add(this.jMenuItemActualizarProductoCuentaContable);
		this.jmenuDetalleAccionesProductoCuentaContable.add(this.jMenuItemEliminarProductoCuentaContable);
		this.jmenuDetalleAccionesProductoCuentaContable.add(this.jMenuItemCancelarProductoCuentaContable);		
		
		//this.jmenuDetalleDatosProductoCuentaContable.add(this.jMenuItemDetalleAbrirOrderByProductoCuentaContable);				
		this.jmenuDetalleDatosProductoCuentaContable.add(this.jMenuItemDetalleMostarOcultarProductoCuentaContable);				
				
		//this.jmenuDetalleAccionesProductoCuentaContable.add(this.jMenuItemGuardarCambiosProductoCuentaContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoCuentaContable.add(this.jmenuDetalleArchivoProductoCuentaContable);		
		this.jmenuBarDetalleProductoCuentaContable.add(this.jmenuDetalleAccionesProductoCuentaContable);		
		this.jmenuBarDetalleProductoCuentaContable.add(this.jmenuDetalleDatosProductoCuentaContable);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoCuentaContable);				
	}
	
	
	public void inicializarElementosCamposProductoCuentaContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoCuentaContable = new JLabelMe();
		jLabelIdProductoCuentaContable.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoCuentaContable = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoCuentaContable.setToolTipText(ProductoCuentaContableConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoCuentaContable= new GridBagLayout();

		this.jPanelidProductoCuentaContable.setLayout(this.gridaBagLayoutProductoCuentaContable);

		jLabelidProductoCuentaContable = new JLabel();
		jLabelidProductoCuentaContable.setText("Id");

		jLabelidProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysProductoCuentaContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProductoCuentaContable = new JLabelMe();
		this.jLabelid_empresaProductoCuentaContable.setText(""+ProductoCuentaContableConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProductoCuentaContable.setToolTipText("Empresa");
		this.jLabelid_empresaProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProductoCuentaContable.setToolTipText(ProductoCuentaContableConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProductoCuentaContable = new GridBagLayout();
		this.jPanelid_empresaProductoCuentaContable.setLayout(this.gridaBagLayoutProductoCuentaContable);


		jComboBoxid_empresaProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_empresaProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProductoCuentaContable.setEnabled(false);

		this.jButtonid_empresaProductoCuentaContable= new JButtonMe();
		this.jButtonid_empresaProductoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProductoCuentaContable.setText("Buscar");
		this.jButtonid_empresaProductoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProductoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoCuentaContable"));

		this.jButtonid_empresaProductoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_empresaProductoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoCuentaContableBusqueda.setText("U");
		this.jButtonid_empresaProductoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProductoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoCuentaContableBusqueda"));

		if(this.productocuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProductoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_empresaProductoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_empresaProductoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProductoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProductoCuentaContableUpdate.setText("U");
		this.jButtonid_empresaProductoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProductoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProductoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProductoCuentaContableUpdate"));



					
		this.jLabelid_sucursalProductoCuentaContable = new JLabelMe();
		this.jLabelid_sucursalProductoCuentaContable.setText(""+ProductoCuentaContableConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProductoCuentaContable.setToolTipText("Sucursal");
		this.jLabelid_sucursalProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProductoCuentaContable.setToolTipText(ProductoCuentaContableConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProductoCuentaContable = new GridBagLayout();
		this.jPanelid_sucursalProductoCuentaContable.setLayout(this.gridaBagLayoutProductoCuentaContable);


		jComboBoxid_sucursalProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_sucursalProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProductoCuentaContable.setEnabled(false);

		this.jButtonid_sucursalProductoCuentaContable= new JButtonMe();
		this.jButtonid_sucursalProductoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProductoCuentaContable.setText("Buscar");
		this.jButtonid_sucursalProductoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProductoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoCuentaContable"));

		this.jButtonid_sucursalProductoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_sucursalProductoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoCuentaContableBusqueda.setText("U");
		this.jButtonid_sucursalProductoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProductoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoCuentaContableBusqueda"));

		if(this.productocuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProductoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProductoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_sucursalProductoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProductoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProductoCuentaContableUpdate.setText("U");
		this.jButtonid_sucursalProductoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProductoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProductoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProductoCuentaContableUpdate"));



					
		this.jLabelid_bodegaProductoCuentaContable = new JLabelMe();
		this.jLabelid_bodegaProductoCuentaContable.setText(""+ProductoCuentaContableConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaProductoCuentaContable.setToolTipText("Bodega");
		this.jLabelid_bodegaProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaProductoCuentaContable.setToolTipText(ProductoCuentaContableConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutProductoCuentaContable = new GridBagLayout();
		this.jPanelid_bodegaProductoCuentaContable.setLayout(this.gridaBagLayoutProductoCuentaContable);


		jComboBoxid_bodegaProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_bodegaProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaProductoCuentaContable= new JButtonMe();
		this.jButtonid_bodegaProductoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaProductoCuentaContable.setText("Buscar");
		this.jButtonid_bodegaProductoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaProductoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoCuentaContable"));

		this.jButtonid_bodegaProductoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_bodegaProductoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoCuentaContableBusqueda.setText("U");
		this.jButtonid_bodegaProductoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaProductoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoCuentaContableBusqueda"));

		if(this.productocuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaProductoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_bodegaProductoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_bodegaProductoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaProductoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaProductoCuentaContableUpdate.setText("U");
		this.jButtonid_bodegaProductoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaProductoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaProductoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaProductoCuentaContableUpdate"));



					
		this.jLabelid_productoProductoCuentaContable = new JLabelMe();
		this.jLabelid_productoProductoCuentaContable.setText(""+ProductoCuentaContableConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoProductoCuentaContable.setToolTipText("Producto");
		this.jLabelid_productoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoProductoCuentaContable.setToolTipText(ProductoCuentaContableConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutProductoCuentaContable = new GridBagLayout();
		this.jPanelid_productoProductoCuentaContable.setLayout(this.gridaBagLayoutProductoCuentaContable);


		jComboBoxid_productoProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_productoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoProductoCuentaContable= new JButtonMe();
		this.jButtonid_productoProductoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoProductoCuentaContable.setText("Buscar");
		this.jButtonid_productoProductoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoProductoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoCuentaContable"));

		this.jButtonid_productoProductoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_productoProductoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoCuentaContableBusqueda.setText("U");
		this.jButtonid_productoProductoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoProductoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoCuentaContableBusqueda"));

		if(this.productocuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoProductoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_productoProductoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_productoProductoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoProductoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoProductoCuentaContableUpdate.setText("U");
		this.jButtonid_productoProductoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoProductoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoProductoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoProductoCuentaContableUpdate"));



					
		this.jLabelid_centro_costoProductoCuentaContable = new JLabelMe();
		this.jLabelid_centro_costoProductoCuentaContable.setText(""+ProductoCuentaContableConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoProductoCuentaContable.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoProductoCuentaContable.setToolTipText(ProductoCuentaContableConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutProductoCuentaContable = new GridBagLayout();
		this.jPanelid_centro_costoProductoCuentaContable.setLayout(this.gridaBagLayoutProductoCuentaContable);


		jComboBoxid_centro_costoProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_centro_costoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoProductoCuentaContable= new JButtonMe();
		this.jButtonid_centro_costoProductoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoProductoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoProductoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoProductoCuentaContable.setText("Buscar");
		this.jButtonid_centro_costoProductoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoProductoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoProductoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoProductoCuentaContable"));

		this.jButtonid_centro_costoProductoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_centro_costoProductoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoProductoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoProductoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoProductoCuentaContableBusqueda.setText("U");
		this.jButtonid_centro_costoProductoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoProductoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoProductoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoProductoCuentaContableBusqueda"));

		if(this.productocuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoProductoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoProductoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_centro_costoProductoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoProductoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoProductoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoProductoCuentaContableUpdate.setText("U");
		this.jButtonid_centro_costoProductoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoProductoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoProductoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoProductoCuentaContableUpdate"));


		jButtonid_centro_costoProductoCuentaContableArbol= new JButtonMe();
		jButtonid_centro_costoProductoCuentaContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoProductoCuentaContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoProductoCuentaContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoProductoCuentaContableArbol.setText("Arbol");
		jButtonid_centro_costoProductoCuentaContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoProductoCuentaContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoProductoCuentaContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoProductoCuentaContableArbol"));



					
		this.jLabelid_cuenta_contable_inventarioProductoCuentaContable = new JLabelMe();
		this.jLabelid_cuenta_contable_inventarioProductoCuentaContable.setText(""+ProductoCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO+" : *");
		this.jLabelid_cuenta_contable_inventarioProductoCuentaContable.setToolTipText("Cuenta Contable Inventario");
		this.jLabelid_cuenta_contable_inventarioProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventarioProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventarioProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_inventarioProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_inventarioProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_inventarioProductoCuentaContable.setToolTipText(ProductoCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO);
		this.gridaBagLayoutProductoCuentaContable = new GridBagLayout();
		this.jPanelid_cuenta_contable_inventarioProductoCuentaContable.setLayout(this.gridaBagLayoutProductoCuentaContable);


		jComboBoxid_cuenta_contable_inventarioProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_inventarioProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_inventarioProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_inventarioProductoCuentaContable= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContable.setText("Buscar");
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioProductoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_inventarioProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioProductoCuentaContable"));

		this.jButtonid_cuenta_contable_inventarioProductoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventarioProductoCuentaContableBusqueda.setText("U");
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioProductoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_inventarioProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioProductoCuentaContableBusqueda"));

		if(this.productocuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_inventarioProductoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventarioProductoCuentaContableUpdate.setText("U");
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_inventarioProductoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioProductoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_inventarioProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioProductoCuentaContableUpdate"));


		jButtonid_cuenta_contable_inventarioProductoCuentaContableArbol= new JButtonMe();
		jButtonid_cuenta_contable_inventarioProductoCuentaContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioProductoCuentaContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioProductoCuentaContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioProductoCuentaContableArbol.setText("Arbol");
		jButtonid_cuenta_contable_inventarioProductoCuentaContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_inventarioProductoCuentaContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioProductoCuentaContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_inventarioProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioProductoCuentaContableArbol"));



					
		this.jLabelid_cuenta_contable_costoProductoCuentaContable = new JLabelMe();
		this.jLabelid_cuenta_contable_costoProductoCuentaContable.setText(""+ProductoCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO+" : *");
		this.jLabelid_cuenta_contable_costoProductoCuentaContable.setToolTipText("Cuenta Contable Costo");
		this.jLabelid_cuenta_contable_costoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_costoProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_costoProductoCuentaContable.setToolTipText(ProductoCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO);
		this.gridaBagLayoutProductoCuentaContable = new GridBagLayout();
		this.jPanelid_cuenta_contable_costoProductoCuentaContable.setLayout(this.gridaBagLayoutProductoCuentaContable);


		jComboBoxid_cuenta_contable_costoProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_costoProductoCuentaContable= new JButtonMe();
		this.jButtonid_cuenta_contable_costoProductoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoProductoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoProductoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoProductoCuentaContable.setText("Buscar");
		this.jButtonid_cuenta_contable_costoProductoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_costoProductoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoProductoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_costoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoProductoCuentaContable"));

		this.jButtonid_cuenta_contable_costoProductoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_costoProductoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoProductoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoProductoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costoProductoCuentaContableBusqueda.setText("U");
		this.jButtonid_cuenta_contable_costoProductoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_costoProductoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoProductoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_costoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoProductoCuentaContableBusqueda"));

		if(this.productocuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_costoProductoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_costoProductoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_costoProductoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoProductoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoProductoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costoProductoCuentaContableUpdate.setText("U");
		this.jButtonid_cuenta_contable_costoProductoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_costoProductoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoProductoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_costoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoProductoCuentaContableUpdate"));


		jButtonid_cuenta_contable_costoProductoCuentaContableArbol= new JButtonMe();
		jButtonid_cuenta_contable_costoProductoCuentaContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoProductoCuentaContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoProductoCuentaContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoProductoCuentaContableArbol.setText("Arbol");
		jButtonid_cuenta_contable_costoProductoCuentaContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_costoProductoCuentaContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoProductoCuentaContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_costoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoProductoCuentaContableArbol"));



					
		this.jLabelid_cuenta_contable_ventaProductoCuentaContable = new JLabelMe();
		this.jLabelid_cuenta_contable_ventaProductoCuentaContable.setText(""+ProductoCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA+" : *");
		this.jLabelid_cuenta_contable_ventaProductoCuentaContable.setToolTipText("Cuenta Contable Venta");
		this.jLabelid_cuenta_contable_ventaProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_ventaProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_ventaProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ventaProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_ventaProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_ventaProductoCuentaContable.setToolTipText(ProductoCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA);
		this.gridaBagLayoutProductoCuentaContable = new GridBagLayout();
		this.jPanelid_cuenta_contable_ventaProductoCuentaContable.setLayout(this.gridaBagLayoutProductoCuentaContable);


		jComboBoxid_cuenta_contable_ventaProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ventaProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ventaProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_ventaProductoCuentaContable= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaProductoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaProductoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaProductoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaProductoCuentaContable.setText("Buscar");
		this.jButtonid_cuenta_contable_ventaProductoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_ventaProductoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaProductoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_ventaProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaProductoCuentaContable"));

		this.jButtonid_cuenta_contable_ventaProductoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaProductoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaProductoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaProductoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ventaProductoCuentaContableBusqueda.setText("U");
		this.jButtonid_cuenta_contable_ventaProductoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_ventaProductoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaProductoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_ventaProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaProductoCuentaContableBusqueda"));

		if(this.productocuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_ventaProductoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_ventaProductoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaProductoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaProductoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaProductoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ventaProductoCuentaContableUpdate.setText("U");
		this.jButtonid_cuenta_contable_ventaProductoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_ventaProductoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaProductoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_ventaProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaProductoCuentaContableUpdate"));


		jButtonid_cuenta_contable_ventaProductoCuentaContableArbol= new JButtonMe();
		jButtonid_cuenta_contable_ventaProductoCuentaContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaProductoCuentaContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaProductoCuentaContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaProductoCuentaContableArbol.setText("Arbol");
		jButtonid_cuenta_contable_ventaProductoCuentaContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_ventaProductoCuentaContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaProductoCuentaContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_ventaProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaProductoCuentaContableArbol"));



					
		this.jLabelid_cuenta_contable_descuentoProductoCuentaContable = new JLabelMe();
		this.jLabelid_cuenta_contable_descuentoProductoCuentaContable.setText(""+ProductoCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO+" : *");
		this.jLabelid_cuenta_contable_descuentoProductoCuentaContable.setToolTipText("Cuenta Contable Descuento");
		this.jLabelid_cuenta_contable_descuentoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_descuentoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_descuentoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_descuentoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_descuentoProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_descuentoProductoCuentaContable.setToolTipText(ProductoCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO);
		this.gridaBagLayoutProductoCuentaContable = new GridBagLayout();
		this.jPanelid_cuenta_contable_descuentoProductoCuentaContable.setLayout(this.gridaBagLayoutProductoCuentaContable);


		jComboBoxid_cuenta_contable_descuentoProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_descuentoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_descuentoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_descuentoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_descuentoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_descuentoProductoCuentaContable= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContable.setText("Buscar");
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoProductoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_descuentoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoProductoCuentaContable"));

		this.jButtonid_cuenta_contable_descuentoProductoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_descuentoProductoCuentaContableBusqueda.setText("U");
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoProductoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_descuentoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoProductoCuentaContableBusqueda"));

		if(this.productocuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_descuentoProductoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_descuentoProductoCuentaContableUpdate.setText("U");
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_descuentoProductoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoProductoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_descuentoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoProductoCuentaContableUpdate"));


		jButtonid_cuenta_contable_descuentoProductoCuentaContableArbol= new JButtonMe();
		jButtonid_cuenta_contable_descuentoProductoCuentaContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoProductoCuentaContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoProductoCuentaContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoProductoCuentaContableArbol.setText("Arbol");
		jButtonid_cuenta_contable_descuentoProductoCuentaContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_descuentoProductoCuentaContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoProductoCuentaContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_descuentoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoProductoCuentaContableArbol"));



					
		this.jLabelid_cuenta_contable_devolucionProductoCuentaContable = new JLabelMe();
		this.jLabelid_cuenta_contable_devolucionProductoCuentaContable.setText(""+ProductoCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION+" : *");
		this.jLabelid_cuenta_contable_devolucionProductoCuentaContable.setToolTipText("Cuenta Contable Devolucion");
		this.jLabelid_cuenta_contable_devolucionProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_devolucionProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_devolucionProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_devolucionProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_devolucionProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_devolucionProductoCuentaContable.setToolTipText(ProductoCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION);
		this.gridaBagLayoutProductoCuentaContable = new GridBagLayout();
		this.jPanelid_cuenta_contable_devolucionProductoCuentaContable.setLayout(this.gridaBagLayoutProductoCuentaContable);


		jComboBoxid_cuenta_contable_devolucionProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_devolucionProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_devolucionProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_devolucionProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_devolucionProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_devolucionProductoCuentaContable= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContable.setText("Buscar");
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionProductoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_devolucionProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionProductoCuentaContable"));

		this.jButtonid_cuenta_contable_devolucionProductoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_devolucionProductoCuentaContableBusqueda.setText("U");
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionProductoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_devolucionProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionProductoCuentaContableBusqueda"));

		if(this.productocuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_devolucionProductoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_devolucionProductoCuentaContableUpdate.setText("U");
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_devolucionProductoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionProductoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_devolucionProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionProductoCuentaContableUpdate"));


		jButtonid_cuenta_contable_devolucionProductoCuentaContableArbol= new JButtonMe();
		jButtonid_cuenta_contable_devolucionProductoCuentaContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionProductoCuentaContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionProductoCuentaContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionProductoCuentaContableArbol.setText("Arbol");
		jButtonid_cuenta_contable_devolucionProductoCuentaContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_devolucionProductoCuentaContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionProductoCuentaContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_devolucionProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionProductoCuentaContableArbol"));



					
		this.jLabelid_cuenta_contable_debitoProductoCuentaContable = new JLabelMe();
		this.jLabelid_cuenta_contable_debitoProductoCuentaContable.setText(""+ProductoCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO+" : *");
		this.jLabelid_cuenta_contable_debitoProductoCuentaContable.setToolTipText("Cuenta Contable Debito");
		this.jLabelid_cuenta_contable_debitoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_debitoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_debitoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_debitoProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_debitoProductoCuentaContable.setToolTipText(ProductoCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		this.gridaBagLayoutProductoCuentaContable = new GridBagLayout();
		this.jPanelid_cuenta_contable_debitoProductoCuentaContable.setLayout(this.gridaBagLayoutProductoCuentaContable);


		jComboBoxid_cuenta_contable_debitoProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_debitoProductoCuentaContable= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoProductoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoProductoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoProductoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoProductoCuentaContable.setText("Buscar");
		this.jButtonid_cuenta_contable_debitoProductoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_debitoProductoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoProductoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_debitoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoProductoCuentaContable"));

		this.jButtonid_cuenta_contable_debitoProductoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoProductoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoProductoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoProductoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoProductoCuentaContableBusqueda.setText("U");
		this.jButtonid_cuenta_contable_debitoProductoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_debitoProductoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoProductoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_debitoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoProductoCuentaContableBusqueda"));

		if(this.productocuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_debitoProductoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_debitoProductoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoProductoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoProductoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoProductoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoProductoCuentaContableUpdate.setText("U");
		this.jButtonid_cuenta_contable_debitoProductoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_debitoProductoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoProductoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_debitoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoProductoCuentaContableUpdate"));


		jButtonid_cuenta_contable_debitoProductoCuentaContableArbol= new JButtonMe();
		jButtonid_cuenta_contable_debitoProductoCuentaContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoProductoCuentaContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoProductoCuentaContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoProductoCuentaContableArbol.setText("Arbol");
		jButtonid_cuenta_contable_debitoProductoCuentaContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_debitoProductoCuentaContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoProductoCuentaContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_debitoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoProductoCuentaContableArbol"));



					
		this.jLabelid_cuenta_contable_creditoProductoCuentaContable = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoProductoCuentaContable.setText(""+ProductoCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" : *");
		this.jLabelid_cuenta_contable_creditoProductoCuentaContable.setToolTipText("Cuenta Contable Credito");
		this.jLabelid_cuenta_contable_creditoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoProductoCuentaContable.setToolTipText(ProductoCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutProductoCuentaContable = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoProductoCuentaContable.setLayout(this.gridaBagLayoutProductoCuentaContable);


		jComboBoxid_cuenta_contable_creditoProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoProductoCuentaContable= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoProductoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoProductoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoProductoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoProductoCuentaContable.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoProductoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoProductoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoProductoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoProductoCuentaContable"));

		this.jButtonid_cuenta_contable_creditoProductoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoProductoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoProductoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoProductoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoProductoCuentaContableBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoProductoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoProductoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoProductoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoProductoCuentaContableBusqueda"));

		if(this.productocuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoProductoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoProductoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoProductoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoProductoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoProductoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoProductoCuentaContableUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoProductoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoProductoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoProductoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoProductoCuentaContableUpdate"));


		jButtonid_cuenta_contable_creditoProductoCuentaContableArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoProductoCuentaContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoProductoCuentaContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoProductoCuentaContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoProductoCuentaContableArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoProductoCuentaContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoProductoCuentaContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoProductoCuentaContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoProductoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoProductoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoProductoCuentaContableArbol"));



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
		//this.jInternalFrameDetalleProductoCuentaContable = new ProductoCuentaContableBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Producto Cuenta Contable DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoCuentaContable= new GridBagLayout();
		

		
		String sToolTipProductoCuentaContable="";
		sToolTipProductoCuentaContable=ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoCuentaContable+="(Inventario.ProductoCuentaContable)";
		}
		
		if(!this.productocuentacontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoCuentaContable+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoCuentaContable = new JButtonMe();
		this.jButtonModificarProductoCuentaContable = new JButtonMe();
        this.jButtonActualizarProductoCuentaContable = new JButtonMe();
        this.jButtonEliminarProductoCuentaContable = new JButtonMe();
        this.jButtonCancelarProductoCuentaContable = new JButtonMe();
        this.jButtonGuardarCambiosProductoCuentaContable = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoCuentaContable = new JButtonMe();
		this.jButtonCerrarProductoCuentaContable = new JButtonMe();
		
		this.jScrollPanelDatosProductoCuentaContable = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoCuentaContable = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoCuentaContable = new JScrollPane();
				
		
		
		this.jPanelCamposProductoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Cuenta Contable";
		
		if(!this.productocuentacontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Cuenta Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoCuentaContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoCuentaContable.setName("jPanelCamposProductoCuentaContable"); 

		this.jPanelCamposOcultosProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoCuentaContable.setName("jPanelCamposOcultosProductoCuentaContable"); 

        this.jPanelAccionesProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoCuentaContable.setToolTipText("Acciones");
        this.jPanelAccionesProductoCuentaContable.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoCuentaContable.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoCuentaContable.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoCuentaContable.setText("Nuevo");
		this.jButtonModificarProductoCuentaContable.setText("Editar");
        this.jButtonActualizarProductoCuentaContable.setText("Actualizar");
        this.jButtonEliminarProductoCuentaContable.setText("Eliminar");
        this.jButtonCancelarProductoCuentaContable.setText("Cancelar");
        this.jButtonGuardarCambiosProductoCuentaContable.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoCuentaContable.setText("Guardar");
		this.jButtonCerrarProductoCuentaContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoCuentaContable,"nuevo_button","Nuevo",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoCuentaContable,"modificar_button","Editar",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoCuentaContable,"actualizar_button","Actualizar",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoCuentaContable,"eliminar_button","Eliminar",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoCuentaContable,"cancelar_button","Cancelar",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoCuentaContable,"guardarcambios_button","Guardar",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoCuentaContable,"guardarcambiostabla_button","Guardar",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoCuentaContable,"cerrar_button","Salir",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoCuentaContable.setToolTipText("Nuevo"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoCuentaContable.setToolTipText("Editar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoCuentaContable.setToolTipText("Actualizar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoCuentaContable.setToolTipText("Eliminar)"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoCuentaContable.setToolTipText("Cancelar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoCuentaContable.setToolTipText("Guardar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoCuentaContable.setToolTipText("Guardar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoCuentaContable.setToolTipText("Salir"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoCuentaContable";
		inputMap = this.jButtonNuevoProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoCuentaContable"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoCuentaContable";
		inputMap = this.jButtonActualizarProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoCuentaContable"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoCuentaContable";
		inputMap = this.jButtonEliminarProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoCuentaContable"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoCuentaContable";
		inputMap = this.jButtonCancelarProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoCuentaContable"));
		
		//CERRAR		
		sMapKey = "CerrarProductoCuentaContable";
		inputMap = this.jButtonCerrarProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoCuentaContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoCuentaContable";
		inputMap = this.jButtonGuardarCambiosTablaProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoCuentaContable"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoCuentaContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoCuentaContable.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoCuentaContable.setToolTipText("Nuevo ProductoCuentaContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoCuentaContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoCuentaContable.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoCuentaContable.setToolTipText("Sin Cerrar Ventana ProductoCuentaContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoCuentaContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoCuentaContable.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoCuentaContable.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoCuentaContable.setText("Accion");
		this.jComboBoxTiposAccionesProductoCuentaContable.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoCuentaContable.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoCuentaContable.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoCuentaContable = new JLabelMe();
		
		this.jLabelAccionesProductoCuentaContable.setText("Acciones");		
		this.jLabelAccionesProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoCuentaContable();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoCuentaContable();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoCuentaContable=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoCuentaContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoCuentaContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoCuentaContable.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoCuentaContable = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoCuentaContable = new GridBagLayout();
		
		this.jPanelCamposProductoCuentaContable.setLayout(gridaBagLayoutCamposProductoCuentaContable);
		this.jPanelCamposOcultosProductoCuentaContable.setLayout(gridaBagLayoutCamposOcultosProductoCuentaContable);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoCuentaContable.add(jLabelIdProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 1;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoCuentaContable.add(jLabelidProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);


	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProductoCuentaContable.add(jLabelid_empresaProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 2;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoCuentaContable.add(jButtonid_empresaProductoCuentaContableBusqueda, this.gridBagConstraintsProductoCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 3;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProductoCuentaContable.add(jButtonid_empresaProductoCuentaContableUpdate, this.gridBagConstraintsProductoCuentaContable);
	}

	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 1;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProductoCuentaContable.add(jComboBoxid_empresaProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);


	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalProductoCuentaContable.add(jLabelid_sucursalProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 2;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoCuentaContable.add(jButtonid_sucursalProductoCuentaContableBusqueda, this.gridBagConstraintsProductoCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 3;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProductoCuentaContable.add(jButtonid_sucursalProductoCuentaContableUpdate, this.gridBagConstraintsProductoCuentaContable);
	}

	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 1;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalProductoCuentaContable.add(jComboBoxid_sucursalProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);


	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaProductoCuentaContable.add(jLabelid_bodegaProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 2;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoCuentaContable.add(jButtonid_bodegaProductoCuentaContableBusqueda, this.gridBagConstraintsProductoCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 3;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaProductoCuentaContable.add(jButtonid_bodegaProductoCuentaContableUpdate, this.gridBagConstraintsProductoCuentaContable);
	}

	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 1;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaProductoCuentaContable.add(jComboBoxid_bodegaProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);


	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoProductoCuentaContable.add(jLabelid_productoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 2;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoProductoCuentaContable.add(jButtonid_productoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 3;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoCuentaContable.add(jButtonid_productoProductoCuentaContableBusqueda, this.gridBagConstraintsProductoCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 4;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoProductoCuentaContable.add(jButtonid_productoProductoCuentaContableUpdate, this.gridBagConstraintsProductoCuentaContable);
	}

	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 1;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoProductoCuentaContable.add(jComboBoxid_productoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);


	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoProductoCuentaContable.add(jLabelid_centro_costoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 2;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoProductoCuentaContable.add(jButtonid_centro_costoProductoCuentaContableBusqueda, this.gridBagConstraintsProductoCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 3;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoProductoCuentaContable.add(jButtonid_centro_costoProductoCuentaContableUpdate, this.gridBagConstraintsProductoCuentaContable);
	}

	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 1;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoProductoCuentaContable.add(jComboBoxid_centro_costoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);


	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_inventarioProductoCuentaContable.add(jLabelid_cuenta_contable_inventarioProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 2;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventarioProductoCuentaContable.add(jButtonid_cuenta_contable_inventarioProductoCuentaContableBusqueda, this.gridBagConstraintsProductoCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 3;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventarioProductoCuentaContable.add(jButtonid_cuenta_contable_inventarioProductoCuentaContableUpdate, this.gridBagConstraintsProductoCuentaContable);
	}

	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 1;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_inventarioProductoCuentaContable.add(jComboBoxid_cuenta_contable_inventarioProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);


	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_costoProductoCuentaContable.add(jLabelid_cuenta_contable_costoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 2;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costoProductoCuentaContable.add(jButtonid_cuenta_contable_costoProductoCuentaContableBusqueda, this.gridBagConstraintsProductoCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 3;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costoProductoCuentaContable.add(jButtonid_cuenta_contable_costoProductoCuentaContableUpdate, this.gridBagConstraintsProductoCuentaContable);
	}

	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 1;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_costoProductoCuentaContable.add(jComboBoxid_cuenta_contable_costoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);


	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_ventaProductoCuentaContable.add(jLabelid_cuenta_contable_ventaProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 2;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ventaProductoCuentaContable.add(jButtonid_cuenta_contable_ventaProductoCuentaContableBusqueda, this.gridBagConstraintsProductoCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 3;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ventaProductoCuentaContable.add(jButtonid_cuenta_contable_ventaProductoCuentaContableUpdate, this.gridBagConstraintsProductoCuentaContable);
	}

	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 1;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_ventaProductoCuentaContable.add(jComboBoxid_cuenta_contable_ventaProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);


	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_descuentoProductoCuentaContable.add(jLabelid_cuenta_contable_descuentoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 2;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_descuentoProductoCuentaContable.add(jButtonid_cuenta_contable_descuentoProductoCuentaContableBusqueda, this.gridBagConstraintsProductoCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 3;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_descuentoProductoCuentaContable.add(jButtonid_cuenta_contable_descuentoProductoCuentaContableUpdate, this.gridBagConstraintsProductoCuentaContable);
	}

	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 1;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_descuentoProductoCuentaContable.add(jComboBoxid_cuenta_contable_descuentoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);


	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_devolucionProductoCuentaContable.add(jLabelid_cuenta_contable_devolucionProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 2;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_devolucionProductoCuentaContable.add(jButtonid_cuenta_contable_devolucionProductoCuentaContableBusqueda, this.gridBagConstraintsProductoCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 3;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_devolucionProductoCuentaContable.add(jButtonid_cuenta_contable_devolucionProductoCuentaContableUpdate, this.gridBagConstraintsProductoCuentaContable);
	}

	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 1;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_devolucionProductoCuentaContable.add(jComboBoxid_cuenta_contable_devolucionProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);


	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_debitoProductoCuentaContable.add(jLabelid_cuenta_contable_debitoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 2;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoProductoCuentaContable.add(jButtonid_cuenta_contable_debitoProductoCuentaContableBusqueda, this.gridBagConstraintsProductoCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 3;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoProductoCuentaContable.add(jButtonid_cuenta_contable_debitoProductoCuentaContableUpdate, this.gridBagConstraintsProductoCuentaContable);
	}

	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 1;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_debitoProductoCuentaContable.add(jComboBoxid_cuenta_contable_debitoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);


	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoProductoCuentaContable.add(jLabelid_cuenta_contable_creditoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 2;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoProductoCuentaContable.add(jButtonid_cuenta_contable_creditoProductoCuentaContableBusqueda, this.gridBagConstraintsProductoCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 3;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
		this.gridBagConstraintsProductoCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoProductoCuentaContable.add(jButtonid_cuenta_contable_creditoProductoCuentaContableUpdate, this.gridBagConstraintsProductoCuentaContable);
	}

	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoCuentaContable.gridy = 0;
	this.gridBagConstraintsProductoCuentaContable.gridx = 1;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoProductoCuentaContable.add(jComboBoxid_cuenta_contable_creditoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCuentaContable.gridy = iYPanelCamposProductoCuentaContable;
	this.gridBagConstraintsProductoCuentaContable.gridx = iXPanelCamposProductoCuentaContable++;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoCuentaContable.add(this.jPanelidProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(iXPanelCamposProductoCuentaContable % 1==0) {
		iXPanelCamposProductoCuentaContable=0;
		iYPanelCamposProductoCuentaContable++;
	}
	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCuentaContable.gridy = iYPanelCamposProductoCuentaContable;
	this.gridBagConstraintsProductoCuentaContable.gridx = iXPanelCamposProductoCuentaContable++;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoCuentaContable.add(this.jPanelid_bodegaProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(iXPanelCamposProductoCuentaContable % 1==0) {
		iXPanelCamposProductoCuentaContable=0;
		iYPanelCamposProductoCuentaContable++;
	}
	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCuentaContable.gridy = iYPanelCamposProductoCuentaContable;
	this.gridBagConstraintsProductoCuentaContable.gridx = iXPanelCamposProductoCuentaContable++;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoCuentaContable.add(this.jPanelid_productoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(iXPanelCamposProductoCuentaContable % 1==0) {
		iXPanelCamposProductoCuentaContable=0;
		iYPanelCamposProductoCuentaContable++;
	}
	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCuentaContable.gridy = iYPanelCamposProductoCuentaContable;
	this.gridBagConstraintsProductoCuentaContable.gridx = iXPanelCamposProductoCuentaContable++;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoCuentaContable.add(this.jPanelid_centro_costoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(iXPanelCamposProductoCuentaContable % 1==0) {
		iXPanelCamposProductoCuentaContable=0;
		iYPanelCamposProductoCuentaContable++;
	}
	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCuentaContable.gridy = iYPanelCamposProductoCuentaContable;
	this.gridBagConstraintsProductoCuentaContable.gridx = iXPanelCamposProductoCuentaContable++;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoCuentaContable.add(this.jPanelid_cuenta_contable_inventarioProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(iXPanelCamposProductoCuentaContable % 1==0) {
		iXPanelCamposProductoCuentaContable=0;
		iYPanelCamposProductoCuentaContable++;
	}
	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCuentaContable.gridy = iYPanelCamposProductoCuentaContable;
	this.gridBagConstraintsProductoCuentaContable.gridx = iXPanelCamposProductoCuentaContable++;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoCuentaContable.add(this.jPanelid_cuenta_contable_costoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(iXPanelCamposProductoCuentaContable % 1==0) {
		iXPanelCamposProductoCuentaContable=0;
		iYPanelCamposProductoCuentaContable++;
	}
	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCuentaContable.gridy = iYPanelCamposProductoCuentaContable;
	this.gridBagConstraintsProductoCuentaContable.gridx = iXPanelCamposProductoCuentaContable++;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoCuentaContable.add(this.jPanelid_cuenta_contable_ventaProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(iXPanelCamposProductoCuentaContable % 1==0) {
		iXPanelCamposProductoCuentaContable=0;
		iYPanelCamposProductoCuentaContable++;
	}
	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCuentaContable.gridy = iYPanelCamposProductoCuentaContable;
	this.gridBagConstraintsProductoCuentaContable.gridx = iXPanelCamposProductoCuentaContable++;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoCuentaContable.add(this.jPanelid_cuenta_contable_descuentoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(iXPanelCamposProductoCuentaContable % 1==0) {
		iXPanelCamposProductoCuentaContable=0;
		iYPanelCamposProductoCuentaContable++;
	}
	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCuentaContable.gridy = iYPanelCamposProductoCuentaContable;
	this.gridBagConstraintsProductoCuentaContable.gridx = iXPanelCamposProductoCuentaContable++;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoCuentaContable.add(this.jPanelid_cuenta_contable_devolucionProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(iXPanelCamposProductoCuentaContable % 1==0) {
		iXPanelCamposProductoCuentaContable=0;
		iYPanelCamposProductoCuentaContable++;
	}
	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCuentaContable.gridy = iYPanelCamposProductoCuentaContable;
	this.gridBagConstraintsProductoCuentaContable.gridx = iXPanelCamposProductoCuentaContable++;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoCuentaContable.add(this.jPanelid_cuenta_contable_debitoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(iXPanelCamposProductoCuentaContable % 1==0) {
		iXPanelCamposProductoCuentaContable=0;
		iYPanelCamposProductoCuentaContable++;
	}
	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCuentaContable.gridy = iYPanelCamposProductoCuentaContable;
	this.gridBagConstraintsProductoCuentaContable.gridx = iXPanelCamposProductoCuentaContable++;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoCuentaContable.add(this.jPanelid_cuenta_contable_creditoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(iXPanelCamposProductoCuentaContable % 1==0) {
		iXPanelCamposProductoCuentaContable=0;
		iYPanelCamposProductoCuentaContable++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCuentaContable.gridy = iYPanelCamposOcultosProductoCuentaContable;
	this.gridBagConstraintsProductoCuentaContable.gridx = iXPanelCamposOcultosProductoCuentaContable++;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoCuentaContable.add(this.jPanelid_empresaProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(iXPanelCamposOcultosProductoCuentaContable % 1==0) {
		iXPanelCamposOcultosProductoCuentaContable=0;
		iYPanelCamposOcultosProductoCuentaContable++;
	}
	this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoCuentaContable.gridy = iYPanelCamposOcultosProductoCuentaContable;
	this.gridBagConstraintsProductoCuentaContable.gridx = iXPanelCamposOcultosProductoCuentaContable++;
	this.gridBagConstraintsProductoCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProductoCuentaContable.add(this.jPanelid_sucursalProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);



	if(iXPanelCamposOcultosProductoCuentaContable % 1==0) {
		iXPanelCamposOcultosProductoCuentaContable=0;
		iYPanelCamposOcultosProductoCuentaContable++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoCuentaContable= new GridBagLayout();
		this.jPanelAccionesProductoCuentaContable.setLayout(gridaBagLayoutAccionesProductoCuentaContable);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoCuentaContable= new GridBagLayout();
		this.jPanelAccionesFormularioProductoCuentaContable.setLayout(gridaBagLayoutAccionesFormularioProductoCuentaContable);
		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoCuentaContable.add(this.jComboBoxTiposAccionesFormularioProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoCuentaContable.add(this.jCheckBoxPostAccionNuevoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productocuentacontableSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoCuentaContable.add(this.jCheckBoxPostAccionSinCerrarProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productocuentacontableSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productocuentacontableSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoCuentaContable.add(this.jCheckBoxPostAccionSinMensajeProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoCuentaContable.add(this.jButtonModificarProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);							

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoCuentaContable.add(this.jButtonEliminarProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		
			
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;		
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoCuentaContable.add(this.jButtonActualizarProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);


		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;		
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoCuentaContable.add(this.jButtonGuardarCambiosProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);	
		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;		
		this.gridBagConstraintsProductoCuentaContable.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoCuentaContable.add(this.jButtonCancelarProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoCuentaContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoCuentaContable);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productocuentacontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();						
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoCuentaContable.gridx = 0;		
			//this.gridBagConstraintsProductoCuentaContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoCuentaContable.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoCuentaContable.gridx =0;
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoCuentaContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoCuentaContableJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoCuentaContable = new ProductoCuentaContableBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Producto Cuenta Contable DATOS");
			
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
			
	        //this.setTitle("[FOR] - Producto Cuenta Contable DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Cuenta Contable Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoCuentaContableModel productocuentacontableModel=new ProductoCuentaContableModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoCuentaContableModel.ProductoCuentaContableFocusTraversalPolicy productocuentacontableFocusTraversalPolicy = productocuentacontableModel.new ProductoCuentaContableFocusTraversalPolicy(this);
			
			//productocuentacontableFocusTraversalPolicy.setproductocuentacontableJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productocuentacontableModel);
			
			
			this.jContentPaneDetalleProductoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoCuentaContable = new GridBagLayout();	
			this.jContentPaneDetalleProductoCuentaContable.setLayout(gridaBagLayoutDetalleProductoCuentaContable);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoCuentaContable = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
				this.gridBagConstraintsProductoCuentaContable.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoCuentaContable.gridx = 0;
					
				
				this.jContentPaneDetalleProductoCuentaContable.add(jTtoolBarDetalleProductoCuentaContable, gridBagConstraintsProductoCuentaContable);								
				
}
			
			this.jScrollPanelDatosEdicionProductoCuentaContable=   new JScrollPane(jContentPaneDetalleProductoCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoCuentaContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoCuentaContable.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	        
			this.jContentPaneDetalleProductoCuentaContable.add(jPanelCamposProductoCuentaContable, gridBagConstraintsProductoCuentaContable);
			
			
			
			
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
						&& productocuentacontableSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productocuentacontableSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoCuentaContable= new GridBagConstraints();
						this.gridBagConstraintsProductoCuentaContable.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoCuentaContable.gridx = 0;
						this.jContentPaneDetalleProductoCuentaContable.add(this.jTabbedPaneRelacionesProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoCuentaContable.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoCuentaContable.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
					this.gridBagConstraintsProductoCuentaContable.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoCuentaContable.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoCuentaContable.gridx = 0;
					
				
					this.jContentPaneDetalleProductoCuentaContable.add(jPanelCamposOcultosProductoCuentaContable, gridBagConstraintsProductoCuentaContable);
				
					this.jPanelCamposOcultosProductoCuentaContable.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	        this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoCuentaContable.add(this.jPanelAccionesFormularioProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);							
			
			
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
	        this.gridBagConstraintsProductoCuentaContable.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoCuentaContable.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoCuentaContable.add(this.jPanelAccionesProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoCuentaContable);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoCuentaContable=   new JScrollPane(this.jPanelCamposProductoCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoCuentaContable.gridx = 0;
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoCuentaContable.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoCuentaContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);			
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoCuentaContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
			
			
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		
			
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoCuentaContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoCuentaContable;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoCuentaContable;
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
